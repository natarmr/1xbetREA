package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ker extends o7v {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ker(eu00 eu00Var, h1 h1Var, byte b) {
        super(eu00Var, h1Var);
        this.e = b;
    }

    @Override // a.o7v
    public final List h() {
        switch (this.e) {
            case 0:
                ier ierVar = (ier) this.b;
                wer werVar = ierVar.g;
                if (Intrinsics.d(werVar, ser.d)) {
                    return kotlin.collections.a.c(jeb.N(ierVar, false));
                }
                return Intrinsics.d(werVar, ver.d) ? kotlin.collections.a.c(jeb.N(ierVar, true)) : iun.f15405a;
            default:
                return iun.f15405a;
        }
    }
}
