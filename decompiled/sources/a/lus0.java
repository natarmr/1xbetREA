package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lus0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lus0 f20689a;
    private static final ugi0 descriptor;

    static {
        lus0 lus0Var = new lus0();
        f20689a = lus0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.twenty_one.TwentyOneResponse", lus0Var, 7);
        zna0Var.j("Ch", true);
        zna0Var.j("P1", true);
        byte b = 0;
        zna0Var.k(new kus0(new String[]{"P"}, b));
        zna0Var.j("P2", true);
        zna0Var.k(new kus0(new String[]{"D"}, b));
        zna0Var.j("RSc1", true);
        zna0Var.j("RSc2", true);
        zna0Var.j("STATE", true);
        zna0Var.j(TokenNames.S, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = nus0.h;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = nus0.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        List list2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    list2 = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str5);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new nus0(i, str, list, list2, str2, str3, str4, str5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nus0 nus0Var = (nus0) obj;
        nus0Var.getClass();
        String str = nus0Var.g;
        String str2 = nus0Var.f;
        String str3 = nus0Var.e;
        String str4 = nus0Var.d;
        List list = nus0Var.c;
        List list2 = nus0Var.b;
        String str5 = nus0Var.f24160a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = nus0.h;
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
