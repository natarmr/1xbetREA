package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nr40 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nr40 f23985a;
    private static final ugi0 descriptor;

    static {
        nr40 nr40Var = new nr40();
        f23985a = nr40Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.event_card.domain.models.MortalKombatRoundResponse", nr40Var, 6);
        zna0Var.j(TokenNames.R, true);
        zna0Var.j("W", true);
        zna0Var.j("DI", true);
        zna0Var.j("WT", true);
        zna0Var.j(TokenNames.T, true);
        zna0Var.j("FW", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(s710.f31729a), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        String str2 = null;
        Integer num2 = null;
        Long l = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num2);
                    i |= 8;
                    break;
                case 4:
                    l = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new pr40(i, num, str, str2, num2, l, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pr40 pr40Var = (pr40) obj;
        pr40Var.getClass();
        Boolean bool = pr40Var.f;
        Long l = pr40Var.e;
        Integer num = pr40Var.d;
        String str = pr40Var.c;
        String str2 = pr40Var.b;
        Integer num2 = pr40Var.f27448a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
