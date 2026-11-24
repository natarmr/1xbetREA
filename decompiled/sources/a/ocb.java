package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ocb implements qcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25019a;

    public /* synthetic */ ocb(String str) {
        this.f25019a = str;
    }

    @Override // a.qcb
    public final String b() {
        return this.f25019a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ocb) {
            return Intrinsics.d(this.f25019a, ((ocb) obj).f25019a);
        }
        return false;
    }

    @Override // a.qcb
    public final String getUrl() {
        String str = this.f25019a;
        if (!kotlin.text.c.x(str, "/sfiles/logo-flag", false)) {
            return ((StringBuilder) rz4.d("sfiles", "logo-flag", str).b).toString();
        }
        StringBuilder sb = new StringBuilder(ujn.h);
        if (str.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
            sb.setLength(0);
            sb.append(str);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str, '/'));
        }
        return sb.toString();
    }

    public final int hashCode() {
        return this.f25019a.hashCode();
    }

    public final String toString() {
        return kng0.l("Flag(source=", this.f25019a, Separators.RPAREN);
    }
}
