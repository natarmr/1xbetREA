package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qzo0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29588a;
    public final /* synthetic */ xcz b;
    public final /* synthetic */ e2d c;

    public /* synthetic */ qzo0(xcz xczVar, e2d e2dVar, byte b) {
        this.f29588a = b;
        this.b = xczVar;
        this.c = e2dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29588a;
        boolean z = true;
        e2d e2dVar = this.c;
        xcz xczVar = this.b;
        switch (b) {
            case 0:
                if ((xczVar.h() != 0 || (!xczVar.c() && !xczVar.d())) && e2dVar.f7077a.c.l() == 0.0f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                if ((xczVar.h() != 0 || (!xczVar.c() && !xczVar.d())) && e2dVar.f7077a.c.l() == 0.0f) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
