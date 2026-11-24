package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class my70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ boolean k;
    public final /* synthetic */ gz70 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my70(byte b, yje yjeVar, gz70 gz70Var) {
        super(2, yjeVar);
        this.i = b;
        this.l = gz70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                my70 my70Var = new my70((byte) 0, yjeVar, this.l);
                my70Var.k = ((Boolean) obj).booleanValue();
                return my70Var;
            default:
                my70 my70Var2 = new my70((byte) 1, yjeVar, this.l);
                my70Var2.k = ((Boolean) obj).booleanValue();
                return my70Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.i;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        yje yjeVar = (yje) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((my70) create(bool, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        gz70 gz70Var = this.l;
        switch (b) {
            case 0:
                boolean z = this.k;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (z) {
                        this.k = z;
                        this.j = true;
                        c4m0 c4m0Var = gz70.D;
                        if (gz70Var.c(this) == wneVar) {
                            return wneVar;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                oom0 oom0Var = oom0.f25602a;
                c4m0 c4m0Var2 = gz70.D;
                gz70Var.getClass();
                gz70.d(oom0Var);
                return Unit.f46060a;
            default:
                boolean z3 = this.k;
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    if (!z3) {
                        oom0 oom0Var2 = oom0.b;
                        c4m0 c4m0Var3 = gz70.D;
                        gz70Var.getClass();
                        gz70.d(oom0Var2);
                        dvj dvjVar = gz70Var.C.b;
                        ny70 ny70Var = new ny70((byte) 1, null, gz70Var);
                        this.k = z3;
                        this.j = true;
                        if (qjj.d0(dvjVar, ny70Var, this) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
