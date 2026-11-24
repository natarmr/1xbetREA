.class public final synthetic La/wnt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La/wdu;

.field public final synthetic b:La/q55;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(La/wdu;La/q55;ILjava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/wnt0;->a:La/wdu;

    iput-object p2, p0, La/wnt0;->b:La/q55;

    iput p3, p0, La/wnt0;->c:I

    iput-object p4, p0, La/wnt0;->d:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, La/wnt0;->b:La/q55;

    .line 2
    .line 3
    iget v1, p0, La/wnt0;->c:I

    .line 4
    .line 5
    iget-object v2, p0, La/wnt0;->d:Ljava/lang/Runnable;

    .line 6
    .line 7
    iget-object p0, p0, La/wnt0;->a:La/wdu;

    .line 8
    .line 9
    iget-object v3, p0, La/wdu;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, La/wpg0;

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    :try_start_0
    iget-object v5, p0, La/wdu;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v5, La/wpg0;

    .line 17
    .line 18
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    new-instance v6, La/xnt0;

    .line 22
    .line 23
    invoke-direct {v6, v5, v4}, La/xnt0;-><init>(La/wpg0;B)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, v6}, La/wpg0;->l(La/wzn0;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iget-object v5, p0, La/wdu;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v5, Landroid/content/Context;

    .line 32
    .line 33
    const-string v6, "connectivity"

    .line 34
    .line 35
    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    check-cast v5, Landroid/net/ConnectivityManager;

    .line 40
    .line 41
    invoke-virtual {v5}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    if-eqz v5, :cond_0

    .line 46
    .line 47
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_0

    .line 52
    .line 53
    invoke-virtual {p0, v0, v1}, La/wdu;->H(La/q55;I)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    goto :goto_1

    .line 59
    :cond_0
    new-instance v5, La/nlo;

    .line 60
    .line 61
    invoke-direct {v5, p0, v0, v1}, La/nlo;-><init>(La/wdu;La/q55;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v5}, La/wpg0;->l(La/wzn0;)Ljava/lang/Object;
    :try_end_0
    .catch La/vzn0; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    :goto_0
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :catch_0
    :try_start_1
    iget-object p0, p0, La/wdu;->e:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, La/y3v;

    .line 74
    .line 75
    add-int/2addr v1, v4

    .line 76
    const/4 v3, 0x0

    .line 77
    invoke-virtual {p0, v0, v1, v3}, La/y3v;->v(La/q55;IZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    .line 79
    .line 80
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :goto_1
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 85
    .line 86
    .line 87
    throw p0
.end method
