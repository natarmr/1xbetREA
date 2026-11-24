package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class k8q extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ r8q l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8q(r8q r8qVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = r8qVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        r8q r8qVar = this.l;
        switch (b) {
            case 0:
                k8q k8qVar = new k8q(r8qVar, yjeVar, (byte) 0);
                k8qVar.k = obj;
                return k8qVar;
            default:
                k8q k8qVar2 = new k8q(r8qVar, yjeVar, (byte) 1);
                k8qVar2.k = obj;
                return k8qVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((k8q) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((k8q) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        r8q r8qVar = this.l;
        yje yjeVar = null;
        switch (b) {
            case 0:
                kmq kmqVar = (kmq) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    Boolean boolValueOf = Boolean.valueOf(r8qVar.v.g());
                    this.k = null;
                    this.j = true;
                    if (kmqVar.a(boolValueOf, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                sw00 sw00Var = (sw00) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (sw00Var.f32897a) {
                        this.k = null;
                        this.j = true;
                        ocq ocqVar = r8q.Y;
                        if (r8qVar.y(this) == wneVar2) {
                            return wneVar2;
                        }
                    } else {
                        p7m0 p7m0Var = r8qVar.S;
                        p7m0Var.getClass();
                        p7m0Var.o(null, p7q.f26519a);
                    }
                    return Unit.f46060a;
                }
                if (!z2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                ocq ocqVar2 = r8q.Y;
                f6k f6kVar = r8qVar.B;
                bm5 bm5Var = bm5.m;
                f6kVar.a(bm5Var);
                slb.U(new fnq(r8qVar.I.a(bm5Var), new sxk(r8qVar, null, (byte) 23), (byte) 4), r8qVar.X);
                byte b2 = 0;
                slb.U(new fnq(new fnq(r8qVar.y.a(), new k8q(r8qVar, yjeVar, b2)), new l8q(r8qVar, yjeVar, b2), (byte) 4), jiu0.a(r8qVar));
                return Unit.f46060a;
        }
    }
}
