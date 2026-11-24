package com.google.android.play.core.integrity;

import a.hny;
import a.i7;
import a.k5w0;
import a.m5w0;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class w implements aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f45638a = this;
    private final m5w0 b;
    private final m5w0 c;
    private final m5w0 d;
    private final m5w0 e;
    private final m5w0 f;
    private final m5w0 g;

    public w(Context context, v vVar) {
        if (context == null) {
            hny.u("instance cannot be null");
            throw null;
        }
        i7 i7Var = new i7(context);
        this.b = i7Var;
        k5w0 k5w0VarB = k5w0.b(bb.f45612a);
        this.c = k5w0VarB;
        au auVar = new au(i7Var, n.f45634a);
        this.d = auVar;
        k5w0 k5w0VarB2 = k5w0.b(new bp(i7Var, k5w0VarB, auVar, n.f45634a));
        this.e = k5w0VarB2;
        k5w0 k5w0VarB3 = k5w0.b(new bu(k5w0VarB2));
        this.f = k5w0VarB3;
        this.g = k5w0.b(new ba(k5w0VarB2, k5w0VarB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.g.a();
    }
}
