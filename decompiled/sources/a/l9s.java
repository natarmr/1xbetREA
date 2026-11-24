package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public interface l9s {
    boh A();

    Long B();

    long C();

    String D();

    boolean E();

    List F();

    List G();

    boolean H();

    boolean I();

    boolean J();

    default List K() {
        return StringsKt__StringsKt.split$default(j(), new String[]{Separators.SLASH}, false, 0, 6, null);
    }

    String L();

    String M();

    String N();

    default List O() {
        return StringsKt__StringsKt.split$default(g(), new String[]{Separators.SLASH}, false, 0, 6, null);
    }

    List P();

    String Q();

    long R();

    boolean S();

    boolean T();

    List U();

    long a();

    long b();

    long c();

    long d();

    boolean e();

    String f();

    String g();

    s9s getType();

    String h();

    String i();

    String j();

    long k();

    boolean l();

    List m();

    int n();

    String o();

    List p();

    int q();

    String r();

    default boolean s() {
        return q() > 0;
    }

    boolean t();

    long u();

    List v();

    String w();

    boolean x();

    ma30 y();

    pqs z();
}
