package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dt40 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l7m0 f6644a;
    public final /* synthetic */ ot40 b;
    public final /* synthetic */ s3e c;
    public final /* synthetic */ s3e d;
    public final /* synthetic */ mms0 e;
    public final /* synthetic */ agk0 f;
    public final /* synthetic */ nie0 g;
    public final /* synthetic */ lwf h;

    public dt40(pz40 pz40Var, ot40 ot40Var, s3e s3eVar, s3e s3eVar2, mms0 mms0Var, agk0 agk0Var, nie0 nie0Var, lwf lwfVar) {
        this.f6644a = pz40Var;
        this.b = ot40Var;
        this.c = s3eVar;
        this.d = s3eVar2;
        this.e = mms0Var;
        this.f = agk0Var;
        this.g = nie0Var;
        this.h = lwfVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x013a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0146  */
    /* JADX WARN: Code duplicated, block: B:55:0x0149  */
    /* JADX WARN: Code duplicated, block: B:57:0x014c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0152  */
    /* JADX WARN: Code duplicated, block: B:63:0x0179  */
    /* JADX WARN: Code duplicated, block: B:64:0x017c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0180  */
    /* JADX WARN: Code duplicated, block: B:67:0x0183  */
    /* JADX WARN: Code duplicated, block: B:70:0x0189  */
    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        LinkedHashMap linkedHashMap;
        nie0 nie0Var;
        tmk tmkVarH;
        tmk tmkVarH2;
        ArrayList arrayList;
        int size;
        int i;
        Object obj;
        pj30 pj30Var;
        vdv0 vdv0Var;
        int iMax;
        int iMax2;
        boolean z;
        boolean z2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.f6644a.getValue();
        k6z layoutDirection = vj30Var.getLayoutDirection();
        float fL = this.f.l();
        nie0 nie0Var2 = this.g;
        cmd cmdVar = (cmd) nie0Var2.f23583a;
        cmd cmdVar2 = cmd.f4598a;
        if (cmdVar == null) {
            cmdVar = cmdVar2;
        }
        ot40 ot40Var = this.b;
        LinkedHashMap linkedHashMap3 = ot40Var.d;
        l4e l4eVar = ot40Var.f2731a;
        ot40Var.b = linkedHashMap2;
        f7m0 f7m0Var = ot40Var.e;
        fms0 fms0Var = ot40Var.i;
        if (!fms0Var.b.isEmpty() && !linkedHashMap3.isEmpty()) {
            if (p4e.f(j)) {
                int iH = p4e.h(j);
                linkedHashMap = linkedHashMap2;
                tmk tmkVar = f7m0Var.f.e0;
                nie0Var = nie0Var2;
                if (((String) tmkVar.g) != null || tmkVar.f != iH) {
                }
                fms0Var.b(l4eVar.s(), fL, l4eVar.m());
                l4eVar.T(fms0Var.l);
                l4eVar.O(fms0Var.m);
                arrayList = l4eVar.u0;
                size = arrayList.size();
                i = 0;
                while (i < size) {
                    k4e k4eVar = (k4e) arrayList.get(i);
                    obj = k4eVar.h0;
                    if (obj instanceof pj30) {
                        pj30Var = (pj30) obj;
                    } else {
                        pj30Var = null;
                    }
                    if (pj30Var == null && (vdv0Var = fms0Var.a(2, k4eVar.k).c) != null) {
                        LinkedHashMap linkedHashMap4 = ot40Var.b;
                        iMax = Math.max(0, vdv0Var.d - vdv0Var.b);
                        iMax2 = Math.max(0, vdv0Var.e - vdv0Var.c);
                        if (iMax >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (iMax2 >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!(z & z2)) {
                            zcx.a("width and height must be >= 0");
                        }
                        linkedHashMap4.put(pj30Var, pj30Var.S(r4e.h(iMax, iMax, iMax2, iMax2)));
                        linkedHashMap3.put(h8x.I(pj30Var), vdv0Var);
                    }
                    i++;
                    size = size;
                    arrayList = arrayList;
                }
                ot40Var.j = new p4e(j);
                long jB = n2x.b(l4eVar.s(), l4eVar.m());
                nie0Var.f23583a = cmdVar2;
                return vj30.x(vj30Var, (int) (jB >> 32), (int) (jB & 4294967295L), new v43(ot40Var, list, linkedHashMap, (byte) 1));
            }
            linkedHashMap = linkedHashMap2;
            nie0Var = nie0Var2;
            if (p4e.g(j)) {
                int i2 = p4e.i(j);
                tmk tmkVar2 = f7m0Var.f.d0;
                if (((String) tmkVar2.g) == null && tmkVar2.f == i2) {
                    if (cmdVar == cmd.b) {
                        jeb.L(f7m0Var, list);
                    }
                }
            } else if (cmdVar == cmd.b) {
                jeb.L(f7m0Var, list);
            }
            fms0Var.b(l4eVar.s(), fL, l4eVar.m());
            l4eVar.T(fms0Var.l);
            l4eVar.O(fms0Var.m);
            arrayList = l4eVar.u0;
            size = arrayList.size();
            i = 0;
            while (i < size) {
                k4e k4eVar2 = (k4e) arrayList.get(i);
                obj = k4eVar2.h0;
                if (obj instanceof pj30) {
                    pj30Var = (pj30) obj;
                } else {
                    pj30Var = null;
                }
                if (pj30Var == null) {
                    LinkedHashMap linkedHashMap5 = ot40Var.b;
                    iMax = Math.max(0, vdv0Var.d - vdv0Var.b);
                    iMax2 = Math.max(0, vdv0Var.e - vdv0Var.c);
                    if (iMax >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (iMax2 >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!(z & z2)) {
                        zcx.a("width and height must be >= 0");
                    }
                    linkedHashMap5.put(pj30Var, pj30Var.S(r4e.h(iMax, iMax, iMax2, iMax2)));
                    linkedHashMap3.put(h8x.I(pj30Var), vdv0Var);
                }
                i++;
                size = size;
                arrayList = arrayList;
            }
            ot40Var.j = new p4e(j);
            long jB2 = n2x.b(l4eVar.s(), l4eVar.m());
            nie0Var.f23583a = cmdVar2;
            return vj30.x(vj30Var, (int) (jB2 >> 32), (int) (jB2 & 4294967295L), new v43(ot40Var, list, linkedHashMap, (byte) 1));
        }
        linkedHashMap = linkedHashMap2;
        nie0Var = nie0Var2;
        fms0Var.b.clear();
        ot40Var.b.clear();
        ot40Var.c.clear();
        ot40Var.d.clear();
        if (p4e.g(j)) {
            tmkVarH = tmk.e(p4e.i(j));
        } else {
            tmkVarH = tmk.h();
            int iK = p4e.k(j);
            if (iK >= 0) {
                tmkVarH.b = iK;
            }
        }
        f7m0Var.f.d0 = tmkVarH;
        if (p4e.f(j)) {
            tmkVarH2 = tmk.e(p4e.h(j));
        } else {
            tmkVarH2 = tmk.h();
            int iJ = p4e.j(j);
            if (iJ >= 0) {
                tmkVarH2.b = iJ;
            }
        }
        f7m0Var.f.e0 = tmkVarH2;
        f7m0Var.l = j;
        f7m0Var.b = !(layoutDirection == k6z.b);
        ot40Var.h(this.c, list, j);
        fms0Var.f(l4eVar, 0);
        ot40Var.h(this.d, list, j);
        fms0Var.f(l4eVar, 1);
        mms0 mms0Var = this.e;
        if (mms0Var != null) {
            try {
                xsm0.r(mms0Var.f22058a, fms0Var);
            } catch (ch9 e) {
                Log.e("CML", "Error parsing JSON " + e);
            }
        }
        fms0Var.b(l4eVar.s(), fL, l4eVar.m());
        l4eVar.T(fms0Var.l);
        l4eVar.O(fms0Var.m);
        arrayList = l4eVar.u0;
        size = arrayList.size();
        i = 0;
        while (i < size) {
            k4e k4eVar3 = (k4e) arrayList.get(i);
            obj = k4eVar3.h0;
            if (obj instanceof pj30) {
                pj30Var = (pj30) obj;
            } else {
                pj30Var = null;
            }
            if (pj30Var == null) {
                LinkedHashMap linkedHashMap6 = ot40Var.b;
                iMax = Math.max(0, vdv0Var.d - vdv0Var.b);
                iMax2 = Math.max(0, vdv0Var.e - vdv0Var.c);
                if (iMax >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (iMax2 >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!(z & z2)) {
                    zcx.a("width and height must be >= 0");
                }
                linkedHashMap6.put(pj30Var, pj30Var.S(r4e.h(iMax, iMax, iMax2, iMax2)));
                linkedHashMap3.put(h8x.I(pj30Var), vdv0Var);
            }
            i++;
            size = size;
            arrayList = arrayList;
        }
        ot40Var.j = new p4e(j);
        long jB3 = n2x.b(l4eVar.s(), l4eVar.m());
        nie0Var.f23583a = cmdVar2;
        return vj30.x(vj30Var, (int) (jB3 >> 32), (int) (jB3 & 4294967295L), new v43(ot40Var, list, linkedHashMap, (byte) 1));
    }
}
