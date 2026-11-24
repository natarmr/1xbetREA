package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class izc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yk5 f15629a;
    public static final izc b;
    public static final izc c;
    public static final izc d;
    public static final /* synthetic */ izc[] e;

    static {
        izc izcVar = new izc("INCREASED", 0);
        b = izcVar;
        izc izcVar2 = new izc("DECREASED", 1);
        c = izcVar2;
        izc izcVar3 = new izc("SAME", 2);
        d = izcVar3;
        e = new izc[]{izcVar, izcVar2, izcVar3};
        f15629a = new yk5();
    }

    public static izc valueOf(String str) {
        return (izc) Enum.valueOf(izc.class, str);
    }

    public static izc[] values() {
        return (izc[]) e.clone();
    }
}
