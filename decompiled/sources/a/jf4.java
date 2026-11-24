package a;

import android.os.Handler;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.google.firebase.abt.component.AbtRegistrar;
import com.huawei.hms.api.ConnectionResult;
import java.net.ProtocolException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jf4 implements xbf, jgd, iuo, yvb0, sky, rw3, sg00 {
    public static final jf4 b = new jf4(1);
    public static final jf4 c = new jf4(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16406a;

    public /* synthetic */ jf4(byte b2) {
        this.f16406a = b2;
    }

    public static /* synthetic */ void e() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void h(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void i(Fragment fragment, String str) {
        throw new IllegalStateException(str + ((Object) fragment.toString()) + ((Object) " is already attached to a FragmentManager."));
    }

    public static /* synthetic */ void j(Object obj, Object obj2, String str) throws ProtocolException {
        throw new ProtocolException(str + obj + ((Object) " at ") + obj2);
    }

    public static /* synthetic */ void k(String str) {
        throw new ff5(str);
    }

    public static /* synthetic */ void l(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void m(StringBuilder sb, int i, int i2) {
        sb.append(" for item at position = ");
        sb.append(i);
        sb.append(" for viewType = ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }

    public static /* synthetic */ void n(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void o(String str) {
        throw new IllegalArgumentException(str);
    }

    @Override // a.yvb0
    public Object a(l7x l7xVar) throws GeneralSecurityException {
        cjc cjcVar = new cjc();
        if (brm0.a(1)) {
            return cjcVar;
        }
        hny.o("Can not use AES-CMAC in FIPS-mode.");
        return null;
    }

    @Override // a.sky
    public l7x b(dhi0 dhi0Var) throws GeneralSecurityException {
        byte b2 = 3;
        w4d0 w4d0Var = (w4d0) dhi0Var;
        switch (this.f16406a) {
            case 10:
                if (!w4d0Var.f38538a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    o("Wrong type URL in call to AesCmacParameters.parseParameters");
                    return null;
                }
                try {
                    i50 i50VarB = i50.B(w4d0Var.c, qso.a());
                    if (i50VarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    oif0 oif0Var = new oif0((byte) 2);
                    oif0Var.b = null;
                    oif0Var.c = null;
                    oif0Var.d = p50.f;
                    oif0Var.H(i50VarB.x().size());
                    int iY = i50VarB.y().y();
                    if (iY < 10 || 16 < iY) {
                        throw new GeneralSecurityException(twn.m(iY, "Invalid tag size for AesCmacParameters: "));
                    }
                    oif0Var.c = Integer.valueOf(iY);
                    oif0Var.d = t50.a(w4d0Var.e);
                    q50 q50VarD = oif0Var.d();
                    phf0 phf0Var = new phf0();
                    phf0Var.b = null;
                    phf0Var.c = null;
                    phf0Var.f26994a = q50VarD;
                    phf0Var.b = new iw20(sg9.a(i50VarB.x().h()));
                    phf0Var.c = w4d0Var.f;
                    return phf0Var.d();
                } catch (ynx | IllegalArgumentException unused) {
                    hny.o("Parsing AesCmacKey failed");
                    return null;
                }
            case 11:
                if (!w4d0Var.f38538a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    o("Wrong type URL in call to AesEaxParameters.parseParameters");
                    return null;
                }
                try {
                    i60 i60VarB = i60.B(w4d0Var.c, qso.a());
                    if (i60VarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    m60 m60Var = m60.e;
                    int size = i60VarB.x().size();
                    if (size != 16 && size != 24 && size != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                    }
                    int iY2 = i60VarB.y().y();
                    if (iY2 != 12 && iY2 != 16) {
                        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(iY2)));
                    }
                    af80 af80Var = w4d0Var.e;
                    int iOrdinal = af80Var.ordinal();
                    if (iOrdinal == 1) {
                        m60Var = m60.c;
                    } else if (iOrdinal == 2) {
                        m60Var = m60.d;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + af80Var.b());
                        }
                        m60Var = m60.d;
                    }
                    n60 n60Var = new n60(size, iY2, 16, m60Var);
                    nr nrVar = new nr(b2);
                    nrVar.c = null;
                    nrVar.d = null;
                    nrVar.b = n60Var;
                    nrVar.c = new iw20(sg9.a(i60VarB.x().h()));
                    nrVar.d = w4d0Var.f;
                    return nrVar.a();
                } catch (ynx unused2) {
                    hny.o("Parsing AesEaxcKey failed");
                    return null;
                }
            case 12:
                if (!w4d0Var.f38538a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    o("Wrong type URL in call to AesGcmParameters.parseParameters");
                    return null;
                }
                try {
                    u60 u60VarA = u60.A(w4d0Var.c, qso.a());
                    if (u60VarA.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    y60 y60Var = y60.e;
                    int size2 = u60VarA.x().size();
                    if (size2 != 16 && size2 != 24 && size2 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size2)));
                    }
                    af80 af80Var2 = w4d0Var.e;
                    int iOrdinal2 = af80Var2.ordinal();
                    if (iOrdinal2 == 1) {
                        y60Var = y60.c;
                    } else if (iOrdinal2 == 2) {
                        y60Var = y60.d;
                    } else if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + af80Var2.b());
                        }
                        y60Var = y60.d;
                    }
                    z60 z60Var = new z60(size2, 12, 16, y60Var);
                    es esVar = new es();
                    esVar.b = null;
                    esVar.c = null;
                    esVar.f8305a = z60Var;
                    esVar.b = new iw20(sg9.a(u60VarA.x().h()));
                    esVar.c = w4d0Var.f;
                    return esVar.b();
                } catch (ynx unused3) {
                    hny.o("Parsing AesGcmKey failed");
                    return null;
                }
            default:
                if (!w4d0Var.f38538a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    o("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                    return null;
                }
                try {
                    d70 d70VarA = d70.A(w4d0Var.c, qso.a());
                    if (d70VarA.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    h70 h70Var = h70.e;
                    int size3 = d70VarA.x().size();
                    if (size3 != 16 && size3 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size3)));
                    }
                    af80 af80Var3 = w4d0Var.e;
                    int iOrdinal3 = af80Var3.ordinal();
                    if (iOrdinal3 == 1) {
                        h70Var = h70.c;
                    } else if (iOrdinal3 == 2) {
                        h70Var = h70.d;
                    } else if (iOrdinal3 != 3) {
                        if (iOrdinal3 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + af80Var3.b());
                        }
                        h70Var = h70.d;
                    }
                    i70 i70Var = new i70(size3, h70Var);
                    cu cuVar = new cu(b2, false);
                    cuVar.c = null;
                    cuVar.d = null;
                    cuVar.b = i70Var;
                    cuVar.c = new iw20(sg9.a(d70VarA.x().h()));
                    cuVar.d = w4d0Var.f;
                    return cuVar.b();
                } catch (ynx unused4) {
                    hny.o("Parsing AesGcmSivKey failed");
                    return null;
                }
        }
    }

    @Override // a.xbf
    public Object c(Object obj) {
        byte b2 = this.f16406a;
        ((m1r) obj).getClass();
        switch (b2) {
            case 0:
                ze4.g2.getClass();
                return new ze4();
            case 21:
                ig4.O1.getClass();
                return new ig4();
            case 22:
                cj4.U1.getClass();
                return new cj4();
            default:
                e68.N1.getClass();
                return new e68();
        }
    }

    @Override // a.iuo
    public fuo[] f() {
        switch (this.f16406a) {
            case 4:
                return new fuo[]{new f6()};
            case 5:
                return new fuo[]{new h6()};
            default:
                return new fuo[]{new y20(0)};
        }
    }

    @Override // a.rw3
    public int g(int i, k6z k6zVar) {
        return Math.round((1.0f + (k6zVar == k6z.f17794a ? -1.0f : 1.0f)) * (i / 2.0f));
    }

    @Override // a.sg00
    public void invoke(Object obj) {
        long jR;
        yox yoxVar;
        ylo yloVar;
        syj syjVar;
        switch (this.f16406a) {
            case 16:
                ksj ksjVar = (ksj) obj;
                osj osjVar = ksjVar.f18815a;
                if (ksjVar == osjVar.j && osjVar.n != null) {
                    msj msjVar = osjVar.p;
                    int i = msjVar.b;
                    if (i != -1) {
                        long j = ((k34) msjVar.e).f / i;
                        l44 l44Var = osjVar.t;
                        l44Var.getClass();
                        jR = vtt0.R(l44Var.f19386a.getSampleRate(), j);
                    } else {
                        jR = -9223372036854775807L;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - osjVar.Z;
                    yox yoxVar2 = osjVar.n;
                    int i2 = ((k34) osjVar.p.e).f;
                    long jY = vtt0.Y(jR);
                    xex xexVar = ((fm30) yoxVar2.f43005a).l2;
                    Handler handler = (Handler) xexVar.f40764a;
                    if (handler != null) {
                        handler.post(new w34(xexVar, i2, jY, jElapsedRealtime));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                yox yoxVar3 = ((ksj) obj).f18815a.n;
                if (yoxVar3 != null) {
                    rek0 rek0Var = new rek0((byte) 24);
                    xex xexVar2 = ((fm30) yoxVar3.f43005a).l2;
                    Handler handler2 = (Handler) xexVar2.f40764a;
                    if (handler2 != null) {
                        handler2.post(new w34(xexVar2, (Object) rek0Var, (byte) 3));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ksj ksjVar2 = (ksj) obj;
                osj osjVar2 = ksjVar2.f18815a;
                if (ksjVar2 == osjVar2.j && (yoxVar = osjVar2.n) != null && osjVar2.R && (yloVar = ((fm30) yoxVar.f43005a).i1) != null) {
                    yloVar.a();
                    return;
                }
                return;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ksj ksjVar3 = (ksj) obj;
                osj osjVar3 = ksjVar3.f18815a;
                if (ksjVar3 == osjVar3.j && osjVar3.P) {
                    osjVar3.Q = true;
                    return;
                }
                return;
            default:
                yox yoxVar4 = ((jsj) obj).f17055a.n;
                if (yoxVar4 != null) {
                    fm30 fm30Var = (fm30) yoxVar4.f43005a;
                    synchronized (fm30Var.f15717a) {
                        syjVar = fm30Var.s;
                        break;
                    }
                    if (syjVar != null) {
                        syjVar.f.getClass();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void p() {
    }

    @Override // a.jgd
    public Object x0(pzu pzuVar) {
        return AbtRegistrar.lambda$getComponents$0(pzuVar);
    }
}
