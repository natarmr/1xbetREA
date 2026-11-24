package a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.util.Log;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.verification.status.impl.navigation.VerificationStatusScreens$VerificationStatusFragmentScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class drm0 implements mx30, mff0, ngw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6568a;

    public drm0(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f6568a = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    public static VerificationStatusScreens$VerificationStatusFragmentScreen e(drm0 drm0Var) {
        return new VerificationStatusScreens$VerificationStatusFragmentScreen(false, (r9u) drm0Var.f6568a);
    }

    @Override // a.mx30
    public void a(ox30 ox30Var) {
        Toolbar toolbar = (Toolbar) this.f6568a;
        xi xiVar = toolbar.f45299a.t;
        if (xiVar == null || !xiVar.k()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.j1.c).iterator();
            while (it.hasNext()) {
                ((l1r) it.next()).f19270a.w();
            }
        }
    }

    @Override // a.mff0
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        faw0 faw0Var = (faw0) ((kaw0) obj).l();
        TelemetryData telemetryData = (TelemetryData) this.f6568a;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(faw0Var.c);
        int i = o9w0.f24900a;
        if (telemetryData == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            telemetryData.writeToParcel(parcelObtain, 0);
        }
        try {
            faw0Var.b.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(long j, zje zjeVar, String str) {
        e1s0 e1s0Var;
        if (zjeVar instanceof e1s0) {
            e1s0Var = (e1s0) zjeVar;
            int i = e1s0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                e1s0Var.k = i - Integer.MIN_VALUE;
            } else {
                e1s0Var = new e1s0(this, zjeVar);
            }
        } else {
            e1s0Var = new e1s0(this, zjeVar);
        }
        Object objC = e1s0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = e1s0Var.k;
        if (i2 == 0) {
            z1x.P(objC);
            c9s0 c9s0Var = (c9s0) ((lkr0) this.f6568a).invoke();
            e1s0Var.k = 1;
            objC = c9s0Var.c(j, str, e1s0Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        return ((dx5) objC).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(long j, zje zjeVar, String str) {
        f1s0 f1s0Var;
        if (zjeVar instanceof f1s0) {
            f1s0Var = (f1s0) zjeVar;
            int i = f1s0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                f1s0Var.k = i - Integer.MIN_VALUE;
            } else {
                f1s0Var = new f1s0(this, zjeVar);
            }
        } else {
            f1s0Var = new f1s0(this, zjeVar);
        }
        Object objB = f1s0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = f1s0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            c9s0 c9s0Var = (c9s0) ((lkr0) this.f6568a).invoke();
            f1s0Var.k = 1;
            objB = c9s0Var.b(j, str, f1s0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return ((dx5) objB).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(long j, zje zjeVar, String str) {
        g1s0 g1s0Var;
        if (zjeVar instanceof g1s0) {
            g1s0Var = (g1s0) zjeVar;
            int i = g1s0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                g1s0Var.k = i - Integer.MIN_VALUE;
            } else {
                g1s0Var = new g1s0(this, zjeVar);
            }
        } else {
            g1s0Var = new g1s0(this, zjeVar);
        }
        Object objA = g1s0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = g1s0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            c9s0 c9s0Var = (c9s0) ((lkr0) this.f6568a).invoke();
            g1s0Var.k = 1;
            objA = c9s0Var.a(j, str, g1s0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ((dx5) objA).a();
    }

    @Override // a.mx30
    public boolean f(ox30 ox30Var, MenuItem menuItem) {
        return false;
    }

    public void g(yws ywsVar) {
        Object value;
        p7m0 p7m0Var = ((ros) this.f6568a).b.c;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, ywsVar));
    }

    @Override // a.ngw0
    public /* synthetic */ void h(xfw0 xfw0Var) {
        ((hcp0) this.f6568a).i((jiw0) xfw0Var);
    }

    public void i(udl0 udl0Var, List list) {
        list.getClass();
        zvf zvfVar = ((fua) this.f6568a).b;
        zvfVar.getClass();
        zvfVar.f45053a.put(udl0Var, list);
    }

    public void j(anq0 anq0Var) {
        l3z l3zVar = (l3z) this.f6568a;
        l3zVar.getClass();
        gus gusVar = l3zVar.b;
        gusVar.getClass();
        gusVar.f11945a.g(anq0Var);
    }

    public void k(Set set) {
        set.getClass();
        v8l0 v8l0Var = (v8l0) ((ani0) this.f6568a).f1155a;
        p7m0 p7m0Var = v8l0Var.f;
        p7m0 p7m0Var2 = v8l0Var.e;
        if (Intrinsics.d(p7m0Var2.getValue(), set)) {
            return;
        }
        p7m0Var2.o(null, set);
        LinkedHashMap linkedHashMapP = xp20.p((Map) p7m0Var.getValue());
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!linkedHashMapP.containsKey(Long.valueOf(((Number) obj).longValue()))) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapP.entrySet()) {
            if (!set.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashMapP.put(Long.valueOf(((Number) it.next()).longValue()), Boolean.TRUE);
        }
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            linkedHashMapP.remove(Long.valueOf(((Number) it2.next()).longValue()));
        }
        p7m0Var.o(null, linkedHashMapP);
        v8l0Var.a(linkedHashMapP);
    }

    public boolean l() {
        kxw0 kxw0Var = (kxw0) this.f6568a;
        try {
            return grv0.a(kxw0Var.f19080a).b(128, "com.android.vending").versionCode >= 80837300;
        } catch (Exception e) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.o.b(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    @Override // a.ngw0
    /* JADX INFO: renamed from: zza */
    public void mo2zza(String str) {
        ((hcp0) this.f6568a).a(msm0.v(str));
    }

    public /* synthetic */ drm0(Object obj) {
        this.f6568a = obj;
    }

    public drm0(nmt0 nmt0Var, hcp0 hcp0Var) {
        this.f6568a = hcp0Var;
    }

    public drm0(us3 us3Var) {
        us3Var.getClass();
        this.f6568a = us3Var;
    }

    public drm0(ik6 ik6Var) {
        ik6Var.getClass();
        this.f6568a = ik6Var;
    }

    public drm0(ros rosVar) {
        rosVar.getClass();
        this.f6568a = rosVar;
    }

    public drm0(l3z l3zVar) {
        l3zVar.getClass();
        this.f6568a = l3zVar;
    }

    public drm0(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 7:
                this.f6568a = new lkr0(gii0Var, (byte) 16);
                break;
            case 18:
                this.f6568a = new lkr0(gii0Var, (byte) 20);
                break;
            default:
                this.f6568a = new lkr0(gii0Var, (byte) 8);
                break;
        }
    }

    public drm0(j1q0 j1q0Var, r9u r9uVar) {
        j1q0Var.getClass();
        r9uVar.getClass();
        this.f6568a = new mj8(r9uVar, (byte) 1);
    }

    public drm0(knf0 knf0Var, eqx eqxVar, ovo0 ovo0Var, gii0 gii0Var, kuy kuyVar) {
        knf0Var.getClass();
        ovo0Var.getClass();
        gii0Var.getClass();
        kuyVar.getClass();
        this.f6568a = new ali(knf0Var, ovo0Var, gii0Var, kuyVar);
    }

    public drm0(vsz vszVar) {
        v6j0 v6j0Var = (v6j0) vszVar.f37976a;
        rbq0 rbq0Var = (rbq0) vszVar.b;
        wyu wyuVar = (wyu) vszVar.c;
        v6j0Var.getClass();
        rbq0Var.getClass();
        wyuVar.getClass();
        this.f6568a = new oif0(v6j0Var, rbq0Var, wyuVar);
    }

    public drm0(m6x0 m6x0Var) {
        this.f6568a = m6x0Var.l;
    }
}
