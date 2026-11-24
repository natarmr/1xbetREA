package a;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class wme0 extends o3d {
    public final sgy b;
    public final uw3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wme0(sgy sgyVar, jiy jiyVar) {
        super(jiyVar);
        sgyVar.getClass();
        jiyVar.getClass();
        this.b = sgyVar;
        ugi0 descriptor = jiyVar.getDescriptor();
        descriptor.getClass();
        this.c = new uw3(descriptor, (byte) 0);
    }

    @Override // a.v1
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // a.v1
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new y2(objArr);
    }

    @Override // a.v1
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // a.v1
    public final Object g(Object obj) {
        throw null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return this.c;
    }

    @Override // a.v1
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        sgy sgyVar = this.b;
        sgyVar.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) azw.G(sgyVar), arrayList.size());
        objNewInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        array.getClass();
        return array;
    }

    @Override // a.o3d
    public final void i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
