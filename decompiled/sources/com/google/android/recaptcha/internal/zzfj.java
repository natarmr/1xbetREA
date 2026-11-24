package com.google.android.recaptcha.internal;

import a.a8z;
import a.d5c;
import a.jf4;
import a.maz;
import a.wne;
import a.yje;
import a.z1x;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfj {
    private final a8z zza;

    public zzfj() {
        int i = zzav.zza;
        this.zza = maz.b(zzfi.zza);
    }

    public static final /* synthetic */ zzex zza(zzfj zzfjVar) {
        return (zzex) zzfjVar.zza.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object zzc(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, yje yjeVar) {
        zzfg zzfgVar;
        if (yjeVar instanceof zzfg) {
            zzfgVar = (zzfg) yjeVar;
            int i = zzfgVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzfgVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzfgVar = new zzfg(zzfjVar, yjeVar);
            }
        } else {
            zzfgVar = new zzfg(zzfjVar, yjeVar);
        }
        Object obj = zzfgVar.zza;
        wne wneVar = wne.f39444a;
        int i2 = zzfgVar.zzc;
        if (i2 != 0) {
            if (i2 == 1) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        zzfh zzfhVar = new zzfh(zzfjVar, zzbrVar, zzspVar, null);
        zzfgVar.zzc = 1;
        Object objJ = d5c.J(zzfgVar, zzfhVar);
        return objJ == wneVar ? wneVar : objJ;
    }

    public final Object zzb(zzbr zzbrVar, zzsp zzspVar, yje yjeVar) {
        return zzc(this, zzbrVar, zzspVar, yjeVar);
    }
}
