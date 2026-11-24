package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v26 a.d3h[], still in use, count: 1, list:
  (r0v26 a.d3h[]) from 0x0156: CONSTRUCTOR (r0v26 a.d3h[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:343) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
@ahi0(with = e3h.class)
public final class d3h {
    UNKNOWN("0"),
    /* JADX INFO: Fake field, exist only in values array */
    BARON_NASHOR_EVENT_TYPE("1"),
    /* JADX INFO: Fake field, exist only in values array */
    RIFT_HERALD_EVENT_TYPE("2"),
    /* JADX INFO: Fake field, exist only in values array */
    INFERNAL_DRAKE_EVENT_TYPE("3"),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_DRAKE_EVENT_TYPE("4"),
    /* JADX INFO: Fake field, exist only in values array */
    OCEAN_DRAKE_EVENT_TYPE("5"),
    /* JADX INFO: Fake field, exist only in values array */
    MOUNTAIN_DRAKE_EVENT_TYPE("6"),
    /* JADX INFO: Fake field, exist only in values array */
    CHEMTECH_DRAKE_EVENT_TYPE("7"),
    /* JADX INFO: Fake field, exist only in values array */
    HEXTACH_DRAKE_EVENT_TYPE("8"),
    /* JADX INFO: Fake field, exist only in values array */
    ELDER_DRAGON_EVENT_TYPE("9"),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_T1_TOWER_EVENT_TYPE("10"),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_T2_TOWER_EVENT_TYPE("11"),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_T3_TOWER_EVENT_TYPE("12"),
    /* JADX INFO: Fake field, exist only in values array */
    MIDDLE_T1_TOWER_EVENT_TYPE("13"),
    /* JADX INFO: Fake field, exist only in values array */
    MIDDLE_T2_TOWER_EVENT_TYPE("14"),
    /* JADX INFO: Fake field, exist only in values array */
    MIDDLE_T3_TOWER_EVENT_TYPE("15"),
    /* JADX INFO: Fake field, exist only in values array */
    BOTTOM_T1_TOWER_EVENT_TYPE("16"),
    /* JADX INFO: Fake field, exist only in values array */
    BOTTOM_T2_TOWER_EVENT_TYPE("17"),
    /* JADX INFO: Fake field, exist only in values array */
    BOTTOM_T3_TOWER_EVENT_TYPE("18"),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_NEXUS_TOWER_EVENT_TYPE("19"),
    /* JADX INFO: Fake field, exist only in values array */
    BOTTOM_NEXUS_TOWER_EVENT_TYPE("20"),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_INHIBITOR_EVENT_TYPE("21"),
    /* JADX INFO: Fake field, exist only in values array */
    MIDDLE_INHIBITOR_EVENT_TYPE("22"),
    /* JADX INFO: Fake field, exist only in values array */
    BOTTOM_INHIBITOR_EVENT_TYPE("23"),
    /* JADX INFO: Fake field, exist only in values array */
    FIRST_BLOOD_EVENT_TYPE("24"),
    /* JADX INFO: Fake field, exist only in values array */
    WIN_EVENT_TYPE("25");

    public static final c3h Companion = new c3h();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5403a;

    static {
        d = new c0o(new d3h[]{r1, new d3h("1"), new d3h("2"), new d3h("3"), new d3h("4"), new d3h("5"), new d3h("6"), new d3h("7"), new d3h("8"), new d3h("9"), new d3h("10"), new d3h("11"), new d3h("12"), new d3h("13"), new d3h("14"), new d3h("15"), new d3h("16"), new d3h("17"), new d3h("18"), new d3h("19"), new d3h("20"), new d3h("21"), new d3h("22"), new d3h("23"), new d3h("24"), new d3h("25")});
    }

    public d3h(String str) {
        super(str, i);
        this.f5403a = str;
    }

    public static d3h valueOf(String str) {
        return (d3h) Enum.valueOf(d3h.class, str);
    }

    public static d3h[] values() {
        return (d3h[]) c.clone();
    }
}
