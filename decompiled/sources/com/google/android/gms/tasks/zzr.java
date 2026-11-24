package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
final class zzr {
    private final Object zza = new Object();
    private Queue zzb;
    private boolean zzc;

    public final void zza(zzq zzqVar) {
        synchronized (this.zza) {
            try {
                Queue arrayDeque = this.zzb;
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.zzb = arrayDeque;
                }
                arrayDeque.add(zzqVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(Task task) {
        zzq zzqVar;
        Object obj = this.zza;
        synchronized (obj) {
            if (this.zzb != null && !this.zzc) {
                this.zzc = true;
                while (true) {
                    synchronized (obj) {
                        try {
                            zzqVar = (zzq) this.zzb.poll();
                            if (zzqVar == null) {
                                this.zzc = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    zzqVar.zza(task);
                }
            }
        }
    }
}
