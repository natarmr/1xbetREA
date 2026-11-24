package a;

import java.util.EnumSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class pf60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wsz f26887a;
    public static final EnumSet b;
    public static final pf60 c;
    public static final pf60 d;
    public static final pf60 e;
    public static final /* synthetic */ pf60[] f;

    static {
        pf60 pf60Var = new pf60("SIGNED", 0);
        c = pf60Var;
        pf60 pf60Var2 = new pf60("UNSIGNED", 1);
        pf60 pf60Var3 = new pf60("SDK_SESSION", 2);
        d = pf60Var3;
        pf60 pf60Var4 = new pf60("NO_PLATFORM_REPORTING", 3);
        e = pf60Var4;
        f = new pf60[]{pf60Var, pf60Var2, pf60Var3, pf60Var4};
        f26887a = new wsz();
        EnumSet enumSetOf = EnumSet.of(pf60Var);
        enumSetOf.getClass();
        b = enumSetOf;
    }

    public static pf60 valueOf(String str) {
        return (pf60) Enum.valueOf(pf60.class, str);
    }

    public static pf60[] values() {
        return (pf60[]) f.clone();
    }
}
