.class public final La/hpt;
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
    iput-byte p2, p0, La/hpt;->a:B

    iput-object p1, p0, La/hpt;->b:La/a1g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/hpt;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/hpt;->b:La/a1g;

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
    instance-of v0, p2, La/d670;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move-object v0, p2

    .line 19
    check-cast v0, La/d670;

    .line 20
    .line 21
    iget v6, v0, La/d670;->j:I

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
    iput v6, v0, La/d670;->j:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, La/d670;

    .line 32
    .line 33
    invoke-direct {v0, p0, p2}, La/d670;-><init>(La/hpt;La/yje;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object p0, v0, La/d670;->i:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object p2, La/wne;->a:La/wne;

    .line 39
    .line 40
    iget v4, v0, La/d670;->j:I

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
    new-instance p0, La/ld60;

    .line 58
    .line 59
    const/4 v2, 0x7

    .line 60
    invoke-direct {p0, p1, v2}, La/ld60;-><init>(La/kmq;B)V

    .line 61
    .line 62
    .line 63
    iput v5, v0, La/d670;->j:I

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
    instance-of v0, p2, La/k260;

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    move-object v0, p2

    .line 81
    check-cast v0, La/k260;

    .line 82
    .line 83
    iget v6, v0, La/k260;->j:I

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
    iput v6, v0, La/k260;->j:I

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_4
    new-instance v0, La/k260;

    .line 94
    .line 95
    invoke-direct {v0, p0, p2}, La/k260;-><init>(La/hpt;La/yje;)V

    .line 96
    .line 97
    .line 98
    :goto_3
    iget-object p0, v0, La/k260;->i:Ljava/lang/Object;

    .line 99
    .line 100
    sget-object p2, La/wne;->a:La/wne;

    .line 101
    .line 102
    iget v4, v0, La/k260;->j:I

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
    new-instance p0, La/nr30;

    .line 120
    .line 121
    const/16 v2, 0xf

    .line 122
    .line 123
    invoke-direct {p0, p1, v2}, La/nr30;-><init>(La/kmq;B)V

    .line 124
    .line 125
    .line 126
    iput v5, v0, La/k260;->j:I

    .line 127
    .line 128
    invoke-virtual {v1, p0, v0}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    if-ne p0, p2, :cond_7

    .line 133
    .line 134
    move-object v2, p2

    .line 135
    goto :goto_5

    .line 136
    :cond_7
    :goto_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    :goto_5
    return-object v2

    .line 139
    :pswitch_1
    instance-of v0, p2, La/mwt;

    .line 140
    .line 141
    if-eqz v0, :cond_8

    .line 142
    .line 143
    move-object v0, p2

    .line 144
    check-cast v0, La/mwt;

    .line 145
    .line 146
    iget v6, v0, La/mwt;->j:I

    .line 147
    .line 148
    and-int v7, v6, v4

    .line 149
    .line 150
    if-eqz v7, :cond_8

    .line 151
    .line 152
    sub-int/2addr v6, v4

    .line 153
    iput v6, v0, La/mwt;->j:I

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_8
    new-instance v0, La/mwt;

    .line 157
    .line 158
    invoke-direct {v0, p0, p2}, La/mwt;-><init>(La/hpt;La/yje;)V

    .line 159
    .line 160
    .line 161
    :goto_6
    iget-object p0, v0, La/mwt;->i:Ljava/lang/Object;

    .line 162
    .line 163
    sget-object p2, La/wne;->a:La/wne;

    .line 164
    .line 165
    iget v4, v0, La/mwt;->j:I

    .line 166
    .line 167
    if-eqz v4, :cond_a

    .line 168
    .line 169
    if-ne v4, v5, :cond_9

    .line 170
    .line 171
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    goto :goto_7

    .line 175
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    goto :goto_8

    .line 179
    :cond_a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    new-instance p0, La/tnt;

    .line 183
    .line 184
    const/16 v2, 0xd

    .line 185
    .line 186
    invoke-direct {p0, p1, v2}, La/tnt;-><init>(La/kmq;B)V

    .line 187
    .line 188
    .line 189
    iput v5, v0, La/mwt;->j:I

    .line 190
    .line 191
    invoke-virtual {v1, p0, v0}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    if-ne p0, p2, :cond_b

    .line 196
    .line 197
    move-object v2, p2

    .line 198
    goto :goto_8

    .line 199
    :cond_b
    :goto_7
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    :goto_8
    return-object v2

    .line 202
    :pswitch_2
    instance-of v0, p2, La/fpt;

    .line 203
    .line 204
    if-eqz v0, :cond_c

    .line 205
    .line 206
    move-object v0, p2

    .line 207
    check-cast v0, La/fpt;

    .line 208
    .line 209
    iget v6, v0, La/fpt;->j:I

    .line 210
    .line 211
    and-int v7, v6, v4

    .line 212
    .line 213
    if-eqz v7, :cond_c

    .line 214
    .line 215
    sub-int/2addr v6, v4

    .line 216
    iput v6, v0, La/fpt;->j:I

    .line 217
    .line 218
    goto :goto_9

    .line 219
    :cond_c
    new-instance v0, La/fpt;

    .line 220
    .line 221
    invoke-direct {v0, p0, p2}, La/fpt;-><init>(La/hpt;La/yje;)V

    .line 222
    .line 223
    .line 224
    :goto_9
    iget-object p0, v0, La/fpt;->i:Ljava/lang/Object;

    .line 225
    .line 226
    sget-object p2, La/wne;->a:La/wne;

    .line 227
    .line 228
    iget v4, v0, La/fpt;->j:I

    .line 229
    .line 230
    if-eqz v4, :cond_e

    .line 231
    .line 232
    if-ne v4, v5, :cond_d

    .line 233
    .line 234
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    goto :goto_a

    .line 238
    :cond_d
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    goto :goto_b

    .line 242
    :cond_e
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    new-instance p0, La/tnt;

    .line 246
    .line 247
    const/4 v2, 0x4

    .line 248
    invoke-direct {p0, p1, v2}, La/tnt;-><init>(La/kmq;B)V

    .line 249
    .line 250
    .line 251
    iput v5, v0, La/fpt;->j:I

    .line 252
    .line 253
    invoke-virtual {v1, p0, v0}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    if-ne p0, p2, :cond_f

    .line 258
    .line 259
    move-object v2, p2

    .line 260
    goto :goto_b

    .line 261
    :cond_f
    :goto_a
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    :goto_b
    return-object v2

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
