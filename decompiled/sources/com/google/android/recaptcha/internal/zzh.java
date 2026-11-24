package com.google.android.recaptcha.internal;

import a.bnn0;
import a.g0g0;
import a.iun;
import a.j0g0;
import a.ja5;
import a.jzj;
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
final class zzh extends bnn0 implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j, yje yjeVar) {
        super(2, yjeVar);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, yjeVar);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        zzen zzenVarZzf;
        zzen zzenVar;
        wne wneVar = wne.f39444a;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zze;
            z1x.P(obj);
        } else {
            z1x.P(obj);
            vne vneVar = (vne) this.zze;
            zzek zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVarZzf = zzekVar.zzf(31);
            } else {
                zzenVarZzf = null;
            }
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(qjj.M(vneVar, null, new zzg(zzeVar, this.zzc, this.zzd, null), 3));
                }
            }
            jzj[] jzjVarArr = (jzj[]) arrayList.toArray(new jzj[0]);
            jzj[] jzjVarArr2 = (jzj[]) Arrays.copyOf(jzjVarArr, jzjVarArr.length);
            this.zze = zzenVarZzf;
            this.zza = 1;
            obj = jzjVarArr2.length == 0 ? iun.f15405a : new ja5(jzjVarArr2).a(this);
            if (obj == wneVar) {
                return wneVar;
            }
            zzenVar = zzenVarZzf;
        }
        String str = this.zzc;
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((j0g0) it.next()).f15681a;
            if (!(obj2 instanceof g0g0)) {
                zzshVarZzf.zzh((zzsi) obj2);
            }
        }
        zzsi zzsiVar = (zzsi) zzshVarZzf.zzk();
        if (zzenVar != null) {
            zzenVar.zza();
        }
        return zzsiVar;
    }
}
