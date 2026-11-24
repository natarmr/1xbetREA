package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetSpacing;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes.dex */
public final class dub0 extends ConstraintLayout {
    public final dc3 q;

    public dub0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.preset_title_with_buttons, this);
        int i = R.id.btnNextBlock;
        DsButton dsButton = (DsButton) yum0.f(this, R.id.btnNextBlock);
        if (dsButton != null) {
            i = R.id.btnPrevBlock;
            DsButton dsButton2 = (DsButton) yum0.f(this, R.id.btnPrevBlock);
            if (dsButton2 != null) {
                i = R.id.llTitleWithButtons;
                if (((LinearLayout) yum0.f(this, R.id.llTitleWithButtons)) != null) {
                    i = R.id.spacing;
                    if (((DsPresetSpacing) yum0.f(this, R.id.spacing)) != null) {
                        i = R.id.tvTitle;
                        TextView textView = (TextView) yum0.f(this, R.id.tvTitle);
                        if (textView != null) {
                            this.q = new dc3(this, dsButton, dsButton2, textView, (byte) 9);
                            Drawable drawable = dsButton2.getContext().getDrawable(R.drawable.ic_glyph_chevron_left);
                            Drawable drawable2 = dsButton.getContext().getDrawable(R.drawable.ic_glyph_chevron_right);
                            if (drawable != null) {
                                drawable.setAutoMirrored(true);
                            }
                            if (drawable2 != null) {
                                drawable2.setAutoMirrored(true);
                            }
                            AppCompatImageView icon = dsButton2.getIcon();
                            if (icon != null) {
                                icon.setImageDrawable(drawable);
                            }
                            AppCompatImageView icon2 = dsButton.getIcon();
                            if (icon2 != null) {
                                icon2.setImageDrawable(drawable2);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void setNextButtonAlpha(float f) {
        ((DsButton) this.q.c).setAlpha(f);
    }

    public final void setNextButtonClickAction(Function0<Unit> function0) {
        function0.getClass();
        dyb.O((DsButton) this.q.c, new r3w(function0, (byte) 18));
    }

    public final void setNextButtonEnable(boolean z) {
        ((DsButton) this.q.c).setEnabled(z);
    }

    public final void setPreviousButtonAlpha(float f) {
        ((DsButton) this.q.d).setAlpha(f);
    }

    public final void setPreviousButtonClickAction(Function0<Unit> function0) {
        function0.getClass();
        dyb.O((DsButton) this.q.d, new r3w(function0, (byte) 17));
    }

    public final void setPreviousButtonEnable(boolean z) {
        ((DsButton) this.q.d).setEnabled(z);
    }

    public final void setTitle(String str) {
        str.getClass();
        ((TextView) this.q.e).setText(str);
    }
}
