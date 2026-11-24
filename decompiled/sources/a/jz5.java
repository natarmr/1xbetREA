package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes3.dex */
public final class jz5 {
    public final <T, Z> jiy serializer(final jiy jiyVar, final jiy jiyVar2) {
        jiyVar.getClass();
        jiyVar2.getClass();
        return new pjt(jiyVar, jiyVar2) { // from class: a.iz5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ jiy f15621a;
            public final /* synthetic */ jiy b;
            private final ugi0 descriptor;

            {
                jiyVar.getClass();
                jiyVar2.getClass();
                zna0 zna0Var = new zna0("org.xplatform.core.data.BaseJsonResponse", this, 2);
                zna0Var.j(RemoteMessageConst.DATA, true);
                zna0Var.j("error", true);
                this.descriptor = zna0Var;
                this.f15621a = jiyVar;
                this.b = jiyVar2;
            }

            @Override // a.pjt
            public final jiy[] childSerializers() {
                return new jiy[]{mrv.j0(this.f15621a), mrv.j0(mz5.Companion.serializer(this.b))};
            }

            @Override // a.jiy
            public final Object deserialize(rkj rkjVar) {
                ugi0 ugi0Var = this.descriptor;
                bld bldVarA = rkjVar.a(ugi0Var);
                boolean z = true;
                int i = 0;
                Object objE = null;
                mz5 mz5Var = null;
                while (z) {
                    int iF = bldVarA.f(ugi0Var);
                    if (iF == -1) {
                        z = false;
                    } else if (iF == 0) {
                        objE = bldVarA.e(ugi0Var, 0, this.f15621a, objE);
                        i |= 1;
                    } else {
                        if (iF != 1) {
                            itt0.c(iF);
                            return null;
                        }
                        mz5Var = (mz5) bldVarA.e(ugi0Var, 1, mz5.Companion.serializer(this.b), mz5Var);
                        i |= 2;
                    }
                }
                bldVarA.c(ugi0Var);
                return new nz5(i, objE, mz5Var);
            }

            @Override // a.jiy
            public final ugi0 getDescriptor() {
                return this.descriptor;
            }

            @Override // a.jiy
            public final void serialize(bwn bwnVar, Object obj) {
                nz5 nz5Var = (nz5) obj;
                nz5Var.getClass();
                mz5 mz5Var = nz5Var.b;
                Object obj2 = nz5Var.f24357a;
                ugi0 ugi0Var = this.descriptor;
                cld cldVarA = bwnVar.a(ugi0Var);
                if (cldVarA.u(ugi0Var) || obj2 != null) {
                    cldVarA.p(ugi0Var, 0, this.f15621a, obj2);
                }
                if (cldVarA.u(ugi0Var) || mz5Var != null) {
                    cldVarA.p(ugi0Var, 1, mz5.Companion.serializer(this.b), mz5Var);
                }
                cldVarA.c(ugi0Var);
            }

            @Override // a.pjt
            public final jiy[] typeParametersSerializers() {
                return new jiy[]{this.f15621a, this.b};
            }
        };
    }
}
