package a;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hkd implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13201a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hkd(Object obj, byte b) {
        this.f13201a = b;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        byte b = this.f13201a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((c4m0) obj).cancel(null);
                break;
            default:
                k7q0 k7q0Var = (k7q0) obj;
                if (k7q0Var != null) {
                    djz djzVar = k7q0Var.d;
                    if (djzVar != null) {
                        djzVar.e(o9q0.b);
                    }
                    djz djzVar2 = k7q0Var.d;
                    if (djzVar2 != null) {
                        djzVar2.f(o9q0.b);
                    }
                }
                break;
        }
    }
}
