package com.google.android.recaptcha.internal;

import a.bnn0;
import a.e0g0;
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
final class zzk extends bnn0 implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, zzek zzekVar, long j, zzsc zzscVar, yje yjeVar) {
        super(2, yjeVar);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j;
        this.zze = zzscVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, yjeVar);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        zzen zzenVar;
        Object g0g0Var;
        wne wneVar = wne.f39444a;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            z1x.P(obj);
        } else {
            z1x.P(obj);
            vne vneVar = (vne) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzenVarZzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(qjj.M(vneVar, null, new zzj((zze) it.next(), this.zzd, this.zze, null), 3));
            }
            jzj[] jzjVarArr = (jzj[]) arrayList.toArray(new jzj[0]);
            jzj[] jzjVarArr2 = (jzj[]) Arrays.copyOf(jzjVarArr, jzjVarArr.length);
            this.zzf = zzenVarZzf;
            this.zza = 1;
            obj = jzjVarArr2.length == 0 ? iun.f15405a : new ja5(jzjVarArr2).a(this);
            if (obj == wneVar) {
                return wneVar;
            }
            zzenVar = zzenVarZzf;
        }
        List list = (List) obj;
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((j0g0) it2.next()).f15681a instanceof g0g0)) {
                    zzenVar.zza();
                    g0g0Var = Unit.f46060a;
                }
            }
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar);
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = new g0g0(zzbdVar);
        } else {
            zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar2);
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(zzbdVar2);
        }
        return new j0g0(g0g0Var);
    }
}
