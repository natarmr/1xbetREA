package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a73 f345a;
    public static final a73 b;
    public static final /* synthetic */ a73[] c;

    static {
        a73 a73Var = new a73(TokenNames.X, 0);
        f345a = a73Var;
        a73 a73Var2 = new a73("Y", 1);
        b = a73Var2;
        c = new a73[]{a73Var, a73Var2};
    }

    public static a73 valueOf(String str) {
        return (a73) Enum.valueOf(a73.class, str);
    }

    public static a73[] values() {
        return (a73[]) c.clone();
    }
}
