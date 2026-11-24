package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class u8z implements qah0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35256a;
    public final /* synthetic */ qah0 b;
    public final /* synthetic */ bch0 c;

    public /* synthetic */ u8z(qah0 qah0Var, bch0 bch0Var, byte b) {
        this.f35256a = b;
        this.c = bch0Var;
        this.b = qah0Var;
    }

    @Override // a.qah0
    public final float a(float f) {
        switch (this.f35256a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b.a(f);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public final int b(int i) {
        Object obj;
        ncz nczVar;
        byte b = this.f35256a;
        Integer numValueOf = null;
        Object obj2 = null;
        numValueOf = null;
        bch0 bch0Var = this.c;
        switch (b) {
            case 0:
                d9z d9zVar = (d9z) bch0Var;
                q8z q8zVarJ = d9zVar.j();
                if (q8zVarJ.n.isEmpty()) {
                    return 0;
                }
                int iH = d9zVar.h();
                if (i > e() || iH > i) {
                    int i2 = ((q8z) ((hgk0) d9zVar.e).getValue()).j;
                    return (((((i2 - 1) * (i < d9zVar.h() ? -1 : 1)) + (i - d9zVar.h())) / i2) * l8x.D0(q8zVarJ)) - d9zVar.i();
                }
                List list = q8zVarJ.n;
                int size = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        obj = list.get(i3);
                        if (((r8z) obj).f30051a != i) {
                            i3++;
                        }
                    } else {
                        obj = null;
                    }
                }
                r8z r8zVar = (r8z) obj;
                if (q8zVarJ.r == ma80.f21447a) {
                    if (r8zVar != null) {
                        numValueOf = Integer.valueOf((int) (r8zVar.x & 4294967295L));
                    }
                } else if (r8zVar != null) {
                    numValueOf = Integer.valueOf((int) (r8zVar.x >> 32));
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            case 1:
                xcz xczVar = (xcz) bch0Var;
                mcz mczVarJ = xczVar.j();
                if (mczVarJ.l.isEmpty()) {
                    return 0;
                }
                int iH2 = xczVar.h();
                if (i > e() || iH2 > i) {
                    return ((i - xczVar.h()) * idx.Y(mczVarJ)) - xczVar.i();
                }
                List list2 = mczVarJ.l;
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj3 = list2.get(i4);
                    if (((ncz) obj3).f23317a == i) {
                        obj2 = obj3;
                        nczVar = (ncz) obj2;
                        if (nczVar != null) {
                            return nczVar.p;
                        }
                        return 0;
                    }
                }
                nczVar = (ncz) obj2;
                if (nczVar != null) {
                    return nczVar.p;
                }
                return 0;
            default:
                xk80 xk80Var = (xk80) bch0Var;
                return (int) (l1e0.f(k7x.B(xk80Var) + ((long) si30.b(((xk80Var.p() * (i - xk80Var.k())) - (xk80Var.l() * xk80Var.p())) + 0.0f)), xk80Var.h, xk80Var.g) - k7x.B(xk80Var));
        }
    }

    public final int c() {
        byte b = this.f35256a;
        bch0 bch0Var = this.c;
        switch (b) {
            case 0:
                return ((d9z) bch0Var).h();
            case 1:
                return ((xcz) bch0Var).h();
            default:
                return ((xk80) bch0Var).e;
        }
    }

    public final int d() {
        byte b = this.f35256a;
        bch0 bch0Var = this.c;
        switch (b) {
            case 0:
                return ((d9z) bch0Var).i();
            case 1:
                return ((xcz) bch0Var).i();
            default:
                return ((xk80) bch0Var).f;
        }
    }

    public final int e() {
        byte b = this.f35256a;
        bch0 bch0Var = this.c;
        switch (b) {
            case 0:
                r8z r8zVar = (r8z) CollectionsKt.f0(((d9z) bch0Var).j().n);
                if (r8zVar != null) {
                    return r8zVar.f30051a;
                }
                return 0;
            case 1:
                ncz nczVar = (ncz) CollectionsKt.f0(((xcz) bch0Var).j().l);
                if (nczVar != null) {
                    return nczVar.f23317a;
                }
                return 0;
            default:
                return ((wj30) CollectionsKt.d0(((xk80) bch0Var).m().f27124a)).f39244a;
        }
    }

    public final void f(int i, int i2) {
        byte b = this.f35256a;
        bch0 bch0Var = this.c;
        switch (b) {
            case 0:
                ((d9z) bch0Var).m(i, i2, true);
                break;
            case 1:
                ((xcz) bch0Var).m(i, i2, true);
                break;
            default:
                xk80 xk80Var = (xk80) bch0Var;
                float fP = xk80Var.p();
                xk80Var.w(fP != 0.0f ? i2 / fP : 0.0f, i, true);
                break;
        }
    }
}
