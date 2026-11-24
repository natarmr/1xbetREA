package a;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.impl.presentation.video.window_screen.GameVideoWindowService;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.SubGamesContainerView;
import org.xplatform.sportgame.core.presentation.GameScreenRelatedContainerView;

/* JADX INFO: loaded from: classes.dex */
public final class ic3 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14516a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ic3(Object obj, byte b) {
        this.f14516a = b;
        this.b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        byte b = this.f14516a;
        Object obj = this.b;
        switch (b) {
            case 0:
                view.getClass();
                outline.getClass();
                int width = view.getWidth();
                int height = view.getHeight();
                int i = ((kie0) obj).f18333a;
                outline.setRoundRect(0, 0, width, height + i, Math.abs(i));
                break;
            case 1:
                uac uacVar = ((Chip) obj).e;
                if (uacVar == null) {
                    outline.setAlpha(0.0f);
                } else {
                    uacVar.getOutline(outline);
                }
                break;
            case 2:
                view.getClass();
                outline.getClass();
                int width2 = view.getWidth();
                int height2 = view.getHeight();
                int i2 = ((GameScreenRelatedContainerView) obj).b;
                outline.setRoundRect(0, 0, width2, height2 + i2, Math.abs(i2));
                break;
            case 3:
                view.getClass();
                outline.getClass();
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((GameVideoWindowService) obj).getResources().getDimension(R.dimen.size_16));
                break;
            case 4:
                view.getClass();
                outline.getClass();
                i820 i820Var = (i820) obj;
                outline.setRoundRect(0, 0, view.getWidth(), i820Var.G().getDimensionPixelSize(R.dimen.size_20) + view.getHeight(), Math.abs(i820Var.G().getDimensionPixelSize(R.dimen.size_20)));
                break;
            default:
                view.getClass();
                outline.getClass();
                int width3 = view.getWidth();
                int height3 = view.getHeight();
                int i3 = ((SubGamesContainerView) obj).c;
                outline.setRoundRect(0, 0, width3, height3 + i3, Math.abs(i3));
                break;
        }
    }
}
