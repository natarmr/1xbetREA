package a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.File;
import java.io.FileInputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import org.json.JSONObject;
import org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams;
import org.xplatform.background_video.impl.presentation.BackgroundVideoService;

/* JADX INFO: loaded from: classes2.dex */
public final class do20 implements b040 {
    public static final wit b = new wit(1);
    public static final nfx0 c = new nfx0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f6397a;

    public do20(gii0 gii0Var, byte b2) {
        gii0Var.getClass();
        switch (b2) {
            case 15:
                this.f6397a = new sza(gii0Var, (byte) 6);
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                this.f6397a = new sza(gii0Var, (byte) 12);
                break;
            default:
                this.f6397a = new sza(gii0Var, (byte) 2);
                break;
        }
    }

    public static void q(ViewGroup viewGroup, int i) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            return;
        }
        ble bleVar = (ble) layoutParams;
        ((ViewGroup.MarginLayoutParams) bleVar).topMargin = i;
        viewGroup.setLayoutParams(bleVar);
    }

    public static void r(String str, lfx0 lfx0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(lfx0Var.b / 1000000)));
        sb.append(": logging error [");
        jgx0 jgx0Var = lfx0Var.d;
        if (jgx0Var == null) {
            jf4.n("cannot request log site information prior to postProcess()");
            return;
        }
        ofm0.D(1, jgx0Var, sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public void a(String str, qt20 qt20Var, float f, Function0 function0, Function0 function1, fet fetVar, int i) {
        Object objJ;
        Object objJ2;
        Object objJ3;
        Function0 function2 = function0;
        qja qjaVar = qja.j;
        fetVar.g0(485840239);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.i(qt20Var) ? 32 : 16) | (fetVar.d(f) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            oms0 oms0VarZ = phu0.Z(Float.valueOf(f), null, fetVar, (i2 >> 6) & 14, 2);
            pz40 pz40Var = oms0VarZ.d;
            p4 p4Var = oms0VarZ.f25519a;
            hgk0 hgk0Var = (hgk0) pz40Var;
            float fFloatValue = ((Number) hgk0Var.getValue()).floatValue();
            fetVar.e0(1204451649);
            long jP = fbc.P(fFloatValue, afn0.p(fetVar).m121getTransparent0d7_KjU(), afn0.m(fetVar).getSecondary());
            fetVar.r(false);
            Object objF = y3d.f(jP);
            boolean zG = fetVar.g(objF);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = kng0.d(qjaVar, new s43(objF, (byte) 2), fetVar);
            }
            lxs0 lxs0Var = (lxs0) objP;
            if (oms0VarZ.h()) {
                objJ = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG2 = fetVar.g(oms0VarZ);
                objJ = fetVar.P();
                if (zG2 || objJ == obj) {
                    rfk0 rfk0VarJ = vdx.J();
                    Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                    rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                    try {
                        Object objY0 = p4Var.y0();
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        fetVar.o0(objY0);
                        objJ = objY0;
                    } catch (Throwable th) {
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        throw th;
                    }
                }
                fetVar.r(false);
            }
            float fFloatValue2 = ((Number) objJ).floatValue();
            fetVar.e0(1204451649);
            y3d y3dVar = new y3d(twn.i(fetVar, afn0.p(fetVar).m121getTransparent0d7_KjU(), fFloatValue2, false));
            boolean zG3 = fetVar.g(oms0VarZ);
            Object objP2 = fetVar.P();
            if (zG3 || objP2 == obj) {
                objP2 = jgk0.b(new gb3(oms0VarZ, (byte) 4));
                fetVar.o0(objP2);
            }
            float fFloatValue3 = ((Number) ((l7m0) objP2).getValue()).floatValue();
            fetVar.e0(1204451649);
            y3d y3dVar2 = new y3d(twn.i(fetVar, afn0.p(fetVar).m121getTransparent0d7_KjU(), fFloatValue3, false));
            boolean zG4 = fetVar.g(oms0VarZ);
            Object objP3 = fetVar.P();
            if (zG4 || objP3 == obj) {
                objP3 = jgk0.b(new gb3(oms0VarZ, (byte) 5));
                fetVar.o0(objP3);
            }
            cms0 cms0VarE = phu0.E(oms0VarZ, y3dVar, y3dVar2, w6x.k((ams0) ((l7m0) objP3).getValue(), fetVar, 292932065, false), lxs0Var, fetVar, 0);
            long jP2 = fbc.P(((Number) hgk0Var.getValue()).floatValue(), twn.B(fetVar, -1289565178, fetVar), afn0.m(fetVar).getSecondary());
            fetVar.r(false);
            Object objF2 = y3d.f(jP2);
            boolean zG5 = fetVar.g(objF2);
            Object objP4 = fetVar.P();
            if (zG5 || objP4 == obj) {
                objP4 = kng0.d(qjaVar, new s43(objF2, (byte) 2), fetVar);
            }
            lxs0 lxs0Var2 = (lxs0) objP4;
            if (oms0VarZ.h()) {
                objJ2 = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG6 = fetVar.g(oms0VarZ);
                objJ2 = fetVar.P();
                if (zG6 || objJ2 == obj) {
                    rfk0 rfk0VarJ2 = vdx.J();
                    Function1 function1E2 = rfk0VarJ2 != null ? rfk0VarJ2.e() : null;
                    rfk0 rfk0VarW2 = vdx.W(rfk0VarJ2);
                    try {
                        Object objY1 = p4Var.y0();
                        vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                        fetVar.o0(objY1);
                        objJ2 = objY1;
                    } catch (Throwable th2) {
                        vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                        throw th2;
                    }
                }
                fetVar.r(false);
            }
            y3d y3dVar3 = new y3d(twn.i(fetVar, twn.B(fetVar, -1289565178, fetVar), ((Number) objJ2).floatValue(), false));
            boolean zG7 = fetVar.g(oms0VarZ);
            Object objP5 = fetVar.P();
            if (zG7 || objP5 == obj) {
                objP5 = jgk0.b(new gb3(oms0VarZ, (byte) 6));
                fetVar.o0(objP5);
            }
            y3d y3dVar4 = new y3d(twn.i(fetVar, twn.B(fetVar, -1289565178, fetVar), ((Number) ((l7m0) objP5).getValue()).floatValue(), false));
            boolean zG8 = fetVar.g(oms0VarZ);
            Object objP6 = fetVar.P();
            if (zG8 || objP6 == obj) {
                objP6 = jgk0.b(new gb3(oms0VarZ, (byte) 7));
                fetVar.o0(objP6);
            }
            cms0 cms0VarE2 = phu0.E(oms0VarZ, y3dVar3, y3dVar4, w6x.k((ams0) ((l7m0) objP6).getValue(), fetVar, 343598950, false), lxs0Var2, fetVar, 0);
            long jP3 = fbc.P(((Number) hgk0Var.getValue()).floatValue(), twn.h(fetVar, 1758448148, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            Object objF3 = y3d.f(jP3);
            boolean zG9 = fetVar.g(objF3);
            Object objP7 = fetVar.P();
            if (zG9 || objP7 == obj) {
                objP7 = kng0.d(qjaVar, new s43(objF3, (byte) 2), fetVar);
            }
            lxs0 lxs0Var3 = (lxs0) objP7;
            if (oms0VarZ.h()) {
                objJ3 = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG10 = fetVar.g(oms0VarZ);
                objJ3 = fetVar.P();
                if (zG10 || objJ3 == obj) {
                    rfk0 rfk0VarJ3 = vdx.J();
                    Function1 function1E3 = rfk0VarJ3 != null ? rfk0VarJ3.e() : null;
                    rfk0 rfk0VarW3 = vdx.W(rfk0VarJ3);
                    try {
                        Object objY2 = p4Var.y0();
                        vdx.Y(rfk0VarJ3, rfk0VarW3, function1E3);
                        fetVar.o0(objY2);
                        objJ3 = objY2;
                    } catch (Throwable th3) {
                        vdx.Y(rfk0VarJ3, rfk0VarW3, function1E3);
                        throw th3;
                    }
                }
                fetVar.r(false);
            }
            long jP4 = fbc.P(((Number) objJ3).floatValue(), twn.h(fetVar, 1758448148, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            y3d y3dVar5 = new y3d(jP4);
            boolean zG11 = fetVar.g(oms0VarZ);
            Object objP8 = fetVar.P();
            if (zG11 || objP8 == obj) {
                objP8 = jgk0.b(new gb3(oms0VarZ, (byte) 8));
                fetVar.o0(objP8);
            }
            long jP5 = fbc.P(((Number) ((l7m0) objP8).getValue()).floatValue(), twn.h(fetVar, 1758448148, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            y3d y3dVar6 = new y3d(jP5);
            boolean zG12 = fetVar.g(oms0VarZ);
            Object objP9 = fetVar.P();
            if (zG12 || objP9 == obj) {
                objP9 = jgk0.b(new gb3(oms0VarZ, (byte) 9));
                fetVar.o0(objP9);
            }
            cms0 cms0VarE3 = phu0.E(oms0VarZ, y3dVar5, y3dVar6, w6x.k((ams0) ((l7m0) objP9).getValue(), fetVar, -255513228, false), lxs0Var3, fetVar, 0);
            function2 = function0;
            hlm.c(o050.W(o7k0.d(jm40.b, 1.0f)), new imm(klm.f18497a, new plm(str, ((y3d) ((hgk0) cms0VarE.j).getValue()).f41946a, fa50.f9191a), fmm.f9790a, afn0.p(fetVar).m121getTransparent0d7_KjU(), false, null), null, null, null, null, null, null, null, u1c.M(616109427, new cb3(function2, cms0VarE2, cms0VarE3, (byte) 1), fetVar), null, u1c.M(1542479106, new iop(qt20Var, function1, cms0VarE2, cms0VarE3, (byte) 19), fetVar), fetVar, 805306368, 48, 1532);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gc3(this, str, qt20Var, f, function2, function1, i, (byte) 0);
        }
    }

    public String b(String str, String str2, String str3, String str4) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        PrivateKey privateKey;
        str2.getClass();
        r5w0 r5w0Var = (r5w0) this.f6397a;
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        s4w0 s4w0Var = (s4w0) r5w0Var.b.getValue();
        publicKeyGeneratePublic.getClass();
        s4w0Var.getClass();
        SecretKeySpec secretKeySpec = null;
        try {
            KeyPair keyPairB = s4w0Var.b(str2);
            if (keyPairB != null && (privateKey = keyPairB.getPrivate()) != null) {
                KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
                keyAgreement.init(privateKey);
                keyAgreement.doPhase(publicKeyGeneratePublic, true);
                secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("SHA-256").digest(keyAgreement.generateSecret()), "AES");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        IvParameterSpec ivParameterSpec = new IvParameterSpec(Base64.decode(str3, 0));
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        byte[] bArrDoFinal = cipher.doFinal(Base64.decode(str4, 0));
        bArrDoFinal.getClass();
        return new String(bArrDoFinal, Charsets.UTF_8);
    }

    @Override // a.b040
    public void c(ox30 ox30Var, boolean z) {
        if (ox30Var instanceof fzm0) {
            ((fzm0) ox30Var).z.k().c(false);
        }
        b040 b040Var = ((xi) this.f6397a).e;
        if (b040Var != null) {
            b040Var.c(ox30Var, z);
        }
    }

    public String d(String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        str.getClass();
        s4w0 s4w0Var = (s4w0) ((r5w0) this.f6397a).b.getValue();
        s4w0Var.getClass();
        KeyPair keyPairB = s4w0Var.b(str);
        if (keyPairB == null) {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(new ECGenParameterSpec("secp521r1"));
            keyPairB = keyPairGenerator.generateKeyPair();
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, s4w0Var.a());
            n8w0 n8w0Var = new n8w0(Base64.encodeToString(keyPairB.getPublic().getEncoded(), 2), Base64.encodeToString(cipher.doFinal(keyPairB.getPrivate().getEncoded()), 2), Base64.encodeToString(cipher.getIV(), 2));
            vby vbyVar = s4w0Var.b;
            n8w0.Companion.getClass();
            String strD = vbyVar.d(e8w0.f7394a, n8w0Var);
            akh0 akh0Var = s4w0Var.f31628a;
            ((SharedPreferences) akh0Var.c.getValue()).edit().putString("USER_KEYS_PAIR_KEY_".concat(str), strD).apply();
            s4w0Var.c.put(str, keyPairB);
        }
        String strEncodeToString = Base64.encodeToString(keyPairB.getPublic().getEncoded(), 2);
        strEncodeToString.getClass();
        return strEncodeToString;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(long j, zje zjeVar) {
        keb kebVar;
        if (zjeVar instanceof keb) {
            kebVar = (keb) zjeVar;
            int i = kebVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kebVar.k = i - Integer.MIN_VALUE;
            } else {
                kebVar = new keb(this, zjeVar);
            }
        } else {
            kebVar = new keb(this, zjeVar);
        }
        Object objC = kebVar.i;
        wne wneVar = wne.f39444a;
        int i2 = kebVar.k;
        if (i2 == 0) {
            z1x.P(objC);
            xbg xbgVar = (xbg) ((sza) this.f6397a).invoke();
            kebVar.k = 1;
            objC = xbgVar.c(j, kebVar);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        return ((dx5) objC).a();
    }

    @Override // a.b040
    public boolean f(ox30 ox30Var) {
        xi xiVar = (xi) this.f6397a;
        if (ox30Var == xiVar.c) {
            return false;
        }
        hz30 hz30Var = ((fzm0) ox30Var).A;
        b040 b040Var = xiVar.e;
        if (b040Var != null) {
            return b040Var.f(ox30Var);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(Map map, zje zjeVar) {
        leb lebVar;
        if (zjeVar instanceof leb) {
            lebVar = (leb) zjeVar;
            int i = lebVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lebVar.k = i - Integer.MIN_VALUE;
            } else {
                lebVar = new leb(this, zjeVar);
            }
        } else {
            lebVar = new leb(this, zjeVar);
        }
        Object objB = lebVar.i;
        wne wneVar = wne.f39444a;
        int i2 = lebVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            xbg xbgVar = (xbg) ((sza) this.f6397a).invoke();
            lebVar.k = 1;
            objB = xbgVar.b(map, lebVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return ((dx5) objB).a();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object h(long j, long j2, long j3, int i, int i2, int i3, int i4, String str, zje zjeVar) {
        meb mebVar;
        if (zjeVar instanceof meb) {
            mebVar = (meb) zjeVar;
            int i5 = mebVar.k;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                mebVar.k = i5 - Integer.MIN_VALUE;
            } else {
                mebVar = new meb(this, zjeVar);
            }
        } else {
            mebVar = new meb(this, zjeVar);
        }
        meb mebVar2 = mebVar;
        Object objA = mebVar2.i;
        wne wneVar = wne.f39444a;
        int i6 = mebVar2.k;
        if (i6 == 0) {
            z1x.P(objA);
            xbg xbgVar = (xbg) ((sza) this.f6397a).invoke();
            List<Long> listU = cs0.u(j);
            mebVar2.k = 1;
            objA = xbgVar.a(i2, i3, str, i4, listU, j2, j3, i, mebVar2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i6 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ((dx5) objA).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(long j, zje zjeVar, String str) {
        neb nebVar;
        if (zjeVar instanceof neb) {
            nebVar = (neb) zjeVar;
            int i = nebVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nebVar.k = i - Integer.MIN_VALUE;
            } else {
                nebVar = new neb(this, zjeVar);
            }
        } else {
            nebVar = new neb(this, zjeVar);
        }
        Object objD = nebVar.i;
        wne wneVar = wne.f39444a;
        int i2 = nebVar.k;
        if (i2 == 0) {
            z1x.P(objD);
            xbg xbgVar = (xbg) ((sza) this.f6397a).invoke();
            nebVar.k = 1;
            objD = xbgVar.d(j, str, nebVar);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        return ((dx5) objD).a();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        if (r0.d(1, r1) == r15) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(long r13, a.zje r15) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f6397a
            a.svu r0 = (a.svu) r0
            boolean r1 = r15 instanceof a.rp
            if (r1 == 0) goto L17
            r1 = r15
            a.rp r1 = (a.rp) r1
            int r2 = r1.l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.l = r2
            goto L1c
        L17:
            a.rp r1 = new a.rp
            r1.<init>(r12, r15)
        L1c:
            java.lang.Object r12 = r1.j
            a.wne r15 = a.wne.f39444a
            int r2 = r1.l
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            a.z1x.P(r12)
            goto L8f
        L31:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r12)
            r12 = 0
            return r12
        L38:
            long r13 = r1.i
            a.z1x.P(r12)
            goto L76
        L3e:
            long r13 = r1.i
            a.z1x.P(r12)
            goto L69
        L44:
            a.z1x.P(r12)
            a.txy r12 = a.txy.SPORT_LINE
            long r10 = java.lang.System.currentTimeMillis()
            r1.i = r13
            r1.l = r5
            java.lang.Object r12 = r0.f32888a
            a.jxy r12 = (a.jxy) r12
            a.hxy r6 = new a.hxy
            r7 = 1
            r8 = r13
            r6.<init>(r7, r8, r10)
            java.lang.Object r12 = r12.a(r1, r6)
            if (r12 != r15) goto L63
            goto L65
        L63:
            kotlin.Unit r12 = kotlin.Unit.f46060a
        L65:
            if (r12 != r15) goto L68
            goto L8e
        L68:
            r13 = r8
        L69:
            a.txy r12 = a.txy.SPORT_LINE
            r1.i = r13
            r1.l = r4
            java.lang.Object r12 = r0.b(r5, r1)
            if (r12 != r15) goto L76
            goto L8e
        L76:
            java.lang.Number r12 = (java.lang.Number) r12
            long r6 = r12.longValue()
            r8 = 50
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 <= 0) goto L92
            a.txy r12 = a.txy.SPORT_LINE
            r1.i = r13
            r1.l = r3
            java.lang.Object r12 = r0.d(r5, r1)
            if (r12 != r15) goto L8f
        L8e:
            return r15
        L8f:
            kotlin.Unit r12 = kotlin.Unit.f46060a
            return r12
        L92:
            kotlin.Unit r12 = kotlin.Unit.f46060a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.do20.j(long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(zje zjeVar, swp0 swp0Var, String str) throws dwq0, zhi0 {
        c9c c9cVar;
        if (zjeVar instanceof c9c) {
            c9cVar = (c9c) zjeVar;
            int i = c9cVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c9cVar.k = i - Integer.MIN_VALUE;
            } else {
                c9cVar = new c9c(this, zjeVar);
            }
        } else {
            c9cVar = new c9c(this, zjeVar);
        }
        Object objE = c9cVar.i;
        wne wneVar = wne.f39444a;
        int i2 = c9cVar.k;
        if (i2 == 0) {
            z1x.P(objE);
            kd30 kd30Var = (kd30) this.f6397a;
            c9cVar.k = 1;
            objE = kd30Var.E(c9cVar, swp0Var, str);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objE);
        }
        wus0 wus0Var = (wus0) objE;
        vus0 vus0Var = wus0Var.f;
        String str2 = wus0Var.f39805a;
        if (vus0Var instanceof uus0) {
            return new e9c(((uus0) vus0Var).f36318a, wus0Var.d, wus0Var.e);
        }
        if (!(vus0Var instanceof tus0)) {
            t9f.b();
            return null;
        }
        long j = wus0Var.b;
        if (str2.length() != 0 && j != 0 && wus0Var.c.length() <= 0) {
            return new d9c(str2, Long.valueOf(j));
        }
        jf4.k(null);
        return null;
    }

    public void l(boolean z) {
        phj phjVar = (phj) ((uii) this.f6397a).f35730a;
        (z ? phjVar.e : phjVar.f).a();
    }

    public JSONObject m() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f6397a;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(aad.b0(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        aad.J(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    aad.J(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            aad.J(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            aad.J(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void n(String str) {
        str.getClass();
        s4w0 s4w0Var = (s4w0) ((r5w0) this.f6397a).b.getValue();
        s4w0Var.getClass();
        ((SharedPreferences) s4w0Var.f31628a.c.getValue()).edit().remove("USER_KEYS_PAIR_KEY_".concat(str)).apply();
        s4w0Var.c.remove(str);
    }

    public String o(String str, String str2) {
        PrivateKey privateKey;
        str.getClass();
        str2.getClass();
        s4w0 s4w0Var = (s4w0) ((r5w0) this.f6397a).b.getValue();
        s4w0Var.getClass();
        try {
            KeyPair keyPairB = s4w0Var.b(str);
            if (keyPairB != null && (privateKey = keyPairB.getPrivate()) != null) {
                Signature signature = Signature.getInstance("SHA256withECDSA");
                signature.initSign(privateKey);
                byte[] bytes = str2.getBytes(Charsets.UTF_8);
                bytes.getClass();
                signature.update(bytes);
                String strEncodeToString = Base64.encodeToString(signature.sign(), 2);
                strEncodeToString.getClass();
                return strEncodeToString;
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void p(BackgroundVideoDownloadServiceParams backgroundVideoDownloadServiceParams) {
        int i = BackgroundVideoService.d;
        us00 us00Var = (us00) this.f6397a;
        Context applicationContext = us00Var.getApplicationContext();
        applicationContext.getClass();
        if (sj3.K(applicationContext)) {
            Intent intent = new Intent(us00Var, (Class<?>) BackgroundVideoService.class);
            intent.putExtra("KEY_DOWNLOAD_BACKGROUND_SERVICE_PARAMS", backgroundVideoDownloadServiceParams);
            us00Var.startService(intent);
        }
    }

    public do20(fsd fsdVar) {
        fsdVar.getClass();
        this.f6397a = fsdVar;
    }

    public do20(gw8 gw8Var) {
        gw8Var.getClass();
        this.f6397a = gw8Var;
    }

    public /* synthetic */ do20(Object obj) {
        this.f6397a = obj;
    }
}
