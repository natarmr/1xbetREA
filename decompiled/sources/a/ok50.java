package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.clientauthutils.DigestServerAuthenticationHelper;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.FrameLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public class ok50 implements b43, qe3, zf60, tdo0, gi30 {
    public static final wxs0 b = new wxs0(23);
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25390a;

    public ok50(qek0 qek0Var, d1p d1pVar, wsf0 wsf0Var, lp4 lp4Var, ngb0 ngb0Var, yox yoxVar, ilp0 ilp0Var, cad cadVar, cyh cyhVar, z4w0 z4w0Var, y3v y3vVar, cu cuVar, rou rouVar, zx10 zx10Var, rjo rjoVar, oeg0 oeg0Var, mi70 mi70Var, zn00 zn00Var, tkz tkzVar, hn4 hn4Var, rqj0 rqj0Var, knf0 knf0Var, tgk tgkVar, wxs0 wxs0Var, us3 us3Var, gii0 gii0Var, wwb0 wwb0Var, gst0 gst0Var, okt0 okt0Var, sv3 sv3Var, kt2 kt2Var, peg0 peg0Var, owp0 owp0Var, lef0 lef0Var, pmi0 pmi0Var, hcp0 hcp0Var, ou9 ou9Var, z8w0 z8w0Var, fsd fsdVar) {
        d1pVar.getClass();
        lp4Var.getClass();
        ngb0Var.getClass();
        oeg0Var.getClass();
        hn4Var.getClass();
        knf0Var.getClass();
        tgkVar.getClass();
        us3Var.getClass();
        gii0Var.getClass();
        wwb0Var.getClass();
        gst0Var.getClass();
        sv3Var.getClass();
        kt2Var.getClass();
        fsdVar.getClass();
        d5c.S(tkzVar, qem0.e());
        this.f25390a = new v8i(d1pVar, wsf0Var, ngb0Var, yoxVar, cadVar, hn4Var, knf0Var, tgkVar, wxs0Var, us3Var, gii0Var, wwb0Var, gst0Var, okt0Var, sv3Var, kt2Var, peg0Var, owp0Var, lef0Var, pmi0Var, rqj0Var, y3vVar, cuVar, rouVar, zx10Var, hcp0Var, ou9Var, z8w0Var, fsdVar);
    }

    public static String f(String str, gzp gzpVar, boolean z) {
        String strConcat = gzpVar.f12190a;
        if (z) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance(DigestServerAuthenticationHelper.DEFAULT_ALGORITHM).digest(strReplaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b2 : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b2)));
                }
                strReplaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return kng0.l("lottie_cache_", strReplaceAll, strConcat);
    }

    public k7 e(int i) {
        return null;
    }

    @Override // a.b43
    public sz5 f0() {
        ArrayList arrayList = (ArrayList) this.f25390a;
        return ((cmy) arrayList.get(0)).c() ? new ubv(arrayList, (byte) 1) : new e290(arrayList);
    }

    @Override // a.b43
    public boolean g() {
        ArrayList arrayList = (ArrayList) this.f25390a;
        return arrayList.size() == 1 && ((cmy) arrayList.get(0)).c();
    }

    public k7 h(int i) {
        return null;
    }

    public File i(String str) {
        File file = new File(m(), f(str, gzp.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m(), f(str, gzp.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(m(), f(str, gzp.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    @Override // a.tdo0
    public void j(FrameLayout frameLayout) {
        Function1 function1;
        a99 a99Var = (a99) this.f25390a;
        a99Var.h(frameLayout);
        Object tag = frameLayout.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str == null || (function1 = a99Var.b) == null) {
            return;
        }
        function1.invoke(str);
    }

    @Override // a.b43
    public List j0() {
        return (ArrayList) this.f25390a;
    }

    public ArrayList k(uaq0 uaq0Var) {
        mp1 mp1Var = (mp1) this.f25390a;
        List list = mp1.d;
        int i = 0;
        boolean zO = StringsKt.O(mp1Var.c.c(), "ru", false);
        String strValueOf = String.valueOf(1);
        list.getClass();
        strValueOf.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            kp1 kp1Var = (kp1) obj;
            String strValueOf2 = String.valueOf(i2);
            String str = zO ? "/ru/" : "/en/";
            uaq0.f35345a.getClass();
            String str2 = "_l";
            if (!s9m0.j(uaq0Var)) {
                if (s9m0.i(uaq0Var)) {
                    str2 = "_d";
                } else if (s9m0.k(uaq0Var)) {
                    str2 = "_n";
                }
            }
            arrayList.add(new jp1(kp1Var, axq.n(b1j.n("static/img/android/instructions/onboarding_casino", Separators.SLASH.concat(strValueOf), "/slots", str, strValueOf2), str2, ".webp")));
            i = i2;
        }
        return arrayList;
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        g46 g46Var = (g46) this.f25390a;
        g46Var.m = xiv0Var.a();
        g46Var.n = xiv0Var.b();
        g46Var.o = xiv0Var.c();
        g46Var.g();
        return xiv0Var;
    }

    public File m() {
        File file = new File(((qty) this.f25390a).f29322a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public boolean n(int i, int i2, Bundle bundle) {
        return false;
    }

    public File o(String str, InputStream inputStream, gzp gzpVar) throws IOException {
        File file = new File(m(), f(str, gzpVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    public synchronized fck0 p() {
        fck0 fck0VarM;
        zas0 zas0Var = (zas0) this.f25390a;
        synchronized (zas0Var) {
            fck0VarM = fck0.m((mfx0) ((kfx0) zas0Var.b).c());
        }
        return fck0VarM;
    }

    public ok50(byte b2) {
        switch (b2) {
            case 3:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f25390a = new m7(this);
                } else {
                    this.f25390a = new l7(this);
                }
                break;
            case 4:
                this.f25390a = new vqc((byte) 16);
                break;
            case 11:
                this.f25390a = new AtomicInteger(0);
                break;
            case 17:
                this.f25390a = new kud();
                break;
            default:
                int i = ldw0.f19874a;
                this.f25390a = new w4p0((Object) new qfw0[]{jdk0.i, b}, (byte) 21);
                break;
        }
    }

    public ok50(t37 t37Var) {
        t37Var.getClass();
        this.f25390a = t37Var;
    }

    public ok50(gii0 gii0Var, byte b2) {
        gii0Var.getClass();
        switch (b2) {
            case 15:
                this.f25390a = new zm(gii0Var, (byte) 17);
                break;
            case 18:
                this.f25390a = new zm(gii0Var, (byte) 22);
                break;
            case 22:
                this.f25390a = new zm(gii0Var, (byte) 29);
                break;
            case 24:
                this.f25390a = new sza(gii0Var, (byte) 3);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                this.f25390a = new sza(gii0Var, (byte) 8);
                break;
            default:
                this.f25390a = new zm(gii0Var, (byte) 7);
                break;
        }
    }

    @Override // a.qe3
    public void a(int i) {
    }

    @Override // a.qe3
    public void c(int i) {
    }

    public ok50(pru pruVar, j1q0 j1q0Var, r9u r9uVar) {
        j1q0Var.getClass();
        r9uVar.getClass();
        this.f25390a = new lk5(pruVar, r9uVar, (byte) 1);
    }

    public ok50(sd60 sd60Var) {
        Context context = (Context) sd60Var.b;
        String str = (String) sd60Var.c;
        String str2 = (String) sd60Var.d;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                applicationContext.getSharedPreferences(str2, 0).edit();
            }
            this.f25390a = (zas0) sd60Var.i;
            return;
        }
        jf4.o("keysetName cannot be null");
        throw null;
    }

    public ok50(cad cadVar, gii0 gii0Var, gst0 gst0Var, h0q0 h0q0Var, oeg0 oeg0Var, btt0 btt0Var, xk0 xk0Var, r9s0 r9s0Var, ctf0 ctf0Var, j51 j51Var, knf0 knf0Var, ort ortVar, ntu ntuVar, j1q0 j1q0Var, r9u r9uVar, wsf0 wsf0Var, x2c0 x2c0Var, h03 h03Var, uzc0 uzc0Var, do20 do20Var, m1e m1eVar, uf3 uf3Var, f41 f41Var, pru pruVar, eqx eqxVar, xmt xmtVar, pmi pmiVar, wsf0 wsf0Var2, ocl oclVar) {
        gii0Var.getClass();
        gst0Var.getClass();
        oeg0Var.getClass();
        btt0Var.getClass();
        xk0Var.getClass();
        r9s0Var.getClass();
        ctf0Var.getClass();
        j51Var.getClass();
        knf0Var.getClass();
        j1q0Var.getClass();
        r9uVar.getClass();
        x2c0Var.getClass();
        m1eVar.getClass();
        f41Var.getClass();
        this.f25390a = new nc0(cadVar, gii0Var, gst0Var, h0q0Var, btt0Var, xk0Var, ctf0Var, j51Var, knf0Var, ntuVar, j1q0Var, x2c0Var, pruVar);
    }

    public /* synthetic */ ok50(Object obj) {
        this.f25390a = obj;
    }

    @Override // a.qe3
    public void b(int i, float f) {
    }

    public void d(int i, k7 k7Var, String str, Bundle bundle) {
    }
}
