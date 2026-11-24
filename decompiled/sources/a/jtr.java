package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jtr implements ltr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17114a;
    public final String b;

    public jtr(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f17114a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtr)) {
            return false;
        }
        jtr jtrVar = (jtr) obj;
        return Intrinsics.d(this.f17114a, jtrVar.f17114a) && Intrinsics.d(this.b, jtrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17114a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Content(label=", this.f17114a, ", info=", this.b, Separators.RPAREN);
    }
}
