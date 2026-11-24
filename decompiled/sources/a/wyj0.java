package a;

import java.math.BigDecimal;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class wyj0 extends w46 {
    public final l7k A;
    public final cmt B;
    public final ol60 C;
    public final p7m0 D;
    public final p7m0 E;
    public final p7m0 F;
    public final p7m0 G;
    public final p7m0 H;
    public final i1w0 b;
    public final v88 c;
    public final ctf0 d;
    public final khf0 e;
    public final eqx f;
    public final zku g;
    public final hsj h;
    public final nv20 i;
    public final zku j;
    public final mne k;
    public final fvt0 l;
    public final ilt0 m;
    public final pmi0 n;
    public final trm0 o;
    public final mrt p;
    public final ot q;
    public final mii0 r;
    public final m0u s;
    public final xfu t;
    public final m1e u;
    public final b8u v;
    public final ouu w;
    public final ih5 x;
    public final gg5 y;
    public final ih5 z;

    public wyj0(i1w0 i1w0Var, v88 v88Var, ctf0 ctf0Var, khf0 khf0Var, eqx eqxVar, zku zkuVar, hsj hsjVar, nv20 nv20Var, zku zkuVar2, mne mneVar, fvt0 fvt0Var, ilt0 ilt0Var, pmi0 pmi0Var, trm0 trm0Var, mrt mrtVar, ot otVar, mii0 mii0Var, m0u m0uVar, xfu xfuVar, m1e m1eVar, b8u b8uVar, b8u b8uVar2, ouu ouuVar, ih5 ih5Var, gg5 gg5Var, ih5 ih5Var2, l7k l7kVar, cmt cmtVar) {
        i1w0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        this.b = i1w0Var;
        this.c = v88Var;
        this.d = ctf0Var;
        this.e = khf0Var;
        this.f = eqxVar;
        this.g = zkuVar;
        this.h = hsjVar;
        this.i = nv20Var;
        this.j = zkuVar2;
        this.k = mneVar;
        this.l = fvt0Var;
        this.m = ilt0Var;
        this.n = pmi0Var;
        this.o = trm0Var;
        this.p = mrtVar;
        this.q = otVar;
        this.r = mii0Var;
        this.s = m0uVar;
        this.t = xfuVar;
        this.u = m1eVar;
        this.v = b8uVar2;
        this.w = ouuVar;
        this.x = ih5Var;
        this.y = gg5Var;
        this.z = ih5Var2;
        this.A = l7kVar;
        this.B = cmtVar;
        this.C = new ol60(3);
        this.D = q7m0.a(0L);
        p7m0 p7m0VarA = q7m0.a(new od7(new BigDecimal(String.valueOf(-1.0d)), hsjVar.s(), zkuVar.a(), true, ""));
        this.E = p7m0VarA;
        this.F = q7m0.a(new pn5(new ke("", ""), 0.0d, false, true));
        this.G = q7m0.a(null);
        this.H = q7m0.a(ah5.f856a);
        bm5 bm5Var = bm5.l;
        byte b = 1;
        sac.T(new p6d(new fnq(b8uVar.a(bm5Var), new uu3(this, (yje) null)), m1eVar.b(), new syj0(this, null), b), jiu0.a(this), tyj0.h);
        sac.T(new p6d(p7m0VarA, b8uVar.a(bm5Var), new p4b0(this, null, (byte) 6), b), jiu0.a(this), uyj0.h);
    }

    public final void w(Throwable th) {
        boolean z = th instanceof zhi0;
        ol60 ol60Var = this.C;
        if (!z) {
            if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                x();
                return;
            } else {
                String message = th.getMessage();
                ol60Var.f(new fwj0(message != null ? message : ""));
                return;
            }
        }
        uhi0 uhi0Var = ((zhi0) th).d;
        Integer numValueOf = null;
        String str = uhi0Var != null ? uhi0Var.b : null;
        String str2 = str != null ? str : "";
        if (uhi0Var != null) {
            w0o w0oVar = uhi0Var.g;
            i2o i2oVar = w0oVar != null ? w0oVar.b : null;
            if (i2oVar != null) {
                numValueOf = Integer.valueOf(i2oVar.getErrorCode());
            }
        }
        if (numValueOf != null && numValueOf.intValue() == 103) {
            ol60Var.f(new dwj0(str2));
        } else {
            ol60Var.f(new fwj0(str2));
        }
    }

    public final void x() {
        pek0 pek0Var = pek0.f26859a;
        ctf0 ctf0Var = this.d;
        this.C.f(new ewj0(new xdk0(pek0Var, ctf0Var.b.a(R.string.no_connection_title_with_hyphen, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.no_connection_description, Arrays.copyOf(new Object[0], 0)), null, null, null, 120)));
    }
}
