package a;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ph60 extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ph60 f26982a = new ph60(3, qh60.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        qh60 qh60Var = (qh60) obj;
        o2i0 o2i0Var = (o2i0) obj2;
        long j = qh60Var.f28724a;
        if (j <= 0) {
            o2i0Var.e = Unit.f46060a;
        } else {
            oh60 oh60Var = new oh60(o2i0Var, qh60Var, (byte) 0);
            o2i0Var.getClass();
            CoroutineContext coroutineContext = o2i0Var.f24531a;
            o2i0Var.c = qcc.T(coroutineContext).c(j, oh60Var, coroutineContext);
        }
        return Unit.f46060a;
    }
}
