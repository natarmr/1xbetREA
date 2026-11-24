package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ku9 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ku9 f18901a;
    private static final ugi0 descriptor;

    static {
        ku9 ku9Var = new ku9();
        f18901a = ku9Var;
        zna0 zna0Var = new zna0("org.xplatform.callback.impl.data.model.response.CallbackResponse", ku9Var, 8);
        zna0Var.j("Id", true);
        zna0Var.j("Dt", true);
        zna0Var.j("Phone", true);
        zna0Var.j("Called", true);
        zna0Var.j("DtCalled", true);
        zna0Var.j("Guid", true);
        zna0Var.j("NeedFeedback", true);
        zna0Var.j("FeedbackRate", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(okxVar), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(sm8.f32432a), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        String str = null;
        Integer num = null;
        Long l3 = null;
        String str2 = null;
        Boolean bool = null;
        Integer num2 = null;
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
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    break;
                case 2:
                    str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num);
                    i |= 8;
                    break;
                case 4:
                    l3 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l3);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str2);
                    i |= 32;
                    break;
                case 6:
                    bool = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool);
                    i |= 64;
                    break;
                case 7:
                    num2 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num2);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new mu9(i, l, l2, str, num, l3, str2, bool, num2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mu9 mu9Var = (mu9) obj;
        mu9Var.getClass();
        Integer num = mu9Var.h;
        Boolean bool = mu9Var.g;
        String str = mu9Var.f;
        Long l = mu9Var.e;
        Integer num2 = mu9Var.d;
        String str2 = mu9Var.c;
        Long l2 = mu9Var.b;
        Long l3 = mu9Var.f22404a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
