.class public final La/qw7;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/zsf;

.field public k:Z

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/t33;


# direct methods
.method public synthetic constructor <init>(La/t33;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qw7;->i:B

    iput-object p1, p0, La/qw7;->m:La/t33;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qw7;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/qw7;

    .line 7
    .line 8
    iget-object p0, p0, La/qw7;->m:La/t33;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/qw7;-><init>(La/t33;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/qw7;->l:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/qw7;

    .line 18
    .line 19
    iget-object p0, p0, La/qw7;->m:La/t33;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, p2, v1}, La/qw7;-><init>(La/t33;La/yje;B)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/qw7;->l:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/qw7;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/qw7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/qw7;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/qw7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/qw7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/qw7;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/qw7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/qw7;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/qw7;->m:La/t33;

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const v3, 0x3f147ae1    # 0.58f

    .line 8
    .line 9
    .line 10
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, La/qw7;->l:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, La/vne;

    .line 21
    .line 22
    sget-object v8, La/wne;->a:La/wne;

    .line 23
    .line 24
    iget-boolean v9, p0, La/qw7;->k:Z

    .line 25
    .line 26
    if-eqz v9, :cond_1

    .line 27
    .line 28
    if-ne v9, v5, :cond_0

    .line 29
    .line 30
    iget-object v2, p0, La/qw7;->j:La/zsf;

    .line 31
    .line 32
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance p1, La/zsf;

    .line 44
    .line 45
    invoke-direct {p1, v6, v6, v3, v2}, La/zsf;-><init>(FFFF)V

    .line 46
    .line 47
    .line 48
    move-object v2, p1

    .line 49
    :cond_2
    :goto_0
    invoke-static {v0}, La/d5c;->R(La/vne;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    sget-object p1, La/z560;->b:La/z560;

    .line 56
    .line 57
    new-instance v3, La/o73;

    .line 58
    .line 59
    const/4 v4, 0x3

    .line 60
    invoke-direct {v3, v1, v2, v7, v4}, La/o73;-><init>(La/t33;La/zsf;La/yje;B)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, La/qw7;->l:Ljava/lang/Object;

    .line 64
    .line 65
    iput-object v2, p0, La/qw7;->j:La/zsf;

    .line 66
    .line 67
    iput-boolean v5, p0, La/qw7;->k:Z

    .line 68
    .line 69
    invoke-static {p1, v3, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v8, :cond_2

    .line 74
    .line 75
    move-object v7, v8

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    :goto_1
    return-object v7

    .line 80
    :pswitch_0
    iget-object v0, p0, La/qw7;->l:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, La/vne;

    .line 83
    .line 84
    sget-object v8, La/wne;->a:La/wne;

    .line 85
    .line 86
    iget-boolean v9, p0, La/qw7;->k:Z

    .line 87
    .line 88
    if-eqz v9, :cond_5

    .line 89
    .line 90
    if-ne v9, v5, :cond_4

    .line 91
    .line 92
    iget-object v2, p0, La/qw7;->j:La/zsf;

    .line 93
    .line 94
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    new-instance p1, La/zsf;

    .line 106
    .line 107
    invoke-direct {p1, v6, v6, v3, v2}, La/zsf;-><init>(FFFF)V

    .line 108
    .line 109
    .line 110
    move-object v2, p1

    .line 111
    :cond_6
    :goto_2
    invoke-static {v0}, La/d5c;->R(La/vne;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_7

    .line 116
    .line 117
    sget-object p1, La/z560;->b:La/z560;

    .line 118
    .line 119
    new-instance v3, La/o73;

    .line 120
    .line 121
    const/4 v4, 0x2

    .line 122
    invoke-direct {v3, v1, v2, v7, v4}, La/o73;-><init>(La/t33;La/zsf;La/yje;B)V

    .line 123
    .line 124
    .line 125
    iput-object v0, p0, La/qw7;->l:Ljava/lang/Object;

    .line 126
    .line 127
    iput-object v2, p0, La/qw7;->j:La/zsf;

    .line 128
    .line 129
    iput-boolean v5, p0, La/qw7;->k:Z

    .line 130
    .line 131
    invoke-static {p1, v3, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-ne p1, v8, :cond_6

    .line 136
    .line 137
    move-object v7, v8

    .line 138
    goto :goto_3

    .line 139
    :cond_7
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    :goto_3
    return-object v7

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
