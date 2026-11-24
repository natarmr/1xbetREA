package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class lpf0 implements rpf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20439a;
    public final boolean b;

    public lpf0(ArrayList arrayList, boolean z) {
        this.f20439a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpf0)) {
            return false;
        }
        lpf0 lpf0Var = (lpf0) obj;
        return this.f20439a.equals(lpf0Var.f20439a) && this.b == lpf0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f20439a.hashCode() * 31);
    }

    public final String toString() {
        return "ApplySafes(safes=" + this.f20439a + ", useSmoke=" + this.b + Separators.RPAREN;
    }
}
