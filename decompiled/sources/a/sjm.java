package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class sjm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ sjm[] f32310a = {new sjm("HEADER_LARGE", 0), new sjm("HEADER_SMALL", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    sjm EF5;

    public static sjm valueOf(String str) {
        return (sjm) Enum.valueOf(sjm.class, str);
    }

    public static sjm[] values() {
        return (sjm[]) f32310a.clone();
    }
}
