package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m9p implements s9p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21420a;
    public final int b;

    public m9p(String str, int i) {
        str.getClass();
        this.f21420a = str;
        this.b = i;
    }

    @Override // a.s9p
    public final String a() {
        return this.f21420a;
    }

    @Override // a.s9p
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9p)) {
            return false;
        }
        m9p m9pVar = (m9p) obj;
        return Intrinsics.d(this.f21420a, m9pVar.f21420a) && this.b == m9pVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f21420a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "Champs(headerName=", this.f21420a, ", headerCounter=", Separators.RPAREN);
    }
}
