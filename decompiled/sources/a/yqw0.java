package a;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yqw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43095a;

    public final atm0 a(fpw0 fpw0Var, Integer num) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        fix0 fix0Var;
        byte[] bArr;
        icw0 icw0VarA;
        rkt0 rkt0Var;
        switch (this.f43095a) {
            case 0:
                brw0 brw0Var = (brw0) fpw0Var;
                int i = brw0Var.f3100a;
                if (i != 16 && i != 32) {
                    hny.o("AES key size must be 16 or 32 bytes");
                    return null;
                }
                h0q0 h0q0Var = new h0q0();
                h0q0Var.b = null;
                h0q0Var.c = null;
                h0q0Var.f12247a = brw0Var;
                h0q0Var.d = num;
                h0q0Var.b = rkt0.h(i);
                h0q0Var.c = rkt0.h(brw0Var.b);
                return h0q0Var.C();
            case 1:
                jrw0 jrw0Var = (jrw0) fpw0Var;
                int i2 = jrw0Var.f17024a;
                if (i2 == 24) {
                    hny.o("192 bit AES EAX Parameters are not valid");
                    return null;
                }
                l8w0 l8w0Var = new l8w0();
                l8w0Var.b = null;
                l8w0Var.f19624a = jrw0Var;
                l8w0Var.c = num;
                l8w0Var.b = rkt0.h(i2);
                return l8w0Var.c();
            case 2:
                mrw0 mrw0Var = (mrw0) fpw0Var;
                int i3 = mrw0Var.f22292a;
                if (i3 == 24) {
                    hny.o("192 bit AES GCM Parameters are not valid");
                    return null;
                }
                cmt0 cmt0Var = new cmt0();
                cmt0Var.b = null;
                cmt0Var.f4625a = mrw0Var;
                cmt0Var.c = num;
                cmt0Var.b = rkt0.h(i3);
                return cmt0Var.d();
            case 3:
                srw0 srw0Var = (srw0) fpw0Var;
                mpt0 mpt0Var = new mpt0((byte) 4);
                mpt0Var.c = null;
                mpt0Var.b = srw0Var;
                mpt0Var.d = num;
                mpt0Var.c = rkt0.h(srw0Var.f32700a);
                return mpt0Var.b();
            case 4:
                return trw0.v(((vrw0) fpw0Var).f37922a, rkt0.h(32), num);
            case 5:
                return osw0.v((msw0) fpw0Var, num);
            case 6:
                return usw0.v((tsw0) fpw0Var, num);
            case 7:
                return qtw0.v((xtw0) fpw0Var, rkt0.h(32), num);
            case 8:
                return cuw0.v(((muw0) fpw0Var).f22431a, rkt0.h(32), num);
            case 9:
                zyw0 zyw0Var = (zyw0) fpw0Var;
                yyw0.a(zyw0Var);
                mkt0 mkt0Var = new mkt0();
                mkt0Var.b = null;
                mkt0Var.f21959a = zyw0Var;
                mkt0Var.c = num;
                mkt0Var.b = rkt0.h(zyw0Var.f45226a);
                return mkt0Var.c();
            case 10:
                xzw0 xzw0Var = (xzw0) fpw0Var;
                vzw0 vzw0Var = xzw0Var.f41775a;
                if (vzw0Var == vzw0.b) {
                    eCParameterSpec = m4x0.f21196a;
                } else if (vzw0Var == vzw0.c) {
                    eCParameterSpec = m4x0.b;
                } else {
                    if (vzw0Var != vzw0.d) {
                        throw new GeneralSecurityException("Unsupported curve type: ".concat(String.valueOf(vzw0Var)));
                    }
                    eCParameterSpec = m4x0.c;
                }
                KeyPair keyPairY = ghm0.y(eCParameterSpec);
                return yzw0.v(f0x0.x(xzw0Var, ((ECPublicKey) keyPairY.getPublic()).getW(), num), new zas0(((ECPrivateKey) keyPairY.getPrivate()).getS(), (byte) 15));
            case 11:
                e0x0 e0x0Var = (e0x0) fpw0Var;
                d0x0 d0x0Var = e0x0Var.f7012a;
                if (d0x0Var.equals(d0x0.f)) {
                    byte[] bArrA = s7x0.a(32);
                    bArrA[0] = (byte) (bArrA[0] | 7);
                    byte b = (byte) (bArrA[31] & 63);
                    bArrA[31] = b;
                    bArrA[31] = (byte) (b | 128);
                    rkt0Var = new rkt0(icw0.a(bArrA), (byte) 11);
                    icw0VarA = icw0.a(dem0.x(bArrA));
                } else {
                    d0x0 d0x0Var2 = d0x0.e;
                    d0x0 d0x0Var3 = d0x0.d;
                    d0x0 d0x0Var4 = d0x0.c;
                    if (d0x0Var != d0x0Var4 && d0x0Var != d0x0Var3 && d0x0Var != d0x0Var2) {
                        if (d0x0Var != d0x0.g) {
                            hny.o("Unknown KEM ID");
                            return null;
                        }
                        Provider providerA0 = hew0.a0();
                        if (providerA0 == null) {
                            hny.o("Can't generate X-Wing key as Conscrypt is not available");
                            return null;
                        }
                        try {
                            if (KeyFactory.getInstance("XWING", providerA0).getKeySpec(KeyPairGenerator.getInstance("XWING", providerA0).generateKeyPair().getPublic(), v2x0.class) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e) {
                            throw new GeneralSecurityException("Can't generate X-Wing key", e);
                        }
                    }
                    byte[] bArr2 = c3x0.f3700a;
                    if (d0x0Var == d0x0Var4) {
                        fix0Var = fix0.f9611a;
                    } else if (d0x0Var == d0x0Var3) {
                        fix0Var = fix0.b;
                    } else {
                        if (d0x0Var != d0x0Var2) {
                            hny.o("Unrecognized NIST HPKE KEM identifier");
                            return null;
                        }
                        fix0Var = fix0.c;
                    }
                    KeyPair keyPairY2 = ghm0.y(ghm0.z(fix0Var));
                    ECPoint w = ((ECPublicKey) keyPairY2.getPublic()).getW();
                    EllipticCurve curve = ghm0.z(fix0Var).getCurve();
                    m4x0.g(w, curve);
                    int iV = ghm0.v(curve);
                    eix0 eix0Var = eix0.f7881a;
                    int iOrdinal = eix0Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            int i4 = iV + 1;
                            bArr = new byte[i4];
                            byte[] bArrF = ibm0.F(w.getAffineX());
                            System.arraycopy(bArrF, 0, bArr, i4 - bArrF.length, bArrF.length);
                            bArr[0] = (byte) (w.getAffineY().testBit(0) ? 3 : 2);
                        } else {
                            if (iOrdinal != 2) {
                                throw new GeneralSecurityException("invalid format:".concat(String.valueOf(eix0Var)));
                            }
                            int i5 = iV * 2;
                            bArr = new byte[i5];
                            byte[] bArrF2 = ibm0.F(w.getAffineX());
                            if (bArrF2.length > iV) {
                                bArrF2 = Arrays.copyOfRange(bArrF2, bArrF2.length - iV, bArrF2.length);
                            }
                            byte[] bArrF3 = ibm0.F(w.getAffineY());
                            if (bArrF3.length > iV) {
                                bArrF3 = Arrays.copyOfRange(bArrF3, bArrF3.length - iV, bArrF3.length);
                            }
                            System.arraycopy(bArrF3, 0, bArr, i5 - bArrF3.length, bArrF3.length);
                            System.arraycopy(bArrF2, 0, bArr, iV - bArrF2.length, bArrF2.length);
                        }
                    } else {
                        int i6 = (iV * 2) + 1;
                        byte[] bArr3 = new byte[i6];
                        byte[] bArrF4 = ibm0.F(w.getAffineX());
                        byte[] bArrF5 = ibm0.F(w.getAffineY());
                        System.arraycopy(bArrF5, 0, bArr3, i6 - bArrF5.length, bArrF5.length);
                        System.arraycopy(bArrF4, 0, bArr3, (iV + 1) - bArrF4.length, bArrF4.length);
                        bArr3[0] = 4;
                        bArr = bArr3;
                    }
                    icw0VarA = icw0.a(bArr);
                    rkt0Var = new rkt0(icw0.a(ibm0.G(((ECPrivateKey) keyPairY2.getPrivate()).getS(), c3x0.c(d0x0Var))), (byte) 11);
                }
                return g0x0.v(q0x0.v(e0x0Var, icw0VarA, num), rkt0Var);
            case 12:
                x4w0 x4w0Var = ((t5x0) fpw0Var).f33391a;
                a5x0 a5x0Var = a5x0.d;
                String str = (String) x4w0Var.b;
                l5x0 l5x0VarE = a5x0Var.e(str);
                if (!((Boolean) a5x0Var.b.get(str)).booleanValue()) {
                    hny.o("Creating new keys is not allowed.");
                    return null;
                }
                x4w0 x4w0VarD = x4w0.d(l5x0VarE.f19481a, lpw0.e, (sjw0) x4w0Var.f40287a);
                k6x0 k6x0Var = k6x0.b;
                atm0 atm0VarB = b6x0.b.b(k6x0Var.b(x4w0VarD), null);
                gfk0 gfk0Var = gfk0.h;
                vkr0 vkr0VarA = ((u7x0) k6x0Var.f17793a.get()).a(atm0VarB);
                vex0 vex0VarT = wex0.t();
                String str2 = (String) vkr0VarA.b;
                vex0VarT.d();
                wex0.w((wex0) vex0VarT.b, str2);
                sjw0 sjw0Var = (sjw0) vkr0VarA.c;
                vex0VarT.d();
                wex0.v((wex0) vex0VarT.b, sjw0Var);
                int iC = bcm0.C((hbb) vkr0VarA.d);
                vex0VarT.d();
                wex0.u((wex0) vex0VarT.b, iC);
                wex0 wex0Var = (wex0) vex0VarT.c();
                return new o5x0(vkr0.C(wex0Var.A(), wex0Var.z(), bcm0.E(wex0Var.x()), (lpw0) x4w0Var.c, num), gfk0Var);
            case 13:
                g8x0 g8x0Var = (g8x0) fpw0Var;
                int i7 = g8x0Var.f10885a;
                if (i7 != 32) {
                    hny.o("AesCmacKey size wrong, must be 32 bytes");
                    return null;
                }
                mkt0 mkt0Var2 = new mkt0();
                mkt0Var2.b = null;
                mkt0Var2.c = null;
                mkt0Var2.f21959a = g8x0Var;
                mkt0Var2.b = rkt0.h(i7);
                mkt0Var2.c = num;
                return mkt0Var2.d();
            default:
                p8x0 p8x0Var = (p8x0) fpw0Var;
                l8w0 l8w0Var2 = new l8w0();
                l8w0Var2.b = null;
                l8w0Var2.c = null;
                l8w0Var2.f19624a = p8x0Var;
                l8w0Var2.b = rkt0.h(p8x0Var.f26582a);
                l8w0Var2.c = num;
                return l8w0Var2.d();
        }
    }
}
