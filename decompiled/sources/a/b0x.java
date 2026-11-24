package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class b0x extends pj80 {
    public final List b;
    public final /* synthetic */ c0x c;

    public b0x(c0x c0xVar, List list) {
        list.getClass();
        this.c = c0xVar;
        this.b = list;
    }

    @Override // a.pj80
    public final int c() {
        return this.b.size();
    }

    @Override // a.pj80
    public final Object d(ViewPager viewPager, int i) {
        c0x c0xVar = this.c;
        final byte b = 0;
        View viewInflate = LayoutInflater.from(c0xVar.getContext()).inflate(R.layout.gallery_item, (ViewGroup) null, false);
        int i2 = R.id.image;
        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.image);
        if (imageView != null) {
            i2 = R.id.ivPlaceholder;
            ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.ivPlaceholder);
            if (imageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                final bjr bjrVar = new bjr(constraintLayout, imageView, imageView2);
                imageView2.setVisibility(0);
                imageView2.setImageResource(c0xVar.c);
                List list = u0d.f34849a;
                final byte b2 = 1;
                u0d.j(imageView, (String) this.b.get(i), 0, 0, null, new Function1() { // from class: a.a0x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b3 = b;
                        bjr bjrVar2 = bjrVar;
                        switch (b3) {
                            case 0:
                                bjrVar2.c.setVisibility(8);
                                break;
                            default:
                                bjrVar2.c.setVisibility(0);
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, new Function1() { // from class: a.a0x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b3 = b2;
                        bjr bjrVar2 = bjrVar;
                        switch (b3) {
                            case 0:
                                bjrVar2.c.setVisibility(8);
                                break;
                            default:
                                bjrVar2.c.setVisibility(0);
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, 126);
                viewPager.addView(constraintLayout);
                constraintLayout.getClass();
                return constraintLayout;
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }
}
