package a;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class mvv implements hlp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22474a;
    public final s1g b;
    public final int c;
    public final int d;
    public final ImageView e;
    public final int f;
    public String g;

    public mvv(FrameLayout frameLayout) {
        this.f22474a = frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.corner_radius_4);
        s1g s1gVar = new s1g(frameLayout, R.color.static_black_40);
        s1gVar.c(frameLayout.getResources().getDimension(R.dimen.corner_radius_8));
        this.b = s1gVar;
        int dimensionPixelOffset = frameLayout.getResources().getDimensionPixelOffset(R.dimen.size_42);
        this.c = dimensionPixelOffset;
        int dimensionPixelOffset2 = frameLayout.getResources().getDimensionPixelOffset(R.dimen.size_32);
        this.d = dimensionPixelOffset2;
        ImageView imageView = new ImageView(frameLayout.getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelOffset, dimensionPixelOffset2));
        frameLayout.addView(imageView);
        this.e = imageView;
        this.f = frameLayout.getResources().getDimensionPixelOffset(R.dimen.space_4);
        this.g = "";
    }

    @Override // a.hlp0
    public final void a(int i, int i2, int i3, int i4) {
        this.b.b(i, i2, i3, i4);
        int i5 = i + this.f;
        ImageView imageView = this.e;
        imageView.layout(i5, i2, imageView.getMeasuredWidth() + i5, imageView.getMeasuredHeight() + i2);
    }

    @Override // a.hlp0
    public final void b(int i) {
        this.e.measure(View.MeasureSpec.makeMeasureSpec(this.c, 1073741824), View.MeasureSpec.makeMeasureSpec(this.d, 1073741824));
    }

    @Override // a.hlp0
    public final void c(String str, String str2, String str3) {
        str3.getClass();
        if (Intrinsics.d(this.g, str)) {
            return;
        }
        List list = u0d.f34849a;
        u0d.j(this.e, str, R.drawable.dota_statistic_hero_placeholder, 0, kotlin.collections.a.c(new j2x(this.f22474a)), null, null, 492);
        this.g = str3;
    }

    @Override // a.hlp0
    public final void k(Canvas canvas) {
        canvas.getClass();
        this.b.a(canvas);
    }
}
