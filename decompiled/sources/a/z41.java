package a;

import android.content.SharedPreferences;
import android.util.AtomicFile;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class z41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f43745a;
    public final vby b;
    public final q7d0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final k050 h = new k050();

    public z41(vby vbyVar, us00 us00Var, q7d0 q7d0Var) {
        this.f43745a = us00Var;
        this.b = vbyVar;
        this.c = q7d0Var;
        final byte b = 0;
        this.d = maz.b(new Function0(this) { // from class: a.v41
            public final /* synthetic */ z41 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                z41 z41Var = this.b;
                switch (b2) {
                    case 0:
                        return z41Var.a("layoutConfigurationVirtual.json");
                    case 1:
                        return z41Var.a("layoutConfigurationAggregatorAuth.json");
                    default:
                        return z41Var.a("layoutConfigurationAggregatorUnAuth.json");
                }
            }
        });
        final byte b2 = 1;
        this.e = maz.b(new Function0(this) { // from class: a.v41
            public final /* synthetic */ z41 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                z41 z41Var = this.b;
                switch (b3) {
                    case 0:
                        return z41Var.a("layoutConfigurationVirtual.json");
                    case 1:
                        return z41Var.a("layoutConfigurationAggregatorAuth.json");
                    default:
                        return z41Var.a("layoutConfigurationAggregatorUnAuth.json");
                }
            }
        });
        final byte b3 = 2;
        this.f = maz.b(new Function0(this) { // from class: a.v41
            public final /* synthetic */ z41 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                z41 z41Var = this.b;
                switch (b4) {
                    case 0:
                        return z41Var.a("layoutConfigurationVirtual.json");
                    case 1:
                        return z41Var.a("layoutConfigurationAggregatorAuth.json");
                    default:
                        return z41Var.a("layoutConfigurationAggregatorUnAuth.json");
                }
            }
        });
    }

    public static String b(int i, String str, int i2, String str2) {
        byte[] bytes = (str + i + i2 + str2).getBytes(Charsets.UTF_8);
        bytes.getClass();
        String string = UUID.nameUUIDFromBytes(bytes).toString();
        string.getClass();
        return string;
    }

    public final f51 a(String str) throws g2 {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            vby vbyVar = this.b;
            InputStream inputStreamOpen = this.f43745a.getAssets().open(str);
            try {
                byte[] bArr = new byte[inputStreamOpen.available()];
                inputStreamOpen.read(bArr);
                String str2 = new String(bArr, Charsets.UTF_8);
                inputStreamOpen.close();
                g0g0Var = (f51) vbyVar.b(f51.Companion.serializer(), str2);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    bkb.E(inputStreamOpen, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th3);
        }
        if (j0g0.a(g0g0Var) == null) {
            return (f51) g0g0Var;
        }
        throw new g2((byte) 2);
    }

    public final f51 c(String str, mi0 mi0Var, int i, String str2) {
        Object g0g0Var;
        f51 f51Var;
        str.getClass();
        mi0Var.getClass();
        str2.getClass();
        boolean z = str.length() > 0;
        String strB = b(mi0Var.f21822a, str, i, str2);
        ConcurrentHashMap concurrentHashMap = this.g;
        Object obj = concurrentHashMap.get(strB);
        if (obj == null) {
            try {
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = e(strB, mi0Var, z);
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            if (j0g0.a(g0g0Var) != null) {
                int i2 = w41.f38522a[mi0Var.ordinal()];
                if (i2 == 1 && z) {
                    f51Var = (f51) this.e.getValue();
                } else if (i2 == 1) {
                    f51Var = (f51) this.f.getValue();
                } else {
                    n0o0 n0o0Var = this.d;
                    f51Var = (i2 != 2 || z) ? (f51) n0o0Var.getValue() : (f51) n0o0Var.getValue();
                }
                g0g0Var = f51Var;
            }
            obj = (f51) g0g0Var;
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(strB, obj);
            if (objPutIfAbsent != null) {
                obj = objPutIfAbsent;
            }
        }
        obj.getClass();
        return (f51) obj;
    }

    public final String d(String str) {
        return kng0.m(this.f43745a.getNoBackupFilesDir().toString(), "myAggregatorConfiguration", str, ".json");
    }

    public final f51 e(String str, mi0 mi0Var, boolean z) throws g2 {
        String str2;
        int i = w41.f38522a[mi0Var.ordinal()];
        if (i == 1 && z) {
            str2 = "LAST_AUTH_MY_AGGREGATOR_KEY";
        } else if (i == 1) {
            str2 = "LAST_UN_AUTH_MY_AGGREGATOR_KEY";
        } else {
            str2 = (i == 2 && z) ? "LAST_AUTH_MY_VIRTUAL_KEY" : "LAST_UN_AUTH_MY_VIRTUAL_KEY";
        }
        q7d0 q7d0Var = this.c;
        String string = q7d0Var.a().getString(str2, "");
        if (string == null) {
            string = "";
        }
        if (!Intrinsics.d(str, kotlin.text.c.r(string, str2.concat("_SCREEN_CONFIG_"), "", false))) {
            throw new g2((byte) 7);
        }
        String string2 = q7d0Var.a().getString(string, "");
        return (f51) this.b.b(f51.Companion.serializer(), string2 != null ? string2 : "");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, mi0 mi0Var, int i, String str2, zje zjeVar) {
        x41 x41Var;
        String strB;
        k050 k050Var;
        Object g0g0Var;
        if (zjeVar instanceof x41) {
            x41Var = (x41) zjeVar;
            int i2 = x41Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x41Var.m = i2 - Integer.MIN_VALUE;
            } else {
                x41Var = new x41(this, zjeVar);
            }
        } else {
            x41Var = new x41(this, zjeVar);
        }
        Object obj = x41Var.k;
        wne wneVar = wne.f39444a;
        int i3 = x41Var.m;
        if (i3 == 0) {
            z1x.P(obj);
            strB = b(mi0Var.f21822a, str, i, str2);
            x41Var.i = strB;
            k050Var = this.h;
            x41Var.j = k050Var;
            x41Var.m = 1;
            if (k050Var.d(x41Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = x41Var.j;
            strB = x41Var.i;
            z1x.P(obj);
        }
        try {
            AtomicFile atomicFile = new AtomicFile(new File(d(strB)));
            try {
                e0g0 e0g0Var = j0g0.b;
                byte[] fully = atomicFile.readFully();
                fully.getClass();
                g0g0Var = (f51) this.b.b(f51.Companion.serializer(), new String(fully, Charsets.UTF_8));
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            if (j0g0.a(g0g0Var) != null) {
                throw new g2((byte) 7);
            }
            f51 f51Var = (f51) g0g0Var;
            k050Var.c(null);
            return f51Var;
        } catch (Throwable th2) {
            k050Var.c(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, mi0 mi0Var, int i, String str2, f51 f51Var, zje zjeVar) {
        y41 y41Var;
        String str3;
        k050 k050Var;
        mi0 mi0Var2;
        String str4;
        FileOutputStream fileOutputStreamStartWrite;
        if (zjeVar instanceof y41) {
            y41Var = (y41) zjeVar;
            int i2 = y41Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y41Var.p = i2 - Integer.MIN_VALUE;
            } else {
                y41Var = new y41(this, zjeVar);
            }
        } else {
            y41Var = new y41(this, zjeVar);
        }
        Object obj = y41Var.n;
        wne wneVar = wne.f39444a;
        int i3 = y41Var.p;
        boolean z = true;
        if (i3 == 0) {
            z1x.P(obj);
            String strB = b(mi0Var.f21822a, str, i, str2);
            y41Var.i = str;
            y41Var.j = mi0Var;
            y41Var.k = f51Var;
            y41Var.l = strB;
            k050 k050Var2 = this.h;
            y41Var.m = k050Var2;
            y41Var.p = 1;
            if (k050Var2.d(y41Var) == wneVar) {
                return wneVar;
            }
            str3 = str;
            k050Var = k050Var2;
            mi0Var2 = mi0Var;
            str4 = strB;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = y41Var.m;
            str4 = y41Var.l;
            f51Var = y41Var.k;
            mi0Var2 = y41Var.j;
            str3 = y41Var.i;
            z1x.P(obj);
        }
        try {
            AtomicFile atomicFile = new AtomicFile(new File(d(str4)));
            String strD = this.b.d(f51.Companion.serializer(), f51Var);
            try {
                fileOutputStreamStartWrite = atomicFile.startWrite();
                try {
                    byte[] bytes = strD.getBytes(Charsets.UTF_8);
                    bytes.getClass();
                    fileOutputStreamStartWrite.write(bytes);
                    atomicFile.finishWrite(fileOutputStreamStartWrite);
                    if (str3.length() <= 0) {
                        z = false;
                    }
                    h(str4, mi0Var2, z, strD);
                    k050Var.c(null);
                    return Unit.f46060a;
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStreamStartWrite != null) {
                        atomicFile.failWrite(fileOutputStreamStartWrite);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStreamStartWrite = null;
            }
        } catch (Throwable th3) {
            k050Var.c(null);
            throw th3;
        }
    }

    public final void h(String str, mi0 mi0Var, boolean z, String str2) {
        String str3;
        int i = w41.f38522a[mi0Var.ordinal()];
        if (i == 1 && z) {
            str3 = "LAST_AUTH_MY_AGGREGATOR_KEY";
        } else if (i == 1) {
            str3 = "LAST_UN_AUTH_MY_AGGREGATOR_KEY";
        } else {
            str3 = (i == 2 && z) ? "LAST_AUTH_MY_VIRTUAL_KEY" : "LAST_UN_AUTH_MY_VIRTUAL_KEY";
        }
        String strL = kng0.l(str3, "_SCREEN_CONFIG_", str);
        String strConcat = str3.concat("_SCREEN_CONFIG_");
        q7d0 q7d0Var = this.c;
        SharedPreferences.Editor editorEdit = q7d0Var.a().edit();
        editorEdit.getClass();
        for (String str4 : q7d0Var.a().getAll().keySet()) {
            str4.getClass();
            if (kotlin.text.c.x(str4, strConcat, false)) {
                editorEdit.remove(str4);
            }
        }
        editorEdit.apply();
        q7d0Var.g(strL, str2);
        q7d0Var.g(str3, strL);
    }
}
