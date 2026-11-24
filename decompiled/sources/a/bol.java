package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bol implements dol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f2938a;
    public final b0i b;

    public bol(a4x a4xVar, b0i b0iVar) {
        a4xVar.getClass();
        this.f2938a = a4xVar;
        this.b = b0iVar;
    }

    @Override // a.dol
    public final b0i a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bol)) {
            return false;
        }
        bol bolVar = (bol) obj;
        return Intrinsics.d(this.f2938a, bolVar.f2938a) && this.b.equals(bolVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2938a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(items=" + this.f2938a + ", appearance=" + this.b + Separators.RPAREN;
    }
}
