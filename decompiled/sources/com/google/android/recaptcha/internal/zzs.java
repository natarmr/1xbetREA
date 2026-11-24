package com.google.android.recaptcha.internal;

import a.bby;
import a.bnn0;
import a.e0g0;
import a.j0g0;
import a.qjj;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzs extends bnn0 implements Function2 {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzv zzvVar, String str, yje yjeVar) {
        super(2, yjeVar);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, yjeVar);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        int i = this.zza;
        z1x.P(obj);
        if (i == 0) {
            vne vneVar = (vne) this.zzd;
            ArrayList arrayList = new ArrayList();
            zzv zzvVar = this.zzb;
            zzvVar.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            List list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(qjj.W(vneVar, null, null, new zzr((zzy) it.next(), this.zzc, arrayList, null), 3));
            }
            bby[] bbyVarArr = (bby[]) arrayList2.toArray(new bby[0]);
            bby[] bbyVarArr2 = (bby[]) Arrays.copyOf(bbyVarArr, bbyVarArr.length);
            this.zza = 1;
            if (qjj.U(bbyVarArr2, this) == wneVar) {
                return wneVar;
            }
        }
        e0g0 e0g0Var = j0g0.b;
        return new j0g0(this.zzb.zzq(this.zzc));
    }
}
