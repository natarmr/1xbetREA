package a;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nav {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23210a;
    public final String b;
    public final fvt0 c;
    public final yzn0 d;
    public final ea3 e;
    public final ua3 f;
    public final Looper g;
    public final int h;
    public final j9w0 i;
    public final rek0 j;
    public final sav k;

    public nav(Context context, yzn0 yzn0Var, ea3 ea3Var, mav mavVar) {
        s0x.I(context, "Null context is not permitted.");
        s0x.I(yzn0Var, "Api must not be null.");
        s0x.I(mavVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        s0x.I(applicationContext, "The provided context did not have an application context.");
        this.f23210a = applicationContext;
        int i = Build.VERSION.SDK_INT;
        String strD = (i < 30 || i < 30) ? null : e7.d(context);
        this.b = strD;
        this.c = i >= 31 ? new fvt0(context.getAttributionSource()) : null;
        this.d = yzn0Var;
        this.e = ea3Var;
        this.g = mavVar.b;
        this.f = new ua3(yzn0Var, ea3Var, strD);
        this.i = new j9w0(this);
        sav savVarE = sav.e(applicationContext);
        this.k = savVarE;
        this.h = savVarE.h.getAndIncrement();
        this.j = mavVar.f21477a;
        jaw0 jaw0Var = savVarE.m;
        jaw0Var.sendMessage(jaw0Var.obtainMessage(7, this));
    }

    public final es a() {
        es esVar = new es();
        Set set = Collections.EMPTY_SET;
        lx3 lx3Var = (lx3) esVar.f8305a;
        if (lx3Var == null) {
            lx3Var = new lx3(0);
            esVar.f8305a = lx3Var;
        }
        lx3Var.addAll(set);
        Context context = this.f23210a;
        esVar.c = context.getClass().getName();
        esVar.b = context.getPackageName();
        return esVar;
    }

    public final Task b(int i, s9w0 s9w0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        sav savVar = this.k;
        savVar.getClass();
        savVar.c(taskCompletionSource, s9w0Var.c, this);
        p9w0 p9w0Var = new p9w0(new aaw0(i, s9w0Var, taskCompletionSource, this.j), savVar.i.get(), this);
        jaw0 jaw0Var = savVar.m;
        jaw0Var.sendMessage(jaw0Var.obtainMessage(4, p9w0Var));
        return taskCompletionSource.getTask();
    }
}
