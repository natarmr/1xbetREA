package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class k6d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k6d f17763a;
    public static final k6d b;
    public static final k6d c;
    public static final k6d d;
    public static final k6d e;
    public static final k6d f;
    public static final k6d g;
    public static final k6d h;
    public static final k6d i;
    public static final /* synthetic */ k6d[] j;

    static {
        k6d k6dVar = new k6d("SHOOTING", 0);
        f17763a = k6dVar;
        k6d k6dVar2 = new k6d("TOTAL_TIME", 1);
        b = k6dVar2;
        k6d k6dVar3 = new k6d("DIFF_TIME", 2);
        c = k6dVar3;
        k6d k6dVar4 = new k6d("TOTAL_SCORE", 3);
        d = k6dVar4;
        k6d k6dVar5 = new k6d("SCORE_1", 4);
        e = k6dVar5;
        k6d k6dVar6 = new k6d("SCORE_2", 5);
        f = k6dVar6;
        k6d k6dVar7 = new k6d("JUMPS", 6);
        g = k6dVar7;
        k6d k6dVar8 = new k6d("ATTEMPT_1", 7);
        h = k6dVar8;
        k6d k6dVar9 = new k6d("ATTEMPT_2", 8);
        i = k6dVar9;
        j = new k6d[]{k6dVar, k6dVar2, k6dVar3, k6dVar4, k6dVar5, k6dVar6, k6dVar7, k6dVar8, k6dVar9};
    }

    public static k6d valueOf(String str) {
        return (k6d) Enum.valueOf(k6d.class, str);
    }

    public static k6d[] values() {
        return (k6d[]) j.clone();
    }
}
