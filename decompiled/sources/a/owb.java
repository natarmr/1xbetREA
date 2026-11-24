package a;

import java.util.ArrayList;
import org.xplatform.feature.fin_bet.impl.presentation.view.FinBetChartView;

/* JADX INFO: loaded from: classes.dex */
public final class owb implements ruw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FinBetChartView f25961a;
    public ArrayList b;

    public static float a(ArrayList arrayList, float f, int i) {
        float f2 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            vxv vxvVar = (vxv) arrayList.get(i2);
            if (vxvVar.f == i) {
                float fAbs = Math.abs(vxvVar.d - f);
                if (fAbs < f2) {
                    f2 = fAbs;
                }
            }
        }
        return f2;
    }
}
