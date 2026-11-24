package a;

import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vz0 extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vz0 f38275a = new vz0(2, ntr.class, "buildGameCardFavoriteUiModel", "buildGameCardFavoriteUiModel(ZZ)Lorg/xplatform/uikit_aggregator/aggregatorgamecardcollection/models/GameCardFavoriteUiModel;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        if (zBooleanValue) {
            i = zBooleanValue2 ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked;
        } else {
            i = 0;
        }
        return new mtr(i, zBooleanValue2);
    }
}
