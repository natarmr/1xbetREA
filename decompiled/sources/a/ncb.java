package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ncb implements qcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23284a;

    public /* synthetic */ ncb(String str) {
        this.f23284a = str;
    }

    public static String a(String str) {
        if (!kotlin.text.c.x(str, "/sfiles/logo-champ", false)) {
            return ((StringBuilder) rz4.d("sfiles", "logo-champ", str).b).toString();
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

    @Override // a.qcb
    public final String b() {
        return this.f23284a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ncb) {
            return Intrinsics.d(this.f23284a, ((ncb) obj).f23284a);
        }
        return false;
    }

    @Override // a.qcb
    public final String getUrl() {
        return a(this.f23284a);
    }

    public final int hashCode() {
        return this.f23284a.hashCode();
    }

    public final String toString() {
        return kng0.l("Champ(source=", this.f23284a, Separators.RPAREN);
    }
}
