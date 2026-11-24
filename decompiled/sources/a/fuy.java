package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fuy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10188a;
    public final String b;

    public fuy(String str, String str2) {
        str.getClass();
        this.f10188a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuy)) {
            return false;
        }
        fuy fuyVar = (fuy) obj;
        return Intrinsics.d(this.f10188a, fuyVar.f10188a) && this.b.equals(fuyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10188a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("LabelValueRowUiModel(title=", this.f10188a, ", description=", this.b, Separators.RPAREN);
    }
}
