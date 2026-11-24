package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class mrz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sqt f22294a;
    public static final mrz b;
    public static final mrz c;
    public static final mrz d;
    public static final /* synthetic */ mrz[] e;

    static {
        mrz mrzVar = new mrz("ACTIVE", 0);
        b = mrzVar;
        mrz mrzVar2 = new mrz("PENDING", 1);
        c = mrzVar2;
        mrz mrzVar3 = new mrz("INACTIVE", 2);
        d = mrzVar3;
        e = new mrz[]{mrzVar, mrzVar2, mrzVar3};
        f22294a = new sqt();
    }

    public static mrz valueOf(String str) {
        return (mrz) Enum.valueOf(mrz.class, str);
    }

    public static mrz[] values() {
        return (mrz[]) e.clone();
    }
}
