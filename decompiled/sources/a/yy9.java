package a;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface yy9 extends kft0 {
    String F();

    CaptureRequest.Builder I(TotalCaptureResult totalCaptureResult);

    void J(int i);

    boolean O(kex kexVar, ArrayList arrayList, ey9 ey9Var);

    boolean S(ArrayList arrayList, ey9 ey9Var);

    void T();

    boolean l(List list, ey9 ey9Var);

    void n();

    CaptureRequest.Builder q(int i);

    boolean r(aji0 aji0Var);

    boolean v(bto btoVar);

    boolean w(ArrayList arrayList, ey9 ey9Var);

    boolean y(InputConfiguration inputConfiguration, ArrayList arrayList, ey9 ey9Var);
}
