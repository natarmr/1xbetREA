package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class wk {
    public static final vk Companion = new vk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39286a;
    public final int b;

    public /* synthetic */ wk(int i, int i2, String str) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, uk.f35802a.getDescriptor());
            throw null;
        }
        this.f39286a = str;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk)) {
            return false;
        }
        wk wkVar = (wk) obj;
        return Intrinsics.d(this.f39286a, wkVar.f39286a) && this.b == wkVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f39286a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "PhoneDataRequest(phone=", this.f39286a, ", countryId=", Separators.RPAREN);
    }

    public wk(String str, int i) {
        str.getClass();
        this.f39286a = str;
        this.b = i;
    }
}
