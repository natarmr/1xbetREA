package com.google.android.material.datepicker;

import a.cu;
import a.ett0;
import a.v2w0;
import a.xhe0;
import a.yge0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Locale;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends yge0 {
    public final e d;

    public j(e eVar) {
        this.d = eVar;
    }

    @Override // a.yge0
    public final int d() {
        return this.d.J1.f;
    }

    @Override // a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        e eVar = this.d;
        int i2 = eVar.J1.f45564a.c + i;
        TextView textView = ((v2w0) xhe0Var).u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(ett0.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        cu cuVar = eVar.M1;
        if (ett0.b().get(1) == i2) {
            Object obj = cuVar.d;
        } else {
            Object obj2 = cuVar.c;
        }
        throw null;
    }

    @Override // a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        return new v2w0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
