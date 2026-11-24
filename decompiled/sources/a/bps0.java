package a;

import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bps0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3000a;
    public final /* synthetic */ dps0 b;

    public /* synthetic */ bps0(dps0 dps0Var, byte b) {
        this.f3000a = b;
        this.b = dps0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ctd ctdVar;
        String str;
        byte b = this.f3000a;
        dps0 dps0Var = this.b;
        switch (b) {
            case 0:
                y2e0 y2e0Var = dps0Var.l;
                boolean z = dps0Var.q;
                y2e0Var.d.a(z);
                y2e0Var.e.a(z);
                return;
            default:
                nfq nfqVar = dps0Var.d;
                nfqVar.a();
                Context context = nfqVar.f23449a;
                dps0Var.j = context;
                dps0Var.o = context.getPackageName();
                dps0Var.k = hsd.e();
                dps0Var.l = new y2e0(dps0Var.j, new g2e0(100L, 1L, TimeUnit.MINUTES));
                dps0Var.m = mj3.a();
                p5d0 p5d0Var = dps0Var.g;
                hsd hsdVar = dps0Var.k;
                hsdVar.getClass();
                ctd ctdVar2 = ctd.f4930a;
                synchronized (ctd.class) {
                    ctdVar = ctd.f4930a;
                    if (ctdVar == null) {
                        ctdVar = new ctd();
                        ctd.f4930a = ctdVar;
                    }
                    break;
                }
                Long l = (Long) hsdVar.f13576a.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
                l.getClass();
                Map map = ctd.b;
                if (!map.containsKey(l) || (str = (String) map.get(l)) == null) {
                    v680 v680VarD = hsdVar.d(ctdVar);
                    str = v680VarD.b() ? (String) v680VarD.a() : "FIREPERF";
                } else {
                    hsdVar.c.f("com.google.firebase.perf.LogSourceName", str);
                }
                dps0Var.h = new pkq(p5d0Var, str);
                ConcurrentLinkedQueue concurrentLinkedQueue = dps0Var.b;
                mj3 mj3Var = dps0Var.m;
                WeakReference weakReference = new WeakReference(dps0.s);
                synchronized (mj3Var.f) {
                    mj3Var.f.add(weakReference);
                    break;
                }
                zr3 zr3VarY = cs3.y();
                dps0Var.n = zr3VarY;
                nfq nfqVar2 = dps0Var.d;
                nfqVar2.a();
                String str2 = nfqVar2.c.b;
                zr3VarY.i();
                ((cs3) zr3VarY.b).C(str2);
                fw2 fw2VarU = hw2.u();
                String str3 = dps0Var.o;
                fw2VarU.i();
                ((hw2) fw2VarU.b).v(str3);
                fw2VarU.i();
                ((hw2) fw2VarU.b).w();
                Context context2 = dps0Var.j;
                String str4 = "";
                try {
                    String str5 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str5 != null) {
                        str4 = str5;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                fw2VarU.i();
                ((hw2) fw2VarU.b).x(str4);
                zr3VarY.i();
                ((cs3) zr3VarY.b).z((hw2) fw2VarU.h());
                dps0Var.c.set(true);
                while (!concurrentLinkedQueue.isEmpty()) {
                    id90 id90Var = (id90) concurrentLinkedQueue.poll();
                    if (id90Var != null) {
                        dps0Var.i.execute(new qaq0(dps0Var, id90Var, (byte) 6));
                    }
                }
                return;
        }
    }
}
