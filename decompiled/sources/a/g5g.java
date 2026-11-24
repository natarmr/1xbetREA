package a;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;
import org.xplatform.cyber.calendar.impl.presentation.container.champinfo.CyberCalendarChampInfoParams;
import org.xplatform.cyber.calendar.impl.presentation.content.day.CyberCalendarDayFlingRecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class g5g extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10715a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g5g(Object obj, byte b) {
        this.f10715a = b;
        this.b = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.f10715a) {
            case 3:
                motionEvent.getClass();
                motionEvent.getX();
                motionEvent.getY();
                return true;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f10715a) {
            case 1:
                motionEvent.getClass();
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        byte b = this.f10715a;
        Object obj = this.b;
        switch (b) {
            case 0:
                motionEvent2.getClass();
                if (motionEvent == null) {
                    return false;
                }
                float x = motionEvent2.getX() - motionEvent.getX();
                if (Math.abs(x) <= Math.abs(motionEvent2.getY() - motionEvent.getY()) || Math.abs(f) <= 300.0f) {
                    return false;
                }
                h5g h5gVar = ((CyberCalendarDayFlingRecyclerView) obj).p2;
                if (x > 0.0f) {
                    if (h5gVar != null) {
                        n5g n5gVar = (n5g) ((a1d) h5gVar).b;
                        qud qudVar = n5g.S1;
                        n5gVar.I0().z(-1);
                    }
                } else if (h5gVar != null) {
                    n5g n5gVar2 = (n5g) ((a1d) h5gVar).b;
                    qud qudVar2 = n5g.S1;
                    n5gVar2.I0().z(1);
                }
                return true;
            case 1:
                motionEvent2.getClass();
                float x2 = motionEvent2.getX() - (motionEvent != null ? motionEvent.getX() : 0.0f);
                if (Math.abs(x2) <= 300.0f || Math.abs(f) <= 300.0f) {
                    return false;
                }
                n5g n5gVar3 = ((k5g) obj).b;
                if (x2 > 0.0f) {
                    qud qudVar3 = n5g.S1;
                    n5gVar3.I0().z(-1);
                } else {
                    qud qudVar4 = n5g.S1;
                    n5gVar3.I0().z(1);
                }
                return true;
            case 2:
                motionEvent2.getClass();
                float y = motionEvent2.getY() - (motionEvent != null ? motionEvent.getY() : motionEvent2.getY());
                if (f2 <= 0.0f || f2 <= 800.0f || y <= 50.0f) {
                    return false;
                }
                ((rrm) obj).a(3);
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int iU;
        boolean z;
        switch (this.f10715a) {
            case 0:
                motionEvent.getClass();
                CyberCalendarDayFlingRecyclerView cyberCalendarDayFlingRecyclerView = (CyberCalendarDayFlingRecyclerView) this.b;
                View viewJ = cyberCalendarDayFlingRecyclerView.J(motionEvent.getX(), motionEvent.getY());
                if (viewJ == null || (iU = RecyclerView.U(viewJ)) == -1) {
                    return false;
                }
                h5g h5gVar = cyberCalendarDayFlingRecyclerView.p2;
                if (h5gVar != null) {
                    n5g n5gVar = (n5g) ((a1d) h5gVar).b;
                    qud qudVar = n5g.S1;
                    Object obj = n5gVar.H0().e.f.get(iU);
                    w5g w5gVar = obj instanceof w5g ? (w5g) obj : null;
                    if (w5gVar != null) {
                        String simpleName = v4g.class.getSimpleName();
                        if (n5gVar.C().J(simpleName) == null) {
                            kud kudVar = v4g.l2;
                            String str = w5gVar.c;
                            l7g l7gVar = w5gVar.b;
                            z = true;
                            CyberCalendarChampInfoParams cyberCalendarChampInfoParams = new CyberCalendarChampInfoParams(str, l7gVar.f19556a, l7gVar.b, l7gVar.c, l7gVar.d, l7gVar.e, l7gVar.f, l7gVar.g, w5gVar.f38582a);
                            boolean z2 = ((CyberCalendarParams) n5gVar.R1.n(n5gVar, n5g.U1[1])).d;
                            kudVar.getClass();
                            kud.f(cyberCalendarChampInfoParams, z2).H0(n5gVar.C(), simpleName);
                        } else {
                            z = true;
                        }
                    } else {
                        z = true;
                    }
                } else {
                    z = true;
                }
                return z;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
