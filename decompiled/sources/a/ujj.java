package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class ujj implements vuu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35783a;

    @Override // a.vuu0
    public final nls0 a(j83 j83Var) {
        String strL;
        byte b = this.f35783a;
        j83Var.getClass();
        switch (b) {
            case 0:
                String str = j83Var.b;
                str.getClass();
                if (str.length() == 0) {
                    strL = str;
                } else {
                    StringBuilder sb = new StringBuilder();
                    int length = str.length();
                    for (int i = 0; i < length; i++) {
                        char cCharAt = str.charAt(i);
                        if (Character.isDigit(cCharAt) || cCharAt == '.') {
                            sb.append(cCharAt);
                        }
                    }
                    String string = sb.toString();
                    if (string.equals(Separators.DOT)) {
                        string = "0.";
                    } else if (StringsKt.k0(string, '.')) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= string.length()) {
                                string = "0.";
                            } else if (string.charAt(i2) == '.') {
                                i2++;
                            }
                        }
                    }
                    boolean zR = StringsKt.R(string, '.');
                    List listI0 = StringsKt.i0(string, new char[]{'.'}, 6);
                    String str2 = (String) CollectionsKt.firstOrNull(listI0);
                    String string2 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    StringBuilder sb2 = new StringBuilder();
                    int length2 = str2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        char cCharAt2 = str2.charAt(i3);
                        if (Character.isDigit(cCharAt2)) {
                            sb2.append(cCharAt2);
                        }
                    }
                    String string3 = sb2.toString();
                    if (listI0.size() > 1) {
                        String strB0 = CollectionsKt.b0(CollectionsKt.O(listI0, 1), "", null, null, null, 62);
                        StringBuilder sb3 = new StringBuilder();
                        int length3 = strB0.length();
                        for (int i4 = 0; i4 < length3; i4++) {
                            char cCharAt3 = strB0.charAt(i4);
                            if (Character.isDigit(cCharAt3)) {
                                sb3.append(cCharAt3);
                            }
                        }
                        string2 = sb3.toString();
                    }
                    strL = ttm0.L(13, string3);
                    String strL2 = ttm0.L(2, string2);
                    if (zR && strL.length() > 0 && string3.length() <= 13) {
                        strL = strL.concat(Separators.DOT);
                    } else if (strL2.length() > 0) {
                        strL = kng0.l(strL, Separators.DOT, strL2);
                    }
                }
                return new nls0(new j83(strL), new zri(str, strL));
            default:
                String strD0 = StringsKt.d0("+", j83Var.b);
                String strConcat = "+".concat(strD0);
                return new nls0(new j83(strConcat), new mgk(strConcat, strD0));
        }
    }
}
