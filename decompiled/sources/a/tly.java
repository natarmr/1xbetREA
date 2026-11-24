package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tly {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34169a;
    public final float b;
    public final float c;

    public tly(float f, float f2, boolean z) {
        this.f34169a = z;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tly)) {
            return false;
        }
        tly tlyVar = (tly) obj;
        return this.f34169a == tlyVar.f34169a && Float.compare(this.b, tlyVar.b) == 0 && Float.compare(this.c, tlyVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + defpackage.c.a(Boolean.hashCode(this.f34169a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyboardLiftState(isKeyboardVisible=");
        sb.append(this.f34169a);
        sb.append(", keyboardHeight=");
        sb.append(this.b);
        sb.append(", targetKeyboardHeightPx=");
        return kng0.o(sb, this.c, Separators.RPAREN);
    }

    public /* synthetic */ tly(float f, boolean z) {
        this(f, 0.0f, z);
    }
}
