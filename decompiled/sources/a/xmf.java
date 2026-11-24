package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.xmf[], still in use, count: 1, list:
  (r0v1 a.xmf[]) from 0x004e: CONSTRUCTOR (r0v1 a.xmf[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:79) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes4.dex */
public final class xmf {
    /* JADX INFO: Fake field, exist only in values array */
    STAT_WEAPONS(t9m0.CS_STAT_WEAPONS),
    /* JADX INFO: Fake field, exist only in values array */
    STAT_ROUNDS(t9m0.CS_STAT_ROUNDS),
    /* JADX INFO: Fake field, exist only in values array */
    GAME_LOG(t9m0.CS_GAME_LOG),
    /* JADX INFO: Fake field, exist only in values array */
    MAP_SERIES(t9m0.CS_MAP_SERIES),
    /* JADX INFO: Fake field, exist only in values array */
    STAT_OF_MAPS(t9m0.CS_STAT_OF_MAPS),
    /* JADX INFO: Fake field, exist only in values array */
    COMPOSITION(t9m0.CS_COMPOSITION),
    /* JADX INFO: Fake field, exist only in values array */
    LAST_MATCHES(t9m0.CS_LAST_MATCHES);

    public static final /* synthetic */ c0o c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9m0 f41120a;

    static {
        c = new c0o(xmfVarArr);
    }

    public xmf(t9m0 t9m0Var) {
        super(str, i);
        this.f41120a = t9m0Var;
    }

    public static xmf valueOf(String str) {
        return (xmf) Enum.valueOf(xmf.class, str);
    }

    public static xmf[] values() {
        return (xmf[]) b.clone();
    }
}
