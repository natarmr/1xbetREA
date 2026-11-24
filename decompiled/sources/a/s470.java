package a;

import kotlin.text.StringsKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v19 a.s470[], still in use, count: 1, list:
  (r0v19 a.s470[]) from 0x0113: CONSTRUCTOR (r0v19 a.s470[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:276) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes3.dex */
@ahi0(with = c570.class)
public final class s470 {
    GAME_UNAVAILABLE("-1"),
    ONE_X_MEMORY("39"),
    ONE_X_SAFE("40"),
    ONE_X_CHEST("41"),
    ONE_X_LOTTERY("45"),
    RESIDENT("74"),
    LUCKY_CARD("122"),
    DOMINO("128"),
    APPLE_FORTUNE("138"),
    DRAGON_GOLD("181"),
    SPIN_AND_WIN("185"),
    SCRATCH_CARD("189"),
    AFRICAN_ROULETTE("190"),
    CRYSTAL("249"),
    LUCKY_WHEEL("311"),
    ODYSSEY("316"),
    FRUIT_BLAST("343"),
    EASTEN_NIGHT("386"),
    GAMES_MANIA("384");

    public static final r470 Companion = new r470();
    public static final /* synthetic */ c0o v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31592a;

    static {
        v = new c0o(new s470[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0, r1});
    }

    public s470(String str) {
        super(str, i);
        this.f31592a = str;
    }

    public static s470 valueOf(String str) {
        return (s470) Enum.valueOf(s470.class, str);
    }

    public static s470[] values() {
        return (s470[]) u.clone();
    }

    public final long a() {
        Long lT0 = StringsKt.t0(this.f31592a);
        if (lT0 != null) {
            return lT0.longValue();
        }
        return 0L;
    }

    public final String b() {
        int iOrdinal = ordinal();
        return (iOrdinal == 0 || iOrdinal == 10 || iOrdinal == 12 || iOrdinal == 13 || iOrdinal == 15 || iOrdinal == 16) ? axq.h(a(), "game_", "_v2") : h97.h(a(), "game_");
    }
}
