.class public final synthetic La/f5o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f5o;->a:B

    iput-object p1, p0, La/f5o;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/f5o;->a:B

    iput-object p1, p0, La/f5o;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, La/f5o;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/i6q;

    .line 6
    .line 7
    move-object/from16 v1, p1

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    move-object/from16 v2, p2

    .line 16
    .line 17
    check-cast v2, La/qic;

    .line 18
    .line 19
    sget-object v3, La/i6q;->V1:[La/iiy;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, La/i6q;->H0()La/r8q;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v3, v0, La/r8q;->n:La/v6q;

    .line 29
    .line 30
    iget-object v4, v0, La/r8q;->R:La/p7m0;

    .line 31
    .line 32
    :cond_0
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    move-object v6, v5

    .line 37
    check-cast v6, La/s7q;

    .line 38
    .line 39
    iget-object v6, v6, La/s7q;->a:La/p0d;

    .line 40
    .line 41
    iget v6, v6, La/p0d;->a:I

    .line 42
    .line 43
    new-instance v7, La/p0d;

    .line 44
    .line 45
    invoke-direct {v7, v6, v2}, La/p0d;-><init>(ILa/qic;)V

    .line 46
    .line 47
    .line 48
    new-instance v6, La/s7q;

    .line 49
    .line 50
    invoke-direct {v6, v7}, La/s7q;-><init>(La/p0d;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v5, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_0

    .line 58
    .line 59
    invoke-virtual {v0}, La/r8q;->z()Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    iget-object v5, v0, La/r8q;->v:La/yk50;

    .line 64
    .line 65
    invoke-virtual {v5}, La/yk50;->g()Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-nez v5, :cond_3

    .line 70
    .line 71
    if-eqz v4, :cond_3

    .line 72
    .line 73
    sget-object v5, La/qic;->a:La/qic;

    .line 74
    .line 75
    if-ne v2, v5, :cond_1

    .line 76
    .line 77
    sget-object v7, La/wbq;->a:La/wbq;

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    sget-object v7, La/wbq;->b:La/wbq;

    .line 81
    .line 82
    :goto_0
    invoke-virtual {v3, v1, v7}, La/v6q;->a(ILa/wbq;)D

    .line 83
    .line 84
    .line 85
    move-result-wide v7

    .line 86
    iget-object v9, v0, La/r8q;->T:La/ol60;

    .line 87
    .line 88
    new-instance v10, La/x7q;

    .line 89
    .line 90
    new-instance v11, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 91
    .line 92
    iget v12, v4, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;->a:I

    .line 93
    .line 94
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v13

    .line 98
    move-wide v14, v7

    .line 99
    iget-object v7, v4, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;->b:Ljava/lang/String;

    .line 100
    .line 101
    iget-object v8, v4, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;->d:La/fcq;

    .line 102
    .line 103
    iget-object v6, v0, La/r8q;->l:La/neu;

    .line 104
    .line 105
    invoke-virtual {v6}, La/neu;->b()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    check-cast v6, Ljava/lang/Number;

    .line 114
    .line 115
    invoke-virtual {v6}, Ljava/lang/Number;->doubleValue()D

    .line 116
    .line 117
    .line 118
    move-result-wide v16

    .line 119
    iget v4, v4, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;->c:I

    .line 120
    .line 121
    iget-object v6, v0, La/r8q;->m:La/dyt;

    .line 122
    .line 123
    invoke-virtual {v6}, La/dyt;->b()Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    check-cast v6, Ljava/lang/Number;

    .line 132
    .line 133
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 134
    .line 135
    .line 136
    move-result-wide v18

    .line 137
    sget-object v6, La/wbq;->a:La/wbq;

    .line 138
    .line 139
    invoke-virtual {v3, v1, v6}, La/v6q;->a(ILa/wbq;)D

    .line 140
    .line 141
    .line 142
    move-result-wide v20

    .line 143
    sget-object v6, La/wbq;->b:La/wbq;

    .line 144
    .line 145
    invoke-virtual {v3, v1, v6}, La/v6q;->a(ILa/wbq;)D

    .line 146
    .line 147
    .line 148
    move-result-wide v22

    .line 149
    if-ne v2, v5, :cond_2

    .line 150
    .line 151
    const/4 v6, 0x1

    .line 152
    goto :goto_1

    .line 153
    :cond_2
    const/4 v6, 0x0

    .line 154
    :goto_1
    iget-object v0, v0, La/r8q;->u:La/dyt;

    .line 155
    .line 156
    invoke-virtual {v0}, La/dyt;->a()J

    .line 157
    .line 158
    .line 159
    move-result-wide v2

    .line 160
    move-object v0, v9

    .line 161
    move-wide/from16 v24, v18

    .line 162
    .line 163
    move/from16 v19, v1

    .line 164
    .line 165
    move/from16 v18, v6

    .line 166
    .line 167
    move-object v1, v10

    .line 168
    move-wide v5, v14

    .line 169
    move-wide/from16 v9, v16

    .line 170
    .line 171
    move-wide/from16 v14, v20

    .line 172
    .line 173
    move-wide/from16 v16, v22

    .line 174
    .line 175
    move-wide/from16 v20, v2

    .line 176
    .line 177
    move-object v2, v11

    .line 178
    move v3, v12

    .line 179
    move v11, v4

    .line 180
    move-object v4, v13

    .line 181
    move-wide/from16 v12, v24

    .line 182
    .line 183
    invoke-direct/range {v2 .. v21}, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;-><init>(ILjava/lang/String;DLjava/lang/String;La/fcq;DIJDDZIJ)V

    .line 184
    .line 185
    .line 186
    invoke-direct {v1, v2}, La/x7q;-><init>(Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_3
    iget-object v1, v0, La/r8q;->X:La/sje;

    .line 194
    .line 195
    iget-object v2, v0, La/r8q;->i:La/mne;

    .line 196
    .line 197
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 198
    .line 199
    new-instance v3, La/q8q;

    .line 200
    .line 201
    const/4 v4, 0x0

    .line 202
    const/4 v5, 0x0

    .line 203
    invoke-direct {v3, v0, v4, v5}, La/q8q;-><init>(La/r8q;La/yje;B)V

    .line 204
    .line 205
    .line 206
    const/4 v0, 0x2

    .line 207
    invoke-static {v1, v2, v4, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 208
    .line 209
    .line 210
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    return-object v0
.end method

.method private final b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object p0, p0, La/f5o;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/n9q;

    .line 4
    .line 5
    check-cast p1, La/fet;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    sget-object v0, La/n9q;->S1:[La/iiy;

    .line 14
    .line 15
    and-int/lit8 v0, p2, 0x3

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    const/4 v2, 0x1

    .line 19
    const/4 v3, 0x0

    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    move v0, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v0, v3

    .line 25
    :goto_0
    and-int/2addr p2, v2

    .line 26
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_7

    .line 31
    .line 32
    invoke-virtual {p0}, La/n9q;->G0()La/k3t0;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v1, La/ukd;->a:La/cl5;

    .line 45
    .line 46
    if-nez p2, :cond_1

    .line 47
    .line 48
    if-ne v0, v1, :cond_2

    .line 49
    .line 50
    :cond_1
    new-instance v0, La/g7p;

    .line 51
    .line 52
    const/4 p2, 0x6

    .line 53
    invoke-direct {v0, p0, p2}, La/g7p;-><init>(Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 60
    .line 61
    sget-object p2, La/or00;->a:La/zfn;

    .line 62
    .line 63
    invoke-virtual {p1, p2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    move-object v6, p2

    .line 68
    check-cast v6, La/clz;

    .line 69
    .line 70
    sget-object p2, La/lkz;->a:La/lkz;

    .line 71
    .line 72
    invoke-static {v0, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-virtual {p1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    invoke-virtual {p1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    or-int/2addr p2, v0

    .line 85
    const/4 v0, 0x3

    .line 86
    invoke-virtual {p1, v0}, La/fet;->e(I)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    or-int/2addr p2, v0

    .line 91
    invoke-virtual {p1, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    or-int/2addr p2, v0

    .line 96
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-nez p2, :cond_3

    .line 101
    .line 102
    if-ne v0, v1, :cond_4

    .line 103
    .line 104
    :cond_3
    new-instance v4, La/pc;

    .line 105
    .line 106
    const/4 v8, 0x0

    .line 107
    const/16 v9, 0x12

    .line 108
    .line 109
    invoke-direct/range {v4 .. v9}, La/pc;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    move-object v0, v4

    .line 116
    :cond_4
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 117
    .line 118
    invoke-static {p1, v6, v0}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, La/n9q;->G0()La/k3t0;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    check-cast p2, La/i3t0;

    .line 126
    .line 127
    invoke-virtual {p2, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-virtual {p0}, La/n9q;->G0()La/k3t0;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    invoke-virtual {p1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    if-nez p0, :cond_5

    .line 144
    .line 145
    if-ne v0, v1, :cond_6

    .line 146
    .line 147
    :cond_5
    new-instance v4, La/pop;

    .line 148
    .line 149
    const/4 v10, 0x0

    .line 150
    const/16 v11, 0xb

    .line 151
    .line 152
    const/4 v5, 0x1

    .line 153
    const-class v7, La/k3t0;

    .line 154
    .line 155
    const-string v8, "onAction"

    .line 156
    .line 157
    const-string v9, "onAction(Ljava/lang/Object;)V"

    .line 158
    .line 159
    invoke-direct/range {v4 .. v11}, La/pop;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    move-object v0, v4

    .line 166
    :cond_6
    check-cast v0, La/jhy;

    .line 167
    .line 168
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 169
    .line 170
    invoke-static {p2, v0, p1, v3}, La/mrv;->D(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_7
    invoke-virtual {p1}, La/fet;->X()V

    .line 175
    .line 176
    .line 177
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    return-object p0
.end method

.method private final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/f5o;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/paq;

    .line 4
    .line 5
    check-cast p1, La/fet;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    invoke-static {p2}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-static {p0, p1, p2}, La/mrv;->E(La/paq;La/fet;I)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0
.end method

.method private final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object p0, p0, La/f5o;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/ivq;

    .line 4
    .line 5
    iget-object v0, p0, La/i3t0;->f:La/oyg0;

    .line 6
    .line 7
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Throwable;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    instance-of p1, p1, La/ff5;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p1, p0, La/ocj;->a:La/p7m0;

    .line 24
    .line 25
    :cond_0
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-object v1, p0

    .line 33
    check-cast v1, La/suq;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const/4 v10, 0x0

    .line 39
    const/16 v11, 0x1f0

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v3, 0x1

    .line 43
    const/4 v4, 0x0

    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v7, 0x0

    .line 47
    const/4 v8, 0x0

    .line 48
    const/4 v9, 0x0

    .line 49
    invoke-static/range {v1 .. v11}, La/suq;->a(La/suq;ZZZZLa/kpm;Ljava/util/List;La/zdm0;La/nc5;ZI)La/suq;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p1, p0, p2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 61
    .line 62
    :cond_2
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-object v1, p1

    .line 70
    check-cast v1, La/suq;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const/4 v10, 0x0

    .line 76
    const/16 v11, 0x1f0

    .line 77
    .line 78
    const/4 v2, 0x1

    .line 79
    const/4 v3, 0x0

    .line 80
    const/4 v4, 0x0

    .line 81
    const/4 v5, 0x0

    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v7, 0x0

    .line 84
    const/4 v8, 0x0

    .line 85
    const/4 v9, 0x0

    .line 86
    invoke-static/range {v1 .. v11}, La/suq;->a(La/suq;ZZZZLa/kpm;Ljava/util/List;La/zdm0;La/nc5;ZI)La/suq;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-virtual {p0, p1, p2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_2

    .line 95
    .line 96
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0
.end method

.method private final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object p0, p0, La/f5o;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/vuq;

    .line 4
    .line 5
    check-cast p1, La/oyg0;

    .line 6
    .line 7
    move-object v0, p2

    .line 8
    check-cast v0, La/suq;

    .line 9
    .line 10
    new-instance v5, La/kpm;

    .line 11
    .line 12
    new-instance p1, La/hpm;

    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    const/4 p2, 0x3

    .line 17
    invoke-direct {p1, v1, v2, p2}, La/hpm;-><init>(JI)V

    .line 18
    .line 19
    .line 20
    iget v3, p0, La/vuq;->a:I

    .line 21
    .line 22
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget v4, p0, La/vuq;->b:I

    .line 27
    .line 28
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    new-instance v6, La/hpm;

    .line 33
    .line 34
    invoke-direct {v6, v1, v2, p2}, La/hpm;-><init>(JI)V

    .line 35
    .line 36
    .line 37
    const/4 p2, 0x0

    .line 38
    invoke-static {v3, v4, p2, p2, v6}, La/d5c;->O(Ljava/lang/String;Ljava/lang/String;ZZLa/ipm;)La/j83;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    sget-object v1, La/opm;->a:La/opm;

    .line 43
    .line 44
    invoke-direct {v5, v1, p1, p2}, La/kpm;-><init>(La/rpm;La/ipm;La/j83;)V

    .line 45
    .line 46
    .line 47
    iget-object v6, p0, La/vuq;->c:Ljava/util/List;

    .line 48
    .line 49
    const/4 v9, 0x0

    .line 50
    const/16 v10, 0x1c0

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    const/4 v2, 0x0

    .line 54
    const/4 v3, 0x0

    .line 55
    const/4 v4, 0x1

    .line 56
    const/4 v7, 0x0

    .line 57
    const/4 v8, 0x0

    .line 58
    invoke-static/range {v0 .. v10}, La/suq;->a(La/suq;ZZZZLa/kpm;Ljava/util/List;La/zdm0;La/nc5;ZI)La/suq;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/f5o;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x0

    .line 9
    sget-object v5, La/ukd;->a:La/cl5;

    .line 10
    .line 11
    const/4 v6, 0x3

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x2

    .line 14
    const/4 v9, 0x1

    .line 15
    iget-object v10, v0, La/f5o;->b:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v10, La/v62;

    .line 21
    .line 22
    move-object/from16 v0, p1

    .line 23
    .line 24
    check-cast v0, La/clz;

    .line 25
    .line 26
    move-object/from16 v1, p2

    .line 27
    .line 28
    check-cast v1, La/blz;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v10}, La/eg60;->e()V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_0
    invoke-direct/range {p0 .. p2}, La/f5o;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :pswitch_1
    invoke-direct/range {p0 .. p2}, La/f5o;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0

    .line 52
    :pswitch_2
    invoke-direct/range {p0 .. p2}, La/f5o;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0

    .line 57
    :pswitch_3
    invoke-direct/range {p0 .. p2}, La/f5o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0

    .line 62
    :pswitch_4
    check-cast v10, La/r8q;

    .line 63
    .line 64
    move-object/from16 v0, p1

    .line 65
    .line 66
    check-cast v0, Ljava/lang/Throwable;

    .line 67
    .line 68
    move-object/from16 v1, p2

    .line 69
    .line 70
    check-cast v1, Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    instance-of v2, v0, La/zhi0;

    .line 79
    .line 80
    if-eqz v2, :cond_0

    .line 81
    .line 82
    check-cast v0, La/zhi0;

    .line 83
    .line 84
    new-instance v2, La/gmo;

    .line 85
    .line 86
    const/16 v3, 0xc

    .line 87
    .line 88
    invoke-direct {v2, v10, v1, v3}, La/gmo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v10, v0, v2}, La/r8q;->B(La/zhi0;Lkotlin/jvm/functions/Function0;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    iget-object v0, v10, La/r8q;->T:La/ol60;

    .line 96
    .line 97
    new-instance v2, La/c8q;

    .line 98
    .line 99
    invoke-direct {v2, v1}, La/c8q;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object v0

    .line 108
    :pswitch_5
    invoke-direct/range {p0 .. p2}, La/f5o;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    return-object v0

    .line 113
    :pswitch_6
    check-cast v10, La/svp;

    .line 114
    .line 115
    move-object/from16 v14, p1

    .line 116
    .line 117
    check-cast v14, La/fet;

    .line 118
    .line 119
    move-object/from16 v0, p2

    .line 120
    .line 121
    check-cast v0, Ljava/lang/Integer;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    sget-object v1, La/svp;->S1:La/ddk;

    .line 128
    .line 129
    and-int/lit8 v1, v0, 0x3

    .line 130
    .line 131
    if-eq v1, v8, :cond_1

    .line 132
    .line 133
    move v1, v9

    .line 134
    goto :goto_1

    .line 135
    :cond_1
    move v1, v7

    .line 136
    :goto_1
    and-int/2addr v0, v9

    .line 137
    invoke-virtual {v14, v0, v1}, La/fet;->U(IZ)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_c

    .line 142
    .line 143
    invoke-virtual {v14, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    if-nez v0, :cond_2

    .line 152
    .line 153
    if-ne v1, v5, :cond_3

    .line 154
    .line 155
    :cond_2
    new-instance v1, La/rvp;

    .line 156
    .line 157
    invoke-direct {v1, v10, v9}, La/rvp;-><init>(La/svp;B)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v14, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :cond_3
    move-object v11, v1

    .line 164
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 165
    .line 166
    invoke-virtual {v14, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    if-nez v0, :cond_4

    .line 175
    .line 176
    if-ne v1, v5, :cond_5

    .line 177
    .line 178
    :cond_4
    new-instance v1, La/rvp;

    .line 179
    .line 180
    invoke-direct {v1, v10, v8}, La/rvp;-><init>(La/svp;B)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v14, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_5
    move-object v12, v1

    .line 187
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 188
    .line 189
    const/4 v15, 0x0

    .line 190
    const/16 v16, 0x4

    .line 191
    .line 192
    const/4 v13, 0x0

    .line 193
    invoke-static/range {v11 .. v16}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 194
    .line 195
    .line 196
    move-object v0, v14

    .line 197
    invoke-virtual {v10}, La/svp;->G0()La/k3t0;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    if-nez v2, :cond_6

    .line 210
    .line 211
    if-ne v3, v5, :cond_7

    .line 212
    .line 213
    :cond_6
    new-instance v8, La/pop;

    .line 214
    .line 215
    const/4 v14, 0x0

    .line 216
    const/4 v15, 0x7

    .line 217
    const/4 v9, 0x1

    .line 218
    const-class v11, La/svp;

    .line 219
    .line 220
    const-string v12, "handleSideEffect"

    .line 221
    .line 222
    const-string v13, "handleSideEffect(Lorg/xplatform/ufc/impl/fighter/presentation/model/FighterSideEffect;)V"

    .line 223
    .line 224
    invoke-direct/range {v8 .. v15}, La/pop;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    move-object v3, v8

    .line 231
    :cond_7
    check-cast v3, La/jhy;

    .line 232
    .line 233
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 234
    .line 235
    sget-object v2, La/lkz;->a:La/lkz;

    .line 236
    .line 237
    invoke-static {v3, v0}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    invoke-virtual {v0, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    or-int/2addr v2, v3

    .line 250
    invoke-virtual {v0, v6}, La/fet;->e(I)Z

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    or-int/2addr v2, v3

    .line 255
    invoke-virtual {v0, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    or-int/2addr v2, v3

    .line 260
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    if-nez v2, :cond_8

    .line 265
    .line 266
    if-ne v3, v5, :cond_9

    .line 267
    .line 268
    :cond_8
    new-instance v8, La/bio;

    .line 269
    .line 270
    const/4 v12, 0x0

    .line 271
    const/4 v13, 0x5

    .line 272
    move-object v9, v1

    .line 273
    invoke-direct/range {v8 .. v13}, La/bio;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    move-object v3, v8

    .line 280
    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 281
    .line 282
    invoke-static {v0, v10, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v10}, La/svp;->G0()La/k3t0;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    check-cast v1, La/i3t0;

    .line 290
    .line 291
    invoke-virtual {v1, v0}, La/i3t0;->y(La/fet;)La/pz40;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    iget-object v2, v10, La/svp;->Q1:La/qdz;

    .line 296
    .line 297
    invoke-virtual {v10}, La/svp;->G0()La/k3t0;

    .line 298
    .line 299
    .line 300
    move-result-object v13

    .line 301
    invoke-virtual {v0, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    if-nez v3, :cond_a

    .line 310
    .line 311
    if-ne v4, v5, :cond_b

    .line 312
    .line 313
    :cond_a
    new-instance v11, La/pop;

    .line 314
    .line 315
    const/16 v17, 0x0

    .line 316
    .line 317
    const/16 v18, 0x8

    .line 318
    .line 319
    const/4 v12, 0x1

    .line 320
    const-class v14, La/k3t0;

    .line 321
    .line 322
    const-string v15, "onAction"

    .line 323
    .line 324
    const-string v16, "onAction(Ljava/lang/Object;)V"

    .line 325
    .line 326
    invoke-direct/range {v11 .. v18}, La/pop;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    move-object v4, v11

    .line 333
    :cond_b
    check-cast v4, La/jhy;

    .line 334
    .line 335
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 336
    .line 337
    invoke-static {v1, v2, v4, v0, v7}, La/x8f;->B(La/l7m0;La/qdz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 338
    .line 339
    .line 340
    goto :goto_2

    .line 341
    :cond_c
    move-object v0, v14

    .line 342
    invoke-virtual {v0}, La/fet;->X()V

    .line 343
    .line 344
    .line 345
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 346
    .line 347
    return-object v0

    .line 348
    :pswitch_7
    check-cast v10, La/wtp;

    .line 349
    .line 350
    iget-object v0, v10, La/wtp;->Q1:La/a8z;

    .line 351
    .line 352
    move-object/from16 v1, p1

    .line 353
    .line 354
    check-cast v1, La/fet;

    .line 355
    .line 356
    move-object/from16 v2, p2

    .line 357
    .line 358
    check-cast v2, Ljava/lang/Integer;

    .line 359
    .line 360
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    sget-object v3, La/wtp;->R1:La/sek;

    .line 365
    .line 366
    and-int/lit8 v3, v2, 0x3

    .line 367
    .line 368
    if-eq v3, v8, :cond_d

    .line 369
    .line 370
    move v3, v9

    .line 371
    goto :goto_3

    .line 372
    :cond_d
    move v3, v7

    .line 373
    :goto_3
    and-int/2addr v2, v9

    .line 374
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    if-eqz v2, :cond_10

    .line 379
    .line 380
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    check-cast v2, La/k3t0;

    .line 385
    .line 386
    check-cast v2, La/i3t0;

    .line 387
    .line 388
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    move-object v10, v0

    .line 397
    check-cast v10, La/k3t0;

    .line 398
    .line 399
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    if-nez v0, :cond_e

    .line 408
    .line 409
    if-ne v3, v5, :cond_f

    .line 410
    .line 411
    :cond_e
    new-instance v8, La/pop;

    .line 412
    .line 413
    const/4 v14, 0x0

    .line 414
    const/4 v15, 0x5

    .line 415
    const/4 v9, 0x1

    .line 416
    const-class v11, La/k3t0;

    .line 417
    .line 418
    const-string v12, "onAction"

    .line 419
    .line 420
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 421
    .line 422
    invoke-direct/range {v8 .. v15}, La/pop;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    move-object v3, v8

    .line 429
    :cond_f
    check-cast v3, La/jhy;

    .line 430
    .line 431
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 432
    .line 433
    invoke-static {v2, v3, v1, v7}, La/wvb;->x(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 434
    .line 435
    .line 436
    goto :goto_4

    .line 437
    :cond_10
    invoke-virtual {v1}, La/fet;->X()V

    .line 438
    .line 439
    .line 440
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 441
    .line 442
    return-object v0

    .line 443
    :pswitch_8
    move-object v11, v10

    .line 444
    check-cast v11, La/rop;

    .line 445
    .line 446
    move-object/from16 v0, p1

    .line 447
    .line 448
    check-cast v0, La/fet;

    .line 449
    .line 450
    move-object/from16 v1, p2

    .line 451
    .line 452
    check-cast v1, Ljava/lang/Integer;

    .line 453
    .line 454
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 455
    .line 456
    .line 457
    move-result v1

    .line 458
    sget-object v2, La/rop;->a2:La/nek;

    .line 459
    .line 460
    and-int/lit8 v2, v1, 0x3

    .line 461
    .line 462
    if-eq v2, v8, :cond_11

    .line 463
    .line 464
    move v2, v9

    .line 465
    goto :goto_5

    .line 466
    :cond_11
    move v2, v7

    .line 467
    :goto_5
    and-int/2addr v1, v9

    .line 468
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    if-eqz v1, :cond_1f

    .line 473
    .line 474
    invoke-virtual {v11}, La/rop;->N0()La/k3t0;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    if-ne v2, v5, :cond_12

    .line 483
    .line 484
    sget-object v2, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 485
    .line 486
    invoke-static {v2, v0}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    invoke-virtual {v0, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    :cond_12
    check-cast v2, La/vne;

    .line 494
    .line 495
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    move-result v6

    .line 499
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v9

    .line 503
    if-nez v6, :cond_13

    .line 504
    .line 505
    if-ne v9, v5, :cond_14

    .line 506
    .line 507
    :cond_13
    new-instance v9, La/pop;

    .line 508
    .line 509
    const/4 v15, 0x0

    .line 510
    const/16 v16, 0x2

    .line 511
    .line 512
    const/4 v10, 0x1

    .line 513
    const-class v12, La/rop;

    .line 514
    .line 515
    const-string v13, "handleContainerSideEffect"

    .line 516
    .line 517
    const-string v14, "handleContainerSideEffect(Lorg/xplatform/feed/linelive/presentation/feeds/models/FeedScreenSideEffect;)V"

    .line 518
    .line 519
    invoke-direct/range {v9 .. v16}, La/pop;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v0, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    :cond_14
    check-cast v9, La/jhy;

    .line 526
    .line 527
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 528
    .line 529
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 530
    .line 531
    invoke-virtual {v0, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 532
    .line 533
    .line 534
    move-result v10

    .line 535
    invoke-virtual {v0, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v12

    .line 539
    or-int/2addr v10, v12

    .line 540
    invoke-virtual {v0, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    move-result v12

    .line 544
    or-int/2addr v10, v12

    .line 545
    invoke-virtual {v0, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    move-result v12

    .line 549
    or-int/2addr v10, v12

    .line 550
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v12

    .line 554
    if-nez v10, :cond_15

    .line 555
    .line 556
    if-ne v12, v5, :cond_16

    .line 557
    .line 558
    :cond_15
    new-instance v12, La/et;

    .line 559
    .line 560
    const/16 v10, 0x1b

    .line 561
    .line 562
    invoke-direct {v12, v2, v1, v9, v10}, La/et;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v0, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    :cond_16
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 569
    .line 570
    invoke-static {v6, v12, v0}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v11}, La/rop;->N0()La/k3t0;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    check-cast v1, La/i3t0;

    .line 578
    .line 579
    invoke-virtual {v1, v0}, La/i3t0;->y(La/fet;)La/pz40;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    new-array v2, v7, [Ljava/lang/Object;

    .line 584
    .line 585
    invoke-virtual {v0, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    move-result v6

    .line 589
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v9

    .line 593
    if-nez v6, :cond_17

    .line 594
    .line 595
    if-ne v9, v5, :cond_18

    .line 596
    .line 597
    :cond_17
    new-instance v9, La/plh;

    .line 598
    .line 599
    const/16 v6, 0x1c

    .line 600
    .line 601
    invoke-direct {v9, v1, v6}, La/plh;-><init>(La/l7m0;B)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v0, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 605
    .line 606
    .line 607
    :cond_18
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 608
    .line 609
    invoke-static {v2, v9, v0}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    check-cast v2, Ljava/lang/Boolean;

    .line 618
    .line 619
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 620
    .line 621
    .line 622
    move-result v2

    .line 623
    iget-object v6, v11, La/rop;->Z1:La/pz40;

    .line 624
    .line 625
    check-cast v6, La/hgk0;

    .line 626
    .line 627
    invoke-virtual {v6}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v9

    .line 631
    check-cast v9, La/e2d;

    .line 632
    .line 633
    if-nez v9, :cond_1a

    .line 634
    .line 635
    const v9, 0x530ecf6e

    .line 636
    .line 637
    .line 638
    invoke-virtual {v0, v9}, La/fet;->e0(I)V

    .line 639
    .line 640
    .line 641
    const/4 v9, 0x7

    .line 642
    invoke-static {v7, v9, v0}, La/ob3;->d(IILa/fet;)La/oyq0;

    .line 643
    .line 644
    .line 645
    move-result-object v9

    .line 646
    invoke-static {v0}, La/wzk0;->a(La/fet;)La/sjj;

    .line 647
    .line 648
    .line 649
    move-result-object v10

    .line 650
    invoke-static {v9, v10, v0, v3}, La/nip;->d(La/oyq0;La/sjj;La/fet;I)La/e2d;

    .line 651
    .line 652
    .line 653
    move-result-object v9

    .line 654
    if-eqz v2, :cond_19

    .line 655
    .line 656
    move-object v4, v9

    .line 657
    :cond_19
    invoke-virtual {v6, v4}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 661
    .line 662
    .line 663
    :goto_6
    move-object v2, v9

    .line 664
    goto :goto_7

    .line 665
    :cond_1a
    const v2, 0x530eba1e

    .line 666
    .line 667
    .line 668
    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 672
    .line 673
    .line 674
    goto :goto_6

    .line 675
    :goto_7
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    move-result v3

    .line 679
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v4

    .line 683
    if-nez v3, :cond_1b

    .line 684
    .line 685
    if-ne v4, v5, :cond_1c

    .line 686
    .line 687
    :cond_1b
    new-instance v9, La/wej;

    .line 688
    .line 689
    const/4 v15, 0x0

    .line 690
    const/16 v16, 0xe

    .line 691
    .line 692
    const/4 v10, 0x0

    .line 693
    const-class v12, La/rop;

    .line 694
    .line 695
    const-string v13, "dispatchOnBackPressed"

    .line 696
    .line 697
    const-string v14, "dispatchOnBackPressed()V"

    .line 698
    .line 699
    invoke-direct/range {v9 .. v16}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v0, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 703
    .line 704
    .line 705
    move-object v4, v9

    .line 706
    :cond_1c
    check-cast v4, La/jhy;

    .line 707
    .line 708
    invoke-virtual {v11}, La/rop;->N0()La/k3t0;

    .line 709
    .line 710
    .line 711
    move-result-object v14

    .line 712
    invoke-virtual {v0, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    move-result v3

    .line 716
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v6

    .line 720
    if-nez v3, :cond_1d

    .line 721
    .line 722
    if-ne v6, v5, :cond_1e

    .line 723
    .line 724
    :cond_1d
    new-instance v12, La/pop;

    .line 725
    .line 726
    const/16 v18, 0x0

    .line 727
    .line 728
    const/16 v19, 0x3

    .line 729
    .line 730
    const/4 v13, 0x1

    .line 731
    const-class v15, La/k3t0;

    .line 732
    .line 733
    const-string v16, "onAction"

    .line 734
    .line 735
    const-string v17, "onAction(Ljava/lang/Object;)V"

    .line 736
    .line 737
    invoke-direct/range {v12 .. v19}, La/pop;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {v0, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 741
    .line 742
    .line 743
    move-object v6, v12

    .line 744
    :cond_1e
    check-cast v6, La/jhy;

    .line 745
    .line 746
    move-object v14, v4

    .line 747
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 748
    .line 749
    move-object v15, v6

    .line 750
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 751
    .line 752
    new-instance v3, La/ze2;

    .line 753
    .line 754
    invoke-direct {v3, v11, v8}, La/ze2;-><init>(Ljava/lang/Object;B)V

    .line 755
    .line 756
    .line 757
    const v4, 0x6a1b552

    .line 758
    .line 759
    .line 760
    invoke-static {v4, v3, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 761
    .line 762
    .line 763
    move-result-object v16

    .line 764
    const/16 v18, 0x6000

    .line 765
    .line 766
    move-object/from16 v17, v0

    .line 767
    .line 768
    move-object v13, v1

    .line 769
    move-object v12, v2

    .line 770
    invoke-static/range {v12 .. v18}, La/o2e;->x(La/e2d;La/l7m0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 771
    .line 772
    .line 773
    goto :goto_8

    .line 774
    :cond_1f
    move-object/from16 v17, v0

    .line 775
    .line 776
    invoke-virtual/range {v17 .. v17}, La/fet;->X()V

    .line 777
    .line 778
    .line 779
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 780
    .line 781
    return-object v0

    .line 782
    :pswitch_9
    check-cast v10, La/ehp;

    .line 783
    .line 784
    iget-object v0, v10, La/ehp;->L1:La/a8z;

    .line 785
    .line 786
    move-object/from16 v1, p1

    .line 787
    .line 788
    check-cast v1, La/fet;

    .line 789
    .line 790
    move-object/from16 v2, p2

    .line 791
    .line 792
    check-cast v2, Ljava/lang/Integer;

    .line 793
    .line 794
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 795
    .line 796
    .line 797
    move-result v2

    .line 798
    and-int/lit8 v3, v2, 0x3

    .line 799
    .line 800
    if-eq v3, v8, :cond_20

    .line 801
    .line 802
    move v3, v9

    .line 803
    goto :goto_9

    .line 804
    :cond_20
    move v3, v7

    .line 805
    :goto_9
    and-int/2addr v2, v9

    .line 806
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 807
    .line 808
    .line 809
    move-result v2

    .line 810
    if-eqz v2, :cond_23

    .line 811
    .line 812
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    check-cast v2, La/k3t0;

    .line 817
    .line 818
    check-cast v2, La/i3t0;

    .line 819
    .line 820
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 821
    .line 822
    .line 823
    move-result-object v2

    .line 824
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    move-object v10, v0

    .line 829
    check-cast v10, La/k3t0;

    .line 830
    .line 831
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 832
    .line 833
    .line 834
    move-result v0

    .line 835
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v3

    .line 839
    if-nez v0, :cond_21

    .line 840
    .line 841
    if-ne v3, v5, :cond_22

    .line 842
    .line 843
    :cond_21
    new-instance v8, La/k4p;

    .line 844
    .line 845
    const/4 v14, 0x0

    .line 846
    const/16 v15, 0x1a

    .line 847
    .line 848
    const/4 v9, 0x1

    .line 849
    const-class v11, La/k3t0;

    .line 850
    .line 851
    const-string v12, "onAction"

    .line 852
    .line 853
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 854
    .line 855
    invoke-direct/range {v8 .. v15}, La/k4p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 856
    .line 857
    .line 858
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 859
    .line 860
    .line 861
    move-object v3, v8

    .line 862
    :cond_22
    check-cast v3, La/jhy;

    .line 863
    .line 864
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 865
    .line 866
    invoke-static {v2, v3, v1, v7}, La/zgc;->t(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 867
    .line 868
    .line 869
    goto :goto_a

    .line 870
    :cond_23
    invoke-virtual {v1}, La/fet;->X()V

    .line 871
    .line 872
    .line 873
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 874
    .line 875
    return-object v0

    .line 876
    :pswitch_a
    check-cast v10, La/wgp;

    .line 877
    .line 878
    iget-object v0, v10, La/i3t0;->f:La/oyg0;

    .line 879
    .line 880
    iget-object v1, v10, La/i3t0;->i:La/ocj;

    .line 881
    .line 882
    move-object/from16 v2, p1

    .line 883
    .line 884
    check-cast v2, Ljava/lang/Throwable;

    .line 885
    .line 886
    move-object/from16 v3, p2

    .line 887
    .line 888
    check-cast v3, Ljava/lang/String;

    .line 889
    .line 890
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 891
    .line 892
    .line 893
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 894
    .line 895
    .line 896
    instance-of v2, v2, La/ff5;

    .line 897
    .line 898
    if-eqz v2, :cond_25

    .line 899
    .line 900
    iget-object v2, v1, La/ocj;->a:La/p7m0;

    .line 901
    .line 902
    :cond_24
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v1

    .line 906
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 907
    .line 908
    .line 909
    move-object v3, v1

    .line 910
    check-cast v3, La/rgp;

    .line 911
    .line 912
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 913
    .line 914
    .line 915
    invoke-static {v3, v7, v7, v9}, La/rgp;->a(La/rgp;ZZZ)La/rgp;

    .line 916
    .line 917
    .line 918
    move-result-object v3

    .line 919
    invoke-virtual {v2, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 920
    .line 921
    .line 922
    move-result v1

    .line 923
    if-eqz v1, :cond_24

    .line 924
    .line 925
    goto :goto_b

    .line 926
    :cond_25
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 927
    .line 928
    :cond_26
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 929
    .line 930
    .line 931
    move-result-object v2

    .line 932
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 933
    .line 934
    .line 935
    move-object v3, v2

    .line 936
    check-cast v3, La/rgp;

    .line 937
    .line 938
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 939
    .line 940
    .line 941
    invoke-static {v3, v7, v9, v7}, La/rgp;->a(La/rgp;ZZZ)La/rgp;

    .line 942
    .line 943
    .line 944
    move-result-object v3

    .line 945
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 946
    .line 947
    .line 948
    move-result v2

    .line 949
    if-eqz v2, :cond_26

    .line 950
    .line 951
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 952
    .line 953
    return-object v0

    .line 954
    :pswitch_b
    check-cast v10, La/pgp;

    .line 955
    .line 956
    iget-object v0, v10, La/pgp;->M1:La/a8z;

    .line 957
    .line 958
    move-object/from16 v1, p1

    .line 959
    .line 960
    check-cast v1, La/fet;

    .line 961
    .line 962
    move-object/from16 v2, p2

    .line 963
    .line 964
    check-cast v2, Ljava/lang/Integer;

    .line 965
    .line 966
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 967
    .line 968
    .line 969
    move-result v2

    .line 970
    sget-object v3, La/pgp;->P1:La/ddk;

    .line 971
    .line 972
    and-int/lit8 v3, v2, 0x3

    .line 973
    .line 974
    if-eq v3, v8, :cond_27

    .line 975
    .line 976
    move v3, v9

    .line 977
    goto :goto_c

    .line 978
    :cond_27
    move v3, v7

    .line 979
    :goto_c
    and-int/2addr v2, v9

    .line 980
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 981
    .line 982
    .line 983
    move-result v2

    .line 984
    if-eqz v2, :cond_2a

    .line 985
    .line 986
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v2

    .line 990
    check-cast v2, La/k3t0;

    .line 991
    .line 992
    check-cast v2, La/i3t0;

    .line 993
    .line 994
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 995
    .line 996
    .line 997
    move-result-object v2

    .line 998
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object v0

    .line 1002
    move-object v10, v0

    .line 1003
    check-cast v10, La/k3t0;

    .line 1004
    .line 1005
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1006
    .line 1007
    .line 1008
    move-result v0

    .line 1009
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v3

    .line 1013
    if-nez v0, :cond_28

    .line 1014
    .line 1015
    if-ne v3, v5, :cond_29

    .line 1016
    .line 1017
    :cond_28
    new-instance v8, La/k4p;

    .line 1018
    .line 1019
    const/4 v14, 0x0

    .line 1020
    const/16 v15, 0x19

    .line 1021
    .line 1022
    const/4 v9, 0x1

    .line 1023
    const-class v11, La/k3t0;

    .line 1024
    .line 1025
    const-string v12, "onAction"

    .line 1026
    .line 1027
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 1028
    .line 1029
    invoke-direct/range {v8 .. v15}, La/k4p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1033
    .line 1034
    .line 1035
    move-object v3, v8

    .line 1036
    :cond_29
    check-cast v3, La/jhy;

    .line 1037
    .line 1038
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 1039
    .line 1040
    invoke-static {v2, v3, v1, v7}, La/y9a;->w(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1041
    .line 1042
    .line 1043
    goto :goto_d

    .line 1044
    :cond_2a
    invoke-virtual {v1}, La/fet;->X()V

    .line 1045
    .line 1046
    .line 1047
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1048
    .line 1049
    return-object v0

    .line 1050
    :pswitch_c
    check-cast v10, Lorg/xplatform/favorites/impl/presentation/category/f;

    .line 1051
    .line 1052
    move-object/from16 v0, p1

    .line 1053
    .line 1054
    check-cast v0, Ljava/lang/Throwable;

    .line 1055
    .line 1056
    move-object/from16 v1, p2

    .line 1057
    .line 1058
    check-cast v1, Ljava/lang/String;

    .line 1059
    .line 1060
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1064
    .line 1065
    .line 1066
    iget-object v0, v10, Lorg/xplatform/favorites/impl/presentation/category/f;->x:La/p7m0;

    .line 1067
    .line 1068
    new-instance v1, La/oep;

    .line 1069
    .line 1070
    iget-object v2, v10, Lorg/xplatform/favorites/impl/presentation/category/f;->w:La/n0o0;

    .line 1071
    .line 1072
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v2

    .line 1076
    check-cast v2, La/jkm;

    .line 1077
    .line 1078
    invoke-direct {v1, v2}, La/oep;-><init>(La/jkm;)V

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v0, v4, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1085
    .line 1086
    .line 1087
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1088
    .line 1089
    return-object v0

    .line 1090
    :pswitch_d
    check-cast v10, La/s9p;

    .line 1091
    .line 1092
    move-object/from16 v0, p1

    .line 1093
    .line 1094
    check-cast v0, La/oyg0;

    .line 1095
    .line 1096
    move-object/from16 v1, p2

    .line 1097
    .line 1098
    check-cast v1, La/d7p;

    .line 1099
    .line 1100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1104
    .line 1105
    .line 1106
    instance-of v0, v10, La/l9p;

    .line 1107
    .line 1108
    iget-object v2, v1, La/d7p;->b:Ljava/util/Set;

    .line 1109
    .line 1110
    if-eqz v0, :cond_2c

    .line 1111
    .line 1112
    iget-object v0, v1, La/d7p;->a:Ljava/util/List;

    .line 1113
    .line 1114
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 1115
    .line 1116
    .line 1117
    move-result v2

    .line 1118
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1119
    .line 1120
    .line 1121
    move-result v3

    .line 1122
    if-ne v2, v3, :cond_2b

    .line 1123
    .line 1124
    sget-object v0, La/xun;->a:La/xun;

    .line 1125
    .line 1126
    goto :goto_e

    .line 1127
    :cond_2b
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v0

    .line 1131
    goto :goto_e

    .line 1132
    :cond_2c
    invoke-interface {v2, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1133
    .line 1134
    .line 1135
    move-result v0

    .line 1136
    if-eqz v0, :cond_2d

    .line 1137
    .line 1138
    invoke-static {v2, v10}, La/eui0;->e(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v0

    .line 1142
    goto :goto_e

    .line 1143
    :cond_2d
    invoke-static {v2, v10}, La/eui0;->h(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v0

    .line 1147
    :goto_e
    invoke-static {v1, v4, v0, v9}, La/d7p;->a(La/d7p;Ljava/util/List;Ljava/util/Set;I)La/d7p;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v0

    .line 1151
    return-object v0

    .line 1152
    :pswitch_e
    check-cast v10, La/k6p;

    .line 1153
    .line 1154
    move-object/from16 v0, p1

    .line 1155
    .line 1156
    check-cast v0, Ljava/lang/Throwable;

    .line 1157
    .line 1158
    move-object/from16 v1, p2

    .line 1159
    .line 1160
    check-cast v1, Ljava/lang/String;

    .line 1161
    .line 1162
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1169
    .line 1170
    .line 1171
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v11

    .line 1175
    sget-object v12, La/h6p;->a:La/h6p;

    .line 1176
    .line 1177
    iget-object v0, v10, La/k6p;->g:La/mne;

    .line 1178
    .line 1179
    iget-object v14, v0, La/mne;->a:La/rwj;

    .line 1180
    .line 1181
    new-instance v15, La/g6p;

    .line 1182
    .line 1183
    invoke-direct {v15, v10, v4, v9}, La/g6p;-><init>(La/k6p;La/yje;B)V

    .line 1184
    .line 1185
    .line 1186
    const/16 v16, 0xa

    .line 1187
    .line 1188
    const/4 v13, 0x0

    .line 1189
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1190
    .line 1191
    .line 1192
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1193
    .line 1194
    return-object v0

    .line 1195
    :pswitch_f
    move-object v12, v10

    .line 1196
    check-cast v12, La/m4p;

    .line 1197
    .line 1198
    move-object/from16 v0, p1

    .line 1199
    .line 1200
    check-cast v0, La/fet;

    .line 1201
    .line 1202
    move-object/from16 v1, p2

    .line 1203
    .line 1204
    check-cast v1, Ljava/lang/Integer;

    .line 1205
    .line 1206
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1207
    .line 1208
    .line 1209
    move-result v1

    .line 1210
    sget-object v4, La/m4p;->S1:La/bek;

    .line 1211
    .line 1212
    and-int/lit8 v4, v1, 0x3

    .line 1213
    .line 1214
    if-eq v4, v8, :cond_2e

    .line 1215
    .line 1216
    move v4, v9

    .line 1217
    goto :goto_f

    .line 1218
    :cond_2e
    move v4, v7

    .line 1219
    :goto_f
    and-int/2addr v1, v9

    .line 1220
    invoke-virtual {v0, v1, v4}, La/fet;->U(IZ)Z

    .line 1221
    .line 1222
    .line 1223
    move-result v1

    .line 1224
    if-eqz v1, :cond_39

    .line 1225
    .line 1226
    invoke-virtual {v12}, La/m4p;->G0()La/k3t0;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v1

    .line 1230
    invoke-virtual {v0, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1231
    .line 1232
    .line 1233
    move-result v4

    .line 1234
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v8

    .line 1238
    if-nez v4, :cond_2f

    .line 1239
    .line 1240
    if-ne v8, v5, :cond_30

    .line 1241
    .line 1242
    :cond_2f
    new-instance v10, La/hin;

    .line 1243
    .line 1244
    const/16 v16, 0x0

    .line 1245
    .line 1246
    const/16 v17, 0x1d

    .line 1247
    .line 1248
    const/4 v11, 0x1

    .line 1249
    const-class v13, La/m4p;

    .line 1250
    .line 1251
    const-string v14, "handleSideEffect"

    .line 1252
    .line 1253
    const-string v15, "handleSideEffect(Lorg/xplatform/favorites/impl/presentation/category/models/FavoriteCategorySideEffect;)V"

    .line 1254
    .line 1255
    invoke-direct/range {v10 .. v17}, La/hin;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1256
    .line 1257
    .line 1258
    invoke-virtual {v0, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1259
    .line 1260
    .line 1261
    move-object v8, v10

    .line 1262
    :cond_30
    check-cast v8, La/jhy;

    .line 1263
    .line 1264
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 1265
    .line 1266
    sget-object v4, La/lkz;->a:La/lkz;

    .line 1267
    .line 1268
    invoke-static {v8, v0}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v13

    .line 1272
    invoke-virtual {v0, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1273
    .line 1274
    .line 1275
    move-result v4

    .line 1276
    invoke-virtual {v0, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1277
    .line 1278
    .line 1279
    move-result v8

    .line 1280
    or-int/2addr v4, v8

    .line 1281
    invoke-virtual {v0, v6}, La/fet;->e(I)Z

    .line 1282
    .line 1283
    .line 1284
    move-result v8

    .line 1285
    or-int/2addr v4, v8

    .line 1286
    invoke-virtual {v0, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1287
    .line 1288
    .line 1289
    move-result v8

    .line 1290
    or-int/2addr v4, v8

    .line 1291
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v8

    .line 1295
    const/4 v14, 0x0

    .line 1296
    if-nez v4, :cond_32

    .line 1297
    .line 1298
    if-ne v8, v5, :cond_31

    .line 1299
    .line 1300
    goto :goto_10

    .line 1301
    :cond_31
    move-object v1, v14

    .line 1302
    goto :goto_11

    .line 1303
    :cond_32
    :goto_10
    new-instance v10, La/bio;

    .line 1304
    .line 1305
    const/4 v15, 0x4

    .line 1306
    move-object v11, v1

    .line 1307
    invoke-direct/range {v10 .. v15}, La/bio;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 1308
    .line 1309
    .line 1310
    move-object v1, v14

    .line 1311
    invoke-virtual {v0, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1312
    .line 1313
    .line 1314
    move-object v8, v10

    .line 1315
    :goto_11
    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 1316
    .line 1317
    invoke-static {v0, v12, v8}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1318
    .line 1319
    .line 1320
    invoke-virtual {v12}, La/m4p;->G0()La/k3t0;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v4

    .line 1324
    check-cast v4, La/i3t0;

    .line 1325
    .line 1326
    invoke-virtual {v4, v0}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v4

    .line 1330
    invoke-virtual {v0, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1331
    .line 1332
    .line 1333
    move-result v8

    .line 1334
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v10

    .line 1338
    if-nez v8, :cond_33

    .line 1339
    .line 1340
    if-ne v10, v5, :cond_34

    .line 1341
    .line 1342
    :cond_33
    new-instance v10, La/i4p;

    .line 1343
    .line 1344
    invoke-direct {v10, v12, v6}, La/i4p;-><init>(La/m4p;B)V

    .line 1345
    .line 1346
    .line 1347
    invoke-virtual {v0, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1348
    .line 1349
    .line 1350
    :cond_34
    move-object v13, v10

    .line 1351
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 1352
    .line 1353
    invoke-virtual {v0, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1354
    .line 1355
    .line 1356
    move-result v6

    .line 1357
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v8

    .line 1361
    if-nez v6, :cond_35

    .line 1362
    .line 1363
    if-ne v8, v5, :cond_36

    .line 1364
    .line 1365
    :cond_35
    new-instance v8, La/i4p;

    .line 1366
    .line 1367
    invoke-direct {v8, v12, v3}, La/i4p;-><init>(La/m4p;B)V

    .line 1368
    .line 1369
    .line 1370
    invoke-virtual {v0, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1371
    .line 1372
    .line 1373
    :cond_36
    move-object v14, v8

    .line 1374
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 1375
    .line 1376
    const/16 v17, 0x0

    .line 1377
    .line 1378
    const/16 v18, 0x4

    .line 1379
    .line 1380
    const/4 v15, 0x0

    .line 1381
    move-object/from16 v16, v0

    .line 1382
    .line 1383
    invoke-static/range {v13 .. v18}, La/v3c;->A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 1384
    .line 1385
    .line 1386
    invoke-static {v2, v1, v0, v9}, La/yyw;->X(La/mm40;Lkotlin/jvm/functions/Function1;La/fet;I)La/mm40;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v2

    .line 1390
    invoke-static {v2, v1, v9}, La/phu0;->H(La/mm40;La/ltc;I)La/mm40;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v1

    .line 1394
    invoke-virtual {v12}, La/m4p;->G0()La/k3t0;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v15

    .line 1398
    invoke-virtual {v0, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1399
    .line 1400
    .line 1401
    move-result v2

    .line 1402
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v3

    .line 1406
    if-nez v2, :cond_37

    .line 1407
    .line 1408
    if-ne v3, v5, :cond_38

    .line 1409
    .line 1410
    :cond_37
    new-instance v13, La/k4p;

    .line 1411
    .line 1412
    const/16 v19, 0x0

    .line 1413
    .line 1414
    const/16 v20, 0x0

    .line 1415
    .line 1416
    const/4 v14, 0x1

    .line 1417
    const-class v16, La/k3t0;

    .line 1418
    .line 1419
    const-string v17, "onAction"

    .line 1420
    .line 1421
    const-string v18, "onAction(Ljava/lang/Object;)V"

    .line 1422
    .line 1423
    invoke-direct/range {v13 .. v20}, La/k4p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v0, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1427
    .line 1428
    .line 1429
    move-object v3, v13

    .line 1430
    :cond_38
    check-cast v3, La/jhy;

    .line 1431
    .line 1432
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 1433
    .line 1434
    invoke-static {v7, v0, v1, v4, v3}, La/p8a;->u(ILa/fet;La/mm40;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 1435
    .line 1436
    .line 1437
    goto :goto_12

    .line 1438
    :cond_39
    invoke-virtual {v0}, La/fet;->X()V

    .line 1439
    .line 1440
    .line 1441
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1442
    .line 1443
    return-object v0

    .line 1444
    :pswitch_10
    move-object v0, v10

    .line 1445
    check-cast v0, La/i3p;

    .line 1446
    .line 1447
    move-object/from16 v1, p1

    .line 1448
    .line 1449
    check-cast v1, Ljava/lang/Throwable;

    .line 1450
    .line 1451
    move-object/from16 v2, p2

    .line 1452
    .line 1453
    check-cast v2, Ljava/lang/String;

    .line 1454
    .line 1455
    invoke-static {v2, v1}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1456
    .line 1457
    .line 1458
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 1459
    .line 1460
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 1461
    .line 1462
    :cond_3a
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v2

    .line 1466
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1467
    .line 1468
    .line 1469
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 1470
    .line 1471
    move-object v4, v2

    .line 1472
    check-cast v4, La/w2p;

    .line 1473
    .line 1474
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1475
    .line 1476
    .line 1477
    const/4 v9, 0x0

    .line 1478
    const/16 v10, 0x7a

    .line 1479
    .line 1480
    const/4 v5, 0x0

    .line 1481
    const/4 v6, 0x0

    .line 1482
    const/4 v7, 0x1

    .line 1483
    const/4 v8, 0x0

    .line 1484
    invoke-static/range {v4 .. v10}, La/w2p;->a(La/w2p;ZZZLjava/util/List;La/wcb;I)La/w2p;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v3

    .line 1488
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1489
    .line 1490
    .line 1491
    move-result v2

    .line 1492
    if-eqz v2, :cond_3a

    .line 1493
    .line 1494
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1495
    .line 1496
    return-object v0

    .line 1497
    :pswitch_11
    move-object v12, v10

    .line 1498
    check-cast v12, La/t2p;

    .line 1499
    .line 1500
    iget-object v0, v12, La/t2p;->M1:La/a8z;

    .line 1501
    .line 1502
    move-object/from16 v1, p1

    .line 1503
    .line 1504
    check-cast v1, La/fet;

    .line 1505
    .line 1506
    move-object/from16 v3, p2

    .line 1507
    .line 1508
    check-cast v3, Ljava/lang/Integer;

    .line 1509
    .line 1510
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1511
    .line 1512
    .line 1513
    move-result v3

    .line 1514
    sget-object v4, La/t2p;->O1:La/ddk;

    .line 1515
    .line 1516
    and-int/lit8 v4, v3, 0x3

    .line 1517
    .line 1518
    if-eq v4, v8, :cond_3b

    .line 1519
    .line 1520
    move v7, v9

    .line 1521
    :cond_3b
    and-int/2addr v3, v9

    .line 1522
    invoke-virtual {v1, v3, v7}, La/fet;->U(IZ)Z

    .line 1523
    .line 1524
    .line 1525
    move-result v3

    .line 1526
    if-eqz v3, :cond_42

    .line 1527
    .line 1528
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v3

    .line 1532
    check-cast v3, La/k3t0;

    .line 1533
    .line 1534
    invoke-virtual {v1, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1535
    .line 1536
    .line 1537
    move-result v4

    .line 1538
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v7

    .line 1542
    if-nez v4, :cond_3c

    .line 1543
    .line 1544
    if-ne v7, v5, :cond_3d

    .line 1545
    .line 1546
    :cond_3c
    new-instance v10, La/hin;

    .line 1547
    .line 1548
    const/16 v16, 0x0

    .line 1549
    .line 1550
    const/16 v17, 0x18

    .line 1551
    .line 1552
    const/4 v11, 0x1

    .line 1553
    const-class v13, La/t2p;

    .line 1554
    .line 1555
    const-string v14, "handleSideEffect"

    .line 1556
    .line 1557
    const-string v15, "handleSideEffect(Lorg/xplatform/favorites/impl/presentation/all_champs/compose/models/FavoriteAltChampsSideEffect;)V"

    .line 1558
    .line 1559
    invoke-direct/range {v10 .. v17}, La/hin;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1560
    .line 1561
    .line 1562
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1563
    .line 1564
    .line 1565
    move-object v7, v10

    .line 1566
    :cond_3d
    check-cast v7, La/jhy;

    .line 1567
    .line 1568
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 1569
    .line 1570
    sget-object v4, La/lkz;->a:La/lkz;

    .line 1571
    .line 1572
    invoke-static {v7, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v13

    .line 1576
    invoke-virtual {v1, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1577
    .line 1578
    .line 1579
    move-result v4

    .line 1580
    invoke-virtual {v1, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1581
    .line 1582
    .line 1583
    move-result v7

    .line 1584
    or-int/2addr v4, v7

    .line 1585
    invoke-virtual {v1, v6}, La/fet;->e(I)Z

    .line 1586
    .line 1587
    .line 1588
    move-result v6

    .line 1589
    or-int/2addr v4, v6

    .line 1590
    invoke-virtual {v1, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1591
    .line 1592
    .line 1593
    move-result v6

    .line 1594
    or-int/2addr v4, v6

    .line 1595
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v6

    .line 1599
    const/4 v14, 0x0

    .line 1600
    if-nez v4, :cond_3e

    .line 1601
    .line 1602
    if-ne v6, v5, :cond_3f

    .line 1603
    .line 1604
    :cond_3e
    new-instance v10, La/bio;

    .line 1605
    .line 1606
    const/4 v15, 0x3

    .line 1607
    move-object v11, v3

    .line 1608
    invoke-direct/range {v10 .. v15}, La/bio;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 1609
    .line 1610
    .line 1611
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1612
    .line 1613
    .line 1614
    move-object v6, v10

    .line 1615
    :cond_3f
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 1616
    .line 1617
    invoke-static {v1, v12, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1618
    .line 1619
    .line 1620
    invoke-static {v2, v14, v9}, La/phu0;->H(La/mm40;La/ltc;I)La/mm40;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v13

    .line 1624
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v2

    .line 1628
    check-cast v2, La/k3t0;

    .line 1629
    .line 1630
    check-cast v2, La/i3t0;

    .line 1631
    .line 1632
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v14

    .line 1636
    iget-object v2, v12, La/t2p;->N1:La/a8z;

    .line 1637
    .line 1638
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v2

    .line 1642
    move-object v15, v2

    .line 1643
    check-cast v15, La/bdz;

    .line 1644
    .line 1645
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v0

    .line 1649
    check-cast v0, La/k3t0;

    .line 1650
    .line 1651
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1652
    .line 1653
    .line 1654
    move-result v2

    .line 1655
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v3

    .line 1659
    if-nez v2, :cond_40

    .line 1660
    .line 1661
    if-ne v3, v5, :cond_41

    .line 1662
    .line 1663
    :cond_40
    new-instance v16, La/hin;

    .line 1664
    .line 1665
    const/16 v22, 0x0

    .line 1666
    .line 1667
    const/16 v23, 0x19

    .line 1668
    .line 1669
    const/16 v17, 0x1

    .line 1670
    .line 1671
    const-class v19, La/k3t0;

    .line 1672
    .line 1673
    const-string v20, "onAction"

    .line 1674
    .line 1675
    const-string v21, "onAction(Ljava/lang/Object;)V"

    .line 1676
    .line 1677
    move-object/from16 v18, v0

    .line 1678
    .line 1679
    invoke-direct/range {v16 .. v23}, La/hin;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1680
    .line 1681
    .line 1682
    move-object/from16 v3, v16

    .line 1683
    .line 1684
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1685
    .line 1686
    .line 1687
    :cond_41
    check-cast v3, La/jhy;

    .line 1688
    .line 1689
    move-object/from16 v16, v3

    .line 1690
    .line 1691
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 1692
    .line 1693
    const/16 v18, 0x0

    .line 1694
    .line 1695
    move-object/from16 v17, v1

    .line 1696
    .line 1697
    invoke-static/range {v13 .. v18}, La/ny9;->q(La/mm40;La/l7m0;La/bdz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1698
    .line 1699
    .line 1700
    goto :goto_13

    .line 1701
    :cond_42
    move-object/from16 v17, v1

    .line 1702
    .line 1703
    invoke-virtual/range {v17 .. v17}, La/fet;->X()V

    .line 1704
    .line 1705
    .line 1706
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1707
    .line 1708
    return-object v0

    .line 1709
    :pswitch_12
    check-cast v10, La/gzo;

    .line 1710
    .line 1711
    move-object/from16 v0, p1

    .line 1712
    .line 1713
    check-cast v0, Ljava/lang/Throwable;

    .line 1714
    .line 1715
    move-object/from16 v1, p2

    .line 1716
    .line 1717
    check-cast v1, Ljava/lang/String;

    .line 1718
    .line 1719
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1720
    .line 1721
    .line 1722
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1723
    .line 1724
    .line 1725
    new-instance v2, La/uyo;

    .line 1726
    .line 1727
    sget-object v3, La/rek0;->b:La/rek0;

    .line 1728
    .line 1729
    invoke-direct {v2, v3, v1}, La/uyo;-><init>(La/sek0;Ljava/lang/String;)V

    .line 1730
    .line 1731
    .line 1732
    invoke-virtual {v10, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1733
    .line 1734
    .line 1735
    iget-object v1, v10, La/gzo;->y:La/rjo;

    .line 1736
    .line 1737
    invoke-virtual {v1, v0}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 1738
    .line 1739
    .line 1740
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1741
    .line 1742
    return-object v0

    .line 1743
    :pswitch_13
    check-cast v10, La/byo;

    .line 1744
    .line 1745
    move-object/from16 v14, p1

    .line 1746
    .line 1747
    check-cast v14, La/fet;

    .line 1748
    .line 1749
    move-object/from16 v0, p2

    .line 1750
    .line 1751
    check-cast v0, Ljava/lang/Integer;

    .line 1752
    .line 1753
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1754
    .line 1755
    .line 1756
    move-result v0

    .line 1757
    sget-object v1, La/byo;->P1:La/bek;

    .line 1758
    .line 1759
    and-int/lit8 v1, v0, 0x3

    .line 1760
    .line 1761
    if-eq v1, v8, :cond_43

    .line 1762
    .line 1763
    move v7, v9

    .line 1764
    :cond_43
    and-int/2addr v0, v9

    .line 1765
    invoke-virtual {v14, v0, v7}, La/fet;->U(IZ)Z

    .line 1766
    .line 1767
    .line 1768
    move-result v0

    .line 1769
    if-eqz v0, :cond_4e

    .line 1770
    .line 1771
    invoke-virtual {v14, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1772
    .line 1773
    .line 1774
    move-result v0

    .line 1775
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v1

    .line 1779
    if-nez v0, :cond_44

    .line 1780
    .line 1781
    if-ne v1, v5, :cond_45

    .line 1782
    .line 1783
    :cond_44
    new-instance v1, La/zxo;

    .line 1784
    .line 1785
    invoke-direct {v1, v10, v6}, La/zxo;-><init>(La/byo;B)V

    .line 1786
    .line 1787
    .line 1788
    invoke-virtual {v14, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1789
    .line 1790
    .line 1791
    :cond_45
    move-object v11, v1

    .line 1792
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 1793
    .line 1794
    invoke-virtual {v14, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1795
    .line 1796
    .line 1797
    move-result v0

    .line 1798
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v1

    .line 1802
    if-nez v0, :cond_46

    .line 1803
    .line 1804
    if-ne v1, v5, :cond_47

    .line 1805
    .line 1806
    :cond_46
    new-instance v1, La/zxo;

    .line 1807
    .line 1808
    invoke-direct {v1, v10, v3}, La/zxo;-><init>(La/byo;B)V

    .line 1809
    .line 1810
    .line 1811
    invoke-virtual {v14, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1812
    .line 1813
    .line 1814
    :cond_47
    move-object v12, v1

    .line 1815
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 1816
    .line 1817
    const/4 v15, 0x0

    .line 1818
    const/16 v16, 0x4

    .line 1819
    .line 1820
    const/4 v13, 0x0

    .line 1821
    invoke-static/range {v11 .. v16}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 1822
    .line 1823
    .line 1824
    move-object v0, v14

    .line 1825
    invoke-virtual {v10}, La/byo;->H0()La/k3t0;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v1

    .line 1829
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1830
    .line 1831
    .line 1832
    move-result v2

    .line 1833
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v3

    .line 1837
    if-nez v2, :cond_49

    .line 1838
    .line 1839
    if-ne v3, v5, :cond_48

    .line 1840
    .line 1841
    goto :goto_14

    .line 1842
    :cond_48
    move-object v9, v10

    .line 1843
    goto :goto_15

    .line 1844
    :cond_49
    :goto_14
    new-instance v7, La/hin;

    .line 1845
    .line 1846
    const/4 v13, 0x0

    .line 1847
    const/16 v14, 0x14

    .line 1848
    .line 1849
    const/4 v8, 0x1

    .line 1850
    move-object v9, v10

    .line 1851
    const-class v10, La/byo;

    .line 1852
    .line 1853
    const-string v11, "handleSideEffects"

    .line 1854
    .line 1855
    const-string v12, "handleSideEffects(Lorg/xplatform/security/impl/presentation/password/change/fast_change_password/models/FastChangePasswordSideEffect;)V"

    .line 1856
    .line 1857
    invoke-direct/range {v7 .. v14}, La/hin;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1858
    .line 1859
    .line 1860
    invoke-virtual {v0, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1861
    .line 1862
    .line 1863
    move-object v3, v7

    .line 1864
    :goto_15
    check-cast v3, La/jhy;

    .line 1865
    .line 1866
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 1867
    .line 1868
    sget-object v2, La/lkz;->a:La/lkz;

    .line 1869
    .line 1870
    invoke-static {v3, v0}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v2

    .line 1874
    invoke-virtual {v0, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1875
    .line 1876
    .line 1877
    move-result v3

    .line 1878
    invoke-virtual {v0, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1879
    .line 1880
    .line 1881
    move-result v4

    .line 1882
    or-int/2addr v3, v4

    .line 1883
    invoke-virtual {v0, v6}, La/fet;->e(I)Z

    .line 1884
    .line 1885
    .line 1886
    move-result v4

    .line 1887
    or-int/2addr v3, v4

    .line 1888
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1889
    .line 1890
    .line 1891
    move-result v4

    .line 1892
    or-int/2addr v3, v4

    .line 1893
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1894
    .line 1895
    .line 1896
    move-result-object v4

    .line 1897
    if-nez v3, :cond_4a

    .line 1898
    .line 1899
    if-ne v4, v5, :cond_4b

    .line 1900
    .line 1901
    :cond_4a
    new-instance v6, La/bio;

    .line 1902
    .line 1903
    const/4 v10, 0x0

    .line 1904
    const/4 v11, 0x2

    .line 1905
    move-object v7, v1

    .line 1906
    move-object v8, v9

    .line 1907
    move-object v9, v2

    .line 1908
    invoke-direct/range {v6 .. v11}, La/bio;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 1909
    .line 1910
    .line 1911
    move-object v9, v8

    .line 1912
    invoke-virtual {v0, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1913
    .line 1914
    .line 1915
    move-object v4, v6

    .line 1916
    :cond_4b
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 1917
    .line 1918
    invoke-static {v0, v9, v4}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1919
    .line 1920
    .line 1921
    invoke-virtual {v9}, La/byo;->H0()La/k3t0;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v1

    .line 1925
    check-cast v1, La/i3t0;

    .line 1926
    .line 1927
    invoke-virtual {v1, v0}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1928
    .line 1929
    .line 1930
    move-result-object v1

    .line 1931
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1932
    .line 1933
    .line 1934
    move-result-object v1

    .line 1935
    check-cast v1, La/yyo;

    .line 1936
    .line 1937
    invoke-virtual {v9}, La/byo;->H0()La/k3t0;

    .line 1938
    .line 1939
    .line 1940
    move-result-object v12

    .line 1941
    invoke-virtual {v0, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1942
    .line 1943
    .line 1944
    move-result v2

    .line 1945
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v3

    .line 1949
    if-nez v2, :cond_4c

    .line 1950
    .line 1951
    if-ne v3, v5, :cond_4d

    .line 1952
    .line 1953
    :cond_4c
    new-instance v10, La/hin;

    .line 1954
    .line 1955
    const/16 v16, 0x0

    .line 1956
    .line 1957
    const/16 v17, 0x15

    .line 1958
    .line 1959
    const/4 v11, 0x1

    .line 1960
    const-class v13, La/k3t0;

    .line 1961
    .line 1962
    const-string v14, "onAction"

    .line 1963
    .line 1964
    const-string v15, "onAction(Ljava/lang/Object;)V"

    .line 1965
    .line 1966
    invoke-direct/range {v10 .. v17}, La/hin;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1967
    .line 1968
    .line 1969
    invoke-virtual {v0, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1970
    .line 1971
    .line 1972
    move-object v3, v10

    .line 1973
    :cond_4d
    check-cast v3, La/jhy;

    .line 1974
    .line 1975
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 1976
    .line 1977
    const/4 v2, 0x6

    .line 1978
    invoke-static {v1, v3, v0, v2}, La/dj8;->v(La/yyo;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1979
    .line 1980
    .line 1981
    goto :goto_16

    .line 1982
    :cond_4e
    move-object v0, v14

    .line 1983
    invoke-virtual {v0}, La/fet;->X()V

    .line 1984
    .line 1985
    .line 1986
    :goto_16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1987
    .line 1988
    return-object v0

    .line 1989
    :pswitch_14
    check-cast v10, La/vvo;

    .line 1990
    .line 1991
    move-object/from16 v0, p1

    .line 1992
    .line 1993
    check-cast v0, La/fet;

    .line 1994
    .line 1995
    move-object/from16 v1, p2

    .line 1996
    .line 1997
    check-cast v1, Ljava/lang/Integer;

    .line 1998
    .line 1999
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2000
    .line 2001
    .line 2002
    const/16 v1, 0x9

    .line 2003
    .line 2004
    invoke-static {v1}, La/x8x;->L(I)I

    .line 2005
    .line 2006
    .line 2007
    move-result v1

    .line 2008
    invoke-static {v10, v0, v1}, La/xbc;->C(La/vvo;La/fet;I)V

    .line 2009
    .line 2010
    .line 2011
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2012
    .line 2013
    return-object v0

    .line 2014
    :pswitch_15
    check-cast v10, La/ivo;

    .line 2015
    .line 2016
    iget-object v0, v10, La/ivo;->N1:La/a8z;

    .line 2017
    .line 2018
    move-object/from16 v1, p1

    .line 2019
    .line 2020
    check-cast v1, La/fet;

    .line 2021
    .line 2022
    move-object/from16 v2, p2

    .line 2023
    .line 2024
    check-cast v2, Ljava/lang/Integer;

    .line 2025
    .line 2026
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2027
    .line 2028
    .line 2029
    move-result v2

    .line 2030
    sget-object v3, La/ivo;->P1:La/xak;

    .line 2031
    .line 2032
    and-int/lit8 v3, v2, 0x3

    .line 2033
    .line 2034
    if-eq v3, v8, :cond_4f

    .line 2035
    .line 2036
    move v3, v9

    .line 2037
    goto :goto_17

    .line 2038
    :cond_4f
    move v3, v7

    .line 2039
    :goto_17
    and-int/2addr v2, v9

    .line 2040
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 2041
    .line 2042
    .line 2043
    move-result v2

    .line 2044
    if-eqz v2, :cond_52

    .line 2045
    .line 2046
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2047
    .line 2048
    .line 2049
    move-result-object v2

    .line 2050
    check-cast v2, La/k3t0;

    .line 2051
    .line 2052
    check-cast v2, La/i3t0;

    .line 2053
    .line 2054
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 2055
    .line 2056
    .line 2057
    move-result-object v2

    .line 2058
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2059
    .line 2060
    .line 2061
    move-result-object v0

    .line 2062
    move-object v10, v0

    .line 2063
    check-cast v10, La/k3t0;

    .line 2064
    .line 2065
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2066
    .line 2067
    .line 2068
    move-result v0

    .line 2069
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2070
    .line 2071
    .line 2072
    move-result-object v3

    .line 2073
    if-nez v0, :cond_50

    .line 2074
    .line 2075
    if-ne v3, v5, :cond_51

    .line 2076
    .line 2077
    :cond_50
    new-instance v8, La/hin;

    .line 2078
    .line 2079
    const/4 v14, 0x0

    .line 2080
    const/16 v15, 0x12

    .line 2081
    .line 2082
    const/4 v9, 0x1

    .line 2083
    const-class v11, La/k3t0;

    .line 2084
    .line 2085
    const-string v12, "onAction"

    .line 2086
    .line 2087
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 2088
    .line 2089
    invoke-direct/range {v8 .. v15}, La/hin;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2090
    .line 2091
    .line 2092
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2093
    .line 2094
    .line 2095
    move-object v3, v8

    .line 2096
    :cond_51
    check-cast v3, La/jhy;

    .line 2097
    .line 2098
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 2099
    .line 2100
    invoke-static {v2, v3, v1, v7}, La/xbc;->v(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 2101
    .line 2102
    .line 2103
    goto :goto_18

    .line 2104
    :cond_52
    invoke-virtual {v1}, La/fet;->X()V

    .line 2105
    .line 2106
    .line 2107
    :goto_18
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2108
    .line 2109
    return-object v0

    .line 2110
    :pswitch_16
    check-cast v10, La/wm7;

    .line 2111
    .line 2112
    move-object/from16 v0, p1

    .line 2113
    .line 2114
    check-cast v0, La/fet;

    .line 2115
    .line 2116
    move-object/from16 v1, p2

    .line 2117
    .line 2118
    check-cast v1, Ljava/lang/Integer;

    .line 2119
    .line 2120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2121
    .line 2122
    .line 2123
    invoke-static {v9}, La/x8x;->L(I)I

    .line 2124
    .line 2125
    .line 2126
    move-result v1

    .line 2127
    invoke-static {v10, v0, v1}, La/kbc;->J(La/wm7;La/fet;I)V

    .line 2128
    .line 2129
    .line 2130
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2131
    .line 2132
    return-object v0

    .line 2133
    :pswitch_17
    check-cast v10, La/kqo;

    .line 2134
    .line 2135
    iget-object v0, v10, La/kqo;->N1:La/a8z;

    .line 2136
    .line 2137
    move-object/from16 v1, p1

    .line 2138
    .line 2139
    check-cast v1, La/fet;

    .line 2140
    .line 2141
    move-object/from16 v2, p2

    .line 2142
    .line 2143
    check-cast v2, Ljava/lang/Integer;

    .line 2144
    .line 2145
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2146
    .line 2147
    .line 2148
    move-result v2

    .line 2149
    sget-object v3, La/kqo;->P1:La/pek;

    .line 2150
    .line 2151
    and-int/lit8 v3, v2, 0x3

    .line 2152
    .line 2153
    if-eq v3, v8, :cond_53

    .line 2154
    .line 2155
    move v3, v9

    .line 2156
    goto :goto_19

    .line 2157
    :cond_53
    move v3, v7

    .line 2158
    :goto_19
    and-int/2addr v2, v9

    .line 2159
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 2160
    .line 2161
    .line 2162
    move-result v2

    .line 2163
    if-eqz v2, :cond_5a

    .line 2164
    .line 2165
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2166
    .line 2167
    .line 2168
    move-result-object v2

    .line 2169
    check-cast v2, La/k3t0;

    .line 2170
    .line 2171
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2172
    .line 2173
    .line 2174
    move-result v3

    .line 2175
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v4

    .line 2179
    if-nez v3, :cond_54

    .line 2180
    .line 2181
    if-ne v4, v5, :cond_55

    .line 2182
    .line 2183
    :cond_54
    new-instance v8, La/hin;

    .line 2184
    .line 2185
    const/4 v14, 0x0

    .line 2186
    const/16 v15, 0x10

    .line 2187
    .line 2188
    const/4 v9, 0x1

    .line 2189
    const-class v11, La/kqo;

    .line 2190
    .line 2191
    const-string v12, "handleSideEffect"

    .line 2192
    .line 2193
    const-string v13, "handleSideEffect(Lorg/xplatform/feature/dayexpress/impl/presentation/fragment/compose/models/ExpressEventsSideEffect;)V"

    .line 2194
    .line 2195
    invoke-direct/range {v8 .. v15}, La/hin;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2196
    .line 2197
    .line 2198
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2199
    .line 2200
    .line 2201
    move-object v4, v8

    .line 2202
    :cond_55
    check-cast v4, La/jhy;

    .line 2203
    .line 2204
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 2205
    .line 2206
    sget-object v3, La/lkz;->a:La/lkz;

    .line 2207
    .line 2208
    invoke-static {v4, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 2209
    .line 2210
    .line 2211
    move-result-object v11

    .line 2212
    invoke-virtual {v1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2213
    .line 2214
    .line 2215
    move-result v3

    .line 2216
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2217
    .line 2218
    .line 2219
    move-result v4

    .line 2220
    or-int/2addr v3, v4

    .line 2221
    invoke-virtual {v1, v6}, La/fet;->e(I)Z

    .line 2222
    .line 2223
    .line 2224
    move-result v4

    .line 2225
    or-int/2addr v3, v4

    .line 2226
    invoke-virtual {v1, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2227
    .line 2228
    .line 2229
    move-result v4

    .line 2230
    or-int/2addr v3, v4

    .line 2231
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2232
    .line 2233
    .line 2234
    move-result-object v4

    .line 2235
    if-nez v3, :cond_56

    .line 2236
    .line 2237
    if-ne v4, v5, :cond_57

    .line 2238
    .line 2239
    :cond_56
    new-instance v8, La/bio;

    .line 2240
    .line 2241
    const/4 v12, 0x0

    .line 2242
    const/4 v13, 0x1

    .line 2243
    move-object v9, v2

    .line 2244
    invoke-direct/range {v8 .. v13}, La/bio;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 2245
    .line 2246
    .line 2247
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2248
    .line 2249
    .line 2250
    move-object v4, v8

    .line 2251
    :cond_57
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 2252
    .line 2253
    invoke-static {v1, v10, v4}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2254
    .line 2255
    .line 2256
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2257
    .line 2258
    .line 2259
    move-result-object v2

    .line 2260
    check-cast v2, La/k3t0;

    .line 2261
    .line 2262
    check-cast v2, La/i3t0;

    .line 2263
    .line 2264
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 2265
    .line 2266
    .line 2267
    move-result-object v2

    .line 2268
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2269
    .line 2270
    .line 2271
    move-result-object v2

    .line 2272
    check-cast v2, La/qqo;

    .line 2273
    .line 2274
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2275
    .line 2276
    .line 2277
    move-result-object v0

    .line 2278
    move-object v10, v0

    .line 2279
    check-cast v10, La/k3t0;

    .line 2280
    .line 2281
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2282
    .line 2283
    .line 2284
    move-result v0

    .line 2285
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2286
    .line 2287
    .line 2288
    move-result-object v3

    .line 2289
    if-nez v0, :cond_58

    .line 2290
    .line 2291
    if-ne v3, v5, :cond_59

    .line 2292
    .line 2293
    :cond_58
    new-instance v8, La/hin;

    .line 2294
    .line 2295
    const/4 v14, 0x0

    .line 2296
    const/16 v15, 0x11

    .line 2297
    .line 2298
    const/4 v9, 0x1

    .line 2299
    const-class v11, La/k3t0;

    .line 2300
    .line 2301
    const-string v12, "onAction"

    .line 2302
    .line 2303
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 2304
    .line 2305
    invoke-direct/range {v8 .. v15}, La/hin;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2306
    .line 2307
    .line 2308
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2309
    .line 2310
    .line 2311
    move-object v3, v8

    .line 2312
    :cond_59
    check-cast v3, La/jhy;

    .line 2313
    .line 2314
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 2315
    .line 2316
    invoke-static {v2, v3, v1, v7}, La/jd8;->B(La/qqo;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 2317
    .line 2318
    .line 2319
    goto :goto_1a

    .line 2320
    :cond_5a
    invoke-virtual {v1}, La/fet;->X()V

    .line 2321
    .line 2322
    .line 2323
    :goto_1a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2324
    .line 2325
    return-object v0

    .line 2326
    :pswitch_18
    check-cast v10, La/chl0;

    .line 2327
    .line 2328
    move-object/from16 v0, p1

    .line 2329
    .line 2330
    check-cast v0, La/fet;

    .line 2331
    .line 2332
    move-object/from16 v1, p2

    .line 2333
    .line 2334
    check-cast v1, Ljava/lang/Integer;

    .line 2335
    .line 2336
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2337
    .line 2338
    .line 2339
    move-result v1

    .line 2340
    sget v2, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;->r:I

    .line 2341
    .line 2342
    and-int/lit8 v2, v1, 0x3

    .line 2343
    .line 2344
    if-eq v2, v8, :cond_5b

    .line 2345
    .line 2346
    move v7, v9

    .line 2347
    :cond_5b
    and-int/2addr v1, v9

    .line 2348
    invoke-virtual {v0, v1, v7}, La/fet;->U(IZ)Z

    .line 2349
    .line 2350
    .line 2351
    move-result v1

    .line 2352
    if-eqz v1, :cond_5c

    .line 2353
    .line 2354
    invoke-static {v10, v0}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 2355
    .line 2356
    .line 2357
    move-result-object v12

    .line 2358
    sget-object v13, La/vqo;->e:La/gil0;

    .line 2359
    .line 2360
    const/16 v17, 0x0

    .line 2361
    .line 2362
    const/16 v18, 0x19

    .line 2363
    .line 2364
    const/4 v11, 0x0

    .line 2365
    const/4 v14, 0x0

    .line 2366
    const/4 v15, 0x0

    .line 2367
    move-object/from16 v16, v0

    .line 2368
    .line 2369
    invoke-static/range {v11 .. v18}, La/vfc;->q(La/mm40;La/l7m0;La/qil0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 2370
    .line 2371
    .line 2372
    goto :goto_1b

    .line 2373
    :cond_5c
    move-object/from16 v16, v0

    .line 2374
    .line 2375
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 2376
    .line 2377
    .line 2378
    :goto_1b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2379
    .line 2380
    return-object v0

    .line 2381
    :pswitch_19
    move-object v12, v10

    .line 2382
    check-cast v12, La/k8o;

    .line 2383
    .line 2384
    move-object/from16 v0, p1

    .line 2385
    .line 2386
    check-cast v0, La/fet;

    .line 2387
    .line 2388
    move-object/from16 v1, p2

    .line 2389
    .line 2390
    check-cast v1, Ljava/lang/Integer;

    .line 2391
    .line 2392
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2393
    .line 2394
    .line 2395
    move-result v1

    .line 2396
    and-int/lit8 v2, v1, 0x3

    .line 2397
    .line 2398
    if-eq v2, v8, :cond_5d

    .line 2399
    .line 2400
    move v7, v9

    .line 2401
    :cond_5d
    and-int/2addr v1, v9

    .line 2402
    invoke-virtual {v0, v1, v7}, La/fet;->U(IZ)Z

    .line 2403
    .line 2404
    .line 2405
    move-result v1

    .line 2406
    if-eqz v1, :cond_6a

    .line 2407
    .line 2408
    invoke-virtual {v0, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2409
    .line 2410
    .line 2411
    move-result v1

    .line 2412
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2413
    .line 2414
    .line 2415
    move-result-object v2

    .line 2416
    if-nez v1, :cond_5e

    .line 2417
    .line 2418
    if-ne v2, v5, :cond_5f

    .line 2419
    .line 2420
    :cond_5e
    new-instance v2, La/j8o;

    .line 2421
    .line 2422
    invoke-direct {v2, v12, v9}, La/j8o;-><init>(La/k8o;B)V

    .line 2423
    .line 2424
    .line 2425
    invoke-virtual {v0, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2426
    .line 2427
    .line 2428
    :cond_5f
    move-object v13, v2

    .line 2429
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 2430
    .line 2431
    invoke-virtual {v0, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2432
    .line 2433
    .line 2434
    move-result v1

    .line 2435
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2436
    .line 2437
    .line 2438
    move-result-object v2

    .line 2439
    if-nez v1, :cond_60

    .line 2440
    .line 2441
    if-ne v2, v5, :cond_61

    .line 2442
    .line 2443
    :cond_60
    new-instance v2, La/j8o;

    .line 2444
    .line 2445
    invoke-direct {v2, v12, v8}, La/j8o;-><init>(La/k8o;B)V

    .line 2446
    .line 2447
    .line 2448
    invoke-virtual {v0, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2449
    .line 2450
    .line 2451
    :cond_61
    move-object v14, v2

    .line 2452
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 2453
    .line 2454
    const/16 v17, 0x0

    .line 2455
    .line 2456
    const/16 v18, 0x4

    .line 2457
    .line 2458
    const/4 v15, 0x0

    .line 2459
    move-object/from16 v16, v0

    .line 2460
    .line 2461
    invoke-static/range {v13 .. v18}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 2462
    .line 2463
    .line 2464
    invoke-virtual {v12}, La/k8o;->G0()La/k3t0;

    .line 2465
    .line 2466
    .line 2467
    move-result-object v1

    .line 2468
    invoke-virtual {v0, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2469
    .line 2470
    .line 2471
    move-result v2

    .line 2472
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2473
    .line 2474
    .line 2475
    move-result-object v3

    .line 2476
    if-nez v2, :cond_62

    .line 2477
    .line 2478
    if-ne v3, v5, :cond_63

    .line 2479
    .line 2480
    :cond_62
    new-instance v10, La/hin;

    .line 2481
    .line 2482
    const/16 v16, 0x0

    .line 2483
    .line 2484
    const/16 v17, 0xc

    .line 2485
    .line 2486
    const/4 v11, 0x1

    .line 2487
    const-class v13, La/k8o;

    .line 2488
    .line 2489
    const-string v14, "handleSideEffect"

    .line 2490
    .line 2491
    const-string v15, "handleSideEffect(Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/model/EsportsWorldCupSideEffect;)V"

    .line 2492
    .line 2493
    invoke-direct/range {v10 .. v17}, La/hin;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2494
    .line 2495
    .line 2496
    invoke-virtual {v0, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2497
    .line 2498
    .line 2499
    move-object v3, v10

    .line 2500
    :cond_63
    check-cast v3, La/jhy;

    .line 2501
    .line 2502
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 2503
    .line 2504
    sget-object v2, La/lkz;->a:La/lkz;

    .line 2505
    .line 2506
    invoke-static {v3, v0}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 2507
    .line 2508
    .line 2509
    move-result-object v13

    .line 2510
    invoke-virtual {v0, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2511
    .line 2512
    .line 2513
    move-result v2

    .line 2514
    invoke-virtual {v0, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2515
    .line 2516
    .line 2517
    move-result v3

    .line 2518
    or-int/2addr v2, v3

    .line 2519
    invoke-virtual {v0, v6}, La/fet;->e(I)Z

    .line 2520
    .line 2521
    .line 2522
    move-result v3

    .line 2523
    or-int/2addr v2, v3

    .line 2524
    invoke-virtual {v0, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2525
    .line 2526
    .line 2527
    move-result v3

    .line 2528
    or-int/2addr v2, v3

    .line 2529
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2530
    .line 2531
    .line 2532
    move-result-object v3

    .line 2533
    if-nez v2, :cond_64

    .line 2534
    .line 2535
    if-ne v3, v5, :cond_65

    .line 2536
    .line 2537
    :cond_64
    new-instance v10, La/ua7;

    .line 2538
    .line 2539
    const/4 v14, 0x0

    .line 2540
    const/16 v15, 0x1d

    .line 2541
    .line 2542
    move-object v11, v1

    .line 2543
    invoke-direct/range {v10 .. v15}, La/ua7;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 2544
    .line 2545
    .line 2546
    invoke-virtual {v0, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2547
    .line 2548
    .line 2549
    move-object v3, v10

    .line 2550
    :cond_65
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 2551
    .line 2552
    invoke-static {v0, v12, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2553
    .line 2554
    .line 2555
    invoke-virtual {v12}, La/k8o;->G0()La/k3t0;

    .line 2556
    .line 2557
    .line 2558
    move-result-object v1

    .line 2559
    check-cast v1, La/i3t0;

    .line 2560
    .line 2561
    invoke-virtual {v1, v0}, La/i3t0;->y(La/fet;)La/pz40;

    .line 2562
    .line 2563
    .line 2564
    move-result-object v13

    .line 2565
    iget-object v14, v12, La/k8o;->Q1:La/qdz;

    .line 2566
    .line 2567
    invoke-virtual {v0, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2568
    .line 2569
    .line 2570
    move-result v1

    .line 2571
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2572
    .line 2573
    .line 2574
    move-result-object v2

    .line 2575
    if-nez v1, :cond_66

    .line 2576
    .line 2577
    if-ne v2, v5, :cond_67

    .line 2578
    .line 2579
    :cond_66
    new-instance v2, La/i8o;

    .line 2580
    .line 2581
    invoke-direct {v2, v12, v9}, La/i8o;-><init>(La/k8o;B)V

    .line 2582
    .line 2583
    .line 2584
    invoke-virtual {v0, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2585
    .line 2586
    .line 2587
    :cond_67
    move-object v15, v2

    .line 2588
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 2589
    .line 2590
    invoke-virtual {v0, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2591
    .line 2592
    .line 2593
    move-result v1

    .line 2594
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2595
    .line 2596
    .line 2597
    move-result-object v2

    .line 2598
    if-nez v1, :cond_68

    .line 2599
    .line 2600
    if-ne v2, v5, :cond_69

    .line 2601
    .line 2602
    :cond_68
    new-instance v2, La/i8o;

    .line 2603
    .line 2604
    invoke-direct {v2, v12, v8}, La/i8o;-><init>(La/k8o;B)V

    .line 2605
    .line 2606
    .line 2607
    invoke-virtual {v0, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2608
    .line 2609
    .line 2610
    :cond_69
    move-object/from16 v16, v2

    .line 2611
    .line 2612
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 2613
    .line 2614
    const/16 v18, 0x0

    .line 2615
    .line 2616
    move-object/from16 v17, v0

    .line 2617
    .line 2618
    invoke-static/range {v13 .. v18}, La/nkb;->m(La/l7m0;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 2619
    .line 2620
    .line 2621
    goto :goto_1c

    .line 2622
    :cond_6a
    move-object/from16 v16, v0

    .line 2623
    .line 2624
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 2625
    .line 2626
    .line 2627
    :goto_1c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2628
    .line 2629
    return-object v0

    .line 2630
    :pswitch_1a
    check-cast v10, La/sfg0;

    .line 2631
    .line 2632
    move-object/from16 v0, p1

    .line 2633
    .line 2634
    check-cast v0, La/n7o0;

    .line 2635
    .line 2636
    move-object/from16 v1, p2

    .line 2637
    .line 2638
    check-cast v1, La/rfg0;

    .line 2639
    .line 2640
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2641
    .line 2642
    .line 2643
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2644
    .line 2645
    .line 2646
    iget-object v0, v0, La/n7o0;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/roulette/gamefield/RouletteView;

    .line 2647
    .line 2648
    iget-object v2, v10, La/sfg0;->d:La/kfg0;

    .line 2649
    .line 2650
    invoke-virtual {v0, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/roulette/gamefield/RouletteView;->setType(La/kfg0;)V

    .line 2651
    .line 2652
    .line 2653
    instance-of v2, v1, La/qfg0;

    .line 2654
    .line 2655
    if-eqz v2, :cond_6b

    .line 2656
    .line 2657
    check-cast v1, La/qfg0;

    .line 2658
    .line 2659
    iget v1, v1, La/qfg0;->a:I

    .line 2660
    .line 2661
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/roulette/gamefield/RouletteView;->setRouletteImage(I)V

    .line 2662
    .line 2663
    .line 2664
    goto :goto_1d

    .line 2665
    :cond_6b
    instance-of v2, v1, La/ofg0;

    .line 2666
    .line 2667
    if-eqz v2, :cond_6c

    .line 2668
    .line 2669
    check-cast v1, La/ofg0;

    .line 2670
    .line 2671
    iget v1, v1, La/ofg0;->a:I

    .line 2672
    .line 2673
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/roulette/gamefield/RouletteView;->setCurrentValue(I)V

    .line 2674
    .line 2675
    .line 2676
    goto :goto_1d

    .line 2677
    :cond_6c
    instance-of v2, v1, La/pfg0;

    .line 2678
    .line 2679
    if-eqz v2, :cond_6d

    .line 2680
    .line 2681
    check-cast v1, La/pfg0;

    .line 2682
    .line 2683
    iget v1, v1, La/pfg0;->a:I

    .line 2684
    .line 2685
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/roulette/gamefield/RouletteView;->setNewValue(I)V

    .line 2686
    .line 2687
    .line 2688
    :goto_1d
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2689
    .line 2690
    goto :goto_1e

    .line 2691
    :cond_6d
    invoke-static {}, La/t9f;->b()V

    .line 2692
    .line 2693
    .line 2694
    :goto_1e
    return-object v4

    .line 2695
    :pswitch_1b
    check-cast v10, La/y5x;

    .line 2696
    .line 2697
    move-object/from16 v0, p1

    .line 2698
    .line 2699
    check-cast v0, La/z5o0;

    .line 2700
    .line 2701
    move-object/from16 v1, p2

    .line 2702
    .line 2703
    check-cast v1, La/x5x;

    .line 2704
    .line 2705
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2706
    .line 2707
    .line 2708
    iget-object v0, v0, La/z5o0;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;

    .line 2709
    .line 2710
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2711
    .line 2712
    .line 2713
    instance-of v2, v1, La/r5x;

    .line 2714
    .line 2715
    if-eqz v2, :cond_6e

    .line 2716
    .line 2717
    iget-object v1, v10, La/y5x;->a:Ljava/util/ArrayList;

    .line 2718
    .line 2719
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->setFirstPlayerCards(Ljava/util/List;)V

    .line 2720
    .line 2721
    .line 2722
    goto :goto_1f

    .line 2723
    :cond_6e
    instance-of v2, v1, La/u5x;

    .line 2724
    .line 2725
    if-eqz v2, :cond_6f

    .line 2726
    .line 2727
    iget-object v1, v10, La/y5x;->b:Ljava/util/ArrayList;

    .line 2728
    .line 2729
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->setSecondPlayerCards(Ljava/util/List;)V

    .line 2730
    .line 2731
    .line 2732
    goto :goto_1f

    .line 2733
    :cond_6f
    instance-of v2, v1, La/t5x;

    .line 2734
    .line 2735
    if-eqz v2, :cond_70

    .line 2736
    .line 2737
    iget-object v1, v10, La/y5x;->c:Ljava/lang/String;

    .line 2738
    .line 2739
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->setMatchStatus(Ljava/lang/String;)V

    .line 2740
    .line 2741
    .line 2742
    goto :goto_1f

    .line 2743
    :cond_70
    instance-of v2, v1, La/s5x;

    .line 2744
    .line 2745
    if-eqz v2, :cond_71

    .line 2746
    .line 2747
    iget-object v1, v10, La/y5x;->d:La/m5x;

    .line 2748
    .line 2749
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->setFirstPlayerCombination(La/m5x;)V

    .line 2750
    .line 2751
    .line 2752
    goto :goto_1f

    .line 2753
    :cond_71
    instance-of v2, v1, La/v5x;

    .line 2754
    .line 2755
    if-eqz v2, :cond_72

    .line 2756
    .line 2757
    iget-object v1, v10, La/y5x;->e:La/m5x;

    .line 2758
    .line 2759
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->setSecondPlayerCombination(La/m5x;)V

    .line 2760
    .line 2761
    .line 2762
    goto :goto_1f

    .line 2763
    :cond_72
    instance-of v1, v1, La/w5x;

    .line 2764
    .line 2765
    if-eqz v1, :cond_73

    .line 2766
    .line 2767
    iget-object v1, v10, La/y5x;->g:La/wnq0;

    .line 2768
    .line 2769
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->v(La/wnq0;)V

    .line 2770
    .line 2771
    .line 2772
    :goto_1f
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2773
    .line 2774
    goto :goto_20

    .line 2775
    :cond_73
    invoke-static {}, La/t9f;->b()V

    .line 2776
    .line 2777
    .line 2778
    :goto_20
    return-object v4

    .line 2779
    :pswitch_1c
    check-cast v10, La/i5o;

    .line 2780
    .line 2781
    move-object/from16 v0, p1

    .line 2782
    .line 2783
    check-cast v0, La/fet;

    .line 2784
    .line 2785
    move-object/from16 v1, p2

    .line 2786
    .line 2787
    check-cast v1, Ljava/lang/Integer;

    .line 2788
    .line 2789
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2790
    .line 2791
    .line 2792
    move-result v1

    .line 2793
    sget-object v2, La/i5o;->Z1:La/pek;

    .line 2794
    .line 2795
    and-int/lit8 v2, v1, 0x3

    .line 2796
    .line 2797
    if-eq v2, v8, :cond_74

    .line 2798
    .line 2799
    move v2, v9

    .line 2800
    goto :goto_21

    .line 2801
    :cond_74
    move v2, v7

    .line 2802
    :goto_21
    and-int/2addr v1, v9

    .line 2803
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 2804
    .line 2805
    .line 2806
    move-result v1

    .line 2807
    if-eqz v1, :cond_7e

    .line 2808
    .line 2809
    invoke-virtual {v10}, La/i5o;->H0()La/k3t0;

    .line 2810
    .line 2811
    .line 2812
    move-result-object v1

    .line 2813
    check-cast v1, La/i3t0;

    .line 2814
    .line 2815
    invoke-virtual {v1, v0}, La/i3t0;->y(La/fet;)La/pz40;

    .line 2816
    .line 2817
    .line 2818
    move-result-object v1

    .line 2819
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2820
    .line 2821
    .line 2822
    move-result-object v1

    .line 2823
    move-object v11, v1

    .line 2824
    check-cast v11, La/t6o;

    .line 2825
    .line 2826
    iget-object v12, v10, La/i5o;->M1:La/sek;

    .line 2827
    .line 2828
    if-eqz v12, :cond_7d

    .line 2829
    .line 2830
    iget-object v14, v10, La/i5o;->P1:La/bek;

    .line 2831
    .line 2832
    if-eqz v14, :cond_7c

    .line 2833
    .line 2834
    invoke-virtual {v10}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 2835
    .line 2836
    .line 2837
    move-result-object v2

    .line 2838
    iget-wide v2, v2, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->d:J

    .line 2839
    .line 2840
    invoke-virtual {v10}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 2841
    .line 2842
    .line 2843
    move-result-object v4

    .line 2844
    iget-wide v8, v4, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->e:J

    .line 2845
    .line 2846
    invoke-virtual {v10}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 2847
    .line 2848
    .line 2849
    move-result-object v4

    .line 2850
    move-wide/from16 v20, v2

    .line 2851
    .line 2852
    iget-wide v1, v4, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->a:J

    .line 2853
    .line 2854
    invoke-virtual {v10}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 2855
    .line 2856
    .line 2857
    move-result-object v3

    .line 2858
    iget-boolean v3, v3, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->b:Z

    .line 2859
    .line 2860
    invoke-virtual {v10}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 2861
    .line 2862
    .line 2863
    move-result-object v4

    .line 2864
    iget-wide v6, v4, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->c:J

    .line 2865
    .line 2866
    new-instance v13, La/z5s;

    .line 2867
    .line 2868
    move-wide/from16 v16, v1

    .line 2869
    .line 2870
    move/from16 v24, v3

    .line 2871
    .line 2872
    move-wide/from16 v18, v6

    .line 2873
    .line 2874
    move-wide/from16 v22, v8

    .line 2875
    .line 2876
    move-object v15, v13

    .line 2877
    invoke-direct/range {v15 .. v24}, La/z5s;-><init>(JJJJZ)V

    .line 2878
    .line 2879
    .line 2880
    iget-object v15, v10, La/i5o;->R1:La/xex;

    .line 2881
    .line 2882
    if-eqz v15, :cond_7b

    .line 2883
    .line 2884
    new-instance v16, Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;

    .line 2885
    .line 2886
    invoke-virtual {v10}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 2887
    .line 2888
    .line 2889
    move-result-object v1

    .line 2890
    iget-wide v1, v1, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->a:J

    .line 2891
    .line 2892
    invoke-virtual {v10}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 2893
    .line 2894
    .line 2895
    move-result-object v3

    .line 2896
    iget-wide v3, v3, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->c:J

    .line 2897
    .line 2898
    invoke-virtual {v10}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 2899
    .line 2900
    .line 2901
    move-result-object v6

    .line 2902
    iget-boolean v6, v6, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->b:Z

    .line 2903
    .line 2904
    invoke-virtual {v10}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 2905
    .line 2906
    .line 2907
    move-result-object v7

    .line 2908
    iget-wide v7, v7, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->d:J

    .line 2909
    .line 2910
    invoke-virtual {v10}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 2911
    .line 2912
    .line 2913
    move-result-object v9

    .line 2914
    move-wide/from16 v26, v1

    .line 2915
    .line 2916
    iget-wide v1, v9, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->e:J

    .line 2917
    .line 2918
    invoke-virtual {v10}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 2919
    .line 2920
    .line 2921
    move-result-object v9

    .line 2922
    move-wide/from16 v33, v1

    .line 2923
    .line 2924
    iget-wide v1, v9, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->j:J

    .line 2925
    .line 2926
    new-instance v37, La/lq2;

    .line 2927
    .line 2928
    invoke-direct/range {v37 .. v37}, Ljava/lang/Object;-><init>()V

    .line 2929
    .line 2930
    .line 2931
    invoke-virtual {v10}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 2932
    .line 2933
    .line 2934
    move-result-object v9

    .line 2935
    iget-object v9, v9, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->f:La/grs;

    .line 2936
    .line 2937
    const-class v17, La/i5o;

    .line 2938
    .line 2939
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 2940
    .line 2941
    .line 2942
    move-result-object v39

    .line 2943
    move-wide/from16 v35, v1

    .line 2944
    .line 2945
    move-wide/from16 v28, v3

    .line 2946
    .line 2947
    move/from16 v30, v6

    .line 2948
    .line 2949
    move-wide/from16 v31, v7

    .line 2950
    .line 2951
    move-object/from16 v38, v9

    .line 2952
    .line 2953
    move-object/from16 v25, v16

    .line 2954
    .line 2955
    invoke-direct/range {v25 .. v39}, Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;-><init>(JJZJJJLa/ms2;La/grs;Ljava/lang/String;)V

    .line 2956
    .line 2957
    .line 2958
    invoke-virtual {v10}, La/i5o;->H0()La/k3t0;

    .line 2959
    .line 2960
    .line 2961
    move-result-object v1

    .line 2962
    invoke-virtual {v0, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2963
    .line 2964
    .line 2965
    move-result v2

    .line 2966
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2967
    .line 2968
    .line 2969
    move-result-object v3

    .line 2970
    if-nez v2, :cond_75

    .line 2971
    .line 2972
    if-ne v3, v5, :cond_76

    .line 2973
    .line 2974
    :cond_75
    new-instance v17, La/hin;

    .line 2975
    .line 2976
    const/16 v23, 0x0

    .line 2977
    .line 2978
    const/16 v24, 0xb

    .line 2979
    .line 2980
    const/16 v18, 0x1

    .line 2981
    .line 2982
    const-class v20, La/k3t0;

    .line 2983
    .line 2984
    const-string v21, "onAction"

    .line 2985
    .line 2986
    const-string v22, "onAction(Ljava/lang/Object;)V"

    .line 2987
    .line 2988
    move-object/from16 v19, v1

    .line 2989
    .line 2990
    invoke-direct/range {v17 .. v24}, La/hin;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2991
    .line 2992
    .line 2993
    move-object/from16 v3, v17

    .line 2994
    .line 2995
    invoke-virtual {v0, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2996
    .line 2997
    .line 2998
    :cond_76
    check-cast v3, La/jhy;

    .line 2999
    .line 3000
    move-object/from16 v17, v3

    .line 3001
    .line 3002
    check-cast v17, Lkotlin/jvm/functions/Function1;

    .line 3003
    .line 3004
    const/16 v19, 0x0

    .line 3005
    .line 3006
    move-object/from16 v18, v0

    .line 3007
    .line 3008
    invoke-static/range {v11 .. v19}, La/aac;->r(La/t6o;La/sek;La/z5s;La/bek;La/xex;Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 3009
    .line 3010
    .line 3011
    invoke-virtual {v10}, La/i5o;->H0()La/k3t0;

    .line 3012
    .line 3013
    .line 3014
    move-result-object v14

    .line 3015
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 3016
    .line 3017
    .line 3018
    move-result v1

    .line 3019
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 3020
    .line 3021
    .line 3022
    move-result-object v2

    .line 3023
    if-nez v1, :cond_77

    .line 3024
    .line 3025
    if-ne v2, v5, :cond_78

    .line 3026
    .line 3027
    :cond_77
    new-instance v2, La/g5o;

    .line 3028
    .line 3029
    const/4 v1, 0x0

    .line 3030
    invoke-direct {v2, v10, v1}, La/g5o;-><init>(La/i5o;B)V

    .line 3031
    .line 3032
    .line 3033
    invoke-virtual {v0, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 3034
    .line 3035
    .line 3036
    :cond_78
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 3037
    .line 3038
    sget-object v1, La/or00;->a:La/zfn;

    .line 3039
    .line 3040
    invoke-virtual {v0, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 3041
    .line 3042
    .line 3043
    move-result-object v1

    .line 3044
    move-object v15, v1

    .line 3045
    check-cast v15, La/clz;

    .line 3046
    .line 3047
    sget-object v1, La/lkz;->a:La/lkz;

    .line 3048
    .line 3049
    invoke-static {v2, v0}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 3050
    .line 3051
    .line 3052
    move-result-object v1

    .line 3053
    invoke-virtual {v0, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 3054
    .line 3055
    .line 3056
    move-result v2

    .line 3057
    invoke-virtual {v0, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 3058
    .line 3059
    .line 3060
    move-result v3

    .line 3061
    or-int/2addr v2, v3

    .line 3062
    const/4 v3, 0x3

    .line 3063
    invoke-virtual {v0, v3}, La/fet;->e(I)Z

    .line 3064
    .line 3065
    .line 3066
    move-result v3

    .line 3067
    or-int/2addr v2, v3

    .line 3068
    invoke-virtual {v0, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 3069
    .line 3070
    .line 3071
    move-result v3

    .line 3072
    or-int/2addr v2, v3

    .line 3073
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 3074
    .line 3075
    .line 3076
    move-result-object v3

    .line 3077
    if-nez v2, :cond_79

    .line 3078
    .line 3079
    if-ne v3, v5, :cond_7a

    .line 3080
    .line 3081
    :cond_79
    new-instance v13, La/pc;

    .line 3082
    .line 3083
    const/16 v18, 0x10

    .line 3084
    .line 3085
    move-object/from16 v16, v1

    .line 3086
    .line 3087
    const/16 v17, 0x0

    .line 3088
    .line 3089
    invoke-direct/range {v13 .. v18}, La/pc;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 3090
    .line 3091
    .line 3092
    invoke-virtual {v0, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 3093
    .line 3094
    .line 3095
    move-object v3, v13

    .line 3096
    :cond_7a
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 3097
    .line 3098
    invoke-static {v0, v15, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 3099
    .line 3100
    .line 3101
    goto :goto_22

    .line 3102
    :cond_7b
    const/16 v17, 0x0

    .line 3103
    .line 3104
    const-string v0, "cyberBottomSheetFactory"

    .line 3105
    .line 3106
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 3107
    .line 3108
    .line 3109
    throw v17

    .line 3110
    :cond_7c
    const/16 v17, 0x0

    .line 3111
    .line 3112
    const-string v0, "gameZoneFragmentFactory"

    .line 3113
    .line 3114
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 3115
    .line 3116
    .line 3117
    throw v17

    .line 3118
    :cond_7d
    const/16 v17, 0x0

    .line 3119
    .line 3120
    const-string v0, "gameVideoFragmentFactory"

    .line 3121
    .line 3122
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 3123
    .line 3124
    .line 3125
    throw v17

    .line 3126
    :cond_7e
    invoke-virtual {v0}, La/fet;->X()V

    .line 3127
    .line 3128
    .line 3129
    :goto_22
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3130
    .line 3131
    return-object v0

    .line 3132
    nop

    .line 3133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
