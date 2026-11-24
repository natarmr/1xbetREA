package com.google.android.recaptcha.internal;

import a.iun;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zzga extends zzfx {
    private final zzfz zza;
    private final String zzb;

    public zzga(zzfz zzfzVar, String str, Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List listAsList;
        if (!Intrinsics.d(method.getName(), this.zzb)) {
            return false;
        }
        zzfz zzfzVar = this.zza;
        if (objArr != null) {
            listAsList = Arrays.asList(objArr);
            listAsList.getClass();
        } else {
            listAsList = iun.f15405a;
        }
        zzfzVar.zzb(listAsList);
        return true;
    }
}
