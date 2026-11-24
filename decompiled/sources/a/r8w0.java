package a;

import com.huawei.hms.adapter.internal.CommonCode;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r8w0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r8w0 f30048a;
    public static final zna0 b;

    static {
        r8w0 r8w0Var = new r8w0();
        f30048a = r8w0Var;
        zna0 zna0Var = new zna0("org.xplatform.fingerprint.impl.model.SensorData", r8w0Var, 6);
        zna0Var.j("name", false);
        zna0Var.j("vendor", false);
        zna0Var.j("version", false);
        zna0Var.j("power", false);
        zna0Var.j("maxRange", false);
        zna0Var.j(CommonCode.MapKey.HAS_RESOLUTION, false);
        b = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        klq klqVar = klq.f18504a;
        return new jiy[]{ysm0Var, ysm0Var, okx.f25427a, klqVar, klqVar, klqVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        zna0 zna0Var = b;
        bld bldVarA = rkjVar.a(zna0Var);
        int i = 0;
        int iJ = 0;
        String strX = null;
        String strX2 = null;
        float fN = 0.0f;
        float fN2 = 0.0f;
        float fN3 = 0.0f;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(zna0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strX = bldVarA.x(zna0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strX2 = bldVarA.x(zna0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iJ = bldVarA.j(zna0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    fN = bldVarA.n(zna0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    fN2 = bldVarA.n(zna0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    fN3 = bldVarA.n(zna0Var, 5);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(zna0Var);
        return new u8w0(i, strX, strX2, iJ, fN, fN2, fN3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        u8w0 u8w0Var = (u8w0) obj;
        u8w0Var.getClass();
        zna0 zna0Var = b;
        cld cldVarA = bwnVar.a(zna0Var);
        cldVarA.z(zna0Var, 0, u8w0Var.f35253a);
        cldVarA.z(zna0Var, 1, u8w0Var.b);
        cldVarA.i(2, u8w0Var.c, zna0Var);
        cldVarA.o(zna0Var, 3, u8w0Var.d);
        cldVarA.o(zna0Var, 4, u8w0Var.e);
        cldVarA.o(zna0Var, 5, u8w0Var.f);
        cldVarA.c(zna0Var);
    }
}
