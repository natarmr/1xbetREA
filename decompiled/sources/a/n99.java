package a;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n99 extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n99 f23128a = new n99(3, q99.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        q99 q99Var = (q99) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = q99.d;
        q99Var.getClass();
        if (obj3 == s99.l) {
            obj3 = new xtb(q99Var.q());
        }
        return new ztb(obj3);
    }
}
