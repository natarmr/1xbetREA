package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ics0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ics0 f14550a;
    private static final ugi0 descriptor;

    static {
        ics0 ics0Var = new ics0();
        f14550a = ics0Var;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.TrackMessageWSEvent", ics0Var, 3);
        zna0Var.j("tracker", true);
        zna0Var.j("chatId", true);
        zna0Var.j("dialogId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(fcs0.f9326a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        hcs0 hcs0Var = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                hcs0Var = (hcs0) bldVarA.e(ugi0Var, 0, fcs0.f9326a, hcs0Var);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new kcs0(i, hcs0Var, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kcs0 kcs0Var = (kcs0) obj;
        kcs0Var.getClass();
        String str = kcs0Var.c;
        String str2 = kcs0Var.b;
        hcs0 hcs0Var = kcs0Var.f18076a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || hcs0Var != null) {
            cldVarA.p(ugi0Var, 0, fcs0.f9326a, hcs0Var);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
