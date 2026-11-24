package a;

import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class o7d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f24782a;

    static {
        Pair[] pairArr = {new Pair(ErrorCode.UNKNOWN_ERR, new s((byte) 26)), new Pair(ErrorCode.ABORT_ERR, new s((byte) 0)), new Pair(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new s((byte) 16)), new Pair(ErrorCode.CONSTRAINT_ERR, new s((byte) 1)), new Pair(ErrorCode.DATA_ERR, new s((byte) 3)), new Pair(ErrorCode.INVALID_STATE_ERR, new s((byte) 10)), new Pair(ErrorCode.ENCODING_ERR, new s((byte) 4)), new Pair(ErrorCode.NETWORK_ERR, new s((byte) 12)), new Pair(ErrorCode.NOT_ALLOWED_ERR, new s((byte) 14)), new Pair(ErrorCode.NOT_SUPPORTED_ERR, new s((byte) 17)), new Pair(ErrorCode.SECURITY_ERR, new s((byte) 22)), new Pair(ErrorCode.TIMEOUT_ERR, new s((byte) 24))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(12));
        xp20.l(linkedHashMap, pairArr);
        f24782a = linkedHashMap;
    }
}
