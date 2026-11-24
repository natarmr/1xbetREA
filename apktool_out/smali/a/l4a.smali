.class public final La/l4a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xto0;


# static fields
.field public static final b:La/u15;

.field public static final c:La/u15;

.field public static final d:La/u15;

.field public static final e:La/u15;

.field public static final f:La/u15;

.field public static final g:La/u15;

.field public static final h:La/u15;

.field public static final i:La/u15;

.field public static final j:La/u15;

.field public static final k:La/u15;

.field public static final l:La/u15;


# instance fields
.field public final a:La/b780;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/u15;

    .line 2
    .line 3
    const-string v1, "camerax.core.appConfig.cameraFactoryProvider"

    .line 4
    .line 5
    const-class v2, La/fz9;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, La/u15;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/l4a;->b:La/u15;

    .line 12
    .line 13
    new-instance v0, La/u15;

    .line 14
    .line 15
    const-string v1, "camerax.core.appConfig.deviceSurfaceManagerProvider"

    .line 16
    .line 17
    const-class v2, La/ww9;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2, v3}, La/u15;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, La/l4a;->c:La/u15;

    .line 23
    .line 24
    new-instance v0, La/u15;

    .line 25
    .line 26
    const-string v1, "camerax.core.appConfig.useCaseConfigFactoryProvider"

    .line 27
    .line 28
    const-class v2, La/xw9;

    .line 29
    .line 30
    invoke-direct {v0, v1, v2, v3}, La/u15;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, La/l4a;->d:La/u15;

    .line 34
    .line 35
    new-instance v0, La/u15;

    .line 36
    .line 37
    const-string v1, "camerax.core.appConfig.cameraExecutor"

    .line 38
    .line 39
    const-class v2, Ljava/util/concurrent/Executor;

    .line 40
    .line 41
    invoke-direct {v0, v1, v2, v3}, La/u15;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, La/l4a;->e:La/u15;

    .line 45
    .line 46
    new-instance v0, La/u15;

    .line 47
    .line 48
    const-string v1, "camerax.core.appConfig.schedulerHandler"

    .line 49
    .line 50
    const-class v2, Landroid/os/Handler;

    .line 51
    .line 52
    invoke-direct {v0, v1, v2, v3}, La/u15;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 53
    .line 54
    .line 55
    sput-object v0, La/l4a;->f:La/u15;

    .line 56
    .line 57
    new-instance v0, La/u15;

    .line 58
    .line 59
    const-string v1, "camerax.core.appConfig.minimumLoggingLevel"

    .line 60
    .line 61
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 62
    .line 63
    invoke-direct {v0, v1, v2, v3}, La/u15;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 64
    .line 65
    .line 66
    sput-object v0, La/l4a;->g:La/u15;

    .line 67
    .line 68
    new-instance v0, La/u15;

    .line 69
    .line 70
    const-string v1, "camerax.core.appConfig.availableCamerasLimiter"

    .line 71
    .line 72
    const-class v2, La/n2a;

    .line 73
    .line 74
    invoke-direct {v0, v1, v2, v3}, La/u15;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 75
    .line 76
    .line 77
    sput-object v0, La/l4a;->h:La/u15;

    .line 78
    .line 79
    new-instance v0, La/u15;

    .line 80
    .line 81
    const-string v1, "camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming"

    .line 82
    .line 83
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 84
    .line 85
    invoke-direct {v0, v1, v2, v3}, La/u15;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 86
    .line 87
    .line 88
    sput-object v0, La/l4a;->i:La/u15;

    .line 89
    .line 90
    new-instance v0, La/u15;

    .line 91
    .line 92
    const-string v1, "camerax.core.appConfig.cameraProviderInitRetryPolicy"

    .line 93
    .line 94
    const-class v2, La/fag0;

    .line 95
    .line 96
    invoke-direct {v0, v1, v2, v3}, La/u15;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 97
    .line 98
    .line 99
    sput-object v0, La/l4a;->j:La/u15;

    .line 100
    .line 101
    new-instance v0, La/u15;

    .line 102
    .line 103
    const-string v1, "camerax.core.appConfig.quirksSettings"

    .line 104
    .line 105
    const-class v2, La/hpd0;

    .line 106
    .line 107
    invoke-direct {v0, v1, v2, v3}, La/u15;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 108
    .line 109
    .line 110
    sput-object v0, La/l4a;->k:La/u15;

    .line 111
    .line 112
    new-instance v0, La/u15;

    .line 113
    .line 114
    const-string v1, "camerax.core.appConfig.repeatingStreamForced"

    .line 115
    .line 116
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 117
    .line 118
    invoke-direct {v0, v1, v2, v3}, La/u15;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 119
    .line 120
    .line 121
    sput-object v0, La/l4a;->l:La/u15;

    .line 122
    .line 123
    return-void
.end method

.method public constructor <init>(La/b780;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/l4a;->a:La/b780;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()La/drd;
    .locals 0

    .line 1
    iget-object p0, p0, La/l4a;->a:La/b780;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j()La/n2a;
    .locals 2

    .line 1
    iget-object p0, p0, La/l4a;->a:La/b780;

    .line 2
    .line 3
    sget-object v0, La/l4a;->h:La/u15;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, v1}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, La/n2a;

    .line 11
    .line 12
    return-object p0
.end method

.method public final l()La/fz9;
    .locals 2

    .line 1
    iget-object p0, p0, La/l4a;->a:La/b780;

    .line 2
    .line 3
    sget-object v0, La/l4a;->b:La/u15;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, v1}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, La/fz9;

    .line 11
    .line 12
    return-object p0
.end method

.method public final p()J
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, La/l4a;->a:La/b780;

    .line 8
    .line 9
    sget-object v1, La/l4a;->i:La/u15;

    .line 10
    .line 11
    invoke-virtual {p0, v1, v0}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/Long;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    return-wide v0
.end method

.method public final x()La/ww9;
    .locals 2

    .line 1
    iget-object p0, p0, La/l4a;->a:La/b780;

    .line 2
    .line 3
    sget-object v0, La/l4a;->c:La/u15;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, v1}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, La/ww9;

    .line 11
    .line 12
    return-object p0
.end method

.method public final y()La/xw9;
    .locals 2

    .line 1
    iget-object p0, p0, La/l4a;->a:La/b780;

    .line 2
    .line 3
    sget-object v0, La/l4a;->d:La/u15;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, v1}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, La/xw9;

    .line 11
    .line 12
    return-object p0
.end method
