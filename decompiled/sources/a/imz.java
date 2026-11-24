package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class imz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ imz[] f15049a = {new imz("SOURCE", 0), new imz("BINARY", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    imz EF5;

    public static imz valueOf(String str) {
        return (imz) Enum.valueOf(imz.class, str);
    }

    public static imz[] values() {
        return (imz[]) f15049a.clone();
    }
}
