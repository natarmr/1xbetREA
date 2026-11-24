package a;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class ezp extends ex5 {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    @Override // a.jbj
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.e = null;
                if (this.h) {
                    this.h = false;
                    o();
                }
            } catch (IOException e) {
                throw new dzp(e, 2000);
            }
        } catch (Throwable th) {
            this.e = null;
            if (this.h) {
                this.h = false;
                o();
            }
            throw th;
        }
    }

    @Override // a.jbj
    public final long d(mbj mbjVar) throws dzp {
        Uri uri = mbjVar.f21512a;
        long j = mbjVar.e;
        this.f = uri;
        p();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = mbjVar.f;
                if (length == -1) {
                    length = this.e.length() - j;
                }
                this.g = length;
                if (length < 0) {
                    throw new dzp(null, null, CommonConstant.RETCODE.INVALID_AT_ERROR);
                }
                this.h = true;
                q(mbjVar);
                return this.g;
            } catch (IOException e) {
                throw new dzp(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new dzp(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbN = b1j.n("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbN.append(fragment);
            throw new dzp(sbN.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new dzp(e3, 2006);
        } catch (RuntimeException e4) {
            throw new dzp(e4, 2000);
        }
    }

    @Override // a.jbj
    public final Uri getUri() {
        return this.f;
    }

    @Override // a.bbj
    public final int read(byte[] bArr, int i, int i2) throws dzp {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            String str = vtt0.f38024a;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.g -= (long) i3;
                f(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new dzp(e, 2000);
        }
    }
}
