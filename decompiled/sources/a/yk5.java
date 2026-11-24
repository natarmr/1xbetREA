package a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class yk5 implements ig9, sps0 {
    public static lkd a() {
        Object next;
        c0o c0oVar = lkd.x2;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (!((lkd) next).f20196a.contains("prod"));
        lkd lkdVar = (lkd) next;
        return lkdVar == null ? lkd.d : lkdVar;
    }

    public static izc b(double d, double d2) {
        int i = (d <= 0.0d || d2 <= 0.0d) ? 0 : (int) (((double) ((int) (d * 10000.0d))) - (d2 * 10000.0d));
        if (i == 0) {
            return izc.d;
        }
        return i > 0 ? izc.b : izc.c;
    }

    public static mc6 d(Integer num) {
        if (num != null && num.intValue() == 1) {
            return mc6.BO1;
        }
        if (num != null && num.intValue() == 2) {
            return mc6.BO2;
        }
        if (num != null && num.intValue() == 3) {
            return mc6.BO3;
        }
        if (num != null && num.intValue() == 4) {
            return mc6.BO4;
        }
        if (num != null && num.intValue() == 5) {
            return mc6.BO5;
        }
        if (num != null && num.intValue() == 6) {
            return mc6.BO6;
        }
        return (num != null && num.intValue() == 7) ? mc6.BO7 : mc6.NONE;
    }

    public static e900 g(List list, float f, float f2, int i) {
        return new e900(list, null, (((long) Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }

    public static e900 h(Pair[] pairArr, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = Float.POSITIVE_INFINITY;
        }
        return j((Pair[]) Arrays.copyOf(pairArr, pairArr.length), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }

    public static double i(double d, int i, double d2, double d3) {
        double d4 = ((double) i) * 0.01d * d;
        if (d4 < d2) {
            return 0.0d;
        }
        return d4 > d3 ? d3 : d4;
    }

    public static e900 j(Pair[] pairArr, long j, long j2) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair pair : pairArr) {
            y3d y3dVar = (y3d) pair.b;
            long j3 = y3dVar.f41946a;
            arrayList.add(y3dVar);
        }
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair pair2 : pairArr) {
            arrayList2.add(Float.valueOf(((Number) pair2.f46059a).floatValue()));
        }
        return new e900(arrayList, arrayList2, j, j2);
    }

    public static e900 k(Pair[] pairArr, long j, long j2, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            j2 = 9187343241974906880L;
        }
        return j(pairArr, j, j2);
    }

    public static ni8 l(w3t w3tVar, String str) {
        ni8 ni8Var = new ni8();
        Bundle bundle = new Bundle();
        bundle.putSerializable("BonusesFeature.SOURCE_SCREEN", w3tVar);
        bundle.putString("OneXGamesBonusesFragment.UM_RESULT_KEY", str);
        ni8Var.s0(bundle);
        return ni8Var;
    }

    public static koa m(int i) {
        int i2;
        for (koa koaVar : koa.values()) {
            int iOrdinal = koaVar.ordinal();
            if (iOrdinal != 0) {
                i2 = 1;
                if (iOrdinal != 1) {
                    i2 = 2;
                    if (iOrdinal != 2) {
                        i2 = 3;
                        if (iOrdinal != 3) {
                            i2 = 4;
                            if (iOrdinal != 4) {
                                t9f.b();
                                return null;
                            }
                        }
                    }
                }
            } else {
                i2 = 0;
            }
            if (i == i2) {
                return koaVar;
            }
        }
        return koa.b;
    }

    public static e900 n(List list, float f, float f2, int i) {
        return new e900(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2)) & 4294967295L));
    }

    public static e900 o(Pair[] pairArr) {
        return j((Pair[]) Arrays.copyOf(pairArr, pairArr.length), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L));
    }

    @Override // a.ig9
    public byte[] e(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }
}
