package org.xplatform.ui_core.viewcomponents.views.search;

import a.i120;
import a.j5d;
import a.qx3;
import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.d;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class SearchMaterialView extends d {
    public final View J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMaterialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewFindViewById = findViewById(R.id.search_src_text);
        viewFindViewById.getClass();
        EditText editText = (EditText) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.search_edit_frame);
        viewFindViewById2.getClass();
        this.J1 = viewFindViewById2;
        int iY = i120.Y(context, 8.0f);
        int iY2 = i120.Y(context, 16.0f);
        int iY3 = i120.Y(context, 4.0f);
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.leftMargin = iY;
        }
        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
        layoutParams3.getClass();
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.leftMargin = 0;
        layoutParams4.rightMargin = iY2;
        layoutParams4.topMargin = iY3;
        layoutParams4.bottomMargin = iY3;
        TypedValue typedValue = j5d.f15927a;
        Context context2 = getContext();
        context2.getClass();
        editText.setTextColor(context2.getColor(R.color.static_white));
        Context context3 = getContext();
        context3.getClass();
        editText.setHintTextColor(context3.getColor(R.color.static_white_60));
        setIconifiedByDefault(false);
        setText(R.string.input_query_message);
        InputFilter[] filters = editText.getFilters();
        filters.getClass();
        editText.setFilters((InputFilter[]) qx3.q(new InputFilter.LengthFilter(100), filters));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.search_mag_icon);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById(R.id.search_close_btn);
        appCompatImageView.setImageDrawable(null);
        if (8 != appCompatImageView.getVisibility()) {
            appCompatImageView.setVisibility(8);
        }
        appCompatImageView2.setImageResource(R.drawable.ic_close_material);
    }

    public final void setText(int i) {
        setQueryHint(getContext().getString(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchMaterialView(Context context) {
        this(context, null);
        context.getClass();
    }
}
