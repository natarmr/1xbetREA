package a;

import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class le1 extends m06 {
    public final knf0 b;
    public final x2c0 c;
    public final n0o0 d;

    public le1(knf0 knf0Var, x2c0 x2c0Var, gii0 gii0Var) {
        knf0Var.getClass();
        x2c0Var.getClass();
        gii0Var.getClass();
        this.b = knf0Var;
        this.c = x2c0Var;
        this.d = maz.b(new zm(gii0Var, (byte) 4));
    }

    @Override // a.m06
    public final Object a(om80 om80Var) {
        int i;
        Boolean bool;
        om80Var.getClass();
        Integer num = om80Var.b;
        short s = om80Var.c.f7986a;
        Boolean bool2 = null;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        mm80 mm80VarA = om80Var.a(iIntValue);
        lic0 lic0Var = mm80VarA != null ? (lic0) mm80VarA.b : null;
        mm80 mm80VarA2 = om80Var.a(iIntValue);
        lic0 lic0Var2 = mm80VarA2 != null ? (lic0) mm80VarA2.c : null;
        int i2 = 0;
        if (lic0Var != null) {
            i = lic0Var.f20097a;
        } else {
            i = lic0Var2 != null ? lic0Var2.f20097a : 0;
        }
        if (lic0Var != null) {
            i2 = lic0Var.b + s;
        } else if (lic0Var2 != null) {
            i2 = lic0Var2.b - s;
        }
        if (lic0Var != null && (bool = lic0Var.c) != null) {
            bool2 = bool;
        } else if (lic0Var2 != null) {
            bool2 = lic0Var2.c;
        }
        return new lic0(i, i2, bool2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // a.m06
    public final Serializable f(km80 km80Var, yje yjeVar) throws cii0 {
        ke1 ke1Var;
        km80 km80Var2;
        Boolean bool;
        int i;
        int i2;
        if (yjeVar instanceof ke1) {
            ke1Var = (ke1) yjeVar;
            int i3 = ke1Var.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ke1Var.o = i3 - Integer.MIN_VALUE;
            } else {
                ke1Var = new ke1(this, (zje) yjeVar);
            }
        } else {
            ke1Var = new ke1(this, (zje) yjeVar);
        }
        ke1 ke1Var2 = ke1Var;
        Object objF = ke1Var2.m;
        wne wneVar = wne.f39444a;
        int i4 = ke1Var2.o;
        if (i4 == 0) {
            z1x.P(objF);
            lic0 lic0Var = (lic0) km80Var.a();
            int i5 = lic0Var != null ? lic0Var.f20097a : 0;
            lic0 lic0Var2 = (lic0) km80Var.a();
            int i6 = lic0Var2 != null ? lic0Var2.b : 0;
            lic0 lic0Var3 = (lic0) km80Var.a();
            Boolean bool2 = lic0Var3 != null ? lic0Var3.c : null;
            wd1 wd1Var = (wd1) this.d.getValue();
            knf0 knf0Var = this.b;
            knf0Var.getClass();
            int iB = knf0Var.b();
            m2c0 m2c0VarA = this.c.a();
            Integer intOrNull = m2c0VarA != null ? StringsKt.toIntOrNull(m2c0VarA.c) : null;
            String strC = knf0Var.c();
            Boolean bool3 = Boolean.TRUE;
            if (!Intrinsics.d(bool2, bool3)) {
                bool3 = null;
            }
            Integer num = new Integer(1357);
            Integer num2 = new Integer(16);
            Integer num3 = new Integer(i6);
            km80Var2 = km80Var;
            ke1Var2.i = km80Var2;
            ke1Var2.j = bool2;
            ke1Var2.k = i5;
            ke1Var2.l = i6;
            ke1Var2.o = 1;
            Integer num4 = intOrNull;
            Boolean bool4 = bool2;
            int i7 = i5;
            objF = wd1Var.f(22, i7, iB, num4, 1, strC, bool3, num, num2, num3, null, new fk9(false), ke1Var2);
            if (objF == wneVar) {
                return wneVar;
            }
            bool = bool4;
            i = i7;
            i2 = i6;
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = ke1Var2.l;
            i = ke1Var2.k;
            bool = ke1Var2.j;
            km80 km80Var3 = ke1Var2.i;
            z1x.P(objF);
            km80Var2 = km80Var3;
        }
        ux0 ux0Var = (ux0) objF;
        ux0Var.getClass();
        int i8 = ux0Var.b;
        String str = ux0Var.c;
        if (i8 != 0) {
            if (str == null) {
                str = "";
            }
            throw new cii0(i8, str);
        }
        hx0 hx0Var = ux0Var.f36417a;
        List list = hx0Var != null ? hx0Var.f13789a : null;
        lic0 lic0Var4 = (list == null || list.isEmpty() || list.size() < 16) ? null : new lic0(i, i2 + 16, bool);
        if (list == null) {
            list = iun.f15405a;
        }
        return new Pair(lic0Var4, new mm80(list, i2 == 0 ? null : (lic0) km80Var2.a(), lic0Var4));
    }
}
