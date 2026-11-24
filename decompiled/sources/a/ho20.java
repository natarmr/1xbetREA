package a;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ho20 implements Map.Entry, nhy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo20 f13373a;
    public final int b;
    public final int c;

    public ho20(jo20 jo20Var, int i) {
        jo20Var.getClass();
        this.f13373a = jo20Var;
        this.b = i;
        this.c = jo20Var.h;
    }

    public final void a() {
        if (this.f13373a.h != this.c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Intrinsics.d(entry.getKey(), getKey()) && Intrinsics.d(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f13373a.f16838a[this.b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f13373a.b;
        objArr.getClass();
        return objArr[this.b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        jo20 jo20Var = this.f13373a;
        jo20Var.d();
        Object[] objArr = jo20Var.b;
        if (objArr == null) {
            int length = jo20Var.f16838a.length;
            if (length < 0) {
                jf4.o("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            jo20Var.b = objArr;
        }
        int i = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
