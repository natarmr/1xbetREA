.class public final La/aa40;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/lvu0;

.field public final b:Lokhttp3/OkHttpClient;

.field public c:La/jwd;

.field public d:La/ejd;

.field public e:La/cnc;

.field public final f:La/vby;

.field public g:J

.field public h:Z

.field public final i:La/jw20;

.field public final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public final k:Landroid/os/Handler;

.field public final l:La/mx2;

.field public final m:La/n0o0;


# direct methods
.method public constructor <init>(La/lvu0;Lokhttp3/OkHttpClient;La/jwd;La/ejd;La/cnc;La/vby;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/aa40;->a:La/lvu0;

    .line 11
    .line 12
    iput-object p2, p0, La/aa40;->b:Lokhttp3/OkHttpClient;

    .line 13
    .line 14
    iput-object p3, p0, La/aa40;->c:La/jwd;

    .line 15
    .line 16
    iput-object p4, p0, La/aa40;->d:La/ejd;

    .line 17
    .line 18
    iput-object p5, p0, La/aa40;->e:La/cnc;

    .line 19
    .line 20
    iput-object p6, p0, La/aa40;->f:La/vby;

    .line 21
    .line 22
    new-instance p1, La/jw20;

    .line 23
    .line 24
    const/4 p2, 0x4

    .line 25
    invoke-direct {p1, p0, p2}, La/jw20;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/aa40;->i:La/jw20;

    .line 29
    .line 30
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, La/aa40;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    .line 37
    new-instance p1, Landroid/os/Handler;

    .line 38
    .line 39
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, La/aa40;->k:Landroid/os/Handler;

    .line 47
    .line 48
    new-instance p1, La/mx2;

    .line 49
    .line 50
    const/16 p2, 0x16

    .line 51
    .line 52
    invoke-direct {p1, p0, p2}, La/mx2;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, La/aa40;->l:La/mx2;

    .line 56
    .line 57
    new-instance p1, La/np30;

    .line 58
    .line 59
    const/4 p2, 0x5

    .line 60
    invoke-direct {p1, p0, p2}, La/np30;-><init>(Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, La/aa40;->m:La/n0o0;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La/aa40;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, La/aa40;->h:Z

    .line 8
    .line 9
    iget-object v0, p0, La/aa40;->k:Landroid/os/Handler;

    .line 10
    .line 11
    iget-object v1, p0, La/aa40;->l:La/mx2;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, La/aa40;->m:La/n0o0;

    .line 17
    .line 18
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, La/guc;

    .line 23
    .line 24
    iget-object v0, v0, La/guc;->f:Lokhttp3/internal/ws/RealWebSocket;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Lokhttp3/internal/ws/RealWebSocket;->h()V

    .line 29
    .line 30
    .line 31
    :cond_0
    if-eqz p1, :cond_1

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    iput-object p1, p0, La/aa40;->c:La/jwd;

    .line 35
    .line 36
    iput-object p1, p0, La/aa40;->d:La/ejd;

    .line 37
    .line 38
    iput-object p1, p0, La/aa40;->e:La/cnc;

    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/aa40;->m:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/guc;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/guc;->f:Lokhttp3/internal/ws/RealWebSocket;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lokhttp3/internal/ws/RealWebSocket;->a(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p0, "WebSocket connection is not created"

    .line 24
    .line 25
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final c(ILkotlin/jvm/functions/Function1;La/jiy;La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p4, La/x940;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/x940;

    .line 7
    .line 8
    iget v1, v0, La/x940;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/x940;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/x940;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/x940;-><init>(La/aa40;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/x940;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/x940;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget p1, v0, La/x940;->i:I

    .line 37
    .line 38
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object v5, p0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-instance v4, La/zxt;

    .line 54
    .line 55
    const/4 v9, 0x0

    .line 56
    move-object v5, p0

    .line 57
    move v6, p1

    .line 58
    move-object v8, p2

    .line 59
    move-object v7, p3

    .line 60
    invoke-direct/range {v4 .. v9}, La/zxt;-><init>(La/aa40;ILa/jiy;Lkotlin/jvm/functions/Function1;La/yje;)V

    .line 61
    .line 62
    .line 63
    iput v6, v0, La/x940;->i:I

    .line 64
    .line 65
    iput v3, v0, La/x940;->l:I

    .line 66
    .line 67
    const-wide/16 p0, 0x3a98

    .line 68
    .line 69
    invoke-static {p0, p1, v4, v0}, La/msm0;->u(JLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p4

    .line 73
    if-ne p4, v1, :cond_3

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    move p1, v6

    .line 77
    :goto_1
    check-cast p4, La/r4v0;

    .line 78
    .line 79
    if-eqz p4, :cond_4

    .line 80
    .line 81
    return-object p4

    .line 82
    :cond_4
    new-instance p0, Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-direct {p0, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 85
    .line 86
    .line 87
    iget-object p1, v5, La/aa40;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 88
    .line 89
    invoke-virtual {p1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    new-instance p0, Ljava/util/concurrent/TimeoutException;

    .line 93
    .line 94
    invoke-direct {p0}, Ljava/util/concurrent/TimeoutException;-><init>()V

    .line 95
    .line 96
    .line 97
    throw p0
.end method
