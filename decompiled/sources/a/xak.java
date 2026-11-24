package a;

import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final class xak implements vde0, w3n, tyn, egp, d3h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40559a;

    public /* synthetic */ xak(byte b) {
        this.f40559a = b;
    }

    public static urs p(int i) {
        Object next;
        c0o c0oVar = urs.g;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((urs) next).c != i);
        urs ursVar = (urs) next;
        return ursVar == null ? urs.BY_POPULAR : ursVar;
    }

    public static pll q(Integer num) {
        pll pllVar = pll.c;
        if (num.intValue() == 1) {
            return pllVar;
        }
        pll pllVar2 = pll.d;
        if (num.intValue() == 2) {
            return pllVar2;
        }
        return num.intValue() == 3 ? pll.e : pll.f;
    }

    public static tho r(Integer num) {
        Object next;
        c0o c0oVar = tho.j;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (true) {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
            int i = ((tho) next).f33971a;
            if (num != null && i == num.intValue()) {
                break;
            }
        }
        tho thoVar = (tho) next;
        return thoVar == null ? tho.h : thoVar;
    }

    @Override // a.d3h0
    public String a() {
        return "0";
    }

    @Override // a.d3h0
    public String b() {
        return "0";
    }

    @Override // a.tyn
    public Object c(String str, Provider provider) {
        switch (this.f40559a) {
            case 8:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // a.w3n
    public d4d e() {
        return d4d.STATIC_WHITE60;
    }

    @Override // a.w3n
    public long f(fet fetVar) {
        fetVar.e0(-201128723);
        long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
        fetVar.r(false);
        return jM123getWhite0d7_KjU;
    }

    @Override // a.w3n
    public long g(fet fetVar) {
        fetVar.e0(1635893091);
        long jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
        fetVar.r(false);
        return jM121getTransparent0d7_KjU;
    }

    @Override // a.vde0, a.b3u0
    public wsy getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // a.w3n
    public y9q0 h(fet fetVar) {
        fetVar.e0(1661810287);
        y9q0 y9q0VarS = ibm0.s(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar);
        fetVar.r(false);
        return y9q0VarS;
    }

    @Override // a.d3h0
    public boolean i() {
        return false;
    }

    @Override // a.d3h0
    public boolean j() {
        return false;
    }

    @Override // a.w3n
    public y9q0 k(fet fetVar) {
        fetVar.e0(-787184384);
        y9q0 y9q0VarS = ibm0.s(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar);
        fetVar.r(false);
        return y9q0VarS;
    }

    @Override // a.egp
    public boolean l(xii0 xii0Var) {
        return false;
    }

    @Override // a.w3n
    public y9q0 m(fet fetVar) {
        fetVar.e0(-578091326);
        y9q0 y9q0VarS = ibm0.s(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar);
        fetVar.r(false);
        return y9q0VarS;
    }

    public void o(mm40 mm40Var, GameBroadcastingParams gameBroadcastingParams, fet fetVar, int i) {
        mm40Var.getClass();
        fetVar.g0(-2059676076);
        int i2 = (fetVar.i(gameBroadcastingParams) ? 32 : 16) | i;
        if (fetVar.U(i2 & 1, (i2 & 17) != 16)) {
            rsr0.O(gameBroadcastingParams, fetVar, ((i2 >> 3) & 14) | 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(this, mm40Var, gameBroadcastingParams, i, (byte) 5);
        }
    }
}
