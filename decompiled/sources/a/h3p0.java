package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class h3p0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ i3p0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3p0(i3p0 i3p0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = i3p0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        i3p0 i3p0Var = this.l;
        switch (b) {
            case 0:
                h3p0 h3p0Var = new h3p0(i3p0Var, yjeVar, (byte) 0);
                h3p0Var.k = obj;
                return h3p0Var;
            default:
                h3p0 h3p0Var2 = new h3p0(i3p0Var, yjeVar, (byte) 1);
                h3p0Var2.k = obj;
                return h3p0Var2;
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
        return ((h3p0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object g0g0Var;
        Object g0g0Var2;
        byte b = this.i;
        i3p0 i3p0Var = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                try {
                    if (!z) {
                        z1x.P(obj);
                        e0g0 e0g0Var = j0g0.b;
                        dyu dyuVar = i3p0Var.q;
                        String str = i3p0Var.o.e;
                        this.k = null;
                        this.j = true;
                        obj = dyuVar.f6912a.t(str, this);
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
                    g0g0Var = (nfp0) obj;
                    e0g0 e0g0Var2 = j0g0.b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                return new j0g0(g0g0Var);
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                try {
                    if (!z2) {
                        z1x.P(obj);
                        e0g0 e0g0Var4 = j0g0.b;
                        dyu dyuVar2 = i3p0Var.p;
                        String str2 = i3p0Var.o.e;
                        this.k = null;
                        this.j = true;
                        obj = dyuVar2.f6912a.s(str2, this);
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
                    g0g0Var2 = (t1p0) obj;
                    e0g0 e0g0Var5 = j0g0.b;
                    break;
                } catch (Throwable th2) {
                    e0g0 e0g0Var6 = j0g0.b;
                    g0g0Var2 = new g0g0(th2);
                }
                return new j0g0(g0g0Var2);
        }
    }
}
