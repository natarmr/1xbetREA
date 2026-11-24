package a;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"La/ffv0;", "La/iw5;", "<init>", "()V", "", "imageUrl", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ffv0 extends iw5 {
    public static final /* synthetic */ int k2 = 0;

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(8135247);
        androidx.compose.runtime.d dVar = mr00.f22246a;
        fetVar.c0(dVar.a(this));
        fetVar.e0(-242229479);
        Fragment fragment = (Fragment) fetVar.k(dVar);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            objP = a4n0.f(fragment);
            fetVar.o0(objP);
        }
        i1w0 i1w0Var = (i1w0) objP;
        String name = szi.class.getName();
        Context applicationContext = ((Context) fetVar.k(dy2.b)).getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application == null) {
            throw new ss3((byte) 0);
        }
        riu0 riu0VarA = ms00.a(fetVar);
        if (riu0VarA == null) {
            throw new tiu0();
        }
        Object objP2 = fetVar.P();
        if (objP2 == obj) {
            objP2 = new rlb0(application, i1w0Var, (byte) 4);
            fetVar.o0(objP2);
        }
        Function0 function0 = (Function0) objP2;
        boolean zG = fetVar.g(riu0VarA) | fetVar.g(name);
        Object objP3 = fetVar.P();
        if (zG || objP3 == obj) {
            ojg ojgVar = new ojg((byte) 1);
            zfc zfcVar = new zfc(function0, (byte) 11);
            tre0 tre0Var = sre0.f32672a;
            ojgVar.a(tre0Var.b(kgd.class), zfcVar);
            qbx qbxVarB = ojgVar.b();
            piu0 piu0VarG = riu0VarA.g();
            vbf vbfVar = vbf.b;
            piu0VarG.getClass();
            vbfVar.getClass();
            objP3 = (kgd) new h0q0(piu0VarG, qbxVarB, vbfVar).t(tre0Var.b(kgd.class), name);
            fetVar.o0(objP3);
        }
        Object obj2 = ((kgd) objP3).b;
        if (obj2 == null) {
            hny.u("null cannot be cast to non-null type org.xplatform.wild_free_bet.impl.di.WildFreeBetComponent");
            return null;
        }
        szi sziVar = (szi) obj2;
        Object objP4 = fetVar.P();
        if (objP4 == obj) {
            objP4 = sziVar.a();
            fetVar.o0(objP4);
        }
        k3t0 k3t0VarY = n4c.Y(sre0.f32672a.b(kfv0.class), null, (fiu0) objP4, fetVar, 14);
        boolean zI = fetVar.i(k3t0VarY);
        Object objP5 = fetVar.P();
        if (zI || objP5 == obj) {
            objP5 = new s9r0(k3t0VarY, (byte) 10);
            fetVar.o0(objP5);
        }
        v3c.A((Function0) objP5, null, null, fetVar, 0, 6);
        Object objP6 = fetVar.P();
        if (objP6 == obj) {
            objP6 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
            fetVar.o0(objP6);
        }
        vne vneVar = (vne) objP6;
        boolean zI2 = fetVar.i(this) | fetVar.i(k3t0VarY);
        Object objP7 = fetVar.P();
        if (zI2 || objP7 == obj) {
            objP7 = new xis0((Object) this, (Object) k3t0VarY, (byte) 29);
            fetVar.o0(objP7);
        }
        Function1 function1 = (Function1) objP7;
        Unit unit = Unit.f46060a;
        boolean zI3 = fetVar.i(vneVar) | fetVar.i(k3t0VarY) | fetVar.g(function1) | fetVar.g(null);
        Object objP8 = fetVar.P();
        if (zI3 || objP8 == obj) {
            objP8 = new ggc0(vneVar, k3t0VarY, function1, (byte) 16);
            fetVar.o0(objP8);
        }
        m0x0.o(unit, (Function1) objP8, fetVar);
        i3t0 i3t0Var = (i3t0) k3t0VarY;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), (xdr) null, (ugd) null, u1c.M(2075408650, new wis0((ifv0) i3t0Var.y(fetVar).getValue(), i3t0Var, (byte) 5), fetVar), 14);
        ohs0.x(fetVar, false, false, false);
        fetVar.w = fetVar.x.b() != 0;
        fetVar.K = null;
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        L0().K = true;
        L0().N(3);
    }
}
