package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p4i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26355a;
    public final Integer b;

    public p4i0(String str, Integer num) {
        str.getClass();
        this.f26355a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4i0)) {
            return false;
        }
        p4i0 p4i0Var = (p4i0) obj;
        return Intrinsics.d(this.f26355a, p4i0Var.f26355a) && this.b.equals(p4i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26355a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectedSoundModel(uriString=" + this.f26355a + ", intentFlags=" + this.b + Separators.RPAREN;
    }
}
