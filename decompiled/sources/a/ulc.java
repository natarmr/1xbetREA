package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ulc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f35865a;
    public static final LinkedHashMap b;

    static {
        String str;
        String strB0 = CollectionsKt.b0(q3d.j('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        f35865a = strB0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listJ = q3d.j("Boolean", "Z", "Char", TokenNames.C, "Byte", "B", "Short", TokenNames.S, "Int", TokenNames.I, "Float", TokenNames.F, "Long", "J", "Double", "D");
        int iJ = g8x.J(0, listJ.size() - 1, 2);
        if (iJ >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                str = f35865a;
                sb.append(str);
                sb.append('/');
                sb.append((String) listJ.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listJ.get(i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(axq.n(sb2, (String) listJ.get(i), "Array"), "[" + ((String) listJ.get(i2)));
                if (i == iJ) {
                    break;
                } else {
                    i += 2;
                }
            }
            strB0 = str;
        }
        linkedHashMap.put(strB0 + "/Unit", TokenNames.V);
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : q3d.j("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : q3d.j("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, kng0.k("collections/", str3), "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            String strM = twn.m(i3, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = f35865a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            a(linkedHashMap, strM, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : q3d.j("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, ohs0.n(str5, ".Companion"), ua80.m(new StringBuilder(), f35865a, "/jvm/internal/", str5, "CompanionObject"));
        }
        b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f35865a + '/' + str, TokenNames.L + str2 + ';');
    }

    public static final String b(String str) {
        str.getClass();
        String str2 = (String) b.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(TokenNames.L);
        String strReplace = str.replace('.', '$');
        strReplace.getClass();
        sb.append(strReplace);
        sb.append(';');
        return sb.toString();
    }
}
