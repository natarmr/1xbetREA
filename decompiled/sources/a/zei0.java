package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zei0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zei0 f44254a;
    private static final ugi0 descriptor;

    static {
        zei0 zei0Var = new zei0();
        f44254a = zei0Var;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.SendMessageRequest.TextMessageWithAttachmentRequest", zei0Var, 2);
        zna0Var.j(ParameterNames.TEXT, false);
        zna0Var.j("mediaId", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), bfi0.c[1].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = bfi0.c;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new bfi0(str, list, i);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bfi0 bfi0Var = (bfi0) obj;
        bfi0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = bfi0.c;
        cldVarA.p(ugi0Var, 0, ysm0.f43175a, bfi0Var.f2505a);
        cldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), bfi0Var.b);
        cldVarA.c(ugi0Var);
    }
}
