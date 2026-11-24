.class public final La/uwg0;
.super Lkotlin/coroutines/a;
.source "SourceFile"

# interfaces
.implements La/nne;


# instance fields
.field public final synthetic b:B

.field public final synthetic c:La/cxg0;


# direct methods
.method public constructor <init>(La/cxg0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uwg0;->b:B

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p2, La/lwf;->h:La/lwf;

    .line 7
    .line 8
    iput-object p1, p0, La/uwg0;->c:La/cxg0;

    .line 9
    .line 10
    invoke-direct {p0, p2}, Lkotlin/coroutines/a;-><init>(Lkotlin/coroutines/f;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    sget-object p2, La/lwf;->h:La/lwf;

    .line 15
    .line 16
    iput-object p1, p0, La/uwg0;->c:La/cxg0;

    .line 17
    .line 18
    invoke-direct {p0, p2}, Lkotlin/coroutines/a;-><init>(Lkotlin/coroutines/f;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final l(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V
    .locals 9

    .line 1
    iget-byte p2, p0, La/uwg0;->b:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    instance-of p2, p1, La/zhi0;

    .line 8
    .line 9
    iget-object v3, p0, La/uwg0;->c:La/cxg0;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    iget-object p0, v3, La/cxg0;->k:La/nj7;

    .line 14
    .line 15
    move-object p2, p1

    .line 16
    check-cast p2, La/zhi0;

    .line 17
    .line 18
    iget-object p2, p2, La/zhi0;->c:La/kuw;

    .line 19
    .line 20
    invoke-interface {p2}, La/kuw;->getErrorCode()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iget-object v1, p0, La/nj7;->a:La/b4j;

    .line 25
    .line 26
    sget-object v2, La/a1w;->a:La/a1w;

    .line 27
    .line 28
    sget-object v2, La/r6w;->j:La/r6w;

    .line 29
    .line 30
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v1, v4, v2}, La/b4j;->c(Ljava/lang/String;La/r6w;)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, La/nj7;->b:La/au0;

    .line 38
    .line 39
    invoke-virtual {v2}, La/r6w;->a()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p0, p2, v1}, La/au0;->f(ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {v3, v0}, La/cxg0;->F(Z)V

    .line 47
    .line 48
    .line 49
    iget-object p0, v3, La/cxg0;->i:La/duj;

    .line 50
    .line 51
    new-instance v1, La/due0;

    .line 52
    .line 53
    const/4 v7, 0x0

    .line 54
    const/16 v8, 0x10

    .line 55
    .line 56
    const/4 v2, 0x2

    .line 57
    const-class v4, La/cxg0;

    .line 58
    .line 59
    const-string v5, "onSaleError"

    .line 60
    .line 61
    const-string v6, "onSaleError(Ljava/lang/Throwable;Ljava/lang/String;)V"

    .line 62
    .line 63
    invoke-direct/range {v1 .. v8}, La/due0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_0
    instance-of p2, p1, La/zhi0;

    .line 71
    .line 72
    iget-object v3, p0, La/uwg0;->c:La/cxg0;

    .line 73
    .line 74
    if-eqz p2, :cond_1

    .line 75
    .line 76
    iget-object p0, v3, La/cxg0;->k:La/nj7;

    .line 77
    .line 78
    move-object p2, p1

    .line 79
    check-cast p2, La/zhi0;

    .line 80
    .line 81
    iget-object p2, p2, La/zhi0;->c:La/kuw;

    .line 82
    .line 83
    invoke-interface {p2}, La/kuw;->getErrorCode()I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    iget-object v1, p0, La/nj7;->a:La/b4j;

    .line 88
    .line 89
    sget-object v2, La/a1w;->a:La/a1w;

    .line 90
    .line 91
    sget-object v2, La/r6w;->j:La/r6w;

    .line 92
    .line 93
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-virtual {v1, v4, v2}, La/b4j;->c(Ljava/lang/String;La/r6w;)V

    .line 98
    .line 99
    .line 100
    iget-object p0, p0, La/nj7;->b:La/au0;

    .line 101
    .line 102
    invoke-virtual {v2}, La/r6w;->a()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {p0, p2, v1}, La/au0;->f(ILjava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :cond_1
    invoke-virtual {v3, v0}, La/cxg0;->F(Z)V

    .line 110
    .line 111
    .line 112
    iget-object p0, v3, La/cxg0;->i:La/duj;

    .line 113
    .line 114
    new-instance v1, La/due0;

    .line 115
    .line 116
    const/4 v7, 0x0

    .line 117
    const/16 v8, 0xf

    .line 118
    .line 119
    const/4 v2, 0x2

    .line 120
    const-class v4, La/cxg0;

    .line 121
    .line 122
    const-string v5, "onFullSaleError"

    .line 123
    .line 124
    const-string v6, "onFullSaleError(Ljava/lang/Throwable;Ljava/lang/String;)V"

    .line 125
    .line 126
    invoke-direct/range {v1 .. v8}, La/due0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
