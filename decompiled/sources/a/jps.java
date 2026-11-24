package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jps implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jps f16917a;
    private static final ugi0 descriptor;

    static {
        jps jpsVar = new jps();
        f16917a = jpsVar;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.who_win.data.model.response.GameResponse", jpsVar, 5);
        zna0Var.j("gameId", true);
        zna0Var.j("opponent1", true);
        zna0Var.j("opponent2", true);
        zna0Var.j("startTs", true);
        zna0Var.j("liga", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(okx.f25427a);
        tps tpsVar = tps.f34349a;
        return new jiy[]{jiyVarJ0, mrv.j0(tpsVar), mrv.j0(tpsVar), mrv.j0(s710.f31729a), mrv.j0(qps.f29135a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        vps vpsVar = null;
        vps vpsVar2 = null;
        Long l = null;
        sps spsVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                vpsVar = (vps) bldVarA.e(ugi0Var, 1, tps.f34349a, vpsVar);
                i |= 2;
            } else if (iF == 2) {
                vpsVar2 = (vps) bldVarA.e(ugi0Var, 2, tps.f34349a, vpsVar2);
                i |= 4;
            } else if (iF == 3) {
                l = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                spsVar = (sps) bldVarA.e(ugi0Var, 4, qps.f29135a, spsVar);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new aqs(i, num, vpsVar, vpsVar2, l, spsVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        aqs aqsVar = (aqs) obj;
        aqsVar.getClass();
        sps spsVar = aqsVar.e;
        Long l = aqsVar.d;
        vps vpsVar = aqsVar.c;
        vps vpsVar2 = aqsVar.b;
        Integer num = aqsVar.f1311a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || vpsVar2 != null) {
            cldVarA.p(ugi0Var, 1, tps.f34349a, vpsVar2);
        }
        if (cldVarA.u(ugi0Var) || vpsVar != null) {
            cldVarA.p(ugi0Var, 2, tps.f34349a, vpsVar);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || spsVar != null) {
            cldVarA.p(ugi0Var, 4, qps.f29135a, spsVar);
        }
        cldVarA.c(ugi0Var);
    }
}
