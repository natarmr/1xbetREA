package com.google.android.play.core.integrity;

import a.hny;
import a.jf4;

/* JADX INFO: loaded from: classes2.dex */
final class am extends IntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45600a;
    private Long b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f45600a;
        an anVar = null;
        if (str != null) {
            return new ao(str, this.b, anVar, anVar);
        }
        jf4.n("Missing required properties: nonce");
        return null;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.b = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str != null) {
            this.f45600a = str;
            return this;
        }
        hny.u("Null nonce");
        return null;
    }
}
