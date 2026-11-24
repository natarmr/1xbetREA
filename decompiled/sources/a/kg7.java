package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kg7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kg7 f18226a;
    private static final ugi0 descriptor;

    static {
        kg7 kg7Var = new kg7();
        f18226a = kg7Var;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.core.data.models.response.BetNewHistoryResponse", kg7Var, 5);
        zna0Var.j("Info", true);
        zna0Var.k(new iy(new String[]{"BetInfos", "AutoBetInfos", "BetInfo", "AutoBetInfo"}, (byte) 8));
        zna0Var.j("BetsSummaryInfo", true);
        zna0Var.j("Error", true);
        zna0Var.k(new iy(new String[]{"error"}, (byte) 8));
        zna0Var.j("Success", true);
        zna0Var.k(new iy(new String[]{"success"}, (byte) 8));
        zna0Var.j("ErrorCode", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = sg7.f;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0(lg7.f19993a), mrv.j0(ysm0.f43175a), sm8.f32432a, mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = sg7.f;
        boolean z = true;
        int i = 0;
        boolean zB = false;
        List list = null;
        ng7 ng7Var = null;
        String str = null;
        kuw kuwVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                ng7Var = (ng7) bldVarA.e(ugi0Var, 1, lg7.f19993a, ng7Var);
                i |= 2;
            } else if (iF == 2) {
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            } else if (iF == 3) {
                zB = bldVarA.B(ugi0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                kuwVar = (kuw) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), kuwVar);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new sg7(i, list, ng7Var, str, zB, kuwVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        sg7 sg7Var = (sg7) obj;
        sg7Var.getClass();
        kuw kuwVar = sg7Var.e;
        boolean z = sg7Var.d;
        String str = sg7Var.c;
        ng7 ng7Var = sg7Var.b;
        List list = sg7Var.f32146a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = sg7.f;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || ng7Var != null) {
            cldVarA.p(ugi0Var, 1, lg7.f19993a, ng7Var);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "")) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || z) {
            cldVarA.x(ugi0Var, 3, z);
        }
        if (cldVarA.u(ugi0Var) || kuwVar != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), kuwVar);
        }
        cldVarA.c(ugi0Var);
    }
}
