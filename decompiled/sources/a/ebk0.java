package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ebk0 implements fbk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iy3 f7523a;
    public final int b;
    public final ArrayList c;

    public ebk0(iy3 iy3Var, int i, ArrayList arrayList) {
        this.f7523a = iy3Var;
        this.b = i;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebk0)) {
            return false;
        }
        ebk0 ebk0Var = (ebk0) obj;
        return this.f7523a.equals(ebk0Var.f7523a) && this.b == ebk0Var.b && this.c.equals(ebk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f7523a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WithImages(aspectRatio=");
        sb.append(this.f7523a);
        sb.append(", backgroundImageRes=");
        sb.append(this.b);
        sb.append(", smartImageRes=");
        return rz4.n(sb, this.c, Separators.RPAREN);
    }
}
