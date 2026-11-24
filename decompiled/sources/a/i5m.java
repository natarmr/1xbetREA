package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i5m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugg0 f14198a;

    static {
        zcl zclVar = qmk.m;
        ugg0 ugg0Var = vgg0.f37379a;
        f14198a = new ugg0(zclVar, zclVar, zclVar, zclVar);
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        mm40 mm40Var2;
        function0.getClass();
        fetVar.g0(1414259544);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = mm40Var;
            mm40 mm40VarO = feb.O(o7k0.n(mm40Var2, 28.0f), function0);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarO);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(o7k0.n(jm40Var, 18.0f), f14198a);
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarQ = i120.Q(mm40VarJ, ((StaticColors) fetVar.k(zfnVar)).m126getWhite200d7_KjU(), jd8.n);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarE0 = o2e.e0(o7k0.n(jm40Var, 12.0f), "FavoriteButtonTestTag");
            boolean z3 = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new z((byte) 20, z);
                fetVar.o0(objP);
            }
            dww.c(a8k0.F(z ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive, 0, fetVar), null, pai0.a(mm40VarE0, false, (Function1) objP), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), fetVar, 56, 0);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5a(mm40Var2, z, function0, i, (byte) 2);
        }
    }
}
