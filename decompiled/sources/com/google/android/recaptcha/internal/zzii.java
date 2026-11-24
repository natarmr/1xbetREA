package com.google.android.recaptcha.internal;

import a.itt0;
import a.xp20;
import android.content.Context;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class zzii implements zzih {
    private final Context zza;
    private final Map zzb = xp20.f(new Pair(2, Context.ACTIVITY_SERVICE), new Pair(3, Context.TELEPHONY_SERVICE), new Pair(4, Context.INPUT_METHOD_SERVICE), new Pair(5, Context.AUDIO_SERVICE));

    public zzii(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final Object zza(Object... objArr) throws zzce {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            itt0.g(4, 5, null);
            return null;
        }
        Object obj2 = this.zzb.get(Integer.valueOf(num.intValue()));
        if (obj2 != null) {
            return this.zza.getSystemService((String) obj2);
        }
        throw new zzce(4, 4, null);
    }
}
