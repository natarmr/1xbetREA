package a;

import android.app.Activity;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class qog0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f29072a;
    public final Activity b;
    public final String[] c;
    public final s2g0 d;
    public Function0 e;

    public qog0(Activity activity, String[] strArr, s2g0 s2g0Var) {
        strArr.getClass();
        this.f29072a = new LinkedHashSet();
        this.b = activity;
        this.c = strArr;
        this.d = s2g0Var;
        s2g0Var.I1.put(tx3.l0(strArr), this);
    }

    public final void a() {
        s2g0 s2g0Var = this.d;
        s2g0Var.getClass();
        String[] strArr = this.c;
        strArr.getClass();
        if (s2g0Var.N()) {
            s2g0Var.x0(strArr);
        } else {
            s2g0Var.J1 = new gvb0(s2g0Var, strArr, (byte) 26);
        }
    }
}
