package com.google.android.play.core.integrity;

import a.brm0;

/* JADX INFO: loaded from: classes2.dex */
final class e extends StandardIntegrityManager.PrepareIntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f45628a;

    public /* synthetic */ e(long j, int i, d dVar) {
        this.f45628a = j;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    public final int a() {
        return 0;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    public final long b() {
        return this.f45628a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) {
            StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest = (StandardIntegrityManager.PrepareIntegrityTokenRequest) obj;
            if (this.f45628a == prepareIntegrityTokenRequest.b()) {
                prepareIntegrityTokenRequest.a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f45628a;
        return (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return brm0.k(this.f45628a, ", webViewRequestMode=0}", new StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber="));
    }
}
