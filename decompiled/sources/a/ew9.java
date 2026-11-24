package a;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ew9 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8510a;
    public final /* synthetic */ iw9 b;

    public /* synthetic */ ew9(iw9 iw9Var, byte b) {
        this.f8510a = b;
        this.b = iw9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        byte b = this.f8510a;
        iw9 iw9Var = this.b;
        switch (b) {
            case 0:
                synchronized (iw9Var.q) {
                    iw9Var.s = ty9.k0;
                    Log.d("CXCP", iw9Var + " is closed");
                }
                wv9 wv9Var = iw9Var.o;
                Log.d("CXCP", iw9Var + " finalized");
                synchronized (wv9Var.f) {
                    wv9Var.g.remove(iw9Var);
                }
                odd oddVar = iw9Var.x;
                Unit unit = Unit.f46060a;
                oddVar.N(unit);
                d5c.G(iw9Var.f15478a, null);
                return unit;
            default:
                ((Unit) obj).getClass();
                synchronized (iw9Var.q) {
                    z = iw9Var.r;
                }
                return Boolean.valueOf(z);
        }
    }
}
