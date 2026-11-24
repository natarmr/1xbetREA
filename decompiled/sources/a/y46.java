package a;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes3.dex */
public final class y46 {
    public final <R> jiy serializer(final jiy jiyVar) {
        jiyVar.getClass();
        return new pjt(jiyVar) { // from class: a.x46

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ jiy f40249a;
            private final ugi0 descriptor;

            {
                jiyVar.getClass();
                zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.BaseWebSocketResponse", this, 2);
                zna0Var.j(RemoteMessageConst.DATA, true);
                zna0Var.j(CommonConstant.KEY_STATUS, true);
                this.descriptor = zna0Var;
                this.f40249a = jiyVar;
            }

            @Override // a.pjt
            public final jiy[] childSerializers() {
                return new jiy[]{mrv.j0(this.f40249a), mrv.j0(okx.f25427a)};
            }

            @Override // a.jiy
            public final Object deserialize(rkj rkjVar) {
                ugi0 ugi0Var = this.descriptor;
                bld bldVarA = rkjVar.a(ugi0Var);
                boolean z = true;
                int i = 0;
                Object objE = null;
                Integer num = null;
                while (z) {
                    int iF = bldVarA.f(ugi0Var);
                    if (iF == -1) {
                        z = false;
                    } else if (iF == 0) {
                        objE = bldVarA.e(ugi0Var, 0, this.f40249a, objE);
                        i |= 1;
                    } else {
                        if (iF != 1) {
                            itt0.c(iF);
                            return null;
                        }
                        num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                        i |= 2;
                    }
                }
                bldVarA.c(ugi0Var);
                return new z46(i, objE, num);
            }

            @Override // a.jiy
            public final ugi0 getDescriptor() {
                return this.descriptor;
            }

            @Override // a.jiy
            public final void serialize(bwn bwnVar, Object obj) {
                z46 z46Var = (z46) obj;
                z46Var.getClass();
                Integer num = z46Var.b;
                Object obj2 = z46Var.f43753a;
                ugi0 ugi0Var = this.descriptor;
                cld cldVarA = bwnVar.a(ugi0Var);
                if (cldVarA.u(ugi0Var) || obj2 != null) {
                    cldVarA.p(ugi0Var, 0, this.f40249a, obj2);
                }
                if (cldVarA.u(ugi0Var) || num != null) {
                    cldVarA.p(ugi0Var, 1, okx.f25427a, num);
                }
                cldVarA.c(ugi0Var);
            }

            @Override // a.pjt
            public final jiy[] typeParametersSerializers() {
                return new jiy[]{this.f40249a};
            }
        };
    }
}
