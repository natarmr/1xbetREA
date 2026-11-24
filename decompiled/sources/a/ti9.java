package a;

import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.internal._HeadersCommonKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ti9 {
    public static final si9 a(String str) throws IOException {
        List listSplit$default;
        str.getClass();
        List listZ = StringsKt.Z(str);
        String str2 = (String) CollectionsKt.W(0, listZ);
        if (str2 == null) {
            throw new IOException();
        }
        String str3 = (String) CollectionsKt.W(1, listZ);
        if (str3 == null) {
            throw new IOException();
        }
        int i = 2;
        String str4 = (String) CollectionsKt.W(2, listZ);
        if (str4 == null) {
            throw new IOException();
        }
        Protocol.b.getClass();
        Protocol protocolA = Protocol.Companion.a(str4);
        String str5 = (String) CollectionsKt.W(3, listZ);
        if (str5 == null) {
            throw new IOException();
        }
        int i2 = Integer.parseInt(str5);
        String str6 = (String) CollectionsKt.W(4, listZ);
        if (str6 == null) {
            throw new IOException();
        }
        String str7 = (String) CollectionsKt.W(5, listZ);
        if (str7 == null) {
            throw new IOException();
        }
        long j = Long.parseLong(str7);
        String str8 = (String) CollectionsKt.W(6, listZ);
        if (str8 == null) {
            throw new IOException();
        }
        long j2 = Long.parseLong(str8);
        Headers.Builder builder = new Headers.Builder();
        int size = listZ.size();
        int i3 = 7;
        while (i3 < size) {
            String str9 = (String) CollectionsKt.W(i3, listZ);
            if (str9 != null && (listSplit$default = StringsKt__StringsKt.split$default(str9, new String[]{": "}, false, i, i, null)) != null) {
                if (listSplit$default.size() != i) {
                    listSplit$default = null;
                }
                if (listSplit$default != null) {
                    builder.a((String) listSplit$default.get(0), (String) listSplit$default.get(1));
                    i3++;
                    i = 2;
                }
            }
            throw new IOException();
        }
        return new si9(str2, str3, protocolA, i2, str6, _HeadersCommonKt.b(builder), j, j2);
    }
}
