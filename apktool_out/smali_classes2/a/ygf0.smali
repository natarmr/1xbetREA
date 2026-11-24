.class public final La/ygf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/m5d0;


# instance fields
.field public final synthetic a:B

.field public final b:La/m5d0;

.field public final c:La/m5d0;

.field public final d:La/m5d0;

.field public final e:La/m5d0;

.field public final f:La/m5d0;


# direct methods
.method public constructor <init>(La/lji0;La/m5d0;La/m5d0;La/m5d0;La/m5d0;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/ygf0;->a:B

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, La/ygf0;->f:La/m5d0;

    .line 20
    iput-object p2, p0, La/ygf0;->b:La/m5d0;

    .line 21
    iput-object p3, p0, La/ygf0;->c:La/m5d0;

    .line 22
    iput-object p4, p0, La/ygf0;->d:La/m5d0;

    .line 23
    iput-object p5, p0, La/ygf0;->e:La/m5d0;

    return-void
.end method

.method public constructor <init>(La/m5d0;La/m5d0;La/m5d0;La/m5d0;La/m5d0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/ygf0;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ygf0;->b:La/m5d0;

    .line 8
    .line 9
    iput-object p2, p0, La/ygf0;->c:La/m5d0;

    .line 10
    .line 11
    iput-object p3, p0, La/ygf0;->d:La/m5d0;

    .line 12
    .line 13
    iput-object p4, p0, La/ygf0;->e:La/m5d0;

    .line 14
    .line 15
    iput-object p5, p0, La/ygf0;->f:La/m5d0;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/ygf0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ygf0;->e:La/m5d0;

    .line 4
    .line 5
    iget-object v2, p0, La/ygf0;->d:La/m5d0;

    .line 6
    .line 7
    iget-object v3, p0, La/ygf0;->c:La/m5d0;

    .line 8
    .line 9
    iget-object v4, p0, La/ygf0;->b:La/m5d0;

    .line 10
    .line 11
    iget-object p0, p0, La/ygf0;->f:La/m5d0;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p0, La/lji0;

    .line 17
    .line 18
    iget-object p0, p0, La/lji0;->b:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v6, p0

    .line 21
    check-cast v6, La/nfq;

    .line 22
    .line 23
    invoke-interface {v4}, La/o5d0;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    move-object v7, p0

    .line 28
    check-cast v7, La/dgq;

    .line 29
    .line 30
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    move-object v8, p0

    .line 35
    check-cast v8, La/xmi0;

    .line 36
    .line 37
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    move-object v9, p0

    .line 42
    check-cast v9, La/oco;

    .line 43
    .line 44
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    move-object v10, p0

    .line 49
    check-cast v10, Lkotlin/coroutines/CoroutineContext;

    .line 50
    .line 51
    new-instance v5, La/uji0;

    .line 52
    .line 53
    invoke-direct/range {v5 .. v10}, La/uji0;-><init>(La/nfq;La/dgq;La/xmi0;La/oco;Lkotlin/coroutines/CoroutineContext;)V

    .line 54
    .line 55
    .line 56
    return-object v5

    .line 57
    :pswitch_0
    invoke-interface {v4}, La/o5d0;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    move-object v5, v0

    .line 62
    check-cast v5, La/olq0;

    .line 63
    .line 64
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    move-object v6, v0

    .line 69
    check-cast v6, La/dgq;

    .line 70
    .line 71
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    move-object v7, v0

    .line 76
    check-cast v7, La/bs3;

    .line 77
    .line 78
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    move-object v8, v0

    .line 83
    check-cast v8, La/xgf0;

    .line 84
    .line 85
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    move-object v9, p0

    .line 90
    check-cast v9, La/wzi0;

    .line 91
    .line 92
    new-instance v4, La/wgf0;

    .line 93
    .line 94
    invoke-direct/range {v4 .. v9}, La/wgf0;-><init>(La/olq0;La/dgq;La/bs3;La/xgf0;La/wzi0;)V

    .line 95
    .line 96
    .line 97
    return-object v4

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
