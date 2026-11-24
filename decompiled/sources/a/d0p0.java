package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.favorites.impl.presentation.teambet.presentation.models.TeamBetScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d0p0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5278a;
    public final /* synthetic */ i0p0 b;

    public /* synthetic */ d0p0(i0p0 i0p0Var, byte b) {
        this.f5278a = b;
        this.b = i0p0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5278a;
        i0p0 i0p0Var = this.b;
        switch (b) {
            case 0:
                j6m0 j6m0Var = i0p0.Z1;
                ((k3t0) i0p0Var.W1.getValue()).x(eyo0.f8636a);
                return Unit.f46060a;
            case 1:
                j6m0 j6m0Var2 = i0p0.Z1;
                ComponentCallbacks2 application = i0p0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(j0p0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof j0p0)) {
                        ze3Var = null;
                    }
                    j0p0 j0p0Var = (j0p0) ze3Var;
                    if (j0p0Var != null) {
                        TeamBetScreenParams teamBetScreenParams = (TeamBetScreenParams) i0p0Var.M1.n(i0p0Var, i0p0.a2[0]);
                        i1w0 i1w0VarF = a4n0.f(i0p0Var);
                        i1w0VarF.getClass();
                        sue sueVar = j0p0Var.c;
                        bwl bwlVar = j0p0Var.f15693a;
                        a1d a1dVar = j0p0Var.b;
                        itr itrVar = j0p0Var.d;
                        lsn lsnVar = j0p0Var.e;
                        vqc vqcVar = j0p0Var.f;
                        xri xriVar = j0p0Var.g;
                        roi0 roi0Var = j0p0Var.h;
                        ugf0 ugf0Var = j0p0Var.i;
                        iip iipVar = j0p0Var.j;
                        y78 y78Var = j0p0Var.k;
                        gii0 gii0Var = j0p0Var.l;
                        viu viuVar = j0p0Var.u;
                        knf0 knf0Var = j0p0Var.m;
                        x2c0 x2c0Var = j0p0Var.n;
                        gst0 gst0Var = j0p0Var.o;
                        rtu rtuVar = j0p0Var.p;
                        ieu ieuVar = j0p0Var.q;
                        pru pruVar = j0p0Var.r;
                        lbu lbuVar = j0p0Var.s;
                        r9u r9uVar = j0p0Var.t;
                        lk5 lk5Var = j0p0Var.v;
                        g2v g2vVar = j0p0Var.w;
                        mne mneVar = j0p0Var.x;
                        m1e m1eVar = j0p0Var.y;
                        ctf0 ctf0Var = j0p0Var.z;
                        duj dujVar = j0p0Var.A;
                        wdk0 wdk0Var = j0p0Var.B;
                        ii iiVar = j0p0Var.C;
                        sueVar.getClass();
                        itrVar.getClass();
                        xriVar.getClass();
                        iipVar.getClass();
                        gii0Var.getClass();
                        knf0Var.getClass();
                        x2c0Var.getClass();
                        gst0Var.getClass();
                        r9uVar.getClass();
                        m1eVar.getClass();
                        ctf0Var.getClass();
                        wdk0Var.getClass();
                        iiVar.getClass();
                        return new gwi(roi0Var, sueVar, bwlVar, a1dVar, itrVar, lsnVar, vqcVar, ugf0Var, iipVar, teamBetScreenParams, i1w0VarF, y78Var, viuVar, gii0Var, knf0Var, x2c0Var, gst0Var, rtuVar, ieuVar, pruVar, lbuVar, r9uVar, lk5Var, g2vVar, mneVar, m1eVar, ctf0Var, dujVar, wdk0Var, iiVar);
                    }
                }
                jf4.n(b1j.i(j0p0.class, "Cannot create dependency "));
                return null;
            case 2:
                dwi dwiVar = i0p0Var.P1;
                if (dwiVar != null) {
                    return new q0h0(dwiVar);
                }
                Intrinsics.h("containerViewModelFactory");
                throw null;
            case 3:
                ewi ewiVar = i0p0Var.Q1;
                if (ewiVar != null) {
                    return new q0h0(ewiVar);
                }
                Intrinsics.h("eventsViewModelFactory");
                throw null;
            case 4:
                fwi fwiVar = i0p0Var.R1;
                if (fwiVar != null) {
                    return new q0h0(fwiVar);
                }
                Intrinsics.h("statisticsViewModelFactory");
                throw null;
            default:
                j6m0 j6m0Var3 = i0p0.Z1;
                i0p0Var.I0().x(bzo0.f3480a);
                return Unit.f46060a;
        }
    }
}
