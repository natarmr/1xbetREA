package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class dys0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ dys0[] f6910a = {new dys0("CHECK_ONLY_LOWER", 0), new dys0("CHECK_SUBTYPE_AND_LOWER", 1), new dys0("SKIP_LOWER", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    dys0 EF5;

    public static dys0 valueOf(String str) {
        return (dys0) Enum.valueOf(dys0.class, str);
    }

    public static dys0[] values() {
        return (dys0[]) f6910a.clone();
    }
}
