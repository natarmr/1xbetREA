package a;

import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vld0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f37616a = new zfn(new cbc0((byte) 24), (byte) 0);
    public static final zfn b = new zfn(pul.p, (byte) 0);

    public static final void a(int i, ugd ugdVar, fet fetVar, boolean z) {
        int i2;
        y9q0 y9q0VarO;
        long secondary10;
        fetVar.g0(-1140004326);
        if ((i & 6) == 0) {
            i2 = (fetVar.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                fetVar.e0(-1562339013);
                y9q0VarO = ibm0.l(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-1562288297);
                y9q0VarO = ibm0.o(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar);
                fetVar.r(false);
            }
            if (z) {
                fetVar.e0(-1562199947);
                secondary10 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                fetVar.r(false);
            } else {
                fetVar.e0(-1562143589);
                secondary10 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary10();
                fetVar.r(false);
            }
            obc.e(new l5d0[]{f37616a.a(y9q0VarO), b.a(new y3d(secondary10))}, ugdVar, fetVar, i2 & 112);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tld0(z, ugdVar, i, b2);
        }
    }
}
