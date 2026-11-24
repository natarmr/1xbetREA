package a;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
public final class wcf0 implements Map, Serializable {
    public static final wcf0 g = new wcf0(0, null, new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient tcf0 f38922a;
    public transient ucf0 b;
    public transient vcf0 c;
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    public wcf0(int i, Object obj, Object[] objArr) {
        this.d = obj;
        this.e = objArr;
        this.f = i;
    }

    public static zz2 a() {
        return new zz2(4);
    }

    public static wcf0 b(Map map) {
        if ((map instanceof wcf0) && !(map instanceof SortedMap)) {
            return (wcf0) map;
        }
        Set setEntrySet = map.entrySet();
        zz2 zz2Var = new zz2(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zz2Var.B(setEntrySet);
        return zz2Var.e(true);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0199  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    public static wcf0 d(int i, Object[] objArr, zz2 zz2Var) {
        boolean z;
        int i2;
        char c;
        ?? r3;
        char c2;
        short[] sArr;
        boolean z2;
        int i3;
        ?? r16;
        boolean z3;
        ?? r4;
        Object[] objArr2;
        d4x d4xVar;
        boolean z4;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return g;
        }
        d4x d4xVar2 = null;
        ?? r5 = 0;
        d4x d4xVar3 = null;
        d4x d4xVar4 = null;
        boolean z5 = false;
        int i5 = 1;
        if (i4 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new wcf0(1, null, objArrCopyOf);
        }
        x0x.H(i4, objArrCopyOf.length >> 1);
        int iK = f4x.k(i4);
        char c3 = 2;
        if (i4 != 1) {
            int i6 = iK - 1;
            if (iK <= 128) {
                byte[] bArr = new byte[iK];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i7 * 2;
                    int i10 = i8 * 2;
                    Object obj = objArrCopyOf[i9];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i9 ^ i5];
                    Objects.requireNonNull(obj2);
                    int iY = gkb.Y(obj.hashCode());
                    while (true) {
                        int i11 = iY & i6;
                        z2 = z5;
                        i3 = i5;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i10;
                            if (i8 < i7) {
                                objArrCopyOf[i10] = obj;
                                objArrCopyOf[i10 ^ 1] = obj2;
                            }
                            i8++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i12 == true ? 1 : 0])) {
                            int i13 = ~i12;
                            Object obj3 = objArrCopyOf[i13 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            d4xVar3 = new d4x(obj, obj2, obj3);
                            objArrCopyOf[i13 == true ? 1 : 0] = obj2;
                            break;
                        }
                        iY = i11 + 1;
                        z5 = z2;
                        i5 = i3;
                    }
                    i7++;
                    z5 = z2;
                    i5 = i3;
                }
                z = z5;
                i2 = i5;
                if (i8 == i4) {
                    r5 = bArr;
                    z4 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i8);
                    sArr[2] = d4xVar3;
                    r5 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i2 = 1;
                if (iK <= 32768) {
                    sArr = new short[iK];
                    Arrays.fill(sArr, (short) -1);
                    int i14 = 0;
                    for (int i15 = 0; i15 < i4; i15++) {
                        int i16 = i15 * 2;
                        int i17 = i14 * 2;
                        Object obj4 = objArrCopyOf[i16];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i16 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iY2 = gkb.Y(obj4.hashCode());
                        while (true) {
                            int i18 = iY2 & i6;
                            int i19 = sArr[i18] & 65535;
                            if (i19 == 65535) {
                                sArr[i18] = (short) i17;
                                if (i14 < i15) {
                                    objArrCopyOf[i17] = obj4;
                                    objArrCopyOf[i17 ^ 1] = obj5;
                                }
                                i14++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[i19 == true ? 1 : 0])) {
                                int i20 = ~i19;
                                Object obj6 = objArrCopyOf[i20 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                d4xVar4 = new d4x(obj4, obj5, obj6);
                                objArrCopyOf[i20 == true ? 1 : 0] = obj5;
                                break;
                            }
                            iY2 = i18 + 1;
                        }
                    }
                    if (i14 == i4) {
                        r5 = sArr;
                        z4 = z;
                    } else {
                        r5 = new Object[]{sArr, Integer.valueOf(i14), d4xVar4};
                        z4 = z;
                    }
                } else {
                    int[] iArr = new int[iK];
                    Arrays.fill(iArr, -1);
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < i4) {
                        int i23 = i21 * 2;
                        int i24 = i22 * 2;
                        Object obj7 = objArrCopyOf[i23];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i23 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iY3 = gkb.Y(obj7.hashCode());
                        while (true) {
                            int i25 = iY3 & i6;
                            int i26 = iArr[i25];
                            if (i26 == -1) {
                                iArr[i25] = i24;
                                if (i22 < i21) {
                                    objArrCopyOf[i24] = obj7;
                                    objArrCopyOf[i24 ^ 1] = obj8;
                                }
                                i22++;
                                c2 = c3;
                                break;
                            }
                            c2 = c3;
                            if (obj7.equals(objArrCopyOf[i26])) {
                                int i27 = i26 ^ 1;
                                Object obj9 = objArrCopyOf[i27];
                                Objects.requireNonNull(obj9);
                                d4xVar2 = new d4x(obj7, obj8, obj9);
                                objArrCopyOf[i27] = obj8;
                                break;
                            }
                            iY3 = i25 + 1;
                            c3 = c2;
                        }
                        i21++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i22 == i4) {
                        r3 = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i22);
                        objArr3[c] = d4xVar2;
                        r3 = objArr3;
                        r16 = z;
                    }
                }
            }
            z3 = r3 instanceof Object[];
            r4 = r3;
            if (z3) {
                objArr2 = (Object[]) r3;
                d4xVar = (d4x) objArr2[c];
                if (zz2Var != null) {
                    throw d4xVar.a();
                }
                zz2Var.c = d4xVar;
                Object obj10 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i2]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                r4 = obj10;
                i4 = iIntValue;
            }
            return new wcf0(i4, r4, objArrCopyOf);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        z4 = false;
        i2 = 1;
        c = 2;
        r3 = r5;
        r16 = z4;
        z3 = r3 instanceof Object[];
        r4 = r3;
        if (z3) {
            objArr2 = (Object[]) r3;
            d4xVar = (d4x) objArr2[c];
            if (zz2Var != null) {
                throw d4xVar.a();
            }
            zz2Var.c = d4xVar;
            Object obj11 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 * 2);
            r4 = obj11;
            i4 = iIntValue2;
        }
        return new wcf0(i4, r4, objArrCopyOf);
    }

    public static wcf0 g(Serializable serializable, Object obj, Serializable serializable2, Object obj2) {
        e3c.q(serializable, obj);
        e3c.q(serializable2, obj2);
        return d(2, new Object[]{serializable, obj, serializable2, obj2}, null);
    }

    public static wcf0 h(Class cls, Object obj) {
        e3c.q(cls, obj);
        return d(1, new Object[]{cls, obj}, null);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final f4x entrySet() {
        tcf0 tcf0Var = this.f38922a;
        if (tcf0Var != null) {
            return tcf0Var;
        }
        tcf0 tcf0Var2 = new tcf0(this, this.e, this.f);
        this.f38922a = tcf0Var2;
        return tcf0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return k9x.I(this, obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final f4x keySet() {
        ucf0 ucf0Var = this.b;
        if (ucf0Var != null) {
            return ucf0Var;
        }
        ucf0 ucf0Var2 = new ucf0(this, new vcf0(this.e, 0, this.f));
        this.b = ucf0Var2;
        return ucf0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.e;
            if (this.f == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iY = gkb.Y(obj.hashCode());
                    while (true) {
                        int i = iY & length;
                        int i2 = bArr[i] & 255;
                        if (i2 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i2])) {
                            obj2 = objArr[i2 ^ 1];
                        } else {
                            iY = i + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iY2 = gkb.Y(obj.hashCode());
                    while (true) {
                        int i3 = iY2 & length2;
                        int i4 = sArr[i3] & 65535;
                        if (i4 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i4])) {
                            obj2 = objArr[i4 ^ 1];
                        } else {
                            iY2 = i3 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iY3 = gkb.Y(obj.hashCode());
                    while (true) {
                        int i5 = iY3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iY3 = i5 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return d7x.A(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final s3x values() {
        vcf0 vcf0Var = this.c;
        if (vcf0Var != null) {
            return vcf0Var;
        }
        vcf0 vcf0Var2 = new vcf0(this.e, 1, this.f);
        this.c = vcf0Var2;
        return vcf0Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }

    public final String toString() {
        int i = this.f;
        e3c.s(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        eet0 eet0VarJ = ((tcf0) entrySet()).iterator();
        boolean z = true;
        while (true) {
            v3x v3xVar = (v3x) eet0VarJ;
            if (!v3xVar.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) v3xVar.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
    }
}
