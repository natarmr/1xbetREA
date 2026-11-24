package a;

import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e7m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f7333a;
    public static final /* synthetic */ e7m0[] b;

    /* JADX INFO: Fake field, exist only in values array */
    e7m0 EF0;

    static {
        e7m0 e7m0Var = new e7m0("NONE", 0);
        e7m0 e7m0Var2 = new e7m0("CHAIN", 1);
        e7m0 e7m0Var3 = new e7m0("ALIGNED", 2);
        b = new e7m0[]{e7m0Var, e7m0Var2, e7m0Var3};
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        f7333a = map2;
        map.put("none", e7m0Var);
        map.put(ReferencesHeader.CHAIN, e7m0Var2);
        map.put("aligned", e7m0Var3);
        kng0.x(0, map2, "none", 3, ReferencesHeader.CHAIN);
        map2.put("aligned", 2);
    }

    public static e7m0 valueOf(String str) {
        return (e7m0) Enum.valueOf(e7m0.class, str);
    }

    public static e7m0[] values() {
        return (e7m0[]) b.clone();
    }
}
