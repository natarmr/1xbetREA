package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class axb implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final axb f1616a;
    private static final ugi0 descriptor;

    static {
        axb axbVar = new axb();
        f1616a = axbVar;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.Chat", axbVar, 9);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("operatorInvokeAllowed", true);
        zna0Var.j("unreadMessageCount", true);
        zna0Var.j("lastReadInboxMessageId", true);
        zna0Var.j("lastReadOutboxMessageId", true);
        zna0Var.j("slowModeDelay", true);
        zna0Var.j("writeBlocked", true);
        zna0Var.j("participants", true);
        zna0Var.j("lastMessage", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = cxb.j;
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ1 = mrv.j0(sm8Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(s710.f31729a), mrv.j0(sm8Var), mrv.j0((jiy) a8zVarArr[7].getValue()), mrv.j0(j640.f15967a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = cxb.j;
        n640 n640Var = null;
        boolean z = true;
        List list = null;
        int i = 0;
        String str = null;
        Boolean bool = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Long l = null;
        Boolean bool2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num2);
                    i |= 8;
                    break;
                case 4:
                    num3 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num3);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l);
                    i |= 32;
                    break;
                case 6:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool2);
                    i |= 64;
                    break;
                case 7:
                    list = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    n640Var = (n640) bldVarA.e(ugi0Var, 8, j640.f15967a, n640Var);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new cxb(i, str, bool, num, num2, num3, l, bool2, list, n640Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cxb cxbVar = (cxb) obj;
        cxbVar.getClass();
        n640 n640Var = cxbVar.i;
        List list = cxbVar.h;
        Boolean bool = cxbVar.g;
        Long l = cxbVar.f;
        Integer num = cxbVar.e;
        Integer num2 = cxbVar.d;
        Integer num3 = cxbVar.c;
        Boolean bool2 = cxbVar.b;
        String str = cxbVar.f5115a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = cxb.j;
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || n640Var != null) {
            cldVarA.p(ugi0Var, 8, j640.f15967a, n640Var);
        }
        cldVarA.c(ugi0Var);
    }
}
