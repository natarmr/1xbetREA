package com.google.android.recaptcha.internal;

import a.guy;
import a.wp20;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
final class zzat extends guy implements Function0 {
    public static final zzat zza = new zzat();

    public zzat() {
        super(0);
    }

    public static final Map zza() {
        Map map = zzav.zzc;
        LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zzaw) entry.getValue()).zzb());
        }
        return linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        return zza();
    }
}
