package a;

import android.gov.nist.core.Separators;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kzj0 extends tft0 implements mzj0, yxs0 {
    @Override // a.tft0
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public abstract kzj0 k0(boolean z);

    public kzj0 o0(ays0 ays0Var) {
        ays0Var.getClass();
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", iek.e.o((t83) it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(S());
        if (!J().isEmpty()) {
            CollectionsKt.a0(J(), sb, ", ", Separators.LESS_THAN, Separators.GREATER_THAN, null, 112);
        }
        if (U()) {
            sb.append(Separators.QUESTION);
        }
        return sb.toString();
    }
}
