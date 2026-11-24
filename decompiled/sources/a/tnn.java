package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class tnn extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ wnn k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tnn(wnn wnnVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wnnVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wnn wnnVar = this.k;
        switch (b) {
            case 0:
                return new tnn(wnnVar, yjeVar, (byte) 0);
            default:
                tnn tnnVar = new tnn(wnnVar, yjeVar, (byte) 1);
                tnnVar.j = ((Boolean) obj).booleanValue();
                return tnnVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((tnn) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((tnn) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        wnn wnnVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bby bbyVar = wnnVar.f0;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    bby bbyVar2 = wnnVar.Z;
                    if (bbyVar2 != null) {
                        bbyVar2.cancel(null);
                    }
                    qv2 qv2Var = wnnVar.F;
                    long j = wnnVar.o;
                    this.j = true;
                    if (qv2Var.s(j, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = wnn.g0;
                wnnVar.P();
                bby bbyVar3 = wnnVar.c0;
                if (bbyVar3 != null) {
                    bbyVar3.cancel(null);
                }
                wnnVar.P();
                wnnVar.H(new qnn(wnnVar, (byte) 2));
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    int i2 = wnn.g0;
                    c4m0 c4m0Var = wnnVar.e0;
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                    wnnVar.e0 = i3t0.L(wnnVar, new p6d(wnnVar.C.a(), new i89(((jnn) ((lrc) wnnVar.P.f26374a).b).f16821a, (byte) 22), new e00(wnnVar, null, (byte) 26), (byte) 1), null, null, 3);
                    amn amnVar = ((inn) wnnVar.D()).g;
                    if (amnVar.equals(yln.f42852a) || amnVar.equals(zln.f44588a)) {
                        bby bbyVar4 = wnnVar.b0;
                        if (!(bbyVar4 != null ? bbyVar4.isActive() : false)) {
                            wnnVar.Q();
                        }
                    } else if (amnVar instanceof xln) {
                        if (!wnnVar.O()) {
                            if (((sln) ((es) wnnVar.U.b).f8305a).f32408a.isEmpty()) {
                                wnnVar.Q();
                            } else {
                                wnnVar.R();
                            }
                        }
                    } else if (amnVar instanceof vln) {
                        if (!wnnVar.O()) {
                            wnnVar.R();
                        }
                    } else if (!amnVar.equals(wln.f39362a)) {
                        t9f.b();
                        return null;
                    }
                }
                return Unit.f46060a;
        }
    }
}
