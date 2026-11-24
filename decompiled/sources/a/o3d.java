package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o3d extends v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jiy f24578a;

    public o3d(jiy jiyVar) {
        this.f24578a = jiyVar;
    }

    @Override // a.v1
    public void f(bld bldVar, int i, Object obj) {
        i(i, obj, bldVar.m(getDescriptor(), i, this.f24578a, null));
    }

    public void i(int i, Object obj, Object obj2) {
        ((uvb0) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // a.jiy
    public void serialize(bwn bwnVar, Object obj) {
        int iD = d(obj);
        ugi0 descriptor = getDescriptor();
        descriptor.getClass();
        cld cldVarA = bwnVar.a(descriptor);
        Iterator itC = c(obj);
        for (int i = 0; i < iD; i++) {
            cldVarA.m(getDescriptor(), i, this.f24578a, itC.next());
        }
        cldVarA.c(descriptor);
    }
}
