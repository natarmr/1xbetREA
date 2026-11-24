package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class pdm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pdm f26814a;
    public static final pdm b;
    public static final pdm c;
    public static final pdm d;
    public static final /* synthetic */ pdm[] e;

    static {
        pdm pdmVar = new pdm("LOTTIE", 0);
        f26814a = pdmVar;
        pdm pdmVar2 = new pdm("ICON", 1);
        b = pdmVar2;
        pdm pdmVar3 = new pdm("EMPTY", 2);
        c = pdmVar3;
        pdm pdmVar4 = new pdm("NONE", 3);
        d = pdmVar4;
        e = new pdm[]{pdmVar, pdmVar2, pdmVar3, pdmVar4};
    }

    public static pdm valueOf(String str) {
        return (pdm) Enum.valueOf(pdm.class, str);
    }

    public static pdm[] values() {
        return (pdm[]) e.clone();
    }
}
