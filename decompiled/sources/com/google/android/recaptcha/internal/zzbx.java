package com.google.android.recaptcha.internal;

import a.bby;
import a.jzj;
import a.odd;
import a.pby;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbx {
    public static final jzj zza(Task task) {
        final odd oddVar = new odd();
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                bby bbyVar = oddVar;
                Exception exception = task2.getException();
                if (exception != null) {
                    ((odd) bbyVar).b0(exception);
                } else if (task2.isCanceled()) {
                    ((pby) bbyVar).cancel(null);
                } else {
                    ((odd) bbyVar).N(task2.getResult());
                }
            }
        });
        return new zzbw(oddVar);
    }
}
