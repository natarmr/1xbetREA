package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vn9 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vn9 f37709a;
    private static final ugi0 descriptor;

    static {
        vn9 vn9Var = new vn9();
        f37709a = vn9Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.championships.universal.data.model.calendar_tournament.playoff.CalendarTournamentRoundPlayoffResponse", vn9Var, 4);
        zna0Var.j("name", true);
        zna0Var.j("isThirdPlace", true);
        zna0Var.j("isGrandFinal", true);
        zna0Var.j("matches", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = xn9.e;
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0((jiy) a8zVarArr[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = xn9.e;
        boolean z = true;
        int i = 0;
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                i |= 2;
            } else if (iF == 2) {
                bool2 = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new xn9(i, str, bool, bool2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xn9 xn9Var = (xn9) obj;
        xn9Var.getClass();
        List list = xn9Var.d;
        Boolean bool = xn9Var.c;
        Boolean bool2 = xn9Var.b;
        String str = xn9Var.f41163a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = xn9.e;
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
