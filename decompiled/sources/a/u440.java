package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u440 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u440 f35027a;
    private static final ugi0 descriptor;

    static {
        u440 u440Var = new u440();
        f35027a = u440Var;
        zna0 zna0Var = new zna0("org.xplatform.messages.data.models.MessageExtensionResponse", u440Var, 4);
        zna0Var.j("typeId", true);
        zna0Var.j("typeName", true);
        zna0Var.j("buttonText", true);
        zna0Var.j("actionData", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(z340.f43702a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        String str = null;
        String str2 = null;
        b440 b440Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                b440Var = (b440) bldVarA.e(ugi0Var, 3, z340.f43702a, b440Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new w440(i, l, str, str2, b440Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        w440 w440Var = (w440) obj;
        w440Var.getClass();
        b440 b440Var = w440Var.d;
        String str = w440Var.c;
        String str2 = w440Var.b;
        Long l = w440Var.f38528a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || b440Var != null) {
            cldVarA.p(ugi0Var, 3, z340.f43702a, b440Var);
        }
        cldVarA.c(ugi0Var);
    }
}
