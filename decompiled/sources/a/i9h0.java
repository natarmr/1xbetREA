package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class i9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i9h0 f14386a;
    public static final i9h0 b;
    public static final /* synthetic */ i9h0[] c;

    static {
        i9h0 i9h0Var = new i9h0("Default", 0);
        f14386a = i9h0Var;
        i9h0 i9h0Var2 = new i9h0(TokenNames.L, 1);
        b = i9h0Var2;
        c = new i9h0[]{i9h0Var, i9h0Var2};
    }

    public static i9h0 valueOf(String str) {
        return (i9h0) Enum.valueOf(i9h0.class, str);
    }

    public static i9h0[] values() {
        return (i9h0[]) c.clone();
    }
}
