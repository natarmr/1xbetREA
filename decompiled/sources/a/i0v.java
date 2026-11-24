package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class i0v extends bnn0 implements xdr {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ long m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0v(yje yjeVar, wdu wduVar, long j, boolean z) {
        super(3, yjeVar);
        this.o = wduVar;
        this.m = j;
        this.n = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.o;
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                i0v i0vVar = new i0v(yjeVar, (ywq0) obj4, this.n, this.m);
                i0vVar.k = kmqVar;
                i0vVar.l = obj2;
                return i0vVar.invokeSuspend(Unit.f46060a);
            default:
                i0v i0vVar2 = new i0v(yjeVar, (wdu) obj4, this.m, this.n);
                i0vVar2.k = kmqVar;
                i0vVar2.l = obj2;
                return i0vVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        boolean z = this.n;
        Object obj2 = this.o;
        byte b2 = 0;
        yje yjeVar = null;
        switch (b) {
            case 0:
                ywq0 ywq0Var = (ywq0) obj2;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    kmq kmqVar = this.k;
                    jvn jvnVar = (jvn) this.l;
                    hie0 hie0Var = new hie0();
                    hie0Var.f13108a = z;
                    ltb ltbVarB = aoq.b(new i89(uvw.P(new a1g(new qqu(bkb.h0(30L, TimeUnit.SECONDS, new n1((Object) ywq0Var, (Object) jvnVar, this.m, (yje) null, (byte) 15)), hie0Var, (byte) 7), new h0v(ywq0Var, yjeVar, b2), (byte) 20), new lqu(hie0Var, (byte) 10), 30L, new m91(ywq0Var, yjeVar, (byte) 10), null, null, 56), (byte) 22), new i89(((w5z) ywq0Var.f43384a).r(y9s.f42264a), (byte) 22));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar, ltbVarB, this) == wneVar) {
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
                wdu wduVar = (wdu) obj2;
                kmq kmqVar2 = this.k;
                Object obj3 = this.l;
                Object obj4 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    int iIntValue = ((Number) obj3).intValue();
                    p7m0 p7m0VarA = ((kc60) wduVar.b).a();
                    vsg0 vsg0Var = new vsg0(new apu(wduVar, this.m, iIntValue, null));
                    o2v o2vVar = new o2v((yje) null, wduVar, z);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    f7k.J(kmqVar2);
                    Object objG = tdc.G(this, kmqVar2, new kh1((Object) o2vVar, yjeVar, (byte) 9), pul.j, new gmq[]{p7m0VarA, vsg0Var});
                    if (objG != wne.f39444a) {
                        objG = Unit.f46060a;
                    }
                    if (objG != wne.f39444a) {
                        objG = Unit.f46060a;
                    }
                    if (objG == obj4) {
                        return obj4;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0v(yje yjeVar, ywq0 ywq0Var, boolean z, long j) {
        super(3, yjeVar);
        this.o = ywq0Var;
        this.n = z;
        this.m = j;
    }
}
