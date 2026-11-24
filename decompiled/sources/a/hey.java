package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ hey[] f12948a = {new hey("FROM_DEPENDENCIES", 0), new hey("FROM_CLASS_LOADER", 1), new hey("FALLBACK", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    hey EF5;

    public static hey valueOf(String str) {
        return (hey) Enum.valueOf(hey.class, str);
    }

    public static hey[] values() {
        return (hey[]) f12948a.clone();
    }
}
