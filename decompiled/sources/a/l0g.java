package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l0g extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0g f19199a = new l0g(1, xlg.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/cyber/game/core/databinding/CyberDialogActionBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.cyber_dialog_action, (ViewGroup) null, false);
        int i = R.id.expandMarkets;
        LinearLayout linearLayout = (LinearLayout) yum0.f(viewInflate, R.id.expandMarkets);
        if (linearLayout != null) {
            i = R.id.favorite;
            LinearLayout linearLayout2 = (LinearLayout) yum0.f(viewInflate, R.id.favorite);
            if (linearLayout2 != null) {
                i = R.id.favoriteIcon;
                ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.favoriteIcon);
                if (imageView != null) {
                    i = R.id.favoriteTitle;
                    TextView textView = (TextView) yum0.f(viewInflate, R.id.favoriteTitle);
                    if (textView != null) {
                        i = R.id.ivExpandMarkets;
                        ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.ivExpandMarkets);
                        if (imageView2 != null) {
                            i = R.id.ivMarketSettings;
                            ImageView imageView3 = (ImageView) yum0.f(viewInflate, R.id.ivMarketSettings);
                            if (imageView3 != null) {
                                i = R.id.marketGraph;
                                LinearLayout linearLayout3 = (LinearLayout) yum0.f(viewInflate, R.id.marketGraph);
                                if (linearLayout3 != null) {
                                    i = R.id.marketSettings;
                                    LinearLayout linearLayout4 = (LinearLayout) yum0.f(viewInflate, R.id.marketSettings);
                                    if (linearLayout4 != null) {
                                        i = R.id.notification;
                                        LinearLayout linearLayout5 = (LinearLayout) yum0.f(viewInflate, R.id.notification);
                                        if (linearLayout5 != null) {
                                            i = R.id.notificationIcon;
                                            ImageView imageView4 = (ImageView) yum0.f(viewInflate, R.id.notificationIcon);
                                            if (imageView4 != null) {
                                                LinearLayout linearLayout6 = (LinearLayout) viewInflate;
                                                i = R.id.sFavorite;
                                                DsSeparator dsSeparator = (DsSeparator) yum0.f(viewInflate, R.id.sFavorite);
                                                if (dsSeparator != null) {
                                                    i = R.id.sMarketGraph;
                                                    DsSeparator dsSeparator2 = (DsSeparator) yum0.f(viewInflate, R.id.sMarketGraph);
                                                    if (dsSeparator2 != null) {
                                                        i = R.id.sMarketSettings;
                                                        DsSeparator dsSeparator3 = (DsSeparator) yum0.f(viewInflate, R.id.sMarketSettings);
                                                        if (dsSeparator3 != null) {
                                                            i = R.id.sNotification;
                                                            DsSeparator dsSeparator4 = (DsSeparator) yum0.f(viewInflate, R.id.sNotification);
                                                            if (dsSeparator4 != null) {
                                                                i = R.id.sStatistics;
                                                                DsSeparator dsSeparator5 = (DsSeparator) yum0.f(viewInflate, R.id.sStatistics);
                                                                if (dsSeparator5 != null) {
                                                                    i = R.id.sStatisticsSetup;
                                                                    DsSeparator dsSeparator6 = (DsSeparator) yum0.f(viewInflate, R.id.sStatisticsSetup);
                                                                    if (dsSeparator6 != null) {
                                                                        i = R.id.statistics;
                                                                        LinearLayout linearLayout7 = (LinearLayout) yum0.f(viewInflate, R.id.statistics);
                                                                        if (linearLayout7 != null) {
                                                                            i = R.id.statisticsSetup;
                                                                            LinearLayout linearLayout8 = (LinearLayout) yum0.f(viewInflate, R.id.statisticsSetup);
                                                                            if (linearLayout8 != null) {
                                                                                i = R.id.statisticsSetupIc;
                                                                                ImageView imageView5 = (ImageView) yum0.f(viewInflate, R.id.statisticsSetupIc);
                                                                                if (imageView5 != null) {
                                                                                    i = R.id.stream;
                                                                                    DsSettingsCell dsSettingsCell = (DsSettingsCell) yum0.f(viewInflate, R.id.stream);
                                                                                    if (dsSettingsCell != null) {
                                                                                        i = R.id.swStream;
                                                                                        DsCellRightSwitch dsCellRightSwitch = (DsCellRightSwitch) yum0.f(viewInflate, R.id.swStream);
                                                                                        if (dsCellRightSwitch != null) {
                                                                                            i = R.id.tvExpandMarkets;
                                                                                            TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvExpandMarkets);
                                                                                            if (textView2 != null) {
                                                                                                return new xlg(linearLayout6, linearLayout, linearLayout2, imageView, textView, imageView2, imageView3, linearLayout3, linearLayout4, linearLayout5, imageView4, dsSeparator, dsSeparator2, dsSeparator3, dsSeparator4, dsSeparator5, dsSeparator6, linearLayout7, linearLayout8, imageView5, dsSettingsCell, dsCellRightSwitch, textView2);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
