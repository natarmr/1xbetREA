package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class kjm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kjm f18392a;
    public static final kjm b;
    public static final /* synthetic */ kjm[] c;

    static {
        kjm kjmVar = new kjm("LARGE", 0);
        f18392a = kjmVar;
        kjm kjmVar2 = new kjm("SMALL", 1);
        b = kjmVar2;
        c = new kjm[]{kjmVar, kjmVar2};
    }

    public static kjm valueOf(String str) {
        return (kjm) Enum.valueOf(kjm.class, str);
    }

    public static kjm[] values() {
        return (kjm[]) c.clone();
    }
}
