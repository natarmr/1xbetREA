package a;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class tjj implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f34050a;
    public final byte b;
    public final n0o0 c = maz.b(new ucj(this, (byte) 6));

    /* JADX WARN: Multi-variable type inference failed */
    public tjj(int i, int i2) {
        this.f34050a = i;
        this.b = i2;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        charSequence.getClass();
        spanned.getClass();
        String strConcat = spanned.toString().substring(0, i3).concat(spanned.toString().substring(i4, spanned.toString().length()));
        String str = strConcat.substring(0, i3) + ((Object) charSequence) + strConcat.substring(i3, strConcat.length());
        Object value = this.c.getValue();
        value.getClass();
        if (((Pattern) value).matcher(str).matches()) {
            return null;
        }
        return "";
    }
}
