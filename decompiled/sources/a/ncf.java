package a;

import android.graphics.Point;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ncf implements OnFailureListener, pyj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23290a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ncf(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f23290a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    @Override // a.pyj
    public rcf0 a(int i, ccs0 ccs0Var, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        ccs0 ccs0Var2 = ccs0Var;
        nyj nyjVar = (nyj) this.f23290a;
        String str = (String) this.b;
        int[] iArr2 = (int[]) this.c;
        Point point = (Point) this.d;
        int i6 = iArr2[i];
        int i7 = point != null ? point.x : nyjVar.e;
        int i8 = point != null ? point.y : nyjVar.f;
        boolean z = nyjVar.h;
        if (i7 == Integer.MAX_VALUE || i8 == Integer.MAX_VALUE) {
            i2 = Integer.MAX_VALUE;
        } else {
            int i9 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < ccs0Var2.f4128a; i10++) {
                androidx.media3.common.b bVar = ccs0Var2.d[i10];
                int i11 = bVar.w;
                int i12 = bVar.x;
                if (i11 > 0 && i12 > 0) {
                    if (!z) {
                        i4 = i8;
                        i5 = i7;
                    } else if ((i11 > i12) != (i7 > i8)) {
                        i5 = i8;
                        i4 = i7;
                    } else {
                        i4 = i8;
                        i5 = i7;
                    }
                    int i13 = i11 * i4;
                    int i14 = i12 * i5;
                    Point point2 = i13 >= i14 ? new Point(i5, vtt0.g(i14, i11)) : new Point(vtt0.g(i13, i12), i4);
                    int i15 = bVar.w;
                    int i16 = i15 * i12;
                    if (i15 >= ((int) (point2.x * 0.98f)) && i12 >= ((int) (point2.y * 0.98f)) && i16 < i9) {
                        i9 = i16;
                    }
                }
            }
            i2 = i9;
        }
        u3x u3xVarL = b4x.l();
        int i17 = 0;
        while (i17 < ccs0Var2.f4128a) {
            androidx.media3.common.b bVar2 = ccs0Var2.d[i17];
            int i18 = bVar2.w;
            int i19 = (i18 == -1 || (i3 = bVar2.x) == -1) ? -1 : i18 * i3;
            u3xVarL.b(new ryj(i, ccs0Var2, i17, nyjVar, iArr[i17], str, i6, i2 == Integer.MAX_VALUE || (i19 != -1 && i19 <= i2)));
            i17++;
            ccs0Var2 = ccs0Var;
        }
        return u3xVarL.g();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2((CredentialProviderPlayServicesImpl) this.f23290a, (CancellationSignal) this.b, (Executor) this.c, (ybf) this.d, exc);
    }
}
