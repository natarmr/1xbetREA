package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class qqm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qqm f29173a;
    public static final qqm b;
    public static final /* synthetic */ qqm[] c;

    static {
        qqm qqmVar = new qqm("SHORT", 0);
        f29173a = qqmVar;
        qqm qqmVar2 = new qqm("LONG", 1);
        b = qqmVar2;
        c = new qqm[]{qqmVar, qqmVar2};
    }

    public static qqm valueOf(String str) {
        return (qqm) Enum.valueOf(qqm.class, str);
    }

    public static qqm[] values() {
        return (qqm[]) c.clone();
    }
}
