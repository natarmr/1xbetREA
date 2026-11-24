package a;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class l52 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public l52(int i, int i2, int i3, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbQ = kng0.q(i, "Pos: ", ", limit: ");
        sbQ.append(i2);
        sbQ.append(", len: ");
        sbQ.append(i3);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbQ.toString()), indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l52(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbQ = kng0.q(j, "Pos: ", ", limit: ");
        sbQ.append(j2);
        sbQ.append(", len: ");
        sbQ.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbQ.toString()), indexOutOfBoundsException);
    }

    public l52() {
        super("");
    }

    public /* synthetic */ l52(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l52(String str, IndexOutOfBoundsException indexOutOfBoundsException, byte b) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        switch (b) {
            case 2:
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
                break;
            default:
                break;
        }
    }
}
