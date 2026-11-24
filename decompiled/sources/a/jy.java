package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jy implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jy f17335a;
    private static final ugi0 descriptor;

    static {
        jy jyVar = new jy();
        f17335a = jyVar;
        zna0 zna0Var = new zna0("org.xplatform.bet_history.additional_info.data.AdditionalInfoResponse", jyVar, 3);
        zna0Var.j("BetEventInfos", true);
        byte b = 0;
        zna0Var.k(new iy(new String[]{"BetEventAlternativeInfo"}, b));
        zna0Var.j("Error", true);
        zna0Var.k(new iy(new String[]{"error"}, b));
        zna0Var.j("ErrorCode", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = ly.d;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0(ysm0.f43175a), mrv.j0((jiy) a8zVarArr[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ly.d;
        boolean z = true;
        int i = 0;
        List list = null;
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
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                kuwVar = (kuw) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), kuwVar);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new ly(i, list, str, kuwVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ly lyVar = (ly) obj;
        lyVar.getClass();
        kuw kuwVar = lyVar.c;
        String str = lyVar.b;
        List list = lyVar.f20840a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ly.d;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "")) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || kuwVar != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), kuwVar);
        }
        cldVarA.c(ugi0Var);
    }
}
