package a;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.bonus_games.impl.lottery.presentation.views.ErasableView;

/* JADX INFO: loaded from: classes3.dex */
public final class qdq0 extends LinearLayout implements sdq0, l0o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f28548a;
    public h910 b;
    public final ArrayList c;
    public final ArrayList d;
    public int e;
    public int[] f;
    public int g;
    public Function0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdq0(Context context, SparseArray sparseArray) {
        super(context);
        context.getClass();
        this.f28548a = maz.a(wez.b, new ywm0(this, this, (byte) 12));
        ArrayList<ErasableView> arrayList = new ArrayList(9);
        this.c = arrayList;
        this.d = new ArrayList(3);
        this.h = new ozp0((byte) 17);
        arrayList.add(getBinding().c);
        arrayList.add(getBinding().d);
        arrayList.add(getBinding().e);
        arrayList.add(getBinding().f);
        arrayList.add(getBinding().g);
        arrayList.add(getBinding().h);
        arrayList.add(getBinding().i);
        arrayList.add(getBinding().j);
        arrayList.add(getBinding().k);
        for (ErasableView erasableView : arrayList) {
            erasableView.setBitmapCache(sparseArray);
            int iT = k7x.T(f1e0.f8761a, new IntRange(0, 3, 1));
            erasableView.setBackground(iT != 0 ? iT != 1 ? iT != 2 ? iT != 3 ? epv0.U(R.drawable.erase_slot_1, getContext()) : epv0.U(R.drawable.erase_slot_4, getContext()) : epv0.U(R.drawable.erase_slot_3, getContext()) : epv0.U(R.drawable.erase_slot_2, getContext()) : epv0.U(R.drawable.erase_slot_1, getContext()));
            erasableView.setListener(this);
        }
        f1e0.f8761a.getClass();
        setNumber(Math.abs(f1e0.b.b()));
    }

    private final whu0 getBinding() {
        return (whu0) this.f28548a.getValue();
    }

    private final void setNumber(int i) {
        this.e = i;
        getBinding().l.setText(getContext().getString(R.string.lottery_number_v2, String.format(Locale.ENGLISH, "%09d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1))));
    }

    @Override // a.sdq0
    public final void a() {
        getBinding().b.setVisibility(0);
    }

    @Override // a.sdq0
    public final void b() {
        getBinding().b.setVisibility(8);
    }

    @Override // a.sdq0
    public final void c(List list, t010 t010Var) {
        list.getClass();
        this.h = t010Var;
        if (list.size() != 3) {
            list = null;
        }
        if (list != null) {
            int[] iArrK0 = CollectionsKt.K0(list);
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ErasableView) arrayList.get(i)).setText(String.valueOf(iArrK0[i]));
            }
            if (this.g >= 3) {
                t010Var.invoke();
                h910 h910Var = this.b;
                if (h910Var != null) {
                    h910Var.d();
                }
            }
            this.f = iArrK0;
        }
    }

    @Override // a.l0o
    public final void d(ErasableView erasableView) {
        h910 h910Var;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && (h910Var = this.b) != null) {
            h910Var.b(2);
        }
        if (arrayList.size() == 3) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (erasableView == ((ErasableView) it.next())) {
                return;
            }
        }
        arrayList.add(erasableView);
        int[] iArr = this.f;
        if (iArr != null) {
            erasableView.setText(String.valueOf(iArr[arrayList.size() - 1]));
        }
        if (this.f == null || arrayList.size() != 3) {
            return;
        }
        for (ErasableView erasableView2 : this.c) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (!Intrinsics.d(erasableView2, (ErasableView) it2.next()));
            }
            erasableView2.setErasable(false);
        }
    }

    @Override // a.sdq0
    public final Bundle e() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            ErasableView erasableView = (ErasableView) this.c.get(i);
            bundle.putBundle(twn.m(i, "mErasableView"), erasableView.d());
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                if (erasableView == ((ErasableView) it.next())) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
        }
        bundle.putIntegerArrayList("_erased", arrayList);
        bundle.putInt("_number", this.e);
        int[] iArr = this.f;
        if (iArr != null) {
            bundle.putIntArray("_prizes", iArr);
        }
        return bundle;
    }

    @Override // a.sdq0
    public final void f(boolean z) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((ErasableView) it.next()).setEnableTouch(z);
        }
    }

    @Override // a.sdq0
    public final boolean g() {
        return !this.d.isEmpty();
    }

    public int getNumber() {
        return this.e;
    }

    @Override // a.l0o
    public final void h(ErasableView erasableView) {
        if (this.f != null) {
            int i = this.g + 1;
            this.g = i;
            if (i == 3) {
                this.h.invoke();
                h910 h910Var = this.b;
                if (h910Var != null) {
                    h910Var.d();
                }
            }
        }
    }

    @Override // a.sdq0
    public final void i(Bundle bundle) {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.c;
            if (i >= 9) {
                break;
            }
            ErasableView erasableView = (ErasableView) arrayList.get(i);
            Bundle bundle2 = bundle.getBundle("mErasableView" + i);
            if (bundle2 != null) {
                erasableView.c(bundle2);
            }
            i++;
        }
        setNumber(bundle.getInt("_number"));
        this.f = bundle.getIntArray("_prizes");
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("_erased");
        ArrayList arrayList2 = this.d;
        if (integerArrayList != null) {
            Iterator<Integer> it = integerArrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                Integer next = it.next();
                this.g++;
                next.getClass();
                arrayList2.add(arrayList.get(next.intValue()));
            }
        }
        if (this.f == null || arrayList2.size() < 3) {
            return;
        }
        this.h.invoke();
        h910 h910Var = this.b;
        if (h910Var != null) {
            h910Var.d();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Context context = getContext();
        context.getClass();
        context.getClass();
        if (context.getResources().getBoolean(R.bool.isLand)) {
            super.onMeasure(i2, i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // a.sdq0
    public final void reset() {
        f1e0.f8761a.getClass();
        setNumber(Math.abs(f1e0.b.b()));
        for (ErasableView erasableView : this.c) {
            erasableView.l = true;
            erasableView.setErasable(false);
            erasableView.j.draw(erasableView.f);
            erasableView.b = "???";
            erasableView.t = false;
            erasableView.invalidate();
        }
        this.g = 0;
        this.d.clear();
    }

    @Override // a.sdq0
    public void setErasable(boolean z) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((ErasableView) it.next()).setErasable(z);
        }
    }

    @Override // a.sdq0
    public void setListener(h910 h910Var) {
        h910Var.getClass();
        this.b = h910Var;
    }
}
