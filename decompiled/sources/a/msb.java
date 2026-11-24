package a;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class msb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22309a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public msb(View view) {
        this.f22309a = view.getTranslationX();
        this.b = view.getTranslationY();
        WeakHashMap weakHashMap = rgu0.f30456a;
        this.c = view.getTranslationZ();
        this.d = view.getScaleX();
        this.e = view.getScaleY();
        this.f = view.getRotationX();
        this.g = view.getRotationY();
        this.h = view.getRotation();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof msb)) {
            return false;
        }
        msb msbVar = (msb) obj;
        return msbVar.f22309a == this.f22309a && msbVar.b == this.b && msbVar.c == this.c && msbVar.d == this.d && msbVar.e == this.e && msbVar.f == this.f && msbVar.g == this.g && msbVar.h == this.h;
    }

    public final int hashCode() {
        float f = this.f22309a;
        int iFloatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
        float f2 = this.b;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.c;
        int iFloatToIntBits3 = (iFloatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
        float f4 = this.d;
        int iFloatToIntBits4 = (iFloatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
        float f5 = this.e;
        int iFloatToIntBits5 = (iFloatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
        float f6 = this.f;
        int iFloatToIntBits6 = (iFloatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
        float f7 = this.g;
        int iFloatToIntBits7 = (iFloatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
        float f8 = this.h;
        return iFloatToIntBits7 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
    }
}
