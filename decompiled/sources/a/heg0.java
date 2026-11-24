package a;

import android.os.Looper;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class heg0 extends iox {
    public final /* synthetic */ deg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public heg0(String[] strArr, deg0 deg0Var) {
        super(strArr);
        this.b = deg0Var;
    }

    @Override // a.iox
    public final void a(Set set) {
        set.getClass();
        fw3 fw3VarY = fw3.y();
        wss wssVar = new wss(this.b, (byte) 27);
        fw3VarY.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            wssVar.run();
        } else {
            fw3VarY.z(wssVar);
        }
    }
}
