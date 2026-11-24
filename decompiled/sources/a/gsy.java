package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class gsy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11854a;
    public final hsy b;

    public /* synthetic */ gsy(hsy hsyVar, byte b) {
        this.f11854a = b;
        this.b = hsyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11854a) {
            case 0:
                hsy hsyVar = this.b;
                jqy jqyVar = hsyVar.u().f.i;
                return jqyVar != null ? new csy(hsyVar, jqyVar, hsyVar.u().a().size(), aiy.d, (nzs0) hsyVar.u().k.getValue()) : new zwj(hsyVar.u());
            default:
                return x9x.H(this.b, false);
        }
    }
}
