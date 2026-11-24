.class public final synthetic La/rwt0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements La/xdr;


# static fields
.field public static final a:La/rwt0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/rwt0;

    .line 2
    .line 3
    const-string v4, "handleConfirm(Ljava/lang/String;Lcom/vk/api/sdk/VKApiValidationHandler$Callback;)V"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x3

    .line 7
    const-class v2, La/nvt0;

    .line 8
    .line 9
    const-string v3, "handleConfirm"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/rwt0;->a:La/rwt0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, La/nvt0;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/String;

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
    const/4 p0, 0x0

    .line 17
    sput-boolean p0, Lcom/vk/api/sdk/ui/VKConfirmationActivity;->a:Z

    .line 18
    .line 19
    iget-object p1, p1, La/nvt0;->a:Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v0, La/qaq0;

    .line 25
    .line 26
    const/16 v1, 0xe

    .line 27
    .line 28
    invoke-direct {v0, p1, p2, v1}, La/qaq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, La/wvt0;->a(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, La/fwt0;->a()V

    .line 35
    .line 36
    .line 37
    sget-boolean p1, Lcom/vk/api/sdk/ui/VKConfirmationActivity;->a:Z

    .line 38
    .line 39
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p3, La/bvt0;->b:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object p1, p3, La/bvt0;->a:La/ilp0;

    .line 46
    .line 47
    iget-object p1, p1, La/ilp0;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 50
    .line 51
    const/4 p2, 0x0

    .line 52
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Ljava/util/concurrent/CountDownLatch;

    .line 57
    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 61
    .line 62
    .line 63
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move-object p1, p2

    .line 67
    :goto_0
    if-eqz p1, :cond_1

    .line 68
    .line 69
    sput-boolean p0, Lcom/vk/api/sdk/ui/VKConfirmationActivity;->a:Z

    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_1
    const-string p0, "Latch is null!"

    .line 75
    .line 76
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object p2
.end method
