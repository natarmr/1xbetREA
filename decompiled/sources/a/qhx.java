package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qhx implements shx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f28764a;
    public final boolean b;
    public final boolean c;

    public qhx(udl0 udl0Var, boolean z, boolean z2) {
        this.f28764a = udl0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhx)) {
            return false;
        }
        qhx qhxVar = (qhx) obj;
        return this.f28764a == qhxVar.f28764a && this.b == qhxVar.b && this.c == qhxVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f28764a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Progress(sportGameType=");
        sb.append(this.f28764a);
        sb.append(", isClassicRefactorEnabled=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
