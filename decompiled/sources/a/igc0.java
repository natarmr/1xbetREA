package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r²\u0006\u001e\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00058\nX\u008a\u0084\u0002²\u0006\u001e\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/igc0;", "La/yx5;", "<init>", "()V", "a/fl70", "La/k3t0;", "La/cpc0;", "La/xsc0;", "La/qsc0;", "viewModel", "La/wdc0;", "La/nec0;", "La/jec0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class igc0 extends yx5 {
    public final hnm0 K1;
    public final boolean L1;
    public final cgx0 M1;
    public ii N1;
    public wdk0 O1;
    public final a8z P1;
    public final a8z Q1;
    public final a8z R1;
    public final a8z S1;
    public final s0r U1;
    public static final /* synthetic */ iiy[] W1 = {new ez40(igc0.class, "openUserPromoCodes", "getOpenUserPromoCodes()Z", 0), new j0d0(igc0.class, "binding", "getBinding()Lorg/xplatform/promo/impl/databinding/FragmentPromoCodesComposeBinding;", 0)};
    public static final fl70 V1 = new fl70();

    public igc0() {
        super(R.layout.fragment_promo_codes_compose);
        this.K1 = hnm0.f13359a;
        final byte b = 1;
        this.L1 = true;
        this.M1 = new cgx0("OPEN_USER_PROMO_CODES_BUNDLE");
        final byte b2 = 0;
        Function0 function0 = new Function0(this) { // from class: a.bgc0
            public final /* synthetic */ igc0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                igc0 igc0Var = this.b;
                switch (b3) {
                    case 0:
                        vgc0 vgc0Var = igc0Var.M1.n(igc0Var, igc0.W1[0]).booleanValue() ? vgc0.PROMO_LIST : vgc0.PROMO_SHOP;
                        ComponentCallbacks2 application = igc0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(zfc0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof zfc0)) {
                                ze3Var = null;
                            }
                            zfc0 zfc0Var = (zfc0) ze3Var;
                            if (zfc0Var != null) {
                                cad cadVar = zfc0Var.f44296a;
                                wsf0 wsf0Var = zfc0Var.b;
                                uf3 uf3Var = zfc0Var.c;
                                b4j b4jVar = zfc0Var.d;
                                ii iiVar = zfc0Var.g;
                                wdk0 wdk0Var = zfc0Var.h;
                                pru pruVar = zfc0Var.e;
                                oeg0 oeg0Var = zfc0Var.f;
                                x20 x20Var = zfc0Var.i;
                                ctf0 ctf0Var = zfc0Var.j;
                                iiVar.getClass();
                                wdk0Var.getClass();
                                oeg0Var.getClass();
                                ctf0Var.getClass();
                                return new upi(cadVar, wsf0Var, uf3Var, b4jVar, pruVar, iiVar, wdk0Var, oeg0Var, vgc0Var, x20Var, ctf0Var);
                            }
                        }
                        jf4.n(b1j.i(zfc0.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        fl70 fl70Var = igc0.V1;
                        ComponentCallbacks2 application2 = igc0Var.n0().getApplication();
                        application2.getClass();
                        af3 af3Var2 = application2 instanceof af3 ? (af3) application2 : null;
                        if (af3Var2 != null) {
                            o5d0 o5d0Var2 = (o5d0) af3Var2.d().get(eqc0.class);
                            ze3 ze3Var2 = o5d0Var2 != null ? (ze3) o5d0Var2.get() : null;
                            if (!(ze3Var2 instanceof eqc0)) {
                                ze3Var2 = null;
                            }
                            eqc0 eqc0Var = (eqc0) ze3Var2;
                            if (eqc0Var != null) {
                                ntu ntuVar = eqc0Var.q;
                                gii0 gii0Var = eqc0Var.p;
                                knf0 knf0Var = eqc0Var.o;
                                btt0 btt0Var = eqc0Var.m;
                                gst0 gst0Var = eqc0Var.k;
                                xyt xytVar = eqc0Var.j;
                                ctf0 ctf0Var2 = eqc0Var.f8231a;
                                m1e m1eVar = eqc0Var.b;
                                ii iiVar2 = eqc0Var.n;
                                pru pruVar2 = eqc0Var.c;
                                wsf0 wsf0Var2 = eqc0Var.l;
                                b4j b4jVar2 = eqc0Var.d;
                                x20 x20Var2 = eqc0Var.e;
                                g2v g2vVar = eqc0Var.f;
                                oeg0 oeg0Var2 = eqc0Var.g;
                                duj dujVar = eqc0Var.h;
                                cad cadVar2 = eqc0Var.i;
                                wdk0 wdk0Var2 = eqc0Var.r;
                                rou rouVar = eqc0Var.s;
                                cdu cduVar = eqc0Var.t;
                                fhj fhjVar = eqc0Var.u;
                                iiVar2.getClass();
                                gii0Var.getClass();
                                knf0Var.getClass();
                                btt0Var.getClass();
                                gst0Var.getClass();
                                ctf0Var2.getClass();
                                m1eVar.getClass();
                                oeg0Var2.getClass();
                                wdk0Var2.getClass();
                                return new eqi(new std(), cadVar2, wsf0Var2, ntuVar, gii0Var, knf0Var, btt0Var, gst0Var, xytVar, ctf0Var2, m1eVar, pruVar2, b4jVar2, x20Var2, g2vVar, oeg0Var2, dujVar, rouVar, cduVar, fhjVar);
                            }
                        }
                        jf4.n(b1j.i(eqc0.class, "Cannot create dependency "));
                        return null;
                    case 2:
                        fl70 fl70Var2 = igc0.V1;
                        ComponentCallbacks2 application3 = igc0Var.n0().getApplication();
                        application3.getClass();
                        af3 af3Var3 = application3 instanceof af3 ? (af3) application3 : null;
                        if (af3Var3 != null) {
                            o5d0 o5d0Var3 = (o5d0) af3Var3.d().get(xdc0.class);
                            ze3 ze3Var3 = o5d0Var3 != null ? (ze3) o5d0Var3.get() : null;
                            if (!(ze3Var3 instanceof xdc0)) {
                                ze3Var3 = null;
                            }
                            xdc0 xdc0Var = (xdc0) ze3Var3;
                            if (xdc0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(igc0Var);
                                i1w0VarF.getClass();
                                ntu ntuVar2 = xdc0Var.p;
                                gii0 gii0Var2 = xdc0Var.o;
                                knf0 knf0Var2 = xdc0Var.n;
                                btt0 btt0Var2 = xdc0Var.l;
                                gst0 gst0Var2 = xdc0Var.k;
                                xyt xytVar2 = xdc0Var.j;
                                ii iiVar3 = xdc0Var.i;
                                m1e m1eVar2 = xdc0Var.f40687a;
                                ctf0 ctf0Var3 = xdc0Var.b;
                                wsf0 wsf0Var3 = xdc0Var.m;
                                pru pruVar3 = xdc0Var.c;
                                b4j b4jVar3 = xdc0Var.d;
                                x20 x20Var3 = xdc0Var.e;
                                g2v g2vVar2 = xdc0Var.f;
                                duj dujVar2 = xdc0Var.g;
                                cad cadVar3 = xdc0Var.h;
                                wdk0 wdk0Var3 = xdc0Var.q;
                                rou rouVar2 = xdc0Var.r;
                                cdu cduVar2 = xdc0Var.s;
                                fhj fhjVar2 = xdc0Var.t;
                                iiVar3.getClass();
                                gii0Var2.getClass();
                                knf0Var2.getClass();
                                btt0Var2.getClass();
                                gst0Var2.getClass();
                                m1eVar2.getClass();
                                ctf0Var3.getClass();
                                wdk0Var3.getClass();
                                return new spi(new std(), cadVar3, wsf0Var3, ntuVar2, gii0Var2, knf0Var2, btt0Var2, gst0Var2, xytVar2, i1w0VarF, m1eVar2, ctf0Var3, pruVar3, b4jVar3, x20Var3, g2vVar2, dujVar2, rouVar2, cduVar2, fhjVar2);
                            }
                        }
                        jf4.n(b1j.i(xdc0.class, "Cannot create dependency "));
                        return null;
                    default:
                        fl70 fl70Var3 = igc0.V1;
                        return new q0h0((tpi) ((upi) igc0Var.P1.getValue()).l.get());
                }
            }
        };
        wez wezVar = wez.b;
        this.P1 = maz.a(wezVar, function0);
        this.Q1 = maz.a(wezVar, new Function0(this) { // from class: a.bgc0
            public final /* synthetic */ igc0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                igc0 igc0Var = this.b;
                switch (b3) {
                    case 0:
                        vgc0 vgc0Var = igc0Var.M1.n(igc0Var, igc0.W1[0]).booleanValue() ? vgc0.PROMO_LIST : vgc0.PROMO_SHOP;
                        ComponentCallbacks2 application = igc0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(zfc0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof zfc0)) {
                                ze3Var = null;
                            }
                            zfc0 zfc0Var = (zfc0) ze3Var;
                            if (zfc0Var != null) {
                                cad cadVar = zfc0Var.f44296a;
                                wsf0 wsf0Var = zfc0Var.b;
                                uf3 uf3Var = zfc0Var.c;
                                b4j b4jVar = zfc0Var.d;
                                ii iiVar = zfc0Var.g;
                                wdk0 wdk0Var = zfc0Var.h;
                                pru pruVar = zfc0Var.e;
                                oeg0 oeg0Var = zfc0Var.f;
                                x20 x20Var = zfc0Var.i;
                                ctf0 ctf0Var = zfc0Var.j;
                                iiVar.getClass();
                                wdk0Var.getClass();
                                oeg0Var.getClass();
                                ctf0Var.getClass();
                                return new upi(cadVar, wsf0Var, uf3Var, b4jVar, pruVar, iiVar, wdk0Var, oeg0Var, vgc0Var, x20Var, ctf0Var);
                            }
                        }
                        jf4.n(b1j.i(zfc0.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        fl70 fl70Var = igc0.V1;
                        ComponentCallbacks2 application2 = igc0Var.n0().getApplication();
                        application2.getClass();
                        af3 af3Var2 = application2 instanceof af3 ? (af3) application2 : null;
                        if (af3Var2 != null) {
                            o5d0 o5d0Var2 = (o5d0) af3Var2.d().get(eqc0.class);
                            ze3 ze3Var2 = o5d0Var2 != null ? (ze3) o5d0Var2.get() : null;
                            if (!(ze3Var2 instanceof eqc0)) {
                                ze3Var2 = null;
                            }
                            eqc0 eqc0Var = (eqc0) ze3Var2;
                            if (eqc0Var != null) {
                                ntu ntuVar = eqc0Var.q;
                                gii0 gii0Var = eqc0Var.p;
                                knf0 knf0Var = eqc0Var.o;
                                btt0 btt0Var = eqc0Var.m;
                                gst0 gst0Var = eqc0Var.k;
                                xyt xytVar = eqc0Var.j;
                                ctf0 ctf0Var2 = eqc0Var.f8231a;
                                m1e m1eVar = eqc0Var.b;
                                ii iiVar2 = eqc0Var.n;
                                pru pruVar2 = eqc0Var.c;
                                wsf0 wsf0Var2 = eqc0Var.l;
                                b4j b4jVar2 = eqc0Var.d;
                                x20 x20Var2 = eqc0Var.e;
                                g2v g2vVar = eqc0Var.f;
                                oeg0 oeg0Var2 = eqc0Var.g;
                                duj dujVar = eqc0Var.h;
                                cad cadVar2 = eqc0Var.i;
                                wdk0 wdk0Var2 = eqc0Var.r;
                                rou rouVar = eqc0Var.s;
                                cdu cduVar = eqc0Var.t;
                                fhj fhjVar = eqc0Var.u;
                                iiVar2.getClass();
                                gii0Var.getClass();
                                knf0Var.getClass();
                                btt0Var.getClass();
                                gst0Var.getClass();
                                ctf0Var2.getClass();
                                m1eVar.getClass();
                                oeg0Var2.getClass();
                                wdk0Var2.getClass();
                                return new eqi(new std(), cadVar2, wsf0Var2, ntuVar, gii0Var, knf0Var, btt0Var, gst0Var, xytVar, ctf0Var2, m1eVar, pruVar2, b4jVar2, x20Var2, g2vVar, oeg0Var2, dujVar, rouVar, cduVar, fhjVar);
                            }
                        }
                        jf4.n(b1j.i(eqc0.class, "Cannot create dependency "));
                        return null;
                    case 2:
                        fl70 fl70Var2 = igc0.V1;
                        ComponentCallbacks2 application3 = igc0Var.n0().getApplication();
                        application3.getClass();
                        af3 af3Var3 = application3 instanceof af3 ? (af3) application3 : null;
                        if (af3Var3 != null) {
                            o5d0 o5d0Var3 = (o5d0) af3Var3.d().get(xdc0.class);
                            ze3 ze3Var3 = o5d0Var3 != null ? (ze3) o5d0Var3.get() : null;
                            if (!(ze3Var3 instanceof xdc0)) {
                                ze3Var3 = null;
                            }
                            xdc0 xdc0Var = (xdc0) ze3Var3;
                            if (xdc0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(igc0Var);
                                i1w0VarF.getClass();
                                ntu ntuVar2 = xdc0Var.p;
                                gii0 gii0Var2 = xdc0Var.o;
                                knf0 knf0Var2 = xdc0Var.n;
                                btt0 btt0Var2 = xdc0Var.l;
                                gst0 gst0Var2 = xdc0Var.k;
                                xyt xytVar2 = xdc0Var.j;
                                ii iiVar3 = xdc0Var.i;
                                m1e m1eVar2 = xdc0Var.f40687a;
                                ctf0 ctf0Var3 = xdc0Var.b;
                                wsf0 wsf0Var3 = xdc0Var.m;
                                pru pruVar3 = xdc0Var.c;
                                b4j b4jVar3 = xdc0Var.d;
                                x20 x20Var3 = xdc0Var.e;
                                g2v g2vVar2 = xdc0Var.f;
                                duj dujVar2 = xdc0Var.g;
                                cad cadVar3 = xdc0Var.h;
                                wdk0 wdk0Var3 = xdc0Var.q;
                                rou rouVar2 = xdc0Var.r;
                                cdu cduVar2 = xdc0Var.s;
                                fhj fhjVar2 = xdc0Var.t;
                                iiVar3.getClass();
                                gii0Var2.getClass();
                                knf0Var2.getClass();
                                btt0Var2.getClass();
                                gst0Var2.getClass();
                                m1eVar2.getClass();
                                ctf0Var3.getClass();
                                wdk0Var3.getClass();
                                return new spi(new std(), cadVar3, wsf0Var3, ntuVar2, gii0Var2, knf0Var2, btt0Var2, gst0Var2, xytVar2, i1w0VarF, m1eVar2, ctf0Var3, pruVar3, b4jVar3, x20Var3, g2vVar2, dujVar2, rouVar2, cduVar2, fhjVar2);
                            }
                        }
                        jf4.n(b1j.i(xdc0.class, "Cannot create dependency "));
                        return null;
                    default:
                        fl70 fl70Var3 = igc0.V1;
                        return new q0h0((tpi) ((upi) igc0Var.P1.getValue()).l.get());
                }
            }
        });
        final byte b3 = 2;
        this.R1 = maz.a(wezVar, new Function0(this) { // from class: a.bgc0
            public final /* synthetic */ igc0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                igc0 igc0Var = this.b;
                switch (b4) {
                    case 0:
                        vgc0 vgc0Var = igc0Var.M1.n(igc0Var, igc0.W1[0]).booleanValue() ? vgc0.PROMO_LIST : vgc0.PROMO_SHOP;
                        ComponentCallbacks2 application = igc0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(zfc0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof zfc0)) {
                                ze3Var = null;
                            }
                            zfc0 zfc0Var = (zfc0) ze3Var;
                            if (zfc0Var != null) {
                                cad cadVar = zfc0Var.f44296a;
                                wsf0 wsf0Var = zfc0Var.b;
                                uf3 uf3Var = zfc0Var.c;
                                b4j b4jVar = zfc0Var.d;
                                ii iiVar = zfc0Var.g;
                                wdk0 wdk0Var = zfc0Var.h;
                                pru pruVar = zfc0Var.e;
                                oeg0 oeg0Var = zfc0Var.f;
                                x20 x20Var = zfc0Var.i;
                                ctf0 ctf0Var = zfc0Var.j;
                                iiVar.getClass();
                                wdk0Var.getClass();
                                oeg0Var.getClass();
                                ctf0Var.getClass();
                                return new upi(cadVar, wsf0Var, uf3Var, b4jVar, pruVar, iiVar, wdk0Var, oeg0Var, vgc0Var, x20Var, ctf0Var);
                            }
                        }
                        jf4.n(b1j.i(zfc0.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        fl70 fl70Var = igc0.V1;
                        ComponentCallbacks2 application2 = igc0Var.n0().getApplication();
                        application2.getClass();
                        af3 af3Var2 = application2 instanceof af3 ? (af3) application2 : null;
                        if (af3Var2 != null) {
                            o5d0 o5d0Var2 = (o5d0) af3Var2.d().get(eqc0.class);
                            ze3 ze3Var2 = o5d0Var2 != null ? (ze3) o5d0Var2.get() : null;
                            if (!(ze3Var2 instanceof eqc0)) {
                                ze3Var2 = null;
                            }
                            eqc0 eqc0Var = (eqc0) ze3Var2;
                            if (eqc0Var != null) {
                                ntu ntuVar = eqc0Var.q;
                                gii0 gii0Var = eqc0Var.p;
                                knf0 knf0Var = eqc0Var.o;
                                btt0 btt0Var = eqc0Var.m;
                                gst0 gst0Var = eqc0Var.k;
                                xyt xytVar = eqc0Var.j;
                                ctf0 ctf0Var2 = eqc0Var.f8231a;
                                m1e m1eVar = eqc0Var.b;
                                ii iiVar2 = eqc0Var.n;
                                pru pruVar2 = eqc0Var.c;
                                wsf0 wsf0Var2 = eqc0Var.l;
                                b4j b4jVar2 = eqc0Var.d;
                                x20 x20Var2 = eqc0Var.e;
                                g2v g2vVar = eqc0Var.f;
                                oeg0 oeg0Var2 = eqc0Var.g;
                                duj dujVar = eqc0Var.h;
                                cad cadVar2 = eqc0Var.i;
                                wdk0 wdk0Var2 = eqc0Var.r;
                                rou rouVar = eqc0Var.s;
                                cdu cduVar = eqc0Var.t;
                                fhj fhjVar = eqc0Var.u;
                                iiVar2.getClass();
                                gii0Var.getClass();
                                knf0Var.getClass();
                                btt0Var.getClass();
                                gst0Var.getClass();
                                ctf0Var2.getClass();
                                m1eVar.getClass();
                                oeg0Var2.getClass();
                                wdk0Var2.getClass();
                                return new eqi(new std(), cadVar2, wsf0Var2, ntuVar, gii0Var, knf0Var, btt0Var, gst0Var, xytVar, ctf0Var2, m1eVar, pruVar2, b4jVar2, x20Var2, g2vVar, oeg0Var2, dujVar, rouVar, cduVar, fhjVar);
                            }
                        }
                        jf4.n(b1j.i(eqc0.class, "Cannot create dependency "));
                        return null;
                    case 2:
                        fl70 fl70Var2 = igc0.V1;
                        ComponentCallbacks2 application3 = igc0Var.n0().getApplication();
                        application3.getClass();
                        af3 af3Var3 = application3 instanceof af3 ? (af3) application3 : null;
                        if (af3Var3 != null) {
                            o5d0 o5d0Var3 = (o5d0) af3Var3.d().get(xdc0.class);
                            ze3 ze3Var3 = o5d0Var3 != null ? (ze3) o5d0Var3.get() : null;
                            if (!(ze3Var3 instanceof xdc0)) {
                                ze3Var3 = null;
                            }
                            xdc0 xdc0Var = (xdc0) ze3Var3;
                            if (xdc0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(igc0Var);
                                i1w0VarF.getClass();
                                ntu ntuVar2 = xdc0Var.p;
                                gii0 gii0Var2 = xdc0Var.o;
                                knf0 knf0Var2 = xdc0Var.n;
                                btt0 btt0Var2 = xdc0Var.l;
                                gst0 gst0Var2 = xdc0Var.k;
                                xyt xytVar2 = xdc0Var.j;
                                ii iiVar3 = xdc0Var.i;
                                m1e m1eVar2 = xdc0Var.f40687a;
                                ctf0 ctf0Var3 = xdc0Var.b;
                                wsf0 wsf0Var3 = xdc0Var.m;
                                pru pruVar3 = xdc0Var.c;
                                b4j b4jVar3 = xdc0Var.d;
                                x20 x20Var3 = xdc0Var.e;
                                g2v g2vVar2 = xdc0Var.f;
                                duj dujVar2 = xdc0Var.g;
                                cad cadVar3 = xdc0Var.h;
                                wdk0 wdk0Var3 = xdc0Var.q;
                                rou rouVar2 = xdc0Var.r;
                                cdu cduVar2 = xdc0Var.s;
                                fhj fhjVar2 = xdc0Var.t;
                                iiVar3.getClass();
                                gii0Var2.getClass();
                                knf0Var2.getClass();
                                btt0Var2.getClass();
                                gst0Var2.getClass();
                                m1eVar2.getClass();
                                ctf0Var3.getClass();
                                wdk0Var3.getClass();
                                return new spi(new std(), cadVar3, wsf0Var3, ntuVar2, gii0Var2, knf0Var2, btt0Var2, gst0Var2, xytVar2, i1w0VarF, m1eVar2, ctf0Var3, pruVar3, b4jVar3, x20Var3, g2vVar2, dujVar2, rouVar2, cduVar2, fhjVar2);
                            }
                        }
                        jf4.n(b1j.i(xdc0.class, "Cannot create dependency "));
                        return null;
                    default:
                        fl70 fl70Var3 = igc0.V1;
                        return new q0h0((tpi) ((upi) igc0Var.P1.getValue()).l.get());
                }
            }
        });
        final byte b4 = 3;
        this.S1 = xbc.a0(this, sre0.f32672a.b(ihc0.class), null, new Function0(this) { // from class: a.bgc0
            public final /* synthetic */ igc0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                igc0 igc0Var = this.b;
                switch (b5) {
                    case 0:
                        vgc0 vgc0Var = igc0Var.M1.n(igc0Var, igc0.W1[0]).booleanValue() ? vgc0.PROMO_LIST : vgc0.PROMO_SHOP;
                        ComponentCallbacks2 application = igc0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(zfc0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof zfc0)) {
                                ze3Var = null;
                            }
                            zfc0 zfc0Var = (zfc0) ze3Var;
                            if (zfc0Var != null) {
                                cad cadVar = zfc0Var.f44296a;
                                wsf0 wsf0Var = zfc0Var.b;
                                uf3 uf3Var = zfc0Var.c;
                                b4j b4jVar = zfc0Var.d;
                                ii iiVar = zfc0Var.g;
                                wdk0 wdk0Var = zfc0Var.h;
                                pru pruVar = zfc0Var.e;
                                oeg0 oeg0Var = zfc0Var.f;
                                x20 x20Var = zfc0Var.i;
                                ctf0 ctf0Var = zfc0Var.j;
                                iiVar.getClass();
                                wdk0Var.getClass();
                                oeg0Var.getClass();
                                ctf0Var.getClass();
                                return new upi(cadVar, wsf0Var, uf3Var, b4jVar, pruVar, iiVar, wdk0Var, oeg0Var, vgc0Var, x20Var, ctf0Var);
                            }
                        }
                        jf4.n(b1j.i(zfc0.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        fl70 fl70Var = igc0.V1;
                        ComponentCallbacks2 application2 = igc0Var.n0().getApplication();
                        application2.getClass();
                        af3 af3Var2 = application2 instanceof af3 ? (af3) application2 : null;
                        if (af3Var2 != null) {
                            o5d0 o5d0Var2 = (o5d0) af3Var2.d().get(eqc0.class);
                            ze3 ze3Var2 = o5d0Var2 != null ? (ze3) o5d0Var2.get() : null;
                            if (!(ze3Var2 instanceof eqc0)) {
                                ze3Var2 = null;
                            }
                            eqc0 eqc0Var = (eqc0) ze3Var2;
                            if (eqc0Var != null) {
                                ntu ntuVar = eqc0Var.q;
                                gii0 gii0Var = eqc0Var.p;
                                knf0 knf0Var = eqc0Var.o;
                                btt0 btt0Var = eqc0Var.m;
                                gst0 gst0Var = eqc0Var.k;
                                xyt xytVar = eqc0Var.j;
                                ctf0 ctf0Var2 = eqc0Var.f8231a;
                                m1e m1eVar = eqc0Var.b;
                                ii iiVar2 = eqc0Var.n;
                                pru pruVar2 = eqc0Var.c;
                                wsf0 wsf0Var2 = eqc0Var.l;
                                b4j b4jVar2 = eqc0Var.d;
                                x20 x20Var2 = eqc0Var.e;
                                g2v g2vVar = eqc0Var.f;
                                oeg0 oeg0Var2 = eqc0Var.g;
                                duj dujVar = eqc0Var.h;
                                cad cadVar2 = eqc0Var.i;
                                wdk0 wdk0Var2 = eqc0Var.r;
                                rou rouVar = eqc0Var.s;
                                cdu cduVar = eqc0Var.t;
                                fhj fhjVar = eqc0Var.u;
                                iiVar2.getClass();
                                gii0Var.getClass();
                                knf0Var.getClass();
                                btt0Var.getClass();
                                gst0Var.getClass();
                                ctf0Var2.getClass();
                                m1eVar.getClass();
                                oeg0Var2.getClass();
                                wdk0Var2.getClass();
                                return new eqi(new std(), cadVar2, wsf0Var2, ntuVar, gii0Var, knf0Var, btt0Var, gst0Var, xytVar, ctf0Var2, m1eVar, pruVar2, b4jVar2, x20Var2, g2vVar, oeg0Var2, dujVar, rouVar, cduVar, fhjVar);
                            }
                        }
                        jf4.n(b1j.i(eqc0.class, "Cannot create dependency "));
                        return null;
                    case 2:
                        fl70 fl70Var2 = igc0.V1;
                        ComponentCallbacks2 application3 = igc0Var.n0().getApplication();
                        application3.getClass();
                        af3 af3Var3 = application3 instanceof af3 ? (af3) application3 : null;
                        if (af3Var3 != null) {
                            o5d0 o5d0Var3 = (o5d0) af3Var3.d().get(xdc0.class);
                            ze3 ze3Var3 = o5d0Var3 != null ? (ze3) o5d0Var3.get() : null;
                            if (!(ze3Var3 instanceof xdc0)) {
                                ze3Var3 = null;
                            }
                            xdc0 xdc0Var = (xdc0) ze3Var3;
                            if (xdc0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(igc0Var);
                                i1w0VarF.getClass();
                                ntu ntuVar2 = xdc0Var.p;
                                gii0 gii0Var2 = xdc0Var.o;
                                knf0 knf0Var2 = xdc0Var.n;
                                btt0 btt0Var2 = xdc0Var.l;
                                gst0 gst0Var2 = xdc0Var.k;
                                xyt xytVar2 = xdc0Var.j;
                                ii iiVar3 = xdc0Var.i;
                                m1e m1eVar2 = xdc0Var.f40687a;
                                ctf0 ctf0Var3 = xdc0Var.b;
                                wsf0 wsf0Var3 = xdc0Var.m;
                                pru pruVar3 = xdc0Var.c;
                                b4j b4jVar3 = xdc0Var.d;
                                x20 x20Var3 = xdc0Var.e;
                                g2v g2vVar2 = xdc0Var.f;
                                duj dujVar2 = xdc0Var.g;
                                cad cadVar3 = xdc0Var.h;
                                wdk0 wdk0Var3 = xdc0Var.q;
                                rou rouVar2 = xdc0Var.r;
                                cdu cduVar2 = xdc0Var.s;
                                fhj fhjVar2 = xdc0Var.t;
                                iiVar3.getClass();
                                gii0Var2.getClass();
                                knf0Var2.getClass();
                                btt0Var2.getClass();
                                gst0Var2.getClass();
                                m1eVar2.getClass();
                                ctf0Var3.getClass();
                                wdk0Var3.getClass();
                                return new spi(new std(), cadVar3, wsf0Var3, ntuVar2, gii0Var2, knf0Var2, btt0Var2, gst0Var2, xytVar2, i1w0VarF, m1eVar2, ctf0Var3, pruVar3, b4jVar3, x20Var3, g2vVar2, dujVar2, rouVar2, cduVar2, fhjVar2);
                            }
                        }
                        jf4.n(b1j.i(xdc0.class, "Cannot create dependency "));
                        return null;
                    default:
                        fl70 fl70Var3 = igc0.V1;
                        return new q0h0((tpi) ((upi) igc0Var.P1.getValue()).l.get());
                }
            }
        }, 14);
        this.U1 = ltt0.o(this, hgc0.f13011a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.U1.n(W1[1], this);
        objN.getClass();
        pkd.i(((d3r) objN).b, null, new ugd(233531794, true, new cgc0(this, (byte) 2)));
    }

    @Override // a.yx5
    public final void C0() {
        upi upiVar = (upi) this.P1.getValue();
        this.N1 = upiVar.f36066a;
        this.O1 = upiVar.b;
    }

    public final void G0(int i, fet fetVar) {
        fetVar.g0(-248166102);
        int i2 = (fetVar.i(this) ? 4 : 2) | i;
        byte b = 1;
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new q0h0((rpi) ((spi) this.R1.getValue()).w.get());
                fetVar.o0(objP);
            }
            q0h0 q0h0Var = (q0h0) objP;
            sgy sgyVarB = sre0.f32672a.b(sec0.class);
            boolean zI = fetVar.i(q0h0Var);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                objP2 = new lop(q0h0Var, (byte) 1);
                fetVar.o0(objP2);
            }
            a8z a8zVarA0 = xbc.a0(this, sgyVarB, null, (Function0) objP2, 14);
            k3t0 k3t0Var = (k3t0) a8zVarA0.getValue();
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP3);
            }
            vne vneVar = (vne) objP3;
            boolean zI2 = fetVar.i(this) | fetVar.i(a8zVarA0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new dgc0(this, a8zVarA0, b2);
                fetVar.o0(objP4);
            }
            Function1 function1 = (Function1) objP4;
            Unit unit = Unit.f46060a;
            boolean zG = fetVar.g(null) | fetVar.i(vneVar) | fetVar.i(k3t0Var) | fetVar.g(function1);
            Object objP5 = fetVar.P();
            if (zG || objP5 == obj) {
                objP5 = new ggc0(vneVar, k3t0Var, function1, (byte) 0);
                fetVar.o0(objP5);
            }
            m0x0.o(unit, (Function1) objP5, fetVar);
            boolean zI3 = fetVar.i(a8zVarA0);
            Object objP6 = fetVar.P();
            if (zI3 || objP6 == obj) {
                objP6 = new nop(a8zVarA0, (byte) 5);
                fetVar.o0(objP6);
            }
            Function0 function0 = (Function0) objP6;
            boolean zI4 = fetVar.i(a8zVarA0);
            Object objP7 = fetVar.P();
            if (zI4 || objP7 == obj) {
                objP7 = new nop(a8zVarA0, (byte) 6);
                fetVar.o0(objP7);
            }
            v3c.z(function0, (Function0) objP7, null, fetVar, 0, 4);
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVarA0.getValue())).y(fetVar);
            Object obj2 = (k3t0) a8zVarA0.getValue();
            boolean zI5 = fetVar.i(obj2);
            Object objP8 = fetVar.P();
            if (zI5 || objP8 == obj) {
                Object l8c0Var = new l8c0(1, obj2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 16);
                fetVar.o0(l8c0Var);
                objP8 = l8c0Var;
            }
            phu0.w(pz40VarY, (Function1) ((jhy) objP8), fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgc0(this, i, b);
        }
    }

    public final void H0(int i, fet fetVar) {
        fetVar.g0(-1772502267);
        int i2 = (fetVar.i(this) ? 4 : 2) | i;
        byte b = 1;
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new q0h0((dqi) ((eqi) this.Q1.getValue()).w.get());
                fetVar.o0(objP);
            }
            q0h0 q0h0Var = (q0h0) objP;
            sgy sgyVarB = sre0.f32672a.b(dtc0.class);
            boolean zI = fetVar.i(q0h0Var);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                objP2 = new lop(q0h0Var, (byte) 1);
                fetVar.o0(objP2);
            }
            a8z a8zVarA0 = xbc.a0(this, sgyVarB, null, (Function0) objP2, 14);
            k3t0 k3t0Var = (k3t0) a8zVarA0.getValue();
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP3);
            }
            vne vneVar = (vne) objP3;
            boolean zI2 = fetVar.i(this) | fetVar.i(a8zVarA0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new dgc0(this, a8zVarA0, b);
                fetVar.o0(objP4);
            }
            Function1 function1 = (Function1) objP4;
            Unit unit = Unit.f46060a;
            boolean zG = fetVar.g(null) | fetVar.i(vneVar) | fetVar.i(k3t0Var) | fetVar.g(function1);
            Object objP5 = fetVar.P();
            if (zG || objP5 == obj) {
                objP5 = new ggc0(vneVar, k3t0Var, function1, (byte) 1);
                fetVar.o0(objP5);
            }
            m0x0.o(unit, (Function1) objP5, fetVar);
            boolean zI3 = fetVar.i(a8zVarA0);
            Object objP6 = fetVar.P();
            if (zI3 || objP6 == obj) {
                objP6 = new nop(a8zVarA0, (byte) 7);
                fetVar.o0(objP6);
            }
            Function0 function0 = (Function0) objP6;
            boolean zI4 = fetVar.i(a8zVarA0);
            Object objP7 = fetVar.P();
            if (zI4 || objP7 == obj) {
                objP7 = new nop(a8zVarA0, (byte) 4);
                fetVar.o0(objP7);
            }
            v3c.z(function0, (Function0) objP7, null, fetVar, 0, 4);
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVarA0.getValue())).y(fetVar);
            Object obj2 = (k3t0) a8zVarA0.getValue();
            boolean zI5 = fetVar.i(obj2);
            Object objP8 = fetVar.P();
            if (zI5 || objP8 == obj) {
                Object l8c0Var = new l8c0(1, obj2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 17);
                fetVar.o0(l8c0Var);
                objP8 = l8c0Var;
            }
            hmw0.P(pz40VarY, (Function1) ((jhy) objP8), fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgc0(this, i, b2);
        }
    }

    public final void I0() {
        wdk0 wdk0Var = this.O1;
        if (wdk0Var == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        pek0 pek0Var = pek0.f26859a;
        String strH = H(R.string.no_connection_title_with_hyphen);
        strH.getClass();
        String strH2 = H(R.string.no_connection_description);
        strH2.getClass();
        wdk0.k(wdk0Var, new xdk0(pek0Var, strH, strH2, null, null, null, 120), this, null, null, false, null, 1020);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.L1;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
