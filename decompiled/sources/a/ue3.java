package a;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ue3 {
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) ve3.e(textView, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
    }

    public boolean b(TextView textView) {
        return ((Boolean) ve3.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
