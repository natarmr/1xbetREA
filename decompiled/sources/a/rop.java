package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedGameItemsScreenParams;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsScreenParams;
import org.xplatform.feed.linelive.presentation.feeds.child.liveexpress.models.LiveExpressItemsScreenParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0013²\u0006\u001e\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00058\nX\u008a\u0084\u0002²\u0006\u001e\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00058\nX\u008a\u0084\u0002²\u0006\u001e\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00058\nX\u008a\u0084\u0002²\u0006\u001e\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/rop;", "La/yx5;", "<init>", "()V", "a/nek", "La/k3t0;", "La/ki00;", "La/oj00;", "La/pj00;", "viewModel", "La/ohs;", "La/dis;", "La/eis;", "La/dgl0;", "La/ogl0;", "", "La/smp;", "La/ymp;", "La/wmp;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rop extends yx5 {
    public final boolean K1;
    public final boolean L1;
    public final s0r M1;
    public final bj5 N1;
    public final yzn0 O1;
    public final phf0 P1;
    public final cu Q1;
    public final a8z R1;
    public final a8z S1;
    public final LinkedHashMap U1;
    public final LinkedHashMap V1;
    public final LinkedHashMap W1;
    public final LinkedHashMap X1;
    public final a8z Y1;
    public final pz40 Z1;
    public static final /* synthetic */ iiy[] b2 = {new j0d0(rop.class, "binding", "getBinding()Lorg/xplatform/feed/impl/databinding/FeedComposeFragmentBinding;", 0), new ez40(rop.class, "screenType", "getScreenType()Lorg/xplatform/feed/domain/models/LineLiveScreenType;", 0), new ez40(rop.class, "screenState", "getScreenState()Lorg/xplatform/feed/linelive/presentation/models/ScreenState;", 0), new ez40(rop.class, "componentKey", "getComponentKey()Ljava/lang/String;", 0), new ez40(rop.class, "initIds", "getInitIds()[J", 0)};
    public static final nek a2 = new nek();

    public rop() {
        super(R.layout.feed_compose_fragment);
        this.K1 = true;
        this.L1 = true;
        this.M1 = ltt0.o(this, qop.f29081a);
        this.N1 = new bj5();
        this.O1 = new yzn0("SCREEN_STATE_KEY");
        this.P1 = new phf0("SETTINGS_BUNDLE_COMPONENT_KEY");
        this.Q1 = new cu("KEY_INIT_IDS");
        dfp dfpVar = new dfp((byte) 12);
        wez wezVar = wez.b;
        this.R1 = maz.a(wezVar, dfpVar);
        this.S1 = maz.a(wezVar, new oop(this, (byte) 0));
        this.U1 = new LinkedHashMap();
        this.V1 = new LinkedHashMap();
        this.W1 = new LinkedHashMap();
        this.X1 = new LinkedHashMap();
        this.Y1 = xbc.a0(this, sre0.f32672a.b(eop.class), null, new oop(this, (byte) 1), 14);
        this.Z1 = androidx.compose.runtime.e.e(null);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: A0, reason: from getter */
    public final boolean getY1() {
        return this.L1;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new oop(this, (byte) 2));
        Object objN = this.M1.n(b2[0], this);
        objN.getClass();
        pkd.i(((yhp) objN).b, null, new ugd(419188091, true, new f5o(this, (byte) 20)));
    }

    public final void G0(mm40 mm40Var, boolean z, g4x g4xVar, j700 j700Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-413053841);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(g4xVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(j700Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(this) ? 16384 : 8192;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            fetVar.b0(-1807742150, j700Var);
            LinkedHashMap linkedHashMap = this.V1;
            Object xgiVar = linkedHashMap.get(j700Var);
            if (xgiVar == null) {
                ComponentCallbacks2 application = n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(tmp.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof tmp)) {
                        ze3Var = null;
                    }
                    tmp tmpVar = (tmp) ze3Var;
                    if (tmpVar != null) {
                        i1w0 i1w0VarF = a4n0.f(this);
                        hkp hkpVar = M0().f44346a;
                        FeedsChampsItemsScreenParams feedsChampsItemsScreenParams = new FeedsChampsItemsScreenParams(tx3.f0(this.Q1.n(this, b2[4])), j700Var, CollectionsKt.P0(g4xVar), L0(), z);
                        i1w0VarF.getClass();
                        sue sueVar = tmpVar.d;
                        itr itrVar = tmpVar.e;
                        lsn lsnVar = tmpVar.c;
                        y3v y3vVar = tmpVar.I;
                        bwl bwlVar = tmpVar.b;
                        a1d a1dVar = tmpVar.f;
                        mne mneVar = tmpVar.f34204a;
                        m1e m1eVar = tmpVar.k;
                        lbu lbuVar = tmpVar.h;
                        qv2 qv2Var = tmpVar.g;
                        g2v g2vVar = tmpVar.j;
                        vd1 vd1Var = tmpVar.i;
                        duj dujVar = tmpVar.l;
                        fsd fsdVar = tmpVar.p;
                        edo edoVar = tmpVar.q;
                        qj9 qj9Var = tmpVar.r;
                        nvu nvuVar = tmpVar.u;
                        ulk ulkVar = tmpVar.v;
                        ctf0 ctf0Var = tmpVar.m;
                        iip iipVar = tmpVar.n;
                        n5r0 n5r0Var = tmpVar.o;
                        pru pruVar = tmpVar.z;
                        pyg pygVar = tmpVar.A;
                        wdk0 wdk0Var = tmpVar.B;
                        d1p d1pVar = tmpVar.C;
                        viu viuVar = tmpVar.D;
                        yo4 yo4Var = tmpVar.F;
                        j1q0 j1q0Var = tmpVar.w;
                        peg0 peg0Var = tmpVar.t;
                        zfo zfoVar = tmpVar.s;
                        gst0 gst0Var = tmpVar.E;
                        rtu rtuVar = tmpVar.G;
                        ugf0 ugf0Var = tmpVar.H;
                        r9u r9uVar = tmpVar.J;
                        h3c h3cVar = tmpVar.K;
                        oeg0 oeg0Var = tmpVar.x;
                        pmi pmiVar = tmpVar.y;
                        vqc vqcVar = tmpVar.L;
                        itrVar.getClass();
                        sueVar.getClass();
                        iipVar.getClass();
                        n5r0Var.getClass();
                        m1eVar.getClass();
                        pygVar.getClass();
                        d1pVar.getClass();
                        ctf0Var.getClass();
                        j1q0Var.getClass();
                        wdk0Var.getClass();
                        r9uVar.getClass();
                        oeg0Var.getClass();
                        fsdVar.getClass();
                        zfoVar.getClass();
                        edoVar.getClass();
                        gst0Var.getClass();
                        xgiVar = new xgi(bwlVar, a1dVar, mneVar, m1eVar, sueVar, itrVar, lsnVar, dujVar, iipVar, n5r0Var, d1pVar, ugf0Var, vqcVar, y3vVar, vd1Var, qv2Var, lbuVar, g2vVar, hkpVar, ctf0Var, i1w0VarF, peg0Var, j1q0Var, pruVar, viuVar, yo4Var, rtuVar, r9uVar, feedsChampsItemsScreenParams, oeg0Var, pmiVar, zfoVar, qj9Var, edoVar, nvuVar, ulkVar, gst0Var, h3cVar);
                        linkedHashMap.put(j700Var, xgiVar);
                    }
                }
                jf4.n(b1j.i(tmp.class, "Cannot create dependency "));
                return;
            }
            xgi xgiVar2 = (xgi) xgiVar;
            int i4 = i3 & 7168;
            boolean z2 = i4 == 2048;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z2 || objP == obj) {
                objP = new q0h0((wgi) xgiVar2.M.get());
                fetVar.o0(objP);
            }
            q0h0 q0h0Var = (q0h0) objP;
            sgy sgyVarB = sre0.f32672a.b(nnp.class);
            boolean z3 = i4 == 2048;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == obj) {
                objP2 = new kop(j700Var, (byte) 0);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean zI = fetVar.i(q0h0Var);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new lop(q0h0Var, (byte) 0);
                fetVar.o0(objP3);
            }
            a8z a8zVarA0 = xbc.a0(this, sgyVarB, function0, (Function0) objP3, 12);
            ujd ujdVarD = xgiVar2.t.d();
            x1x.x(ujdVarD);
            ms2 gs2Var = g4xVar.isEmpty() ? new gs2() : new hs2();
            boolean zI2 = fetVar.i(a8zVarA0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new mop(a8zVarA0, (byte) 0);
                fetVar.o0(objP4);
            }
            ujdVarD.c(this, gs2Var, (Function1) objP4);
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVarA0.getValue())).y(fetVar);
            k3t0 k3t0Var = (k3t0) a8zVarA0.getValue();
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP5);
            }
            vne vneVar = (vne) objP5;
            boolean zI3 = fetVar.i(this) | fetVar.i(ujdVarD) | fetVar.i(a8zVarA0);
            Object objP6 = fetVar.P();
            if (zI3 || objP6 == obj) {
                objP6 = new f8m((Object) this, (Object) ujdVarD, (Object) a8zVarA0, (byte) 18);
                fetVar.o0(objP6);
            }
            Function1 function1 = (Function1) objP6;
            Unit unit = Unit.f46060a;
            boolean zI4 = fetVar.i(vneVar) | fetVar.i(k3t0Var) | fetVar.g(function1) | fetVar.g(null);
            Object objP7 = fetVar.P();
            if (zI4 || objP7 == obj) {
                objP7 = new et(vneVar, k3t0Var, function1, (byte) 24);
                fetVar.o0(objP7);
            }
            m0x0.o(unit, (Function1) objP7, fetVar);
            boolean zI5 = fetVar.i(a8zVarA0);
            Object objP8 = fetVar.P();
            if (zI5 || objP8 == obj) {
                objP8 = new nop(a8zVarA0, (byte) 0);
                fetVar.o0(objP8);
            }
            mm40 mm40VarA = pzw.A(i3 & 14, fetVar, mm40Var, (Function0) objP8);
            zcz zczVar = (zcz) this.R1.getValue();
            Object obj2 = (k3t0) a8zVarA0.getValue();
            boolean zI6 = fetVar.i(obj2);
            Object objP9 = fetVar.P();
            if (zI6 || objP9 == obj) {
                objP9 = new k4p(1, obj2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 28);
                fetVar.o0(objP9);
            }
            saj.l(mm40VarA, pz40VarY, j700Var, zczVar, (Function1) ((jhy) objP9), fetVar, (i3 >> 3) & 896);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg(this, mm40Var, z, g4xVar, j700Var, i);
        }
    }

    public final void H0(mm40 mm40Var, g4x g4xVar, String str, boolean z, j700 j700Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-419167749);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(g4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.e(j700Var.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(this) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            fetVar.b0(906727789, j700Var);
            Set setP0 = CollectionsKt.P0(g4xVar);
            LinkedHashMap linkedHashMap = this.W1;
            Object bhiVar = linkedHashMap.get(j700Var);
            if (bhiVar == null) {
                ComponentCallbacks2 application = n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(gop.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof gop)) {
                        ze3Var = null;
                    }
                    gop gopVar = (gop) ze3Var;
                    if (gopVar != null) {
                        i1w0 i1w0VarF = a4n0.f(this);
                        hkp hkpVar = M0().f44346a;
                        FeedGameItemsScreenParams feedGameItemsScreenParams = new FeedGameItemsScreenParams(tx3.f0(this.Q1.n(this, b2[4])), j700Var, CollectionsKt.P0(setP0), z, L0(), str);
                        i1w0VarF.getClass();
                        ugf0 ugf0Var = gopVar.b;
                        iw20 iw20Var = gopVar.c;
                        itr itrVar = gopVar.g;
                        iip iipVar = gopVar.h;
                        n5r0 n5r0Var = gopVar.i;
                        ctf0 ctf0Var = gopVar.d;
                        y78 y78Var = gopVar.f;
                        g2v g2vVar = gopVar.f11642a;
                        mne mneVar = gopVar.j;
                        m1e m1eVar = gopVar.k;
                        duj dujVar = gopVar.l;
                        viu viuVar = gopVar.m;
                        ort ortVar = gopVar.n;
                        rtu rtuVar = gopVar.o;
                        xri xriVar = gopVar.e;
                        r9u r9uVar = gopVar.p;
                        reu reuVar = gopVar.q;
                        iipVar.getClass();
                        n5r0Var.getClass();
                        itrVar.getClass();
                        m1eVar.getClass();
                        xriVar.getClass();
                        ctf0Var.getClass();
                        r9uVar.getClass();
                        bhiVar = new bhi(mneVar, ugf0Var, m1eVar, itrVar, iipVar, n5r0Var, iw20Var, dujVar, xriVar, ortVar, ctf0Var, hkpVar, y78Var, g2vVar, feedGameItemsScreenParams, viuVar, rtuVar, r9uVar, reuVar);
                        linkedHashMap.put(j700Var, bhiVar);
                    }
                }
                jf4.n(b1j.i(gop.class, "Cannot create dependency "));
                return;
            }
            bhi bhiVar2 = (bhi) bhiVar;
            int i4 = 57344 & i3;
            boolean z2 = i4 == 16384;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z2 || objP == obj) {
                objP = new q0h0((ahi) bhiVar2.t.get());
                fetVar.o0(objP);
            }
            q0h0 q0h0Var = (q0h0) objP;
            sgy sgyVarB = sre0.f32672a.b(uhs.class);
            boolean z3 = i4 == 16384;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == obj) {
                objP2 = new kop(j700Var, (byte) 1);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean zI = fetVar.i(q0h0Var);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new lop(q0h0Var, (byte) 0);
                fetVar.o0(objP3);
            }
            a8z a8zVarA0 = xbc.a0(this, sgyVarB, function0, (Function0) objP3, 12);
            ujd ujdVarD = bhiVar2.i.d();
            x1x.x(ujdVarD);
            ms2 gs2Var = g4xVar.isEmpty() ? new gs2() : new hs2();
            boolean zI2 = fetVar.i(a8zVarA0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new mop(a8zVarA0, (byte) 1);
                fetVar.o0(objP4);
            }
            ujdVarD.c(this, gs2Var, (Function1) objP4);
            k3t0 k3t0Var = (k3t0) a8zVarA0.getValue();
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP5);
            }
            vne vneVar = (vne) objP5;
            boolean zI3 = fetVar.i(bhiVar2) | fetVar.i(this) | fetVar.i(a8zVarA0);
            Object objP6 = fetVar.P();
            if (zI3 || objP6 == obj) {
                objP6 = new f8m((Object) bhiVar2, (Object) this, (Object) a8zVarA0, (byte) 19);
                fetVar.o0(objP6);
            }
            Function1 function1 = (Function1) objP6;
            Unit unit = Unit.f46060a;
            boolean zI4 = fetVar.i(vneVar) | fetVar.i(k3t0Var) | fetVar.g(function1) | fetVar.g(null);
            Object objP7 = fetVar.P();
            if (zI4 || objP7 == obj) {
                objP7 = new et(vneVar, k3t0Var, function1, (byte) 25);
                fetVar.o0(objP7);
            }
            m0x0.o(unit, (Function1) objP7, fetVar);
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVarA0.getValue())).y(fetVar);
            boolean zI5 = fetVar.i(a8zVarA0);
            Object objP8 = fetVar.P();
            if (zI5 || objP8 == obj) {
                objP8 = new nop(a8zVarA0, (byte) 1);
                fetVar.o0(objP8);
            }
            mm40 mm40VarA = pzw.A(i3 & 14, fetVar, mm40Var, (Function0) objP8);
            Object obj2 = (k3t0) a8zVarA0.getValue();
            boolean zI6 = fetVar.i(obj2);
            Object objP9 = fetVar.P();
            if (zI6 || objP9 == obj) {
                objP9 = new k4p(1, obj2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 29);
                fetVar.o0(objP9);
            }
            vbc.E(0, fetVar, mm40VarA, pz40VarY, (Function1) ((jhy) objP9));
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2(this, mm40Var, g4xVar, str, z, j700Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:99:0x01d7  */
    public final void I0(mm40 mm40Var, String str, aj00 aj00Var, long j, j700 j700Var, fet fetVar, int i) {
        int i2;
        long j2;
        ms2 ls2Var;
        aj00 aj00Var2 = aj00Var;
        fetVar.g0(-1348099341);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(aj00Var2) : fetVar.i(aj00Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            j2 = j;
            i2 |= fetVar.f(j2) ? 2048 : 1024;
        } else {
            j2 = j;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.e(j700Var.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(this) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            fetVar.b0(1556665943, j700Var);
            LinkedHashMap linkedHashMap = this.X1;
            Object wjiVar = linkedHashMap.get(j700Var);
            if (wjiVar == null) {
                ComponentCallbacks2 application = n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(fj00.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof fj00)) {
                        ze3Var = null;
                    }
                    fj00 fj00Var = (fj00) ze3Var;
                    if (fj00Var != null) {
                        i1w0 i1w0VarF = a4n0.f(this);
                        hkp hkpVar = M0().f44346a;
                        LiveExpressItemsScreenParams liveExpressItemsScreenParams = new LiveExpressItemsScreenParams(j2, aj00Var2, str, L0());
                        aj00Var2 = aj00Var2;
                        i1w0VarF.getClass();
                        ugf0 ugf0Var = fj00Var.b;
                        iw20 iw20Var = fj00Var.c;
                        itr itrVar = fj00Var.g;
                        iip iipVar = fj00Var.h;
                        n5r0 n5r0Var = fj00Var.i;
                        ctf0 ctf0Var = fj00Var.d;
                        y78 y78Var = fj00Var.f;
                        g2v g2vVar = fj00Var.f9614a;
                        mne mneVar = fj00Var.j;
                        m1e m1eVar = fj00Var.k;
                        duj dujVar = fj00Var.l;
                        xri xriVar = fj00Var.e;
                        r9u r9uVar = fj00Var.m;
                        iipVar.getClass();
                        n5r0Var.getClass();
                        itrVar.getClass();
                        m1eVar.getClass();
                        xriVar.getClass();
                        ctf0Var.getClass();
                        r9uVar.getClass();
                        wjiVar = new wji(mneVar, ugf0Var, m1eVar, itrVar, iipVar, n5r0Var, iw20Var, dujVar, xriVar, ctf0Var, hkpVar, y78Var, g2vVar, liveExpressItemsScreenParams, r9uVar);
                        linkedHashMap.put(j700Var, wjiVar);
                    }
                }
                jf4.n(b1j.i(fj00.class, "Cannot create dependency "));
                return;
            }
            wji wjiVar2 = (wji) wjiVar;
            boolean z = (57344 & i3) == 16384;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new q0h0((vji) wjiVar2.p.get());
                fetVar.o0(objP);
            }
            q0h0 q0h0Var = (q0h0) objP;
            sgy sgyVarB = sre0.f32672a.b(qi00.class);
            boolean zI = fetVar.i(q0h0Var);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                objP2 = new lop(q0h0Var, (byte) 0);
                fetVar.o0(objP2);
            }
            a8z a8zVarA0 = xbc.a0(this, sgyVarB, null, (Function0) objP2, 14);
            ujd ujdVarD = wjiVar2.c.d();
            x1x.x(ujdVarD);
            if (aj00Var2 == null) {
                ls2Var = new ls2();
            } else if (aj00Var2 instanceof wi00) {
                ls2Var = new hq2();
            } else if (aj00Var2 instanceof xi00) {
                ls2Var = new iq2();
            } else if (aj00Var2 instanceof zi00) {
                ls2Var = new gq2();
            } else {
                ls2Var = new ls2();
            }
            boolean zI2 = fetVar.i(a8zVarA0);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == obj) {
                objP3 = new mop(a8zVarA0, (byte) 2);
                fetVar.o0(objP3);
            }
            ujdVarD.c(this, ls2Var, (Function1) objP3);
            k3t0 k3t0Var = (k3t0) a8zVarA0.getValue();
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP4);
            }
            vne vneVar = (vne) objP4;
            boolean zI3 = fetVar.i(wjiVar2) | fetVar.i(this) | fetVar.i(a8zVarA0);
            Object objP5 = fetVar.P();
            if (zI3 || objP5 == obj) {
                objP5 = new f8m((Object) wjiVar2, (Object) this, (Object) a8zVarA0, (byte) 20);
                fetVar.o0(objP5);
            }
            Function1 function1 = (Function1) objP5;
            Unit unit = Unit.f46060a;
            boolean zI4 = fetVar.i(vneVar) | fetVar.i(k3t0Var) | fetVar.g(function1) | fetVar.g(null);
            Object objP6 = fetVar.P();
            if (zI4 || objP6 == obj) {
                objP6 = new et(vneVar, k3t0Var, function1, (byte) 26);
                fetVar.o0(objP6);
            }
            m0x0.o(unit, (Function1) objP6, fetVar);
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVarA0.getValue())).y(fetVar);
            boolean zI5 = fetVar.i(a8zVarA0);
            Object objP7 = fetVar.P();
            if (zI5 || objP7 == obj) {
                objP7 = new nop(a8zVarA0, (byte) 3);
                fetVar.o0(objP7);
            }
            mm40 mm40VarA = pzw.A(14 & i3, fetVar, mm40Var, (Function0) objP7);
            Object obj2 = (k3t0) a8zVarA0.getValue();
            boolean zI6 = fetVar.i(obj2);
            Object objP8 = fetVar.P();
            if (zI6 || objP8 == obj) {
                Object popVar = new pop(1, obj2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 0);
                fetVar.o0(popVar);
                objP8 = popVar;
            }
            x2x.b(0, fetVar, mm40VarA, pz40VarY, (Function1) ((jhy) objP8));
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jp(this, mm40Var, str, aj00Var2, j, j700Var, i);
        }
    }

    public final void J0(mm40 mm40Var, ikp ikpVar, j700 j700Var, fet fetVar, int i) {
        int i2;
        rop ropVar;
        mm40 mm40Var2;
        int i3;
        j700 j700Var2 = j700Var;
        fetVar.g0(-150690017);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.e(ikpVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(j700Var2.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(this) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.b0(1215787673, j700Var2);
            LinkedHashMap linkedHashMap = this.U1;
            Object obj = linkedHashMap.get(j700Var2);
            if (obj == null) {
                ComponentCallbacks2 application = n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(sop.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    sop sopVar = (sop) (ze3Var instanceof sop ? ze3Var : null);
                    if (sopVar != null) {
                        i1w0 i1w0VarF = a4n0.f(this);
                        hkp hkpVar = M0().f44346a;
                        String strL0 = L0();
                        i1w0VarF.getClass();
                        strL0.getClass();
                        iip iipVar = sopVar.f32555a;
                        int i4 = i2;
                        nr00 nr00Var = sopVar.b;
                        n5r0 n5r0Var = sopVar.c;
                        pru pruVar = sopVar.d;
                        mne mneVar = sopVar.f;
                        m1e m1eVar = sopVar.g;
                        duj dujVar = sopVar.h;
                        r9u r9uVar = sopVar.i;
                        g2v g2vVar = sopVar.e;
                        fsd fsdVar = sopVar.j;
                        zr1 zr1Var = sopVar.k;
                        yo4 yo4Var = sopVar.l;
                        ctf0 ctf0Var = sopVar.m;
                        iipVar.getClass();
                        n5r0Var.getClass();
                        m1eVar.getClass();
                        r9uVar.getClass();
                        fsdVar.getClass();
                        ctf0Var.getClass();
                        i3 = i4;
                        dhi dhiVar = new dhi(iipVar, nr00Var, n5r0Var, mneVar, m1eVar, dujVar, i1w0VarF, strL0, pruVar, hkpVar, zr1Var, ikpVar, j700Var, g2vVar, yo4Var, ctf0Var);
                        j700Var2 = j700Var;
                        linkedHashMap.put(j700Var2, dhiVar);
                        obj = dhiVar;
                    }
                }
                jf4.n(b1j.i(sop.class, "Cannot create dependency "));
                return;
            }
            i3 = i2;
            dhi dhiVar2 = (dhi) obj;
            int i5 = i3 & 896;
            boolean z = i5 == 256;
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (z || objP == obj2) {
                objP = new q0h0((chi) dhiVar2.q.get());
                fetVar.o0(objP);
            }
            q0h0 q0h0Var = (q0h0) objP;
            sgy sgyVarB = sre0.f32672a.b(fpp.class);
            boolean z2 = i5 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj2) {
                objP2 = new kop(j700Var2, (byte) 2);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean zI = fetVar.i(q0h0Var);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj2) {
                objP3 = new lop(q0h0Var, (byte) 0);
                fetVar.o0(objP3);
            }
            ropVar = this;
            a8z a8zVarA0 = xbc.a0(ropVar, sgyVarB, function0, (Function0) objP3, 12);
            boolean zI2 = fetVar.i(a8zVarA0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj2) {
                objP4 = new nop(a8zVarA0, (byte) 2);
                fetVar.o0(objP4);
            }
            mm40Var2 = mm40Var;
            mm40 mm40VarA = pzw.A(i3 & 14, fetVar, mm40Var2, (Function0) objP4);
            zcz zczVar = (zcz) ropVar.R1.getValue();
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVarA0.getValue())).y(fetVar);
            Object obj3 = (k3t0) a8zVarA0.getValue();
            boolean zI3 = fetVar.i(obj3);
            Object objP5 = fetVar.P();
            if (zI3 || objP5 == obj2) {
                Object popVar = new pop(1, obj3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 1);
                fetVar.o0(popVar);
                objP5 = popVar;
            }
            ahy.Q(mm40VarA, pz40VarY, j700Var2, zczVar, (Function1) ((jhy) objP5), fetVar, i5);
            fetVar.r(false);
        } else {
            ropVar = this;
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((Object) ropVar, mm40Var2, (Object) ikpVar, (Object) j700Var, i, (byte) 2);
        }
    }

    public final void K0() {
        k3t0 k3t0VarN0 = N0();
        androidx.fragment.app.e eVarF = F();
        boolean z = false;
        Iterable iterableO = l1e0.o(0, eVarF.P() - 1);
        if (!(iterableO instanceof Collection) || !((Collection) iterableO).isEmpty()) {
            Iterator it = iterableO.iterator();
            while (((kkx) it).c) {
                String str = eVarF.O(((bkx) it).nextInt()).i;
                if (str != null && kotlin.text.c.x(str, "FeedsComposeScreenFragment", false)) {
                    z = true;
                    break;
                }
            }
        }
        k3t0VarN0.x(new ajp(!z));
    }

    public final String L0() {
        return this.P1.n(this, b2[3]);
    }

    public final zgi M0() {
        return (zgi) this.S1.getValue();
    }

    public final k3t0 N0() {
        return (k3t0) this.Y1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        sj3.s0(this, "REQUEST_TIME_FILTER", new jop(this, (byte) 1));
        sj3.s0(this, "START_DATE_SELECT_KEY", new jop(this, (byte) 2));
        sj3.s0(this, "END_DATE_SELECT_KEY", new jop(this, (byte) 3));
        sj3.s0(this, "SELECT_DATE_TIME_REQUEST_KEY", new jop(this, (byte) 4));
        sj3.r0(this, "DISMISS_DIALOG_KEY", new jop(this, (byte) 5));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        hxm0.m(q0());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(q0());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        wdk0.l(M0().q, this, this.K1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        wdk0.a(M0().q, this);
        this.j1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.K1;
    }
}
