package a;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pns0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pns0 f27303a;
    private static final ugi0 descriptor;

    static {
        pns0 pns0Var = new pns0();
        f27303a = pns0Var;
        zna0 zna0Var = new zna0("org.xplatform.rules.api.data.models.TranslationMainResponse", pns0Var, 5);
        zna0Var.j("main", true);
        zna0Var.j("currency", true);
        zna0Var.j("vars", true);
        zna0Var.j("geo", true);
        zna0Var.j("refid", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = rns0.f;
        return new jiy[]{mrv.j0(ons0.f25563a), mrv.j0(evf.f8465a), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = rns0.f;
        boolean z = true;
        int i = 0;
        String str = null;
        ivf ivfVar = null;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ons0.f25563a, str);
                i |= 1;
            } else if (iF == 1) {
                ivfVar = (ivf) bldVarA.e(ugi0Var, 1, evf.f8465a, ivfVar);
                i |= 2;
            } else if (iF == 2) {
                map = (Map) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), map);
                i |= 4;
            } else if (iF == 3) {
                map2 = (Map) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), map2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                map3 = (Map) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), map3);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new rns0(i, str, ivfVar, map, map2, map3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rns0 rns0Var = (rns0) obj;
        rns0Var.getClass();
        Map map = rns0Var.e;
        Map map2 = rns0Var.d;
        Map map3 = rns0Var.c;
        ivf ivfVar = rns0Var.b;
        String str = rns0Var.f30805a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = rns0.f;
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "")) {
            cldVarA.p(ugi0Var, 0, ons0.f25563a, str);
        }
        if (cldVarA.u(ugi0Var) || ivfVar != null) {
            cldVarA.p(ugi0Var, 1, evf.f8465a, ivfVar);
        }
        if (cldVarA.u(ugi0Var)) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), map3);
        } else {
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            if (!Intrinsics.d(map3, lunVar)) {
                cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), map3);
            }
        }
        if (cldVarA.u(ugi0Var)) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), map2);
        } else {
            lun lunVar2 = lun.f20680a;
            lunVar2.getClass();
            if (!Intrinsics.d(map2, lunVar2)) {
                cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), map2);
            }
        }
        if (cldVarA.u(ugi0Var)) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), map);
        } else {
            lun lunVar3 = lun.f20680a;
            lunVar3.getClass();
            if (!Intrinsics.d(map, lunVar3)) {
                cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), map);
            }
        }
        cldVarA.c(ugi0Var);
    }
}
