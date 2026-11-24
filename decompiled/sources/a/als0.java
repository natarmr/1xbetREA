package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes2.dex */
public abstract class als0 {
    public static final String a(SimpleDate simpleDate) {
        return String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(simpleDate.c)}, 1)) + Separators.DOT + String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(simpleDate.b)}, 1)) + Separators.DOT + simpleDate.f47286a;
    }
}
