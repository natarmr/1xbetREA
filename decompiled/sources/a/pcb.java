package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class pcb implements qcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26751a;

    public /* synthetic */ pcb(String str) {
        this.f26751a = str;
    }

    @Override // a.qcb
    public final String b() {
        return this.f26751a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pcb) {
            return Intrinsics.d(this.f26751a, ((pcb) obj).f26751a);
        }
        return false;
    }

    @Override // a.qcb
    public final String getUrl() {
        StringBuilder sb = new StringBuilder(ujn.h);
        String str = this.f26751a;
        str.getClass();
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
        return this.f26751a.hashCode();
    }

    public final String toString() {
        return kng0.l("Icon(source=", this.f26751a, Separators.RPAREN);
    }
}
