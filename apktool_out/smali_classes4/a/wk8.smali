.class public final synthetic La/wk8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vl8;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/vl8;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wk8;->a:B

    iput-object p1, p0, La/wk8;->b:La/vl8;

    iput-object p2, p0, La/wk8;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wk8;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, La/ukd;->a:La/cl5;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, La/wk8;->c:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iget-object v0, v0, La/wk8;->b:La/vl8;

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    move-object/from16 v13, p1

    .line 15
    .line 16
    check-cast v13, La/fet;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v1, p2

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    and-int/lit8 v7, v1, 0x3

    .line 30
    .line 31
    if-eq v7, v6, :cond_0

    .line 32
    .line 33
    move v7, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v7, v2

    .line 36
    :goto_0
    and-int/2addr v1, v4

    .line 37
    invoke-virtual {v13, v1, v7}, La/fet;->U(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_8

    .line 42
    .line 43
    invoke-interface {v0}, La/vl8;->g()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_7

    .line 48
    .line 49
    const v1, 0xb3a2aad

    .line 50
    .line 51
    .line 52
    invoke-virtual {v13, v1}, La/fet;->e0(I)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v0}, La/vl8;->c()La/ijl;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-interface {v0}, La/vl8;->d()La/jjl;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    invoke-interface {v0}, La/vl8;->e()La/gjl;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-nez v0, :cond_1

    .line 76
    .line 77
    if-ne v1, v3, :cond_2

    .line 78
    .line 79
    :cond_1
    new-instance v1, La/tk8;

    .line 80
    .line 81
    invoke-direct {v1, v5, v6}, La/tk8;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    move-object v10, v1

    .line 88
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 89
    .line 90
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    if-nez v0, :cond_3

    .line 99
    .line 100
    if-ne v1, v3, :cond_4

    .line 101
    .line 102
    :cond_3
    new-instance v1, La/tk8;

    .line 103
    .line 104
    const/4 v0, 0x3

    .line 105
    invoke-direct {v1, v5, v0}, La/tk8;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    move-object v11, v1

    .line 112
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 113
    .line 114
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-nez v0, :cond_5

    .line 123
    .line 124
    if-ne v1, v3, :cond_6

    .line 125
    .line 126
    :cond_5
    new-instance v1, La/tk8;

    .line 127
    .line 128
    const/4 v0, 0x4

    .line 129
    invoke-direct {v1, v5, v0}, La/tk8;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_6
    move-object v12, v1

    .line 136
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 137
    .line 138
    const/4 v14, 0x0

    .line 139
    const/4 v15, 0x0

    .line 140
    invoke-static/range {v7 .. v15}, La/feb;->k(La/ijl;La/jjl;La/gjl;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v13, v2}, La/fet;->r(Z)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_7
    const v0, 0xb451b17    # 3.79612E-32f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v13, v0}, La/fet;->e0(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v13, v2}, La/fet;->r(Z)V

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_8
    invoke-virtual {v13}, La/fet;->X()V

    .line 158
    .line 159
    .line 160
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    return-object v0

    .line 163
    :pswitch_0
    move-object/from16 v1, p2

    .line 164
    .line 165
    check-cast v1, Ljava/lang/Integer;

    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    and-int/lit8 v7, v1, 0x3

    .line 172
    .line 173
    if-eq v7, v6, :cond_9

    .line 174
    .line 175
    move v2, v4

    .line 176
    :cond_9
    and-int/2addr v1, v4

    .line 177
    invoke-virtual {v13, v1, v2}, La/fet;->U(IZ)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_c

    .line 182
    .line 183
    sget-object v1, La/jm40;->b:La/jm40;

    .line 184
    .line 185
    const/high16 v2, 0x3f800000    # 1.0f

    .line 186
    .line 187
    invoke-static {v1, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-interface {v0}, La/vl8;->a()La/imm;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    if-nez v0, :cond_a

    .line 204
    .line 205
    if-ne v4, v3, :cond_b

    .line 206
    .line 207
    :cond_a
    new-instance v4, La/tk8;

    .line 208
    .line 209
    const/16 v0, 0x9

    .line 210
    .line 211
    invoke-direct {v4, v5, v0}, La/tk8;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v13, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_b
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 218
    .line 219
    const/4 v15, 0x0

    .line 220
    const/16 v16, 0xff4

    .line 221
    .line 222
    const/4 v3, 0x0

    .line 223
    const/4 v5, 0x0

    .line 224
    const/4 v6, 0x0

    .line 225
    const/4 v7, 0x0

    .line 226
    const/4 v8, 0x0

    .line 227
    const/4 v9, 0x0

    .line 228
    const/4 v10, 0x0

    .line 229
    const/4 v11, 0x0

    .line 230
    const/4 v12, 0x0

    .line 231
    const/4 v14, 0x6

    .line 232
    invoke-static/range {v1 .. v16}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 233
    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_c
    invoke-virtual {v13}, La/fet;->X()V

    .line 237
    .line 238
    .line 239
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object v0

    .line 242
    nop

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
