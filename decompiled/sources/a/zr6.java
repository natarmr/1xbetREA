package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zr6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ as6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zr6(as6 as6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = as6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        as6 as6Var = this.k;
        switch (b) {
            case 0:
                return new zr6(as6Var, yjeVar, (byte) 0);
            default:
                zr6 zr6Var = new zr6(as6Var, yjeVar, (byte) 1);
                zr6Var.j = ((Boolean) obj).booleanValue();
                return zr6Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zr6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((zr6) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objH;
        byte b = this.i;
        yje yjeVar = null;
        as6 as6Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    xex xexVar = as6Var.v;
                    this.j = true;
                    objH = xexVar.H(this);
                    if (objH == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objH = obj;
                }
                if (((Boolean) objH).booleanValue()) {
                    as6Var.F.f(uct.f35447a);
                }
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                eeu eeuVar = (eeu) as6Var.D.getValue();
                if ((eeuVar instanceof ceu) || Intrinsics.d(eeuVar, deu.f5968a)) {
                    if (z2) {
                        as6Var.C = sac.i0(jiu0.a(as6Var), as6.class.getName().concat(".setSports"), 3, 8L, kotlin.collections.a.c(oqt0.class), null, new hu3((diu0) as6Var, yjeVar, (byte) 2), null, as6Var.q.b, new yr6(as6Var, (byte) 0), null, 592);
                    } else {
                        as6Var.D();
                    }
                }
                return Unit.f46060a;
        }
    }
}
