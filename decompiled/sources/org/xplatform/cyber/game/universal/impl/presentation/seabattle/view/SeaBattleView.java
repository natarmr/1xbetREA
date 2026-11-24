package org.xplatform.cyber.game.universal.impl.presentation.seabattle.view;

import a.a7g0;
import a.ddh0;
import a.epv0;
import a.iun;
import a.maz;
import a.mie0;
import a.n0o0;
import a.oh60;
import a.pdh0;
import a.qdh0;
import a.r3d;
import a.rdh0;
import a.sdh0;
import a.si30;
import a.t9f;
import a.xch0;
import a.ych0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class SeaBattleView extends View {
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46539a;
    public int b;
    public final Paint c;
    public final n0o0 d;
    public List e;
    public List f;
    public xch0 g;
    public int h;
    public List i;
    public final ArrayList j;

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaBattleView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(context.getColor(R.color.uikit_cyber_blue_ton_22));
        this.c = paint;
        this.d = maz.b(new a7g0(this, (byte) 18));
        iun iunVar = iun.f15405a;
        this.e = iunVar;
        this.f = iunVar;
        this.g = xch0.NONE;
        this.i = iunVar;
        this.j = new ArrayList();
    }

    private final ddh0 getSeaBattleField() {
        return (ddh0) this.d.getValue();
    }

    public final void a(Canvas canvas, qdh0 qdh0Var, sdh0 sdh0Var) {
        Drawable drawableU = epv0.U(qdh0Var.f28533a, getContext());
        if (drawableU != null) {
            ych0 ych0Var = sdh0Var.f32034a;
            Point point = ych0Var.f42385a;
            int i = point.x;
            int i2 = point.y;
            Point point2 = ych0Var.d;
            drawableU.setBounds(i, i2, point2.x, point2.y);
        }
        if (drawableU != null) {
            drawableU.draw(canvas);
        }
    }

    public final void b(ArrayList arrayList, ArrayList arrayList2) {
        this.e = arrayList;
        this.f = arrayList2;
        this.j.clear();
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((rdh0) it.next()).f30291a);
        }
        this.i = arrayList3;
        this.h = 0;
        this.g = xch0.NONE;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Object next;
        Object next2;
        canvas.getClass();
        Iterator it = getSeaBattleField().b.iterator();
        while (it.hasNext()) {
            ych0 ych0Var = ((sdh0) it.next()).f32034a;
            Path path = new Path();
            Point point = ych0Var.f42385a;
            path.moveTo(point.x, point.y);
            Point point2 = ych0Var.c;
            path.lineTo(point2.x, point2.y);
            Point point3 = ych0Var.d;
            path.lineTo(point3.x, point3.y);
            Point point4 = ych0Var.b;
            path.lineTo(point4.x, point4.y);
            path.close();
            canvas.drawPath(path, this.c);
        }
        Iterator it2 = this.e.iterator();
        while (true) {
            Object obj = null;
            if (!it2.hasNext()) {
                break;
            }
            pdh0 pdh0Var = (pdh0) it2.next();
            Drawable drawableU = epv0.U(pdh0Var.f26806a, getContext());
            Iterator it3 = getSeaBattleField().b.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!((sdh0) next2).b.equals(pdh0Var.b));
            sdh0 sdh0Var = (sdh0) next2;
            for (Object obj2 : getSeaBattleField().b) {
                if (((sdh0) obj2).b.equals(pdh0Var.c)) {
                    obj = obj2;
                    break;
                }
            }
            sdh0 sdh0Var2 = (sdh0) obj;
            if (sdh0Var != null && sdh0Var2 != null && drawableU != null) {
                Point point5 = sdh0Var.f32034a.f42385a;
                int i = point5.x;
                int i2 = point5.y;
                Point point6 = sdh0Var2.f32034a.d;
                drawableU.setBounds(i, i2, point6.x, point6.y);
            }
            if (drawableU != null) {
                drawableU.draw(canvas);
            }
        }
        mie0 mie0Var = new mie0();
        mie0Var.f21842a = xch0.NONE;
        for (rdh0 rdh0Var : this.f) {
            Iterator it4 = getSeaBattleField().b.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!((sdh0) next).b.equals(rdh0Var.f30291a));
            sdh0 sdh0Var3 = (sdh0) next;
            if (sdh0Var3 != null) {
                xch0 xch0Var = (xch0) mie0Var.f21842a;
                int iOrdinal = this.g.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3 && iOrdinal != 4) {
                                t9f.b();
                                return;
                            }
                            xch0Var = xch0.NONE;
                        } else if (xch0Var == xch0.NONE) {
                            xch0Var = xch0.END;
                        }
                    } else if (xch0Var == xch0.NONE) {
                        this.h++;
                        xch0Var = xch0.SHOW_LAST_SHOT;
                    }
                } else if (xch0Var == xch0.NONE) {
                    xch0Var = this.h >= 3 ? xch0.SHOW_LAST_SHOT_ALLOTTED_COLOR : xch0.HIDE_LAST_SHOT;
                }
                mie0Var.f21842a = xch0Var;
                boolean zContains = this.j.contains(rdh0Var.f30291a);
                qdh0 qdh0Var = rdh0Var.b;
                if (zContains) {
                    int iOrdinal2 = this.g.ordinal();
                    if (iOrdinal2 == 0 || iOrdinal2 == 2) {
                        a(canvas, qdh0.LAST, sdh0Var3);
                    } else if (iOrdinal2 == 3) {
                        a(canvas, qdh0Var, sdh0Var3);
                    }
                } else {
                    a(canvas, qdh0Var, sdh0Var3);
                }
            }
        }
        if (mie0Var.f21842a != xch0.NONE) {
            postDelayed(new oh60(this, mie0Var, (byte) 19), this.g.f40646a);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b = (int) (((double) getMeasuredWidth()) / 41.7d);
        this.f46539a = si30.b((getMeasuredWidth() + this.b) / 6.0f) - this.b;
        setMeasuredDimension(i, i);
    }

    public final void setShotUiModelList(List<rdh0> list) {
        list.getClass();
        if (list.equals(this.f)) {
            return;
        }
        this.f = list;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((rdh0) it.next()).f30291a);
        }
        ArrayList arrayList2 = this.j;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (!this.i.isEmpty()) {
            arrayList2.removeAll(this.i);
        }
        this.h = 0;
        this.g = xch0.SHOW_LAST_SHOT;
        this.i = arrayList;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeaBattleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeaBattleView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
