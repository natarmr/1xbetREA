.class public final La/bqb;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/eqb;


# direct methods
.method public synthetic constructor <init>(La/eqb;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bqb;->i:B

    iput-object p1, p0, La/bqb;->l:La/eqb;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/bqb;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/bqb;->l:La/eqb;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/bqb;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/bqb;-><init>(La/eqb;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/bqb;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/bqb;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/bqb;-><init>(La/eqb;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/bqb;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/bqb;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lkotlin/Pair;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/bqb;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/bqb;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/bqb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/kmq;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/bqb;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/bqb;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/bqb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/bqb;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/bqb;->l:La/eqb;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/bqb;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lkotlin/Pair;

    .line 15
    .line 16
    sget-object v5, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v6, p0, La/bqb;->j:Z

    .line 19
    .line 20
    if-eqz v6, :cond_1

    .line 21
    .line 22
    if-ne v6, v3, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, La/e7a;

    .line 38
    .line 39
    instance-of v0, p1, La/d7a;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    sget-object v0, La/tvk;->a:La/rwj;

    .line 44
    .line 45
    sget-object v0, La/ys10;->a:La/vs10;

    .line 46
    .line 47
    new-instance v2, La/d09;

    .line 48
    .line 49
    const/16 v6, 0x1c

    .line 50
    .line 51
    invoke-direct {v2, v1, p1, v4, v6}, La/d09;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 52
    .line 53
    .line 54
    iput-object v4, p0, La/bqb;->k:Ljava/lang/Object;

    .line 55
    .line 56
    iput-boolean v3, p0, La/bqb;->j:Z

    .line 57
    .line 58
    invoke-static {v0, v2, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-ne p0, v5, :cond_2

    .line 63
    .line 64
    move-object v4, v5

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    :goto_1
    return-object v4

    .line 69
    :pswitch_0
    iget-object v0, p0, La/bqb;->k:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, La/kmq;

    .line 72
    .line 73
    sget-object v5, La/wne;->a:La/wne;

    .line 74
    .line 75
    iget-boolean v6, p0, La/bqb;->j:Z

    .line 76
    .line 77
    if-eqz v6, :cond_4

    .line 78
    .line 79
    if-ne v6, v3, :cond_3

    .line 80
    .line 81
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, v1, La/eqb;->h:La/ort;

    .line 93
    .line 94
    invoke-virtual {p1}, La/ort;->b()J

    .line 95
    .line 96
    .line 97
    move-result-wide v1

    .line 98
    new-instance p1, Ljava/lang/Long;

    .line 99
    .line 100
    invoke-direct {p1, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 101
    .line 102
    .line 103
    iput-object v4, p0, La/bqb;->k:Ljava/lang/Object;

    .line 104
    .line 105
    iput-boolean v3, p0, La/bqb;->j:Z

    .line 106
    .line 107
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    if-ne p0, v5, :cond_5

    .line 112
    .line 113
    move-object v4, v5

    .line 114
    goto :goto_3

    .line 115
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    :goto_3
    return-object v4

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
