package a;

import android.javax.sip.message.Response;
import android.system.Os;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.crypto.KeyAgreement;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSurfaceType;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ghm0 {
    public static ECPoint A(EllipticCurve ellipticCurve, eix0 eix0Var, byte[] bArr) throws GeneralSecurityException {
        int iV = v(ellipticCurve);
        int iOrdinal = eix0Var.ordinal();
        boolean z = false;
        if (iOrdinal == 0) {
            if (bArr.length != (iV * 2) + 1) {
                hny.o("invalid point size");
                return null;
            }
            if (bArr[0] != 4) {
                hny.o("invalid point format");
                return null;
            }
            int i = iV + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i)), new BigInteger(1, Arrays.copyOfRange(bArr, i, bArr.length)));
            m4x0.g(eCPoint, ellipticCurve);
            return eCPoint;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new GeneralSecurityException("invalid format:".concat(String.valueOf(eix0Var)));
            }
            if (bArr.length != iV * 2) {
                hny.o("invalid point size");
                return null;
            }
            ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOf(bArr, iV)), new BigInteger(1, Arrays.copyOfRange(bArr, iV, bArr.length)));
            m4x0.g(eCPoint2, ellipticCurve);
            return eCPoint2;
        }
        BigInteger bigIntegerD = m4x0.d(ellipticCurve);
        if (bArr.length != iV + 1) {
            hny.o("compressed point has wrong length");
            return null;
        }
        byte b = bArr[0];
        if (b != 2) {
            if (b != 3) {
                hny.o("invalid format");
                return null;
            }
            z = true;
        }
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
        if (bigInteger.signum() != -1 && bigInteger.compareTo(bigIntegerD) < 0) {
            return new ECPoint(bigInteger, x(bigInteger, z, ellipticCurve));
        }
        hny.o("x is out of range");
        return null;
    }

    public static byte[] B(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        try {
            if (!m4x0.h(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w = eCPublicKey.getW();
            m4x0.g(w, eCPrivateKey.getParams().getCurve());
            PublicKey publicKeyGeneratePublic = ((KeyFactory) gix0.f.f11371a.zza("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
            KeyAgreement keyAgreement = (KeyAgreement) gix0.d.f11371a.zza("ECDH");
            keyAgreement.init(eCPrivateKey);
            try {
                keyAgreement.doPhase(publicKeyGeneratePublic, true);
                byte[] bArrGenerateSecret = keyAgreement.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
                if (bigInteger.signum() == -1 || bigInteger.compareTo(m4x0.d(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                x(bigInteger, true, curve);
                return bArrGenerateSecret;
            } catch (IllegalStateException e) {
                throw new GeneralSecurityException(e);
            }
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    public static final void a(mm40 mm40Var, p3w p3wVar, Function2 function2, Function2 function3, Function2 function4, Function2 function5, fet fetVar, int i) {
        int i2;
        Function2 function6;
        fetVar.g0(-322980375);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(p3wVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function5) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 74899) != 74898)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40.b);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            mm40 mm40VarE0 = o2e.e0(ohs0.i(fetVar, mm40VarC1, shdVar4, 1.0f, true), "ContainerCaseColumnTag");
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE0);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            String str = p3wVar.c;
            y9q0 y9q0VarH = g1t0.h();
            zfn zfnVar = zaq0.b;
            v8q0.a(str, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarH, fetVar, 0, 24960, 110586);
            v8q0.a(p3wVar.d, null, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.j(), fetVar, 0, 24960, 110586);
            fetVar.r(true);
            if (function2 == null) {
                fetVar.e0(2079835734);
                fetVar.r(false);
            } else {
                fetVar.e0(-210003189);
                h97.q((i3 >> 6) & 14, fetVar, function2, false);
            }
            if (function3 == null) {
                fetVar.e0(2079869462);
                fetVar.r(false);
            } else {
                fetVar.e0(-210002101);
                h97.q((i3 >> 9) & 14, fetVar, function3, false);
            }
            if (function5 == null) {
                fetVar.e0(2079903190);
                fetVar.r(false);
                function6 = function5;
            } else {
                fetVar.e0(-210001013);
                function6 = function5;
                h97.q((i3 >> 15) & 14, fetVar, function6, false);
            }
            fetVar.r(true);
            if (function4 == null) {
                fetVar.e0(-850155238);
                fetVar.r(false);
            } else {
                fetVar.e0(1635143623);
                h97.q((i3 >> 12) & 14, fetVar, function4, false);
            }
            fetVar.r(true);
        } else {
            function6 = function5;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) mm40Var, (Object) p3wVar, (Object) function2, (Object) function3, (Object) function4, (Object) function6, i, (byte) 29);
        }
    }

    public static final void b(p3w p3wVar, fet fetVar, int i) {
        int i2;
        byte b;
        jm40 jm40Var;
        fetVar.g0(-1778478111);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(p3wVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.n(jm40Var2, 48.0f), ((ThemeColors) fetVar.k(zfnVar)).getBackground(), vgg0.f37379a);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            tvw tvwVar = p3wVar.k;
            if (tvwVar.equals(qvw.f29409a)) {
                fetVar.e0(-1353999144);
                jm40Var = jm40Var2;
                j0x.b(a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar), null, o7k0.n(jm40Var2, 24.0f), null, null, 0.0f, new m78(((ThemeColors) fetVar.k(zfnVar)).getSecondary(), 5), fetVar, 56, 56);
                fetVar.r(false);
            } else {
                jm40Var = jm40Var2;
                if (tvwVar instanceof rvw) {
                    fetVar.e0(-1353598500);
                    lgb.s(o7k0.n(jm40Var, 24.0f), ((rvw) tvwVar).f31190a, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fetVar);
                    fetVar.r(false);
                } else {
                    if (!(tvwVar instanceof svw)) {
                        throw b1j.f(1895982681, fetVar, false);
                    }
                    fetVar.e0(-1353233134);
                    j0x.b(a8k0.F(((svw) tvwVar).f32891a, 0, fetVar), null, o7k0.n(jm40Var, 24.0f), null, null, 0.0f, new m78(((ThemeColors) fetVar.k(zfnVar)).getSecondary(), 5), fetVar, 56, 56);
                    fetVar.r(false);
                }
            }
            mm40 mm40VarQ2 = ffb0.Q(o7k0.n(jr8.f16991a.b(jm40Var, gqw0.i), 20.0f), 2.0f, 2.0f);
            boolean zF = fetVar.f(backgroundContent);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new r2a0((byte) 20, backgroundContent);
                fetVar.o0(objP);
            }
            j0x.b(a8k0.F(p3wVar.q, 0, fetVar), null, rq8.K(mm40VarQ2, (Function1) objP), null, null, 0.0f, null, fetVar, 56, 120);
            b = 1;
            fetVar.r(true);
        } else {
            b = 1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pcd(p3wVar, i, b);
        }
    }

    public static final void c(mm40 mm40Var, exs0 exs0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-109773324);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(exs0Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            fxs0 fxs0Var = exs0Var.f8594a;
            h(null, fxs0Var.b, fxs0Var.c, fxs0Var.f10326a, fetVar2, 0, 1);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            fxs0 fxs0Var2 = exs0Var.b;
            h(mm40VarN, fxs0Var2.b, fxs0Var2.c, fxs0Var2.f10326a, fetVar, 0, 0);
            v8q0.a(exs0Var.g, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0((Object) mm40Var, (Object) exs0Var, i, (byte) 13);
        }
    }

    public static final void d(mm40 mm40Var, n5l0 n5l0Var, fet fetVar, int i) {
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(-938779742);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(n5l0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 28.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
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
            e(null, n5l0Var.f22949a, n5l0Var.f, n5l0Var.e, fetVar2, 0, 1);
            jm40 jm40Var = jm40.b;
            e(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), n5l0Var.b, n5l0Var.g, n5l0Var.d, fetVar, 0, 0);
            b = 1;
            v8q0.a(n5l0Var.c, o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar), fetVar, 0, 24960, 109564);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iws0(mm40Var, n5l0Var, i, b);
        }
    }

    public static final void e(mm40 mm40Var, String str, boolean z, y3d y3dVar, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        fet fetVar2;
        y9q0 y9q0Var;
        fetVar.g0(717394506);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        int i5 = i3 | (fetVar.g(str) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.g(y3dVar) ? 2048 : 1024);
        if (fetVar.U(i5 & 1, (i5 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            if (i4 != 0) {
                mm40Var2 = jm40Var;
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var2, 16.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            if (z) {
                y9q0Var = new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
            } else {
                y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            }
            fetVar.e0(196367734);
            fetVar.r(false);
            v8q0.a(str, mm40VarB, y3dVar.f41946a, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0Var, fetVar, (i5 >> 3) & 14, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jws0(mm40Var2, str, z, y3dVar, i, i2, (byte) 1);
        }
    }

    public static final void f(String str, String str2, fet fetVar, int i) {
        String str3;
        fet fetVar2 = fetVar;
        fetVar2.g0(1803972215);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40.b, 36.0f);
            zfn zfnVar = zaq0.b;
            long separator60 = ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS = i120.S(mm40VarN, 1.0f, separator60, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
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
            long secondary80 = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary80();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, null, secondary80, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, i2 & 14, 24960, 110586);
            long textPrimary = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            str3 = str2;
            v8q0.a(str3, null, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, (i2 >> 3) & 14, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            str3 = str2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 19, i, str, str3);
        }
    }

    public static final void g(mm40 mm40Var, doh dohVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(141531862);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(dohVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(mm40Var, 38.0f, 114.0f);
            x5d x5dVarA = w5d.a(uc9.g, gqw0.n, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarP);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            f(dohVar.f, dohVar.g, fetVar, 0);
            f(dohVar.h, dohVar.i, fetVar, 0);
            f(dohVar.j, dohVar.k, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) mm40Var, (Object) dohVar, i, (byte) 15);
        }
    }

    public static final void h(mm40 mm40Var, c280 c280Var, d280 d280Var, String str, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        fet fetVar2;
        mm40 mm40Var3;
        fetVar.g0(-1026509267);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        int i5 = i3 | (fetVar.g(c280Var) ? 32 : 16) | (fetVar.g(d280Var) ? 256 : 128) | (fetVar.g(str) ? 2048 : 1024);
        if (fetVar.U(i5 & 1, (i5 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40Var3 = i4 != 0 ? jm40Var : mm40Var2;
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var3, 16.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            boolean z = (i5 & 112) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.l, c280Var);
                fetVar.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar.g(u6nVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar.o0(objP2);
            }
            kkb.p(1, fetVar, null, (Function0) objP2);
            if (d280Var != null) {
                fetVar.e0(1949570446);
                boolean z2 = (i5 & 896) == 256;
                Object objP3 = fetVar.P();
                if (z2 || objP3 == cl5Var) {
                    objP3 = new u6n(d4d.SECONDARY60, w6n.l, d280Var);
                    fetVar.o0(objP3);
                }
                u6n u6nVar2 = (u6n) objP3;
                mm40 mm40VarN = s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14);
                boolean zG2 = fetVar.g(u6nVar2);
                Object objP4 = fetVar.P();
                if (zG2 || objP4 == cl5Var) {
                    objP4 = new d1n(u6nVar2, (byte) 1);
                    fetVar.o0(objP4);
                }
                kkb.p(0, fetVar, mm40VarN, (Function0) objP4);
                fetVar.r(false);
            } else {
                fetVar.e0(1949980793);
                fetVar.r(false);
            }
            v8q0.a(str, dw9.h(1.0f, s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), true), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, (i5 >> 9) & 14, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new brc0(mm40Var3, c280Var, d280Var, str, i, i2, (byte) 6);
        }
    }

    public static final void i(mm40 mm40Var, p3w p3wVar, Function1 function1, fet fetVar, int i) {
        int i2;
        ugd ugdVarM;
        ugd ugdVarM2;
        ugd ugdVarM3;
        function1.getClass();
        fetVar.g0(1362357223);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(p3wVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            b(p3wVar, fetVar, (i2 >> 3) & 14);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            ugd ugdVarM4 = null;
            if (p3wVar.h) {
                fetVar.e0(-658156059);
                ugdVarM = u1c.M(-2016995212, new mcd(p3wVar, function1, b), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-657116877);
                fetVar.r(false);
                ugdVarM = null;
            }
            if (p3wVar.o) {
                fetVar.e0(-656985189);
                ugdVarM2 = u1c.M(1310011155, new mcd(function1, p3wVar, (byte) 5), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-656028653);
                fetVar.r(false);
                ugdVarM2 = null;
            }
            if (p3wVar.f.isEmpty()) {
                fetVar.e0(-654156749);
                fetVar.r(false);
                ugdVarM3 = null;
            } else {
                fetVar.e0(-655867670);
                ugdVarM3 = u1c.M(342050226, new c61(p3wVar, (byte) 11), fetVar);
                fetVar.r(false);
            }
            if (p3wVar.w) {
                fetVar.e0(-654023077);
                ugdVarM4 = u1c.M(-625910703, new mcd(function1, p3wVar, (byte) 6), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-653005037);
                fetVar.r(false);
            }
            a(mm40VarN, p3wVar, ugdVarM, ugdVarM2, ugdVarM3, ugdVarM4, fetVar, i2 & 112);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ncd(mm40Var, p3wVar, function1, i, (byte) 1);
        }
    }

    public static final void j(mm40 mm40Var, jjm jjmVar, fet fetVar, int i) {
        fetVar.g0(-1261982309);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(jjmVar) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            nkb.h(s5x0.L(mm40Var, 8.0f, 0.0f, 2), jjmVar, kjm.f18392a, null, null, null, fetVar, (i2 & 112) | 384, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jfs0(mm40Var, jjmVar, i, b);
        }
    }

    public static final void k(mm40 mm40Var, exs0 exs0Var, fet fetVar, int i) {
        fetVar.g0(-1218938895);
        int i2 = i | 6 | (fetVar.g(exs0Var) ? 32 : 16);
        byte b = 18;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD, 8.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            c(dw9.h(1.0f, s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), true), exs0Var, fetVar, i2 & 112);
            gad gadVar = exs0Var.f;
            n5l0 n5l0Var = exs0Var.e;
            n5l0 n5l0Var2 = exs0Var.c;
            n5l0 n5l0Var3 = exs0Var.d;
            kbc.t(null, gadVar, fetVar, 0);
            if (n5l0Var3 != null) {
                fetVar.e0(293086864);
                d(s5x0.L(jm40Var, 4.0f, 0.0f, 2), n5l0Var3, fetVar, 0);
                idx.o(0, fetVar, null);
                fetVar.r(false);
            } else {
                fetVar.e0(293276181);
                fetVar.r(false);
            }
            if (n5l0Var2 != null) {
                fetVar.e0(293322929);
                d(s5x0.L(jm40Var, 4.0f, 0.0f, 2), n5l0Var2, fetVar, 0);
                idx.o(0, fetVar, null);
                fetVar.r(false);
            } else {
                fetVar.e0(293511285);
                fetVar.r(false);
            }
            if (n5l0Var != null) {
                fetVar.e0(293560110);
                d(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), n5l0Var, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(293720597);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(mm40Var, exs0Var, i, b);
        }
    }

    public static final void l(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-2134697724);
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 48.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 29);
        }
    }

    public static final void m(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var) {
        l7m0Var.getClass();
        fetVar.g0(-1146559977);
        int i2 = (fetVar.g(l7m0Var) ? 32 : 16) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new mqr0(l7m0Var, (byte) 11);
                fetVar.o0(objP);
            }
            p8a.k(mm40Var, (Function1) objP, fetVar, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e2s(mm40Var, l7m0Var, i, (byte) 9);
        }
    }

    public static final void n(lc00 lc00Var, ctf0 ctf0Var, ArrayList arrayList) {
        ctf0Var.getClass();
        String strA = ctf0Var.b.a(R.string.my_special_event_games, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        lc00Var.add(new eok0(new hjm(strA, null, new y3d(s6t0.b().f33626a.getTextPrimary()), null, null, null, false, null, null, false, null, null, 8186), null, i9h0.f14386a));
        lc00Var.addAll(arrayList);
        ar40 ar40Var = ar40.e;
        lc00Var.add(m2x.t(ctf0Var, R.string.news_matches, ar40Var, ar40Var));
    }

    public static final List o(List list, Integer num, ctf0 ctf0Var, v5l0 v5l0Var, Locale locale, boolean z) {
        list.getClass();
        ctf0Var.getClass();
        if (list.isEmpty()) {
            return iun.f15405a;
        }
        lsm0 lsm0Var = ctf0Var.b;
        return q3d.j(new m9p0("HEADER_RESULTS", new hjm(lsm0Var.a(R.string.champ_results, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166)), ihm0.g(list, locale, num), ihm0.h(list, ctf0Var, locale, num, q0s.b, v5l0Var, z));
    }

    public static final zct0 p(fn9 fn9Var, ctf0 ctf0Var) {
        List list;
        List list2;
        ctf0Var.getClass();
        boolean z = (fn9Var == null || (list2 = fn9Var.r) == null) ? false : !jiq0.p0(list2).isEmpty();
        boolean zK = (fn9Var == null || (list = fn9Var.r) == null) ? false : vsm0.k(list);
        long j = fn9Var != null ? fn9Var.c : 0L;
        long j2 = fn9Var != null ? fn9Var.b : -1L;
        if (j > 0 && j2 == 46 && z && zK) {
            return new zct0(new gy30(new ux30(14, 0L, ctf0Var.b.a(R.string.stage_net, Arrays.copyOf(new Object[0], 0)), (String) null), new rx30(new m0x(R.drawable.ic_glyph_grid, null, 6), 0L, null, R.drawable.ic_glyph_grid, 0L, null, Response.BAD_GATEWAY), cy30.f5153a, 0L, null, null, 248));
        }
        return null;
    }

    public static String q(String str) {
        str.getClass();
        bzu bzuVar = new bzu((byte) 23);
        bzuVar.g("static");
        bzuVar.g("img");
        bzuVar.g("ImgDefault");
        bzuVar.g("Actions");
        axq.u(bzuVar, "EveryDayTournament", "background", str);
        return ((StringBuilder) bzuVar.b).toString();
    }

    public static final void r(jbs0 jbs0Var, Throwable th) throws Throwable {
        yyb0 yyb0Var = ((sd90) jbs0Var).c;
        Thread threadCurrentThread = Thread.currentThread();
        long id = threadCurrentThread.getId();
        ncq0 ncq0VarC = yyb0Var.e;
        ncq0 ncq0Var = yyb0Var.f;
        if (ncq0VarC == null || ncq0VarC.d != id) {
            if (ncq0Var == null || ncq0Var.d != id) {
                ncq0VarC = yyb0Var.c(id, Os.gettid(), threadCurrentThread.getName());
                yyb0Var.f = yyb0Var.e;
                yyb0Var.e = ncq0VarC;
            } else {
                ncq0VarC = ncq0Var;
            }
        }
        dvn dvnVar = ncq0VarC.f43921a;
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            stackTraceElement.getClassName();
            stackTraceElement.getMethodName();
            stackTraceElement.getFileName();
            stackTraceElement.getLineNumber();
        }
        throw th;
    }

    public static final String s(TennisSurfaceType tennisSurfaceType, ctf0 ctf0Var) {
        tennisSurfaceType.getClass();
        ctf0Var.getClass();
        int iOrdinal = tennisSurfaceType.ordinal();
        if (iOrdinal == 0) {
            return ctf0Var.f(R.string.filter_all, new Object[0]);
        }
        if (iOrdinal == 1) {
            return ctf0Var.f(R.string.tennis_surface_type_clay, new Object[0]);
        }
        if (iOrdinal == 2) {
            return ctf0Var.f(R.string.tennis_surface_type_grass, new Object[0]);
        }
        if (iOrdinal == 3) {
            return ctf0Var.f(R.string.tennis_surface_type_hard, new Object[0]);
        }
        if (iOrdinal == 4) {
            return ctf0Var.f(R.string.tennis_surface_type_carpet, new Object[0]);
        }
        if (iOrdinal == 5) {
            return ctf0Var.f(R.string.multiselect, new Object[0]);
        }
        t9f.b();
        return null;
    }

    public static final sso0 t(xpl xplVar) {
        int iOrdinal = xplVar.ordinal();
        if (iOrdinal == 0) {
            return nso0.f24059a;
        }
        if (iOrdinal == 1) {
            return bqo0.f3042a;
        }
        if (iOrdinal == 2) {
            return xpo0.f41280a;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public static final o0u0 u(v0u0 v0u0Var) {
        ?? arrayList;
        v0u0Var.getClass();
        Integer num = v0u0Var.f36600a;
        int iIntValue = num != null ? num.intValue() : -1;
        Boolean bool = v0u0Var.b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        List list = v0u0Var.c;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                s0u0 s0u0Var = (s0u0) it.next();
                s0u0Var.getClass();
                Integer num2 = s0u0Var.f31427a;
                int iIntValue2 = num2 != null ? num2.intValue() : -1;
                Integer num3 = s0u0Var.b;
                int iIntValue3 = num3 != null ? num3.intValue() : -1;
                Integer num4 = s0u0Var.c;
                int iIntValue4 = num4 != null ? num4.intValue() : -1;
                Integer num5 = s0u0Var.d;
                int iIntValue5 = num5 != null ? num5.intValue() : -1;
                Integer num6 = s0u0Var.e;
                int iIntValue6 = num6 != null ? num6.intValue() : -1;
                Integer num7 = s0u0Var.f;
                int iIntValue7 = num7 != null ? num7.intValue() : -1;
                Integer num8 = s0u0Var.g;
                int iIntValue8 = num8 != null ? num8.intValue() : -1;
                Integer num9 = s0u0Var.h;
                int iIntValue9 = num9 != null ? num9.intValue() : -1;
                Integer num10 = s0u0Var.i;
                int iIntValue10 = num10 != null ? num10.intValue() : -1;
                Integer num11 = s0u0Var.j;
                int iIntValue11 = num11 != null ? num11.intValue() : -1;
                String str = s0u0Var.k;
                if (str == null) {
                    str = "";
                }
                Iterator it2 = it;
                String str2 = s0u0Var.l;
                String str3 = str2 == null ? "" : str2;
                Integer num12 = s0u0Var.m;
                int iIntValue12 = num12 != null ? num12.intValue() : -1;
                Integer num13 = s0u0Var.n;
                int iIntValue13 = num13 != null ? num13.intValue() : -1;
                Integer num14 = s0u0Var.o;
                arrayList.add(new p0u0(iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, iIntValue8, iIntValue9, iIntValue10, iIntValue11, str, str3, iIntValue12, iIntValue13, num14 != null ? num14.intValue() : -1));
                it = it2;
            }
        } else {
            arrayList = iun.f15405a;
        }
        return new o0u0(iIntValue, arrayList, zBooleanValue);
    }

    public static int v(EllipticCurve ellipticCurve) {
        return (m4x0.d(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static String w(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static BigInteger x(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerD = m4x0.d(ellipticCurve);
        BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(bigIntegerD);
        if (bigIntegerD.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerD);
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        if (!bigIntegerMod2.equals(bigIntegerAdd)) {
            if (bigIntegerD.testBit(0) && bigIntegerD.testBit(1)) {
                bigIntegerAdd = bigIntegerMod2.modPow(bigIntegerD.add(BigInteger.ONE).shiftRight(2), bigIntegerD);
            } else if (!bigIntegerD.testBit(0) || bigIntegerD.testBit(1)) {
                bigIntegerAdd = null;
            } else {
                bigIntegerAdd = BigInteger.ONE;
                BigInteger bigIntegerShiftRight = bigIntegerD.subtract(bigIntegerAdd).shiftRight(1);
                int i = 0;
                while (true) {
                    BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerD);
                    if (!bigIntegerMod3.equals(BigInteger.ZERO)) {
                        BigInteger bigIntegerModPow = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerD);
                        BigInteger bigIntegerMod4 = BigInteger.ONE;
                        if (bigIntegerModPow.add(bigIntegerMod4).equals(bigIntegerD)) {
                            BigInteger bigIntegerShiftRight2 = bigIntegerD.add(bigIntegerMod4).shiftRight(1);
                            BigInteger bigIntegerMod5 = bigIntegerAdd;
                            for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                                BigInteger bigIntegerMultiply = bigIntegerMod5.multiply(bigIntegerMod4);
                                bigIntegerMod5 = bigIntegerMod5.multiply(bigIntegerMod5).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerD).multiply(bigIntegerMod3)).mod(bigIntegerD);
                                BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerD);
                                if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                    BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerD);
                                    bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerD);
                                    bigIntegerMod5 = bigIntegerMod7;
                                } else {
                                    bigIntegerMod4 = bigIntegerMod6;
                                }
                            }
                            bigIntegerAdd = bigIntegerMod5;
                        } else {
                            if (!bigIntegerModPow.equals(bigIntegerMod4)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                            bigIntegerAdd = bigIntegerAdd.add(bigIntegerMod4);
                            i++;
                            if (i == 128 && !bigIntegerD.isProbablePrime(80)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    }
                }
            }
            if (bigIntegerAdd != null && bigIntegerAdd.multiply(bigIntegerAdd).mod(bigIntegerD).compareTo(bigIntegerMod2) != 0) {
                hny.o("Could not find a modular square root");
                return null;
            }
        }
        return z != bigIntegerAdd.testBit(0) ? bigIntegerD.subtract(bigIntegerAdd).mod(bigIntegerD) : bigIntegerAdd;
    }

    public static KeyPair y(ECParameterSpec eCParameterSpec) throws InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) gix0.e.f11371a.zza("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static ECParameterSpec z(fix0 fix0Var) throws NoSuchAlgorithmException {
        int iOrdinal = fix0Var.ordinal();
        if (iOrdinal == 0) {
            return m4x0.f21196a;
        }
        if (iOrdinal == 1) {
            return m4x0.b;
        }
        if (iOrdinal == 2) {
            return m4x0.c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(String.valueOf(fix0Var)));
    }
}
