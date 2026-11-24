package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ppe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ppe[] f27372a = {new ppe("PRIMARY", 0), new ppe("RED", 1), new ppe("WHITE", 2), new ppe("STROKE", 3), new ppe("SECONDARY", 4), new ppe("SECONDARY_ACCORDION", 5), new ppe("ROUNDED", 6), new ppe("REDCARD", 7), new ppe("CLEAR", 8)};

    /* JADX INFO: Fake field, exist only in values array */
    ppe EF5;

    public static ppe valueOf(String str) {
        return (ppe) Enum.valueOf(ppe.class, str);
    }

    public static ppe[] values() {
        return (ppe[]) f27372a.clone();
    }
}
