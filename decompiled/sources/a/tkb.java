package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tkb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qkb f34086a;
    public final a4x b;

    public tkb(qkb qkbVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f34086a = qkbVar;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkb)) {
            return false;
        }
        tkb tkbVar = (tkb) obj;
        return Intrinsics.d(this.f34086a, tkbVar.f34086a) && Intrinsics.d(this.b, tkbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34086a.hashCode() * 31);
    }

    public final String toString() {
        return "ChampionshipScrollableContentUiState(screenState=" + this.f34086a + ", uiItems=" + this.b + Separators.RPAREN;
    }

    public tkb(pkb pkbVar) {
        this(pkbVar, lak0.c);
    }
}
