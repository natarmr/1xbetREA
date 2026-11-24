.class public final La/ui70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:D

.field public k:La/gxo;

.field public l:Z

.field public final synthetic m:La/gxo;

.field public final synthetic n:D

.field public o:La/w46;

.field public final synthetic p:La/w46;


# direct methods
.method public synthetic constructor <init>(La/w46;La/gxo;DLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/ui70;->i:B

    iput-object p1, p0, La/ui70;->p:La/w46;

    iput-object p2, p0, La/ui70;->m:La/gxo;

    iput-wide p3, p0, La/ui70;->n:D

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte p1, p0, La/ui70;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/ui70;->p:La/w46;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, La/ui70;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, La/ol70;

    .line 12
    .line 13
    iget-wide v4, p0, La/ui70;->n:D

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    iget-object v3, p0, La/ui70;->m:La/gxo;

    .line 17
    .line 18
    move-object v6, p2

    .line 19
    invoke-direct/range {v1 .. v7}, La/ui70;-><init>(La/w46;La/gxo;DLa/yje;B)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :pswitch_0
    move-object v6, p2

    .line 24
    new-instance v2, La/ui70;

    .line 25
    .line 26
    move-object v3, v0

    .line 27
    check-cast v3, La/vi70;

    .line 28
    .line 29
    move-object v7, v6

    .line 30
    iget-wide v5, p0, La/ui70;->n:D

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    iget-object v4, p0, La/ui70;->m:La/gxo;

    .line 34
    .line 35
    invoke-direct/range {v2 .. v8}, La/ui70;-><init>(La/w46;La/gxo;DLa/yje;B)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ui70;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ui70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ui70;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ui70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ui70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ui70;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ui70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 11

    .line 1
    iget-byte v0, p0, La/ui70;->i:B

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    iget-wide v3, p0, La/ui70;->n:D

    .line 6
    .line 7
    iget-object v5, p0, La/ui70;->m:La/gxo;

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v8, 0x1

    .line 13
    iget-object v9, p0, La/ui70;->p:La/w46;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v9, La/ol70;

    .line 19
    .line 20
    sget-object v0, La/wne;->a:La/wne;

    .line 21
    .line 22
    iget-boolean v10, p0, La/ui70;->l:Z

    .line 23
    .line 24
    if-eqz v10, :cond_1

    .line 25
    .line 26
    if-ne v10, v8, :cond_0

    .line 27
    .line 28
    iget-wide v0, p0, La/ui70;->j:D

    .line 29
    .line 30
    iget-object v5, p0, La/ui70;->k:La/gxo;

    .line 31
    .line 32
    iget-object p0, p0, La/ui70;->o:La/w46;

    .line 33
    .line 34
    move-object v9, p0

    .line 35
    check-cast v9, La/ol70;

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, v9, La/ol70;->c:La/l1u;

    .line 49
    .line 50
    invoke-virtual {p1}, La/l1u;->a()D

    .line 51
    .line 52
    .line 53
    move-result-wide v6

    .line 54
    cmpl-double p1, v3, v1

    .line 55
    .line 56
    if-lez p1, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move-wide v3, v6

    .line 60
    :goto_0
    iget-object p1, v9, La/ol70;->n:La/t0u;

    .line 61
    .line 62
    iput-object v9, p0, La/ui70;->o:La/w46;

    .line 63
    .line 64
    iput-object v5, p0, La/ui70;->k:La/gxo;

    .line 65
    .line 66
    iput-wide v3, p0, La/ui70;->j:D

    .line 67
    .line 68
    iput-boolean v8, p0, La/ui70;->l:Z

    .line 69
    .line 70
    invoke-virtual {p1, p0}, La/t0u;->a(La/yje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v0, :cond_3

    .line 75
    .line 76
    move-object v6, v0

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    move-wide v0, v3

    .line 79
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 80
    .line 81
    new-instance p0, La/jl70;

    .line 82
    .line 83
    invoke-direct {p0, v5, v0, v1, p1}, La/jl70;-><init>(La/gxo;DLjava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v9, p0}, La/ol70;->z(La/ll70;)V

    .line 87
    .line 88
    .line 89
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    :goto_2
    return-object v6

    .line 92
    :pswitch_0
    check-cast v9, La/vi70;

    .line 93
    .line 94
    sget-object v0, La/wne;->a:La/wne;

    .line 95
    .line 96
    iget-boolean v10, p0, La/ui70;->l:Z

    .line 97
    .line 98
    if-eqz v10, :cond_5

    .line 99
    .line 100
    if-ne v10, v8, :cond_4

    .line 101
    .line 102
    iget-wide v0, p0, La/ui70;->j:D

    .line 103
    .line 104
    iget-object v5, p0, La/ui70;->k:La/gxo;

    .line 105
    .line 106
    iget-object p0, p0, La/ui70;->o:La/w46;

    .line 107
    .line 108
    move-object v9, p0

    .line 109
    check-cast v9, La/vi70;

    .line 110
    .line 111
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_4
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget-object p1, v9, La/vi70;->d:La/l1u;

    .line 123
    .line 124
    invoke-virtual {p1}, La/l1u;->a()D

    .line 125
    .line 126
    .line 127
    move-result-wide v6

    .line 128
    cmpl-double p1, v3, v1

    .line 129
    .line 130
    if-lez p1, :cond_6

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_6
    move-wide v3, v6

    .line 134
    :goto_3
    iget-object p1, v9, La/vi70;->k:La/t0u;

    .line 135
    .line 136
    iput-object v9, p0, La/ui70;->o:La/w46;

    .line 137
    .line 138
    iput-object v5, p0, La/ui70;->k:La/gxo;

    .line 139
    .line 140
    iput-wide v3, p0, La/ui70;->j:D

    .line 141
    .line 142
    iput-boolean v8, p0, La/ui70;->l:Z

    .line 143
    .line 144
    invoke-virtual {p1, p0}, La/t0u;->a(La/yje;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-ne p1, v0, :cond_7

    .line 149
    .line 150
    move-object v6, v0

    .line 151
    goto :goto_5

    .line 152
    :cond_7
    move-wide v0, v3

    .line 153
    :goto_4
    check-cast p1, Ljava/lang/String;

    .line 154
    .line 155
    new-instance p0, La/qi70;

    .line 156
    .line 157
    invoke-direct {p0, v5, v0, v1, p1}, La/qi70;-><init>(La/gxo;DLjava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v9, p0}, La/vi70;->x(La/si70;)V

    .line 161
    .line 162
    .line 163
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    :goto_5
    return-object v6

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
