package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class r360 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ v360 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r360(v360 v360Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = v360Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        v360 v360Var = this.k;
        switch (b) {
            case 0:
                r360 r360Var = new r360(v360Var, yjeVar, (byte) 0);
                r360Var.j = ((Boolean) obj).booleanValue();
                return r360Var;
            case 1:
                return new r360(v360Var, yjeVar, (byte) 1);
            default:
                return new r360(v360Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((r360) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((r360) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((r360) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        bby bbyVar;
        byte b = this.i;
        v360 v360Var = this.k;
        Object[] objArr = 0;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = v360.x0;
                ocj ocjVar = v360Var.i;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, c260.a((c260) value, null, false, false, z, null, false, null, null, null, null, 262079)));
                if (z && ((bbyVar = v360Var.v0) == null || !bbyVar.isActive())) {
                    v360Var.a0();
                } else if (!z) {
                    tz50 tz50Var = ((c260) v360Var.D()).j;
                    rz50 rz50Var = tz50Var instanceof rz50 ? (rz50) tz50Var : null;
                    if (rz50Var != null && !v360.M(rz50Var) && v360.R(rz50Var)) {
                        p7m0 p7m0Var2 = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var2.getValue();
                            value2.getClass();
                        } while (!p7m0Var2.m(value2, c260.a((c260) value2, null, false, false, false, null, true, null, null, null, null, 261631)));
                    }
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    vsg0 vsg0Var = new vsg0(new g6q(new gmq[]{v360Var.c0.m(), v360Var.d0.a()}, (yje) (objArr == true ? 1 : 0), (wdr) new t360(v360Var, null), (byte) 11));
                    d360 d360Var = new d360(v360Var, b2);
                    this.j = true;
                    if (vsg0Var.c(d360Var, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    urt urtVar = v360Var.w;
                    tl5 tl5Var = tl5.f34128a;
                    this.j = true;
                    if (urtVar.f36180a.i(tl5Var, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
