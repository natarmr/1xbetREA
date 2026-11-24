package com.google.android.recaptcha.internal;

import a.bnn0;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzbh extends bnn0 implements Function2 {
    public zzbh(yje yjeVar) {
        super(2, yjeVar);
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzbh(yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbh) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        Thread.currentThread().setPriority(8);
        return Unit.f46060a;
    }
}
