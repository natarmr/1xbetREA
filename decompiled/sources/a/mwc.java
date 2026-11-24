package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mwc implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22497a;
    public final /* synthetic */ rwc b;

    public /* synthetic */ mwc(rwc rwcVar, byte b) {
        this.f22497a = b;
        this.b = rwcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f22497a) {
            case 0:
                this.b.d.b("GET_CMS_BANNER_CATEGORIES");
                break;
            case 1:
                this.b.d.b("GET_CMS_BANNER_BY_ID");
                break;
            default:
                this.b.d.b("GET_CMS_BANNERS_LIST");
                break;
        }
        return Unit.f46060a;
    }
}
