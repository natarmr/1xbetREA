package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class lo8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ lo8[] f20378a = {new lo8("EXPANDED", 0), new lo8("COLLAPSED", 1), new lo8("HALF_EXPANDED", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    lo8 EF5;

    public static lo8 valueOf(String str) {
        return (lo8) Enum.valueOf(lo8.class, str);
    }

    public static lo8[] values() {
        return (lo8[]) f20378a.clone();
    }
}
