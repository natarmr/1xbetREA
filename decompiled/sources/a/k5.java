package a;

import android.content.Context;
import android.graphics.Paint;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.layout_manager.ColumnHeaderLayoutManager;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5d f17694a;
    public final rhg0 b;
    public final aab c;
    public List d;
    public List e;
    public List f;
    public final ArrayList g;
    public View h;
    public y8b i;
    public final Paint j;
    public final int k;

    public k5(nmo0 nmo0Var, boolean z, int i) {
        nmo0Var.getClass();
        iun iunVar = iun.f15405a;
        this.d = iunVar;
        this.e = iunVar;
        this.f = iunVar;
        this.g = new ArrayList();
        Paint paint = new Paint();
        paint.setTextSize(nmo0Var.getContext().getResources().getDimension(i));
        paint.setTypeface(itf0.a(R.font.roboto_regular, nmo0Var.getContext()));
        this.j = paint;
        this.k = nmo0Var.getContext().getResources().getDimensionPixelSize(R.dimen.size_10);
        Context context = nmo0Var.getContext();
        this.f17694a = new p5d(context, this.d, this);
        this.b = new rhg0(context, this.e, this, z);
        this.c = new aab(this.f, context, nmo0Var, z);
    }

    public final y8b a(int i, int i2) {
        if (this.f.isEmpty() || i < 0 || i2 >= this.f.size() || i2 < 0 || i >= ((List) this.f.get(i2)).size()) {
            return null;
        }
        return (y8b) ((List) this.f.get(i2)).get(i);
    }

    public int b(int i, int i2) {
        return 0;
    }

    public final y8b c(int i) {
        if (this.d.isEmpty() || i < 0 || i >= this.d.size()) {
            return null;
        }
        return (y8b) this.d.get(i);
    }

    public int d(int i) {
        return 0;
    }

    public final y8b e(int i) {
        if (this.e.isEmpty() || i < 0 || i >= this.e.size()) {
            return null;
        }
        return (y8b) this.e.get(i);
    }

    public int f(int i) {
        return 0;
    }

    public abstract nmo0 g();

    public final int h(y8b y8bVar, HashMap map) {
        int i = 0;
        if (y8bVar != null) {
            if (y8bVar instanceof w8b) {
                w8b w8bVar = (w8b) y8bVar;
                int i2 = i(w8bVar.f38714a, map);
                Integer num = w8bVar.b;
                Integer num2 = w8bVar.c;
                if (num == null || i2 < num.intValue()) {
                    return (num2 == null || i2 > num2.intValue()) ? i2 : num2.intValue();
                }
                return num.intValue();
            }
            if (y8bVar instanceof v8b) {
                v8b v8bVar = (v8b) y8bVar;
                Iterator it = v8bVar.f36972a.iterator();
                while (it.hasNext()) {
                    i += i((i9b) it.next(), map);
                }
                Integer num3 = v8bVar.b;
                Integer num4 = v8bVar.c;
                if (num3 != null && i >= num3.intValue()) {
                    return num3.intValue();
                }
                if (num4 != null && i <= num4.intValue()) {
                    return num4.intValue();
                }
            }
        }
        return i;
    }

    public final int i(i9b i9bVar, HashMap map) {
        if (i9bVar != null) {
            boolean z = i9bVar instanceof f9b;
            int i = this.k;
            if (z) {
                return (i * 2) + ((f9b) i9bVar).f9147a;
            }
            if (i9bVar instanceof g9b) {
                return ((g9b) i9bVar).f10905a;
            }
            if (i9bVar instanceof h9b) {
                String str = ((h9b) i9bVar).f12665a;
                Object objValueOf = map.get(str);
                if (objValueOf == null) {
                    objValueOf = Integer.valueOf((int) (this.j.measureText(str) + (i * 2)));
                    map.put(str, objValueOf);
                }
                return ((Number) objValueOf).intValue();
            }
        }
        t9f.b();
        return 0;
    }

    public void j(w5 w5Var, y8b y8bVar) {
        if ((w5Var instanceof gaq0) && (y8bVar instanceof wwh)) {
            ((gaq0) w5Var).u.c.setText(((wwh) y8bVar).d);
        }
    }

    public void k(w5 w5Var, y8b y8bVar) {
        if ((w5Var instanceof mow) && (y8bVar instanceof znw)) {
            ((mow) w5Var).u.c.setText(((znw) y8bVar).d);
        }
    }

    public w5 m(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.vh_value_cell, viewGroup, false);
            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvData);
            if (textView != null) {
                return new i2u0(new bdu0((FrameLayout) viewInflate, textView, (byte) 8));
            }
            hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvData)));
            return null;
        }
        if (i == 2) {
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.vh_tournament_cell, viewGroup, false);
            TextView textView2 = (TextView) yum0.f(viewInflate2, R.id.tvData);
            if (textView2 != null) {
                return new vzr0(new bdu0((FrameLayout) viewInflate2, textView2, (byte) 7));
            }
            hny.u("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(R.id.tvData)));
            return null;
        }
        if (i != 3) {
            if (i != 4) {
                return i != 10 ? new sun(auh.a(layoutInflaterFrom, viewGroup).b) : new ttq(d5e0.e(layoutInflaterFrom, viewGroup));
            }
            View viewInflate3 = layoutInflaterFrom.inflate(R.layout.vh_footer_empty_cell, viewGroup, false);
            if (viewInflate3 != null) {
                return new itq((FrameLayout) viewInflate3);
            }
            hny.u("rootView");
            return null;
        }
        View viewInflate4 = layoutInflaterFrom.inflate(R.layout.vh_team_cell, viewGroup, false);
        int i2 = R.id.ivTeamLogo;
        ImageView imageView = (ImageView) yum0.f(viewInflate4, R.id.ivTeamLogo);
        if (imageView != null) {
            i2 = R.id.tvTeamTitle;
            TextView textView3 = (TextView) yum0.f(viewInflate4, R.id.tvTeamTitle);
            if (textView3 != null) {
                return new c5p0(new jk30((LinearLayout) viewInflate4, imageView, textView3, (byte) 4));
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i2)));
        return null;
    }

    public w5 n(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i != 6) {
            return i != 7 ? new sun(auh.a(layoutInflaterFrom, viewGroup).b) : new aww(nq8.b(layoutInflaterFrom, viewGroup));
        }
        return new mrq0(bdu0.a(layoutInflaterFrom, viewGroup));
    }

    public View o(ViewGroup viewGroup, y8b y8bVar) {
        y8bVar.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_cycling_corner_cell, viewGroup, false);
        viewInflate.getClass();
        viewInflate.setLayoutParams(new FrameLayout.LayoutParams(0, vqd.d(viewGroup, R.dimen.space_50)));
        return viewInflate;
    }

    public w5 p(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i != 8) {
            return i != 9 ? new sun(auh.a(layoutInflaterFrom, viewGroup).b) : new ogr0(bdu0.b(layoutInflaterFrom, viewGroup));
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.vh_season_row_header, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.title);
        if (textView != null) {
            return new zih0(new bdu0((FrameLayout) viewInflate, textView, (byte) 2));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.title)));
        return null;
    }

    public final void q(List list, List list2, List list3, y8b y8bVar) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        y8bVar.getClass();
        if (list.equals(this.f) && list2.equals(this.e) && list3.equals(this.d)) {
            return;
        }
        HashMap map = new HashMap();
        int iH = h(y8bVar, map);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            iH = Integer.max(iH, h((y8b) it.next(), map));
        }
        View viewO = this.h;
        int i = 0;
        if (viewO == null || !y8bVar.equals(this.i)) {
            Object objG = g();
            objG.getClass();
            ViewGroup viewGroup = (ViewGroup) objG;
            if (viewO != null) {
                viewGroup.removeView(viewO);
            }
            viewO = o(viewGroup, y8bVar);
            viewO.measure(0, 0);
            viewGroup.addView(viewO, viewO.getLayoutParams());
            this.h = viewO;
            this.i = y8bVar;
        }
        g().setRowHeaderWidth(Integer.max(iH, viewO.getMeasuredWidth()));
        ViewGroup.LayoutParams layoutParams = viewO.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = g().getRowHeaderWidth();
        viewO.setLayoutParams(layoutParams);
        nmo0 nmo0VarG = g();
        ViewGroup.LayoutParams layoutParams2 = viewO.getLayoutParams();
        nmo0VarG.setColumnHeaderHeight(layoutParams2 != null ? layoutParams2.height : 0);
        if (!list3.isEmpty() && !list.isEmpty()) {
            int size = list3.size();
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                itt0.a();
                return;
            }
            int size2 = ((List) it2.next()).size();
            while (it2.hasNext()) {
                int size3 = ((List) it2.next()).size();
                if (size2 > size3) {
                    size2 = size3;
                }
            }
            if (size2 == size) {
                int[] iArr = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr[i2] = h((y8b) list3.get(i2), map);
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    List list4 = (List) it3.next();
                    for (int i3 = 0; i3 < size; i3++) {
                        int iH2 = h((y8b) list4.get(i3), map);
                        if (iH2 > iArr[i3]) {
                            iArr[i3] = iH2;
                        }
                    }
                }
                ColumnHeaderLayoutManager columnHeaderLayoutManager = g().getColumnHeaderLayoutManager();
                int i4 = 0;
                int i5 = 0;
                while (i4 < size) {
                    int i6 = iArr[i4];
                    int i7 = i5 + 1;
                    SparseIntArray sparseIntArray = columnHeaderLayoutManager.g1;
                    if (sparseIntArray.get(i5, -1) < i6) {
                        sparseIntArray.put(i5, i6);
                    }
                    i4++;
                    i5 = i7;
                }
                int rowHeaderWidth = g().getContext().getResources().getDisplayMetrics().widthPixels - g().getRowHeaderWidth();
                int i8 = 0;
                for (int i9 = 0; i9 < size; i9++) {
                    i8 += iArr[i9];
                }
                if (i8 < rowHeaderWidth) {
                    ((TableViewImpl) g()).b(false, false);
                    int i10 = rowHeaderWidth - i8;
                    if (size != 0 && i10 > 0) {
                        int i11 = i10 / size;
                        ColumnHeaderLayoutManager columnHeaderLayoutManager2 = g().getColumnHeaderLayoutManager();
                        int i12 = 0;
                        while (i < size) {
                            int i13 = i12 + 1;
                            int i14 = iArr[i] + i11;
                            SparseIntArray sparseIntArray2 = columnHeaderLayoutManager2.g1;
                            if (sparseIntArray2.get(i12, -1) < i14) {
                                sparseIntArray2.put(i12, i14);
                            }
                            i++;
                            i12 = i13;
                        }
                    }
                }
            }
        }
        this.d = list3;
        p5d p5dVar = this.f17694a;
        p5dVar.getClass();
        p5dVar.e = list3;
        p5dVar.g();
        ArrayList arrayList = this.g;
        Iterator it4 = arrayList.iterator();
        if (it4.hasNext()) {
            throw rw2.h(it4);
        }
        this.e = list2;
        rhg0 rhg0Var = this.b;
        rhg0Var.getClass();
        rhg0Var.e = list2;
        rhg0Var.g();
        Iterator it5 = arrayList.iterator();
        if (it5.hasNext()) {
            throw rw2.h(it5);
        }
        this.f = list;
        aab aabVar = this.c;
        aabVar.getClass();
        aabVar.e = list;
        aabVar.g();
        Iterator it6 = arrayList.iterator();
        if (it6.hasNext()) {
            throw rw2.h(it6);
        }
        TableViewImpl tableViewImpl = (TableViewImpl) g();
        tableViewImpl.getColumnHeaderRecyclerView().post(new apj0((Object) tableViewImpl, (byte) 11));
    }

    public abstract void r(TableViewImpl tableViewImpl);

    public void l(w5 w5Var, y8b y8bVar) {
    }
}
