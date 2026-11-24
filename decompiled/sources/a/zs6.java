package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class zs6 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ dt6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zs6(dt6 dt6Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = dt6Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        dt6 dt6Var = this.k;
        switch (b) {
            case 0:
                return new zs6(dt6Var, yjeVar, (byte) 0);
            default:
                return new zs6(dt6Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((zs6) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        c820 c820Var;
        jfc0 jfc0Var;
        Object objM;
        byte b = this.i;
        dt6 dt6Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    u4a u4aVar = dt6Var.r;
                    this.j = true;
                    objA = u4aVar.a(this);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                boolean zBooleanValue = ((Boolean) objA).booleanValue();
                int i = dt6.e0;
                p7m0 p7m0Var = dt6Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    c820Var = (c820) value;
                    jfc0Var = c820Var.e;
                } while (!p7m0Var.m(value, c820.a(c820Var, null, null, null, null, jfc0Var != null ? jfc0.a(jfc0Var, null, null, zBooleanValue, false, 23) : null, null, false, false, false, false, null, 8175)));
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    vae0 vae0VarD = dt6Var.w.d();
                    this.j = true;
                    objM = ntb.M(vae0VarD, this);
                    if (objM == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objM = obj;
                }
                jg7 jg7Var = (jg7) objM;
                if (jg7Var != null) {
                    int i2 = dt6.e0;
                    dt6Var.a0(jg7Var);
                }
                return Unit.f46060a;
        }
    }
}
