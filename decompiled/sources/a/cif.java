package a;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cif implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cif f4410a;
    private static final ugi0 descriptor;

    static {
        cif cifVar = new cif();
        f4410a = cifVar;
        zna0 zna0Var = new zna0("org.xplatform.crystal.data.models.responses.CrystalWinComboResponse", cifVar, 4);
        zna0Var.j("CF", true);
        zna0Var.j("CL", true);
        zna0Var.j("SW", true);
        zna0Var.j(SDPKeywords.IN, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = eif.e;
        tbl tblVar = tbl.f33669a;
        return new jiy[]{mrv.j0(tblVar), mrv.j0(okx.f25427a), mrv.j0(tblVar), mrv.j0((jiy) a8zVarArr[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = eif.e;
        boolean z = true;
        int i = 0;
        Double d = null;
        Integer num = null;
        Double d2 = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else if (iF == 2) {
                d2 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new eif(i, d, num, d2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        eif eifVar = (eif) obj;
        eifVar.getClass();
        List list = eifVar.d;
        Double d = eifVar.c;
        Integer num = eifVar.b;
        Double d2 = eifVar.f7856a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = eif.e;
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
