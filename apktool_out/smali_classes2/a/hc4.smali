.class public final La/hc4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:I

.field public final synthetic l:Z

.field public m:La/i3t0;

.field public final synthetic n:La/i3t0;


# direct methods
.method public synthetic constructor <init>(La/i3t0;IZLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/hc4;->i:B

    iput-object p1, p0, La/hc4;->n:La/i3t0;

    iput p2, p0, La/hc4;->k:I

    iput-boolean p3, p0, La/hc4;->l:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte v0, p0, La/hc4;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/hc4;->n:La/i3t0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/hc4;

    .line 9
    .line 10
    move-object v3, v1

    .line 11
    check-cast v3, La/hk4;

    .line 12
    .line 13
    iget-boolean v5, p0, La/hc4;->l:Z

    .line 14
    .line 15
    const/4 v7, 0x2

    .line 16
    iget v4, p0, La/hc4;->k:I

    .line 17
    .line 18
    move-object v6, p1

    .line 19
    invoke-direct/range {v2 .. v7}, La/hc4;-><init>(La/i3t0;IZLa/yje;B)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :pswitch_0
    move-object v7, p1

    .line 24
    new-instance v3, La/hc4;

    .line 25
    .line 26
    move-object v4, v1

    .line 27
    check-cast v4, La/fh4;

    .line 28
    .line 29
    iget-boolean v6, p0, La/hc4;->l:Z

    .line 30
    .line 31
    const/4 v8, 0x1

    .line 32
    iget v5, p0, La/hc4;->k:I

    .line 33
    .line 34
    invoke-direct/range {v3 .. v8}, La/hc4;-><init>(La/i3t0;IZLa/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object v3

    .line 38
    :pswitch_1
    move-object v7, p1

    .line 39
    new-instance v3, La/hc4;

    .line 40
    .line 41
    move-object v4, v1

    .line 42
    check-cast v4, La/kc4;

    .line 43
    .line 44
    iget-boolean v6, p0, La/hc4;->l:Z

    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    iget v5, p0, La/hc4;->k:I

    .line 48
    .line 49
    invoke-direct/range {v3 .. v8}, La/hc4;-><init>(La/i3t0;IZLa/yje;B)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/hc4;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/hc4;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/hc4;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/hc4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/hc4;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/hc4;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/hc4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/hc4;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/hc4;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/hc4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/hc4;->i:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    iget-boolean v2, p0, La/hc4;->l:Z

    .line 5
    .line 6
    iget v3, p0, La/hc4;->k:I

    .line 7
    .line 8
    const-string v4, ""

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    iget-object v7, p0, La/hc4;->n:La/i3t0;

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v7, La/hk4;

    .line 20
    .line 21
    sget-object v0, La/wne;->a:La/wne;

    .line 22
    .line 23
    iget-boolean v9, p0, La/hc4;->j:Z

    .line 24
    .line 25
    if-eqz v9, :cond_1

    .line 26
    .line 27
    if-ne v9, v8, :cond_0

    .line 28
    .line 29
    iget-object p0, p0, La/hc4;->m:La/i3t0;

    .line 30
    .line 31
    move-object v7, p0

    .line 32
    check-cast v7, La/hk4;

    .line 33
    .line 34
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget p1, La/hk4;->b0:I

    .line 46
    .line 47
    new-instance p1, La/zj4;

    .line 48
    .line 49
    invoke-direct {p1, v4, v7, v8}, La/zj4;-><init>(Ljava/lang/String;La/hk4;B)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v7, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, v7, La/hk4;->u:La/rpt;

    .line 56
    .line 57
    iput-object v7, p0, La/hc4;->m:La/i3t0;

    .line 58
    .line 59
    iput-boolean v8, p0, La/hc4;->j:Z

    .line 60
    .line 61
    invoke-virtual {p1, v3, p0}, La/rpt;->h(ILa/yje;)Ljava/io/Serializable;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v0, :cond_2

    .line 66
    .line 67
    move-object v5, v0

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    :goto_0
    check-cast p1, La/qkt;

    .line 70
    .line 71
    sget p0, La/hk4;->b0:I

    .line 72
    .line 73
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance p0, La/rb4;

    .line 77
    .line 78
    invoke-direct {p0, p1, v2, v1}, La/rb4;-><init>(La/qkt;ZB)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v7, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 82
    .line 83
    .line 84
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    :goto_1
    return-object v5

    .line 87
    :pswitch_0
    check-cast v7, La/fh4;

    .line 88
    .line 89
    sget-object v0, La/wne;->a:La/wne;

    .line 90
    .line 91
    iget-boolean v9, p0, La/hc4;->j:Z

    .line 92
    .line 93
    if-eqz v9, :cond_4

    .line 94
    .line 95
    if-ne v9, v8, :cond_3

    .line 96
    .line 97
    iget-object p0, p0, La/hc4;->m:La/i3t0;

    .line 98
    .line 99
    move-object v7, p0

    .line 100
    check-cast v7, La/fh4;

    .line 101
    .line 102
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    sget p1, La/fh4;->c0:I

    .line 114
    .line 115
    new-instance p1, La/sg4;

    .line 116
    .line 117
    invoke-direct {p1, v4, v7, v1}, La/sg4;-><init>(Ljava/lang/String;La/fh4;B)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v7, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 121
    .line 122
    .line 123
    iget-object p1, v7, La/fh4;->v:La/rpt;

    .line 124
    .line 125
    iput-object v7, p0, La/hc4;->m:La/i3t0;

    .line 126
    .line 127
    iput-boolean v8, p0, La/hc4;->j:Z

    .line 128
    .line 129
    invoke-virtual {p1, v3, p0}, La/rpt;->h(ILa/yje;)Ljava/io/Serializable;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    if-ne p1, v0, :cond_5

    .line 134
    .line 135
    move-object v5, v0

    .line 136
    goto :goto_3

    .line 137
    :cond_5
    :goto_2
    check-cast p1, La/qkt;

    .line 138
    .line 139
    sget p0, La/fh4;->c0:I

    .line 140
    .line 141
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    new-instance p0, La/rb4;

    .line 145
    .line 146
    invoke-direct {p0, p1, v2, v8}, La/rb4;-><init>(La/qkt;ZB)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v7, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 150
    .line 151
    .line 152
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    :goto_3
    return-object v5

    .line 155
    :pswitch_1
    check-cast v7, La/kc4;

    .line 156
    .line 157
    sget-object v0, La/wne;->a:La/wne;

    .line 158
    .line 159
    iget-boolean v1, p0, La/hc4;->j:Z

    .line 160
    .line 161
    if-eqz v1, :cond_7

    .line 162
    .line 163
    if-ne v1, v8, :cond_6

    .line 164
    .line 165
    iget-object p0, p0, La/hc4;->m:La/i3t0;

    .line 166
    .line 167
    move-object v7, p0

    .line 168
    check-cast v7, La/kc4;

    .line 169
    .line 170
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_6
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    sget p1, La/kc4;->Y:I

    .line 182
    .line 183
    new-instance p1, La/xb4;

    .line 184
    .line 185
    invoke-direct {p1, v4, v7, v8}, La/xb4;-><init>(Ljava/lang/String;La/kc4;B)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v7, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 189
    .line 190
    .line 191
    iget-object p1, v7, La/kc4;->w:La/rpt;

    .line 192
    .line 193
    iput-object v7, p0, La/hc4;->m:La/i3t0;

    .line 194
    .line 195
    iput-boolean v8, p0, La/hc4;->j:Z

    .line 196
    .line 197
    invoke-virtual {p1, v3, p0}, La/rpt;->h(ILa/yje;)Ljava/io/Serializable;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    if-ne p1, v0, :cond_8

    .line 202
    .line 203
    move-object v5, v0

    .line 204
    goto :goto_5

    .line 205
    :cond_8
    :goto_4
    check-cast p1, La/qkt;

    .line 206
    .line 207
    sget p0, La/kc4;->Y:I

    .line 208
    .line 209
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    new-instance p0, La/rb4;

    .line 213
    .line 214
    const/4 v0, 0x0

    .line 215
    invoke-direct {p0, p1, v2, v0}, La/rb4;-><init>(La/qkt;ZB)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v7, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 219
    .line 220
    .line 221
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    :goto_5
    return-object v5

    .line 224
    nop

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
