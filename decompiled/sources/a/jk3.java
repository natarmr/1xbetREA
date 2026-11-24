package a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import org.xbet.client1.R;
import org.xplatform.app_update.impl.presentation.update_screen.views.AppUpdateScreenLayout;
import org.xplatform.app_update.impl.presentation.update_screen.views.content.bottom.AppUpdateBottomView;
import org.xplatform.app_update.impl.presentation.update_screen.views.content.download.DownloadView;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberDurakCardDeckView;
import org.xplatform.cyber.section.impl.championships.esports_world_cup.presentation.discipline.discipline_banner.DisciplineBannerView;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.uikit.components.cells.DsShimmerCell;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes3.dex */
public final class jk3 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16646a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;

    public jk3(DsMenuCompactCell dsMenuCompactCell, AppCompatImageView appCompatImageView, ImageView imageView, MaterialTextView materialTextView, TextView textView) {
        this.f16646a = (byte) 11;
        this.b = dsMenuCompactCell;
        this.d = appCompatImageView;
        this.e = imageView;
        this.c = materialTextView;
        this.f = textView;
    }

    public static jk3 a(View view) {
        int i = R.id.ivFirstPlayerPairTeamLogo;
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(view, R.id.ivFirstPlayerPairTeamLogo);
        if (roundCornerImageView != null) {
            i = R.id.ivSecondPlayerPairTeamLogo;
            RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) yum0.f(view, R.id.ivSecondPlayerPairTeamLogo);
            if (roundCornerImageView2 != null) {
                i = R.id.ivTeamLogo;
                RoundCornerImageView roundCornerImageView3 = (RoundCornerImageView) yum0.f(view, R.id.ivTeamLogo);
                if (roundCornerImageView3 != null) {
                    i = R.id.llPairTeamContainerLogos;
                    LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.llPairTeamContainerLogos);
                    if (linearLayout != null) {
                        return new jk3((FrameLayout) view, roundCornerImageView, roundCornerImageView2, roundCornerImageView3, linearLayout, (byte) 8);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static jk3 b(ViewGroup viewGroup) {
        int i = R.id.nextImageView;
        ImageView imageView = (ImageView) yum0.f(viewGroup, R.id.nextImageView);
        if (imageView != null) {
            i = R.id.previousImageView;
            ImageView imageView2 = (ImageView) yum0.f(viewGroup, R.id.previousImageView);
            if (imageView2 != null) {
                i = R.id.searchPanel;
                FrameLayout frameLayout = (FrameLayout) yum0.f(viewGroup, R.id.searchPanel);
                if (frameLayout != null) {
                    i = R.id.searchResult;
                    TextView textView = (TextView) yum0.f(viewGroup, R.id.searchResult);
                    if (textView != null) {
                        return new jk3(viewGroup, imageView, imageView2, frameLayout, textView, (byte) 10);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f16646a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                return (AppUpdateBottomView) viewGroup;
            case 1:
                return (AppUpdateScreenLayout) this.c;
            case 2:
                return (DsCellMiddleTitle) viewGroup;
            case 3:
                return (ConstraintLayout) viewGroup;
            case 4:
                return (FrameLayout) viewGroup;
            case 5:
                return (DisciplineBannerView) viewGroup;
            case 6:
                return (ConstraintLayout) viewGroup;
            case 7:
                return (ConstraintLayout) viewGroup;
            case 8:
                return (FrameLayout) viewGroup;
            case 9:
                return (ConstraintLayout) viewGroup;
            case 10:
                return viewGroup;
            case 11:
                return (DsMenuCompactCell) viewGroup;
            case 12:
                return (DsShimmerCell) viewGroup;
            case 13:
                return (CyberDurakCardDeckView) viewGroup;
            case 14:
                return (ConstraintLayout) viewGroup;
            case 15:
                return (ConstraintLayout) viewGroup;
            default:
                return (ConstraintLayout) viewGroup;
        }
    }

    public jk3(AppUpdateScreenLayout appUpdateScreenLayout, AppCompatImageButton appCompatImageButton, Barrier barrier, AppUpdateBottomView appUpdateBottomView, DownloadView downloadView) {
        this.f16646a = (byte) 1;
        this.c = appUpdateScreenLayout;
        this.d = appCompatImageButton;
        this.e = barrier;
        this.b = appUpdateBottomView;
        this.f = downloadView;
    }

    public /* synthetic */ jk3(ViewGroup viewGroup, View view, View view2, View view3, View view4, byte b) {
        this.f16646a = b;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
        this.e = view3;
        this.f = view4;
    }
}
