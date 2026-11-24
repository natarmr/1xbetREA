package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class hev0 implements d7k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12943a;
    public k4e b;
    public nog0 c;
    public j4e d;
    public final vmk e = new vmk(this);
    public int f = 0;
    public boolean g = false;
    public final i7k h = new i7k(this);
    public final i7k i = new i7k(this);
    public int j = 1;

    public hev0(k4e k4eVar) {
        this.b = k4eVar;
    }

    public static void b(i7k i7kVar, i7k i7kVar2, int i) {
        i7kVar.l.add(i7kVar2);
        i7kVar.f = i;
        i7kVar2.k.add(i7kVar);
    }

    public static i7k h(w2e w2eVar) {
        w2e w2eVar2 = w2eVar.f;
        if (w2eVar2 == null) {
            return null;
        }
        k4e k4eVar = w2eVar2.d;
        int iE = hne.E(w2eVar2.e);
        if (iE == 1) {
            return k4eVar.d.h;
        }
        if (iE == 2) {
            return k4eVar.e.h;
        }
        if (iE == 3) {
            return k4eVar.d.i;
        }
        if (iE == 4) {
            return k4eVar.e.i;
        }
        if (iE != 5) {
            return null;
        }
        return k4eVar.e.k;
    }

    public static i7k i(w2e w2eVar, int i) {
        w2e w2eVar2 = w2eVar.f;
        if (w2eVar2 == null) {
            return null;
        }
        k4e k4eVar = w2eVar2.d;
        hev0 hev0Var = i == 0 ? k4eVar.d : k4eVar.e;
        int iE = hne.E(w2eVar2.e);
        if (iE == 1 || iE == 2) {
            return hev0Var.h;
        }
        if (iE == 3 || iE == 4) {
            return hev0Var.i;
        }
        return null;
    }

    public final void c(i7k i7kVar, i7k i7kVar2, int i, vmk vmkVar) {
        i7kVar.l.add(i7kVar2);
        i7kVar.l.add(this.e);
        i7kVar.h = i;
        i7kVar.i = vmkVar;
        i7kVar2.k.add(i7kVar);
        vmkVar.k.add(i7kVar);
    }

    public void d() {
        k4e k4eVar;
        k4e k4eVar2;
        j4e j4eVar;
        k4e k4eVar3;
        k4e k4eVar4;
        j4e j4eVar2;
        k4e k4eVar5 = this.b;
        boolean z = k4eVar5.f17665a;
        vmk vmkVar = this.e;
        if (z) {
            vmkVar.d(k4eVar5.s());
        }
        boolean z2 = vmkVar.j;
        ArrayList arrayList = vmkVar.k;
        ArrayList arrayList2 = vmkVar.l;
        j4e j4eVar3 = j4e.d;
        j4e j4eVar4 = j4e.c;
        j4e j4eVar5 = j4e.f15879a;
        i7k i7kVar = this.i;
        i7k i7kVar2 = this.h;
        if (!z2) {
            k4e k4eVar6 = this.b;
            j4e j4eVar6 = k4eVar6.U[0];
            this.d = j4eVar6;
            if (j4eVar6 != j4eVar4) {
                if (j4eVar6 == j4eVar3 && (k4eVar4 = k4eVar6.V) != null && ((j4eVar2 = k4eVar4.U[0]) == j4eVar5 || j4eVar2 == j4eVar3)) {
                    int iS = (k4eVar4.s() - this.b.J.e()) - this.b.L.e();
                    b(i7kVar2, k4eVar4.d.h, this.b.J.e());
                    b(i7kVar, k4eVar4.d.i, -this.b.L.e());
                    vmkVar.d(iS);
                    return;
                }
                if (j4eVar6 == j4eVar5) {
                    vmkVar.d(k4eVar6.s());
                }
            }
        } else if (this.d == j4eVar3 && (k4eVar2 = (k4eVar = this.b).V) != null && ((j4eVar = k4eVar2.U[0]) == j4eVar5 || j4eVar == j4eVar3)) {
            b(i7kVar2, k4eVar2.d.h, k4eVar.J.e());
            b(i7kVar, k4eVar2.d.i, -this.b.L.e());
            return;
        }
        if (vmkVar.j) {
            k4e k4eVar7 = this.b;
            if (k4eVar7.f17665a) {
                w2e[] w2eVarArr = k4eVar7.R;
                w2e w2eVar = w2eVarArr[0];
                w2e w2eVar2 = w2eVar.f;
                if (w2eVar2 != null && w2eVarArr[1].f != null) {
                    boolean z3 = k4eVar7.z();
                    k4e k4eVar8 = this.b;
                    if (z3) {
                        i7kVar2.f = k4eVar8.R[0].e();
                        i7kVar.f = -this.b.R[1].e();
                        return;
                    }
                    i7k i7kVarH = h(k4eVar8.R[0]);
                    if (i7kVarH != null) {
                        b(i7kVar2, i7kVarH, this.b.R[0].e());
                    }
                    i7k i7kVarH2 = h(this.b.R[1]);
                    if (i7kVarH2 != null) {
                        b(i7kVar, i7kVarH2, -this.b.R[1].e());
                    }
                    i7kVar2.b = true;
                    i7kVar.b = true;
                    return;
                }
                if (w2eVar2 != null) {
                    i7k i7kVarH3 = h(w2eVar);
                    if (i7kVarH3 != null) {
                        b(i7kVar2, i7kVarH3, this.b.R[0].e());
                        b(i7kVar, i7kVar2, vmkVar.g);
                        return;
                    }
                    return;
                }
                w2e w2eVar3 = w2eVarArr[1];
                if (w2eVar3.f != null) {
                    i7k i7kVarH4 = h(w2eVar3);
                    if (i7kVarH4 != null) {
                        b(i7kVar, i7kVarH4, -this.b.R[1].e());
                        b(i7kVar2, i7kVar, -vmkVar.g);
                        return;
                    }
                    return;
                }
                if ((k4eVar7 instanceof jvv) || k4eVar7.V == null || k4eVar7.k(7).f != null) {
                    return;
                }
                k4e k4eVar9 = this.b;
                b(i7kVar2, k4eVar9.V.d.h, k4eVar9.t());
                b(i7kVar, i7kVar2, vmkVar.g);
                return;
            }
        }
        if (this.d == j4eVar4) {
            k4e k4eVar10 = this.b;
            int i = k4eVar10.s;
            if (i == 2) {
                k4e k4eVar11 = k4eVar10.V;
                if (k4eVar11 != null) {
                    vmk vmkVar2 = k4eVar11.e.e;
                    arrayList2.add(vmkVar2);
                    vmkVar2.k.add(vmkVar);
                    vmkVar.b = true;
                    arrayList.add(i7kVar2);
                    arrayList.add(i7kVar);
                }
            } else if (i == 3) {
                if (k4eVar10.t == 3) {
                    i7kVar2.f14295a = this;
                    i7kVar.f14295a = this;
                    ocu0 ocu0Var = k4eVar10.e;
                    ocu0Var.h.f14295a = this;
                    ocu0Var.i.f14295a = this;
                    vmkVar.f14295a = this;
                    if (k4eVar10.A()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(vmkVar);
                        ocu0 ocu0Var2 = this.b.e;
                        ocu0Var2.e.f14295a = this;
                        arrayList2.add(ocu0Var2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(vmkVar);
                        this.b.e.i.k.add(vmkVar);
                    } else {
                        boolean z4 = this.b.z();
                        k4e k4eVar12 = this.b;
                        if (z4) {
                            k4eVar12.e.e.l.add(vmkVar);
                            arrayList.add(this.b.e.e);
                        } else {
                            k4eVar12.e.e.l.add(vmkVar);
                        }
                    }
                } else {
                    vmk vmkVar3 = k4eVar10.e.e;
                    arrayList2.add(vmkVar3);
                    vmkVar3.k.add(vmkVar);
                    this.b.e.h.k.add(vmkVar);
                    this.b.e.i.k.add(vmkVar);
                    vmkVar.b = true;
                    arrayList.add(i7kVar2);
                    arrayList.add(i7kVar);
                    i7kVar2.l.add(vmkVar);
                    i7kVar.l.add(vmkVar);
                }
            }
        }
        k4e k4eVar13 = this.b;
        w2e[] w2eVarArr2 = k4eVar13.R;
        w2e w2eVar4 = w2eVarArr2[0];
        w2e w2eVar5 = w2eVar4.f;
        if (w2eVar5 != null && w2eVarArr2[1].f != null) {
            boolean z5 = k4eVar13.z();
            k4e k4eVar14 = this.b;
            if (z5) {
                i7kVar2.f = k4eVar14.R[0].e();
                i7kVar.f = -this.b.R[1].e();
                return;
            }
            i7k i7kVarH5 = h(k4eVar14.R[0]);
            i7k i7kVarH6 = h(this.b.R[1]);
            if (i7kVarH5 != null) {
                i7kVarH5.b(this);
            }
            if (i7kVarH6 != null) {
                i7kVarH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (w2eVar5 != null) {
            i7k i7kVarH7 = h(w2eVar4);
            if (i7kVarH7 != null) {
                b(i7kVar2, i7kVarH7, this.b.R[0].e());
                c(i7kVar, i7kVar2, 1, vmkVar);
                return;
            }
            return;
        }
        w2e w2eVar6 = w2eVarArr2[1];
        if (w2eVar6.f != null) {
            i7k i7kVarH8 = h(w2eVar6);
            if (i7kVarH8 != null) {
                b(i7kVar, i7kVarH8, -this.b.R[1].e());
                c(i7kVar2, i7kVar, -1, vmkVar);
                return;
            }
            return;
        }
        if ((k4eVar13 instanceof jvv) || (k4eVar3 = k4eVar13.V) == null) {
            return;
        }
        b(i7kVar2, k4eVar3.d.h, k4eVar13.t());
        c(i7kVar, i7kVar2, 1, vmkVar);
    }

    public void e() {
        k4e k4eVar = this.b;
        int i = ((qiv) k4eVar).y0;
        i7k i7kVar = this.h;
        if (i == 1) {
            k4eVar.a0 = i7kVar.g;
        } else {
            k4eVar.b0 = i7kVar.g;
        }
    }

    public void f() {
        this.h.c();
    }

    public final int g(int i, int i2) {
        k4e k4eVar = this.b;
        if (i2 == 0) {
            int i3 = k4eVar.w;
            int iMax = Math.max(k4eVar.v, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = k4eVar.z;
            int iMax2 = Math.max(k4eVar.y, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        vmk vmkVar = this.e;
        if (vmkVar.j) {
            return vmkVar.g;
        }
        return 0L;
    }

    public boolean k() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    public final void l(w2e w2eVar, w2e w2eVar2, int i) {
        vmk vmkVar;
        float f;
        int i2;
        int i3;
        i7k i7kVarH = h(w2eVar);
        i7k i7kVarH2 = h(w2eVar2);
        if (i7kVarH.j && i7kVarH2.j) {
            int iE = w2eVar.e() + i7kVarH.g;
            int iE2 = i7kVarH2.g - w2eVar2.e();
            int i4 = iE2 - iE;
            vmk vmkVar2 = this.e;
            if (!vmkVar2.j) {
                j4e j4eVar = this.d;
                j4e j4eVar2 = j4e.c;
                if (j4eVar == j4eVar2) {
                    int i5 = this.f12943a;
                    if (i5 == 0) {
                        vmkVar2.d(g(i4, i));
                    } else if (i5 == 1) {
                        vmkVar2.d(Math.min(g(vmkVar2.m, i), i4));
                    } else if (i5 == 2) {
                        k4e k4eVar = this.b;
                        k4e k4eVar2 = k4eVar.V;
                        if (k4eVar2 != null) {
                            vmk vmkVar3 = (i == 0 ? k4eVar2.d : k4eVar2.e).e;
                            if (vmkVar3.j) {
                                vmkVar2.d(g((int) ((vmkVar3.g * (i == 0 ? k4eVar.x : k4eVar.A)) + 0.5f), i));
                            }
                        }
                    } else if (i5 == 3) {
                        k4e k4eVar3 = this.b;
                        hev0 hev0Var = k4eVar3.d;
                        if (hev0Var.d == j4eVar2 && hev0Var.f12943a == 3) {
                            ocu0 ocu0Var = k4eVar3.e;
                            if (ocu0Var.d != j4eVar2 || ocu0Var.f12943a != 3) {
                                if (i == 0) {
                                    hev0Var = k4eVar3.e;
                                }
                                vmkVar = hev0Var.e;
                                if (vmkVar.j) {
                                    f = k4eVar3.Y;
                                    i2 = vmkVar.g;
                                    if (i == 1) {
                                        i3 = (int) ((i2 / f) + 0.5f);
                                    } else {
                                        i3 = (int) ((f * i2) + 0.5f);
                                    }
                                    vmkVar2.d(i3);
                                }
                            }
                        } else {
                            if (i == 0) {
                                hev0Var = k4eVar3.e;
                            }
                            vmkVar = hev0Var.e;
                            if (vmkVar.j) {
                                f = k4eVar3.Y;
                                i2 = vmkVar.g;
                                if (i == 1) {
                                    i3 = (int) ((i2 / f) + 0.5f);
                                } else {
                                    i3 = (int) ((f * i2) + 0.5f);
                                }
                                vmkVar2.d(i3);
                            }
                        }
                    }
                }
            }
            if (vmkVar2.j) {
                int i6 = vmkVar2.g;
                i7k i7kVar = this.i;
                i7k i7kVar2 = this.h;
                if (i6 == i4) {
                    i7kVar2.d(iE);
                    i7kVar.d(iE2);
                    return;
                }
                k4e k4eVar4 = this.b;
                float f2 = i == 0 ? k4eVar4.f0 : k4eVar4.g0;
                if (i7kVarH == i7kVarH2) {
                    iE = i7kVarH.g;
                    iE2 = i7kVarH2.g;
                    f2 = 0.5f;
                }
                i7kVar2.d((int) ((((iE2 - iE) - i6) * f2) + iE + 0.5f));
                i7kVar.d(i7kVar2.g + vmkVar2.g);
            }
        }
    }
}
