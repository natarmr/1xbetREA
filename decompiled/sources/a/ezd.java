package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ezd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8667a;
    public final boolean b;
    public final String c;

    public ezd(String str, boolean z, String str2) {
        str.getClass();
        this.f8667a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezd)) {
            return false;
        }
        ezd ezdVar = (ezd) obj;
        return Intrinsics.d(this.f8667a, ezdVar.f8667a) && this.b == ezdVar.b && this.c.equals(ezdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f8667a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(brm0.u("UiState(email=", this.f8667a, ", networkConnected=", this.b, ", title="), this.c, Separators.RPAREN);
    }
}
