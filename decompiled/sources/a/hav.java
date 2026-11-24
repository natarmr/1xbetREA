package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hav implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hav f12743a;
    private static final ugi0 descriptor;

    static {
        hav havVar = new hav();
        f12743a = havVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.gold_rush.GoldRushResponse", havVar, 11);
        zna0Var.j("M1", true);
        zna0Var.j("M2", true);
        zna0Var.j(TokenNames.T, true);
        zna0Var.j("P", true);
        zna0Var.j("SMain", true);
        zna0Var.j("SDop", true);
        zna0Var.j("AC2", true);
        zna0Var.j("AC1", true);
        zna0Var.j(TokenNames.S, true);
        zna0Var.j("P1", true);
        zna0Var.j("P2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = jav.l;
        jiy jiyVarJ0 = mrv.j0((jiy) a8zVarArr[0].getValue());
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[6].getValue()), mrv.j0((jiy) a8zVarArr[7].getValue()), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = jav.l;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        boolean z = true;
        List list = null;
        int i = 0;
        List list2 = null;
        List list3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        List list4 = null;
        while (true) {
            while (true) {
                if (!z) {
                    bldVarA.c(ugi0Var);
                    return new jav(i, list2, list3, num4, num5, num6, num7, list4, list, num3, num2, num);
                }
                int iF = bldVarA.f(ugi0Var);
                switch (iF) {
                    case -1:
                        z = false;
                        continue;
                        break;
                    case 0:
                        a8z[] a8zVarArr3 = a8zVarArr2;
                        list2 = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr3[0].getValue(), list2);
                        i |= 1;
                        a8zVarArr2 = a8zVarArr3;
                        z = z;
                        continue;
                        break;
                    case 1:
                        a8zVarArr = a8zVarArr2;
                        list3 = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list3);
                        i |= 2;
                        break;
                    case 2:
                        a8zVarArr = a8zVarArr2;
                        num4 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num4);
                        i |= 4;
                        break;
                    case 3:
                        a8zVarArr = a8zVarArr2;
                        num5 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num5);
                        i |= 8;
                        break;
                    case 4:
                        a8zVarArr = a8zVarArr2;
                        num6 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num6);
                        i |= 16;
                        break;
                    case 5:
                        a8zVarArr = a8zVarArr2;
                        num7 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num7);
                        i |= 32;
                        break;
                    case 6:
                        a8zVarArr = a8zVarArr2;
                        list4 = (List) bldVarA.e(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list4);
                        i |= 64;
                        break;
                    case 7:
                        a8zVarArr = a8zVarArr2;
                        list = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
                        i |= 128;
                        break;
                    case 8:
                        a8zVarArr = a8zVarArr2;
                        num3 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num3);
                        i |= 256;
                        break;
                    case 9:
                        a8zVarArr = a8zVarArr2;
                        num2 = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num2);
                        i |= 512;
                        break;
                    case 10:
                        a8zVarArr = a8zVarArr2;
                        num = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num);
                        i |= 1024;
                        break;
                    default:
                        itt0.c(iF);
                        return null;
                }
                a8zVarArr2 = a8zVarArr;
                z = z;
            }
        }
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jav javVar = (jav) obj;
        javVar.getClass();
        Integer num = javVar.k;
        Integer num2 = javVar.j;
        Integer num3 = javVar.i;
        List list = javVar.h;
        List list2 = javVar.g;
        Integer num4 = javVar.f;
        Integer num5 = javVar.e;
        Integer num6 = javVar.d;
        Integer num7 = javVar.c;
        List list3 = javVar.b;
        List list4 = javVar.f16209a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = jav.l;
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || num7 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num7);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
