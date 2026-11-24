package a;

import android.text.SpannableString;
import android.text.style.URLSpan;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class wvl0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39843a;
    public final /* synthetic */ SpannableString b;

    public /* synthetic */ wvl0(SpannableString spannableString, byte b) {
        this.f39843a = b;
        this.b = spannableString;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.f39843a;
        SpannableString spannableString = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return Integer.valueOf(spannableString.getSpanStart((URLSpan) obj)).compareTo(Integer.valueOf(spannableString.getSpanStart((URLSpan) obj2)));
    }
}
