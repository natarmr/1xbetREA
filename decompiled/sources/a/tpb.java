package a;

import android.gov.nist.core.Separators;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.Log;
import kotlin.text.StringsKt;
import org.xplatform.ui_core.viewcomponents.layouts.linear.TextInputEditTextNew;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tpb implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34323a;

    public /* synthetic */ tpb(byte b) {
        this.f34323a = b;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        switch (this.f34323a) {
            case 0:
                gl5 gl5Var = xpb.S1;
                charSequence.getClass();
                return StringsKt.O(charSequence, Separators.SP, false) ? kotlin.text.c.r(charSequence.toString(), Separators.SP, "", false) : charSequence;
            case 1:
                fl70 fl70Var = zo90.p2;
                charSequence.getClass();
                if (charSequence.length() != 0 && charSequence.charAt(0) == ' ' && i3 == 0) {
                    return "";
                }
                return null;
            case 2:
                fl70 fl70Var2 = zo90.p2;
                charSequence.getClass();
                StringBuilder sb = new StringBuilder();
                int length = charSequence.length();
                for (int i5 = 0; i5 < length; i5++) {
                    char cCharAt = charSequence.charAt(i5);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                return i3 == 0 ? vqd.o("+", sb) : sb;
            case 3:
                nh70 nh70Var = h6d0.Q1;
                try {
                    CharSequence charSequenceSubSequence = spanned.subSequence(0, i3);
                    CharSequence charSequenceSubSequence2 = charSequence.subSequence(i, i2);
                    CharSequence charSequenceSubSequence3 = spanned.subSequence(i4, spanned.length());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((Object) charSequenceSubSequence);
                    sb2.append((Object) charSequenceSubSequence2);
                    sb2.append((Object) charSequenceSubSequence3);
                    int i6 = Integer.parseInt(sb2.toString());
                    if (i6 > 65535 || i6 < 0) {
                        return "";
                    }
                    return null;
                } catch (NumberFormatException e) {
                    Log.d(h6d0.class.getSimpleName(), "Failed to parse number", e);
                    return null;
                }
            default:
                int i7 = TextInputEditTextNew.j2;
                while (i < i2) {
                    if (Character.isWhitespace(charSequence.charAt(i))) {
                        return "";
                    }
                    i++;
                }
                return null;
        }
    }
}
