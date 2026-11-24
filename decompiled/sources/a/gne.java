package a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.huawei.hms.api.ConnectionResult;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.client1.features.appactivity.ApplicationActivity;
import org.xplatform.core.navigation.authorization.model.AuthType;
import org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gne implements uu9, k4r, zf60, rw3, xbf, zon0, d1x, SuccessContinuation, izj, jgd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11581a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gne(Object obj, byte b) {
        this.f11581a = b;
        this.b = obj;
    }

    @Override // a.izj
    public void a(p5d0 p5d0Var) {
        k8f k8fVar = (k8f) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        k8fVar.b.set((k8f) p5d0Var.get());
    }

    @Override // a.zon0
    public void b() {
        ii5 ii5Var = (ii5) this.b;
        gfk0 gfk0Var = ii5.O1;
        ii5Var.J0().N();
    }

    @Override // a.xbf
    public Object c(Object obj) {
        AuthType authType = (AuthType) this.b;
        ((m1r) obj).getClass();
        d54.R1.getClass();
        d54 d54Var = new d54();
        d54Var.P1.J(d54Var, d54.S1[1], authType);
        return d54Var;
    }

    public vw3 d(es esVar) {
        k8b k8bVar = (k8b) this.b;
        URL url = (URL) esVar.f8305a;
        String strY = m8x.Y("CctTransportBackend");
        if (Log.isLoggable(strY, 4)) {
            Log.i(strY, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(130000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) esVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    g2v g2vVar = k8bVar.f17865a;
                    n15 n15Var = (n15) esVar.b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    hcy hcyVar = (hcy) g2vVar.f10580a;
                    xdy xdyVar = new xdy(bufferedWriter, hcyVar.f12843a, hcyVar.b, hcyVar.c, hcyVar.d);
                    xdyVar.h(n15Var);
                    xdyVar.j();
                    xdyVar.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strY2 = m8x.Y("CctTransportBackend");
                    if (Log.isLoggable(strY2, 4)) {
                        Log.i(strY2, String.format("Status Code: %d", numValueOf));
                    }
                    m8x.N(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    m8x.N(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new vw3(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new vw3(responseCode, (URL) null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            vw3 vw3Var = new vw3(responseCode, (URL) null, j45.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f15868a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return vw3Var;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (hwn e) {
            e = e;
            m8x.O(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new vw3(Response.BAD_REQUEST, (URL) null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            m8x.O(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new vw3(500, (URL) null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            m8x.O(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new vw3(500, (URL) null, 0L);
        } catch (IOException e4) {
            e = e4;
            m8x.O(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new vw3(Response.BAD_REQUEST, (URL) null, 0L);
        }
    }

    @Override // a.d1x
    public void e(e1x e1xVar) throws Exception {
        esg0 esg0Var = (esg0) this.b;
        try {
            b1x b1xVarB = e1xVar.b();
            StringBuilder sb = new StringBuilder("OnImageAvailableListener: mCurrentRequest ID = ");
            dzb0 dzb0Var = (dzb0) esg0Var.f8326a;
            sb.append(dzb0Var == null ? null : Integer.valueOf(dzb0Var.f6936a));
            sb.append(", image.isNull = ");
            sb.append(b1xVarB == null);
            l8x.U("CaptureNode", sb.toString());
            if (b1xVarB != null) {
                esg0Var.n0(b1xVarB);
                return;
            }
            dzb0 dzb0Var2 = (dzb0) esg0Var.f8326a;
            if (dzb0Var2 != null) {
                esg0Var.x0(new n55(dzb0Var2.f6936a, new ozw(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e) {
            dzb0 dzb0Var3 = (dzb0) esg0Var.f8326a;
            if (dzb0Var3 != null) {
                esg0Var.x0(new n55(dzb0Var3.f6936a, new ozw(2, "Failed to acquire latest image", e)));
            }
        }
    }

    @Override // a.uu9
    public Object f(tu9 tu9Var) {
        ig00 ig00VarI;
        byte b;
        byte b2 = this.f11581a;
        Object obj = this.b;
        switch (b2) {
            case 0:
                ((pby) obj).invokeOnCompletion(new ejd(tu9Var, (byte) 14));
                return "Job.asListenableFuture";
            case 20:
                j2a j2aVar = (j2a) obj;
                synchronized (j2aVar.f15771a) {
                    j2aVar.e = tu9Var;
                    break;
                }
                return "CameraRepository-deinit";
            default:
                j4a j4aVar = (j4a) obj;
                j4aVar.n.f();
                if (j4aVar.o.a()) {
                    veg0 veg0Var = (veg0) j4aVar.o.getValue();
                    synchronized (veg0Var.f37287a) {
                        veg0Var.b.disable();
                        veg0Var.c.clear();
                        veg0Var.d = -1;
                    }
                }
                j2a j2aVar2 = j4aVar.f15874a;
                synchronized (j2aVar2.f15771a) {
                    try {
                        boolean zIsEmpty = j2aVar2.b.isEmpty();
                        ig00VarI = j2aVar2.d;
                        b = 20;
                        if (!zIsEmpty) {
                            if (ig00VarI == null) {
                                ig00VarI = y0x0.I(new gne(j2aVar2, b));
                                j2aVar2.d = ig00VarI;
                            }
                            j2aVar2.c.addAll(j2aVar2.b.values());
                            for (s0a s0aVar : j2aVar2.b.values()) {
                                s0aVar.release().a(new fy2(j2aVar2, s0aVar, (byte) 18), bnk.a());
                            }
                            j2aVar2.b.clear();
                        } else if (ig00VarI == null) {
                            ig00VarI = m3x.c;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ig00VarI.a(new fy2(j4aVar, tu9Var, b), j4aVar.d);
                return "CameraX shutdownInternal";
        }
    }

    @Override // a.rw3
    public int g(int i, k6z k6zVar) {
        byte b = this.f11581a;
        Object obj = this.b;
        switch (b) {
            case 11:
                return ((yx7) obj).a(0, i);
            default:
                return ((xx7) obj).a(0, i, k6zVar);
        }
    }

    @Override // a.k4r
    public void i(Bundle bundle, String str) {
        Object serializable;
        String string;
        byte b = this.f11581a;
        Object obj = this.b;
        switch (b) {
            case 1:
                pek0 pek0Var = l8.P1;
                str.getClass();
                ((l8) obj).H0().y();
                break;
            case 2:
                qek0 qek0Var = y8.P1;
                str.getClass();
                ((y8) obj).H0().y();
                break;
            case 3:
                rek0 rek0Var = f9.P1;
                str.getClass();
                ((f9) obj).H0().y();
                break;
            case 4:
                gfk0 gfk0Var = t9.P1;
                str.getClass();
                ((t9) obj).H0().y();
                break;
            case 5:
                yi90 yi90Var = (yi90) obj;
                str.getClass();
                if (str.equals("SELECT_PHONE_ACTION_DIALOG_KEY")) {
                    Object obj2 = bundle.get("SELECT_PHONE_ACTION_DIALOG_KEY");
                    if (obj2 == null) {
                        e9d0.o();
                    } else {
                        yi90Var.invoke((Serializable) obj2);
                    }
                    break;
                }
                break;
            case 6:
                pek0 pek0Var2 = dm0.S1;
                str.getClass();
                ((dm0) obj).G0().x(il0.f14953a);
                break;
            case 7:
                hfk0 hfk0Var = on1.S1;
                str.getClass();
                ((on1) obj).G0().x(cn1.f4632a);
                break;
            case 8:
                ty1 ty1Var = (ty1) obj;
                rek0 rek0Var2 = ty1.R1;
                str.getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = bundle.getSerializable("RESULT_TOURNAMENT_PAGE", s9s0.class);
                } else {
                    Object serializable2 = bundle.getSerializable("RESULT_TOURNAMENT_PAGE");
                    if (!(serializable2 instanceof s9s0)) {
                        serializable2 = null;
                    }
                    serializable = (s9s0) serializable2;
                }
                s9s0 s9s0Var = serializable instanceof s9s0 ? (s9s0) serializable : null;
                if (s9s0Var != null) {
                    ty1Var.G0().x(new nx1(s9s0Var));
                }
                break;
            case 9:
                t42 t42Var = (t42) obj;
                jdk0 jdk0Var = t42.p2;
                str.getClass();
                if (str.equals("DATE_PICKER_REQUEST_KEY") && !bundle.containsKey("BUNDLE_RESULT_CANCELED")) {
                    t42Var.Q0().x(new l42(bundle.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                }
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 20:
            case 21:
            case 22:
            default:
                kj5 kj5Var = xnb.w2;
                str.getClass();
                ((xnb) obj).S0().y();
                break;
            case 17:
                e68 e68Var = (e68) obj;
                cl5 cl5Var = e68.N1;
                str.getClass();
                if (str.hashCode() == -374876812 && str.equals("FINGERPRINT_REQUEST_KEY")) {
                    e68Var.H0().w(m2a.e);
                }
                break;
            case 18:
                tv8 tv8Var = (tv8) obj;
                yk5 yk5Var = tv8.N1;
                str.getClass();
                if (str.equals("BRAND_GAMES_SELECT_SORT_OPTION_REQUEST_KEY") && (string = bundle.getString("BRAND_GAMES_SELECT_SORT_OPTION_REQUEST_KEY")) != null) {
                    ((k3t0) tv8Var.M1.getValue()).x(new kv8(string));
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                gl5 gl5Var = wq9.S1;
                str.getClass();
                ((wq9) obj).G0().x(lq9.f20475a);
                break;
            case 23:
                xra xraVar = (xra) obj;
                cl5 cl5Var2 = xra.X1;
                str.getClass();
                List parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("REMOVE_ALL_SPORT_EVENTS_RESULT", FavoriteGroupHeaderUiItem.class) : bundle.getParcelableArrayList("REMOVE_ALL_SPORT_EVENTS_RESULT");
                if (parcelableArrayList == null) {
                    parcelableArrayList = iun.f15405a;
                }
                if (!parcelableArrayList.isEmpty()) {
                    xraVar.P0().x(new yf2(parcelableArrayList));
                }
                break;
        }
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        Object value;
        byte b = this.f11581a;
        Object obj = this.b;
        switch (b) {
            case 10:
                int i = ApplicationActivity.F1;
                view.getClass();
                uiv0 uiv0Var = xiv0Var.f40966a;
                int i2 = uiv0Var.i(2).d;
                int i3 = uiv0Var.i(8).d;
                boolean zU = uiv0Var.u(8);
                vfx vfxVar = ((ApplicationActivity) obj).f1;
                if (vfxVar == null) {
                    Intrinsics.h("insetsHolder");
                    throw null;
                }
                p7m0 p7m0Var = vfxVar.f37357a;
                do {
                    value = p7m0Var.getValue();
                    ((cgx) value).getClass();
                } while (!p7m0Var.m(value, new cgx(i2, i3, zU)));
                return xiv0Var;
            default:
                yx5 yx5Var = (yx5) obj;
                view.getClass();
                jmu0.l(knm0.o(yx5Var.y0(), xiv0Var), 0, 13, yx5Var.q0());
                return xiv0Var;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult((qrd) this.b);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0434  */
    /* JADX WARN: Code duplicated, block: B:101:0x0439  */
    /* JADX WARN: Code duplicated, block: B:109:0x0546 A[Catch: Exception -> 0x054c, TryCatch #1 {Exception -> 0x054c, blocks: (B:104:0x0446, B:106:0x0514, B:107:0x0519, B:109:0x0546, B:113:0x0550, B:115:0x0558, B:117:0x0566, B:119:0x056c, B:121:0x0575, B:122:0x0579), top: B:146:0x0446 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x057d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0586  */
    /* JADX WARN: Code duplicated, block: B:130:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:139:0x060c  */
    /* JADX WARN: Code duplicated, block: B:141:0x061b  */
    /* JADX WARN: Code duplicated, block: B:148:0x03e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:48:0x023b A[Catch: NameNotFoundException -> 0x05f9, TryCatch #0 {NameNotFoundException -> 0x05f9, blocks: (B:46:0x0224, B:48:0x023b, B:51:0x024d, B:54:0x0253, B:50:0x0246), top: B:144:0x0224 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0246 A[Catch: NameNotFoundException -> 0x05f9, TryCatch #0 {NameNotFoundException -> 0x05f9, blocks: (B:46:0x0224, B:48:0x023b, B:51:0x024d, B:54:0x0253, B:50:0x0246), top: B:144:0x0224 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0251  */
    /* JADX WARN: Code duplicated, block: B:57:0x027d  */
    /* JADX WARN: Code duplicated, block: B:60:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:62:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:63:0x0300  */
    /* JADX WARN: Code duplicated, block: B:67:0x030e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0314  */
    /* JADX WARN: Code duplicated, block: B:74:0x033c A[LOOP:3: B:72:0x0336->B:74:0x033c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0350  */
    /* JADX WARN: Code duplicated, block: B:78:0x035b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0362  */
    /* JADX WARN: Code duplicated, block: B:82:0x0365  */
    /* JADX WARN: Code duplicated, block: B:88:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:90:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:98:0x042c  */
    @Override // a.jgd
    public Object x0(pzu pzuVar) throws Throwable {
        String str;
        cu cuVar;
        qaj qajVar;
        int i;
        Throwable th;
        String strK;
        tfq tfqVar;
        long jCurrentTimeMillis;
        String strH;
        PackageInfo packageInfo;
        String string;
        String str2;
        String str3;
        String strK2;
        String strD;
        int iN;
        String string2;
        String[] strArr;
        ArrayList arrayList;
        int i2;
        String str4;
        StringBuilder sb;
        Iterator it;
        String string3;
        String str5;
        String strW;
        int i3;
        sd60 sd60Var;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        lwi0 lwi0VarC;
        qaj qajVar2;
        Task taskOnSuccessTask;
        boolean zL;
        String str6;
        String str7;
        cu cuVar2;
        boolean zExists;
        NetworkInfo activeNetworkInfo;
        lwi0 lwi0VarC2;
        String str8;
        String string4;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.b;
        int i4 = CrashlyticsRegistrar.d;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        nfq nfqVar = (nfq) pzuVar.a(nfq.class);
        dgq dgqVar = (dgq) pzuVar.a(dgq.class);
        y680 y680VarH = pzuVar.H(k8f.class);
        y680 y680VarH2 = pzuVar.H(vp2.class);
        y680 y680VarH3 = pzuVar.H(bhq.class);
        ExecutorService executorService = (ExecutorService) pzuVar.e(crashlyticsRegistrar.f45663a);
        ExecutorService executorService2 = (ExecutorService) pzuVar.e(crashlyticsRegistrar.b);
        ExecutorService executorService3 = (ExecutorService) pzuVar.e(crashlyticsRegistrar.c);
        nfqVar.a();
        Context context = nfqVar.f23449a;
        String packageName = context.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.1.1 for " + packageName, null);
        cu cuVar3 = new cu(executorService, executorService2);
        xzp xzpVar = new xzp(context);
        qaj qajVar3 = new qaj(nfqVar);
        hxw hxwVar = new hxw(context, packageName, dgqVar, qajVar3);
        k8f k8fVar = new k8f(y680VarH);
        yp2 yp2Var = new yp2(y680VarH2);
        a8f a8fVar = new a8f(qajVar3, xzpVar);
        nhq nhqVar = nhq.f23546a;
        jki0 jki0Var = jki0.f16670a;
        nhq nhqVar2 = nhq.f23546a;
        lhq lhqVarA = nhq.a(jki0Var);
        if (lhqVarA.b != null) {
            Log.d("FirebaseSessions", "Subscriber " + jki0Var + " already registered.");
        } else {
            lhqVarA.b = a8fVar;
            Log.d("FirebaseSessions", "Subscriber " + jki0Var + " registered.");
            lhqVarA.f20069a.countDown();
        }
        qaj qajVar4 = qajVar3;
        j8f j8fVar = new j8f(nfqVar, hxwVar, k8fVar, qajVar4, new xp2(yp2Var), new xp2(yp2Var), xzpVar, a8fVar, new nr00(y680VarH3), cuVar3);
        cu cuVar4 = j8fVar.o;
        nfqVar.a();
        String str9 = nfqVar.c.b;
        int iN2 = aad.N(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iN2 == 0) {
            iN2 = aad.N(context, "com.crashlytics.android.build_id", "string");
        }
        String string5 = iN2 != 0 ? context.getResources().getString(iN2) : null;
        ArrayList<cb9> arrayList2 = new ArrayList();
        int iN3 = aad.N(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iN4 = aad.N(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iN5 = aad.N(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        try {
            try {
                try {
                    if (iN3 == 0 || iN4 == 0 || iN5 == 0) {
                        str = str9;
                        cuVar = cuVar4;
                        qajVar = qajVar4;
                        String str10 = String.format("Could not find resources: %d %d %d", Integer.valueOf(iN3), Integer.valueOf(iN4), Integer.valueOf(iN5));
                        i = 3;
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            th = null;
                            Log.d("FirebaseCrashlytics", str10, null);
                        }
                        strK = kng0.k("Mapping file ID is: ", string5);
                        if (Log.isLoggable("FirebaseCrashlytics", i)) {
                            Log.d("FirebaseCrashlytics", strK, th);
                        }
                        for (cb9 cb9Var : arrayList2) {
                            String str11 = cb9Var.f4051a;
                            String str12 = cb9Var.b;
                            String str13 = cb9Var.c;
                            StringBuilder sbN = b1j.n("Build id for ", str11, " on ", str12, ": ");
                            sbN.append(str13);
                            string4 = sbN.toString();
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", string4, null);
                            }
                        }
                        fhj fhjVar = new fhj(context, (byte) 4);
                        String packageName2 = context.getPackageName();
                        String strD2 = hxwVar.d();
                        packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
                        if (Build.VERSION.SDK_INT >= 28) {
                            string = Long.toString(packageInfo.getLongVersionCode());
                        } else {
                            string = Integer.toString(packageInfo.versionCode);
                        }
                        String str14 = string;
                        str2 = packageInfo.versionName;
                        if (str2 == null) {
                            str2 = "0.0";
                        }
                        String str15 = str2;
                        rrd rrdVar = new rrd((Object) str, (Object) string5, (Object) arrayList2, (Object) strD2, (Object) packageName2, (Object) str14, (Object) str15, (Object) fhjVar, (byte) 1);
                        str3 = str;
                        strK2 = kng0.k("Installer package name is: ", strD2);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strK2, null);
                        }
                        art artVar = new art();
                        strD = hxwVar.d();
                        j6m0 j6m0Var = new j6m0((byte) 10);
                        dpi0 dpi0Var = new dpi0(j6m0Var);
                        do20 do20Var = new do20();
                        do20Var.f6397a = new File((File) xzpVar.c, "com.crashlytics.settings.json");
                        Locale locale = Locale.US;
                        fhn fhnVar = new fhn(kng0.l("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str3, "/settings"), artVar);
                        String str16 = Build.MANUFACTURER;
                        String str17 = hxw.h;
                        String strQ = w6x.q(str16.replaceAll(str17, ""), Separators.SLASH, Build.MODEL.replaceAll(str17, ""));
                        String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str17, "");
                        String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str17, "");
                        iN = aad.N(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                        if (iN == 0) {
                            iN = aad.N(context, "com.crashlytics.android.build_id", "string");
                        }
                        if (iN != 0) {
                            string2 = context.getResources().getString(iN);
                        } else {
                            string2 = null;
                        }
                        strArr = new String[]{string2, str3, str15, str14};
                        arrayList = new ArrayList();
                        i2 = 0;
                        while (i2 < 4) {
                            str8 = strArr[i2];
                            String str18 = str3;
                            if (str8 != null) {
                                arrayList.add(str8.replace("-", "").toLowerCase(Locale.US));
                            }
                            i2++;
                            str3 = str18;
                        }
                        str4 = str3;
                        Collections.sort(arrayList);
                        sb = new StringBuilder();
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            sb.append((String) it.next());
                        }
                        string3 = sb.toString();
                        if (string3.length() > 0) {
                            strW = aad.W(string3);
                            str5 = str4;
                        } else {
                            str5 = str4;
                            strW = null;
                        }
                        if (strD != null) {
                            i3 = 4;
                        } else {
                            i3 = 1;
                        }
                        sd60Var = new sd60(context, new z6j0(str5, strQ, strReplaceAll, strReplaceAll2, hxwVar, strW, str15, str14, b1j.b(i3)), j6m0Var, dpi0Var, do20Var, fhnVar, qajVar);
                        atomicReference = (AtomicReference) sd60Var.i;
                        atomicReference2 = (AtomicReference) sd60Var.h;
                        if (((Context) sd60Var.b).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((z6j0) sd60Var.c).f) || (lwi0VarC2 = sd60Var.c(1)) == null) {
                            lwi0VarC = sd60Var.c(3);
                            if (lwi0VarC != null) {
                                atomicReference2.set(lwi0VarC);
                                ((TaskCompletionSource) atomicReference.get()).trySetResult(lwi0VarC);
                            }
                            qajVar2 = (qaj) sd60Var.g;
                            Task task = ((TaskCompletionSource) qajVar2.e).getTask();
                            synchronized (qajVar2.b) {
                                Task task2 = ((TaskCompletionSource) qajVar2.d).getTask();
                            }
                            Task taskR0 = q8a.r0(task, task2);
                            aaf aafVar = (aaf) cuVar3.b;
                            g090 g090Var = new g090();
                            g090Var.b = sd60Var;
                            g090Var.f10448a = cuVar3;
                            taskOnSuccessTask = taskR0.onSuccessTask(aafVar, g090Var);
                        } else {
                            atomicReference2.set(lwi0VarC2);
                            ((TaskCompletionSource) atomicReference.get()).trySetResult(lwi0VarC2);
                            taskOnSuccessTask = Tasks.forResult(null);
                        }
                        taskOnSuccessTask.addOnFailureListener(executorService3, new udk((byte) 23));
                        xzp xzpVar2 = j8fVar.i;
                        Context context2 = j8fVar.f16080a;
                        zL = aad.L(context2, "com.google.firebase.crashlytics.RequireBuildId", aad.L(context2, "com.crashlytics.RequireBuildId", true));
                        str6 = (String) rrdVar.c;
                        if (zL) {
                            if (TextUtils.isEmpty(str6)) {
                                Log.e("FirebaseCrashlytics", Separators.DOT);
                                Log.e("FirebaseCrashlytics", ".     |  | ");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                                Log.e("FirebaseCrashlytics", ".    \\    /");
                                Log.e("FirebaseCrashlytics", ".     \\  /");
                                Log.e("FirebaseCrashlytics", ".      \\/");
                                Log.e("FirebaseCrashlytics", Separators.DOT);
                                Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                Log.e("FirebaseCrashlytics", Separators.DOT);
                                Log.e("FirebaseCrashlytics", ".      /\\");
                                Log.e("FirebaseCrashlytics", ".     /  \\");
                                Log.e("FirebaseCrashlytics", ".    /    \\");
                                Log.e("FirebaseCrashlytics", ".   / |  | \\");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", Separators.DOT);
                                jf4.n("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                return null;
                            }
                        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Configured not to require a build ID.", null);
                        }
                        str7 = new dh9().f6081a;
                        j8fVar.f = new c5k("crash_marker", xzpVar2);
                        j8fVar.e = new c5k("initialization_marker", xzpVar2);
                        cuVar2 = cuVar;
                        ywq0 ywq0Var = new ywq0(str7, xzpVar2, cuVar2);
                        yzn0 yzn0Var = new yzn0(xzpVar2);
                        dq00 dq00Var = new dq00(new zul0[]{new gne0((byte) 6)});
                        ((y680) j8fVar.n.f23980a).a(new ex60(new p8f(ywq0Var), (byte) 20));
                        j8fVar.g = new f8f(j8fVar.f16080a, j8fVar.h, j8fVar.b, j8fVar.i, j8fVar.f, rrdVar, ywq0Var, yzn0Var, ywq0.f(j8fVar.f16080a, j8fVar.h, j8fVar.i, rrdVar, yzn0Var, ywq0Var, dq00Var, sd60Var, j8fVar.c, j8fVar.l, j8fVar.o), j8fVar.m, j8fVar.k, j8fVar.l, j8fVar.o);
                        c5k c5kVar = j8fVar.e;
                        zExists = new File((File) ((xzp) c5kVar.b).c, (String) c5kVar.f3775a).exists();
                        Boolean.TRUE.equals((Boolean) ((aaf) cuVar2.b).f520a.submit(new hrd(j8fVar, (byte) 2)).get(3L, TimeUnit.SECONDS));
                        f8f f8fVar = j8fVar.g;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        ((aaf) f8fVar.e.b).a(new a4e(f8fVar, str7, (byte) 3));
                        y9f y9fVar = new y9f(new rrc(f8fVar, (byte) 7), sd60Var, defaultUncaughtExceptionHandler, f8fVar.j);
                        f8fVar.n = y9fVar;
                        Thread.setDefaultUncaughtExceptionHandler(y9fVar);
                        if (Build.VERSION.SDK_INT >= 37) {
                            j8fVar.g.c(str7);
                        }
                        if (zExists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                            }
                            ((aaf) cuVar2.b).a(new g8f(j8fVar, sd60Var, (byte) 0));
                        } else {
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                            }
                            j8fVar.b(sd60Var);
                        }
                        tfqVar = new tfq(j8fVar);
                        jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                        if (jCurrentTimeMillis > 16) {
                            strH = axq.h(jCurrentTimeMillis, "Initializing Crashlytics blocked main for ", " ms");
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", strH, null);
                            }
                        }
                        return tfqVar;
                    }
                    String[] stringArray = context.getResources().getStringArray(iN3);
                    String[] stringArray2 = context.getResources().getStringArray(iN4);
                    String[] stringArray3 = context.getResources().getStringArray(iN5);
                    str = str9;
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i5 = 0;
                        while (i5 < stringArray3.length) {
                            int i6 = i5;
                            arrayList2.add(new cb9(stringArray[i6], stringArray2[i6], stringArray3[i6]));
                            i5 = i6 + 1;
                            qajVar4 = qajVar4;
                            cuVar4 = cuVar4;
                        }
                        cuVar = cuVar4;
                        qajVar = qajVar4;
                    } else {
                        cuVar = cuVar4;
                        qajVar = qajVar4;
                        String str19 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", str19, null);
                        }
                    }
                    i = 3;
                    Boolean.TRUE.equals((Boolean) ((aaf) cuVar2.b).f520a.submit(new hrd(j8fVar, (byte) 2)).get(3L, TimeUnit.SECONDS));
                } catch (Exception unused) {
                }
                j8fVar.f = new c5k("crash_marker", xzpVar2);
                j8fVar.e = new c5k("initialization_marker", xzpVar2);
                cuVar2 = cuVar;
                ywq0 ywq0Var2 = new ywq0(str7, xzpVar2, cuVar2);
                yzn0 yzn0Var2 = new yzn0(xzpVar2);
                dq00 dq00Var2 = new dq00(new zul0[]{new gne0((byte) 6)});
                ((y680) j8fVar.n.f23980a).a(new ex60(new p8f(ywq0Var2), (byte) 20));
                j8fVar.g = new f8f(j8fVar.f16080a, j8fVar.h, j8fVar.b, j8fVar.i, j8fVar.f, rrdVar, ywq0Var2, yzn0Var2, ywq0.f(j8fVar.f16080a, j8fVar.h, j8fVar.i, rrdVar, yzn0Var2, ywq0Var2, dq00Var2, sd60Var, j8fVar.c, j8fVar.l, j8fVar.o), j8fVar.m, j8fVar.k, j8fVar.l, j8fVar.o);
                c5k c5kVar2 = j8fVar.e;
                zExists = new File((File) ((xzp) c5kVar2.b).c, (String) c5kVar2.f3775a).exists();
                f8f f8fVar2 = j8fVar.g;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                ((aaf) f8fVar2.e.b).a(new a4e(f8fVar2, str7, (byte) 3));
                y9f y9fVar2 = new y9f(new rrc(f8fVar2, (byte) 7), sd60Var, defaultUncaughtExceptionHandler2, f8fVar2.j);
                f8fVar2.n = y9fVar2;
                Thread.setDefaultUncaughtExceptionHandler(y9fVar2);
                if (Build.VERSION.SDK_INT >= 37) {
                    j8fVar.g.c(str7);
                }
                if (zExists) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                    }
                    ((aaf) cuVar2.b).a(new g8f(j8fVar, sd60Var, (byte) 0));
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                    }
                    ((aaf) cuVar2.b).a(new g8f(j8fVar, sd60Var, (byte) 0));
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics was not started due to an exception during initialization", e);
                j8fVar.g = null;
            }
            String packageName3 = context.getPackageName();
            String strD3 = hxwVar.d();
            packageInfo = context.getPackageManager().getPackageInfo(packageName3, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                string = Long.toString(packageInfo.getLongVersionCode());
            } else {
                string = Integer.toString(packageInfo.versionCode);
            }
            String str110 = string;
            str2 = packageInfo.versionName;
            if (str2 == null) {
                str2 = "0.0";
            }
            String str111 = str2;
            rrd rrdVar2 = new rrd((Object) str, (Object) string5, (Object) arrayList2, (Object) strD3, (Object) packageName3, (Object) str110, (Object) str111, (Object) fhjVar, (byte) 1);
            str3 = str;
            strK2 = kng0.k("Installer package name is: ", strD3);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strK2, null);
            }
            art artVar2 = new art();
            strD = hxwVar.d();
            j6m0 j6m0Var2 = new j6m0((byte) 10);
            dpi0 dpi0Var2 = new dpi0(j6m0Var2);
            do20 do20Var2 = new do20();
            do20Var2.f6397a = new File((File) xzpVar.c, "com.crashlytics.settings.json");
            Locale locale2 = Locale.US;
            fhn fhnVar2 = new fhn(kng0.l("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str3, "/settings"), artVar2);
            String str112 = Build.MANUFACTURER;
            String str113 = hxw.h;
            String strQ2 = w6x.q(str112.replaceAll(str113, ""), Separators.SLASH, Build.MODEL.replaceAll(str113, ""));
            String strReplaceAll3 = Build.VERSION.INCREMENTAL.replaceAll(str113, "");
            String strReplaceAll4 = Build.VERSION.RELEASE.replaceAll(str113, "");
            iN = aad.N(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (iN == 0) {
                iN = aad.N(context, "com.crashlytics.android.build_id", "string");
            }
            if (iN != 0) {
                string2 = context.getResources().getString(iN);
            } else {
                string2 = null;
            }
            strArr = new String[]{string2, str3, str111, str110};
            arrayList = new ArrayList();
            i2 = 0;
            while (i2 < 4) {
                str8 = strArr[i2];
                String str114 = str3;
                if (str8 != null) {
                    arrayList.add(str8.replace("-", "").toLowerCase(Locale.US));
                }
                i2++;
                str3 = str114;
            }
            str4 = str3;
            Collections.sort(arrayList);
            sb = new StringBuilder();
            it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            string3 = sb.toString();
            if (string3.length() > 0) {
                strW = aad.W(string3);
                str5 = str4;
            } else {
                str5 = str4;
                strW = null;
            }
            if (strD != null) {
                i3 = 4;
            } else {
                i3 = 1;
            }
            sd60Var = new sd60(context, new z6j0(str5, strQ2, strReplaceAll3, strReplaceAll4, hxwVar, strW, str111, str110, b1j.b(i3)), j6m0Var2, dpi0Var2, do20Var2, fhnVar2, qajVar);
            atomicReference = (AtomicReference) sd60Var.i;
            atomicReference2 = (AtomicReference) sd60Var.h;
            if (((Context) sd60Var.b).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((z6j0) sd60Var.c).f)) {
                lwi0VarC = sd60Var.c(3);
                if (lwi0VarC != null) {
                    atomicReference2.set(lwi0VarC);
                    ((TaskCompletionSource) atomicReference.get()).trySetResult(lwi0VarC);
                }
                qajVar2 = (qaj) sd60Var.g;
                Task task3 = ((TaskCompletionSource) qajVar2.e).getTask();
                synchronized (qajVar2.b) {
                    Task task4 = ((TaskCompletionSource) qajVar2.d).getTask();
                    Task taskR1 = q8a.r0(task3, task4);
                    aaf aafVar2 = (aaf) cuVar3.b;
                    g090 g090Var2 = new g090();
                    g090Var2.b = sd60Var;
                    g090Var2.f10448a = cuVar3;
                    taskOnSuccessTask = taskR1.onSuccessTask(aafVar2, g090Var2);
                }
            } else {
                lwi0VarC = sd60Var.c(3);
                if (lwi0VarC != null) {
                    atomicReference2.set(lwi0VarC);
                    ((TaskCompletionSource) atomicReference.get()).trySetResult(lwi0VarC);
                }
                qajVar2 = (qaj) sd60Var.g;
                Task task5 = ((TaskCompletionSource) qajVar2.e).getTask();
                synchronized (qajVar2.b) {
                    Task task6 = ((TaskCompletionSource) qajVar2.d).getTask();
                    Task taskR2 = q8a.r0(task5, task6);
                    aaf aafVar3 = (aaf) cuVar3.b;
                    g090 g090Var3 = new g090();
                    g090Var3.b = sd60Var;
                    g090Var3.f10448a = cuVar3;
                    taskOnSuccessTask = taskR2.onSuccessTask(aafVar3, g090Var3);
                }
            }
            taskOnSuccessTask.addOnFailureListener(executorService3, new udk((byte) 23));
            xzp xzpVar3 = j8fVar.i;
            Context context3 = j8fVar.f16080a;
            zL = aad.L(context3, "com.google.firebase.crashlytics.RequireBuildId", aad.L(context3, "com.crashlytics.RequireBuildId", true));
            str6 = (String) rrdVar2.c;
            if (zL) {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Configured not to require a build ID.", null);
                }
            } else if (TextUtils.isEmpty(str6)) {
                Log.e("FirebaseCrashlytics", Separators.DOT);
                Log.e("FirebaseCrashlytics", ".     |  | ");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                Log.e("FirebaseCrashlytics", ".    \\    /");
                Log.e("FirebaseCrashlytics", ".     \\  /");
                Log.e("FirebaseCrashlytics", ".      \\/");
                Log.e("FirebaseCrashlytics", Separators.DOT);
                Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                Log.e("FirebaseCrashlytics", Separators.DOT);
                Log.e("FirebaseCrashlytics", ".      /\\");
                Log.e("FirebaseCrashlytics", ".     /  \\");
                Log.e("FirebaseCrashlytics", ".    /    \\");
                Log.e("FirebaseCrashlytics", ".   / |  | \\");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", Separators.DOT);
                jf4.n("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                return null;
            }
            str7 = new dh9().f6081a;
            tfqVar = new tfq(j8fVar);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e2);
            tfqVar = null;
        }
        th = null;
        strK = kng0.k("Mapping file ID is: ", string5);
        if (Log.isLoggable("FirebaseCrashlytics", i)) {
            Log.d("FirebaseCrashlytics", strK, th);
        }
        while (r2.hasNext()) {
            String str115 = cb9Var.f4051a;
            String str116 = cb9Var.b;
            String str117 = cb9Var.c;
            StringBuilder sbN2 = b1j.n("Build id for ", str115, " on ", str116, ": ");
            sbN2.append(str117);
            string4 = sbN2.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", string4, null);
            }
        }
        fhj fhjVar2 = new fhj(context, (byte) 4);
        jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
        if (jCurrentTimeMillis > 16) {
            strH = axq.h(jCurrentTimeMillis, "Initializing Crashlytics blocked main for ", " ms");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strH, null);
            }
        }
        return tfqVar;
    }
}
