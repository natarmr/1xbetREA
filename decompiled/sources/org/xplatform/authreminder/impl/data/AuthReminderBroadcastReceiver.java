package org.xplatform.authreminder.impl.data;

import a.ac4;
import a.af3;
import a.b0c0;
import a.b1j;
import a.c0o;
import a.c5c;
import a.ctf0;
import a.d5c;
import a.en4;
import a.fzs0;
import a.gn4;
import a.gqt;
import a.h760;
import a.hn4;
import a.ik4;
import a.jf4;
import a.jsj0;
import a.ksj0;
import a.lsj0;
import a.nhf0;
import a.nn4;
import a.nw20;
import a.o5d0;
import a.ohs0;
import a.on4;
import a.qu;
import a.rrc;
import a.s64;
import a.sac;
import a.t9f;
import a.tgk;
import a.tvk;
import a.y2;
import a.yje;
import a.ze3;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthReminderBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nw20 f46367a;
    public nhf0 b;
    public h760 c;
    public ctf0 d;
    public qu e;
    public s64 f;

    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9 A[Catch: all -> 0x00ed, TRY_LEAVE, TryCatch #0 {all -> 0x00ed, blocks: (B:43:0x00dd, B:45:0x00e9), top: B:73:0x00dd }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f1  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object next;
        Object obj;
        c5c c5cVar;
        on4 on4Var;
        rrc rrcVar;
        tgk tgkVar;
        context.getClass();
        intent.getClass();
        Context applicationContext = context.getApplicationContext();
        yje yjeVar = null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application == null) {
            return;
        }
        int intExtra = intent.getIntExtra("TYPE_NOTIFY_VALUE_KEY", -1);
        c0o c0oVar = fzs0.c;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((fzs0) next).b() != intExtra);
        fzs0 fzs0Var = (fzs0) next;
        if (fzs0Var == null) {
            return;
        }
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(nn4.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof nn4)) {
                ze3Var = null;
            }
            nn4 nn4Var = (nn4) ze3Var;
            if (nn4Var != null) {
                hn4 hn4Var = nn4Var.f23801a;
                h760 h760Var = nn4Var.b;
                ctf0 ctf0Var = nn4Var.c;
                s64 s64Var = nn4Var.d;
                qu quVar = nn4Var.e;
                hn4Var.getClass();
                h760Var.getClass();
                ctf0Var.getClass();
                this.f46367a = hn4Var.g();
                this.b = hn4Var.b();
                this.c = h760Var;
                this.d = ctf0Var;
                this.e = quVar;
                this.f = s64Var;
                nw20 nw20Var = this.f46367a;
                if (nw20Var == null) {
                    Intrinsics.h("showAuthReminderNotificationScenario");
                    throw null;
                }
                int i = Calendar.getInstance().get(11);
                IntRange intRange = on4.e;
                int i2 = intRange.f46068a;
                int i3 = intRange.b;
                lsj0 lsj0Var = lsj0.f20582a;
                jsj0 jsj0Var = jsj0.f17056a;
                ksj0 ksj0Var = ksj0.f18816a;
                if (i > i3 || i2 > i) {
                    IntRange intRange2 = on4.d;
                    int i4 = intRange2.f46068a;
                    if (i > intRange2.b || i4 > i) {
                        obj = ((gqt) nw20Var.b).a() ? jsj0Var : lsj0Var;
                    } else {
                        c5cVar = (c5c) nw20Var.f24215a;
                        on4Var = c5cVar.f3764a;
                        rrcVar = c5cVar.b;
                        tgkVar = (tgk) rrcVar.b;
                        try {
                            if (((Boolean) new b0c0(0, on4Var, on4.class, "canScheduleExactAlarms", "canScheduleExactAlarms()Z", 0, (byte) 25).invoke()).booleanValue()) {
                                on4Var.e(fzs0Var);
                            } else {
                                ik4 ik4Var = c5cVar.c;
                                int iH = rrcVar.H();
                                tgkVar.getClass();
                                Build.MANUFACTURER.getClass();
                                tgkVar.getClass();
                                ik4Var.a(iH, tgk.c());
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        obj = ksj0Var;
                    }
                } else {
                    c5cVar = (c5c) nw20Var.f24215a;
                    on4Var = c5cVar.f3764a;
                    rrcVar = c5cVar.b;
                    tgkVar = (tgk) rrcVar.b;
                    if (((Boolean) new b0c0(0, on4Var, on4.class, "canScheduleExactAlarms", "canScheduleExactAlarms()Z", 0, (byte) 25).invoke()).booleanValue()) {
                        on4Var.e(fzs0Var);
                    } else {
                        ik4 ik4Var2 = c5cVar.c;
                        int iH2 = rrcVar.H();
                        tgkVar.getClass();
                        Build.MANUFACTURER.getClass();
                        tgkVar.getClass();
                        ik4Var2.a(iH2, tgk.c());
                    }
                    obj = ksj0Var;
                }
                if (obj.equals(ksj0Var)) {
                    return;
                }
                if (obj.equals(lsj0Var)) {
                    sac.V(d5c.a(tvk.f34603a), gn4.f11569a, new en4(goAsync(), (byte) 0), null, new ac4((Object) this, (Object) application, (Object) fzs0Var, yjeVar, (byte) 12), 12);
                    return;
                }
                if (!obj.equals(jsj0Var)) {
                    t9f.b();
                    return;
                }
                nhf0 nhf0Var = this.b;
                if (nhf0Var != null) {
                    nhf0Var.x(fzs0Var);
                    return;
                } else {
                    Intrinsics.h("completeAuthReminderNotificationScenario");
                    throw null;
                }
            }
        }
        jf4.n(b1j.i(nn4.class, "Cannot create dependency "));
    }
}
