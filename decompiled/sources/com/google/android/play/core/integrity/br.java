package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final class br extends StandardIntegrityManager.StandardIntegrityToken {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45623a;
    private final y b;

    public br(String str, y yVar) {
        this.f45623a = str;
        this.b = yVar;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final Task<Integer> showDialog(Activity activity, int i) {
        return this.b.a(activity, i);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f45623a;
    }
}
