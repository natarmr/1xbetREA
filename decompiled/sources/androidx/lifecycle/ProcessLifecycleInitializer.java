package androidx.lifecycle;

import a.iun;
import a.jf4;
import a.kkz;
import a.nr;
import a.pbx;
import a.syb0;
import a.tyb0;
import a.vkz;
import a.wkz;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "La/pbx;", "La/clz;", "<init>", "()V", "lifecycle-process"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements pbx {
    @Override // a.pbx
    public final List a() {
        return iun.f15405a;
    }

    @Override // a.pbx
    public final Object b(Context context) {
        context.getClass();
        nr nrVarN = nr.n(context);
        nrVarN.getClass();
        if (!((HashSet) nrVarN.c).contains(ProcessLifecycleInitializer.class)) {
            jf4.n("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!wkz.f39331a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new vkz());
        }
        tyb0 tyb0Var = tyb0.i;
        tyb0Var.getClass();
        tyb0Var.e = new Handler();
        tyb0Var.f.d(kkz.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new syb0(tyb0Var));
        return tyb0Var;
    }
}
