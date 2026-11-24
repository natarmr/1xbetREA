package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ban {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f2267a;
    public final wul b;

    /* JADX WARN: Multi-variable type inference failed */
    public ban(int i, wul wulVar) {
        this.f2267a = i;
        this.b = wulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ban)) {
            return false;
        }
        ban banVar = (ban) obj;
        return this.f2267a == banVar.f2267a && this.b.equals(banVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f2267a) * 31);
    }

    public final String toString() {
        return "Button(id=" + ((int) this.f2267a) + ", uiModel=" + this.b + Separators.RPAREN;
    }
}
