.class public final La/k2c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a1g;


# direct methods
.method public synthetic constructor <init>(La/a1g;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/k2c;->a:B

    iput-object p1, p0, La/k2c;->b:La/a1g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/k2c;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/k2c;->b:La/a1g;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/high16 v4, -0x80000000

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    instance-of v0, p2, La/egb0;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move-object v0, p2

    .line 19
    check-cast v0, La/egb0;

    .line 20
    .line 21
    iget v6, v0, La/egb0;->j:I

    .line 22
    .line 23
    and-int v7, v6, v4

    .line 24
    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    sub-int/2addr v6, v4

    .line 28
    iput v6, v0, La/egb0;->j:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, La/egb0;

    .line 32
    .line 33
    invoke-direct {v0, p0, p2}, La/egb0;-><init>(La/k2c;La/yje;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object p0, v0, La/egb0;->i:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object p2, La/wne;->a:La/wne;

    .line 39
    .line 40
    iget v4, v0, La/egb0;->j:I

    .line 41
    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance p0, La/hbb0;

    .line 58
    .line 59
    const/4 v2, 0x2

    .line 60
    invoke-direct {p0, p1, v2}, La/hbb0;-><init>(La/kmq;B)V

    .line 61
    .line 62
    .line 63
    iput v5, v0, La/egb0;->j:I

    .line 64
    .line 65
    invoke-virtual {v1, p0, v0}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-ne p0, p2, :cond_3

    .line 70
    .line 71
    move-object v2, p2

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :goto_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    :goto_2
    return-object v2

    .line 76
    :pswitch_0
    instance-of v0, p2, La/zot;

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    move-object v0, p2

    .line 81
    check-cast v0, La/zot;

    .line 82
    .line 83
    iget v6, v0, La/zot;->j:I

    .line 84
    .line 85
    and-int v7, v6, v4

    .line 86
    .line 87
    if-eqz v7, :cond_4

    .line 88
    .line 89
    sub-int/2addr v6, v4

    .line 90
    iput v6, v0, La/zot;->j:I

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_4
    new-instance v0, La/zot;

    .line 94
    .line 95
    invoke-direct {v0, p0, p2}, La/zot;-><init>(La/k2c;La/yje;)V

    .line 96
    .line 97
    .line 98
    :goto_3
    iget-object p0, v0, La/zot;->i:Ljava/lang/Object;

    .line 99
    .line 100
    sget-object p2, La/wne;->a:La/wne;

    .line 101
    .line 102
    iget v4, v0, La/zot;->j:I

    .line 103
    .line 104
    if-eqz v4, :cond_6

    .line 105
    .line 106
    if-ne v4, v5, :cond_5

    .line 107
    .line 108
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    new-instance p0, La/tnt;

    .line 120
    .line 121
    invoke-direct {p0, p1, v5}, La/tnt;-><init>(La/kmq;B)V

    .line 122
    .line 123
    .line 124
    iput v5, v0, La/zot;->j:I

    .line 125
    .line 126
    invoke-virtual {v1, p0, v0}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    if-ne p0, p2, :cond_7

    .line 131
    .line 132
    move-object v2, p2

    .line 133
    goto :goto_5

    .line 134
    :cond_7
    :goto_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    :goto_5
    return-object v2

    .line 137
    :pswitch_1
    instance-of v0, p2, La/jbf;

    .line 138
    .line 139
    if-eqz v0, :cond_8

    .line 140
    .line 141
    move-object v0, p2

    .line 142
    check-cast v0, La/jbf;

    .line 143
    .line 144
    iget v6, v0, La/jbf;->j:I

    .line 145
    .line 146
    and-int v7, v6, v4

    .line 147
    .line 148
    if-eqz v7, :cond_8

    .line 149
    .line 150
    sub-int/2addr v6, v4

    .line 151
    iput v6, v0, La/jbf;->j:I

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_8
    new-instance v0, La/jbf;

    .line 155
    .line 156
    invoke-direct {v0, p0, p2}, La/jbf;-><init>(La/k2c;La/yje;)V

    .line 157
    .line 158
    .line 159
    :goto_6
    iget-object p0, v0, La/jbf;->i:Ljava/lang/Object;

    .line 160
    .line 161
    sget-object p2, La/wne;->a:La/wne;

    .line 162
    .line 163
    iget v4, v0, La/jbf;->j:I

    .line 164
    .line 165
    if-eqz v4, :cond_a

    .line 166
    .line 167
    if-ne v4, v5, :cond_9

    .line 168
    .line 169
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    goto :goto_8

    .line 177
    :cond_a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    new-instance p0, La/k0f;

    .line 181
    .line 182
    const/4 v2, 0x4

    .line 183
    invoke-direct {p0, p1, v2}, La/k0f;-><init>(La/kmq;B)V

    .line 184
    .line 185
    .line 186
    iput v5, v0, La/jbf;->j:I

    .line 187
    .line 188
    invoke-virtual {v1, p0, v0}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    if-ne p0, p2, :cond_b

    .line 193
    .line 194
    move-object v2, p2

    .line 195
    goto :goto_8

    .line 196
    :cond_b
    :goto_7
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    :goto_8
    return-object v2

    .line 199
    :pswitch_2
    instance-of v0, p2, La/i2c;

    .line 200
    .line 201
    if-eqz v0, :cond_c

    .line 202
    .line 203
    move-object v0, p2

    .line 204
    check-cast v0, La/i2c;

    .line 205
    .line 206
    iget v6, v0, La/i2c;->j:I

    .line 207
    .line 208
    and-int v7, v6, v4

    .line 209
    .line 210
    if-eqz v7, :cond_c

    .line 211
    .line 212
    sub-int/2addr v6, v4

    .line 213
    iput v6, v0, La/i2c;->j:I

    .line 214
    .line 215
    goto :goto_9

    .line 216
    :cond_c
    new-instance v0, La/i2c;

    .line 217
    .line 218
    invoke-direct {v0, p0, p2}, La/i2c;-><init>(La/k2c;La/yje;)V

    .line 219
    .line 220
    .line 221
    :goto_9
    iget-object p0, v0, La/i2c;->i:Ljava/lang/Object;

    .line 222
    .line 223
    sget-object p2, La/wne;->a:La/wne;

    .line 224
    .line 225
    iget v4, v0, La/i2c;->j:I

    .line 226
    .line 227
    if-eqz v4, :cond_e

    .line 228
    .line 229
    if-ne v4, v5, :cond_d

    .line 230
    .line 231
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    goto :goto_a

    .line 235
    :cond_d
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    goto :goto_b

    .line 239
    :cond_e
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    new-instance p0, La/osa;

    .line 243
    .line 244
    const/16 v2, 0x9

    .line 245
    .line 246
    invoke-direct {p0, p1, v2}, La/osa;-><init>(La/kmq;B)V

    .line 247
    .line 248
    .line 249
    iput v5, v0, La/i2c;->j:I

    .line 250
    .line 251
    invoke-virtual {v1, p0, v0}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    if-ne p0, p2, :cond_f

    .line 256
    .line 257
    move-object v2, p2

    .line 258
    goto :goto_b

    .line 259
    :cond_f
    :goto_a
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    :goto_b
    return-object v2

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
