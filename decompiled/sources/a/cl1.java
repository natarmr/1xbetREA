package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/cl1;", "La/iw5;", "<init>", "()V", "a/gfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cl1 extends iw5 {
    public fiu0 m2;
    public static final /* synthetic */ iiy[] p2 = {new ez40(cl1.class, "tournamentId", "getTournamentId()J", 0), new ez40(cl1.class, "tournamentName", "getTournamentName()Ljava/lang/String;", 0)};
    public static final gfk0 o2 = new gfk0((byte) 18);
    public final r34 k2 = new r34("TOURNAMENT_ID_KEY");
    public final phf0 l2 = new phf0("TOURNAMENT_NAME_KEY");
    public final a8z n2 = xbc.b0(this, sre0.f32672a.b(gl1.class), new yk1(this, 0));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(1461039602);
        pz40 pz40VarY = ((i3t0) ((k3t0) this.n2.getValue())).y(fetVar);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-866935199, new v7i0(pz40VarY, (byte) 7), fetVar), u1c.M(-1123333079, new zk1(this, (byte) 1), fetVar), u1c.M(-710693021, new bl1(this, pz40VarY, (byte) 0), fetVar), 2);
        fetVar.r(false);
        return bw5Var;
    }

    public final void P0(int i, fet fetVar) {
        fetVar.g0(638102624);
        int i2 = i & 1;
        byte b = 1;
        if (fetVar.U(i2, i2 != 0)) {
            boolean z = ((k6z) fetVar.k(bmd.n)) == k6z.b;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 8.0f, 14.0f, 8.0f, 0.0f, 8);
            boolean zH = fetVar.h(z);
            Object objP = fetVar.P();
            if (zH || objP == ukd.f35823a) {
                objP = new z(b, z);
                fetVar.o0(objP);
            }
            j0x.b(a8k0.F(R.drawable.ic_glyph_arrow_right, 0, fetVar), null, i4w0.T(mm40VarN, (Function1) objP), null, null, 0.0f, new m78(((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), 5), fetVar, 56, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o00(this, i, (byte) 17);
        }
    }

    public final void Q0(int i, int i2, fet fetVar, int i3) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1392792273);
        int i4 = i3 | (fetVar2.e(i) ? 4 : 2) | (fetVar2.e(i2) ? 32 : 16) | (fetVar2.i(this) ? 256 : 128);
        if (fetVar2.U(i4 & 1, (i4 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.s(jm40Var, 88.0f), "SLOT_ITEM_COLUMN");
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar2, 6);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarE1 = o2e.e0(o7k0.n(jm40Var, 42.0f).e(new wkw(gqw0.n)), "SLOT_ITEM_ICON");
            pm80 pm80VarF = a8k0.F(i, i4 & 14, fetVar2);
            zfn zfnVar = zaq0.b;
            j0x.b(pm80VarF, null, mm40VarE1, null, null, 0.0f, new m78(((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), 5), fetVar2, 56, 56);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 10.0f, 0.0f, 0.0f, 13);
            String strH = H(i2);
            strH.getClass();
            v8q0.a(strH, mm40VarN, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new al1(this, i, i2, i3);
        }
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(xk1.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            xk1 xk1Var = (xk1) (ze3Var instanceof xk1 ? ze3Var : null);
            if (xk1Var != null) {
                iiy[] iiyVarArr = p2;
                Long lN = this.k2.n(this, iiyVarArr[0]);
                String strN = this.l2.n(this, iiyVarArr[1]);
                strN.getClass();
                ctf0 ctf0Var = xk1Var.f41011a;
                cad cadVar = xk1Var.b;
                gst0 gst0Var = xk1Var.c;
                btt0 btt0Var = xk1Var.d;
                gii0 gii0Var = xk1Var.e;
                knf0 knf0Var = xk1Var.f;
                x0u x0uVar = xk1Var.g;
                r9s0 r9s0Var = xk1Var.h;
                wsf0 wsf0Var = xk1Var.i;
                ctf0Var.getClass();
                gst0Var.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                r9s0Var.getClass();
                this.m2 = new fiu0(Collections.singletonMap(gl1.class, (f7i) new daf(cadVar, wsf0Var, lN, strN, gst0Var, btt0Var, gii0Var, knf0Var, x0uVar, r9s0Var).m));
                return;
            }
        }
        jf4.n(b1j.i(xk1.class, "Cannot create dependency "));
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
    }
}
