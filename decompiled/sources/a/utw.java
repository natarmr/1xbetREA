package a;

import okhttp3.Call;

/* JADX INFO: loaded from: classes7.dex */
public final class utw extends wtw {
    public final vo9 d;
    public final boolean e;

    public utw(pmf0 pmf0Var, Call.Factory factory, vke vkeVar, vo9 vo9Var, boolean z) {
        super(pmf0Var, factory, vkeVar);
        this.d = vo9Var;
        this.e = z;
    }

    @Override // a.wtw
    public final Object b(jf60 jf60Var, Object[] objArr) {
        to9 to9Var = (to9) this.d.f(jf60Var);
        yje yjeVar = (yje) objArr[objArr.length - 1];
        try {
            try {
                if (!this.e) {
                    return k9x.x(to9Var, yjeVar);
                }
                try {
                    to9Var.getClass();
                    return k9x.y(to9Var, yjeVar);
                } catch (LinkageError e) {
                    throw e;
                } catch (ThreadDeath e2) {
                    throw e2;
                }
            } catch (LinkageError | ThreadDeath | VirtualMachineError e3) {
                throw e3;
            }
        } catch (Throwable th) {
            k9x.Q(th, yjeVar);
            return wne.f39444a;
        }
    }
}
