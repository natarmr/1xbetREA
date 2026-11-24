package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class giw0 implements jlw0, qjw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11369a;
    public final HashMap b = new HashMap();

    public giw0(String str) {
        this.f11369a = str;
    }

    public abstract jlw0 a(h0q0 h0q0Var, List list);

    @Override // a.qjw0
    public final jlw0 b(String str) {
        HashMap map = this.b;
        return map.containsKey(str) ? (jlw0) map.get(str) : jlw0.V0;
    }

    @Override // a.jlw0
    public final jlw0 c(String str, h0q0 h0q0Var, ArrayList arrayList) {
        return "toString".equals(str) ? new slw0(this.f11369a) : qjw0.e(this, new slw0(str), h0q0Var, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof giw0)) {
            return false;
        }
        giw0 giw0Var = (giw0) obj;
        String str = this.f11369a;
        if (str != null) {
            return str.equals(giw0Var.f11369a);
        }
        return false;
    }

    @Override // a.qjw0
    public final void f(String str, jlw0 jlw0Var) {
        HashMap map = this.b;
        if (jlw0Var == null) {
            map.remove(str);
        } else {
            map.put(str, jlw0Var);
        }
    }

    @Override // a.qjw0
    public final boolean g(String str) {
        return this.b.containsKey(str);
    }

    public final int hashCode() {
        String str = this.f11369a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // a.jlw0
    public final String zzc() {
        return this.f11369a;
    }

    @Override // a.jlw0
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // a.jlw0
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // a.jlw0
    public final Iterator zzf() {
        return new fjw0(this.b.keySet().iterator());
    }

    @Override // a.jlw0
    public jlw0 h() {
        return this;
    }
}
