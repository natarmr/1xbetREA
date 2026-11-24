package a;

import android.gov.nist.core.Separators;
import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w2 extends t5 {
    public static /* synthetic */ void k0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = Payload.SOURCE;
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // a.wjj, a.p4
    public final String toString() {
        String str = "";
        String str2 = this.g ? "reified " : "";
        if (t() != t3u0.c) {
            str = t() + Separators.SP;
        }
        return str2 + str + getName();
    }
}
