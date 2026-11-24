package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class cmw extends hev0 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x026a  */
    /* JADX WARN: Code duplicated, block: B:118:0x027a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    @Override // a.d7k
    public final void a(d7k d7kVar) {
        float f;
        int iG;
        int i;
        int iG2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (hne.E(this.j) == 3) {
            k4e k4eVar = this.b;
            l(k4eVar.J, k4eVar.L, 0);
            return;
        }
        vmk vmkVar = this.e;
        boolean z = vmkVar.j;
        j4e j4eVar = j4e.c;
        i7k i7kVar = this.h;
        i7k i7kVar2 = this.i;
        if (z || this.d != j4eVar) {
            f = 0.5f;
        } else {
            k4e k4eVar2 = this.b;
            int i3 = k4eVar2.s;
            if (i3 == 2) {
                f = 0.5f;
                k4e k4eVar3 = k4eVar2.V;
                if (k4eVar3 != null) {
                    vmk vmkVar2 = k4eVar3.d.e;
                    if (vmkVar2.j) {
                        vmkVar.d((int) ((vmkVar2.g * k4eVar2.x) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = k4eVar2.t;
                if (i4 == 0 || i4 == 3) {
                    ocu0 ocu0Var = k4eVar2.e;
                    i7k i7kVar3 = ocu0Var.h;
                    i7k i7kVar4 = ocu0Var.i;
                    boolean z2 = k4eVar2.J.f != null;
                    boolean z3 = k4eVar2.K.f != null;
                    boolean z4 = k4eVar2.L.f != null;
                    boolean z5 = k4eVar2.M.f != null;
                    f = 0.5f;
                    int i5 = k4eVar2.Z;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = k4eVar2.Y;
                        boolean z6 = i7kVar3.j;
                        ArrayList arrayList = i7kVar3.l;
                        int[] iArr = k;
                        if (z6 && i7kVar4.j) {
                            if (i7kVar.c && i7kVar2.c) {
                                m(iArr, ((i7k) i7kVar.l.get(0)).g + i7kVar.f, ((i7k) i7kVar2.l.get(0)).g - i7kVar2.f, i7kVar3.g + i7kVar3.f, i7kVar4.g - i7kVar4.f, f5, i5);
                                vmkVar.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (i7kVar.j && i7kVar2.j) {
                            if (!i7kVar3.c || !i7kVar4.c) {
                                return;
                            }
                            m(iArr, i7kVar.g + i7kVar.f, i7kVar2.g - i7kVar2.f, ((i7k) arrayList.get(0)).g + i7kVar3.f, ((i7k) i7kVar4.l.get(0)).g - i7kVar4.f, f5, i5);
                            vmkVar.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!i7kVar.c || !i7kVar2.c || !i7kVar3.c || !i7kVar4.c) {
                            return;
                        }
                        m(iArr, ((i7k) i7kVar.l.get(0)).g + i7kVar.f, ((i7k) i7kVar2.l.get(0)).g - i7kVar2.f, ((i7k) arrayList.get(0)).g + i7kVar3.f, ((i7k) i7kVar4.l.get(0)).g - i7kVar4.f, f5, i5);
                        vmkVar.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!i7kVar.c || !i7kVar2.c) {
                            return;
                        }
                        float f6 = k4eVar2.Y;
                        int i6 = ((i7k) i7kVar.l.get(0)).g + i7kVar.f;
                        int i7 = ((i7k) i7kVar2.l.get(0)).g - i7kVar2.f;
                        if (i5 == -1 || i5 == 0) {
                            int iG3 = g(i7 - i6, 0);
                            int i8 = (int) ((iG3 * f6) + 0.5f);
                            int iG4 = g(i8, 1);
                            if (i8 != iG4) {
                                iG3 = (int) ((iG4 / f6) + 0.5f);
                            }
                            vmkVar.d(iG3);
                            this.b.e.e.d(iG4);
                        } else if (i5 == 1) {
                            int iG5 = g(i7 - i6, 0);
                            int i9 = (int) ((iG5 / f6) + 0.5f);
                            int iG6 = g(i9, 1);
                            if (i9 != iG6) {
                                iG5 = (int) ((iG6 * f6) + 0.5f);
                            }
                            vmkVar.d(iG5);
                            this.b.e.e.d(iG6);
                        }
                    } else if (z3 && z5) {
                        if (!i7kVar3.c || !i7kVar4.c) {
                            return;
                        }
                        float f7 = k4eVar2.Y;
                        int i10 = ((i7k) i7kVar3.l.get(0)).g + i7kVar3.f;
                        int i11 = ((i7k) i7kVar4.l.get(0)).g - i7kVar4.f;
                        if (i5 == -1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            vmkVar.d(iG2);
                            this.b.e.e.d(iG);
                        } else if (i5 == 0) {
                            int iG7 = g(i11 - i10, 1);
                            int i12 = (int) ((iG7 * f7) + 0.5f);
                            int iG8 = g(i12, 0);
                            if (i12 != iG8) {
                                iG7 = (int) ((iG8 / f7) + 0.5f);
                            }
                            vmkVar.d(iG8);
                            this.b.e.e.d(iG7);
                        } else if (i5 == 1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            vmkVar.d(iG2);
                            this.b.e.e.d(iG);
                        }
                    }
                } else {
                    int i13 = k4eVar2.Z;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = k4eVar2.e.e.g / k4eVar2.Y;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = k4eVar2.e.e.g;
                            f3 = k4eVar2.Y;
                        }
                        vmkVar.d(i2);
                        f = 0.5f;
                    } else {
                        f2 = k4eVar2.e.e.g;
                        f3 = k4eVar2.Y;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    vmkVar.d(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = i7kVar.c;
        ArrayList arrayList2 = i7kVar.l;
        if (z7) {
            boolean z8 = i7kVar2.c;
            ArrayList arrayList3 = i7kVar2.l;
            if (z8) {
                if (i7kVar.j && i7kVar2.j && vmkVar.j) {
                    return;
                }
                if (!vmkVar.j && this.d == j4eVar) {
                    k4e k4eVar4 = this.b;
                    if (k4eVar4.s == 0 && !k4eVar4.z()) {
                        i7k i7kVar5 = (i7k) arrayList2.get(0);
                        i7k i7kVar6 = (i7k) arrayList3.get(0);
                        int i14 = i7kVar5.g + i7kVar.f;
                        int i15 = i7kVar6.g + i7kVar2.f;
                        i7kVar.d(i14);
                        i7kVar2.d(i15);
                        vmkVar.d(i15 - i14);
                        return;
                    }
                }
                if (!vmkVar.j && this.d == j4eVar && this.f12943a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((i7k) arrayList3.get(0)).g + i7kVar2.f) - (((i7k) arrayList2.get(0)).g + i7kVar.f), vmkVar.m);
                    k4e k4eVar5 = this.b;
                    int i16 = k4eVar5.w;
                    int iMax = Math.max(k4eVar5.v, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    vmkVar.d(iMax);
                }
                if (vmkVar.j) {
                    i7k i7kVar7 = (i7k) arrayList2.get(0);
                    i7k i7kVar8 = (i7k) arrayList3.get(0);
                    int i17 = i7kVar7.g;
                    int i18 = i7kVar.f + i17;
                    int i19 = i7kVar8.g;
                    int i20 = i7kVar2.f + i19;
                    float f8 = this.b.f0;
                    if (i7kVar7 == i7kVar8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    i7kVar.d((int) ((((i19 - i17) - vmkVar.g) * f8) + i17 + f));
                    i7kVar2.d(i7kVar.g + vmkVar.g);
                }
            }
        }
    }

    @Override // a.hev0
    public final void e() {
        i7k i7kVar = this.h;
        if (i7kVar.j) {
            this.b.a0 = i7kVar.g;
        }
    }

    @Override // a.hev0
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // a.hev0
    public final boolean k() {
        return this.d != j4e.c || this.b.s == 0;
    }

    public final void n() {
        this.g = false;
        i7k i7kVar = this.h;
        i7kVar.c();
        i7kVar.j = false;
        i7k i7kVar2 = this.i;
        i7kVar2.c();
        i7kVar2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.k0;
    }
}
