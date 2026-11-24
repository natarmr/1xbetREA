package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hnx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hnx f13367a;
    public static final hnx b;
    public static final /* synthetic */ hnx[] c;

    static {
        hnx hnxVar = new hnx("Width", 0);
        f13367a = hnxVar;
        hnx hnxVar2 = new hnx("Height", 1);
        b = hnxVar2;
        c = new hnx[]{hnxVar, hnxVar2};
    }

    public static hnx valueOf(String str) {
        return (hnx) Enum.valueOf(hnx.class, str);
    }

    public static hnx[] values() {
        return (hnx[]) c.clone();
    }
}
