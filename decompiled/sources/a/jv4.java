package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jv4 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jv4 f17189a;
    private static final ugi0 descriptor;

    static {
        jv4 jv4Var = new jv4();
        f17189a = jv4Var;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.core.data.models.request.AutoBetCancelRequest", jv4Var, 6);
        zna0Var.j("UserId", false);
        zna0Var.j("UserIdBonus", false);
        zna0Var.j("AppGuid", false);
        zna0Var.j("Language", false);
        zna0Var.j("Id", false);
        zna0Var.j("Lng", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{s710Var, s710Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        long jR = 0;
        long jR2 = 0;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jR = bldVarA.r(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    jR2 = bldVarA.r(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strX = bldVarA.x(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strX2 = bldVarA.x(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strX3 = bldVarA.x(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strX4 = bldVarA.x(ugi0Var, 5);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new nv4(i, jR, jR2, strX, strX2, strX3, strX4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nv4 nv4Var = (nv4) obj;
        nv4Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        long j = nv4Var.f24173a;
        String str = nv4Var.f;
        cldVarA.n(ugi0Var, 0, j);
        cldVarA.n(ugi0Var, 1, nv4Var.b);
        cldVarA.z(ugi0Var, 2, nv4Var.c);
        String str2 = nv4Var.d;
        cldVarA.z(ugi0Var, 3, str2);
        cldVarA.z(ugi0Var, 4, nv4Var.e);
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, str2)) {
            cldVarA.z(ugi0Var, 5, str);
        }
        cldVarA.c(ugi0Var);
    }
}
