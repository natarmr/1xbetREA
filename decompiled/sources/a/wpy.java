package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class wpy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ wpy[] f39565a = {new wpy("AT_MOST_ONCE", 0), new wpy("EXACTLY_ONCE", 1), new wpy("AT_LEAST_ONCE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    wpy EF5;

    public static wpy valueOf(String str) {
        return (wpy) Enum.valueOf(wpy.class, str);
    }

    public static wpy[] values() {
        return (wpy[]) f39565a.clone();
    }
}
