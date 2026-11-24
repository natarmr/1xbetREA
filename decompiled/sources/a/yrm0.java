package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class yrm0 extends j47 implements scy {
    public boolean A;
    public String B;
    public String C;
    public final s88 u;
    public final vby v;
    public final jrv0 w;
    public final scy[] x;
    public final qaj y;
    public final dcy z;

    public yrm0(s88 s88Var, vby vbyVar, jrv0 jrv0Var, scy[] scyVarArr) {
        s88Var.getClass();
        this.u = s88Var;
        this.v = vbyVar;
        this.w = jrv0Var;
        this.x = scyVarArr;
        this.y = vbyVar.b;
        this.z = vbyVar.f37162a;
        int iOrdinal = jrv0Var.ordinal();
        if (scyVarArr != null) {
            scy scyVar = scyVarArr[iOrdinal];
            if (scyVar == null && scyVar == this) {
                return;
            }
            scyVarArr[iOrdinal] = this;
        }
    }

    @Override // a.j47, a.bwn
    public final bwn A(ugi0 ugi0Var) {
        ugi0Var.getClass();
        boolean zA = zrm0.a(ugi0Var);
        jrv0 jrv0Var = this.w;
        vby vbyVar = this.v;
        s88 wkdVar = this.u;
        if (zA) {
            if (!(wkdVar instanceof xkd)) {
                wkdVar = new xkd((y78) wkdVar.c, this.A);
            }
            return new yrm0(wkdVar, vbyVar, jrv0Var, null);
        }
        if (ugi0Var.isInline() && ugi0Var.equals(ncy.f23316a)) {
            if (!(wkdVar instanceof wkd)) {
                wkdVar = new wkd((y78) wkdVar.c, this.A);
            }
            return new yrm0(wkdVar, vbyVar, jrv0Var, null);
        }
        if (this.B != null) {
            this.C = ugi0Var.h();
        }
        return this;
    }

    @Override // a.j47, a.bwn
    public final void B(int i) {
        if (this.A) {
            E(String.valueOf(i));
        } else {
            this.u.p(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    @Override // a.bwn
    public final void C(jiy jiyVar, Object obj) {
        String strA;
        jiy jiyVarU;
        jiyVar.getClass();
        vby vbyVar = this.v;
        boolean z = jiyVar instanceof l4;
        olc olcVar = vbyVar.f37162a.h;
        if (!z) {
            int iOrdinal = olcVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    c3x c3xVarL = jiyVar.getDescriptor().l();
                    strA = (Intrinsics.d(c3xVarL, aum0.b) || Intrinsics.d(c3xVarL, aum0.e)) ? u7x.A(vbyVar, jiyVar.getDescriptor()) : null;
                } else if (iOrdinal != 2) {
                    t9f.b();
                    return;
                }
            }
        } else if (olcVar != olc.f25445a) {
        }
        if (z) {
            l4 l4Var = (l4) jiyVar;
            if (obj == null) {
                e9d0.u(l4Var.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
                return;
            }
            jiyVarU = a8k0.u(l4Var, this, obj);
        } else {
            jiyVarU = jiyVar;
        }
        if (strA != null) {
            u7x.y(vbyVar, jiyVar, jiyVarU, strA);
            u7x.z(jiyVarU.getDescriptor().l());
            String strH = jiyVarU.getDescriptor().h();
            this.B = strA;
            this.C = strH;
        }
        jiyVarU.serialize(this, obj);
    }

    @Override // a.j47, a.bwn
    public final void E(String str) {
        str.getClass();
        this.u.t(str);
    }

    @Override // a.j47, a.bwn
    public final cld a(ugi0 ugi0Var) {
        scy scyVar;
        ugi0Var.getClass();
        vby vbyVar = this.v;
        jrv0 jrv0VarT = yqm0.t(vbyVar, ugi0Var);
        char c = jrv0VarT.f17023a;
        s88 s88Var = this.u;
        s88Var.o(c);
        s88Var.b = true;
        String str = this.B;
        if (str != null) {
            String strH = this.C;
            if (strH == null) {
                strH = ugi0Var.h();
            }
            s88Var.m();
            s88Var.t(str);
            s88Var.o(':');
            E(strH);
            this.B = null;
            this.C = null;
        }
        if (this.w == jrv0VarT) {
            return this;
        }
        scy[] scyVarArr = this.x;
        return (scyVarArr == null || (scyVar = scyVarArr[jrv0VarT.ordinal()]) == null) ? new yrm0(s88Var, vbyVar, jrv0VarT, scyVarArr) : scyVar;
    }

    @Override // a.bwn
    public final qaj b() {
        return this.y;
    }

    @Override // a.j47, a.cld
    public final void c(ugi0 ugi0Var) {
        ugi0Var.getClass();
        s88 s88Var = this.u;
        s88Var.getClass();
        s88Var.b = false;
        s88Var.o(this.w.b);
    }

    @Override // a.scy
    public final vby d() {
        return this.v;
    }

    @Override // a.scy
    public final void f(edy edyVar) {
        C(qcy.f28507a, edyVar);
    }

    @Override // a.j47, a.bwn
    public final void g(double d) {
        if (this.A) {
            E(String.valueOf(d));
        } else {
            ((y78) this.u.c).x(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw xww.c(Double.valueOf(d), null);
        }
    }

    @Override // a.j47, a.bwn
    public final void h(byte b) {
        if (this.A) {
            E(String.valueOf((int) b));
        } else {
            this.u.n(b);
        }
    }

    @Override // a.j47, a.bwn
    public final void l(long j) {
        if (this.A) {
            E(String.valueOf(j));
        } else {
            this.u.q(j);
        }
    }

    @Override // a.j47, a.cld
    public final void p(ugi0 ugi0Var, int i, jiy jiyVar, Object obj) {
        ugi0Var.getClass();
        jiyVar.getClass();
        if (obj != null || this.z.c) {
            super.p(ugi0Var, i, jiyVar, obj);
        }
    }

    @Override // a.j47, a.bwn
    public final void q() {
        s88 s88Var = this.u;
        s88Var.getClass();
        ((y78) s88Var.c).x("null");
    }

    @Override // a.j47, a.bwn
    public final void r(short s) {
        if (this.A) {
            E(String.valueOf((int) s));
        } else {
            this.u.s(s);
        }
    }

    @Override // a.j47, a.bwn
    public final void s(boolean z) {
        if (this.A) {
            E(String.valueOf(z));
        } else {
            ((y78) this.u.c).x(String.valueOf(z));
        }
    }

    @Override // a.j47, a.bwn
    public final void t(float f) {
        if (this.A) {
            E(String.valueOf(f));
        } else {
            ((y78) this.u.c).x(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw xww.c(Float.valueOf(f), null);
        }
    }

    @Override // a.cld
    public final boolean u(ugi0 ugi0Var) {
        ugi0Var.getClass();
        return false;
    }

    @Override // a.j47
    public final void v0(ugi0 ugi0Var, int i) {
        ugi0Var.getClass();
        int iOrdinal = this.w.ordinal();
        s88 s88Var = this.u;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!s88Var.b) {
                s88Var.o(',');
            }
            s88Var.m();
            return;
        }
        if (iOrdinal == 2) {
            if (s88Var.b) {
                this.A = true;
                s88Var.m();
                return;
            }
            if (i % 2 == 0) {
                s88Var.o(',');
                s88Var.m();
            } else {
                s88Var.o(':');
                s88Var.u();
                z = false;
            }
            this.A = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!s88Var.b) {
                s88Var.o(',');
            }
            s88Var.m();
            ady.d(this.v, ugi0Var);
            E(ugi0Var.e(i));
            s88Var.o(':');
            s88Var.u();
            return;
        }
        if (i == 0) {
            this.A = true;
        }
        if (i == 1) {
            s88Var.o(',');
            s88Var.u();
            this.A = false;
        }
    }

    @Override // a.j47, a.bwn
    public final void w(char c) {
        E(String.valueOf(c));
    }

    @Override // a.j47, a.bwn
    public final void y(ugi0 ugi0Var, int i) {
        ugi0Var.getClass();
        E(ugi0Var.e(i));
    }
}
