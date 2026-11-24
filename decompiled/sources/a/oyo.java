package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class oyo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26066a;
    public final String b;

    public oyo(String str, String str2) {
        this.f26066a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyo)) {
            return false;
        }
        oyo oyoVar = (oyo) obj;
        return this.f26066a.equals(oyoVar.f26066a) && Intrinsics.d(this.b, oyoVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f26066a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return b1j.k("FastChangePasswordResultModel(message=", this.f26066a, ", captchaToken=", this.b, Separators.RPAREN);
    }
}
