package a;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class amk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1111a;
    public final int[] b;
    public final int[] c;
    public final kpb d;
    public final int e;
    public final int f;
    public final boolean g;

    public amk(kpb kpbVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z) {
        int i;
        int i2;
        this.f1111a = arrayList;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = kpbVar;
        int iJ = kpbVar.J();
        this.e = iJ;
        int I = kpbVar.I();
        this.f = I;
        this.g = z;
        zlk zlkVar = arrayList.isEmpty() ? null : (zlk) arrayList.get(0);
        if (zlkVar == null || zlkVar.f44584a != 0 || zlkVar.b != 0) {
            arrayList.add(0, new zlk(0, 0, 0));
        }
        arrayList.add(new zlk(iJ, I, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zlk zlkVar2 = (zlk) it.next();
            for (int i3 = 0; i3 < zlkVar2.c; i3++) {
                int i4 = zlkVar2.f44584a + i3;
                int i5 = zlkVar2.b + i3;
                int i6 = kpbVar.s(i4, i5) ? 1 : 2;
                iArr[i4] = (i5 << 4) | i6;
                iArr2[i5] = (i4 << 4) | i6;
            }
        }
        if (this.g) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                zlk zlkVar3 = (zlk) it2.next();
                while (true) {
                    i = zlkVar3.f44584a;
                    if (i7 < i) {
                        if (iArr[i7] == 0) {
                            int size = arrayList.size();
                            int i8 = 0;
                            for (int i9 = 0; i9 < size; i9++) {
                                zlk zlkVar4 = (zlk) arrayList.get(i9);
                                while (true) {
                                    i2 = zlkVar4.b;
                                    if (i8 < i2) {
                                        if (iArr2[i8] == 0 && kpbVar.t(i7, i8)) {
                                            int i10 = kpbVar.s(i7, i8) ? 8 : 4;
                                            iArr[i7] = (i8 << 4) | i10;
                                            iArr2[i8] = i10 | (i7 << 4);
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                i8 = zlkVar4.c + i2;
                            }
                        }
                        i7++;
                    }
                }
                i7 = zlkVar3.c + i;
            }
        }
    }

    public static bmk c(ArrayDeque arrayDeque, int i, boolean z) {
        bmk bmkVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                bmkVar = null;
                break;
            }
            bmkVar = (bmk) it.next();
            if (bmkVar.f2839a == i && bmkVar.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            bmk bmkVar2 = (bmk) it.next();
            if (z) {
                bmkVar2.b--;
            } else {
                bmkVar2.b++;
            }
        }
        return bmkVar;
    }

    public final int a(int i) {
        int i2 = this.e;
        if (i < 0 || i >= i2) {
            v4i0.m(f140.j(i, "Index out of bounds - passed position = ", i2, ", old list size = "));
            return 0;
        }
        int i3 = this.b[i];
        if ((i3 & 15) == 0) {
            return -1;
        }
        return i3 >> 4;
    }

    public final void b(pf00 pf00Var) {
        int[] iArr;
        kpb kpbVar;
        int i;
        int i2;
        ArrayList arrayList;
        amk amkVar = this;
        ta6 ta6Var = pf00Var instanceof ta6 ? (ta6) pf00Var : new ta6(pf00Var);
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = amkVar.f1111a;
        boolean z = true;
        int size = arrayList2.size() - 1;
        int i3 = amkVar.e;
        int i4 = amkVar.f;
        int i5 = i3;
        while (size >= 0) {
            zlk zlkVar = (zlk) arrayList2.get(size);
            int i6 = zlkVar.f44584a;
            int i7 = zlkVar.c;
            int i8 = i6 + i7;
            int i9 = zlkVar.b;
            int i10 = i9 + i7;
            while (true) {
                iArr = amkVar.b;
                kpbVar = amkVar.d;
                boolean z2 = z;
                i = 0;
                if (i5 <= i8) {
                    break;
                }
                i5--;
                int i11 = iArr[i5];
                if ((i11 & 12) != 0) {
                    arrayList = arrayList2;
                    int i12 = i11 >> 4;
                    bmk bmkVarC = c(arrayDeque, i12, false);
                    if (bmkVarC != null) {
                        int i13 = (i3 - bmkVarC.b) - 1;
                        ta6Var.g(i5, i13);
                        if ((i11 & 4) != 0) {
                            ta6Var.f(i13, z2 ? 1 : 0, kpbVar.z(i5, i12));
                        }
                    } else {
                        arrayDeque.add(new bmk(i5, (i3 - i5) - (z2 ? 1 : 0), z2));
                    }
                } else {
                    arrayList = arrayList2;
                    ta6Var.d(i5, z2 ? 1 : 0);
                    i3--;
                }
                arrayList2 = arrayList;
                z = true;
            }
            ArrayList arrayList3 = arrayList2;
            while (i4 > i10) {
                i4--;
                int i14 = amkVar.c[i4];
                if ((i14 & 12) != 0) {
                    int i15 = i14 >> 4;
                    bmk bmkVarC2 = c(arrayDeque, i15, true);
                    if (bmkVarC2 == null) {
                        arrayDeque.add(new bmk(i4, i3 - i5, false));
                        i2 = 0;
                    } else {
                        i2 = 0;
                        ta6Var.g((i3 - bmkVarC2.b) - 1, i5);
                        if ((i14 & 4) != 0) {
                            ta6Var.f(i5, 1, kpbVar.z(i15, i4));
                        }
                    }
                } else {
                    i2 = i;
                    ta6Var.c(i5, 1);
                    i3++;
                }
                amkVar = this;
                i = i2;
            }
            int i16 = i9;
            int i17 = i6;
            while (i < i7) {
                if ((iArr[i17] & 15) == 2) {
                    ta6Var.f(i17, 1, kpbVar.z(i17, i16));
                }
                i17++;
                i16++;
                i++;
            }
            size--;
            amkVar = this;
            z = true;
            i4 = i9;
            i5 = i6;
            arrayList2 = arrayList3;
        }
        ta6Var.a();
    }
}
