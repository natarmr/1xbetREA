package a;

import android.gov.nist.core.Separators;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s870 implements u870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebResourceRequest f31789a;
    public final WebResourceError b;

    public s870(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f31789a = webResourceRequest;
        this.b = webResourceError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s870)) {
            return false;
        }
        s870 s870Var = (s870) obj;
        return Intrinsics.d(this.f31789a, s870Var.f31789a) && Intrinsics.d(this.b, s870Var.b);
    }

    public final int hashCode() {
        WebResourceRequest webResourceRequest = this.f31789a;
        int iHashCode = (webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31;
        WebResourceError webResourceError = this.b;
        return iHashCode + (webResourceError != null ? webResourceError.hashCode() : 0);
    }

    public final String toString() {
        return "OnReceivePageError(request=" + this.f31789a + ", error=" + this.b + Separators.RPAREN;
    }
}
