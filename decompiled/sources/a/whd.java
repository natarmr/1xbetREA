package a;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class whd extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z6k f39162a;
    public final long b;
    public final Function1 c;

    public whd(z6k z6kVar, long j, Function1 function1) {
        this.f39162a = z6kVar;
        this.b = j;
        this.c = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        a6a a6aVar = new a6a();
        k6z k6zVar = k6z.f17794a;
        Canvas canvas2 = vw2.f38128a;
        uw2 uw2Var = new uw2();
        uw2Var.f36374a = canvas;
        z5a z5aVar = a6aVar.f308a;
        w6k w6kVar = z5aVar.f43806a;
        k6z k6zVar2 = z5aVar.b;
        x5a x5aVar = z5aVar.c;
        long j = z5aVar.d;
        z5aVar.f43806a = this.f39162a;
        z5aVar.b = k6zVar;
        z5aVar.c = uw2Var;
        z5aVar.d = this.b;
        uw2Var.l();
        this.c.invoke(a6aVar);
        uw2Var.i();
        z5aVar.f43806a = w6kVar;
        z5aVar.b = k6zVar2;
        z5aVar.c = x5aVar;
        z5aVar.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        z6k z6kVar = this.f39162a;
        point.set(z6kVar.T(fIntBitsToFloat / z6kVar.getDensity()), z6kVar.T(Float.intBitsToFloat((int) (j & 4294967295L)) / z6kVar.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
