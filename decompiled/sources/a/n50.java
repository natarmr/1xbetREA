package a;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class n50 extends p4 {
    public final /* synthetic */ byte c = 1;

    public n50(o50 o50Var, byte b, char c) {
        super(qqy.class, (byte) 5);
    }

    @Override // a.p4
    public Map D0() {
        switch (this.c) {
            case 0:
                HashMap map = new HashMap();
                k50 k50VarZ = l50.z();
                k50VarZ.e();
                ((l50) k50VarZ.b).B();
                r50 r50VarZ = s50.z();
                r50VarZ.e();
                ((s50) r50VarZ.b).A();
                s50 s50Var = (s50) r50VarZ.b();
                k50VarZ.e();
                ((l50) k50VarZ.b).C(s50Var);
                map.put("AES_CMAC", new ily((l50) k50VarZ.b(), 1));
                k50 k50VarZ2 = l50.z();
                k50VarZ2.e();
                ((l50) k50VarZ2.b).B();
                r50 r50VarZ2 = s50.z();
                r50VarZ2.e();
                ((s50) r50VarZ2.b).A();
                s50 s50Var2 = (s50) r50VarZ2.b();
                k50VarZ2.e();
                ((l50) k50VarZ2.b).C(s50Var2);
                map.put("AES256_CMAC", new ily((l50) k50VarZ2.b(), 1));
                k50 k50VarZ3 = l50.z();
                k50VarZ3.e();
                ((l50) k50VarZ3.b).B();
                r50 r50VarZ3 = s50.z();
                r50VarZ3.e();
                ((s50) r50VarZ3.b).A();
                s50 s50Var3 = (s50) r50VarZ3.b();
                k50VarZ3.e();
                ((l50) k50VarZ3.b).C(s50Var3);
                map.put("AES256_CMAC_RAW", new ily((l50) k50VarZ3.b(), 3));
                return Collections.unmodifiableMap(map);
            case 1:
                HashMap map2 = new HashMap();
                map2.put("AES128_CTR_HMAC_SHA256", o50.A(16, 16, 1));
                map2.put("AES128_CTR_HMAC_SHA256_RAW", o50.A(16, 16, 3));
                map2.put("AES256_CTR_HMAC_SHA256", o50.A(32, 32, 1));
                map2.put("AES256_CTR_HMAC_SHA256_RAW", o50.A(32, 32, 3));
                return Collections.unmodifiableMap(map2);
            case 2:
                HashMap map3 = new HashMap();
                map3.put("AES128_EAX", o50.z(16, 1));
                map3.put("AES128_EAX_RAW", o50.z(16, 3));
                map3.put("AES256_EAX", o50.z(32, 1));
                map3.put("AES256_EAX_RAW", o50.z(32, 3));
                return Collections.unmodifiableMap(map3);
            case 3:
                HashMap map4 = new HashMap();
                map4.put("AES128_GCM", o50.C(16, 1));
                map4.put("AES128_GCM_RAW", o50.C(16, 3));
                map4.put("AES256_GCM", o50.C(32, 1));
                map4.put("AES256_GCM_RAW", o50.C(32, 3));
                return Collections.unmodifiableMap(map4);
            case 4:
                HashMap map5 = new HashMap();
                map5.put("AES128_GCM_SIV", o50.D(16, 1));
                map5.put("AES128_GCM_SIV_RAW", o50.D(16, 3));
                map5.put("AES256_GCM_SIV", o50.D(32, 1));
                map5.put("AES256_GCM_SIV_RAW", o50.D(32, 3));
                return Collections.unmodifiableMap(map5);
            case 5:
                HashMap map6 = new HashMap();
                o70 o70VarY = p70.y();
                o70VarY.e();
                ((p70) o70VarY.b).A();
                map6.put("AES256_SIV", new ily((p70) o70VarY.b(), 1));
                o70 o70VarY2 = p70.y();
                o70VarY2.e();
                ((p70) o70VarY2.b).A();
                map6.put("AES256_SIV_RAW", new ily((p70) o70VarY2.b(), 3));
                return Collections.unmodifiableMap(map6);
            case 6:
                HashMap map7 = new HashMap();
                map7.put("CHACHA20_POLY1305", new ily(gbb.x(), 1));
                map7.put("CHACHA20_POLY1305_RAW", new ily(gbb.x(), 3));
                return Collections.unmodifiableMap(map7);
            case 7:
                HashMap map8 = new HashMap();
                jnv jnvVar = jnv.SHA256;
                map8.put("HMAC_SHA256_128BITTAG", o50.B(32, 16, jnvVar, 1));
                map8.put("HMAC_SHA256_128BITTAG_RAW", o50.B(32, 16, jnvVar, 3));
                map8.put("HMAC_SHA256_256BITTAG", o50.B(32, 32, jnvVar, 1));
                map8.put("HMAC_SHA256_256BITTAG_RAW", o50.B(32, 32, jnvVar, 3));
                jnv jnvVar2 = jnv.SHA512;
                map8.put("HMAC_SHA512_128BITTAG", o50.B(64, 16, jnvVar2, 1));
                map8.put("HMAC_SHA512_128BITTAG_RAW", o50.B(64, 16, jnvVar2, 3));
                map8.put("HMAC_SHA512_256BITTAG", o50.B(64, 32, jnvVar2, 1));
                map8.put("HMAC_SHA512_256BITTAG_RAW", o50.B(64, 32, jnvVar2, 3));
                map8.put("HMAC_SHA512_512BITTAG", o50.B(64, 64, jnvVar2, 1));
                map8.put("HMAC_SHA512_512BITTAG_RAW", o50.B(64, 64, jnvVar2, 3));
                return Collections.unmodifiableMap(map8);
            case 8:
            case 9:
            default:
                return super.D0();
            case 10:
                HashMap map9 = new HashMap();
                map9.put("XCHACHA20_POLY1305", new ily(xxv0.x(), 1));
                map9.put("XCHACHA20_POLY1305_RAW", new ily(xxv0.x(), 3));
                return Collections.unmodifiableMap(map9);
        }
    }

    @Override // a.p4
    public final x3 G0(og9 og9Var) {
        switch (this.c) {
            case 0:
                return l50.A(og9Var, qso.a());
            case 1:
                return x50.A(og9Var, qso.a());
            case 2:
                return l60.A(og9Var, qso.a());
            case 3:
                return x60.z(og9Var, qso.a());
            case 4:
                return g70.z(og9Var, qso.a());
            case 5:
                return p70.z(og9Var, qso.a());
            case 6:
                return gbb.y(og9Var, qso.a());
            case 7:
                return ofw.B(og9Var, qso.a());
            case 8:
                return qqy.z(og9Var, qso.a());
            case 9:
                return vqy.B(og9Var, qso.a());
            default:
                return xxv0.y(og9Var, qso.a());
        }
    }

    @Override // a.p4
    public final void M0(x3 x3Var) throws GeneralSecurityException {
        switch (this.c) {
            case 0:
                l50 l50Var = (l50) x3Var;
                o50.E(l50Var.y());
                if (l50Var.x() == 32) {
                    return;
                }
                hny.o("AesCmacKey size wrong, must be 32 bytes");
                return;
            case 1:
                x50 x50Var = (x50) x3Var;
                m50[] m50VarArr = {new m50(z50.class, (byte) 2)};
                HashMap map = new HashMap();
                for (m50 m50Var : m50VarArr) {
                    boolean zContainsKey = map.containsKey(m50Var.f21197a);
                    Class cls = m50Var.f21197a;
                    if (zContainsKey) {
                        jf4.o(ohs0.l(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return;
                    }
                    map.put(cls, m50Var);
                }
                if (m50VarArr.length > 0) {
                    Class cls2 = m50VarArr[0].f21197a;
                }
                Collections.unmodifiableMap(map);
                d60 d60VarX = x50Var.x();
                twt0.a(d60VarX.y());
                f60 f60VarZ = d60VarX.z();
                if (f60VarZ.y() < 12 || f60VarZ.y() > 16) {
                    hny.o("invalid IV size");
                    return;
                }
                m50[] m50VarArr2 = {new m50(gp10.class, (byte) 8)};
                HashMap map2 = new HashMap();
                for (m50 m50Var2 : m50VarArr2) {
                    boolean zContainsKey2 = map2.containsKey(m50Var2.f21197a);
                    Class cls3 = m50Var2.f21197a;
                    if (zContainsKey2) {
                        jf4.o(ohs0.l(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return;
                    }
                    map2.put(cls3, m50Var2);
                }
                if (m50VarArr2.length > 0) {
                    Class cls4 = m50VarArr2[0].f21197a;
                }
                Collections.unmodifiableMap(map2);
                ofw ofwVarY = x50Var.y();
                if (ofwVarY.y() < 16) {
                    hny.o("key too short");
                    return;
                } else {
                    o50.F(ofwVarY.z());
                    twt0.a(x50Var.x().y());
                    return;
                }
            case 2:
                l60 l60Var = (l60) x3Var;
                twt0.a(l60Var.x());
                if (l60Var.y().y() == 12 || l60Var.y().y() == 16) {
                    return;
                }
                hny.o("invalid IV size; acceptable values have 12 or 16 bytes");
                return;
            case 3:
                twt0.a(((x60) x3Var).x());
                return;
            case 4:
                twt0.a(((g70) x3Var).x());
                return;
            case 5:
                p70 p70Var = (p70) x3Var;
                if (p70Var.x() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + p70Var.x() + ". Valid keys must have 64 bytes.");
            case 6:
                return;
            case 7:
                ofw ofwVar = (ofw) x3Var;
                if (ofwVar.y() >= 16) {
                    o50.F(ofwVar.z());
                    return;
                } else {
                    hny.o("key too short");
                    return;
                }
            case 8:
                return;
            case 9:
                vqy vqyVar = (vqy) x3Var;
                if (vqyVar.z().isEmpty() || !vqyVar.A()) {
                    hny.o("invalid key format: missing KEK URI or DEK template");
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // a.p4
    public final x3 t0(x3 x3Var) {
        switch (this.c) {
            case 0:
                l50 l50Var = (l50) x3Var;
                h50 h50VarA = i50.A();
                h50VarA.e();
                ((i50) h50VarA.b).E();
                byte[] bArrA = g1e0.a(l50Var.x());
                kg9 kg9VarF = og9.f(bArrA, 0, bArrA.length);
                h50VarA.e();
                ((i50) h50VarA.b).C(kg9VarF);
                s50 s50VarY = l50Var.y();
                h50VarA.e();
                ((i50) h50VarA.b).D(s50VarY);
                return (i50) h50VarA.b();
            case 1:
                x50 x50Var = (x50) x3Var;
                m50[] m50VarArr = {new m50(z50.class, (byte) 2)};
                HashMap map = new HashMap();
                for (m50 m50Var : m50VarArr) {
                    boolean zContainsKey = map.containsKey(m50Var.f21197a);
                    Class cls = m50Var.f21197a;
                    if (zContainsKey) {
                        jf4.o(ohs0.l(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return null;
                    }
                    map.put(cls, m50Var);
                }
                if (m50VarArr.length > 0) {
                    Class cls2 = m50VarArr[0].f21197a;
                }
                Collections.unmodifiableMap(map);
                d60 d60VarX = x50Var.x();
                a60 a60VarB = b60.B();
                f60 f60VarZ = d60VarX.z();
                a60VarB.e();
                ((b60) a60VarB.b).D(f60VarZ);
                byte[] bArrA2 = g1e0.a(d60VarX.y());
                kg9 kg9VarF2 = og9.f(bArrA2, 0, bArrA2.length);
                a60VarB.e();
                ((b60) a60VarB.b).C(kg9VarF2);
                a60VarB.e();
                ((b60) a60VarB.b).E();
                b60 b60Var = (b60) a60VarB.b();
                m50[] m50VarArr2 = {new m50(gp10.class, (byte) 8)};
                HashMap map2 = new HashMap();
                for (m50 m50Var2 : m50VarArr2) {
                    boolean zContainsKey2 = map2.containsKey(m50Var2.f21197a);
                    Class cls3 = m50Var2.f21197a;
                    if (zContainsKey2) {
                        jf4.o(ohs0.l(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return null;
                    }
                    map2.put(cls3, m50Var2);
                }
                if (m50VarArr2.length > 0) {
                    Class cls4 = m50VarArr2[0].f21197a;
                }
                Collections.unmodifiableMap(map2);
                ofw ofwVarY = x50Var.y();
                kfw kfwVarB = lfw.B();
                kfwVarB.e();
                ((lfw) kfwVarB.b).F();
                sfw sfwVarZ = ofwVarY.z();
                kfwVarB.e();
                ((lfw) kfwVarB.b).E(sfwVarZ);
                byte[] bArrA3 = g1e0.a(ofwVarY.y());
                kg9 kg9VarF3 = og9.f(bArrA3, 0, bArrA3.length);
                kfwVarB.e();
                ((lfw) kfwVarB.b).D(kg9VarF3);
                lfw lfwVar = (lfw) kfwVarB.b();
                u50 u50VarA = v50.A();
                u50VarA.e();
                ((v50) u50VarA.b).C(b60Var);
                u50VarA.e();
                ((v50) u50VarA.b).D(lfwVar);
                u50VarA.e();
                ((v50) u50VarA.b).E();
                return (v50) u50VarA.b();
            case 2:
                l60 l60Var = (l60) x3Var;
                h60 h60VarA = i60.A();
                byte[] bArrA4 = g1e0.a(l60Var.x());
                kg9 kg9VarF4 = og9.f(bArrA4, 0, bArrA4.length);
                h60VarA.e();
                ((i60) h60VarA.b).C(kg9VarF4);
                p60 p60VarY = l60Var.y();
                h60VarA.e();
                ((i60) h60VarA.b).D(p60VarY);
                h60VarA.e();
                ((i60) h60VarA.b).E();
                return (i60) h60VarA.b();
            case 3:
                t60 t60VarZ = u60.z();
                byte[] bArrA5 = g1e0.a(((x60) x3Var).x());
                kg9 kg9VarF5 = og9.f(bArrA5, 0, bArrA5.length);
                t60VarZ.e();
                ((u60) t60VarZ.b).B(kg9VarF5);
                t60VarZ.e();
                ((u60) t60VarZ.b).C();
                return (u60) t60VarZ.b();
            case 4:
                c70 c70VarZ = d70.z();
                byte[] bArrA6 = g1e0.a(((g70) x3Var).x());
                kg9 kg9VarF6 = og9.f(bArrA6, 0, bArrA6.length);
                c70VarZ.e();
                ((d70) c70VarZ.b).B(kg9VarF6);
                c70VarZ.e();
                ((d70) c70VarZ.b).C();
                return (d70) c70VarZ.b();
            case 5:
                m70 m70VarZ = n70.z();
                byte[] bArrA7 = g1e0.a(((p70) x3Var).x());
                kg9 kg9VarF7 = og9.f(bArrA7, 0, bArrA7.length);
                m70VarZ.e();
                ((n70) m70VarZ.b).B(kg9VarF7);
                m70VarZ.e();
                ((n70) m70VarZ.b).C();
                return (n70) m70VarZ.b();
            case 6:
                cbb cbbVarZ = dbb.z();
                cbbVarZ.e();
                ((dbb) cbbVarZ.b).C();
                byte[] bArrA8 = g1e0.a(32);
                kg9 kg9VarF8 = og9.f(bArrA8, 0, bArrA8.length);
                cbbVarZ.e();
                ((dbb) cbbVarZ.b).B(kg9VarF8);
                return (dbb) cbbVarZ.b();
            case 7:
                ofw ofwVar = (ofw) x3Var;
                kfw kfwVarB2 = lfw.B();
                kfwVarB2.e();
                ((lfw) kfwVarB2.b).F();
                sfw sfwVarZ2 = ofwVar.z();
                kfwVarB2.e();
                ((lfw) kfwVarB2.b).E(sfwVarZ2);
                byte[] bArrA9 = g1e0.a(ofwVar.y());
                kg9 kg9VarF9 = og9.f(bArrA9, 0, bArrA9.length);
                kfwVarB2.e();
                ((lfw) kfwVarB2.b).D(kg9VarF9);
                return (lfw) kfwVarB2.b();
            case 8:
                oqy oqyVarZ = pqy.z();
                oqyVarZ.e();
                ((pqy) oqyVarZ.b).B((qqy) x3Var);
                oqyVarZ.e();
                ((pqy) oqyVarZ.b).C();
                return (pqy) oqyVarZ.b();
            case 9:
                tqy tqyVarZ = uqy.z();
                tqyVarZ.e();
                ((uqy) tqyVarZ.b).B((vqy) x3Var);
                tqyVarZ.e();
                ((uqy) tqyVarZ.b).C();
                return (uqy) tqyVarZ.b();
            default:
                uxv0 uxv0VarZ = vxv0.z();
                uxv0VarZ.e();
                ((vxv0) uxv0VarZ.b).C();
                byte[] bArrA10 = g1e0.a(32);
                kg9 kg9VarF10 = og9.f(bArrA10, 0, bArrA10.length);
                uxv0VarZ.e();
                ((vxv0) uxv0VarZ.b).B(kg9VarF10);
                return (vxv0) uxv0VarZ.b();
        }
    }

    public /* synthetic */ n50(Class cls) {
        super(cls, (byte) 5);
    }

    public n50(o50 o50Var, byte b, int i) {
        super(vqy.class, (byte) 5);
    }

    public n50(o50 o50Var, char c) {
        super(x60.class, (byte) 5);
    }

    public n50(o50 o50Var, byte b) {
        super(l60.class, (byte) 5);
    }

    public n50(o50 o50Var, byte b, boolean z) {
        super(gbb.class, (byte) 5);
    }

    public n50(o50 o50Var, int i) {
        super(g70.class, (byte) 5);
    }

    public n50(o50 o50Var, byte b, short s) {
        super(xxv0.class, (byte) 5);
    }

    public n50(o50 o50Var, short s) {
        super(p70.class, (byte) 5);
    }

    public n50(o50 o50Var) {
        super(x50.class, (byte) 5);
    }

    public n50(o50 o50Var, byte b, byte b2) {
        super(ofw.class, (byte) 5);
    }
}
