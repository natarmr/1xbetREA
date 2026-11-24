package org.xplatform.security.impl.presentation.password.change.input_password;

import a.c4m0;
import a.c670;
import a.cyh;
import a.d5c;
import a.duj;
import a.e0c;
import a.fnq;
import a.i1w0;
import a.jiu0;
import a.m1e;
import a.mne;
import a.mxg0;
import a.ol60;
import a.ort;
import a.p7m0;
import a.q7m0;
import a.sac;
import a.st20;
import a.vzg0;
import a.w46;
import a.we50;
import a.xae0;
import a.yje;
import a.z4w0;
import a.zn00;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends w46 {
    public final vzg0 b;
    public final i1w0 c;
    public final we50 d;
    public final mxg0 e;
    public final zn00 f;
    public final ort g;
    public final cyh h;
    public final e0c i;
    public final z4w0 j;
    public final mne k;
    public final duj l;
    public final p7m0 m;
    public final xae0 n;
    public final p7m0 o;
    public final ol60 p;
    public c4m0 q;
    public final c4m0 r;
    public boolean s;

    public f(vzg0 vzg0Var, i1w0 i1w0Var, we50 we50Var, mxg0 mxg0Var, zn00 zn00Var, ort ortVar, cyh cyhVar, e0c e0cVar, z4w0 z4w0Var, mne mneVar, duj dujVar, m1e m1eVar) {
        i1w0Var.getClass();
        m1eVar.getClass();
        this.b = vzg0Var;
        this.c = i1w0Var;
        this.d = we50Var;
        this.e = mxg0Var;
        this.f = zn00Var;
        this.g = ortVar;
        this.h = cyhVar;
        this.i = e0cVar;
        this.j = z4w0Var;
        this.k = mneVar;
        this.l = dujVar;
        Boolean bool = Boolean.FALSE;
        this.m = q7m0.a(bool);
        this.n = vzg0Var.c(PasswordChangeViewModel$ScreenUiState.Default.b, "current_password_key");
        this.o = q7m0.a(bool);
        this.p = new ol60(3);
        c4m0 c4m0Var = this.r;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            this.r = sac.T(new fnq(m1eVar.b(), new c670(this, yjeVar, (byte) 9), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), new st20(2, yjeVar, (byte) 12));
        }
    }
}
