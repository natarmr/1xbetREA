package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tqs implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tqs f34395a;
    private static final ugi0 descriptor;

    static {
        tqs tqsVar = new tqs();
        f34395a = tqsVar;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.zip.data.model.GameScoreZipResponse", tqsVar, 17);
        zna0Var.j("CPS", true);
        zna0Var.j("CP", true);
        zna0Var.j("FSS", true);
        zna0Var.j("PS", true);
        zna0Var.j("Sc1", true);
        zna0Var.j("Sc2", true);
        zna0Var.j("P", true);
        zna0Var.j("SS", true);
        zna0Var.j("PSS", true);
        zna0Var.j("TS", true);
        zna0Var.j("TD", true);
        zna0Var.j("TR", true);
        zna0Var.j(TokenNames.I, true);
        zna0Var.j(TokenNames.S, true);
        zna0Var.j("ST", true);
        zna0Var.j("BR", true);
        zna0Var.j("PC", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = vqs.r;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(lts.f20640a), mrv.j0(ysm0Var), mrv.j0(s710.f31729a), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[13].getValue()), mrv.j0((jiy) a8zVarArr[14].getValue()), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        String str;
        Integer num;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = vqs.r;
        Integer num2 = null;
        Integer num3 = null;
        Long l = null;
        String str2 = null;
        String str3 = null;
        nts ntsVar = null;
        int i2 = 0;
        List list = null;
        List list2 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        boolean z = true;
        String str4 = null;
        Integer num9 = null;
        String str5 = null;
        List list3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str4;
                    z = false;
                    num3 = num3;
                    num7 = num7;
                    str4 = str;
                    num2 = num2;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str4);
                    i2 |= 1;
                    num3 = num3;
                    num6 = num6;
                    num7 = num7;
                    str4 = str;
                    num2 = num2;
                    break;
                case 1:
                    num = num6;
                    num9 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num9);
                    i2 |= 2;
                    str5 = str5;
                    num6 = num;
                    num7 = num7;
                    num2 = num2;
                    break;
                case 2:
                    num = num6;
                    str5 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str5);
                    i2 |= 4;
                    num6 = num;
                    num7 = num7;
                    num2 = num2;
                    break;
                case 3:
                    num = num6;
                    list3 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list3);
                    i2 |= 8;
                    num6 = num;
                    num7 = num7;
                    num2 = num2;
                    break;
                case 4:
                    num2 = num2;
                    num7 = num7;
                    num6 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num6);
                    i2 |= 16;
                    num7 = num7;
                    num2 = num2;
                    break;
                case 5:
                    num2 = num2;
                    num7 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num7);
                    i2 |= 32;
                    num6 = num6;
                    num2 = num2;
                    break;
                case 6:
                    num6 = num6;
                    num7 = num7;
                    num8 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num8);
                    i2 |= 64;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 7:
                    num6 = num6;
                    num7 = num7;
                    ntsVar = (nts) bldVarA.e(ugi0Var, 7, lts.f20640a, ntsVar);
                    i2 |= 128;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 8:
                    num6 = num6;
                    num7 = num7;
                    str2 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str2);
                    i2 |= 256;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 9:
                    num6 = num6;
                    num7 = num7;
                    l = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l);
                    i2 |= 512;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 10:
                    num6 = num6;
                    num7 = num7;
                    num3 = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num3);
                    i2 |= 1024;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 11:
                    num6 = num6;
                    num7 = num7;
                    num2 = (Integer) bldVarA.e(ugi0Var, 11, okx.f25427a, num2);
                    i2 |= 2048;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 12:
                    num6 = num6;
                    num7 = num7;
                    str3 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str3);
                    i2 |= 4096;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 13:
                    num6 = num6;
                    num7 = num7;
                    list = (List) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list);
                    i2 |= 8192;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 14:
                    num6 = num6;
                    num7 = num7;
                    list2 = (List) bldVarA.e(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list2);
                    i2 |= 16384;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 15:
                    num4 = (Integer) bldVarA.e(ugi0Var, 15, okx.f25427a, num4);
                    i = 32768;
                    i2 |= i;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 16:
                    num5 = (Integer) bldVarA.e(ugi0Var, 16, okx.f25427a, num5);
                    i = 65536;
                    i2 |= i;
                    num6 = num6;
                    num7 = num7;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Integer num10 = num2;
        Integer num11 = num7;
        bldVarA.c(ugi0Var);
        return new vqs(i2, str4, num9, str5, list3, num6, num11, num8, ntsVar, str2, l, num3, num10, str3, list, list2, num4, num5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vqs vqsVar = (vqs) obj;
        vqsVar.getClass();
        Integer num = vqsVar.q;
        Integer num2 = vqsVar.p;
        List list = vqsVar.o;
        List list2 = vqsVar.n;
        String str = vqsVar.m;
        Integer num3 = vqsVar.l;
        Integer num4 = vqsVar.k;
        Long l = vqsVar.j;
        String str2 = vqsVar.i;
        nts ntsVar = vqsVar.h;
        Integer num5 = vqsVar.g;
        Integer num6 = vqsVar.f;
        Integer num7 = vqsVar.e;
        List list3 = vqsVar.d;
        String str3 = vqsVar.c;
        Integer num8 = vqsVar.b;
        String str4 = vqsVar.f37868a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = vqs.r;
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || num8 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num8);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || num7 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num7);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || ntsVar != null) {
            cldVarA.p(ugi0Var, 7, lts.f20640a, ntsVar);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 11, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list2 != 0) {
            cldVarA.p(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 15, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 16, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
