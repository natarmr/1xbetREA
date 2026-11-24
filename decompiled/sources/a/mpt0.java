package a;

import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class mpt0 implements dfn0, zuw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22194a;
    public Object b;
    public Object c;
    public Object d;

    public mpt0(ArrayList arrayList) {
        this.f22194a = (byte) 1;
        this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            o5v0 o5v0Var = (o5v0) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.c;
            jArr[i2] = o5v0Var.b;
            jArr[i2 + 1] = o5v0Var.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // a.dfn0
    public int a(long j) {
        long[] jArr = (long[]) this.d;
        int iB = vtt0.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public nrw0 b() throws GeneralSecurityException {
        rkt0 rkt0Var;
        icw0 icw0VarB;
        srw0 srw0Var = (srw0) this.b;
        if (srw0Var == null || (rkt0Var = (rkt0) this.c) == null) {
            hny.o("Cannot build without parameters and/or key material");
            return null;
        }
        if (srw0Var.f32700a != ((icw0) rkt0Var.b).f14556a.length) {
            hny.o("Key size mismatch");
            return null;
        }
        if (srw0Var.a() && ((Integer) this.d) == null) {
            hny.o("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((srw0) this.b).a() && ((Integer) this.d) != null) {
            hny.o("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        m60 m60Var = ((srw0) this.b).b;
        if (m60Var == m60.j) {
            icw0VarB = q6x0.f28222a;
        } else if (m60Var == m60.i) {
            icw0VarB = q6x0.a(((Integer) this.d).intValue());
        } else {
            if (m60Var != m60.h) {
                jf4.n("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(m60Var)));
                return null;
            }
            icw0VarB = q6x0.b(((Integer) this.d).intValue());
        }
        return new nrw0((srw0) this.b, (rkt0) this.c, icw0VarB, (Integer) this.d);
    }

    @Override // a.zuw0
    public void c(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((m6x0) this.d).w(true, i, th, bArr, (String) this.b, (ArrayList) this.c, map);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f22194a) {
            case 2:
                mpt0 mpt0Var = new mpt0(((nbw0) this.b).clone());
                Iterator it = ((ArrayList) this.c).iterator();
                while (it.hasNext()) {
                    ((ArrayList) mpt0Var.c).add(((nbw0) it.next()).clone());
                }
                return mpt0Var;
            default:
                return super.clone();
        }
    }

    @Override // a.dfn0
    public List e(long j) {
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                o5v0 o5v0Var = (o5v0) list.get(i);
                ctf ctfVar = o5v0Var.f24706a;
                if (ctfVar.e == -3.4028235E38f) {
                    arrayList2.add(o5v0Var);
                } else {
                    arrayList.add(ctfVar);
                }
            }
        }
        Collections.sort(arrayList2, new w5v0((byte) 0));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            btf btfVarA = ((o5v0) arrayList2.get(i3)).f24706a.a();
            btfVarA.e = (-1) - i3;
            btfVarA.f = 1;
            arrayList.add(btfVarA.a());
        }
        return arrayList;
    }

    @Override // a.dfn0
    public long j(int i) {
        long[] jArr = (long[]) this.d;
        x0x.A(i >= 0);
        x0x.A(i < jArr.length);
        return jArr[i];
    }

    @Override // a.dfn0
    public int l() {
        return ((long[]) this.d).length;
    }

    public mpt0(byte b) {
        this.f22194a = b;
        switch (b) {
            case 4:
                break;
            default:
                this.b = new nbw0("", 0L, null);
                this.d = new nbw0("", 0L, null);
                this.c = new ArrayList();
                break;
        }
    }

    public mpt0(m6x0 m6x0Var, String str, ArrayList arrayList) {
        this.f22194a = (byte) 5;
        this.b = str;
        this.c = arrayList;
        this.d = m6x0Var;
    }

    public mpt0(nbw0 nbw0Var) {
        this.f22194a = (byte) 2;
        this.b = nbw0Var;
        this.d = nbw0Var.clone();
        this.c = new ArrayList();
    }

    public /* synthetic */ mpt0(Object obj, Serializable serializable, Object obj2, byte b) {
        this.f22194a = b;
        this.b = obj;
        this.c = serializable;
        this.d = obj2;
    }
}
