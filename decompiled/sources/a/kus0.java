package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kus0 implements zcy {
    public final /* synthetic */ byte b;
    public final /* synthetic */ String[] c;

    public /* synthetic */ kus0(String[] strArr, byte b) {
        this.b = b;
        this.c = strArr;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        switch (this.b) {
        }
        return zcy.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        byte b = this.b;
        String[] strArr = this.c;
        switch (b) {
            case 0:
                return (obj instanceof zcy) && Arrays.equals(strArr, ((zcy) obj).names());
            default:
                return (obj instanceof zcy) && Arrays.equals(strArr, ((zcy) obj).names());
        }
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        int iHashCode;
        byte b = this.b;
        String[] strArr = this.c;
        switch (b) {
            case 0:
                iHashCode = Arrays.hashCode(strArr);
                break;
            default:
                iHashCode = Arrays.hashCode(strArr);
                break;
        }
        return iHashCode ^ 397397176;
    }

    @Override // a.zcy
    public final /* synthetic */ String[] names() {
        byte b = this.b;
        return this.c;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        byte b = this.b;
        String string = Arrays.toString(this.c);
        switch (b) {
            case 0:
                break;
        }
        return kng0.l("@kotlinx.serialization.json.JsonNames(names=", string, Separators.RPAREN);
    }
}
