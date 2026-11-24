package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v1 implements jiy {
    public Object a() {
        return new ArrayList();
    }

    public int b(Object obj) {
        uvb0 uvb0Var = (uvb0) obj;
        uvb0Var.getClass();
        return uvb0Var.d();
    }

    public Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    public int d(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // a.jiy
    public Object deserialize(rkj rkjVar) {
        return e(rkjVar);
    }

    public final Object e(rkj rkjVar) {
        Object objA = a();
        int iB = b(objA);
        bld bldVarA = rkjVar.a(getDescriptor());
        while (true) {
            int iF = bldVarA.f(getDescriptor());
            if (iF == -1) {
                bldVarA.c(getDescriptor());
                return h(objA);
            }
            f(bldVarA, iF + iB, objA);
        }
    }

    public abstract void f(bld bldVar, int i, Object obj);

    public Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        lm8 lm8Var = new lm8();
        lm8Var.f20285a = zArr;
        lm8Var.b = zArr.length;
        lm8Var.b(10);
        return lm8Var;
    }

    public Object h(Object obj) {
        uvb0 uvb0Var = (uvb0) obj;
        uvb0Var.getClass();
        return uvb0Var.a();
    }
}
