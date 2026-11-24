package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class kjj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ljj f18388a;
    public final a4x b;

    public kjj(ljj ljjVar, a4x a4xVar) {
        ljjVar.getClass();
        a4xVar.getClass();
        this.f18388a = ljjVar;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjj)) {
            return false;
        }
        kjj kjjVar = (kjj) obj;
        return this.f18388a == kjjVar.f18388a && Intrinsics.d(this.b, kjjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18388a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugConsolePopUpUiModel(state=" + this.f18388a + ", textData=" + this.b + Separators.RPAREN;
    }
}
