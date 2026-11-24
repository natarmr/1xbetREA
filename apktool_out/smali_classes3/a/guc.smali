.class public final La/guc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/jw20;

.field public final b:Lokhttp3/OkHttpClient;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public f:Lokhttp3/internal/ws/RealWebSocket;

.field public final g:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(La/jw20;Lokhttp3/OkHttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/guc;->a:La/jw20;

    .line 17
    .line 18
    iput-object p2, p0, La/guc;->b:Lokhttp3/OkHttpClient;

    .line 19
    .line 20
    iput-object p4, p0, La/guc;->c:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p5, p0, La/guc;->d:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p6, p0, La/guc;->e:Ljava/lang/String;

    .line 25
    .line 26
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, La/guc;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/guc;->c:Ljava/lang/String;

    .line 5
    .line 6
    const-string v1, " "

    .line 7
    .line 8
    iget-object v2, p0, La/guc;->d:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v2, v1, v0}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lokhttp3/Request$Builder;

    .line 15
    .line 16
    invoke-direct {v1}, Lokhttp3/Request$Builder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v2, "Authorization"

    .line 20
    .line 21
    iget-object v3, v1, Lokhttp3/Request$Builder;->c:Lokhttp3/Headers$Builder;

    .line 22
    .line 23
    invoke-virtual {v3, v2, v0}, Lokhttp3/Headers$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 27
    .line 28
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 29
    .line 30
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 37
    .line 38
    const-string v5, "1"

    .line 39
    .line 40
    filled-new-array {v2, v3, v4, v5}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const/4 v3, 0x4

    .line 45
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const-string v3, "Android:%s %d@%s@%s"

    .line 50
    .line 51
    invoke-static {v0, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v2, v1, Lokhttp3/Request$Builder;->c:Lokhttp3/Headers$Builder;

    .line 56
    .line 57
    const-string v3, "User-Agent"

    .line 58
    .line 59
    invoke-virtual {v2, v3, v0}, Lokhttp3/Headers$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, La/guc;->e:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v1, v0}, Lokhttp3/Request$Builder;->d(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    new-instance v0, Lokhttp3/Request;

    .line 68
    .line 69
    invoke-direct {v0, v1}, Lokhttp3/Request;-><init>(Lokhttp3/Request$Builder;)V

    .line 70
    .line 71
    .line 72
    new-instance v1, La/fuc;

    .line 73
    .line 74
    invoke-direct {v1, p0}, La/fuc;-><init>(La/guc;)V

    .line 75
    .line 76
    .line 77
    iget-object v2, p0, La/guc;->b:Lokhttp3/OkHttpClient;

    .line 78
    .line 79
    invoke-virtual {v2, v0, v1}, Lokhttp3/OkHttpClient;->c(Lokhttp3/Request;Lokhttp3/WebSocketListener;)Lokhttp3/internal/ws/RealWebSocket;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, La/guc;->f:Lokhttp3/internal/ws/RealWebSocket;

    .line 84
    .line 85
    return-void
.end method
