.class public final La/p1e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/m1e;


# instance fields
.field public final a:La/umx;

.field public final b:La/p7m0;

.field public final c:La/p7m0;

.field public final d:Landroid/net/ConnectivityManager;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final f:La/o1e;


# direct methods
.method public constructor <init>(La/us00;La/umx;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/p1e;->a:La/umx;

    .line 5
    .line 6
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    iput-object p2, p0, La/p1e;->b:La/p7m0;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, La/p1e;->c:La/p7m0;

    .line 20
    .line 21
    const-string v0, "connectivity"

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 31
    .line 32
    iput-object p1, p0, La/p1e;->d:Landroid/net/ConnectivityManager;

    .line 33
    .line 34
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, La/p1e;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 39
    .line 40
    new-instance v0, La/o1e;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-direct {v0, p0, v1}, La/o1e;-><init>(Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, La/p1e;->f:La/o1e;

    .line 47
    .line 48
    new-instance v2, Landroid/net/NetworkRequest$Builder;

    .line 49
    .line 50
    invoke-direct {v2}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 51
    .line 52
    .line 53
    const/16 v3, 0xc

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {p1, v2, v0}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getAllNetworks()[Landroid/net/Network;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    array-length v2, v0

    .line 74
    move v4, v1

    .line 75
    :goto_0
    if-ge v1, v2, :cond_2

    .line 76
    .line 77
    aget-object v5, v0, v1

    .line 78
    .line 79
    invoke-virtual {p1, v5}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    if-nez v6, :cond_0

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_0
    invoke-virtual {v6, v3}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_1

    .line 91
    .line 92
    const/16 v7, 0x10

    .line 93
    .line 94
    invoke-virtual {v6, v7}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-eqz v6, :cond_1

    .line 99
    .line 100
    iget-object v4, p0, La/p1e;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 101
    .line 102
    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    const/4 v4, 0x1

    .line 106
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    if-nez v4, :cond_3

    .line 110
    .line 111
    iget-object p1, p0, La/p1e;->b:La/p7m0;

    .line 112
    .line 113
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, p2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    iget-object p0, p0, La/p1e;->c:La/p7m0;

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, p2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    :cond_3
    return-void
.end method


# virtual methods
.method public final a()La/gmq;
    .locals 3

    .line 1
    new-instance v0, La/i89;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    iget-object v2, p0, La/p1e;->c:La/p7m0;

    .line 6
    .line 7
    invoke-direct {v0, v2, v1}, La/i89;-><init>(La/gmq;B)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/p1e;->e(La/gmq;)La/gmq;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v0, La/n1e;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x3

    .line 18
    invoke-direct {v0, v2, v1}, La/bnn0;-><init>(ILa/yje;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v0}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, La/i120;->W(La/gmq;)La/gmq;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final b()La/gmq;
    .locals 3

    .line 1
    iget-object v0, p0, La/p1e;->b:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/p1e;->e(La/gmq;)La/gmq;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, La/n1e;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x3

    .line 11
    invoke-direct {v0, v2, v1}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, La/i120;->W(La/gmq;)La/gmq;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget-object v0, p0, La/p1e;->b:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object p0, p0, La/p1e;->a:La/umx;

    .line 14
    .line 15
    iget-object v1, p0, La/umx;->a:La/n0o0;

    .line 16
    .line 17
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object p0, p0, La/umx;->b:La/p7m0;

    .line 32
    .line 33
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    const/4 p0, 0x1

    .line 46
    return p0

    .line 47
    :cond_0
    const/4 p0, 0x0

    .line 48
    return p0

    .line 49
    :cond_1
    return v0
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, La/p1e;->d:Landroid/net/ConnectivityManager;

    .line 2
    .line 3
    iget-object v1, p0, La/p1e;->f:La/o1e;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/p1e;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e(La/gmq;)La/gmq;
    .locals 4

    .line 1
    iget-object p0, p0, La/p1e;->a:La/umx;

    .line 2
    .line 3
    iget-object v0, p0, La/umx;->a:La/n0o0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, La/umx;->b:La/p7m0;

    .line 18
    .line 19
    invoke-static {p0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance v0, La/t82;

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    const/4 v2, 0x2

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v0, v1, v3, v2}, La/t82;-><init>(ILa/yje;B)V

    .line 29
    .line 30
    .line 31
    new-instance v1, La/p6d;

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-direct {v1, p1, p0, v0, v2}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_0
    return-object p1
.end method
