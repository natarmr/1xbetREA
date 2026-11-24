package a;

import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public class dj10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f6163a;
    public final ojg b;
    public final htz c;
    public int d;
    public int e;
    public int f;

    /* JADX WARN: Multi-variable type inference failed */
    public dj10(int i) {
        this.f6163a = i;
        if (i <= 0) {
            jf4.o("maxSize <= 0");
            throw null;
        }
        this.b = new ojg((byte) 2);
        this.c = new htz();
    }

    public Object a(Object obj) {
        obj.getClass();
        return null;
    }

    public void b(Object obj, Object obj2, Object obj3) {
        obj.getClass();
    }

    public final Object c(Object obj) {
        Object objPut;
        obj.getClass();
        synchronized (this.c) {
            Object obj2 = this.b.f25357a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            Object objA = a(obj);
            if (objA == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    objPut = this.b.f25357a.put(obj, objA);
                    if (objPut != null) {
                        this.b.f25357a.put(obj, objPut);
                    } else {
                        this.d++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objPut != null) {
                b(obj, objA, objPut);
                return objPut;
            }
            f(this.f6163a);
            return objA;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        obj2.getClass();
        synchronized (this.c) {
            this.d++;
            objPut = this.b.f25357a.put(obj, obj2);
            if (objPut != null) {
                this.d--;
            }
        }
        if (objPut != null) {
            b(obj, objPut, obj2);
        }
        f(this.f6163a);
        return objPut;
    }

    public final Object e(Object obj) {
        Object objRemove;
        obj.getClass();
        synchronized (this.c) {
            objRemove = this.b.f25357a.remove(obj);
            if (objRemove != null) {
                this.d--;
            }
        }
        if (objRemove != null) {
            b(obj, objRemove, null);
        }
        return objRemove;
    }

    public final void f(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (this.b.f25357a.isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d > i && !this.b.f25357a.isEmpty()) {
                        Set setEntrySet = this.b.f25357a.entrySet();
                        setEntrySet.getClass();
                        Map.Entry entry = (Map.Entry) CollectionsKt.V(setEntrySet);
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        ojg ojgVar = this.b;
                        key.getClass();
                        ojgVar.f25357a.remove(key);
                        int i2 = this.d;
                        value.getClass();
                        this.d = i2 - 1;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f;
                int i3 = i + i2;
                int i4 = i3 != 0 ? (i * 100) / i3 : 0;
                str = "LruCache[maxSize=" + ((int) this.f6163a) + ",hits=" + i + ",misses=" + i2 + ",hitRate=" + i4 + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
