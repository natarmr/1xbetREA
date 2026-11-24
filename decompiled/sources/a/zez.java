package a;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class zez extends wsy {
    public final eu00 b;
    public final Function0 c;
    public final cu00 d;

    public zez(eu00 eu00Var, Function0 function0) {
        eu00Var.getClass();
        this.b = eu00Var;
        this.c = function0;
        this.d = new cu00(eu00Var, function0);
    }

    @Override // a.wsy
    public final List J() {
        return k0().J();
    }

    @Override // a.wsy
    public final ays0 K() {
        return k0().K();
    }

    @Override // a.wsy
    public final iys0 S() {
        return k0().S();
    }

    @Override // a.wsy
    public final boolean U() {
        return k0().U();
    }

    @Override // a.wsy
    public final wsy f0(cty ctyVar) {
        return new zez(this.b, new aaw(ctyVar, this, (byte) 27));
    }

    @Override // a.wsy
    public final tft0 j0() {
        wsy wsyVarK0 = k0();
        while (wsyVarK0 instanceof zez) {
            wsyVarK0 = ((zez) wsyVarK0).k0();
        }
        wsyVarK0.getClass();
        return (tft0) wsyVarK0;
    }

    public final wsy k0() {
        return (wsy) this.d.invoke();
    }

    public final String toString() {
        cu00 cu00Var = this.d;
        return (cu00Var.c == du00.f6678a || cu00Var.c == du00.b) ? "<Not computed yet>" : k0().toString();
    }

    @Override // a.wsy
    public final cr30 y() {
        return k0().y();
    }
}
