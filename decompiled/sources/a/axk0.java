package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class axk0 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ yhi m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ axk0(yje yjeVar, yhi yhiVar, boolean z, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = yhiVar;
        this.n = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (this.i) {
            case 0:
                axk0 axk0Var = new axk0(yjeVar, this.m, this.n, (byte) 0);
                axk0Var.k = kmqVar;
                axk0Var.l = obj2;
                return axk0Var.invokeSuspend(Unit.f46060a);
            default:
                axk0 axk0Var2 = new axk0(yjeVar, this.m, this.n, (byte) 1);
                axk0Var2.k = kmqVar;
                axk0Var2.l = obj2;
                return axk0Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        boolean z = this.n;
        yhi yhiVar = this.m;
        switch (b) {
            case 0:
                kmq kmqVar = this.k;
                Object obj2 = this.l;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    acu acuVarK = ((v7i) yhiVar.r).k((List) obj2, z, ((pru) yhiVar.s).a().O1);
                    wwk0 wwk0Var = new wwk0(yhiVar, null, (byte) 2);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    f7k.J(kmqVar);
                    Object objC = acuVarK.c(new vnq(kmqVar, wwk0Var, (byte) 2), this);
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
                    acu acuVarK2 = ((v7i) yhiVar.q).k((List) obj3, z, ((pru) yhiVar.s).a().O1);
                    wwk0 wwk0Var2 = new wwk0(yhiVar, null, (byte) 4);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    f7k.J(kmqVar2);
                    Object objC2 = acuVarK2.c(new vnq(kmqVar2, wwk0Var2, (byte) 2), this);
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
