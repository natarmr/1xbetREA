package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qsd implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qsd f29252a;
    private static final ugi0 descriptor;

    static {
        qsd qsdVar = new qsd();
        f29252a = qsdVar;
        zna0 zna0Var = new zna0("org.xplatform.remoteconfig.domain.models.ConfigValueDiffModel", qsdVar, 3);
        zna0Var.j("sourceValue", false);
        zna0Var.j("changedValue", false);
        zna0Var.j("possibleValues", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = ssd.d;
        qcy qcyVar = qcy.f28507a;
        return new jiy[]{mrv.j0(qcyVar), mrv.j0(qcyVar), mrv.j0((jiy) a8zVarArr[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ssd.d;
        boolean z = true;
        int i = 0;
        mcy mcyVar = null;
        mcy mcyVar2 = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                mcyVar = (mcy) bldVarA.e(ugi0Var, 0, qcy.f28507a, mcyVar);
                i |= 1;
            } else if (iF == 1) {
                mcyVar2 = (mcy) bldVarA.e(ugi0Var, 1, qcy.f28507a, mcyVar2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new ssd(i, mcyVar, mcyVar2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ssd ssdVar = (ssd) obj;
        ssdVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ssd.d;
        qcy qcyVar = qcy.f28507a;
        cldVarA.p(ugi0Var, 0, qcyVar, ssdVar.f32720a);
        cldVarA.p(ugi0Var, 1, qcyVar, ssdVar.b);
        cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), ssdVar.c);
        cldVarA.c(ugi0Var);
    }
}
