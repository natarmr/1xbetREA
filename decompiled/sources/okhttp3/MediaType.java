package okhttp3;

import a.ah30;
import a.bh30;
import a.brm0;
import a.g3;
import a.g8x;
import a.hne;
import a.jf4;
import a.ohs0;
import a.vqd;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/MediaType;", "", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaType {
    public static final Regex e = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Regex f = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46102a;
    public final String b;
    public final String c;
    public final String[] d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lokhttp3/MediaType$Companion;", "", "", "TOKEN", "Ljava/lang/String;", "QUOTED", "Lkotlin/text/Regex;", "TYPE_SUBTYPE", "Lkotlin/text/Regex;", "PARAMETER", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static MediaType a(String str) {
            str.getClass();
            bh30 bh30VarE = MediaType.e.e(0, str);
            if (bh30VarE == null) {
                jf4.o(hne.l('\"', "No subtype found for: \"", str));
                return null;
            }
            String str2 = (String) ((ah30) bh30VarE.a()).get(1);
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            String lowerCase2 = ((String) ((ah30) bh30VarE.a()).get(2)).toLowerCase(locale);
            ArrayList arrayListU = ohs0.u(lowerCase2);
            int i = bh30VarE.b().b;
            while (true) {
                int i2 = i + 1;
                if (i2 >= str.length()) {
                    return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayListU.toArray(new String[0]));
                }
                bh30 bh30VarE2 = MediaType.f.e(i2, str);
                if (bh30VarE2 == null) {
                    throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i2) + "\" for: \"" + str + '\"').toString());
                }
                g3 g3Var = bh30VarE2.c;
                MatchGroup matchGroupE = g3Var.e(1);
                String str3 = matchGroupE != null ? matchGroupE.f46071a : null;
                if (str3 == null) {
                    i = bh30VarE2.b().b;
                } else {
                    MatchGroup matchGroupE2 = g3Var.e(2);
                    String strK = matchGroupE2 != null ? matchGroupE2.f46071a : null;
                    if (strK == null) {
                        MatchGroup matchGroupE3 = g3Var.e(3);
                        matchGroupE3.getClass();
                        strK = matchGroupE3.f46071a;
                    } else if (StringsKt.k0(strK, '\'') && StringsKt.R(strK, '\'') && strK.length() > 2) {
                        strK = vqd.k(1, 1, strK);
                    }
                    arrayListU.add(str3);
                    arrayListU.add(strK);
                    i = bh30VarE2.b().b;
                }
            }
        }
    }

    public MediaType(String str, String str2, String str3, String[] strArr) {
        brm0.B(str, str2, str3);
        strArr.getClass();
        this.f46102a = str;
        this.b = str2;
        this.c = str3;
        this.d = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.d;
        int i = 0;
        int iJ = g8x.J(0, strArr.length - 1, 2);
        if (iJ < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!c.o(strArr[i], "charset")) {
                if (i == iJ) {
                    str = null;
                    break;
                }
                i += 2;
            } else {
                str = strArr[i + 1];
                break;
            }
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MediaType) && Intrinsics.d(((MediaType) obj).f46102a, this.f46102a);
    }

    public final int hashCode() {
        return this.f46102a.hashCode();
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF46102a() {
        return this.f46102a;
    }
}
