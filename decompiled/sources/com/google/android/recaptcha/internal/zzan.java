package com.google.android.recaptcha.internal;

import a.i050;
import a.jf4;
import a.jzj;
import a.k050;
import a.ndd;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzan {
    public ndd zza;
    private final vne zzb;
    private final zzek zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzao zze = zzao.zza;
    private final i050 zzg = new k050();

    public zzan(Context context, vne vneVar, zzek zzekVar, StandardIntegrityManager standardIntegrityManager, long j) {
        this.zzb = vneVar;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzi(yje yjeVar) {
        zzag zzagVar;
        if (yjeVar instanceof zzag) {
            zzagVar = (zzag) yjeVar;
            int i = zzagVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzagVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzagVar = new zzag(this, yjeVar);
            }
        } else {
            zzagVar = new zzag(this, yjeVar);
        }
        Object obj = zzagVar.zza;
        wne wneVar = wne.f39444a;
        int i2 = zzagVar.zzc;
        if (i2 != 0) {
            if (i2 == 1) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        jzj jzjVarZza = zzbx.zza(this.zzd.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zzf).build()));
        zzagVar.zzc = 1;
        Object objAwait = jzjVarZza.await(zzagVar);
        return objAwait == wneVar ? wneVar : objAwait;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r8 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzj(java.lang.String r7, a.yje r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzah
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzah r0 = (com.google.android.recaptcha.internal.zzah) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzah r0 = new com.google.android.recaptcha.internal.zzah
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            a.wne r1 = a.wne.f39444a
            int r2 = r0.zzc
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r8)
            goto L6b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L31:
            java.lang.String r7 = r0.zzd
            a.z1x.P(r8)
            goto L4a
        L37:
            a.z1x.P(r8)
            a.ndd r6 = r6.zzf()
            r0.zzd = r7
            r0.zzc = r5
            a.odd r6 = (a.odd) r6
            java.lang.Object r8 = r6.q(r0)
            if (r8 == r1) goto L72
        L4a:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r8
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder()
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = r6.setRequestHash(r7)
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r6 = r6.build()
            com.google.android.gms.tasks.Task r6 = r8.request(r6)
            a.jzj r6 = com.google.android.recaptcha.internal.zzbx.zza(r6)
            r0.zzd = r3
            r0.zzc = r4
            java.lang.Object r8 = r6.await(r0)
            if (r8 != r1) goto L6b
            goto L72
        L6b:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken) r8
            java.lang.String r6 = r8.token()
            return r6
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzj(java.lang.String, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r10 != r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzc(java.lang.String r9, a.yje r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzaf
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.recaptcha.internal.zzaf r0 = (com.google.android.recaptcha.internal.zzaf) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzaf r0 = new com.google.android.recaptcha.internal.zzaf
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.zza
            a.wne r1 = a.wne.f39444a
            int r2 = r0.zzc
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L44
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            a.z1x.P(r10)
            goto L73
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r3
        L34:
            java.lang.String r8 = r0.zze
            com.google.android.recaptcha.internal.zzan r9 = r0.zzd
            a.z1x.P(r10)
            goto L67
        L3c:
            java.lang.String r9 = r0.zze
            com.google.android.recaptcha.internal.zzan r8 = r0.zzd
            a.z1x.P(r10)     // Catch: java.lang.Exception -> L57
            goto L54
        L44:
            a.z1x.P(r10)
            r0.zzd = r8     // Catch: java.lang.Exception -> L57
            r0.zze = r9     // Catch: java.lang.Exception -> L57
            r0.zzc = r6     // Catch: java.lang.Exception -> L57
            java.lang.Object r10 = r8.zzj(r9, r0)     // Catch: java.lang.Exception -> L57
            if (r10 != r1) goto L54
            goto L76
        L54:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L57
            return r10
        L57:
            r0.zzd = r8
            r0.zze = r9
            r0.zzc = r5
            java.lang.Object r10 = r8.zze(r0)
            if (r10 != r1) goto L64
            goto L76
        L64:
            r7 = r9
            r9 = r8
            r8 = r7
        L67:
            r0.zzd = r3
            r0.zze = r3
            r0.zzc = r4
            java.lang.Object r10 = r9.zzj(r8, r0)
            if (r10 == r1) goto L76
        L73:
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzc(java.lang.String, a.yje):java.lang.Object");
    }

    public final Object zzd(long j, yje yjeVar) {
        this.zzf = j;
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        if (kotlin.Unit.f46060a == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zze(a.yje r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.internal.zzak
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.recaptcha.internal.zzak r0 = (com.google.android.recaptcha.internal.zzak) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzak r0 = new com.google.android.recaptcha.internal.zzak
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.zzb
            a.wne r1 = a.wne.f39444a
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2c
            a.z1x.P(r12)
            goto Laf
        L2c:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            return r5
        L32:
            java.lang.Object r11 = r0.zza
            a.i050 r11 = (a.i050) r11
            com.google.android.recaptcha.internal.zzan r2 = r0.zze
            a.z1x.P(r12)
            r12 = r11
            r11 = r2
            goto L4f
        L3e:
            a.z1x.P(r12)
            a.i050 r12 = r11.zzg
            r0.zze = r11
            r0.zza = r12
            r0.zzd = r4
            java.lang.Object r2 = r12.d(r0)
            if (r2 == r1) goto Lb6
        L4f:
            com.google.android.recaptcha.internal.zzao r2 = r11.zze     // Catch: java.lang.Throwable -> L5f
            com.google.android.recaptcha.internal.zzao r6 = com.google.android.recaptcha.internal.zzao.zza     // Catch: java.lang.Throwable -> L5f
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r6)     // Catch: java.lang.Throwable -> L5f
            if (r2 != 0) goto L62
            kotlin.Unit r11 = kotlin.Unit.f46060a     // Catch: java.lang.Throwable -> L5f
            r12.c(r5)
            return r11
        L5f:
            r0 = move-exception
            r11 = r0
            goto Lb2
        L62:
            com.google.android.recaptcha.internal.zzao r2 = com.google.android.recaptcha.internal.zzao.zzb     // Catch: java.lang.Throwable -> L5f
            r11.zze = r2     // Catch: java.lang.Throwable -> L5f
            r12.c(r5)
            com.google.android.recaptcha.internal.zzek r12 = r11.zzc
            java.lang.String r2 = r12.zzd()
            r12.zzc(r2)
            r12.zzb(r3)
            r2 = 38
            com.google.android.recaptcha.internal.zzen r12 = r12.zzf(r2)
            a.odd r2 = new a.odd
            r2.<init>()
            r11.zza = r2
            a.vne r2 = r11.zzb
            com.google.android.recaptcha.internal.zzam r6 = new com.google.android.recaptcha.internal.zzam
            r6.<init>(r11, r12, r5)
            r12 = 3
            a.qjj.W(r2, r5, r5, r6, r12)
            r0.zze = r5
            r0.zza = r5
            r0.zzd = r3
            boolean r12 = r11.zzh
            if (r12 != 0) goto Laa
            java.util.Timer r5 = new java.util.Timer
            r5.<init>()
            com.google.android.recaptcha.internal.zzai r6 = new com.google.android.recaptcha.internal.zzai
            r6.<init>(r11)
            r7 = 28800000(0x1b77400, double:1.42290906E-316)
            r9 = r7
            r5.schedule(r6, r7, r9)
            r11.zzh = r4
        Laa:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            if (r11 != r1) goto Laf
            goto Lb6
        Laf:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        Lb2:
            r12.c(r5)
            throw r11
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zze(a.yje):java.lang.Object");
    }

    public final ndd zzf() {
        ndd nddVar = this.zza;
        if (nddVar != null) {
            return nddVar;
        }
        return null;
    }
}
