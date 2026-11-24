package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes2.dex */
public final class euj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8422a;
    public final ArrayList b = new ArrayList();
    public Pair c = new Pair(TokenNames.V, null);

    public euj0(fuj0 fuj0Var, String str, String str2) {
        this.f8422a = str2;
    }

    public final void a(String str, iay... iayVarArr) {
        pys0 pys0Var;
        str.getClass();
        if (iayVarArr.length == 0) {
            pys0Var = null;
        } else {
            rx3 rx3Var = new rx3(new a13(iayVarArr, (byte) 20), (byte) 2);
            int iA = wp20.a(r3d.q(rx3Var, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            Iterator it = rx3Var.iterator();
            while (true) {
                iil iilVar = (iil) it;
                if (!iilVar.b.hasNext()) {
                    break;
                }
                IndexedValue indexedValue = (IndexedValue) iilVar.next();
                linkedHashMap.put(Integer.valueOf(indexedValue.f46061a), (iay) indexedValue.b);
            }
            pys0Var = new pys0(linkedHashMap);
        }
        this.b.add(new Pair(str, pys0Var));
    }

    public final void b(mfy mfyVar) {
        mfyVar.getClass();
        this.c = new Pair(mfyVar.c, null);
    }

    public final void c(String str, iay... iayVarArr) {
        str.getClass();
        rx3 rx3Var = new rx3(new a13(iayVarArr, (byte) 20), (byte) 2);
        int iA = wp20.a(r3d.q(rx3Var, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator it = rx3Var.iterator();
        while (true) {
            iil iilVar = (iil) it;
            if (!iilVar.b.hasNext()) {
                this.c = new Pair(str, new pys0(linkedHashMap));
                return;
            } else {
                IndexedValue indexedValue = (IndexedValue) iilVar.next();
                linkedHashMap.put(Integer.valueOf(indexedValue.f46061a), (iay) indexedValue.b);
            }
        }
    }
}
