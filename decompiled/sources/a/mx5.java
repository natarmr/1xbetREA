package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mx5 {
    public final <T> jiy serializer(final jiy jiyVar) {
        jiyVar.getClass();
        return new pjt(jiyVar) { // from class: a.lx5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ jiy f20798a;
            private final ugi0 descriptor;

            {
                jiyVar.getClass();
                zna0 zna0Var = new zna0("org.xplatform.app_start.impl.data.model.response.BaseDictionaryResponse.DataDictionaryResponse", this, 3);
                zna0Var.j("lastUpdate", true);
                zna0Var.j("items", true);
                zna0Var.j("errors", true);
                this.descriptor = zna0Var;
                this.f20798a = jiyVar;
            }

            @Override // a.pjt
            public final jiy[] childSerializers() {
                return new jiy[]{mrv.j0(s710.f31729a), mrv.j0(new zw3(this.f20798a, (byte) 0)), mrv.j0(gdy.f11125a)};
            }

            @Override // a.jiy
            public final Object deserialize(rkj rkjVar) {
                ugi0 ugi0Var = this.descriptor;
                bld bldVarA = rkjVar.a(ugi0Var);
                boolean z = true;
                int i = 0;
                Long l = null;
                List list = null;
                edy edyVar = null;
                while (z) {
                    int iF = bldVarA.f(ugi0Var);
                    if (iF == -1) {
                        z = false;
                    } else if (iF == 0) {
                        l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                        i |= 1;
                    } else if (iF == 1) {
                        list = (List) bldVarA.e(ugi0Var, 1, new zw3(this.f20798a, (byte) 0), list);
                        i |= 2;
                    } else {
                        if (iF != 2) {
                            itt0.c(iF);
                            return null;
                        }
                        edyVar = (edy) bldVarA.e(ugi0Var, 2, gdy.f11125a, edyVar);
                        i |= 4;
                    }
                }
                bldVarA.c(ugi0Var);
                return new nx5(i, l, list, edyVar);
            }

            @Override // a.jiy
            public final ugi0 getDescriptor() {
                return this.descriptor;
            }

            @Override // a.jiy
            public final void serialize(bwn bwnVar, Object obj) {
                nx5 nx5Var = (nx5) obj;
                nx5Var.getClass();
                edy edyVar = nx5Var.c;
                List list = nx5Var.b;
                Long l = nx5Var.f24265a;
                ugi0 ugi0Var = this.descriptor;
                cld cldVarA = bwnVar.a(ugi0Var);
                if (cldVarA.u(ugi0Var) || l != null) {
                    cldVarA.p(ugi0Var, 0, s710.f31729a, l);
                }
                if (cldVarA.u(ugi0Var) || list != null) {
                    cldVarA.p(ugi0Var, 1, new zw3(this.f20798a, (byte) 0), list);
                }
                if (cldVarA.u(ugi0Var) || edyVar != null) {
                    cldVarA.p(ugi0Var, 2, gdy.f11125a, edyVar);
                }
                cldVarA.c(ugi0Var);
            }

            @Override // a.pjt
            public final jiy[] typeParametersSerializers() {
                return new jiy[]{this.f20798a};
            }
        };
    }
}
