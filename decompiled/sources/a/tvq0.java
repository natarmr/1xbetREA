package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@ahi0(with = uvq0.class)
public final class tvq0 implements kuw {
    public static final svq0 Companion;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tvq0 f34614a;
    public static final /* synthetic */ tvq0[] b;
    public static final /* synthetic */ c0o c;

    /* JADX INFO: Fake field, exist only in values array */
    tvq0 EF0;

    static {
        tvq0 tvq0Var = new tvq0("AuthNewPlaceResponseSmsSent", 0);
        tvq0 tvq0Var2 = new tvq0("TooManyLoginAttempts", 1);
        tvq0 tvq0Var3 = new tvq0("MaximumNumberLoginAttempts", 2);
        tvq0 tvq0Var4 = new tvq0("AuthConfirmPhoneKz", 3);
        tvq0 tvq0Var5 = new tvq0("Unknown", 4);
        f34614a = tvq0Var5;
        tvq0[] tvq0VarArr = {tvq0Var, tvq0Var2, tvq0Var3, tvq0Var4, tvq0Var5};
        b = tvq0VarArr;
        c = new c0o(tvq0VarArr);
        Companion = new svq0();
    }

    public static tvq0 valueOf(String str) {
        return (tvq0) Enum.valueOf(tvq0.class, str);
    }

    public static tvq0[] values() {
        return (tvq0[]) b.clone();
    }

    @Override // a.kuw
    public final int getErrorCode() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return 157540;
        }
        if (iOrdinal == 1) {
            return 159439;
        }
        if (iOrdinal == 2) {
            return 159548;
        }
        if (iOrdinal == 3) {
            return 163413;
        }
        if (iOrdinal == 4) {
            return Integer.MIN_VALUE;
        }
        t9f.b();
        return 0;
    }
}
