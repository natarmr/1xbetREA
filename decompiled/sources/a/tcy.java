package a;

import android.gov.nist.core.Separators;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class tcy extends ucy {
    public tcy(String str, String str2) {
        super(str.concat((str2 == null || StringsKt.W(str2)) ? "" : Separators.RETURN.concat(str2)));
    }
}
