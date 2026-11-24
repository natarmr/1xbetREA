package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nrz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tqt f24028a;
    public static final nrz b;
    public static final nrz c;
    public static final nrz d;
    public static final /* synthetic */ nrz[] e;

    static {
        nrz nrzVar = new nrz("ACTIVE", 0);
        b = nrzVar;
        nrz nrzVar2 = new nrz("PENDING", 1);
        c = nrzVar2;
        nrz nrzVar3 = new nrz("INACTIVE", 2);
        d = nrzVar3;
        e = new nrz[]{nrzVar, nrzVar2, nrzVar3};
        f24028a = new tqt();
    }

    public static nrz valueOf(String str) {
        return (nrz) Enum.valueOf(nrz.class, str);
    }

    public static nrz[] values() {
        return (nrz[]) e.clone();
    }
}
