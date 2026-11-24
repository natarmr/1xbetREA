package a;

import android.view.DragEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class wy2 implements View.OnDragListener, ddl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gdl f39957a;
    public final lx3 b;
    public final vy2 c;

    public wy2() {
        gdl gdlVar = new gdl();
        gdlVar.q = 0L;
        this.f39957a = gdlVar;
        this.b = new lx3(0);
        this.c = new vy2(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        a1d a1dVar = new a1d((Object) dragEvent, (byte) 19);
        int action = dragEvent.getAction();
        lx3 lx3Var = this.b;
        byte b = 0;
        gdl gdlVar = this.f39957a;
        switch (action) {
            case 1:
                hie0 hie0Var = new hie0();
                fdl fdlVar = new fdl(a1dVar, gdlVar, hie0Var);
                if (fdlVar.invoke(gdlVar) == gps0.f11699a) {
                    etm0.w(gdlVar, fdlVar);
                }
                boolean z = hie0Var.f13108a;
                bx3 bx3Var = new bx3(lx3Var);
                while (bx3Var.hasNext()) {
                    ((gdl) bx3Var.next()).d1();
                }
                return z;
            case 2:
                gdlVar.c1(a1dVar);
                return false;
            case 3:
                return gdlVar.Z0();
            case 4:
                edl edlVar = new edl(a1dVar, b);
                if (edlVar.invoke(gdlVar) == gps0.f11699a) {
                    etm0.w(gdlVar, edlVar);
                }
                lx3Var.clear();
                return false;
            case 5:
                gdlVar.a1();
                return false;
            case 6:
                gdlVar.b1();
                return false;
            default:
                return false;
        }
    }
}
