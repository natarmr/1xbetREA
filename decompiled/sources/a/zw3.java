package a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zw3 extends o3d {
    public final /* synthetic */ byte b;
    public final ud00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw3(jiy jiyVar, byte b) {
        super(jiyVar);
        this.b = b;
        jiyVar.getClass();
        switch (b) {
            case 1:
                super(jiyVar);
                ugi0 descriptor = jiyVar.getDescriptor();
                descriptor.getClass();
                this.c = new uw3(descriptor, (byte) 2);
                break;
            case 2:
                super(jiyVar);
                ugi0 descriptor2 = jiyVar.getDescriptor();
                descriptor2.getClass();
                this.c = new uw3(descriptor2, (byte) 3);
                break;
            default:
                ugi0 descriptor3 = jiyVar.getDescriptor();
                descriptor3.getClass();
                this.c = new uw3(descriptor3, (byte) 1);
                break;
        }
    }

    @Override // a.v1
    public final Object a() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // a.v1
    public final int b(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // a.v1
    public final Object g(Object obj) {
        switch (this.b) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        byte b = this.b;
        ud00 ud00Var = this.c;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (uw3) ud00Var;
    }

    @Override // a.v1
    public final Object h(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }

    @Override // a.o3d
    public final void i(int i, Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                break;
        }
    }
}
