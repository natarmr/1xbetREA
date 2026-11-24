package a;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class kgw0 implements jlw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jlw0 f18260a;
    public final String b;

    public kgw0(String str) {
        this.f18260a = jlw0.V0;
        this.b = str;
    }

    @Override // a.jlw0
    public final jlw0 c(String str, h0q0 h0q0Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kgw0)) {
            return false;
        }
        kgw0 kgw0Var = (kgw0) obj;
        return this.b.equals(kgw0Var.b) && this.f18260a.equals(kgw0Var.f18260a);
    }

    @Override // a.jlw0
    public final jlw0 h() {
        return new kgw0(this.b, this.f18260a.h());
    }

    public final int hashCode() {
        return this.f18260a.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // a.jlw0
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // a.jlw0
    public final Double zzd() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // a.jlw0
    public final Boolean zze() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // a.jlw0
    public final Iterator zzf() {
        return null;
    }

    public kgw0(String str, jlw0 jlw0Var) {
        this.f18260a = jlw0Var;
        this.b = str;
    }
}
