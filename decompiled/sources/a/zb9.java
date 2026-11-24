package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zb9 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zb9 f44104a;
    private static final ugi0 descriptor;

    static {
        zb9 zb9Var = new zb9();
        f44104a = zb9Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.make_bet.data.model.BuilderCouponResponse", zb9Var, 7);
        zna0Var.j(TokenNames.I, true);
        zna0Var.j(TokenNames.E, true);
        zna0Var.j("G", true);
        zna0Var.j("SportId", true);
        zna0Var.j("Block", true);
        zna0Var.j("ExceptionText", true);
        zna0Var.j("ExceptionId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = bc9.h;
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0(s710Var), mrv.j0(sm8.f32432a), mrv.j0(ysm0.f43175a), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = bc9.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        List list = null;
        List list2 = null;
        Long l2 = null;
        Boolean bool = null;
        String str = null;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
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
                    l2 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l2);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool);
                    i |= 16;
                    break;
                case 5:
                    str = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str);
                    i |= 32;
                    break;
                case 6:
                    num = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new bc9(i, l, list, list2, l2, bool, str, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bc9 bc9Var = (bc9) obj;
        bc9Var.getClass();
        Integer num = bc9Var.g;
        String str = bc9Var.f;
        Boolean bool = bc9Var.e;
        Long l = bc9Var.d;
        List list = bc9Var.c;
        List list2 = bc9Var.b;
        Long l2 = bc9Var.f2344a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = bc9.h;
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
