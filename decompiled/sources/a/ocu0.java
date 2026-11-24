package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ocu0 extends hev0 {
    public i7k k;
    public i56 l;

    @Override // a.d7k
    public final void a(d7k d7kVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (hne.E(this.j) == 3) {
            k4e k4eVar = this.b;
            l(k4eVar.K, k4eVar.M, 1);
            return;
        }
        vmk vmkVar = this.e;
        boolean z = vmkVar.c;
        j4e j4eVar = j4e.c;
        if (z && !vmkVar.j && this.d == j4eVar) {
            k4e k4eVar2 = this.b;
            int i2 = k4eVar2.t;
            if (i2 == 2) {
                k4e k4eVar3 = k4eVar2.V;
                if (k4eVar3 != null) {
                    vmk vmkVar2 = k4eVar3.e.e;
                    if (vmkVar2.j) {
                        vmkVar.d((int) ((vmkVar2.g * k4eVar2.A) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                vmk vmkVar3 = k4eVar2.d.e;
                if (vmkVar3.j) {
                    int i3 = k4eVar2.Z;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = vmkVar3.g * k4eVar2.Y;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = vmkVar3.g;
                            f2 = k4eVar2.Y;
                        }
                        vmkVar.d(i);
                    } else {
                        f = vmkVar3.g;
                        f2 = k4eVar2.Y;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    vmkVar.d(i);
                }
            }
        }
        i7k i7kVar = this.h;
        boolean z2 = i7kVar.c;
        ArrayList arrayList = i7kVar.l;
        if (z2) {
            i7k i7kVar2 = this.i;
            boolean z3 = i7kVar2.c;
            ArrayList arrayList2 = i7kVar2.l;
            if (z3) {
                if (i7kVar.j && i7kVar2.j && vmkVar.j) {
                    return;
                }
                if (!vmkVar.j && this.d == j4eVar) {
                    k4e k4eVar4 = this.b;
                    if (k4eVar4.s == 0 && !k4eVar4.A()) {
                        i7k i7kVar3 = (i7k) arrayList.get(0);
                        i7k i7kVar4 = (i7k) arrayList2.get(0);
                        int i4 = i7kVar3.g + i7kVar.f;
                        int i5 = i7kVar4.g + i7kVar2.f;
                        i7kVar.d(i4);
                        i7kVar2.d(i5);
                        vmkVar.d(i5 - i4);
                        return;
                    }
                }
                if (!vmkVar.j && this.d == j4eVar && this.f12943a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    i7k i7kVar5 = (i7k) arrayList.get(0);
                    int i6 = (((i7k) arrayList2.get(0)).g + i7kVar2.f) - (i7kVar5.g + i7kVar.f);
                    int i7 = vmkVar.m;
                    if (i6 < i7) {
                        vmkVar.d(i6);
                    } else {
                        vmkVar.d(i7);
                    }
                }
                if (vmkVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    i7k i7kVar6 = (i7k) arrayList.get(0);
                    i7k i7kVar7 = (i7k) arrayList2.get(0);
                    int i8 = i7kVar6.g;
                    int i9 = i7kVar.f + i8;
                    int i10 = i7kVar7.g;
                    int i11 = i7kVar2.f + i10;
                    float f4 = this.b.g0;
                    if (i7kVar6 == i7kVar7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    i7kVar.d((int) ((((i10 - i8) - vmkVar.g) * f4) + i8 + 0.5f));
                    i7kVar2.d(i7kVar.g + vmkVar.g);
                }
            }
        }
    }

    @Override // a.hev0
    public final void d() {
        k4e k4eVar;
        k4e k4eVar2;
        k4e k4eVar3;
        k4e k4eVar4;
        i7k i7kVar = this.k;
        k4e k4eVar5 = this.b;
        boolean z = k4eVar5.f17665a;
        vmk vmkVar = this.e;
        if (z) {
            vmkVar.d(k4eVar5.m());
        }
        boolean z2 = vmkVar.j;
        ArrayList arrayList = vmkVar.k;
        ArrayList arrayList2 = vmkVar.l;
        j4e j4eVar = j4e.d;
        j4e j4eVar2 = j4e.f15879a;
        j4e j4eVar3 = j4e.c;
        i7k i7kVar2 = this.i;
        i7k i7kVar3 = this.h;
        if (!z2) {
            k4e k4eVar6 = this.b;
            this.d = k4eVar6.U[1];
            if (k4eVar6.F) {
                this.l = new i56(this);
            }
            j4e j4eVar4 = this.d;
            if (j4eVar4 != j4eVar3) {
                if (j4eVar4 == j4eVar && (k4eVar4 = this.b.V) != null && k4eVar4.U[1] == j4eVar2) {
                    int iM = (k4eVar4.m() - this.b.K.e()) - this.b.M.e();
                    hev0.b(i7kVar3, k4eVar4.e.h, this.b.K.e());
                    hev0.b(i7kVar2, k4eVar4.e.i, -this.b.M.e());
                    vmkVar.d(iM);
                    return;
                }
                if (j4eVar4 == j4eVar2) {
                    vmkVar.d(this.b.m());
                }
            }
        } else if (this.d == j4eVar && (k4eVar2 = (k4eVar = this.b).V) != null && k4eVar2.U[1] == j4eVar2) {
            hev0.b(i7kVar3, k4eVar2.e.h, k4eVar.K.e());
            hev0.b(i7kVar2, k4eVar2.e.i, -this.b.M.e());
            return;
        }
        boolean z3 = vmkVar.j;
        if (z3) {
            k4e k4eVar7 = this.b;
            if (k4eVar7.f17665a) {
                w2e[] w2eVarArr = k4eVar7.R;
                w2e w2eVar = w2eVarArr[2];
                w2e w2eVar2 = w2eVar.f;
                if (w2eVar2 != null && w2eVarArr[3].f != null) {
                    boolean zA = k4eVar7.A();
                    k4e k4eVar8 = this.b;
                    if (zA) {
                        i7kVar3.f = k4eVar8.R[2].e();
                        i7kVar2.f = -this.b.R[3].e();
                    } else {
                        i7k i7kVarH = hev0.h(k4eVar8.R[2]);
                        if (i7kVarH != null) {
                            hev0.b(i7kVar3, i7kVarH, this.b.R[2].e());
                        }
                        i7k i7kVarH2 = hev0.h(this.b.R[3]);
                        if (i7kVarH2 != null) {
                            hev0.b(i7kVar2, i7kVarH2, -this.b.R[3].e());
                        }
                        i7kVar3.b = true;
                        i7kVar2.b = true;
                    }
                    k4e k4eVar9 = this.b;
                    if (k4eVar9.F) {
                        hev0.b(i7kVar, i7kVar3, k4eVar9.c0);
                        return;
                    }
                    return;
                }
                if (w2eVar2 != null) {
                    i7k i7kVarH3 = hev0.h(w2eVar);
                    if (i7kVarH3 != null) {
                        hev0.b(i7kVar3, i7kVarH3, this.b.R[2].e());
                        hev0.b(i7kVar2, i7kVar3, vmkVar.g);
                        k4e k4eVar10 = this.b;
                        if (k4eVar10.F) {
                            hev0.b(i7kVar, i7kVar3, k4eVar10.c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                w2e w2eVar3 = w2eVarArr[3];
                if (w2eVar3.f != null) {
                    i7k i7kVarH4 = hev0.h(w2eVar3);
                    if (i7kVarH4 != null) {
                        hev0.b(i7kVar2, i7kVarH4, -this.b.R[3].e());
                        hev0.b(i7kVar3, i7kVar2, -vmkVar.g);
                    }
                    k4e k4eVar11 = this.b;
                    if (k4eVar11.F) {
                        hev0.b(i7kVar, i7kVar3, k4eVar11.c0);
                        return;
                    }
                    return;
                }
                w2e w2eVar4 = w2eVarArr[4];
                if (w2eVar4.f != null) {
                    i7k i7kVarH5 = hev0.h(w2eVar4);
                    if (i7kVarH5 != null) {
                        hev0.b(i7kVar, i7kVarH5, 0);
                        hev0.b(i7kVar3, i7kVar, -this.b.c0);
                        hev0.b(i7kVar2, i7kVar3, vmkVar.g);
                        return;
                    }
                    return;
                }
                if ((k4eVar7 instanceof jvv) || k4eVar7.V == null || k4eVar7.k(7).f != null) {
                    return;
                }
                k4e k4eVar12 = this.b;
                hev0.b(i7kVar3, k4eVar12.V.e.h, k4eVar12.u());
                hev0.b(i7kVar2, i7kVar3, vmkVar.g);
                k4e k4eVar13 = this.b;
                if (k4eVar13.F) {
                    hev0.b(i7kVar, i7kVar3, k4eVar13.c0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != j4eVar3) {
            vmkVar.b(this);
        } else {
            k4e k4eVar14 = this.b;
            int i = k4eVar14.t;
            if (i == 2) {
                k4e k4eVar15 = k4eVar14.V;
                if (k4eVar15 != null) {
                    vmk vmkVar2 = k4eVar15.e.e;
                    arrayList2.add(vmkVar2);
                    vmkVar2.k.add(vmkVar);
                    vmkVar.b = true;
                    arrayList.add(i7kVar3);
                    arrayList.add(i7kVar2);
                }
            } else if (i == 3 && !k4eVar14.A()) {
                k4e k4eVar16 = this.b;
                if (k4eVar16.s != 3) {
                    vmk vmkVar3 = k4eVar16.d.e;
                    arrayList2.add(vmkVar3);
                    vmkVar3.k.add(vmkVar);
                    vmkVar.b = true;
                    arrayList.add(i7kVar3);
                    arrayList.add(i7kVar2);
                }
            }
        }
        k4e k4eVar17 = this.b;
        w2e[] w2eVarArr2 = k4eVar17.R;
        w2e w2eVar5 = w2eVarArr2[2];
        w2e w2eVar6 = w2eVar5.f;
        if (w2eVar6 != null && w2eVarArr2[3].f != null) {
            boolean zA2 = k4eVar17.A();
            k4e k4eVar18 = this.b;
            if (zA2) {
                i7kVar3.f = k4eVar18.R[2].e();
                i7kVar2.f = -this.b.R[3].e();
            } else {
                i7k i7kVarH6 = hev0.h(k4eVar18.R[2]);
                i7k i7kVarH7 = hev0.h(this.b.R[3]);
                if (i7kVarH6 != null) {
                    i7kVarH6.b(this);
                }
                if (i7kVarH7 != null) {
                    i7kVarH7.b(this);
                }
                this.j = 4;
            }
            if (this.b.F) {
                c(i7kVar, i7kVar3, 1, this.l);
            }
        } else if (w2eVar6 != null) {
            i7k i7kVarH8 = hev0.h(w2eVar5);
            if (i7kVarH8 != null) {
                hev0.b(i7kVar3, i7kVarH8, this.b.R[2].e());
                c(i7kVar2, i7kVar3, 1, vmkVar);
                if (this.b.F) {
                    c(i7kVar, i7kVar3, 1, this.l);
                }
                if (this.d == j4eVar3) {
                    k4e k4eVar19 = this.b;
                    if (k4eVar19.Y > 0.0f) {
                        cmw cmwVar = k4eVar19.d;
                        if (cmwVar.d == j4eVar3) {
                            cmwVar.e.k.add(vmkVar);
                            arrayList2.add(this.b.d.e);
                            vmkVar.f14295a = this;
                        }
                    }
                }
            }
        } else {
            w2e w2eVar7 = w2eVarArr2[3];
            if (w2eVar7.f != null) {
                i7k i7kVarH9 = hev0.h(w2eVar7);
                if (i7kVarH9 != null) {
                    hev0.b(i7kVar2, i7kVarH9, -this.b.R[3].e());
                    c(i7kVar3, i7kVar2, -1, vmkVar);
                    if (this.b.F) {
                        c(i7kVar, i7kVar3, 1, this.l);
                    }
                }
            } else {
                w2e w2eVar8 = w2eVarArr2[4];
                if (w2eVar8.f != null) {
                    i7k i7kVarH10 = hev0.h(w2eVar8);
                    if (i7kVarH10 != null) {
                        hev0.b(i7kVar, i7kVarH10, 0);
                        c(i7kVar3, i7kVar, -1, this.l);
                        c(i7kVar2, i7kVar3, 1, vmkVar);
                    }
                } else if (!(k4eVar17 instanceof jvv) && (k4eVar3 = k4eVar17.V) != null) {
                    hev0.b(i7kVar3, k4eVar3.e.h, k4eVar17.u());
                    c(i7kVar2, i7kVar3, 1, vmkVar);
                    if (this.b.F) {
                        c(i7kVar, i7kVar3, 1, this.l);
                    }
                    if (this.d == j4eVar3) {
                        k4e k4eVar20 = this.b;
                        if (k4eVar20.Y > 0.0f) {
                            cmw cmwVar2 = k4eVar20.d;
                            if (cmwVar2.d == j4eVar3) {
                                cmwVar2.e.k.add(vmkVar);
                                arrayList2.add(this.b.d.e);
                                vmkVar.f14295a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            vmkVar.c = true;
        }
    }

    @Override // a.hev0
    public final void e() {
        i7k i7kVar = this.h;
        if (i7kVar.j) {
            this.b.b0 = i7kVar.g;
        }
    }

    @Override // a.hev0
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // a.hev0
    public final boolean k() {
        return this.d != j4e.c || this.b.t == 0;
    }

    public final void m() {
        this.g = false;
        i7k i7kVar = this.h;
        i7kVar.c();
        i7kVar.j = false;
        i7k i7kVar2 = this.i;
        i7kVar2.c();
        i7kVar2.j = false;
        i7k i7kVar3 = this.k;
        i7kVar3.c();
        i7kVar3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.k0;
    }
}
