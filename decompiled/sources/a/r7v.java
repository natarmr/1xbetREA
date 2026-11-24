package a;

import android.javax.sip.header.WarningHeader;
import android.javax.sip.message.Response;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.Window;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.api.ConnectionResult;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import javax.crypto.KeyAgreement;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import okhttp3.ResponseBody;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes2.dex */
public final class r7v implements p3x0, b040, gz5, gz30 {
    public static volatile r7v b;
    public static final byte[] c = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};
    public static final byte[] d = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29996a;

    public r7v(gii0 gii0Var, byte b2) {
        gii0Var.getClass();
        switch (b2) {
            case 14:
                this.f29996a = new zm(gii0Var, (byte) 21);
                break;
            case 15:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case 23:
            default:
                this.f29996a = new zm(gii0Var, (byte) 16);
                break;
            case 16:
                this.f29996a = new zm(gii0Var, (byte) 25);
                break;
            case 17:
                this.f29996a = new zm(gii0Var, (byte) 27);
                break;
            case 18:
                this.f29996a = new zm(gii0Var, (byte) 28);
                break;
            case 22:
                this.f29996a = new sza(gii0Var, (byte) 9);
                break;
            case 24:
                this.f29996a = new sza(gii0Var, (byte) 11);
                break;
        }
    }

    public static void i(r7v r7vVar, long j, String str, long j2, String str2, List list, List list2) {
        r7vVar.getClass();
        s91 s91Var = (s91) r7vVar.f29996a;
        str.getClass();
        str2.getClass();
        list2.getClass();
        if (j2 != 1) {
            if (j2 == 2 || j2 == 0) {
                s91Var.c(new AggregatorScreenModel(str, null, j, new im1(false, true), null, 0L, 0L, "", false, WarningHeader.INSUFFICIENT_BANDWIDTH));
                return;
            }
            return;
        }
        s0s s0sVar = s0s.ONE_X_LIVE_AGGREGATOR;
        if (j == -1) {
            s91Var.c(new AggregatorScreenModel(null, null, 0L, new lm1(), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
        } else {
            s91Var.c(new AggregatorScreenModel(str, str2, j, new hm1(list, list2), null, 0L, 0L, null, false, 496));
        }
    }

    @Override // a.gz5
    public void a(com.google.android.gms.common.ConnectionResult connectionResult) {
        boolean z = connectionResult.b == 0;
        hz5 hz5Var = (hz5) this.f29996a;
        if (z) {
            hz5Var.j(null, hz5Var.k());
            return;
        }
        fz5 fz5Var = hz5Var.p;
        if (fz5Var != null) {
            fz5Var.b(connectionResult);
        }
    }

    @Override // a.p3x0
    public byte[] b(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException {
        Provider provider = (Provider) this.f29996a;
        KeyFactory keyFactory = KeyFactory.getInstance("XDH", provider);
        if (bArr.length != 32) {
            throw new InvalidKeyException("Invalid X25519 private key");
        }
        PrivateKey privateKeyGeneratePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(egm0.B(c, bArr)));
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Invalid X25519 public key");
        }
        PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(egm0.B(d, bArr2)));
        KeyAgreement keyAgreement = KeyAgreement.getInstance("XDH", provider);
        keyAgreement.init(privateKeyGeneratePrivate);
        keyAgreement.doPhase(publicKeyGeneratePublic, true);
        return keyAgreement.generateSecret();
    }

    @Override // a.b040
    public void c(ox30 ox30Var, boolean z) {
        od3 od3Var;
        pd3 pd3Var = (pd3) this.f29996a;
        ox30 ox30VarK = ox30Var.k();
        int i = 0;
        boolean z2 = ox30VarK != ox30Var;
        if (z2) {
            ox30Var = ox30VarK;
        }
        od3[] od3VarArr = pd3Var.k1;
        int length = od3VarArr != null ? od3VarArr.length : 0;
        while (true) {
            if (i < length) {
                od3Var = od3VarArr[i];
                if (od3Var != null && od3Var.h == ox30Var) {
                    break;
                } else {
                    i++;
                }
            } else {
                od3Var = null;
                break;
            }
        }
        if (od3Var != null) {
            if (!z2) {
                pd3Var.J(od3Var, z);
            } else {
                pd3Var.H(od3Var.f25058a, od3Var, ox30VarK);
                pd3Var.J(od3Var, true);
            }
        }
    }

    @Override // a.gz30
    public void d(ox30 ox30Var, MenuItem menuItem) {
        ((wva) this.f29996a).g.removeCallbacksAndMessages(ox30Var);
    }

    public void e(String str, String str2, boolean z, boolean z2, boolean z3) {
        str2.getClass();
        if (z2) {
            if (z) {
                k("orderFrom_bonus_Acc", str2);
                return;
            } else {
                k("betFrom_bonus_Acc", str2);
                return;
            }
        }
        if (z3) {
            if (z) {
                k("betFrom_multiCurrency_Acc", str2);
                return;
            } else {
                k("orderFrom_multiCurrency_Acc", str2);
                return;
            }
        }
        if (z) {
            k("orderFrom_main_Acc", str2);
        } else {
            ((rv3) ((sv3) this.f29996a)).g("betfrom_main_acc", "couponType", str2, "quick", "standart", "promo", str);
        }
    }

    @Override // a.b040
    public boolean f(ox30 ox30Var) {
        Window.Callback callback;
        pd3 pd3Var = (pd3) this.f29996a;
        if (ox30Var != ox30Var.k() || !pd3Var.Z || (callback = pd3Var.l.getCallback()) == null || pd3Var.p1) {
            return true;
        }
        callback.onMenuOpened(108, ox30Var);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(String str, blc blcVar, zje zjeVar) throws zhi0 {
        bk8 bk8Var;
        if (zjeVar instanceof bk8) {
            bk8Var = (bk8) zjeVar;
            int i = bk8Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bk8Var.k = i - Integer.MIN_VALUE;
            } else {
                bk8Var = new bk8(this, zjeVar);
            }
        } else {
            bk8Var = new bk8(this, zjeVar);
        }
        Object objB = bk8Var.i;
        wne wneVar = wne.f39444a;
        int i2 = bk8Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            yk8 yk8Var = (yk8) ((zm) this.f29996a).invoke();
            bk8Var.k = 1;
            objB = yk8Var.b(str, blcVar, bk8Var);
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
        bww.B((ResponseBody) objB);
        return Unit.f46060a;
    }

    public void h(tdn tdnVar, wdn wdnVar) {
        hen henVarA;
        gen genVar = ((ien) this.f29996a).f14642a;
        genVar.getClass();
        qoj0 qoj0Var = genVar.b;
        hen henVarK0 = ebc.k0(qoj0Var);
        int iOrdinal = wdnVar.ordinal();
        if (iOrdinal == 0) {
            henVarA = hen.a(henVarK0, CollectionsKt.r0(henVarK0.f12930a, tdnVar), null, 2);
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            henVarA = hen.a(henVarK0, null, CollectionsKt.r0(henVarK0.b, tdnVar), 1);
        }
        qoj0Var.g(henVarA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(String str, z4a z4aVar, zje zjeVar) throws zhi0 {
        ck8 ck8Var;
        if (zjeVar instanceof ck8) {
            ck8Var = (ck8) zjeVar;
            int i = ck8Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ck8Var.k = i - Integer.MIN_VALUE;
            } else {
                ck8Var = new ck8(this, zjeVar);
            }
        } else {
            ck8Var = new ck8(this, zjeVar);
        }
        Object objA = ck8Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ck8Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            yk8 yk8Var = (yk8) ((zm) this.f29996a).invoke();
            ck8Var.k = 1;
            objA = yk8Var.a(str, z4aVar, ck8Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        bww.B((ResponseBody) objA);
        return Unit.f46060a;
    }

    public void k(String str, String str2) {
        ((rv3) ((sv3) this.f29996a)).g(str, Payload.TYPE, "default", "couponType", str2);
    }

    public vow0 l() {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("XDH", (Provider) this.f29996a);
        keyPairGenerator.initialize(255);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        byte[] encoded = keyPairGenerateKeyPair.getPrivate().getEncoded();
        if (encoded.length != 48) {
            hny.o("Invalid encoded private key length");
            return null;
        }
        if (!x7x0.b(c, encoded)) {
            hny.o("Invalid encoded private key prefix");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 16, encoded.length);
        byte[] encoded2 = keyPairGenerateKeyPair.getPublic().getEncoded();
        if (encoded2.length != 44) {
            hny.o("Invalid encoded public key length");
            return null;
        }
        if (x7x0.b(d, encoded2)) {
            return new vow0(bArrCopyOfRange, Arrays.copyOfRange(encoded2, 12, encoded2.length));
        }
        hny.o("Invalid encoded public key prefix");
        return null;
    }

    @Override // a.gz30
    public void p(ox30 ox30Var, hz30 hz30Var) {
        wva wvaVar = (wva) this.f29996a;
        Handler handler = wvaVar.g;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = wvaVar.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (ox30Var == ((vva) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new pb90((Object) this, (Object) (i2 < arrayList.size() ? (vva) arrayList.get(i2) : null), (Object) hz30Var, (Object) ox30Var, false, (byte) 2), ox30Var, SystemClock.uptimeMillis() + 200);
    }

    public r7v(hz5 hz5Var) {
        Objects.requireNonNull(hz5Var);
        this.f29996a = hz5Var;
    }

    public r7v(igl iglVar) {
        iglVar.getClass();
        this.f29996a = iglVar;
    }

    public r7v(sv3 sv3Var) {
        sv3Var.getClass();
        this.f29996a = sv3Var;
    }

    public r7v(oe6 oe6Var) {
        oe6Var.getClass();
        this.f29996a = oe6Var;
    }

    public r7v(ku0 ku0Var) {
        ku0Var.getClass();
        this.f29996a = ku0Var;
    }

    public r7v(bbw0 bbw0Var) {
        this.f29996a = new j9i(bbw0Var);
    }

    public /* synthetic */ r7v(Object obj) {
        this.f29996a = obj;
    }

    public r7v(s91 s91Var) {
        s91Var.getClass();
        this.f29996a = s91Var;
    }

    public r7v() {
        this.f29996a = new HashSet();
    }
}
