package a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import com.google.android.gms.internal.p000firebaseauthapi.zzajg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public class s88 implements pf00, gld0 {
    public static s88 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31790a;
    public boolean b;
    public Object c;

    public s88(Context context, n2a n2aVar) {
        this.f31790a = (byte) 2;
        context.getClass();
        boolean z = false;
        this.b = Build.VERSION.SDK_INT >= 34 && context.getDeviceId() != 0;
        PackageManager packageManager = context.getPackageManager();
        Integer numB = n2aVar != null ? n2aVar.b() : null;
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        boolean zHasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.camera.front");
        boolean z2 = zHasSystemFeature && (numB == null || numB.intValue() == 1);
        if (zHasSystemFeature2 && (numB == null || numB.intValue() == 0)) {
            z = true;
        }
        this.c = new x3a(z2, z);
    }

    public static boolean j(Set set, n2a n2aVar) {
        try {
            n2aVar.c(new LinkedHashSet(set));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static com.google.firebase.auth.zzc x(Intent intent) {
        Parcelable.Creator<zzajg> creator = zzajg.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
        zzajg zzajgVar = (zzajg) (byteArrayExtra == null ? null : n6x.w(byteArrayExtra, creator));
        zzajgVar.i = true;
        return com.google.firebase.auth.zzc.p(zzajgVar);
    }

    public static void y(Context context) {
        s88 s88Var = d;
        s88Var.b = false;
        if (((omw0) s88Var.c) != null) {
            gr00.t(context).F((omw0) d.c);
        }
        d.c = null;
    }

    @Override // a.gld0
    public void a(fld0 fld0Var, int i) {
        StringBuilder sb = (StringBuilder) this.c;
        if (this.b) {
            this.b = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public void b(int i) {
        x0x.K(!this.b);
        ((SparseBooleanArray) this.c).append(i, true);
    }

    @Override // a.pf00
    public void c(int i, int i2) {
        lza lzaVar = (lza) this.c;
        if (this.b) {
            return;
        }
        if (i2 <= 10) {
            lzaVar.k(i, i2);
        } else {
            this.b = true;
            lzaVar.g();
        }
    }

    @Override // a.pf00
    public void d(int i, int i2) {
        if (this.b) {
            return;
        }
        ((lza) this.c).l(i, i2);
    }

    public jjq e() {
        x0x.K(!this.b);
        this.b = true;
        return new jjq((SparseBooleanArray) this.c);
    }

    @Override // a.pf00
    public void f(int i, int i2, Object obj) {
        if (this.b) {
            return;
        }
        ((lza) this.c).j(i, i2, obj);
    }

    @Override // a.pf00
    public void g(int i, int i2) {
        if (this.b) {
            return;
        }
        ((lza) this.c).i(i, i2);
    }

    public void h() {
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.c;
                if (cancellationSignal != null) {
                    try {
                        cancellationSignal.cancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean i() {
        return this.b;
    }

    public boolean k(LinkedHashSet linkedHashSet, Set set) {
        x3a x3aVar = (x3a) this.c;
        boolean z = x3aVar.b;
        boolean z2 = x3aVar.f40208a;
        set.getClass();
        if (!this.b && (z2 || z)) {
            n2a n2aVar = n2a.c;
            n2aVar.getClass();
            boolean zJ = j(linkedHashSet, n2aVar);
            n2a n2aVar2 = n2a.b;
            n2aVar2.getClass();
            boolean zJ2 = j(linkedHashSet, n2aVar2);
            Set set2 = set;
            ArrayList arrayList = new ArrayList(r3d.q(set2, 10));
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(((h0a) it.next()).a());
            }
            Set setP0 = CollectionsKt.P0(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : linkedHashSet) {
                if (!setP0.contains(((s0a) obj).h().e())) {
                    arrayList2.add(obj);
                }
            }
            Set setP1 = CollectionsKt.P0(arrayList2);
            n2a n2aVar3 = n2a.c;
            n2aVar3.getClass();
            boolean zJ3 = j(setP1, n2aVar3);
            n2a n2aVar4 = n2a.b;
            n2aVar4.getClass();
            boolean zJ4 = j(setP1, n2aVar4);
            boolean z3 = z2 && zJ && !zJ3;
            boolean z4 = z && zJ2 && !zJ4;
            if (z3 || z4) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    public boolean l(int i, CharSequence charSequence) {
        char c = 0;
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            e9d0.o();
            return false;
        }
        if (((jdk0) this.c) == null) {
            return i();
        }
        c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            s88 s88Var = o5q0.f24700a;
            if (directionality == 0) {
                c = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        c = 2;
                        continue;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return i();
        }
        return false;
    }

    public void m() {
        this.b = false;
    }

    public void n(byte b) {
        ((y78) this.c).x(String.valueOf(b));
    }

    public void o(char c) {
        y78 y78Var = (y78) this.c;
        y78Var.j(y78Var.b, 1);
        char[] cArr = (char[]) y78Var.c;
        int i = y78Var.b;
        y78Var.b = i + 1;
        cArr[i] = c;
    }

    public void p(int i) {
        ((y78) this.c).x(String.valueOf(i));
    }

    public void q(long j) {
        ((y78) this.c).x(String.valueOf(j));
    }

    public void r(String str) {
        str.getClass();
        ((y78) this.c).x(str);
    }

    public void s(short s) {
        ((y78) this.c).x(String.valueOf(s));
    }

    public void t(String str) {
        byte b;
        str.getClass();
        y78 y78Var = (y78) this.c;
        y78Var.j(y78Var.b, str.length() + 2);
        char[] cArr = (char[]) y78Var.c;
        int i = y78Var.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = wsm0.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    y78Var.j(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = wsm0.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) y78Var.c)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = wsm0.f39700a[cCharAt];
                        str2.getClass();
                        y78Var.j(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) y78Var.c, i4);
                        int length3 = str2.length() + i4;
                        y78Var.b = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) y78Var.c;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        y78Var.b = i4;
                    }
                }
                y78Var.j(i4, 1);
                ((char[]) y78Var.c)[i4] = '\"';
                y78Var.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        y78Var.b = i3 + 1;
    }

    public String toString() {
        switch (this.f31790a) {
            case 7:
                return this.b ? "FALL_THROUGH" : String.valueOf(this.c);
            default:
                return super.toString();
        }
    }

    public void w(j2a j2aVar) throws w3a {
        x3a x3aVar = (x3a) this.c;
        j2aVar.getClass();
        if (this.b) {
            l8x.U("CameraValidator", "Virtual device with " + j2aVar.c().size() + " cameras. Skipping validation.");
            return;
        }
        l8x.U("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE);
        if (x3aVar.f40208a) {
            try {
                n2a.c.c(j2aVar.c()).getClass();
            } catch (RuntimeException e) {
                e = e;
                l8x.F0("CameraValidator", "Camera LENS_FACING_BACK verification failed", e);
            }
        }
        e = null;
        if (x3aVar.b) {
            try {
                n2a.b.c(j2aVar.c()).getClass();
            } catch (RuntimeException e2) {
                l8x.F0("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e2);
                if (e == null) {
                    e = e2;
                }
            }
        }
        if (e != null) {
            throw new w3a(j2aVar.c().size(), e);
        }
    }

    public void u() {
    }

    public void v() {
    }

    public /* synthetic */ s88(Object obj, byte b) {
        this.f31790a = b;
        this.c = obj;
    }

    public /* synthetic */ s88(Object obj, byte b, boolean z) {
        this.f31790a = b;
        this.c = obj;
        this.b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ s88(Object obj, int i, byte b) {
        this.f31790a = b;
        this.c = obj;
        this.b = i;
    }

    public /* synthetic */ s88(Object obj, boolean z, byte b) {
        this.f31790a = b;
        this.b = z;
        this.c = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s88(byte b) {
        this((Object) null, false, (byte) 0);
        this.f31790a = b;
        switch (b) {
            case 6:
                this.c = new SparseBooleanArray();
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s88(jdk0 jdk0Var, boolean z) {
        this((Object) jdk0Var, (byte) 9);
        this.f31790a = (byte) 9;
        this.b = z;
    }
}
