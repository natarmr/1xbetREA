package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class nbb extends hev0 {
    public final ArrayList k;
    public int l;

    public nbb(k4e k4eVar, int i) {
        k4e k4eVar2;
        super(k4eVar);
        ArrayList<hev0> arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        k4e k4eVar3 = this.b;
        k4e k4eVarO = k4eVar3.o(i);
        while (true) {
            k4eVar2 = k4eVar3;
            k4eVar3 = k4eVarO;
            if (k4eVar3 == null) {
                break;
            } else {
                k4eVarO = k4eVar3.o(this.f);
            }
        }
        this.b = k4eVar2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? k4eVar2.d : i2 == 1 ? k4eVar2.e : null);
        k4e k4eVarN = k4eVar2.n(this.f);
        while (k4eVarN != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? k4eVarN.d : i3 == 1 ? k4eVarN.e : null);
            k4eVarN = k4eVarN.n(this.f);
        }
        for (hev0 hev0Var : arrayList) {
            int i4 = this.f;
            if (i4 == 0) {
                hev0Var.b.b = this;
            } else if (i4 == 1) {
                hev0Var.b.c = this;
            }
        }
        if (this.f == 0 && ((l4e) this.b.V).z0 && arrayList.size() > 1) {
            this.b = ((hev0) dw9.l(1, arrayList)).b;
        }
        int i5 = this.f;
        k4e k4eVar4 = this.b;
        this.l = i5 == 0 ? k4eVar4.l0 : k4eVar4.m0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00ee A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6 A[ADDED_TO_REGION] */
    @Override // a.d7k
    public final void a(d7k d7kVar) {
        int i;
        int i2;
        j4e j4eVar;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        i7k i7kVar = this.h;
        if (i7kVar.j) {
            i7k i7kVar2 = this.i;
            if (i7kVar2.j) {
                k4e k4eVar = this.b.V;
                boolean z2 = k4eVar instanceof l4e ? ((l4e) k4eVar).z0 : false;
                int i13 = i7kVar2.g - i7kVar.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i14 >= size) {
                        i14 = -1;
                        break;
                    } else if (((hev0) arrayList.get(i14)).b.i0 != 8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = size - 1;
                for (int i16 = i15; i16 >= 0; i16--) {
                    if (((hev0) arrayList.get(i16)).b.i0 != 8) {
                        i = i16;
                        break;
                    }
                }
                int i17 = 0;
                while (true) {
                    j4eVar = j4e.c;
                    if (i17 >= 2) {
                        z = z2;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i18 = 0;
                    i5 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    while (i18 < size) {
                        hev0 hev0Var = (hev0) arrayList.get(i18);
                        boolean z3 = z2;
                        k4e k4eVar2 = hev0Var.b;
                        int i21 = i17;
                        if (k4eVar2.i0 != i2) {
                            i20++;
                            if (i18 > 0 && i18 >= i14) {
                                i5 += hev0Var.h.f;
                            }
                            vmk vmkVar = hev0Var.e;
                            int i22 = vmkVar.g;
                            boolean z4 = hev0Var.d != j4eVar;
                            if (z4) {
                                int i23 = this.f;
                                if (i23 == 0 && !k4eVar2.d.e.j) {
                                    return;
                                }
                                if (i23 == 1 && !k4eVar2.e.e.j) {
                                    return;
                                } else {
                                    i11 = i5;
                                }
                            } else {
                                i11 = i5;
                                if (hev0Var.f12943a == 1 && i21 == 0) {
                                    i12 = vmkVar.m;
                                    i19++;
                                } else {
                                    if (vmkVar.j) {
                                        i12 = i22;
                                    }
                                    if (z4) {
                                        i5 = i11 + i12;
                                    } else {
                                        i19++;
                                        f3 = k4eVar2.n0[this.f];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                        i5 = i11;
                                    }
                                    if (i18 >= i15 && i18 < i) {
                                        i5 += -hev0Var.i.f;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i19++;
                                    f3 = k4eVar2.n0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                    i5 = i11;
                                } else {
                                    i5 = i11 + i12;
                                }
                                if (i18 >= i15) {
                                }
                            }
                            i12 = i22;
                            if (z4) {
                                i19++;
                                f3 = k4eVar2.n0[this.f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                                i5 = i11;
                            } else {
                                i5 = i11 + i12;
                            }
                            if (i18 >= i15) {
                            }
                        }
                        i18++;
                        z2 = z3;
                        i17 = i21;
                        i2 = 8;
                    }
                    z = z2;
                    int i24 = i17;
                    if (i5 < i13 || i19 == 0) {
                        i3 = i19;
                        i4 = i20;
                        break;
                    } else {
                        i17 = i24 + 1;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i25 = i7kVar.g;
                if (z) {
                    i25 = i7kVar2.g;
                }
                float f4 = 0.5f;
                if (i5 > i13) {
                    i25 = z ? i25 + ((int) (((i5 - i13) / 2.0f) + 0.5f)) : i25 - ((int) (((i5 - i13) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i13 - i5;
                    int i26 = (int) ((f5 / i3) + 0.5f);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < size) {
                        float f6 = f4;
                        hev0 hev0Var2 = (hev0) arrayList.get(i27);
                        int i29 = i25;
                        k4e k4eVar3 = hev0Var2.b;
                        int i30 = i3;
                        vmk vmkVar2 = hev0Var2.e;
                        float f7 = f5;
                        int i31 = i26;
                        if (k4eVar3.i0 != 8 && hev0Var2.d == j4eVar && !vmkVar2.j) {
                            int i32 = f > 0.0f ? (int) (((k4eVar3.n0[this.f] * f7) / f) + f6) : i31;
                            if (this.f == 0) {
                                i9 = k4eVar3.w;
                                i10 = k4eVar3.v;
                            } else {
                                i9 = k4eVar3.z;
                                i10 = k4eVar3.y;
                            }
                            int iMax = Math.max(i10, hev0Var2.f12943a == 1 ? Math.min(i32, vmkVar2.m) : i32);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i32) {
                                i28++;
                                i32 = iMax;
                            }
                            vmkVar2.d(i32);
                        }
                        i27++;
                        i25 = i29;
                        f4 = f6;
                        i3 = i30;
                        f5 = f7;
                        i26 = i31;
                    }
                    i6 = i25;
                    f2 = f4;
                    int i33 = i3;
                    if (i28 > 0) {
                        i3 = i33 - i28;
                        i5 = 0;
                        for (int i34 = 0; i34 < size; i34++) {
                            hev0 hev0Var3 = (hev0) arrayList.get(i34);
                            if (hev0Var3.b.i0 != 8) {
                                if (i34 > 0 && i34 >= i14) {
                                    i5 += hev0Var3.h.f;
                                }
                                i5 += hev0Var3.e.g;
                                if (i34 < i15 && i34 < i) {
                                    i5 += -hev0Var3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i33;
                    }
                    i8 = 2;
                    if (this.l == 2 && i28 == 0) {
                        i7 = 0;
                        this.l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i25;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i13) {
                    this.l = i8;
                }
                if (i4 > 0 && i3 == 0 && i14 == i) {
                    this.l = i8;
                }
                int i35 = this.l;
                if (i35 == 1) {
                    int i36 = i4 > 1 ? (i13 - i5) / (i4 - 1) : i4 == 1 ? (i13 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i36 = i7;
                    }
                    int i37 = i6;
                    for (int i38 = i7; i38 < size; i38++) {
                        hev0 hev0Var4 = (hev0) arrayList.get(z ? size - (i38 + 1) : i38);
                        k4e k4eVar4 = hev0Var4.b;
                        i7k i7kVar3 = hev0Var4.i;
                        i7k i7kVar4 = hev0Var4.h;
                        if (k4eVar4.i0 == 8) {
                            i7kVar4.d(i37);
                            i7kVar3.d(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i14) {
                                i37 = z ? i37 - i7kVar4.f : i37 + i7kVar4.f;
                            }
                            if (z) {
                                i7kVar3.d(i37);
                            } else {
                                i7kVar4.d(i37);
                            }
                            vmk vmkVar3 = hev0Var4.e;
                            int i39 = vmkVar3.g;
                            if (hev0Var4.d == j4eVar && hev0Var4.f12943a == 1) {
                                i39 = vmkVar3.m;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                i7kVar4.d(i37);
                            } else {
                                i7kVar3.d(i37);
                            }
                            hev0Var4.g = true;
                            if (i38 < i15 && i38 < i) {
                                i37 = z ? i37 - (-i7kVar3.f) : i37 + (-i7kVar3.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i40 = (i13 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i40 = i7;
                    }
                    int i41 = i6;
                    for (int i42 = i7; i42 < size; i42++) {
                        hev0 hev0Var5 = (hev0) arrayList.get(z ? size - (i42 + 1) : i42);
                        k4e k4eVar5 = hev0Var5.b;
                        i7k i7kVar5 = hev0Var5.i;
                        i7k i7kVar6 = hev0Var5.h;
                        if (k4eVar5.i0 == 8) {
                            i7kVar6.d(i41);
                            i7kVar5.d(i41);
                        } else {
                            int i43 = z ? i41 - i40 : i41 + i40;
                            if (i42 > 0 && i42 >= i14) {
                                i43 = z ? i43 - i7kVar6.f : i43 + i7kVar6.f;
                            }
                            if (z) {
                                i7kVar5.d(i43);
                            } else {
                                i7kVar6.d(i43);
                            }
                            vmk vmkVar4 = hev0Var5.e;
                            int iMin = vmkVar4.g;
                            if (hev0Var5.d == j4eVar && hev0Var5.f12943a == 1) {
                                iMin = Math.min(iMin, vmkVar4.m);
                            }
                            i41 = z ? i43 - iMin : i43 + iMin;
                            if (z) {
                                i7kVar6.d(i41);
                            } else {
                                i7kVar5.d(i41);
                            }
                            if (i42 < i15 && i42 < i) {
                                i41 = z ? i41 - (-i7kVar5.f) : i41 + (-i7kVar5.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    int i44 = this.f;
                    k4e k4eVar6 = this.b;
                    float f8 = i44 == 0 ? k4eVar6.f0 : k4eVar6.g0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i45 = (int) (((i13 - i5) * f8) + f2);
                    if (i45 < 0 || i3 > 0) {
                        i45 = i7;
                    }
                    int i46 = z ? i6 - i45 : i6 + i45;
                    for (int i47 = i7; i47 < size; i47++) {
                        hev0 hev0Var6 = (hev0) arrayList.get(z ? size - (i47 + 1) : i47);
                        k4e k4eVar7 = hev0Var6.b;
                        i7k i7kVar7 = hev0Var6.i;
                        i7k i7kVar8 = hev0Var6.h;
                        if (k4eVar7.i0 == 8) {
                            i7kVar8.d(i46);
                            i7kVar7.d(i46);
                        } else {
                            if (i47 > 0 && i47 >= i14) {
                                i46 = z ? i46 - i7kVar8.f : i46 + i7kVar8.f;
                            }
                            if (z) {
                                i7kVar7.d(i46);
                            } else {
                                i7kVar8.d(i46);
                            }
                            vmk vmkVar5 = hev0Var6.e;
                            int i48 = vmkVar5.g;
                            if (hev0Var6.d == j4eVar && hev0Var6.f12943a == 1) {
                                i48 = vmkVar5.m;
                            }
                            i46 = z ? i46 - i48 : i46 + i48;
                            if (z) {
                                i7kVar8.d(i46);
                            } else {
                                i7kVar7.d(i46);
                            }
                            if (i47 < i15 && i47 < i) {
                                i46 = z ? i46 - (-i7kVar7.f) : i46 + (-i7kVar7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // a.hev0
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((hev0) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        k4e k4eVar = ((hev0) arrayList.get(0)).b;
        k4e k4eVar2 = ((hev0) arrayList.get(size - 1)).b;
        int i = this.f;
        i7k i7kVar = this.i;
        i7k i7kVar2 = this.h;
        if (i == 0) {
            w2e w2eVar = k4eVar.J;
            w2e w2eVar2 = k4eVar2.L;
            i7k i7kVarI = hev0.i(w2eVar, 0);
            int iE = w2eVar.e();
            k4e k4eVarM = m();
            if (k4eVarM != null) {
                iE = k4eVarM.J.e();
            }
            if (i7kVarI != null) {
                hev0.b(i7kVar2, i7kVarI, iE);
            }
            i7k i7kVarI2 = hev0.i(w2eVar2, 0);
            int iE2 = w2eVar2.e();
            k4e k4eVarN = n();
            if (k4eVarN != null) {
                iE2 = k4eVarN.L.e();
            }
            if (i7kVarI2 != null) {
                hev0.b(i7kVar, i7kVarI2, -iE2);
            }
        } else {
            w2e w2eVar3 = k4eVar.K;
            w2e w2eVar4 = k4eVar2.M;
            i7k i7kVarI3 = hev0.i(w2eVar3, 1);
            int iE3 = w2eVar3.e();
            k4e k4eVarM2 = m();
            if (k4eVarM2 != null) {
                iE3 = k4eVarM2.K.e();
            }
            if (i7kVarI3 != null) {
                hev0.b(i7kVar2, i7kVarI3, iE3);
            }
            i7k i7kVarI4 = hev0.i(w2eVar4, 1);
            int iE4 = w2eVar4.e();
            k4e k4eVarN2 = n();
            if (k4eVarN2 != null) {
                iE4 = k4eVarN2.M.e();
            }
            if (i7kVarI4 != null) {
                hev0.b(i7kVar, i7kVarI4, -iE4);
            }
        }
        i7kVar2.f14295a = this;
        i7kVar.f14295a = this;
    }

    @Override // a.hev0
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((hev0) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // a.hev0
    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((hev0) it.next()).f();
        }
    }

    @Override // a.hev0
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            hev0 hev0Var = (hev0) arrayList.get(i);
            j = ((long) hev0Var.i.f) + hev0Var.j() + j + ((long) hev0Var.h.f);
        }
        return j;
    }

    @Override // a.hev0
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((hev0) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final k4e m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            k4e k4eVar = ((hev0) arrayList.get(i)).b;
            if (k4eVar.i0 != 8) {
                return k4eVar;
            }
            i++;
        }
    }

    public final k4e n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k4e k4eVar = ((hev0) arrayList.get(size)).b;
            if (k4eVar.i0 != 8) {
                return k4eVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        for (hev0 hev0Var : this.k) {
            sb.append(Separators.LESS_THAN);
            sb.append(hev0Var);
            sb.append("> ");
        }
        return sb.toString();
    }
}
