package a;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class j45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15868a;

    public j45(long j) {
        this.f15868a = j;
    }

    public static j45 a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        j45 j45Var = new j45(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return j45Var;
                    }
                    j45 j45Var2 = new j45(jsonReader.nextLong());
                    jsonReader.close();
                    return j45Var2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof j45) && this.f15868a == ((j45) obj).f15868a;
    }

    public final int hashCode() {
        long j = this.f15868a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return brm0.k(this.f15868a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
