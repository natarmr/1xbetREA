package a;

import android.content.Context;
import android.content.IntentFilter;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MenuItem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import javax.crypto.AEADBadTagException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3600a;
    public Object b;

    public c2(byte[] bArr, byte b) throws GeneralSecurityException {
        switch (b) {
            case 12:
                if (!esw0.d(1)) {
                    hny.o("Can not use ChaCha20Poly1305 in FIPS-mode.");
                    throw null;
                }
                this.f3600a = L(bArr, 1);
                this.b = L(bArr, 0);
                return;
            default:
                if (!brm0.a(1)) {
                    hny.o("Can not use ChaCha20Poly1305 in FIPS-mode.");
                    throw null;
                }
                this.f3600a = w(bArr, 1);
                this.b = w(bArr, 0);
                return;
        }
    }

    public static byte[] P(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public static float l(int i, int i2, int i3) {
        return r7x.t((i - i2) / i3, 0.0f, 1.0f);
    }

    public static byte[] v(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public abstract void B();

    public String C() {
        return ((oif0) this.b).g(5, new StringBuilder());
    }

    public abstract int[] D(int i);

    public abstract boolean E();

    public void I() {
        e();
        IntentFilter intentFilterF = f();
        if (intentFilterF.countActions() == 0) {
            return;
        }
        md3 md3Var = (md3) this.f3600a;
        if (md3Var == null) {
            md3Var = new md3(this, (byte) 0);
            this.f3600a = md3Var;
        }
        ((pd3) this.b).k.registerReceiver(md3Var, intentFilterF);
    }

    public abstract void J();

    public abstract lfx L(byte[] bArr, int i);

    public String M(String str, String str2) {
        return kng0.m((String) this.f3600a, str, "?key=", str2);
    }

    public void N(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            jf4.o("Given ByteBuffer output is too small");
            return;
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        lfx lfxVar = (lfx) this.f3600a;
        lfxVar.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            jf4.o("Given ByteBuffer output is too small");
            return;
        }
        lfxVar.g(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        int iPosition2 = byteBuffer.position();
        byteBuffer.position(iPosition);
        byteBuffer.limit(iPosition2);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        ByteBuffer byteBufferF = ((lfx) this.b).f(bArr, 0);
        byte[] bArr4 = new byte[32];
        byteBufferF.get(bArr4);
        byte[] bArrT = pym0.t(bArr4, P(bArr3, byteBuffer));
        byteBuffer.limit(iLimit);
        byteBuffer.position(iPosition2);
        byteBuffer.put(bArrT);
    }

    public byte[] O(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            hny.o("ciphertext too short");
            return null;
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((lfx) this.b).f(bArr, 0).get(bArr4);
            if (!MessageDigest.isEqual(pym0.t(bArr4, P(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            lfx lfxVar = (lfx) this.f3600a;
            lfxVar.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            lfxVar.g(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public abstract void d();

    public void e() {
        md3 md3Var = (md3) this.f3600a;
        if (md3Var != null) {
            try {
                ((pd3) this.b).k.unregisterReceiver(md3Var);
            } catch (IllegalArgumentException unused) {
            }
            this.f3600a = null;
        }
    }

    public abstract IntentFilter f();

    public void g() {
        if (z04.b.decrementAndGet((z04) this.f3600a) == 0) {
            ((odd) this.b).N(new bf80(new df80(2)));
            G();
        }
    }

    public byte[] h(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            hny.o("ciphertext too short");
            return null;
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((lfx) this.b).a(bArr, 0).get(bArr4);
            if (!MessageDigest.isEqual(l7x.F(bArr4, v(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            lfx lfxVar = (lfx) this.f3600a;
            lfxVar.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            lfxVar.d(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public void i(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            jf4.o("Given ByteBuffer output is too small");
            return;
        }
        int iPosition = byteBuffer.position();
        lfx lfxVar = (lfx) this.f3600a;
        lfxVar.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            jf4.o("Given ByteBuffer output is too small");
            return;
        }
        lfxVar.d(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        ByteBuffer byteBufferA = ((lfx) this.b).a(bArr, 0);
        byte[] bArr4 = new byte[32];
        byteBufferA.get(bArr4);
        byte[] bArrF = l7x.F(bArr4, v(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrF);
    }

    public abstract int[] j(int i);

    public abstract int k();

    public MenuItem m(MenuItem menuItem) {
        if (!(menuItem instanceof ojn0)) {
            return menuItem;
        }
        ojn0 ojn0Var = (ojn0) menuItem;
        nuj0 nuj0Var = (nuj0) this.b;
        if (nuj0Var == null) {
            nuj0Var = new nuj0(0);
            this.b = nuj0Var;
        }
        MenuItem menuItem2 = (MenuItem) nuj0Var.get(ojn0Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        sz30 sz30Var = new sz30((Context) this.f3600a, ojn0Var);
        ((nuj0) this.b).put(ojn0Var, sz30Var);
        return sz30Var;
    }

    public int[] n(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public int o(int i, int i2) {
        int iQ = q(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int iQ2 = q(i5);
            i3 += iQ2;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = iQ2;
            }
        }
        return i3 + iQ > i2 ? i4 + 1 : i4;
    }

    public int p(int i, int i2) {
        int iQ = q(i);
        if (iQ == i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int iQ2 = q(i4);
            i3 += iQ2;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = iQ2;
            }
        }
        if (iQ + i3 <= i2) {
            return i3;
        }
        return 0;
    }

    public int q(int i) {
        return 1;
    }

    public String r() {
        String str = (String) this.f3600a;
        if (str != null) {
            return str;
        }
        Intrinsics.h(ParameterNames.TEXT);
        throw null;
    }

    public void s() {
        ((SparseIntArray) this.f3600a).clear();
    }

    public abstract void t();

    public boolean u() {
        return ((v62) this.f3600a).b && ((qb5) this.b).a();
    }

    public abstract lfx w(byte[] bArr, int i);

    public abstract void y();

    public void A() {
    }

    public void G() {
    }

    public void H() {
    }

    public void K() {
    }

    public void x() {
    }

    public void F(s06 s06Var) {
    }

    public void z(pb5 pb5Var) {
    }

    public c2(Bundle bundle, String str) {
        str.getClass();
        bundle.getClass();
        this.f3600a = str;
        this.b = bundle;
    }

    public c2(Context context) {
        this.f3600a = context;
    }

    public c2(int i) {
        this.b = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayList) this.b).add(new uhl());
        }
    }

    public c2(p68 p68Var) {
        this.f3600a = p68Var;
        this.b = new oif0(p68Var);
    }

    public c2(df50 df50Var) {
        this.f3600a = new v62(this, (byte) 4, false);
        this.b = new qb5(this, df50Var);
    }

    public /* synthetic */ c2(Object obj, Object obj2) {
        this.f3600a = obj;
        this.b = obj2;
    }

    public c2(byte b) {
        switch (b) {
            case 7:
                this.f3600a = o2e.Y(1);
                this.b = new odd();
                break;
            case 8:
                this.f3600a = new SparseIntArray();
                this.b = new SparseIntArray();
                break;
            default:
                this.b = new int[2];
                break;
        }
    }

    public c2(pd3 pd3Var) {
        this.b = pd3Var;
    }
}
