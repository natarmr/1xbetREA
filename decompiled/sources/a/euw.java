package a;

import android.app.PendingIntent;
import android.net.sip.SipManager;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class euw implements n5d0 {
    public static PendingIntent A(us00 us00Var) {
        PendingIntent broadcast = PendingIntent.getBroadcast(us00Var, 0, hne.j("android.SipDemo.INCOMING_CALL"), rsr0.e0(2));
        broadcast.getClass();
        return broadcast;
    }

    public static vdd0 B() {
        return new vdd0();
    }

    public static m4i0 C() {
        return new m4i0();
    }

    public static nnt0 D(v6j0 v6j0Var) {
        v6j0Var.getClass();
        return new nnt0(v6j0Var);
    }

    public static ol a() {
        return new ol();
    }

    public static h0f b() {
        return new h0f();
    }

    public static zb30 c() {
        return new zb30();
    }

    public static njo d() {
        njo njoVar = new njo();
        njoVar.f23646a = "";
        njoVar.b = iun.f15405a;
        return njoVar;
    }

    public static SipManager e(us00 us00Var) {
        SipManager sipManagerNewInstance = SipManager.newInstance(us00Var);
        sipManagerNewInstance.getClass();
        return sipManagerNewInstance;
    }

    public static cuw f() {
        cuw cuwVar = new cuw();
        cuwVar.f5005a = duw.d;
        return cuwVar;
    }

    public static tuy g(vwb0 vwb0Var, vby vbyVar) {
        vwb0Var.getClass();
        vbyVar.getClass();
        return new tuy(vwb0Var, vbyVar);
    }

    public static o2z h(cs00 cs00Var) {
        cs00Var.getClass();
        return cs00Var.f();
    }

    public static yiz i(gu70 gu70Var) {
        gu70Var.getClass();
        return new yiz(gu70Var);
    }

    public static kwz j() {
        return new kwz();
    }

    public static twz k(htz htzVar, lwz lwzVar, kwz kwzVar, njo njoVar, btt0 btt0Var, ctf0 ctf0Var) {
        lwzVar.getClass();
        kwzVar.getClass();
        njoVar.getClass();
        btt0Var.getClass();
        ctf0Var.getClass();
        return new twz(lwzVar, btt0Var, kwzVar, njoVar, ctf0Var);
    }

    public static p200 l(dvz dvzVar, b200 b200Var, btt0 btt0Var, knf0 knf0Var, ctf0 ctf0Var) {
        b200Var.getClass();
        btt0Var.getClass();
        knf0Var.getClass();
        ctf0Var.getClass();
        return new p200(b200Var, btt0Var, knf0Var, ctf0Var);
    }

    public static q200 m(jyz jyzVar, c200 c200Var, btt0 btt0Var, knf0 knf0Var, us00 us00Var) {
        c200Var.getClass();
        btt0Var.getClass();
        knf0Var.getClass();
        return new q200(c200Var, btt0Var, knf0Var, us00Var);
    }

    public static r200 n(w000 w000Var, d200 d200Var, ieu ieuVar, btt0 btt0Var, knf0 knf0Var, us00 us00Var) {
        d200Var.getClass();
        btt0Var.getClass();
        knf0Var.getClass();
        return new r200(d200Var, ieuVar, btt0Var, knf0Var, us00Var);
    }

    public static s200 o(gtz gtzVar, a200 a200Var, knf0 knf0Var, btt0 btt0Var, us00 us00Var) {
        a200Var.getClass();
        knf0Var.getClass();
        btt0Var.getClass();
        return new s200(a200Var, knf0Var, btt0Var, us00Var);
    }

    public static e400 p() {
        e400 e400Var = new e400();
        iun iunVar = iun.f15405a;
        e400Var.f7160a = new fzz(iunVar, iunVar);
        e400Var.b = new d9i0(0L, "");
        return e400Var;
    }

    public static j400 q(wsz wszVar, f400 f400Var, btt0 btt0Var, e400 e400Var, mne mneVar, kuy kuyVar) {
        f400Var.getClass();
        btt0Var.getClass();
        e400Var.getClass();
        kuyVar.getClass();
        return new j400(f400Var, btt0Var, e400Var, mneVar, kuyVar);
    }

    public static nx20 r(mne mneVar) {
        return new nx20(mneVar);
    }

    public static v230 s(q7d0 q7d0Var) {
        q7d0Var.getClass();
        return new v230(q7d0Var);
    }

    public static jd30 t() {
        return new jd30();
    }

    public static h840 u() {
        return new h840();
    }

    public static ft70 v() {
        return new ft70();
    }

    public static vq70 w(o5d0 o5d0Var, o5d0 o5d0Var2, r9u r9uVar) {
        o5d0Var.getClass();
        o5d0Var2.getClass();
        r9uVar.getClass();
        return new vq70(new got0(o5d0Var, (byte) 2), o5d0Var2, r9uVar);
    }

    public static yq70 x(k6k0 k6k0Var) {
        k6k0Var.getClass();
        return new yq70(k6k0Var);
    }

    public static js70 y() {
        return new js70();
    }

    public static String z(ctf0 ctf0Var) {
        ctf0Var.getClass();
        return ctf0Var.f(R.string.afv_ast_eq, new Object[0]);
    }
}
