package com.google.android.play.core.integrity;

import a.jf4;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class u implements av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f45637a;

    public /* synthetic */ u(t tVar) {
    }

    public final u a(Context context) {
        context.getClass();
        this.f45637a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.av
    public final aw b() {
        Context context = this.f45637a;
        if (context != null) {
            return new w(context, null);
        }
        jf4.n(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
        return null;
    }

    private u() {
    }
}
