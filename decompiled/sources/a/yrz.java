package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class yrz implements urz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rqt f43144a;
    public static final yrz b;
    public static final /* synthetic */ yrz[] c;

    static {
        yrz yrzVar = new yrz("EMPTY", 0);
        b = yrzVar;
        c = new yrz[]{yrzVar};
        f43144a = new rqt();
    }

    public static yrz valueOf(String str) {
        return (yrz) Enum.valueOf(yrz.class, str);
    }

    public static yrz[] values() {
        return (yrz[]) c.clone();
    }
}
