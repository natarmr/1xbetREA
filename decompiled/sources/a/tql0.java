package a;

import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes5.dex */
public final class tql0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34387a;
    public final ImageView b;
    public final DsShimmerView c;
    public final DsShimmerView d;
    public final TextView e;
    public int f;
    public int g;
    public int h;
    public final n0o0 i;

    public tql0(ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, null, 0);
        ImageView imageView = new ImageView(contextThemeWrapper);
        this.b = imageView;
        DsShimmerView dsShimmerView = new DsShimmerView(contextThemeWrapper, null, 6);
        this.c = dsShimmerView;
        DsShimmerView dsShimmerView2 = new DsShimmerView(contextThemeWrapper, null, 6);
        this.d = dsShimmerView2;
        TextView textView = new TextView(contextThemeWrapper);
        this.e = textView;
        this.h = getResources().getDimensionPixelSize(R.dimen.text_10);
        this.i = maz.b(new goi0(this, (byte) 16));
        u5l0 u5l0Var = new u5l0((Object) this, (Object) contextThemeWrapper, (byte) 9);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, cqd0.k, 0, 0);
        u5l0Var.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        addView(imageView);
        addView(textView);
        addView(dsShimmerView);
        addView(dsShimmerView2);
    }

    private final r0x getIconLoadHelper() {
        return (r0x) this.i.getValue();
    }

    public void setIcon(o0x o0xVar) {
        o0xVar.getClass();
        r0x.d(getIconLoadHelper(), o0xVar, new m0x(R.drawable.ic_glyph_category_new, null, 6), null, 12);
        this.b.setColorFilter(this.g);
    }

    public void setTitle(String str) {
        setTag(str);
        int i = (str == null || str.length() == 0) ? 8 : 0;
        TextView textView = this.e;
        textView.setVisibility(i);
        textView.setText(str);
    }
}
