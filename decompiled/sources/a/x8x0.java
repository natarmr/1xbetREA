package a;

import android.gov.nist.core.Separators;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes2.dex */
public final class x8x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f40483a;
    public final HashMap b;
    public final ArrayList c;

    public x8x0(ArrayList arrayList) {
        List list = Collections.EMPTY_LIST;
        this.f40483a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p9x0 p9x0Var = (p9x0) it.next();
            if (TextUtils.isEmpty(p9x0Var.zzc())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                p9x0 p9x0Var2 = (p9x0) this.f40483a.put(p9x0Var.zzc(), p9x0Var);
                if (p9x0Var2 != null) {
                    String canonicalName = p9x0Var2.getClass().getCanonicalName();
                    String canonicalName2 = p9x0Var.getClass().getCanonicalName();
                    jf4.o(ua80.m(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
                    throw null;
                }
            }
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw rw2.h(it2);
        }
        this.c.addAll(list);
    }

    public final Object a(Uri uri, v8x0 v8x0Var) {
        return v8x0Var.b(b(uri));
    }

    public final h0q0 b(Uri uri) throws l52 {
        List listG;
        u3x u3xVarL = b4x.l();
        u3x u3xVarL2 = b4x.l();
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            listG = rcf0.e;
        } else {
            String strSubstring = encodedFragment.substring(10);
            qo8 qo8VarG = qo8.g("+");
            Iterable d0l0Var = new d0l0(new qo8((e0l0) qo8VarG.e, true, (uub) qo8VarG.d, qo8VarG.b), strSubstring);
            if (d0l0Var instanceof Collection) {
                listG = b4x.o((Collection) d0l0Var);
            } else {
                Iterator it = d0l0Var.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (it.hasNext()) {
                        u3x u3xVar = new u3x(4);
                        u3xVar.b(next);
                        while (it.hasNext()) {
                            u3xVar.b(it.next());
                        }
                        listG = u3xVar.g();
                    } else {
                        listG = b4x.t(next);
                    }
                } else {
                    listG = rcf0.e;
                }
            }
        }
        int size = listG.size();
        for (int i = 0; i < size; i++) {
            String str = (String) listG.get(i);
            Matcher matcher = l9x0.f19679a.matcher(str);
            if (!matcher.matches()) {
                jf4.o("Invalid fragment spec: ".concat(String.valueOf(str)));
                return null;
            }
            u3xVarL2.b(matcher.group(1));
        }
        rcf0 rcf0VarG = u3xVarL2.g();
        if (rcf0VarG.d > 0) {
            String str2 = (String) rcf0VarG.get(0);
            if (this.b.get(str2) != null) {
                hny.b();
                return null;
            }
            String strValueOf = String.valueOf(uri);
            throw new l52(ua80.m(new StringBuilder(str2.length() + 40 + strValueOf.length()), "Requested transform isn't registered: ", str2, ": ", strValueOf));
        }
        b4x b4xVarY = u3xVarL.g().y();
        fht0 fht0Var = new fht0();
        String scheme = uri.getScheme();
        p9x0 p9x0Var = (p9x0) this.f40483a.get(scheme);
        if (p9x0Var == null) {
            throw new l52(kng0.k("Requested backend isn't registered: ", scheme));
        }
        fht0Var.f9559a = p9x0Var;
        fht0Var.c = this.c;
        fht0Var.b = b4xVarY;
        if (!b4xVarY.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith(Separators.SLASH)) {
                String str3 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = b4xVarY.listIterator(b4xVarY.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous() != null) {
                        hny.b();
                        return null;
                    }
                }
                arrayList.set(arrayList.size() - 1, str3);
                uri = uri.buildUpon().path(TextUtils.join(Separators.SLASH, arrayList)).encodedFragment(null).build();
            }
        }
        fht0Var.d = uri;
        h0q0 h0q0Var = new h0q0();
        h0q0Var.f12247a = (p9x0) fht0Var.f9559a;
        h0q0Var.c = (b4x) fht0Var.b;
        h0q0Var.b = (ArrayList) fht0Var.c;
        h0q0Var.d = (Uri) fht0Var.d;
        return h0q0Var;
    }
}
