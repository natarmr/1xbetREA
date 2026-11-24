package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class lzw0 extends giw0 {
    public final /* synthetic */ byte c = 2;
    public final Object d;

    public lzw0(ikt0 ikt0Var) {
        super("internal.logger");
        this.d = ikt0Var;
        this.b.put("log", new a9x0(this, false, true));
        this.b.put("silent", new o3x0("silent", (byte) 1));
        ((giw0) this.b.get("silent")).f("log", new a9x0(this, true, true));
        this.b.put("unmonitored", new o3x0("unmonitored", (byte) 2));
        ((giw0) this.b.get("unmonitored")).f("log", new a9x0(this, false, false));
    }

    @Override // a.giw0
    public final jlw0 a(h0q0 h0q0Var, List list) {
        TreeMap treeMap;
        byte b = this.c;
        String str = this.f11369a;
        wlw0 wlw0Var = jlw0.V0;
        Object obj = this.d;
        String str2 = null;
        switch (b) {
            case 0:
                pvm0.D(str, list, 3);
                String strZzc = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) list.get(0)).zzc();
                jlw0 jlw0Var = (jlw0) list.get(1);
                okt0 okt0Var = (okt0) h0q0Var.b;
                long jK = (long) pvm0.K(okt0Var.s(h0q0Var, jlw0Var).zzd().doubleValue());
                jlw0 jlw0VarS = okt0Var.s(h0q0Var, (jlw0) list.get(2));
                HashMap mapM = jlw0VarS instanceof akw0 ? pvm0.M((akw0) jlw0VarS) : new HashMap();
                mpt0 mpt0Var = (mpt0) obj;
                mpt0Var.getClass();
                HashMap map = new HashMap();
                for (String str3 : mapM.keySet()) {
                    HashMap map2 = ((nbw0) mpt0Var.b).c;
                    map.put(str3, nbw0.b(map2.containsKey(str3) ? map2.get(str3) : null, mapM.get(str3), str3));
                }
                ((ArrayList) mpt0Var.c).add(new nbw0(strZzc, jK, map));
                return wlw0Var;
            case 1:
                pvm0.D("getValue", list, 2);
                jlw0 jlw0VarS2 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) list.get(0));
                jlw0 jlw0VarS3 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) list.get(1));
                String strZzc2 = jlw0VarS2.zzc();
                fck0 fck0Var = (fck0) obj;
                Map map3 = (Map) ((uww0) fck0Var.c).e.get((String) fck0Var.b);
                if (map3 != null && map3.containsKey(strZzc2)) {
                    str2 = (String) map3.get(strZzc2);
                }
                return str2 != null ? new slw0(str2) : jlw0VarS3;
            case 2:
                return wlw0Var;
            case 3:
                try {
                    return mym0.t(((nww0) obj).call());
                } catch (Exception unused) {
                    return wlw0Var;
                }
            default:
                pvm0.D(str, list, 3);
                ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) list.get(0)).zzc();
                jlw0 jlw0Var2 = (jlw0) list.get(1);
                okt0 okt0Var2 = (okt0) h0q0Var.b;
                jlw0 jlw0VarS4 = okt0Var2.s(h0q0Var, jlw0Var2);
                if (jlw0VarS4 instanceof xkw0) {
                    jlw0 jlw0VarS5 = okt0Var2.s(h0q0Var, (jlw0) list.get(2));
                    if (jlw0VarS5 instanceof akw0) {
                        akw0 akw0Var = (akw0) jlw0VarS5;
                        HashMap map4 = akw0Var.f1043a;
                        if (map4.containsKey(Payload.TYPE)) {
                            String strZzc3 = akw0Var.b(Payload.TYPE).zzc();
                            int iJ = map4.containsKey(RemoteMessageConst.Notification.PRIORITY) ? pvm0.J(akw0Var.b(RemoteMessageConst.Notification.PRIORITY).zzd().doubleValue()) : 1000;
                            okt0 okt0Var3 = (okt0) obj;
                            xkw0 xkw0Var = (xkw0) jlw0VarS4;
                            okt0Var3.getClass();
                            if ("create".equals(strZzc3)) {
                                treeMap = (TreeMap) okt0Var3.b;
                            } else if ("edit".equals(strZzc3)) {
                                treeMap = (TreeMap) okt0Var3.f25422a;
                            } else {
                                jf4.n("Unknown callback type: ".concat(String.valueOf(strZzc3)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(iJ))) {
                                iJ = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(iJ), xkw0Var);
                            return wlw0Var;
                        }
                        jf4.o("Undefined rule type");
                    } else {
                        jf4.o("Invalid callback params");
                    }
                } else {
                    jf4.o("Invalid callback type");
                }
                return null;
        }
    }

    public lzw0(okt0 okt0Var) {
        super("internal.registerCallback");
        this.d = okt0Var;
    }

    public lzw0(mpt0 mpt0Var) {
        super("internal.eventLogger");
        this.d = mpt0Var;
    }

    public lzw0(nww0 nww0Var) {
        super("internal.appMetadata");
        this.d = nww0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzw0(o3x0 o3x0Var, fck0 fck0Var) {
        super("getValue");
        this.d = fck0Var;
    }
}
