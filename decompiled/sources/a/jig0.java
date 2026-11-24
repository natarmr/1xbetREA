package a;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jig0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nkg0 f16573a;
    public final pz40 b;
    public final l7m0 c;
    public mkg0 d;

    public jig0(mkg0 mkg0Var, nkg0 nkg0Var) {
        nkg0Var.getClass();
        this.f16573a = nkg0Var;
        pz40 pz40VarE = androidx.compose.runtime.e.e(b(mkg0Var, null, true));
        this.b = pz40VarE;
        this.c = pz40VarE;
        this.d = mkg0Var;
    }

    public final mjg0 a(njg0 njg0Var, hjg0 hjg0Var, boolean z) {
        return new mjg0(hjg0Var, njg0Var.f23635a, njg0Var.b, njg0Var.c, z, (gig0) this.f16573a.b.get(hjg0Var));
    }

    public final mig0 b(mkg0 mkg0Var, hjg0 hjg0Var, boolean z) {
        if (hjg0Var == null) {
            hjg0Var = mkg0Var.b.equals(xig0.f40944a) ? fjg0.f9639a : ejg0.f7909a;
        }
        njg0 njg0Var = mkg0Var.f;
        zig0 zig0Var = mkg0Var.b;
        mjg0 mjg0VarA = a(njg0Var, hjg0Var, z);
        mjg0 mjg0VarA2 = a(mkg0Var.e, hjg0Var, z);
        mjg0 mjg0VarA3 = a(mkg0Var.d, hjg0Var, z);
        pjg0 pjg0Var = mkg0Var.i;
        ojg0 ojg0Var = new ojg0(pjg0Var.b, pjg0Var.c);
        pjg0 pjg0Var2 = mkg0Var.h;
        ojg0 ojg0Var2 = new ojg0(pjg0Var2.b, pjg0Var2.c);
        pjg0 pjg0Var3 = mkg0Var.g;
        return new mig0(mjg0VarA, mjg0VarA2, mjg0VarA3, ojg0Var, ojg0Var2, new ojg0(pjg0Var3.b, pjg0Var3.c), zig0Var.equals(wig0.f39213a), zig0Var.equals(vig0.f37477a), mkg0Var.j, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(mkg0 mkg0Var, zje zjeVar) {
        hig0 hig0Var;
        if (zjeVar instanceof hig0) {
            hig0Var = (hig0) zjeVar;
            int i = hig0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                hig0Var.l = i - Integer.MIN_VALUE;
            } else {
                hig0Var = new hig0(this, zjeVar);
            }
        } else {
            hig0Var = new hig0(this, zjeVar);
        }
        Object obj = hig0Var.j;
        Object obj2 = wne.f39444a;
        int i2 = hig0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            if (Intrinsics.d(this.d, mkg0Var)) {
                return Unit.f46060a;
            }
            zig0 zig0Var = mkg0Var.b;
            if (zig0Var.equals(xig0.f40944a)) {
                hig0Var.i = mkg0Var;
                hig0Var.l = 1;
                if (d(mkg0Var, hig0Var) == obj2) {
                    return obj2;
                }
            } else {
                boolean zEquals = zig0Var.equals(yig0.f42689a);
                pz40 pz40Var = this.b;
                if (zEquals) {
                    ((hgk0) pz40Var).setValue(b(mkg0Var, null, false));
                } else {
                    ((hgk0) pz40Var).setValue(b(mkg0Var, null, false));
                }
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mkg0Var = hig0Var.i;
            z1x.P(obj);
        }
        this.d = mkg0Var;
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(mkg0 mkg0Var, zje zjeVar) {
        iig0 iig0Var;
        if (zjeVar instanceof iig0) {
            iig0Var = (iig0) zjeVar;
            int i = iig0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                iig0Var.l = i - Integer.MIN_VALUE;
            } else {
                iig0Var = new iig0(this, zjeVar);
            }
        } else {
            iig0Var = new iig0(this, zjeVar);
        }
        Object obj = iig0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = iig0Var.l;
        pz40 pz40Var = this.b;
        if (i2 == 0) {
            z1x.P(obj);
            gjg0 gjg0Var = gjg0.f11394a;
            ((hgk0) pz40Var).setValue(b(mkg0Var, gjg0Var, false));
            gig0 gig0Var = (gig0) this.f16573a.b.get(gjg0Var);
            long j = gig0Var != null ? gig0Var.b : 0L;
            iig0Var.i = mkg0Var;
            iig0Var.l = 1;
            if (qcc.O(j, iig0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mkg0Var = iig0Var.i;
            z1x.P(obj);
        }
        ((hgk0) pz40Var).setValue(b(mkg0Var, fjg0.f9639a, false));
        return Unit.f46060a;
    }
}
