package com.google.android.recaptcha.internal;

import a.jf4;
import a.ndd;
import a.odd;
import a.qjj;
import a.wne;
import a.yje;
import a.z1x;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zzec implements zzcn {
    private final zzdt zza;
    private final zzek zzb;
    private zzbd zzd;
    private zzsc zze;
    private final zzbi zzg;
    private ndd zzc = new odd();
    private zzcm zzf = zzcm.zza;

    public zzec(zzdt zzdtVar, zzbi zzbiVar, zzek zzekVar, zzbo zzboVar) {
        this.zza = zzdtVar;
        this.zzg = zzbiVar;
        this.zzb = zzekVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzl(Function1 function1, yje yjeVar) {
        zzdv zzdvVar;
        zzbn zzbnVar;
        if (yjeVar instanceof zzdv) {
            zzdvVar = (zzdv) yjeVar;
            int i = zzdvVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdvVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdvVar = new zzdv(this, yjeVar);
            }
        } else {
            zzdvVar = new zzdv(this, yjeVar);
        }
        Object obj = zzdvVar.zza;
        Object obj2 = wne.f39444a;
        int i2 = zzdvVar.zzc;
        if (i2 == 0) {
            z1x.P(obj);
            zzbn zzbnVar2 = new zzbn();
            zzdvVar.zzd = zzbnVar2;
            zzdvVar.zzc = 1;
            if (function1.invoke(zzdvVar) == obj2) {
                return obj2;
            }
            zzbnVar = zzbnVar2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zzbnVar = zzdvVar.zzd;
            z1x.P(obj);
        }
        zzbnVar.zzc();
        return new Long(zzbnVar.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075 A[Catch: Exception -> 0x002f, TRY_ENTER, TryCatch #1 {Exception -> 0x002f, blocks: (B:13:0x002b, B:25:0x0062, B:30:0x0075, B:31:0x007e), top: B:52:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzm(long j, yje yjeVar) throws zzbd {
        zzdw zzdwVar;
        zzec zzecVar;
        Exception e;
        long j2;
        zzbd zzbdVar;
        zzbd zzbdVar2;
        long jLongValue;
        if (yjeVar instanceof zzdw) {
            zzdwVar = (zzdw) yjeVar;
            int i = zzdwVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdwVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzdwVar = new zzdw(this, yjeVar);
            }
        } else {
            zzdwVar = new zzdw(this, yjeVar);
        }
        Object objZzl = zzdwVar.zzb;
        wne wneVar = wne.f39444a;
        int i2 = zzdwVar.zzd;
        try {
            if (i2 == 0) {
                z1x.P(objZzl);
                zzdwVar.zze = this;
                zzdwVar.zza = j;
                zzdwVar.zzd = 1;
                if (zzn(j, zzdwVar) != wneVar) {
                }
                return wneVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = zzdwVar.zza;
                zzecVar = zzdwVar.zze;
                try {
                    z1x.P(objZzl);
                    jLongValue = j2 - ((Number) objZzl).longValue();
                    if (jLongValue >= 500) {
                        return new Long(jLongValue);
                    }
                    throw new zzbd(zzbb.zzc, zzba.zzar, null);
                } catch (Exception e2) {
                    e = e2;
                    zzbdVar = e instanceof zzbd ? (zzbd) e : null;
                    if (zzbdVar == null) {
                        zzbdVar = new zzbd(zzbb.zzc, zzba.zzar, e.getMessage());
                    }
                    if (Intrinsics.d(zzecVar.zzf, zzcm.zzd)) {
                    }
                    throw zzbdVar2;
                }
            }
            j = zzdwVar.zza;
            this = zzdwVar.zze;
            z1x.P(objZzl);
            zzdy zzdyVar = new zzdy(j, this, null);
            zzdwVar.zze = this;
            zzdwVar.zza = j;
            zzdwVar.zzd = 2;
            objZzl = this.zzl(zzdyVar, zzdwVar);
            if (objZzl != wneVar) {
                zzecVar = this;
                j2 = j;
                jLongValue = j2 - ((Number) objZzl).longValue();
                if (jLongValue >= 500) {
                    return new Long(jLongValue);
                }
                throw new zzbd(zzbb.zzc, zzba.zzar, null);
            }
            return wneVar;
        } catch (Exception e3) {
            zzecVar = this;
            e = e3;
            if (e instanceof zzbd) {
            }
            if (zzbdVar == null) {
                zzbdVar = new zzbd(zzbb.zzc, zzba.zzar, e.getMessage());
            }
            if ((!Intrinsics.d(zzecVar.zzf, zzcm.zzd) || Intrinsics.d(zzecVar.zzf, zzcm.zzc)) && (zzbdVar2 = zzecVar.zzd) != null) {
                throw zzbdVar2;
            }
            throw zzbdVar;
        }
    }

    private final Object zzn(long j, yje yjeVar) {
        if (Intrinsics.d(this.zzf, zzcm.zzb) || Intrinsics.d(this.zzf, zzcm.zzc)) {
            return Unit.f46060a;
        }
        if (Intrinsics.d(this.zzf, zzcm.zzd) && !zzo(this.zzd)) {
            return Unit.f46060a;
        }
        this.zzf = zzcm.zzc;
        odd oddVar = new odd();
        this.zzc = oddVar;
        qjj.W(this.zzg.zza(), null, null, new zzeb(this, oddVar, j, null), 3);
        return Unit.f46060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzo(Exception exc) {
        if (!(exc instanceof zzbd)) {
            return true;
        }
        zzbd zzbdVar = (zzbd) exc;
        return (Intrinsics.d(zzbdVar.zzb(), zzbb.zzd) || Intrinsics.d(zzbdVar.zzb(), zzbb.zze) || Intrinsics.d(zzbdVar.zzb(), zzbb.zzf)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j, yje yjeVar) throws zzbd {
        zzdu zzduVar;
        String str2;
        RecaptchaAction recaptchaAction2;
        Object objZzm;
        zzec zzecVar;
        RecaptchaAction recaptchaAction3;
        String str3;
        double d;
        zzsc zzscVar;
        String str4;
        zzec zzecVar2;
        zzec zzecVar3 = this;
        if (yjeVar instanceof zzdu) {
            zzduVar = (zzdu) yjeVar;
            int i = zzduVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzduVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzduVar = new zzdu(zzecVar3, yjeVar);
            }
        } else {
            zzduVar = new zzdu(zzecVar3, yjeVar);
        }
        Object objZzm2 = zzduVar.zzb;
        wne wneVar = wne.f39444a;
        int i2 = zzduVar.zzd;
        try {
            if (i2 == 0) {
                z1x.P(objZzm2);
                zzduVar.zze = zzecVar3;
                str2 = str;
                zzduVar.zzf = str2;
                recaptchaAction2 = recaptchaAction;
                zzduVar.zzg = recaptchaAction2;
                zzduVar.zzd = 1;
                objZzm = zzecVar3.zzm(j, zzduVar);
                if (objZzm == wneVar) {
                }
                return wneVar;
            }
            if (i2 == 1) {
                RecaptchaAction recaptchaAction4 = zzduVar.zzg;
                String str5 = zzduVar.zzf;
                zzec zzecVar4 = zzduVar.zze;
                z1x.P(objZzm2);
                recaptchaAction2 = recaptchaAction4;
                zzecVar3 = zzecVar4;
                objZzm = objZzm2;
                str2 = str5;
            } else {
                if (i2 == 2) {
                    d = zzduVar.zza;
                    recaptchaAction3 = zzduVar.zzg;
                    str3 = zzduVar.zzf;
                    zzecVar = zzduVar.zze;
                    z1x.P(objZzm2);
                    zzsi zzsiVar = (zzsi) objZzm2;
                    zzdt zzdtVar = zzecVar.zza;
                    zzscVar = zzecVar.zze;
                    if (zzscVar == null) {
                        zzscVar = null;
                    }
                    zzsp zzspVarZzi = zzdtVar.zzi(recaptchaAction3, zzsiVar, zzscVar);
                    zzduVar.zze = zzecVar;
                    zzduVar.zzf = str3;
                    zzduVar.zzg = null;
                    zzduVar.zzd = 3;
                    String str6 = str3;
                    objZzm2 = zzecVar.zza.zzm(zzspVarZzi, str6, (long) d, zzduVar);
                    str4 = str6;
                    if (objZzm2 != wneVar) {
                        zzecVar2 = zzecVar;
                    }
                    return wneVar;
                }
                if (i2 != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str4 = zzduVar.zzf;
                zzecVar2 = zzduVar.zze;
                z1x.P(objZzm2);
            }
            zzsr zzsrVar = (zzsr) objZzm2;
            zzecVar2.zza.zzq(str4, zzsrVar);
            return zzsrVar.zzj();
            double dLongValue = ((Number) objZzm).longValue();
            zzdt zzdtVar2 = zzecVar3.zza;
            double d2 = 0.45d * dLongValue;
            zzduVar.zze = zzecVar3;
            zzduVar.zzf = str2;
            zzduVar.zzg = recaptchaAction2;
            double d3 = dLongValue * 0.55d;
            zzduVar.zza = d3;
            zzduVar.zzd = 2;
            Object objZzl = zzdtVar2.zzl(str2, (long) d2, zzduVar);
            if (objZzl != wneVar) {
                zzecVar = zzecVar3;
                recaptchaAction3 = recaptchaAction2;
                str3 = str2;
                objZzm2 = objZzl;
                d = d3;
                zzsi zzsiVar2 = (zzsi) objZzm2;
                zzdt zzdtVar3 = zzecVar.zza;
                zzscVar = zzecVar.zze;
                if (zzscVar == null) {
                    zzscVar = null;
                }
                zzsp zzspVarZzi2 = zzdtVar3.zzi(recaptchaAction3, zzsiVar2, zzscVar);
                zzduVar.zze = zzecVar;
                zzduVar.zzf = str3;
                zzduVar.zzg = null;
                zzduVar.zzd = 3;
                String str7 = str3;
                objZzm2 = zzecVar.zza.zzm(zzspVarZzi2, str7, (long) d, zzduVar);
                str4 = str7;
                if (objZzm2 != wneVar) {
                    zzecVar2 = zzecVar;
                    zzsr zzsrVar2 = (zzsr) objZzm2;
                    zzecVar2.zza.zzq(str4, zzsrVar2);
                    return zzsrVar2.zzj();
                }
            }
            return wneVar;
        } catch (zzbd e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzb, zzba.zzay, e2.getMessage());
        }
    }

    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zzb(long j, yje yjeVar) {
        Object objZzn = zzn(j, yjeVar);
        return objZzn == wne.f39444a ? objZzn : Unit.f46060a;
    }
}
