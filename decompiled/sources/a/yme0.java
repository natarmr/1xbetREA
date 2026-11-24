package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ui_core.resources.UiText;

/* JADX INFO: loaded from: classes5.dex */
public final class yme0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiText.ByRes f42884a;
    public final UiText.ByRes b;
    public final UiText.ByRes c;
    public final UiText d;
    public final String e;

    public /* synthetic */ yme0(UiText.ByRes byRes, UiText.ByRes byRes2, UiText.ByRes byRes3) {
        this(byRes, byRes2, byRes3, new UiText.ByString(""), "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yme0)) {
            return false;
        }
        yme0 yme0Var = (yme0) obj;
        return Intrinsics.d(this.f42884a, yme0Var.f42884a) && Intrinsics.d(this.b, yme0Var.b) && Intrinsics.d(this.c, yme0Var.c) && Intrinsics.d(this.d, yme0Var.d) && Intrinsics.d(this.e, yme0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f42884a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReferralAlertModel(title=");
        sb.append(this.f42884a);
        sb.append(", message=");
        sb.append(this.b);
        sb.append(", positiveTextButton=");
        sb.append(this.c);
        sb.append(", negativeTextButton=");
        sb.append(this.d);
        sb.append(", requestKey=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }

    public yme0(UiText.ByRes byRes, UiText.ByRes byRes2, UiText.ByRes byRes3, UiText uiText, String str) {
        this.f42884a = byRes;
        this.b = byRes2;
        this.c = byRes3;
        this.d = uiText;
        this.e = str;
    }
}
