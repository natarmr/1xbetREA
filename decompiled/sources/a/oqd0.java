package a;

import android.javax.sip.message.Response;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class oqd0 extends o4 {
    public static final int[] k = {7, 5, 4, 3, 1};
    public static final int[] l = {4, 20, 52, 104, 204};
    public static final int[] m = {0, 348, 1388, 2948, 3988};
    public static final int[][] n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    public static final int[][] o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{ModuleDescriptor.MODULE_VERSION, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, Response.OK, 178, 112, 125, 164}, new int[]{70, 210, 208, Response.ACCEPTED, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, Response.QUEUED, 124}, new int[]{161, 61, Response.SESSION_PROGRESS, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};
    public static final int[][] p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    public final ArrayList g = new ArrayList(11);
    public final ArrayList h = new ArrayList();
    public final int[] i = new int[2];
    public boolean j;

    public static i0g0 m(List list) {
        c2 eVar;
        byte b = 2;
        int size = list.size() * 2;
        int i = size - 1;
        byte b2 = 1;
        if (((ioo) list.get(list.size() - 1)).b == null) {
            i = size - 2;
        }
        p68 p68Var = new p68(i * 12);
        byte b3 = 0;
        int i2 = ((ioo) list.get(0)).b.f26657a;
        int i3 = 0;
        for (int i4 = 11; i4 >= 0; i4--) {
            if (((1 << i4) & i2) != 0) {
                p68Var.j(i3);
            }
            i3++;
        }
        for (int i5 = 1; i5 < list.size(); i5++) {
            ioo iooVar = (ioo) list.get(i5);
            int i6 = iooVar.f15127a.f26657a;
            for (int i7 = 11; i7 >= 0; i7--) {
                if (((1 << i7) & i6) != 0) {
                    p68Var.j(i3);
                }
                i3++;
            }
            paj pajVar = iooVar.b;
            if (pajVar != null) {
                int i8 = pajVar.f26657a;
                for (int i9 = 11; i9 >= 0; i9--) {
                    if (((1 << i9) & i8) != 0) {
                        p68Var.j(i3);
                    }
                    i3++;
                }
            }
        }
        if (p68Var.d(1)) {
            eVar = new f(p68Var, b);
        } else if (p68Var.d(2)) {
            int iM = oif0.m(1, 4, p68Var);
            if (iM == 4) {
                eVar = new e(p68Var, (byte) 0);
            } else if (iM != 5) {
                int iM2 = oif0.m(1, 5, p68Var);
                if (iM2 == 12) {
                    eVar = new f(p68Var, b3);
                } else if (iM2 != 13) {
                    switch (oif0.m(1, 7, p68Var)) {
                        case 56:
                            eVar = new g(p68Var, "310", "11");
                            break;
                        case 57:
                            eVar = new g(p68Var, "320", "11");
                            break;
                        case 58:
                            eVar = new g(p68Var, "310", "13");
                            break;
                        case 59:
                            eVar = new g(p68Var, "320", "13");
                            break;
                        case 60:
                            eVar = new g(p68Var, "310", "15");
                            break;
                        case 61:
                            eVar = new g(p68Var, "320", "15");
                            break;
                        case 62:
                            eVar = new g(p68Var, "310", "17");
                            break;
                        case 63:
                            eVar = new g(p68Var, "320", "17");
                            break;
                        default:
                            e9d0.v(p68Var, "unknown decoder: ");
                            return null;
                    }
                } else {
                    eVar = new f(p68Var, b2);
                }
            } else {
                eVar = new e(p68Var, (byte) 1);
            }
        } else {
            eVar = new ca3(p68Var);
        }
        String strC = eVar.C();
        d3g0[] d3g0VarArr = ((ioo) list.get(0)).c.c;
        d3g0[] d3g0VarArr2 = ((ioo) list.get(list.size() - 1)).c.c;
        i0g0 i0g0Var = new i0g0(strC, null, new d3g0[]{d3g0VarArr[0], d3g0VarArr[1], d3g0VarArr2[0], d3g0VarArr2[1]}, ju5.n);
        i0g0Var.b(a3g0.m, "]e0");
        return i0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    /* JADX WARN: Code duplicated, block: B:13:0x001d  */
    /* JADX WARN: Code duplicated, block: B:16:0x002c A[LOOP:1: B:11:0x0017->B:16:0x002c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0031 A[SYNTHETIC] */
    public static boolean p(ArrayList arrayList, boolean z) {
        int i;
        for (int i2 = 0; i2 < 10; i2++) {
            int[] iArr = p[i2];
            int size = arrayList.size();
            int length = iArr.length;
            if (z) {
                if (size == length) {
                    for (i = 0; i < arrayList.size(); i++) {
                        if (((ioo) arrayList.get(i)).c.f33781a != iArr[i]) {
                        }
                    }
                    return true;
                }
                continue;
            } else {
                if (size <= length) {
                    while (i < arrayList.size()) {
                        if (((ioo) arrayList.get(i)).c.f33781a != iArr[i]) {
                        }
                    }
                    return true;
                }
                continue;
            }
        }
        return false;
    }

    @Override // a.jl60
    public final i0g0 b(int i, p68 p68Var, Map map) {
        this.j = false;
        try {
            return m(o(p68Var, i));
        } catch (o660 unused) {
            this.j = true;
            return m(o(p68Var, i));
        }
    }

    public final boolean j() {
        ArrayList arrayList = this.g;
        ioo iooVar = (ioo) arrayList.get(0);
        paj pajVar = iooVar.f15127a;
        paj pajVar2 = iooVar.b;
        if (pajVar2 != null) {
            int i = pajVar2.b;
            int i2 = 2;
            for (int i3 = 1; i3 < arrayList.size(); i3++) {
                ioo iooVar2 = (ioo) arrayList.get(i3);
                i += iooVar2.f15127a.b;
                int i4 = i2 + 1;
                paj pajVar3 = iooVar2.b;
                if (pajVar3 != null) {
                    i += pajVar3.b;
                    i2 += 2;
                } else {
                    i2 = i4;
                }
            }
            if (twn.b(i2, 4, 211, i % 211) == pajVar.f26657a) {
                return true;
            }
        }
        return false;
    }

    public final List k(int i, ArrayList arrayList) throws o660 {
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i >= arrayList2.size()) {
                throw o660.a();
            }
            ooo oooVar = (ooo) arrayList2.get(i);
            ArrayList arrayList3 = oooVar.f25604a;
            ArrayList arrayList4 = this.g;
            arrayList4.addAll(arrayList3);
            int size = oooVar.f25604a.size();
            if (!p(arrayList4, false)) {
                arrayList4.subList(arrayList4.size() - size, arrayList4.size()).clear();
            } else {
                if (this.j()) {
                    return arrayList4;
                }
                arrayList.add(oooVar);
                try {
                    return this.k(i + 1, arrayList);
                } catch (o660 unused) {
                    arrayList.remove(arrayList.size() - 1);
                    arrayList4.subList(arrayList4.size() - size, arrayList4.size()).clear();
                }
            }
            i++;
        }
    }

    public final List l(boolean z) {
        ArrayList arrayList = this.h;
        List listK = null;
        if (arrayList.size() > 25) {
            arrayList.clear();
            return null;
        }
        this.g.clear();
        if (z) {
            Collections.reverse(arrayList);
        }
        try {
            listK = k(0, new ArrayList());
        } catch (o660 unused) {
        }
        if (z) {
            Collections.reverse(arrayList);
        }
        return listK;
    }

    public final paj n(p68 p68Var, tdq tdqVar, boolean z, boolean z2) throws o660 {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int[][] iArr;
        int[] iArr2 = this.b;
        Arrays.fill(iArr2, 0);
        if (z2) {
            jl60.f(tdqVar.b[0], p68Var, iArr2);
        } else {
            jl60.e(tdqVar.b[1], p68Var, iArr2);
            int i = 0;
            for (int length = iArr2.length - 1; i < length; length--) {
                int i2 = iArr2[i];
                iArr2[i] = iArr2[length];
                iArr2[length] = i2;
                i++;
            }
        }
        float fH = q7x.H(iArr2) / 17.0f;
        int[] iArr3 = tdqVar.b;
        int i3 = tdqVar.f33781a;
        float f = (iArr3[1] - iArr3[0]) / 15.0f;
        if (Math.abs(fH - f) / f > 0.3f) {
            throw o660.a();
        }
        int i4 = 0;
        while (true) {
            int length2 = iArr2.length;
            float[] fArr = this.d;
            float[] fArr2 = this.c;
            int[] iArr4 = this.f;
            int[] iArr5 = this.e;
            if (i4 >= length2) {
                int iH = q7x.H(iArr5);
                int iH2 = q7x.H(iArr4);
                if (iH > 13) {
                    z3 = false;
                    z4 = true;
                } else if (iH < 4) {
                    z4 = false;
                    z3 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                if (iH2 > 13) {
                    z5 = false;
                    z6 = true;
                } else if (iH2 < 4) {
                    z6 = false;
                    z5 = true;
                } else {
                    z5 = false;
                    z6 = false;
                }
                int i5 = (iH + iH2) - 17;
                boolean z7 = (iH & 1) == 1;
                boolean z8 = (iH2 & 1) == 0;
                boolean z9 = z3;
                boolean z10 = z4;
                boolean z11 = z5;
                boolean z12 = z6;
                if (i5 != -1) {
                    if (i5 != 0) {
                        if (i5 != 1) {
                            throw o660.a();
                        }
                        if (z7) {
                            if (z8) {
                                throw o660.a();
                            }
                            z10 = true;
                            z9 = z3;
                            z11 = z5;
                            z12 = z6;
                        } else {
                            if (!z8) {
                                throw o660.a();
                            }
                            z12 = true;
                            z9 = z3;
                            z10 = z4;
                            z11 = z5;
                        }
                    } else if (z7) {
                        if (!z8) {
                            throw o660.a();
                        }
                        if (iH < iH2) {
                            z9 = true;
                            z12 = true;
                            z10 = z4;
                            z11 = z5;
                        } else {
                            z10 = true;
                            z11 = true;
                            z9 = z3;
                            z12 = z6;
                        }
                    } else if (z8) {
                        throw o660.a();
                    }
                } else if (z7) {
                    if (z8) {
                        throw o660.a();
                    }
                    z9 = true;
                    z10 = z4;
                    z11 = z5;
                    z12 = z6;
                } else {
                    if (!z8) {
                        throw o660.a();
                    }
                    z11 = true;
                    z9 = z3;
                    z10 = z4;
                    z12 = z6;
                }
                if (z9) {
                    if (z10) {
                        throw o660.a();
                    }
                    o4.h(fArr2, iArr5);
                }
                if (z10) {
                    o4.g(fArr2, iArr5);
                }
                if (z11) {
                    if (z12) {
                        throw o660.a();
                    }
                    o4.h(fArr2, iArr4);
                }
                if (z12) {
                    o4.g(fArr, iArr4);
                }
                int i6 = (((i3 * 4) + (z ? 0 : 2)) + (!z2 ? 1 : 0)) - 1;
                int length3 = iArr5.length - 1;
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    iArr = o;
                    if (length3 < 0) {
                        break;
                    }
                    if (i3 != 0 || !z || !z2) {
                        i7 += iArr5[length3] * iArr[i6][length3 * 2];
                    }
                    i8 += iArr5[length3];
                    length3--;
                }
                int i9 = 0;
                for (int length4 = iArr4.length - 1; length4 >= 0; length4--) {
                    if (i3 != 0 || !z || !z2) {
                        i9 += iArr4[length4] * iArr[i6][(length4 * 2) + 1];
                    }
                }
                int i10 = i7 + i9;
                if ((i8 & 1) != 0 || i8 > 13 || i8 < 4) {
                    throw o660.a();
                }
                int i11 = (13 - i8) / 2;
                int i12 = k[i11];
                return new paj(vqd.a(xww.M(iArr5, i12, true), l[i11], xww.M(iArr4, 9 - i12, false), m[i11]), i10);
            }
            float f2 = (iArr2[i4] * 1.0f) / fH;
            int i13 = (int) (0.5f + f2);
            if (i13 < 1) {
                if (f2 < 0.3f) {
                    throw o660.a();
                }
                i13 = 1;
            } else if (i13 > 8) {
                if (f2 > 8.7f) {
                    throw o660.a();
                }
                i13 = 8;
            }
            int i14 = i4 / 2;
            if ((i4 & 1) == 0) {
                iArr5[i14] = i13;
                fArr2[i14] = f2 - i13;
            } else {
                iArr4[i14] = i13;
                fArr[i14] = f2 - i13;
            }
            i4++;
        }
    }

    public final List o(p68 p68Var, int i) throws o660 {
        boolean zEquals;
        ArrayList arrayList = this.g;
        arrayList.clear();
        boolean z = false;
        while (!z) {
            try {
                arrayList.add(q(p68Var, arrayList, i));
            } catch (o660 e) {
                if (arrayList.isEmpty()) {
                    throw e;
                }
                z = true;
            }
        }
        if (j() && p(arrayList, true)) {
            return arrayList;
        }
        ArrayList arrayList2 = this.h;
        boolean zIsEmpty = arrayList2.isEmpty();
        int i2 = 0;
        boolean zEquals2 = false;
        while (true) {
            if (i2 >= arrayList2.size()) {
                zEquals = false;
                break;
            }
            ooo oooVar = (ooo) arrayList2.get(i2);
            int i3 = oooVar.b;
            ArrayList arrayList3 = oooVar.f25604a;
            if (i3 > i) {
                zEquals = arrayList3.equals(arrayList);
                break;
            }
            zEquals2 = arrayList3.equals(arrayList);
            i2++;
        }
        if (!zEquals && !zEquals2) {
            Iterator it = arrayList2.iterator();
            loop2: while (true) {
                if (!it.hasNext()) {
                    arrayList2.add(i2, new ooo(arrayList, i));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ooo oooVar2 = (ooo) it2.next();
                        if (oooVar2.f25604a.size() != arrayList.size()) {
                            Iterator it3 = oooVar2.f25604a.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    it2.remove();
                                    break;
                                }
                            } while (arrayList.contains((ioo) it3.next()));
                        }
                    }
                    break;
                }
                ooo oooVar3 = (ooo) it.next();
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break loop2;
                    }
                    ioo iooVar = (ioo) it4.next();
                    Iterator it5 = oooVar3.f25604a.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            if (iooVar.equals((ioo) it5.next())) {
                            }
                        }
                    }
                }
            }
        }
        if (!zIsEmpty) {
            List listL = l(false);
            if (listL != null) {
                return listL;
            }
            List listL2 = l(true);
            if (listL2 != null) {
                return listL2;
            }
        }
        throw o660.a();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:114:0x0221  */
    /* JADX WARN: Code duplicated, block: B:124:0x023f A[LOOP:0: B:10:0x001c->B:124:0x023f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d9  */
    public final ioo q(p68 p68Var, ArrayList arrayList, int i) throws o660 {
        int i2;
        int i3;
        int i4;
        int iF;
        int i5;
        int[] iArr;
        tdq tdqVar;
        int iE;
        paj pajVarN;
        int i6;
        int[] iArr2;
        int i7 = 2;
        int i8 = 0;
        int i9 = 1;
        boolean z = arrayList.size() % 2 == 0;
        if (this.j) {
            z = !z;
        }
        int i10 = -1;
        boolean z2 = true;
        paj pajVarN2 = null;
        while (true) {
            int[] iArr3 = this.f24607a;
            iArr3[i8] = i8;
            iArr3[i9] = i8;
            iArr3[i7] = i8;
            int i11 = 3;
            iArr3[3] = i8;
            int i12 = p68Var.b;
            int i13 = i10 >= 0 ? i10 : arrayList.isEmpty() ? i8 : ((ioo) dw9.l(i9, arrayList)).c.b[i9];
            int i14 = arrayList.size() % i7 != 0 ? i9 : i8;
            int i15 = i7;
            if (this.j) {
                i14 ^= 1;
            }
            int i16 = i8;
            while (i13 < i12) {
                boolean zD = p68Var.d(i13);
                int i17 = !zD;
                if (zD) {
                    i16 = i17;
                    break;
                }
                i13++;
                i16 = i17;
            }
            int i18 = i8;
            int i19 = i13;
            while (true) {
                if (i13 >= i12) {
                    throw o660.a();
                }
                i2 = i8;
                if (p68Var.d(i13) != i16) {
                    iArr3[i18] = iArr3[i18] + i9;
                    i3 = i9;
                    i11 = i11;
                } else {
                    if (i18 == i11) {
                        if (i14 != 0) {
                            int length = iArr3.length;
                            int i20 = i2;
                            while (true) {
                                i4 = i9;
                                if (i20 >= length / 2) {
                                    break;
                                }
                                int i21 = iArr3[i20];
                                int i22 = (length - i20) - 1;
                                iArr3[i20] = iArr3[i22];
                                iArr3[i22] = i21;
                                i20++;
                                i9 = i4;
                            }
                        } else {
                            i4 = i9;
                        }
                        if (o4.i(iArr3)) {
                            break;
                        }
                        if (i14 != 0) {
                            int length2 = iArr3.length;
                            for (int i23 = 0; i23 < length2 / 2; i23++) {
                                int i24 = iArr3[i23];
                                int i25 = (length2 - i23) - 1;
                                iArr3[i23] = iArr3[i25];
                                iArr3[i25] = i24;
                            }
                        }
                        i3 = 1;
                        i2 = 0;
                        i19 = iArr3[0] + iArr3[1] + i19;
                        iArr3[0] = iArr3[i15];
                        iArr3[1] = iArr3[i11];
                        iArr3[i15] = 0;
                        iArr3[i11] = 0;
                        i18--;
                    } else {
                        i3 = i9;
                        i11 = i11;
                        i18++;
                    }
                    iArr3[i18] = i3;
                    i16 ^= 1;
                }
                i13++;
                i8 = i2;
                i11 = i11;
                i9 = i3;
            }
            int[] iArr4 = this.i;
            iArr4[i2] = i19;
            iArr4[i4] = i13;
            if (z) {
                int i26 = i19 - 1;
                while (i26 >= 0 && !p68Var.d(i26)) {
                    i26--;
                }
                i19 = i26 + 1;
                i5 = iArr4[i2] - i19;
                iF = iArr4[i4];
            } else {
                iF = p68Var.f(i13 + 1);
                i5 = iF - iArr4[i4];
            }
            int i27 = i19;
            System.arraycopy(iArr3, i2, iArr3, i4, iArr3.length - 1);
            iArr3[i2] = i5;
            try {
                int[][] iArr5 = n;
                int i28 = 0;
                while (true) {
                    if (i28 >= 6) {
                        iArr = iArr4;
                        try {
                            throw o660.a();
                        } catch (o660 unused) {
                        }
                    } else if (jl60.d(iArr3, iArr5[i28], 0.45f) < 0.2f) {
                        if (!arrayList.isEmpty()) {
                            int i29 = 0;
                            while (true) {
                                if (i29 < 10) {
                                    int[] iArr6 = p[i29];
                                    if (arrayList.size() + 1 <= iArr6.length) {
                                        int size = arrayList.size();
                                        while (true) {
                                            if (size < iArr6.length) {
                                                if (iArr6[size] == i28) {
                                                    int i30 = 0;
                                                    while (true) {
                                                        if (i30 < arrayList.size()) {
                                                            iArr2 = iArr4;
                                                            if (iArr6[(size - i30) - 1] == ((ioo) arrayList.get((arrayList.size() - i30) - 1)).c.f33781a) {
                                                                i30++;
                                                                iArr4 = iArr2;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    iArr2 = iArr4;
                                                }
                                                size++;
                                                iArr4 = iArr2;
                                                i28 = i28;
                                                i27 = i27;
                                                iF = iF;
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                    i29++;
                                    iArr4 = iArr4;
                                    i28 = i28;
                                    i27 = i27;
                                    iF = iF;
                                } else {
                                    iArr = iArr4;
                                }
                            }
                        }
                        iArr = iArr4;
                        if (!arrayList.isEmpty()) {
                            int[] iArr7 = ((ioo) dw9.l(1, arrayList)).c.b;
                            int i31 = iArr7[0];
                            int i32 = iArr7[1];
                            float f = ((i32 - i31) / 15.0f) * 17.0f;
                            float f2 = i32;
                            float f3 = f * 2.0f;
                            float f4 = (0.9f * f3) + f2;
                            float f5 = (f3 * 1.1f) + f2;
                            float f6 = i27;
                            if (f6 < f4 || f6 > f5) {
                            }
                            if (tdqVar == null) {
                                i6 = iArr[0];
                                if (p68Var.d(i6)) {
                                    iE = p68Var.e(p68Var.f(i6));
                                } else {
                                    iE = p68Var.f(p68Var.e(i6));
                                }
                            } else {
                                try {
                                    pajVarN2 = n(p68Var, tdqVar, z, true);
                                    z2 = false;
                                } catch (o660 unused2) {
                                    int i33 = iArr[0];
                                    iE = p68Var.d(i33) ? p68Var.e(p68Var.f(i33)) : p68Var.f(p68Var.e(i33));
                                    i10 = iE;
                                }
                                if (!z2) {
                                    if (arrayList.isEmpty() && ((ioo) dw9.l(1, arrayList)).b == null) {
                                        throw o660.a();
                                    }
                                    try {
                                        pajVarN = n(p68Var, tdqVar, z, false);
                                    } catch (o660 unused3) {
                                        pajVarN = null;
                                    }
                                    return new ioo(pajVarN2, pajVarN, tdqVar);
                                }
                                i7 = i15;
                                i8 = 0;
                                i9 = 1;
                            }
                            i10 = iE;
                            if (!z2) {
                                if (arrayList.isEmpty()) {
                                }
                                pajVarN = n(p68Var, tdqVar, z, false);
                                return new ioo(pajVarN2, pajVarN, tdqVar);
                            }
                            i7 = i15;
                            i8 = 0;
                            i9 = 1;
                        }
                        tdqVar = new tdq(i28, i27, iF, i, new int[]{i27, iF});
                        if (tdqVar == null) {
                            i6 = iArr[0];
                            if (p68Var.d(i6)) {
                                iE = p68Var.e(p68Var.f(i6));
                            } else {
                                iE = p68Var.f(p68Var.e(i6));
                            }
                        } else {
                            pajVarN2 = n(p68Var, tdqVar, z, true);
                            z2 = false;
                            if (!z2) {
                                if (arrayList.isEmpty()) {
                                }
                                pajVarN = n(p68Var, tdqVar, z, false);
                                return new ioo(pajVarN2, pajVarN, tdqVar);
                            }
                            i7 = i15;
                            i8 = 0;
                            i9 = 1;
                        }
                        i10 = iE;
                        if (!z2) {
                            if (arrayList.isEmpty()) {
                            }
                            pajVarN = n(p68Var, tdqVar, z, false);
                            return new ioo(pajVarN2, pajVarN, tdqVar);
                        }
                        i7 = i15;
                        i8 = 0;
                        i9 = 1;
                    } else {
                        i28++;
                    }
                    tdqVar = null;
                    if (tdqVar == null) {
                        i6 = iArr[0];
                        if (p68Var.d(i6)) {
                            iE = p68Var.e(p68Var.f(i6));
                        } else {
                            iE = p68Var.f(p68Var.e(i6));
                        }
                    } else {
                        pajVarN2 = n(p68Var, tdqVar, z, true);
                        z2 = false;
                        if (!z2) {
                            if (arrayList.isEmpty()) {
                            }
                            pajVarN = n(p68Var, tdqVar, z, false);
                            return new ioo(pajVarN2, pajVarN, tdqVar);
                        }
                        i7 = i15;
                        i8 = 0;
                        i9 = 1;
                    }
                    i10 = iE;
                    if (!z2) {
                        if (arrayList.isEmpty()) {
                        }
                        pajVarN = n(p68Var, tdqVar, z, false);
                        return new ioo(pajVarN2, pajVarN, tdqVar);
                    }
                    i7 = i15;
                    i8 = 0;
                    i9 = 1;
                }
            } catch (o660 unused4) {
            }
        }
    }

    @Override // a.jl60, a.rae0
    public final void reset() {
        this.g.clear();
        this.h.clear();
    }
}
