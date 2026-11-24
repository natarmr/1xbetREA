package a;

/* JADX INFO: loaded from: classes2.dex */
public final class gfw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mpt0 f11226a;

    public gfw0(ugw0 ugw0Var, ugw0 ugw0Var2, Object obj) {
        this.f11226a = new mpt0(ugw0Var, ugw0Var2, obj, (byte) 3);
    }

    public static void a(aew0 aew0Var, mpt0 mpt0Var, Object obj, Object obj2) {
        eew0.b(aew0Var, (ugw0) mpt0Var.b, 1, obj);
        eew0.b(aew0Var, (ugw0) mpt0Var.c, 2, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0123  */
    /* JADX WARN: Code duplicated, block: B:46:0x0127  */
    /* JADX WARN: Code duplicated, block: B:47:0x0137  */
    /* JADX WARN: Code duplicated, block: B:48:0x0148  */
    /* JADX WARN: Code duplicated, block: B:49:0x014f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0157  */
    /* JADX WARN: Code duplicated, block: B:53:0x015b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0168  */
    /* JADX WARN: Code duplicated, block: B:55:0x0175  */
    /* JADX WARN: Code duplicated, block: B:56:0x0181  */
    /* JADX WARN: Code duplicated, block: B:58:0x0185  */
    /* JADX WARN: Code duplicated, block: B:60:0x0193  */
    /* JADX WARN: Code duplicated, block: B:61:0x019b  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:70:0x01df  */
    /* JADX WARN: Code duplicated, block: B:71:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0201  */
    /* JADX WARN: Code duplicated, block: B:74:0x0208  */
    public static int b(mpt0 mpt0Var, Object obj, Object obj2) {
        int iB;
        int iB2;
        int iA;
        int i;
        int iA2;
        int iB3;
        int iA3;
        ugw0 ugw0Var = (ugw0) mpt0Var.b;
        ugw0 ugw0Var2 = (ugw0) mpt0Var.c;
        int i2 = eew0.c;
        int iB4 = 8;
        int iA4 = aew0.a(8);
        ugw0 ugw0Var3 = ugw0.d;
        if (ugw0Var == ugw0Var3) {
            iA4 += iA4;
        }
        vgw0 vgw0Var = vgw0.f37403a;
        switch (ugw0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iB = 8;
                i = iB + iA4;
                iA2 = aew0.a(16);
                if (ugw0Var2 == ugw0Var3) {
                    iA2 += iA2;
                }
                switch (ugw0Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = aew0.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = sgw0.b((String) obj2);
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((mew0) ((jdw0) obj2)).k();
                        return iB4 + iA2 + i;
                    case 10:
                        iB3 = ((mew0) ((jdw0) obj2)).k();
                        iA3 = aew0.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 11:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 12:
                        iB4 = aew0.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 13:
                        if (obj2 instanceof pew0) {
                            iB4 = aew0.b(((pew0) obj2).zza());
                        } else {
                            iB4 = aew0.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iB4 = aew0.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iB4 = aew0.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                        return iB4 + iA2 + i;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 1:
                ((Float) obj).getClass();
                iB = 4;
                i = iB + iA4;
                iA2 = aew0.a(16);
                if (ugw0Var2 == ugw0Var3) {
                    iA2 += iA2;
                }
                switch (ugw0Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = aew0.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = sgw0.b((String) obj2);
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((mew0) ((jdw0) obj2)).k();
                        return iB4 + iA2 + i;
                    case 10:
                        iB3 = ((mew0) ((jdw0) obj2)).k();
                        iA3 = aew0.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 11:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 12:
                        iB4 = aew0.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 13:
                        if (obj2 instanceof pew0) {
                            iB4 = aew0.b(((pew0) obj2).zza());
                        } else {
                            iB4 = aew0.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iB4 = aew0.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iB4 = aew0.b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                        return iB4 + iA2 + i;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 2:
                iB = aew0.b(((Long) obj).longValue());
                i = iB + iA4;
                iA2 = aew0.a(16);
                if (ugw0Var2 == ugw0Var3) {
                    iA2 += iA2;
                }
                switch (ugw0Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = aew0.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = sgw0.b((String) obj2);
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((mew0) ((jdw0) obj2)).k();
                        return iB4 + iA2 + i;
                    case 10:
                        iB3 = ((mew0) ((jdw0) obj2)).k();
                        iA3 = aew0.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 11:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 12:
                        iB4 = aew0.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 13:
                        if (obj2 instanceof pew0) {
                            iB4 = aew0.b(((pew0) obj2).zza());
                        } else {
                            iB4 = aew0.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iB4 = aew0.a((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iB4 = aew0.b((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                        return iB4 + iA2 + i;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 3:
                iB = aew0.b(((Long) obj).longValue());
                i = iB + iA4;
                iA2 = aew0.a(16);
                if (ugw0Var2 == ugw0Var3) {
                    iA2 += iA2;
                }
                switch (ugw0Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = aew0.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = sgw0.b((String) obj2);
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((mew0) ((jdw0) obj2)).k();
                        return iB4 + iA2 + i;
                    case 10:
                        iB3 = ((mew0) ((jdw0) obj2)).k();
                        iA3 = aew0.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 11:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 12:
                        iB4 = aew0.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 13:
                        if (obj2 instanceof pew0) {
                            iB4 = aew0.b(((pew0) obj2).zza());
                        } else {
                            iB4 = aew0.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iB4 = aew0.a((iIntValue4 >> 31) ^ (iIntValue4 + iIntValue4));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iB4 = aew0.b((jLongValue4 >> 63) ^ (jLongValue4 + jLongValue4));
                        return iB4 + iA2 + i;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 4:
                iB = aew0.b(((Integer) obj).intValue());
                i = iB + iA4;
                iA2 = aew0.a(16);
                if (ugw0Var2 == ugw0Var3) {
                    iA2 += iA2;
                }
                switch (ugw0Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = aew0.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = sgw0.b((String) obj2);
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((mew0) ((jdw0) obj2)).k();
                        return iB4 + iA2 + i;
                    case 10:
                        iB3 = ((mew0) ((jdw0) obj2)).k();
                        iA3 = aew0.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 11:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 12:
                        iB4 = aew0.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 13:
                        if (obj2 instanceof pew0) {
                            iB4 = aew0.b(((pew0) obj2).zza());
                        } else {
                            iB4 = aew0.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iB4 = aew0.a((iIntValue5 >> 31) ^ (iIntValue5 + iIntValue5));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iB4 = aew0.b((jLongValue5 >> 63) ^ (jLongValue5 + jLongValue5));
                        return iB4 + iA2 + i;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 5:
                ((Long) obj).getClass();
                iB = 8;
                i = iB + iA4;
                iA2 = aew0.a(16);
                if (ugw0Var2 == ugw0Var3) {
                    iA2 += iA2;
                }
                switch (ugw0Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = aew0.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = sgw0.b((String) obj2);
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((mew0) ((jdw0) obj2)).k();
                        return iB4 + iA2 + i;
                    case 10:
                        iB3 = ((mew0) ((jdw0) obj2)).k();
                        iA3 = aew0.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 11:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 12:
                        iB4 = aew0.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 13:
                        if (obj2 instanceof pew0) {
                            iB4 = aew0.b(((pew0) obj2).zza());
                        } else {
                            iB4 = aew0.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iB4 = aew0.a((iIntValue6 >> 31) ^ (iIntValue6 + iIntValue6));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iB4 = aew0.b((jLongValue6 >> 63) ^ (jLongValue6 + jLongValue6));
                        return iB4 + iA2 + i;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 6:
                ((Integer) obj).getClass();
                iB = 4;
                i = iB + iA4;
                iA2 = aew0.a(16);
                if (ugw0Var2 == ugw0Var3) {
                    iA2 += iA2;
                }
                switch (ugw0Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = aew0.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = sgw0.b((String) obj2);
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((mew0) ((jdw0) obj2)).k();
                        return iB4 + iA2 + i;
                    case 10:
                        iB3 = ((mew0) ((jdw0) obj2)).k();
                        iA3 = aew0.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 11:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 12:
                        iB4 = aew0.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 13:
                        if (obj2 instanceof pew0) {
                            iB4 = aew0.b(((pew0) obj2).zza());
                        } else {
                            iB4 = aew0.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iB4 = aew0.a((iIntValue7 >> 31) ^ (iIntValue7 + iIntValue7));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iB4 = aew0.b((jLongValue7 >> 63) ^ (jLongValue7 + jLongValue7));
                        return iB4 + iA2 + i;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 7:
                ((Boolean) obj).getClass();
                iB = 1;
                i = iB + iA4;
                iA2 = aew0.a(16);
                if (ugw0Var2 == ugw0Var3) {
                    iA2 += iA2;
                }
                switch (ugw0Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = aew0.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = sgw0.b((String) obj2);
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((mew0) ((jdw0) obj2)).k();
                        return iB4 + iA2 + i;
                    case 10:
                        iB3 = ((mew0) ((jdw0) obj2)).k();
                        iA3 = aew0.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 11:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 12:
                        iB4 = aew0.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 13:
                        if (obj2 instanceof pew0) {
                            iB4 = aew0.b(((pew0) obj2).zza());
                        } else {
                            iB4 = aew0.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iB4 = aew0.a((iIntValue8 >> 31) ^ (iIntValue8 + iIntValue8));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iB4 = aew0.b((jLongValue8 >> 63) ^ (jLongValue8 + jLongValue8));
                        return iB4 + iA2 + i;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 8:
                if (obj instanceof qdw0) {
                    iB2 = ((qdw0) obj).e();
                    iA = aew0.a(iB2);
                } else {
                    iB2 = sgw0.b((String) obj);
                    iA = aew0.a(iB2);
                }
                iB = iB2 + iA;
                i = iB + iA4;
                iA2 = aew0.a(16);
                if (ugw0Var2 == ugw0Var3) {
                    iA2 += iA2;
                }
                switch (ugw0Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = aew0.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = sgw0.b((String) obj2);
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((mew0) ((jdw0) obj2)).k();
                        return iB4 + iA2 + i;
                    case 10:
                        iB3 = ((mew0) ((jdw0) obj2)).k();
                        iA3 = aew0.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 11:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 12:
                        iB4 = aew0.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 13:
                        if (obj2 instanceof pew0) {
                            iB4 = aew0.b(((pew0) obj2).zza());
                        } else {
                            iB4 = aew0.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iB4 = aew0.a((iIntValue9 >> 31) ^ (iIntValue9 + iIntValue9));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iB4 = aew0.b((jLongValue9 >> 63) ^ (jLongValue9 + jLongValue9));
                        return iB4 + iA2 + i;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 9:
                iB = ((mew0) ((jdw0) obj)).k();
                i = iB + iA4;
                iA2 = aew0.a(16);
                if (ugw0Var2 == ugw0Var3) {
                    iA2 += iA2;
                }
                switch (ugw0Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = aew0.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = sgw0.b((String) obj2);
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((mew0) ((jdw0) obj2)).k();
                        return iB4 + iA2 + i;
                    case 10:
                        iB3 = ((mew0) ((jdw0) obj2)).k();
                        iA3 = aew0.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 11:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 12:
                        iB4 = aew0.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 13:
                        if (obj2 instanceof pew0) {
                            iB4 = aew0.b(((pew0) obj2).zza());
                        } else {
                            iB4 = aew0.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iB4 = aew0.a((iIntValue10 >> 31) ^ (iIntValue10 + iIntValue10));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iB4 = aew0.b((jLongValue10 >> 63) ^ (jLongValue10 + jLongValue10));
                        return iB4 + iA2 + i;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 10:
                iB2 = ((mew0) ((jdw0) obj)).k();
                iA = aew0.a(iB2);
                iB = iB2 + iA;
                i = iB + iA4;
                iA2 = aew0.a(16);
                if (ugw0Var2 == ugw0Var3) {
                    iA2 += iA2;
                }
                switch (ugw0Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = aew0.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = sgw0.b((String) obj2);
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((mew0) ((jdw0) obj2)).k();
                        return iB4 + iA2 + i;
                    case 10:
                        iB3 = ((mew0) ((jdw0) obj2)).k();
                        iA3 = aew0.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 11:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 12:
                        iB4 = aew0.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 13:
                        if (obj2 instanceof pew0) {
                            iB4 = aew0.b(((pew0) obj2).zza());
                        } else {
                            iB4 = aew0.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iB4 = aew0.a((iIntValue11 >> 31) ^ (iIntValue11 + iIntValue11));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iB4 = aew0.b((jLongValue11 >> 63) ^ (jLongValue11 + jLongValue11));
                        return iB4 + iA2 + i;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 11:
                if (obj instanceof qdw0) {
                    iB2 = ((qdw0) obj).e();
                    iA = aew0.a(iB2);
                } else {
                    iB2 = ((byte[]) obj).length;
                    iA = aew0.a(iB2);
                }
                iB = iB2 + iA;
                i = iB + iA4;
                iA2 = aew0.a(16);
                if (ugw0Var2 == ugw0Var3) {
                    iA2 += iA2;
                }
                switch (ugw0Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = aew0.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = sgw0.b((String) obj2);
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((mew0) ((jdw0) obj2)).k();
                        return iB4 + iA2 + i;
                    case 10:
                        iB3 = ((mew0) ((jdw0) obj2)).k();
                        iA3 = aew0.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 11:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 12:
                        iB4 = aew0.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 13:
                        if (obj2 instanceof pew0) {
                            iB4 = aew0.b(((pew0) obj2).zza());
                        } else {
                            iB4 = aew0.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iB4 = aew0.a((iIntValue12 >> 31) ^ (iIntValue12 + iIntValue12));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iB4 = aew0.b((jLongValue12 >> 63) ^ (jLongValue12 + jLongValue12));
                        return iB4 + iA2 + i;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 12:
                iB = aew0.a(((Integer) obj).intValue());
                i = iB + iA4;
                iA2 = aew0.a(16);
                if (ugw0Var2 == ugw0Var3) {
                    iA2 += iA2;
                }
                switch (ugw0Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = aew0.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = sgw0.b((String) obj2);
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((mew0) ((jdw0) obj2)).k();
                        return iB4 + iA2 + i;
                    case 10:
                        iB3 = ((mew0) ((jdw0) obj2)).k();
                        iA3 = aew0.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 11:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 12:
                        iB4 = aew0.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 13:
                        if (obj2 instanceof pew0) {
                            iB4 = aew0.b(((pew0) obj2).zza());
                        } else {
                            iB4 = aew0.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iB4 = aew0.a((iIntValue13 >> 31) ^ (iIntValue13 + iIntValue13));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iB4 = aew0.b((jLongValue13 >> 63) ^ (jLongValue13 + jLongValue13));
                        return iB4 + iA2 + i;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 13:
                iB = obj instanceof pew0 ? aew0.b(((pew0) obj).zza()) : aew0.b(((Integer) obj).intValue());
                i = iB + iA4;
                iA2 = aew0.a(16);
                if (ugw0Var2 == ugw0Var3) {
                    iA2 += iA2;
                }
                switch (ugw0Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = aew0.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = sgw0.b((String) obj2);
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((mew0) ((jdw0) obj2)).k();
                        return iB4 + iA2 + i;
                    case 10:
                        iB3 = ((mew0) ((jdw0) obj2)).k();
                        iA3 = aew0.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 11:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 12:
                        iB4 = aew0.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 13:
                        if (obj2 instanceof pew0) {
                            iB4 = aew0.b(((pew0) obj2).zza());
                        } else {
                            iB4 = aew0.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iB4 = aew0.a((iIntValue14 >> 31) ^ (iIntValue14 + iIntValue14));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iB4 = aew0.b((jLongValue14 >> 63) ^ (jLongValue14 + jLongValue14));
                        return iB4 + iA2 + i;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 14:
                ((Integer) obj).getClass();
                iB = 4;
                i = iB + iA4;
                iA2 = aew0.a(16);
                if (ugw0Var2 == ugw0Var3) {
                    iA2 += iA2;
                }
                switch (ugw0Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = aew0.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = sgw0.b((String) obj2);
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((mew0) ((jdw0) obj2)).k();
                        return iB4 + iA2 + i;
                    case 10:
                        iB3 = ((mew0) ((jdw0) obj2)).k();
                        iA3 = aew0.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 11:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 12:
                        iB4 = aew0.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 13:
                        if (obj2 instanceof pew0) {
                            iB4 = aew0.b(((pew0) obj2).zza());
                        } else {
                            iB4 = aew0.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iB4 = aew0.a((iIntValue15 >> 31) ^ (iIntValue15 + iIntValue15));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iB4 = aew0.b((jLongValue15 >> 63) ^ (jLongValue15 + jLongValue15));
                        return iB4 + iA2 + i;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 15:
                ((Long) obj).getClass();
                iB = 8;
                i = iB + iA4;
                iA2 = aew0.a(16);
                if (ugw0Var2 == ugw0Var3) {
                    iA2 += iA2;
                }
                switch (ugw0Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = aew0.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = sgw0.b((String) obj2);
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((mew0) ((jdw0) obj2)).k();
                        return iB4 + iA2 + i;
                    case 10:
                        iB3 = ((mew0) ((jdw0) obj2)).k();
                        iA3 = aew0.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 11:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 12:
                        iB4 = aew0.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 13:
                        if (obj2 instanceof pew0) {
                            iB4 = aew0.b(((pew0) obj2).zza());
                        } else {
                            iB4 = aew0.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iB4 = aew0.a((iIntValue16 >> 31) ^ (iIntValue16 + iIntValue16));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iB4 = aew0.b((jLongValue16 >> 63) ^ (jLongValue16 + jLongValue16));
                        return iB4 + iA2 + i;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iB = aew0.a((iIntValue17 >> 31) ^ (iIntValue17 + iIntValue17));
                i = iB + iA4;
                iA2 = aew0.a(16);
                if (ugw0Var2 == ugw0Var3) {
                    iA2 += iA2;
                }
                switch (ugw0Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = aew0.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = sgw0.b((String) obj2);
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((mew0) ((jdw0) obj2)).k();
                        return iB4 + iA2 + i;
                    case 10:
                        iB3 = ((mew0) ((jdw0) obj2)).k();
                        iA3 = aew0.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 11:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 12:
                        iB4 = aew0.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 13:
                        if (obj2 instanceof pew0) {
                            iB4 = aew0.b(((pew0) obj2).zza());
                        } else {
                            iB4 = aew0.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iB4 = aew0.a((iIntValue18 >> 31) ^ (iIntValue18 + iIntValue18));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iB4 = aew0.b((jLongValue17 >> 63) ^ (jLongValue17 + jLongValue17));
                        return iB4 + iA2 + i;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iB = aew0.b((jLongValue18 >> 63) ^ (jLongValue18 + jLongValue18));
                i = iB + iA4;
                iA2 = aew0.a(16);
                if (ugw0Var2 == ugw0Var3) {
                    iA2 += iA2;
                }
                switch (ugw0Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = aew0.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = aew0.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = sgw0.b((String) obj2);
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((mew0) ((jdw0) obj2)).k();
                        return iB4 + iA2 + i;
                    case 10:
                        iB3 = ((mew0) ((jdw0) obj2)).k();
                        iA3 = aew0.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 11:
                        if (obj2 instanceof qdw0) {
                            iB3 = ((qdw0) obj2).e();
                            iA3 = aew0.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = aew0.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 12:
                        iB4 = aew0.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 13:
                        if (obj2 instanceof pew0) {
                            iB4 = aew0.b(((pew0) obj2).zza());
                        } else {
                            iB4 = aew0.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iB4 = aew0.a((iIntValue19 >> 31) ^ (iIntValue19 + iIntValue19));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iB4 = aew0.b((jLongValue19 >> 63) ^ (jLongValue19 + jLongValue19));
                        return iB4 + iA2 + i;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            default:
                itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }
}
