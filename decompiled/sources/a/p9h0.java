package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p9h0 extends p4 {
    public long c;
    public long[] d;
    public long[] e;

    public static Serializable n1(int i, fq80 fq80Var) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(fq80Var.t()));
        }
        if (i == 1) {
            return Boolean.valueOf(fq80Var.z() == 1);
        }
        if (i == 2) {
            return p1(fq80Var);
        }
        if (i != 3) {
            if (i == 8) {
                return o1(fq80Var);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(fq80Var.t()));
                fq80Var.N(2);
                return date;
            }
            int iD = fq80Var.D();
            ArrayList arrayList = new ArrayList(iD);
            for (int i2 = 0; i2 < iD; i2++) {
                Serializable serializableN1 = n1(fq80Var.z(), fq80Var);
                if (serializableN1 != null) {
                    arrayList.add(serializableN1);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strP1 = p1(fq80Var);
            int iZ = fq80Var.z();
            if (iZ == 9) {
                return map;
            }
            Serializable serializableN2 = n1(iZ, fq80Var);
            if (serializableN2 != null) {
                map.put(strP1, serializableN2);
            }
        }
    }

    public static HashMap o1(fq80 fq80Var) {
        int iD = fq80Var.D();
        HashMap map = new HashMap(iD);
        for (int i = 0; i < iD; i++) {
            String strP1 = p1(fq80Var);
            Serializable serializableN1 = n1(fq80Var.z(), fq80Var);
            if (serializableN1 != null) {
                map.put(strP1, serializableN1);
            }
        }
        return map;
    }

    public static String p1(fq80 fq80Var) {
        int iG = fq80Var.G();
        int i = fq80Var.b;
        fq80Var.N(iG);
        return new String(fq80Var.f9961a, i, iG);
    }
}
