package a;

import android.os.Build;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.text.ParseException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hny implements isj0, rbe, zf60, pm30, ols0, cxw, iuo, izj, eer, xbf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13368a;

    public static /* synthetic */ void b() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void i(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + obj);
    }

    public static /* synthetic */ void j(int i, String str) throws ParseException {
        throw new ParseException(str, i);
    }

    public static /* synthetic */ void k(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void m(Object obj, Object obj2, String str) {
        throw new AssertionError(str + obj + obj2);
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void o(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
    }

    public static /* synthetic */ void p(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void q(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void r(StringBuilder sb, Object obj, Object obj2) {
        sb.append('/');
        sb.append(obj);
        sb.append(' ');
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void s(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void u(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void v(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void w(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    @Override // a.izj
    public void a(p5d0 p5d0Var) {
    }

    @Override // a.rbe
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // a.ols0, a.eer
    /* JADX INFO: renamed from: apply */
    public Object mo11apply(Object obj) {
        switch (this.f13368a) {
            case 11:
                s940 s940Var = (s940) obj;
                j910 j910Var = r4d0.f29830a;
                j910Var.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    j910Var.f(s940Var, byteArrayOutputStream);
                    break;
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            default:
                return lyb0.b;
        }
    }

    @Override // a.xbf
    public Object c(Object obj) {
        ((m1r) obj).getClass();
        g1d0.N1.getClass();
        return new g1d0();
    }

    @Override // a.cxw
    public boolean e(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // a.iuo
    public fuo[] f() {
        switch (this.f13368a) {
            case 13:
                return new fuo[]{new iv40(jfn0.f16437a, 16)};
            case 16:
                return new fuo[]{new bf60()};
            default:
                return new fuo[]{new n7d0()};
        }
    }

    @Override // a.isj0
    public boolean g() {
        return false;
    }

    @Override // a.pm30
    public int h(Object obj) {
        String str = ((jm30) obj).f16746a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        switch (this.f13368a) {
            case 8:
                int[] iArr = al10.Z1;
                view.getClass();
                int i = xiv0Var.f40966a.i(1).b;
                int[] iArr2 = al10.Z1;
                for (int i2 = 0; i2 < 3; i2++) {
                    View viewFindViewById = view.findViewById(iArr2[i2]);
                    if (viewFindViewById != null) {
                        sj3.L0(viewFindViewById, 0, i, 0, 0, 13);
                    }
                }
                break;
            default:
                evz evzVar = cu60.U1;
                view.getClass();
                break;
        }
        return xiv0Var;
    }

    public /* synthetic */ hny(byte b) {
        this.f13368a = b;
    }
}
