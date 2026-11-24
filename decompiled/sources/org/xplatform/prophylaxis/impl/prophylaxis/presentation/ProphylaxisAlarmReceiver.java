package org.xplatform.prophylaxis.impl.prophylaxis.presentation;

import a.af3;
import a.b1j;
import a.c1d0;
import a.ctf0;
import a.d5c;
import a.dvj;
import a.en4;
import a.h760;
import a.jf4;
import a.kin0;
import a.kpb0;
import a.o5d0;
import a.orc;
import a.qem0;
import a.qu;
import a.rwj;
import a.s64;
import a.sac;
import a.sje;
import a.tvk;
import a.x0d0;
import a.y0d0;
import a.yje;
import a.ylt0;
import a.ze3;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes3.dex */
public final class ProphylaxisAlarmReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h760 f46841a;
    public ylt0 b;
    public orc c;
    public ctf0 d;
    public s64 e;
    public qu f;
    public final sje g;

    public ProphylaxisAlarmReceiver() {
        rwj rwjVar = tvk.f34603a;
        dvj dvjVar = dvj.c;
        kin0 kin0VarE = qem0.e();
        dvjVar.getClass();
        this.g = d5c.a(e.c(dvjVar, kin0VarE));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        yje yjeVar = null;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application == null) {
            return;
        }
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(x0d0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof x0d0)) {
                ze3Var = null;
            }
            x0d0 x0d0Var = (x0d0) ze3Var;
            if (x0d0Var != null) {
                c1d0 c1d0Var = x0d0Var.f40066a;
                h760 h760Var = x0d0Var.b;
                ctf0 ctf0Var = x0d0Var.c;
                s64 s64Var = x0d0Var.d;
                qu quVar = x0d0Var.e;
                c1d0Var.getClass();
                h760Var.getClass();
                ctf0Var.getClass();
                this.f46841a = h760Var;
                this.b = c1d0Var.e();
                this.c = c1d0Var.c();
                this.d = ctf0Var;
                this.e = s64Var;
                this.f = quVar;
                sac.V(this.g, y0d0.f41800a, new en4(goAsync(), (byte) 1), null, new kpb0(this, application, context, yjeVar, (byte) 2), 12);
                return;
            }
        }
        jf4.n(b1j.i(x0d0.class, "Cannot create dependency "));
    }
}
