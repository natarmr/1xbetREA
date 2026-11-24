package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ink0 {
    public final <T> jiy serializer(final jiy jiyVar) {
        jiyVar.getClass();
        return new pjt(jiyVar) { // from class: a.hnk0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ jiy f13357a;
            private final ugi0 descriptor;

            {
                jiyVar.getClass();
                zna0 zna0Var = new zna0("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
                zna0Var.j("keys", false);
                zna0Var.j("values", false);
                this.descriptor = zna0Var;
                this.f13357a = jiyVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // a.pjt
            public final jiy[] childSerializers() {
                return new jiy[]{jnk0.c[0].getValue(), new zw3(this.f13357a, (byte) 0)};
            }

            @Override // a.jiy
            public final Object deserialize(rkj rkjVar) {
                ugi0 ugi0Var = this.descriptor;
                bld bldVarA = rkjVar.a(ugi0Var);
                a8z[] a8zVarArr = jnk0.c;
                boolean z = true;
                int i = 0;
                List list = null;
                List list2 = null;
                while (z) {
                    int iF = bldVarA.f(ugi0Var);
                    if (iF == -1) {
                        z = false;
                    } else if (iF == 0) {
                        list = (List) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                        i |= 1;
                    } else {
                        if (iF != 1) {
                            itt0.c(iF);
                            return null;
                        }
                        list2 = (List) bldVarA.m(ugi0Var, 1, new zw3(this.f13357a, (byte) 0), list2);
                        i |= 2;
                    }
                }
                bldVarA.c(ugi0Var);
                return new jnk0(i, list, list2);
            }

            @Override // a.jiy
            public final ugi0 getDescriptor() {
                return this.descriptor;
            }

            @Override // a.jiy
            public final void serialize(bwn bwnVar, Object obj) {
                jnk0 jnk0Var = (jnk0) obj;
                jnk0Var.getClass();
                ugi0 ugi0Var = this.descriptor;
                cld cldVarA = bwnVar.a(ugi0Var);
                cldVarA.m(ugi0Var, 0, (jiy) jnk0.c[0].getValue(), jnk0Var.f16818a);
                cldVarA.m(ugi0Var, 1, new zw3(this.f13357a, (byte) 0), jnk0Var.b);
                cldVarA.c(ugi0Var);
            }

            @Override // a.pjt
            public final jiy[] typeParametersSerializers() {
                return new jiy[]{this.f13357a};
            }
        };
    }
}
