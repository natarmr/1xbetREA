.class public final Lokhttp3/internal/connection/RouteSelector;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/connection/RouteSelector$Companion;,
        Lokhttp3/internal/connection/RouteSelector$Selection;,
        Lokhttp3/internal/connection/RouteSelector$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lokhttp3/internal/connection/RouteSelector;",
        "",
        "Selection",
        "Companion",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lokhttp3/Address;

.field public final b:Lokhttp3/internal/connection/RouteDatabase;

.field public final c:Lokhttp3/internal/connection/RealCall;

.field public final d:Z

.field public final e:Ljava/util/List;

.field public f:I

.field public final g:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/internal/connection/RealCall;Z)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lokhttp3/internal/connection/RouteSelector;->a:Lokhttp3/Address;

    .line 8
    .line 9
    iput-object p2, p0, Lokhttp3/internal/connection/RouteSelector;->b:Lokhttp3/internal/connection/RouteDatabase;

    .line 10
    .line 11
    iput-object p3, p0, Lokhttp3/internal/connection/RouteSelector;->c:Lokhttp3/internal/connection/RealCall;

    .line 12
    .line 13
    iput-boolean p4, p0, Lokhttp3/internal/connection/RouteSelector;->d:Z

    .line 14
    .line 15
    sget-object p2, La/iun;->a:La/iun;

    .line 16
    .line 17
    iput-object p2, p0, Lokhttp3/internal/connection/RouteSelector;->e:Ljava/util/List;

    .line 18
    .line 19
    new-instance p2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lokhttp3/internal/connection/RouteSelector;->g:Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object p2, p1, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 27
    .line 28
    iget-object p4, p1, Lokhttp3/Address;->g:Ljava/net/Proxy;

    .line 29
    .line 30
    iget-object v0, p3, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 31
    .line 32
    invoke-virtual {v0, p3, p2}, Lokhttp3/EventListener;->r(Lokhttp3/internal/connection/RealCall;Lokhttp3/HttpUrl;)V

    .line 33
    .line 34
    .line 35
    if-eqz p4, :cond_0

    .line 36
    .line 37
    invoke-static {p4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_2

    .line 42
    :cond_0
    invoke-virtual {p2}, Lokhttp3/HttpUrl;->i()Ljava/net/URI;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    invoke-virtual {p3}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p4

    .line 50
    if-nez p4, :cond_1

    .line 51
    .line 52
    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 53
    .line 54
    filled-new-array {p1}, [Ljava/net/Proxy;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Lokhttp3/internal/_UtilJvmKt;->k([Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_2

    .line 63
    :cond_1
    :try_start_0
    iget-object p1, p1, Lokhttp3/Address;->h:Ljava/net/ProxySelector;

    .line 64
    .line 65
    invoke-virtual {p1, p3}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    goto :goto_0

    .line 70
    :catch_0
    const/4 p1, 0x0

    .line 71
    :goto_0
    if-eqz p1, :cond_3

    .line 72
    .line 73
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    if-eqz p3, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    invoke-static {p1}, Lokhttp3/internal/_UtilJvmKt;->j(Ljava/util/List;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    :goto_1
    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 86
    .line 87
    filled-new-array {p1}, [Ljava/net/Proxy;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p1}, Lokhttp3/internal/_UtilJvmKt;->k([Ljava/lang/Object;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    :goto_2
    iput-object p1, p0, Lokhttp3/internal/connection/RouteSelector;->e:Ljava/util/List;

    .line 96
    .line 97
    const/4 p1, 0x0

    .line 98
    iput p1, p0, Lokhttp3/internal/connection/RouteSelector;->f:I

    .line 99
    .line 100
    iget-object p1, p0, Lokhttp3/internal/connection/RouteSelector;->c:Lokhttp3/internal/connection/RealCall;

    .line 101
    .line 102
    iget-object p1, p1, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 103
    .line 104
    iget-object p3, p0, Lokhttp3/internal/connection/RouteSelector;->c:Lokhttp3/internal/connection/RealCall;

    .line 105
    .line 106
    iget-object p0, p0, Lokhttp3/internal/connection/RouteSelector;->e:Ljava/util/List;

    .line 107
    .line 108
    invoke-virtual {p1, p3, p2, p0}, Lokhttp3/EventListener;->q(Lokhttp3/Call;Lokhttp3/HttpUrl;Ljava/util/List;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget v0, p0, Lokhttp3/internal/connection/RouteSelector;->f:I

    .line 2
    .line 3
    iget-object v1, p0, Lokhttp3/internal/connection/RouteSelector;->e:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p0, p0, Lokhttp3/internal/connection/RouteSelector;->g:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return p0
.end method
