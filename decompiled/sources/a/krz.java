package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class krz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gst f18790a;
    public static final krz b;
    public static final krz c;
    public static final krz d;
    public static final /* synthetic */ krz[] e;

    static {
        krz krzVar = new krz("ACTIVE", 0);
        b = krzVar;
        krz krzVar2 = new krz("PENDING", 1);
        c = krzVar2;
        krz krzVar3 = new krz("INACTIVE", 2);
        d = krzVar3;
        e = new krz[]{krzVar, krzVar2, krzVar3};
        f18790a = new gst();
    }

    public static krz valueOf(String str) {
        return (krz) Enum.valueOf(krz.class, str);
    }

    public static krz[] values() {
        return (krz[]) e.clone();
    }
}
