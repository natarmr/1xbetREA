package a;

import android.gov.nist.core.Separators;
import java.io.ByteArrayOutputStream;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
public final class dzf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final azj0 f6940a;
    public String b = "";
    public Function0 c = new czf(this, 0);

    public dzf(nwd nwdVar, azj0 azj0Var) {
        this.f6940a = azj0Var;
    }

    public final String a() {
        byte[] bytes = Separators.COLON.getBytes(Charsets.UTF_8);
        bytes.getClass();
        char[] cArrH0 = CollectionsKt.H0(CollectionsKt.r0(CollectionsKt.r0(CollectionsKt.q0(CollectionsKt.o0(new bvb('A', 'Z'), new bvb('a', 'z')), new bvb('0', '9')), '+'), '/'));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < bytes.length; i2 += 3) {
            int i3 = ((bytes[i2] & 255) << 16) & 16777215;
            int i4 = i2 + 1;
            if (i4 < bytes.length) {
                i3 |= (bytes[i4] & 255) << 8;
            } else {
                i++;
            }
            int i5 = i2 + 2;
            if (i5 < bytes.length) {
                i3 |= bytes[i5] & 255;
            } else {
                i++;
            }
            int i6 = 4 - i;
            for (int i7 = 0; i7 < i6; i7++) {
                byteArrayOutputStream.write(cArrH0[(16515072 & i3) >> 18]);
                i3 <<= 6;
            }
        }
        for (int i8 = 0; i8 < i; i8++) {
            byteArrayOutputStream.write(61);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return "Basic ".concat(new String(byteArray, Charsets.UTF_8));
    }
}
