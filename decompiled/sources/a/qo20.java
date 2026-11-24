package a;

/* JADX INFO: loaded from: classes.dex */
public final class qo20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nvu f29051a;

    public qo20(fov0 fov0Var, fov0 fov0Var2, itb0 itb0Var) {
        this.f29051a = new nvu(fov0Var, fov0Var2, itb0Var, (byte) 9);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0109  */
    /* JADX WARN: Code duplicated, block: B:41:0x0112  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    /* JADX WARN: Code duplicated, block: B:44:0x0128  */
    /* JADX WARN: Code duplicated, block: B:45:0x013a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0143  */
    /* JADX WARN: Code duplicated, block: B:49:0x014c  */
    /* JADX WARN: Code duplicated, block: B:50:0x015a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0167  */
    /* JADX WARN: Code duplicated, block: B:53:0x016b  */
    /* JADX WARN: Code duplicated, block: B:55:0x017a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0183  */
    /* JADX WARN: Code duplicated, block: B:57:0x0191  */
    /* JADX WARN: Code duplicated, block: B:58:0x019b  */
    /* JADX WARN: Code duplicated, block: B:60:0x019f  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f6  */
    public static int a(nvu nvuVar, Object obj, Object obj2) {
        int iJ;
        int size;
        int i;
        int i2;
        fov0 fov0Var;
        int iH;
        int size2;
        int i3;
        fov0 fov0Var2 = (fov0) nvuVar.b;
        int i4 = frp.c;
        int iJ2 = 1;
        int iH2 = syc.h(1);
        wnv0 wnv0Var = fov0.d;
        if (fov0Var2 == wnv0Var) {
            iH2 *= 2;
        }
        switch (fov0Var2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iJ = 8;
                i2 = iJ + iH2;
                fov0Var = (fov0) nvuVar.c;
                iH = syc.h(2);
                if (fov0Var == wnv0Var) {
                    iH *= 2;
                }
                switch (fov0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = syc.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((mjt) ((a4) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((mjt) ((a4) obj2)).a(null);
                        i3 = syc.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = syc.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = syc.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iJ2 = syc.i((iIntValue >> 31) ^ (iIntValue << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iJ2 = syc.j((jLongValue >> 63) ^ (jLongValue << 1));
                        return iJ2 + iH + i2;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 1:
                ((Float) obj).getClass();
                iJ = 4;
                i2 = iJ + iH2;
                fov0Var = (fov0) nvuVar.c;
                iH = syc.h(2);
                if (fov0Var == wnv0Var) {
                    iH *= 2;
                }
                switch (fov0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = syc.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((mjt) ((a4) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((mjt) ((a4) obj2)).a(null);
                        i3 = syc.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = syc.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = syc.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iJ2 = syc.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iJ2 = syc.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                        return iJ2 + iH + i2;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 2:
                iJ = syc.j(((Long) obj).longValue());
                i2 = iJ + iH2;
                fov0Var = (fov0) nvuVar.c;
                iH = syc.h(2);
                if (fov0Var == wnv0Var) {
                    iH *= 2;
                }
                switch (fov0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = syc.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((mjt) ((a4) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((mjt) ((a4) obj2)).a(null);
                        i3 = syc.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = syc.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = syc.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iJ2 = syc.i((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iJ2 = syc.j((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                        return iJ2 + iH + i2;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 3:
                iJ = syc.j(((Long) obj).longValue());
                i2 = iJ + iH2;
                fov0Var = (fov0) nvuVar.c;
                iH = syc.h(2);
                if (fov0Var == wnv0Var) {
                    iH *= 2;
                }
                switch (fov0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = syc.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((mjt) ((a4) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((mjt) ((a4) obj2)).a(null);
                        i3 = syc.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = syc.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = syc.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iJ2 = syc.i((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iJ2 = syc.j((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                        return iJ2 + iH + i2;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 4:
                iJ = syc.j(((Integer) obj).intValue());
                i2 = iJ + iH2;
                fov0Var = (fov0) nvuVar.c;
                iH = syc.h(2);
                if (fov0Var == wnv0Var) {
                    iH *= 2;
                }
                switch (fov0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = syc.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((mjt) ((a4) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((mjt) ((a4) obj2)).a(null);
                        i3 = syc.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = syc.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = syc.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iJ2 = syc.i((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iJ2 = syc.j((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                        return iJ2 + iH + i2;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 5:
                ((Long) obj).getClass();
                iJ = 8;
                i2 = iJ + iH2;
                fov0Var = (fov0) nvuVar.c;
                iH = syc.h(2);
                if (fov0Var == wnv0Var) {
                    iH *= 2;
                }
                switch (fov0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = syc.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((mjt) ((a4) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((mjt) ((a4) obj2)).a(null);
                        i3 = syc.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = syc.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = syc.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iJ2 = syc.i((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iJ2 = syc.j((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                        return iJ2 + iH + i2;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 6:
                ((Integer) obj).getClass();
                iJ = 4;
                i2 = iJ + iH2;
                fov0Var = (fov0) nvuVar.c;
                iH = syc.h(2);
                if (fov0Var == wnv0Var) {
                    iH *= 2;
                }
                switch (fov0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = syc.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((mjt) ((a4) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((mjt) ((a4) obj2)).a(null);
                        i3 = syc.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = syc.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = syc.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iJ2 = syc.i((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iJ2 = syc.j((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                        return iJ2 + iH + i2;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 7:
                ((Boolean) obj).getClass();
                iJ = 1;
                i2 = iJ + iH2;
                fov0Var = (fov0) nvuVar.c;
                iH = syc.h(2);
                if (fov0Var == wnv0Var) {
                    iH *= 2;
                }
                switch (fov0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = syc.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((mjt) ((a4) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((mjt) ((a4) obj2)).a(null);
                        i3 = syc.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = syc.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = syc.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iJ2 = syc.i((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iJ2 = syc.j((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                        return iJ2 + iH + i2;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 8:
                if (obj instanceof mg9) {
                    size = ((mg9) obj).size();
                    i = syc.i(size);
                    iJ = size + i;
                } else {
                    iJ = syc.g((String) obj);
                }
                i2 = iJ + iH2;
                fov0Var = (fov0) nvuVar.c;
                iH = syc.h(2);
                if (fov0Var == wnv0Var) {
                    iH *= 2;
                }
                switch (fov0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = syc.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((mjt) ((a4) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((mjt) ((a4) obj2)).a(null);
                        i3 = syc.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = syc.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = syc.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iJ2 = syc.i((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iJ2 = syc.j((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                        return iJ2 + iH + i2;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 9:
                iJ = ((mjt) ((a4) obj)).a(null);
                i2 = iJ + iH2;
                fov0Var = (fov0) nvuVar.c;
                iH = syc.h(2);
                if (fov0Var == wnv0Var) {
                    iH *= 2;
                }
                switch (fov0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = syc.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((mjt) ((a4) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((mjt) ((a4) obj2)).a(null);
                        i3 = syc.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = syc.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = syc.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iJ2 = syc.i((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iJ2 = syc.j((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                        return iJ2 + iH + i2;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 10:
                size = ((mjt) ((a4) obj)).a(null);
                i = syc.i(size);
                iJ = size + i;
                i2 = iJ + iH2;
                fov0Var = (fov0) nvuVar.c;
                iH = syc.h(2);
                if (fov0Var == wnv0Var) {
                    iH *= 2;
                }
                switch (fov0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = syc.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((mjt) ((a4) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((mjt) ((a4) obj2)).a(null);
                        i3 = syc.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = syc.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = syc.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iJ2 = syc.i((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iJ2 = syc.j((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                        return iJ2 + iH + i2;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 11:
                if (obj instanceof mg9) {
                    size = ((mg9) obj).size();
                    i = syc.i(size);
                } else {
                    size = ((byte[]) obj).length;
                    i = syc.i(size);
                }
                iJ = size + i;
                i2 = iJ + iH2;
                fov0Var = (fov0) nvuVar.c;
                iH = syc.h(2);
                if (fov0Var == wnv0Var) {
                    iH *= 2;
                }
                switch (fov0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = syc.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((mjt) ((a4) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((mjt) ((a4) obj2)).a(null);
                        i3 = syc.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = syc.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = syc.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iJ2 = syc.i((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iJ2 = syc.j((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                        return iJ2 + iH + i2;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 12:
                iJ = syc.i(((Integer) obj).intValue());
                i2 = iJ + iH2;
                fov0Var = (fov0) nvuVar.c;
                iH = syc.h(2);
                if (fov0Var == wnv0Var) {
                    iH *= 2;
                }
                switch (fov0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = syc.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((mjt) ((a4) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((mjt) ((a4) obj2)).a(null);
                        i3 = syc.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = syc.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = syc.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iJ2 = syc.i((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iJ2 = syc.j((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                        return iJ2 + iH + i2;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 13:
                iJ = syc.j(((Integer) obj).intValue());
                i2 = iJ + iH2;
                fov0Var = (fov0) nvuVar.c;
                iH = syc.h(2);
                if (fov0Var == wnv0Var) {
                    iH *= 2;
                }
                switch (fov0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = syc.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((mjt) ((a4) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((mjt) ((a4) obj2)).a(null);
                        i3 = syc.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = syc.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = syc.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iJ2 = syc.i((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iJ2 = syc.j((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                        return iJ2 + iH + i2;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 14:
                ((Integer) obj).getClass();
                iJ = 4;
                i2 = iJ + iH2;
                fov0Var = (fov0) nvuVar.c;
                iH = syc.h(2);
                if (fov0Var == wnv0Var) {
                    iH *= 2;
                }
                switch (fov0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = syc.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((mjt) ((a4) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((mjt) ((a4) obj2)).a(null);
                        i3 = syc.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = syc.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = syc.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iJ2 = syc.i((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iJ2 = syc.j((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                        return iJ2 + iH + i2;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 15:
                ((Long) obj).getClass();
                iJ = 8;
                i2 = iJ + iH2;
                fov0Var = (fov0) nvuVar.c;
                iH = syc.h(2);
                if (fov0Var == wnv0Var) {
                    iH *= 2;
                }
                switch (fov0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = syc.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((mjt) ((a4) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((mjt) ((a4) obj2)).a(null);
                        i3 = syc.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = syc.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = syc.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iJ2 = syc.i((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iJ2 = syc.j((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                        return iJ2 + iH + i2;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iJ = syc.i((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                i2 = iJ + iH2;
                fov0Var = (fov0) nvuVar.c;
                iH = syc.h(2);
                if (fov0Var == wnv0Var) {
                    iH *= 2;
                }
                switch (fov0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = syc.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((mjt) ((a4) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((mjt) ((a4) obj2)).a(null);
                        i3 = syc.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = syc.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = syc.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iJ2 = syc.i((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iJ2 = syc.j((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                        return iJ2 + iH + i2;
                    default:
                        itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iJ = syc.j((jLongValue18 >> 63) ^ (jLongValue18 << 1));
                i2 = iJ + iH2;
                fov0Var = (fov0) nvuVar.c;
                iH = syc.h(2);
                if (fov0Var == wnv0Var) {
                    iH *= 2;
                }
                switch (fov0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = syc.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = syc.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((mjt) ((a4) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((mjt) ((a4) obj2)).a(null);
                        i3 = syc.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof mg9) {
                            size2 = ((mg9) obj2).size();
                            i3 = syc.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = syc.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = syc.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = syc.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iJ2 = syc.i((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iJ2 = syc.j((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                        return iJ2 + iH + i2;
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
