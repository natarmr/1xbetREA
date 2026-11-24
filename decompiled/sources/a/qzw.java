package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class qzw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qzw f29598a;
    public static final qzw b;
    public static final /* synthetic */ qzw[] c;

    static {
        qzw qzwVar = new qzw("CIRCLE_IMAGE", 0);
        f29598a = qzwVar;
        qzw qzwVar2 = new qzw("SQUARE_IMAGE", 1);
        b = qzwVar2;
        c = new qzw[]{qzwVar, qzwVar2};
    }

    public static qzw valueOf(String str) {
        return (qzw) Enum.valueOf(qzw.class, str);
    }

    public static qzw[] values() {
        return (qzw[]) c.clone();
    }
}
