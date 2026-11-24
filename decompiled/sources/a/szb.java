package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class szb implements y0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f33064a;
    public final String b;
    public final yvl c;

    public szb(u0f0 u0f0Var, String str, yvl yvlVar) {
        str.getClass();
        this.f33064a = u0f0Var;
        this.b = str;
        this.c = yvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szb)) {
            return false;
        }
        szb szbVar = (szb) obj;
        return this.f33064a == szbVar.f33064a && Intrinsics.d(this.b, szbVar.b) && this.c.equals(szbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f33064a.hashCode() * 31, 31, this.b);
    }

    @Override // a.y0f0
    public final u0f0 q() {
        return this.f33064a;
    }

    public final String toString() {
        return "CheckBoxFieldUiModel(registrationFieldType=" + this.f33064a + ", description=" + this.b + ", checkboxUiModel=" + this.c + Separators.RPAREN;
    }
}
