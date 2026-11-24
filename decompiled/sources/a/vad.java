package a;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class vad extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37079a;
    public final /* synthetic */ xad b;

    public /* synthetic */ vad(xad xadVar, byte b) {
        this.f37079a = b;
        this.b = xadVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.f37079a;
        xad xadVar = this.b;
        switch (b) {
            case 0:
                xadVar.clear();
                break;
            default:
                xadVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.f37079a;
        xad xadVar = this.b;
        switch (b) {
            case 0:
                Map mapB = xadVar.b();
                if (mapB != null) {
                    return mapB.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iE = xadVar.e(entry.getKey());
                    if (iE != -1 && Objects.equals(xadVar.l()[iE], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return xadVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.f37079a;
        xad xadVar = this.b;
        switch (b) {
            case 0:
                Map mapB = xadVar.b();
                return mapB != null ? mapB.entrySet().iterator() : new uad(xadVar, (byte) 1);
            default:
                Map mapB2 = xadVar.b();
                return mapB2 != null ? mapB2.keySet().iterator() : new uad(xadVar, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.f37079a;
        xad xadVar = this.b;
        switch (b) {
            case 0:
                Map mapB = xadVar.b();
                if (mapB != null) {
                    return mapB.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (xadVar.g()) {
                    return false;
                }
                int iD = xadVar.d();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = xadVar.f40546a;
                Objects.requireNonNull(obj2);
                int iI0 = lgb.i0(key, value, iD, obj2, xadVar.j(), xadVar.k(), xadVar.l());
                if (iI0 == -1) {
                    return false;
                }
                xadVar.f(iI0, iD);
                xadVar.f--;
                xadVar.e += 32;
                return true;
            default:
                Map mapB2 = xadVar.b();
                if (mapB2 != null) {
                    return mapB2.keySet().remove(obj);
                }
                return xadVar.h(obj) != xad.j;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.f37079a;
        xad xadVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return xadVar.size();
    }
}
