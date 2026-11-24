.class public final La/ekc0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/gkc0;


# direct methods
.method public synthetic constructor <init>(La/gkc0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ekc0;->i:B

    iput-object p1, p0, La/ekc0;->k:La/gkc0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/ekc0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ekc0;->k:La/gkc0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/ekc0;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/ekc0;-><init>(La/gkc0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/ekc0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/ekc0;-><init>(La/gkc0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/ekc0;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/ekc0;-><init>(La/gkc0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ekc0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ekc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ekc0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ekc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ekc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ekc0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ekc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/ekc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/ekc0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/ekc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/ekc0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/ekc0;->k:La/gkc0;

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
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/ekc0;->j:Z

    .line 15
    .line 16
    const/4 v6, 0x2

    .line 17
    if-eqz v5, :cond_1

    .line 18
    .line 19
    if-ne v5, v3, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_4

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v2, La/gkc0;->l:La/ddu;

    .line 33
    .line 34
    filled-new-array {v6}, [I

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iput-boolean v3, p0, La/ekc0;->j:Z

    .line 39
    .line 40
    invoke-virtual {p1, v1, p0}, La/ddu;->a([ILa/bnn0;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-ne p1, v0, :cond_2

    .line 45
    .line 46
    move-object v4, v0

    .line 47
    goto :goto_4

    .line 48
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Iterable;

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_4

    .line 59
    .line 60
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    move-object v0, p1

    .line 65
    check-cast v0, La/uq60;

    .line 66
    .line 67
    iget v0, v0, La/uq60;->a:I

    .line 68
    .line 69
    if-ne v0, v6, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    move-object p1, v4

    .line 73
    :goto_1
    check-cast p1, La/uq60;

    .line 74
    .line 75
    if-eqz p1, :cond_5

    .line 76
    .line 77
    iget-object v4, p1, La/uq60;->b:La/vpv0;

    .line 78
    .line 79
    :cond_5
    if-nez v4, :cond_6

    .line 80
    .line 81
    const/4 p0, -0x1

    .line 82
    goto :goto_2

    .line 83
    :cond_6
    sget-object p0, La/fkc0;->a:[I

    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    aget p0, p0, p1

    .line 90
    .line 91
    :goto_2
    if-eq p0, v3, :cond_8

    .line 92
    .line 93
    if-eq p0, v6, :cond_7

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_7
    iget-object p0, v2, La/gkc0;->q:La/ol60;

    .line 97
    .line 98
    sget-object p1, La/zjc0;->a:La/zjc0;

    .line 99
    .line 100
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_8
    iget-object p0, v2, La/gkc0;->q:La/ol60;

    .line 105
    .line 106
    new-instance p1, La/akc0;

    .line 107
    .line 108
    iget-object v0, v2, La/gkc0;->k:La/s470;

    .line 109
    .line 110
    invoke-virtual {v0}, La/s470;->a()J

    .line 111
    .line 112
    .line 113
    move-result-wide v0

    .line 114
    invoke-direct {p1, v0, v1}, La/akc0;-><init>(J)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    :goto_4
    return-object v4

    .line 123
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 124
    .line 125
    iget-boolean v5, p0, La/ekc0;->j:Z

    .line 126
    .line 127
    if-eqz v5, :cond_a

    .line 128
    .line 129
    if-ne v5, v3, :cond_9

    .line 130
    .line 131
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_9
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    goto :goto_6

    .line 139
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    iget-object p1, v2, La/gkc0;->e:La/m1e;

    .line 143
    .line 144
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    new-instance v1, La/dkc0;

    .line 149
    .line 150
    invoke-direct {v1, v2, v3}, La/dkc0;-><init>(La/gkc0;B)V

    .line 151
    .line 152
    .line 153
    iput-boolean v3, p0, La/ekc0;->j:Z

    .line 154
    .line 155
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    if-ne p0, v0, :cond_b

    .line 160
    .line 161
    move-object v4, v0

    .line 162
    goto :goto_6

    .line 163
    :cond_b
    :goto_5
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    :goto_6
    return-object v4

    .line 166
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 167
    .line 168
    iget-boolean v5, p0, La/ekc0;->j:Z

    .line 169
    .line 170
    if-eqz v5, :cond_d

    .line 171
    .line 172
    if-ne v5, v3, :cond_c

    .line 173
    .line 174
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_c
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    goto :goto_7

    .line 184
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    iget-object p1, v2, La/gkc0;->c:La/tpx;

    .line 188
    .line 189
    invoke-virtual {p1}, La/tpx;->a()La/qoj0;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    new-instance v1, La/dkc0;

    .line 194
    .line 195
    const/4 v4, 0x0

    .line 196
    invoke-direct {v1, v2, v4}, La/dkc0;-><init>(La/gkc0;B)V

    .line 197
    .line 198
    .line 199
    iput-boolean v3, p0, La/ekc0;->j:Z

    .line 200
    .line 201
    invoke-virtual {p1, v1, p0}, La/qoj0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-object v4, v0

    .line 205
    :goto_7
    return-object v4

    .line 206
    nop

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
