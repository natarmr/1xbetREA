package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class llk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final llk0 f20252a;
    public static final /* synthetic */ llk0[] b;

    static {
        llk0 llk0Var = new llk0("REGISTRATION_DATE", 0);
        f20252a = llk0Var;
        b = new llk0[]{llk0Var, new llk0("BET_QUANTITY", 1), new llk0("PROFIT", 2)};
    }

    public static llk0 valueOf(String str) {
        return (llk0) Enum.valueOf(llk0.class, str);
    }

    public static llk0[] values() {
        return (llk0[]) b.clone();
    }
}
