package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class xz0 extends bnn0 implements zdr {
    public /* synthetic */ boolean i;
    public /* synthetic */ sw00 j;
    public /* synthetic */ String k;
    public /* synthetic */ List l;
    public final /* synthetic */ a01 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz0(a01 a01Var, yje yjeVar) {
        super(5, yjeVar);
        this.m = a01Var;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        xz0 xz0Var = new xz0(this.m, (yje) obj5);
        xz0Var.i = zBooleanValue;
        xz0Var.j = (sw00) obj2;
        xz0Var.k = (String) obj3;
        xz0Var.l = (List) obj4;
        return xz0Var.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z = this.i;
        sw00 sw00Var = this.j;
        String str = this.k;
        List list = this.l;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        a01 a01Var = this.m;
        znk znkVar = new znk(str, a01Var, list, (byte) 17);
        int i = a01.M;
        a01Var.H(znkVar);
        if (!z && ((((hz0) a01Var.D()).b instanceof q8h0) || !((hz0) a01Var.D()).c.equals(str))) {
            p7m0 p7m0Var = a01Var.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                a01Var.f.getClass();
            } while (!p7m0Var.m(value, hz0.a((hz0) value, null, new k8h0(false), null, null, false, 0, null, 1021)));
        } else if (z) {
            if (str.length() >= 3) {
                a01.V(a01Var, sw00Var.f32897a);
            } else {
                a01Var.U(sw00Var.f32897a, true, false);
            }
        }
        return Unit.f46060a;
    }
}
