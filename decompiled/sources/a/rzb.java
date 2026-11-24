package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rzb implements x0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f31351a;
    public final String b;
    public final yvl c;

    public rzb(u0f0 u0f0Var, String str, yvl yvlVar) {
        str.getClass();
        this.f31351a = u0f0Var;
        this.b = str;
        this.c = yvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzb)) {
            return false;
        }
        rzb rzbVar = (rzb) obj;
        return this.f31351a == rzbVar.f31351a && Intrinsics.d(this.b, rzbVar.b) && this.c.equals(rzbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f31351a.hashCode() * 31, 31, this.b);
    }

    @Override // a.x0f0
    public final u0f0 q() {
        return this.f31351a;
    }

    public final String toString() {
        return "CheckBoxFieldUiModel(registrationFieldType=" + this.f31351a + ", description=" + this.b + ", checkboxUiModel=" + this.c + Separators.RPAREN;
    }
}
