package com.google.android.recaptcha.internal;

import a.a8z;
import a.gmq0;
import a.j0g0;
import a.jf4;
import a.maz;
import a.msm0;
import a.pgi0;
import a.qjj;
import a.r3d;
import a.wne;
import a.wp20;
import a.yje;
import a.z1x;
import a.zvw;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdt {
    private final String zza;
    private final zzek zzb;
    private final zzl zzc;
    private final a8z zzd;
    private final a8z zze;
    private final a8z zzf;
    private final a8z zzg;
    private final a8z zzh;
    private final zzbi zzi;

    public zzdt(String str, zzbi zzbiVar, zzek zzekVar, zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i = zzav.zza;
        this.zzd = maz.b(zzdm.zza);
        this.zze = maz.b(zzdn.zza);
        this.zzf = maz.b(zzdo.zza);
        this.zzg = maz.b(zzdp.zza);
        this.zzh = maz.b(zzdq.zza);
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) zzdtVar.zze.getValue();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) zzdtVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) zzdtVar.zzg.getValue();
    }

    public static final Object zzj(zzdt zzdtVar, yje yjeVar) {
        return qjj.d0(zzdtVar.zzi.zza().getCoroutineContext(), new zzdh(zzdtVar, null), yjeVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbdVar) {
        return !zzx() ? new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage()) : zzbdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zzekVarZza = this.zzb.zza();
        zzekVarZza.zzc(str);
        return zzekVarZza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object zzv(zzsc zzscVar, long j, yje yjeVar) throws Throwable {
        zzdj zzdjVar;
        Object objZzc;
        if (yjeVar instanceof zzdj) {
            zzdjVar = (zzdj) yjeVar;
            int i = zzdjVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdjVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzdjVar = new zzdj(this, yjeVar);
            }
        } else {
            zzdjVar = new zzdj(this, yjeVar);
        }
        zzdj zzdjVar2 = zzdjVar;
        Object obj = zzdjVar2.zzb;
        wne wneVar = wne.f39444a;
        int i2 = zzdjVar2.zzd;
        if (i2 == 0) {
            z1x.P(obj);
            zzy(zzscVar.zzO());
            Iterator it = zzw().iterator();
            while (it.hasNext()) {
                this.zzc.zzf((zze) it.next());
            }
            zzl zzlVar = this.zzc;
            zzek zzekVar = this.zzb;
            zzdjVar2.zza = this;
            zzdjVar2.zzd = 1;
            objZzc = zzlVar.zzc(j, zzscVar, zzekVar, zzdjVar2);
            if (objZzc != wneVar) {
            }
            return wneVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Throwable th = (Throwable) zzdjVar2.zza;
            z1x.P(obj);
            throw th;
        }
        this = (zzdt) zzdjVar2.zza;
        z1x.P(obj);
        objZzc = ((j0g0) obj).f15681a;
        Throwable thA = j0g0.a(objZzc);
        if (thA == null) {
            return Unit.f46060a;
        }
        zvw.I(this.zzi.zzd().getCoroutineContext());
        List listT = pgi0.t(zvw.R(this.zzi.zzd().getCoroutineContext()).getChildren());
        zzdjVar2.zza = thA;
        zzdjVar2.zzd = 2;
        if (qjj.T(listT, zzdjVar2) != wneVar) {
            throw thA;
        }
        return wneVar;
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return CollectionsKt.L0(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i = zzav.zza;
        try {
            Object systemService = zzr().getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(16)) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) throws zzbd {
        try {
            zzrv zzrvVarZzj = zzrv.zzj(zzbt.zza(str));
            int i = zzav.zza;
            ((zzfu) maz.b(zzde.zza).getValue()).zza(zzrvVarZzj);
        } catch (Exception e) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e.getMessage());
        }
    }

    public final zzsp zzi(RecaptchaAction recaptchaAction, zzsi zzsiVar, zzsc zzscVar) {
        zzso zzsoVarZzf = zzsp.zzf();
        zzsoVarZzf.zzs(this.zza);
        zzsoVarZzf.zze(recaptchaAction.getAction());
        zzsoVarZzf.zzf(zzscVar.zzN());
        zzsoVarZzf.zzq(zzscVar.zzM());
        zzsoVarZzf.zzr(zzsiVar);
        return (zzsp) zzsoVarZzf.zzk();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzl(String str, long j, yje yjeVar) throws zzbd {
        zzdd zzddVar;
        Exception e;
        zzen zzenVar;
        zzbd e2;
        gmq0 e3;
        if (yjeVar instanceof zzdd) {
            zzddVar = (zzdd) yjeVar;
            int i = zzddVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzddVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzddVar = new zzdd(this, yjeVar);
            }
        } else {
            zzddVar = new zzdd(this, yjeVar);
        }
        Object obj = zzddVar.zza;
        wne wneVar = wne.f39444a;
        int i2 = zzddVar.zzc;
        if (i2 == 0) {
            z1x.P(obj);
            zzen zzenVarZzf = zzu(str).zzf(27);
            try {
                zzl zzlVar = this.zzc;
                zzddVar.zzd = zzenVarZzf;
                zzddVar.zzc = 1;
                Object objZzb = zzlVar.zzb(str, j, zzddVar);
                if (objZzb == wneVar) {
                    return wneVar;
                }
                obj = objZzb;
                zzenVar = zzenVarZzf;
            } catch (gmq0 e4) {
                e3 = e4;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzb, e3.getMessage());
                zzenVar.zzb(zzbdVar);
                throw zzbdVar;
            } catch (zzbd e5) {
                e2 = e5;
                zzenVar = zzenVarZzf;
                zzenVar.zzb(e2);
                throw e2;
            } catch (Exception e6) {
                e = e6;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzaa, e.getMessage());
                zzenVar.zzb(zzbdVar2);
                throw zzbdVar2;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zzenVar = zzddVar.zzd;
            try {
                z1x.P(obj);
            } catch (gmq0 e7) {
                e3 = e7;
                zzbd zzbdVar3 = new zzbd(zzbb.zzb, zzba.zzb, e3.getMessage());
                zzenVar.zzb(zzbdVar3);
                throw zzbdVar3;
            } catch (zzbd e8) {
                e2 = e8;
                zzenVar.zzb(e2);
                throw e2;
            } catch (Exception e9) {
                e = e9;
                zzbd zzbdVar4 = new zzbd(zzbb.zzb, zzba.zzaa, e.getMessage());
                zzenVar.zzb(zzbdVar4);
                throw zzbdVar4;
            }
        }
        zzsi zzsiVar = (zzsi) obj;
        zzenVar.zza();
        return zzsiVar;
    }

    public final Object zzm(zzsp zzspVar, String str, long j, yje yjeVar) {
        return qjj.d0(this.zzi.zza().getCoroutineContext(), new zzdg(this, str, j, zzspVar, null), yjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzn(zzsc zzscVar, long j, yje yjeVar) throws zzbd {
        zzdk zzdkVar;
        if (yjeVar instanceof zzdk) {
            zzdkVar = (zzdk) yjeVar;
            int i = zzdkVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdkVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdkVar = new zzdk(this, yjeVar);
            }
        } else {
            zzdkVar = new zzdk(this, yjeVar);
        }
        Object obj = zzdkVar.zza;
        wne wneVar = wne.f39444a;
        int i2 = zzdkVar.zzc;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                zzdl zzdlVar = new zzdl(this, zzscVar, j, null);
                zzdkVar.zzc = 1;
                if (msm0.t(j, zzdlVar, zzdkVar) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            return Unit.f46060a;
        } catch (gmq0 e) {
            throw new zzbd(zzbb.zzb, zzba.zzb, e.getMessage());
        } catch (zzbd e2) {
            throw e2;
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzb, zzba.zzap, e3.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzo(long j, yje yjeVar) throws zzbd {
        zzdr zzdrVar;
        zzen zzenVarZzf;
        Exception e;
        zzdt zzdtVar;
        zzen zzenVar;
        zzbd e2;
        gmq0 e3;
        if (yjeVar instanceof zzdr) {
            zzdrVar = (zzdr) yjeVar;
            int i = zzdrVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdrVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdrVar = new zzdr(this, yjeVar);
            }
        } else {
            zzdrVar = new zzdr(this, yjeVar);
        }
        Object obj = zzdrVar.zza;
        wne wneVar = wne.f39444a;
        int i2 = zzdrVar.zzc;
        if (i2 == 0) {
            z1x.P(obj);
            zzenVarZzf = this.zzb.zzf(22);
            try {
                zzds zzdsVar = new zzds(this, zzenVarZzf, null);
                zzdrVar.zzd = this;
                zzdrVar.zze = zzenVarZzf;
                zzdrVar.zzc = 1;
                Object objT = msm0.t(j, zzdsVar, zzdrVar);
                if (objT == wneVar) {
                    return wneVar;
                }
                zzdtVar = this;
                zzenVar = zzenVarZzf;
                obj = objT;
            } catch (gmq0 e4) {
                e3 = e4;
                zzdtVar = this;
                zzenVar = zzenVarZzf;
                zzbd zzbdVarZzs = zzdtVar.zzs(e3, new zzbd(zzbb.zzc, zzba.zzb, e3.getMessage()));
                zzenVar.zzb(zzbdVarZzs);
                throw zzbdVarZzs;
            } catch (zzbd e5) {
                e2 = e5;
                if (Intrinsics.d(e2.zzb(), zzbb.zzc)) {
                    e2 = this.zzs(e2, e2);
                }
                zzenVarZzf.zzb(e2);
                throw e2;
            } catch (Exception e6) {
                e = e6;
                zzdtVar = this;
                zzenVar = zzenVarZzf;
                zzbd zzbdVarZzs2 = zzdtVar.zzs(e, new zzbd(zzbb.zzc, zzba.zzaw, e.getMessage()));
                zzenVar.zzb(zzbdVarZzs2);
                throw zzbdVarZzs2;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zzenVar = zzdrVar.zze;
            zzdtVar = zzdrVar.zzd;
            try {
                z1x.P(obj);
            } catch (gmq0 e7) {
                e3 = e7;
                zzbd zzbdVarZzs3 = zzdtVar.zzs(e3, new zzbd(zzbb.zzc, zzba.zzb, e3.getMessage()));
                zzenVar.zzb(zzbdVarZzs3);
                throw zzbdVarZzs3;
            } catch (zzbd e8) {
                e2 = e8;
                zzenVarZzf = zzenVar;
                this = zzdtVar;
                if (Intrinsics.d(e2.zzb(), zzbb.zzc)) {
                    e2 = this.zzs(e2, e2);
                }
                zzenVarZzf.zzb(e2);
                throw e2;
            } catch (Exception e9) {
                e = e9;
                zzbd zzbdVarZzs4 = zzdtVar.zzs(e, new zzbd(zzbb.zzc, zzba.zzaw, e.getMessage()));
                zzenVar.zzb(zzbdVarZzs4);
                throw zzbdVarZzs4;
            }
        }
        return (zzsc) obj;
    }

    public final void zzq(String str, zzsr zzsrVar) {
        zzen zzenVarZzf = zzu(str).zzf(29);
        try {
            List<zzst> listZzk = zzsrVar.zzk();
            int iA = wp20.a(r3d.q(listZzk, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (zzst zzstVar : listZzk) {
                linkedHashMap.put(zzstVar.zzg(), zzstVar.zzi());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzenVarZzf.zza();
        } catch (zzbd e) {
            zzenVarZzf.zzb(e);
        } catch (Exception e2) {
            zzenVarZzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e2.getMessage()));
        }
    }
}
