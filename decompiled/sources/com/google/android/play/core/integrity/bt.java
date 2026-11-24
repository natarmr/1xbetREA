package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final class bt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bn f45625a;

    public bt(bn bnVar) {
        this.f45625a = bnVar;
    }

    public final /* synthetic */ Task a(long j, long j2, int i, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f45625a.d(standardIntegrityTokenRequest.a(), j, j2, 0);
    }
}
