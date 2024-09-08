package OOP.HomeWork3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream s1, Stream s2) {
        return Integer.compare(s1.getGroupCount(), s2.getGroupCount());
    }
}