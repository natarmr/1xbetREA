package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a57 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a57 f256a;
    private static final ugi0 descriptor;

    static {
        a57 a57Var = new a57();
        f256a = a57Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_history.core.data.model.BetHistoryResponse", a57Var, 5);
        zna0Var.j("BetsSummaryInfo", true);
        zna0Var.j("Info", true);
        byte b = 7;
        zna0Var.k(new iy(new String[]{"BetInfos", "AutoBetInfos", "BetInfo", "AutoBetInfo"}, b));
        zna0Var.j("Error", true);
        zna0Var.k(new iy(new String[]{"error"}, b));
        zna0Var.j("Success", true);
        zna0Var.k(new iy(new String[]{"success"}, b));
        zna0Var.j("ErrorCode", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = c57.f;
        return new jiy[]{mrv.j0(fv7.f10201a), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0(ysm0.f43175a), sm8.f32432a, mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = c57.f;
        boolean z = true;
        int i = 0;
        boolean zB = false;
        hv7 hv7Var = null;
        List list = null;
        String str = null;
        kuw kuwVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                hv7Var = (hv7) bldVarA.e(ugi0Var, 0, fv7.f10201a, hv7Var);
                i |= 1;
            } else if (iF == 1) {
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
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
        return new c57(i, hv7Var, list, str, zB, kuwVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        c57 c57Var = (c57) obj;
        c57Var.getClass();
        kuw kuwVar = c57Var.e;
        boolean z = c57Var.d;
        String str = c57Var.c;
        List list = c57Var.b;
        hv7 hv7Var = c57Var.f3757a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = c57.f;
        if (cldVarA.u(ugi0Var) || hv7Var != null) {
            cldVarA.p(ugi0Var, 0, fv7.f10201a, hv7Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
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
