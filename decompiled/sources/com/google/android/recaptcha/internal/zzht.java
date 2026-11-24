package com.google.android.recaptcha.internal;

import a.bkx;
import a.itt0;
import a.kkx;
import a.l1e0;
import a.r3d;
import a.w6x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
public final class zzht implements zzgx {
    public static final zzht zza = new zzht();

    private zzht() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            itt0.g(4, 3, null);
            return;
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            itt0.g(4, 5, null);
            return;
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 != null) {
            zzgdVar.zzc().zze(i, zzb(objZza, objZza2));
        } else {
            itt0.g(4, 5, null);
        }
    }

    public final Object zzb(Object obj, Object obj2) throws zzce {
        boolean z = obj instanceof Byte;
        if (z && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z2 = obj instanceof Short;
        if (z2 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z3 = obj instanceof Integer;
        if (z3 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
        }
        boolean z4 = obj instanceof Long;
        if (z4 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() ^ ((Number) obj2).longValue());
        }
        int iC = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(Charsets.UTF_8);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (iC < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[iC] ^ ((Number) obj2).byteValue())));
                    iC++;
                }
                return CollectionsKt.G0(arrayList);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (iC < length2) {
                    iC = w6x.c(charArray[iC] ^ ((Number) obj2).intValue(), iC, 1, arrayList2);
                }
                return CollectionsKt.K0(arrayList2);
            }
        }
        if (z && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b : bArr) {
                arrayList3.add(Byte.valueOf((byte) (b ^ ((Number) obj).byteValue())));
            }
            return arrayList3.toArray(new Byte[0]);
        }
        if (z2 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s : sArr) {
                arrayList4.add(Short.valueOf((short) (s ^ ((Number) obj).shortValue())));
            }
            return arrayList4.toArray(new Short[0]);
        }
        if (z3 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length;
            ArrayList arrayList5 = new ArrayList(length3);
            int iC2 = 0;
            while (iC2 < length3) {
                iC2 = w6x.c(iArr[iC2] ^ ((Number) obj).intValue(), iC2, 1, arrayList5);
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z4 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j : jArr) {
                arrayList6.add(Long.valueOf(j ^ ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        boolean z5 = obj instanceof byte[];
        if (z5 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList7 = new ArrayList(bArr2.length);
            for (byte b2 : bArr2) {
                arrayList7.add(Byte.valueOf((byte) (b2 ^ ((Number) obj2).byteValue())));
            }
            return arrayList7.toArray(new Byte[0]);
        }
        boolean z6 = obj instanceof short[];
        if (z6 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList8 = new ArrayList(sArr2.length);
            for (short s2 : sArr2) {
                arrayList8.add(Short.valueOf((short) (s2 ^ ((Number) obj2).shortValue())));
            }
            return arrayList8.toArray(new Short[0]);
        }
        boolean z7 = obj instanceof int[];
        if (z7 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            int length4 = iArr2.length;
            ArrayList arrayList9 = new ArrayList(length4);
            int iC3 = 0;
            while (iC3 < length4) {
                iC3 = w6x.c(iArr2[iC3] ^ ((Number) obj2).intValue(), iC3, 1, arrayList9);
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z8 = obj instanceof long[];
        if (z8 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList10 = new ArrayList(jArr2.length);
            for (long j2 : jArr2) {
                arrayList10.add(Long.valueOf(j2 ^ ((Number) obj2).longValue()));
            }
            return arrayList10.toArray(new Long[0]);
        }
        if (z5 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length5 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzgw.zza(this, length5, bArr4.length);
            IntRange intRangeO = l1e0.o(0, length5);
            ArrayList arrayList11 = new ArrayList(r3d.q(intRangeO, 10));
            Iterator it = intRangeO.iterator();
            while (((kkx) it).c) {
                int iNextInt = ((bkx) it).nextInt();
                arrayList11.add(Byte.valueOf((byte) (bArr4[iNextInt] ^ bArr3[iNextInt])));
            }
            return arrayList11.toArray(new Byte[0]);
        }
        if (z6 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length6 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzgw.zza(this, length6, sArr4.length);
            IntRange intRangeO2 = l1e0.o(0, length6);
            ArrayList arrayList12 = new ArrayList(r3d.q(intRangeO2, 10));
            Iterator it2 = intRangeO2.iterator();
            while (((kkx) it2).c) {
                int iNextInt2 = ((bkx) it2).nextInt();
                arrayList12.add(Short.valueOf((short) (sArr4[iNextInt2] ^ sArr3[iNextInt2])));
            }
            return arrayList12.toArray(new Short[0]);
        }
        if (z7 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length7 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzgw.zza(this, length7, iArr4.length);
            IntRange intRangeO3 = l1e0.o(0, length7);
            ArrayList arrayList13 = new ArrayList(r3d.q(intRangeO3, 10));
            Iterator it3 = intRangeO3.iterator();
            while (((kkx) it3).c) {
                int iNextInt3 = ((bkx) it3).nextInt();
                arrayList13.add(Integer.valueOf(iArr4[iNextInt3] ^ iArr3[iNextInt3]));
            }
            return arrayList13.toArray(new Integer[0]);
        }
        if (!z8 || !(obj2 instanceof long[])) {
            itt0.g(4, 5, null);
            return null;
        }
        long[] jArr3 = (long[]) obj;
        int length8 = jArr3.length;
        long[] jArr4 = (long[]) obj2;
        zzgw.zza(this, length8, jArr4.length);
        IntRange intRangeO4 = l1e0.o(0, length8);
        ArrayList arrayList14 = new ArrayList(r3d.q(intRangeO4, 10));
        Iterator it4 = intRangeO4.iterator();
        while (((kkx) it4).c) {
            int iNextInt4 = ((bkx) it4).nextInt();
            arrayList14.add(Long.valueOf(jArr3[iNextInt4] ^ jArr4[iNextInt4]));
        }
        return arrayList14.toArray(new Long[0]);
    }
}
