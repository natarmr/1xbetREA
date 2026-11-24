package androidx.media3.ui;

import a.bcm0;
import a.btf;
import a.c6a;
import a.ctf;
import a.e9d0;
import a.l5v0;
import a.luy;
import a.n7a;
import a.nfn0;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f45393a;
    public n7a b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;
    public int g;
    public nfn0 h;
    public View i;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45393a = Collections.EMPTY_LIST;
        this.b = n7a.g;
        this.c = 0.0533f;
        this.d = 0.08f;
        this.e = true;
        this.f = true;
        c6a c6aVar = new c6a(context, 0);
        this.h = c6aVar;
        this.i = c6aVar;
        addView(c6aVar);
        this.g = 1;
    }

    private List<ctf> getCuesWithStylingPreferencesApplied() {
        if (this.e && this.f) {
            return this.f45393a;
        }
        ArrayList arrayList = new ArrayList(this.f45393a.size());
        for (int i = 0; i < this.f45393a.size(); i++) {
            btf btfVarA = ((ctf) this.f45393a.get(i)).a();
            if (!this.e) {
                btfVarA.n = false;
                CharSequence charSequenceValueOf = btfVarA.f3180a;
                if (charSequenceValueOf instanceof Spanned) {
                    if (!(charSequenceValueOf instanceof Spannable)) {
                        charSequenceValueOf = SpannableString.valueOf(charSequenceValueOf);
                        btfVarA.f3180a = charSequenceValueOf;
                        btfVarA.b = null;
                    }
                    charSequenceValueOf.getClass();
                    Spannable spannable = (Spannable) charSequenceValueOf;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof luy)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                bcm0.v(btfVarA);
            } else if (!this.f) {
                bcm0.v(btfVarA);
            }
            arrayList.add(btfVarA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private n7a getUserCaptionStyle() {
        CaptioningManager captioningManager;
        boolean zIsInEditMode = isInEditMode();
        n7a n7aVar = n7a.g;
        if (zIsInEditMode || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return n7aVar;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        return new n7a(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
    }

    private <T extends View & nfn0> void setView(T t) {
        removeView(this.i);
        View view = this.i;
        if (view instanceof l5v0) {
            ((l5v0) view).b.destroy();
        }
        this.i = t;
        this.h = t;
        addView(t);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.h.a(getCuesWithStylingPreferencesApplied(), this.b, this.c, this.d);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f = z;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.e = z;
        c();
    }

    public void setBottomPaddingFraction(float f) {
        this.d = f;
        c();
    }

    public void setCues(List<ctf> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f45393a = list;
        c();
    }

    public void setFractionalTextSize(float f) {
        this.c = f;
        c();
    }

    public void setStyle(n7a n7aVar) {
        this.b = n7aVar;
        c();
    }

    public void setViewType(int i) {
        if (this.g == i) {
            return;
        }
        if (i == 1) {
            setView(new c6a(getContext(), 0));
        } else {
            if (i != 2) {
                e9d0.o();
                return;
            }
            setView(new l5v0(getContext()));
        }
        this.g = i;
    }

    public SubtitleView(Context context) {
        this(context, null);
    }
}
