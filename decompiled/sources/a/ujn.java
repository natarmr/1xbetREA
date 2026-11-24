package a;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.Display;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
public class ujn implements vq8, vke, jyb, jgd, l3u0, syh, k3z, da30, kotlin.coroutines.f, lz4, dqt0, yi80, igk0, idk0 {
    public static String h = "https://mob-experience.space";
    public static lbu p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35791a;
    public static final ujn b = new ujn(1);
    public static final f93 c = new f93();
    public static final ujn d = new ujn(4);
    public static final ujn e = new ujn(5);
    public static final ujn f = new ujn(6);
    public static final ujn g = new ujn(7);
    public static final ujn i = new ujn(9);
    public static final ujn j = new ujn(10);
    public static final ujn k = new ujn(11);
    public static final ujn l = new ujn(12);
    public static final ujn m = new ujn(13);
    public static final juw n = new juw();
    public static final ujn o = new ujn(15);
    public static final ujn q = new ujn(16);
    public static final ujn r = new ujn(17);
    public static final ujn s = new ujn(18);
    public static final ujn t = new ujn(19);
    public static final /* synthetic */ ujn u = new ujn(20);
    public static final ujn v = new ujn(21);
    public static final ujn w = new ujn(22);
    public static final ujn x = new ujn(23);
    public static final ujn y = new ujn(24);
    public static final ujn z = new ujn(25);
    public static final ujn A = new ujn(26);
    public static final ujn B = new ujn(27);
    public static final ujn Y = new ujn(28);
    public static final ujn Z = new ujn(29);

    public /* synthetic */ ujn(byte b2) {
        this.f35791a = b2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static lq5 i(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -2090424991:
                if (str.equals("squareSNoTitle")) {
                    return kq5.f18703a;
                }
                break;
            case -1965110577:
                if (str.equals("squareL")) {
                    return hq5.f13470a;
                }
                break;
            case -1512067420:
                if (str.equals("rectangleHorizontalNoTitle")) {
                    return eq5.f8219a;
                }
                break;
            case -1405195448:
                if (str.equals("squareLNoTitle")) {
                    return iq5.f15191a;
                }
                break;
            case -1273259515:
                if (str.equals("rectangleVertical")) {
                    return fq5.f9956a;
                }
                break;
            case -464899246:
                if (str.equals("rectangleVerticalNoTitle")) {
                    return gq5.f11714a;
                }
                break;
            case 409161556:
                if (str.equals("cardHorizontal")) {
                    return cq5.f4775a;
                }
                break;
            case 1645369075:
                if (str.equals("rectangleHorizontal")) {
                    return dq5.f6497a;
                }
                break;
        }
        return new jq5();
    }

    @Override // a.lz4
    public int b() {
        return 2;
    }

    @Override // a.dqt0
    public Object c(pn pnVar, yje yjeVar) {
        return Boolean.FALSE;
    }

    @Override // a.dqt0
    public boolean d() {
        return false;
    }

    public void e(final x9g x9gVar, final g2v g2vVar, final boolean z2, final Function0 function0, fet fetVar, final int i2) {
        yfe0 yfe0VarU;
        Function2 function2;
        mdm mdmVar;
        fetVar.g0(1777289802);
        int i3 = i2 | (fetVar.g(x9gVar) ? 4 : 2) | (fetVar.g(g2vVar) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (!(x9gVar instanceof v9g)) {
                if (Intrinsics.d(x9gVar, w9g.f38778a)) {
                    fetVar.e0(-1115971655);
                    Object objP = fetVar.P();
                    if (objP == ukd.f35823a) {
                        objP = g2v.b(g2vVar, z2 ? pb10.q : ozb.K(-1L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022);
                        fetVar.o0(objP);
                    }
                    mdmVar = (mdm) objP;
                    fetVar.r(false);
                } else {
                    if (!Intrinsics.d(x9gVar, u9g.f35282a)) {
                        throw b1j.f(-1421476403, fetVar, false);
                    }
                    fetVar.e0(-1115708558);
                    fetVar.r(false);
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU == null) {
                        return;
                    }
                    final byte b2 = 0;
                    function2 = new Function2(this, x9gVar, g2vVar, z2, function0, i2, b2) { // from class: a.a5g

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ byte f269a;
                        public final /* synthetic */ ujn b;
                        public final /* synthetic */ x9g c;
                        public final /* synthetic */ g2v d;
                        public final /* synthetic */ boolean e;
                        public final /* synthetic */ Function0 f;

                        {
                            this.f269a = b2;
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.f269a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iL = x8x.L(1);
                                    this.b.e(this.c, this.d, this.e, this.f, (fet) obj, iL);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iL2 = x8x.L(1);
                                    this.b.e(this.c, this.d, this.e, this.f, (fet) obj, iL2);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                }
                yfe0VarU.d = function2;
            }
            fetVar.e0(-1421474570);
            fetVar.r(false);
            mdmVar = ((v9g) x9gVar).f37033a;
            mdm mdmVar2 = mdmVar;
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jcb.l(null, mdmVar2, false, function0, fetVar, i3 & 7168, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b3 = 1;
            function2 = new Function2(this, x9gVar, g2vVar, z2, function0, i2, b3) { // from class: a.a5g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f269a;
                public final /* synthetic */ ujn b;
                public final /* synthetic */ x9g c;
                public final /* synthetic */ g2v d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ Function0 f;

                {
                    this.f269a = b3;
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f269a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iL = x8x.L(1);
                            this.b.e(this.c, this.d, this.e, this.f, (fet) obj, iL);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iL2 = x8x.L(1);
                            this.b.e(this.c, this.d, this.e, this.f, (fet) obj, iL2);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    @Override // a.vq8
    public Rect f(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i2 = rect.bottom + dimensionPixelSize;
            if (i2 == point.y) {
                rect.bottom = i2;
                return rect;
            }
            int i3 = rect.right + dimensionPixelSize;
            if (i3 == point.x) {
                rect.right = i3;
            }
        }
        return rect;
    }

    @Override // a.igk0
    public boolean g(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // a.syh
    public Iterable h(Object obj) {
        iiy[] iiyVarArr = mey.h;
        return ((mp9) obj).o1().k();
    }

    public ArrayList j(Member member) {
        Method method;
        lbu lbuVar;
        member.getClass();
        lbu lbuVar2 = p;
        Object obj = null;
        if (lbuVar2 == null) {
            synchronized (this) {
                lbuVar2 = p;
                if (lbuVar2 == null) {
                    Class<?> cls = member.getClass();
                    byte b2 = 25;
                    try {
                        lbuVar = new lbu(cls.getMethod("getParameters", null), bqe0.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null), b2);
                    } catch (NoSuchMethodException unused) {
                        lbuVar = new lbu(obj, obj, b2);
                    }
                    p = lbuVar;
                    lbuVar2 = lbuVar;
                }
            }
        }
        Method method2 = (Method) lbuVar2.b;
        if (method2 == null || (method = (Method) lbuVar2.c) == null) {
            return null;
        }
        Object objInvoke = method2.invoke(member, null);
        objInvoke.getClass();
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj2 : objArr) {
            Object objInvoke2 = method.invoke(obj2, null);
            objInvoke2.getClass();
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }

    @Override // a.vke
    public Object o(Object obj) {
        return (ResponseBody) obj;
    }

    public String toString() {
        switch (this.f35791a) {
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return "ReferentialEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // a.jgd
    public Object x0(pzu pzuVar) {
        Object objE = pzuVar.e(new jkd0(cc5.class, Executor.class));
        objE.getClass();
        return obb.Y((Executor) objE);
    }

    @Override // a.l3u0
    public Object z0(ndy ndyVar, float f2) {
        switch (this.f35791a) {
            case 13:
                return Float.valueOf(vdy.d(ndyVar) * f2);
            default:
                int iW = ndyVar.w();
                if (iW == 1) {
                    return vdy.b(ndyVar, f2);
                }
                if (iW == 3) {
                    return vdy.b(ndyVar, f2);
                }
                if (iW != 7) {
                    jf4.o("Cannot convert json to point. Next token is ".concat(w6x.B(iW)));
                    return null;
                }
                PointF pointF = new PointF(((float) ndyVar.q()) * f2, ((float) ndyVar.q()) * f2);
                while (ndyVar.l()) {
                    ndyVar.H();
                }
                return pointF;
        }
    }

    @Override // a.yi80
    public int a(w6k w6kVar, int i2) {
        return i2;
    }
}
