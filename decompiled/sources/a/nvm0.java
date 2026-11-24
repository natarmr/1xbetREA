package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nvm0 implements ovm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24195a;
    public final List b;

    public nvm0(long j, List list) {
        list.getClass();
        this.f24195a = j;
        this.b = list;
    }

    @Override // a.ovm0
    public final long a() {
        return this.f24195a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvm0)) {
            return false;
        }
        nvm0 nvm0Var = (nvm0) obj;
        return this.f24195a == nvm0Var.f24195a && Intrinsics.d(this.b, nvm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f24195a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f24195a, "Specific(subGameId=", ", marketTypes=", this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
