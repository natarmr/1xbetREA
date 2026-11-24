package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lda0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lda0 f19841a;
    private static final ugi0 descriptor;

    static {
        lda0 lda0Var = new lda0();
        f19841a = lda0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.player_transfers.data.model.PlayerTransfersPlayerResponse", lda0Var, 7);
        zna0Var.j("nickname", true);
        zna0Var.j("realName", true);
        zna0Var.j("country", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("flagImageS3", true);
        zna0Var.j("totalWinnings", true);
        zna0Var.j("lngSideLeft", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okx.f25427a), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str5);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num);
                    i |= 32;
                    break;
                case 6:
                    bool = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new nda0(i, str, str2, str3, str4, str5, num, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nda0 nda0Var = (nda0) obj;
        nda0Var.getClass();
        Boolean bool = nda0Var.g;
        Integer num = nda0Var.f;
        String str = nda0Var.e;
        String str2 = nda0Var.d;
        String str3 = nda0Var.c;
        String str4 = nda0Var.b;
        String str5 = nda0Var.f23330a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
