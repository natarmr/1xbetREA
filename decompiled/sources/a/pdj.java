package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class pdj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pdj f26809a;
    public static final pdj b;
    public static final pdj c;
    public static final /* synthetic */ pdj[] d;

    static {
        pdj pdjVar = new pdj("FULL", 0);
        f26809a = pdjVar;
        pdj pdjVar2 = new pdj("CUSTOM", 1);
        b = pdjVar2;
        pdj pdjVar3 = new pdj("SEND_HISTORY", 2);
        c = pdjVar3;
        d = new pdj[]{pdjVar, pdjVar2, pdjVar3};
    }

    public static pdj valueOf(String str) {
        return (pdj) Enum.valueOf(pdj.class, str);
    }

    public static pdj[] values() {
        return (pdj[]) d.clone();
    }
}
