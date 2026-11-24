package a;

import android.gov.nist.core.Separators;
import android.net.Uri;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class grd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11774a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Serializable h;
    public Object i;

    public grd(mbw mbwVar) {
        this.b = mbwVar;
        this.f11774a = mbwVar.n != null;
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
    }

    public static void j(HashMap map, String str, String str2) throws kq80 {
        if (!map.containsKey(str) || str2.equals(map.get(str))) {
            map.put(str, str2);
            return;
        }
        throw kq80.b("The group ID " + str + " is associated with more than one pathway from variants");
    }

    public void a(int i, long j) {
        if (i == 0) {
            new chq("Unable to fetch the latest version of the template.");
            g();
        } else {
            ((ScheduledExecutorService) this.g).schedule(new frd(this, i, j), ((Random) this.h).nextInt(4), TimeUnit.SECONDS);
        }
    }

    public b4x b(List list, HashMap map) throws kq80 {
        String str;
        grd grdVar;
        boolean z = this.f11774a;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        int i = 0;
        while (i < list.size()) {
            kbw kbwVar = (kbw) list.get(i);
            Uri uri = kbwVar.f18034a;
            sbw sbwVar = new sbw(kbwVar.b, kbwVar.e, kbwVar.d);
            if (z) {
                str = (String) map.get(kbwVar.c);
                if (str == null) {
                    grdVar = this;
                }
                i++;
                this = grdVar;
            } else {
                str = null;
            }
            String str2 = str;
            Uri uri2 = kbwVar.f18034a;
            grdVar = this;
            grdVar.h(uri2, str2, i, arrayList, sbwVar, map2, map3);
            i++;
            this = grdVar;
        }
        grd grdVar2 = this;
        if (z) {
            tbw tbwVar = (tbw) ((b4x) grdVar2.f).get(0);
            tbwVar.getClass();
            f4x f4xVarA = tbwVar.a();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (!((tbw) arrayList.get(i2)).a().equals(f4xVarA)) {
                    throw kq80.b("The set of available pathway IDs of a rendition redundant group is inconsistent with variant redundant groups");
                }
            }
        }
        return b4x.o(arrayList);
    }

    public b4x c(int i) throws kq80 {
        mbw mbwVar = (mbw) this.b;
        d();
        if (i == 1) {
            b4x b4xVar = (b4x) this.g;
            if (b4xVar != null) {
                return b4xVar;
            }
            b4x b4xVarB = b(mbwVar.f, (HashMap) this.c);
            this.g = b4xVarB;
            return b4xVarB;
        }
        if (i == 2) {
            b4x b4xVar2 = (b4x) this.h;
            if (b4xVar2 != null) {
                return b4xVar2;
            }
            b4x b4xVarB2 = b(mbwVar.g, (HashMap) this.d);
            this.h = b4xVarB2;
            return b4xVarB2;
        }
        if (i != 3) {
            jf4.o("Invalid type for creating rendition redundant group list");
            return null;
        }
        b4x b4xVar3 = (b4x) this.i;
        if (b4xVar3 != null) {
            return b4xVar3;
        }
        b4x b4xVarB3 = b(mbwVar.h, (HashMap) this.e);
        this.i = b4xVarB3;
        return b4xVarB3;
    }

    public void d() throws kq80 {
        boolean z = this.f11774a;
        mbw mbwVar = (mbw) this.b;
        if (((b4x) this.f) == null) {
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            int i = 0;
            while (i < mbwVar.e.size()) {
                lbw lbwVar = (lbw) mbwVar.e.get(i);
                grd grdVar = this;
                String strH = grdVar.h(lbwVar.f19770a, lbwVar.g, i, arrayList, new sbw(lbwVar.b, lbwVar.h, null), map, map2);
                if (z) {
                    String str = lbwVar.c;
                    if (str != null) {
                        j((HashMap) grdVar.c, str, strH);
                    }
                    String str2 = lbwVar.d;
                    if (str2 != null) {
                        j((HashMap) grdVar.d, str2, strH);
                    }
                    String str3 = lbwVar.e;
                    if (str3 != null) {
                        j((HashMap) grdVar.e, str3, strH);
                    }
                }
                i++;
                this = grdVar;
            }
            grd grdVar2 = this;
            b4x b4xVarO = b4x.o(arrayList);
            grdVar2.f = b4xVarO;
            if (z) {
                tbw tbwVar = (tbw) b4xVarO.get(0);
                tbwVar.getClass();
                f4x f4xVarA = tbwVar.a();
                for (int i2 = 1; i2 < ((b4x) grdVar2.f).size(); i2++) {
                    if (!((tbw) ((b4x) grdVar2.f).get(i2)).a().equals(f4xVarA)) {
                        throw kq80.b("The set of available pathway IDs is inconsistent among variant redundant groups");
                    }
                }
            }
        }
    }

    public void e(InputStream inputStream) throws IOException {
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strConcat = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strConcat = strConcat.concat(line);
            if (line.contains("}")) {
                int iIndexOf = strConcat.indexOf(123);
                int iLastIndexOf = strConcat.lastIndexOf(125);
                strConcat = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strConcat.substring(iIndexOf, iLastIndexOf + 1);
                if (strConcat.isEmpty()) {
                    continue;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strConcat);
                        if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                            dsd dsdVar = (dsd) this.f;
                            new chq("The server is temporarily unavailable. Try again in a few minutes.");
                            dsdVar.a();
                            break;
                        }
                        synchronized (this) {
                            zIsEmpty = ((LinkedHashSet) this.b).isEmpty();
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        if (jSONObject.has("latestTemplateVersionNumber")) {
                            long j = ((msd) ((rrd) this.d).h).f22313a.getLong("last_template_version", 0L);
                            long j2 = jSONObject.getLong("latestTemplateVersionNumber");
                            if (j2 > j) {
                                a(3, j2);
                            }
                        }
                        if (jSONObject.has("retryIntervalSeconds")) {
                            i(jSONObject.getInt("retryIntervalSeconds"));
                        }
                        strConcat = "";
                    } catch (JSONException e) {
                        new ygq("Unable to parse config update message.", e.getCause());
                        g();
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e);
                    }
                }
            }
        }
        bufferedReader.close();
    }

    public void f() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.c;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    e(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e);
                }
            } catch (IOException e2) {
                if (!this.f11774a) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e2);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e3);
                }
            }
            throw th;
        }
    }

    public synchronized void g() {
        Iterator it = ((LinkedHashSet) this.b).iterator();
        while (it.hasNext()) {
            ((dsd) it.next()).a();
        }
    }

    public String h(Uri uri, String str, int i, ArrayList arrayList, sbw sbwVar, HashMap map, HashMap map2) throws kq80 {
        int i2;
        String str2;
        Integer num = (Integer) map.get(sbwVar);
        int i3 = 1;
        if (num == null) {
            if (str == null) {
                map2.put(sbwVar, 1);
                str = Separators.DOT;
            } else {
                map2.put(sbwVar, 0);
            }
            tbw tbwVar = new tbw(sbwVar, str, uri, i);
            map.put(sbwVar, Integer.valueOf(arrayList.size()));
            arrayList.add(tbwVar);
            return str;
        }
        if (str == null) {
            Integer num2 = (Integer) map2.get(sbwVar);
            num2.getClass();
            int iIntValue = num2.intValue();
            if (this.f11774a && iIntValue >= 1) {
                throw kq80.b("At most one playlist URL within an HlsRedundantGroup can have an undefined pathway when Content Steering is enabled");
            }
            int i4 = iIntValue + 1;
            if (i4 <= 1) {
                x0x.w("invalid count: %s", i4, i4 >= 0);
                str2 = i4 == 0 ? "" : Separators.DOT;
            } else {
                long j = i4;
                int i5 = (int) j;
                if (i5 != j) {
                    throw new ArrayIndexOutOfBoundsException(h97.h(j, "Required array size too large: "));
                }
                char[] cArr = new char[i5];
                Separators.DOT.getChars(0, 1, cArr, 0);
                while (true) {
                    i2 = i5 - i3;
                    if (i3 >= i2) {
                        break;
                    }
                    System.arraycopy(cArr, 0, cArr, i3, i3);
                    i3 <<= 1;
                }
                System.arraycopy(cArr, 0, cArr, i3, i2);
                str2 = new String(cArr);
            }
            map2.put(sbwVar, Integer.valueOf(i4));
            str = str2;
        }
        tbw tbwVar2 = (tbw) arrayList.get(num.intValue());
        Uri uri2 = (Uri) tbwVar2.b.get(str);
        if (uri2 == null || uri.equals(uri2)) {
            tbwVar2.b.put(str, uri);
            if (i != -1) {
                tbwVar2.c.add(Integer.valueOf(i));
            }
            return str;
        }
        throw kq80.b("Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup");
    }

    public synchronized void i(int i) {
        Date date = new Date(new Date(System.currentTimeMillis()).getTime() + (((long) i) * 1000));
        msd msdVar = (msd) this.i;
        synchronized (msdVar.d) {
            msdVar.f22313a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public grd(HttpURLConnection httpURLConnection, rrd rrdVar, krd krdVar, LinkedHashSet linkedHashSet, dsd dsdVar, ScheduledExecutorService scheduledExecutorService, msd msdVar) {
        this.c = httpURLConnection;
        this.d = rrdVar;
        this.e = krdVar;
        this.b = linkedHashSet;
        this.f = dsdVar;
        this.g = scheduledExecutorService;
        this.h = new Random();
        this.f11774a = false;
        this.i = msdVar;
    }
}
