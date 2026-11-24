package a;

import android.gov.nist.core.Separators;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class ild0 implements lzp {
    public static final Charset c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f14973a;
    public hld0 b;

    public ild0(File file) {
        this.f14973a = file;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // a.lzp
    public final String a() {
        ah80 ah80Var;
        byte[] bArr;
        if (this.f14973a.exists()) {
            c();
            hld0 hld0Var = this.b;
            if (hld0Var == null) {
                ah80Var = null;
            } else {
                int[] iArr = {0};
                byte[] bArr2 = new byte[hld0Var.v()];
                try {
                    this.b.d(new g090(bArr2, iArr));
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                int i = iArr[0];
                ah80Var = new ah80();
                ah80Var.f861a = bArr2;
                ah80Var.b = i;
            }
        } else {
            ah80Var = null;
        }
        if (ah80Var == null) {
            bArr = null;
        } else {
            int i2 = ah80Var.b;
            bArr = new byte[i2];
            System.arraycopy(ah80Var.f861a, 0, bArr, 0, i2);
        }
        if (bArr != null) {
            return new String(bArr, c);
        }
        return null;
    }

    @Override // a.lzp
    public final void b(long j, String str) {
        c();
        if (this.b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "...".concat(str.substring(str.length() - 16384));
            }
            this.b.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", Separators.SP).replaceAll(Separators.RETURN, Separators.SP)).getBytes(c));
            while (!this.b.e() && this.b.v() > 65536) {
                this.b.n();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }

    public final void c() {
        File file = this.f14973a;
        if (this.b == null) {
            try {
                this.b = new hld0(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    @Override // a.lzp
    public final void closeLogFile() {
        aad.J(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }
}
