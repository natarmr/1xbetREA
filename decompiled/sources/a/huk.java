package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class huk implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final huk f13684a;
    private static final ugi0 descriptor;

    static {
        huk hukVar = new huk();
        f13684a = hukVar;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.medal_statistic.data.models.DisciplineResponse", hukVar, 1);
        zna0Var.j("options", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) juk.b[0].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = juk.b;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new juk(i, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        juk jukVar = (juk) obj;
        jukVar.getClass();
        List list = jukVar.f17157a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = juk.b;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
