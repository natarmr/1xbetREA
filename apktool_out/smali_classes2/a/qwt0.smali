.class public final synthetic La/qwt0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements La/xdr;


# static fields
.field public static final a:La/qwt0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/qwt0;

    .line 2
    .line 3
    const-string v4, "handleCaptcha(Lcom/vk/api/sdk/VKApiValidationHandler$Captcha;Lcom/vk/api/sdk/VKApiValidationHandler$Callback;)V"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x3

    .line 7
    const-class v2, La/nvt0;

    .line 8
    .line 9
    const-string v3, "handleCaptcha"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/qwt0;->a:La/qwt0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, La/nvt0;

    .line 2
    .line 3
    check-cast p2, La/cvt0;

    .line 4
    .line 5
    check-cast p3, La/bvt0;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v1, p1, La/nvt0;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object p0, Lcom/vk/api/sdk/ui/VKCaptchaActivity;->d:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v2, p2, La/cvt0;->a:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v3, p2, La/cvt0;->b:Ljava/lang/Integer;

    .line 26
    .line 27
    iget-object v4, p2, La/cvt0;->c:Ljava/lang/Integer;

    .line 28
    .line 29
    new-instance v0, La/qx9;

    .line 30
    .line 31
    const/16 v5, 0xb

    .line 32
    .line 33
    invoke-direct/range {v0 .. v5}, La/qx9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, La/wvt0;->a(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    invoke-static {}, La/fwt0;->a()V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lcom/vk/api/sdk/ui/VKCaptchaActivity;->d:Ljava/lang/String;

    .line 43
    .line 44
    const-string p1, "Latch is null!"

    .line 45
    .line 46
    const/4 p2, 0x0

    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    iput-object p0, p3, La/bvt0;->b:Ljava/lang/Object;

    .line 50
    .line 51
    iget-object p0, p3, La/bvt0;->a:La/ilp0;

    .line 52
    .line 53
    iget-object p0, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 56
    .line 57
    invoke-virtual {p0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Ljava/util/concurrent/CountDownLatch;

    .line 62
    .line 63
    if-eqz p0, :cond_0

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    move-object p0, p2

    .line 72
    :goto_0
    if-eqz p0, :cond_1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_1
    invoke-static {p1}, La/hny;->u(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object p2

    .line 79
    :cond_2
    iget-object p0, p3, La/bvt0;->a:La/ilp0;

    .line 80
    .line 81
    iget-object p0, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 84
    .line 85
    invoke-virtual {p0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, Ljava/util/concurrent/CountDownLatch;

    .line 90
    .line 91
    if-eqz p0, :cond_3

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 94
    .line 95
    .line 96
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    move-object p0, p2

    .line 100
    :goto_1
    if-eqz p0, :cond_4

    .line 101
    .line 102
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0

    .line 105
    :cond_4
    invoke-static {p1}, La/hny;->u(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-object p2
.end method
