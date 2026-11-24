package a;

import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleFighting;

/* JADX INFO: loaded from: classes6.dex */
public final class gbo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f11024a;
    public final TextView b;
    public final TextView c;

    public gbo(TextView textView, TextView textView2, TextView textView3) {
        this.f11024a = textView;
        this.b = textView2;
        this.c = textView3;
    }

    public static void a(TextView textView, hsp hspVar, hin hinVar) {
        isp ispVar = hspVar.c;
        if (ispVar != null) {
            int i = EventCardMiddleFighting.w;
            wvb.a0(textView, (Drawable) hinVar.invoke(ispVar));
        } else {
            int i2 = EventCardMiddleFighting.w;
            wvb.c0(textView, hspVar.f13596a, hspVar.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbo)) {
            return false;
        }
        gbo gboVar = (gbo) obj;
        return this.f11024a.equals(gboVar.f11024a) && this.b.equals(gboVar.b) && this.c.equals(gboVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f11024a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FightResultView(title=" + this.f11024a + ", topCell=" + this.b + ", botCell=" + this.c + Separators.RPAREN;
    }
}
