package a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class cf60 implements er8, bv3, qe60 {
    public static final byte[] e = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    public static final byte[] f = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4245a;
    public int b;
    public int c;
    public Object d;

    public cf60(fv40 fv40Var, androidx.media3.common.b bVar) {
        this.f4245a = (byte) 2;
        fq80 fq80Var = fv40Var.e;
        this.d = fq80Var;
        fq80Var.M(12);
        int iD = fq80Var.D();
        if ("audio/raw".equals(bVar.p)) {
            int iQ = vtt0.q(bVar.M) * bVar.J;
            if (iD % iQ != 0) {
                f1t0.g0("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iQ + ", stsz sample size: " + iD);
                iD = iQ;
            }
        }
        this.b = iD == 0 ? -1 : iD;
        this.c = fq80Var.D();
    }

    public static void q(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(ohm0.j(i2));
    }

    @Override // a.bv3
    public void a(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        ((bv3) this.d).a(i + i4, i2 + i4, i3);
    }

    @Override // a.bv3
    public void b(int i, int i2) {
        ((bv3) this.d).b(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // a.bv3
    public void c(Object obj, Function2 function2) {
        ((bv3) this.d).c(obj, function2);
    }

    @Override // a.bv3
    public void d(int i, Object obj) {
        ((bv3) this.d).d(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // a.bv3
    public Object f() {
        return ((bv3) this.d).f();
    }

    @Override // a.er8
    public int g() {
        int i = this.b;
        return i == -1 ? ((fq80) this.d).D() : i;
    }

    @Override // a.bv3
    public void h(int i, Object obj) {
        ((bv3) this.d).h(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // a.bv3
    public void i(Object obj) {
        this.c++;
        ((bv3) this.d).i(obj);
    }

    @Override // a.bv3
    public void j() {
        ((bv3) this.d).j();
    }

    @Override // a.er8
    public int k() {
        return this.b;
    }

    @Override // a.bv3
    public void l() {
        if (this.c <= 0) {
            ykd.a("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        ((bv3) this.d).l();
    }

    @Override // a.er8
    public int m() {
        return this.c;
    }

    @Override // a.qe60
    public int n(int i) {
        int iN = ((qe60) this.d).n(i);
        if (i >= 0 && i <= this.c) {
            pwt0.c(iN, this.b, i);
        }
        return iN;
    }

    public byte o(int i, int i2) {
        return ((byte[][]) this.d)[i2][i];
    }

    public void p(int i, int i2, int i3) {
        ((byte[][]) this.d)[i2][i] = (byte) i3;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050 A[Catch: all -> 0x002e, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0025, B:14:0x0030, B:16:0x0037, B:18:0x0049, B:26:0x006a, B:21:0x0050, B:23:0x0063, B:29:0x006e, B:33:0x007d), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    public synchronized int r() {
        List<ResolveInfo> listQueryBroadcastReceivers;
        int i = this.c;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.d;
        PackageManager packageManager = context.getPackageManager();
        if (grv0.a(context).f24675a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (ufx.F()) {
            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers != null) {
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (true != ufx.F()) {
                i2 = 2;
            }
            this.c = i2;
            return i2;
        }
        Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent3.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
            if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.isEmpty()) {
                Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
                if (true != ufx.F()) {
                    i2 = 2;
                }
                this.c = i2;
                return i2;
            }
            i2 = 2;
        }
        this.c = i2;
        return i2;
    }

    @Override // a.qe60
    public int s(int i) {
        int iS = ((qe60) this.d).s(i);
        if (i >= 0 && i <= this.b) {
            pwt0.b(iS, this.c, i);
        }
        return iS;
    }

    public synchronized int t() {
        PackageInfo packageInfoB;
        if (this.b == 0) {
            try {
                packageInfoB = grv0.a((Context) this.d).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("Metadata", "Failed to find package ".concat(e2.toString()));
                packageInfoB = null;
            }
            if (packageInfoB != null) {
                this.b = packageInfoB.versionCode;
            }
        }
        return this.b;
    }

    public String toString() {
        switch (this.f4245a) {
            case 3:
                int i = this.b;
                int i2 = this.c;
                StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr = ((byte[][]) this.d)[i3];
                    for (int i4 = 0; i4 < i; i4++) {
                        byte b = bArr[i4];
                        if (b == 0) {
                            sb.append(" 0");
                        } else if (b != 1) {
                            sb.append("  ");
                        } else {
                            sb.append(" 1");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ cf60(byte b, int i, int i2, Object obj) {
        this.f4245a = b;
        this.b = i;
        this.c = i2;
        this.d = obj;
    }

    public cf60(Context context) {
        this.f4245a = (byte) 8;
        this.c = 0;
        this.d = context;
    }

    public cf60(int i, int i2) {
        this.f4245a = (byte) 3;
        this.d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.b = i;
        this.c = i2;
    }

    public cf60(qe60 qe60Var, int i, int i2) {
        this.f4245a = (byte) 7;
        this.d = qe60Var;
        this.b = i;
        this.c = i2;
    }

    public cf60(bv3 bv3Var, int i) {
        this.f4245a = (byte) 5;
        this.d = bv3Var;
        this.b = i;
    }

    public /* synthetic */ cf60() {
        this.f4245a = (byte) 0;
    }
}
