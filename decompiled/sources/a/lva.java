package a;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class lva extends mva {
    public final /* synthetic */ byte b;
    public final /* synthetic */ CarouselLayoutManager c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lva(CarouselLayoutManager carouselLayoutManager, byte b) {
        super(1);
        this.b = b;
        switch (b) {
            case 1:
                this.c = carouselLayoutManager;
                super(0);
                break;
            default:
                this.c = carouselLayoutManager;
                break;
        }
    }

    @Override // a.mva
    public final int a() {
        byte b = this.b;
        CarouselLayoutManager carouselLayoutManager = this.c;
        switch (b) {
            case 0:
                return carouselLayoutManager.o;
            default:
                return carouselLayoutManager.o - carouselLayoutManager.getPaddingBottom();
        }
    }

    @Override // a.mva
    public final int b() {
        switch (this.b) {
            case 0:
                return this.c.getPaddingLeft();
            default:
                return 0;
        }
    }

    @Override // a.mva
    public final int c() {
        byte b = this.b;
        CarouselLayoutManager carouselLayoutManager = this.c;
        switch (b) {
            case 0:
                return carouselLayoutManager.n - carouselLayoutManager.getPaddingRight();
            default:
                return carouselLayoutManager.n;
        }
    }

    @Override // a.mva
    public final int d() {
        switch (this.b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.c;
                if (carouselLayoutManager.W0()) {
                    return carouselLayoutManager.n;
                }
                return 0;
        }
    }

    @Override // a.mva
    public final int e() {
        switch (this.b) {
            case 0:
                return 0;
            default:
                return this.c.getPaddingTop();
        }
    }
}
