package a;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class p0x0 extends akw0 {
    public final mpt0 b;

    public p0x0(mpt0 mpt0Var) {
        this.b = mpt0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // a.akw0, a.jlw0
    public final jlw0 c(String str, h0q0 h0q0Var, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        mpt0 mpt0Var = this.b;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    pvm0.D("getEventName", arrayList, 0);
                    return new slw0(((nbw0) mpt0Var.d).f23263a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    pvm0.D("getTimestamp", arrayList, 0);
                    return new ihw0(Double.valueOf(((nbw0) mpt0Var.d).b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    pvm0.D("getParamValue", arrayList, 1);
                    String strZzc = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzc();
                    HashMap map = ((nbw0) mpt0Var.d).c;
                    return mym0.t(map.containsKey(strZzc) ? map.get(strZzc) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    pvm0.D("getParams", arrayList, 0);
                    HashMap map2 = ((nbw0) mpt0Var.d).c;
                    akw0 akw0Var = new akw0();
                    for (String str2 : map2.keySet()) {
                        akw0Var.f(str2, mym0.t(map2.get(str2)));
                    }
                    return akw0Var;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    pvm0.D("setParamValue", arrayList, 2);
                    String strZzc2 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzc();
                    jlw0 jlw0VarS = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1));
                    nbw0 nbw0Var = (nbw0) mpt0Var.d;
                    Object objL = pvm0.L(jlw0VarS);
                    HashMap map3 = nbw0Var.c;
                    if (objL == null) {
                        map3.remove(strZzc2);
                        return jlw0VarS;
                    }
                    map3.put(strZzc2, nbw0.b(map3.get(strZzc2), objL, strZzc2));
                    return jlw0VarS;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    pvm0.D("setEventName", arrayList, 1);
                    jlw0 jlw0VarS2 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0));
                    if (jlw0.V0.equals(jlw0VarS2) || jlw0.W0.equals(jlw0VarS2)) {
                        jf4.o("Illegal event name");
                        return null;
                    }
                    ((nbw0) mpt0Var.d).f23263a = jlw0VarS2.zzc();
                    return new slw0(jlw0VarS2.zzc());
                }
                break;
        }
        return super.c(str, h0q0Var, arrayList);
    }
}
