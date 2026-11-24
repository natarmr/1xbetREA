package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class u2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u2n f34954a;
    public static final u2n b;
    public static final /* synthetic */ u2n[] c;

    /* JADX INFO: Fake field, exist only in values array */
    u2n EF0;

    static {
        u2n u2nVar = new u2n("LIST_CHECKBOX", 0);
        u2n u2nVar2 = new u2n("SPORT", 1);
        u2n u2nVar3 = new u2n("SPORT_COUNTER", 2);
        f34954a = u2nVar3;
        u2n u2nVar4 = new u2n("SPORT_COUNTER_WITH_ACCORDION", 3);
        u2n u2nVar5 = new u2n("SPORT_COUNTER_WITH_LIST_CHECKBOX", 4);
        b = u2nVar5;
        c = new u2n[]{u2nVar, u2nVar2, u2nVar3, u2nVar4, u2nVar5};
    }

    public static u2n valueOf(String str) {
        return (u2n) Enum.valueOf(u2n.class, str);
    }

    public static u2n[] values() {
        return (u2n[]) c.clone();
    }
}
