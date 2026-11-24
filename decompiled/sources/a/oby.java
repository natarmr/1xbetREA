package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oby extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oby f25002a = new oby(3, pby.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        Object objH;
        pby pbyVar = (pby) obj;
        o2i0 o2i0Var = (o2i0) obj2;
        int i = pby.c;
        do {
            objH = pbyVar.H();
            if (!(objH instanceof u4x)) {
                o2i0Var.e = Unit.f46060a;
            }
            return Unit.f46060a;
        } while (pbyVar.W(objH) < 0);
        o2i0Var.c = zvw.W(pbyVar, true, new kby(pbyVar, o2i0Var));
        return Unit.f46060a;
    }
}
