package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class aw70 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aw70 f1560a;
    private static final ugi0 descriptor;

    static {
        aw70 aw70Var = new aw70();
        f1560a = aw70Var;
        zna0 zna0Var = new zna0("org.xplatform.promotions.web_view.webview_messages.OpenBettingMessage", aw70Var, 7);
        zna0Var.j("cyberType", true);
        zna0Var.j("section", true);
        zna0Var.j("sportId", true);
        zna0Var.j("sportSubId", true);
        zna0Var.j("menuSection", true);
        zna0Var.j("gameId", true);
        zna0Var.j("champId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(okx.f25427a);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        String str = null;
        String str2 = null;
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
                    l = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l);
                    i |= 4;
                    break;
                case 3:
                    l2 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l2);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str2);
                    i |= 16;
                    break;
                case 5:
                    l3 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l3);
                    i |= 32;
                    break;
                case 6:
                    l4 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l4);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new ew70(i, num, l, l2, l3, l4, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ew70 ew70Var = (ew70) obj;
        ew70Var.getClass();
        Long l = ew70Var.g;
        Long l2 = ew70Var.f;
        String str = ew70Var.e;
        Long l3 = ew70Var.d;
        Long l4 = ew70Var.c;
        String str2 = ew70Var.b;
        Integer num = ew70Var.f8509a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
