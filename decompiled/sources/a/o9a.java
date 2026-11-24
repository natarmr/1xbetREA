package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o9a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o9a f24869a;
    public static final o9a b;
    public static final o9a c;
    public static final o9a d;
    public static final o9a e;
    public static final /* synthetic */ o9a[] f;

    static {
        o9a o9aVar = new o9a("PENDING", 0);
        f24869a = o9aVar;
        o9a o9aVar2 = new o9a("CREATING", 1);
        b = o9aVar2;
        o9a o9aVar3 = new o9a("CREATED", 2);
        c = o9aVar3;
        o9a o9aVar4 = new o9a("CLOSING", 3);
        d = o9aVar4;
        o9a o9aVar5 = new o9a("CLOSED", 4);
        e = o9aVar5;
        f = new o9a[]{o9aVar, o9aVar2, o9aVar3, o9aVar4, o9aVar5};
    }

    public static o9a valueOf(String str) {
        return (o9a) Enum.valueOf(o9a.class, str);
    }

    public static o9a[] values() {
        return (o9a[]) f.clone();
    }
}
