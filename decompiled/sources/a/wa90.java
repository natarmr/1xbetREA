package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class wa90 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ db90 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wa90(db90 db90Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = db90Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        db90 db90Var = this.k;
        switch (b) {
            case 0:
                return new wa90(db90Var, yjeVar, (byte) 0);
            case 1:
                return new wa90(db90Var, yjeVar, (byte) 1);
            case 2:
                return new wa90(db90Var, yjeVar, (byte) 2);
            case 3:
                return new wa90(db90Var, yjeVar, (byte) 3);
            default:
                return new wa90(db90Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((wa90) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        db90 db90Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                db90 db90Var2 = this.k;
                if (!z) {
                    z1x.P(obj);
                    nou nouVar = db90Var2.F;
                    this.j = true;
                    obj = nouVar.a(tl5.c, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                long j = ((ql5) obj).f28916a;
                int i = db90.M;
                sac.V(jiu0.a(db90Var2), new ua90(db90Var2, (byte) 3), null, db90Var2.D.b, new n1(db90Var2, j, (yje) null, (byte) 20), 10);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                db90 db90Var3 = this.k;
                if (!z2) {
                    z1x.P(obj);
                    ahu ahuVar = db90Var3.u;
                    this.j = true;
                    obj = ahuVar.b(bm5.f2822a, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (((ql5) obj).i.a()) {
                    int i2 = db90.M;
                    db90Var3.G(x990.f40500a);
                } else {
                    long j2 = db90Var3.o.b;
                    sac.V(jiu0.a(db90Var3), new ua90(db90Var3, (byte) 3), null, db90Var3.D.b, new n1(db90Var3, j2, (yje) null, (byte) 20), 10);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    buo0 buo0Var = (buo0) db90Var.v.get();
                    hae0 hae0Var = hae0.ACTION_DO_DEPOSIT;
                    this.j = true;
                    if (buo0Var.a(hae0Var, this) == wneVar3) {
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
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    vsg0 vsg0VarL = sac.L(6, TimeUnit.SECONDS.toMillis(db90Var.K.a().u1), 0L);
                    this.j = true;
                    if (slb.N(vsg0VarL, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i3 = db90.M;
                db90Var.H(new obg((byte) 25, true));
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    eu4 eu4Var = new eu4(new wk30(db90Var.w.f32825a.e.f37746a, (byte) 13), (byte) 25);
                    mi80 mi80Var = new mi80(db90Var, (byte) 23);
                    this.j = true;
                    if (eu4Var.c(mi80Var, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
