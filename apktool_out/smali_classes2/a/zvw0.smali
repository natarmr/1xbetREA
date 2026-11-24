.class public final La/zvw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final a:Ljava/lang/String;

.field public final synthetic b:La/drm0;


# direct methods
.method public constructor <init>(La/drm0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/zvw0;->b:La/drm0;

    .line 8
    .line 9
    iput-object p2, p0, La/zvw0;->a:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    .line 1
    iget-object p1, p0, La/zvw0;->b:La/drm0;

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    :try_start_0
    sget v0, La/bnw0;->a:I

    .line 6
    .line 7
    const-string v0, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService"

    .line 8
    .line 9
    invoke-interface {p2, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    instance-of v2, v1, La/enw0;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    check-cast v1, La/enw0;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, La/zmw0;

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    invoke-direct {v1, p2, v0, v2}, La/y4w0;-><init>(Landroid/os/IBinder;Ljava/lang/String;B)V

    .line 24
    .line 25
    .line 26
    :goto_0
    iget-object p2, p1, La/drm0;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p2, La/kxw0;

    .line 29
    .line 30
    iget-object v0, p2, La/kxw0;->f:La/uuw0;

    .line 31
    .line 32
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, La/uuw0;->o:La/quw0;

    .line 36
    .line 37
    const-string v2, "Install Referrer Service connected"

    .line 38
    .line 39
    invoke-virtual {v0, v2}, La/quw0;->a(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object p2, p2, La/kxw0;->g:La/fxw0;

    .line 43
    .line 44
    invoke-static {p2}, La/kxw0;->g(La/ryw0;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, La/mfr;

    .line 48
    .line 49
    invoke-direct {v0, p0, v1, p0}, La/mfr;-><init>(La/zvw0;La/enw0;La/zvw0;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, v0}, La/fxw0;->v1(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catch_0
    move-exception p0

    .line 57
    iget-object p1, p1, La/drm0;->a:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, La/kxw0;

    .line 60
    .line 61
    iget-object p1, p1, La/kxw0;->f:La/uuw0;

    .line 62
    .line 63
    invoke-static {p1}, La/kxw0;->g(La/ryw0;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p1, La/uuw0;->j:La/quw0;

    .line 67
    .line 68
    const-string p2, "Exception occurred while calling Install Referrer API"

    .line 69
    .line 70
    invoke-virtual {p1, p0, p2}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_1
    iget-object p0, p1, La/drm0;->a:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, La/kxw0;

    .line 77
    .line 78
    iget-object p0, p0, La/kxw0;->f:La/uuw0;

    .line 79
    .line 80
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 81
    .line 82
    .line 83
    iget-object p0, p0, La/uuw0;->j:La/quw0;

    .line 84
    .line 85
    const-string p1, "Install Referrer connection returned with null binder"

    .line 86
    .line 87
    invoke-virtual {p0, p1}, La/quw0;->a(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/zvw0;->b:La/drm0;

    .line 2
    .line 3
    iget-object p0, p0, La/drm0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/kxw0;

    .line 6
    .line 7
    iget-object p0, p0, La/kxw0;->f:La/uuw0;

    .line 8
    .line 9
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/uuw0;->o:La/quw0;

    .line 13
    .line 14
    const-string p1, "Install Referrer Service disconnected"

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/quw0;->a(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
