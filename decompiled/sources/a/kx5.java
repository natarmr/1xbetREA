package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes3.dex */
public final class kx5 {
    public final <T> jiy serializer(final jiy jiyVar) {
        jiyVar.getClass();
        return new pjt(jiyVar) { // from class: a.jx5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ jiy f17286a;
            private final ugi0 descriptor;

            {
                jiyVar.getClass();
                zna0 zna0Var = new zna0("org.xplatform.app_start.impl.data.model.response.BaseDictionaryResponse", this, 1);
                zna0Var.j(RemoteMessageConst.DATA, true);
                this.descriptor = zna0Var;
                this.f17286a = jiyVar;
            }

            @Override // a.pjt
            public final jiy[] childSerializers() {
                return new jiy[]{mrv.j0(nx5.Companion.serializer(this.f17286a))};
            }

            @Override // a.jiy
            public final Object deserialize(rkj rkjVar) {
                ugi0 ugi0Var = this.descriptor;
                bld bldVarA = rkjVar.a(ugi0Var);
                boolean z = true;
                int i = 0;
                nx5 nx5Var = null;
                while (z) {
                    int iF = bldVarA.f(ugi0Var);
                    if (iF == -1) {
                        z = false;
                    } else {
                        if (iF != 0) {
                            itt0.c(iF);
                            return null;
                        }
                        nx5Var = (nx5) bldVarA.e(ugi0Var, 0, nx5.Companion.serializer(this.f17286a), nx5Var);
                        i = 1;
                    }
                }
                bldVarA.c(ugi0Var);
                return new ox5(i, nx5Var);
            }

            @Override // a.jiy
            public final ugi0 getDescriptor() {
                return this.descriptor;
            }

            @Override // a.jiy
            public final void serialize(bwn bwnVar, Object obj) {
                ox5 ox5Var = (ox5) obj;
                ox5Var.getClass();
                nx5 nx5Var = ox5Var.f25994a;
                ugi0 ugi0Var = this.descriptor;
                cld cldVarA = bwnVar.a(ugi0Var);
                if (cldVarA.u(ugi0Var) || nx5Var != null) {
                    cldVarA.p(ugi0Var, 0, nx5.Companion.serializer(this.f17286a), nx5Var);
                }
                cldVarA.c(ugi0Var);
            }

            @Override // a.pjt
            public final jiy[] typeParametersSerializers() {
                return new jiy[]{this.f17286a};
            }
        };
    }
}
