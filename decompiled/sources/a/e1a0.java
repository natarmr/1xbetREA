package a;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerControlView;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class e1a0 extends yge0 {
    public final /* synthetic */ byte d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public e1a0(r6x r6xVar, Function1 function1, Date date) {
        this.d = (byte) 1;
        this.e = r6xVar;
        this.f = function1;
        this.g = new yz3(this, new pn20((byte) 11));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        this.h = calendar;
    }

    public static boolean B(Calendar calendar, Calendar calendar2) {
        return calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1);
    }

    public boolean A(int i) {
        PlayerControlView playerControlView = (PlayerControlView) this.h;
        my90 my90Var = playerControlView.Q1;
        if (my90Var == null) {
            return false;
        }
        if (i != 0) {
            return i != 1 || (((ulo) my90Var).w(30) && ((ulo) playerControlView.Q1).w(29));
        }
        return ((ulo) my90Var).w(13);
    }

    @Override // a.yge0
    public final int d() {
        switch (this.d) {
            case 0:
                return ((String[]) this.e).length;
            default:
                return ((yz3) this.g).f.size();
        }
    }

    @Override // a.yge0
    public long e(int i) {
        switch (this.d) {
            case 0:
                return i;
            default:
                return super.e(i);
        }
    }

    @Override // a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        byte b = this.d;
        Object obj = this.g;
        switch (b) {
            case 0:
                d1a0 d1a0Var = (d1a0) xhe0Var;
                boolean zA = A(i);
                View view = d1a0Var.f40887a;
                if (zA) {
                    view.setLayoutParams(new hhe0(-1, -2));
                } else {
                    view.setLayoutParams(new hhe0(0, 0));
                }
                d1a0Var.u.setText(((String[]) this.e)[i]);
                String str = ((String[]) this.f)[i];
                TextView textView = d1a0Var.v;
                if (str == null) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(str);
                }
                Drawable drawable = ((Drawable[]) obj)[i];
                ImageView imageView = d1a0Var.w;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                } else {
                    imageView.setVisibility(8);
                }
                break;
            default:
                ybh0 ybh0Var = (ybh0) xhe0Var;
                List list = ((yz3) obj).f;
                list.getClass();
                Calendar calendar = (Calendar) CollectionsKt.W(i, list);
                if (calendar != null) {
                    xxx xxxVar = ybh0Var.u;
                    String str2 = String.format(Locale.ENGLISH, String.valueOf(calendar.get(5)), Arrays.copyOf(new Object[]{"%02d"}, 1));
                    String displayName = calendar.getDisplayName(2, 2, Locale.getDefault());
                    e1a0 e1a0Var = ybh0Var.v;
                    e1a0Var.getClass();
                    int i2 = Calendar.getInstance().get(1);
                    int i3 = calendar.get(1);
                    String strValueOf = i3 != i2 ? String.valueOf(i3) : "";
                    TextView textView2 = xxxVar.c;
                    TextView textView3 = xxxVar.e;
                    textView2.setText(str2);
                    xxxVar.d.setText(displayName);
                    textView3.setText(strValueOf);
                    textView3.setVisibility(strValueOf.length() > 0 ? 0 : 8);
                    ConstraintLayout constraintLayout = xxxVar.f41679a;
                    Calendar calendar2 = (Calendar) e1a0Var.h;
                    calendar2.getClass();
                    constraintLayout.setSelected(B(calendar, calendar2));
                    if (((r6x) e1a0Var.e) instanceof o6x) {
                        ImageView imageView2 = xxxVar.b;
                        Calendar calendar3 = Calendar.getInstance();
                        calendar3.getClass();
                        imageView2.setVisibility(B(calendar, calendar3) ? 0 : 8);
                    }
                }
                break;
        }
    }

    @Override // a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        switch (this.d) {
            case 0:
                PlayerControlView playerControlView = (PlayerControlView) this.h;
                return new d1a0(playerControlView, LayoutInflater.from(playerControlView.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
            default:
                return new ybh0(this, viewGroup);
        }
    }

    public int z() {
        List list = ((yz3) this.g).f;
        list.getClass();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Date time = ((Calendar) it.next()).getTime();
            Date time2 = ((Calendar) this.h).getTime();
            time2.getClass();
            if (Intrinsics.d(time, time2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public e1a0(PlayerControlView playerControlView, String[] strArr, Drawable[] drawableArr) {
        this.d = (byte) 0;
        this.h = playerControlView;
        this.e = strArr;
        this.f = new String[strArr.length];
        this.g = drawableArr;
    }
}
