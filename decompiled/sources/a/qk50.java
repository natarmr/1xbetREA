package a;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 a.qk50, still in use, count: 1, list:
  (r1v0 a.qk50) from 0x00fb: INVOKE (r0v17 android.util.SparseArray), (0 int), (r1v0 a.qk50) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:252)
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
/* JADX INFO: loaded from: classes.dex */
public final class qk50 {
    /* JADX INFO: Fake field, exist only in values array */
    LTE_CA(0),
    /* JADX INFO: Fake field, exist only in values array */
    TD_SCDMA(1),
    /* JADX INFO: Fake field, exist only in values array */
    EDGE(2),
    /* JADX INFO: Fake field, exist only in values array */
    UMTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    CDMA(4),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_0(5),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_A(6),
    /* JADX INFO: Fake field, exist only in values array */
    RTT(7),
    /* JADX INFO: Fake field, exist only in values array */
    HSDPA(8),
    /* JADX INFO: Fake field, exist only in values array */
    HSUPA(9),
    /* JADX INFO: Fake field, exist only in values array */
    HSPA(10),
    /* JADX INFO: Fake field, exist only in values array */
    IDEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_B(12),
    /* JADX INFO: Fake field, exist only in values array */
    LTE(13),
    /* JADX INFO: Fake field, exist only in values array */
    EHRPD(14),
    /* JADX INFO: Fake field, exist only in values array */
    IWLAN(15),
    /* JADX INFO: Fake field, exist only in values array */
    LTE_CA(16),
    /* JADX INFO: Fake field, exist only in values array */
    TD_SCDMA(17),
    /* JADX INFO: Fake field, exist only in values array */
    IWLAN(18),
    /* JADX INFO: Fake field, exist only in values array */
    LTE_CA(19),
    /* JADX INFO: Fake field, exist only in values array */
    COMBINED(100);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f28869a;

    static {
        SparseArray sparseArray = new SparseArray();
        f28869a = sparseArray;
        sparseArray.put(0, qk50Var);
        sparseArray.put(1, qk50Var);
        sparseArray.put(2, qk50Var);
        sparseArray.put(3, qk50Var);
        sparseArray.put(4, qk50Var);
        sparseArray.put(5, qk50Var);
        sparseArray.put(6, qk50Var);
        sparseArray.put(7, qk50Var);
        sparseArray.put(8, qk50Var);
        sparseArray.put(9, qk50Var);
        sparseArray.put(10, qk50Var);
        sparseArray.put(11, qk50Var);
        sparseArray.put(12, qk50Var);
        sparseArray.put(13, qk50Var);
        sparseArray.put(14, qk50Var);
        sparseArray.put(15, qk50Var);
        sparseArray.put(16, qk50Var);
        sparseArray.put(17, qk50Var);
        sparseArray.put(18, qk50Var);
        sparseArray.put(19, qk50Var);
    }

    public qk50(int i) {
        super(str, i);
    }

    public static qk50 valueOf(String str) {
        return (qk50) Enum.valueOf(qk50.class, str);
    }

    public static qk50[] values() {
        return (qk50[]) b.clone();
    }
}
