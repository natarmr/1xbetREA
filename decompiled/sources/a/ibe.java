package a;

import org.xplatform.consultantchat.presentation.dialogs.rate.model.RatingModel;

/* JADX INFO: loaded from: classes3.dex */
public final class ibe extends w46 {
    public static final hbe d = new hbe(vsf0.f37948a, g9e0.f10911a);
    public final p7m0 b = q7m0.a(d);
    public final qoj0 c = roj0.b(0, 0, null, 7);

    public final void w(RatingModel ratingModel) {
        byte b = 21;
        yje yjeVar = null;
        if (ratingModel instanceof RatingModel.NoValue) {
            qjj.W(jiu0.a(this), null, null, new jtb(this, d, yjeVar, b), 3);
        } else if (!(ratingModel instanceof RatingModel.Value)) {
            t9f.b();
        } else {
            RatingModel.Value value = (RatingModel.Value) ratingModel;
            qjj.W(jiu0.a(this), null, null, new jtb(this, new hbe(value.f46451a ? vsf0.b : vsf0.c, new h9e0(value.b)), yjeVar, b), 3);
        }
    }
}
