package a;

import android.gov.nist.core.Separators;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class x5x0 extends k5x0 {
    public static final boolean p1(String str) {
        String str2 = (String) btw0.t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(Separators.COMMA)) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.G().r()) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a.w5x0 n1(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.x5x0.n1(java.lang.String):a.w5x0");
    }

    public final String o1(String str) {
        uww0 uww0Var = this.c.f21293a;
        m6x0.T(uww0Var);
        String strZ1 = uww0Var.z1(str);
        if (TextUtils.isEmpty(strZ1)) {
            return (String) btw0.r.a(null);
        }
        Uri uri = Uri.parse((String) btw0.r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strZ1).length() + 1 + String.valueOf(authority).length());
        sb.append(strZ1);
        sb.append(Separators.DOT);
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }
}
