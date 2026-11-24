package com.google.android.recaptcha.internal;

import a.d5c;
import a.iun;
import a.j0g0;
import a.jf4;
import a.w3d;
import a.wne;
import a.yje;
import a.z1x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class zzl {
    private final List zza;
    private zzek zzb;

    public zzl(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        iun iunVar = iun.f15405a;
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) iunVar.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }

    private final void zzh(zze... zzeVarArr) {
        w3d.v(this.zza, zzeVarArr);
    }

    public final Object zzb(String str, long j, yje yjeVar) {
        return d5c.J(yjeVar, new zzh(this, str, j, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object zzc(long j, zzsc zzscVar, zzek zzekVar, yje yjeVar) {
        zzi zziVar;
        if (yjeVar instanceof zzi) {
            zziVar = (zzi) yjeVar;
            int i = zziVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zziVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zziVar = new zzi(this, yjeVar);
            }
        } else {
            zziVar = new zzi(this, yjeVar);
        }
        Object objJ = zziVar.zza;
        wne wneVar = wne.f39444a;
        int i2 = zziVar.zzc;
        if (i2 == 0) {
            z1x.P(objJ);
            zzk zzkVar = new zzk(this, zzekVar, j, zzscVar, null);
            zziVar.zzc = 1;
            objJ = d5c.J(zziVar, zzkVar);
            if (objJ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objJ);
        }
        return ((j0g0) objJ).f15681a;
    }

    public final List zzd() {
        return this.zza;
    }

    public final void zzf(zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public final void zzg(zzsr zzsrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzsrVar);
        }
    }

    public zzl() {
        this(null, 1, null);
    }
}
