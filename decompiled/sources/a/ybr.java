package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ybr implements jtl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ybr f42352a;
    public static final ybr b;
    public static final ybr c;
    public static final /* synthetic */ ybr[] d;

    static {
        ybr ybrVar = new ybr("MAKE_BET", 0);
        f42352a = ybrVar;
        ybr ybrVar2 = new ybr("LOGIN", 1);
        b = ybrVar2;
        ybr ybrVar3 = new ybr("SIGN_UP", 2);
        c = ybrVar3;
        d = new ybr[]{ybrVar, ybrVar2, ybrVar3};
    }

    public static ybr valueOf(String str) {
        return (ybr) Enum.valueOf(ybr.class, str);
    }

    public static ybr[] values() {
        return (ybr[]) d.clone();
    }
}
