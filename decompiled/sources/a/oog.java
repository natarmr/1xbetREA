package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oog implements sog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25594a;
    public final String b;

    public oog(String str, String str2) {
        str.getClass();
        this.f25594a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oog)) {
            return false;
        }
        oog oogVar = (oog) obj;
        return Intrinsics.d(this.f25594a, oogVar.f25594a) && this.b.equals(oogVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25594a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Team(teamName=", this.f25594a, ", teamImage=", this.b, Separators.RPAREN);
    }
}
