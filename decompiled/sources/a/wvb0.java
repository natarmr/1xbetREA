package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wvb0 extends o3d {
    public final vvb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvb0(jiy jiyVar) {
        super(jiyVar);
        jiyVar.getClass();
        this.b = new vvb0(jiyVar.getDescriptor());
    }

    @Override // a.v1
    public final Object a() {
        return (uvb0) g(j());
    }

    @Override // a.v1
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // a.v1, a.jiy
    public final Object deserialize(rkj rkjVar) {
        return e(rkjVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return this.b;
    }

    public Object j() {
        return new boolean[0];
    }

    public void k(cld cldVar, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        cldVar.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            cldVar.x(this.b, i2, zArr[i2]);
        }
    }

    @Override // a.o3d, a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        int iD = d(obj);
        vvb0 vvb0Var = this.b;
        cld cldVarA = bwnVar.a(vvb0Var);
        k(cldVarA, obj, iD);
        cldVarA.c(vvb0Var);
    }
}
