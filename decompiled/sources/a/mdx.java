package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mdx implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mdx f21618a;
    private static final ugi0 descriptor;

    static {
        mdx mdxVar = new mdx();
        f21618a = mdxVar;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.games.InnStatsResponse", mdxVar, 4);
        zna0Var.j("team", true);
        zna0Var.j("wickets", true);
        zna0Var.j("over", true);
        zna0Var.j("overStr", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(tbl.f33669a), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Double d = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                i |= 2;
            } else if (iF == 2) {
                d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new odx(i, num, num2, d, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        odx odxVar = (odx) obj;
        odxVar.getClass();
        String str = odxVar.d;
        Double d = odxVar.c;
        Integer num = odxVar.b;
        Integer num2 = odxVar.f25097a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
