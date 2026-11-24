.class public final La/jhq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/m5d0;


# instance fields
.field public final synthetic a:B

.field public final b:La/m5d0;

.field public final c:La/m5d0;

.field public final d:La/m5d0;


# direct methods
.method public constructor <init>(La/lji0;La/m5d0;La/m5d0;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/jhq;->a:B

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, La/jhq;->d:La/m5d0;

    .line 16
    iput-object p2, p0, La/jhq;->b:La/m5d0;

    .line 17
    iput-object p3, p0, La/jhq;->c:La/m5d0;

    return-void
.end method

.method public constructor <init>(La/m5d0;La/m5d0;La/m5d0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/jhq;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/jhq;->b:La/m5d0;

    .line 8
    .line 9
    iput-object p2, p0, La/jhq;->c:La/m5d0;

    .line 10
    .line 11
    iput-object p3, p0, La/jhq;->d:La/m5d0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/jhq;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/jhq;->d:La/m5d0;

    .line 4
    .line 5
    iget-object v2, p0, La/jhq;->c:La/m5d0;

    .line 6
    .line 7
    iget-object p0, p0, La/jhq;->b:La/m5d0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lkotlin/coroutines/CoroutineContext;

    .line 17
    .line 18
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, La/olq0;

    .line 23
    .line 24
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, La/wbj;

    .line 29
    .line 30
    new-instance v2, La/wzi0;

    .line 31
    .line 32
    invoke-direct {v2, p0, v0, v1}, La/wzi0;-><init>(Lkotlin/coroutines/CoroutineContext;La/olq0;La/wbj;)V

    .line 33
    .line 34
    .line 35
    return-object v2

    .line 36
    :pswitch_0
    check-cast v1, La/lji0;

    .line 37
    .line 38
    iget-object v0, v1, La/lji0;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Landroid/content/Context;

    .line 41
    .line 42
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Lkotlin/coroutines/CoroutineContext;

    .line 47
    .line 48
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, La/kji0;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance v2, La/ugf0;

    .line 64
    .line 65
    new-instance v3, La/g7p;

    .line 66
    .line 67
    const/16 v4, 0x8

    .line 68
    .line 69
    invoke-direct {v3, v1, v4}, La/g7p;-><init>(Ljava/lang/Object;B)V

    .line 70
    .line 71
    .line 72
    invoke-direct {v2, v3}, La/ugf0;-><init>(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    new-instance v3, La/i7q;

    .line 80
    .line 81
    const/4 v4, 0x2

    .line 82
    invoke-direct {v3, v0, v4}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 83
    .line 84
    .line 85
    invoke-static {v1, v2, p0, v3}, La/m2a;->k(La/mhi0;La/ugf0;La/sje;Lkotlin/jvm/functions/Function0;)La/ncj;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
