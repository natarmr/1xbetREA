package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ahq0 implements chq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f886a;
    public final String b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public ahq0(String str, int i, boolean z) {
        str.getClass();
        this.f886a = i;
        this.b = str;
        this.c = z;
    }

    @Override // a.chq0
    public final boolean a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahq0)) {
            return false;
        }
        ahq0 ahq0Var = (ahq0) obj;
        return this.f886a == ahq0Var.f886a && Intrinsics.d(this.b, ahq0Var.b) && this.c == ahq0Var.c;
    }

    @Override // a.chq0
    public final int getId() {
        return this.f886a;
    }

    @Override // a.chq0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f886a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f886a, "TimeFilterItemChipUiModel(id=", ", title=", this.b, ", selected="), this.c, Separators.RPAREN);
    }
}
