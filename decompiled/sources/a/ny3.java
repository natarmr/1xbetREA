package a;

import android.content.Context;
import android.content.res.AssetManager;
import android.gov.nist.core.Separators;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ny3 extends ex5 {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public ny3(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // a.jbj
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.g = null;
                if (this.i) {
                    this.i = false;
                    o();
                }
            } catch (IOException e) {
                throw new my3(e, 2000);
            }
        } catch (Throwable th) {
            this.g = null;
            if (this.i) {
                this.i = false;
                o();
            }
            throw th;
        }
    }

    @Override // a.jbj
    public final long d(mbj mbjVar) throws my3 {
        try {
            Uri uri = mbjVar.f21512a;
            long j = mbjVar.e;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(Separators.SLASH)) {
                path = path.substring(1);
            }
            p();
            InputStream inputStreamOpen = this.e.open(path, 1);
            this.g = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new my3(null, CommonConstant.RETCODE.INVALID_AT_ERROR);
            }
            long j2 = mbjVar.f;
            if (j2 != -1) {
                this.h = j2;
            } else {
                long jAvailable = this.g.available();
                this.h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.h = -1L;
                }
            }
            this.i = true;
            q(mbjVar);
            return this.h;
        } catch (my3 e) {
            throw e;
        } catch (IOException e2) {
            throw new my3(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // a.jbj
    public final Uri getUri() {
        return this.f;
    }

    @Override // a.bbj
    public final int read(byte[] bArr, int i, int i2) throws my3 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new my3(e, 2000);
                }
            }
            InputStream inputStream = this.g;
            String str = vtt0.f38024a;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.h;
                if (j2 != -1) {
                    this.h = j2 - ((long) i3);
                }
                f(i3);
                return i3;
            }
        }
        return -1;
    }
}
