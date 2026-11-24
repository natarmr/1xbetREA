package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ecb implements zhr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7557a;
    public final String b;
    public final String c;

    public ecb(String str, String str2, String str3) {
        str3.getClass();
        this.f7557a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // a.zhr0
    public final String a() {
        return this.f7557a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecb)) {
            return false;
        }
        ecb ecbVar = (ecb) obj;
        return this.f7557a.equals(ecbVar.f7557a) && this.b.equals(ecbVar.b) && Intrinsics.d(this.c, ecbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f7557a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ChampHeaderUiModel(itemKey=", this.f7557a, ", champName=", this.b, ", champImageUrl="), this.c, Separators.RPAREN);
    }
}
