package a;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class cjj extends ivb0 implements View.OnClickListener {
    public final ymx d;
    public final boolean e;
    public final Function1 f;

    public cjj(ymx ymxVar, boolean z, Function1 function1) {
        ymxVar.getClass();
        this.d = ymxVar;
        this.e = z;
        this.f = function1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - (this.e ? ivb0.c : this.f15438a) > this.d.f42912a) {
            ivb0.c = jUptimeMillis;
            this.f15438a = jUptimeMillis;
            this.f.invoke(view);
        }
    }
}
