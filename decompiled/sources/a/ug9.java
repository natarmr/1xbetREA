package a;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ug9 {
    public static final String c;
    public static final Set d;
    public static final ug9 e;
    public static final ug9 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35614a;
    public final String b;

    static {
        String strW = vsm0.w("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = strW;
        String strW2 = vsm0.w("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strW3 = vsm0.w("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new gwn("proto"), new gwn("json"))));
        e = new ug9(strW, null);
        f = new ug9(strW2, strW3);
    }

    public ug9(String str, String str2) {
        this.f35614a = str;
        this.b = str2;
    }

    public static ug9 a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            jf4.o("Version marker missing from extras");
            return null;
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            jf4.o("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            jf4.o("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = strArrSplit[1];
        return new ug9(str2, str3.isEmpty() ? null : str3);
    }
}
