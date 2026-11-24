.class public final La/lzs;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/wzs;


# direct methods
.method public synthetic constructor <init>(La/wzs;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/lzs;->i:B

    iput-object p1, p0, La/lzs;->k:La/wzs;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/lzs;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/lzs;

    .line 7
    .line 8
    iget-object p0, p0, La/lzs;->k:La/wzs;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/lzs;-><init>(La/wzs;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/lzs;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/lzs;

    .line 18
    .line 19
    iget-object p0, p0, La/lzs;->k:La/wzs;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, p2, v1}, La/lzs;-><init>(La/wzs;La/yje;B)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/lzs;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/lzs;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/m2c0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/lzs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/lzs;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/lzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/lzs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/lzs;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/lzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lzs;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/lzs;->k:La/wzs;

    .line 6
    .line 7
    iget-object v0, v0, La/lzs;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v0, La/m2c0;

    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v2, La/wzs;->u:La/p7m0;

    .line 20
    .line 21
    iget-object v3, v2, La/wzs;->u:La/p7m0;

    .line 22
    .line 23
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, La/czs;

    .line 28
    .line 29
    iget-boolean v1, v1, La/czs;->l:Z

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_0
    iget-object v1, v2, La/wzs;->k:La/iqt;

    .line 38
    .line 39
    iget-object v1, v1, La/iqt;->a:La/gst0;

    .line 40
    .line 41
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_1

    .line 46
    .line 47
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    goto/16 :goto_3

    .line 50
    .line 51
    :cond_1
    iget-object v1, v0, La/m2c0;->k:La/jqt0;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    const/4 v4, 0x1

    .line 60
    if-eq v1, v4, :cond_2

    .line 61
    .line 62
    sget-object v0, La/hl90;->a:La/hl90;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    iget-object v0, v0, La/m2c0;->Z:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_3

    .line 72
    .line 73
    sget-object v0, La/hl90;->b:La/hl90;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    sget-object v0, La/hl90;->c:La/hl90;

    .line 77
    .line 78
    :goto_0
    sget-object v1, La/hl90;->b:La/hl90;

    .line 79
    .line 80
    if-eq v0, v1, :cond_6

    .line 81
    .line 82
    sget-object v1, La/hl90;->c:La/hl90;

    .line 83
    .line 84
    if-ne v0, v1, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    invoke-virtual {v2}, La/wzs;->z()V

    .line 88
    .line 89
    .line 90
    iget-object v0, v2, La/wzs;->p:La/psc;

    .line 91
    .line 92
    invoke-virtual {v0}, La/psc;->n()V

    .line 93
    .line 94
    .line 95
    :cond_5
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    move-object v4, v0

    .line 100
    check-cast v4, La/czs;

    .line 101
    .line 102
    const/16 v20, 0x0

    .line 103
    .line 104
    const v21, 0xf39f

    .line 105
    .line 106
    .line 107
    const-wide/16 v5, 0x0

    .line 108
    .line 109
    const-wide/16 v7, 0x0

    .line 110
    .line 111
    const/4 v9, 0x0

    .line 112
    const-wide/16 v10, 0x0

    .line 113
    .line 114
    const/4 v12, 0x0

    .line 115
    const/4 v13, 0x1

    .line 116
    const/4 v14, 0x0

    .line 117
    const/4 v15, 0x0

    .line 118
    const/16 v16, 0x0

    .line 119
    .line 120
    const/16 v17, 0x0

    .line 121
    .line 122
    const/16 v18, 0x0

    .line 123
    .line 124
    const/16 v19, 0x0

    .line 125
    .line 126
    invoke-static/range {v4 .. v21}, La/czs;->a(La/czs;JJLjava/lang/String;JLjava/lang/String;ZZZZZZZLjava/lang/String;I)La/czs;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v3, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_5

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_6
    :goto_1
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    move-object v4, v0

    .line 142
    check-cast v4, La/czs;

    .line 143
    .line 144
    const/16 v20, 0x0

    .line 145
    .line 146
    const v21, 0xf7ff

    .line 147
    .line 148
    .line 149
    const-wide/16 v5, 0x0

    .line 150
    .line 151
    const-wide/16 v7, 0x0

    .line 152
    .line 153
    const/4 v9, 0x0

    .line 154
    const-wide/16 v10, 0x0

    .line 155
    .line 156
    const/4 v12, 0x0

    .line 157
    const/4 v13, 0x0

    .line 158
    const/4 v14, 0x0

    .line 159
    const/4 v15, 0x0

    .line 160
    const/16 v16, 0x0

    .line 161
    .line 162
    const/16 v17, 0x0

    .line 163
    .line 164
    const/16 v18, 0x1

    .line 165
    .line 166
    const/16 v19, 0x0

    .line 167
    .line 168
    invoke-static/range {v4 .. v21}, La/czs;->a(La/czs;JJLjava/lang/String;JLjava/lang/String;ZZZZZZZLjava/lang/String;I)La/czs;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v3, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_6

    .line 177
    .line 178
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    check-cast v0, La/czs;

    .line 183
    .line 184
    iget-boolean v0, v0, La/czs;->g:Z

    .line 185
    .line 186
    if-eqz v0, :cond_7

    .line 187
    .line 188
    iget-object v0, v2, La/wzs;->i:La/ljf0;

    .line 189
    .line 190
    iget-object v0, v0, La/ljf0;->a:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v0, La/neu0;

    .line 193
    .line 194
    iget-object v0, v0, La/neu0;->a:La/meu0;

    .line 195
    .line 196
    invoke-virtual {v0}, La/meu0;->a()V

    .line 197
    .line 198
    .line 199
    :cond_7
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    :goto_3
    return-object v0

    .line 202
    :pswitch_0
    check-cast v0, La/kmq;

    .line 203
    .line 204
    sget-object v1, La/wne;->a:La/wne;

    .line 205
    .line 206
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    iget-object v1, v2, La/wzs;->f:La/a5v;

    .line 210
    .line 211
    iget-object v1, v1, La/a5v;->a:La/btr;

    .line 212
    .line 213
    iget-object v1, v1, La/btr;->c:La/nhv0;

    .line 214
    .line 215
    iget-object v1, v1, La/nhv0;->a:La/p7m0;

    .line 216
    .line 217
    new-instance v3, La/i89;

    .line 218
    .line 219
    const/16 v4, 0x16

    .line 220
    .line 221
    invoke-direct {v3, v1, v4}, La/i89;-><init>(La/gmq;B)V

    .line 222
    .line 223
    .line 224
    new-instance v1, La/g6g;

    .line 225
    .line 226
    const/4 v4, 0x0

    .line 227
    const/16 v5, 0x18

    .line 228
    .line 229
    invoke-direct {v1, v2, v0, v4, v5}, La/g6g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 230
    .line 231
    .line 232
    new-instance v0, La/fnq;

    .line 233
    .line 234
    const/4 v4, 0x4

    .line 235
    invoke-direct {v0, v3, v1, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 236
    .line 237
    .line 238
    sget-object v1, La/kzs;->h:La/kzs;

    .line 239
    .line 240
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-static {v0, v2, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 245
    .line 246
    .line 247
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 248
    .line 249
    return-object v0

    .line 250
    nop

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
