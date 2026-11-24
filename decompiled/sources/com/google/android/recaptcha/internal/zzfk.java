package com.google.android.recaptcha.internal;

import a.q3d;
import a.r3d;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfk {
    private final List zza;

    public zzfk(boolean z) {
        this.zza = zzf(q3d.j("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"));
    }

    public static final boolean zzc(Uri uri) {
        return zze(uri);
    }

    private final boolean zzd(String str) {
        List list = this.zza;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (c.x(str, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean zze(Uri uri) {
        return (TextUtils.isEmpty(uri.toString()) || !"https".equals(uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) ? false : true;
    }

    private static final List zzf(List list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + Separators.SLASH);
        }
        return arrayList;
    }

    public final boolean zza(Uri uri) {
        return zze(uri) && zzd(uri.toString());
    }

    public final boolean zzb(String str) {
        Uri uri = Uri.parse(str);
        uri.getClass();
        return zze(uri) && zzd(uri.toString());
    }

    public zzfk() {
        this(true);
    }
}
