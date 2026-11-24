package a;

import android.gov.nist.core.Separators;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hww0 extends oww0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13785a;
    public final mow0 b;

    public hww0(mow0 mow0Var) throws l52 {
        mow0Var.getClass();
        this.b = mow0Var;
        eet0 eet0VarJ = mow0Var.entrySet().j();
        int i = 0;
        while (eet0VarJ.hasNext()) {
            Map.Entry entry = (Map.Entry) eet0VarJ.next();
            int iA = ((oww0) entry.getKey()).a();
            i = i < iA ? iA : i;
            int iA2 = ((oww0) entry.getValue()).a();
            if (i < iA2) {
                i = iA2;
            }
        }
        int i2 = i + 1;
        this.f13785a = i2;
        if (i2 > 8) {
            throw new l52("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // a.oww0
    public final int a() {
        return this.f13785a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompareTo;
        oww0 oww0Var = (oww0) obj;
        int iZza = oww0Var.zza();
        int iC = oww0.c((byte) -96);
        if (iC != iZza) {
            return iC - oww0Var.zza();
        }
        mow0 mow0Var = ((hww0) oww0Var).b;
        mow0 mow0Var2 = this.b;
        if (mow0Var2.d.size() != mow0Var.d.size()) {
            return mow0Var2.d.size() - mow0Var.d.size();
        }
        eet0 eet0VarJ = mow0Var2.entrySet().j();
        eet0 eet0VarJ2 = mow0Var.entrySet().j();
        do {
            if (!eet0VarJ.hasNext() && !eet0VarJ2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) eet0VarJ.next();
            Map.Entry entry2 = (Map.Entry) eet0VarJ2.next();
            int iCompareTo2 = ((oww0) entry.getKey()).compareTo((oww0) entry2.getKey());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            iCompareTo = ((oww0) entry.getValue()).compareTo((oww0) entry2.getValue());
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hww0.class == obj.getClass()) {
            return this.b.equals(((hww0) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(oww0.c((byte) -96)), this.b});
    }

    public final String toString() {
        mow0 mow0Var = this.b;
        if (mow0Var.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        eet0 eet0VarJ = mow0Var.entrySet().j();
        while (eet0VarJ.hasNext()) {
            Map.Entry entry = (Map.Entry) eet0VarJ.next();
            linkedHashMap.put(((oww0) entry.getKey()).toString().replace(Separators.RETURN, "\n  "), ((oww0) entry.getValue()).toString().replace(Separators.RETURN, "\n  "));
        }
        bzs0 bzs0Var = new bzs0((byte) 24);
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            qsm0.A(sb, linkedHashMap.entrySet().iterator(), bzs0Var);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            c99.l(e);
            return null;
        }
    }

    @Override // a.oww0
    public final int zza() {
        return oww0.c((byte) -96);
    }
}
