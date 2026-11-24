package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class gtj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gtj f11884a;
    public static final gtj b;
    public static final /* synthetic */ gtj[] c;

    static {
        gtj gtjVar = new gtj("Active", 0);
        f11884a = gtjVar;
        gtj gtjVar2 = new gtj("Inactive", 1);
        b = gtjVar2;
        c = new gtj[]{gtjVar, gtjVar2};
    }

    public static gtj valueOf(String str) {
        return (gtj) Enum.valueOf(gtj.class, str);
    }

    public static gtj[] values() {
        return (gtj[]) c.clone();
    }
}
