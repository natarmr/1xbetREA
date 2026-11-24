package com.google.android.play.core.integrity;

import a.jf4;

/* JADX INFO: loaded from: classes2.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f45627a;
    private byte b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i) {
        this.b = (byte) (this.b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        d dVar = null;
        if (this.b == 3) {
            return new e(this.f45627a, 0, dVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        if ((this.b & 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        jf4.n("Missing required properties:".concat(sb.toString()));
        return null;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.f45627a = j;
        this.b = (byte) (this.b | 1);
        return this;
    }
}
