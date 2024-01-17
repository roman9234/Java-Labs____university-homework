import java.util.ArrayList;

class HashTable<K,V> {

    private int size;
    private ArrayList<Integer> indexes;
    private ArrayList<ArrayList<V>> hash_table_values_tables;
    private ArrayList<ArrayList<K>> hash_table_keys_tables;

    HashTable() {
        size = 0;
        indexes = new ArrayList<Integer>();//список индексов
        hash_table_values_tables = new ArrayList<ArrayList<V>>(); //список значений
        hash_table_keys_tables = new ArrayList<ArrayList<K>>(); //список изначальных ключей
    }

    public int size() {
        return this.size;
    }
    
    public static int hash(String k) {;
        return Math.abs(k.hashCode());
    }

    private int hash(K key) {
        return Math.abs(key.hashCode());
    }

    public void put(K k, V value) {
        int hash = hash(k);
        if (!indexes.contains(hash)) {//Если индекса нет, создаём для него связную таблицу для метода цепочек

            indexes.add(hash);
            ArrayList<V> this_hash_values_table = new ArrayList<V>();
            this_hash_values_table.add(value);

            ArrayList<K> this_hash_keys_table = new ArrayList<K>();
            this_hash_keys_table.add(k);

            hash_table_values_tables.add(this_hash_values_table);
            hash_table_keys_tables.add(this_hash_keys_table);

            this.size++;
        }
        else {
            if (hash_table_keys_tables.get(indexes.indexOf(hash)).contains(k)) {//проверка что такой ключ уже есть
                hash_table_values_tables.get(indexes.indexOf(hash))
                .add(hash_table_keys_tables.get(indexes.indexOf(hash)).indexOf(k), value);//добавляем в цепочку новое значение
                // hash_table_values_tables.get(indexes.indexOf(hash))
                // .set(hash_table_keys_tables.get(indexes.indexOf(hash)).indexOf(k), value);//либо изменяем имеющееся значение
                //размер в этом случае не увеличивается, так как мы просто заменяем уже имеющееся значение
                this.size++;
            }
            else {//если такого ключа ещё не было, также добавляем новое значение
                hash_table_keys_tables
                .get(indexes.indexOf(hash))
                .add(k);
                hash_table_values_tables
                .get(indexes.indexOf(hash))
                .add(value);
                this.size++;
            }
        }
    }
    public void remove(K key_for_removal) {
        int hash = hash(key_for_removal);
        if(indexes.contains(hash)){
            
            if (hash_table_values_tables.get(indexes.indexOf(hash)).size() == 1) {//если в цепочке только 1 значение
                hash_table_values_tables
                .remove(indexes.indexOf(hash));
                hash_table_keys_tables.remove(indexes.indexOf(hash));
                indexes.remove(indexes.indexOf(hash));
            }
            else { //если в цепи несколько значений, удаляем нужное нам
                hash_table_values_tables
                .get(indexes.indexOf(hash))
                .remove(hash_table_keys_tables.indexOf(key_for_removal));
                hash_table_keys_tables.get(hash).remove(key_for_removal);
            }
            this.size--;

        }
    }
    public V get(K k) {

        int hash = hash(k);
        if(indexes.contains(hash)){
            if (hash_table_values_tables.get(indexes.indexOf(hash)).size() == 1) {
                return hash_table_values_tables
                .get(indexes.indexOf(hash))
                .get(0);
            }
            else if (hash_table_values_tables.contains(indexes.indexOf(hash))){
                return hash_table_values_tables
                    .get(indexes.indexOf(hash))
                    .get(hash_table_keys_tables
                    .get(indexes.indexOf(hash))
                    .indexOf(k)); 
            }
        }
        return null;
    }
}