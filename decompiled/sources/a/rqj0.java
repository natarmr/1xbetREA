package a;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.ui_core.resources.UiText;

/* JADX INFO: loaded from: classes3.dex */
public final class rqj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f30934a;
    public final ctf0 b;
    public final pru c;
    public final lbu d;

    public rqj0(us00 us00Var, ctf0 ctf0Var, pru pruVar, lbu lbuVar) {
        this.f30934a = us00Var;
        this.b = ctf0Var;
        this.c = pruVar;
        this.d = lbuVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0112  */
    public final ShortcutInfo a(sff0 sff0Var, csj0 csj0Var, Intent intent) {
        String str;
        UiText byRes;
        Icon iconCreateWithResource;
        int iOrdinal = csj0Var.ordinal();
        if (iOrdinal == 0) {
            str = "history";
        } else if (iOrdinal == 1) {
            str = "line";
        } else if (iOrdinal == 2) {
            str = "live";
        } else if (iOrdinal == 3) {
            str = "one_x_games";
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return null;
            }
            str = "cuber_sport";
        }
        us00 us00Var = this.f30934a;
        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(us00Var, str);
        String str2 = sff0Var.d.f27973a.b;
        int iOrdinal2 = csj0Var.ordinal();
        if (iOrdinal2 == 0) {
            byRes = new UiText.ByRes(R.string.bet_history, new CharSequence[0]);
        } else if (iOrdinal2 == 1) {
            byRes = new UiText.ByRes(R.string.line, new CharSequence[0]);
        } else if (iOrdinal2 == 2) {
            byRes = new UiText.ByRes(R.string.live_new, new CharSequence[0]);
        } else if (iOrdinal2 == 3) {
            byRes = new UiText.ByString(str2);
        } else {
            if (iOrdinal2 != 4) {
                t9f.b();
                return null;
            }
            byRes = new UiText.ByRes(R.string.cyberSport, new CharSequence[0]);
        }
        ShortcutInfo.Builder shortLabel = builder.setShortLabel(byRes.a(us00Var));
        Drawable drawableU = epv0.U(dsj0.a(csj0Var), us00Var);
        if (drawableU != null) {
            Bitmap bitmapD = hic.D(drawableU, 0, 0, 7);
            int iB = ctf0.b(R.attr.uikitPrimary, this.b);
            int width = bitmapD.getWidth();
            int height = bitmapD.getHeight();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setColorFilter(new PorterDuffColorFilter(iB, PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmapD, 0.0f, 0.0f, paint);
            int color = Color.parseColor("#F5F5F5");
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), config);
            bitmapCreateBitmap2.getClass();
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            Paint paint2 = new Paint();
            paint2.setColor(color);
            canvas2.drawCircle(bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f, Math.min(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()) / 2.0f, paint2);
            canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, new Paint());
            iconCreateWithResource = Icon.createWithBitmap(bitmapCreateBitmap2);
            if (iconCreateWithResource == null) {
                iconCreateWithResource = Icon.createWithResource(us00Var, dsj0.a(csj0Var));
                iconCreateWithResource.getClass();
            }
        } else {
            iconCreateWithResource = Icon.createWithResource(us00Var, dsj0.a(csj0Var));
            iconCreateWithResource.getClass();
        }
        ShortcutInfo shortcutInfoBuild = shortLabel.setIcon(iconCreateWithResource).setIntent(intent.setAction(csj0Var.a())).setRank(csj0Var.f4892a).build();
        shortcutInfoBuild.getClass();
        return shortcutInfoBuild;
    }

    public final void b(boolean z) {
        us00 us00Var = this.f30934a;
        try {
            sff0 sff0VarA = this.c.a();
            Intent intentQ = j120.Q(us00Var);
            if (intentQ != null && Build.VERSION.SDK_INT >= 25) {
                List list = sff0VarA.R;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    csj0 csj0Var = (csj0) obj;
                    boolean z2 = true;
                    boolean z3 = !csj0Var.d() || (csj0Var.d() && z);
                    if (csj0Var.b() && (!csj0Var.b() || this.d.j())) {
                        z2 = false;
                    }
                    if (z3 && z2) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(a(sff0VarA, (csj0) it.next(), intentQ));
                }
                qrn.a(us00Var.getSystemService(qrn.b())).setDynamicShortcuts(arrayList2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
