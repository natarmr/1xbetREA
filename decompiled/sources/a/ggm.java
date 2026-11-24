package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ggm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ggm f11256a;
    public static final ggm b;
    public static final ggm c;
    public static final ggm d;
    public static final /* synthetic */ ggm[] e;

    static {
        ggm ggmVar = new ggm("FIRST", 0);
        f11256a = ggmVar;
        ggm ggmVar2 = new ggm("LAST", 1);
        b = ggmVar2;
        ggm ggmVar3 = new ggm("FIRST_AND_LAST", 2);
        c = ggmVar3;
        ggm ggmVar4 = new ggm("MIDDLE", 3);
        d = ggmVar4;
        e = new ggm[]{ggmVar, ggmVar2, ggmVar3, ggmVar4};
    }

    public static ggm valueOf(String str) {
        return (ggm) Enum.valueOf(ggm.class, str);
    }

    public static ggm[] values() {
        return (ggm[]) e.clone();
    }
}
