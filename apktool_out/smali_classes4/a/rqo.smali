.class public final synthetic La/rqo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ov0;


# direct methods
.method public synthetic constructor <init>(La/ov0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rqo;->a:B

    iput-object p1, p0, La/rqo;->b:La/ov0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/rqo;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/rqo;->b:La/ov0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/swh0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance p1, La/wro;

    .line 15
    .line 16
    new-instance v0, La/yvh0;

    .line 17
    .line 18
    iget-object v2, p0, La/ov0;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, La/ctf0;

    .line 21
    .line 22
    new-array v3, v1, [Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v4, v2, La/ctf0;->b:La/lsm0;

    .line 25
    .line 26
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const v5, 0x7f130b40

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    sget-object v4, La/bwh0;->a:La/bwh0;

    .line 38
    .line 39
    invoke-direct {v0, v3, v4}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 40
    .line 41
    .line 42
    new-instance v3, La/yvh0;

    .line 43
    .line 44
    new-array v5, v1, [Ljava/lang/Object;

    .line 45
    .line 46
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 47
    .line 48
    invoke-static {v5, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const v5, 0x7f130b2c

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v5, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-direct {v3, v1, v4}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 60
    .line 61
    .line 62
    filled-new-array {v0, v3}, [La/yvh0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, p0, La/ov0;->d:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, La/pqo;

    .line 77
    .line 78
    iget-object v1, v1, La/pqo;->d:La/zvh0;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    const/4 v2, 0x1

    .line 87
    if-eq v1, v2, :cond_2

    .line 88
    .line 89
    const/4 v2, 0x2

    .line 90
    if-eq v1, v2, :cond_1

    .line 91
    .line 92
    const/4 v2, 0x3

    .line 93
    if-ne v1, v2, :cond_0

    .line 94
    .line 95
    sget-object v1, La/bxh0;->a:La/bxh0;

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 99
    .line 100
    .line 101
    const/4 p1, 0x0

    .line 102
    goto :goto_1

    .line 103
    :cond_1
    sget-object v1, La/cxh0;->a:La/cxh0;

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    sget-object v1, La/zwh0;->a:La/zwh0;

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_3
    sget-object v1, La/axh0;->a:La/axh0;

    .line 110
    .line 111
    :goto_0
    iget-object p0, p0, La/ov0;->c:La/n0o0;

    .line 112
    .line 113
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    check-cast p0, La/fee;

    .line 118
    .line 119
    invoke-virtual {p0}, La/fee;->c()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    check-cast p0, La/swh0;

    .line 124
    .line 125
    iget-boolean p0, p0, La/swh0;->a:Z

    .line 126
    .line 127
    invoke-direct {p1, p0, v0, v1}, La/wro;-><init>(ILa/a4x;La/dxh0;)V

    .line 128
    .line 129
    .line 130
    :goto_1
    return-object p1

    .line 131
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    new-instance v2, La/imm;

    .line 137
    .line 138
    new-instance v3, La/ilm;

    .line 139
    .line 140
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 141
    .line 142
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 147
    .line 148
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 149
    .line 150
    .line 151
    move-result-wide v4

    .line 152
    invoke-direct {v3, v4, v5}, La/ilm;-><init>(J)V

    .line 153
    .line 154
    .line 155
    new-instance v4, La/plm;

    .line 156
    .line 157
    iget-object p1, p0, La/ov0;->e:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p1, La/ctf0;

    .line 160
    .line 161
    new-array v0, v1, [Ljava/lang/Object;

    .line 162
    .line 163
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 164
    .line 165
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    const v1, 0x7f13067f

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 181
    .line 182
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 183
    .line 184
    .line 185
    move-result-wide v0

    .line 186
    sget-object v5, La/fa50;->a:La/fa50;

    .line 187
    .line 188
    invoke-direct {v4, p1, v0, v1, v5}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 189
    .line 190
    .line 191
    new-instance v5, La/dmm;

    .line 192
    .line 193
    new-instance p1, La/ta50;

    .line 194
    .line 195
    new-instance v6, La/wkm;

    .line 196
    .line 197
    iget-object p0, p0, La/ov0;->b:La/n0o0;

    .line 198
    .line 199
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    check-cast p0, La/fee;

    .line 204
    .line 205
    invoke-virtual {p0}, La/fee;->c()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    check-cast p0, Ljava/lang/Boolean;

    .line 210
    .line 211
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    if-eqz p0, :cond_4

    .line 216
    .line 217
    const p0, 0x7f080854

    .line 218
    .line 219
    .line 220
    :goto_2
    move v8, p0

    .line 221
    goto :goto_3

    .line 222
    :cond_4
    const p0, 0x7f080905

    .line 223
    .line 224
    .line 225
    goto :goto_2

    .line 226
    :goto_3
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 231
    .line 232
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 233
    .line 234
    .line 235
    move-result-wide v11

    .line 236
    const/4 v7, 0x1

    .line 237
    const/4 v9, 0x1

    .line 238
    sget-object v10, La/ra50;->a:La/ra50;

    .line 239
    .line 240
    invoke-direct/range {v6 .. v12}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 241
    .line 242
    .line 243
    invoke-direct {p1, v6}, La/ta50;-><init>(La/wkm;)V

    .line 244
    .line 245
    .line 246
    invoke-direct {v5, p1}, La/dmm;-><init>(La/wa50;)V

    .line 247
    .line 248
    .line 249
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 254
    .line 255
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 256
    .line 257
    .line 258
    move-result-wide v6

    .line 259
    const/4 v8, 0x0

    .line 260
    const/4 v9, 0x0

    .line 261
    invoke-direct/range {v2 .. v9}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 262
    .line 263
    .line 264
    return-object v2

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
