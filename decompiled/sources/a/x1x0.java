package a;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x1x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y6x0 f40140a = new y6x0(xzw0.class, new epw0((byte) 27));
    public static final u6x0 b = new u6x0("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new tow0((byte) 28));
    public static final j5x0 c = new j5x0(f0x0.class, new qow0((byte) 28));
    public static final e5x0 d = new e5x0("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new zow0((byte) 28));
    public static final j5x0 e = new j5x0(yzw0.class, new vow0((byte) 28));
    public static final e5x0 f = new e5x0("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new cpw0((byte) 28));
    public static final okt0 g;
    public static final okt0 h;
    public static final okt0 i;

    static {
        fck0 fck0VarL = okt0.l();
        fck0VarL.A(mdx0.SHA1, uzw0.b);
        fck0VarL.A(mdx0.SHA224, uzw0.c);
        fck0VarL.A(mdx0.SHA256, uzw0.d);
        fck0VarL.A(mdx0.SHA384, uzw0.e);
        fck0VarL.A(mdx0.SHA512, uzw0.f);
        g = fck0VarL.p();
        fck0 fck0VarL2 = okt0.l();
        fck0VarL2.A(ddx0.NIST_P256, vzw0.b);
        fck0VarL2.A(ddx0.NIST_P384, vzw0.c);
        fck0VarL2.A(ddx0.NIST_P521, vzw0.d);
        fck0VarL2.A(ddx0.CURVE25519, vzw0.e);
        h = fck0VarL2.p();
        fck0 fck0VarL3 = okt0.l();
        fck0VarL3.A(ecx0.UNCOMPRESSED, wzw0.c);
        fck0VarL3.A(ecx0.COMPRESSED, wzw0.b);
        fck0VarL3.A(ecx0.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, wzw0.d);
        i = fck0VarL3.p();
    }

    public static int a(vzw0 vzw0Var) {
        if (vzw0.b == vzw0Var) {
            return 33;
        }
        if (vzw0.c == vzw0Var) {
            return 49;
        }
        if (vzw0.d == vzw0Var) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(String.valueOf(vzw0Var)));
    }

    public static lpw0 b(p50 p50Var) {
        if (p50Var.equals(p50.n)) {
            return lpw0.e;
        }
        if (p50Var == p50.l) {
            return lpw0.c;
        }
        if (p50Var == p50.m) {
            return lpw0.f;
        }
        throw new GeneralSecurityException("unknown variant: ".concat(String.valueOf(p50Var)));
    }

    public static xzw0 c(lpw0 lpw0Var, mcx0 mcx0Var) {
        p50 p50Var;
        zex0 zex0VarT = bfx0.t();
        zex0VarT.g(mcx0Var.x().w().C());
        zex0VarT.h(4);
        zex0VarT.f(mcx0Var.x().w().B());
        bfx0 bfx0Var = (bfx0) zex0VarT.c();
        zcw0 zcw0VarB = xzw0.b();
        if (lpw0Var.equals(lpw0.e)) {
            p50Var = p50.n;
        } else if (lpw0Var == lpw0.c) {
            p50Var = p50.l;
        } else {
            if (lpw0Var != lpw0.f && lpw0Var != lpw0.d) {
                throw new GeneralSecurityException("unknown variant: ".concat(String.valueOf(lpw0Var)));
            }
            p50Var = p50.m;
        }
        zcw0VarB.e = p50Var;
        zcw0VarB.f44186a = (vzw0) h.o(mcx0Var.A().y());
        zcw0VarB.b = (uzw0) g.o(mcx0Var.A().z());
        zcw0VarB.e(ktt0.E(bfx0Var.c()));
        icw0 icw0VarA = icw0.a(mcx0Var.A().A().r());
        if (icw0VarA.f14556a.length == 0) {
            zcw0VarB.f = null;
        } else {
            zcw0VarB.f = icw0VarA;
        }
        if (!mcx0Var.A().y().equals(ddx0.CURVE25519)) {
            zcw0VarB.c = (wzw0) i.o(mcx0Var.t());
        } else if (!mcx0Var.t().equals(ecx0.COMPRESSED)) {
            hny.o("For CURVE25519 EcPointFormat must be compressed");
            return null;
        }
        return zcw0VarB.b();
    }

    public static tcx0 d(f0x0 f0x0Var) {
        xzw0 xzw0Var = f0x0Var.f8737a;
        if (xzw0Var.f41775a.equals(vzw0.e)) {
            scx0 scx0VarB = tcx0.B();
            scx0VarB.d();
            ((tcx0) scx0VarB.b).zzf = 0;
            mcx0 mcx0VarE = e(xzw0Var);
            scx0VarB.d();
            tcx0.y((tcx0) scx0VarB.b, mcx0VarE);
            byte[] bArrB = f0x0Var.c.b();
            vjw0 vjw0VarH = sjw0.h(bArrB, 0, bArrB.length);
            scx0VarB.d();
            tcx0.x((tcx0) scx0VarB.b, vjw0VarH);
            vjw0 vjw0Var = sjw0.b;
            scx0VarB.d();
            tcx0.A((tcx0) scx0VarB.b, vjw0Var);
            return (tcx0) scx0VarB.c();
        }
        int iA = a(xzw0Var.f41775a);
        ECPoint eCPoint = f0x0Var.b;
        if (eCPoint == null) {
            hny.o("NistCurvePoint was null for NIST curve");
            return null;
        }
        scx0 scx0VarB2 = tcx0.B();
        scx0VarB2.d();
        ((tcx0) scx0VarB2.b).zzf = 0;
        mcx0 mcx0VarE2 = e(xzw0Var);
        scx0VarB2.d();
        tcx0.y((tcx0) scx0VarB2.b, mcx0VarE2);
        byte[] bArrG = ibm0.G(eCPoint.getAffineX(), iA);
        vjw0 vjw0VarH2 = sjw0.h(bArrG, 0, bArrG.length);
        scx0VarB2.d();
        tcx0.x((tcx0) scx0VarB2.b, vjw0VarH2);
        byte[] bArrG2 = ibm0.G(eCPoint.getAffineY(), iA);
        vjw0 vjw0VarH3 = sjw0.h(bArrG2, 0, bArrG2.length);
        scx0VarB2.d();
        tcx0.A((tcx0) scx0VarB2.b, vjw0VarH3);
        return (tcx0) scx0VarB2.c();
    }

    public static mcx0 e(xzw0 xzw0Var) {
        vcx0 vcx0VarT = xcx0.t();
        ddx0 ddx0Var = (ddx0) h.n(xzw0Var.f41775a);
        vcx0VarT.d();
        ((xcx0) vcx0VarT.b).zze = ddx0Var.zza();
        mdx0 mdx0Var = (mdx0) g.n(xzw0Var.b);
        vcx0VarT.d();
        ((xcx0) vcx0VarT.b).zzf = mdx0Var.zza();
        icw0 icw0Var = xzw0Var.f;
        if (icw0Var != null && icw0Var.f14556a.length > 0) {
            byte[] bArrB = icw0Var.b();
            vjw0 vjw0VarH = sjw0.h(bArrB, 0, bArrB.length);
            vcx0VarT.d();
            xcx0.u((xcx0) vcx0VarT.b, vjw0VarH);
        }
        xcx0 xcx0Var = (xcx0) vcx0VarT.c();
        try {
            bfx0 bfx0VarV = bfx0.v(ktt0.F(xzw0Var.e), dkw0.b);
            ccx0 ccx0VarT = dcx0.t();
            zex0 zex0VarT = bfx0.t();
            zex0VarT.g(bfx0VarV.C());
            zex0VarT.h(2);
            zex0VarT.f(bfx0VarV.B());
            bfx0 bfx0Var = (bfx0) zex0VarT.c();
            ccx0VarT.d();
            dcx0.u((dcx0) ccx0VarT.b, bfx0Var);
            dcx0 dcx0Var = (dcx0) ccx0VarT.c();
            wzw0 wzw0Var = xzw0Var.c;
            if (wzw0Var == null) {
                wzw0Var = wzw0.b;
            }
            kcx0 kcx0VarY = mcx0.y();
            kcx0VarY.d();
            mcx0.w((mcx0) kcx0VarY.b, xcx0Var);
            kcx0VarY.d();
            mcx0.u((mcx0) kcx0VarY.b, dcx0Var);
            ecx0 ecx0Var = (ecx0) i.n(wzw0Var);
            kcx0VarY.d();
            ((mcx0) kcx0VarY.b).zzh = ecx0Var.zza();
            return (mcx0) kcx0VarY.c();
        } catch (qkw0 e2) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e2);
        }
    }
}
