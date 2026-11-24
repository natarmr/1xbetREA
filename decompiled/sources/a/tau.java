package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class tau extends bnn0 implements xdr {
    public /* synthetic */ boolean i;
    public /* synthetic */ String j;
    public final /* synthetic */ uau k;
    public final /* synthetic */ sff0 l;
    public final /* synthetic */ ArrayList m;
    public final /* synthetic */ a8z n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tau(uau uauVar, sff0 sff0Var, ArrayList arrayList, a8z a8zVar, yje yjeVar) {
        super(3, yjeVar);
        this.k = uauVar;
        this.l = sff0Var;
        this.m = arrayList;
        this.n = a8zVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ArrayList arrayList = this.m;
        a8z a8zVar = this.n;
        tau tauVar = new tau(this.k, this.l, arrayList, a8zVar, (yje) obj3);
        tauVar.i = zBooleanValue;
        tauVar.j = (String) obj2;
        return tauVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean z = this.i;
        String str = this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        ArrayList arrayList = this.m;
        if (z) {
            r9u r9uVar = this.k.n;
            ygp ygpVar = ygp.f;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            if (j1q0Var.f15748a.d(ygpVar) && !((List) this.n.getValue()).contains(this.l.g.f)) {
                htz htzVar = iz30.f15618a;
                return CollectionsKt.q0(kotlin.collections.a.c(new jx10(str)), arrayList);
            }
        }
        return arrayList;
    }
}
