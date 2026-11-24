package a;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class wad implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38819a;
    public int b;
    public final /* synthetic */ xad c;

    public wad(xad xadVar, int i) {
        this.c = xadVar;
        Object obj = xad.j;
        this.f38819a = xadVar.k()[i];
        this.b = i;
    }

    public final void a() {
        int i = this.b;
        Object obj = this.f38819a;
        xad xadVar = this.c;
        if (i != -1 && i < xadVar.size()) {
            if (Objects.equals(obj, xadVar.k()[this.b])) {
                return;
            }
        }
        Object obj2 = xad.j;
        this.b = xadVar.e(obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f38819a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        xad xadVar = this.c;
        Map mapB = xadVar.b();
        if (mapB != null) {
            return mapB.get(this.f38819a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return xadVar.l()[i];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        xad xadVar = this.c;
        Map mapB = xadVar.b();
        Object obj2 = this.f38819a;
        if (mapB != null) {
            return mapB.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            xadVar.put(obj2, obj);
            return null;
        }
        Object obj3 = xadVar.l()[i];
        xadVar.l()[this.b] = obj;
        return obj3;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
