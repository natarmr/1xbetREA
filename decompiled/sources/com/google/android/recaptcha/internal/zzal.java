package com.google.android.recaptcha.internal;

import a.bnn0;
import a.mie0;
import a.vne;
import a.yje;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzal extends bnn0 implements Function2 {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzan zzd;
    final /* synthetic */ zzen zze;
    final /* synthetic */ mie0 zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(zzan zzanVar, zzen zzenVar, mie0 mie0Var, yje yjeVar) {
        super(2, yjeVar);
        this.zzd = zzanVar;
        this.zze = zzenVar;
        this.zzf = mie0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzal(this.zzd, this.zze, this.zzf, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r8 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        if (a.qcc.O(r4, r7) != r0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:13:0x0022). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007c -> B:6:0x0011). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Exception {
        /*
            r7 = this;
            a.wne r0 = a.wne.f39444a
            int r1 = r7.zzc
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L14
            boolean r1 = r7.zzb
            long r4 = r7.zza
            a.z1x.P(r8)
        L11:
            r8 = r1
            goto L7f
        L14:
            long r4 = r7.zza
            a.z1x.P(r8)     // Catch: java.lang.Exception -> L1a
            goto L30
        L1a:
            r8 = move-exception
            goto L4b
        L1c:
            a.z1x.P(r8)
            r4 = 1000(0x3e8, double:4.94E-321)
            r8 = r3
        L22:
            if (r8 == 0) goto L83
            com.google.android.recaptcha.internal.zzan r8 = r7.zzd     // Catch: java.lang.Exception -> L1a
            r7.zza = r4     // Catch: java.lang.Exception -> L1a
            r7.zzc = r3     // Catch: java.lang.Exception -> L1a
            java.lang.Object r8 = com.google.android.recaptcha.internal.zzan.zza(r8, r7)     // Catch: java.lang.Exception -> L1a
            if (r8 == r0) goto L81
        L30:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r8     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzan r1 = r7.zzd     // Catch: java.lang.Exception -> L1a
            a.ndd r1 = r1.zzf()     // Catch: java.lang.Exception -> L1a
            a.odd r1 = (a.odd) r1     // Catch: java.lang.Exception -> L1a
            r1.N(r8)     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzan r8 = r7.zzd     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzao r1 = com.google.android.recaptcha.internal.zzao.zzc     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzan.zzh(r8, r1)     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzen r8 = r7.zze     // Catch: java.lang.Exception -> L1a
            r8.zza()     // Catch: java.lang.Exception -> L1a
            r8 = r2
            goto L22
        L4b:
            a.mie0 r1 = r7.zzf
            r1.f21842a = r8
            boolean r1 = r8 instanceof com.google.android.play.core.integrity.StandardIntegrityException
            if (r1 == 0) goto L6c
            r1 = r8
            com.google.android.play.core.integrity.StandardIntegrityException r1 = (com.google.android.play.core.integrity.StandardIntegrityException) r1
            int r1 = r1.getErrorCode()
            r6 = -100
            if (r1 == r6) goto L6e
            r6 = -18
            if (r1 == r6) goto L6e
            r6 = -12
            if (r1 == r6) goto L6e
            r6 = -8
            if (r1 == r6) goto L6e
            r6 = -3
            if (r1 == r6) goto L6e
        L6c:
            r1 = r2
            goto L6f
        L6e:
            r1 = r3
        L6f:
            if (r1 == 0) goto L82
            r7.zza = r4
            r7.zzb = r3
            r8 = 2
            r7.zzc = r8
            java.lang.Object r8 = a.qcc.O(r4, r7)
            if (r8 == r0) goto L81
            goto L11
        L7f:
            long r4 = r4 + r4
            goto L22
        L81:
            return r0
        L82:
            throw r8
        L83:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzal.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
