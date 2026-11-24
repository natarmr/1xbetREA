package com.google.android.recaptcha.internal;

import a.itt0;
import a.maz;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgc {
    public static final Class zza(Object obj) throws zzce {
        Class cls;
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (!(obj instanceof Integer)) {
            if (!(obj instanceof String)) {
                itt0.g(4, 5, null);
                return null;
            }
            try {
                String str = (String) obj;
                Class<?> cls2 = Class.forName(str);
                int i = zzav.zza;
                if (((zzfu) maz.b(zzgb.zza).getValue()).zzb(str)) {
                    return cls2;
                }
                itt0.g(6, 47, null);
                return null;
            } catch (Exception e) {
                itt0.g(6, 8, e);
                return null;
            }
        }
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue == 1) {
            cls = Integer.TYPE;
        } else if (iIntValue == 2) {
            cls = Short.TYPE;
        } else if (iIntValue == 3) {
            cls = Byte.TYPE;
        } else if (iIntValue == 4) {
            cls = Long.TYPE;
        } else if (iIntValue == 5) {
            cls = Character.TYPE;
        } else if (iIntValue == 6) {
            cls = Float.TYPE;
        } else if (iIntValue == 7) {
            cls = Double.TYPE;
        } else {
            cls = iIntValue == 8 ? Boolean.TYPE : null;
        }
        if (cls != null) {
            return cls;
        }
        itt0.g(4, 6, null);
        return null;
    }
}
