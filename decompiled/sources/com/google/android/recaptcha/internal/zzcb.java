package com.google.android.recaptcha.internal;

import a.i050;
import a.jf4;
import a.k050;
import a.tx3;
import a.wne;
import a.yje;
import a.z1x;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcb {
    private Object zza;
    private final i050 zzb = new k050();

    public zzcb(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zza(Object obj, yje yjeVar) {
        zzby zzbyVar;
        i050 i050Var;
        if (yjeVar instanceof zzby) {
            zzbyVar = (zzby) yjeVar;
            int i = zzbyVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzbyVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzbyVar = new zzby(this, yjeVar);
            }
        } else {
            zzbyVar = new zzby(this, yjeVar);
        }
        Object obj2 = zzbyVar.zzb;
        wne wneVar = wne.f39444a;
        int i2 = zzbyVar.zzd;
        if (i2 == 0) {
            z1x.P(obj2);
            i050Var = this.zzb;
            zzbyVar.zze = this;
            zzbyVar.zzf = (zzje) obj;
            zzbyVar.zza = i050Var;
            zzbyVar.zzd = 1;
            if (i050Var.d(zzbyVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i050 i050Var2 = (i050) zzbyVar.zza;
            obj = zzbyVar.zzf;
            zzcb zzcbVar = zzbyVar.zze;
            z1x.P(obj2);
            i050Var = i050Var2;
            this = zzcbVar;
        }
        try {
            return Boolean.valueOf(Intrinsics.d(this.zza, obj));
        } finally {
            i050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzb(Object[] objArr, yje yjeVar) {
        zzbz zzbzVar;
        i050 i050Var;
        if (yjeVar instanceof zzbz) {
            zzbzVar = (zzbz) yjeVar;
            int i = zzbzVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzbzVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzbzVar = new zzbz(this, yjeVar);
            }
        } else {
            zzbzVar = new zzbz(this, yjeVar);
        }
        Object obj = zzbzVar.zzb;
        wne wneVar = wne.f39444a;
        int i2 = zzbzVar.zzd;
        if (i2 == 0) {
            z1x.P(obj);
            i050Var = this.zzb;
            zzbzVar.zze = this;
            zzbzVar.zzf = (zzje[]) objArr;
            zzbzVar.zza = i050Var;
            zzbzVar.zzd = 1;
            if (i050Var.d(zzbzVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i050 i050Var2 = (i050) zzbzVar.zza;
            objArr = zzbzVar.zzf;
            zzcb zzcbVar = zzbzVar.zze;
            z1x.P(obj);
            i050Var = i050Var2;
            this = zzcbVar;
        }
        try {
            return Boolean.valueOf(tx3.u(this.zza, objArr));
        } finally {
            i050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzc(Object obj, yje yjeVar) {
        zzca zzcaVar;
        i050 i050Var;
        if (yjeVar instanceof zzca) {
            zzcaVar = (zzca) yjeVar;
            int i = zzcaVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcaVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzcaVar = new zzca(this, yjeVar);
            }
        } else {
            zzcaVar = new zzca(this, yjeVar);
        }
        Object obj2 = zzcaVar.zzb;
        wne wneVar = wne.f39444a;
        int i2 = zzcaVar.zzd;
        if (i2 == 0) {
            z1x.P(obj2);
            i050Var = this.zzb;
            zzcaVar.zze = this;
            zzcaVar.zzf = (zzje) obj;
            zzcaVar.zza = i050Var;
            zzcaVar.zzd = 1;
            if (i050Var.d(zzcaVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i050 i050Var2 = (i050) zzcaVar.zza;
            obj = zzcaVar.zzf;
            zzcb zzcbVar = zzcaVar.zze;
            z1x.P(obj2);
            i050Var = i050Var2;
            this = zzcbVar;
        }
        try {
            this.zza = obj;
            return Unit.f46060a;
        } finally {
            i050Var.c(null);
        }
    }
}
