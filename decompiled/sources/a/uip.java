package a;

import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.uip[], still in use, count: 1, list:
  (r0v1 a.uip[]) from 0x0026: CONSTRUCTOR (r0v1 a.uip[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:39) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = vip.class)
public final class uip {
    c("0", kotlin.collections.a.c("3")),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("1", iun.f15405a);

    public static final tip Companion = new tip();
    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35743a;
    public final List b;

    static {
        e = new c0o(new uip[]{r0, new uip("1", iun.f15405a)});
    }

    public uip(String str, List list) {
        super(str, i);
        this.f35743a = str;
        this.b = list;
    }

    public static uip valueOf(String str) {
        return (uip) Enum.valueOf(uip.class, str);
    }

    public static uip[] values() {
        return (uip[]) d.clone();
    }
}
