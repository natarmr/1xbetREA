package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class tq70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sq70 f34368a;

    public tq70(sq70 sq70Var) {
        sq70Var.getClass();
        this.f34368a = sq70Var;
    }

    public final List a() {
        sq70 sq70Var = this.f34368a;
        String strC = sq70Var.f32614a.c("ONLINE_CALL_DOMAINS", "");
        if (strC.length() == 0) {
            return iun.f15405a;
        }
        try {
            vby vbyVar = sq70Var.b;
            vbyVar.getClass();
            return (List) vbyVar.b(new zw3(ysm0.f43175a, (byte) 0), strC);
        } catch (Exception unused) {
            return iun.f15405a;
        }
    }
}
