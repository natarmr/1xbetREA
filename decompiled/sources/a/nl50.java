package a;

import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nl50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f23711a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static Long a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            f03.d().a("The content-length value is not a valid number");
            return null;
        }
    }

    public static String b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    public static void c(ml50 ml50Var) {
        if (!((ll50) ml50Var.d.b).G()) {
            jl50 jl50Var = ml50Var.d;
            jl50Var.i();
            ((ll50) jl50Var.b).Q();
        }
        ml50Var.b();
    }
}
