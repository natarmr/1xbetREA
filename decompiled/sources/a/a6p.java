package a;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a6p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f326a;
    public final /* synthetic */ SportCellLeftView b;

    public /* synthetic */ a6p(SportCellLeftView sportCellLeftView, byte b) {
        this.f326a = b;
        this.b = sportCellLeftView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f326a;
        SportCellLeftView sportCellLeftView = this.b;
        switch (b) {
            case 0:
                sportCellLeftView.setBottomIcon((Drawable) obj);
                return Unit.f46060a;
            default:
                return SportCellLeftView.a(sportCellLeftView, (TypedArray) obj);
        }
    }
}
