package a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.InputMethodService;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class hfk0 implements ifk0, tlu0, ojv0, l7w0, b040 {
    public static final hfk0 b = new hfk0(0);
    public static final hfk0 c = new hfk0(1);
    public static final hfk0 d = new hfk0(2);
    public static final hfk0 e = new hfk0(3);
    public static final hfk0 f = new hfk0(4);
    public static final hfk0 g = new hfk0(5);
    public static final hfk0 h = new hfk0(6);
    public static final hfk0 i = new hfk0(7);
    public static final hfk0 j = new hfk0(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12978a;

    public hfk0(qek0 qek0Var, oeg0 oeg0Var, j1q0 j1q0Var, duj dujVar, mne mneVar, gii0 gii0Var, pru pruVar, ort ortVar, knf0 knf0Var, btt0 btt0Var, peg0 peg0Var, ntu ntuVar, ctf0 ctf0Var, wsf0 wsf0Var, x2c0 x2c0Var, ok50 ok50Var, ii iiVar, uzc0 uzc0Var, wdk0 wdk0Var, uqe uqeVar, iqt iqtVar, grj grjVar, jlx jlxVar, r9u r9uVar) {
        this.f12978a = (byte) 16;
        oeg0Var.getClass();
        j1q0Var.getClass();
        gii0Var.getClass();
        knf0Var.getClass();
        btt0Var.getClass();
        ctf0Var.getClass();
        x2c0Var.getClass();
        iiVar.getClass();
        wdk0Var.getClass();
        r9uVar.getClass();
    }

    public static void l(androidx.fragment.app.e eVar) {
        eVar.getClass();
        if (eVar.J("AggregatorGameNicknameDialog") == null) {
            kv0 kv0Var = new kv0();
            kv0Var.k2.x(kv0Var, kv0.o2[0], "GAME_NICKNAME_REQUEST_KEY");
            kv0Var.H0(eVar, "AggregatorGameNicknameDialog");
        }
    }

    public static SharedPreferences n(Context context, String str) {
        return context.getSharedPreferences("com.google.firebase.auth.internal.browserSignInSessionStore." + str, 0);
    }

    public static void o(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
    }

    @Override // a.l7w0
    public int a() {
        return R.string.one_x_slots_vers;
    }

    @Override // a.ojv0
    public kjv0 b(Activity activity, x6k x6kVar) {
        vq8.G.getClass();
        return new kjv0(new tq8(uq8.a().f(activity)), x6kVar.h(activity));
    }

    @Override // a.l7w0
    public String c() {
        return "OdEeB7/NHtslqGjArd";
    }

    @Override // a.l7w0
    public int d() {
        return R.string.one_x_slots_second_v;
    }

    @Override // a.tlu0
    public View e(View view, AttributeSet attributeSet) {
        view.getClass();
        attributeSet.getClass();
        if (view instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) view;
            Context context = toolbar.getContext();
            context.getClass();
            int iD = tlu0.d(context, attributeSet, android.R.attr.title);
            Context context2 = toolbar.getContext();
            context2.getClass();
            int iD2 = tlu0.d(context2, attributeSet, R.attr.title);
            Context context3 = toolbar.getContext();
            context3.getClass();
            int iD3 = tlu0.d(context3, attributeSet, android.R.attr.subtitle);
            Context context4 = toolbar.getContext();
            context4.getClass();
            int iD4 = tlu0.d(context4, attributeSet, R.attr.subtitle);
            if (iD > 0) {
                toolbar.setTitle(iD);
            } else if (iD2 > 0) {
                toolbar.setTitle(iD2);
            }
            if (iD3 > 0) {
                toolbar.setSubtitle(iD3);
                return view;
            }
            if (iD4 > 0) {
                toolbar.setSubtitle(iD4);
            }
        }
        return view;
    }

    @Override // a.l7w0
    public String f() {
        return "vPHH9PpTZzp";
    }

    @Override // a.ojv0
    public kjv0 g(Context context, x6k x6kVar) {
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            return b((Activity) baseContext, x6kVar);
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            jf4.o("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new kjv0(new Rect(0, 0, point.x, point.y), x6kVar.h(context));
    }

    public void h(Drawable drawable, fet fetVar, int i2) {
        fetVar.g0(257732500);
        int i3 = (fetVar.i(drawable) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarN = o7k0.n(jm40.b, qje.e);
            boolean zI = fetVar.i(drawable);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new nop0((Object) drawable, (byte) 11);
                fetVar.o0(objP);
            }
            zq8.a(0, fetVar, rq8.K(mm40VarN, (Function1) objP));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a6p0((Object) this, (Object) drawable, i2, (byte) 12);
        }
    }

    @Override // a.l7w0
    public int i() {
        return R.string.one_x_slots_second_k;
    }

    @Override // a.l7w0
    public String j() {
        return "MBYGo6kbu/8IzM8";
    }

    @Override // a.l7w0
    public int k() {
        return R.string.one_x_slots_first_k;
    }

    @Override // a.l7w0
    public int m() {
        return R.string.one_x_slots_first_v;
    }

    public String toString() {
        switch (this.f12978a) {
            case 0:
                return "Start";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ hfk0(byte b2) {
        this.f12978a = b2;
    }

    @Override // a.b040
    public void c(ox30 ox30Var, boolean z) {
    }

    @Override // a.b040
    public boolean f(ox30 ox30Var) {
        return false;
    }

    @Override // a.ifk0
    public int a(int i2, int i3, int i4, int i5) {
        return 0;
    }

    @Override // a.l7w0
    public String b() {
        return "yW3mrTgpoL4/KRJQ0jFDJpDJso=";
    }

    @Override // a.l7w0
    public String e() {
        return "Rs1IG0T3vGjub/jvTEUTyQwiLTJ";
    }
}
