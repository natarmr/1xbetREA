.class public final La/n5j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/ctf0;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/n5j;->a:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, La/imm;

    .line 11
    .line 12
    new-instance v2, La/ilm;

    .line 13
    .line 14
    sget-object v3, La/s6t0;->a:La/pz40;

    .line 15
    .line 16
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v3, v3, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 21
    .line 22
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    invoke-direct {v2, v3, v4}, La/ilm;-><init>(J)V

    .line 27
    .line 28
    .line 29
    new-instance v3, La/plm;

    .line 30
    .line 31
    new-array v4, v0, [Ljava/lang/Object;

    .line 32
    .line 33
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 34
    .line 35
    invoke-static {v4, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const v4, 0x7f1311a1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v4, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 51
    .line 52
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    sget-object v0, La/fa50;->a:La/fa50;

    .line 57
    .line 58
    invoke-direct {v3, p1, v4, v5, v0}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 66
    .line 67
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 68
    .line 69
    .line 70
    move-result-wide v5

    .line 71
    const/4 v7, 0x1

    .line 72
    const/4 v8, 0x0

    .line 73
    sget-object v4, La/fmm;->a:La/fmm;

    .line 74
    .line 75
    invoke-direct/range {v1 .. v8}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 76
    .line 77
    .line 78
    iput-object v1, p0, La/n5j;->b:Ljava/lang/Object;

    .line 79
    .line 80
    return-void
.end method

.method public constructor <init>(La/ftr0;La/ctf0;)V
    .locals 3

    const/4 v0, 0x3

    iput-byte v0, p0, La/n5j;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iget-object v1, p1, La/ftr0;->b:La/ua20;

    .line 83
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    if-eq v1, v0, :cond_0

    .line 84
    new-instance v0, La/kh00;

    invoke-direct {v0, p1, p2}, La/kh00;-><init>(La/ftr0;La/ctf0;)V

    goto :goto_0

    .line 85
    :cond_0
    new-instance v0, La/ee2;

    invoke-direct {v0, p1, p2}, La/ee2;-><init>(La/ftr0;La/ctf0;)V

    goto :goto_0

    .line 86
    :cond_1
    new-instance v0, La/nw8;

    invoke-direct {v0, p1, p2}, La/nw8;-><init>(La/ftr0;La/ctf0;)V

    goto :goto_0

    .line 87
    :cond_2
    new-instance v0, La/kh00;

    invoke-direct {v0, p1, p2}, La/kh00;-><init>(La/ftr0;La/ctf0;)V

    .line 88
    :goto_0
    iput-object v0, p0, La/n5j;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 89
    iput-byte p2, p0, La/n5j;->a:B

    iput-object p1, p0, La/n5j;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;Z)Ljava/util/List;
    .locals 58

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 16
    .line 17
    .line 18
    sget-object v7, La/iun;->a:La/iun;

    .line 19
    .line 20
    new-instance v2, La/rqs;

    .line 21
    .line 22
    new-instance v10, La/kts;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    const-string v3, ""

    .line 26
    .line 27
    invoke-direct {v10, v3, v3, v0, v0}, La/kts;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 28
    .line 29
    .line 30
    new-instance v0, La/ubr;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-direct {v0, v3, v3}, La/ubr;-><init>(II)V

    .line 34
    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    move-object v6, v7

    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v9, 0x0

    .line 41
    const-wide/16 v12, 0x0

    .line 42
    .line 43
    const/4 v14, 0x0

    .line 44
    const/4 v15, 0x0

    .line 45
    const/16 v19, 0x0

    .line 46
    .line 47
    const/16 v20, 0x0

    .line 48
    .line 49
    const/16 v21, 0x0

    .line 50
    .line 51
    const/16 v22, 0x0

    .line 52
    .line 53
    const/16 v23, 0x0

    .line 54
    .line 55
    const/16 v24, 0x0

    .line 56
    .line 57
    const/16 v25, 0x0

    .line 58
    .line 59
    const/16 v26, 0x0

    .line 60
    .line 61
    const/16 v27, 0x0

    .line 62
    .line 63
    const/16 v28, 0x0

    .line 64
    .line 65
    const/16 v29, 0x0

    .line 66
    .line 67
    const/16 v30, 0x0

    .line 68
    .line 69
    const-string v3, ""

    .line 70
    .line 71
    const-string v5, ""

    .line 72
    .line 73
    const-string v11, ""

    .line 74
    .line 75
    const-string v16, ""

    .line 76
    .line 77
    move-object/from16 v17, v6

    .line 78
    .line 79
    move-object/from16 v18, v6

    .line 80
    .line 81
    move-object/from16 v31, v0

    .line 82
    .line 83
    invoke-direct/range {v2 .. v31}, La/rqs;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;IIILa/kts;Ljava/lang/String;JIILjava/lang/String;Ljava/util/List;Ljava/util/List;ZIZZZZZZZZZILa/ubr;)V

    .line 84
    .line 85
    .line 86
    move-object/from16 v21, v2

    .line 87
    .line 88
    new-instance v2, La/f0t;

    .line 89
    .line 90
    move-object v7, v6

    .line 91
    const-string v6, ""

    .line 92
    .line 93
    const/4 v3, 0x0

    .line 94
    const-wide/16 v4, 0x0

    .line 95
    .line 96
    move-object v8, v7

    .line 97
    invoke-direct/range {v2 .. v8}, La/f0t;-><init>(IJLjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 98
    .line 99
    .line 100
    move-object/from16 v22, v2

    .line 101
    .line 102
    move-object v6, v7

    .line 103
    new-instance v2, La/f0t;

    .line 104
    .line 105
    const-string v6, ""

    .line 106
    .line 107
    invoke-direct/range {v2 .. v8}, La/f0t;-><init>(IJLjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 108
    .line 109
    .line 110
    move-object v6, v7

    .line 111
    new-instance v35, La/pfs;

    .line 112
    .line 113
    const-string v13, ""

    .line 114
    .line 115
    const-string v14, ""

    .line 116
    .line 117
    const-string v8, ""

    .line 118
    .line 119
    const-string v9, ""

    .line 120
    .line 121
    const-string v10, ""

    .line 122
    .line 123
    const-string v11, ""

    .line 124
    .line 125
    const-string v12, ""

    .line 126
    .line 127
    move-object/from16 v7, v35

    .line 128
    .line 129
    invoke-direct/range {v7 .. v14}, La/pfs;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    new-instance v53, Ljava/util/Date;

    .line 133
    .line 134
    invoke-direct/range {v53 .. v53}, Ljava/util/Date;-><init>()V

    .line 135
    .line 136
    .line 137
    sget-object v37, La/boh;->c:La/boh;

    .line 138
    .line 139
    new-instance v7, La/d0t;

    .line 140
    .line 141
    const/16 v56, 0x0

    .line 142
    .line 143
    const/16 v57, 0x0

    .line 144
    .line 145
    const-wide/16 v3, 0x0

    .line 146
    .line 147
    const/4 v10, 0x0

    .line 148
    const/4 v11, 0x0

    .line 149
    const-wide/16 v16, 0x0

    .line 150
    .line 151
    const-wide/16 v18, 0x0

    .line 152
    .line 153
    const-wide/16 v24, 0x0

    .line 154
    .line 155
    const-wide/16 v26, 0x0

    .line 156
    .line 157
    const-wide/16 v28, 0x0

    .line 158
    .line 159
    const-wide/16 v30, 0x0

    .line 160
    .line 161
    const-wide/16 v33, 0x0

    .line 162
    .line 163
    const/16 v36, 0x0

    .line 164
    .line 165
    const/16 v38, 0x0

    .line 166
    .line 167
    const/16 v39, 0x0

    .line 168
    .line 169
    const/16 v40, 0x0

    .line 170
    .line 171
    const/16 v41, 0x0

    .line 172
    .line 173
    const/16 v42, 0x0

    .line 174
    .line 175
    const/16 v43, 0x0

    .line 176
    .line 177
    const/16 v44, 0x0

    .line 178
    .line 179
    const-wide/16 v48, 0x0

    .line 180
    .line 181
    const/16 v50, 0x0

    .line 182
    .line 183
    const/16 v51, 0x0

    .line 184
    .line 185
    const/16 v52, 0x0

    .line 186
    .line 187
    const-string v5, ""

    .line 188
    .line 189
    move-object v13, v6

    .line 190
    const-string v6, ""

    .line 191
    .line 192
    move-object/from16 v23, v2

    .line 193
    .line 194
    move-object v2, v7

    .line 195
    const-string v7, ""

    .line 196
    .line 197
    const-string v8, ""

    .line 198
    .line 199
    const-string v9, ""

    .line 200
    .line 201
    const-string v12, ""

    .line 202
    .line 203
    const-string v20, ""

    .line 204
    .line 205
    const-string v45, ""

    .line 206
    .line 207
    const-string v46, ""

    .line 208
    .line 209
    const-string v54, ""

    .line 210
    .line 211
    const-string v55, ""

    .line 212
    .line 213
    move-object v14, v13

    .line 214
    move-object v15, v13

    .line 215
    move-object/from16 v32, v13

    .line 216
    .line 217
    move-object/from16 v47, v13

    .line 218
    .line 219
    invoke-direct/range {v2 .. v57}, La/d0t;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JJLjava/lang/String;La/rqs;La/f0t;La/f0t;JJJJLjava/util/List;JLa/pfs;ZLa/boh;ZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;JZZILjava/util/Date;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 220
    .line 221
    .line 222
    const/4 v14, -0x2

    .line 223
    const/16 v15, 0x3fff

    .line 224
    .line 225
    const/4 v8, 0x0

    .line 226
    const/4 v9, 0x0

    .line 227
    const/4 v12, 0x0

    .line 228
    const/4 v13, 0x0

    .line 229
    move-object v7, v2

    .line 230
    invoke-static/range {v7 .. v15}, La/d0t;->a(La/d0t;Ljava/util/List;ZZZZLjava/util/ArrayList;II)La/d0t;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/n5j;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/n5j;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, La/ftr0;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast v0, La/v6t0;

    .line 18
    .line 19
    invoke-interface {v0, v1}, La/v6t0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, La/d820;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    move-object/from16 v1, p1

    .line 27
    .line 28
    check-cast v1, La/hpl0;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v3, v1, La/hpl0;->d:Ljava/lang/String;

    .line 34
    .line 35
    iget-boolean v4, v1, La/hpl0;->e:Z

    .line 36
    .line 37
    iget-object v5, v1, La/hpl0;->f:La/dnf0;

    .line 38
    .line 39
    invoke-static {v3}, La/vtb;->c0(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    instance-of v6, v5, La/bnf0;

    .line 46
    .line 47
    if-nez v6, :cond_1

    .line 48
    .line 49
    instance-of v6, v5, La/zmf0;

    .line 50
    .line 51
    if-eqz v6, :cond_0

    .line 52
    .line 53
    move-object v6, v5

    .line 54
    check-cast v6, La/zmf0;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/4 v6, 0x0

    .line 58
    :goto_0
    if-eqz v6, :cond_2

    .line 59
    .line 60
    iget-object v6, v6, La/zmf0;->a:La/a4x;

    .line 61
    .line 62
    if-eqz v6, :cond_2

    .line 63
    .line 64
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    const/4 v7, 0x1

    .line 69
    xor-int/2addr v6, v7

    .line 70
    if-ne v6, v7, :cond_2

    .line 71
    .line 72
    :cond_1
    new-instance v0, La/jpl0;

    .line 73
    .line 74
    invoke-direct {v0, v4, v5}, La/jpl0;-><init>(ZLa/dnf0;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_b

    .line 78
    .line 79
    :cond_2
    iget-object v5, v1, La/hpl0;->o:Ljava/lang/Boolean;

    .line 80
    .line 81
    iget-object v6, v1, La/hpl0;->l:Ljava/lang/Integer;

    .line 82
    .line 83
    iget-object v7, v1, La/hpl0;->m:Ljava/util/List;

    .line 84
    .line 85
    iget-object v8, v1, La/hpl0;->n:Ljava/lang/Boolean;

    .line 86
    .line 87
    iget-object v14, v1, La/hpl0;->p:La/wcb;

    .line 88
    .line 89
    iget-object v9, v1, La/hpl0;->q:La/v5l0;

    .line 90
    .line 91
    iget-boolean v10, v1, La/hpl0;->r:Z

    .line 92
    .line 93
    sget-object v11, La/v4g0;->a:La/v4g0;

    .line 94
    .line 95
    if-eqz v5, :cond_15

    .line 96
    .line 97
    if-eqz v6, :cond_15

    .line 98
    .line 99
    if-eqz v7, :cond_15

    .line 100
    .line 101
    if-eqz v8, :cond_15

    .line 102
    .line 103
    if-eqz v14, :cond_15

    .line 104
    .line 105
    if-eqz v9, :cond_15

    .line 106
    .line 107
    iget-object v12, v1, La/hpl0;->h:La/thh0;

    .line 108
    .line 109
    iget-object v13, v1, La/hpl0;->i:La/thh0;

    .line 110
    .line 111
    new-instance v15, La/x6h0;

    .line 112
    .line 113
    const/4 v2, 0x3

    .line 114
    invoke-direct {v15, v12, v13, v2}, La/x6h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 115
    .line 116
    .line 117
    invoke-static {v15}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    instance-of v15, v12, La/jhh0;

    .line 122
    .line 123
    move-object/from16 v17, v0

    .line 124
    .line 125
    if-eqz v15, :cond_3

    .line 126
    .line 127
    instance-of v0, v13, La/jhh0;

    .line 128
    .line 129
    if-nez v0, :cond_13

    .line 130
    .line 131
    :cond_3
    if-eqz v15, :cond_4

    .line 132
    .line 133
    move-object v0, v12

    .line 134
    check-cast v0, La/jhh0;

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    const/4 v0, 0x0

    .line 138
    :goto_1
    if-eqz v0, :cond_5

    .line 139
    .line 140
    iget-object v0, v0, La/jhh0;->a:Ljava/lang/Throwable;

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_5
    const/4 v0, 0x0

    .line 144
    :goto_2
    instance-of v0, v0, La/hr30;

    .line 145
    .line 146
    if-nez v0, :cond_13

    .line 147
    .line 148
    instance-of v0, v13, La/jhh0;

    .line 149
    .line 150
    if-eqz v0, :cond_6

    .line 151
    .line 152
    move-object v0, v13

    .line 153
    check-cast v0, La/jhh0;

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_6
    const/4 v0, 0x0

    .line 157
    :goto_3
    if-eqz v0, :cond_7

    .line 158
    .line 159
    iget-object v0, v0, La/jhh0;->a:Ljava/lang/Throwable;

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_7
    const/4 v0, 0x0

    .line 163
    :goto_4
    instance-of v0, v0, La/hr30;

    .line 164
    .line 165
    if-eqz v0, :cond_8

    .line 166
    .line 167
    goto/16 :goto_9

    .line 168
    .line 169
    :cond_8
    instance-of v0, v12, La/phh0;

    .line 170
    .line 171
    if-nez v0, :cond_14

    .line 172
    .line 173
    instance-of v0, v13, La/phh0;

    .line 174
    .line 175
    if-eqz v0, :cond_9

    .line 176
    .line 177
    goto/16 :goto_a

    .line 178
    .line 179
    :cond_9
    invoke-static {v3}, La/vtb;->c0(Ljava/lang/String;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_a

    .line 184
    .line 185
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    check-cast v0, Ljava/lang/Boolean;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_a

    .line 196
    .line 197
    new-instance v11, La/m4g0;

    .line 198
    .line 199
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    new-instance v12, La/mdm;

    .line 204
    .line 205
    sget-object v1, La/pb10;->c:La/xuz;

    .line 206
    .line 207
    sget-object v2, La/pb10;->g:La/pb10;

    .line 208
    .line 209
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-static {v2, v0}, La/xuz;->a(La/pb10;I)I

    .line 213
    .line 214
    .line 215
    move-result v13

    .line 216
    const-wide/16 v23, 0x0

    .line 217
    .line 218
    const/16 v25, 0x25e

    .line 219
    .line 220
    const/4 v14, 0x0

    .line 221
    const/4 v15, 0x0

    .line 222
    const/16 v16, 0x0

    .line 223
    .line 224
    const/16 v17, 0x0

    .line 225
    .line 226
    const v18, 0x7f1305c0

    .line 227
    .line 228
    .line 229
    const/16 v19, 0x0

    .line 230
    .line 231
    const v20, 0x7f131111

    .line 232
    .line 233
    .line 234
    const-wide/16 v21, 0x2710

    .line 235
    .line 236
    invoke-direct/range {v12 .. v25}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 237
    .line 238
    .line 239
    invoke-direct {v11, v12}, La/m4g0;-><init>(La/mdm;)V

    .line 240
    .line 241
    .line 242
    goto/16 :goto_a

    .line 243
    .line 244
    :cond_a
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    check-cast v0, Ljava/lang/Boolean;

    .line 249
    .line 250
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_b

    .line 255
    .line 256
    new-instance v11, La/m4g0;

    .line 257
    .line 258
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    new-instance v12, La/mdm;

    .line 263
    .line 264
    sget-object v1, La/pb10;->c:La/xuz;

    .line 265
    .line 266
    sget-object v2, La/pb10;->e:La/pb10;

    .line 267
    .line 268
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-static {v2, v0}, La/xuz;->a(La/pb10;I)I

    .line 272
    .line 273
    .line 274
    move-result v13

    .line 275
    const-wide/16 v23, 0x0

    .line 276
    .line 277
    const/16 v25, 0x3de

    .line 278
    .line 279
    const/4 v14, 0x0

    .line 280
    const/4 v15, 0x0

    .line 281
    const/16 v16, 0x0

    .line 282
    .line 283
    const/16 v17, 0x0

    .line 284
    .line 285
    const v18, 0x7f130e37

    .line 286
    .line 287
    .line 288
    const/16 v19, 0x0

    .line 289
    .line 290
    const/16 v20, 0x0

    .line 291
    .line 292
    const-wide/16 v21, 0x0

    .line 293
    .line 294
    invoke-direct/range {v12 .. v25}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 295
    .line 296
    .line 297
    invoke-direct {v11, v12}, La/m4g0;-><init>(La/mdm;)V

    .line 298
    .line 299
    .line 300
    goto/16 :goto_a

    .line 301
    .line 302
    :cond_b
    invoke-static {v3}, La/vtb;->c0(Ljava/lang/String;)Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    instance-of v2, v12, La/nhh0;

    .line 307
    .line 308
    if-eqz v2, :cond_c

    .line 309
    .line 310
    check-cast v12, La/nhh0;

    .line 311
    .line 312
    goto :goto_5

    .line 313
    :cond_c
    const/4 v12, 0x0

    .line 314
    :goto_5
    if-eqz v12, :cond_d

    .line 315
    .line 316
    iget-object v2, v12, La/nhh0;->a:Ljava/util/List;

    .line 317
    .line 318
    if-nez v2, :cond_e

    .line 319
    .line 320
    :cond_d
    sget-object v2, La/iun;->a:La/iun;

    .line 321
    .line 322
    :cond_e
    instance-of v3, v13, La/nhh0;

    .line 323
    .line 324
    if-eqz v3, :cond_f

    .line 325
    .line 326
    check-cast v13, La/nhh0;

    .line 327
    .line 328
    goto :goto_6

    .line 329
    :cond_f
    const/4 v13, 0x0

    .line 330
    :goto_6
    if-eqz v13, :cond_10

    .line 331
    .line 332
    iget-object v3, v13, La/nhh0;->a:Ljava/util/List;

    .line 333
    .line 334
    if-nez v3, :cond_11

    .line 335
    .line 336
    :cond_10
    sget-object v3, La/iun;->a:La/iun;

    .line 337
    .line 338
    :cond_11
    iget-object v15, v1, La/hpl0;->g:La/dhh0;

    .line 339
    .line 340
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 341
    .line 342
    .line 343
    move-result v12

    .line 344
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 345
    .line 346
    .line 347
    move-result v11

    .line 348
    move/from16 v19, v10

    .line 349
    .line 350
    iget-object v10, v1, La/hpl0;->k:La/y78;

    .line 351
    .line 352
    iget-object v13, v1, La/hpl0;->j:La/ctf0;

    .line 353
    .line 354
    move-object/from16 v1, v17

    .line 355
    .line 356
    check-cast v1, La/svu;

    .line 357
    .line 358
    invoke-virtual {v1}, La/svu;->l()Z

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    invoke-static {v2, v1}, La/n5j;->a(Ljava/util/List;Z)Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v8

    .line 366
    invoke-static {v3, v1}, La/n5j;->a(Ljava/util/List;Z)Ljava/util/List;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    move-object/from16 v17, v7

    .line 383
    .line 384
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 385
    .line 386
    .line 387
    move-result-object v7

    .line 388
    if-eqz v0, :cond_12

    .line 389
    .line 390
    new-instance v0, La/nfh0;

    .line 391
    .line 392
    new-instance v20, La/hjm;

    .line 393
    .line 394
    const/4 v3, 0x0

    .line 395
    new-array v5, v3, [Ljava/lang/Object;

    .line 396
    .line 397
    iget-object v6, v13, La/ctf0;->b:La/lsm0;

    .line 398
    .line 399
    invoke-static {v5, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    const v5, 0x7f1310da

    .line 404
    .line 405
    .line 406
    invoke-virtual {v6, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v21

    .line 410
    new-instance v3, La/m0x;

    .line 411
    .line 412
    const v5, 0x7f0809d5

    .line 413
    .line 414
    .line 415
    const/4 v6, 0x6

    .line 416
    move/from16 v18, v1

    .line 417
    .line 418
    const/4 v1, 0x0

    .line 419
    invoke-direct {v3, v5, v1, v6}, La/m0x;-><init>(ILa/bzw;I)V

    .line 420
    .line 421
    .line 422
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 423
    .line 424
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 429
    .line 430
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 431
    .line 432
    .line 433
    move-result-wide v5

    .line 434
    new-instance v1, La/y3d;

    .line 435
    .line 436
    invoke-direct {v1, v5, v6}, La/y3d;-><init>(J)V

    .line 437
    .line 438
    .line 439
    const/16 v32, 0x0

    .line 440
    .line 441
    const/16 v33, 0x1fe6

    .line 442
    .line 443
    const/16 v22, 0x0

    .line 444
    .line 445
    const/16 v23, 0x0

    .line 446
    .line 447
    const/16 v26, 0x0

    .line 448
    .line 449
    const/16 v27, 0x0

    .line 450
    .line 451
    const/16 v28, 0x0

    .line 452
    .line 453
    const/16 v29, 0x0

    .line 454
    .line 455
    const/16 v30, 0x0

    .line 456
    .line 457
    const/16 v31, 0x0

    .line 458
    .line 459
    move-object/from16 v25, v1

    .line 460
    .line 461
    move-object/from16 v24, v3

    .line 462
    .line 463
    invoke-direct/range {v20 .. v33}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 464
    .line 465
    .line 466
    move-object/from16 v1, v20

    .line 467
    .line 468
    invoke-direct {v0, v1}, La/nfh0;-><init>(La/hjm;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v7, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    :goto_7
    move-object/from16 v16, v9

    .line 475
    .line 476
    goto :goto_8

    .line 477
    :cond_12
    move/from16 v18, v1

    .line 478
    .line 479
    goto :goto_7

    .line 480
    :goto_8
    const/4 v9, 0x1

    .line 481
    invoke-static/range {v7 .. v19}, La/g1x;->n(La/lc00;Ljava/util/List;ZLa/y78;ZZLa/ctf0;La/wcb;La/dhh0;La/v5l0;Ljava/util/List;ZZ)V

    .line 482
    .line 483
    .line 484
    const/4 v9, 0x0

    .line 485
    move-object v8, v2

    .line 486
    invoke-static/range {v7 .. v19}, La/g1x;->n(La/lc00;Ljava/util/List;ZLa/y78;ZZLa/ctf0;La/wcb;La/dhh0;La/v5l0;Ljava/util/List;ZZ)V

    .line 487
    .line 488
    .line 489
    move/from16 v0, v19

    .line 490
    .line 491
    invoke-static {v7}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    new-instance v11, La/s4g0;

    .line 500
    .line 501
    invoke-direct {v11, v1, v0}, La/s4g0;-><init>(La/a4x;Z)V

    .line 502
    .line 503
    .line 504
    goto :goto_a

    .line 505
    :cond_13
    :goto_9
    new-instance v11, La/p4g0;

    .line 506
    .line 507
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 508
    .line 509
    .line 510
    move-result v0

    .line 511
    new-instance v12, La/mdm;

    .line 512
    .line 513
    sget-object v1, La/pb10;->c:La/xuz;

    .line 514
    .line 515
    sget-object v2, La/pb10;->g:La/pb10;

    .line 516
    .line 517
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    invoke-static {v2, v0}, La/xuz;->a(La/pb10;I)I

    .line 521
    .line 522
    .line 523
    move-result v13

    .line 524
    const-wide/16 v23, 0x0

    .line 525
    .line 526
    const/16 v25, 0x25e

    .line 527
    .line 528
    const/4 v14, 0x0

    .line 529
    const/4 v15, 0x0

    .line 530
    const/16 v16, 0x0

    .line 531
    .line 532
    const/16 v17, 0x0

    .line 533
    .line 534
    const v18, 0x7f1307c4

    .line 535
    .line 536
    .line 537
    const/16 v19, 0x0

    .line 538
    .line 539
    const v20, 0x7f131690

    .line 540
    .line 541
    .line 542
    const-wide/16 v21, 0x2710

    .line 543
    .line 544
    invoke-direct/range {v12 .. v25}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 545
    .line 546
    .line 547
    invoke-direct {v11, v12}, La/p4g0;-><init>(La/mdm;)V

    .line 548
    .line 549
    .line 550
    :cond_14
    :goto_a
    new-instance v0, La/ipl0;

    .line 551
    .line 552
    invoke-direct {v0, v4, v11}, La/ipl0;-><init>(ZLa/y4g0;)V

    .line 553
    .line 554
    .line 555
    goto :goto_b

    .line 556
    :cond_15
    new-instance v0, La/ipl0;

    .line 557
    .line 558
    invoke-direct {v0, v4, v11}, La/ipl0;-><init>(ZLa/y4g0;)V

    .line 559
    .line 560
    .line 561
    :goto_b
    return-object v0

    .line 562
    :pswitch_1
    move-object/from16 v17, v0

    .line 563
    .line 564
    const/4 v1, 0x0

    .line 565
    move-object/from16 v0, v17

    .line 566
    .line 567
    check-cast v0, La/ocl;

    .line 568
    .line 569
    move-object/from16 v2, p1

    .line 570
    .line 571
    check-cast v2, La/ka90;

    .line 572
    .line 573
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    invoke-interface {v2}, La/ka90;->a()Z

    .line 577
    .line 578
    .line 579
    move-result v3

    .line 580
    if-eqz v3, :cond_16

    .line 581
    .line 582
    const/high16 v3, 0x3f800000    # 1.0f

    .line 583
    .line 584
    :goto_c
    move v8, v3

    .line 585
    goto :goto_d

    .line 586
    :cond_16
    const/high16 v3, 0x3f000000    # 0.5f

    .line 587
    .line 588
    goto :goto_c

    .line 589
    :goto_d
    instance-of v3, v2, La/ia90;

    .line 590
    .line 591
    if-eqz v3, :cond_17

    .line 592
    .line 593
    new-instance v0, La/sa90;

    .line 594
    .line 595
    check-cast v2, La/ia90;

    .line 596
    .line 597
    iget-object v1, v2, La/ia90;->c:La/lun;

    .line 598
    .line 599
    iget-boolean v3, v2, La/ia90;->a:Z

    .line 600
    .line 601
    iget-boolean v2, v2, La/ia90;->d:Z

    .line 602
    .line 603
    invoke-direct {v0, v1, v3, v2}, La/sa90;-><init>(La/lun;ZZ)V

    .line 604
    .line 605
    .line 606
    :goto_e
    move-object v2, v0

    .line 607
    goto/16 :goto_10

    .line 608
    .line 609
    :cond_17
    instance-of v3, v2, La/fa90;

    .line 610
    .line 611
    if-eqz v3, :cond_18

    .line 612
    .line 613
    new-instance v4, La/pa90;

    .line 614
    .line 615
    check-cast v2, La/fa90;

    .line 616
    .line 617
    iget-object v5, v2, La/fa90;->c:Ljava/lang/String;

    .line 618
    .line 619
    iget-object v6, v2, La/fa90;->d:Ljava/util/Map;

    .line 620
    .line 621
    iget-boolean v7, v2, La/fa90;->a:Z

    .line 622
    .line 623
    move v9, v8

    .line 624
    iget-boolean v8, v2, La/fa90;->f:Z

    .line 625
    .line 626
    iget-boolean v10, v2, La/fa90;->h:Z

    .line 627
    .line 628
    invoke-direct/range {v4 .. v10}, La/pa90;-><init>(Ljava/lang/String;Ljava/util/Map;ZZFZ)V

    .line 629
    .line 630
    .line 631
    :goto_f
    move-object v2, v4

    .line 632
    goto/16 :goto_10

    .line 633
    .line 634
    :cond_18
    move v13, v8

    .line 635
    instance-of v3, v2, La/ga90;

    .line 636
    .line 637
    if-eqz v3, :cond_19

    .line 638
    .line 639
    new-instance v14, La/qa90;

    .line 640
    .line 641
    check-cast v2, La/ga90;

    .line 642
    .line 643
    iget-object v15, v2, La/ga90;->c:La/lun;

    .line 644
    .line 645
    iget-boolean v1, v2, La/ga90;->a:Z

    .line 646
    .line 647
    iget-boolean v2, v2, La/ga90;->d:Z

    .line 648
    .line 649
    move v7, v2

    .line 650
    sget-object v2, La/pb10;->g:La/pb10;

    .line 651
    .line 652
    const-wide/16 v10, 0x0

    .line 653
    .line 654
    const/16 v12, 0x25e

    .line 655
    .line 656
    const/4 v3, 0x0

    .line 657
    const/4 v4, 0x0

    .line 658
    const/4 v5, 0x0

    .line 659
    const v6, 0x7f130677

    .line 660
    .line 661
    .line 662
    move v8, v7

    .line 663
    const v7, 0x7f131690

    .line 664
    .line 665
    .line 666
    move/from16 v16, v8

    .line 667
    .line 668
    const-wide/16 v8, 0x2710

    .line 669
    .line 670
    move/from16 v34, v1

    .line 671
    .line 672
    move-object v1, v0

    .line 673
    move/from16 v0, v34

    .line 674
    .line 675
    invoke-static/range {v1 .. v12}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 676
    .line 677
    .line 678
    move-result-object v9

    .line 679
    move v6, v0

    .line 680
    move v8, v13

    .line 681
    move-object v4, v14

    .line 682
    move-object v5, v15

    .line 683
    move/from16 v7, v16

    .line 684
    .line 685
    invoke-direct/range {v4 .. v9}, La/qa90;-><init>(La/lun;ZZFLa/mdm;)V

    .line 686
    .line 687
    .line 688
    goto :goto_f

    .line 689
    :cond_19
    instance-of v3, v2, La/ja90;

    .line 690
    .line 691
    if-eqz v3, :cond_1a

    .line 692
    .line 693
    new-instance v14, La/qa90;

    .line 694
    .line 695
    check-cast v2, La/ja90;

    .line 696
    .line 697
    iget-object v15, v2, La/ja90;->c:La/lun;

    .line 698
    .line 699
    iget-boolean v1, v2, La/ja90;->a:Z

    .line 700
    .line 701
    iget-boolean v2, v2, La/ja90;->d:Z

    .line 702
    .line 703
    move v7, v2

    .line 704
    sget-object v2, La/pb10;->g:La/pb10;

    .line 705
    .line 706
    const-wide/16 v10, 0x0

    .line 707
    .line 708
    const/16 v12, 0x3de

    .line 709
    .line 710
    const/4 v3, 0x0

    .line 711
    const/4 v4, 0x0

    .line 712
    const/4 v5, 0x0

    .line 713
    const v6, 0x7f130677

    .line 714
    .line 715
    .line 716
    move v8, v7

    .line 717
    const/4 v7, 0x0

    .line 718
    move/from16 v16, v8

    .line 719
    .line 720
    const-wide/16 v8, 0x0

    .line 721
    .line 722
    move/from16 v34, v1

    .line 723
    .line 724
    move-object v1, v0

    .line 725
    move/from16 v0, v34

    .line 726
    .line 727
    invoke-static/range {v1 .. v12}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 728
    .line 729
    .line 730
    move-result-object v9

    .line 731
    move v6, v0

    .line 732
    move v8, v13

    .line 733
    move-object v4, v14

    .line 734
    move-object v5, v15

    .line 735
    move/from16 v7, v16

    .line 736
    .line 737
    invoke-direct/range {v4 .. v9}, La/qa90;-><init>(La/lun;ZZFLa/mdm;)V

    .line 738
    .line 739
    .line 740
    goto :goto_f

    .line 741
    :cond_1a
    move v8, v13

    .line 742
    instance-of v0, v2, La/ha90;

    .line 743
    .line 744
    if-eqz v0, :cond_1b

    .line 745
    .line 746
    new-instance v0, La/ra90;

    .line 747
    .line 748
    check-cast v2, La/ha90;

    .line 749
    .line 750
    iget-object v1, v2, La/ha90;->c:La/lun;

    .line 751
    .line 752
    iget-boolean v3, v2, La/ha90;->a:Z

    .line 753
    .line 754
    iget-boolean v2, v2, La/ha90;->d:Z

    .line 755
    .line 756
    invoke-direct {v0, v1, v3, v2, v8}, La/ra90;-><init>(La/lun;ZZF)V

    .line 757
    .line 758
    .line 759
    goto/16 :goto_e

    .line 760
    .line 761
    :cond_1b
    invoke-static {}, La/t9f;->b()V

    .line 762
    .line 763
    .line 764
    move-object v2, v1

    .line 765
    :goto_10
    return-object v2

    .line 766
    :pswitch_2
    move-object/from16 v17, v0

    .line 767
    .line 768
    move-object/from16 v0, p1

    .line 769
    .line 770
    check-cast v0, La/m5j;

    .line 771
    .line 772
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 773
    .line 774
    .line 775
    move-object/from16 v1, v17

    .line 776
    .line 777
    check-cast v1, La/imm;

    .line 778
    .line 779
    iget-object v0, v0, La/m5j;->a:Ljava/util/List;

    .line 780
    .line 781
    new-instance v2, Ljava/util/ArrayList;

    .line 782
    .line 783
    const/16 v3, 0xa

    .line 784
    .line 785
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 786
    .line 787
    .line 788
    move-result v3

    .line 789
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 790
    .line 791
    .line 792
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 797
    .line 798
    .line 799
    move-result v3

    .line 800
    if-eqz v3, :cond_1c

    .line 801
    .line 802
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v3

    .line 806
    check-cast v3, La/j5j;

    .line 807
    .line 808
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 809
    .line 810
    .line 811
    new-instance v4, La/k5j;

    .line 812
    .line 813
    new-instance v5, La/hjm;

    .line 814
    .line 815
    iget-object v6, v3, La/j5j;->a:Ljava/lang/String;

    .line 816
    .line 817
    sget-object v7, La/s6t0;->a:La/pz40;

    .line 818
    .line 819
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 820
    .line 821
    .line 822
    move-result-object v7

    .line 823
    iget-object v7, v7, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 824
    .line 825
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 826
    .line 827
    .line 828
    move-result-wide v7

    .line 829
    new-instance v9, La/y3d;

    .line 830
    .line 831
    invoke-direct {v9, v7, v8}, La/y3d;-><init>(J)V

    .line 832
    .line 833
    .line 834
    const/16 v17, 0x0

    .line 835
    .line 836
    const/16 v18, 0x1ffa

    .line 837
    .line 838
    const/4 v7, 0x0

    .line 839
    move-object v8, v9

    .line 840
    const/4 v9, 0x0

    .line 841
    const/4 v10, 0x0

    .line 842
    const/4 v11, 0x0

    .line 843
    const/4 v12, 0x0

    .line 844
    const/4 v13, 0x0

    .line 845
    const/4 v14, 0x0

    .line 846
    const/4 v15, 0x0

    .line 847
    const/16 v16, 0x0

    .line 848
    .line 849
    invoke-direct/range {v5 .. v18}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 850
    .line 851
    .line 852
    iget-object v3, v3, La/j5j;->b:Ljava/lang/String;

    .line 853
    .line 854
    invoke-direct {v4, v5, v3}, La/k5j;-><init>(La/hjm;Ljava/lang/String;)V

    .line 855
    .line 856
    .line 857
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 858
    .line 859
    .line 860
    goto :goto_11

    .line 861
    :cond_1c
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    new-instance v2, La/o5j;

    .line 866
    .line 867
    invoke-direct {v2, v1, v0}, La/o5j;-><init>(La/imm;La/i4;)V

    .line 868
    .line 869
    .line 870
    return-object v2

    .line 871
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
