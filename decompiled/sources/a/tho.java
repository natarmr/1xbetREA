package a;

import android.javax.sip.message.Response;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v47 a.tho[], still in use, count: 1, list:
  (r0v47 a.tho[]) from 0x02d6: CONSTRUCTOR (r0v47 a.tho[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:727) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes5.dex */
public final class tho {
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_COACH_CHALLENGE(1),
    FOOTBALL_REPLACE(2),
    /* JADX INFO: Fake field, exist only in values array */
    FOOTBALL_YELLOW_CARD(3),
    /* JADX INFO: Fake field, exist only in values array */
    FOOTBALL_RED_CARD(4),
    /* JADX INFO: Fake field, exist only in values array */
    FOOTBALL_PENALTY_MISS(5),
    /* JADX INFO: Fake field, exist only in values array */
    FOOTBALL_YELLOW_RED_CARD(6),
    /* JADX INFO: Fake field, exist only in values array */
    FOOTBALL_GOAL_OWN(7),
    /* JADX INFO: Fake field, exist only in values array */
    FOOTBALL_QUESTION(8),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_GOAL(9),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_PENALTY_TIME2(10),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_PENALTY_TIME5(11),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_PENALTY_TIME10(12),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_RED_CARD(13),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_PENALTY_MISS(14),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_GOAL_OWN(15),
    HOCKEY_CHANGE(16),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_COACH_CHALLENGE(17),
    /* JADX INFO: Fake field, exist only in values array */
    KABADDI_NON_RAID_TECHNICAL_POINTS(18),
    /* JADX INFO: Fake field, exist only in values array */
    FLOORBALL_UNBEATEN_PENALTY(19),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_COACH_CHALLENGE(20),
    /* JADX INFO: Fake field, exist only in values array */
    KABADDI_NON_RAID_TECHNICAL_POINTS(21),
    /* JADX INFO: Fake field, exist only in values array */
    FLOORBALL_UNBEATEN_PENALTY(22),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_COACH_CHALLENGE(23),
    /* JADX INFO: Fake field, exist only in values array */
    KABADDI_NON_RAID_TECHNICAL_POINTS(24),
    /* JADX INFO: Fake field, exist only in values array */
    FLOORBALL_UNBEATEN_PENALTY(25),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_COACH_CHALLENGE(26),
    /* JADX INFO: Fake field, exist only in values array */
    KABADDI_NON_RAID_TECHNICAL_POINTS(27),
    /* JADX INFO: Fake field, exist only in values array */
    FLOORBALL_UNBEATEN_PENALTY(28),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_COACH_CHALLENGE(29),
    /* JADX INFO: Fake field, exist only in values array */
    KABADDI_NON_RAID_TECHNICAL_POINTS(30),
    /* JADX INFO: Fake field, exist only in values array */
    FLOORBALL_UNBEATEN_PENALTY(31),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_COACH_CHALLENGE(32),
    /* JADX INFO: Fake field, exist only in values array */
    KABADDI_NON_RAID_TECHNICAL_POINTS(33),
    /* JADX INFO: Fake field, exist only in values array */
    FLOORBALL_UNBEATEN_PENALTY(34),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_COACH_CHALLENGE(35),
    /* JADX INFO: Fake field, exist only in values array */
    KABADDI_NON_RAID_TECHNICAL_POINTS(36),
    /* JADX INFO: Fake field, exist only in values array */
    FLOORBALL_UNBEATEN_PENALTY(37),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_COACH_CHALLENGE(38),
    /* JADX INFO: Fake field, exist only in values array */
    KABADDI_NON_RAID_TECHNICAL_POINTS(39),
    KABADDI_SUBSTITUTION(40),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_COACH_CHALLENGE(41),
    /* JADX INFO: Fake field, exist only in values array */
    KABADDI_NON_RAID_TECHNICAL_POINTS(42),
    /* JADX INFO: Fake field, exist only in values array */
    FLOORBALL_UNBEATEN_PENALTY(43),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_COACH_CHALLENGE(44),
    /* JADX INFO: Fake field, exist only in values array */
    KABADDI_NON_RAID_TECHNICAL_POINTS(45),
    /* JADX INFO: Fake field, exist only in values array */
    FLOORBALL_UNBEATEN_PENALTY(46),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_COACH_CHALLENGE(47),
    /* JADX INFO: Fake field, exist only in values array */
    FLOORBALL_UNBEATEN_PENALTY(48),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_COACH_CHALLENGE(49),
    /* JADX INFO: Fake field, exist only in values array */
    FLOORBALL_UNBEATEN_PENALTY(50),
    RUGBY_SUBSTITUTION_IN(51),
    /* JADX INFO: Fake field, exist only in values array */
    FLOORBALL_UNBEATEN_PENALTY(61),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_COACH_CHALLENGE(62),
    /* JADX INFO: Fake field, exist only in values array */
    FLOORBALL_UNBEATEN_PENALTY(63),
    /* JADX INFO: Fake field, exist only in values array */
    HOCKEY_COACH_CHALLENGE(Response.UNAUTHORIZED),
    REPLACE(204),
    UNKNOWN_EVENT(-1);

    public static final xak b = new xak((byte) 11);
    public static final /* synthetic */ c0o j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33971a;

    static {
        j = new c0o(new tho[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r2, r0, r1, r2, r0, r1, r2, r0, r1, r2, r0, r1, r2, r0, r1, r2, r0, r1, r2, r0, r1, r2, r0, r1, r2, r0, r1, r2, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1});
    }

    public tho(int i2) {
        super(str, i);
        this.f33971a = i2;
    }

    public static tho valueOf(String str) {
        return (tho) Enum.valueOf(tho.class, str);
    }

    public static tho[] values() {
        return (tho[]) i.clone();
    }
}
