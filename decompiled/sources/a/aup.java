package a;

import org.xbet.client1.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.aup[], still in use, count: 1, list:
  (r0v1 a.aup[]) from 0x003f: CONSTRUCTOR (r0v1 a.aup[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:64) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes6.dex */
public final class aup {
    /* JADX INFO: Fake field, exist only in values array */
    TOTAL_STRIKES(R.string.ufc_fight_total_strikes),
    /* JADX INFO: Fake field, exist only in values array */
    SIGNIFICANT_STRIKES(R.string.ufc_fight_significant_strikes),
    /* JADX INFO: Fake field, exist only in values array */
    KNOCKDOWNS(R.string.ufc_fight_knockdowns),
    /* JADX INFO: Fake field, exist only in values array */
    TAKEDOWNS(R.string.ufc_fight_takedowns),
    /* JADX INFO: Fake field, exist only in values array */
    SUBMISSION_ATTEMPTS(R.string.ufc_fight_submission_attempts);

    public static final /* synthetic */ c0o c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1489a;

    static {
        c = new c0o(aupVarArr);
    }

    public aup(int i) {
        super(str, i);
        this.f1489a = i;
    }

    public static aup valueOf(String str) {
        return (aup) Enum.valueOf(aup.class, str);
    }

    public static aup[] values() {
        return (aup[]) b.clone();
    }
}
