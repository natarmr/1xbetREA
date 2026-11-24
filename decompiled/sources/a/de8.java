package a;

import java.io.Serializable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.de8[], still in use, count: 1, list:
  (r0v1 a.de8[]) from 0x0028: CONSTRUCTOR (r0v1 a.de8[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:41) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = ee8.class)
public final class de8 implements Serializable {
    NOTHING("0"),
    /* JADX INFO: Fake field, exist only in values array */
    BONUS_ENABLED("1"),
    /* JADX INFO: Fake field, exist only in values array */
    BONUS_LOSE("2");

    public static final ce8 Companion = new ce8();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5936a;

    static {
        d = new c0o(new de8[]{r0, new de8("1"), new de8("2")});
    }

    public de8(String str) {
        super(str, i);
        this.f5936a = str;
    }

    public static de8 valueOf(String str) {
        return (de8) Enum.valueOf(de8.class, str);
    }

    public static de8[] values() {
        return (de8[]) c.clone();
    }
}
