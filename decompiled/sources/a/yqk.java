package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.discipline.presentation.model.DisciplineDetailsParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yqk implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43079a;
    public final /* synthetic */ crk b;

    public /* synthetic */ yqk(crk crkVar, byte b) {
        this.f43079a = b;
        this.b = crkVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f43079a;
        crk crkVar = this.b;
        switch (b) {
            case 0:
                xak xakVar = crk.W1;
                crkVar.G0().x(pok.f27333a);
                return Unit.f46060a;
            case 1:
                pru pruVar = crkVar.M1;
                if (pruVar != null) {
                    return pruVar.a().c.q;
                }
                Intrinsics.h("getRemoteConfigUseCase");
                throw null;
            case 2:
                xak xakVar2 = crk.W1;
                ComponentCallbacks2 application = crkVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(qyg.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof qyg)) {
                        ze3Var = null;
                    }
                    qyg qygVar = (qyg) ze3Var;
                    if (qygVar != null) {
                        DisciplineDetailsParams disciplineDetailsParams = (DisciplineDetailsParams) crkVar.P1.n(crkVar, crk.X1[0]);
                        duj dujVar = qygVar.f29532a;
                        cad cadVar = qygVar.d;
                        gii0 gii0Var = qygVar.e;
                        oeg0 oeg0Var = qygVar.c;
                        kt2 kt2Var = qygVar.f;
                        m1e m1eVar = qygVar.g;
                        g2v g2vVar = qygVar.h;
                        pyg pygVar = qygVar.i;
                        xri xriVar = qygVar.j;
                        iip iipVar = qygVar.n;
                        lsn lsnVar = qygVar.o;
                        n660 n660Var = qygVar.k;
                        itr itrVar = qygVar.l;
                        y78 y78Var = qygVar.m;
                        vqc vqcVar = qygVar.p;
                        lbu lbuVar = qygVar.q;
                        ctf0 ctf0Var = qygVar.r;
                        pru pruVar2 = qygVar.s;
                        ugf0 ugf0Var = qygVar.b;
                        sjl0 sjl0Var = qygVar.t;
                        wdk0 wdk0Var = qygVar.u;
                        rtu rtuVar = qygVar.v;
                        pmi pmiVar = qygVar.w;
                        r9u r9uVar = qygVar.x;
                        zr1 zr1Var = qygVar.y;
                        bwl bwlVar = qygVar.z;
                        gst0 gst0Var = qygVar.C;
                        ocl oclVar = qygVar.A;
                        ivn ivnVar = qygVar.B;
                        ul9 ul9Var = qygVar.D;
                        gii0Var.getClass();
                        oeg0Var.getClass();
                        kt2Var.getClass();
                        m1eVar.getClass();
                        ctf0Var.getClass();
                        sjl0Var.getClass();
                        wdk0Var.getClass();
                        r9uVar.getClass();
                        gst0Var.getClass();
                        ul9Var.getClass();
                        pygVar.getClass();
                        xriVar.getClass();
                        itrVar.getClass();
                        iipVar.getClass();
                        return new rei(cadVar, ugf0Var, pygVar, xriVar, itrVar, iipVar, lsnVar, vqcVar, bwlVar, gii0Var, dujVar, oeg0Var, disciplineDetailsParams, kt2Var, m1eVar, g2vVar, n660Var, y78Var, lbuVar, ctf0Var, pruVar2, sjl0Var, wdk0Var, rtuVar, pmiVar, r9uVar, zr1Var, oclVar, ivnVar, gst0Var, ul9Var);
                    }
                }
                jf4.n(b1j.i(qyg.class, "Cannot create dependency "));
                return null;
            case 3:
                qei qeiVar = crkVar.K1;
                if (qeiVar != null) {
                    return new q0h0(qeiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 4:
                xak xakVar3 = crk.W1;
                crkVar.G0().x(nok.f23870a);
                return Unit.f46060a;
            default:
                xak xakVar4 = crk.W1;
                crkVar.G0().x(mok.f22138a);
                return Unit.f46060a;
        }
    }
}
