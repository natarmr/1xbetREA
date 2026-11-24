package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class s2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s2n f31509a;
    public static final s2n b;
    public static final /* synthetic */ s2n[] c;

    /* JADX INFO: Fake field, exist only in values array */
    s2n EF0;

    static {
        s2n s2nVar = new s2n("CHAMPIONSHIP", 0);
        s2n s2nVar2 = new s2n("CHAMPIONSHIP_COUNTER_WITH_ACCORDION", 1);
        s2n s2nVar3 = new s2n("CHAMPIONSHIP_COUNTER_WITH_ACTION_ICON", 2);
        f31509a = s2nVar3;
        s2n s2nVar4 = new s2n("CHAMPIONSHIP_COUNTER_WITH_LIST_CHECKBOX", 3);
        b = s2nVar4;
        c = new s2n[]{s2nVar, s2nVar2, s2nVar3, s2nVar4, new s2n("CHAMPIONSHIP_COUNTER_ACCORDION", 4), new s2n("CHAMPIONSHIP_COUNTER_ACCORDION_WITH_ACTION_ICON", 5), new s2n("CHAMPIONSHIP_COUNTER_ACCORDION_WITH_LIST_CHECKBOX", 6), new s2n("RESULTS_CHAMPIONSHIP_COUNTER", 7), new s2n("RESULTS_CHAMPIONSHIP", 8), new s2n("RESULTS_CHAMPIONSHIP_COUNTER_WITH_LIST_CHECKBOX", 9)};
    }

    public static s2n valueOf(String str) {
        return (s2n) Enum.valueOf(s2n.class, str);
    }

    public static s2n[] values() {
        return (s2n[]) c.clone();
    }
}
