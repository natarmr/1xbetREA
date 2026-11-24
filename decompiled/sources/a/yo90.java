package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetSpacing;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTitle;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.search_field.DsSearchField;
import org.xplatform.uikit.components.separator.DsSeparator;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yo90 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yo90 f42974a = new yo90(1, djk.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/picker/impl/databinding/DialogPickerBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_picker, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        int i = R.id.butAddPhoneCode;
        DsButton dsButton = (DsButton) yum0.f(viewInflate, R.id.butAddPhoneCode);
        if (dsButton != null) {
            i = R.id.ivEnterPhoneCode;
            if (((ImageView) yum0.f(viewInflate, R.id.ivEnterPhoneCode)) != null) {
                i = R.id.ivOfferEnterPhoneCode;
                if (((ImageView) yum0.f(viewInflate, R.id.ivOfferEnterPhoneCode)) != null) {
                    i = R.id.llEnterPhoneCode;
                    LinearLayout linearLayout2 = (LinearLayout) yum0.f(viewInflate, R.id.llEnterPhoneCode);
                    if (linearLayout2 != null) {
                        i = R.id.llOfferEnterPhoneCode;
                        LinearLayout linearLayout3 = (LinearLayout) yum0.f(viewInflate, R.id.llOfferEnterPhoneCode);
                        if (linearLayout3 != null) {
                            i = R.id.rvPicker;
                            RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.rvPicker);
                            if (recyclerView != null) {
                                i = R.id.sfPickerSearch;
                                DsSearchField dsSearchField = (DsSearchField) yum0.f(viewInflate, R.id.sfPickerSearch);
                                if (dsSearchField != null) {
                                    i = R.id.tfEnterPhoneCode;
                                    DsTextField dsTextField = (DsTextField) yum0.f(viewInflate, R.id.tfEnterPhoneCode);
                                    if (dsTextField != null) {
                                        i = R.id.titleSearchSpacing;
                                        if (((DsPresetSpacing) yum0.f(viewInflate, R.id.titleSearchSpacing)) != null) {
                                            i = R.id.tvOfferEnterPhoneCode;
                                            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvOfferEnterPhoneCode);
                                            if (textView != null) {
                                                i = R.id.tvPickerEmptyText;
                                                TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvPickerEmptyText);
                                                if (textView2 != null) {
                                                    i = R.id.tvPikerTitle;
                                                    DsPresetTitle dsPresetTitle = (DsPresetTitle) yum0.f(viewInflate, R.id.tvPikerTitle);
                                                    if (dsPresetTitle != null) {
                                                        i = R.id.vPickerSeparator;
                                                        if (((DsSeparator) yum0.f(viewInflate, R.id.vPickerSeparator)) != null) {
                                                            return new djk(linearLayout, dsButton, linearLayout2, linearLayout3, recyclerView, dsSearchField, dsTextField, textView, textView2, dsPresetTitle);
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
