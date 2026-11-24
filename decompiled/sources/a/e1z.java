package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e1z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7061a;
    public final a4x b;

    public e1z(a4x a4xVar, String str) {
        str.getClass();
        a4xVar.getClass();
        this.f7061a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1z)) {
            return false;
        }
        e1z e1zVar = (e1z) obj;
        return Intrinsics.d(this.f7061a, e1zVar.f7061a) && Intrinsics.d(this.b, e1zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7061a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("SectionUiModel(header=", this.f7061a, ", lastGames=", this.b, Separators.RPAREN);
    }
}
