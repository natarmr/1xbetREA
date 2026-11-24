package a;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class yo implements ry9 {
    public final ry9 b;
    public final /* synthetic */ byte c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yo(ry9 ry9Var, b0l0 b0l0Var) {
        this(ry9Var, (byte) 0);
        this.c = (byte) 1;
        this.d = b0l0Var;
    }

    @Override // a.ry9
    public final void a() {
        this.b.a();
    }

    @Override // a.ry9
    public final void b(tii0 tii0Var) {
        this.b.b(tii0Var);
    }

    @Override // a.ry9
    public ig00 c(srn srnVar) {
        switch (this.c) {
            case 0:
                return ((ry9) this.d).c(srnVar);
            default:
                return this.b.c(srnVar);
        }
    }

    @Override // a.ry9
    public ig00 d(float f) {
        switch (this.c) {
            case 0:
                return ((ry9) this.d).d(f);
            default:
                return this.b.d(f);
        }
    }

    @Override // a.ry9
    public final void e(int i) {
        this.b.e(i);
    }

    @Override // a.ry9
    public final drd f() {
        return this.b.f();
    }

    @Override // a.ry9
    public final void g(drd drdVar) {
        this.b.g(drdVar);
    }

    @Override // a.ry9
    public ig00 h(ArrayList arrayList, int i, int i2) {
        byte b = this.c;
        ry9 ry9Var = this.b;
        switch (b) {
            case 1:
                final byte b2 = 0;
                final byte b3 = 1;
                z1x.t("Only support one capture config.", arrayList.size() == 1);
                final ig00 ig00VarJ = ry9Var.j(i);
                return new gd00(new ArrayList(Collections.singletonList(ro4.k0(ro4.k0(ro4.k0(ig00VarJ instanceof dfr ? (dfr) ig00VarJ : new dfr(ig00VarJ), new zy3() { // from class: a.gnu0
                    @Override // a.zy3
                    public final ig00 apply(Object obj) {
                        byte b4 = b2;
                        ig00 ig00Var = ig00VarJ;
                        switch (b4) {
                            case 0:
                                return ((by9) ig00Var.get()).a();
                            default:
                                return ((by9) ig00Var.get()).b();
                        }
                    }
                }, bnk.a()), new lmn0(this, arrayList, (byte) 6), bnk.a()), new zy3() { // from class: a.gnu0
                    @Override // a.zy3
                    public final ig00 apply(Object obj) {
                        byte b4 = b3;
                        ig00 ig00Var = ig00VarJ;
                        switch (b4) {
                            case 0:
                                return ((by9) ig00Var.get()).a();
                            default:
                                return ((by9) ig00Var.get()).b();
                        }
                    }
                }, bnk.a()))), true, bnk.a());
            default:
                return ry9Var.h(arrayList, i, i2);
        }
    }

    @Override // a.ry9
    public final void i() {
        this.b.i();
    }

    @Override // a.ry9
    public final ig00 j(int i) {
        return this.b.j(i);
    }

    @Override // a.ry9
    public final void k(kzw kzwVar) {
        this.b.k(kzwVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yo(ry9 ry9Var) {
        this(ry9Var, (byte) 0);
        this.c = (byte) 0;
        this.d = ry9Var;
    }

    public yo(ry9 ry9Var, byte b) {
        this.b = ry9Var;
    }
}
