package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes5.dex */
public final class uxw {
    public final <T> jiy serializer(final jiy jiyVar) {
        jiyVar.getClass();
        return new pjt(jiyVar) { // from class: a.sxw

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ jiy f32998a;
            private final ugi0 descriptor;

            {
                jiyVar.getClass();
                zna0 zna0Var = new zna0("org.xplatform.promotions.web_view.webview_messages.IframeMessageWrapper", this, 2);
                zna0Var.j(Payload.TYPE, true);
                zna0Var.j(RemoteMessageConst.DATA, true);
                this.descriptor = zna0Var;
                this.f32998a = jiyVar;
            }

            @Override // a.pjt
            public final jiy[] childSerializers() {
                return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(this.f32998a)};
            }

            @Override // a.jiy
            public final Object deserialize(rkj rkjVar) {
                ugi0 ugi0Var = this.descriptor;
                bld bldVarA = rkjVar.a(ugi0Var);
                boolean z = true;
                int i = 0;
                String str = null;
                Object objE = null;
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
                        objE = bldVarA.e(ugi0Var, 1, this.f32998a, objE);
                        i |= 2;
                    }
                }
                bldVarA.c(ugi0Var);
                return new wxw(i, str, objE);
            }

            @Override // a.jiy
            public final ugi0 getDescriptor() {
                return this.descriptor;
            }

            @Override // a.jiy
            public final void serialize(bwn bwnVar, Object obj) {
                wxw wxwVar = (wxw) obj;
                wxwVar.getClass();
                Object obj2 = wxwVar.b;
                String str = wxwVar.f39949a;
                ugi0 ugi0Var = this.descriptor;
                cld cldVarA = bwnVar.a(ugi0Var);
                if (cldVarA.u(ugi0Var) || str != null) {
                    cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
                }
                if (cldVarA.u(ugi0Var) || obj2 != null) {
                    cldVarA.p(ugi0Var, 1, this.f32998a, obj2);
                }
                cldVarA.c(ugi0Var);
            }

            @Override // a.pjt
            public final jiy[] typeParametersSerializers() {
                return new jiy[]{this.f32998a};
            }
        };
    }
}
