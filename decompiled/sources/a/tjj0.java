package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class tjj0 extends i26 {
    public boolean g;

    public final String H(int i) {
        String str;
        List list = (List) this.f;
        sjj0 sjj0Var = list != null ? (sjj0) CollectionsKt.W(i, list) : null;
        qjj0 qjj0Var = sjj0Var instanceof qjj0 ? (qjj0) sjj0Var : null;
        return (qjj0Var == null || (str = qjj0Var.f28843a) == null) ? "" : str;
    }
}
