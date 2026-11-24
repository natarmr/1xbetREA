package com.google.android.play.core.integrity;

import a.hny;
import a.i7;
import a.k5w0;
import a.m5w0;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f45636a = this;
    private final m5w0 b;
    private final m5w0 c;
    private final m5w0 d;
    private final m5w0 e;
    private final m5w0 f;

    public s(Context context, r rVar) {
        if (context == null) {
            hny.u("instance cannot be null");
            throw null;
        }
        i7 i7Var = new i7(context);
        this.b = i7Var;
        k5w0 k5w0VarB = k5w0.b(ac.f45591a);
        this.c = k5w0VarB;
        au auVar = new au(i7Var, l.f45631a);
        this.d = auVar;
        k5w0 k5w0VarB2 = k5w0.b(new al(i7Var, k5w0VarB, auVar, l.f45631a));
        this.e = k5w0VarB2;
        this.f = k5w0.b(new ab(k5w0VarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f.a();
    }
}
