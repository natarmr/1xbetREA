package a;

import android.content.ComponentCallbacks2;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.security.impl.navigation.SendConfirmationSMSScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class obi0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24981a;
    public final /* synthetic */ rbi0 b;

    public /* synthetic */ obi0(rbi0 rbi0Var, byte b) {
        this.f24981a = b;
        this.b = rbi0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f24981a;
        byte b2 = 1;
        yje yjeVar = null;
        rbi0 rbi0Var = this.b;
        switch (b) {
            case 0:
                gle0 gle0Var = rbi0.U1;
                rbi0 rbi0Var2 = this.b;
                wdk0 wdk0Var = rbi0Var2.O1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = rbi0Var2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), rbi0Var2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 1:
                gle0 gle0Var2 = rbi0.U1;
                ComponentCallbacks2 application = rbi0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(mbi0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof mbi0)) {
                        ze3Var = null;
                    }
                    mbi0 mbi0Var = (mbi0) ze3Var;
                    if (mbi0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(rbi0Var);
                        dci0 dci0Var = (dci0) rbi0Var.Q1.n(rbi0Var, rbi0.V1[1]);
                        i1w0VarF.getClass();
                        lp4 lp4Var = mbi0Var.f21511a;
                        pv00 pv00Var = mbi0Var.b;
                        lef0 lef0Var = mbi0Var.c;
                        x1u x1uVar = mbi0Var.d;
                        ctf0 ctf0Var = mbi0Var.e;
                        duj dujVar = mbi0Var.f;
                        mne mneVar = mbi0Var.g;
                        zg zgVar = mbi0Var.h;
                        cyh cyhVar = mbi0Var.i;
                        nr nrVar = mbi0Var.j;
                        s64 s64Var = mbi0Var.l;
                        z4w0 z4w0Var = mbi0Var.m;
                        rou rouVar = mbi0Var.n;
                        ii iiVar = mbi0Var.p;
                        gii0 gii0Var = mbi0Var.o;
                        btt0 btt0Var = mbi0Var.q;
                        at4 at4Var = mbi0Var.k;
                        pru pruVar = mbi0Var.r;
                        m1e m1eVar = mbi0Var.s;
                        wdk0 wdk0Var2 = mbi0Var.t;
                        mi70 mi70Var = mbi0Var.u;
                        qud qudVar = mbi0Var.v;
                        zn00 zn00Var = mbi0Var.w;
                        au0 au0Var = mbi0Var.x;
                        ag3 ag3Var = mbi0Var.y;
                        ik4 ik4Var = mbi0Var.z;
                        lp4Var.getClass();
                        iiVar.getClass();
                        ctf0Var.getClass();
                        at4Var.getClass();
                        gii0Var.getClass();
                        btt0Var.getClass();
                        m1eVar.getClass();
                        wdk0Var2.getClass();
                        return new mti(lef0Var, lp4Var, pv00Var, iiVar, x1uVar, i1w0VarF, dci0Var, ctf0Var, dujVar, mneVar, zgVar, cyhVar, nrVar, s64Var, rouVar, z4w0Var, pruVar, m1eVar, wdk0Var2, mi70Var, qudVar, zn00Var, au0Var, ag3Var, ik4Var);
                    }
                }
                jf4.n(b1j.i(mbi0.class, "Cannot create dependency "));
                return null;
            case 2:
                gle0 gle0Var3 = rbi0.U1;
                return (lti) ((mti) rbi0Var.R1.getValue()).y.get();
            case 3:
                gle0 gle0Var4 = rbi0.U1;
                rbi0Var.I0().x();
                return Unit.f46060a;
            case 4:
                gle0 gle0Var5 = rbi0.U1;
                ldi0 ldi0VarI0 = rbi0Var.I0();
                it2 it2VarZ = ldi0VarI0.z();
                ldi0VarI0.n.C(true, it2VarZ);
                ldi0VarI0.o.j(true, it2VarZ);
                bby bbyVar = ldi0VarI0.F;
                if ((bbyVar == null || !bbyVar.isActive()) && ((uci0) ldi0VarI0.H.getValue()).i) {
                    ldi0VarI0.F = ldi0VarI0.B(jiu0.a(ldi0VarI0), new nxh0(1, ldi0VarI0, ldi0.class, "localHandleError", "localHandleError(Ljava/lang/Throwable;)V", 0, (byte) 27), new yci0(ldi0VarI0, yjeVar, (byte) 2));
                }
                return Unit.f46060a;
            case 5:
                gle0 gle0Var6 = rbi0.U1;
                ldi0 ldi0VarI1 = rbi0Var.I0();
                it2 it2VarZ2 = ldi0VarI1.z();
                ldi0VarI1.n.C(false, it2VarZ2);
                ldi0VarI1.o.j(false, it2VarZ2);
                return Unit.f46060a;
            case 6:
                gle0 gle0Var7 = rbi0.U1;
                ldi0 ldi0VarI2 = rbi0Var.I0();
                i1w0 i1w0Var = ldi0VarI2.b;
                dci0 dci0Var2 = ldi0VarI2.c;
                if (dci0Var2 != null && ((dci0Var2 instanceof xbi0) || (dci0Var2 instanceof ybi0))) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new d1w0(new SendConfirmationSMSScreen(dci0Var2))), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                    ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorP2;
                        if (pawVar2.hasNext()) {
                            i1w0Var.a((oe50) pawVar2.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 7:
                gle0 gle0Var8 = rbi0.U1;
                ldi0 ldi0VarI3 = rbi0Var.I0();
                it2 it2VarZ3 = ldi0VarI3.z();
                ldi0VarI3.n.B(true, it2VarZ3);
                ldi0VarI3.o.i(true, it2VarZ3);
                bby bbyVar2 = ldi0VarI3.F;
                if ((bbyVar2 == null || !bbyVar2.isActive()) && ((uci0) ldi0VarI3.H.getValue()).i) {
                    ldi0VarI3.F = ldi0VarI3.B(jiu0.a(ldi0VarI3), new nxh0(1, ldi0VarI3, ldi0.class, "localHandleError", "localHandleError(Ljava/lang/Throwable;)V", 0, (byte) 26), new yci0(ldi0VarI3, yjeVar, b2));
                }
                return Unit.f46060a;
            case 8:
                gle0 gle0Var9 = rbi0.U1;
                ldi0 ldi0VarI4 = rbi0Var.I0();
                it2 it2VarZ4 = ldi0VarI4.z();
                ldi0VarI4.n.B(false, it2VarZ4);
                ldi0VarI4.o.i(false, it2VarZ4);
                return Unit.f46060a;
            case 9:
                gle0 gle0Var10 = rbi0.U1;
                rbi0Var.I0().D();
                return Unit.f46060a;
            case 10:
                gle0 gle0Var11 = rbi0.U1;
                rbi0Var.I0().x();
                return Unit.f46060a;
            case 11:
                gle0 gle0Var12 = rbi0.U1;
                ldi0 ldi0VarI5 = rbi0Var.I0();
                it2 it2VarZ5 = ldi0VarI5.z();
                ldi0VarI5.n.D(true, it2VarZ5);
                ldi0VarI5.o.k(true, it2VarZ5);
                bby bbyVar3 = ldi0VarI5.F;
                if ((bbyVar3 == null || !bbyVar3.isActive()) && ((uci0) ldi0VarI5.H.getValue()).i) {
                    ldi0VarI5.F = ldi0VarI5.B(jiu0.a(ldi0VarI5), new nxh0(1, ldi0VarI5, ldi0.class, "localHandleError", "localHandleError(Ljava/lang/Throwable;)V", 0, (byte) 29), new yci0(ldi0VarI5, yjeVar, (byte) 4));
                }
                return Unit.f46060a;
            case 12:
                gle0 gle0Var13 = rbi0.U1;
                ldi0 ldi0VarI6 = rbi0Var.I0();
                it2 it2VarZ6 = ldi0VarI6.z();
                ldi0VarI6.n.D(false, it2VarZ6);
                ldi0VarI6.o.k(false, it2VarZ6);
                return Unit.f46060a;
            case 13:
                gle0 gle0Var14 = rbi0.U1;
                rbi0Var.I0().D();
                return Unit.f46060a;
            default:
                gle0 gle0Var15 = rbi0.U1;
                rbi0Var.I0().D();
                return Unit.f46060a;
        }
    }
}
