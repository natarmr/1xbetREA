package com.google.android.recaptcha.internal;

import a.bnn0;
import a.kng0;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzfv extends bnn0 implements Function2 {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzfw zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfv(String[] strArr, zzfw zzfwVar, String str, yje yjeVar) {
        super(2, yjeVar);
        this.zza = strArr;
        this.zzb = zzfwVar;
        this.zzc = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzfv(this.zza, this.zzb, this.zzc, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Separators.DOUBLE_QUOTE + str + Separators.DOUBLE_QUOTE);
        }
        this.zzb.zza.evaluateJavascript(kng0.m(this.zzc, Separators.LPAREN, CollectionsKt.b0(arrayList, Separators.COMMA, null, null, null, 62), Separators.RPAREN), null);
        return Unit.f46060a;
    }
}
