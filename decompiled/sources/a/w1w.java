package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class w1w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gst f38420a;
    public static final w1w b;
    public static final /* synthetic */ w1w[] c;

    static {
        w1w w1wVar = new w1w("GAME_INFO", 0);
        b = w1wVar;
        c = new w1w[]{w1wVar};
        f38420a = new gst();
    }

    public static w1w valueOf(String str) {
        return (w1w) Enum.valueOf(w1w.class, str);
    }

    public static w1w[] values() {
        return (w1w[]) c.clone();
    }
}
