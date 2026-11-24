package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class bt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ bt2[] f3160a = {new bt2("EVENTS", 0), new bt2("OTHER", 1), new bt2("TRACKED", 2), new bt2("VIEWED", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    bt2 EF5;

    public static bt2 valueOf(String str) {
        return (bt2) Enum.valueOf(bt2.class, str);
    }

    public static bt2[] values() {
        return (bt2[]) f3160a.clone();
    }
}
