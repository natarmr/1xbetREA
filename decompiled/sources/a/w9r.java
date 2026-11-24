package a;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w9r implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w9r f38794a;
    private static final ugi0 descriptor;

    static {
        w9r w9rVar = new w9r();
        f38794a = w9rVar;
        zna0 zna0Var = new zna0("org.xplatform.tile_matching.data.response.fruit_blast.FruitBlastWinCombinationResponse", w9rVar, 2);
        zna0Var.j("FB", true);
        zna0Var.j(SDPKeywords.IN, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0((jiy) y9r.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = y9r.c;
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
        return new y9r(i, num, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        y9r y9rVar = (y9r) obj;
        y9rVar.getClass();
        List list = y9rVar.b;
        Integer num = y9rVar.f42263a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = y9r.c;
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
