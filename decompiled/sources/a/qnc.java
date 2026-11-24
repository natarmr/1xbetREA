package a;

import android.os.Parcelable;
import org.xplatform.favorites.impl.presentation.screen.classic.models.ClassicFavoriteTab;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class qnc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f29023a;

    static {
        int[] iArr = new int[tcp.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            tcp tcpVar = tcp.GAMES;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            tcp tcpVar2 = tcp.GAMES;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            tcp tcpVar3 = tcp.GAMES;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            tcp tcpVar4 = tcp.GAMES;
            iArr[5] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f29023a = iArr;
        int[] iArr2 = new int[ClassicFavoriteTab.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            Parcelable.Creator<ClassicFavoriteTab> creator = ClassicFavoriteTab.CREATOR;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            Parcelable.Creator<ClassicFavoriteTab> creator2 = ClassicFavoriteTab.CREATOR;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            Parcelable.Creator<ClassicFavoriteTab> creator3 = ClassicFavoriteTab.CREATOR;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
