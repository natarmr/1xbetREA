package a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class inv extends v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jiy f15091a;
    public final jiy b;
    public final /* synthetic */ byte c;
    public final hnv d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public inv(jiy jiyVar, jiy jiyVar2, byte b) {
        this(jiyVar, jiyVar2, (char) 0);
        this.c = b;
        jiyVar.getClass();
        jiyVar2.getClass();
        switch (b) {
            case 1:
                this(jiyVar, jiyVar2, (char) 0);
                ugi0 descriptor = jiyVar.getDescriptor();
                ugi0 descriptor2 = jiyVar2.getDescriptor();
                descriptor.getClass();
                descriptor2.getClass();
                this.d = new hnv("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                break;
            default:
                ugi0 descriptor3 = jiyVar.getDescriptor();
                ugi0 descriptor4 = jiyVar2.getDescriptor();
                descriptor3.getClass();
                descriptor4.getClass();
                this.d = new hnv("kotlin.collections.HashMap", descriptor3, descriptor4);
                break;
        }
    }

    @Override // a.v1
    public final Object a() {
        switch (this.c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // a.v1
    public final int b(Object obj) {
        int size;
        switch (this.c) {
            case 0:
                HashMap map = (HashMap) obj;
                map.getClass();
                size = map.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // a.v1
    public final Iterator c(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    @Override // a.v1
    public final int d(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.size();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    @Override // a.v1
    public final void f(bld bldVar, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        Object objM = bldVar.m(getDescriptor(), i, this.f15091a, null);
        int iF = bldVar.f(getDescriptor());
        if (iF != i + 1) {
            c99.s(f140.j(i, "Value must follow key in a map, index for key: ", iF, ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objM);
        jiy jiyVar = this.b;
        map.put(objM, (!zContainsKey || (jiyVar.getDescriptor().l() instanceof zvb0)) ? bldVar.m(getDescriptor(), iF, jiyVar, null) : bldVar.m(getDescriptor(), iF, jiyVar, xp20.d(map, objM)));
    }

    @Override // a.v1
    public final Object g(Object obj) {
        switch (this.c) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        byte b = this.c;
        return this.d;
    }

    @Override // a.v1
    public final Object h(Object obj) {
        switch (this.c) {
            case 0:
                HashMap map = (HashMap) obj;
                map.getClass();
                return map;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                return linkedHashMap;
        }
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        d(obj);
        ugi0 descriptor = getDescriptor();
        descriptor.getClass();
        cld cldVarA = bwnVar.a(descriptor);
        Iterator itC = c(obj);
        int i = 0;
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            cldVarA.m(getDescriptor(), i, this.f15091a, key);
            i += 2;
            cldVarA.m(getDescriptor(), i2, this.b, value);
        }
        cldVarA.c(descriptor);
    }

    public inv(jiy jiyVar, jiy jiyVar2, char c) {
        this.f15091a = jiyVar;
        this.b = jiyVar2;
    }
}
