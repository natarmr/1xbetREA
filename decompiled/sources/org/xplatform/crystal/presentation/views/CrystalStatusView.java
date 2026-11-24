package org.xplatform.crystal.presentation.views;

import a.a8z;
import a.bif;
import a.fif;
import a.lhf;
import a.maz;
import a.mhf;
import a.n0o0;
import a.p3u0;
import a.pn40;
import a.qmk0;
import a.r3d;
import a.wez;
import a.x5f;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class CrystalStatusView extends FrameLayout {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f46476a;
    public final n0o0 b;
    public String c;
    public BigDecimal d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrystalStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.f46476a = maz.a(wez.b, new lhf(this, this, (byte) 0));
        this.b = maz.b(new x5f((byte) 19));
        this.c = "";
        this.d = new BigDecimal(0.0d);
        getViewBinding().c.setAdapter(getAdapter());
        RecyclerView recyclerView = getViewBinding().c;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.x1(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        getViewBinding().c.m(new qmk0(2));
    }

    private final fif getAdapter() {
        return (fif) this.b.getValue();
    }

    private final mhf getViewBinding() {
        Object value = this.f46476a.getValue();
        value.getClass();
        return (mhf) value;
    }

    public final void a(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new BigDecimal(String.valueOf(((bif) it.next()).c)));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            BigDecimal bigDecimalAdd = this.d.add((BigDecimal) it2.next());
            bigDecimalAdd.getClass();
            this.d = bigDecimalAdd;
        }
        if (this.d.compareTo(new BigDecimal(0.0d)) > 0) {
            double dDoubleValue = this.d.doubleValue();
            TextView textView = getViewBinding().b;
            Context context = getContext();
            pn40 pn40Var = pn40.f27267a;
            textView.setText(context.getString(R.string.current_win_two_lines, pn40.c(dDoubleValue, p3u0.g), this.c));
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            bif bifVar = (bif) it3.next();
            fif adapter = getAdapter();
            adapter.getClass();
            bifVar.getClass();
            ((ArrayList) adapter.f).add(bifVar);
            adapter.g();
            getViewBinding().c.B0(((ArrayList) getAdapter().f).size());
        }
    }

    public final void b() {
        fif adapter = getAdapter();
        ((ArrayList) adapter.f).clear();
        adapter.g();
        this.d = new BigDecimal(0.0d);
        getViewBinding().b.setText("");
    }

    public final String getCurrencySymbol() {
        return this.c;
    }

    public final void setCurrencySymbol(String str) {
        str.getClass();
        this.c = str;
    }

    public final void setFinalSum(double d) {
        if (d == 0.0d) {
            getViewBinding().b.setText("");
            return;
        }
        TextView textView = getViewBinding().b;
        Context context = getContext();
        pn40 pn40Var = pn40.f27267a;
        textView.setText(context.getString(R.string.current_win_two_lines, pn40.c(d, p3u0.g), this.c));
    }
}
