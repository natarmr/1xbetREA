package a;

/* JADX INFO: loaded from: classes5.dex */
public final class t2t {
    public final <T> jiy serializer(final jiy jiyVar) {
        jiyVar.getClass();
        return new pjt(jiyVar) { // from class: a.s2t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ jiy f31519a;
            private final ugi0 descriptor;

            {
                jiyVar.getClass();
                zna0 zna0Var = new zna0("org.xplatform.onexuser.domain.entity.onexgame.GamesBaseResponse", this, 4);
                zna0Var.j("Error", true);
                byte b = 17;
                zna0Var.k(new iy(new String[]{"error"}, b));
                zna0Var.j("ErrorCode", true);
                zna0Var.j("Success", true);
                zna0Var.k(new iy(new String[]{"success"}, b));
                zna0Var.j("Value", true);
                this.descriptor = zna0Var;
                this.f31519a = jiyVar;
            }

            @Override // a.pjt
            public final jiy[] childSerializers() {
                return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(m5t.d), mrv.j0(sm8.f32432a), mrv.j0(this.f31519a)};
            }

            @Override // a.jiy
            public final Object deserialize(rkj rkjVar) {
                ugi0 ugi0Var = this.descriptor;
                bld bldVarA = rkjVar.a(ugi0Var);
                boolean z = true;
                int i = 0;
                String str = null;
                l5t l5tVar = null;
                Boolean bool = null;
                Object objE = null;
                while (z) {
                    int iF = bldVarA.f(ugi0Var);
                    if (iF == -1) {
                        z = false;
                    } else if (iF == 0) {
                        str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                        i |= 1;
                    } else if (iF == 1) {
                        l5tVar = (l5t) bldVarA.e(ugi0Var, 1, m5t.d, l5tVar);
                        i |= 2;
                    } else if (iF == 2) {
                        bool = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool);
                        i |= 4;
                    } else {
                        if (iF != 3) {
                            itt0.c(iF);
                            return null;
                        }
                        objE = bldVarA.e(ugi0Var, 3, this.f31519a, objE);
                        i |= 8;
                    }
                }
                bldVarA.c(ugi0Var);
                return new u2t(i, str, l5tVar, bool, objE);
            }

            @Override // a.jiy
            public final ugi0 getDescriptor() {
                return this.descriptor;
            }

            @Override // a.jiy
            public final void serialize(bwn bwnVar, Object obj) {
                u2t u2tVar = (u2t) obj;
                u2tVar.getClass();
                Object obj2 = u2tVar.d;
                Boolean bool = u2tVar.c;
                l5t l5tVar = u2tVar.b;
                String str = u2tVar.f34962a;
                ugi0 ugi0Var = this.descriptor;
                cld cldVarA = bwnVar.a(ugi0Var);
                if (cldVarA.u(ugi0Var) || str != null) {
                    cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
                }
                if (cldVarA.u(ugi0Var) || l5tVar != null) {
                    cldVarA.p(ugi0Var, 1, m5t.d, l5tVar);
                }
                if (cldVarA.u(ugi0Var) || bool != null) {
                    cldVarA.p(ugi0Var, 2, sm8.f32432a, bool);
                }
                if (cldVarA.u(ugi0Var) || obj2 != null) {
                    cldVarA.p(ugi0Var, 3, this.f31519a, obj2);
                }
                cldVarA.c(ugi0Var);
            }

            @Override // a.pjt
            public final jiy[] typeParametersSerializers() {
                return new jiy[]{this.f31519a};
            }
        };
    }
}
