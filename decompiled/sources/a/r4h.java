package a;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r4h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r4h f29834a;
    private static final ugi0 descriptor;

    static {
        r4h r4hVar = new r4h();
        f29834a = r4hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.lol.CyberLolTeamStatisticResponse", r4hVar, 11);
        zna0Var.j("HR", true);
        zna0Var.j("BH", true);
        zna0Var.j("KL", true);
        zna0Var.j("TW", true);
        zna0Var.j(SDPKeywords.IN, true);
        zna0Var.j("BR", true);
        zna0Var.j("DR", true);
        zna0Var.j("DT", true);
        zna0Var.j("SD", true);
        zna0Var.j("GL", true);
        zna0Var.j("GH", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = t4h.l;
        jiy jiyVarJ0 = mrv.j0((jiy) a8zVarArr[0].getValue());
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[7].getValue()), mrv.j0(okxVar), mrv.j0(klq.f18504a), mrv.j0((jiy) a8zVarArr[10].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = t4h.l;
        List list = null;
        Float f = null;
        Integer num = null;
        boolean z = true;
        List list2 = null;
        int i = 0;
        List list3 = null;
        List list4 = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        while (true) {
            while (true) {
                if (!z) {
                    bldVarA.c(ugi0Var);
                    return new t4h(i, list3, list4, num2, num3, num4, num5, num6, list2, num, f, list);
                }
                int iF = bldVarA.f(ugi0Var);
                switch (iF) {
                    case -1:
                        z = false;
                        continue;
                        break;
                    case 0:
                        a8z[] a8zVarArr3 = a8zVarArr2;
                        list3 = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr3[0].getValue(), list3);
                        i |= 1;
                        a8zVarArr2 = a8zVarArr3;
                        z = z;
                        continue;
                        break;
                    case 1:
                        a8zVarArr = a8zVarArr2;
                        list4 = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list4);
                        i |= 2;
                        break;
                    case 2:
                        a8zVarArr = a8zVarArr2;
                        num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                        i |= 4;
                        break;
                    case 3:
                        a8zVarArr = a8zVarArr2;
                        num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                        i |= 8;
                        break;
                    case 4:
                        a8zVarArr = a8zVarArr2;
                        num4 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num4);
                        i |= 16;
                        break;
                    case 5:
                        a8zVarArr = a8zVarArr2;
                        num5 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num5);
                        i |= 32;
                        break;
                    case 6:
                        a8zVarArr = a8zVarArr2;
                        num6 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num6);
                        i |= 64;
                        break;
                    case 7:
                        a8zVarArr = a8zVarArr2;
                        list2 = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list2);
                        i |= 128;
                        break;
                    case 8:
                        a8zVarArr = a8zVarArr2;
                        num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                        i |= 256;
                        break;
                    case 9:
                        a8zVarArr = a8zVarArr2;
                        f = (Float) bldVarA.e(ugi0Var, 9, klq.f18504a, f);
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
        }
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        t4h t4hVar = (t4h) obj;
        t4hVar.getClass();
        List list = t4hVar.k;
        Float f = t4hVar.j;
        Integer num = t4hVar.i;
        List list2 = t4hVar.h;
        Integer num2 = t4hVar.g;
        Integer num3 = t4hVar.f;
        Integer num4 = t4hVar.e;
        Integer num5 = t4hVar.d;
        Integer num6 = t4hVar.c;
        List list3 = t4hVar.b;
        List list4 = t4hVar.f33319a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = t4h.l;
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 9, klq.f18504a, f);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
