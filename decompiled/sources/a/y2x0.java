package a;

import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes2.dex */
public final class y2x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzw0 f41927a;

    public y2x0(tzw0 tzw0Var) {
        this.f41927a = tzw0Var;
    }

    public static d1 b(Task task) {
        n0x0 n0x0Var = new n0x0();
        n0x0Var.h = task;
        rkt0 rkt0Var = new rkt0(n0x0Var, (byte) 13);
        ank ankVar = ank.f1158a;
        task.addOnCompleteListener(ankVar, rkt0Var);
        int i = f1.l;
        d1 d1Var = new d1(n0x0Var, qa3.class, u2x0.f34968a);
        n0x0Var.a(d1Var, n2x.I(ankVar, d1Var));
        return d1Var;
    }

    public final d1 a(k7x0 k7x0Var) throws Throwable {
        String string;
        tzw0 tzw0Var = this.f41927a;
        String simpleName = i0x0.class.getSimpleName();
        Looper looper = tzw0Var.g;
        s0x.I(looper, "Looper must not be null");
        fbv fbvVar = new fbv();
        fbvVar.f9280a = new vox(looper);
        s0x.E(simpleName);
        fbvVar.b = new qg00(k7x0Var, simpleName);
        String strW = p7x.w();
        if (strW == null) {
            string = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = strW.length() + 1;
            int iIdentityHashCode = System.identityHashCode(i0x0.class);
            StringBuilder sb = new StringBuilder(length + String.valueOf(iIdentityHashCode).length());
            sb.append(strW);
            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb.append(iIdentityHashCode);
            string = sb.toString();
        }
        glt0 glt0Var = new glt0(tzw0Var, string, fbvVar);
        qow0 qow0Var = qow0.r;
        td9 td9Var = new td9();
        td9Var.d = fbvVar;
        td9Var.b = glt0Var;
        td9Var.c = qow0Var;
        td9Var.e = new Feature[]{f1t0.j};
        td9Var.f33756a = false;
        qg00 qg00Var = (qg00) ((fbv) td9Var.d).b;
        s0x.I(qg00Var, "Key must not be null");
        fbv fbvVar2 = (fbv) td9Var.d;
        Feature[] featureArr = (Feature[]) td9Var.e;
        boolean z = td9Var.f33756a;
        o24 o24Var = new o24();
        o24Var.d = td9Var;
        o24Var.b = fbvVar2;
        o24Var.c = featureArr;
        o24Var.f24513a = z;
        zlt0 zlt0Var = new zlt0(td9Var, qg00Var);
        s0x.I((qg00) fbvVar2.b, "Listener has already been released.");
        sav savVar = tzw0Var.k;
        savVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        savVar.c(taskCompletionSource, 0, tzw0Var);
        p9w0 p9w0Var = new p9w0(new y9w0(new q9w0(o24Var, zlt0Var), taskCompletionSource), savVar.i.get(), tzw0Var);
        jaw0 jaw0Var = savVar.m;
        jaw0Var.sendMessage(jaw0Var.obtainMessage(8, p9w0Var));
        return b(taskCompletionSource.getTask());
    }
}
