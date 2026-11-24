package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ywk0 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ yhi m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ hie0 p;
    public final /* synthetic */ boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ywk0(yje yjeVar, yhi yhiVar, int i, int i2, hie0 hie0Var, boolean z, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = yhiVar;
        this.n = i;
        this.o = i2;
        this.p = hie0Var;
        this.q = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (this.i) {
            case 0:
                ywk0 ywk0Var = new ywk0(yjeVar, this.m, this.n, this.o, this.p, this.q, (byte) 0);
                ywk0Var.k = kmqVar;
                ywk0Var.l = obj2;
                return ywk0Var.invokeSuspend(Unit.f46060a);
            default:
                ywk0 ywk0Var2 = new ywk0(yjeVar, this.m, this.n, this.o, this.p, this.q, (byte) 1);
                ywk0Var2.k = kmqVar;
                ywk0Var2.l = obj2;
                return ywk0Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.i;
        boolean z = this.q;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        hie0 hie0Var = this.p;
        yje yjeVar = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                kmq kmqVar = this.k;
                Object obj2 = this.l;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    jvn jvnVar = (jvn) obj2;
                    yhi yhiVar = this.m;
                    khf0 khf0Var = (khf0) yhiVar.e;
                    jvnVar.getClass();
                    dnq dnqVar = new dnq(aoq.c(new a1g(ebc.i0(bkb.h0(30L, timeUnit, new ydu(khf0Var, this.n, this.o, jvnVar, (yje) null)), 30L, new vls((byte) 28), new jcs(khf0Var, (byte) 22)), new bxk0(yhiVar, new xvu(hie0Var, (byte) 5), new wwk0(yhiVar, yjeVar, b2), 30L, null), (byte) 20), new axk0(yjeVar, yhiVar, z, (byte) 0)), new xwk0(yhiVar, yjeVar, b2), (byte) 1);
                    uwu uwuVar = new uwu(hie0Var, yjeVar, (byte) 4);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    f7k.J(kmqVar);
                    Object objC = dnqVar.c(new vnq(kmqVar, uwuVar, (byte) 2), this);
                    if (objC != wneVar) {
                        objC = Unit.f46060a;
                    }
                    if (objC != wneVar) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar) {
                        return wneVar;
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
                kmq kmqVar2 = this.k;
                Object obj3 = this.l;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    jvn jvnVar2 = (jvn) obj3;
                    yhi yhiVar2 = this.m;
                    lbu lbuVar = (lbu) yhiVar2.f;
                    jvnVar2.getClass();
                    dnq dnqVar2 = new dnq(aoq.c(new a1g(ebc.i0(bkb.h0(8L, timeUnit, new ydu(lbuVar, this.n, jvnVar2, this.o, (yje) null)), 8L, new vls((byte) 29), new jcs(lbuVar, (byte) 23)), new bxk0(yhiVar2, new xvu(hie0Var, (byte) 6), new wwk0(yhiVar2, yjeVar, (byte) 3), 8L, null), (byte) 20), new axk0(yjeVar, yhiVar2, z, b2)), new xwk0(yhiVar2, yjeVar, (byte) 2), (byte) 1);
                    uwu uwuVar2 = new uwu(hie0Var, yjeVar, (byte) 5);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    f7k.J(kmqVar2);
                    Object objC2 = dnqVar2.c(new vnq(kmqVar2, uwuVar2, (byte) 2), this);
                    if (objC2 != wneVar2) {
                        objC2 = Unit.f46060a;
                    }
                    if (objC2 != wneVar2) {
                        objC2 = Unit.f46060a;
                    }
                    if (objC2 == wneVar2) {
                        return wneVar2;
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
