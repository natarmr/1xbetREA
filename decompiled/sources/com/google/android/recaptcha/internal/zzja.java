package com.google.android.recaptcha.internal;

import a.a8z;
import a.gmq0;
import a.jf4;
import a.maz;
import a.ndd;
import a.odd;
import a.qjj;
import a.wne;
import a.yje;
import a.z1x;
import android.app.Application;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zzja extends zze {
    public ndd zza;
    public zzfo zzb;
    private final zzek zzc;
    private zzsc zzf;
    private final zzek zzj;
    private final a8z zzk;
    private final a8z zzl;
    private final a8z zzm;
    private final a8z zzn;
    private final a8z zzo;
    private zzen zzp;
    private final zzbi zzq;
    private final Map zzd = zzjb.zza();
    private final Map zze = new LinkedHashMap();
    private final zzcb zzg = new zzcb(zzje.zza);
    private final zzjh zzh = zzjh.zzc();
    private final zzij zzi = new zzij(this);

    public zzja(zzek zzekVar, zzbi zzbiVar) {
        this.zzc = zzekVar;
        this.zzq = zzbiVar;
        zzek zzekVarZza = zzekVar.zza();
        zzekVarZza.zzc(zzekVar.zzd());
        this.zzj = zzekVarZza;
        int i = zzav.zza;
        this.zzk = maz.b(zzis.zza);
        this.zzl = maz.b(zzit.zza);
        this.zzm = maz.b(zziu.zza);
        this.zzn = maz.b(zziv.zza);
        this.zzo = maz.b(zziw.zza);
    }

    private final Application zzD() {
        return (Application) this.zzo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzE(zzsc zzscVar, yje yjeVar) {
        zzim zzimVar;
        if (yjeVar instanceof zzim) {
            zzimVar = (zzim) yjeVar;
            int i = zzimVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzimVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzimVar = new zzim(this, yjeVar);
            }
        } else {
            zzimVar = new zzim(this, yjeVar);
        }
        Object objZzd = zzimVar.zza;
        wne wneVar = wne.f39444a;
        int i2 = zzimVar.zzc;
        try {
            if (i2 == 0) {
                z1x.P(objZzd);
                zzff zzffVar = (zzff) this.zzn.getValue();
                zzek zzekVar = this.zzj;
                zzimVar.zzd = this;
                zzimVar.zzc = 1;
                objZzd = zzffVar.zzd(zzscVar, zzekVar, zzimVar);
                if (objZzd == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = zzimVar.zzd;
                z1x.P(objZzd);
            }
            qjj.W(this.zzq.zzb(), null, null, new zzin(this, (String) objZzd, null), 3);
        } catch (zzbd e) {
            ((odd) this.zzA()).b0(e);
        }
        return Unit.f46060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzF(String str, yje yjeVar) {
        zzio zzioVar;
        String str2;
        Exception exc;
        zzja zzjaVar;
        zzbd zzbdVar;
        zzen zzenVar;
        if (yjeVar instanceof zzio) {
            zzioVar = (zzio) yjeVar;
            int i = zzioVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzioVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzioVar = new zzio(this, yjeVar);
            }
        } else {
            zzioVar = new zzio(this, yjeVar);
        }
        Object obj = zzioVar.zza;
        wne wneVar = wne.f39444a;
        int i2 = zzioVar.zzc;
        if (i2 == 0) {
            z1x.P(obj);
            this.zzp = this.zzj.zzf(26);
            try {
                String strZza = ((zzbr) this.zzl.getValue()).zza();
                zzioVar.zzd = this;
                zzioVar.zze = str;
                zzioVar.zzf = strZza;
                zzioVar.zzc = 1;
                Object objZzw = zzw(zzioVar);
                if (objZzw == wneVar) {
                    return wneVar;
                }
                str2 = strZza;
                obj = objZzw;
            } catch (Exception e) {
                zzjaVar = this;
                exc = e;
                zzbdVar = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                zzenVar = zzjaVar.zzp;
                if (zzenVar != null) {
                    zzenVar.zzb(zzbdVar);
                }
                zzjaVar.zzp = null;
                ((odd) zzjaVar.zzA()).b0(zzbdVar);
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str3 = zzioVar.zzf;
            str = zzioVar.zze;
            zzjaVar = zzioVar.zzd;
            try {
                z1x.P(obj);
                str2 = str3;
                this = zzjaVar;
            } catch (Exception e2) {
                exc = e2;
                zzbdVar = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                zzenVar = zzjaVar.zzp;
                if (zzenVar != null) {
                    zzenVar.zzb(zzbdVar);
                }
                zzjaVar.zzp = null;
                ((odd) zzjaVar.zzA()).b0(zzbdVar);
            }
        }
        ((WebView) obj).loadDataWithBaseURL(str2, str, "text/html", "utf-8", null);
        return Unit.f46060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzG(String str, yje yjeVar) {
        zzix zzixVar;
        zzja zzjaVar;
        String str2;
        if (yjeVar instanceof zzix) {
            zzixVar = (zzix) yjeVar;
            int i = zzixVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzixVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzixVar = new zzix(this, yjeVar);
            }
        } else {
            zzixVar = new zzix(this, yjeVar);
        }
        Object objZzb = zzixVar.zza;
        wne wneVar = wne.f39444a;
        int i2 = zzixVar.zzc;
        if (i2 == 0) {
            z1x.P(objZzb);
            zzcb zzcbVar = this.zzg;
            zzje[] zzjeVarArr = {zzje.zzd, zzje.zzc, zzje.zzb};
            zzixVar.zzd = this;
            zzixVar.zze = str;
            zzixVar.zzc = 1;
            objZzb = zzcbVar.zzb(zzjeVarArr, zzixVar);
            if (objZzb != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            str = zzixVar.zze;
            this = zzixVar.zzd;
            z1x.P(objZzb);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = zzixVar.zze;
            zzjaVar = zzixVar.zzd;
            z1x.P(objZzb);
        }
        zzjaVar.zza = new odd();
        zzek zzekVar = zzjaVar.zzj;
        zzekVar.zzc(str2);
        qjj.W(zzjaVar.zzq.zza(), null, null, new zziz(zzjaVar, zzekVar.zzf(42), null), 3);
        return Unit.f46060a;
        if (((Boolean) objZzb).booleanValue()) {
            return Unit.f46060a;
        }
        zzcb zzcbVar2 = this.zzg;
        zzje zzjeVar = zzje.zzb;
        zzixVar.zzd = this;
        zzixVar.zze = str;
        zzixVar.zzc = 2;
        if (zzcbVar2.zzc(zzjeVar, zzixVar) != wneVar) {
            String str3 = str;
            zzjaVar = this;
            str2 = str3;
            zzjaVar.zza = new odd();
            zzek zzekVar2 = zzjaVar.zzj;
            zzekVar2.zzc(str2);
            qjj.W(zzjaVar.zzq.zza(), null, null, new zziz(zzjaVar, zzekVar2.zzf(42), null), 3);
            return Unit.f46060a;
        }
        return wneVar;
    }

    public static final /* synthetic */ zzfk zzp(zzja zzjaVar) {
        return (zzfk) zzjaVar.zzm.getValue();
    }

    public final ndd zzA() {
        ndd nddVar = this.zza;
        if (nddVar != null) {
            return nddVar;
        }
        return null;
    }

    public final zzft zzC(zzsc zzscVar, zzcg zzcgVar, WebView webView) {
        zzfw zzfwVar = new zzfw(webView, this.zzq.zzb());
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(CollectionsKt.M0(zzscVar.zzP()));
        zzgf zzgfVar = new zzgf(zzfwVar, zzcgVar, new zzbo());
        zzhz zzhzVar = new zzhz(zzhyVar, new zzhw());
        zzgfVar.zze(3, zzD());
        zzgfVar.zze(5, zzig.zza());
        zzgfVar.zze(6, new zzia(zzD()));
        zzgfVar.zze(7, new zzic());
        zzgfVar.zze(8, new zzii(zzD()));
        zzgfVar.zze(9, new zzid(zzD()));
        zzgfVar.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgfVar, zzhzVar, zzfn.zza());
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zza(String str) {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(str);
        return zzekVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zzb() {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzd(String str, yje yjeVar) {
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        return zzshVarZzf.zzk();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6 A[Catch: Exception -> 0x0039, PHI: r10 r11
  0x00b6: PHI (r10v11 ??) = (r10v25 ??), (r10v26 ??), (r10v27 ??) binds: [B:38:0x00a8, B:40:0x00b4, B:25:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00b6: PHI (r11v9 ??) = (r11v21 ??), (r11v22 ??), (r11v23 ??) binds: [B:38:0x00a8, B:40:0x00b4, B:25:0x004b] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {Exception -> 0x0039, blocks: (B:16:0x0034, B:45:0x0107, B:23:0x0046, B:43:0x00c8, B:41:0x00b6), top: B:53:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8 A[Catch: Exception -> 0x0039, PHI: r10 r11
  0x00c8: PHI (r10v12 ??) = (r10v23 ??), (r10v24 ??) binds: [B:42:0x00c6, B:23:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x00c8: PHI (r11v10 ??) = (r11v19 ??), (r11v20 ??) binds: [B:42:0x00c6, B:23:0x0046] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0039, blocks: (B:16:0x0034, B:45:0x0107, B:23:0x0046, B:43:0x00c8, B:41:0x00b6), top: B:53:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
    
        if (r12 != r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.recaptcha.internal.zzmx, com.google.android.recaptcha.internal.zzsh] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.google.android.recaptcha.internal.zzja] */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.google.android.recaptcha.internal.zzja] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.google.android.recaptcha.internal.zzja] */
    /* JADX WARN: Type inference failed for: r11v9, types: [com.google.android.recaptcha.internal.zzja] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.recaptcha.internal.zzmx, com.google.android.recaptcha.internal.zztp] */
    /* JADX WARN: Type inference failed for: r9v0 */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzf(java.lang.String r11, a.yje r12) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzf(java.lang.String, a.yje):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzg(zzbd zzbdVar, yje yjeVar) {
        if (Intrinsics.d(zzbdVar.zza(), zzba.zzb)) {
            zzen zzenVar = this.zzp;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            this.zzp = null;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (zzG(r7, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r6.zzc(r7, r0) == r1) goto L29;
     */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzh(com.google.android.recaptcha.internal.zzsc r7, a.yje r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzir
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzir r0 = (com.google.android.recaptcha.internal.zzir) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzir r0 = new com.google.android.recaptcha.internal.zzir
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            a.wne r1 = a.wne.f39444a
            int r2 = r0.zzc
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r8)
            goto L5b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L31:
            a.z1x.P(r8)
            goto L6d
        L35:
            a.z1x.P(r8)
            boolean r8 = r7.zzT()
            if (r8 == 0) goto L60
            boolean r8 = r7.zzR()
            if (r8 == 0) goto L60
            boolean r8 = r7.zzQ()
            if (r8 != 0) goto L4b
            goto L60
        L4b:
            r6.zzf = r7
            com.google.android.recaptcha.internal.zzek r7 = r6.zzc
            java.lang.String r7 = r7.zzd()
            r0.zzc = r4
            java.lang.Object r6 = r6.zzG(r7, r0)
            if (r6 == r1) goto L6c
        L5b:
            a.e0g0 r6 = a.j0g0.b
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        L60:
            com.google.android.recaptcha.internal.zzcb r6 = r6.zzg
            com.google.android.recaptcha.internal.zzje r7 = com.google.android.recaptcha.internal.zzje.zzd
            r0.zzc = r5
            java.lang.Object r6 = r6.zzc(r7, r0)
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            a.e0g0 r6 = a.j0g0.b
            com.google.android.recaptcha.internal.zzbd r6 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r7 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r8 = com.google.android.recaptcha.internal.zzba.zzav
            r6.<init>(r7, r8, r3)
            a.g0g0 r7 = new a.g0g0
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzh(com.google.android.recaptcha.internal.zzsc, a.yje):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzi(String str, long j, Exception exc, yje yjeVar) {
        exc.getMessage();
        ndd nddVar = (ndd) this.zze.remove(str);
        if (nddVar != null) {
            ((odd) nddVar).b0(exc);
        }
        return Unit.f46060a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzj(Exception exc, yje yjeVar) {
        return ((exc instanceof gmq0) && this.zzi.zza() == null) ? new zzbd(zzbb.zzc, zzba.zzH, null) : zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    public final zzcb zzm() {
        return this.zzg;
    }

    public final zzij zzq() {
        return this.zzi;
    }

    public final Object zzw(yje yjeVar) {
        return qjj.d0(this.zzq.zzb().getCoroutineContext(), new zzjc((zzjd) this.zzk.getValue(), zzD(), null), yjeVar);
    }

    public final Object zzx(yje yjeVar) {
        Object objD0 = qjj.d0(this.zzq.zzb().getCoroutineContext(), new zzil(this, null), yjeVar);
        return objD0 == wne.f39444a ? objD0 : Unit.f46060a;
    }
}
