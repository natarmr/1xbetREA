package a;

/* JADX INFO: loaded from: classes5.dex */
public final class gzf0 {
    public final <T> jiy serializer(final jiy jiyVar) {
        jiyVar.getClass();
        return new pjt(jiyVar) { // from class: a.ezf0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ jiy f8669a;
            private final ugi0 descriptor;

            {
                jiyVar.getClass();
                zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.restore.RestorePasswordRequest", this, 3);
                zna0Var.j("Data", false);
                zna0Var.j("CaptchaId", false);
                zna0Var.j("ImageText", false);
                this.descriptor = zna0Var;
                this.f8669a = jiyVar;
            }

            @Override // a.pjt
            public final jiy[] childSerializers() {
                ysm0 ysm0Var = ysm0.f43175a;
                return new jiy[]{this.f8669a, ysm0Var, ysm0Var};
            }

            @Override // a.jiy
            public final Object deserialize(rkj rkjVar) {
                ugi0 ugi0Var = this.descriptor;
                bld bldVarA = rkjVar.a(ugi0Var);
                boolean z = true;
                int i = 0;
                Object objM = null;
                String strX = null;
                String strX2 = null;
                while (z) {
                    int iF = bldVarA.f(ugi0Var);
                    if (iF == -1) {
                        z = false;
                    } else if (iF == 0) {
                        objM = bldVarA.m(ugi0Var, 0, this.f8669a, objM);
                        i |= 1;
                    } else if (iF == 1) {
                        strX = bldVarA.x(ugi0Var, 1);
                        i |= 2;
                    } else {
                        if (iF != 2) {
                            itt0.c(iF);
                            return null;
                        }
                        strX2 = bldVarA.x(ugi0Var, 2);
                        i |= 4;
                    }
                }
                bldVarA.c(ugi0Var);
                return new lzf0(objM, strX, i, strX2);
            }

            @Override // a.jiy
            public final ugi0 getDescriptor() {
                return this.descriptor;
            }

            @Override // a.jiy
            public final void serialize(bwn bwnVar, Object obj) {
                lzf0 lzf0Var = (lzf0) obj;
                lzf0Var.getClass();
                ugi0 ugi0Var = this.descriptor;
                cld cldVarA = bwnVar.a(ugi0Var);
                cldVarA.m(ugi0Var, 0, this.f8669a, lzf0Var.f20902a);
                cldVarA.z(ugi0Var, 1, lzf0Var.b);
                cldVarA.z(ugi0Var, 2, lzf0Var.c);
                cldVarA.c(ugi0Var);
            }

            @Override // a.pjt
            public final jiy[] typeParametersSerializers() {
                return new jiy[]{this.f8669a};
            }
        };
    }
}
