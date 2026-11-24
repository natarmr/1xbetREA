package com.google.firebase.auth;

import a.bdx0;
import a.cew0;
import a.ei;
import a.fck0;
import a.few0;
import a.ffw0;
import a.fht0;
import a.gmx;
import a.jfw0;
import a.kcw0;
import a.kng0;
import a.low0;
import a.mcw0;
import a.n6x;
import a.new0;
import a.nfq;
import a.ofq;
import a.p5d0;
import a.pbw0;
import a.pfq;
import a.qgw0;
import a.qmw0;
import a.qmx;
import a.s0x;
import a.tlw0;
import a.vmw0;
import a.zcw0;
import a.zdw0;
import a.zlt0;
import a.zz2;
import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.android.gms.internal.p000firebaseauthapi.zzajg;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzbl;
import com.google.firebase.auth.internal.zzz;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseAuth implements gmx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfq f45644a;
    public final CopyOnWriteArrayList b;
    public final CopyOnWriteArrayList c;
    public final CopyOnWriteArrayList d;
    public final fck0 e;
    public FirebaseUser f;
    public final Object g;
    public final Object h;
    public String i;
    public zcw0 j;
    public final RecaptchaAction k;
    public final RecaptchaAction l;
    public final RecaptchaAction m;
    public final fht0 n;
    public final low0 o;
    public final p5d0 p;
    public zlt0 q;
    public final Executor r;
    public final Executor s;
    public final Executor t;

    /* JADX WARN: Code duplicated, block: B:4:0x00c5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [a.iow0, a.ofq] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public FirebaseAuth(nfq nfqVar, p5d0 p5d0Var, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, Executor executor3) {
        zzad zzadVarT;
        ei eiVar;
        zzaia zzaiaVarM;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        fck0 fck0Var = new fck0((byte) 22, false);
        fck0Var.b = new ffw0(nfqVar, scheduledExecutorService);
        fck0Var.c = executor;
        nfqVar.a();
        Context context = nfqVar.f23449a;
        String strF = nfqVar.f();
        fht0 fht0Var = new fht0();
        s0x.H(context);
        s0x.E(strF);
        fht0Var.b = strF;
        Context applicationContext = context.getApplicationContext();
        fht0Var.f9559a = applicationContext;
        fht0Var.c = applicationContext.getSharedPreferences("com.google.firebase.auth.api.Store.".concat(strF), 0);
        fht0Var.d = new zz2("StorageHelpers", new String[0]);
        low0 low0Var = low0.c;
        this.b = new CopyOnWriteArrayList();
        this.c = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.g = new Object();
        this.h = new Object();
        this.k = RecaptchaAction.custom("getOobCode");
        this.l = RecaptchaAction.custom("signInWithPassword");
        this.m = RecaptchaAction.custom("signUpPassword");
        RecaptchaAction.custom("sendVerificationCode");
        RecaptchaAction.custom("mfaSmsEnrollment");
        RecaptchaAction.custom("mfaSmsSignIn");
        this.f45644a = nfqVar;
        this.e = fck0Var;
        this.n = fht0Var;
        s0x.H(low0Var);
        this.o = low0Var;
        this.p = p5d0Var;
        this.r = executor;
        this.s = executor2;
        this.t = executor3;
        fht0 fht0Var2 = this.n;
        String strZ = fht0Var2.z("com.google.firebase.auth.FIREBASE_USER");
        zz2 zz2Var = (zz2) fht0Var2.d;
        if (TextUtils.isEmpty(strZ)) {
            zzadVarT = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(strZ);
                if (jSONObject.has(Payload.TYPE) && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString(Payload.TYPE))) {
                    zzadVarT = fht0Var2.t(jSONObject);
                } else {
                    zzadVarT = null;
                }
            } catch (Exception unused) {
                Log.i((String) zz2Var.b, zz2Var.p("Failed to restore user data from persistent storage.", new Object[0]));
            }
        }
        this.f = zzadVarT;
        if (zzadVarT != null) {
            String strZ2 = fht0Var2.z("com.google.firebase.auth.GET_TOKEN_RESPONSE." + zzadVarT.b.f45659a);
            if (strZ2 != null) {
                try {
                    zzaiaVarM = zzaia.m(strZ2);
                } catch (kcw0 unused2) {
                    Log.i((String) zz2Var.b, zz2Var.p("Failed to restore token data from persistent storage.", new Object[0]));
                    zzaiaVarM = null;
                }
            } else {
                zzaiaVarM = null;
            }
            if (zzaiaVarM != null) {
                f(this, this.f, zzaiaVarM, false, false);
            }
        }
        this.o.f20411a.getClass();
        nfq nfqVar2 = this.f45644a;
        nfqVar2.a();
        SharedPreferences sharedPreferences = nfqVar2.f23449a.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        String string = sharedPreferences.getString("firebaseAppName", "");
        nfqVar2.a();
        if (nfqVar2.b.equals(string)) {
            if (!sharedPreferences.contains("verifyAssertionRequest")) {
                if (!sharedPreferences.contains("recaptchaToken")) {
                    if (sharedPreferences.contains(HiAnalyticsConstant.HaKey.BI_KEY_RESULT)) {
                        Status status = new Status(sharedPreferences.getInt(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, 17062), sharedPreferences.getString("statusMessage", ""), null, null);
                        sharedPreferences.getLong("timestamp", 0L);
                        vmw0.b(sharedPreferences);
                        Tasks.forException(jfw0.a(status));
                        return;
                    }
                    return;
                }
                String string2 = sharedPreferences.getString("recaptchaToken", "");
                String string3 = sharedPreferences.getString("operation", "");
                sharedPreferences.getLong("timestamp", 0L);
                string3.getClass();
                if (string3.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA")) {
                    Tasks.forResult(string2);
                }
                vmw0.b(sharedPreferences);
                return;
            }
            String string4 = sharedPreferences.getString("verifyAssertionRequest", "");
            zzajg zzajgVar = (zzajg) n6x.w(string4 == null ? null : Base64.decode(string4, 10), zzajg.CREATOR);
            String string5 = sharedPreferences.getString("operation", "");
            String string6 = sharedPreferences.getString("tenantId", null);
            String string7 = sharedPreferences.getString("firebaseUserUid", "");
            sharedPreferences.getLong("timestamp", 0L);
            if (string6 != null) {
                s0x.E(string6);
                synchronized (this.h) {
                    this.i = string6;
                }
                zzajgVar.n = string6;
            }
            string5.getClass();
            switch (string5) {
                case "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE":
                    if (((zzad) a()).b.f45659a.equals(string7)) {
                        FirebaseUser firebaseUserA = a();
                        zzc zzcVarP = zzc.p(zzajgVar);
                        nfq nfqVar3 = this.f45644a;
                        s0x.H(firebaseUserA);
                        AuthCredential authCredentialO = zzcVarP.o();
                        if (!(authCredentialO instanceof EmailAuthCredential)) {
                            boolean z = authCredentialO instanceof PhoneAuthCredential;
                            fck0 fck0Var2 = this.e;
                            if (!z) {
                                String strM = firebaseUserA.m();
                                ofq ofqVar = new ofq(this, objArr == true ? 1 : 0);
                                fck0Var2.getClass();
                                few0 few0Var = new few0(authCredentialO, strM, (byte) 1);
                                few0Var.b(nfqVar3);
                                few0Var.d = firebaseUserA;
                                few0Var.e = ofqVar;
                                few0Var.f = ofqVar;
                                fck0Var2.s(few0Var);
                            } else {
                                String str = this.i;
                                ofq ofqVar2 = new ofq(this, objArr2 == true ? 1 : 0);
                                fck0Var2.getClass();
                                qgw0.f28707a.clear();
                                new0 new0Var = new new0((PhoneAuthCredential) authCredentialO, str, (byte) 0);
                                new0Var.b(nfqVar3);
                                new0Var.d = firebaseUserA;
                                new0Var.e = ofqVar2;
                                new0Var.f = ofqVar2;
                                fck0Var2.s(new0Var);
                            }
                        } else {
                            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredentialO;
                            if (!ParameterNames.PASSWORD.equals(!TextUtils.isEmpty(emailAuthCredential.b) ? ParameterNames.PASSWORD : "emailLink")) {
                                String str2 = emailAuthCredential.c;
                                s0x.E(str2);
                                int i = ei.c;
                                s0x.E(str2);
                                try {
                                    eiVar = new ei(str2);
                                } catch (IllegalArgumentException unused3) {
                                    eiVar = null;
                                }
                                if (eiVar == null || TextUtils.equals(this.i, eiVar.b)) {
                                    new pbw0(this, true, firebaseUserA, emailAuthCredential).M(this, this.i, this.k);
                                } else {
                                    Tasks.forException(jfw0.a(new Status(17072, null, null, null)));
                                }
                            } else {
                                String str3 = emailAuthCredential.f45642a;
                                String str4 = emailAuthCredential.b;
                                s0x.E(str4);
                                String strM2 = firebaseUserA.m();
                                new mcw0(this, str3, true, firebaseUserA, str4, strM2).M(this, strM2, this.l);
                            }
                        }
                        break;
                    }
                    break;
                case "com.google.firebase.auth.internal.NONGMSCORE_LINK":
                    if (((zzad) a()).b.f45659a.equals(string7)) {
                        FirebaseUser firebaseUserA2 = a();
                        zzc zzcVarP2 = zzc.p(zzajgVar);
                        s0x.H(firebaseUserA2);
                        this.e.r(this.f45644a, firebaseUserA2, zzcVarP2.o(), null, new ofq(this, objArr3 == true ? 1 : 0));
                        break;
                    }
                    break;
                case "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN":
                    b(zzc.p(zzajgVar));
                    break;
            }
            vmw0.b(sharedPreferences);
        }
    }

    public static void e(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + ((zzad) firebaseUser).b.f45659a + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.t.execute(new bdx0(firebaseAuth));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    public static void f(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, zzaia zzaiaVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ArrayList arrayList;
        boolean z5;
        boolean z6;
        ArrayList arrayList2;
        s0x.H(firebaseUser);
        s0x.H(zzaiaVar);
        FirebaseUser firebaseUser2 = firebaseAuth.f;
        boolean z7 = firebaseUser2 != null && ((zzad) firebaseUser).b.f45659a.equals(((zzad) firebaseUser2).b.f45659a);
        if (z7 || !z2) {
            FirebaseUser firebaseUser3 = firebaseAuth.f;
            if (firebaseUser3 == null) {
                z4 = true;
                z3 = true;
            } else {
                z3 = (z7 && ((zzad) firebaseUser3).f45652a.b.equals(zzaiaVar.b)) ? false : true;
                z4 = !z7;
            }
            String string = null;
            if (firebaseAuth.f != null) {
                zzad zzadVar = (zzad) firebaseUser;
                String str = zzadVar.b.f45659a;
                FirebaseUser firebaseUser4 = firebaseAuth.f;
                if (str.equals(firebaseUser4 == null ? null : ((zzad) firebaseUser4).b.f45659a)) {
                    firebaseAuth.f.p(zzadVar.e);
                    if (!firebaseUser.o()) {
                        ((zzad) firebaseAuth.f).h = Boolean.FALSE;
                    }
                    zzbl zzblVar = zzadVar.l;
                    if (zzblVar != null) {
                        arrayList2 = new ArrayList();
                        Iterator it = zzblVar.f45656a.iterator();
                        while (it.hasNext()) {
                            arrayList2.add((PhoneMultiFactorInfo) it.next());
                        }
                        Iterator it2 = zzblVar.b.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add((TotpMultiFactorInfo) it2.next());
                        }
                    } else {
                        arrayList2 = new ArrayList();
                    }
                    List arrayList3 = zzadVar.m;
                    firebaseAuth.f.s(arrayList2);
                    zzad zzadVar2 = (zzad) firebaseAuth.f;
                    if (arrayList3 == null) {
                        zzadVar2.getClass();
                        arrayList3 = new ArrayList();
                    }
                    zzadVar2.m = arrayList3;
                } else {
                    firebaseAuth.f = firebaseUser;
                }
            } else {
                firebaseAuth.f = firebaseUser;
            }
            if (z) {
                fht0 fht0Var = firebaseAuth.n;
                FirebaseUser firebaseUser5 = firebaseAuth.f;
                fht0Var.getClass();
                s0x.H(firebaseUser5);
                zz2 zz2Var = (zz2) fht0Var.d;
                JSONObject jSONObject = new JSONObject();
                if (firebaseUser5 instanceof zzad) {
                    zzad zzadVar3 = (zzad) firebaseUser5;
                    try {
                        jSONObject.put("cachedTokenState", zzadVar3.f45652a.o());
                        nfq nfqVarE = nfq.e(zzadVar3.c);
                        nfqVarE.a();
                        jSONObject.put("applicationName", nfqVarE.b);
                        jSONObject.put(Payload.TYPE, "com.google.firebase.auth.internal.DefaultFirebaseUser");
                        if (zzadVar3.e != null) {
                            JSONArray jSONArray = new JSONArray();
                            ArrayList arrayList4 = zzadVar3.e;
                            int size = arrayList4.size();
                            if (arrayList4.size() > 30) {
                                z5 = true;
                                Log.w((String) zz2Var.b, zz2Var.p("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(arrayList4.size())));
                                size = 30;
                            } else {
                                z5 = true;
                            }
                            boolean z8 = false;
                            for (int i = 0; i < size; i++) {
                                zzz zzzVar = (zzz) arrayList4.get(i);
                                if (zzzVar.b.equals("firebase")) {
                                    z8 = z5;
                                }
                                if (i == size - 1 && !z8) {
                                    break;
                                }
                                jSONArray.put(zzzVar.o());
                            }
                            if (!z8) {
                                int i2 = size - 1;
                                while (true) {
                                    if (i2 >= arrayList4.size() || i2 < 0) {
                                        z6 = z8;
                                        break;
                                    }
                                    zzz zzzVar2 = (zzz) arrayList4.get(i2);
                                    if (zzzVar2.b.equals("firebase")) {
                                        jSONArray.put(zzzVar2.o());
                                        z6 = z5;
                                        break;
                                    } else {
                                        if (i2 == arrayList4.size() - 1) {
                                            jSONArray.put(zzzVar2.o());
                                        }
                                        i2++;
                                    }
                                }
                                if (!z6) {
                                    Log.w((String) zz2Var.b, zz2Var.p("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(arrayList4.size()), Integer.valueOf(size)));
                                    if (arrayList4.size() < 5) {
                                        StringBuilder sb = new StringBuilder("Provider user info list:\n");
                                        Iterator it3 = arrayList4.iterator();
                                        while (it3.hasNext()) {
                                            sb.append("Provider - " + ((zzz) it3.next()).b + Separators.RETURN);
                                        }
                                        Log.w((String) zz2Var.b, zz2Var.p(sb.toString(), new Object[0]));
                                    }
                                }
                            }
                            jSONObject.put("userInfos", jSONArray);
                        }
                        jSONObject.put("anonymous", zzadVar3.o());
                        jSONObject.put("version", "2");
                        zzaf zzafVar = zzadVar3.i;
                        if (zzafVar != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("lastSignInTimestamp", zzafVar.f45653a);
                                jSONObject2.put("creationTimestamp", zzafVar.b);
                            } catch (JSONException unused) {
                            }
                            jSONObject.put("userMetadata", jSONObject2);
                        }
                        zzbl zzblVar2 = zzadVar3.l;
                        if (zzblVar2 != null) {
                            arrayList = new ArrayList();
                            Iterator it4 = zzblVar2.f45656a.iterator();
                            while (it4.hasNext()) {
                                arrayList.add((PhoneMultiFactorInfo) it4.next());
                            }
                            Iterator it5 = zzblVar2.b.iterator();
                            while (it5.hasNext()) {
                                arrayList.add((TotpMultiFactorInfo) it5.next());
                            }
                        } else {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.isEmpty()) {
                            JSONArray jSONArray2 = new JSONArray();
                            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                jSONArray2.put(((MultiFactorInfo) arrayList.get(i3)).o());
                            }
                            jSONObject.put("userMultiFactorInfo", jSONArray2);
                        }
                        List list = zzadVar3.m;
                        if (list != null && !list.isEmpty()) {
                            JSONArray jSONArray3 = new JSONArray();
                            for (int i4 = 0; i4 < list.size(); i4++) {
                                zzao zzaoVar = (zzao) list.get(i4);
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("credentialId", zzaoVar.f45660a);
                                jSONObject3.put("name", zzaoVar.b);
                                jSONObject3.put(CommonConstant.KEY_DISPLAY_NAME, zzaoVar.c);
                                jSONArray3.put(jSONObject3);
                            }
                            jSONObject.put("passkeyInfo", jSONArray3);
                        }
                        string = jSONObject.toString();
                    } catch (Exception e) {
                        Log.wtf((String) zz2Var.b, zz2Var.p("Failed to turn object into JSON", new Object[0]), e);
                        throw new kcw0(e);
                    }
                }
                if (!TextUtils.isEmpty(string)) {
                    fht0Var.v("com.google.firebase.auth.FIREBASE_USER", string);
                }
            }
            if (z3) {
                FirebaseUser firebaseUser6 = firebaseAuth.f;
                if (firebaseUser6 != null) {
                    ((zzad) firebaseUser6).f45652a = zzaiaVar;
                }
                g(firebaseAuth, firebaseUser6);
            }
            if (z4) {
                e(firebaseAuth, firebaseAuth.f);
            }
            if (z) {
                fht0 fht0Var2 = firebaseAuth.n;
                fht0Var2.getClass();
                fht0Var2.v(kng0.k("com.google.firebase.auth.GET_TOKEN_RESPONSE.", ((zzad) firebaseUser).b.f45659a), zzaiaVar.o());
            }
            FirebaseUser firebaseUser7 = firebaseAuth.f;
            if (firebaseUser7 != null) {
                zlt0 zlt0Var = firebaseAuth.q;
                if (zlt0Var == null) {
                    nfq nfqVar = firebaseAuth.f45644a;
                    s0x.H(nfqVar);
                    zlt0 zlt0Var2 = new zlt0(nfqVar);
                    firebaseAuth.q = zlt0Var2;
                    zlt0Var = zlt0Var2;
                }
                zzaia zzaiaVar2 = ((zzad) firebaseUser7).f45652a;
                if (zzaiaVar2 == null) {
                    return;
                }
                Long l = zzaiaVar2.c;
                long jLongValue = l == null ? 0L : l.longValue();
                if (jLongValue <= 0) {
                    jLongValue = 3600;
                }
                long jLongValue2 = (jLongValue * 1000) + zzaiaVar2.e.longValue();
                tlw0 tlw0Var = (tlw0) zlt0Var.b;
                tlw0Var.f34168a = jLongValue2;
                tlw0Var.b = -1L;
            }
        }
    }

    public static void g(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + ((zzad) firebaseUser).b.f45659a + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        firebaseAuth.t.execute(new bdx0(firebaseAuth, new qmx(firebaseUser != null ? ((zzad) firebaseUser).f45652a.b : null)));
    }

    public static FirebaseAuth getInstance() {
        zdw0 zdw0Var = (zdw0) nfq.d().b(zdw0.class);
        s0x.H(zdw0Var);
        return zdw0Var.a();
    }

    public FirebaseUser a() {
        return this.f;
    }

    public Task b(zzc zzcVar) {
        ei eiVar;
        AuthCredential authCredentialO = zzcVar.o();
        if (!(authCredentialO instanceof EmailAuthCredential)) {
            boolean z = authCredentialO instanceof PhoneAuthCredential;
            String str = this.i;
            nfq nfqVar = this.f45644a;
            fck0 fck0Var = this.e;
            if (!z) {
                pfq pfqVar = new pfq(this);
                fck0Var.getClass();
                few0 few0Var = new few0(authCredentialO, str, (byte) 2);
                few0Var.b(nfqVar);
                few0Var.e = pfqVar;
                return fck0Var.s(few0Var);
            }
            pfq pfqVar2 = new pfq(this);
            fck0Var.getClass();
            qgw0.f28707a.clear();
            new0 new0Var = new new0((PhoneAuthCredential) authCredentialO, str, (byte) 1);
            new0Var.b(nfqVar);
            new0Var.e = pfqVar2;
            return fck0Var.s(new0Var);
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredentialO;
        String str2 = emailAuthCredential.c;
        if (TextUtils.isEmpty(str2)) {
            String str3 = emailAuthCredential.f45642a;
            String str4 = emailAuthCredential.b;
            s0x.H(str4);
            String str5 = this.i;
            return new mcw0(this, str3, false, null, str4, str5).M(this, str5, this.l);
        }
        s0x.E(str2);
        int i = ei.c;
        s0x.E(str2);
        try {
            eiVar = new ei(str2);
        } catch (IllegalArgumentException unused) {
            eiVar = null;
        }
        if (eiVar != null && !TextUtils.equals(this.i, eiVar.b)) {
            return Tasks.forException(jfw0.a(new Status(17072, null, null, null)));
        }
        return new pbw0(this, false, null, emailAuthCredential).M(this, this.i, this.k);
    }

    public void c() {
        fht0 fht0Var = this.n;
        s0x.H(fht0Var);
        SharedPreferences sharedPreferences = (SharedPreferences) fht0Var.c;
        FirebaseUser firebaseUser = this.f;
        if (firebaseUser != null) {
            sharedPreferences.edit().remove(kng0.k("com.google.firebase.auth.GET_TOKEN_RESPONSE.", ((zzad) firebaseUser).b.f45659a)).apply();
            this.f = null;
        }
        sharedPreferences.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        g(this, null);
        e(this, null);
        zlt0 zlt0Var = this.q;
        if (zlt0Var != null) {
            tlw0 tlw0Var = (tlw0) zlt0Var.b;
            tlw0Var.c.removeCallbacks(tlw0Var.d);
        }
    }

    public final Task d(FirebaseUser firebaseUser, boolean z) {
        if (firebaseUser == null) {
            return Tasks.forException(jfw0.a(new Status(17495, null, null, null)));
        }
        zzaia zzaiaVar = ((zzad) firebaseUser).f45652a;
        if (zzaiaVar.zzg() && !z) {
            return Tasks.forResult(qmw0.a(zzaiaVar.b));
        }
        String str = zzaiaVar.f45523a;
        ofq ofqVar = new ofq(this, (byte) 1);
        fck0 fck0Var = this.e;
        fck0Var.getClass();
        cew0 cew0Var = new cew0(str, (byte) 0);
        cew0Var.b(this.f45644a);
        cew0Var.d = firebaseUser;
        cew0Var.e = ofqVar;
        cew0Var.f = ofqVar;
        return fck0Var.s(cew0Var);
    }

    public static FirebaseAuth getInstance(nfq nfqVar) {
        zdw0 zdw0Var = (zdw0) nfqVar.b(zdw0.class);
        s0x.H(zdw0Var);
        return zdw0Var.a();
    }
}
