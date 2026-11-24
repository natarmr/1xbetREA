package a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class s4s extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5s f31622a;
    public final o0x b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4s(Context context, g5s g5sVar, o0x o0xVar) {
        super(context, null, 0);
        context.getClass();
        g5sVar.getClass();
        int i = g5sVar.f;
        int i2 = g5sVar.c;
        int i3 = g5sVar.d;
        o0xVar.getClass();
        final byte b = 0;
        this.f31622a = g5sVar;
        this.b = o0xVar;
        this.c = maz.b(new Function0(this) { // from class: a.q4s
            public final /* synthetic */ s4s b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                s4s s4sVar = this.b;
                switch (b2) {
                    case 0:
                        return (LoadableShapeableImageView) s4sVar.findViewById(R.id.uikitBannerPictureImageView);
                    case 1:
                        return (TextView) s4sVar.findViewById(R.id.uikitBannerLabelTextView);
                    case 2:
                        return s4sVar.findViewById(R.id.uikitBannerGradientView);
                    default:
                        return (ShapeableImageView) s4sVar.findViewById(R.id.uikitBannerTechicalWorksImageView);
                }
            }
        });
        final byte b2 = 1;
        this.d = maz.b(new Function0(this) { // from class: a.q4s
            public final /* synthetic */ s4s b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                s4s s4sVar = this.b;
                switch (b3) {
                    case 0:
                        return (LoadableShapeableImageView) s4sVar.findViewById(R.id.uikitBannerPictureImageView);
                    case 1:
                        return (TextView) s4sVar.findViewById(R.id.uikitBannerLabelTextView);
                    case 2:
                        return s4sVar.findViewById(R.id.uikitBannerGradientView);
                    default:
                        return (ShapeableImageView) s4sVar.findViewById(R.id.uikitBannerTechicalWorksImageView);
                }
            }
        });
        final byte b3 = 2;
        this.e = maz.b(new Function0(this) { // from class: a.q4s
            public final /* synthetic */ s4s b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                s4s s4sVar = this.b;
                switch (b4) {
                    case 0:
                        return (LoadableShapeableImageView) s4sVar.findViewById(R.id.uikitBannerPictureImageView);
                    case 1:
                        return (TextView) s4sVar.findViewById(R.id.uikitBannerLabelTextView);
                    case 2:
                        return s4sVar.findViewById(R.id.uikitBannerGradientView);
                    default:
                        return (ShapeableImageView) s4sVar.findViewById(R.id.uikitBannerTechicalWorksImageView);
                }
            }
        });
        final byte b4 = 3;
        this.f = maz.b(new Function0(this) { // from class: a.q4s
            public final /* synthetic */ s4s b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                s4s s4sVar = this.b;
                switch (b5) {
                    case 0:
                        return (LoadableShapeableImageView) s4sVar.findViewById(R.id.uikitBannerPictureImageView);
                    case 1:
                        return (TextView) s4sVar.findViewById(R.id.uikitBannerLabelTextView);
                    case 2:
                        return s4sVar.findViewById(R.id.uikitBannerGradientView);
                    default:
                        return (ShapeableImageView) s4sVar.findViewById(R.id.uikitBannerTechicalWorksImageView);
                }
            }
        });
        LayoutInflater.from(context).inflate(f5s.f8978a[g5sVar.ordinal()] == 1 ? R.layout.game_collection_rectangle_view : R.layout.game_collection_item_view, (ViewGroup) this, true);
        ViewGroup.LayoutParams layoutParams = getPictureImageView().getLayoutParams();
        layoutParams.width = getResources().getDimensionPixelSize(i3);
        layoutParams.height = getResources().getDimensionPixelSize(i2);
        getPictureImageView().setShapeAppearanceModel(akj0.g(context, i, 0).c());
        ViewGroup.LayoutParams layoutParams2 = getTechnicalWorksImageView().getLayoutParams();
        layoutParams2.width = getResources().getDimensionPixelSize(i3);
        layoutParams2.height = getResources().getDimensionPixelSize(i2);
        getTechnicalWorksImageView().setShapeAppearanceModel(akj0.g(context, i, 0).c());
        cem0.n(g5sVar.g, getLabelTextView());
        getLabelTextView().setWidth(getResources().getDimensionPixelSize(i3));
    }

    private final ShapeableImageView getTechnicalWorksImageView() {
        Object value = this.f.getValue();
        value.getClass();
        return (ShapeableImageView) value;
    }

    public final void a(o0x o0xVar, o0x o0xVar2, o0x o0xVar3, o0x o0xVar4, v4s v4sVar, Function2 function2, ljc0 ljc0Var) {
        v4sVar.getClass();
        this.g = null;
        v4s v4sVar2 = v4s.b;
        g5s g5sVar = this.f31622a;
        if (v4sVar != v4sVar2) {
            int[] iArr = r4s.f29852a;
            o0x o0xVar5 = iArr[g5sVar.ordinal()] == 1 ? o0xVar3 : o0xVar;
            o0x o0xVar6 = o0xVar5;
            getPictureImageView().h(o0xVar6, this.b, new p4s(this, o0xVar5, function2, (byte) 0), new dg(o0xVar6, iArr[g5sVar.ordinal()] == 1 ? o0xVar4 : o0xVar2, this, ljc0Var, function2, (byte) 19));
            return;
        }
        o5n0.r(getPictureImageView()).a();
        LoadableShapeableImageView pictureImageView = getPictureImageView();
        int dimensionPixelSize = getResources().getDimensionPixelSize(g5sVar.c);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(g5sVar.d);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
        Context context = getContext();
        context.getClass();
        int iB = m5d.b(R.attr.uikitPromoCardGradientStart, context);
        Context context2 = getContext();
        context2.getClass();
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{iB, m5d.b(R.attr.uikitPromoCardGradientEnd, context2)});
        Drawable drawableU = epv0.U(R.drawable.ic_glyph_games, getContext());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize2, dimensionPixelSize, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        gradientDrawable.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize);
        gradientDrawable.draw(canvas);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(g5sVar.e);
        int i = (dimensionPixelSize2 - dimensionPixelSize3) / 2;
        int i2 = (dimensionPixelSize - dimensionPixelSize3) / 2;
        if (drawableU != null) {
            drawableU.setBounds(i, i2, i + dimensionPixelSize3, dimensionPixelSize3 + i2);
        }
        if (drawableU != null) {
            drawableU.draw(canvas);
        }
        Resources resources = getResources();
        resources.getClass();
        pictureImageView.setImageDrawable(new BitmapDrawable(resources, bitmapCreateBitmap));
    }

    public final View getGradientView() {
        return (View) this.e.getValue();
    }

    public final TextView getLabelTextView() {
        Object value = this.d.getValue();
        value.getClass();
        return (TextView) value;
    }

    public final String getLoadedPictureUrl() {
        return this.g;
    }

    public final LoadableShapeableImageView getPictureImageView() {
        Object value = this.c.getValue();
        value.getClass();
        return (LoadableShapeableImageView) value;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Resources resources = getResources();
        g5s g5sVar = this.f31622a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(resources.getDimensionPixelSize(g5sVar.b), 1073741824), View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(g5sVar.f10732a), 1073741824));
    }

    public final void setLabel(String str) {
        str.getClass();
        getLabelTextView().setText(str);
        View gradientView = getGradientView();
        if (gradientView != null) {
            g5s g5sVar = this.f31622a;
            g5sVar.getClass();
            gradientView.setVisibility(g5sVar == g5s.Rectangle && str.length() > 0 ? 0 : 8);
        }
    }

    public final void setModel(u4s u4sVar) {
        u4sVar.getClass();
        setType(u4sVar.b);
        a(u4sVar.c, u4sVar.d, u4sVar.e, u4sVar.f, u4sVar.b, u4sVar.h, u4sVar.i);
        setLabel(u4sVar.g);
    }

    public final void setType(v4s v4sVar) {
        v4sVar.getClass();
        getTechnicalWorksImageView().setVisibility(v4sVar == v4s.c ? 0 : 8);
        int iOrdinal = v4sVar.ordinal();
        if (iOrdinal == 1) {
            LoadableShapeableImageView pictureImageView = getPictureImageView();
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
            Context context = getContext();
            context.getClass();
            int iB = m5d.b(R.attr.uikitPromoCardGradientEnd, context);
            Context context2 = getContext();
            context2.getClass();
            pictureImageView.setBackground(new GradientDrawable(orientation, new int[]{iB, m5d.b(R.attr.uikitPromoCardGradientStart, context2)}));
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        ShapeableImageView technicalWorksImageView = getTechnicalWorksImageView();
        Resources resources = getResources();
        g5s g5sVar = this.f31622a;
        int dimensionPixelSize = resources.getDimensionPixelSize(g5sVar.c);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(g5sVar.d);
        Context context3 = getContext();
        context3.getClass();
        ColorDrawable colorDrawable = new ColorDrawable(m5d.b(R.attr.uikitBackgroundLight60, context3));
        Drawable drawableU = epv0.U(R.drawable.ic_glyph_technical_works_with_background, getContext());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize2, dimensionPixelSize, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        colorDrawable.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize);
        colorDrawable.draw(canvas);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(g5sVar.e);
        int i = (dimensionPixelSize2 - dimensionPixelSize3) / 2;
        int i2 = (dimensionPixelSize - dimensionPixelSize3) / 2;
        if (drawableU != null) {
            drawableU.setBounds(i, i2, i + dimensionPixelSize3, dimensionPixelSize3 + i2);
        }
        if (drawableU != null) {
            drawableU.draw(canvas);
        }
        Resources resources2 = getResources();
        resources2.getClass();
        technicalWorksImageView.setImageDrawable(new BitmapDrawable(resources2, bitmapCreateBitmap));
    }
}
