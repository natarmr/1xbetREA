package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class rc00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ rc00[] f30216a;
    public static final /* synthetic */ c0o b;

    /* JADX INFO: Fake field, exist only in values array */
    rc00 EF5;

    static {
        rc00[] rc00VarArr = {new rc00("PRIMARY", 0), new rc00("OVERLAY", 1)};
        f30216a = rc00VarArr;
        b = new c0o(rc00VarArr);
    }

    public static rc00 valueOf(String str) {
        return (rc00) Enum.valueOf(rc00.class, str);
    }

    public static rc00[] values() {
        return (rc00[]) f30216a.clone();
    }
}
