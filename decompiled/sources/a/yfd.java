package a;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yfd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f42535a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ agd h;

    public yfd(agd agdVar) {
        this.h = agdVar;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.f42535a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        eo eoVar = (eo) this.e.get(str);
        if ((eoVar != null ? eoVar.f8117a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                eoVar.f8117a.a(eoVar.b.i0(i2, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new ActivityResult(i2, intent));
        return true;
    }

    public final void b(int i, bsr0 bsr0Var, Object obj) {
        Bundle bundleExtra;
        int i2;
        agd agdVar = this.h;
        r7v r7vVarB0 = bsr0Var.b0(agdVar, obj);
        if (r7vVarB0 != null) {
            new Handler(Looper.getMainLooper()).post(new f58((Object) this, i, (Object) r7vVarB0, (byte) 3));
            return;
        }
        Intent intentZ = bsr0Var.Z(agdVar, obj);
        if (intentZ.getExtras() != null) {
            Bundle extras = intentZ.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentZ.setExtrasClassLoader(agdVar.getClassLoader());
            }
        }
        if (intentZ.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentZ.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentZ.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentZ.getAction())) {
            String[] stringArrayExtra = intentZ.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            jiq0.u0(agdVar, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentZ.getAction())) {
            agdVar.startActivityForResult(intentZ, i, bundle);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentZ.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            intentSenderRequest.getClass();
            i2 = i;
            try {
                agdVar.startIntentSenderForResult(intentSenderRequest.f45281a, i2, intentSenderRequest.b, intentSenderRequest.c, intentSenderRequest.d, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new f58((Object) this, i2, (Object) e, (byte) 4));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }

    public final go c(String str, clz clzVar, bsr0 bsr0Var, wn wnVar) {
        glz glzVarX = clzVar.x();
        if (glzVarX.i.compareTo(lkz.d) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(clzVar);
            lkz lkzVar = glzVarX.i;
            sb.append(" is attempting to register while current state is ");
            sb.append(lkzVar);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.c;
        fo foVar = (fo) linkedHashMap.get(str);
        if (foVar == null) {
            foVar = new fo(glzVarX);
        }
        co coVar = new co(this, str, wnVar, bsr0Var, (byte) 0);
        foVar.f9860a.a(coVar);
        foVar.b.add(coVar);
        linkedHashMap.put(str, foVar);
        return new go(this, str, bsr0Var, (byte) 0);
    }

    public final go d(String str, bsr0 bsr0Var, wn wnVar) {
        e(str);
        this.e.put(str, new eo(wnVar, bsr0Var));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            wnVar.a(obj);
        }
        Bundle bundle = this.g;
        ActivityResult activityResult = (ActivityResult) knx.P(bundle, str, ActivityResult.class);
        if (activityResult != null) {
            bundle.remove(str);
            wnVar.a(bsr0Var.i0(activityResult.f45280a, activityResult.b));
        }
        return new go(this, str, bsr0Var, (byte) 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : lgi0.d(new q8((byte) 9))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f42535a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        v4i0.o("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.f42535a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbT = kng0.t("Dropping pending result for request ", str, ": ");
            sbT.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbT.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ActivityResult) knx.P(bundle, str, ActivityResult.class)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        fo foVar = (fo) linkedHashMap2.get(str);
        if (foVar != null) {
            ArrayList arrayList = foVar.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                foVar.f9860a.f((zkz) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
