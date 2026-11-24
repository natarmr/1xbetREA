package com.google.android.play.core.integrity;

import a.axq;

/* JADX INFO: loaded from: classes2.dex */
final class h extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45630a;

    public /* synthetic */ h(String str, g gVar) {
        this.f45630a = str;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final String a() {
        return this.f45630a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
        String str = this.f45630a;
        if (str == null) {
            return standardIntegrityTokenRequest.a() == null;
        }
        return str.equals(standardIntegrityTokenRequest.a());
    }

    public final int hashCode() {
        String str = this.f45630a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return axq.n(new StringBuilder("StandardIntegrityTokenRequest{requestHash="), this.f45630a, "}");
    }
}
