package a;

import android.gov.nist.core.Separators;
import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xrq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41381a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final String f;
    public final String g;

    public xrq(String str, String str2, String str3, String str4, String str5, List list) {
        str.getClass();
        this.f41381a = str;
        str2.getClass();
        this.b = str2;
        this.c = str3;
        list.getClass();
        this.d = list;
        this.e = str4;
        this.f = str5;
        StringBuilder sbN = b1j.n(str, "-", str2, "-", str3);
        sbN.append("-");
        sbN.append(str4);
        if (str5 != null) {
            int length = str5.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = str5.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    sbN.append("-VF");
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        this.g = sbN.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb.append(this.f41381a);
        sb.append(", mProviderPackage: ");
        sb.append(this.b);
        sb.append(", mQuery: ");
        sb.append(this.c);
        sb.append(", mSystemFont: ");
        sb.append(this.e);
        sb.append(", mVariationSettings: ");
        StringBuilder sb2 = new StringBuilder(axq.n(sb, this.f, ", mCertificates:"));
        int i = 0;
        while (true) {
            List list = this.d;
            if (i >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb2.append(Separators.DOUBLE_QUOTE);
            }
            sb2.append(" ]");
            i++;
        }
    }
}
