package a;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.bonus_games.impl.lottery.presentation.views.ErasableView;

/* JADX INFO: loaded from: classes3.dex */
public final class rdq0 extends RelativeLayout implements sdq0, l0o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f30302a;
    public int b;
    public h910 c;
    public boolean d;
    public int e;
    public boolean f;
    public Function0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdq0(Context context, SparseArray sparseArray) {
        super(context);
        context.getClass();
        this.f30302a = maz.a(wez.b, new ywm0(this, this, (byte) 13));
        this.d = true;
        this.e = -1;
        this.g = new ozp0((byte) 18);
        getBinding().c.setBitmapCache(sparseArray);
        getBinding().c.setBackground(epv0.U(R.drawable.erase_slot_long, getContext()));
        getBinding().c.setListener(this);
        setNumber(Math.abs(new Random().nextInt()));
    }

    private final xhu0 getBinding() {
        return (xhu0) this.f30302a.getValue();
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
        this.g = t010Var;
        Integer num = (Integer) CollectionsKt.firstOrNull(list);
        if (num != null) {
            int iIntValue = num.intValue();
            this.e = iIntValue;
            getBinding().c.setText(String.valueOf(iIntValue));
            if (this.f) {
                t010Var.invoke();
                h910 h910Var = this.c;
                if (h910Var != null) {
                    h910Var.d();
                }
            }
        }
    }

    @Override // a.l0o
    public final void d(ErasableView erasableView) {
        h910 h910Var = this.c;
        if (h910Var != null) {
            if (!this.d) {
                h910Var = null;
            }
            if (h910Var != null) {
                h910Var.b(1);
            }
        }
        this.d = false;
    }

    @Override // a.sdq0
    public final Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBundle("mErasableView", getBinding().c.d());
        bundle.putInt("number", this.b);
        bundle.putBoolean("_first", this.d);
        bundle.putInt("_prize", this.e);
        return bundle;
    }

    @Override // a.sdq0
    public final void f(boolean z) {
        getBinding().c.setEnableTouch(z);
    }

    @Override // a.sdq0
    public final boolean g() {
        return !this.d;
    }

    public int getNumber() {
        return this.b;
    }

    @Override // a.l0o
    public final void h(ErasableView erasableView) {
        this.f = true;
        if (this.e != -1) {
            this.g.invoke();
            h910 h910Var = this.c;
            if (h910Var != null) {
                h910Var.d();
            }
        }
    }

    @Override // a.sdq0
    public final void i(Bundle bundle) {
        h910 h910Var;
        Bundle bundle2 = bundle.getBundle("mErasableView");
        if (bundle2 != null) {
            getBinding().c.c(bundle2);
        }
        this.d = bundle.getBoolean("_first");
        setNumber(bundle.getInt("number"));
        int i = bundle.getInt("_prize");
        this.e = i;
        if (this.d || i == -1 || (h910Var = this.c) == null) {
            return;
        }
        h910Var.d();
    }

    @Override // android.widget.RelativeLayout, android.view.View
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
        setNumber(Math.abs(new Random().nextInt()));
        ErasableView erasableView = getBinding().c;
        erasableView.l = true;
        erasableView.setErasable(false);
        erasableView.j.draw(erasableView.f);
        erasableView.b = "???";
        erasableView.t = false;
        erasableView.invalidate();
        this.d = true;
        this.f = false;
    }

    @Override // a.sdq0
    public void setErasable(boolean z) {
        getBinding().c.setErasable(z);
    }

    @Override // a.sdq0
    public void setListener(h910 h910Var) {
        h910Var.getClass();
        this.c = h910Var;
    }

    public final void setNumber(int i) {
        this.b = i;
        getBinding().d.setText(getContext().getString(R.string.lottery_number_v2, String.format(Locale.ENGLISH, "%09d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1))));
    }
}
