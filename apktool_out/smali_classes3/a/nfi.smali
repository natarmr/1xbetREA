.class public final La/nfi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/a1d;

.field public final b:La/z8w0;


# direct methods
.method public constructor <init>(La/ddk;La/a1d;La/z8w0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/nfi;->a:La/a1d;

    .line 5
    .line 6
    iput-object p3, p0, La/nfi;->b:La/z8w0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()La/pxs0;
    .locals 11

    .line 1
    iget-object v0, p0, La/nfi;->a:La/a1d;

    .line 2
    .line 3
    invoke-virtual {v0}, La/a1d;->getDomainResolverLogger()La/azk;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-static {v2}, La/x1x;->y(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/nfi;->b:La/z8w0;

    .line 11
    .line 12
    new-instance v3, La/jzk;

    .line 13
    .line 14
    invoke-direct {v3, v0}, La/jzk;-><init>(La/z8w0;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, La/nfi;->a:La/a1d;

    .line 18
    .line 19
    invoke-virtual {v0}, La/a1d;->getServiceProvider()La/kii0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, La/nfi;->a:La/a1d;

    .line 27
    .line 28
    invoke-virtual {v1}, La/a1d;->getNetworkAvailableUtil()La/nk50;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-static {v6}, La/x1x;->y(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, La/nfi;->a:La/a1d;

    .line 36
    .line 37
    invoke-virtual {p0}, La/a1d;->getLocalDnsUseCase()La/tiu;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-static {v7}, La/x1x;->y(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-instance v1, La/pxs0;

    .line 45
    .line 46
    const-class p0, La/vyk;

    .line 47
    .line 48
    sget-object v4, La/sre0;->a:La/tre0;

    .line 49
    .line 50
    invoke-virtual {v4, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast v0, La/lii0;

    .line 55
    .line 56
    iget-object v5, v0, La/lii0;->b:La/azj0;

    .line 57
    .line 58
    monitor-enter v5

    .line 59
    const-wide/16 v8, 0x0

    .line 60
    .line 61
    const/4 v10, 0x1

    .line 62
    :try_start_0
    invoke-virtual {v5, v10, v8, v9}, La/azj0;->a(ZJ)Lokhttp3/OkHttpClient;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    const-string v9, "https://1xbet.com/"

    .line 67
    .line 68
    invoke-virtual {v5, p0, v8, v9}, La/azj0;->c(La/sgy;Lokhttp3/OkHttpClient;Ljava/lang/String;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    monitor-exit v5

    .line 73
    check-cast p0, La/vyk;

    .line 74
    .line 75
    const-class v5, La/uyk;

    .line 76
    .line 77
    invoke-virtual {v4, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v0, v4}, La/lii0;->a(La/sgy;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    move-object v5, v0

    .line 86
    check-cast v5, La/uyk;

    .line 87
    .line 88
    move-object v4, p0

    .line 89
    invoke-direct/range {v1 .. v7}, La/pxs0;-><init>(La/azk;La/jzk;La/vyk;La/uyk;La/nk50;La/tiu;)V

    .line 90
    .line 91
    .line 92
    return-object v1

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    move-object p0, v0

    .line 95
    monitor-exit v5

    .line 96
    throw p0
.end method

.method public final b()La/wsb0;
    .locals 0

    .line 1
    iget-object p0, p0, La/nfi;->a:La/a1d;

    .line 2
    .line 3
    invoke-virtual {p0}, La/a1d;->getPreferenceDataSource()La/wsb0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final c()La/c5k;
    .locals 2

    .line 1
    iget-object p0, p0, La/nfi;->a:La/a1d;

    .line 2
    .line 3
    invoke-virtual {p0}, La/a1d;->getServiceProvider()La/kii0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, La/b6w0;

    .line 11
    .line 12
    invoke-direct {v1, v0}, La/b6w0;-><init>(La/kii0;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/a1d;->getSecretLibSettingsRepository()La/zjh0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, La/c5k;

    .line 23
    .line 24
    invoke-direct {v0, v1, p0}, La/c5k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public final d()La/ot10;
    .locals 10

    .line 1
    invoke-virtual {p0}, La/nfi;->a()La/pxs0;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    iget-object v0, p0, La/nfi;->a:La/a1d;

    .line 6
    .line 7
    invoke-virtual {v0}, La/a1d;->getDomainResolverLogger()La/azk;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v2}, La/x1x;->y(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, La/nfi;->b()La/wsb0;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    move-object v4, v3

    .line 19
    new-instance v3, La/drm0;

    .line 20
    .line 21
    invoke-direct {v3, v4}, La/drm0;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, La/a1d;->getSecretLibSettingsRepository()La/zjh0;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-static {v5}, La/x1x;->y(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, La/nfi;->b()La/wsb0;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-virtual {v0}, La/a1d;->getDomainResolverConfig()La/yyk;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    invoke-virtual {p0}, La/nfi;->b()La/wsb0;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    new-instance v8, La/ilp0;

    .line 44
    .line 45
    invoke-direct {v8, v4}, La/ilp0;-><init>(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-object v4, v8

    .line 49
    new-instance v8, La/nr00;

    .line 50
    .line 51
    invoke-direct {v8, v4}, La/nr00;-><init>(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, La/a1d;->getKeys()La/mmy;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    new-instance v0, La/ot10;

    .line 59
    .line 60
    iget-object v4, p0, La/nfi;->b:La/z8w0;

    .line 61
    .line 62
    invoke-direct/range {v0 .. v9}, La/ot10;-><init>(La/pxs0;La/azk;La/drm0;La/z8w0;La/zjh0;La/wsb0;La/yyk;La/nr00;La/mmy;)V

    .line 63
    .line 64
    .line 65
    return-object v0
.end method

.method public final e()La/zri;
    .locals 3

    .line 1
    invoke-virtual {p0}, La/nfi;->a()La/pxs0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/zri;

    .line 6
    .line 7
    const/16 v2, 0xa

    .line 8
    .line 9
    iget-object p0, p0, La/nfi;->b:La/z8w0;

    .line 10
    .line 11
    invoke-direct {v1, p0, v0, v2}, La/zri;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    return-object v1
.end method
