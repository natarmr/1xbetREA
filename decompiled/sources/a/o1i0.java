package a;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class o1i0 extends bnn0 implements Function1 {
    public Set i;
    public dpi0 j;
    public byte k;
    public final /* synthetic */ p1i0 l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1i0(p1i0 p1i0Var, int i, yje yjeVar) {
        super(1, yjeVar);
        this.l = p1i0Var;
        this.m = i;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new o1i0(this.l, this.m, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((o1i0) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Set set;
        dpi0 dpi0Var;
        LinkedHashSet linkedHashSetE;
        Set set2;
        p7m0 p7m0Var;
        Object value;
        wne wneVar = wne.f39444a;
        byte b = this.k;
        int i = this.m;
        p1i0 p1i0Var = this.l;
        if (b != 0) {
            if (b == 1) {
                dpi0Var = this.j;
                Set set3 = this.i;
                z1x.P(obj);
                set = set3;
                objC = obj;
            } else {
                if (b != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                set2 = this.i;
                z1x.P(obj);
            }
            int i2 = p1i0.A;
            p7m0Var = p1i0Var.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                q7x.F(p1i0Var.f, set2, "SELECTED_IDS_KEY");
            } while (!p7m0Var.m(value, tec.a((tec) value, false, false, null, null, set2, 95)));
            return Unit.f46060a;
        }
        z1x.P(obj);
        Set set4 = ((tec) p1i0Var.D()).f;
        dpi0 dpi0Var2 = p1i0Var.s;
        if (set4.contains(new Integer(i))) {
            linkedHashSetE = eui0.e(set4, new Integer(i));
            set = set4;
            dpi0Var = dpi0Var2;
            this.i = set;
            this.j = null;
            this.k = (byte) 2;
            if (dpi0Var.i(linkedHashSetE, this) != wneVar) {
                set2 = set;
                int i3 = p1i0.A;
                p7m0Var = p1i0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    q7x.F(p1i0Var.f, set2, "SELECTED_IDS_KEY");
                } while (!p7m0Var.m(value, tec.a((tec) value, false, false, null, null, set2, 95)));
                return Unit.f46060a;
            }
        } else {
            x0u x0uVar = p1i0Var.t;
            this.i = set4;
            this.j = dpi0Var2;
            this.k = (byte) 1;
            objC = x0uVar.c(this);
            if (objC != wneVar) {
                set = set4;
                dpi0Var = dpi0Var2;
            }
        }
        return wneVar;
        linkedHashSetE = ((Number) objC).intValue() == i ? eui0.g(cui0.b(new Integer(i)), set) : eui0.h(set, new Integer(i));
        this.i = set;
        this.j = null;
        this.k = (byte) 2;
        if (dpi0Var.i(linkedHashSetE, this) != wneVar) {
            set2 = set;
            int i4 = p1i0.A;
            p7m0Var = p1i0Var.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                q7x.F(p1i0Var.f, set2, "SELECTED_IDS_KEY");
            } while (!p7m0Var.m(value, tec.a((tec) value, false, false, null, null, set2, 95)));
            return Unit.f46060a;
        }
        return wneVar;
    }
}
