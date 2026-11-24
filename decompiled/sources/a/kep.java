package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kep implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18164a;
    public final /* synthetic */ org.xplatform.favorites.impl.presentation.category.f b;

    public /* synthetic */ kep(org.xplatform.favorites.impl.presentation.category.f fVar, byte b) {
        this.f18164a = b;
        this.b = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f18164a;
        org.xplatform.favorites.impl.presentation.category.f fVar = this.b;
        switch (b) {
            case 0:
                return g2v.d(fVar.j, pb10.e, null, null, R.string.nothing_found, 0, null, 478);
            case 1:
                return g2v.d(fVar.j, pb10.g, null, null, R.string.error_get_data, R.string.try_again_text, new kep(fVar, (byte) 2), 94);
            default:
                fVar.w();
                return Unit.f46060a;
        }
    }
}
