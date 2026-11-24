package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class akw0 implements jlw0, qjw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1043a = new HashMap();

    @Override // a.qjw0
    public final jlw0 b(String str) {
        HashMap map = this.f1043a;
        return map.containsKey(str) ? (jlw0) map.get(str) : jlw0.V0;
    }

    @Override // a.jlw0
    public jlw0 c(String str, h0q0 h0q0Var, ArrayList arrayList) {
        return "toString".equals(str) ? new slw0(toString()) : qjw0.e(this, new slw0(str), h0q0Var, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akw0) {
            return this.f1043a.equals(((akw0) obj).f1043a);
        }
        return false;
    }

    @Override // a.qjw0
    public final void f(String str, jlw0 jlw0Var) {
        HashMap map = this.f1043a;
        if (jlw0Var == null) {
            map.remove(str);
        } else {
            map.put(str, jlw0Var);
        }
    }

    @Override // a.qjw0
    public final boolean g(String str) {
        return this.f1043a.containsKey(str);
    }

    @Override // a.jlw0
    public final jlw0 h() {
        akw0 akw0Var = new akw0();
        for (Map.Entry entry : this.f1043a.entrySet()) {
            boolean z = entry.getValue() instanceof qjw0;
            HashMap map = akw0Var.f1043a;
            if (z) {
                map.put((String) entry.getKey(), (jlw0) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((jlw0) entry.getValue()).h());
            }
        }
        return akw0Var;
    }

    public final int hashCode() {
        return this.f1043a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f1043a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(Separators.COMMA));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // a.jlw0
    public final String zzc() {
        return "[object Object]";
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
        return new fjw0(this.f1043a.keySet().iterator());
    }
}
