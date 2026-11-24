package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yah0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42298a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ qdz e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ int g;

    public /* synthetic */ yah0(a4x a4xVar, boolean z, xcz xczVar, qdz qdzVar, Function1 function1, int i, byte b) {
        this.f42298a = b;
        this.b = a4xVar;
        this.c = z;
        this.d = xczVar;
        this.e = qdzVar;
        this.f = function1;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f42298a) {
            case 0:
                ((Integer) obj2).intValue();
                xia0.R(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                oja0.M(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ffb0.B(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
        }
        return Unit.f46060a;
    }
}
