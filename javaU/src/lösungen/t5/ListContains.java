package lösungen.t5;

import java.util.ArrayList;

public class ListContains {
    ArrayList<String> list = new ArrayList<>() {{
        add(" tabu ");
        add(null);
        add(" Stabulator ");
    }};

    public static void main(String[] args) {
        ListContains l = new ListContains();
        ArrayList<String> x = new ArrayList<>();
        x.add("s");
        x.add("s");
        l.unify(x);
        l.deleteTabu(l.list, "tabu");
        System.out.println(l.list.toString());
        System.out.println(l.unify(x).toString());
    }

    public ArrayList<String> unify(ArrayList<String> input) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : input) {
            if (s != null && !result.contains(s)) {
                result.add(s);
            }

        }
        return new ArrayList<>(result);
    }

    public void deleteTabu(ArrayList<String> posts, String tabu) {
        for (int i = 0; i < posts.size(); i++) {
            if (posts.get(i).contains(tabu)) {
                posts.remove(i);
            }

        }
    }

}
