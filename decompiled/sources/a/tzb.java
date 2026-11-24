package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tzb implements z0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f34797a;
    public final String b;
    public final yvl c;

    public tzb(u0f0 u0f0Var, String str, yvl yvlVar) {
        str.getClass();
        this.f34797a = u0f0Var;
        this.b = str;
        this.c = yvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzb)) {
            return false;
        }
        tzb tzbVar = (tzb) obj;
        return this.f34797a == tzbVar.f34797a && Intrinsics.d(this.b, tzbVar.b) && this.c.equals(tzbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f34797a.hashCode() * 31, 31, this.b);
    }

    @Override // a.z0f0
    public final u0f0 q() {
        return this.f34797a;
    }

    public final String toString() {
        return "CheckBoxFieldUiModel(registrationFieldType=" + this.f34797a + ", description=" + this.b + ", checkboxUiModel=" + this.c + Separators.RPAREN;
    }
}
