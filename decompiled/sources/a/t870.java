package a;

import android.gov.nist.core.Separators;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t870 implements u870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebResourceRequest f33501a;
    public final WebResourceResponse b;

    public t870(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f33501a = webResourceRequest;
        this.b = webResourceResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t870)) {
            return false;
        }
        t870 t870Var = (t870) obj;
        return Intrinsics.d(this.f33501a, t870Var.f33501a) && Intrinsics.d(this.b, t870Var.b);
    }

    public final int hashCode() {
        WebResourceRequest webResourceRequest = this.f33501a;
        int iHashCode = (webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31;
        WebResourceResponse webResourceResponse = this.b;
        return iHashCode + (webResourceResponse != null ? webResourceResponse.hashCode() : 0);
    }

    public final String toString() {
        return "OnReceivePageHttpError(request=" + this.f33501a + ", errorResponse=" + this.b + Separators.RPAREN;
    }
}
