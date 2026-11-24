package a;

import android.app.Dialog;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import org.xplatform.cyber.calendar.impl.presentation.content.day.CyberCalendarDayFlingRecyclerView;
import org.xplatform.games_mania.presentation.views.GamesManiaMapView;
import org.xplatform.market_statistic.ui.statisticwidget.LineChartView;
import org.xplatform.picker.api.presentation.PickerParams;
import org.xplatform.ui_core.viewcomponents.views.SwipeBackLayout;
import org.xplatform.ui_core.viewcomponents.views.search.SearchMaterialViewNew;
import org.xplatform.uikit.components.password_requirement.DsPasswordRequirement;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jw5 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17234a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jw5(Object obj, byte b) {
        this.f17234a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        BottomSheetBehavior bottomSheetBehaviorM0;
        Dialog dialog;
        BottomSheetBehavior bottomSheetBehavior;
        Dialog dialog2;
        byte b = this.f17234a;
        Object obj = this.b;
        switch (b) {
            case 0:
                nw5 nw5Var = (nw5) obj;
                iiy[] iiyVarArr = nw5.d2;
                if (nw5Var.N() && nw5Var.Q() && !nw5Var.Z1) {
                    BottomSheetBehavior bottomSheetBehaviorM1 = nw5Var.M0();
                    if (bottomSheetBehaviorM1 != null) {
                        bottomSheetBehaviorM1.L = motionEvent.getAction() == 3 || motionEvent.getAction() == 1;
                    }
                    if (nw5Var.a2 && nw5Var.N1 && (bottomSheetBehaviorM0 = nw5Var.M0()) != null && bottomSheetBehaviorM0.L && !nw5Var.R() && (dialog = nw5Var.S1) != null) {
                        dialog.cancel();
                    }
                }
                return false;
            case 1:
                kud kudVar = axe.e2;
                return ((axe) obj).G0();
            case 2:
                ((CyberCalendarDayFlingRecyclerView) obj).o2.onTouchEvent(motionEvent);
                return false;
            case 3:
                til tilVar = (til) obj;
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis() - tilVar.o;
                    if (jUptimeMillis < 0 || jUptimeMillis > 300) {
                        tilVar.m = false;
                    }
                    tilVar.t();
                    tilVar.m = true;
                    tilVar.o = SystemClock.uptimeMillis();
                }
                return false;
            case 4:
                stl stlVar = (stl) obj;
                iiy[] iiyVarArr2 = stl.f2;
                if (stlVar.N() && stlVar.Q() && !stlVar.d2) {
                    BottomSheetBehavior bottomSheetBehavior2 = stlVar.c2;
                    if (bottomSheetBehavior2 != null) {
                        bottomSheetBehavior2.L = motionEvent.getAction() == 3 || motionEvent.getAction() == 1;
                    }
                    if (stlVar.a2 && stlVar.N1 && (bottomSheetBehavior = stlVar.c2) != null && bottomSheetBehavior.L && !stlVar.R() && (dialog2 = stlVar.S1) != null) {
                        dialog2.cancel();
                    }
                }
                return false;
            case 5:
                int i = DsPasswordRequirement.c;
                TouchDelegate touchDelegate = ((DsPasswordRequirement) obj).getTouchDelegate();
                if (touchDelegate != null) {
                    return touchDelegate.onTouchEvent(motionEvent);
                }
                return false;
            case 6:
                ((GestureDetector) obj).onTouchEvent(motionEvent);
                return true;
            case 7:
                b8t b8tVar = (b8t) obj;
                iiy[] iiyVarArr3 = b8t.Q1;
                int action = motionEvent.getAction();
                if (action == 0) {
                    b8tVar.I0().y();
                } else if (action == 1) {
                    GamesManiaMapView gamesManiaMapView = b8tVar.H0().g;
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (!gamesManiaMapView.i1 && gamesManiaMapView.u1 != m9t.e) {
                        for (l4i0 l4i0Var : gamesManiaMapView.h1) {
                            int iJ = gamesManiaMapView.j(l4i0Var.b);
                            int iK = gamesManiaMapView.k(l4i0Var.f19407a);
                            int i2 = gamesManiaMapView.j;
                            int i3 = iJ + i2;
                            int i4 = (int) x;
                            if (iJ <= i4 && i4 <= i3) {
                                int i5 = i2 + iK;
                                int i6 = (int) y;
                                if (iK <= i6 && i6 <= i5 && l4i0Var.f) {
                                    gamesManiaMapView.j1 = gamesManiaMapView.h1.indexOf(l4i0Var);
                                    gamesManiaMapView.r1 = l4i0Var.d;
                                    gamesManiaMapView.u1 = m9t.e;
                                    gamesManiaMapView.invalidate();
                                }
                            }
                        }
                    }
                }
                return true;
            case 8:
                try {
                    ((SwipeBackLayout) ((c0x) obj).d.f).dispatchTouchEvent(motionEvent);
                    break;
                } catch (Exception unused) {
                }
                return true;
            case 9:
                wik wikVar = (wik) obj;
                bst bstVar = a3x.a2;
                try {
                    wikVar.d.dispatchTouchEvent(motionEvent);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return true;
            case 10:
                s730 s730Var = (s730) obj;
                atz atzVar = s730.Q1;
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    s730Var.G0().b.b(motionEvent.getX(), motionEvent.getY());
                } else if (action2 == 1) {
                    LineChartView lineChartView = s730Var.G0().b;
                    lineChartView.c();
                    lineChartView.v = false;
                    lineChartView.B.invoke();
                    lineChartView.x = -1.0f;
                    lineChartView.postInvalidate();
                } else if (action2 == 2) {
                    s730Var.G0().b.b(motionEvent.getX(), motionEvent.getY());
                }
                return true;
            case 11:
                cp cpVar = (cp) obj;
                if (motionEvent.getAction() == 1) {
                    ((fz60) cpVar.u).b.performClick();
                }
                return true;
            case 12:
                zo90 zo90Var = (zo90) obj;
                fl70 fl70Var = zo90.p2;
                if (motionEvent.getAction() == 0) {
                    es90 es90VarW0 = zo90Var.W0();
                    if (es90VarW0.e instanceof PickerParams.Phone) {
                        es90VarW0.j.z();
                    }
                }
                return false;
            case 13:
                SearchMaterialViewNew searchMaterialViewNew = (SearchMaterialViewNew) obj;
                if (motionEvent.getAction() == 0) {
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    xiv0 xiv0VarA = jgu0.a(searchMaterialViewNew);
                    if (xiv0VarA != null && xiv0VarA.f40966a.u(8)) {
                        j120.X(searchMaterialViewNew);
                    }
                }
                return false;
            default:
                SwipeBackLayout swipeBackLayout = (SwipeBackLayout) obj;
                int i7 = SwipeBackLayout.q;
                if (motionEvent.getAction() == 0) {
                    swipeBackLayout.f = motionEvent.getRawY();
                    swipeBackLayout.h = motionEvent.getRawX();
                } else if (motionEvent.getAction() == 2) {
                    swipeBackLayout.g = motionEvent.getRawY();
                    swipeBackLayout.h = motionEvent.getRawX();
                    Math.abs(swipeBackLayout.g - swipeBackLayout.f);
                    swipeBackLayout.f = swipeBackLayout.g;
                    Math.abs(0.0f - swipeBackLayout.h);
                    swipeBackLayout.h = 0.0f;
                }
                return false;
        }
    }
}
