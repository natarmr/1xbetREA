package a;

/* JADX INFO: loaded from: classes.dex */
public final class i7z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e7z f14317a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public i810 q;
    public a7z d = a7z.e;
    public final sj30 p = new sj30(this);

    public i7z(e7z e7zVar) {
        this.f14317a = e7zVar;
    }

    public final s460 a() {
        return (s460) this.f14317a.h1.e;
    }

    public final void b() {
        a7z a7zVar = this.f14317a.i1.d;
        if (a7zVar == a7z.c || a7zVar == a7z.d) {
            if (this.p.B) {
                g(true);
            } else {
                f(true);
            }
        }
        if (a7zVar == a7z.d) {
            i810 i810Var = this.q;
            if (i810Var == null || !i810Var.v) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        i810 i810Var = this.q;
        if (i810Var != null) {
            a7z a7zVar = a7z.b;
            i7z i7zVar = i810Var.f;
            i7zVar.d = a7zVar;
            e7z e7zVar = i7zVar.f14317a;
            i7zVar.e = false;
            i810Var.z = j;
            eg80 snapshotObserver = h7z.a(e7zVar).getSnapshotObserver();
            g810 g810Var = i810Var.A;
            snapshotObserver.f7752a.d(e7zVar, snapshotObserver.b, g810Var);
            i7zVar.f = true;
            i7zVar.g = true;
            boolean zE = p7x.E(e7zVar);
            sj30 sj30Var = i7zVar.p;
            if (zE) {
                sj30Var.w = true;
                sj30Var.x = true;
            } else {
                sj30Var.v = true;
            }
            i7zVar.d = a7z.e;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            e7z e7zVarV = this.f14317a.v();
            i7z i7zVar = e7zVarV != null ? e7zVarV.i1 : null;
            if (i7zVar != null) {
                int i3 = i7zVar.l;
                if (i == 0) {
                    i7zVar.d(i3 - 1);
                } else {
                    i7zVar.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            e7z e7zVarV = this.f14317a.v();
            i7z i7zVar = e7zVarV != null ? e7zVarV.i1 : null;
            if (i7zVar != null) {
                int i3 = i7zVar.o;
                if (i == 0) {
                    i7zVar.e(i3 - 1);
                } else {
                    i7zVar.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        sj30 sj30Var = this.p;
        i7z i7zVar = sj30Var.f;
        Object obj = sj30Var.s;
        e7z e7zVar = this.f14317a;
        if ((obj != null || i7zVar.a().n() != null) && sj30Var.r) {
            sj30Var.r = false;
            sj30Var.s = i7zVar.a().n();
            e7z e7zVarV = e7zVar.v();
            if (e7zVarV != null) {
                e7z.W(e7zVarV, false, 7);
            }
        }
        i810 i810Var = this.q;
        if (i810Var != null) {
            i7z i7zVar2 = i810Var.f;
            if (i810Var.y == null) {
                e810 e810VarE1 = i7zVar2.a().e1();
                e810VarE1.getClass();
                if (e810VarE1.u.n() == null) {
                    return;
                }
            }
            if (i810Var.x) {
                i810Var.x = false;
                e810 e810VarE2 = i7zVar2.a().e1();
                e810VarE2.getClass();
                i810Var.y = e810VarE2.u.n();
                if (p7x.E(e7zVar)) {
                    e7z e7zVarV2 = e7zVar.v();
                    if (e7zVarV2 != null) {
                        e7z.W(e7zVarV2, false, 7);
                        return;
                    }
                    return;
                }
                e7z e7zVarV3 = e7zVar.v();
                if (e7zVarV3 != null) {
                    e7z.U(e7zVarV3, false, 7);
                }
            }
        }
    }
}
