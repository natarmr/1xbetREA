package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qrz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gst f29232a;
    public static final qrz b;
    public static final qrz c;
    public static final qrz d;
    public static final /* synthetic */ qrz[] e;

    static {
        qrz qrzVar = new qrz("ACTIVE", 0);
        b = qrzVar;
        qrz qrzVar2 = new qrz("PENDING", 1);
        c = qrzVar2;
        qrz qrzVar3 = new qrz("INACTIVE", 2);
        d = qrzVar3;
        e = new qrz[]{qrzVar, qrzVar2, qrzVar3};
        f29232a = new gst();
    }

    public static qrz valueOf(String str) {
        return (qrz) Enum.valueOf(qrz.class, str);
    }

    public static qrz[] values() {
        return (qrz[]) e.clone();
    }
}
