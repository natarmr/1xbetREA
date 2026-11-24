package a;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xed0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xed0 f40741a;
    public static final /* synthetic */ xed0[] b;

    static {
        xed0 xed0Var = new xed0("DEFAULT", 0);
        f40741a = xed0Var;
        xed0 xed0Var2 = new xed0("UNMETERED_ONLY", 1);
        xed0 xed0Var3 = new xed0("UNMETERED_OR_DAILY", 2);
        xed0 xed0Var4 = new xed0("FAST_IF_RADIO_AWAKE", 3);
        xed0 xed0Var5 = new xed0("NEVER", 4);
        xed0 xed0Var6 = new xed0("UNRECOGNIZED", 5);
        b = new xed0[]{xed0Var, xed0Var2, xed0Var3, xed0Var4, xed0Var5, xed0Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, xed0Var);
        sparseArray.put(1, xed0Var2);
        sparseArray.put(2, xed0Var3);
        sparseArray.put(3, xed0Var4);
        sparseArray.put(4, xed0Var5);
        sparseArray.put(-1, xed0Var6);
    }

    public static xed0 valueOf(String str) {
        return (xed0) Enum.valueOf(xed0.class, str);
    }

    public static xed0[] values() {
        return (xed0[]) b.clone();
    }
}
