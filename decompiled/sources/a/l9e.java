package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class l9e implements p9e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19647a;
    public final String b;

    public l9e(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f19647a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9e)) {
            return false;
        }
        l9e l9eVar = (l9e) obj;
        return Intrinsics.d(this.f19647a, l9eVar.f19647a) && Intrinsics.d(this.b, l9eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ua80.b(Integer.hashCode(R.drawable.ic_service_chat) * 31, 31, this.f19647a);
    }

    public final String toString() {
        return axq.n(vqd.r(R.drawable.ic_service_chat, "CriticalError(icon=", ", title=", this.f19647a, ", message="), this.b, Separators.RPAREN);
    }
}
