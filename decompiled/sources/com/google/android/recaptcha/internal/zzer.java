package com.google.android.recaptcha.internal;

import a.bnn0;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import android.content.ContentValues;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzer extends bnn0 implements Function2 {
    final /* synthetic */ zzes zza;
    final /* synthetic */ zztx zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzes zzesVar, zztx zztxVar, yje yjeVar) {
        super(2, yjeVar);
        this.zza = zzesVar;
        this.zzb = zztxVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzer(this.zza, this.zzb, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzer) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        zztx zztxVar = this.zzb;
        zzes zzesVar = this.zza;
        synchronized (zzeo.class) {
            try {
                if (zzesVar.zze != null) {
                    byte[] bArrZzd = zztxVar.zzd();
                    zzej zzejVar = new zzej(zzkh.zzg().zzi(bArrZzd, 0, bArrZzd.length), System.currentTimeMillis(), 0);
                    zzei zzeiVar = zzesVar.zze;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ss", zzejVar.zzc());
                    contentValues.put("ts", Long.valueOf(zzejVar.zzb()));
                    zzeiVar.getWritableDatabase().insert("ce", null, contentValues);
                    int iZzb = zzesVar.zze.zzb() - 500;
                    if (iZzb > 0) {
                        zzesVar.zze.zza(CollectionsKt.D0(zzesVar.zze.zzd(), iZzb));
                    }
                    if (zzesVar.zze.zzb() >= 20) {
                        zzesVar.zzg();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Unit.f46060a;
    }
}
