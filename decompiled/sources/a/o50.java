package a;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class o50 extends v0 {
    public static final xvb0 f = new xvb0(j50.class, new jf4((byte) 9));
    public static final xvb0 g = new xvb0(mfw.class, new ohq((byte) 10));
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o50() {
        super(lfw.class, new m50[]{new m50(gp10.class, (byte) 8)});
        this.e = (byte) 1;
    }

    public static ily A(int i, int i2, int i3) {
        c60 c60VarA = d60.A();
        e60 e60VarZ = f60.z();
        e60VarZ.e();
        ((f60) e60VarZ.b).A();
        f60 f60Var = (f60) e60VarZ.b();
        c60VarA.e();
        ((d60) c60VarA.b).C(f60Var);
        c60VarA.e();
        ((d60) c60VarA.b).B(i);
        d60 d60Var = (d60) c60VarA.b();
        nfw nfwVarA = ofw.A();
        rfw rfwVarA = sfw.A();
        rfwVarA.e();
        ((sfw) rfwVarA.b).B(jnv.SHA256);
        rfwVarA.e();
        ((sfw) rfwVarA.b).C(i2);
        sfw sfwVar = (sfw) rfwVarA.b();
        nfwVarA.e();
        ((ofw) nfwVarA.b).D(sfwVar);
        nfwVarA.e();
        ((ofw) nfwVarA.b).C(32);
        ofw ofwVar = (ofw) nfwVarA.b();
        w50 w50VarZ = x50.z();
        w50VarZ.e();
        ((x50) w50VarZ.b).B(d60Var);
        w50VarZ.e();
        ((x50) w50VarZ.b).C(ofwVar);
        return new ily((x50) w50VarZ.b(), i3);
    }

    public static ily B(int i, int i2, jnv jnvVar, int i3) {
        nfw nfwVarA = ofw.A();
        rfw rfwVarA = sfw.A();
        rfwVarA.e();
        ((sfw) rfwVarA.b).B(jnvVar);
        rfwVarA.e();
        ((sfw) rfwVarA.b).C(i2);
        sfw sfwVar = (sfw) rfwVarA.b();
        nfwVarA.e();
        ((ofw) nfwVarA.b).D(sfwVar);
        nfwVarA.e();
        ((ofw) nfwVarA.b).C(i);
        return new ily((ofw) nfwVarA.b(), i3);
    }

    public static ily C(int i, int i2) {
        w60 w60VarY = x60.y();
        w60VarY.e();
        ((x60) w60VarY.b).A(i);
        return new ily((x60) w60VarY.b(), i2);
    }

    public static ily D(int i, int i2) {
        f70 f70VarY = g70.y();
        f70VarY.e();
        ((g70) f70VarY.b).A(i);
        return new ily((g70) f70VarY.b(), i2);
    }

    public static void E(s50 s50Var) throws GeneralSecurityException {
        if (s50Var.y() < 10) {
            hny.o("tag size too short");
        } else {
            if (s50Var.y() <= 16) {
                return;
            }
            hny.o("tag size too long");
        }
    }

    public static void F(sfw sfwVar) throws GeneralSecurityException {
        if (sfwVar.z() < 10) {
            hny.o("tag size too small");
            return;
        }
        int iOrdinal = sfwVar.y().ordinal();
        if (iOrdinal == 1) {
            if (sfwVar.z() <= 20) {
                return;
            }
            hny.o("tag size too big");
            return;
        }
        if (iOrdinal == 2) {
            if (sfwVar.z() <= 48) {
                return;
            }
            hny.o("tag size too big");
            return;
        }
        if (iOrdinal == 3) {
            if (sfwVar.z() <= 32) {
                return;
            }
            hny.o("tag size too big");
        } else if (iOrdinal == 4) {
            if (sfwVar.z() <= 64) {
                return;
            }
            hny.o("tag size too big");
        } else if (iOrdinal != 5) {
            hny.o("unknown hash type");
        } else {
            if (sfwVar.z() <= 28) {
                return;
            }
            hny.o("tag size too big");
        }
    }

    public static ily z(int i, int i2) {
        k60 k60VarZ = l60.z();
        k60VarZ.e();
        ((l60) k60VarZ.b).B(i);
        o60 o60VarZ = p60.z();
        o60VarZ.e();
        ((p60) o60VarZ.b).A();
        p60 p60Var = (p60) o60VarZ.b();
        k60VarZ.e();
        ((l60) k60VarZ.b).C(p60Var);
        return new ily((l60) k60VarZ.b(), i2);
    }

    @Override // a.v0
    public int p() {
        switch (this.e) {
            case 1:
                return 2;
            case 2:
                return 2;
            case 3:
            default:
                return super.p();
            case 4:
                return 2;
        }
    }

    @Override // a.v0
    public final String q() {
        switch (this.e) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 5:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 6:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
            case 7:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 8:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 9:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            default:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
        }
    }

    @Override // a.v0
    public final p4 s() {
        switch (this.e) {
            case 0:
                return new n50(l50.class);
            case 1:
                return new n50(this, (byte) 0, (byte) 0);
            case 2:
                return new n50(this);
            case 3:
                return new n50(this, (byte) 0);
            case 4:
                return new n50(this, (char) 0);
            case 5:
                return new n50(this, 0);
            case 6:
                return new n50(this, (short) 0);
            case 7:
                return new n50(this, (byte) 0, false);
            case 8:
                return new n50(this, (byte) 0, (char) 0);
            case 9:
                return new n50(this, (byte) 0, 0);
            default:
                return new n50(this, (byte) 0, (short) 0);
        }
    }

    @Override // a.v0
    public final eky t() {
        byte b = this.e;
        eky ekyVar = eky.REMOTE;
        eky ekyVar2 = eky.SYMMETRIC;
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return ekyVar2;
            case 8:
            case 9:
                return ekyVar;
            default:
                return ekyVar2;
        }
    }

    @Override // a.v0
    public final x3 v(og9 og9Var) {
        switch (this.e) {
            case 0:
                return i50.B(og9Var, qso.a());
            case 1:
                return lfw.C(og9Var, qso.a());
            case 2:
                return v50.B(og9Var, qso.a());
            case 3:
                return i60.B(og9Var, qso.a());
            case 4:
                return u60.A(og9Var, qso.a());
            case 5:
                return d70.A(og9Var, qso.a());
            case 6:
                return n70.A(og9Var, qso.a());
            case 7:
                return dbb.A(og9Var, qso.a());
            case 8:
                return pqy.A(og9Var, qso.a());
            case 9:
                return uqy.A(og9Var, qso.a());
            default:
                return vxv0.A(og9Var, qso.a());
        }
    }

    @Override // a.v0
    public final void y(x3 x3Var) throws GeneralSecurityException {
        switch (this.e) {
            case 0:
                i50 i50Var = (i50) x3Var;
                twt0.c(i50Var.z());
                if (i50Var.x().size() == 32) {
                    E(i50Var.y());
                    return;
                } else {
                    hny.o("AesCmacKey size wrong, must be 32 bytes");
                    return;
                }
            case 1:
                lfw lfwVar = (lfw) x3Var;
                twt0.c(lfwVar.A());
                if (lfwVar.y().size() >= 16) {
                    F(lfwVar.z());
                    return;
                } else {
                    hny.o("key too short");
                    return;
                }
            case 2:
                v50 v50Var = (v50) x3Var;
                twt0.c(v50Var.z());
                m50[] m50VarArr = {new m50(z50.class, (byte) 2)};
                HashMap map = new HashMap();
                m50 m50Var = m50VarArr[0];
                boolean zContainsKey = map.containsKey(m50Var.f21197a);
                Class cls = m50Var.f21197a;
                if (zContainsKey) {
                    jf4.o(ohs0.l(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    return;
                }
                map.put(cls, m50Var);
                Class cls2 = m50VarArr[0].f21197a;
                Collections.unmodifiableMap(map);
                b60 b60VarX = v50Var.x();
                twt0.c(b60VarX.A());
                twt0.a(b60VarX.y().size());
                f60 f60VarZ = b60VarX.z();
                if (f60VarZ.y() < 12 || f60VarZ.y() > 16) {
                    hny.o("invalid IV size");
                    return;
                }
                m50[] m50VarArr2 = {new m50(gp10.class, (byte) 8)};
                HashMap map2 = new HashMap();
                m50 m50Var2 = m50VarArr2[0];
                boolean zContainsKey2 = map2.containsKey(m50Var2.f21197a);
                Class cls3 = m50Var2.f21197a;
                if (zContainsKey2) {
                    jf4.o(ohs0.l(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    return;
                }
                map2.put(cls3, m50Var2);
                Class cls4 = m50VarArr2[0].f21197a;
                Collections.unmodifiableMap(map2);
                lfw lfwVarY = v50Var.y();
                twt0.c(lfwVarY.A());
                if (lfwVarY.y().size() >= 16) {
                    F(lfwVarY.z());
                    return;
                } else {
                    hny.o("key too short");
                    return;
                }
            case 3:
                i60 i60Var = (i60) x3Var;
                twt0.c(i60Var.z());
                twt0.a(i60Var.x().size());
                if (i60Var.y().y() == 12 || i60Var.y().y() == 16) {
                    return;
                }
                hny.o("invalid IV size; acceptable values have 12 or 16 bytes");
                return;
            case 4:
                u60 u60Var = (u60) x3Var;
                twt0.c(u60Var.y());
                twt0.a(u60Var.x().size());
                return;
            case 5:
                d70 d70Var = (d70) x3Var;
                twt0.c(d70Var.y());
                twt0.a(d70Var.x().size());
                return;
            case 6:
                n70 n70Var = (n70) x3Var;
                twt0.c(n70Var.y());
                if (n70Var.x().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + n70Var.x().size() + ". Valid keys must have 64 bytes.");
            case 7:
                dbb dbbVar = (dbb) x3Var;
                twt0.c(dbbVar.y());
                if (dbbVar.x().size() == 32) {
                    return;
                }
                hny.o("invalid ChaCha20Poly1305Key: incorrect key length");
                return;
            case 8:
                twt0.c(((pqy) x3Var).y());
                return;
            case 9:
                twt0.c(((uqy) x3Var).y());
                return;
            default:
                vxv0 vxv0Var = (vxv0) x3Var;
                twt0.c(vxv0Var.y());
                if (vxv0Var.x().size() == 32) {
                    return;
                }
                hny.o("invalid XChaCha20Poly1305Key: incorrect key length");
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o50(Class cls, m50[] m50VarArr, byte b) {
        super(cls, m50VarArr);
        this.e = b;
    }
}
