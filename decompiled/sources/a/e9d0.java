package a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.net.ProtocolException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e9d0 implements xbf, qbl, upg0, rbe, w4i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7416a;

    public /* synthetic */ e9d0(byte b) {
        this.f7416a = b;
    }

    public static /* synthetic */ void b() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void d(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(int i, String str, Object obj) {
        throw new IllegalArgumentException(str + obj + ((char) i));
    }

    public static /* synthetic */ void g(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str + obj + obj2);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void j(String str) throws ProtocolException {
        throw new ProtocolException(str);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void l(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void m(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void n(StringBuilder sb, Object obj) {
        sb.append(", ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ void o() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void p(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void q(Object obj, Object obj2, String str) {
        throw new ss3(str + obj + obj2);
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void s(String str) throws fsg0 {
        throw new fsg0(str);
    }

    public static /* synthetic */ void t(String str, Throwable th) {
        throw new IllegalArgumentException(str, th);
    }

    public static /* synthetic */ void u(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void v(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void w(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void x(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void y(Object obj, String str) {
        throw new IllegalStateException((str + obj + '\'').toString());
    }

    @Override // a.w4i0
    public u4i0 a(cgx0 cgx0Var) {
        switch (this.f7416a) {
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                hu5 hu5Var = (hu5) cgx0Var.d;
                return new u4i0(hu5Var.c(hu5Var.b), hu5Var.c(hu5Var.c), cgx0Var.q() == fef.f9404a);
            default:
                return qxw.r(cgx0Var, gqw0.B1);
        }
    }

    @Override // a.rbe
    public void accept(Object obj) {
        ((fxg0) obj).b.getClass();
    }

    @Override // a.upg0
    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                cu cuVarA = q55.a();
                cuVarA.p(cursorRawQuery.getString(1));
                cuVarA.d = pwb0.b(cursorRawQuery.getInt(2));
                String string = cursorRawQuery.getString(3);
                cuVarA.c = string == null ? null : Base64.decode(string, 0);
                arrayList.add(cuVarA.c());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // a.xbf
    public Object c(Object obj) {
        byte b = this.f7416a;
        ((m1r) obj).getClass();
        switch (b) {
            case 1:
                nld0.S1.getClass();
                return new nld0();
            case 9:
                z3f0.Y1.getClass();
                return new z3f0();
            default:
                iaf0.Z1.getClass();
                return new iaf0();
        }
    }

    @Override // a.qbl
    public double e(double d) {
        return d;
    }
}
