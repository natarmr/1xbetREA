package a;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class isg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f15302a;

    static {
        HashMap map = new HashMap(9);
        f15302a = map;
        map.put("xx-small", new jqg0(0.694f, 7));
        map.put("x-small", new jqg0(0.833f, 7));
        map.put("small", new jqg0(10.0f, 7));
        map.put("medium", new jqg0(12.0f, 7));
        map.put("large", new jqg0(14.4f, 7));
        map.put("x-large", new jqg0(17.3f, 7));
        map.put("xx-large", new jqg0(20.7f, 7));
        map.put("smaller", new jqg0(83.33f, 9));
        map.put("larger", new jqg0(120.0f, 9));
    }
}
