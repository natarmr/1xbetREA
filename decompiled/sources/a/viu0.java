package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class viu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37500a;
    public final piu0 b;
    public int c;
    public boolean d;

    public viu0(Object obj) {
        piu0 piu0Var = new piu0();
        this.f37500a = obj;
        this.b = piu0Var;
        this.c = 0;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof viu0) {
            viu0 viu0Var = (viu0) obj;
            if (Intrinsics.d(this.f37500a, viu0Var.f37500a) && this.b == viu0Var.b && this.c == viu0Var.c && this.d == viu0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f37500a;
        return Boolean.hashCode(this.d) + twn.a(this.c, (this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31)) * 31, 31);
    }

    public final String toString() {
        int i = this.c;
        boolean z = this.d;
        StringBuilder sb = new StringBuilder("Entry(key=");
        sb.append(this.f37500a);
        sb.append(", store=");
        sb.append(this.b);
        sb.append(", refCount=");
        return ohs0.k(i, ", isDisposable=", Separators.RPAREN, sb, z);
    }
}
