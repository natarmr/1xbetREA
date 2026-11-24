package com.google.android.recaptcha.internal;

import a.e0g0;
import a.j0g0;
import a.jf4;
import a.qjj;
import a.wne;
import a.yje;
import a.z1x;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.UUID;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdc implements RecaptchaClient, RecaptchaTasksClient {
    private static final Regex zza = new Regex("^[a-zA-Z0-9/_]{0,100}$");
    private final zzcn zzb;
    private final String zzc;
    private final zzek zzd;
    private final zzbi zze;

    public zzdc(zzcn zzcnVar, String str, zzbi zzbiVar, zzek zzekVar) {
        this.zzb = zzcnVar;
        this.zzc = str;
        this.zze = zzbiVar;
        this.zzd = zzekVar;
    }

    public static final /* synthetic */ void zze(zzdc zzdcVar, long j, RecaptchaAction recaptchaAction) throws zzbd {
        zzbd zzbdVar = !zza.g(recaptchaAction.getAction()) ? new zzbd(zzbb.zzg, zzba.zzh, null) : null;
        if (j < 5000) {
            zzbdVar = new zzbd(zzbb.zzb, zzba.zzI, null);
        }
        if (zzbdVar != null) {
            throw zzbdVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzf(RecaptchaAction recaptchaAction, long j, yje yjeVar) {
        zzcy zzcyVar;
        if (yjeVar instanceof zzcy) {
            zzcyVar = (zzcy) yjeVar;
            int i = zzcyVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcyVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzcyVar = new zzcy(this, yjeVar);
            }
        } else {
            zzcyVar = new zzcy(this, yjeVar);
        }
        Object objZzg = zzcyVar.zza;
        Object obj = wne.f39444a;
        int i2 = zzcyVar.zzc;
        try {
            if (i2 == 0) {
                z1x.P(objZzg);
                String string = UUID.randomUUID().toString();
                Function2 zzczVar = new zzcz(this, j, recaptchaAction, string, null);
                zzcyVar.zzc = 1;
                objZzg = zzg(string, zzczVar, zzcyVar);
                if (objZzg == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objZzg);
            }
            return ((j0g0) objZzg).f15681a;
        } catch (zzbd e) {
            e0g0 e0g0Var = j0g0.b;
            return z1x.C(e.zzc());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzg(String str, Function2 function2, yje yjeVar) throws zzbd {
        zzdb zzdbVar;
        Exception e;
        zzen zzenVar;
        zzbd e2;
        if (yjeVar instanceof zzdb) {
            zzdbVar = (zzdb) yjeVar;
            int i = zzdbVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdbVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdbVar = new zzdb(this, yjeVar);
            }
        } else {
            zzdbVar = new zzdb(this, yjeVar);
        }
        Object objInvoke = zzdbVar.zza;
        Object obj = wne.f39444a;
        int i2 = zzdbVar.zzc;
        if (i2 == 0) {
            z1x.P(objInvoke);
            zzek zzekVarZza = this.zzd.zza();
            zzekVarZza.zzc(str);
            zzen zzenVarZzf = zzekVarZza.zzf(9);
            try {
                zzdbVar.zzd = zzenVarZzf;
                zzdbVar.zzc = 1;
                objInvoke = function2.invoke(zzekVarZza, zzdbVar);
                if (objInvoke == obj) {
                    return obj;
                }
                zzenVar = zzenVarZzf;
            } catch (zzbd e3) {
                e2 = e3;
                zzenVar = zzenVarZzf;
                zzenVar.zzb(e2);
                throw e2;
            } catch (Exception e4) {
                e = e4;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzX, e.getMessage());
                zzenVar.zzb(zzbdVar);
                throw zzbdVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zzenVar = zzdbVar.zzd;
            try {
                z1x.P(objInvoke);
            } catch (zzbd e5) {
                e2 = e5;
                zzenVar.zzb(e2);
                throw e2;
            } catch (Exception e6) {
                e = e6;
                zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzX, e.getMessage());
                zzenVar.zzb(zzbdVar2);
                throw zzbdVar2;
            }
        }
        zzenVar.zza();
        return objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-0E7RQCE */
    public final Object mo24execute0E7RQCE(RecaptchaAction recaptchaAction, long j, yje<? super j0g0> yjeVar) {
        zzcw zzcwVar;
        if (yjeVar instanceof zzcw) {
            zzcwVar = (zzcw) yjeVar;
            int i = zzcwVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcwVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzcwVar = new zzcw(this, yjeVar);
            }
        } else {
            zzcwVar = new zzcw(this, yjeVar);
        }
        Object obj = zzcwVar.zza;
        Object obj2 = wne.f39444a;
        int i2 = zzcwVar.zzc;
        if (i2 == 0) {
            z1x.P(obj);
            zzcwVar.zzc = 1;
            Object objZzf = zzf(recaptchaAction, j, zzcwVar);
            return objZzf == obj2 ? obj2 : objZzf;
        }
        if (i2 == 1) {
            z1x.P(obj);
            return ((j0g0) obj).f15681a;
        }
        jf4.n("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-gIAlu-s */
    public final Object mo25executegIAlus(RecaptchaAction recaptchaAction, yje<? super j0g0> yjeVar) {
        zzcx zzcxVar;
        if (yjeVar instanceof zzcx) {
            zzcxVar = (zzcx) yjeVar;
            int i = zzcxVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcxVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzcxVar = new zzcx(this, yjeVar);
            }
        } else {
            zzcxVar = new zzcx(this, yjeVar);
        }
        Object obj = zzcxVar.zza;
        Object obj2 = wne.f39444a;
        int i2 = zzcxVar.zzc;
        if (i2 == 0) {
            z1x.P(obj);
            zzcxVar.zzc = 1;
            Object objMo24execute0E7RQCE = mo24execute0E7RQCE(recaptchaAction, 10000L, zzcxVar);
            return objMo24execute0E7RQCE == obj2 ? obj2 : objMo24execute0E7RQCE;
        }
        if (i2 == 1) {
            z1x.P(obj);
            return ((j0g0) obj).f15681a;
        }
        jf4.n("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzas.zza(qjj.M(this.zze.zzb(), null, new zzda(this, recaptchaAction, 10000L, null), 3));
    }

    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j) {
        return zzas.zza(qjj.M(this.zze.zzb(), null, new zzda(this, recaptchaAction, j, null), 3));
    }
}
