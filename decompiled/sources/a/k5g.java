package a;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class k5g implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetector f17717a;
    public final /* synthetic */ n5g b;

    public k5g(n5g n5gVar, Context context) {
        this.b = n5gVar;
        this.f17717a = new GestureDetector(context, new g5g(this, (byte) 1));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getClass();
        motionEvent.getClass();
        return this.f17717a.onTouchEvent(motionEvent);
    }
}
