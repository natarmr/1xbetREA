package a;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class aix0 implements cnw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final okt0 f948a;
    public static final okt0 b;

    static {
        fck0 fck0VarL = okt0.l();
        fck0VarL.A(fix0.f9611a, vzw0.b);
        fck0VarL.A(fix0.b, vzw0.c);
        fck0VarL.A(fix0.c, vzw0.d);
        f948a = fck0VarL.p();
        fck0 fck0VarL2 = okt0.l();
        fck0VarL2.A(eix0.f7881a, wzw0.c);
        fck0VarL2.A(eix0.b, wzw0.b);
        fck0VarL2.A(eix0.c, wzw0.d);
        b = fck0VarL2.p();
    }

    public static aix0 a(f0x0 f0x0Var) throws GeneralSecurityException {
        xzw0 xzw0Var = f0x0Var.f8737a;
        fix0 fix0Var = (fix0) f948a.n(xzw0Var.f41775a);
        ECPoint eCPoint = f0x0Var.b;
        byte[] byteArray = eCPoint.getAffineX().toByteArray();
        byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
        ECParameterSpec eCParameterSpecZ = ghm0.z(fix0Var);
        ECPoint eCPoint2 = new ECPoint(new BigInteger(1, byteArray), new BigInteger(1, byteArray2));
        m4x0.g(eCPoint2, eCParameterSpecZ.getCurve());
        ECPublicKey eCPublicKey = (ECPublicKey) ((KeyFactory) gix0.f.f11371a.zza("EC")).generatePublic(new ECPublicKeySpec(eCPoint2, eCParameterSpecZ));
        icw0 icw0Var = xzw0Var.f;
        if (icw0Var != null) {
            icw0Var.b();
        }
        b(xzw0Var.b);
        i4w0.X(xzw0Var);
        f0x0Var.d.b();
        aix0 aix0Var = new aix0();
        m4x0.g(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        return aix0Var;
    }

    public static final String b(uzw0 uzw0Var) throws GeneralSecurityException {
        if (uzw0Var.equals(uzw0.b)) {
            return "HmacSha1";
        }
        if (uzw0Var == uzw0.c) {
            return "HmacSha224";
        }
        if (uzw0Var == uzw0.d) {
            return "HmacSha256";
        }
        if (uzw0Var == uzw0.e) {
            return "HmacSha384";
        }
        if (uzw0Var == uzw0.f) {
            return "HmacSha512";
        }
        throw new GeneralSecurityException("hash unsupported for EciesAeadHkdf: ".concat(String.valueOf(uzw0Var)));
    }
}
