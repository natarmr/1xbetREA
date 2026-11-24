package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dln implements fln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6291a;
    public final String b;

    public dln(String str, String str2) {
        str.getClass();
        this.f6291a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dln)) {
            return false;
        }
        dln dlnVar = (dln) obj;
        return Intrinsics.d(this.f6291a, dlnVar.f6291a) && this.b.equals(dlnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6291a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("SystemParamUiItem(title=", this.f6291a, ", value=", this.b, Separators.RPAREN);
    }
}
