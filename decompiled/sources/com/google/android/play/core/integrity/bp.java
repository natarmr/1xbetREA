package com.google.android.play.core.integrity;

import a.h8w0;
import a.l5w0;
import a.m5w0;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class bp implements l5w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m5w0 f45622a;
    private final m5w0 b;
    private final m5w0 c;
    private final m5w0 d;

    public bp(m5w0 m5w0Var, m5w0 m5w0Var2, m5w0 m5w0Var3, m5w0 m5w0Var4) {
        this.f45622a = m5w0Var;
        this.b = m5w0Var2;
        this.c = m5w0Var3;
        this.d = m5w0Var4;
    }

    @Override // a.m5w0
    public final /* bridge */ /* synthetic */ Object a() {
        return new bn((Context) this.f45622a.a(), (h8w0) this.b.a(), ((au) this.c).a(), new j());
    }
}
