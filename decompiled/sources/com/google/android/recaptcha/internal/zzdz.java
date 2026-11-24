package com.google.android.recaptcha.internal;

import a.rer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzdz extends rer implements Function1 {
    public zzdz(Object obj) {
        super(1, obj, zzec.class, "isRetriable", "isRetriable(Ljava/lang/Exception;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(zzec.zzo((Exception) obj));
    }
}
