.class public final La/rn2;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/yn2;


# direct methods
.method public synthetic constructor <init>(La/yn2;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rn2;->i:B

    iput-object p1, p0, La/rn2;->k:La/yn2;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/rn2;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/rn2;->k:La/yn2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/rn2;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/rn2;-><init>(La/yn2;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/rn2;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/rn2;-><init>(La/yn2;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/rn2;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/rn2;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/rn2;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/rn2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/rn2;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/rn2;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/rn2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rn2;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v4, v0, La/rn2;->k:La/yn2;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v1, v4, La/yn2;->Z:La/n0o0;

    .line 15
    .line 16
    sget-object v6, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v7, v0, La/rn2;->j:Z

    .line 19
    .line 20
    if-eqz v7, :cond_1

    .line 21
    .line 22
    if-ne v7, v5, :cond_0

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    move-object/from16 v0, p1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v2, v4, La/yn2;->w:La/j3c;

    .line 39
    .line 40
    iput-boolean v5, v0, La/rn2;->j:Z

    .line 41
    .line 42
    invoke-virtual {v2, v0}, La/j3c;->c(La/yje;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-ne v0, v6, :cond_2

    .line 47
    .line 48
    move-object v2, v6

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    :goto_0
    move-object v11, v0

    .line 51
    check-cast v11, La/wcb;

    .line 52
    .line 53
    iget-object v0, v4, La/yn2;->x:La/lbu;

    .line 54
    .line 55
    invoke-virtual {v0}, La/lbu;->j()Z

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    iget-object v0, v4, La/yn2;->v:La/luu;

    .line 60
    .line 61
    iget-object v0, v0, La/luu;->a:La/nok0;

    .line 62
    .line 63
    invoke-virtual {v0}, La/nok0;->a()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    iget-object v0, v4, La/yn2;->T:La/r9u;

    .line 68
    .line 69
    sget-object v2, La/ygp;->t:La/ygp;

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 80
    .line 81
    invoke-virtual {v0, v2}, La/m1q0;->d(La/ygp;)Z

    .line 82
    .line 83
    .line 84
    move-result v13

    .line 85
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, La/sff0;

    .line 90
    .line 91
    iget-object v0, v0, La/sff0;->g:La/mum0;

    .line 92
    .line 93
    iget-object v6, v0, La/mum0;->y:La/v5l0;

    .line 94
    .line 95
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/sff0;

    .line 100
    .line 101
    iget-boolean v7, v0, La/sff0;->J:Z

    .line 102
    .line 103
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, La/sff0;

    .line 108
    .line 109
    iget-boolean v8, v0, La/sff0;->J1:Z

    .line 110
    .line 111
    iget-object v10, v4, La/yn2;->K:La/y78;

    .line 112
    .line 113
    new-instance v20, La/ym2;

    .line 114
    .line 115
    move-object/from16 v5, v20

    .line 116
    .line 117
    invoke-direct/range {v5 .. v13}, La/ym2;-><init>(La/v5l0;ZZZLa/y78;La/wcb;Ljava/util/List;Z)V

    .line 118
    .line 119
    .line 120
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 121
    .line 122
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 123
    .line 124
    :cond_3
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-object v14, v0

    .line 132
    check-cast v14, La/xm2;

    .line 133
    .line 134
    const/16 v26, 0x0

    .line 135
    .line 136
    const v27, 0x3fbff

    .line 137
    .line 138
    .line 139
    const/4 v15, 0x0

    .line 140
    const/16 v16, 0x0

    .line 141
    .line 142
    const/16 v17, 0x0

    .line 143
    .line 144
    const/16 v18, 0x0

    .line 145
    .line 146
    const/16 v19, 0x0

    .line 147
    .line 148
    const/16 v21, 0x0

    .line 149
    .line 150
    const/16 v22, 0x0

    .line 151
    .line 152
    const/16 v23, 0x0

    .line 153
    .line 154
    const/16 v24, 0x0

    .line 155
    .line 156
    const/16 v25, 0x0

    .line 157
    .line 158
    invoke-static/range {v14 .. v27}, La/xm2;->a(La/xm2;ZZZLjava/util/List;Ljava/util/List;La/ym2;ZZZZZZI)La/xm2;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_3

    .line 167
    .line 168
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    :goto_1
    return-object v2

    .line 171
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 172
    .line 173
    iget-boolean v6, v0, La/rn2;->j:Z

    .line 174
    .line 175
    if-eqz v6, :cond_5

    .line 176
    .line 177
    if-ne v6, v5, :cond_4

    .line 178
    .line 179
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_4
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    iget-object v2, v4, La/yn2;->X:La/hjd;

    .line 191
    .line 192
    new-instance v3, La/cid;

    .line 193
    .line 194
    sget-object v4, La/y1p;->b:La/y1p;

    .line 195
    .line 196
    new-instance v4, La/yq2;

    .line 197
    .line 198
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 199
    .line 200
    .line 201
    const-string v6, "bet_favor_viewed"

    .line 202
    .line 203
    invoke-direct {v3, v6, v4}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 204
    .line 205
    .line 206
    iput-boolean v5, v0, La/rn2;->j:Z

    .line 207
    .line 208
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v3, v0}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    if-ne v0, v1, :cond_6

    .line 216
    .line 217
    move-object v2, v1

    .line 218
    goto :goto_3

    .line 219
    :cond_6
    :goto_2
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    :goto_3
    return-object v2

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
