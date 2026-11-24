package org.xplatform.uikit.components.password_requirement;

import a.bqd0;
import a.ktt0;
import a.m5d;
import a.q3d;
import a.twn;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.huawei.hms.android.HwBuildEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class DsBulletList extends AppCompatTextView {
    public static final String j;
    public final int i;

    static {
        String strLineSeparator = System.lineSeparator();
        strLineSeparator.getClass();
        j = strLineSeparator;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsBulletList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        int iB = m5d.b(R.attr.uikitSecondary, context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.k, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        Integer numL = ktt0.l(typedArrayObtainStyledAttributes, 0);
        iB = numL != null ? numL.intValue() : iB;
        ktt0.h(typedArrayObtainStyledAttributes, this, 1);
        setTextColor(iB);
        Context context2 = getContext();
        context2.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId, bqd0.s0);
        this.i = typedArrayObtainStyledAttributes2.getDimensionPixelSize(11, this.i);
        typedArrayObtainStyledAttributes2.recycle();
        typedArrayObtainStyledAttributes.recycle();
        setTextAlignment(5);
    }

    public final void setLabels(List<? extends CharSequence> list) throws IOException {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (((CharSequence) obj).length() > 0) {
                arrayListU.add(obj);
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain("•\t\t", 0, 3, getPaint(), HwBuildEx.VersionCodes.CUR_DEVELOPMENT).setIncludePad(getIncludeFontPadding()).build();
        staticLayoutBuild.getClass();
        int iCeil = (int) Math.ceil(staticLayoutBuild.getLineWidth(0));
        int i = 0;
        for (Object obj2 : arrayListU) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append("•\t\t", new StyleSpan(1), 33);
            spannableStringBuilder.append((CharSequence) obj2);
            spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(0, iCeil), length, spannableStringBuilder.length(), 33);
            if (i != arrayListU.size() - 1) {
                spannableStringBuilder.append('\n');
                spannableStringBuilder.append(j, new AbsoluteSizeSpan(this.i, false), 33);
            }
            i = i2;
        }
        setText(spannableStringBuilder);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsBulletList(Context context) {
        this(context, null);
        context.getClass();
    }
}
