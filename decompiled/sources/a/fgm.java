package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class fgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fgm f9498a;
    public static final fgm b;
    public static final /* synthetic */ fgm[] c;

    static {
        fgm fgmVar = new fgm("INCREMENTING", 0);
        f9498a = fgmVar;
        fgm fgmVar2 = new fgm("INCREMENTING_EXTENDED", 1);
        fgm fgmVar3 = new fgm("DECREMENTING", 2);
        b = fgmVar3;
        c = new fgm[]{fgmVar, fgmVar2, fgmVar3};
    }

    public static fgm valueOf(String str) {
        return (fgm) Enum.valueOf(fgm.class, str);
    }

    public static fgm[] values() {
        return (fgm[]) c.clone();
    }
}
