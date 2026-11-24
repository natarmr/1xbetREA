package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ikw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ikw f14949a;
    public static final ikw b;
    public static final /* synthetic */ ikw[] c;

    static {
        ikw ikwVar = new ikw("MAIN_EVENT", 0);
        f14949a = ikwVar;
        ikw ikwVar2 = new ikw("NEAREST", 1);
        b = ikwVar2;
        c = new ikw[]{ikwVar, ikwVar2};
    }

    public static ikw valueOf(String str) {
        return (ikw) Enum.valueOf(ikw.class, str);
    }

    public static ikw[] values() {
        return (ikw[]) c.clone();
    }
}
