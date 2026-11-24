package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pbi0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pbi0 f26709a = new pbi0(1, p4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/security/impl/databinding/FragmentSendConfirmSmsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.cellAuthenticator;
        DsSettingsCell dsSettingsCell = (DsSettingsCell) yum0.f(view, R.id.cellAuthenticator);
        if (dsSettingsCell != null) {
            i = R.id.cellCallCode;
            DsSettingsCell dsSettingsCell2 = (DsSettingsCell) yum0.f(view, R.id.cellCallCode);
            if (dsSettingsCell2 != null) {
                i = R.id.cellCodeSms;
                DsSettingsCell dsSettingsCell3 = (DsSettingsCell) yum0.f(view, R.id.cellCodeSms);
                if (dsSettingsCell3 != null) {
                    i = R.id.cellTelegram;
                    DsSettingsCell dsSettingsCell4 = (DsSettingsCell) yum0.f(view, R.id.cellTelegram);
                    if (dsSettingsCell4 != null) {
                        i = R.id.cellVoiceSms;
                        DsSettingsCell dsSettingsCell5 = (DsSettingsCell) yum0.f(view, R.id.cellVoiceSms);
                        if (dsSettingsCell5 != null) {
                            i = R.id.header;
                            if (((DsHeader) yum0.f(view, R.id.header)) != null) {
                                i = R.id.linearLayoutDescription;
                                if (((LinearLayout) yum0.f(view, R.id.linearLayoutDescription)) != null) {
                                    i = R.id.llItems;
                                    if (((LinearLayout) yum0.f(view, R.id.llItems)) != null) {
                                        i = R.id.navigationBar;
                                        DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
                                        if (dsNavigationBar != null) {
                                            i = R.id.nsvContainer;
                                            if (((NestedScrollView) yum0.f(view, R.id.nsvContainer)) != null) {
                                                i = R.id.progress;
                                                FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progress);
                                                if (frameLayout != null) {
                                                    i = R.id.textViewDescription;
                                                    MaterialTextView materialTextView = (MaterialTextView) yum0.f(view, R.id.textViewDescription);
                                                    if (materialTextView != null) {
                                                        i = R.id.textViewDisableSpam;
                                                        MaterialTextView materialTextView2 = (MaterialTextView) yum0.f(view, R.id.textViewDisableSpam);
                                                        if (materialTextView2 != null) {
                                                            i = R.id.textViewInfoDescription;
                                                            MaterialTextView materialTextView3 = (MaterialTextView) yum0.f(view, R.id.textViewInfoDescription);
                                                            if (materialTextView3 != null) {
                                                                return new p4r((ConstraintLayout) view, dsSettingsCell, dsSettingsCell2, dsSettingsCell3, dsSettingsCell4, dsSettingsCell5, dsNavigationBar, frameLayout, materialTextView, materialTextView2, materialTextView3);
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
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
