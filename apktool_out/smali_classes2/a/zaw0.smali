.class public final La/zaw0;
.super Lcom/google/android/gms/common/api/internal/BasePendingResult;
.source "SourceFile"


# instance fields
.field public final synthetic k:B


# direct methods
.method public constructor <init>(La/j9w0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zaw0;->k:B

    .line 2
    .line 3
    const-string p2, "GoogleApiClient must not be null"

    .line 4
    .line 5
    invoke-static {p1, p2}, La/s0x;->I(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(La/j9w0;)V

    .line 9
    .line 10
    .line 11
    const-string p0, "Api must not be null"

    .line 12
    .line 13
    sget-object p1, La/q44;->a:La/yzn0;

    .line 14
    .line 15
    invoke-static {p1, p0}, La/s0x;->I(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final bridge synthetic b(Lcom/google/android/gms/common/api/Status;)La/m0g0;
    .locals 0

    .line 1
    iget-byte p0, p0, La/zaw0;->k:B

    return-object p1
.end method

.method public final f(La/b9v;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/zaw0;->k:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/waw0;

    .line 7
    .line 8
    invoke-virtual {p1}, La/hz5;->l()Landroid/os/IInterface;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, La/cbw0;

    .line 13
    .line 14
    new-instance v1, La/yaw0;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v1, p0, v2}, La/yaw0;-><init>(La/zaw0;B)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p1, La/waw0;->B:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 21
    .line 22
    invoke-virtual {v0}, La/y4w0;->C()Landroid/os/Parcel;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget v2, La/taw0;->a:I

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p0}, La/taw0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 32
    .line 33
    .line 34
    const/16 p0, 0x67

    .line 35
    .line 36
    invoke-virtual {v0, p1, p0}, La/y4w0;->D(Landroid/os/Parcel;I)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_0
    check-cast p1, La/waw0;

    .line 41
    .line 42
    invoke-virtual {p1}, La/hz5;->l()Landroid/os/IInterface;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, La/cbw0;

    .line 47
    .line 48
    new-instance v1, La/yaw0;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-direct {v1, p0, v2}, La/yaw0;-><init>(La/zaw0;B)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p1, La/waw0;->B:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 55
    .line 56
    invoke-virtual {v0}, La/y4w0;->C()Landroid/os/Parcel;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    sget v2, La/taw0;->a:I

    .line 61
    .line 62
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1, p0}, La/taw0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 66
    .line 67
    .line 68
    const/16 p0, 0x66

    .line 69
    .line 70
    invoke-virtual {v0, p1, p0}, La/y4w0;->D(Landroid/os/Parcel;I)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    const-string v1, "Failed result must not be success"

    .line 8
    .line 9
    invoke-static {v1, v0}, La/s0x;->B(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->b(Lcom/google/android/gms/common/api/Status;)La/m0g0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e(La/m0g0;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
