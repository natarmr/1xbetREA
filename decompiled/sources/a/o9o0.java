package a;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o9o0 implements ah60, zjo {
    public static final String j = wv00.h("SystemFgDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cpv0 f24889a;
    public final fpv0 b;
    public final Object c = new Object();
    public xov0 d;
    public final LinkedHashMap e;
    public final HashMap f;
    public final HashMap g;
    public final zas0 h;
    public SystemForegroundService i;

    public o9o0(Context context) {
        cpv0 cpv0VarD = cpv0.d(context);
        this.f24889a = cpv0VarD;
        this.b = cpv0VarD.d;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashMap();
        this.f = new HashMap();
        this.h = new zas0(cpv0VarD.j);
        cpv0VarD.f.a(this);
    }

    public static Intent b(Context context, xov0 xov0Var, lvq lvqVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", xov0Var.f41241a);
        intent.putExtra("KEY_GENERATION", xov0Var.b);
        intent.putExtra("KEY_NOTIFICATION_ID", lvqVar.f20727a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", lvqVar.b);
        intent.putExtra("KEY_NOTIFICATION", lvqVar.c);
        return intent;
    }

    @Override // a.ah60
    public final void a(ppv0 ppv0Var, w4e w4eVar) {
        if (w4eVar instanceof v4e) {
            String str = ppv0Var.f27390a;
            wv00.f().a(j, "Constraints unmet for WorkSpec " + str);
            xov0 xov0VarK = jpm0.k(ppv0Var);
            int i = ((v4e) w4eVar).f36773a;
            cpv0 cpv0Var = this.f24889a;
            cpv0Var.d.a(new wqm0(cpv0Var.f, new h6m0(xov0VarK), true, i));
        }
    }

    @Override // a.zjo
    public final void c(xov0 xov0Var, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            try {
                bby bbyVar = ((ppv0) this.f.remove(xov0Var)) != null ? (bby) this.g.remove(xov0Var) : null;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        lvq lvqVar = (lvq) this.e.remove(xov0Var);
        if (xov0Var.equals(this.d)) {
            if (this.e.size() > 0) {
                Iterator it = this.e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.d = (xov0) entry.getKey();
                if (this.i != null) {
                    lvq lvqVar2 = (lvq) entry.getValue();
                    SystemForegroundService systemForegroundService = this.i;
                    int i = lvqVar2.f20727a;
                    int i2 = lvqVar2.b;
                    Notification notification = lvqVar2.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        sf3.G(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        sf3.F(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.i.d.cancel(lvqVar2.f20727a);
                }
            } else {
                this.d = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.i;
        if (lvqVar == null || systemForegroundService2 == null) {
            return;
        }
        wv00.f().a(j, "Removing Notification (id: " + lvqVar.f20727a + ", workSpecId: " + xov0Var + ", notificationType: " + lvqVar.b);
        systemForegroundService2.d.cancel(lvqVar.f20727a);
    }

    public final void d(Intent intent) {
        if (this.i == null) {
            jf4.n("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        xov0 xov0Var = new xov0(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        wv00 wv00VarF = wv00.f();
        StringBuilder sbR = vqd.r(intExtra, "Notifying with (id:", ", workSpecId: ", stringExtra, ", notificationType :");
        sbR.append(intExtra2);
        sbR.append(Separators.RPAREN);
        wv00VarF.a(j, sbR.toString());
        if (notification == null) {
            jf4.o("Notification passed in the intent was null.");
            return;
        }
        lvq lvqVar = new lvq(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.e;
        linkedHashMap.put(xov0Var, lvqVar);
        lvq lvqVar2 = (lvq) linkedHashMap.get(this.d);
        if (lvqVar2 == null) {
            this.d = xov0Var;
        } else {
            this.i.d.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((lvq) ((Map.Entry) it.next()).getValue()).b;
                }
                lvqVar = new lvq(lvqVar2.f20727a, lvqVar2.c, i);
            } else {
                lvqVar = lvqVar2;
            }
        }
        SystemForegroundService systemForegroundService = this.i;
        int i2 = lvqVar.f20727a;
        int i3 = lvqVar.b;
        Notification notification2 = lvqVar.c;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            sf3.G(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            sf3.F(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }

    public final void e() {
        this.i = null;
        synchronized (this.c) {
            try {
                Iterator it = this.g.values().iterator();
                while (it.hasNext()) {
                    ((bby) it.next()).cancel(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ezb0 ezb0Var = this.f24889a.f;
        synchronized (ezb0Var.k) {
            ezb0Var.j.remove(this);
        }
    }

    public final void f(int i, int i2) {
        wv00.f().g(j, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.e.entrySet()) {
            if (((lvq) entry.getValue()).b == i2) {
                xov0 xov0Var = (xov0) entry.getKey();
                cpv0 cpv0Var = this.f24889a;
                cpv0Var.d.a(new wqm0(cpv0Var.f, new h6m0(xov0Var), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.i;
        if (systemForegroundService != null) {
            systemForegroundService.b = true;
            wv00.f().a(SystemForegroundService.e, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i);
        }
    }
}
