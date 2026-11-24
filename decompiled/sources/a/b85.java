package a;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b85 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2140a;
    public final /* synthetic */ cm80 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ b85(cm80 cm80Var, boolean z, byte b) {
        this.f2140a = b;
        this.b = cm80Var;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2140a;
        cm80 cm80Var = this.b;
        oyg0 oyg0Var = (oyg0) obj;
        switch (b) {
            case 0:
                s75 s75Var = (s75) obj2;
                oyg0Var.getClass();
                s75Var.getClass();
                return s75.a(s75Var, m65.a(s75Var.f31733a, cm80Var instanceof tl80, (cm80Var instanceof zl80) && ((zl80) cm80Var).b, cm80Var.a(), (cm80Var instanceof wl80) && ((wl80) cm80Var).f39341a.isEmpty(), null, 16), false, this.c ? false : s75Var.d, 14);
            default:
                x19 x19Var = (x19) obj2;
                oyg0Var.getClass();
                x19Var.getClass();
                v19 v19Var = x19Var.c;
                List listA = cm80Var.a();
                return x19.a(x19Var, null, null, v19.a(v19Var, this.c, cm80Var instanceof zl80 ? v19Var.b : true, cm80Var instanceof tl80, listA, 16), false, null, null, 507);
        }
    }
}
