package a;

import android.os.SystemClock;
import android.widget.CompoundButton;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ajj extends ivb0 implements CompoundButton.OnCheckedChangeListener {
    public final ymx d;
    public final boolean e;
    public final Function2 f;

    public ajj(ymx ymxVar, boolean z, Function2 function2) {
        ymxVar.getClass();
        this.d = ymxVar;
        this.e = z;
        this.f = function2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - (this.e ? ivb0.c : this.f15438a) > this.d.f42912a) {
            ivb0.c = jUptimeMillis;
            this.f15438a = jUptimeMillis;
            this.f.invoke(compoundButton, Boolean.valueOf(z));
        }
    }
}
