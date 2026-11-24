package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qud f7178a;
    public static final e4f b;
    public static final e4f c;
    public static final e4f d;
    public static final e4f e;
    public static final e4f f;
    public static final e4f g;
    public static final e4f h;
    public static final e4f i;
    public static final e4f j;
    public static final e4f k;
    public static final e4f l;
    public static final e4f m;
    public static final /* synthetic */ e4f[] n;

    static {
        e4f e4fVar = new e4f("NONE", 0);
        b = e4fVar;
        e4f e4fVar2 = new e4f("ACCEPTED", 1);
        c = e4fVar2;
        e4f e4fVar3 = new e4f("LOST", 2);
        d = e4fVar3;
        e4f e4fVar4 = new e4f("WIN", 3);
        e = e4fVar4;
        e4f e4fVar5 = new e4f("PAID", 4);
        f = e4fVar5;
        e4f e4fVar6 = new e4f("REMOVED", 5);
        g = e4fVar6;
        e4f e4fVar7 = new e4f("EXPIRED", 6);
        h = e4fVar7;
        e4f e4fVar8 = new e4f("BLOCKED", 7);
        i = e4fVar8;
        e4f e4fVar9 = new e4f("PURCHASING", 8);
        j = e4fVar9;
        e4f e4fVar10 = new e4f("AUTOBET_WAITING", 9);
        k = e4fVar10;
        e4f e4fVar11 = new e4f("AUTOBET_DROPPED", 10);
        l = e4fVar11;
        e4f e4fVar12 = new e4f("AUTOBET_ACTIVATED", 11);
        m = e4fVar12;
        n = new e4f[]{e4fVar, e4fVar2, e4fVar3, e4fVar4, e4fVar5, e4fVar6, e4fVar7, e4fVar8, e4fVar9, e4fVar10, e4fVar11, e4fVar12};
        f7178a = new qud();
    }

    public static e4f valueOf(String str) {
        return (e4f) Enum.valueOf(e4f.class, str);
    }

    public static e4f[] values() {
        return (e4f[]) n.clone();
    }
}
