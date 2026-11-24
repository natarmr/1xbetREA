package com.google.android.recaptcha.internal;

import a.qjj;
import a.t9f;
import a.vne;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class zzes implements zzeo {
    private static Timer zza;
    private final Context zzb;
    private final zzet zzc;
    private final vne zzd;
    private final zzei zze;

    public zzes(Context context, zzet zzetVar, vne vneVar) {
        this.zzb = context;
        this.zzc = zzetVar;
        this.zzd = vneVar;
        zzei zzeiVar = null;
        try {
            zzei zzeiVar2 = zzei.zzd;
            zzeiVar2 = zzeiVar2 == null ? new zzei(context, null) : zzeiVar2;
            zzei.zzd = zzeiVar2;
            zzeiVar = zzeiVar2;
        } catch (Exception unused) {
        }
        this.zze = zzeiVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        zzei zzeiVar;
        zzei zzeiVar2 = this.zze;
        if (zzeiVar2 != null) {
            for (List<zzej> list : CollectionsKt.Q0(zzeiVar2.zzd(), 20, 20)) {
                zzrd zzrdVarZzi = zzrf.zzi();
                ArrayList arrayList = new ArrayList();
                for (zzej zzejVar : list) {
                    try {
                        zztx zztxVarZzk = zztx.zzk(zzkh.zzg().zzj(zzejVar.zzc()));
                        int iZzN = zztxVarZzk.zzN();
                        int i = iZzN - 1;
                        if (iZzN == 0) {
                            throw null;
                        }
                        if (i == 0) {
                            zzrdVarZzi.zzq(zztxVarZzk.zzf());
                        } else if (i == 1) {
                            zzrdVarZzi.zzr(zztxVarZzk.zzg());
                        } else if (i != 2) {
                            t9f.b();
                            return;
                        }
                        arrayList.add(zzejVar);
                    } catch (Exception unused) {
                        zzei zzeiVar3 = this.zze;
                        if (zzeiVar3 != null) {
                            zzeiVar3.zzf(zzejVar);
                        }
                    }
                }
                if (zzrdVarZzi.zzf() + zzrdVarZzi.zze() != 0) {
                    if (this.zzc.zza(((zzrf) zzrdVarZzi.zzk()).zzd()) && (zzeiVar = this.zze) != null) {
                        zzeiVar.zza(arrayList);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzep(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzeo
    public final void zza(zztx zztxVar) {
        qjj.W(this.zzd, null, null, new zzer(this, zztxVar, null), 3);
        zzh();
    }
}
