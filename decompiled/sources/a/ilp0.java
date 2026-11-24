package a;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import org.xplatform.themeswitch.impl.ThemeSwitchTimeWorker;

/* JADX INFO: loaded from: classes5.dex */
public final class ilp0 implements rh60, zlu0, mff0, ngw0, OnFailureListener, OnCompleteListener, jix0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f14992a;

    public ilp0(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 3:
                this.f14992a = new lkr0(gii0Var, (byte) 7);
                break;
            default:
                this.f14992a = new enj0(gii0Var, (byte) 29);
                break;
        }
    }

    @Override // a.zlu0
    public ylu0 a(nj50 nj50Var) {
        return new okt0(this, nj50Var, false);
    }

    @Override // a.mff0
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        daw0 daw0Var = (daw0) ((e9w0) obj).l();
        com.google.android.gms.common.internal.zab zabVar = (com.google.android.gms.common.internal.zab) this.f14992a;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(daw0Var.c);
        int i = o9w0.f24900a;
        parcelObtain.writeInt(1);
        zabVar.writeToParcel(parcelObtain, 0);
        try {
            daw0Var.b.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // a.zlu0
    public nj50 b(int i) {
        List list = (List) ((SparseArray) this.f14992a).get(i);
        if (list != null && !list.isEmpty()) {
            return (nj50) list.get(0);
        }
        jf4.o(twn.m(i, "Cannot find the wrapper for global view type "));
        return null;
    }

    @Override // a.rh60
    public void c(int i) {
        nps0 nps0Var = (nps0) this.f14992a;
        iiy[] iiyVarArr = nps0.O1;
        cqs0 cqs0Var = (cqs0) nps0Var.M1.getValue();
        if (!cqs0Var.f.c()) {
            cqs0Var.w(d16.f5295a);
            return;
        }
        sac.V(jiu0.a(cqs0Var), new tps0(cqs0Var, (byte) 2), null, cqs0Var.d.b, new bqs0(cqs0Var, i, null, (byte) 0), 10);
    }

    public void d(String str) {
        n8v n8vVar = (n8v) ((g2v) this.f14992a).f10580a;
        n8vVar.getClass();
        n8vVar.f23108a.o(null, str);
    }

    public void e(String str, long j, boolean z, uaq0 uaq0Var) {
        rbq0 rbq0Var = (rbq0) ((roi0) this.f14992a).f30839a;
        rbq0Var.getClass();
        Context applicationContext = rbq0Var.f30202a.getApplicationContext();
        applicationContext.getClass();
        cpv0 cpv0VarD = cpv0.d(applicationContext);
        cpv0VarD.getClass();
        yje yjeVar = null;
        if (!z) {
            std stdVar = cpv0VarD.b.f;
            String strConcat = "CancelWorkByName_".concat(str);
            xgi0 xgi0Var = cpv0VarD.d.f9946a;
            xgi0Var.getClass();
            r8x.T(stdVar, strConcat, xgi0Var, new h5a(str, cpv0VarD));
            bby bbyVar = rbq0Var.e;
            if (bbyVar != null) {
                bbyVar.cancel(null);
                return;
            }
            return;
        }
        xl60 xl60Var = new xl60(ThemeSwitchTimeWorker.class);
        Pair[] pairArr = {new Pair("theme", Integer.valueOf(uaq0Var.ordinal()))};
        laj lajVar = new laj((byte) 0);
        Pair pair = pairArr[0];
        lajVar.b(pair.b, (String) pair.f46059a);
        ((ppv0) xl60Var.c).e = lajVar.a();
        yl60 yl60Var = (yl60) ((xl60) ((xl60) xl60Var.g(str)).x(j, TimeUnit.MILLISECONDS)).k();
        cpv0VarD.c(str, zko.f44542a, yl60Var);
        rbq0Var.e = sac.V((vne) rbq0Var.c.getValue(), pbq0.f26720a, null, null, new lcl0(rbq0Var, yl60Var.f20459a, yjeVar, (byte) 28), 14);
    }

    public void f(List list) {
        Pair pair;
        ArrayList<Pair> arrayListU = twn.u(list);
        Iterator it = list.iterator();
        while (true) {
            Pair pair2 = null;
            if (!it.hasNext()) {
                break;
            }
            d2w d2wVar = (d2w) it.next();
            if (d2wVar != null) {
                if (d2wVar instanceof y1w) {
                    y1w y1wVar = (y1w) d2wVar;
                    pair = new Pair(Long.valueOf(y1wVar.d), Long.valueOf(y1wVar.l));
                } else if (d2wVar instanceof u1w) {
                    u1w u1wVar = (u1w) d2wVar;
                    pair = new Pair(Long.valueOf(u1wVar.d), Long.valueOf(u1wVar.l));
                } else if (d2wVar instanceof x1w) {
                    x1w x1wVar = (x1w) d2wVar;
                    pair = new Pair(Long.valueOf(x1wVar.d), Long.valueOf(x1wVar.l));
                } else if (d2wVar instanceof c2w) {
                    c2w c2wVar = (c2w) d2wVar;
                    pair = new Pair(Long.valueOf(c2wVar.d), Long.valueOf(c2wVar.l));
                }
                pair2 = pair;
            }
            if (pair2 != null) {
                arrayListU.add(pair2);
            }
        }
        o5g0 o5g0Var = (o5g0) ((pv00) this.f14992a).f27640a;
        o5g0Var.getClass();
        p7m0 p7m0Var = o5g0Var.f24686a;
        jo20 jo20Var = new jo20();
        for (Pair pair3 : arrayListU) {
            Date date = new Date(TimeUnit.SECONDS.toMillis(((Number) pair3.b).longValue()));
            Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
            calendar.setTime(date);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            Date time = calendar.getTime();
            time.getClass();
            Object linkedHashSet = jo20Var.get(-321L);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
            }
            ((Set) linkedHashSet).add(time);
            jo20Var.put(-321L, linkedHashSet);
            Object obj = pair3.f46059a;
            Object linkedHashSet2 = jo20Var.get(obj);
            if (linkedHashSet2 == null) {
                linkedHashSet2 = new LinkedHashSet();
            }
            ((Set) linkedHashSet2).add(time);
            jo20Var.put(obj, linkedHashSet2);
        }
        p7m0Var.o(null, jo20Var.b());
    }

    public boolean g() {
        uuw0 uuw0Var = ((kxw0) this.f14992a).f;
        kxw0.g(uuw0Var);
        return Log.isLoggable(uuw0Var.s1(), 3);
    }

    @Override // a.ngw0
    public /* synthetic */ void h(xfw0 xfw0Var) {
        ((hcp0) this.f14992a).f((zzaia) xfw0Var);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        ((CountDownLatch) this.f14992a).countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        long j;
        if (exc instanceof lgq) {
            zz2 zz2Var = tlw0.e;
            zz2Var.K("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            tlw0 tlw0Var = (tlw0) ((mfr) this.f14992a).c;
            int i = (int) tlw0Var.b;
            if (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) {
                j = 2 * tlw0Var.b;
            } else {
                j = i != 960 ? 30L : 960L;
            }
            tlw0Var.b = j;
            tlw0Var.f34168a = (tlw0Var.b * 1000) + System.currentTimeMillis();
            zz2Var.K(h97.h(tlw0Var.f34168a, "Scheduling refresh for "), new Object[0]);
            tlw0Var.c.postDelayed(tlw0Var.d, tlw0Var.b * 1000);
        }
    }

    @Override // a.jix0
    public Object zza(String str) {
        lix0 lix0Var = (lix0) this.f14992a;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return lix0Var.b(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        return lix0Var.b(str, null);
    }

    public /* synthetic */ ilp0(Object obj, Object obj2) {
        this.f14992a = obj2;
    }

    public /* synthetic */ ilp0(Object obj) {
        this.f14992a = obj;
    }

    @Override // a.ngw0
    /* JADX INFO: renamed from: zza */
    public void mo2zza(String str) {
        ((hcp0) this.f14992a).a(msm0.v(str));
    }
}
