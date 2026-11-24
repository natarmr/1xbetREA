package a;

import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class sa10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bzt f31872a;

    public sa10(bzt bztVar) {
        this.f31872a = bztVar;
    }

    public static /* synthetic */ ra10 b(sa10 sa10Var, pb10 pb10Var, int i, int i2, Function0 function0, int i3) {
        if ((i3 & 4) != 0) {
            i2 = R.string.empty_str;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            function0 = null;
        }
        return sa10Var.a(pb10Var, i, i4, function0, 0L);
    }

    public final ra10 a(pb10 pb10Var, int i, int i2, Function0 function0, long j) {
        xuz xuzVar = pb10.c;
        int i3 = this.f31872a.f3488a.a().r;
        xuzVar.getClass();
        return new ra10(xuz.a(pb10Var, i3), i, i2, function0, j);
    }
}
