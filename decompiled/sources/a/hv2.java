package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class hv2 extends hel {
    public rv2 k1;
    public Boolean l1;
    public qkq m1;
    public qkq n1;
    public w6k o1;

    @Override // a.lm40
    public final void R0() {
        w1(this.m1);
    }

    @Override // a.yzj
    public final void b() {
        n0();
        if (this.n) {
            w6k w6kVar = vcc.Z(this).z;
            w6k w6kVar2 = this.o1;
            if (w6kVar2 == null || !w6kVar2.equals(w6kVar)) {
                this.o1 = w6kVar;
                w1(this.m1);
            }
        }
    }

    @Override // a.hel
    public final Object d1(ic1 ic1Var, xb2 xb2Var) {
        Object objB = rv2.b(this.k1, new zo1(ic1Var, this, (yje) null), xb2Var);
        return objB == wne.f39444a ? objB : Unit.f46060a;
    }

    @Override // a.hel
    public final boolean r1() {
        return ((hgk0) this.k1.h).getValue() != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u1(float f, zje zjeVar) {
        ev2 ev2Var;
        jie0 jie0Var;
        if (zjeVar instanceof ev2) {
            ev2Var = (ev2) zjeVar;
            int i = ev2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ev2Var.l = i - Integer.MIN_VALUE;
            } else {
                ev2Var = new ev2(this, zjeVar);
            }
        } else {
            ev2Var = new ev2(this, zjeVar);
        }
        Object obj = ev2Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ev2Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            this.k1.getClass();
            jie0 jie0Var2 = new jie0();
            jie0Var2.f16571a = f;
            rv2 rv2Var = this.k1;
            gv2 gv2Var = new gv2((byte) 0, f, null, this, jie0Var2);
            ev2Var.i = jie0Var2;
            ev2Var.l = 2;
            if (rv2.b(rv2Var, gv2Var, ev2Var) == wneVar) {
                return wneVar;
            }
            jie0Var = jie0Var2;
        } else {
            if (i2 == 1) {
                z1x.P(obj);
                return obj;
            }
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jie0Var = ev2Var.i;
            z1x.P(obj);
        }
        return new Float(jie0Var.f16571a);
    }

    public final boolean v1() {
        Boolean bool = this.l1;
        if (bool == null) {
            return vcc.Z(this).A == k6z.b && this.q == ma80.b;
        }
        bool.getClass();
        return bool.booleanValue();
    }

    public final void w1(qkq qkqVar) {
        if (qkqVar == null) {
            uts0 uts0Var = nu2.f24127a;
            xd2 xd2Var = nu2.b;
            w6k w6kVar = vcc.Z(this).z;
            this.o1 = w6kVar;
            qkqVar = new afk0(new pu2(this.k1, xd2Var, new nc((Object) w6kVar, (byte) 29)), dv2.b, uts0Var);
        }
        this.n1 = qkqVar;
    }
}
