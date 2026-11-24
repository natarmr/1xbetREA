.class public final La/hb2;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic E:I


# instance fields
.field public final A:Z

.field public B:La/bby;

.field public C:La/bby;

.field public D:La/bby;

.field public final o:La/vzg0;

.field public final p:Lorg/xplatform/results/impl/presentation/alt_history/GamesHistoryResultsParams;

.field public final q:La/luu;

.field public final r:La/hru;

.field public final s:La/qrc;

.field public final t:La/cmt;

.field public final u:La/j3c;

.field public final v:La/m1e;

.field public final w:La/mne;

.field public final x:La/i1w0;

.field public final y:La/g2g0;

.field public final z:La/reu;


# direct methods
.method public constructor <init>(La/vzg0;Lorg/xplatform/results/impl/presentation/alt_history/GamesHistoryResultsParams;La/luu;La/hru;La/qrc;La/cmt;La/j3c;La/m1e;La/ctf0;La/mne;La/i1w0;La/g2g0;La/reu;La/pru;La/bzt;La/r9u;)V
    .locals 10

    .line 1
    move-object/from16 v0, p10

    .line 2
    .line 3
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p9 .. p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, La/mne;->a:La/rwj;

    .line 10
    .line 11
    invoke-static {v1, v1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, La/pg1;

    .line 16
    .line 17
    move-object v5, p1

    .line 18
    move-object v7, p2

    .line 19
    move-object v6, p4

    .line 20
    move-object v9, p5

    .line 21
    move-object/from16 v3, p14

    .line 22
    .line 23
    move-object/from16 v4, p15

    .line 24
    .line 25
    move-object/from16 v8, p16

    .line 26
    .line 27
    invoke-direct/range {v2 .. v9}, La/pg1;-><init>(La/pru;La/bzt;La/vzg0;La/hru;Lorg/xplatform/results/impl/presentation/alt_history/GamesHistoryResultsParams;La/r9u;La/qrc;)V

    .line 28
    .line 29
    .line 30
    new-instance v3, La/df1;

    .line 31
    .line 32
    const/16 v4, 0x10

    .line 33
    .line 34
    move-object/from16 v8, p9

    .line 35
    .line 36
    invoke-direct {v3, v8, p2, v4}, La/df1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-direct {p0, v2, v1, v3, v4}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, La/hb2;->o:La/vzg0;

    .line 44
    .line 45
    iput-object p2, p0, La/hb2;->p:Lorg/xplatform/results/impl/presentation/alt_history/GamesHistoryResultsParams;

    .line 46
    .line 47
    iput-object p3, p0, La/hb2;->q:La/luu;

    .line 48
    .line 49
    iput-object p4, p0, La/hb2;->r:La/hru;

    .line 50
    .line 51
    iput-object p5, p0, La/hb2;->s:La/qrc;

    .line 52
    .line 53
    move-object/from16 p1, p6

    .line 54
    .line 55
    iput-object p1, p0, La/hb2;->t:La/cmt;

    .line 56
    .line 57
    move-object/from16 p1, p7

    .line 58
    .line 59
    iput-object p1, p0, La/hb2;->u:La/j3c;

    .line 60
    .line 61
    move-object/from16 p1, p8

    .line 62
    .line 63
    iput-object p1, p0, La/hb2;->v:La/m1e;

    .line 64
    .line 65
    iput-object v0, p0, La/hb2;->w:La/mne;

    .line 66
    .line 67
    move-object/from16 p1, p11

    .line 68
    .line 69
    iput-object p1, p0, La/hb2;->x:La/i1w0;

    .line 70
    .line 71
    move-object/from16 p1, p12

    .line 72
    .line 73
    iput-object p1, p0, La/hb2;->y:La/g2g0;

    .line 74
    .line 75
    move-object/from16 p1, p13

    .line 76
    .line 77
    iput-object p1, p0, La/hb2;->z:La/reu;

    .line 78
    .line 79
    iget-boolean p1, p2, Lorg/xplatform/results/impl/presentation/alt_history/GamesHistoryResultsParams;->c:Z

    .line 80
    .line 81
    iput-boolean p1, p0, La/hb2;->A:Z

    .line 82
    .line 83
    new-instance p1, La/fb2;

    .line 84
    .line 85
    const/4 p2, 0x1

    .line 86
    invoke-direct {p1, p0, v4, p2}, La/fb2;-><init>(La/hb2;La/yje;B)V

    .line 87
    .line 88
    .line 89
    const/4 p2, 0x3

    .line 90
    invoke-static {p0, v4, v4, p1, p2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 91
    .line 92
    .line 93
    new-instance p1, La/fb2;

    .line 94
    .line 95
    const/4 p3, 0x0

    .line 96
    invoke-direct {p1, p0, v4, p3}, La/fb2;-><init>(La/hb2;La/yje;B)V

    .line 97
    .line 98
    .line 99
    invoke-static {p0, v4, v4, p1, p2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 100
    .line 101
    .line 102
    new-instance p1, La/fb2;

    .line 103
    .line 104
    const/4 p3, 0x2

    .line 105
    invoke-direct {p1, p0, v4, p3}, La/fb2;-><init>(La/hb2;La/yje;B)V

    .line 106
    .line 107
    .line 108
    invoke-static {p0, v4, v4, p1, p2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 109
    .line 110
    .line 111
    return-void
.end method


# virtual methods
.method public final M(Z)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, La/hb2;->B:La/bby;

    .line 6
    .line 7
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v1, v0, La/hb2;->B:La/bby;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v1}, La/bby;->isActive()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-ne v1, v2, :cond_1

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, La/ab2;

    .line 27
    .line 28
    iget-object v1, v1, La/ab2;->d:La/za2;

    .line 29
    .line 30
    instance-of v1, v1, La/xa2;

    .line 31
    .line 32
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 33
    .line 34
    iget-object v4, v0, La/i3t0;->i:La/ocj;

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    if-eqz v1, :cond_5

    .line 38
    .line 39
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/ab2;

    .line 44
    .line 45
    iget-object v1, v1, La/ab2;->d:La/za2;

    .line 46
    .line 47
    instance-of v6, v1, La/xa2;

    .line 48
    .line 49
    if-eqz v6, :cond_2

    .line 50
    .line 51
    check-cast v1, La/xa2;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move-object v1, v5

    .line 55
    :goto_0
    if-eqz v1, :cond_3

    .line 56
    .line 57
    iget-object v1, v1, La/xa2;->b:Ljava/util/List;

    .line 58
    .line 59
    if-eqz v1, :cond_3

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-ne v1, v2, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    iget-object v1, v4, La/ocj;->a:La/p7m0;

    .line 69
    .line 70
    :cond_4
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-object v6, v2

    .line 78
    check-cast v6, La/ab2;

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    const/16 v16, 0x0

    .line 84
    .line 85
    const v17, 0xfdff

    .line 86
    .line 87
    .line 88
    const/4 v7, 0x0

    .line 89
    const/4 v8, 0x0

    .line 90
    const/4 v9, 0x0

    .line 91
    const/4 v10, 0x0

    .line 92
    const/4 v11, 0x0

    .line 93
    const/4 v12, 0x1

    .line 94
    const/4 v13, 0x0

    .line 95
    const/4 v14, 0x0

    .line 96
    const/4 v15, 0x0

    .line 97
    invoke-static/range {v6 .. v17}, La/ab2;->a(La/ab2;Ljava/lang/String;Ljava/util/Date;ZLa/za2;ZZZLjava/util/List;La/wcb;Ljava/util/Set;I)La/ab2;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v1, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_4

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_5
    :goto_1
    iget-object v1, v4, La/ocj;->a:La/p7m0;

    .line 109
    .line 110
    :cond_6
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-object v6, v2

    .line 118
    check-cast v6, La/ab2;

    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    const/16 v16, 0x0

    .line 124
    .line 125
    const v17, 0xfdef

    .line 126
    .line 127
    .line 128
    const/4 v7, 0x0

    .line 129
    const/4 v8, 0x0

    .line 130
    const/4 v9, 0x0

    .line 131
    sget-object v10, La/ya2;->a:La/ya2;

    .line 132
    .line 133
    const/4 v11, 0x0

    .line 134
    const/4 v12, 0x0

    .line 135
    const/4 v13, 0x0

    .line 136
    const/4 v14, 0x0

    .line 137
    const/4 v15, 0x0

    .line 138
    invoke-static/range {v6 .. v17}, La/ab2;->a(La/ab2;Ljava/lang/String;Ljava/util/Date;ZLa/za2;ZZZLjava/util/List;La/wcb;Ljava/util/Set;I)La/ab2;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-virtual {v1, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_6

    .line 147
    .line 148
    :goto_2
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    iget-object v1, v0, La/hb2;->w:La/mne;

    .line 153
    .line 154
    iget-object v9, v1, La/mne;->a:La/rwj;

    .line 155
    .line 156
    new-instance v7, La/m51;

    .line 157
    .line 158
    const/16 v1, 0x10

    .line 159
    .line 160
    invoke-direct {v7, v0, v1}, La/m51;-><init>(Ljava/lang/Object;B)V

    .line 161
    .line 162
    .line 163
    new-instance v10, La/gb2;

    .line 164
    .line 165
    invoke-direct {v10, v0, v5}, La/gb2;-><init>(La/hb2;La/yje;)V

    .line 166
    .line 167
    .line 168
    const/16 v11, 0xa

    .line 169
    .line 170
    const/4 v8, 0x0

    .line 171
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    iput-object v1, v0, La/hb2;->B:La/bby;

    .line 176
    .line 177
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/ea2;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v2, La/w92;->a:La/w92;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x5

    .line 17
    const/4 v4, 0x2

    .line 18
    const/4 v5, 0x1

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/ab2;

    .line 26
    .line 27
    iget-object v7, v1, La/ab2;->b:Ljava/util/Date;

    .line 28
    .line 29
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    sub-int/2addr v5, v4

    .line 42
    invoke-virtual {v1, v4}, Ljava/util/Calendar;->get(I)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-virtual {v2, v5, v4, v3}, Ljava/util/Calendar;->set(III)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v8

    .line 57
    new-instance v6, La/ua2;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 60
    .line 61
    .line 62
    move-result-wide v10

    .line 63
    invoke-direct/range {v6 .. v11}, La/ua2;-><init>(Ljava/util/Date;JJ)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v6}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_0
    instance-of v2, v1, La/v92;

    .line 71
    .line 72
    iget-object v6, v0, La/i3t0;->f:La/oyg0;

    .line 73
    .line 74
    iget-object v7, v0, La/i3t0;->i:La/ocj;

    .line 75
    .line 76
    iget-object v8, v0, La/hb2;->o:La/vzg0;

    .line 77
    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    check-cast v1, La/v92;

    .line 81
    .line 82
    iget v10, v1, La/v92;->a:I

    .line 83
    .line 84
    iget v11, v1, La/v92;->b:I

    .line 85
    .line 86
    iget v12, v1, La/v92;->c:I

    .line 87
    .line 88
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, La/ab2;

    .line 97
    .line 98
    iget-object v2, v2, La/ab2;->b:Ljava/util/Date;

    .line 99
    .line 100
    if-eqz v2, :cond_1

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 103
    .line 104
    .line 105
    move-result-wide v13

    .line 106
    invoke-virtual {v1, v13, v14}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 107
    .line 108
    .line 109
    :cond_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    const/16 v9, 0xb

    .line 114
    .line 115
    invoke-virtual {v2, v9}, Ljava/util/Calendar;->get(I)I

    .line 116
    .line 117
    .line 118
    move-result v13

    .line 119
    const/16 v9, 0xc

    .line 120
    .line 121
    invoke-virtual {v2, v9}, Ljava/util/Calendar;->get(I)I

    .line 122
    .line 123
    .line 124
    move-result v14

    .line 125
    const/16 v9, 0xd

    .line 126
    .line 127
    invoke-virtual {v2, v9}, Ljava/util/Calendar;->get(I)I

    .line 128
    .line 129
    .line 130
    move-result v15

    .line 131
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    invoke-virtual/range {v9 .. v15}, Ljava/util/Calendar;->set(IIIIII)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, La/ab2;

    .line 143
    .line 144
    iget-object v2, v2, La/ab2;->b:Ljava/util/Date;

    .line 145
    .line 146
    if-eqz v2, :cond_2

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v9, v5}, Ljava/util/Calendar;->get(I)I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    if-ne v2, v10, :cond_2

    .line 160
    .line 161
    invoke-virtual {v9, v4}, Ljava/util/Calendar;->get(I)I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    invoke-virtual {v1, v4}, Ljava/util/Calendar;->get(I)I

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-ne v2, v4, :cond_2

    .line 170
    .line 171
    invoke-virtual {v9, v3}, Ljava/util/Calendar;->get(I)I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-ne v2, v1, :cond_2

    .line 180
    .line 181
    goto/16 :goto_1

    .line 182
    .line 183
    :cond_2
    invoke-virtual {v9}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    iget-object v2, v0, La/hb2;->s:La/qrc;

    .line 191
    .line 192
    iget-boolean v3, v0, La/hb2;->A:Z

    .line 193
    .line 194
    invoke-virtual {v2, v1, v3}, La/qrc;->a(Ljava/util/Date;Z)V

    .line 195
    .line 196
    .line 197
    iget-object v2, v7, La/ocj;->a:La/p7m0;

    .line 198
    .line 199
    :cond_3
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    move-object v10, v1

    .line 207
    check-cast v10, La/ab2;

    .line 208
    .line 209
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v9}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 213
    .line 214
    .line 215
    move-result-object v12

    .line 216
    const/16 v20, 0x0

    .line 217
    .line 218
    const v21, 0xfffd

    .line 219
    .line 220
    .line 221
    const/4 v11, 0x0

    .line 222
    const/4 v13, 0x0

    .line 223
    const/4 v14, 0x0

    .line 224
    const/4 v15, 0x0

    .line 225
    const/16 v16, 0x0

    .line 226
    .line 227
    const/16 v17, 0x0

    .line 228
    .line 229
    const/16 v18, 0x0

    .line 230
    .line 231
    const/16 v19, 0x0

    .line 232
    .line 233
    invoke-static/range {v10 .. v21}, La/ab2;->a(La/ab2;Ljava/lang/String;Ljava/util/Date;ZLa/za2;ZZZLjava/util/List;La/wcb;Ljava/util/Set;I)La/ab2;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-virtual {v2, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-eqz v1, :cond_3

    .line 242
    .line 243
    const-string v1, "KEY_CURRENT_DATE"

    .line 244
    .line 245
    invoke-virtual {v9}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-virtual {v8, v1, v2}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v5}, La/hb2;->M(Z)V

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :cond_4
    sget-object v2, La/u92;->a:La/u92;

    .line 257
    .line 258
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    const/4 v3, 0x0

    .line 263
    const-string v4, "KEY_SEARCH_INPUT"

    .line 264
    .line 265
    if-eqz v2, :cond_8

    .line 266
    .line 267
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    check-cast v1, La/ab2;

    .line 272
    .line 273
    iget-boolean v1, v1, La/ab2;->h:Z

    .line 274
    .line 275
    if-eqz v1, :cond_6

    .line 276
    .line 277
    iget-object v1, v7, La/ocj;->a:La/p7m0;

    .line 278
    .line 279
    :cond_5
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    move-object v9, v0

    .line 287
    check-cast v9, La/ab2;

    .line 288
    .line 289
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    const/16 v19, 0x0

    .line 293
    .line 294
    const v20, 0xfefe

    .line 295
    .line 296
    .line 297
    const-string v10, ""

    .line 298
    .line 299
    const/4 v11, 0x0

    .line 300
    const/4 v12, 0x0

    .line 301
    const/4 v13, 0x0

    .line 302
    const/4 v14, 0x0

    .line 303
    const/4 v15, 0x0

    .line 304
    const/16 v16, 0x0

    .line 305
    .line 306
    const/16 v17, 0x0

    .line 307
    .line 308
    const/16 v18, 0x0

    .line 309
    .line 310
    invoke-static/range {v9 .. v20}, La/ab2;->a(La/ab2;Ljava/lang/String;Ljava/util/Date;ZLa/za2;ZZZLjava/util/List;La/wcb;Ljava/util/Set;I)La/ab2;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-eqz v0, :cond_5

    .line 319
    .line 320
    const-string v0, ""

    .line 321
    .line 322
    invoke-virtual {v8, v4, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    :cond_6
    iget-object v0, v0, La/hb2;->x:La/i1w0;

    .line 327
    .line 328
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    new-instance v2, La/c8d;

    .line 333
    .line 334
    sget-object v4, La/y7d;->a:La/v7d;

    .line 335
    .line 336
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 337
    .line 338
    invoke-direct {v2, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 339
    .line 340
    .line 341
    invoke-static {v1, v2, v0, v1, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    :goto_0
    move-object v2, v1

    .line 346
    check-cast v2, La/paw;

    .line 347
    .line 348
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    if-eqz v3, :cond_7

    .line 353
    .line 354
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    check-cast v2, La/oe50;

    .line 359
    .line 360
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 361
    .line 362
    .line 363
    goto :goto_0

    .line 364
    :cond_7
    :goto_1
    return-void

    .line 365
    :cond_8
    instance-of v2, v1, La/y92;

    .line 366
    .line 367
    if-eqz v2, :cond_c

    .line 368
    .line 369
    check-cast v1, La/y92;

    .line 370
    .line 371
    iget-object v10, v1, La/y92;->a:Ljava/lang/String;

    .line 372
    .line 373
    invoke-static {v10}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    check-cast v0, La/ab2;

    .line 386
    .line 387
    iget-object v0, v0, La/ab2;->a:Ljava/lang/String;

    .line 388
    .line 389
    invoke-static {v0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    if-nez v0, :cond_a

    .line 402
    .line 403
    iget-object v0, v7, La/ocj;->a:La/p7m0;

    .line 404
    .line 405
    :cond_9
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    move-object v9, v1

    .line 413
    check-cast v9, La/ab2;

    .line 414
    .line 415
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    const/16 v19, 0x0

    .line 419
    .line 420
    const v20, 0xfbfe

    .line 421
    .line 422
    .line 423
    const/4 v11, 0x0

    .line 424
    const/4 v12, 0x0

    .line 425
    const/4 v13, 0x0

    .line 426
    const/4 v14, 0x0

    .line 427
    const/4 v15, 0x0

    .line 428
    const/16 v16, 0x1

    .line 429
    .line 430
    const/16 v17, 0x0

    .line 431
    .line 432
    const/16 v18, 0x0

    .line 433
    .line 434
    invoke-static/range {v9 .. v20}, La/ab2;->a(La/ab2;Ljava/lang/String;Ljava/util/Date;ZLa/za2;ZZZLjava/util/List;La/wcb;Ljava/util/Set;I)La/ab2;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    if-eqz v1, :cond_9

    .line 443
    .line 444
    goto :goto_2

    .line 445
    :cond_a
    iget-object v2, v7, La/ocj;->a:La/p7m0;

    .line 446
    .line 447
    :cond_b
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    move-object v9, v0

    .line 455
    check-cast v9, La/ab2;

    .line 456
    .line 457
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    const/16 v19, 0x0

    .line 461
    .line 462
    const v20, 0xfffe

    .line 463
    .line 464
    .line 465
    const/4 v11, 0x0

    .line 466
    const/4 v12, 0x0

    .line 467
    const/4 v13, 0x0

    .line 468
    const/4 v14, 0x0

    .line 469
    const/4 v15, 0x0

    .line 470
    const/16 v16, 0x0

    .line 471
    .line 472
    const/16 v17, 0x0

    .line 473
    .line 474
    const/16 v18, 0x0

    .line 475
    .line 476
    invoke-static/range {v9 .. v20}, La/ab2;->a(La/ab2;Ljava/lang/String;Ljava/util/Date;ZLa/za2;ZZZLjava/util/List;La/wcb;Ljava/util/Set;I)La/ab2;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    if-eqz v0, :cond_b

    .line 485
    .line 486
    :goto_2
    invoke-virtual {v8, v4, v10}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    return-void

    .line 490
    :cond_c
    sget-object v2, La/ca2;->a:La/ca2;

    .line 491
    .line 492
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    move-result v2

    .line 496
    if-eqz v2, :cond_d

    .line 497
    .line 498
    invoke-virtual {v0, v5}, La/hb2;->M(Z)V

    .line 499
    .line 500
    .line 501
    return-void

    .line 502
    :cond_d
    sget-object v2, La/aa2;->a:La/aa2;

    .line 503
    .line 504
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v2

    .line 508
    if-eqz v2, :cond_f

    .line 509
    .line 510
    iget-object v2, v7, La/ocj;->a:La/p7m0;

    .line 511
    .line 512
    :cond_e
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    move-object v7, v0

    .line 520
    check-cast v7, La/ab2;

    .line 521
    .line 522
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    const/16 v17, 0x0

    .line 526
    .line 527
    const v18, 0xfeff

    .line 528
    .line 529
    .line 530
    const/4 v8, 0x0

    .line 531
    const/4 v9, 0x0

    .line 532
    const/4 v10, 0x0

    .line 533
    const/4 v11, 0x0

    .line 534
    const/4 v12, 0x1

    .line 535
    const/4 v13, 0x0

    .line 536
    const/4 v14, 0x0

    .line 537
    const/4 v15, 0x0

    .line 538
    const/16 v16, 0x0

    .line 539
    .line 540
    invoke-static/range {v7 .. v18}, La/ab2;->a(La/ab2;Ljava/lang/String;Ljava/util/Date;ZLa/za2;ZZZLjava/util/List;La/wcb;Ljava/util/Set;I)La/ab2;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    move-result v0

    .line 548
    if-eqz v0, :cond_e

    .line 549
    .line 550
    return-void

    .line 551
    :cond_f
    sget-object v2, La/x92;->a:La/x92;

    .line 552
    .line 553
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v2

    .line 557
    sget-object v4, La/sa2;->a:La/sa2;

    .line 558
    .line 559
    if-eqz v2, :cond_10

    .line 560
    .line 561
    invoke-virtual {v0, v4}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    return-void

    .line 565
    :cond_10
    sget-object v2, La/t92;->a:La/t92;

    .line 566
    .line 567
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    move-result v2

    .line 571
    if-eqz v2, :cond_11

    .line 572
    .line 573
    invoke-virtual {v0, v4}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    return-void

    .line 577
    :cond_11
    sget-object v2, La/q92;->a:La/q92;

    .line 578
    .line 579
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v2

    .line 583
    if-eqz v2, :cond_12

    .line 584
    .line 585
    invoke-virtual {v0}, La/i3t0;->E()V

    .line 586
    .line 587
    .line 588
    return-void

    .line 589
    :cond_12
    sget-object v2, La/r92;->a:La/r92;

    .line 590
    .line 591
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    if-eqz v2, :cond_14

    .line 596
    .line 597
    iget-object v1, v0, La/hb2;->D:La/bby;

    .line 598
    .line 599
    if-eqz v1, :cond_13

    .line 600
    .line 601
    invoke-interface {v1}, La/bby;->isActive()Z

    .line 602
    .line 603
    .line 604
    move-result v1

    .line 605
    if-ne v1, v5, :cond_13

    .line 606
    .line 607
    goto :goto_3

    .line 608
    :cond_13
    new-instance v1, La/fb2;

    .line 609
    .line 610
    const/4 v2, 0x0

    .line 611
    const/4 v3, 0x3

    .line 612
    invoke-direct {v1, v0, v2, v3}, La/fb2;-><init>(La/hb2;La/yje;B)V

    .line 613
    .line 614
    .line 615
    invoke-static {v0, v2, v2, v1, v3}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    iput-object v1, v0, La/hb2;->D:La/bby;

    .line 620
    .line 621
    :goto_3
    iget-object v1, v0, La/hb2;->C:La/bby;

    .line 622
    .line 623
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 624
    .line 625
    .line 626
    new-instance v4, La/ma2;

    .line 627
    .line 628
    invoke-direct {v4, v5}, La/ma2;-><init>(B)V

    .line 629
    .line 630
    .line 631
    const/16 v5, 0x77

    .line 632
    .line 633
    iget-object v1, v0, La/hb2;->y:La/g2g0;

    .line 634
    .line 635
    const/4 v2, 0x0

    .line 636
    const/4 v3, 0x0

    .line 637
    invoke-static/range {v0 .. v5}, La/i3t0;->F(La/i3t0;La/j3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 638
    .line 639
    .line 640
    move-result-object v1

    .line 641
    iput-object v1, v0, La/hb2;->C:La/bby;

    .line 642
    .line 643
    return-void

    .line 644
    :cond_14
    sget-object v2, La/s92;->a:La/s92;

    .line 645
    .line 646
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 647
    .line 648
    .line 649
    move-result v2

    .line 650
    if-eqz v2, :cond_15

    .line 651
    .line 652
    iget-object v1, v0, La/hb2;->C:La/bby;

    .line 653
    .line 654
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 655
    .line 656
    .line 657
    iget-object v1, v0, La/hb2;->B:La/bby;

    .line 658
    .line 659
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 660
    .line 661
    .line 662
    iget-object v0, v0, La/hb2;->D:La/bby;

    .line 663
    .line 664
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 665
    .line 666
    .line 667
    return-void

    .line 668
    :cond_15
    sget-object v2, La/z92;->a:La/z92;

    .line 669
    .line 670
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    move-result v2

    .line 674
    if-eqz v2, :cond_17

    .line 675
    .line 676
    iget-object v2, v7, La/ocj;->a:La/p7m0;

    .line 677
    .line 678
    :cond_16
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 683
    .line 684
    .line 685
    move-object v7, v0

    .line 686
    check-cast v7, La/ab2;

    .line 687
    .line 688
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    const/16 v17, 0x0

    .line 692
    .line 693
    const v18, 0xfbff

    .line 694
    .line 695
    .line 696
    const/4 v8, 0x0

    .line 697
    const/4 v9, 0x0

    .line 698
    const/4 v10, 0x0

    .line 699
    const/4 v11, 0x0

    .line 700
    const/4 v12, 0x0

    .line 701
    const/4 v13, 0x0

    .line 702
    const/4 v14, 0x0

    .line 703
    const/4 v15, 0x0

    .line 704
    const/16 v16, 0x0

    .line 705
    .line 706
    invoke-static/range {v7 .. v18}, La/ab2;->a(La/ab2;Ljava/lang/String;Ljava/util/Date;ZLa/za2;ZZZLjava/util/List;La/wcb;Ljava/util/Set;I)La/ab2;

    .line 707
    .line 708
    .line 709
    move-result-object v1

    .line 710
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    move-result v0

    .line 714
    if-eqz v0, :cond_16

    .line 715
    .line 716
    return-void

    .line 717
    :cond_17
    sget-object v2, La/ba2;->a:La/ba2;

    .line 718
    .line 719
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 720
    .line 721
    .line 722
    move-result v2

    .line 723
    if-eqz v2, :cond_18

    .line 724
    .line 725
    invoke-virtual {v0, v3}, La/hb2;->M(Z)V

    .line 726
    .line 727
    .line 728
    return-void

    .line 729
    :cond_18
    instance-of v2, v1, La/da2;

    .line 730
    .line 731
    if-eqz v2, :cond_19

    .line 732
    .line 733
    check-cast v1, La/da2;

    .line 734
    .line 735
    iget-object v1, v1, La/da2;->a:La/bem;

    .line 736
    .line 737
    invoke-static {v1}, La/q0x;->U(La/bem;)La/c2g0;

    .line 738
    .line 739
    .line 740
    move-result-object v2

    .line 741
    const/4 v4, 0x0

    .line 742
    const/4 v5, 0x6

    .line 743
    iget-object v1, v0, La/hb2;->y:La/g2g0;

    .line 744
    .line 745
    const/4 v3, 0x0

    .line 746
    invoke-static/range {v0 .. v5}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 747
    .line 748
    .line 749
    return-void

    .line 750
    :cond_19
    invoke-static {}, La/t9f;->b()V

    .line 751
    .line 752
    .line 753
    return-void
.end method
