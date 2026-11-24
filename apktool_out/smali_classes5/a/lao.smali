.class public final synthetic La/lao;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mao;


# direct methods
.method public synthetic constructor <init>(La/mao;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lao;->a:B

    iput-object p1, p0, La/lao;->b:La/mao;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lao;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v0, v0, La/lao;->b:La/mao;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v15, p1

    .line 14
    .line 15
    check-cast v15, La/fet;

    .line 16
    .line 17
    move-object/from16 v1, p2

    .line 18
    .line 19
    check-cast v1, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    and-int/lit8 v5, v1, 0x3

    .line 26
    .line 27
    if-eq v5, v3, :cond_0

    .line 28
    .line 29
    move v2, v4

    .line 30
    :cond_0
    and-int/2addr v1, v4

    .line 31
    invoke-virtual {v15, v1, v2}, La/fet;->U(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object v6, v0, La/mao;->c:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v7, v0, La/mao;->d:Ljava/lang/String;

    .line 40
    .line 41
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 42
    .line 43
    invoke-virtual {v15, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 48
    .line 49
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 50
    .line 51
    .line 52
    move-result-wide v8

    .line 53
    sget-object v22, La/j1t0;->b:La/qrq;

    .line 54
    .line 55
    sget-wide v19, La/qmk;->r:J

    .line 56
    .line 57
    sget-wide v28, La/qmk;->F:J

    .line 58
    .line 59
    new-instance v14, La/y9q0;

    .line 60
    .line 61
    const/16 v27, 0x0

    .line 62
    .line 63
    const v30, 0xfdffdd

    .line 64
    .line 65
    .line 66
    const-wide/16 v17, 0x0

    .line 67
    .line 68
    const/16 v21, 0x0

    .line 69
    .line 70
    const-wide/16 v23, 0x0

    .line 71
    .line 72
    const/16 v25, 0x0

    .line 73
    .line 74
    const/16 v26, 0x0

    .line 75
    .line 76
    move-object/from16 v16, v14

    .line 77
    .line 78
    invoke-direct/range {v16 .. v30}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 79
    .line 80
    .line 81
    const/16 v16, 0xc00

    .line 82
    .line 83
    const/16 v17, 0x61

    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    const-wide/16 v10, 0x0

    .line 87
    .line 88
    const-wide/16 v12, 0x0

    .line 89
    .line 90
    invoke-static/range {v5 .. v17}, La/y9a;->h(La/mm40;Ljava/lang/String;Ljava/lang/String;JJJLa/y9q0;La/fet;II)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    invoke-virtual {v15}, La/fet;->X()V

    .line 95
    .line 96
    .line 97
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object v0

    .line 100
    :pswitch_0
    move-object/from16 v1, p1

    .line 101
    .line 102
    check-cast v1, La/fet;

    .line 103
    .line 104
    move-object/from16 v5, p2

    .line 105
    .line 106
    check-cast v5, Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    and-int/lit8 v6, v5, 0x3

    .line 113
    .line 114
    if-eq v6, v3, :cond_2

    .line 115
    .line 116
    move v2, v4

    .line 117
    :cond_2
    and-int/lit8 v3, v5, 0x1

    .line 118
    .line 119
    invoke-virtual {v1, v3, v2}, La/fet;->U(IZ)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_3

    .line 124
    .line 125
    iget-object v0, v0, La/mao;->b:Ljava/lang/String;

    .line 126
    .line 127
    sget-object v8, La/j1t0;->b:La/qrq;

    .line 128
    .line 129
    sget-wide v5, La/qmk;->r:J

    .line 130
    .line 131
    sget-wide v14, La/qmk;->F:J

    .line 132
    .line 133
    new-instance v2, La/y9q0;

    .line 134
    .line 135
    const/4 v13, 0x0

    .line 136
    const v16, 0xfdffdd

    .line 137
    .line 138
    .line 139
    const-wide/16 v3, 0x0

    .line 140
    .line 141
    const/4 v7, 0x0

    .line 142
    const-wide/16 v9, 0x0

    .line 143
    .line 144
    const/4 v11, 0x0

    .line 145
    const/4 v12, 0x0

    .line 146
    invoke-direct/range {v2 .. v16}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 147
    .line 148
    .line 149
    sget-object v3, La/zaq0;->b:La/zfn;

    .line 150
    .line 151
    invoke-virtual {v1, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 156
    .line 157
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 158
    .line 159
    .line 160
    move-result-wide v3

    .line 161
    const/16 v24, 0x6180

    .line 162
    .line 163
    const v25, 0x1affa

    .line 164
    .line 165
    .line 166
    move-object/from16 v21, v2

    .line 167
    .line 168
    const/4 v2, 0x0

    .line 169
    const/4 v5, 0x0

    .line 170
    const-wide/16 v6, 0x0

    .line 171
    .line 172
    const/4 v8, 0x0

    .line 173
    const/4 v9, 0x0

    .line 174
    const/4 v10, 0x0

    .line 175
    const-wide/16 v11, 0x0

    .line 176
    .line 177
    const/4 v13, 0x0

    .line 178
    const-wide/16 v14, 0x0

    .line 179
    .line 180
    const/16 v16, 0x2

    .line 181
    .line 182
    const/16 v17, 0x0

    .line 183
    .line 184
    const/16 v18, 0x1

    .line 185
    .line 186
    const/16 v19, 0x0

    .line 187
    .line 188
    const/16 v20, 0x0

    .line 189
    .line 190
    const/16 v23, 0x0

    .line 191
    .line 192
    move-object/from16 v22, v1

    .line 193
    .line 194
    move-object v1, v0

    .line 195
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 196
    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_3
    move-object/from16 v22, v1

    .line 200
    .line 201
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 202
    .line 203
    .line 204
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    return-object v0

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
