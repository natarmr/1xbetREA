package com.google.android.recaptcha;

import a.e0g0;
import a.g0g0;
import a.j0g0;
import a.jf4;
import a.lbk;
import a.wne;
import a.yje;
import a.z1x;
import android.app.Application;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.javax.sip.header.SubscriptionStateHeader;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;
import com.google.android.recaptcha.internal.zzdc;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u000bJ-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\f\u0010\u000fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0087@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/google/android/recaptcha/Recaptcha;", "", "<init>", "()V", "Landroid/app/Application;", SIPServerTransaction.CONTENT_TYPE_APPLICATION, "", "siteKey", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaTasksClient;", "fetchTaskClient", "(Landroid/app/Application;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;", "getTasksClient", "", SubscriptionStateHeader.TIMEOUT, "(Landroid/app/Application;Ljava/lang/String;J)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaClient;", "fetchClient", "(Landroid/app/Application;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/j0g0;", "getClient-BWLJW6A", "(Landroid/app/Application;Ljava/lang/String;JLa/yje;)Ljava/lang/Object;", "getClient", "java.com.google.android.libraries.abuse.recaptcha.enterprise_enterprise"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String siteKey) {
        return zzcq.zze(application, siteKey);
    }

    /* JADX INFO: renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m22getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j, yje yjeVar, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 10000;
        }
        return recaptcha.m23getClientBWLJW6A(application, str, j, yjeVar);
    }

    @lbk
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String siteKey) {
        return zzcq.zzc(application, siteKey, 10000L);
    }

    public final Object fetchClient(Application application, String str, yje<? super RecaptchaClient> yjeVar) {
        return zzcq.zzd(application, str, yjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @lbk
    /* JADX INFO: renamed from: getClient-BWLJW6A, reason: not valid java name */
    public final Object m23getClientBWLJW6A(Application application, String str, long j, yje<? super j0g0> yjeVar) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        if (yjeVar instanceof Recaptcha$getClient$1) {
            recaptcha$getClient$1 = (Recaptcha$getClient$1) yjeVar;
            int i = recaptcha$getClient$1.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                recaptcha$getClient$1.zzc = i - Integer.MIN_VALUE;
            } else {
                recaptcha$getClient$1 = new Recaptcha$getClient$1(this, yjeVar);
            }
        } else {
            recaptcha$getClient$1 = new Recaptcha$getClient$1(this, yjeVar);
        }
        Object objZzb = recaptcha$getClient$1.zza;
        wne wneVar = wne.f39444a;
        int i2 = recaptcha$getClient$1.zzc;
        try {
            if (i2 == 0) {
                z1x.P(objZzb);
                e0g0 e0g0Var = j0g0.b;
                recaptcha$getClient$1.zzc = 1;
                objZzb = zzcq.zzb(application, str, j, recaptcha$getClient$1);
                if (objZzb == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objZzb);
            }
            zzdc zzdcVar = (zzdc) objZzb;
            e0g0 e0g0Var2 = j0g0.b;
            return zzdcVar;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            return new g0g0(th);
        }
    }

    @lbk
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String siteKey, long timeout) {
        return zzcq.zzc(application, siteKey, timeout);
    }
}
