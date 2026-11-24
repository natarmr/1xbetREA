package a;

import android.gov.nist.core.Separators;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y1w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f41881a;
    public static final Regex b;

    static {
        nse0 nse0Var = nse0.IGNORE_CASE;
        f41881a = new Regex("^(vbscript|javascript|file|data):", nse0Var);
        b = new Regex("^data:image/(gif|png|jpeg|webp);", nse0Var);
    }

    public static final CharSequence a(CharSequence charSequence) {
        charSequence.getClass();
        if (!(f41881a.a(StringsKt.u0(charSequence)) ? b.a(StringsKt.u0(charSequence)) : true)) {
            charSequence = null;
        }
        return charSequence == null ? Separators.POUND : charSequence;
    }
}
