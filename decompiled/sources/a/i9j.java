package a;

import android.widget.ImageView;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import org.xplatform.cyber.game.universal.impl.presentation.dartslive.view.DartsLiveView;

/* JADX INFO: loaded from: classes4.dex */
public final class i9j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f14389a;
    public final /* synthetic */ s8j b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ ImageView f;

    public i9j(ImageView imageView, ImageView imageView2, DartsLiveView dartsLiveView, s8j s8jVar, float f, float f2, Map map, ImageView imageView3) {
        this.f14389a = imageView2;
        this.b = s8jVar;
        this.c = f;
        this.d = f2;
        this.e = map;
        this.f = imageView3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object next;
        Pair pair;
        ImageView imageView = this.f14389a;
        float width = (imageView.getWidth() / 2.0f) + imageView.getX();
        float height = (imageView.getHeight() / 2.0f) + imageView.getY();
        int i = DartsLiveView.t;
        float f = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        s8j s8jVar = this.b;
        tcq0 tcq0Var = s8jVar.e;
        int iOrdinal = tcq0Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 4) {
            Iterator it = mnh0.d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((mnh0) next).f22088a != s8jVar.c);
            mnh0 mnh0Var = (mnh0) next;
            if (mnh0Var != null) {
                float f2 = mnh0Var.b + 9.0f;
                int iOrdinal2 = tcq0Var.ordinal();
                if (iOrdinal2 == 0) {
                    f = 0.3f;
                } else if (iOrdinal2 == 1) {
                    f = 0.125f;
                } else if (iOrdinal2 == 4) {
                    f = 0.43f;
                }
                float width2 = imageView.getWidth() * f;
                double radians = (float) Math.toRadians(f2);
                float fCos = ((float) Math.cos(radians)) * width2;
                float fSin = (-width2) * ((float) Math.sin(radians));
                Collection<ImageView> collectionValues = this.e.values();
                int i2 = 0;
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    for (ImageView imageView2 : collectionValues) {
                        if (((float) Math.sqrt(((float) Math.pow(((((imageView2.getWidth() / 4.3f) + imageView2.getTranslationX()) - imageView.getX()) - (imageView.getWidth() * 0.5f)) - fCos, 2.0d)) + ((float) Math.pow((-(((imageView2.getTranslationY() + imageView2.getHeight()) - imageView.getY()) - (imageView.getHeight() * 0.5f))) - fSin, 2.0d)))) < imageView.getWidth() * 0.05f && (i2 = i2 + 1) < 0) {
                            q3d.o();
                            throw null;
                        }
                    }
                }
                pair = new Pair(Float.valueOf((imageView.getWidth() * 0.02f * i2) + fCos), Float.valueOf(fSin));
            } else {
                pair = new Pair(fValueOf, fValueOf);
            }
        } else {
            pair = new Pair(Float.valueOf((imageView.getWidth() * this.c) / 440.0f), Float.valueOf((imageView.getHeight() * this.d) / 440.0f));
        }
        float fFloatValue = ((Number) pair.f46059a).floatValue();
        float fFloatValue2 = ((Number) pair.b).floatValue();
        ImageView imageView3 = this.f;
        imageView3.setTranslationX((width + fFloatValue) - (imageView3.getWidth() / 4.3f));
        imageView3.setTranslationY((height - fFloatValue2) - imageView3.getHeight());
    }
}
