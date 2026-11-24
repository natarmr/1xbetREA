package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35722a;
    public final String b;
    public final List c;

    public uia(List list, String str, String str2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f35722a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uia)) {
            return false;
        }
        uia uiaVar = (uia) obj;
        return Intrinsics.d(this.f35722a, uiaVar.f35722a) && Intrinsics.d(this.b, uiaVar.b) && Intrinsics.d(this.c, uiaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f35722a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(b1j.n("CardHostVsGuestsModel(hostHeaderName=", this.f35722a, ", guestHeaderName=", this.b, ", itemList="), this.c, Separators.RPAREN);
    }
}
