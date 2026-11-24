package a;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.huawei.hms.android.HwBuildEx;

/* JADX INFO: loaded from: classes.dex */
public final class elo {
    public static final int E;
    public static final boolean F;
    public boolean A;
    public final String B;
    public final boolean C;
    public final boolean D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8010a;
    public final l9o0 b;
    public final lin0 c;
    public final lin0 d;
    public final w24 e;
    public final m44 f;
    public final w24 g;
    public final sd9 h;
    public final Looper i;
    public final int j;
    public final m24 k;
    public final boolean l;
    public final boolean m;
    public final gvh0 n;
    public final uch0 o;
    public final short p;
    public final short q;
    public final short r;
    public final vvj s;
    public final short t;
    public final short u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final boolean z;

    static {
        String str = vtt0.f38024a;
        String strH0 = j47.H0(Build.DEVICE);
        E = (strH0.contains("emulator") || strH0.contains("emu64a") || strH0.contains("emu64x") || strH0.contains("generic") || strH0.contains("vsoc")) ? 30000 : HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
        F = true;
    }

    public elo(Context context, lin0 lin0Var, lin0 lin0Var2) {
        w24 w24Var = new w24(context, (byte) 4);
        m44 m44Var = new m44((byte) 2);
        byte b = 5;
        w24 w24Var2 = new w24(context, b);
        sd9 sd9Var = new sd9(b);
        context.getClass();
        this.f8010a = context;
        this.c = lin0Var;
        this.d = lin0Var2;
        this.e = w24Var;
        this.f = m44Var;
        this.g = w24Var2;
        this.h = sd9Var;
        this.i = vtt0.u();
        this.k = m24.b;
        this.l = true;
        this.m = true;
        this.n = gvh0.d;
        this.p = (short) 5000;
        this.q = (short) 15000;
        this.r = (short) 3000;
        this.o = uch0.b;
        this.s = new vvj(vtt0.M(20L), vtt0.M(500L));
        this.b = l9o0.f19665a;
        this.t = (short) 500;
        this.u = (short) 2000;
        this.v = 600000;
        boolean z = F;
        this.w = z ? E : Integer.MAX_VALUE;
        this.x = z ? 60000 : Integer.MAX_VALUE;
        this.y = 600000;
        this.z = true;
        this.B = "";
        this.j = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
        }
        this.C = true;
        this.D = true;
    }

    public final ulo a() {
        x0x.K(!this.A);
        this.A = true;
        return new ulo(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public elo(Context context, gwj gwjVar) {
        byte b = 1;
        this(context, new w24(context, b), new fwj(gwjVar, b));
    }

    public elo(Context context) {
        this(context, new w24(context, (byte) 2), new w24(context, (byte) 3));
    }
}
