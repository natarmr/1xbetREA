package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class snu extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ wdu m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ snu(yje yjeVar, wdu wduVar, boolean z, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = wduVar;
        this.n = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        boolean z = this.n;
        wdu wduVar = this.m;
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                snu snuVar = new snu(yjeVar, wduVar, z, (byte) 0);
                snuVar.k = kmqVar;
                snuVar.l = obj2;
                return snuVar.invokeSuspend(Unit.f46060a);
            default:
                snu snuVar2 = new snu(yjeVar, wduVar, z, (byte) 1);
                snuVar2.k = kmqVar;
                snuVar2.l = obj2;
                return snuVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 9;
        boolean z = this.n;
        wdu wduVar = this.m;
        yje yjeVar = null;
        switch (b) {
            case 0:
                ort ortVar = (ort) wduVar.d;
                kmq kmqVar = this.k;
                Object obj2 = this.l;
                Object obj3 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    utb utbVarC = aoq.c(i120.W(new a1t(ortVar.a(), (byte) 17)), new vnu(null, wduVar, z));
                    p7m0 p7m0VarA = ortVar.a();
                    tnu tnuVar = new tnu((List) obj2, null, (byte) 0);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    f7k.J(kmqVar);
                    Object objG = tdc.G(this, kmqVar, new kh1((Object) tnuVar, yjeVar, b2), pul.j, new gmq[]{utbVarC, p7m0VarA});
                    if (objG != wne.f39444a) {
                        objG = Unit.f46060a;
                    }
                    if (objG != wne.f39444a) {
                        objG = Unit.f46060a;
                    }
                    if (objG == obj3) {
                        return obj3;
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
                ort ortVar2 = (ort) wduVar.d;
                kmq kmqVar2 = this.k;
                Object obj4 = this.l;
                Object obj5 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    utb utbVarC2 = aoq.c(i120.W(new a1t(ortVar2.a(), (byte) 17)), new vnu(null, wduVar, z));
                    p7m0 p7m0VarA2 = ortVar2.a();
                    tnu tnuVar2 = new tnu((List) obj4, null, (byte) 1);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    f7k.J(kmqVar2);
                    Object objG2 = tdc.G(this, kmqVar2, new kh1((Object) tnuVar2, yjeVar, b2), pul.j, new gmq[]{utbVarC2, p7m0VarA2});
                    if (objG2 != wne.f39444a) {
                        objG2 = Unit.f46060a;
                    }
                    if (objG2 != wne.f39444a) {
                        objG2 = Unit.f46060a;
                    }
                    if (objG2 == obj5) {
                        return obj5;
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
