package a;

import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class qyb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29524a;
    public final n0o0 b;
    public final int c;
    public final n0o0 d;
    public final n0o0 e;
    public boolean f;

    public qyb0(Context context, out0 out0Var) {
        context.getClass();
        out0Var.getClass();
        this.f29524a = context;
        final byte b = 0;
        this.b = maz.b(new Function0(this) { // from class: a.pyb0
            public final /* synthetic */ qyb0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                qyb0 qyb0Var = this.b;
                switch (b2) {
                    case 0:
                        return ((ryb0) qyb0Var.e.getValue()).f31306a;
                    default:
                        return m7x.J(qyb0Var.f29524a);
                }
            }
        });
        this.c = Process.myPid();
        this.d = maz.b(new ssa0(out0Var, (byte) 15));
        final byte b2 = 1;
        this.e = maz.b(new Function0(this) { // from class: a.pyb0
            public final /* synthetic */ qyb0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                qyb0 qyb0Var = this.b;
                switch (b3) {
                    case 0:
                        return ((ryb0) qyb0Var.e.getValue()).f31306a;
                    default:
                        return m7x.J(qyb0Var.f29524a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.b.getValue();
    }

    public final Map b(Map map) {
        n0o0 n0o0Var = this.d;
        if (map == null) {
            return wp20.b(new Pair(a(), new oyb0(Process.myPid(), (String) n0o0Var.getValue())));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(a(), new oyb0(Process.myPid(), (String) n0o0Var.getValue()));
        return xp20.n(linkedHashMap);
    }
}
