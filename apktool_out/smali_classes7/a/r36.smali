.class public final La/r36;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/p36;


# direct methods
.method public synthetic constructor <init>(La/p36;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/r36;->i:B

    iput-object p1, p0, La/r36;->l:La/p36;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/r36;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/r36;->l:La/p36;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/r36;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/r36;-><init>(La/p36;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/r36;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/r36;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/r36;-><init>(La/p36;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/r36;->k:Ljava/lang/Object;

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
    iget-byte v0, p0, La/r36;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/r36;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/r36;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/r36;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/o1d0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/r36;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/r36;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/r36;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    iget-byte v0, p0, La/r36;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/r36;->l:La/p36;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/r36;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/util/List;

    .line 15
    .line 16
    sget-object v5, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v6, p0, La/r36;->j:Z

    .line 19
    .line 20
    if-eqz v6, :cond_1

    .line 21
    .line 22
    if-ne v6, v2, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    new-instance p1, Ljava/lang/Long;

    .line 40
    .line 41
    invoke-direct {p1, v6, v7}, Ljava/lang/Long;-><init>(J)V

    .line 42
    .line 43
    .line 44
    iput-object p1, v3, La/p36;->l:Ljava/lang/Long;

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    sget-object p1, La/c56;->a:La/c56;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    new-instance p1, La/b56;

    .line 56
    .line 57
    invoke-direct {p1, v0}, La/b56;-><init>(Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    iget-object v0, v3, La/p36;->k:La/qoj0;

    .line 61
    .line 62
    iput-object v4, p0, La/r36;->k:Ljava/lang/Object;

    .line 63
    .line 64
    iput-boolean v2, p0, La/r36;->j:Z

    .line 65
    .line 66
    invoke-virtual {v0, p1, p0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-ne p0, v5, :cond_3

    .line 71
    .line 72
    move-object v4, v5

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    :goto_2
    return-object v4

    .line 77
    :pswitch_0
    iget-object v0, p0, La/r36;->k:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, La/o1d0;

    .line 80
    .line 81
    sget-object v5, La/wne;->a:La/wne;

    .line 82
    .line 83
    iget-boolean v6, p0, La/r36;->j:Z

    .line 84
    .line 85
    if-eqz v6, :cond_5

    .line 86
    .line 87
    if-ne v6, v2, :cond_4

    .line 88
    .line 89
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_4
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    instance-of p1, v0, La/n1d0;

    .line 104
    .line 105
    iput-boolean p1, v3, La/p36;->j:Z

    .line 106
    .line 107
    if-eqz p1, :cond_7

    .line 108
    .line 109
    iget-object p1, v3, La/p36;->m:La/bby;

    .line 110
    .line 111
    if-eqz p1, :cond_6

    .line 112
    .line 113
    const-string v1, "PROPHYLAXIS_CANCEL"

    .line 114
    .line 115
    invoke-static {p1, v1}, La/zvw;->G(La/bby;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_6
    iget-object p1, v3, La/p36;->k:La/qoj0;

    .line 119
    .line 120
    new-instance v1, La/e56;

    .line 121
    .line 122
    check-cast v0, La/n1d0;

    .line 123
    .line 124
    iget-wide v6, v0, La/n1d0;->b:J

    .line 125
    .line 126
    iget-wide v8, v0, La/n1d0;->c:J

    .line 127
    .line 128
    invoke-direct {v1, v6, v7, v8, v9}, La/e56;-><init>(JJ)V

    .line 129
    .line 130
    .line 131
    iput-object v4, p0, La/r36;->k:Ljava/lang/Object;

    .line 132
    .line 133
    iput-boolean v2, p0, La/r36;->j:Z

    .line 134
    .line 135
    invoke-virtual {p1, v1, p0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    if-ne p0, v5, :cond_8

    .line 140
    .line 141
    move-object v4, v5

    .line 142
    goto :goto_4

    .line 143
    :cond_7
    invoke-virtual {v3}, La/p36;->g()V

    .line 144
    .line 145
    .line 146
    :cond_8
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    :goto_4
    return-object v4

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
