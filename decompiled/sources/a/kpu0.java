package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.virtualgamescategories.VirtualGameCategoryParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kpu0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18693a;
    public final /* synthetic */ opu0 b;

    public /* synthetic */ kpu0(opu0 opu0Var, byte b) {
        this.f18693a = b;
        this.b = opu0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f18693a;
        opu0 opu0Var = this.b;
        switch (b) {
            case 0:
                uxs0 uxs0Var = opu0.W1;
                opu0Var.G0().x(tou0.f34301a);
                return Unit.f46060a;
            case 1:
                uxs0 uxs0Var2 = opu0.W1;
                ComponentCallbacks2 application = opu0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(ppu0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof ppu0)) {
                        ze3Var = null;
                    }
                    ppu0 ppu0Var = (ppu0) ze3Var;
                    if (ppu0Var != null) {
                        VirtualGameCategoryParams virtualGameCategoryParams = (VirtualGameCategoryParams) opu0Var.P1.n(opu0Var, opu0.X1[0]);
                        duj dujVar = ppu0Var.f27388a;
                        g2v g2vVar = ppu0Var.b;
                        cad cadVar = ppu0Var.c;
                        m1e m1eVar = ppu0Var.d;
                        gii0 gii0Var = ppu0Var.e;
                        oeg0 oeg0Var = ppu0Var.f;
                        pyg pygVar = ppu0Var.g;
                        ctf0 ctf0Var = ppu0Var.h;
                        gst0 gst0Var = ppu0Var.A;
                        itr itrVar = ppu0Var.i;
                        wdk0 wdk0Var = ppu0Var.j;
                        y78 y78Var = ppu0Var.k;
                        xri xriVar = ppu0Var.l;
                        sjl0 sjl0Var = ppu0Var.m;
                        knf0 knf0Var = ppu0Var.n;
                        lbu lbuVar = ppu0Var.o;
                        ugf0 ugf0Var = ppu0Var.p;
                        lsn lsnVar = ppu0Var.q;
                        iip iipVar = ppu0Var.r;
                        rtu rtuVar = ppu0Var.s;
                        ieu ieuVar = ppu0Var.t;
                        j1q0 j1q0Var = ppu0Var.u;
                        vqc vqcVar = ppu0Var.v;
                        pru pruVar = ppu0Var.w;
                        r9u r9uVar = ppu0Var.x;
                        zr1 zr1Var = ppu0Var.z;
                        ih5 ih5Var = ppu0Var.y;
                        pygVar.getClass();
                        itrVar.getClass();
                        xriVar.getClass();
                        iipVar.getClass();
                        m1eVar.getClass();
                        gii0Var.getClass();
                        oeg0Var.getClass();
                        ctf0Var.getClass();
                        wdk0Var.getClass();
                        sjl0Var.getClass();
                        knf0Var.getClass();
                        j1q0Var.getClass();
                        r9uVar.getClass();
                        gst0Var.getClass();
                        return new ezi(cadVar, pygVar, itrVar, xriVar, lsnVar, ugf0Var, iipVar, vqcVar, dujVar, g2vVar, m1eVar, gii0Var, oeg0Var, ctf0Var, wdk0Var, y78Var, virtualGameCategoryParams, sjl0Var, knf0Var, lbuVar, rtuVar, ieuVar, pruVar, r9uVar, gst0Var, ih5Var, zr1Var);
                    }
                }
                jf4.n(b1j.i(ppu0.class, "Cannot create dependency "));
                return null;
            default:
                dzi dziVar = opu0Var.L1;
                if (dziVar != null) {
                    return new q0h0(dziVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
