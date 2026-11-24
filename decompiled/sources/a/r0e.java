package a;

import android.gov.nist.core.Separators;
import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r0e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29624a;
    public final SpannableStringBuilder b;
    public final wzd c;
    public final wzd d;
    public final wzd e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;

    public r0e(boolean z, SpannableStringBuilder spannableStringBuilder, wzd wzdVar, wzd wzdVar2, wzd wzdVar3, boolean z2, boolean z3, boolean z4, String str) {
        str.getClass();
        this.f29624a = z;
        this.b = spannableStringBuilder;
        this.c = wzdVar;
        this.d = wzdVar2;
        this.e = wzdVar3;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = str;
    }

    public static r0e a(r0e r0eVar, boolean z, wzd wzdVar, wzd wzdVar2, int i) {
        if ((i & 1) != 0) {
            z = r0eVar.f29624a;
        }
        boolean z2 = z;
        SpannableStringBuilder spannableStringBuilder = r0eVar.b;
        if ((i & 4) != 0) {
            wzdVar = r0eVar.c;
        }
        wzd wzdVar3 = wzdVar;
        wzd wzdVar4 = r0eVar.d;
        if ((i & 16) != 0) {
            wzdVar2 = r0eVar.e;
        }
        boolean z3 = r0eVar.f;
        boolean z4 = r0eVar.g;
        boolean z5 = r0eVar.h;
        String str = r0eVar.i;
        r0eVar.getClass();
        str.getClass();
        return new r0e(z2, spannableStringBuilder, wzdVar3, wzdVar4, wzdVar2, z3, z4, z5, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0e)) {
            return false;
        }
        r0e r0eVar = (r0e) obj;
        return this.f29624a == r0eVar.f29624a && this.b.equals(r0eVar.b) && this.c.equals(r0eVar.c) && this.d.equals(r0eVar.d) && this.e.equals(r0eVar.e) && this.f == r0eVar.f && this.g == r0eVar.g && this.h == r0eVar.h && Intrinsics.d(this.i, r0eVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + brm0.e(brm0.e(brm0.e((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f29624a) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiState(loading=");
        sb.append(this.f29624a);
        sb.append(", actionText=");
        sb.append((Object) this.b);
        sb.append(", firstButton=");
        sb.append(this.c);
        sb.append(", secondButton=");
        sb.append(this.d);
        sb.append(", thirdButton=");
        sb.append(this.e);
        sb.append(", inputVisible=");
        sb.append(this.f);
        sb.append(", authenticatorStyle=");
        ua80.u(", showCannotGetSmsButton=", ", screenTitle=", sb, this.g, this.h);
        return axq.n(sb, this.i, Separators.RPAREN);
    }
}
