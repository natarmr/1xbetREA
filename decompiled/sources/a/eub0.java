package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class eub0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eub0 f8412a;
    public static final eub0 b;
    public static final eub0 c;
    public static final eub0 d;
    public static final eub0 e;
    public static final /* synthetic */ eub0[] f;

    static {
        eub0 eub0Var = new eub0("LoaderMiddle", 0);
        f8412a = eub0Var;
        eub0 eub0Var2 = new eub0("LoaderTop", 1);
        b = eub0Var2;
        eub0 eub0Var3 = new eub0("LoaderMiddleBottom", 2);
        c = eub0Var3;
        eub0 eub0Var4 = new eub0("LoaderBottomLogoTop", 3);
        d = eub0Var4;
        eub0 eub0Var5 = new eub0("LoaderBottomLogoMiddle", 4);
        e = eub0Var5;
        f = new eub0[]{eub0Var, eub0Var2, eub0Var3, eub0Var4, eub0Var5};
    }

    public static eub0 valueOf(String str) {
        return (eub0) Enum.valueOf(eub0.class, str);
    }

    public static eub0[] values() {
        return (eub0[]) f.clone();
    }
}
