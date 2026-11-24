package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r0a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0a f29622a;
    public static final r0a b;
    public static final r0a c;
    public static final r0a d;
    public static final r0a e;
    public static final r0a f;
    public static final r0a g;
    public static final /* synthetic */ r0a[] h;

    static {
        r0a r0aVar = new r0a("RELEASED", 0);
        f29622a = r0aVar;
        r0a r0aVar2 = new r0a("RELEASING", 1);
        b = r0aVar2;
        r0a r0aVar3 = new r0a("CLOSED", 2);
        c = r0aVar3;
        r0a r0aVar4 = new r0a("PENDING_OPEN", 3);
        d = r0aVar4;
        r0a r0aVar5 = new r0a("CLOSING", 4);
        e = r0aVar5;
        r0a r0aVar6 = new r0a("OPENING", 5);
        f = r0aVar6;
        r0a r0aVar7 = new r0a("OPEN", 6);
        g = r0aVar7;
        h = new r0a[]{r0aVar, r0aVar2, r0aVar3, r0aVar4, r0aVar5, r0aVar6, r0aVar7, new r0a("CONFIGURED", 7)};
    }

    public static r0a valueOf(String str) {
        return (r0a) Enum.valueOf(r0a.class, str);
    }

    public static r0a[] values() {
        return (r0a[]) h.clone();
    }
}
