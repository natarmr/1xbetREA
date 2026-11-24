.class public final Lorg/xplatform/coupon/impl/notify/CouponNotificationWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lorg/xplatform/coupon/impl/notify/CouponNotificationWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final g:Landroid/content/Context;

.field public final h:La/h760;

.field public final i:La/uqx;

.field public final j:La/ctf0;

.field public final k:La/s64;

.field public final l:La/qu;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lorg/xplatform/coupon/impl/notify/CouponNotificationWorker;->g:Landroid/content/Context;

    .line 11
    .line 12
    iget-object p1, p0, La/og00;->a:Landroid/content/Context;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast p1, Landroid/app/Application;

    .line 18
    .line 19
    instance-of p2, p1, La/af3;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    check-cast p1, La/af3;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object p1, v0

    .line 28
    :goto_0
    const-class p2, La/o0f;

    .line 29
    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1, p2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, La/o5d0;

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, La/ze3;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move-object p1, v0

    .line 52
    :goto_1
    instance-of v1, p1, La/o0f;

    .line 53
    .line 54
    if-nez v1, :cond_2

    .line 55
    .line 56
    move-object p1, v0

    .line 57
    :cond_2
    check-cast p1, La/o0f;

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    iget-object p2, p1, La/o0f;->a:La/h760;

    .line 62
    .line 63
    iget-object v0, p1, La/o0f;->b:La/v6j0;

    .line 64
    .line 65
    iget-object v1, p1, La/o0f;->c:La/ctf0;

    .line 66
    .line 67
    iget-object v2, p1, La/o0f;->d:La/s64;

    .line 68
    .line 69
    iget-object p1, p1, La/o0f;->e:La/qu;

    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iput-object p2, p0, Lorg/xplatform/coupon/impl/notify/CouponNotificationWorker;->h:La/h760;

    .line 81
    .line 82
    new-instance p2, La/uqx;

    .line 83
    .line 84
    const/4 v3, 0x1

    .line 85
    invoke-direct {p2, v0, v3}, La/uqx;-><init>(La/v6j0;B)V

    .line 86
    .line 87
    .line 88
    iput-object p2, p0, Lorg/xplatform/coupon/impl/notify/CouponNotificationWorker;->i:La/uqx;

    .line 89
    .line 90
    iput-object v1, p0, Lorg/xplatform/coupon/impl/notify/CouponNotificationWorker;->j:La/ctf0;

    .line 91
    .line 92
    iput-object v2, p0, Lorg/xplatform/coupon/impl/notify/CouponNotificationWorker;->k:La/s64;

    .line 93
    .line 94
    iput-object p1, p0, Lorg/xplatform/coupon/impl/notify/CouponNotificationWorker;->l:La/qu;

    .line 95
    .line 96
    return-void

    .line 97
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 98
    .line 99
    invoke-static {p2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v0
.end method


# virtual methods
.method public final c(La/yje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/n0f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/n0f;

    .line 7
    .line 8
    iget v1, v0, La/n0f;->k:I

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
    iput v1, v0, La/n0f;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/n0f;

    .line 21
    .line 22
    check-cast p1, La/zje;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, La/n0f;-><init>(Lorg/xplatform/coupon/impl/notify/CouponNotificationWorker;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v0, La/n0f;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, v0, La/n0f;->k:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
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
    return-object v3

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance p1, La/jtb;

    .line 53
    .line 54
    const/16 v2, 0x1c

    .line 55
    .line 56
    invoke-direct {p1, p0, v3, v2}, La/jtb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 57
    .line 58
    .line 59
    iput v4, v0, La/n0f;->k:I

    .line 60
    .line 61
    invoke-static {v0, p1}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-ne p0, v1, :cond_3

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    :goto_1
    invoke-static {}, La/ng00;->a()La/mg00;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method
