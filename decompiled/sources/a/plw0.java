package a;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class plw0 implements jlw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27205a;
    public final ArrayList b;

    public plw0(String str, ArrayList arrayList) {
        this.f27205a = str;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // a.jlw0
    public final jlw0 c(String str, h0q0 h0q0Var, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plw0)) {
            return false;
        }
        plw0 plw0Var = (plw0) obj;
        String str = plw0Var.f27205a;
        String str2 = this.f27205a;
        if (str2 != null) {
            if (!str2.equals(str)) {
                return false;
            }
        } else if (str != null) {
            return false;
        }
        return this.b.equals(plw0Var.b);
    }

    public final int hashCode() {
        String str = this.f27205a;
        return this.b.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // a.jlw0
    public final String zzc() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // a.jlw0
    public final Double zzd() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // a.jlw0
    public final Boolean zze() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // a.jlw0
    public final Iterator zzf() {
        return null;
    }

    @Override // a.jlw0
    public final jlw0 h() {
        return this;
    }
}
