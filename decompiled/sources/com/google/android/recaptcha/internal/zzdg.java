package com.google.android.recaptcha.internal;

import a.bnn0;
import a.gmq0;
import a.msm0;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzdg extends bnn0 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdt zzdtVar, String str, long j, zzsp zzspVar, yje yjeVar) {
        super(2, yjeVar);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j;
        this.zzf = zzspVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzen zzenVar;
        Exception e;
        zzbd e2;
        gmq0 e3;
        wne wneVar = wne.f39444a;
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                z1x.P(obj);
            } catch (gmq0 e4) {
                e3 = e4;
                zzbd zzbdVarZzs = this.zzc.zzs(e3, new zzbd(zzbb.zzc, zzba.zzb, e3.getMessage()));
                zzenVar.zzb(zzbdVarZzs);
                throw zzbdVarZzs;
            } catch (zzbd e5) {
                e2 = e5;
                zzbd zzbdVarZzs2 = this.zzc.zzs(e2, e2);
                zzenVar.zzb(zzbdVarZzs2);
                throw zzbdVarZzs2;
            } catch (Exception e6) {
                e = e6;
                zzbd zzbdVarZzs3 = this.zzc.zzs(e, new zzbd(zzbb.zzc, zzba.zzZ, e.getMessage()));
                zzenVar.zzb(zzbdVarZzs3);
                throw zzbdVarZzs3;
            }
        } else {
            z1x.P(obj);
            zzen zzenVarZzf = this.zzc.zzu(this.zzd).zzf(28);
            try {
                long j = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzenVarZzf, null);
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objT = msm0.t(j, zzdfVar, this);
                if (objT == wneVar) {
                    return wneVar;
                }
                zzenVar = zzenVarZzf;
                obj = objT;
            } catch (gmq0 e7) {
                zzenVar = zzenVarZzf;
                e3 = e7;
                zzbd zzbdVarZzs4 = this.zzc.zzs(e3, new zzbd(zzbb.zzc, zzba.zzb, e3.getMessage()));
                zzenVar.zzb(zzbdVarZzs4);
                throw zzbdVarZzs4;
            } catch (zzbd e8) {
                zzenVar = zzenVarZzf;
                e2 = e8;
                zzbd zzbdVarZzs5 = this.zzc.zzs(e2, e2);
                zzenVar.zzb(zzbdVarZzs5);
                throw zzbdVarZzs5;
            } catch (Exception e9) {
                zzenVar = zzenVarZzf;
                e = e9;
                zzbd zzbdVarZzs6 = this.zzc.zzs(e, new zzbd(zzbb.zzc, zzba.zzZ, e.getMessage()));
                zzenVar.zzb(zzbdVarZzs6);
                throw zzbdVarZzs6;
            }
        }
        return (zzsr) obj;
    }
}
