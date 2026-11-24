package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class lax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tqt f19728a;
    public static final lax b;
    public static final lax c;
    public static final lax d;
    public static final lax e;
    public static final /* synthetic */ lax[] f;

    static {
        lax laxVar = new lax("NONE", 0);
        b = laxVar;
        lax laxVar2 = new lax("CONTACTS", 1);
        c = laxVar2;
        lax laxVar3 = new lax("TERMS", 2);
        d = laxVar3;
        lax laxVar4 = new lax("AWARDS", 3);
        e = laxVar4;
        f = new lax[]{laxVar, laxVar2, laxVar3, laxVar4};
        f19728a = new tqt();
    }

    public static lax valueOf(String str) {
        return (lax) Enum.valueOf(lax.class, str);
    }

    public static lax[] values() {
        return (lax[]) f.clone();
    }
}
