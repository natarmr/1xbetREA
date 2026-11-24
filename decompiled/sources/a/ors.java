package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ors f25750a;
    public static final /* synthetic */ ors[] b;

    static {
        ors orsVar = new ors("HORIZONTAL_HEADER", 0);
        f25750a = orsVar;
        b = new ors[]{orsVar};
    }

    public static ors valueOf(String str) {
        return (ors) Enum.valueOf(ors.class, str);
    }

    public static ors[] values() {
        return (ors[]) b.clone();
    }
}
