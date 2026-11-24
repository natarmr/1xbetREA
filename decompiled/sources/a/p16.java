package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p16 {
    public final <T, Z> jiy serializer(final jiy jiyVar, final jiy jiyVar2) {
        jiyVar.getClass();
        jiyVar2.getClass();
        return new pjt(jiyVar, jiyVar2) { // from class: a.o16

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ jiy f24463a;
            public final /* synthetic */ jiy b;
            private final ugi0 descriptor;

            {
                jiyVar.getClass();
                jiyVar2.getClass();
                zna0 zna0Var = new zna0("org.xplatform.onexcore.data.model.BaseResponse", this, 4);
                zna0Var.j("Error", true);
                byte b = 6;
                zna0Var.k(new iy(new String[]{"error"}, b));
                zna0Var.j("Success", true);
                zna0Var.k(new iy(new String[]{"success"}, b));
                zna0Var.j("ErrorCode", true);
                zna0Var.j("Value", true);
                this.descriptor = zna0Var;
                this.f24463a = jiyVar;
                this.b = jiyVar2;
            }

            @Override // a.pjt
            public final jiy[] childSerializers() {
                return new jiy[]{mrv.j0(ysm0.f43175a), sm8.f32432a, mrv.j0(this.b), mrv.j0(this.f24463a)};
            }

            @Override // a.jiy
            public final Object deserialize(rkj rkjVar) {
                ugi0 ugi0Var = this.descriptor;
                bld bldVarA = rkjVar.a(ugi0Var);
                boolean z = true;
                int i = 0;
                boolean zB = false;
                String str = null;
                kuw kuwVar = null;
                Object objE = null;
                while (z) {
                    int iF = bldVarA.f(ugi0Var);
                    if (iF == -1) {
                        z = false;
                    } else if (iF == 0) {
                        str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                        i |= 1;
                    } else if (iF == 1) {
                        zB = bldVarA.B(ugi0Var, 1);
                        i |= 2;
                    } else if (iF == 2) {
                        kuwVar = (kuw) bldVarA.e(ugi0Var, 2, this.b, kuwVar);
                        i |= 4;
                    } else {
                        if (iF != 3) {
                            itt0.c(iF);
                            return null;
                        }
                        objE = bldVarA.e(ugi0Var, 3, this.f24463a, objE);
                        i |= 8;
                    }
                }
                bldVarA.c(ugi0Var);
                return new q16(i, str, zB, kuwVar, objE);
            }

            @Override // a.jiy
            public final ugi0 getDescriptor() {
                return this.descriptor;
            }

            @Override // a.jiy
            public final void serialize(bwn bwnVar, Object obj) {
                q16 q16Var = (q16) obj;
                q16Var.getClass();
                Object obj2 = q16Var.d;
                kuw kuwVar = q16Var.c;
                boolean z = q16Var.b;
                String str = q16Var.f27936a;
                ugi0 ugi0Var = this.descriptor;
                cld cldVarA = bwnVar.a(ugi0Var);
                if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "")) {
                    cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
                }
                if (cldVarA.u(ugi0Var) || z) {
                    cldVarA.x(ugi0Var, 1, z);
                }
                if (cldVarA.u(ugi0Var) || kuwVar != null) {
                    cldVarA.p(ugi0Var, 2, this.b, kuwVar);
                }
                if (cldVarA.u(ugi0Var) || obj2 != null) {
                    cldVarA.p(ugi0Var, 3, this.f24463a, obj2);
                }
                cldVarA.c(ugi0Var);
            }

            @Override // a.pjt
            public final jiy[] typeParametersSerializers() {
                return new jiy[]{this.f24463a, this.b};
            }
        };
    }
}
