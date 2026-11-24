package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class voq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final voq f37778a;
    public static final /* synthetic */ voq[] b;

    /* JADX INFO: Fake field, exist only in values array */
    voq EF0;

    static {
        voq voqVar = new voq("Visible", 0);
        voq voqVar2 = new voq("Clip", 1);
        f37778a = voqVar2;
        b = new voq[]{voqVar, voqVar2, new voq("ExpandIndicator", 2), new voq("ExpandOrCollapseIndicator", 3)};
    }

    public static voq valueOf(String str) {
        return (voq) Enum.valueOf(voq.class, str);
    }

    public static voq[] values() {
        return (voq[]) b.clone();
    }
}
