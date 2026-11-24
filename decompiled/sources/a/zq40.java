package a;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class zq40 extends xhe0 {
    public final TextView u;
    public final MaterialCalendarGridView v;

    public zq40(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.u = textView;
        WeakHashMap weakHashMap = rgu0.f30456a;
        new egu0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, (byte) 3).a(textView, Boolean.TRUE);
        this.v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
