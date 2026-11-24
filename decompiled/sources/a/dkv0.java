package a;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dkv0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dkv0 f6252a;
    private static final ugi0 descriptor;

    static {
        dkv0 dkv0Var = new dkv0();
        f6252a = dkv0Var;
        zna0 zna0Var = new zna0("org.xplatform.tile_matching.data.response.gems_odyssey.WinningCombinationResponse", dkv0Var, 2);
        zna0Var.j("CR", true);
        zna0Var.j(SDPKeywords.IN, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0((jiy) fkv0.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = fkv0.c;
        boolean z = true;
        int i = 0;
        Integer num = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new fkv0(i, num, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fkv0 fkv0Var = (fkv0) obj;
        fkv0Var.getClass();
        List list = fkv0Var.b;
        Integer num = fkv0Var.f9712a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = fkv0.c;
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
