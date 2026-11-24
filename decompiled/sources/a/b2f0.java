package a;

/* JADX INFO: loaded from: classes5.dex */
public final class b2f0 {
    public final <T> jiy serializer(final jiy jiyVar) {
        jiyVar.getClass();
        return new pjt(jiyVar) { // from class: a.z1f0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ jiy f43616a;
            private final ugi0 descriptor;

            {
                jiyVar.getClass();
                zna0 zna0Var = new zna0("org.xplatform.registration.core.data.models.RegistrationRequest", this, 3);
                zna0Var.j("Data", false);
                zna0Var.j("CaptchaId", false);
                zna0Var.j("ImageText", false);
                this.descriptor = zna0Var;
                this.f43616a = jiyVar;
            }

            @Override // a.pjt
            public final jiy[] childSerializers() {
                ysm0 ysm0Var = ysm0.f43175a;
                return new jiy[]{this.f43616a, mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
            }

            @Override // a.jiy
            public final Object deserialize(rkj rkjVar) {
                ugi0 ugi0Var = this.descriptor;
                bld bldVarA = rkjVar.a(ugi0Var);
                boolean z = true;
                int i = 0;
                Object objM = null;
                String str = null;
                String str2 = null;
                while (z) {
                    int iF = bldVarA.f(ugi0Var);
                    if (iF == -1) {
                        z = false;
                    } else if (iF == 0) {
                        objM = bldVarA.m(ugi0Var, 0, this.f43616a, objM);
                        i |= 1;
                    } else if (iF == 1) {
                        str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                        i |= 2;
                    } else {
                        if (iF != 2) {
                            itt0.c(iF);
                            return null;
                        }
                        str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                        i |= 4;
                    }
                }
                bldVarA.c(ugi0Var);
                return new d2f0(objM, str, i, str2);
            }

            @Override // a.jiy
            public final ugi0 getDescriptor() {
                return this.descriptor;
            }

            @Override // a.jiy
            public final void serialize(bwn bwnVar, Object obj) {
                d2f0 d2f0Var = (d2f0) obj;
                d2f0Var.getClass();
                ugi0 ugi0Var = this.descriptor;
                cld cldVarA = bwnVar.a(ugi0Var);
                cldVarA.m(ugi0Var, 0, this.f43616a, d2f0Var.f5354a);
                ysm0 ysm0Var = ysm0.f43175a;
                cldVarA.p(ugi0Var, 1, ysm0Var, d2f0Var.b);
                cldVarA.p(ugi0Var, 2, ysm0Var, d2f0Var.c);
                cldVarA.c(ugi0Var);
            }

            @Override // a.pjt
            public final jiy[] typeParametersSerializers() {
                return new jiy[]{this.f43616a};
            }
        };
    }
}
