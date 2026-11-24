package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uet implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uet f35546a;
    private static final ugi0 descriptor;

    static {
        uet uetVar = new uet();
        f35546a = uetVar;
        zna0 zna0Var = new zna0("org.xplatform.tile_matching.data.request.GemsOdysseyActionRequest", uetVar, 5);
        zna0Var.j("UI", false);
        zna0Var.j("VU", true);
        zna0Var.j("AN", false);
        zna0Var.j("WH", false);
        zna0Var.j("LG", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = wet.f;
        okx okxVar = okx.f25427a;
        return new jiy[]{s710.f31729a, a8zVarArr[1].getValue(), okxVar, okxVar, ysm0.f43175a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = wet.f;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        long jR = 0;
        String strX = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                list = (List) bldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            } else if (iF == 2) {
                iJ = bldVarA.j(ugi0Var, 2);
                i |= 4;
            } else if (iF == 3) {
                iJ2 = bldVarA.j(ugi0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                strX = bldVarA.x(ugi0Var, 4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new wet(i, iJ, iJ2, jR, strX, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wet wetVar = (wet) obj;
        wetVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = wet.f;
        long j = wetVar.f39034a;
        List list = wetVar.b;
        cldVarA.n(ugi0Var, 0, j);
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(list, kotlin.collections.a.c(0))) {
            cldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        cldVarA.i(2, wetVar.c, ugi0Var);
        cldVarA.i(3, wetVar.d, ugi0Var);
        cldVarA.z(ugi0Var, 4, wetVar.e);
        cldVarA.c(ugi0Var);
    }
}
