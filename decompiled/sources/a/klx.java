package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class klx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final klx f18512a;
    public static final klx b;
    public static final /* synthetic */ klx[] c;

    static {
        klx klxVar = new klx("ACTIVITY", 0);
        f18512a = klxVar;
        klx klxVar2 = new klx("BROADCAST", 1);
        b = klxVar2;
        c = new klx[]{klxVar, klxVar2};
    }

    public static klx valueOf(String str) {
        return (klx) Enum.valueOf(klx.class, str);
    }

    public static klx[] values() {
        return (klx[]) c.clone();
    }
}
