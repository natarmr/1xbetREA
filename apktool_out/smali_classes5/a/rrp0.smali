.class public final La/rrp0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/urp0;


# direct methods
.method public synthetic constructor <init>(La/urp0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rrp0;->i:B

    iput-object p1, p0, La/rrp0;->k:La/urp0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/rrp0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/rrp0;->k:La/urp0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/rrp0;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/rrp0;-><init>(La/urp0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/rrp0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/rrp0;-><init>(La/urp0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/rrp0;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/rrp0;-><init>(La/urp0;La/yje;B)V

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
    iget-byte v0, p0, La/rrp0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/rrp0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/rrp0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/rrp0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/rrp0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/rrp0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/rrp0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/rrp0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/rrp0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/rrp0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget-byte v0, p0, La/rrp0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    sget-object v2, La/h660;->a:La/h660;

    .line 5
    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, p0, La/rrp0;->k:La/urp0;

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v7, p0, La/rrp0;->j:Z

    .line 18
    .line 19
    if-eqz v7, :cond_1

    .line 20
    .line 21
    if-ne v7, v4, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, v5, La/urp0;->f:La/m1e;

    .line 35
    .line 36
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance v3, La/din0;

    .line 41
    .line 42
    const/4 v7, 0x3

    .line 43
    invoke-direct {v3, v5, v6, v7}, La/din0;-><init>(La/diu0;La/yje;B)V

    .line 44
    .line 45
    .line 46
    iput-boolean v4, p0, La/rrp0;->j:Z

    .line 47
    .line 48
    new-instance v4, La/vnq;

    .line 49
    .line 50
    invoke-direct {v4, v2, v3, v1}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v4, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-ne p0, v0, :cond_2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    :goto_0
    if-ne p0, v0, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    :goto_1
    if-ne p0, v0, :cond_4

    .line 68
    .line 69
    move-object v6, v0

    .line 70
    goto :goto_3

    .line 71
    :cond_4
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    :goto_3
    return-object v6

    .line 74
    :pswitch_0
    iget-object v0, v5, La/urp0;->b:La/vzg0;

    .line 75
    .line 76
    sget-object v1, La/wne;->a:La/wne;

    .line 77
    .line 78
    iget-boolean v2, p0, La/rrp0;->j:Z

    .line 79
    .line 80
    if-eqz v2, :cond_6

    .line 81
    .line 82
    if-ne v2, v4, :cond_5

    .line 83
    .line 84
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto :goto_6

    .line 92
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, v5, La/urp0;->j:La/nyu;

    .line 96
    .line 97
    iget v2, v5, La/urp0;->d:I

    .line 98
    .line 99
    invoke-virtual {p1, v2}, La/nyu;->a(I)La/p6d;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iput-boolean v4, p0, La/rrp0;->j:Z

    .line 104
    .line 105
    invoke-static {p1, p0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-ne p1, v1, :cond_7

    .line 110
    .line 111
    move-object v6, v1

    .line 112
    goto :goto_6

    .line 113
    :cond_7
    :goto_4
    check-cast p1, Ljava/lang/Iterable;

    .line 114
    .line 115
    new-instance p0, Ljava/util/ArrayList;

    .line 116
    .line 117
    const/16 v1, 0xa

    .line 118
    .line 119
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_8

    .line 135
    .line 136
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, La/rfp0;

    .line 141
    .line 142
    iget v1, v1, La/rfp0;->b:I

    .line 143
    .line 144
    new-instance v2, Ljava/lang/Integer;

    .line 145
    .line 146
    invoke-direct {v2, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_8
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    const-string p1, "INITIAL_SELECTED_IDS"

    .line 158
    .line 159
    invoke-virtual {v0, p1, p0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    new-instance p1, La/crp0;

    .line 163
    .line 164
    invoke-direct {p1, p0}, La/crp0;-><init>(Ljava/util/Set;)V

    .line 165
    .line 166
    .line 167
    const-string p0, "SELECTED_IDS"

    .line 168
    .line 169
    invoke-virtual {v0, p0, p1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    :goto_6
    return-object v6

    .line 175
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 176
    .line 177
    iget-boolean v7, p0, La/rrp0;->j:Z

    .line 178
    .line 179
    if-eqz v7, :cond_a

    .line 180
    .line 181
    if-ne v7, v4, :cond_9

    .line 182
    .line 183
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    goto :goto_9

    .line 187
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    goto :goto_a

    .line 191
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    iget-object p1, v5, La/urp0;->s:La/xae0;

    .line 195
    .line 196
    new-instance v3, La/qrp0;

    .line 197
    .line 198
    const/4 v7, 0x0

    .line 199
    invoke-direct {v3, v5, v6, v7}, La/qrp0;-><init>(La/urp0;La/yje;B)V

    .line 200
    .line 201
    .line 202
    iput-boolean v4, p0, La/rrp0;->j:Z

    .line 203
    .line 204
    new-instance v4, La/vnq;

    .line 205
    .line 206
    invoke-direct {v4, v2, v3, v1}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 207
    .line 208
    .line 209
    iget-object p1, p1, La/xae0;->a:La/n7m0;

    .line 210
    .line 211
    invoke-interface {p1, v4, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    if-ne p0, v0, :cond_b

    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    :goto_7
    if-ne p0, v0, :cond_c

    .line 221
    .line 222
    goto :goto_8

    .line 223
    :cond_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    :goto_8
    if-ne p0, v0, :cond_d

    .line 226
    .line 227
    move-object v6, v0

    .line 228
    goto :goto_a

    .line 229
    :cond_d
    :goto_9
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    :goto_a
    return-object v6

    .line 232
    nop

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
