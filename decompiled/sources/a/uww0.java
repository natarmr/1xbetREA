package a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class uww0 extends u5x0 implements rjw0 {
    public final gx3 e;
    public final gx3 f;
    public final gx3 g;
    public final gx3 h;
    public final gx3 i;
    public final gx3 j;
    public final gx3 k;
    public final gww0 l;
    public final ikt0 m;
    public final gx3 n;
    public final gx3 o;
    public final gx3 p;

    public uww0(m6x0 m6x0Var) {
        super(m6x0Var);
        this.e = new gx3(0);
        this.f = new gx3(0);
        this.g = new gx3(0);
        this.h = new gx3(0);
        this.i = new gx3(0);
        this.j = new gx3(0);
        this.n = new gx3(0);
        this.o = new gx3(0);
        this.p = new gx3(0);
        this.k = new gx3(0);
        this.l = new gww0(this);
        this.m = new ikt0(this);
    }

    public static final gx3 w1(duw0 duw0Var) {
        gx3 gx3Var = new gx3(0);
        for (suw0 suw0Var : duw0Var.v()) {
            gx3Var.put(suw0Var.r(), suw0Var.s());
        }
        return gx3Var;
    }

    public static final wyw0 x1(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return wyw0.AD_STORAGE;
        }
        if (i2 == 2) {
            return wyw0.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return wyw0.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return wyw0.AD_PERSONALIZATION;
    }

    public final void A1(String str, String str2, String str3, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        ztw0 ztw0Var;
        byte[] bArrA;
        Iterator it;
        int i;
        boolean z;
        n1();
        m1();
        s0x.E(str);
        ztw0 ztw0Var2 = (ztw0) v1(str, bArr).i();
        t1(str, ztw0Var2);
        u1(str, (duw0) ztw0Var2.e());
        duw0 duw0Var = (duw0) ztw0Var2.e();
        gx3 gx3Var = this.j;
        gx3Var.put(str, duw0Var);
        this.n.put(str, ((duw0) ztw0Var2.b).C());
        this.o.put(str, str2);
        this.p.put(str, str3);
        this.e.put(str, w1((duw0) ztw0Var2.e()));
        m6x0 m6x0Var = this.c;
        zlw0 zlw0Var = m6x0Var.c;
        m6x0.T(zlw0Var);
        ArrayList<fsw0> arrayList = new ArrayList(Collections.unmodifiableList(((duw0) ztw0Var2.b).y()));
        kxw0 kxw0Var = (kxw0) zlw0Var.b;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            dsw0 dsw0Var = (dsw0) ((fsw0) arrayList.get(i2)).i();
            gx3 gx3Var2 = gx3Var;
            if (((fsw0) dsw0Var.b).x() != 0) {
                int i3 = 0;
                while (i3 < ((fsw0) dsw0Var.b).x()) {
                    hsw0 hsw0Var = (hsw0) ((fsw0) dsw0Var.b).y(i3).i();
                    hsw0 hsw0Var2 = (hsw0) hsw0Var.clone();
                    m6x0 m6x0Var2 = m6x0Var;
                    ztw0 ztw0Var3 = ztw0Var2;
                    String strX = o5n0.x(((jsw0) hsw0Var.b).t(), cwr0.j, cwr0.o);
                    if (strX != null) {
                        hsw0Var2.c();
                        ((jsw0) hsw0Var2.b).E(strX);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i4 = 0;
                    while (i4 < ((jsw0) hsw0Var.b).v()) {
                        lsw0 lsw0VarW = ((jsw0) hsw0Var.b).w(i4);
                        boolean z2 = z;
                        hsw0 hsw0Var3 = hsw0Var;
                        String strX2 = o5n0.x(lsw0VarW.y(), phu0.k, phu0.l);
                        if (strX2 != null) {
                            ksw0 ksw0Var = (ksw0) lsw0VarW.i();
                            ksw0Var.c();
                            ((lsw0) ksw0Var.b).A(strX2);
                            lsw0 lsw0Var = (lsw0) ksw0Var.e();
                            hsw0Var2.c();
                            ((jsw0) hsw0Var2.b).F(i4, lsw0Var);
                            z = true;
                        } else {
                            z = z2;
                        }
                        i4++;
                        hsw0Var = hsw0Var3;
                    }
                    if (z) {
                        dsw0Var.c();
                        ((fsw0) dsw0Var.b).A(i3, (jsw0) hsw0Var2.e());
                        arrayList.set(i2, (fsw0) dsw0Var.e());
                    }
                    i3++;
                    m6x0Var = m6x0Var2;
                    ztw0Var2 = ztw0Var3;
                }
            }
            ztw0 ztw0Var4 = ztw0Var2;
            m6x0 m6x0Var3 = m6x0Var;
            if (((fsw0) dsw0Var.b).u() != 0) {
                for (int i5 = 0; i5 < ((fsw0) dsw0Var.b).u(); i5++) {
                    ssw0 ssw0VarV = ((fsw0) dsw0Var.b).v(i5);
                    String strX3 = o5n0.x(ssw0VarV.t(), epv0.p, epv0.q);
                    if (strX3 != null) {
                        rsw0 rsw0Var = (rsw0) ssw0VarV.i();
                        rsw0Var.c();
                        ((ssw0) rsw0Var.b).A(strX3);
                        dsw0Var.c();
                        ((fsw0) dsw0Var.b).z(i5, (ssw0) rsw0Var.e());
                        arrayList.set(i2, (fsw0) dsw0Var.e());
                    }
                }
            }
            i2++;
            gx3Var = gx3Var2;
            m6x0Var = m6x0Var3;
            ztw0Var2 = ztw0Var4;
        }
        ztw0 ztw0Var5 = ztw0Var2;
        gx3 gx3Var3 = gx3Var;
        m6x0 m6x0Var4 = m6x0Var;
        zlw0Var.n1();
        zlw0Var.m1();
        s0x.E(str);
        SQLiteDatabase sQLiteDatabaseC2 = zlw0Var.c2();
        sQLiteDatabaseC2.beginTransaction();
        try {
            zlw0Var.n1();
            zlw0Var.m1();
            s0x.E(str);
            SQLiteDatabase sQLiteDatabaseC3 = zlw0Var.c2();
            sQLiteDatabaseC3.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseC3.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                fsw0 fsw0Var = (fsw0) it2.next();
                zlw0Var.n1();
                zlw0Var.m1();
                s0x.E(str);
                s0x.H(fsw0Var);
                if (fsw0Var.r()) {
                    int iS = fsw0Var.s();
                    Iterator it3 = fsw0Var.w().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!((jsw0) it3.next()).r()) {
                                uuw0 uuw0Var = kxw0Var.f;
                                kxw0.g(uuw0Var);
                                uuw0Var.j.c(uuw0.q1(str), Integer.valueOf(iS), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                                break;
                            }
                        } else {
                            Iterator it4 = fsw0Var.t().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    Iterator it5 = fsw0Var.w().iterator();
                                    while (true) {
                                        boolean zHasNext = it5.hasNext();
                                        fsw0 fsw0Var2 = fsw0Var;
                                        String str4 = "audience_id";
                                        sQLiteDatabase = sQLiteDatabaseC2;
                                        String str5 = HiAnalyticsConstant.BI_KEY_APP_ID;
                                        if (!zHasNext) {
                                            it = it2;
                                            i = iS;
                                            for (ssw0 ssw0Var : fsw0Var2.t()) {
                                                zlw0Var.n1();
                                                zlw0Var.m1();
                                                s0x.E(str);
                                                s0x.H(ssw0Var);
                                                if (ssw0Var.t().isEmpty()) {
                                                    uuw0 uuw0Var2 = kxw0Var.f;
                                                    kxw0.g(uuw0Var2);
                                                    uuw0Var2.j.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", uuw0.q1(str), Integer.valueOf(i), String.valueOf(ssw0Var.r() ? Integer.valueOf(ssw0Var.s()) : null));
                                                } else {
                                                    byte[] bArrA2 = ssw0Var.a();
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put(str5, str);
                                                    String str6 = str5;
                                                    contentValues.put(str4, Integer.valueOf(i));
                                                    contentValues.put("filter_id", ssw0Var.r() ? Integer.valueOf(ssw0Var.s()) : null);
                                                    String str7 = str4;
                                                    contentValues.put("property_name", ssw0Var.t());
                                                    contentValues.put("session_scoped", ssw0Var.x() ? Boolean.valueOf(ssw0Var.y()) : null);
                                                    contentValues.put(RemoteMessageConst.DATA, bArrA2);
                                                    try {
                                                        if (zlw0Var.c2().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            uuw0 uuw0Var3 = kxw0Var.f;
                                                            kxw0.g(uuw0Var3);
                                                            uuw0Var3.g.b(uuw0.q1(str), "Failed to insert property filter (got -1). appId");
                                                        } else {
                                                            str5 = str6;
                                                            str4 = str7;
                                                        }
                                                    } catch (SQLiteException e) {
                                                        uuw0 uuw0Var4 = kxw0Var.f;
                                                        kxw0.g(uuw0Var4);
                                                        uuw0Var4.g.c(uuw0.q1(str), e, "Error storing property filter. appId");
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        try {
                                            jsw0 jsw0Var = (jsw0) it5.next();
                                            zlw0Var.n1();
                                            zlw0Var.m1();
                                            s0x.E(str);
                                            s0x.H(jsw0Var);
                                            if (jsw0Var.t().isEmpty()) {
                                                uuw0 uuw0Var5 = kxw0Var.f;
                                                kxw0.g(uuw0Var5);
                                                uuw0Var5.j.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", uuw0.q1(str), Integer.valueOf(iS), String.valueOf(jsw0Var.r() ? Integer.valueOf(jsw0Var.s()) : null));
                                                it = it2;
                                                i = iS;
                                            } else {
                                                it = it2;
                                                byte[] bArrA3 = jsw0Var.a();
                                                i = iS;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
                                                contentValues2.put("audience_id", Integer.valueOf(i));
                                                contentValues2.put("filter_id", jsw0Var.r() ? Integer.valueOf(jsw0Var.s()) : null);
                                                contentValues2.put("event_name", jsw0Var.t());
                                                contentValues2.put("session_scoped", jsw0Var.B() ? Boolean.valueOf(jsw0Var.C()) : null);
                                                contentValues2.put(RemoteMessageConst.DATA, bArrA3);
                                                try {
                                                    if (zlw0Var.c2().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        uuw0 uuw0Var6 = kxw0Var.f;
                                                        kxw0.g(uuw0Var6);
                                                        uuw0Var6.g.b(uuw0.q1(str), "Failed to insert event filter (got -1). appId");
                                                    }
                                                    fsw0Var = fsw0Var2;
                                                    sQLiteDatabaseC2 = sQLiteDatabase;
                                                    it2 = it;
                                                    iS = i;
                                                } catch (SQLiteException e2) {
                                                    uuw0 uuw0Var7 = kxw0Var.f;
                                                    kxw0.g(uuw0Var7);
                                                    uuw0Var7.g.c(uuw0.q1(str), e2, "Error storing event filter. appId");
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                        zlw0Var.n1();
                                        zlw0Var.m1();
                                        s0x.E(str);
                                        SQLiteDatabase sQLiteDatabaseC4 = zlw0Var.c2();
                                        sQLiteDatabaseC4.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
                                        sQLiteDatabaseC4.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
                                        break;
                                    }
                                    sQLiteDatabaseC2 = sQLiteDatabase;
                                    it2 = it;
                                    break;
                                }
                                if (!((ssw0) it4.next()).r()) {
                                    uuw0 uuw0Var8 = kxw0Var.f;
                                    kxw0.g(uuw0Var8);
                                    uuw0Var8.j.c(uuw0.q1(str), Integer.valueOf(iS), "Property filter with no ID. Audience definition ignored. appId, audienceId");
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    uuw0 uuw0Var9 = kxw0Var.f;
                    kxw0.g(uuw0Var9);
                    uuw0Var9.j.b(uuw0.q1(str), "Audience with no ID. appId");
                }
            }
            sQLiteDatabase = sQLiteDatabaseC2;
            ArrayList arrayList2 = new ArrayList();
            for (fsw0 fsw0Var3 : arrayList) {
                arrayList2.add(fsw0Var3.r() ? Integer.valueOf(fsw0Var3.s()) : null);
            }
            s0x.E(str);
            zlw0Var.n1();
            zlw0Var.m1();
            SQLiteDatabase sQLiteDatabaseC5 = zlw0Var.c2();
            try {
                long jI1 = zlw0Var.I1("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, kxw0Var.d.v1(str, btw0.U)));
                if (jI1 > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(Separators.COMMA, arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append(Separators.LPAREN);
                            sb.append(strJoin);
                            sb.append(Separators.RPAREN);
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseC5.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i6);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i6++;
                    }
                }
            } catch (SQLiteException e3) {
                uuw0 uuw0Var10 = kxw0Var.f;
                kxw0.g(uuw0Var10);
                uuw0Var10.g.c(uuw0.q1(str), e3, "Database error querying filters. appId");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                ztw0Var5.c();
                ztw0Var = ztw0Var5;
                try {
                    ((duw0) ztw0Var.b).L();
                    bArrA = ((duw0) ztw0Var.e()).a();
                } catch (RuntimeException e4) {
                    e = e4;
                    uuw0 uuw0Var11 = ((kxw0) this.b).f;
                    kxw0.g(uuw0Var11);
                    uuw0Var11.j.c(uuw0.q1(str), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                    bArrA = bArr;
                }
            } catch (RuntimeException e5) {
                e = e5;
                ztw0Var = ztw0Var5;
            }
            zlw0 zlw0Var2 = m6x0Var4.c;
            m6x0.T(zlw0Var2);
            kxw0 kxw0Var2 = (kxw0) zlw0Var2.b;
            s0x.E(str);
            zlw0Var2.m1();
            zlw0Var2.n1();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrA);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (zlw0Var2.c2().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    uuw0 uuw0Var12 = kxw0Var2.f;
                    kxw0.g(uuw0Var12);
                    uuw0Var12.g.b(uuw0.q1(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e6) {
                uuw0 uuw0Var13 = kxw0Var2.f;
                kxw0.g(uuw0Var13);
                uuw0Var13.g.c(uuw0.q1(str), e6, "Error storing remote config. appId");
            }
            ztw0Var.c();
            ((duw0) ztw0Var.b).M();
            gx3Var3.put(str, (duw0) ztw0Var.e());
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabaseC2;
        }
    }

    public final boolean B1(String str, String str2) {
        Boolean bool;
        m1();
        s1(str);
        if ("1".equals(U(str, "measurement.upload.blacklist_internal")) && x6x0.Q1(str2)) {
            return true;
        }
        if ("1".equals(U(str, "measurement.upload.blacklist_public")) && x6x0.m2(str2)) {
            return true;
        }
        Map map = (Map) this.g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean C1(String str, String str2) {
        Boolean bool;
        m1();
        s1(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.h.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final List D1(String str) {
        m1();
        s1(str);
        return (List) this.i.get(str);
    }

    public final int E1(String str, String str2) {
        Integer num;
        m1();
        s1(str);
        Map map = (Map) this.k.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean F1(String str) {
        m1();
        s1(str);
        gx3 gx3Var = this.f;
        if (gx3Var.get(str) != null) {
            return ((Set) gx3Var.get(str)).contains("os_version") || ((Set) gx3Var.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean G1(String str) {
        m1();
        s1(str);
        gx3 gx3Var = this.f;
        return gx3Var.get(str) != null && ((Set) gx3Var.get(str)).contains("app_instance_id");
    }

    public final boolean H1(String str, wyw0 wyw0Var) {
        m1();
        s1(str);
        otw0 otw0VarI1 = I1(str);
        if (otw0VarI1 == null) {
            return false;
        }
        for (xsw0 xsw0Var : otw0VarI1.r()) {
            if (wyw0Var == x1(xsw0Var.r())) {
                return xsw0Var.s() == 2;
            }
        }
        return false;
    }

    public final otw0 I1(String str) {
        m1();
        s1(str);
        duw0 duw0VarY1 = y1(str);
        if (duw0VarY1 == null || !duw0VarY1.D()) {
            return null;
        }
        return duw0VarY1.E();
    }

    @Override // a.rjw0
    public final String U(String str, String str2) {
        m1();
        s1(str);
        Map map = (Map) this.e.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final tyw0 q1(String str, wyw0 wyw0Var) {
        m1();
        s1(str);
        otw0 otw0VarI1 = I1(str);
        if (otw0VarI1 != null) {
            for (xsw0 xsw0Var : otw0VarI1.w()) {
                if (x1(xsw0Var.r()) == wyw0Var) {
                    int iS = xsw0Var.s() - 1;
                    if (iS == 1) {
                        return tyw0.GRANTED;
                    }
                    if (iS != 2) {
                        break;
                    }
                    return tyw0.DENIED;
                }
            }
        }
        return tyw0.UNINITIALIZED;
    }

    public final boolean r1(String str) {
        m1();
        s1(str);
        otw0 otw0VarI1 = I1(str);
        if (otw0VarI1 == null) {
            return false;
        }
        for (xsw0 xsw0Var : otw0VarI1.r()) {
            if (xsw0Var.r() == 3 && xsw0Var.t() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void s1(String str) {
        n1();
        m1();
        s0x.E(str);
        gx3 gx3Var = this.j;
        if (gx3Var.get(str) == null) {
            zlw0 zlw0Var = this.c.c;
            m6x0.T(zlw0Var);
            ykv0 ykv0VarT2 = zlw0Var.t2(str);
            gx3 gx3Var2 = this.p;
            gx3 gx3Var3 = this.o;
            gx3 gx3Var4 = this.n;
            gx3 gx3Var5 = this.e;
            if (ykv0VarT2 != null) {
                ztw0 ztw0Var = (ztw0) v1(str, (byte[]) ykv0VarT2.f42811a).i();
                t1(str, ztw0Var);
                gx3Var5.put(str, w1((duw0) ztw0Var.e()));
                gx3Var.put(str, (duw0) ztw0Var.e());
                u1(str, (duw0) ztw0Var.e());
                gx3Var4.put(str, ((duw0) ztw0Var.b).C());
                gx3Var3.put(str, (String) ykv0VarT2.b);
                gx3Var2.put(str, (String) ykv0VarT2.c);
                return;
            }
            gx3Var5.put(str, null);
            this.g.put(str, null);
            this.f.put(str, null);
            this.h.put(str, null);
            this.i.put(str, null);
            gx3Var.put(str, null);
            gx3Var4.put(str, null);
            gx3Var3.put(str, null);
            gx3Var2.put(str, null);
            this.k.put(str, null);
        }
    }

    public final void t1(String str, ztw0 ztw0Var) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        gx3 gx3Var = new gx3(0);
        gx3 gx3Var2 = new gx3(0);
        gx3 gx3Var3 = new gx3(0);
        Iterator it = Collections.unmodifiableList(((duw0) ztw0Var.b).B()).iterator();
        while (it.hasNext()) {
            hashSet.add(((stw0) it.next()).r());
        }
        kxw0 kxw0Var = (kxw0) this.b;
        bkw0 bkw0Var = kxw0Var.d;
        uuw0 uuw0Var = kxw0Var.f;
        atw0 atw0Var = btw0.V0;
        if (bkw0Var.x1(null, atw0Var)) {
            arrayList2.addAll(Collections.unmodifiableList(((duw0) ztw0Var.b).H()));
        }
        while (i < ((duw0) ztw0Var.b).w()) {
            utw0 utw0Var = (utw0) ((duw0) ztw0Var.b).x(i).i();
            if (utw0Var.h().isEmpty()) {
                kxw0.g(uuw0Var);
                uuw0Var.j.a("EventConfig contained null event name");
                arrayList = arrayList2;
            } else {
                String strH = utw0Var.h();
                arrayList = arrayList2;
                String strX = o5n0.x(utw0Var.h(), cwr0.j, cwr0.o);
                if (!TextUtils.isEmpty(strX)) {
                    utw0Var.c();
                    ((ytw0) utw0Var.b).y(strX);
                    ztw0Var.c();
                    ((duw0) ztw0Var.b).K(i, (ytw0) utw0Var.e());
                }
                if (((ytw0) utw0Var.b).s() && ((ytw0) utw0Var.b).t()) {
                    gx3Var.put(strH, Boolean.TRUE);
                }
                if (((ytw0) utw0Var.b).u() && ((ytw0) utw0Var.b).v()) {
                    gx3Var2.put(utw0Var.h(), Boolean.TRUE);
                }
                if (((ytw0) utw0Var.b).w()) {
                    if (((ytw0) utw0Var.b).x() < 2 || ((ytw0) utw0Var.b).x() > 65535) {
                        kxw0.g(uuw0Var);
                        uuw0Var.j.c(utw0Var.h(), Integer.valueOf(((ytw0) utw0Var.b).x()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        gx3Var3.put(utw0Var.h(), Integer.valueOf(((ytw0) utw0Var.b).x()));
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        this.f.put(str, hashSet);
        if (kxw0Var.d.x1(null, atw0Var)) {
            this.i.put(str, arrayList3);
        }
        this.g.put(str, gx3Var);
        this.h.put(str, gx3Var2);
        this.k.put(str, gx3Var3);
    }

    public final void u1(String str, duw0 duw0Var) {
        kxw0 kxw0Var = (kxw0) this.b;
        int iA = duw0Var.A();
        gww0 gww0Var = this.l;
        if (iA == 0) {
            gww0Var.e(str);
            return;
        }
        uuw0 uuw0Var = kxw0Var.f;
        kxw0.g(uuw0Var);
        uuw0Var.o.b(Integer.valueOf(duw0Var.A()), "EES programs found");
        byte b = 0;
        nyw0 nyw0Var = (nyw0) duw0Var.z().get(0);
        try {
            pnw0 pnw0Var = new pnw0();
            fht0 fht0Var = pnw0Var.f27306a;
            ((HashMap) ((zas0) fht0Var.d).b).put("internal.remoteConfig", new nww0(this, str, (byte) 2));
            ((HashMap) ((zas0) fht0Var.d).b).put("internal.appMetadata", new nww0(this, str, b));
            ((HashMap) ((zas0) fht0Var.d).b).put("internal.logger", new jmv(this, (byte) 2));
            pnw0Var.b(nyw0Var);
            gww0Var.d(str, pnw0Var);
            kxw0.g(uuw0Var);
            quw0 quw0Var = uuw0Var.o;
            quw0Var.c(str, Integer.valueOf(nyw0Var.s().s()), "EES program loaded for appId, activities");
            for (hyw0 hyw0Var : nyw0Var.s().r()) {
                kxw0.g(uuw0Var);
                quw0Var.b(hyw0Var.r(), "EES program activity");
            }
        } catch (cqw0 unused) {
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.g.b(str, "Failed to load EES program. appId");
        }
    }

    public final duw0 v1(String str, byte[] bArr) {
        kxw0 kxw0Var = (kxw0) this.b;
        if (bArr == null) {
            return duw0.J();
        }
        try {
            duw0 duw0Var = (duw0) ((ztw0) r6x0.X1(duw0.I(), bArr)).e();
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.o.c(duw0Var.r() ? Long.valueOf(duw0Var.s()) : null, duw0Var.t() ? duw0Var.u() : null, "Parsed config. version, gmp_app_id");
            return duw0Var;
        } catch (zew0 e) {
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.j.c(uuw0.q1(str), e, "Unable to merge remote config. appId");
            return duw0.J();
        } catch (RuntimeException e2) {
            uuw0 uuw0Var3 = kxw0Var.f;
            kxw0.g(uuw0Var3);
            uuw0Var3.j.c(uuw0.q1(str), e2, "Unable to merge remote config. appId");
            return duw0.J();
        }
    }

    public final duw0 y1(String str) {
        n1();
        m1();
        s0x.E(str);
        s1(str);
        return (duw0) this.j.get(str);
    }

    public final String z1(String str) {
        m1();
        s1(str);
        return (String) this.n.get(str);
    }

    @Override // a.u5x0
    public final void p1() {
    }
}
