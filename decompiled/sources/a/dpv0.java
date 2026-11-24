package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dpv0 extends rer implements aer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dpv0 f6484a = new dpv0(6, epv0.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // a.aer
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        wsd wsdVar = (wsd) obj2;
        fpv0 fpv0Var = (fpv0) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        lds0 lds0Var = (lds0) obj5;
        ezb0 ezb0Var = (ezb0) obj6;
        context.getClass();
        wsdVar.getClass();
        fpv0Var.getClass();
        workDatabase.getClass();
        lds0Var.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        String str = m2h0.f21060a;
        x9o0 x9o0Var = new x9o0(context, workDatabase, wsdVar);
        String str2 = vg80.f37370a;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        vg80.a(packageManager, new ComponentName(context, (Class<?>) SystemJobService.class), true, ug80.f35613a);
        wv00.f().a(m2h0.f21060a, "Created SystemJobScheduler and enabled SystemJobService");
        lc00VarB.add(x9o0Var);
        lc00VarB.add(new ufv(context, wsdVar, lds0Var, ezb0Var, new okt0(ezb0Var, fpv0Var), fpv0Var));
        return kotlin.collections.a.a(lc00VarB);
    }
}
