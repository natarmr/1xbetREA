package com.google.android.recaptcha.internal;

import a.bkb;
import a.i0q;
import a.ohq;
import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcd {
    public zzcd(Context context) {
    }

    public static final byte[] zza(File file) {
        return i0q.a(file);
    }

    public static final void zzb(File file, byte[] bArr) {
        if (file.exists() && !file.delete()) {
            ohq.l("Unable to delete existing encrypted file");
            return;
        }
        bArr.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                bkb.E(fileOutputStream, th);
                throw th2;
            }
        }
    }
}
