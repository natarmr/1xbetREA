package a;

/* JADX INFO: loaded from: classes3.dex */
public final class q4v0 {
    public final <T> jiy serializer(final jiy jiyVar) {
        jiyVar.getClass();
        return new pjt(jiyVar) { // from class: a.p4v0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ jiy f26376a;
            private final ugi0 descriptor;

            {
                jiyVar.getClass();
                zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.WebSocketServerMessageResponse", this, 4);
                zna0Var.j("result", true);
                zna0Var.j("error", true);
                zna0Var.j("invocationId", true);
                zna0Var.j("$type", true);
                this.descriptor = zna0Var;
                this.f26376a = jiyVar;
            }

            @Override // a.pjt
            public final jiy[] childSerializers() {
                jiy jiyVarJ0 = mrv.j0(this.f26376a);
                jiy jiyVarJ1 = mrv.j0(ysm0.f43175a);
                okx okxVar = okx.f25427a;
                return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(okxVar), okxVar};
            }

            @Override // a.jiy
            public final Object deserialize(rkj rkjVar) {
                ugi0 ugi0Var = this.descriptor;
                bld bldVarA = rkjVar.a(ugi0Var);
                boolean z = true;
                int i = 0;
                int iJ = 0;
                Object objE = null;
                String str = null;
                Integer num = null;
                while (z) {
                    int iF = bldVarA.f(ugi0Var);
                    if (iF == -1) {
                        z = false;
                    } else if (iF == 0) {
                        objE = bldVarA.e(ugi0Var, 0, this.f26376a, objE);
                        i |= 1;
                    } else if (iF == 1) {
                        str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                        i |= 2;
                    } else if (iF == 2) {
                        num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                        i |= 4;
                    } else {
                        if (iF != 3) {
                            itt0.c(iF);
                            return null;
                        }
                        iJ = bldVarA.j(ugi0Var, 3);
                        i |= 8;
                    }
                }
                bldVarA.c(ugi0Var);
                return new r4v0(i, objE, str, num, iJ);
            }

            @Override // a.jiy
            public final ugi0 getDescriptor() {
                return this.descriptor;
            }

            @Override // a.jiy
            public final void serialize(bwn bwnVar, Object obj) {
                r4v0 r4v0Var = (r4v0) obj;
                r4v0Var.getClass();
                Integer num = r4v0Var.c;
                String str = r4v0Var.b;
                Object obj2 = r4v0Var.f29857a;
                ugi0 ugi0Var = this.descriptor;
                cld cldVarA = bwnVar.a(ugi0Var);
                if (cldVarA.u(ugi0Var) || obj2 != null) {
                    cldVarA.p(ugi0Var, 0, this.f26376a, obj2);
                }
                if (cldVarA.u(ugi0Var) || str != null) {
                    cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
                }
                if (cldVarA.u(ugi0Var) || num != null) {
                    cldVarA.p(ugi0Var, 2, okx.f25427a, num);
                }
                cldVarA.i(3, r4v0Var.d, ugi0Var);
                cldVarA.c(ugi0Var);
            }

            @Override // a.pjt
            public final jiy[] typeParametersSerializers() {
                return new jiy[]{this.f26376a};
            }
        };
    }
}
