package a;

import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class cb8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f4049a = androidx.compose.runtime.e.e(k73.f17799a);
    public final cgk0 b = androidx.compose.runtime.e.b(0);
    public final pz40 c = androidx.compose.runtime.e.e(Boolean.TRUE);
    public final pz40 d;
    public final pz40 e;
    public final pz40 f;
    public final pz40 g;
    public final cgk0 h;
    public final zbk i;
    public final zbk j;

    public cb8(lun lunVar) {
        final byte b = 0;
        Boolean bool = Boolean.FALSE;
        this.d = androidx.compose.runtime.e.e(bool);
        this.e = androidx.compose.runtime.e.e(lunVar);
        this.f = androidx.compose.runtime.e.e(bool);
        this.g = androidx.compose.runtime.e.e(bool);
        this.h = androidx.compose.runtime.e.b(0);
        this.i = jgk0.b(new Function0(this) { // from class: a.bb8
            public final /* synthetic */ cb8 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                cb8 cb8Var = this.b;
                switch (b2) {
                    case 0:
                        return ckv0.a((Map) ((hgk0) cb8Var.e).getValue());
                    default:
                        return CollectionsKt.P0(r3d.r((Iterable) cb8Var.i.getValue()));
                }
            }
        });
        final byte b2 = 1;
        this.j = jgk0.b(new Function0(this) { // from class: a.bb8
            public final /* synthetic */ cb8 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                cb8 cb8Var = this.b;
                switch (b3) {
                    case 0:
                        return ckv0.a((Map) ((hgk0) cb8Var.e).getValue());
                    default:
                        return CollectionsKt.P0(r3d.r((Iterable) cb8Var.i.getValue()));
                }
            }
        });
    }

    public final boolean a() {
        return ((Boolean) ((hgk0) this.d).getValue()).booleanValue();
    }
}
