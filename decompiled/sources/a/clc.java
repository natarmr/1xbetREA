package a;

import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class clc implements zf60, vmb0, giu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4551a;
    public Object b;

    public clc(gii0 gii0Var, byte b) {
        this.f4551a = b;
        gii0Var.getClass();
        switch (b) {
            case 18:
                this.b = new sza(gii0Var, (byte) 21);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                this.b = new sza(gii0Var, (byte) 22);
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                this.b = new sza(gii0Var, (byte) 25);
                break;
            default:
                this.b = new sza(gii0Var, (byte) 17);
                break;
        }
    }

    @Override // a.vmb0
    public long a(mkx mkxVar, long j, k6z k6zVar, long j2) {
        long j3 = ((ikx) ((Function0) this.b).invoke()).f14950a;
        int iR = kpb.r(mkxVar.f21964a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), k6zVar == k6z.f17794a);
        return (((long) kpb.r(mkxVar.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) iR) << 32);
    }

    public void b(e7z e7zVar) {
        if (!e7zVar.I()) {
            xcx.b("DepthSortedSet.add called on an unattached node");
        }
        ((mlk0) this.b).add(e7zVar);
    }

    @Override // a.giu0
    public diu0 c(Object obj) {
        switch (this.f4551a) {
            case 21:
                i1w0 i1w0Var = (i1w0) obj;
                pfi pfiVar = (pfi) ((c7i) this.b).c;
                qa60 qa60Var = (qa60) pfiVar.F.get();
                return new gh70((fq) pfiVar.x.get(), (xcc) pfiVar.U.get(), pfiVar.f26907a.v1(), (lzt) pfiVar.f.get(), qa60Var, i1w0Var);
            default:
                i1w0 i1w0Var2 = (i1w0) obj;
                lki lkiVar = (lki) ((c7i) this.b).c;
                qa60 qa60Var2 = (qa60) lkiVar.F.get();
                return new gh70((fq) lkiVar.x.get(), (xcc) lkiVar.U.get(), lkiVar.f20204a.v1(), (lzt) lkiVar.f.get(), qa60Var2, i1w0Var2);
        }
    }

    public r46 d() {
        return new r46(((xzp) ((epi0) this.b).b).C(), (char) 0);
    }

    public l7m0 e() {
        qsn qsnVarA = qsn.a();
        if (qsnVarA.c() == 1) {
            return new p3x(true);
        }
        pz40 pz40VarE = androidx.compose.runtime.e.e(Boolean.FALSE);
        qsnVarA.h(new zuj(pz40VarE, this));
        return pz40VarE;
    }

    public iw20 f() {
        return new iw20(new lef0(new onv((lgc0) this.b)));
    }

    public boolean g(e7z e7zVar) {
        if (!e7zVar.I()) {
            xcx.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((mlk0) this.b).remove(e7zVar);
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.b;
        xiv0 xiv0Var2 = collapsingToolbarLayout.getFitsSystemWindows() ? xiv0Var : null;
        if (!Objects.equals(collapsingToolbarLayout.h1, xiv0Var2)) {
            collapsingToolbarLayout.h1 = xiv0Var2;
            collapsingToolbarLayout.requestLayout();
        }
        return xiv0Var.f40966a.c();
    }

    public String toString() {
        switch (this.f4551a) {
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((mlk0) this.b).toString();
            default:
                return super.toString();
        }
    }

    public clc(gok0 gok0Var) {
        this.f4551a = (byte) 8;
        gok0Var.getClass();
        this.b = gok0Var;
    }

    public clc(bl6 bl6Var) {
        this.f4551a = (byte) 2;
        bl6Var.getClass();
        this.b = bl6Var;
    }

    public /* synthetic */ clc(Object obj, byte b) {
        this.f4551a = b;
        this.b = obj;
    }

    public clc(fjj fjjVar) {
        this.f4551a = (byte) 24;
        fjjVar.getClass();
        this.b = fjjVar;
    }

    public clc(us00 us00Var, dzf dzfVar, ozf ozfVar) {
        this.f4551a = (byte) 16;
        dzfVar.getClass();
        ozfVar.getClass();
        this.b = new jzf(dzfVar, ozfVar, (byte) 1);
    }

    public clc(mne mneVar, oj9 oj9Var, b3c0 b3c0Var, gst0 gst0Var, jgm0 jgm0Var, q7d0 q7d0Var, sjl0 sjl0Var, btt0 btt0Var, vqc vqcVar) {
        this.f4551a = (byte) 10;
        oj9Var.getClass();
        b3c0Var.getClass();
        gst0Var.getClass();
        jgm0Var.getClass();
        q7d0Var.getClass();
        sjl0Var.getClass();
        btt0Var.getClass();
        this.b = new xzp(mneVar, vqcVar, oj9Var, b3c0Var, gst0Var, sjl0Var);
    }

    public clc(iip iipVar, rmd0 rmd0Var, q7d0 q7d0Var, e4u e4uVar, gle0 gle0Var, qjg qjgVar, h3c h3cVar, gii0 gii0Var, bj5 bj5Var, knf0 knf0Var, t0d t0dVar, x0t0 x0t0Var, lbu lbuVar, gst0 gst0Var, oeg0 oeg0Var) {
        this.f4551a = (byte) 17;
        iipVar.getClass();
        rmd0Var.getClass();
        q7d0Var.getClass();
        e4uVar.getClass();
        qjgVar.getClass();
        gii0Var.getClass();
        knf0Var.getClass();
        gst0Var.getClass();
        oeg0Var.getClass();
        this.b = new v7i(iipVar, rmd0Var, q7d0Var, qjgVar, h3cVar, gii0Var, knf0Var, t0dVar, x0t0Var, lbuVar, gst0Var, oeg0Var);
    }

    public clc(byte b) {
        this.f4551a = b;
        switch (b) {
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                this.b = new mlk0(m0x0.i);
                break;
        }
    }
}
