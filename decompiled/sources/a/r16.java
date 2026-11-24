package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r16 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r16 f29661a;
    private static final ugi0 descriptor;

    static {
        r16 r16Var = new r16();
        f29661a = r16Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.message.BaseResponseWithMessage", r16Var, 4);
        zna0Var.j("Success", true);
        zna0Var.j("Message", true);
        zna0Var.j("MessageId", true);
        zna0Var.j("ErrorCode", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(sm8.f32432a);
        jiy jiyVarJ1 = mrv.j0(ysm0.f43175a);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(s710Var), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        String str = null;
        Long l = null;
        Long l2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                l = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                l2 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l2);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new t16(i, bool, str, l, l2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        t16 t16Var = (t16) obj;
        t16Var.getClass();
        Long l = t16Var.d;
        Long l2 = t16Var.c;
        String str = t16Var.b;
        Boolean bool = t16Var.f33154a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
