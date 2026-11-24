package a;

import com.huawei.hms.framework.common.BundleUtil;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class qfy extends g1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rfk f28658a;
    public final p3d0 b;
    public final xfy c;
    public final h950 d;
    public final roi0 e;
    public final String f;

    /* JADX WARN: Code duplicated, block: B:30:0x00df  */
    public qfy(rfk rfkVar, p3d0 p3d0Var, xfy xfyVar, h950 h950Var, roi0 roi0Var) {
        String string;
        String strO;
        String string2;
        p3d0Var.getClass();
        h950Var.getClass();
        this.f28658a = rfkVar;
        this.b = p3d0Var;
        this.c = xfyVar;
        this.d = h950Var;
        this.e = roi0Var;
        if (xfyVar.j()) {
            strO = h950Var.getString(xfyVar.e.c) + h950Var.getString(xfyVar.e.d);
        } else {
            sso ssoVar = egy.f7784a;
            cfy cfyVarB = egy.b(p3d0Var, h950Var, roi0Var, true);
            if (cfyVarB == null) {
                ohq.u(rfkVar, "No field signature for property: ");
                throw null;
            }
            String str = cfyVarB.b;
            String str2 = cfyVarB.c;
            StringBuilder sb = new StringBuilder(aey.a(str));
            vjj vjjVarJ = rfkVar.j();
            vjjVarJ.getClass();
            if (Intrinsics.d(rfkVar.getVisibility(), uek.d) && (vjjVarJ instanceof ffk)) {
                s2d0 s2d0Var = ((ffk) vjjVarJ).e;
                ijt ijtVar = dgy.g;
                ijtVar.getClass();
                Integer num = (Integer) h8x.L(s2d0Var, ijtVar);
                string = "$" + j950.f16120a.replace((num == null || (string2 = h950Var.getString(num.intValue())) == null) ? "main" : string2, BundleUtil.UNDERLINE_TAG);
            } else if (Intrinsics.d(rfkVar.getVisibility(), uek.f35533a) && (vjjVarJ instanceof mg80)) {
                hfk hfkVar = rfkVar.g1;
                if (hfkVar instanceof kfy) {
                    kfy kfyVar = (kfy) hfkVar;
                    if (kfyVar.b != null) {
                        StringBuilder sb2 = new StringBuilder("$");
                        String str3 = kfyVar.f18214a.f30360a;
                        if (str3 == null) {
                            rey.a(10);
                            throw null;
                        }
                        sb2.append(g950.e(StringsKt.o0('/', str3, str3)).b());
                        string = sb2.toString();
                    } else {
                        string = "";
                    }
                } else {
                    string = "";
                }
            } else {
                string = "";
            }
            strO = rw2.o(sb, string, "()", str2);
        }
        this.f = strO;
    }

    @Override // a.g1x
    public final String o() {
        return this.f;
    }
}
