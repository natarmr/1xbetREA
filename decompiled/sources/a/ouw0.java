package a;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.gov.nist.core.Separators;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25898a = 0;
    public final int b;
    public final String c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public ouw0(uuw0 uuw0Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = str;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = uuw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25898a) {
            case 0:
                uuw0 uuw0Var = (uuw0) this.g;
                wvw0 wvw0Var = ((kxw0) uuw0Var.b).e;
                kxw0.e(wvw0Var);
                if (!wvw0Var.c) {
                    Log.println(6, uuw0Var.s1(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (uuw0Var.d == 0) {
                    bkw0 bkw0Var = ((kxw0) uuw0Var.b).d;
                    if (bkw0Var.f == null) {
                        synchronized (bkw0Var) {
                            try {
                                if (bkw0Var.f == null) {
                                    kxw0 kxw0Var = (kxw0) bkw0Var.b;
                                    ApplicationInfo applicationInfo = kxw0Var.f19080a.getApplicationInfo();
                                    String strW = p7x.w();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        bkw0Var.f = Boolean.valueOf(str != null && str.equals(strW));
                                    }
                                    if (bkw0Var.f == null) {
                                        bkw0Var.f = Boolean.TRUE;
                                        uuw0 uuw0Var2 = kxw0Var.f;
                                        kxw0.g(uuw0Var2);
                                        uuw0Var2.g.a("My process not in the list of running processes");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (bkw0Var.f.booleanValue()) {
                        uuw0Var.d = 'C';
                    } else {
                        uuw0Var.d = 'c';
                    }
                    break;
                }
                long j = uuw0Var.e;
                if (j < 0) {
                    ((kxw0) uuw0Var.b).d.s1();
                    j = 161000;
                    uuw0Var.e = 161000L;
                }
                int i = this.b;
                char c = uuw0Var.d;
                String str2 = this.c;
                Object obj = this.d;
                Object obj2 = this.e;
                Object obj3 = this.f;
                char cCharAt = "01VDIWEA?".charAt(i);
                String strT1 = uuw0.t1(true, str2, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(hne.D(String.valueOf(cCharAt).length() + 1, String.valueOf(c).length(), String.valueOf(j).length(), 1) + strT1.length());
                sb.append("2");
                sb.append(cCharAt);
                sb.append(c);
                sb.append(j);
                sb.append(Separators.COLON);
                sb.append(strT1);
                String string = sb.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, 1024);
                }
                hac hacVar = wvw0Var.f;
                if (hacVar != null) {
                    wvw0 wvw0Var2 = (wvw0) hacVar.c;
                    wvw0Var2.m1();
                    if (((wvw0) hacVar.c).q1().getLong("health_monitor:start", 0L) == 0) {
                        hacVar.A();
                    }
                    long j2 = wvw0Var2.q1().getLong("health_monitor:count", 0L);
                    if (j2 <= 0) {
                        SharedPreferences.Editor editorEdit = wvw0Var2.q1().edit();
                        editorEdit.putString("health_monitor:value", string);
                        editorEdit.putLong("health_monitor:count", 1L);
                        editorEdit.apply();
                        return;
                    }
                    x6x0 x6x0Var = ((kxw0) wvw0Var2.b).i;
                    kxw0.e(x6x0Var);
                    long jNextLong = x6x0Var.l2().nextLong() & Long.MAX_VALUE;
                    long j3 = j2 + 1;
                    long j4 = Long.MAX_VALUE / j3;
                    SharedPreferences.Editor editorEdit2 = wvw0Var2.q1().edit();
                    if (jNextLong < j4) {
                        editorEdit2.putString("health_monitor:value", string);
                    }
                    editorEdit2.putLong("health_monitor:count", j3);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((zuw0) this.d).c(this.c, this.b, (Throwable) this.e, (byte[]) this.f, (Map) this.g);
                return;
        }
    }

    public /* synthetic */ ouw0(String str, zuw0 zuw0Var, int i, IOException iOException, byte[] bArr, Map map) {
        this.d = zuw0Var;
        this.b = i;
        this.e = iOException;
        this.f = bArr;
        this.c = str;
        this.g = map;
    }
}
