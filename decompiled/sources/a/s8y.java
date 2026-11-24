package a;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class s8y {
    public static final /* synthetic */ iiy[] d = {sre0.f32672a.h(new l0d0(op9.NO_RECEIVER, s8y.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31826a;
    public final ThreadLocal b;
    public final wbj c;

    public s8y(Context context, String str) {
        context.getClass();
        this.f31826a = str;
        this.b = new ThreadLocal();
        final byte b = 0;
        ugf0 ugf0Var = new ugf0(new Function1(this) { // from class: a.r8y
            public final /* synthetic */ s8y b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                s8y s8yVar = this.b;
                switch (b2) {
                    case 0:
                        soe soeVar = (soe) obj;
                        soeVar.getClass();
                        Log.w(sre0.f32672a.b(s8y.class).J(), "CorruptionException in " + s8yVar.f31826a + " DataStore running in process " + Process.myPid(), soeVar);
                        return new az40(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = s8yVar.f31826a;
                        LinkedHashSet linkedHashSet = yoj0.f42989a;
                        linkedHashSet.getClass();
                        yje yjeVar = null;
                        return kotlin.collections.a.c(new xoj0(context2, str2, zoj0.f44723a, new bai0(linkedHashSet, yjeVar, (byte) 18), new jgb0(3, yjeVar, (byte) 15)));
                }
            }
        });
        final byte b2 = 1;
        Function1 function1 = new Function1(this) { // from class: a.r8y
            public final /* synthetic */ s8y b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                s8y s8yVar = this.b;
                switch (b3) {
                    case 0:
                        soe soeVar = (soe) obj;
                        soeVar.getClass();
                        Log.w(sre0.f32672a.b(s8y.class).J(), "CorruptionException in " + s8yVar.f31826a + " DataStore running in process " + Process.myPid(), soeVar);
                        return new az40(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = s8yVar.f31826a;
                        LinkedHashSet linkedHashSet = yoj0.f42989a;
                        linkedHashSet.getClass();
                        yje yjeVar = null;
                        return kotlin.collections.a.c(new xoj0(context2, str2, zoj0.f44723a, new bai0(linkedHashSet, yjeVar, (byte) 18), new jgb0(3, yjeVar, (byte) 15)));
                }
            }
        };
        rwj rwjVar = tvk.f34603a;
        dvj dvjVar = dvj.c;
        kin0 kin0VarE = qem0.e();
        dvjVar.getClass();
        this.c = (wbj) new ysb0(str, ugf0Var, function1, d5c.a(kotlin.coroutines.e.c(dvjVar, kin0VarE))).n(d[0], context);
    }

    public final void a(Function1 function1) {
    }

    public final Object b(zsb0 zsb0Var, Long l) {
        zsb0Var.getClass();
        return eeq.U(kotlin.coroutines.g.f46065a, new c6y((Object) this, (Object) zsb0Var, (Object) l, (yje) null, (byte) 5));
    }
}
