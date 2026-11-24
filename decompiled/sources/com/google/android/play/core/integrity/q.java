package com.google.android.play.core.integrity;

import a.jf4;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class q implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f45635a;

    public /* synthetic */ q(p pVar) {
    }

    public final q a(Context context) {
        context.getClass();
        this.f45635a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        Context context = this.f45635a;
        if (context != null) {
            return new s(context, null);
        }
        jf4.n(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
        return null;
    }

    private q() {
    }
}
