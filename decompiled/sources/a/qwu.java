package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class qwu extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ yhi m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qwu(yje yjeVar, yhi yhiVar, boolean z, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = yhiVar;
        this.n = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        boolean z = this.n;
        yhi yhiVar = this.m;
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                qwu qwuVar = new qwu(yjeVar, yhiVar, z, (byte) 0);
                qwuVar.k = kmqVar;
                qwuVar.l = obj2;
                return qwuVar.invokeSuspend(Unit.f46060a);
            default:
                qwu qwuVar2 = new qwu(yjeVar, yhiVar, z, (byte) 1);
                qwuVar2.k = kmqVar;
                qwuVar2.l = obj2;
                return qwuVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        boolean z = this.n;
        yhi yhiVar = this.m;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    kmq kmqVar = this.k;
                    acu acuVarK = ((v7i) yhiVar.s).k((List) this.l, z, ((pru) yhiVar.v).a().O1);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar, acuVarK, this) == wneVar) {
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
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    kmq kmqVar2 = this.k;
                    acu acuVarK2 = ((v7i) yhiVar.s).k((List) this.l, z, ((pru) yhiVar.v).a().O1);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar2, acuVarK2, this) == wneVar2) {
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
