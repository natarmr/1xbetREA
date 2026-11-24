package com.google.android.gms.tasks;

import a.alz;
import a.nkz;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzv extends nkz {
    private final List zza;

    private zzv(alz alzVar) {
        super(alzVar);
        this.zza = new ArrayList();
        this.mLifecycleFragment.t("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzvVar;
        alz fragment = nkz.getFragment(activity);
        synchronized (fragment) {
            try {
                zzvVar = (zzv) fragment.f(zzv.class, "TaskOnStopCallback");
                if (zzvVar == null) {
                    zzvVar = new zzv(fragment);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzvVar;
    }

    @Override // a.nkz
    public final void onStop() {
        List list = this.zza;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzq zzqVar = (zzq) ((WeakReference) it.next()).get();
                    if (zzqVar != null) {
                        zzqVar.zzb();
                    }
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(zzq zzqVar) {
        List list = this.zza;
        synchronized (list) {
            list.add(new WeakReference(zzqVar));
        }
    }
}
