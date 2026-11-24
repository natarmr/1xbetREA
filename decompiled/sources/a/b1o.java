package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class b1o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b1o[] f1816a = {new b1o("ERROR_CLASS", 0), new b1o("ERROR_FUNCTION", 1), new b1o("ERROR_SCOPE", 2), new b1o("ERROR_MODULE", 3), new b1o("ERROR_PROPERTY", 4), new b1o("ERROR_TYPE", 5), new b1o("PARENT_OF_ERROR_SCOPE", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    b1o EF5;

    public static b1o valueOf(String str) {
        return (b1o) Enum.valueOf(b1o.class, str);
    }

    public static b1o[] values() {
        return (b1o[]) f1816a.clone();
    }
}
