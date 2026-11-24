package a;

import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class oe3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f25104a;
    public final sbe b;
    public Typeface c;
    public Typeface d;
    public String e;

    public oe3(TextView textView, sbe sbeVar) {
        this.f25104a = textView;
        this.b = sbeVar;
    }

    public final boolean a(String str) {
        int i;
        Typeface typeface = this.c;
        TextView textView = this.f25104a;
        TextPaint paint = textView.getPaint();
        if (this.d != paint.getTypeface()) {
            Log.w("FontVarSettings", "getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint().");
            typeface = paint.getTypeface();
        }
        if (Build.VERSION.SDK_INT < 31 || (i = textView.getContext().getResources().getConfiguration().fontWeightAdjustment) == Integer.MAX_VALUE) {
            i = 0;
        }
        if (i == Integer.MAX_VALUE) {
            i = 0;
        }
        Typeface typefaceA = ne3.a(typeface, str, i);
        if (typefaceA == null) {
            return false;
        }
        this.d = typefaceA;
        this.b.accept(typefaceA);
        this.e = str;
        return true;
    }
}
