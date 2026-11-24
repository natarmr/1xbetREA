package a;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes6.dex */
public final class uex implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vex f35552a;

    public uex(vex vexVar) {
        this.f35552a = vexVar;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence == null || vex.b(charSequence)) {
            return "";
        }
        vex vexVar = this.f35552a;
        if (!vexVar.h.a(charSequence) && !vexVar.a(charSequence) && vexVar.c()) {
            return charSequence;
        }
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            char cCharAt = charSequence.charAt(i5);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }
}
