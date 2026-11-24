.class public final synthetic La/m5m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s4u0;

.field public final synthetic c:La/t33;

.field public final synthetic d:La/t33;

.field public final synthetic e:La/gzc;


# direct methods
.method public synthetic constructor <init>(La/s4u0;La/t33;La/t33;La/gzc;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/m5m0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m5m0;->b:La/s4u0;

    iput-object p2, p0, La/m5m0;->c:La/t33;

    iput-object p3, p0, La/m5m0;->d:La/t33;

    iput-object p4, p0, La/m5m0;->e:La/gzc;

    return-void
.end method

.method public synthetic constructor <init>(La/t33;La/t33;La/gzc;La/s4u0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/m5m0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m5m0;->c:La/t33;

    iput-object p2, p0, La/m5m0;->d:La/t33;

    iput-object p3, p0, La/m5m0;->e:La/gzc;

    iput-object p4, p0, La/m5m0;->b:La/s4u0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/m5m0;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    iget-object v5, v0, La/m5m0;->e:La/gzc;

    .line 11
    .line 12
    iget-object v6, v0, La/m5m0;->d:La/t33;

    .line 13
    .line 14
    iget-object v7, v0, La/m5m0;->c:La/t33;

    .line 15
    .line 16
    const/4 v8, 0x2

    .line 17
    const/4 v9, 0x0

    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v15, p1

    .line 22
    .line 23
    check-cast v15, La/fet;

    .line 24
    .line 25
    move-object/from16 v1, p2

    .line 26
    .line 27
    check-cast v1, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    and-int/lit8 v10, v1, 0x3

    .line 34
    .line 35
    if-eq v10, v8, :cond_0

    .line 36
    .line 37
    move v10, v4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v10, v9

    .line 40
    :goto_0
    and-int/2addr v1, v4

    .line 41
    invoke-virtual {v15, v1, v10}, La/fet;->U(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_4

    .line 46
    .line 47
    iget-object v10, v0, La/m5m0;->b:La/s4u0;

    .line 48
    .line 49
    if-nez v10, :cond_1

    .line 50
    .line 51
    const v0, 0xdda965a

    .line 52
    .line 53
    .line 54
    invoke-virtual {v15, v0}, La/fet;->e0(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v15, v9}, La/fet;->r(Z)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    const v0, 0xdda965b

    .line 62
    .line 63
    .line 64
    invoke-virtual {v15, v0}, La/fet;->e0(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v15, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-virtual {v15, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    or-int/2addr v0, v1

    .line 76
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    if-nez v0, :cond_2

    .line 81
    .line 82
    if-ne v1, v2, :cond_3

    .line 83
    .line 84
    :cond_2
    new-instance v1, La/o5m0;

    .line 85
    .line 86
    invoke-direct {v1, v7, v6, v8}, La/o5m0;-><init>(La/t33;La/t33;B)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v15, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_3
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 93
    .line 94
    invoke-static {v3, v1}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget v1, v5, La/gzc;->f:F

    .line 99
    .line 100
    invoke-static {v0, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget-wide v1, v5, La/gzc;->c:J

    .line 105
    .line 106
    iget v3, v5, La/gzc;->d:F

    .line 107
    .line 108
    invoke-static {v3}, La/vgg0;->a(F)La/ugg0;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-static {v0, v1, v2, v3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iget v1, v5, La/gzc;->e:F

    .line 117
    .line 118
    invoke-static {v0, v1}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    iget-wide v13, v5, La/gzc;->b:J

    .line 123
    .line 124
    const/16 v16, 0x38

    .line 125
    .line 126
    const/16 v17, 0x0

    .line 127
    .line 128
    const/4 v11, 0x0

    .line 129
    invoke-static/range {v10 .. v17}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v15, v9}, La/fet;->r(Z)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    invoke-virtual {v15}, La/fet;->X()V

    .line 137
    .line 138
    .line 139
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object v0

    .line 142
    :pswitch_0
    move-object/from16 v1, p1

    .line 143
    .line 144
    check-cast v1, La/fet;

    .line 145
    .line 146
    move-object/from16 v10, p2

    .line 147
    .line 148
    check-cast v10, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    and-int/lit8 v11, v10, 0x3

    .line 155
    .line 156
    if-eq v11, v8, :cond_5

    .line 157
    .line 158
    move v8, v4

    .line 159
    goto :goto_2

    .line 160
    :cond_5
    move v8, v9

    .line 161
    :goto_2
    and-int/2addr v4, v10

    .line 162
    invoke-virtual {v1, v4, v8}, La/fet;->U(IZ)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-eqz v4, :cond_8

    .line 167
    .line 168
    invoke-virtual {v1, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    invoke-virtual {v1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    or-int/2addr v4, v8

    .line 177
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    if-nez v4, :cond_6

    .line 182
    .line 183
    if-ne v8, v2, :cond_7

    .line 184
    .line 185
    :cond_6
    new-instance v8, La/o5m0;

    .line 186
    .line 187
    invoke-direct {v8, v7, v6, v9}, La/o5m0;-><init>(La/t33;La/t33;B)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_7
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 194
    .line 195
    invoke-static {v3, v8}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    iget v3, v5, La/gzc;->f:F

    .line 200
    .line 201
    invoke-static {v2, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    iget-wide v3, v5, La/gzc;->c:J

    .line 206
    .line 207
    iget v6, v5, La/gzc;->d:F

    .line 208
    .line 209
    invoke-static {v6}, La/vgg0;->a(F)La/ugg0;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    invoke-static {v2, v3, v4, v6}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    iget v3, v5, La/gzc;->e:F

    .line 218
    .line 219
    invoke-static {v2, v3}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    iget-wide v4, v5, La/gzc;->b:J

    .line 224
    .line 225
    const/16 v7, 0x38

    .line 226
    .line 227
    const/4 v8, 0x0

    .line 228
    iget-object v0, v0, La/m5m0;->b:La/s4u0;

    .line 229
    .line 230
    const/4 v2, 0x0

    .line 231
    move-object v6, v1

    .line 232
    move-object v1, v0

    .line 233
    invoke-static/range {v1 .. v8}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 234
    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_8
    move-object v6, v1

    .line 238
    invoke-virtual {v6}, La/fet;->X()V

    .line 239
    .line 240
    .line 241
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 242
    .line 243
    return-object v0

    .line 244
    nop

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
