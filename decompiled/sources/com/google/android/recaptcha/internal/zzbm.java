package com.google.android.recaptcha.internal;

import a.bvb;
import a.r3d;
import a.sub;
import a.zub;
import android.content.Context;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbm implements zzaq {
    private final Context zza;
    private final String zzb = "rce_";

    public zzbm(Context context) {
        this.zza = context;
        new zzcd(context);
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzcd.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzb() {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (c.x(file.getName(), this.zzb, false)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzc(String str, String str2) {
        bvb bvbVar = new bvb('A', 'z');
        ArrayList arrayList = new ArrayList(r3d.q(bvbVar, 10));
        Iterator it = bvbVar.iterator();
        while (((zub) it).b) {
            arrayList.add(Character.valueOf(((sub) it).a()));
        }
        String strB0 = CollectionsKt.b0(((ArrayList) a.d(arrayList)).subList(0, 8), "", null, null, null, 62);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(strB0));
        zzcd.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final boolean zzd(String str) {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (Intrinsics.d(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                }
            }
            return file != null;
        } catch (Exception unused) {
        }
    }
}
