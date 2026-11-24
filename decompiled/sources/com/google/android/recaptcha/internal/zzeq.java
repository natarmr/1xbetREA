package com.google.android.recaptcha.internal;

import a.bnn0;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import java.util.Timer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzeq extends bnn0 implements Function2 {
    final /* synthetic */ zzes zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeq(zzes zzesVar, yje yjeVar) {
        super(2, yjeVar);
        this.zza = zzesVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzeq(this.zza, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        zzes zzesVar = this.zza;
        synchronized (zzeo.class) {
            try {
                zzei zzeiVar = zzesVar.zze;
                if (zzeiVar != null && zzeiVar.zzb() == 0) {
                    Timer timer = zzes.zza;
                    if (timer != null) {
                        timer.cancel();
                    }
                    zzes.zza = null;
                }
                zzesVar.zzg();
            } catch (Throwable th) {
                throw th;
            }
        }
        return Unit.f46060a;
    }
}
