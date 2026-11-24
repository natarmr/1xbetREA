package a;

import android.gov.nist.core.Separators;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class zsf0 extends yzp {
    public static final y190 f;
    public final ClassLoader c;
    public final yzp d;
    public final n0o0 e;

    static {
        String str = y190.b;
        f = rl70.b(Separators.SLASH);
    }

    public zsf0(ClassLoader classLoader) {
        classLoader.getClass();
        ggy ggyVar = yzp.f43526a;
        ggyVar.getClass();
        this.c = classLoader;
        this.d = ggyVar;
        this.e = maz.b(new tie0(this, (byte) 22));
    }

    @Override // a.yzp
    public final s5k0 a(y190 y190Var) throws IOException {
        y190Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // a.yzp
    public final void c(y190 y190Var, y190 y190Var2) throws IOException {
        y190Var.getClass();
        y190Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // a.yzp
    public final void k(y190 y190Var) throws IOException {
        y190Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // a.yzp
    public final List q(y190 y190Var) throws FileNotFoundException {
        y190Var.getClass();
        y190 y190Var2 = f;
        y190Var2.getClass();
        String strX = c.a(y190Var2, y190Var, true).d(y190Var2).f41844a.x();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : (List) this.e.getValue()) {
            yzp yzpVar = (yzp) pair.f46059a;
            y190 y190Var3 = (y190) pair.b;
            try {
                List listQ = yzpVar.q(y190Var3.e(strX));
                ArrayList<y190> arrayList = new ArrayList();
                for (Object obj : listQ) {
                    if (vvw.z((y190) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                for (y190 y190Var4 : arrayList) {
                    y190Var4.getClass();
                    String strReplace = StringsKt.d0(y190Var3.f41844a.x(), y190Var4.f41844a.x()).replace('\\', '/');
                    strReplace.getClass();
                    arrayList2.add(y190Var2.e(strReplace));
                }
                w3d.u(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return CollectionsKt.L0(linkedHashSet);
        }
        udk.h(y190Var, "file not found: ");
        return null;
    }

    @Override // a.yzp
    public final h7k v(y190 y190Var) {
        y190Var.getClass();
        if (!vvw.z(y190Var)) {
            return null;
        }
        y190 y190Var2 = f;
        y190Var2.getClass();
        String strX = c.a(y190Var2, y190Var, true).d(y190Var2).f41844a.x();
        for (Pair pair : (List) this.e.getValue()) {
            h7k h7kVarV = ((yzp) pair.f46059a).v(((y190) pair.b).e(strX));
            if (h7kVarV != null) {
                return h7kVarV;
            }
        }
        return null;
    }

    @Override // a.yzp
    public final uey w(y190 y190Var) throws FileNotFoundException {
        if (!vvw.z(y190Var)) {
            udk.h(y190Var, "file not found: ");
            return null;
        }
        y190 y190Var2 = f;
        y190Var2.getClass();
        String strX = c.a(y190Var2, y190Var, true).d(y190Var2).f41844a.x();
        Iterator it = ((List) this.e.getValue()).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            try {
                return ((yzp) pair.f46059a).w(((y190) pair.b).e(strX));
            } catch (FileNotFoundException unused) {
            }
        }
        udk.h(y190Var, "file not found: ");
        return null;
    }

    @Override // a.yzp
    public final s5k0 x(y190 y190Var, boolean z) throws IOException {
        y190Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // a.yzp
    public final emk0 y(y190 y190Var) throws IOException {
        y190Var.getClass();
        if (!vvw.z(y190Var)) {
            udk.h(y190Var, "file not found: ");
            return null;
        }
        y190 y190Var2 = f;
        y190Var2.getClass();
        URL resource = this.c.getResource(c.a(y190Var2, y190Var, false).d(y190Var2).f41844a.x());
        if (resource == null) {
            udk.h(y190Var, "file not found: ");
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        return w9x.L(inputStream);
    }
}
