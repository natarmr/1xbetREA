package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eik0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eik0 f7865a;
    private static final ugi0 descriptor;

    static {
        eik0 eik0Var = new eik0();
        f7865a = eik0Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.api.main.domain.eventinfo.model.SocialNetModel", eik0Var, 2);
        zna0Var.j(Payload.TYPE, false);
        zna0Var.j("link", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{hik0.c[0].getValue(), ysm0.f43175a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = hik0.c;
        boolean z = true;
        int i = 0;
        gik0 gik0Var = null;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                gik0Var = (gik0) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), gik0Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new hik0(i, gik0Var, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hik0 hik0Var = (hik0) obj;
        hik0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, (jiy) hik0.c[0].getValue(), hik0Var.f13117a);
        cldVarA.z(ugi0Var, 1, hik0Var.b);
        cldVarA.c(ugi0Var);
    }
}
