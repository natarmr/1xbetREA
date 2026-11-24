package a;

import android.gov.nist.core.Separators;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public final class zyj extends e3u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DecimalFormat f45209a;

    public zyj(int i) {
        b(i);
    }

    @Override // a.e3u0
    public final String a(float f) {
        return this.f45209a.format(f);
    }

    public final void b(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(Separators.DOT);
            }
            stringBuffer.append("0");
        }
        this.f45209a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }
}
