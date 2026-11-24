package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class u750 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ p850 k;
    public final /* synthetic */ t150 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u750(p850 p850Var, t150 t150Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = p850Var;
        this.l = t150Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        t150 t150Var = this.l;
        p850 p850Var = this.k;
        switch (b) {
            case 0:
                return new u750(p850Var, t150Var, yjeVar, (byte) 0);
            default:
                return new u750(p850Var, t150Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((u750) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        t150 t150Var = this.l;
        p850 p850Var = this.k;
        switch (b) {
            case 0:
                s64 s64Var = p850Var.V;
                u58 u58Var = p850Var.U;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (((p650) p850Var.D()).f26438a == mi0.MY_AGGREGATOR) {
                        int iOrdinal = t150Var.ordinal();
                        if (iOrdinal == 0) {
                            u58Var.l("my_aggregator");
                            y1p y1pVar = y1p.MAIN;
                            s64Var.c("my_aggregator");
                        } else if (iOrdinal == 2) {
                            u58Var.l("my_aggregator_banner");
                            y1p y1pVar2 = y1p.MAIN;
                            s64Var.c("my_aggregator_banner");
                        }
                    }
                    ytt yttVar = p850Var.N;
                    aue0 aue0Var = aue0.d;
                    this.j = true;
                    if (yttVar.a(aue0Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0VarC = p850Var.o.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                c8d c8dVar = new c8d(y7d.f42146a, n0w0.f22721a);
                ListIterator listIterator = cs0.h(copyOnWriteArrayListQ, c8dVar, c8dVar, i1w0VarC, copyOnWriteArrayListQ).listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarC.a((oe50) pawVar.next());
                }
                break;
            default:
                cmt cmtVar = p850Var.m0;
                s64 s64Var2 = p850Var.V;
                u58 u58Var2 = p850Var.U;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (((p650) p850Var.D()).f26438a == mi0.MY_AGGREGATOR) {
                        int iOrdinal2 = t150Var.ordinal();
                        if (iOrdinal2 == 0) {
                            u58Var2.m("my_aggregator");
                            s64Var2.d(y1p.MY_AGGREGATOR, cmtVar.g());
                        } else if (iOrdinal2 == 1) {
                            u58Var2.h(null, null, "my_aggregator");
                            p850Var.X.n(null, null, "my_aggregator");
                        } else {
                            if (iOrdinal2 != 2) {
                                t9f.b();
                                return null;
                            }
                            u58Var2.m("my_aggregator_banner");
                            s64Var2.d(y1p.MY_AGGREGATOR_BANNER, cmtVar.g());
                        }
                    }
                    ytt yttVar2 = p850Var.N;
                    aue0 aue0Var2 = aue0.d;
                    this.j = true;
                    if (yttVar2.a(aue0Var2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0VarC2 = p850Var.o.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarC2);
                c8d c8dVar2 = new c8d(y7d.f42146a, o0w0.f24450a);
                ListIterator listIterator2 = cs0.h(copyOnWriteArrayListQ2, c8dVar2, c8dVar2, i1w0VarC2, copyOnWriteArrayListQ2).listIterator(0);
                while (true) {
                    paw pawVar2 = (paw) listIterator2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarC2.a((oe50) pawVar2.next());
                }
                break;
        }
    }
}
