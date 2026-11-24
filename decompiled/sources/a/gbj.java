package a;

import android.gov.nist.core.Separators;
import android.net.Uri;
import android.util.Base64;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class gbj extends ex5 {
    public mbj e;
    public byte[] f;
    public int g;
    public int h;

    @Override // a.jbj
    public final void close() {
        if (this.f != null) {
            this.f = null;
            o();
        }
        this.e = null;
    }

    @Override // a.jbj
    public final long d(mbj mbjVar) throws kbj, kq80 {
        byte[] bArrDecode;
        p();
        this.e = mbjVar;
        Uri uri = mbjVar.f21512a;
        long j = mbjVar.f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        x0x.y("Unsupported scheme: %s", scheme, RemoteMessageConst.DATA.equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = vtt0.f38024a;
        String[] strArrSplit = schemeSpecificPart.split(Separators.COMMA, -1);
        if (strArrSplit.length != 2) {
            throw new kq80("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                bArrDecode = Base64.decode(str2, 0);
                this.f = bArrDecode;
            } catch (IllegalArgumentException e) {
                throw new kq80(kng0.k("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            bArrDecode = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            this.f = bArrDecode;
        }
        long j2 = mbjVar.e;
        if (j2 > bArrDecode.length) {
            this.f = null;
            throw new kbj(CommonConstant.RETCODE.INVALID_AT_ERROR);
        }
        int i = (int) j2;
        this.g = i;
        int length = bArrDecode.length - i;
        this.h = length;
        if (j != -1) {
            this.h = (int) Math.min(length, j);
        }
        q(mbjVar);
        return j != -1 ? j : this.h;
    }

    @Override // a.jbj
    public final Uri getUri() {
        mbj mbjVar = this.e;
        if (mbjVar != null) {
            return mbjVar.f21512a;
        }
        return null;
    }

    @Override // a.bbj
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        String str = vtt0.f38024a;
        System.arraycopy(bArr2, this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        f(iMin);
        return iMin;
    }
}
