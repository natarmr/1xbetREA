package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class fyc0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ hyc0 k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fyc0(byte b, yje yjeVar, hyc0 hyc0Var, boolean z) {
        super(2, yjeVar);
        this.i = b;
        this.k = hyc0Var;
        this.l = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        boolean z = this.l;
        hyc0 hyc0Var = this.k;
        switch (b) {
            case 0:
                return new fyc0((byte) 0, yjeVar, hyc0Var, z);
            default:
                return new fyc0((byte) 1, yjeVar, hyc0Var, z);
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
        return ((fyc0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objY;
        Object objA;
        byte b = this.i;
        yee yeeVar = yee.f42482a;
        dfe dfeVar = dfe.f5996a;
        boolean z = this.l;
        hyc0 hyc0Var = this.k;
        switch (b) {
            case 0:
                p7m0 p7m0Var = hyc0Var.F;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (hyc0Var.z.k) {
                        if (z) {
                            p7m0Var.getClass();
                            p7m0Var.o(null, dfeVar);
                        }
                        hnu hnuVar = hyc0Var.i;
                        this.j = true;
                        w5z w5zVar = (w5z) hnuVar.f13365a;
                        objY = w5zVar.Y(((xyt) w5zVar.b).a(), this);
                        if (objY == wneVar) {
                            return wneVar;
                        }
                    } else {
                        p7m0Var.getClass();
                        p7m0Var.o(null, yeeVar);
                    }
                    return Unit.f46060a;
                }
                if (!z2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objY = obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) objY) {
                    if (((zec0) obj2).i == 1) {
                        arrayList.add(obj2);
                    }
                }
                afe afeVar = new afe(new mgc0(arrayList, true));
                p7m0Var.getClass();
                p7m0Var.o(null, afeVar);
                return Unit.f46060a;
            default:
                p7m0 p7m0Var2 = hyc0Var.E;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    toc0 toc0Var = hyc0Var.z;
                    if (toc0Var.k && (toc0Var.c || toc0Var.f)) {
                        if (z) {
                            p7m0Var2.getClass();
                            p7m0Var2.o(null, dfeVar);
                        }
                        uou uouVar = hyc0Var.f;
                        this.j = true;
                        objA = uouVar.a(this);
                        if (objA == wneVar2) {
                            return wneVar2;
                        }
                    } else {
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, yeeVar);
                    }
                    return Unit.f46060a;
                }
                if (!z3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA = obj;
                dic0 dic0Var = (dic0) objA;
                dic0Var.getClass();
                int i = dic0Var.f6131a;
                boolean z4 = dic0Var.b;
                boolean z5 = dic0Var.c;
                boolean z6 = dic0Var.d;
                List list = dic0Var.e;
                eic0 eic0Var = new eic0(i, list, z4, z5, false, z6);
                tac0 tac0Var = hyc0Var.c;
                tac0Var.getClass();
                tac0Var.l = list;
                afe afeVar2 = new afe(eic0Var);
                p7m0Var2.getClass();
                p7m0Var2.o(null, afeVar2);
                return Unit.f46060a;
        }
    }
}
