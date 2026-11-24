package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes5.dex */
public final class cx5 {
    public final <T> jiy serializer(final jiy jiyVar) {
        jiyVar.getClass();
        return new pjt(jiyVar) { // from class: a.bx5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ jiy f3360a;
            private final ugi0 descriptor;

            {
                jiyVar.getClass();
                zna0 zna0Var = new zna0("org.xplatform.onexcore.data.model.BaseDataResponse", this, 2);
                zna0Var.j("error", true);
                byte b = 5;
                zna0Var.k(new iy(new String[]{"Error"}, b));
                zna0Var.j(RemoteMessageConst.DATA, true);
                zna0Var.k(new iy(new String[]{"Data"}, b));
                this.descriptor = zna0Var;
                this.f3360a = jiyVar;
            }

            @Override // a.pjt
            public final jiy[] childSerializers() {
                return new jiy[]{mrv.j0(shi0.f32214a), mrv.j0(this.f3360a)};
            }

            @Override // a.jiy
            public final Object deserialize(rkj rkjVar) {
                ugi0 ugi0Var = this.descriptor;
                bld bldVarA = rkjVar.a(ugi0Var);
                boolean z = true;
                int i = 0;
                uhi0 uhi0Var = null;
                Object objE = null;
                while (z) {
                    int iF = bldVarA.f(ugi0Var);
                    if (iF == -1) {
                        z = false;
                    } else if (iF == 0) {
                        uhi0Var = (uhi0) bldVarA.e(ugi0Var, 0, shi0.f32214a, uhi0Var);
                        i |= 1;
                    } else {
                        if (iF != 1) {
                            itt0.c(iF);
                            return null;
                        }
                        objE = bldVarA.e(ugi0Var, 1, this.f3360a, objE);
                        i |= 2;
                    }
                }
                bldVarA.c(ugi0Var);
                return new dx5(i, uhi0Var, objE);
            }

            @Override // a.jiy
            public final ugi0 getDescriptor() {
                return this.descriptor;
            }

            @Override // a.jiy
            public final void serialize(bwn bwnVar, Object obj) {
                dx5 dx5Var = (dx5) obj;
                dx5Var.getClass();
                Object obj2 = dx5Var.b;
                uhi0 uhi0Var = dx5Var.f6831a;
                ugi0 ugi0Var = this.descriptor;
                cld cldVarA = bwnVar.a(ugi0Var);
                if (cldVarA.u(ugi0Var) || uhi0Var != null) {
                    cldVarA.p(ugi0Var, 0, shi0.f32214a, uhi0Var);
                }
                if (cldVarA.u(ugi0Var) || obj2 != null) {
                    cldVarA.p(ugi0Var, 1, this.f3360a, obj2);
                }
                cldVarA.c(ugi0Var);
            }

            @Override // a.pjt
            public final jiy[] typeParametersSerializers() {
                return new jiy[]{this.f3360a};
            }
        };
    }
}
