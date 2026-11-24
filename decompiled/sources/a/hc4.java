package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class hc4 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ boolean l;
    public i3t0 m;
    public final /* synthetic */ i3t0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hc4(i3t0 i3t0Var, int i, boolean z, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.n = i3t0Var;
        this.k = i;
        this.l = z;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        i3t0 i3t0Var = this.n;
        switch (b) {
            case 0:
                return new hc4((kc4) i3t0Var, this.k, this.l, yjeVar, (byte) 0);
            case 1:
                return new hc4((fh4) i3t0Var, this.k, this.l, yjeVar, (byte) 1);
            default:
                return new hc4((hk4) i3t0Var, this.k, this.l, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((hc4) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws g2 {
        byte b = this.i;
        byte b2 = 2;
        boolean z = this.l;
        int i = this.k;
        String str = "";
        i3t0 i3t0Var = this.n;
        byte b3 = 1;
        switch (b) {
            case 0:
                kc4 kc4Var = (kc4) i3t0Var;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i2 = kc4.Y;
                    kc4Var.H(new xb4(str, kc4Var, b3));
                    rpt rptVar = kc4Var.w;
                    this.m = kc4Var;
                    this.j = true;
                    obj = rptVar.h(i, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kc4Var = (kc4) this.m;
                    z1x.P(obj);
                }
                int i3 = kc4.Y;
                kc4Var.getClass();
                kc4Var.H(new rb4((qkt) obj, z, (byte) 0));
                return Unit.f46060a;
            case 1:
                fh4 fh4Var = (fh4) i3t0Var;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    int i4 = fh4.c0;
                    fh4Var.H(new sg4(str, fh4Var, b2));
                    rpt rptVar2 = fh4Var.v;
                    this.m = fh4Var;
                    this.j = true;
                    obj = rptVar2.h(i, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fh4Var = (fh4) this.m;
                    z1x.P(obj);
                }
                int i5 = fh4.c0;
                fh4Var.getClass();
                fh4Var.H(new rb4((qkt) obj, z, b3));
                return Unit.f46060a;
            default:
                hk4 hk4Var = (hk4) i3t0Var;
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    int i6 = hk4.b0;
                    hk4Var.H(new zj4(str, hk4Var, b3));
                    rpt rptVar3 = hk4Var.u;
                    this.m = hk4Var;
                    this.j = true;
                    obj = rptVar3.h(i, this);
                    if (obj == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hk4Var = (hk4) this.m;
                    z1x.P(obj);
                }
                int i7 = hk4.b0;
                hk4Var.getClass();
                hk4Var.H(new rb4((qkt) obj, z, b2));
                return Unit.f46060a;
        }
    }
}
