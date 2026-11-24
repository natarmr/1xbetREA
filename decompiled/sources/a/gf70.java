package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class gf70 extends bnn0 implements zdr {
    public /* synthetic */ boolean i;
    public /* synthetic */ boolean j;
    public /* synthetic */ boolean k;
    public /* synthetic */ boolean l;

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
        gf70 gf70Var = new gf70(5, (yje) obj5);
        gf70Var.i = zBooleanValue;
        gf70Var.j = zBooleanValue2;
        gf70Var.k = zBooleanValue3;
        gf70Var.l = zBooleanValue4;
        return gf70Var.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean z = this.i;
        boolean z2 = this.j;
        boolean z3 = this.k;
        boolean z4 = this.l;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        return Boolean.valueOf((!z || z3) && z2 && z4);
    }
}
