package a;

import java.util.ArrayList;
import java.util.Collections;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class dbz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hz40 f5824a;
    public androidx.compose.foundation.lazy.layout.c b;
    public int c;
    public final iz40 d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public hwk j;

    public dbz() {
        long[] jArr = u1h0.f34903a;
        this.f5824a = new hz40();
        iz40 iz40Var = v1h0.f36630a;
        this.d = new iz40();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    public static void c(kbz kbzVar, int i, bbz bbzVar, boolean z) {
        int i2 = 0;
        long jI = kbzVar.i(0);
        long jA = z ? ikx.a(0, i, 1, jI) : ikx.a(i, 0, 2, jI);
        zaz[] zazVarArr = bbzVar.f2330a;
        int length = zazVarArr.length;
        int i3 = 0;
        while (i2 < length) {
            zaz zazVar = zazVarArr[i2];
            int i4 = i3 + 1;
            if (zazVar != null) {
                zazVar.l = ikx.d(jA, ikx.c(kbzVar.i(i3), jI));
            }
            i2++;
            i3 = i4;
        }
    }

    public static int h(int[] iArr, kbz kbzVar, boolean z) {
        int iJ = kbzVar.j();
        int iB = kbzVar.b() + iJ;
        int iMax = 0;
        while (iJ < iB) {
            int iZ = j120.Z(kbzVar, z) + iArr[iJ];
            iArr[iJ] = iZ;
            iMax = Math.max(iMax, iZ);
            iJ++;
        }
        return iMax;
    }

    public final zaz a(int i, Object obj) {
        bbz bbzVar = (bbz) this.f5824a.g(obj);
        if (bbzVar != null) {
            return bbzVar.f2330a[i];
        }
        return null;
    }

    public final long b() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            zaz zazVar = (zaz) arrayList.get(i);
            dfv dfvVar = zazVar.o;
            if (dfvVar != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (zazVar.l >> 32)) + ((int) (dfvVar.u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (zazVar.l & 4294967295L)) + ((int) (dfvVar.u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:210:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:257:0x00d7 A[EDGE_INSN: B:257:0x00d7->B:49:0x00d7 BREAK  A[LOOP:2: B:35:0x0097->B:47:0x00d0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0 A[LOOP:2: B:35:0x0097->B:47:0x00d0, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [a.yne, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r6v43, types: [a.zaz[]] */
    /* JADX WARN: Type inference failed for: r9v38, types: [a.zaz[]] */
    public final void d(int i, int i2, int i3, ArrayList arrayList, androidx.compose.foundation.lazy.layout.c cVar, p4 p4Var, boolean z, boolean z2, int i4, boolean z3, int i5, int i6, vne vneVar, afv afvVar) {
        boolean z4;
        hz40 hz40Var;
        long j;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        androidx.compose.foundation.lazy.layout.c cVar2;
        iz40 iz40Var;
        ArrayList arrayList5;
        int[] iArr;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int[] iArr2;
        int i7;
        long[] jArr;
        androidx.compose.foundation.lazy.layout.c cVar3;
        ArrayList arrayList9;
        int i8;
        int i9;
        int[] iArr3;
        ArrayList arrayList10;
        long[] jArr2;
        ArrayList arrayList11;
        androidx.compose.foundation.lazy.layout.c cVar4;
        ArrayList arrayList12;
        int i10;
        ArrayList arrayList13;
        ArrayList arrayList14;
        kbz kbzVar;
        int i11;
        ?? r13;
        byte b;
        int i12;
        int i13;
        hz40 hz40Var2;
        long j2;
        boolean z5;
        long j3;
        int i14;
        int i15;
        long j4;
        ArrayList arrayList15 = arrayList;
        int i16 = i4;
        androidx.compose.foundation.lazy.layout.c cVar5 = this.b;
        this.b = cVar;
        int size = arrayList15.size();
        int i17 = 0;
        loop0: while (true) {
            z4 = false;
            hz40Var = this.f5824a;
            if (i17 >= size) {
                if (!hz40Var.i()) {
                    break;
                }
                e();
                return;
            }
            kbz kbzVar2 = (kbz) arrayList15.get(i17);
            int size2 = kbzVar2.g().size();
            for (int i18 = 0; i18 < size2; i18++) {
                Object objN = ((pu90) kbzVar2.g().get(i18)).n();
                if ((objN instanceof oaz ? (oaz) objN : null) != null) {
                    break loop0;
                }
            }
            i17++;
        }
        int i19 = this.c;
        kbz kbzVar3 = (kbz) CollectionsKt.firstOrNull(arrayList15);
        this.c = kbzVar3 != null ? kbzVar3.getIndex() : 0;
        long j5 = z ? ((long) i) & 4294967295L : ((long) i) << 32;
        boolean z6 = z2 || !z3;
        Object[] objArr = hz40Var.b;
        long[] jArr3 = hz40Var.f13891a;
        int length = jArr3.length - 2;
        iz40 iz40Var2 = this.d;
        if (length >= 0) {
            int i20 = 0;
            while (true) {
                long j6 = jArr3[i20];
                j = j5;
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i21 = 8 - ((~(i20 - length)) >>> 31);
                    for (int i22 = 0; i22 < i21; i22++) {
                        if ((j6 & 255) < 128) {
                            iz40Var2.a(objArr[(i20 << 3) + i22]);
                        }
                        j6 >>= 8;
                    }
                    if (i21 != 8) {
                        break;
                    }
                    if (i20 != length) {
                        break;
                    }
                    i20++;
                    j5 = j;
                } else if (i20 != length) {
                    break;
                    break;
                } else {
                    i20++;
                    j5 = j;
                }
            }
        } else {
            j = j5;
        }
        int size3 = arrayList15.size();
        int i23 = 0;
        while (true) {
            arrayList2 = this.i;
            arrayList3 = this.f;
            arrayList4 = this.e;
            if (i23 >= size3) {
                break;
            }
            kbz kbzVar4 = (kbz) arrayList15.get(i23);
            iz40Var2.l(kbzVar4.getKey());
            int size4 = kbzVar4.g().size();
            int i24 = 0;
            while (true) {
                if (i24 >= size4) {
                    i12 = size3;
                    i13 = i23;
                    hz40Var2 = hz40Var;
                    j2 = j;
                    i19 = i19;
                    f(kbzVar4.getKey());
                    break;
                }
                i12 = size3;
                Object objN2 = ((pu90) kbzVar4.g().get(i24)).n();
                i13 = i23;
                if ((objN2 instanceof oaz ? (oaz) objN2 : null) != null) {
                    bbz bbzVar = (bbz) hz40Var.g(kbzVar4.getKey());
                    int iA = cVar5 != null ? cVar5.a(kbzVar4.getKey()) : -1;
                    boolean z7 = iA == -1 && cVar5 != null;
                    if (bbzVar != null) {
                        z5 = z;
                        hz40Var2 = hz40Var;
                        j3 = j;
                        if (z6) {
                            ArrayList arrayList16 = arrayList2;
                            bbz.b(bbzVar, kbzVar4, vneVar, afvVar, i5, i6, z5);
                            zaz[] zazVarArr = bbzVar.f2330a;
                            int length2 = zazVarArr.length;
                            int i25 = 0;
                            while (i25 < length2) {
                                zaz zazVar = zazVarArr[i25];
                                if (zazVar != null) {
                                    long j7 = j3;
                                    i15 = length2;
                                    i14 = i25;
                                    if (ikx.b(zazVar.l, 9223372034707292159L)) {
                                        j4 = j7;
                                    } else {
                                        j4 = j7;
                                        zazVar.l = ikx.d(zazVar.l, j4);
                                    }
                                } else {
                                    i14 = i25;
                                    i15 = length2;
                                    j4 = j3;
                                }
                                long j8 = j4;
                                length2 = i15;
                                j3 = j8;
                                i25 = i14 + 1;
                            }
                            j2 = j3;
                            if (z7) {
                                for (zaz zazVar2 : bbzVar.f2330a) {
                                    if (zazVar2 != null) {
                                        if (zazVar2.c()) {
                                            arrayList16.remove(zazVar2);
                                            hwk hwkVar = this.j;
                                            if (hwkVar != null) {
                                                vfc.J(hwkVar);
                                            }
                                        }
                                        zazVar2.a();
                                    }
                                }
                            }
                            g(kbzVar4, false);
                        }
                        break;
                    }
                    bbz bbzVar2 = new bbz(this);
                    z5 = z;
                    hz40Var2 = hz40Var;
                    ArrayList arrayList17 = arrayList3;
                    ArrayList arrayList18 = arrayList4;
                    j3 = j;
                    bbz.b(bbzVar2, kbzVar4, vneVar, afvVar, i5, i6, z5);
                    hz40Var2.n(kbzVar4.getKey(), bbzVar2);
                    if (kbzVar4.getIndex() == iA || iA == -1) {
                        long jI = kbzVar4.i(0);
                        c(kbzVar4, (int) (z5 ? jI & 4294967295L : jI >> 32), bbzVar2, z5);
                        if (z7) {
                            for (zaz zazVar3 : bbzVar2.f2330a) {
                                if (zazVar3 != null) {
                                    zazVar3.a();
                                }
                            }
                        }
                    } else if (iA < i19) {
                        arrayList18.add(kbzVar4);
                    } else {
                        arrayList17.add(kbzVar4);
                    }
                    j2 = j3;
                    break;
                    break;
                }
                i24++;
                arrayList3 = arrayList3;
                arrayList2 = arrayList2;
                i19 = i19;
                j = j;
                hz40Var = hz40Var;
                arrayList4 = arrayList4;
                size3 = i12;
                i23 = i13;
            }
            i23 = i13 + 1;
            arrayList15 = arrayList;
            hz40Var = hz40Var2;
            i19 = i19;
            size3 = i12;
            j = j2;
        }
        ArrayList arrayList19 = arrayList2;
        hz40 hz40Var3 = hz40Var;
        ArrayList arrayList20 = arrayList3;
        ArrayList arrayList21 = arrayList4;
        char c = 2;
        int[] iArr4 = new int[i16];
        if (z6 && cVar5 != null) {
            if (arrayList21.isEmpty()) {
                b = 0;
            } else {
                if (arrayList21.size() > 1) {
                    v3d.t(new cbz(cVar5, (byte) 2), arrayList21);
                }
                int size5 = arrayList21.size();
                int i26 = 0;
                while (i26 < size5) {
                    kbz kbzVar5 = (kbz) arrayList21.get(i26);
                    int iH = i5 - h(iArr4, kbzVar5, z);
                    char c2 = c;
                    Object objG = hz40Var3.g(kbzVar5.getKey());
                    objG.getClass();
                    c(kbzVar5, iH, (bbz) objG, z);
                    g(kbzVar5, false);
                    i26++;
                    c = c2;
                }
                b = 0;
                qx3.o(iArr4, 0, 0, 6);
            }
            if (!arrayList20.isEmpty()) {
                if (arrayList20.size() > 1) {
                    v3d.t(new cbz(cVar5, b), arrayList20);
                }
                int size6 = arrayList20.size();
                for (int i27 = 0; i27 < size6; i27++) {
                    kbz kbzVar6 = (kbz) arrayList20.get(i27);
                    int iH2 = (h(iArr4, kbzVar6, z) + i6) - j120.Z(kbzVar6, z);
                    Object objG2 = hz40Var3.g(kbzVar6.getKey());
                    objG2.getClass();
                    c(kbzVar6, iH2, (bbz) objG2, z);
                    g(kbzVar6, false);
                }
                qx3.o(iArr4, 0, 0, 6);
            }
        }
        Object[] objArr2 = iz40Var2.b;
        long[] jArr4 = iz40Var2.f15620a;
        int length3 = jArr4.length - 2;
        ArrayList arrayList22 = this.h;
        ArrayList arrayList23 = this.g;
        if (length3 >= 0) {
            iz40Var = iz40Var2;
            int i28 = 0;
            while (true) {
                long j9 = jArr4[i28];
                arrayList5 = arrayList21;
                Object[] objArr3 = objArr2;
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i29 = 8 - ((~(i28 - length3)) >>> 31);
                    long j10 = j9;
                    int i30 = 0;
                    ?? r20 = z4;
                    while (i30 < i29) {
                        if ((j10 & 255) < 128) {
                            Object obj = objArr3[(i28 << 3) + i30];
                            bbz bbzVar3 = (bbz) hz40Var3.g(obj);
                            if (bbzVar3 == null) {
                                i9 = i30;
                                iArr3 = iArr4;
                                arrayList10 = arrayList20;
                                jArr2 = jArr4;
                                arrayList11 = arrayList22;
                                cVar4 = cVar5;
                                arrayList12 = arrayList19;
                                i10 = length3;
                                arrayList13 = arrayList23;
                            } else {
                                i9 = i30;
                                arrayList10 = arrayList20;
                                int iA2 = cVar.a(obj);
                                jArr2 = jArr4;
                                int iMin = Math.min(i16, bbzVar3.e);
                                bbzVar3.e = iMin;
                                int i31 = length3;
                                bbzVar3.d = Math.min(i16 - iMin, bbzVar3.d);
                                if (iA2 == -1) {
                                    zaz[] zazVarArr2 = bbzVar3.f2330a;
                                    int length4 = zazVarArr2.length;
                                    int i32 = 0;
                                    boolean z8 = false;
                                    int i33 = 0;
                                    ?? r21 = r20;
                                    while (i32 < length4) {
                                        zaz[] zazVarArr3 = zazVarArr2;
                                        zaz zazVar4 = zazVarArr3[i32];
                                        int i34 = i33 + 1;
                                        if (zazVar4 != null) {
                                            if (zazVar4.c()) {
                                                i11 = i32;
                                                length4 = length4;
                                                arrayList23 = arrayList23;
                                                r13 = r21;
                                            } else {
                                                i11 = i32;
                                                if (((Boolean) ((hgk0) zazVar4.k).getValue()).booleanValue()) {
                                                    zazVar4.d();
                                                    bbzVar3.f2330a[i33] = r21;
                                                    arrayList19.remove(zazVar4);
                                                    hwk hwkVar2 = this.j;
                                                    if (hwkVar2 != null) {
                                                        vfc.J(hwkVar2);
                                                    }
                                                } else {
                                                    dfv dfvVar = zazVar4.o;
                                                    if (dfvVar != null) {
                                                        cfq cfqVar = zazVar4.f;
                                                        if (zazVar4.c() || cfqVar == null) {
                                                            r13 = r21;
                                                        } else {
                                                            ((hgk0) zazVar4.j).setValue(Boolean.TRUE);
                                                            ?? r14 = r21;
                                                            qjj.W(zazVar4.f44088a, r14, r14, new c6y((Object) zazVar4, (Object) cfqVar, (Object) dfvVar, (yje) r21, (byte) 13), 3);
                                                            r13 = r14;
                                                        }
                                                    } else {
                                                        r13 = r21;
                                                    }
                                                    if (zazVar4.c()) {
                                                        arrayList19.add(zazVar4);
                                                        hwk hwkVar3 = this.j;
                                                        r13 = r13;
                                                        if (hwkVar3 != null) {
                                                            vfc.J(hwkVar3);
                                                            r13 = r13;
                                                        }
                                                    } else {
                                                        zazVar4.d();
                                                        bbzVar3.f2330a[i33] = r13;
                                                    }
                                                }
                                                i32 = i11 + 1;
                                                r21 = r13;
                                                arrayList23 = arrayList23;
                                                zazVarArr2 = zazVarArr3;
                                                i33 = i34;
                                                length4 = length4;
                                            }
                                            z8 = true;
                                            i32 = i11 + 1;
                                            r21 = r13;
                                            arrayList23 = arrayList23;
                                            zazVarArr2 = zazVarArr3;
                                            i33 = i34;
                                            length4 = length4;
                                        } else {
                                            i11 = i32;
                                        }
                                        length4 = length4;
                                        arrayList23 = arrayList23;
                                        r13 = r21;
                                        i32 = i11 + 1;
                                        r21 = r13;
                                        arrayList23 = arrayList23;
                                        zazVarArr2 = zazVarArr3;
                                        i33 = i34;
                                        length4 = length4;
                                    }
                                    arrayList14 = arrayList23;
                                    if (!z8) {
                                        f(obj);
                                    }
                                } else {
                                    arrayList14 = arrayList23;
                                    p4e p4eVar = bbzVar3.b;
                                    p4eVar.getClass();
                                    kbz kbzVarW0 = p4Var.w0(iA2, bbzVar3.d, bbzVar3.e, p4eVar.f26347a);
                                    kbzVarW0.e();
                                    zaz[] zazVarArr4 = bbzVar3.f2330a;
                                    int length5 = zazVarArr4.length;
                                    int i35 = 0;
                                    while (true) {
                                        if (i35 < length5) {
                                            kbzVar = kbzVarW0;
                                            zaz zazVar5 = zazVarArr4[i35];
                                            if (zazVar5 != null && ((Boolean) ((hgk0) zazVar5.h).getValue()).booleanValue()) {
                                            }
                                            i35++;
                                            kbzVarW0 = kbzVar;
                                            zazVarArr4 = zazVarArr4;
                                        } else {
                                            kbzVar = kbzVarW0;
                                            if (cVar5 != null && iA2 == cVar5.a(obj)) {
                                                f(obj);
                                            }
                                        }
                                        cVar4 = cVar5;
                                        arrayList13 = arrayList14;
                                        kbz kbzVar7 = kbzVar;
                                        iArr3 = iArr4;
                                        arrayList11 = arrayList22;
                                        arrayList12 = arrayList19;
                                        i10 = i31;
                                        bbzVar3.a(kbzVar7, vneVar, afvVar, i5, i6, bbzVar3.c);
                                        if (iA2 < this.c) {
                                            arrayList13.add(kbzVar7);
                                        } else {
                                            arrayList11.add(kbzVar7);
                                        }
                                    }
                                }
                                iArr3 = iArr4;
                                arrayList11 = arrayList22;
                                cVar4 = cVar5;
                                arrayList13 = arrayList14;
                                arrayList12 = arrayList19;
                                i10 = i31;
                            }
                        } else {
                            i9 = i30;
                            iArr3 = iArr4;
                            arrayList10 = arrayList20;
                            jArr2 = jArr4;
                            arrayList11 = arrayList22;
                            cVar4 = cVar5;
                            arrayList12 = arrayList19;
                            i10 = length3;
                            arrayList13 = arrayList23;
                        }
                        j10 >>= 8;
                        i16 = i4;
                        arrayList22 = arrayList11;
                        i30 = i9 + 1;
                        arrayList23 = arrayList13;
                        length3 = i10;
                        arrayList19 = arrayList12;
                        iArr4 = iArr3;
                        cVar5 = cVar4;
                        arrayList20 = arrayList10;
                        jArr4 = jArr2;
                        r20 = 0;
                    }
                    cVar2 = cVar;
                    iArr = iArr4;
                    arrayList6 = arrayList20;
                    jArr = jArr4;
                    arrayList8 = arrayList22;
                    cVar3 = cVar5;
                    arrayList9 = arrayList19;
                    i8 = length3;
                    arrayList7 = arrayList23;
                    if (i29 != 8) {
                        break;
                    }
                } else {
                    cVar2 = cVar;
                    iArr = iArr4;
                    arrayList6 = arrayList20;
                    jArr = jArr4;
                    arrayList8 = arrayList22;
                    cVar3 = cVar5;
                    arrayList9 = arrayList19;
                    i8 = length3;
                    arrayList7 = arrayList23;
                }
                if (i28 == i8) {
                    break;
                }
                i28++;
                i16 = i4;
                arrayList22 = arrayList8;
                arrayList23 = arrayList7;
                length3 = i8;
                arrayList19 = arrayList9;
                iArr4 = iArr;
                cVar5 = cVar3;
                arrayList21 = arrayList5;
                objArr2 = objArr3;
                arrayList20 = arrayList6;
                jArr4 = jArr;
                z4 = false;
            }
        } else {
            cVar2 = cVar;
            iz40Var = iz40Var2;
            arrayList5 = arrayList21;
            iArr = iArr4;
            arrayList6 = arrayList20;
            arrayList7 = arrayList23;
            arrayList8 = arrayList22;
        }
        if (arrayList7.isEmpty()) {
            iArr2 = iArr;
        } else {
            if (arrayList7.size() > 1) {
                v3d.t(new cbz(cVar2, (byte) 3), arrayList7);
            }
            int size7 = arrayList7.size();
            int i36 = 0;
            while (i36 < size7) {
                kbz kbzVar8 = (kbz) arrayList7.get(i36);
                Object objG3 = hz40Var3.g(kbzVar8.getKey());
                objG3.getClass();
                bbz bbzVar4 = (bbz) objG3;
                int[] iArr5 = iArr;
                int iH3 = h(iArr5, kbzVar8, z);
                if (z2) {
                    long jI2 = ((kbz) CollectionsKt.U(arrayList)).i(0);
                    i7 = (int) (z ? jI2 & 4294967295L : jI2 >> 32);
                } else {
                    i7 = bbzVar4.f;
                }
                kbzVar8.a(i7 - iH3, bbzVar4.c, i2, i3);
                if (z6) {
                    g(kbzVar8, true);
                }
                i36++;
                iArr = iArr5;
            }
            iArr2 = iArr;
            qx3.o(iArr2, 0, 0, 6);
        }
        if (!arrayList8.isEmpty()) {
            if (arrayList8.size() > 1) {
                v3d.t(new cbz(cVar2, (byte) 1), arrayList8);
            }
            int size8 = arrayList8.size();
            for (int i37 = 0; i37 < size8; i37++) {
                kbz kbzVar9 = (kbz) arrayList8.get(i37);
                Object objG4 = hz40Var3.g(kbzVar9.getKey());
                objG4.getClass();
                bbz bbzVar5 = (bbz) objG4;
                kbzVar9.a((bbzVar5.g - j120.Z(kbzVar9, z)) + h(iArr2, kbzVar9, z), bbzVar5.c, i2, i3);
                if (z6) {
                    g(kbzVar9, true);
                }
            }
        }
        Collections.reverse(arrayList7);
        arrayList.addAll(0, arrayList7);
        arrayList.addAll(arrayList8);
        arrayList5.clear();
        arrayList6.clear();
        arrayList7.clear();
        arrayList8.clear();
        iz40Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[LOOP:0: B:7:0x0013->B:22:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[EDGE_INSN: B:26:0x005a->B:23:0x005a BREAK  A[LOOP:0: B:7:0x0013->B:22:0x0057], SYNTHETIC] */
    public final void e() {
        hz40 hz40Var = this.f5824a;
        if (hz40Var.j()) {
            Object[] objArr = hz40Var.c;
            long[] jArr = hz40Var.f13891a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (zaz zazVar : ((bbz) objArr[(i << 3) + i3]).f2330a) {
                                    if (zazVar != null) {
                                        zazVar.d();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            hz40Var.a();
        }
    }

    public final void f(Object obj) {
        bbz bbzVar = (bbz) this.f5824a.l(obj);
        if (bbzVar != null) {
            for (zaz zazVar : bbzVar.f2330a) {
                if (zazVar != null) {
                    zazVar.d();
                }
            }
        }
    }

    public final void g(kbz kbzVar, boolean z) {
        Object objG = this.f5824a.g(kbzVar.getKey());
        objG.getClass();
        zaz[] zazVarArr = ((bbz) objG).f2330a;
        int length = zazVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            zaz zazVar = zazVarArr[i];
            int i3 = i2 + 1;
            if (zazVar != null) {
                long jI = kbzVar.i(i2);
                long j = zazVar.l;
                if (!ikx.b(j, 9223372034707292159L) && !ikx.b(j, jI)) {
                    long jC = ikx.c(jI, j);
                    cfq cfqVar = zazVar.e;
                    if (cfqVar != null) {
                        long jC2 = ikx.c(((ikx) ((hgk0) zazVar.r).getValue()).f14950a, jC);
                        zazVar.e(jC2);
                        ((hgk0) zazVar.h).setValue(Boolean.TRUE);
                        zazVar.g = z;
                        qjj.W(zazVar.f44088a, null, null, new n1((Object) zazVar, (Object) cfqVar, jC2, (yje) null, (byte) 17), 3);
                    }
                }
                zazVar.l = jI;
            }
            i++;
            i2 = i3;
        }
    }
}
