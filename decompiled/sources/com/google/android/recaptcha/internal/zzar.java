package com.google.android.recaptcha.internal;

import a.guy;
import a.jzj;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
final class zzar extends guy implements Function1 {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ jzj zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(TaskCompletionSource taskCompletionSource, jzj jzjVar) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = jzjVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable completionExceptionOrNull = this.zzb.getCompletionExceptionOrNull();
            TaskCompletionSource taskCompletionSource = this.zza;
            if (completionExceptionOrNull == null) {
                taskCompletionSource.setResult(this.zzb.getCompleted());
            } else {
                Exception runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource.setException(runtimeExecutionException);
            }
        }
        return Unit.f46060a;
    }
}
