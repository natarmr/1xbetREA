.class public final La/ihq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/m5d0;


# instance fields
.field public final synthetic a:B

.field public final b:La/lji0;

.field public final c:La/m5d0;


# direct methods
.method public synthetic constructor <init>(La/lji0;La/m5d0;B)V
    .locals 0

    .line 12
    iput-byte p3, p0, La/ihq;->a:B

    iput-object p1, p0, La/ihq;->b:La/lji0;

    iput-object p2, p0, La/ihq;->c:La/m5d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/m5d0;La/lji0;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/ihq;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ihq;->c:La/m5d0;

    .line 8
    .line 9
    iput-object p2, p0, La/ihq;->b:La/lji0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/ihq;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ihq;->b:La/lji0;

    .line 4
    .line 5
    iget-object p0, p0, La/ihq;->c:La/m5d0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/bs3;

    .line 15
    .line 16
    iget-object v0, v1, La/lji0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    .line 19
    .line 20
    new-instance v1, La/xgf0;

    .line 21
    .line 22
    invoke-direct {v1, p0, v0}, La/xgf0;-><init>(La/bs3;Lkotlin/coroutines/CoroutineContext;)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :pswitch_0
    iget-object v0, v1, La/lji0;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Landroid/content/Context;

    .line 29
    .line 30
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/out0;

    .line 35
    .line 36
    new-instance v1, La/qyb0;

    .line 37
    .line 38
    invoke-direct {v1, v0, p0}, La/qyb0;-><init>(Landroid/content/Context;La/out0;)V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :pswitch_1
    iget-object v0, v1, La/lji0;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Landroid/content/Context;

    .line 45
    .line 46
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Lkotlin/coroutines/CoroutineContext;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    sget-object v1, La/lwf;->A:La/lwf;

    .line 59
    .line 60
    new-instance v2, La/ugf0;

    .line 61
    .line 62
    new-instance v3, La/rnp;

    .line 63
    .line 64
    const/4 v4, 0x6

    .line 65
    invoke-direct {v3, v4}, La/rnp;-><init>(B)V

    .line 66
    .line 67
    .line 68
    invoke-direct {v2, v3}, La/ugf0;-><init>(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    new-instance v3, La/i7q;

    .line 76
    .line 77
    const/4 v4, 0x1

    .line 78
    invoke-direct {v3, v0, v4}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v2, p0, v3}, La/m2a;->k(La/mhi0;La/ugf0;La/sje;Lkotlin/jvm/functions/Function0;)La/ncj;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
