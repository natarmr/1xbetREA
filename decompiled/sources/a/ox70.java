package a;

import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ox70;", "La/iw5;", "<init>", "()V", "a/mi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ox70 extends iw5 {
    public final a8z k2 = maz.a(wez.b, new nx70(this, 0));
    public final a8z l2 = xbc.a0(this, sre0.f32672a.b(cy70.class), null, new nx70(this, 1), 14);
    public final yzn0 m2 = new yzn0("TELEGRAM_BOT_NAVIGATION_SOURCE_KEY");
    public static final /* synthetic */ iiy[] o2 = {new ez40(ox70.class, "navigationSource", "getNavigationSource()Lorg/xplatform/mailing/api/navigation/models/TelegramBotNavigationSource;", 0)};
    public static final mi70 n2 = new mi70();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        clz clzVar;
        fetVar.e0(-13141250);
        pz40 pz40VarY = ((i3t0) P0()).y(fetVar);
        k3t0 k3t0VarP0 = P0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            objP = new cd60((Object) this, (byte) 22);
            fetVar.o0(objP);
        }
        clz clzVar2 = (clz) fetVar.k(or00.f25714a);
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
        boolean zI2 = fetVar.i(k3t0VarP0) | fetVar.i(clzVar2) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            clzVar = clzVar2;
            Object kc70Var = new kc70(k3t0VarP0, clzVar, pz40VarF, null, (byte) 1);
            fetVar.o0(kc70Var);
            objP2 = kc70Var;
        } else {
            clzVar = clzVar2;
        }
        m0x0.t(fetVar, clzVar, (Function2) objP2);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(175672239, new tft(pz40VarY, (byte) 6), fetVar), u1c.M(1673858279, new ngz(pz40VarY, this, (byte) 28), fetVar), u1c.M(-1819630483, new tft(pz40VarY, (byte) 7), fetVar), 2);
        fetVar.r(false);
        return bw5Var;
    }

    public final k3t0 P0() {
        return (k3t0) this.l2.getValue();
    }

    @Override // a.sik, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        P0().x(px70.f27740a);
    }
}
