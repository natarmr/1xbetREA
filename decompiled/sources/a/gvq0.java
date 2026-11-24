package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@ahi0(with = hvq0.class)
public final class gvq0 implements kuw {
    public static final fvq0 Companion;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gvq0 f11987a;
    public static final /* synthetic */ gvq0[] b;
    public static final /* synthetic */ c0o c;

    /* JADX INFO: Fake field, exist only in values array */
    gvq0 EF0;

    static {
        gvq0 gvq0Var = new gvq0("NotValidRefreshToken", 0);
        gvq0 gvq0Var2 = new gvq0("SessionTimeIsEnd", 1);
        gvq0 gvq0Var3 = new gvq0("NotAllowedLocation", 2);
        gvq0 gvq0Var4 = new gvq0("Unknown", 3);
        f11987a = gvq0Var4;
        gvq0[] gvq0VarArr = {gvq0Var, gvq0Var2, gvq0Var3, gvq0Var4};
        b = gvq0VarArr;
        c = new c0o(gvq0VarArr);
        Companion = new fvq0();
    }

    public static gvq0 valueOf(String str) {
        return (gvq0) Enum.valueOf(gvq0.class, str);
    }

    public static gvq0[] values() {
        return (gvq0[]) b.clone();
    }

    @Override // a.kuw
    public final int getErrorCode() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return 3;
        }
        if (iOrdinal == 1) {
            return 157652;
        }
        if (iOrdinal == 2) {
            return 157662;
        }
        if (iOrdinal == 3) {
            return Integer.MIN_VALUE;
        }
        t9f.b();
        return 0;
    }
}
