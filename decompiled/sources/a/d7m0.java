package a;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d7m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d7m0 f5600a;
    public static final d7m0 b;
    public static final d7m0 c;
    public static final HashMap d;
    public static final /* synthetic */ d7m0[] e;

    static {
        d7m0 d7m0Var = new d7m0("SPREAD", 0);
        f5600a = d7m0Var;
        d7m0 d7m0Var2 = new d7m0("SPREAD_INSIDE", 1);
        b = d7m0Var2;
        d7m0 d7m0Var3 = new d7m0("PACKED", 2);
        c = d7m0Var3;
        e = new d7m0[]{d7m0Var, d7m0Var2, d7m0Var3};
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        d = map2;
        map.put("packed", d7m0Var3);
        map.put("spread_inside", d7m0Var2);
        map.put("spread", d7m0Var);
        kng0.x(2, map2, "packed", 1, "spread_inside");
        map2.put("spread", 0);
    }

    public static int a(String str) {
        HashMap map = d;
        if (map.containsKey(str)) {
            return ((Integer) map.get(str)).intValue();
        }
        return -1;
    }

    public static d7m0 valueOf(String str) {
        return (d7m0) Enum.valueOf(d7m0.class, str);
    }

    public static d7m0[] values() {
        return (d7m0[]) e.clone();
    }
}
