package a;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class psc implements pp9, SuccessContinuation, oef, zf60, giu0, p0h0, lcs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27509a;
    public Object b;

    public psc(byte b) {
        this.f27509a = b;
        switch (b) {
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                this.b = new yox(wjt.o);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                kpd0 kpd0Var = mhk.f21798a;
                this.b = (SmallDisplaySizeQuirk) mhk.a().b(SmallDisplaySizeQuirk.class);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                break;
            default:
                this.b = n0k0.a(new p8i((byte) 3));
                break;
        }
    }

    @Override // a.p0h0
    public diu0 a(vzg0 vzg0Var) {
        pmi pmiVar = (pmi) ((omi) this.b).c;
        jtj jtjVarR4 = ((g8i) pmiVar.b).r4();
        g8i g8iVar = (g8i) pmiVar.b;
        mne mneVarV1 = g8iVar.v1();
        b8u b8uVar = new b8u(g8iVar.v2());
        x4u x4uVar = new x4u(g8iVar.v2());
        qxg0 qxg0Var = new qxg0(g8iVar.v2());
        lbu lbuVarZ4 = g8iVar.z4();
        hnu hnuVar = new hnu(g8iVar.v2());
        i1w0 i1w0Var = (i1w0) pmiVar.c;
        duj dujVarD2 = g8iVar.d2();
        ctf0 ctf0Var = (ctf0) g8iVar.I2.get();
        x1x.x(ctf0Var);
        return new uw50(vzg0Var, jtjVarR4, mneVarV1, b8uVar, x4uVar, qxg0Var, lbuVarZ4, hnuVar, i1w0Var, dujVarD2, ctf0Var, g8iVar.H7(), g8iVar.F7());
    }

    @Override // a.oef
    public rrc b() {
        return ((oef) ((ds3) this.b).invoke()).b();
    }

    @Override // a.giu0
    public diu0 c(Object obj) {
        switch (this.f27509a) {
            case 12:
                q8i q8iVar = (q8i) ((c7i) this.b).c;
                qa60 qa60Var = (qa60) q8iVar.F.get();
                xcc xccVar = (xcc) q8iVar.U.get();
                return new gh70((fq) q8iVar.x.get(), xccVar, q8iVar.f28301a.v1(), (lzt) q8iVar.f.get(), qa60Var, (i1w0) obj);
            case 13:
            default:
                c7i c7iVar = (c7i) this.b;
                qsi qsiVar = (qsi) c7iVar.c;
                v88 v88VarU0 = qsiVar.f29259a.u0();
                wsf0 wsf0VarF0 = qsiVar.f29259a.f0();
                mne mneVarV1 = qsiVar.f29259a.v1();
                fpi0 fpi0Var = (fpi0) qsiVar.m.get();
                fq fqVar = (fq) qsiVar.x.get();
                r8i r8iVar = (r8i) c7iVar.d;
                return new wm70((i1w0) obj, v88VarU0, wsf0VarF0, mneVarV1, fpi0Var, fqVar, (dqx) ((n5d0) r8iVar.g).get(), (itt) qsiVar.u.get(), (qni0) qsiVar.k0.get(), (l1u) ((n5d0) r8iVar.l).get(), (lg60) qsiVar.l0.get(), (qa60) qsiVar.F.get(), (ppb) ((n5d0) r8iVar.m).get(), (i5m0) qsiVar.m0.get(), (lzt) qsiVar.f.get(), (xcc) qsiVar.U.get(), (ztt) qsiVar.k.get(), (d3c) qsiVar.e.get(), (xyb) qsiVar.h.get(), (oqt) qsiVar.p.get(), (y5s) qsiVar.T.get(), (t0u) qsiVar.X.get());
            case 14:
                cii ciiVar = (cii) ((c7i) this.b).c;
                qa60 qa60Var2 = (qa60) ciiVar.F.get();
                xcc xccVar2 = (xcc) ciiVar.U.get();
                return new gh70((fq) ciiVar.x.get(), xccVar2, ciiVar.f4416a.v1(), (lzt) ciiVar.f.get(), qa60Var2, (i1w0) obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public String d(androidx.media3.common.b bVar) {
        String displayName;
        String str = bVar.d;
        String str2 = bVar.b;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            String str3 = vtt0.f38024a;
            Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strO = o(displayName, e(bVar));
        if (!TextUtils.isEmpty(strO)) {
            return strO;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str2;
    }

    public String e(androidx.media3.common.b bVar) {
        Resources resources = (Resources) this.b;
        int i = bVar.f;
        int i2 = bVar.f;
        String string = (i & 2) != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i2 & 4) != 0) {
            string = o(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i2 & 8) != 0) {
            string = o(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i2 & 1088) != 0 ? o(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public int f(byte[] bArr, int i, int i2, int i3, int i4) throws q9c {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[i5 / i6];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            int iF = ((yox) this.b).f(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
            return iF;
        } catch (eie0 unused) {
            throw q9c.a();
        }
    }

    @Override // a.pp9
    public void g(to9 to9Var, jtf0 jtf0Var) {
        ((pdd) this.b).complete(jtf0Var);
    }

    public mne h() {
        return (mne) ((n5d0) this.b).get();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    public String i(androidx.media3.common.b bVar) {
        String strD;
        String string;
        String strD2;
        Resources resources = (Resources) this.b;
        String str = bVar.p;
        int i = bVar.k;
        int i2 = bVar.J;
        int i3 = bVar.x;
        int i4 = bVar.w;
        String str2 = bVar.l;
        int iH = mg40.h(str);
        if (iH == -1) {
            String str3 = null;
            if (str2 == null) {
                strD2 = null;
                break;
            }
            String[] strArrW = vtt0.W(str2);
            int length = strArrW.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    strD2 = null;
                    break;
                }
                strD2 = mg40.d(strArrW[i5]);
                if (strD2 != null && mg40.m(strD2)) {
                    break;
                }
                i5++;
            }
            if (strD2 == null) {
                if (str2 != null) {
                    for (String str4 : vtt0.W(str2)) {
                        String strD3 = mg40.d(str4);
                        if (strD3 != null && mg40.i(strD3)) {
                            str3 = strD3;
                            break;
                        }
                    }
                }
                if (str3 != null) {
                    iH = 1;
                } else if (i4 != -1 || i3 != -1) {
                    iH = 2;
                } else if (i2 == -1 && bVar.L == -1) {
                    iH = -1;
                } else {
                    iH = 1;
                }
            } else {
                iH = 2;
            }
        }
        if (iH == 2) {
            strD = o(e(bVar), (i4 == -1 || i3 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i4), Integer.valueOf(i3)), i != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f)) : "");
        } else if (iH == 1) {
            String strD4 = d(bVar);
            if (i2 == -1 || i2 < 1) {
                string = "";
            } else if (i2 == 1) {
                string = resources.getString(R.string.exo_track_mono);
            } else if (i2 == 2) {
                string = resources.getString(R.string.exo_track_stereo);
            } else if (i2 == 6 || i2 == 7) {
                string = resources.getString(R.string.exo_track_surround_5_point_1);
            } else {
                string = i2 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1);
            }
            strD = o(strD4, string, i != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f)) : "");
        } else {
            strD = d(bVar);
        }
        if (!strD.isEmpty()) {
            return strD;
        }
        String str5 = bVar.d;
        return (str5 == null || str5.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str5);
    }

    public l9u0 j() {
        return new l9u0(((xzp) ((epi0) this.b).b).C());
    }

    public List k(uaq0 uaq0Var) {
        return kotlin.collections.a.c(vfc.O(nag.d, StringsKt.O(((nag) this.b).c.c(), "ru", false), uaq0Var));
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        upg upgVar = (upg) this.b;
        kwd kwdVar = upg.X1;
        jmu0.l(xiv0Var.f40966a.i(1).b, 0, 13, upgVar.G0().e);
        return xiv0Var;
    }

    @Override // a.pp9
    public void m(to9 to9Var, Throwable th) {
        ((pdd) this.b).completeExceptionally(th);
    }

    public void n() {
        meu0 meu0Var = ((neu0) this.b).f23405a;
        v3c.N(meu0Var.b);
        meu0Var.c.o(null, 0L);
    }

    public String o(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (!str.isEmpty()) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.b).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    public void p(int i, og9 og9Var) throws l52 {
        ryc rycVar = (ryc) this.b;
        rycVar.p(i, 2);
        rycVar.q(og9Var.size());
        kg9 kg9Var = (kg9) og9Var;
        rycVar.l(kg9Var.d, kg9Var.i(), kg9Var.size());
    }

    public void q(int i, Object obj, o2h0 o2h0Var) throws l52 {
        ryc rycVar = (ryc) this.b;
        rycVar.p(i, 3);
        o2h0Var.e((x3) obj, rycVar.f31307a);
        rycVar.p(i, 4);
    }

    public void r(int i, Object obj, o2h0 o2h0Var) throws l52 {
        ryc rycVar = (ryc) this.b;
        x3 x3Var = (x3) obj;
        rycVar.p(i, 2);
        rycVar.q(x3Var.b(o2h0Var));
        o2h0Var.e(x3Var, rycVar.f31307a);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        lwi0 lwi0Var = (lwi0) obj;
        f8f f8fVar = ((d8f) this.b).e;
        if (lwi0Var == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        z7f z7fVar = f8f.r;
        return Tasks.whenAll((Task<?>[]) new Task[]{f8fVar.g(), f8fVar.m.D(null, (aaf) f8fVar.e.b)});
    }

    public psc(odj odjVar) {
        this.f27509a = (byte) 18;
        odjVar.getClass();
        this.b = odjVar;
    }

    public psc(tgk tgkVar) {
        this.f27509a = (byte) 25;
        tgkVar.getClass();
        this.b = tgkVar;
    }

    public psc(neu0 neu0Var) {
        this.f27509a = (byte) 1;
        neu0Var.getClass();
        this.b = neu0Var;
    }

    public psc(gii0 gii0Var, byte b) {
        this.f27509a = b;
        gii0Var.getClass();
        switch (b) {
            case 7:
                this.b = new sza(gii0Var, (byte) 18);
                break;
            default:
                this.b = new sza(gii0Var, (byte) 15);
                break;
        }
    }

    public psc(azj0 azj0Var) {
        this.f27509a = (byte) 27;
        azj0Var.getClass();
        this.b = azj0Var;
    }

    public psc(Resources resources) {
        this.f27509a = (byte) 22;
        resources.getClass();
        this.b = resources;
    }

    public /* synthetic */ psc(Object obj, byte b) {
        this.f27509a = b;
        this.b = obj;
    }

    public psc(ryc rycVar) {
        this.f27509a = (byte) 2;
        Charset charset = cmx.f4629a;
        this.b = rycVar;
        rycVar.f31307a = this;
    }

    public psc(d8f d8fVar, String str) {
        this.f27509a = (byte) 5;
        this.b = d8fVar;
    }
}
