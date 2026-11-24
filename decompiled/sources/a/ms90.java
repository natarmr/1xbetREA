package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ms90 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public final /* synthetic */ float j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms90(okt0 okt0Var, j73 j73Var, vne vneVar, pz40 pz40Var, xcz xczVar, float f, a8x a8xVar, l7m0 l7m0Var, pz40 pz40Var2, pz40 pz40Var3, yje yjeVar) {
        super(2, yjeVar);
        this.k = okt0Var;
        this.l = j73Var;
        this.m = vneVar;
        this.n = pz40Var;
        this.q = xczVar;
        this.j = f;
        this.r = a8xVar;
        this.s = l7m0Var;
        this.o = pz40Var2;
        this.p = pz40Var3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.s;
        Object obj3 = this.r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        Object obj6 = this.o;
        Object obj7 = this.n;
        Object obj8 = this.m;
        Object obj9 = this.l;
        switch (b) {
            case 0:
                return new ms90((okt0) this.k, (j73) obj9, (vne) obj8, (pz40) obj7, (xcz) obj4, this.j, (a8x) obj3, (l7m0) obj2, (pz40) obj6, (pz40) obj5, yjeVar);
            default:
                ms90 ms90Var = new ms90((k43) obj9, (zsf) obj8, (t33) obj7, (t33) obj6, (t33) obj5, (t33) obj4, this.j, (t33) obj3, (q5m0) obj2, yjeVar);
                ms90Var.k = obj;
                return ms90Var;
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
        return ((ms90) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Object obj2 = this.p;
        Object obj3 = this.q;
        Object obj4 = this.o;
        Object obj5 = this.n;
        Object obj6 = this.l;
        Object obj7 = this.m;
        Object obj8 = this.s;
        Object obj9 = this.r;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                okt0 okt0Var = (okt0) this.k;
                if (okt0Var != null) {
                    okt0Var.f25422a = new ks90((j73) obj6, (vne) obj7, (pz40) obj5, (xcz) obj3, this.j, (a8x) obj9, (l7m0) obj8, (pz40) obj4);
                }
                if (okt0Var != null) {
                    okt0Var.b = new ls90((pz40) obj2, (j73) obj6, (xcz) obj3, this.j, (vne) obj7, (pz40) obj5, (a8x) obj9, (l7m0) obj8, (pz40) obj4);
                }
                break;
            default:
                vne vneVar = (vne) this.k;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                zsf zsfVar = (zsf) obj7;
                qjj.W(vneVar, null, null, new zol0(obj9, obj8, (Object) zsfVar, (yje) null, (byte) 11), 3);
                qjj.W(vneVar, null, null, new b6m0((t33) obj5, zsfVar, (t33) obj4, (t33) obj2, ((k43) obj6).g(), (t33) obj3, this.j, null), 3);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms90(k43 k43Var, zsf zsfVar, t33 t33Var, t33 t33Var2, t33 t33Var3, t33 t33Var4, float f, t33 t33Var5, q5m0 q5m0Var, yje yjeVar) {
        super(2, yjeVar);
        this.l = k43Var;
        this.m = zsfVar;
        this.n = t33Var;
        this.o = t33Var2;
        this.p = t33Var3;
        this.q = t33Var4;
        this.j = f;
        this.r = t33Var5;
        this.s = q5m0Var;
    }
}
