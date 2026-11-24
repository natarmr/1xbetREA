.class public final La/rug0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;

.field public final c:La/p7m0;

.field public final d:La/qoj0;

.field public e:Z


# direct methods
.method public constructor <init>(La/ctf0;La/n3w;ZLorg/xplatform/bethistory/sale/presentation/SaleDataModel;DLa/m1e;)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    iget-wide v4, v3, Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;->e:D

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, La/w46;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v3, v0, La/rug0;->b:Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;

    .line 21
    .line 22
    new-instance v6, La/qug0;

    .line 23
    .line 24
    iget-object v7, v2, La/n3w;->c:La/s77;

    .line 25
    .line 26
    iget-object v8, v2, La/n3w;->a:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v9, v2, La/n3w;->g:Ljava/lang/String;

    .line 29
    .line 30
    sget-object v10, La/s77;->d:La/s77;

    .line 31
    .line 32
    if-eq v7, v10, :cond_1

    .line 33
    .line 34
    sget-object v10, La/s77;->i:La/s77;

    .line 35
    .line 36
    if-ne v7, v10, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    iget-object v10, v2, La/n3w;->m1:Ljava/lang/String;

    .line 40
    .line 41
    :goto_0
    move-object v15, v10

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    :goto_1
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v10

    .line 47
    const v11, 0x7f1309d9

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v11, v10}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    goto :goto_0

    .line 55
    :goto_2
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    const/4 v10, 0x2

    .line 60
    const/4 v11, 0x1

    .line 61
    if-eq v7, v11, :cond_4

    .line 62
    .line 63
    const v12, 0x7f1309da

    .line 64
    .line 65
    .line 66
    if-eq v7, v10, :cond_2

    .line 67
    .line 68
    const/4 v13, 0x6

    .line 69
    if-eq v7, v13, :cond_4

    .line 70
    .line 71
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-virtual {v1, v12, v7}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    :goto_3
    move-object/from16 v16, v7

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_2
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-nez v7, :cond_3

    .line 87
    .line 88
    iget-object v8, v2, La/n3w;->b:Ljava/lang/String;

    .line 89
    .line 90
    :cond_3
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-virtual {v1, v12, v7}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    goto :goto_3

    .line 99
    :cond_4
    const-string v7, ""

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :goto_4
    sget-object v7, La/pn40;->a:La/pn40;

    .line 103
    .line 104
    iget-wide v7, v2, La/n3w;->n1:D

    .line 105
    .line 106
    const-wide/16 v12, 0x0

    .line 107
    .line 108
    cmpl-double v12, v7, v12

    .line 109
    .line 110
    if-lez v12, :cond_5

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_5
    iget-wide v7, v2, La/n3w;->o:D

    .line 114
    .line 115
    :goto_5
    sget-object v12, La/p3u0;->c:La/p3u0;

    .line 116
    .line 117
    invoke-static {v7, v8, v9, v12}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v17

    .line 121
    move-wide/from16 v7, p5

    .line 122
    .line 123
    invoke-static {v7, v8, v9, v12}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v19

    .line 127
    invoke-static {v4, v5, v9, v12}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v22

    .line 131
    const/4 v7, 0x0

    .line 132
    new-array v7, v7, [Ljava/lang/Object;

    .line 133
    .line 134
    const v8, 0x7f13055b

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v8, v7}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v23

    .line 141
    iget-wide v7, v3, Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;->l:D

    .line 142
    .line 143
    invoke-static {v7, v8, v9, v12}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v20

    .line 147
    iget-wide v7, v3, Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;->h:D

    .line 148
    .line 149
    invoke-static {v7, v8, v9, v12}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v21

    .line 153
    invoke-static {v4, v5, v9, v12}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    const v4, 0x7f1309ef

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v4, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v24

    .line 168
    iget-wide v12, v2, La/n3w;->j:J

    .line 169
    .line 170
    iget-object v2, v2, La/n3w;->f:Ljava/lang/String;

    .line 171
    .line 172
    invoke-virtual {v1}, La/ctf0;->h()Z

    .line 173
    .line 174
    .line 175
    move-result v25

    .line 176
    move v1, v11

    .line 177
    new-instance v11, La/xvg0;

    .line 178
    .line 179
    move/from16 v14, p3

    .line 180
    .line 181
    move-object/from16 v18, v2

    .line 182
    .line 183
    invoke-direct/range {v11 .. v25}, La/xvg0;-><init>(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 184
    .line 185
    .line 186
    invoke-direct {v6, v11}, La/qug0;-><init>(La/xvg0;)V

    .line 187
    .line 188
    .line 189
    invoke-static {v6}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    iput-object v2, v0, La/rug0;->c:La/p7m0;

    .line 194
    .line 195
    invoke-static {}, La/ckb;->F()La/qoj0;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    iput-object v2, v0, La/rug0;->d:La/qoj0;

    .line 200
    .line 201
    iput-boolean v1, v0, La/rug0;->e:Z

    .line 202
    .line 203
    invoke-interface/range {p7 .. p7}, La/m1e;->b()La/gmq;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    new-instance v2, La/yng0;

    .line 208
    .line 209
    const/4 v3, 0x0

    .line 210
    invoke-direct {v2, v0, v3, v10}, La/yng0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 211
    .line 212
    .line 213
    new-instance v3, La/fnq;

    .line 214
    .line 215
    const/4 v4, 0x4

    .line 216
    invoke-direct {v3, v1, v2, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 217
    .line 218
    .line 219
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-static {v3, v0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 224
    .line 225
    .line 226
    return-void
.end method
