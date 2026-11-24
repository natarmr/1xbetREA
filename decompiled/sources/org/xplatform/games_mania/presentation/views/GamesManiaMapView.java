package org.xplatform.games_mania.presentation.views;

import a.e6t;
import a.e7t;
import a.i7t;
import a.iun;
import a.k7t;
import a.l4i0;
import a.l7t;
import a.m7t;
import a.m9t;
import a.n7t;
import a.ohd;
import a.p9b;
import a.q3d;
import a.qd8;
import a.r3d;
import a.s3t;
import a.t9f;
import a.twn;
import a.vls;
import a.w3d;
import a.w6x;
import a.ydr;
import a.zys0;
import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class GamesManiaMapView extends View {
    public List A;
    public int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46720a;
    public final Rect b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public List f1;
    public final Paint g;
    public int g1;
    public final Paint h;
    public List h1;
    public final Paint i;
    public boolean i1;
    public int j;
    public int j1;
    public Bitmap k;
    public final ArrayList k1;
    public Bitmap l;
    public int l1;
    public Bitmap m;
    public int m1;
    public List n;
    public int n1;
    public final ArrayList o;
    public int o1;
    public int p;
    public int p1;
    public int q;
    public int q1;
    public int r;
    public int r1;
    public int s;
    public double s1;
    public int t;
    public String t1;
    public boolean u;
    public m9t u1;
    public boolean v;
    public Function2 v1;
    public List w;
    public Function0 w1;
    public List x;
    public ydr x1;
    public List y;
    public Function1 y1;
    public List z;
    public static final List z1 = q3d.j(Double.valueOf(0.5d), Double.valueOf(1.5d));
    public static final List A1 = q3d.j(Double.valueOf(1.0d), Double.valueOf(2.0d), Double.valueOf(3.0d), Double.valueOf(4.0d), Double.valueOf(5.0d));

    /* JADX WARN: Illegal instructions before constructor call */
    public GamesManiaMapView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46720a = (int) Math.ceil(context.getResources().getDisplayMetrics().density * 2.0f);
        this.b = new Rect();
        this.c = new Paint();
        this.d = new Paint();
        this.e = new Paint();
        this.f = new Paint();
        this.g = new Paint();
        this.h = new Paint();
        this.i = new Paint();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.games_mania_field_cell);
        bitmapDecodeResource.getClass();
        this.k = bitmapDecodeResource;
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.games_mania_selected_cell);
        bitmapDecodeResource2.getClass();
        this.l = bitmapDecodeResource2;
        Bitmap bitmapDecodeResource3 = BitmapFactory.decodeResource(getResources(), R.drawable.games_mania_finish_cell);
        bitmapDecodeResource3.getClass();
        this.m = bitmapDecodeResource3;
        iun iunVar = iun.f15405a;
        this.n = iunVar;
        this.o = new ArrayList();
        this.w = iunVar;
        this.x = iunVar;
        this.y = iunVar;
        this.z = iunVar;
        this.A = new ArrayList();
        this.f1 = iunVar;
        this.h1 = new ArrayList();
        this.k1 = new ArrayList();
        this.t1 = "";
        this.u1 = m9t.f21427a;
        this.v1 = new s3t((byte) 5);
        this.w1 = new e6t((byte) 10);
        this.x1 = new ohd((byte) 15);
        this.y1 = new vls((byte) 12);
    }

    public static ArrayList r(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < 30; i++) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((Number) list.get(i2)).intValue() == i) {
                    arrayList.add(Integer.valueOf(i2));
                    break;
                }
            }
        }
        return arrayList;
    }

    public final void a(int i, Canvas canvas) {
        Iterator it = this.k1.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Paint paint = this.h;
            if (!zHasNext) {
                paint.setAlpha(i);
                this.g1++;
                postInvalidateDelayed(100L);
                return;
            }
            qd8 qd8Var = (qd8) it.next();
            canvas.drawBitmap(qd8Var.f28522a, qd8Var.b, qd8Var.c, paint);
        }
    }

    public final void b(k7t k7tVar, k7t k7tVar2, String str, boolean z) {
        k7tVar.getClass();
        str.getClass();
        this.u = false;
        this.g1 = 0;
        if (!z) {
            this.v = false;
        }
        int i = k7tVar.f17839a;
        List list = k7tVar.d;
        List list2 = k7tVar.e;
        List list3 = k7tVar.f;
        this.p = i;
        this.w = list2;
        this.x = k7tVar2.e;
        this.t = ((Number) list.get(1)).intValue() + ((Number) list.get(0)).intValue();
        this.u1 = m9t.d;
        this.r1 = ((e7t) list3.get(this.p - 1)).c;
        this.y = list3;
        this.z = list2;
        List list4 = k7tVar.b;
        list4.getClass();
        this.A = zys0.b(list4);
        this.B = k7tVar.c;
        this.s1 = ((e7t) list3.get(this.p - 1)).f7343a;
        this.t1 = str;
        if (this.s == 29) {
            this.u = true;
            this.h1.clear();
            this.y1.invoke(this.h1);
            this.s = 1;
            n(r(this.w), this.y, this.z);
        }
        this.q = this.s;
    }

    public final void c(Canvas canvas) {
        canvas.drawBitmap(this.l, this.l1, this.m1, (Paint) null);
    }

    public final void d(Canvas canvas) {
        this.p1 = ((Number) this.n.get(this.s - 1)).intValue() / 9;
        this.q1 = ((Number) this.n.get(this.s - 1)).intValue() % 9;
        l(canvas, this.s, this.n);
        this.l1 = j(this.p1);
        this.m1 = k(this.q1);
        c(canvas);
        this.q = 1;
    }

    public final void e(Canvas canvas) {
        q(true);
        this.l1 = j(this.p1);
        this.m1 = k(this.q1);
        int i = this.q;
        this.s = i;
        l(canvas, i, this.n);
        o(canvas, this.l1, this.m1, this.s1, ((p9b) this.o.get(this.q - 1)).f26597a);
        this.q = 1;
        p(this.s1, this.r1, this.p1, this.q1, this.A, this.B, true, this.t1);
        List list = this.h1;
        int i2 = this.q1;
        int i3 = this.p1;
        double d = this.s1;
        list.add(new l4i0(i2, i3, d, this.r1, this.t1, !(d == 0.0d)));
        this.y1.invoke(this.h1);
        this.t = 0;
        this.i.setAlpha(127);
        this.h.setAlpha(10);
        f(this.y, this.n);
        this.u1 = this.v ? m9t.c : m9t.b;
        this.i1 = false;
        invalidate();
    }

    public final void f(List list, List list2) {
        ArrayList arrayList = this.k1;
        arrayList.clear();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            int i = ((e7t) list.get(list2.indexOf(Integer.valueOf(iIntValue)))).c;
            n7t.Companion.getClass();
            if (i != Integer.parseInt("100")) {
                arrayList.add(new qd8(h(i, this.j), j(iIntValue / 9), k(iIntValue % 9), i));
            }
        }
    }

    public final float g(int i) {
        float f = (this.j / 2.0f) + i;
        Paint paint = this.g;
        return f - ((paint.ascent() + paint.descent()) / 2.0f);
    }

    public final List<Integer> getPuzzleList$games_mania() {
        return this.A;
    }

    public final List<String> getShotsValue$games_mania() {
        List list = this.f1;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    public final Bitmap h(int i, int i2) {
        int i3;
        m7t m7tVar = n7t.Companion;
        m7t m7tVar2 = n7t.Companion;
        m7tVar.getClass();
        if (i == Integer.parseInt("101")) {
            i3 = R.drawable.games_mania_dice_ico;
        } else {
            m7t m7tVar3 = n7t.Companion;
            m7tVar.getClass();
            if (i == Integer.parseInt("102")) {
                i3 = R.drawable.games_mania_wheel_ico;
            } else {
                m7t m7tVar4 = n7t.Companion;
                m7tVar.getClass();
                if (i == Integer.parseInt("103")) {
                    i3 = R.drawable.games_mania_2x_ico;
                } else {
                    m7t m7tVar5 = n7t.Companion;
                    m7tVar.getClass();
                    if (i == Integer.parseInt("104")) {
                        i3 = R.drawable.games_mania_back_ico;
                    } else {
                        m7t m7tVar6 = n7t.Companion;
                        m7tVar.getClass();
                        if (i == Integer.parseInt("105")) {
                            i3 = R.drawable.games_mania_free_ico;
                        } else {
                            m7t m7tVar7 = n7t.Companion;
                            m7tVar.getClass();
                            i3 = i == Integer.parseInt("106") ? R.drawable.games_mania_puzzle_ico : R.drawable.games_mania_field_cell;
                        }
                    }
                }
            }
        }
        Resources resources = getResources();
        resources.getClass();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, i3);
        bitmapDecodeResource.getClass();
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeResource, i2, i2, false);
        bitmapCreateScaledBitmap.getClass();
        bitmapDecodeResource.recycle();
        return bitmapCreateScaledBitmap;
    }

    public final int i(l7t l7tVar) {
        int iOrdinal = l7tVar.ordinal();
        if (iOrdinal == 0) {
            return getContext().getColor(R.color.games_mania_default_cell_text);
        }
        if (iOrdinal == 1) {
            return getContext().getColor(R.color.games_mania_finish_cell_text_color);
        }
        if (iOrdinal == 2) {
            return -1;
        }
        if (iOrdinal == 3) {
            return getContext().getColor(R.color.games_mania_cell_bonus_text);
        }
        t9f.b();
        return 0;
    }

    public final int j(int i) {
        if (i == 0) {
            return 0;
        }
        return (this.f46720a * i) + (this.j * i);
    }

    public final int k(int i) {
        if (i == 0) {
            return 0;
        }
        return (this.f46720a * i) + (this.j * i);
    }

    public final void l(Canvas canvas, int i, List list) {
        GamesManiaMapView gamesManiaMapView;
        Canvas canvas2;
        for (int i2 = 0; i2 < i; i2++) {
            int iIntValue = ((Number) list.get(i2)).intValue() / 9;
            int iIntValue2 = ((Number) list.get(i2)).intValue() % 9;
            int iJ = this.j(iIntValue);
            int iK = this.k(iIntValue2);
            float f = iJ;
            canvas.drawBitmap(this.k, f, iK, (Paint) null);
            ArrayList arrayList = this.o;
            int i3 = ((p9b) arrayList.get(i2)).b ? this.i(l7t.d) : this.i(l7t.f19576a);
            Paint paint = this.g;
            paint.setColor(i3);
            canvas.drawText(((p9b) arrayList.get(i2)).f26597a, (this.j / 2.0f) + f, this.g(iK), paint);
            for (l4i0 l4i0Var : this.h1) {
                if (iIntValue2 == l4i0Var.f19407a && iIntValue == l4i0Var.b) {
                    gamesManiaMapView = this;
                    canvas2 = canvas;
                    gamesManiaMapView.o(canvas2, iJ, iK, l4i0Var.c, ((p9b) arrayList.get(i2)).f26597a);
                } else {
                    gamesManiaMapView = this;
                    canvas2 = canvas;
                }
                this = gamesManiaMapView;
                canvas = canvas2;
            }
        }
    }

    public final void m(Canvas canvas, boolean z) {
        q(z);
        this.i1 = true;
        if (this.r == 0) {
            this.l1 = j(this.p1);
            this.m1 = k(this.q1);
        }
        if (this.r <= 10) {
            int iIntValue = this.p1;
            int iIntValue2 = this.q1;
            int i = this.q;
            if (i != 29) {
                iIntValue = ((Number) this.n.get(i)).intValue() / 9;
                iIntValue2 = ((Number) this.n.get(this.q)).intValue() % 9;
            }
            this.r++;
            int i2 = this.p1;
            if (iIntValue > i2) {
                this.l1 = (this.j / 10) + this.l1;
            } else if (iIntValue < i2) {
                this.l1 -= this.j / 10;
            } else {
                int i3 = this.q1;
                if (iIntValue2 > i3) {
                    this.m1 = (this.j / 10) + this.m1;
                } else if (iIntValue2 < i3) {
                    this.m1 -= this.j / 10;
                }
            }
            invalidate();
        } else {
            this.q++;
            this.r = 0;
            invalidate();
        }
        l(canvas, this.q, this.n);
        c(canvas);
    }

    public final void n(List list, List list2, List list3) {
        ArrayList arrayList = this.o;
        arrayList.clear();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            int iIntValue = ((Number) obj).intValue();
            double d = ((e7t) list2.get(i)).b;
            Pair pair = z1.contains(Double.valueOf(d)) ? new Pair("x" + d, Boolean.TRUE) : A1.contains(Double.valueOf(d)) ? new Pair(twn.m((int) d, "x"), Boolean.TRUE) : new Pair(String.valueOf(((Number) list3.get(iIntValue)).intValue()), Boolean.FALSE);
            arrayList.add(new p9b((String) pair.f46059a, ((Boolean) pair.b).booleanValue()));
            i = i2;
        }
    }

    public final void o(Canvas canvas, int i, int i2, double d, String str) {
        float f = i;
        float f2 = (this.j / 2.0f) + f;
        float fG = g(i2);
        Paint paint = this.g;
        if (d > 0.0d) {
            canvas.drawBitmap(this.m, f, i2, (Paint) null);
            paint.setColor(i(l7t.b));
            canvas.drawText(str, f2, fG, paint);
        } else {
            paint.setColor(i(l7t.c));
            canvas.drawText(str, f2, fG, paint);
        }
        c(canvas);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        if (this.n.isEmpty()) {
            return;
        }
        for (int i = 0; i < 45; i++) {
            int i2 = i / 9;
            this.p1 = i2;
            int i3 = i % 9;
            this.q1 = i3;
            this.n1 = j(i2);
            this.o1 = k(this.q1);
            if (this.n.contains(Integer.valueOf(i))) {
                this.p1 = i2;
                this.q1 = i3;
                this.n1 = j(i2);
                int iK = k(this.q1);
                this.o1 = iK;
                float f = (this.j / 2.0f) + this.n1;
                float fG = g(iK);
                canvas.drawBitmap(this.k, this.n1, this.o1, this.i);
                int iIndexOf = this.n.indexOf(Integer.valueOf(i));
                ArrayList arrayList = this.o;
                int i4 = ((p9b) arrayList.get(iIndexOf)).b ? i(l7t.d) : i(l7t.f19576a);
                Paint paint = this.g;
                paint.setColor(i4);
                canvas.drawText(((p9b) arrayList.get(this.n.indexOf(Integer.valueOf(i)))).f26597a, f, fG, paint);
            } else {
                this.p1 = i2;
                this.q1 = i3;
                this.n1 = j(i2);
                int iK2 = k(this.q1);
                this.o1 = iK2;
                int i5 = this.n1;
                int i6 = this.j;
                Rect rect = this.b;
                rect.set(i5, iK2, i5 + i6, i6 + iK2);
                Paint paint2 = this.d;
                paint2.setAlpha(127);
                Paint paint3 = this.e;
                paint3.setAlpha(127);
                canvas.drawRect(rect, paint2);
                canvas.drawRect(rect, paint3);
            }
        }
        int iOrdinal = this.u1.ordinal();
        if (iOrdinal == 0) {
            d(canvas);
            return;
        }
        if (iOrdinal == 1) {
            this.p1 = ((Number) this.n.get(this.s - 1)).intValue() / 9;
            this.q1 = ((Number) this.n.get(this.s - 1)).intValue() % 9;
            this.l1 = j(this.p1);
            this.m1 = k(this.q1);
            this.q = 1;
            l(canvas, this.s, this.n);
            c(canvas);
            this.u1 = m9t.f21427a;
            return;
        }
        if (iOrdinal == 2) {
            d(canvas);
            l(canvas, this.s, this.n);
            c(canvas);
            int i7 = this.g1;
            Paint paint4 = this.h;
            if (i7 >= 0 && i7 < 15) {
                a((int) (((double) paint4.getAlpha()) * 1.25d), canvas);
                return;
            }
            if (15 <= i7 && i7 < 30) {
                a((int) (((double) paint4.getAlpha()) / 1.25d), canvas);
                return;
            }
            this.g1 = 0;
            this.v = false;
            this.u1 = m9t.f21427a;
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                t9f.b();
                return;
            } else {
                if (this.i1) {
                    return;
                }
                l(canvas, this.s, this.n);
                c(canvas);
                p(((l4i0) this.h1.get(this.j1)).c, ((l4i0) this.h1.get(this.j1)).d, ((l4i0) this.h1.get(this.j1)).b, ((l4i0) this.h1.get(this.j1)).f19407a, this.A, this.B, false, ((l4i0) this.h1.get(this.j1)).e);
                this.u1 = this.v ? m9t.c : m9t.b;
                return;
            }
        }
        if (this.t != 0) {
            w3d.y(this.h1, new vls((byte) 13));
            this.y1.invoke(this.h1);
            if (this.x.isEmpty()) {
                int i8 = this.q;
                if (i8 >= this.s + this.t || i8 >= 29) {
                    e(canvas);
                    return;
                } else {
                    m(canvas, true);
                    return;
                }
            }
            if (this.u) {
                this.v = true;
                this.n = r(this.w);
                if (this.q < this.p) {
                    m(canvas, true);
                    return;
                } else {
                    e(canvas);
                    return;
                }
            }
            this.n = r(this.w);
            if (this.q < 29) {
                m(canvas, false);
                return;
            }
            q(false);
            this.l1 = j(this.p1);
            this.m1 = k(this.q1);
            l(canvas, this.q, r(this.x));
            this.s = this.q;
            this.u = true;
            this.n = r(this.w);
            this.h1.clear();
            this.y1.invoke(this.h1);
            n(this.n, this.y, this.z);
            this.q = 1;
            invalidate();
        }
    }

    public final void p(double d, int i, int i2, int i3, List list, int i4, boolean z, String str) {
        float f;
        float f2;
        float f3;
        float f4;
        String string;
        float f5;
        float f6;
        boolean z2;
        n7t.Companion.getClass();
        boolean z3 = i != Integer.parseInt("100");
        int i5 = this.j;
        int i6 = this.f46720a;
        if (z3) {
            f2 = i5 * 4.6f;
            if (i == Integer.parseInt("103") || i == Integer.parseInt("104") || i == Integer.parseInt("105")) {
                f5 = this.j;
                f6 = 4.3f;
            } else {
                f5 = this.j;
                f6 = 3.3f;
            }
            f3 = f5 * f6;
            if (i == Integer.parseInt("101")) {
                if (z) {
                    this.w1.invoke();
                }
            } else if (i == Integer.parseInt("106")) {
                if (list.contains(Integer.valueOf(i4))) {
                    z2 = true;
                } else {
                    list.add(Integer.valueOf(i4));
                    z2 = false;
                }
                f = 2.0f;
                this.v1.invoke(Boolean.valueOf(z2), Boolean.FALSE);
            }
            f = 2.0f;
        } else {
            f = 2.0f;
            float f7 = i5;
            f2 = (3.0f * f7) + (i6 * 2.0f);
            f3 = f7 * 1.4f;
        }
        int i7 = this.j;
        int i8 = (i3 * i6) + ((i3 + 1) * i7);
        float fB = f3 > ((float) (((i6 * 8) + (i7 * 9)) - i8)) ? twn.b(i3, 1, i6, i7 * i3) - f3 : i8;
        if (i2 == 2) {
            f4 = (((i6 * 4) + (i7 * 5)) - f2) / f;
        } else if (i2 == 3 || i2 == 4) {
            f4 = ((i6 * 4) + (i7 * 5)) - f2;
        } else {
            f4 = 0.0f;
        }
        String string2 = d == 0.0d ? getContext().getString(R.string.game_lose_status) : getContext().getString(R.string.games_mania_win_text);
        string2.getClass();
        ydr ydrVar = this.x1;
        Integer numValueOf = Integer.valueOf(i);
        Double dValueOf = Double.valueOf(d);
        Bitmap bitmapH = h(i, this.j);
        int i9 = (int) f4;
        int i10 = (int) fB;
        int i11 = (int) f2;
        int i12 = (int) f3;
        boolean z4 = i == Integer.parseInt("101");
        if (i == Integer.parseInt("101")) {
            string = getContext().getString(R.string.games_mania_bonus_text_roll_dice);
            string.getClass();
        } else if (i == Integer.parseInt("102")) {
            string = getContext().getString(R.string.games_mania_bonus_text_free_wheel);
            string.getClass();
        } else if (i == Integer.parseInt("103")) {
            string = w6x.q(getContext().getString(R.string.games_mania_bonus_text_double_bet), Separators.SP, str);
        } else if (i == Integer.parseInt("104")) {
            string = w6x.q(getContext().getString(R.string.games_mania_bonus_text_back_bet), Separators.SP, str);
        } else if (i == Integer.parseInt("105")) {
            string = getContext().getString(R.string.games_mania_bonus_text_one_euro_free_bet_v2, str);
            string.getClass();
        } else {
            string = "";
        }
        ydrVar.j(numValueOf, dValueOf, str, new i7t(bitmapH, i9, i10, i11, i12, z4, string2, string));
    }

    public final void q(boolean z) {
        if (z) {
            this.p1 = ((Number) r(this.w).get(this.q - 1)).intValue() / 9;
            this.q1 = ((Number) r(this.w).get(this.q - 1)).intValue() % 9;
        } else {
            ArrayList arrayListR = r(this.x);
            this.n = arrayListR;
            this.p1 = ((Number) arrayListR.get(this.q - 1)).intValue() / 9;
            this.q1 = ((Number) this.n.get(this.q - 1)).intValue() % 9;
        }
    }

    public final void setBonusDiceListener$games_mania(Function0<Unit> function0) {
        function0.getClass();
        this.w1 = function0;
    }

    public final void setGamesManiaGameResultListener$games_mania(ydr ydrVar) {
        ydrVar.getClass();
        this.x1 = ydrVar;
    }

    public final void setPuzzleCellListener$games_mania(Function2<? super Boolean, ? super Boolean, Unit> function2) {
        function2.getClass();
        this.v1 = function2;
    }

    public final void setSelectedCellsListener$games_mania(Function1<? super List<l4i0>, Unit> function1) {
        function1.getClass();
        this.y1 = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GamesManiaMapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GamesManiaMapView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
