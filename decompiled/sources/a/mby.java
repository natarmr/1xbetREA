package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mby extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mby f21526a = new mby(3, pby.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        Object objH;
        pby pbyVar = (pby) obj;
        o2i0 o2i0Var = (o2i0) obj2;
        int i = pby.c;
        do {
            objH = pbyVar.H();
            if (!(objH instanceof u4x)) {
                if (!(objH instanceof udd)) {
                    objH = qby.a(objH);
                }
                o2i0Var.e = objH;
            }
            return Unit.f46060a;
        } while (pbyVar.W(objH) < 0);
        o2i0Var.c = zvw.W(pbyVar, true, new jby(pbyVar, o2i0Var));
        return Unit.f46060a;
    }
}
