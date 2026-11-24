package a;

import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k9m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f17920a;

    static {
        zcl zclVar = qmk.f28987a;
        f17920a = 40.0f;
    }

    public static final void a(mm40 mm40Var, l9m l9mVar, fet fetVar, int i, int i2) {
        int i3;
        l9mVar.getClass();
        fetVar.g0(-1293224365);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(l9mVar) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            if (!(l9mVar instanceof l9m)) {
                throw b1j.f(-1543059966, fetVar, false);
            }
            fetVar.e0(-1543040287);
            b(mm40Var, l9mVar.f19660a, l9mVar.b, fetVar, i3 & 14);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02(mm40Var2, (Object) l9mVar, i, i2, (byte) 11);
        }
    }

    public static final void b(mm40 mm40Var, n0x n0xVar, y3d y3dVar, fet fetVar, int i) {
        int i2;
        y3d y3dVar2;
        fetVar.g0(2089474773);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(n0xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(R.drawable.ic_glyph_mobile_legends) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            y3dVar2 = y3dVar;
            i2 |= fetVar.g(y3dVar2) ? 16384 : 8192;
        } else {
            y3dVar2 = y3dVar;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(mm40Var, f17920a, 40.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar2, zclVar2, zclVar2, zclVar2);
            mm40 mm40VarJ = lgb.J(mm40VarP, ugg0Var2);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarS = i120.S(mm40VarJ, 1.0f, StaticColors.INSTANCE.m125getWhite100d7_KjU(), ugg0Var2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            int i3 = i2;
            int i4 = i3 << 3;
            rq8.b(lgb.J(o7k0.n(jm40Var, 32.0f), vgg0.a(8.0f)), s5x0.J(i120.Q(o7k0.n(jm40Var, 32.0f), ((StaticColors) fetVar.k(m8m0.f21378a)).m125getWhite100d7_KjU(), vgg0.a(8.0f)), 4.0f), n0xVar, R.drawable.ic_glyph_mobile_legends, y3dVar2, null, null, gqw0.A, null, fetVar, (i4 & 7168) | (i4 & 896) | 12582912 | (57344 & i3) | ((i3 << 6) & 458752), 320);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) n0xVar, (Object) y3dVar, i, (byte) 14);
        }
    }
}
