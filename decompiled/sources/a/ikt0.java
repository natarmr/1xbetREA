package a;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ikt0 implements mff0, ngw0, xfw0, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f14945a;

    public ikt0(tnc0 tnc0Var) {
        tnc0Var.getClass();
        this.f14945a = tnc0Var;
    }

    public static ikt0 c() {
        Pattern patternCompile = Pattern.compile("[.-]");
        u4x0 u4x0Var = new u4x0(patternCompile);
        Matcher matcher = patternCompile.matcher("");
        matcher.getClass();
        if (matcher.matches()) {
            jf4.o(qem0.w("The pattern may not match the empty string: %s", u4x0Var));
            return null;
        }
        owp0 owp0Var = new owp0((byte) 27, false);
        owp0Var.b = u4x0Var;
        return new ikt0(owp0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, String str2, zje zjeVar) {
        kwt0 kwt0Var;
        if (zjeVar instanceof kwt0) {
            kwt0Var = (kwt0) zjeVar;
            int i = kwt0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                kwt0Var.l = i - Integer.MIN_VALUE;
            } else {
                kwt0Var = new kwt0(this, zjeVar);
            }
        } else {
            kwt0Var = new kwt0(this, zjeVar);
        }
        Object objA0 = kwt0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = kwt0Var.l;
        if (i2 == 0) {
            z1x.P(objA0);
            kd30 kd30Var = (kd30) this.f14945a;
            kwt0Var.i = str;
            kwt0Var.l = 1;
            objA0 = kd30Var.a0(str, str2, kwt0Var);
            if (objA0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = kwt0Var.i;
            z1x.P(objA0);
        }
        if (!Intrinsics.d(((km90) objA0).f18528a, "US")) {
            return Unit.f46060a;
        }
        if (kotlin.text.c.x(str, "+1", false)) {
            throw new orv0();
        }
        throw new p4c();
    }

    @Override // a.mff0
    public void accept(Object obj, Object obj2) {
        oaw0 oaw0Var = (oaw0) this.f14945a;
        naw0 naw0Var = new naw0((TaskCompletionSource) obj2);
        ebw0 ebw0Var = (ebw0) ((paw0) obj).l();
        String str = oaw0Var.l;
        Parcel parcelC = ebw0Var.C();
        int i = taw0.f33634a;
        parcelC.writeStrongBinder(naw0Var);
        parcelC.writeString(str);
        ebw0Var.D(parcelC, 2);
    }

    public void b(px7 px7Var) {
        Object value;
        n730 n730Var = (n730) this.f14945a;
        n730Var.getClass();
        jx7 jx7Var = n730Var.f23022a;
        jx7Var.getClass();
        p7m0 p7m0Var = jx7Var.f17290a;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, px7Var));
    }

    public List d(String str) {
        str.getClass();
        Iterator itB = ((thx0) this.f14945a).b(this, str);
        ArrayList arrayList = new ArrayList();
        while (true) {
            nex0 nex0Var = (nex0) itB;
            if (!nex0Var.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) nex0Var.next());
        }
    }

    public void e() {
        w4x0 w4x0Var = (w4x0) this.f14945a;
        w4x0Var.m1();
        kxw0 kxw0Var = (kxw0) w4x0Var.b;
        wvw0 wvw0Var = kxw0Var.e;
        kxw0.e(wvw0Var);
        kxw0Var.k.getClass();
        if (wvw0Var.v1(System.currentTimeMillis())) {
            wvw0 wvw0Var2 = kxw0Var.e;
            kxw0.e(wvw0Var2);
            wvw0Var2.m.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                uuw0 uuw0Var = kxw0Var.f;
                kxw0.g(uuw0Var);
                uuw0Var.o.a("Detected application was in foreground");
                i(System.currentTimeMillis(), kxw0Var.d.x1(null, btw0.e1) ? SystemClock.elapsedRealtime() : 0L);
            }
        }
    }

    public void f(int i, String str, List list, boolean z, boolean z2) {
        quw0 quw0Var;
        kxw0 kxw0Var = (kxw0) ((uww0) this.f14945a).b;
        int i2 = i - 1;
        if (i2 == 0) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            quw0Var = uuw0Var.n;
        } else if (i2 != 1) {
            if (i2 == 3) {
                uuw0 uuw0Var2 = kxw0Var.f;
                kxw0.g(uuw0Var2);
                quw0Var = uuw0Var2.o;
            } else if (i2 != 4) {
                uuw0 uuw0Var3 = kxw0Var.f;
                kxw0.g(uuw0Var3);
                quw0Var = uuw0Var3.m;
            } else if (z) {
                uuw0 uuw0Var4 = kxw0Var.f;
                kxw0.g(uuw0Var4);
                quw0Var = uuw0Var4.k;
            } else if (z2) {
                uuw0 uuw0Var5 = kxw0Var.f;
                kxw0.g(uuw0Var5);
                quw0Var = uuw0Var5.j;
            } else {
                uuw0 uuw0Var6 = kxw0Var.f;
                kxw0.g(uuw0Var6);
                quw0Var = uuw0Var6.l;
            }
        } else if (z) {
            uuw0 uuw0Var7 = kxw0Var.f;
            kxw0.g(uuw0Var7);
            quw0Var = uuw0Var7.h;
        } else if (z2) {
            uuw0 uuw0Var8 = kxw0Var.f;
            kxw0.g(uuw0Var8);
            quw0Var = uuw0Var8.g;
        } else {
            uuw0 uuw0Var9 = kxw0Var.f;
            kxw0.g(uuw0Var9);
            quw0Var = uuw0Var9.i;
        }
        int size = list.size();
        if (size == 1) {
            quw0Var.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            quw0Var.c(list.get(0), list.get(1), str);
        } else if (size != 3) {
            quw0Var.a(str);
        } else {
            quw0Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public void g(long j, long j2) {
        w4x0 w4x0Var = (w4x0) this.f14945a;
        w4x0Var.m1();
        w4x0Var.p1();
        kxw0 kxw0Var = (kxw0) w4x0Var.b;
        wvw0 wvw0Var = kxw0Var.e;
        kxw0.e(wvw0Var);
        if (wvw0Var.v1(j)) {
            kxw0.e(wvw0Var);
            wvw0Var.m.b(true);
            kxw0Var.k().q1();
        }
        kxw0.e(wvw0Var);
        wvw0Var.q.b(j);
        if (wvw0Var.m.a()) {
            i(j, j2);
        }
    }

    @Override // a.ngw0
    public /* synthetic */ void h(xfw0 xfw0Var) {
        ((ngw0) this.f14945a).h((zzaia) xfw0Var);
    }

    public void i(long j, long j2) {
        w4x0 w4x0Var = (w4x0) this.f14945a;
        w4x0Var.m1();
        kxw0 kxw0Var = (kxw0) w4x0Var.b;
        if (kxw0Var.a()) {
            wvw0 wvw0Var = kxw0Var.e;
            kxw0.e(wvw0Var);
            wvw0Var.q.b(j);
            kxw0Var.k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.o.b(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j3 = j / 1000;
            Long lValueOf = Long.valueOf(j3);
            b1x0 b1x0Var = kxw0Var.m;
            kxw0.f(b1x0Var);
            b1x0Var.w1(j, lValueOf, "auto", "_sid");
            kxw0.e(wvw0Var);
            wvw0Var.r.b(j3);
            wvw0Var.m.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            kxw0.f(b1x0Var);
            b1x0Var.t1(j, j2, bundle, "auto", "_s");
            String strT = wvw0Var.w.t();
            if (TextUtils.isEmpty(strT)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strT);
            kxw0.f(b1x0Var);
            b1x0Var.t1(j, j2, bundle2, "auto", "_ssr");
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        zsm0 zsm0Var = (zsm0) this.f14945a;
        if (task.isSuccessful()) {
            return zsm0Var.N((String) task.getResult());
        }
        Exception exception = task.getException();
        s0x.H(exception);
        Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + exception.getMessage() + "\n\n Failing open with a fake token.");
        return zsm0Var.N("NO_RECAPTCHA");
    }

    @Override // a.xfw0
    public xfw0 zza(String str) throws udw0 {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f14945a = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    ((ArrayList) this.f14945a).add(jSONArrayOptJSONArray.getString(i));
                }
            }
            return this;
        } catch (JSONException e) {
            throw knm0.w(e, "ikt0", str);
        }
    }

    public /* synthetic */ ikt0(Object obj) {
        this.f14945a = obj;
    }

    public ikt0(pfv0 pfv0Var) {
        pfv0Var.getClass();
        this.f14945a = pfv0Var;
    }

    @Override // a.ngw0
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public void mo2zza(String str) {
        ((ngw0) this.f14945a).mo2zza(str);
    }
}
