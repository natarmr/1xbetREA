package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final al f1045a;
    public static final al b;
    public static final /* synthetic */ al[] c;

    static {
        al alVar = new al("NEED_BIND", 0);
        f1045a = alVar;
        al alVar2 = new al("NEED_ACTIVATE", 1);
        b = alVar2;
        c = new al[]{alVar, alVar2};
    }

    public static al valueOf(String str) {
        return (al) Enum.valueOf(al.class, str);
    }

    public static al[] values() {
        return (al[]) c.clone();
    }
}
