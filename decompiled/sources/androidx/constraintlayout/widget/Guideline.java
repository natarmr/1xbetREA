package androidx.constraintlayout.widget;

import a.a3e;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f45352a;

    public Guideline(Context context) {
        super(context);
        this.f45352a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f45352a = z;
    }

    public void setGuidelineBegin(int i) {
        a3e a3eVar = (a3e) getLayoutParams();
        if (this.f45352a && a3eVar.f167a == i) {
            return;
        }
        a3eVar.f167a = i;
        setLayoutParams(a3eVar);
    }

    public void setGuidelineEnd(int i) {
        a3e a3eVar = (a3e) getLayoutParams();
        if (this.f45352a && a3eVar.b == i) {
            return;
        }
        a3eVar.b = i;
        setLayoutParams(a3eVar);
    }

    public void setGuidelinePercent(float f) {
        a3e a3eVar = (a3e) getLayoutParams();
        if (this.f45352a && a3eVar.c == f) {
            return;
        }
        a3eVar.c = f;
        setLayoutParams(a3eVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45352a = true;
        super.setVisibility(8);
    }
}
