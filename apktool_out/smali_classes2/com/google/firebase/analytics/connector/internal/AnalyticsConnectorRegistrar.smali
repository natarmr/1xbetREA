.class public Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static lambda$getComponents$0(La/dgd;)La/vp2;
    .locals 6

    .line 1
    const-class v0, La/nfq;

    .line 2
    .line 3
    invoke-interface {p0, v0}, La/dgd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/nfq;

    .line 8
    .line 9
    const-class v1, Landroid/content/Context;

    .line 10
    .line 11
    invoke-interface {p0, v1}, La/dgd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Landroid/content/Context;

    .line 16
    .line 17
    const-class v2, La/v6n0;

    .line 18
    .line 19
    invoke-interface {p0, v2}, La/dgd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, La/v6n0;

    .line 24
    .line 25
    invoke-static {v0}, La/s0x;->H(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, La/s0x;->H(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, La/s0x;->H(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v2}, La/s0x;->H(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object v2, La/wp2;->c:La/wp2;

    .line 42
    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    const-class v2, La/wp2;

    .line 46
    .line 47
    monitor-enter v2

    .line 48
    :try_start_0
    sget-object v3, La/wp2;->c:La/wp2;

    .line 49
    .line 50
    if-nez v3, :cond_1

    .line 51
    .line 52
    new-instance v3, Landroid/os/Bundle;

    .line 53
    .line 54
    const/4 v4, 0x1

    .line 55
    invoke-direct {v3, v4}, Landroid/os/Bundle;-><init>(I)V

    .line 56
    .line 57
    .line 58
    const-string v4, "[DEFAULT]"

    .line 59
    .line 60
    invoke-virtual {v0}, La/nfq;->a()V

    .line 61
    .line 62
    .line 63
    iget-object v5, v0, La/nfq;->b:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_0

    .line 70
    .line 71
    sget-object v4, La/bnk;->d:La/bnk;

    .line 72
    .line 73
    sget-object v5, La/sxs0;->b:La/sxs0;

    .line 74
    .line 75
    check-cast p0, La/nao;

    .line 76
    .line 77
    invoke-virtual {p0, v4, v5}, La/nao;->a(Ljava/util/concurrent/Executor;La/vdo;)V

    .line 78
    .line 79
    .line 80
    const-string p0, "dataCollectionDefaultEnabled"

    .line 81
    .line 82
    invoke-virtual {v0}, La/nfq;->j()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-virtual {v3, p0, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :catchall_0
    move-exception p0

    .line 91
    goto :goto_1

    .line 92
    :cond_0
    :goto_0
    new-instance p0, La/wp2;

    .line 93
    .line 94
    invoke-static {v1, v3}, La/wrw0;->e(Landroid/content/Context;Landroid/os/Bundle;)La/wrw0;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget-object v0, v0, La/wrw0;->b:Lcom/google/android/gms/measurement/api/AppMeasurementSdk;

    .line 99
    .line 100
    invoke-direct {p0, v0}, La/wp2;-><init>(Lcom/google/android/gms/measurement/api/AppMeasurementSdk;)V

    .line 101
    .line 102
    .line 103
    sput-object p0, La/wp2;->c:La/wp2;

    .line 104
    .line 105
    :cond_1
    monitor-exit v2

    .line 106
    goto :goto_2

    .line 107
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    throw p0

    .line 109
    :cond_2
    :goto_2
    sget-object p0, La/wp2;->c:La/wp2;

    .line 110
    .line 111
    return-object p0
.end method

.method public static synthetic zza(La/dgd;)La/vp2;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;->lambda$getComponents$0(La/dgd;)La/vp2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "La/pfd;",
            ">;"
        }
    .end annotation

    .line 1
    const-class p0, La/vp2;

    .line 2
    .line 3
    invoke-static {p0}, La/pfd;->b(Ljava/lang/Class;)La/ofd;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-class v0, La/nfq;

    .line 8
    .line 9
    invoke-static {v0}, La/c7k;->c(Ljava/lang/Class;)La/c7k;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0, v0}, La/ofd;->a(La/c7k;)V

    .line 14
    .line 15
    .line 16
    const-class v0, Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {v0}, La/c7k;->c(Ljava/lang/Class;)La/c7k;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0, v0}, La/ofd;->a(La/c7k;)V

    .line 23
    .line 24
    .line 25
    const-class v0, La/v6n0;

    .line 26
    .line 27
    invoke-static {v0}, La/c7k;->c(Ljava/lang/Class;)La/c7k;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, La/ofd;->a(La/c7k;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, La/kys0;->c:La/kys0;

    .line 35
    .line 36
    iput-object v0, p0, La/ofd;->f:La/jgd;

    .line 37
    .line 38
    const/4 v0, 0x2

    .line 39
    invoke-virtual {p0, v0}, La/ofd;->c(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, La/ofd;->b()La/pfd;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const-string v0, "fire-analytics"

    .line 47
    .line 48
    const-string v1, "23.2.0"

    .line 49
    .line 50
    invoke-static {v0, v1}, La/q0x;->I(Ljava/lang/String;Ljava/lang/String;)La/pfd;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    filled-new-array {p0, v0}, [La/pfd;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method
