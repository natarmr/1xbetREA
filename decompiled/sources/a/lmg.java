package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lmg implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lmg f20295a;
    private static final ugi0 descriptor;

    static {
        lmg lmgVar = new lmg();
        f20295a = lmgVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.cyberstatistic.impl.data.model.matches.CyberDotaMatchesStatisticMatchResponse", lmgVar, 11);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("radientTeam", true);
        zna0Var.j("direTeam", true);
        zna0Var.j("durationSeconds", true);
        zna0Var.j("startTimeStamp", true);
        zna0Var.j("endTimeStamp", true);
        zna0Var.j("networthGraph", true);
        zna0Var.j("expGraph", true);
        zna0Var.j("radientWinrateGraph", true);
        zna0Var.j("pickBans", true);
        zna0Var.j("logs", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = nmg.l;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        j8h j8hVar = j8h.f16083a;
        return new jiy[]{jiyVarJ0, mrv.j0(j8hVar), mrv.j0(j8hVar), mrv.j0(okx.f25427a), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[6].getValue()), mrv.j0((jiy) a8zVarArr[7].getValue()), mrv.j0((jiy) a8zVarArr[8].getValue()), mrv.j0((jiy) a8zVarArr[9].getValue()), mrv.j0((jiy) a8zVarArr[10].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = nmg.l;
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = true;
        List list4 = null;
        int i = 0;
        Long l = null;
        l8h l8hVar = null;
        l8h l8hVar2 = null;
        Integer num = null;
        Long l2 = null;
        Long l3 = null;
        List list5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    l8hVar = (l8h) bldVarA.e(ugi0Var, 1, j8h.f16083a, l8hVar);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    l8hVar2 = (l8h) bldVarA.e(ugi0Var, 2, j8h.f16083a, l8hVar2);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    num = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    l2 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l2);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    l3 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l3);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    list5 = (List) bldVarA.e(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list5);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    list4 = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list4);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    list3 = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list3);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    list2 = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list2);
                    i |= 512;
                    break;
                case 10:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list);
                    i |= 1024;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
            z = z;
        }
        bldVarA.c(ugi0Var);
        return new nmg(i, l, l8hVar, l8hVar2, num, l2, l3, list5, list4, list3, list2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nmg nmgVar = (nmg) obj;
        nmgVar.getClass();
        List list = nmgVar.k;
        List list2 = nmgVar.j;
        List list3 = nmgVar.i;
        List list4 = nmgVar.h;
        List list5 = nmgVar.g;
        Long l = nmgVar.f;
        Long l2 = nmgVar.e;
        Integer num = nmgVar.d;
        l8h l8hVar = nmgVar.c;
        l8h l8hVar2 = nmgVar.b;
        Long l3 = nmgVar.f23770a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = nmg.l;
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l8hVar2 != null) {
            cldVarA.p(ugi0Var, 1, j8h.f16083a, l8hVar2);
        }
        if (cldVarA.u(ugi0Var) || l8hVar != null) {
            cldVarA.p(ugi0Var, 2, j8h.f16083a, l8hVar);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list5 != null) {
            cldVarA.p(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list5);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
