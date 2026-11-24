package a;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r34 implements nae0, vmb0, cy9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f29768a;
    public Object b;
    public Object c;

    public r34(byte b) {
        switch (b) {
            case 2:
                dpf dpfVar = new dpf((byte) 8);
                wez wezVar = wez.b;
                this.b = maz.a(wezVar, dpfVar);
                this.c = maz.a(wezVar, new dpf((byte) 9));
                break;
            case 3:
                h6u0 h6u0Var = h6u0.f12546a;
                this.b = new i6u0();
                this.c = new i6u0();
                break;
            default:
                this.f29768a = 0L;
                this.b = bmq0.f2849a;
                this.c = null;
                break;
        }
    }

    @Override // a.vmb0
    public long a(mkx mkxVar, long j, k6z k6zVar, long j2) {
        mkxVar.getClass();
        k6zVar.getClass();
        w6k w6kVar = (w6k) this.b;
        zcl zclVar = qmk.f28987a;
        int iT = w6kVar.T(16.0f);
        k6z k6zVar2 = k6z.f17794a;
        long j3 = this.f29768a;
        return (((long) ((int) (Float.intBitsToFloat((int) (j3 & 4294967295L)) - ((int) (j2 & 4294967295L))))) & 4294967295L) | (((long) (k6zVar == k6zVar2 ? (int) (((Float.intBitsToFloat((int) (j3 >> 32)) + ((int) (((j6z) this.c).g() >> 32))) + iT) - ((int) (j2 >> 32))) : (int) (Float.intBitsToFloat((int) (j3 >> 32)) - iT))) << 32);
    }

    public void b(long j, long j2) {
        ((i6u0) this.b).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((i6u0) this.c).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    @Override // a.cy9
    public int c() {
        cy9 cy9Var = (cy9) this.b;
        if (cy9Var != null) {
            return cy9Var.c();
        }
        return 1;
    }

    public s34 d() {
        Object obj;
        if (!((bmq0) this.b).p() && (obj = this.c) != null) {
            x0x.A(((bmq0) this.b).b(obj) != -1);
        }
        return new s34(this);
    }

    @Override // a.nae0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Long n(Fragment fragment, iiy iiyVar) {
        long jLongValue = this.f29768a;
        fragment.getClass();
        iiyVar.getClass();
        Long l = (Long) this.c;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            Bundle bundle = fragment.g;
            Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong((String) this.b, jLongValue)) : null;
            this.c = lValueOf;
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            }
        }
        return Long.valueOf(jLongValue);
    }

    @Override // a.cy9
    public eoo0 f() {
        return (eoo0) this.c;
    }

    @Override // a.cy9
    public long h() {
        cy9 cy9Var = (cy9) this.b;
        if (cy9Var != null) {
            return cy9Var.h();
        }
        long j = this.f29768a;
        if (j != -1) {
            return j;
        }
        jf4.n("No timestamp is available.");
        return 0L;
    }

    public void i(jr30 jr30Var, dyw dywVar, Map map, long j) {
        dr8 dr8Var = (dr8) this.c;
        long j2 = dr8Var.f6545a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) dr8Var.c;
        if (j > j2) {
            Object objRemove = linkedHashMap.remove(jr30Var);
            if (objRemove != null) {
                dr8Var.b = dr8Var.l() - dr8Var.o(jr30Var, objRemove);
                dr8Var.k(jr30Var, objRemove, null);
            }
            ((y78) this.b).w(jr30Var, dywVar, map, j);
            return;
        }
        obe0 obe0Var = new obe0(dywVar, map, j);
        Object objPut = linkedHashMap.put(jr30Var, obe0Var);
        dr8Var.b = dr8Var.o(jr30Var, obe0Var) + dr8Var.l();
        if (objPut != null) {
            dr8Var.b = dr8Var.l() - dr8Var.o(jr30Var, objPut);
            dr8Var.k(jr30Var, objPut, obe0Var);
        }
        dr8Var.q(dr8Var.f6545a);
    }

    public void j(Fragment fragment, iiy iiyVar, long j) {
        fragment.getClass();
        iiyVar.getClass();
        Bundle bundle = fragment.g;
        if (bundle == null) {
            bundle = new Bundle();
            fragment.s0(bundle);
        }
        bundle.putLong((String) this.b, j);
        this.c = Long.valueOf(j);
    }

    public List k() {
        List list;
        zlw0 zlw0Var = (zlw0) this.c;
        kxw0 kxw0Var = (kxw0) zlw0Var.b;
        ArrayList arrayList = new ArrayList();
        String str = (String) this.b;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = zlw0Var.c2().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", RemoteMessageConst.DATA, "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.f29768a)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        long j3 = cursorQuery.getLong(6);
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.f29768a) {
                            this.f29768a = j;
                        }
                        try {
                            qww0 qww0Var = (qww0) r6x0.X1(sww0.H(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            qww0Var.r(string);
                            long j4 = cursorQuery.getLong(2);
                            qww0Var.c();
                            ((sww0) qww0Var.b).O(j4);
                            qww0Var.c();
                            ((sww0) qww0Var.b).r(j3);
                            arrayList.add(new vlw0(j, j2, z, (sww0) qww0Var.e()));
                        } catch (IOException e) {
                            uuw0 uuw0Var = kxw0Var.f;
                            kxw0.g(uuw0Var);
                            uuw0Var.g.c(uuw0.q1(str), e, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursorQuery.moveToNext());
                    list = arrayList;
                } else {
                    list = Collections.EMPTY_LIST;
                }
            } finally {
                if (0 != 0) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e2) {
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.g.c(uuw0.q1(str), e2, "Data loss. Error querying raw events batch. appId");
            list = arrayList;
        }
        return list;
    }

    @Override // a.cy9
    public zx9 m() {
        cy9 cy9Var = (cy9) this.b;
        return cy9Var != null ? cy9Var.m() : zx9.f45147a;
    }

    @Override // a.cy9
    public ay9 o() {
        cy9 cy9Var = (cy9) this.b;
        return cy9Var != null ? cy9Var.o() : ay9.f1660a;
    }

    @Override // a.cy9
    public yx9 p() {
        cy9 cy9Var = (cy9) this.b;
        return cy9Var != null ? cy9Var.p() : yx9.f43409a;
    }

    public r34(String str, long j) {
        this.b = str;
        this.f29768a = j;
    }

    public r34(cy9 cy9Var, eoo0 eoo0Var, long j) {
        this.b = cy9Var;
        this.c = eoo0Var;
        this.f29768a = j;
    }

    public r34(String str) {
        this.b = str;
        this.f29768a = Long.MIN_VALUE;
    }
}
