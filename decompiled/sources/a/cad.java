package a;

import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.widget.EditText;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes4.dex */
public final class cad implements qe60, giu0, hlc, zf60, uu9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4005a;
    public final Object b;

    public cad(EditText editText) {
        this.f4005a = (byte) 19;
        fhj fhjVar = new fhj();
        fhjVar.f9543a = editText;
        itn itnVar = new itn(editText);
        fhjVar.b = itnVar;
        editText.addTextChangedListener(itnVar);
        if (vsn.b == null) {
            synchronized (vsn.f37958a) {
                try {
                    if (vsn.b == null) {
                        vsn vsnVar = new vsn();
                        try {
                            vsn.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, vsn.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        vsn.b = vsnVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(vsn.b);
        this.b = fhjVar;
    }

    public FragmentScreen a(long j, long j2, long j3, boolean z, long j4, boolean z2, GameBroadcastType gameBroadcastType, grs grsVar, String str, int i, boolean z3) {
        k1g k1gVar = k1g.OPEN_REGULAR;
        gameBroadcastType.getClass();
        grsVar.getClass();
        str.getClass();
        qv2 qv2Var = (qv2) this.b;
        Parcelable.Creator<GameBroadcastType> creator = GameBroadcastType.CREATOR;
        grs grsVar2 = grs.f11797a;
        return qv2Var.h(new GameScreenGeneralParams(j, 0L, j2, j3, z, j4, z2, gameBroadcastType, grsVar, "main_screen", str, ors.f25750a, i, z3, k1gVar));
    }

    public e6m0 b() {
        f6m0 f6m0Var = ((g6m0) this.b).f10774a;
        if (f6m0Var.f9020a.get() != -1 && f6m0Var.b.compareAndSet(false, true)) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - f6m0Var.f9020a.get();
            if (jElapsedRealtime <= 300000) {
                return new c6m0(jElapsedRealtime);
            }
        }
        return d6m0.f5556a;
    }

    @Override // a.giu0
    public diu0 c(Object obj) {
        byte b = this.f4005a;
        Object obj2 = this.b;
        switch (b) {
            case 6:
                k6i k6iVar = (k6i) ((c7i) obj2).c;
                qa60 qa60Var = (qa60) k6iVar.F.get();
                xcc xccVar = (xcc) k6iVar.U.get();
                return new gh70((fq) k6iVar.x.get(), xccVar, k6iVar.f17771a.v1(), (lzt) k6iVar.f.get(), qa60Var, (i1w0) obj);
            case 7:
            default:
                gxi gxiVar = (gxi) ((c7i) obj2).c;
                qa60 qa60Var2 = (qa60) gxiVar.G.get();
                xcc xccVar2 = (xcc) gxiVar.V.get();
                return new gh70((fq) gxiVar.y.get(), xccVar2, gxiVar.f12079a.v1(), (lzt) gxiVar.g.get(), qa60Var2, (i1w0) obj);
            case 8:
                c7i c7iVar = (c7i) obj2;
                ufi ufiVar = (ufi) c7iVar.c;
                v88 v88VarU0 = ufiVar.f35578a.u0();
                wsf0 wsf0VarF0 = ufiVar.f35578a.f0();
                mne mneVarV1 = ufiVar.f35578a.v1();
                fpi0 fpi0Var = (fpi0) ufiVar.m.get();
                fq fqVar = (fq) ufiVar.x.get();
                r8i r8iVar = (r8i) c7iVar.d;
                return new wm70((i1w0) obj, v88VarU0, wsf0VarF0, mneVarV1, fpi0Var, fqVar, (dqx) ((n5d0) r8iVar.g).get(), (itt) ufiVar.u.get(), (qni0) ufiVar.d0.get(), (l1u) ((n5d0) r8iVar.l).get(), (lg60) ufiVar.e0.get(), (qa60) ufiVar.F.get(), (ppb) ((n5d0) r8iVar.m).get(), (i5m0) ufiVar.f0.get(), (lzt) ufiVar.f.get(), (xcc) ufiVar.U.get(), (ztt) ufiVar.k.get(), (d3c) ufiVar.e.get(), (xyb) ufiVar.h.get(), (oqt) ufiVar.p.get(), (y5s) ufiVar.T.get(), (t0u) ufiVar.X.get());
            case 9:
                c7i c7iVar2 = (c7i) obj2;
                pki pkiVar = (pki) c7iVar2.c;
                v88 v88VarU1 = pkiVar.f27135a.u0();
                wsf0 wsf0VarF1 = pkiVar.f27135a.f0();
                mne mneVarV2 = pkiVar.f27135a.v1();
                fpi0 fpi0Var2 = (fpi0) pkiVar.n.get();
                fq fqVar2 = (fq) pkiVar.y.get();
                mki mkiVar = (mki) c7iVar2.d;
                return new wm70((i1w0) obj, v88VarU1, wsf0VarF1, mneVarV2, fpi0Var2, fqVar2, (dqx) ((n5d0) mkiVar.d).get(), (itt) pkiVar.v.get(), (qni0) ((n5d0) mkiVar.i).get(), (l1u) ((n5d0) mkiVar.j).get(), (lg60) ((n5d0) mkiVar.k).get(), (qa60) pkiVar.G.get(), (ppb) ((n5d0) mkiVar.l).get(), (i5m0) ((n5d0) mkiVar.m).get(), (lzt) pkiVar.g.get(), (xcc) pkiVar.V.get(), (ztt) pkiVar.l.get(), (d3c) pkiVar.f.get(), (xyb) pkiVar.i.get(), (oqt) pkiVar.q.get(), (y5s) pkiVar.U.get(), (t0u) pkiVar.Y.get());
            case 10:
                wri wriVar = (wri) ((c7i) obj2).c;
                qa60 qa60Var3 = (qa60) wriVar.F.get();
                xcc xccVar3 = (xcc) wriVar.U.get();
                return new gh70((fq) wriVar.x.get(), xccVar3, wriVar.f39644a.v1(), (lzt) wriVar.f.get(), qa60Var3, (i1w0) obj);
        }
    }

    @Override // a.hlc
    public glc d(qlc qlcVar) {
        glc glcVarD;
        qlcVar.getClass();
        for (mg80 mg80Var : x2x.i0((pg80) this.b, qlcVar.f28927a)) {
            if ((mg80Var instanceof ed9) && (glcVarD = ((ed9) mg80Var).j.d(qlcVar)) != null) {
                return glcVarD;
            }
        }
        return null;
    }

    public Object e(zje zjeVar) {
        Object objW0 = sj3.w0(zjeVar, ((jxy) ((svu) this.b).f32888a).f17333a, new sax(2, null, (byte) 6), false, true);
        wne wneVar = wne.f39444a;
        if (objW0 != wneVar) {
            objW0 = Unit.f46060a;
        }
        if (objW0 != wneVar) {
            objW0 = Unit.f46060a;
        }
        return objW0 == wneVar ? objW0 : Unit.f46060a;
    }

    @Override // a.uu9
    public Object f(tu9 tu9Var) {
        dfr dfrVar = (dfr) this.b;
        z1x.y("The result can only set once!", dfrVar.b == null);
        dfrVar.b = tu9Var;
        return "FutureChain[" + dfrVar + "]";
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f2, code lost:
    
        if (r0 == r11) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(java.lang.String r18, java.io.File r19, long r20, a.zje r22) throws a.c44 {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cad.g(java.lang.String, java.io.File, long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(long j, zje zjeVar) {
        omt omtVar;
        if (zjeVar instanceof omt) {
            omtVar = (omt) zjeVar;
            int i = omtVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                omtVar.k = i - Integer.MIN_VALUE;
            } else {
                omtVar = new omt(this, zjeVar);
            }
        } else {
            omtVar = new omt(this, zjeVar);
        }
        Object obj = omtVar.i;
        wne wneVar = wne.f39444a;
        int i2 = omtVar.k;
        if (i2 != 0) {
            if (i2 == 1) {
                z1x.P(obj);
                return ((j0g0) obj).f15681a;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        c5k c5kVar = (c5k) this.b;
        omtVar.k = 1;
        Object objD = c5kVar.d(j, omtVar);
        return objD == wneVar ? wneVar : objD;
    }

    public void i() {
        ((jxq) this.b).d.c0();
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        byte b = this.f4005a;
        Object obj = this.b;
        view.getClass();
        switch (b) {
            case 21:
                s5p s5pVar = (s5p) obj;
                View viewQ0 = s5pVar.q0();
                uiv0 uiv0Var = xiv0Var.f40966a;
                jmu0.l(uiv0Var.i(1).b, s5pVar.G().getDimensionPixelSize(R.dimen.bottom_navigation_view_height) + uiv0Var.i(2).d, 5, viewQ0);
                break;
            default:
                org.xplatform.favorites.impl.presentation.category.e eVar = (org.xplatform.favorites.impl.presentation.category.e) obj;
                View viewQ1 = eVar.q0();
                uiv0 uiv0Var2 = xiv0Var.f40966a;
                jmu0.l(uiv0Var2.i(1).b, eVar.G().getDimensionPixelSize(R.dimen.bottom_navigation_view_height) + uiv0Var2.i(2).d, 5, viewQ1);
                break;
        }
        return xiv0Var;
    }

    @Override // a.qe60
    public int n(int i) {
        return l1e0.d(i, 0, ((j83) this.b).b.length());
    }

    @Override // a.qe60
    public int s(int i) {
        return l1e0.d(i, 0, ((j83) this.b).b.length());
    }

    public cad(byte b) {
        this.f4005a = b;
        switch (b) {
            case 12:
                this.b = thb.y(Looper.getMainLooper());
                break;
            default:
                this.b = new psc((byte) 13);
                break;
        }
    }

    public cad(g6m0 g6m0Var) {
        this.f4005a = (byte) 1;
        g6m0Var.getClass();
        this.b = g6m0Var;
    }

    public cad(bad badVar) {
        this.f4005a = (byte) 0;
        badVar.getClass();
        this.b = badVar;
    }

    public cad(fno fnoVar) {
        this.f4005a = (byte) 29;
        fnoVar.getClass();
        this.b = fnoVar;
    }

    public cad(gii0 gii0Var, byte b) {
        this.f4005a = b;
        gii0Var.getClass();
        switch (b) {
            case 18:
                this.b = new wgn(gii0Var, (byte) 3);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                this.b = new wgn(gii0Var, (byte) 20);
                break;
            default:
                this.b = new wgn(gii0Var, (byte) 0);
                break;
        }
    }

    public /* synthetic */ cad(Object obj, byte b) {
        this.f4005a = b;
        this.b = obj;
    }
}
