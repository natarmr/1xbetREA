package a;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class lds0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19867a;
    public final b4e b;
    public final va6 c;
    public final rl50 d;
    public final b4e e;

    public lds0(Context context, fpv0 fpv0Var) {
        rl50 rl50Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        va6 va6Var = new va6(applicationContext, fpv0Var, (byte) 0);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        va6 va6Var2 = new va6(applicationContext2, fpv0Var, (byte) 1);
        if (Build.VERSION.SDK_INT < 28) {
            Context applicationContext3 = context.getApplicationContext();
            applicationContext3.getClass();
            String str = ql50.f28917a;
            rl50Var = new rl50(applicationContext3, fpv0Var);
        } else {
            rl50Var = null;
        }
        Context applicationContext4 = context.getApplicationContext();
        applicationContext4.getClass();
        va6 va6Var3 = new va6(applicationContext4, fpv0Var, (byte) 2);
        context.getClass();
        this.f19867a = context;
        this.b = va6Var;
        this.c = va6Var2;
        this.d = rl50Var;
        this.e = va6Var3;
    }
}
