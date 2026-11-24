package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eas implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eas f7483a;
    private static final ugi0 descriptor;

    static {
        eas easVar = new eas();
        f7483a = easVar;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.mainfeed.GameEventItemResponse", easVar, 9);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("blocked", true);
        zna0Var.j("player", true);
        zna0Var.j("parameter", true);
        zna0Var.j("cf", true);
        zna0Var.j("cfView", true);
        zna0Var.j("isCenter", true);
        zna0Var.j("ruleId", true);
        zna0Var.j("eventParams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ1 = mrv.j0(sm8Var);
        jiy jiyVarJ2 = mrv.j0(ofo.f25178a);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(ysm0.f43175a), mrv.j0(sm8Var), mrv.j0(s710Var), mrv.j0(ffo.f9455a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        lfo lfoVar = null;
        Long l = null;
        Boolean bool = null;
        qfo qfoVar = null;
        Double d = null;
        Double d2 = null;
        String str = null;
        Boolean bool2 = null;
        Long l2 = null;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                    i |= 2;
                    break;
                case 2:
                    qfoVar = (qfo) bldVarA.e(ugi0Var, 2, ofo.f25178a, qfoVar);
                    i |= 4;
                    break;
                case 3:
                    d = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d);
                    i |= 8;
                    break;
                case 4:
                    d2 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d2);
                    i |= 16;
                    break;
                case 5:
                    str = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str);
                    i |= 32;
                    break;
                case 6:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool2);
                    i |= 64;
                    break;
                case 7:
                    l2 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l2);
                    i |= 128;
                    break;
                case 8:
                    lfoVar = (lfo) bldVarA.e(ugi0Var, 8, ffo.f9455a, lfoVar);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new gas(i, l, bool, qfoVar, d, d2, str, bool2, l2, lfoVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gas gasVar = (gas) obj;
        gasVar.getClass();
        lfo lfoVar = gasVar.i;
        Long l = gasVar.h;
        Boolean bool = gasVar.g;
        String str = gasVar.f;
        Double d = gasVar.e;
        Double d2 = gasVar.d;
        qfo qfoVar = gasVar.c;
        Boolean bool2 = gasVar.b;
        Long l2 = gasVar.f10984a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || qfoVar != null) {
            cldVarA.p(ugi0Var, 2, ofo.f25178a, qfoVar);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || lfoVar != null) {
            cldVarA.p(ugi0Var, 8, ffo.f9455a, lfoVar);
        }
        cldVarA.c(ugi0Var);
    }
}
