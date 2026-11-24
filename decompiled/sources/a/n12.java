package a;

import android.javax.sip.message.Request;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class n12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n12 f22727a;
    public static final n12 b;
    public static final n12 c;
    public static final /* synthetic */ n12[] d;

    static {
        n12 n12Var = new n12(Request.INFO, 0);
        f22727a = n12Var;
        n12 n12Var2 = new n12("WARNING", 1);
        b = n12Var2;
        n12 n12Var3 = new n12("SUCCESS", 2);
        c = n12Var3;
        d = new n12[]{n12Var, n12Var2, n12Var3, new n12("OTHER", 3)};
    }

    public static n12 valueOf(String str) {
        return (n12) Enum.valueOf(n12.class, str);
    }

    public static n12[] values() {
        return (n12[]) d.clone();
    }
}
