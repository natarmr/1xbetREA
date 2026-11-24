.class public final La/xq30;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/g45;

.field public final b:La/ehf0;


# direct methods
.method public constructor <init>(La/g45;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xq30;->a:La/g45;

    .line 5
    .line 6
    new-instance v0, La/ehf0;

    .line 7
    .line 8
    iget-object p1, p1, La/g45;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, La/f6i;

    .line 11
    .line 12
    iget-object v1, p1, La/f6i;->f:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, La/ym40;

    .line 15
    .line 16
    iget-object p1, p1, La/f6i;->n:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, La/n660;

    .line 19
    .line 20
    invoke-direct {v0, v1, p1}, La/ehf0;-><init>(La/ym40;La/n660;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/xq30;->b:La/ehf0;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(La/vjj;)La/v0;
    .locals 3

    .line 1
    instance-of v0, p1, La/mg80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/q4d0;

    .line 6
    .line 7
    check-cast p1, La/mg80;

    .line 8
    .line 9
    check-cast p1, La/ng80;

    .line 10
    .line 11
    iget-object p1, p1, La/ng80;->f:La/swq;

    .line 12
    .line 13
    iget-object p0, p0, La/xq30;->a:La/g45;

    .line 14
    .line 15
    iget-object v1, p0, La/g45;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, La/h950;

    .line 18
    .line 19
    iget-object v2, p0, La/g45;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, La/roi0;

    .line 22
    .line 23
    iget-object p0, p0, La/g45;->g:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, La/hfk;

    .line 26
    .line 27
    invoke-direct {v0, p1, v1, v2, p0}, La/q4d0;-><init>(La/swq;La/h950;La/roi0;La/gmk0;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    instance-of p0, p1, La/ffk;

    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    check-cast p1, La/ffk;

    .line 36
    .line 37
    iget-object p0, p1, La/ffk;->u:La/p4d0;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_1
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public final b(Ljava/util/List;Ljava/util/List;La/z3;I)Ljava/util/ArrayList;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v8, v1, La/xq30;->a:La/g45;

    .line 4
    .line 5
    iget-object v0, v8, La/g45;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, La/vjj;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-object v9, v0

    .line 13
    check-cast v9, La/kp9;

    .line 14
    .line 15
    invoke-interface {v9}, La/vjj;->j()La/vjj;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, La/xq30;->a(La/vjj;)La/v0;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v10, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v11

    .line 35
    const/4 v5, 0x0

    .line 36
    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    add-int/lit8 v13, v5, 0x1

    .line 47
    .line 48
    if-ltz v5, :cond_3

    .line 49
    .line 50
    move-object v15, v0

    .line 51
    check-cast v15, La/a4d0;

    .line 52
    .line 53
    move-object/from16 v0, p2

    .line 54
    .line 55
    invoke-static {v5, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    move-object v6, v3

    .line 60
    check-cast v6, La/i4d0;

    .line 61
    .line 62
    if-eqz v6, :cond_0

    .line 63
    .line 64
    iget v3, v6, La/i4d0;->c:I

    .line 65
    .line 66
    const/4 v4, 0x1

    .line 67
    and-int/2addr v3, v4

    .line 68
    if-ne v3, v4, :cond_0

    .line 69
    .line 70
    iget v3, v6, La/i4d0;->d:I

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_0
    const/4 v3, 0x0

    .line 74
    :goto_1
    if-eqz v2, :cond_1

    .line 75
    .line 76
    sget-object v4, La/njq;->c:La/kjq;

    .line 77
    .line 78
    invoke-virtual {v4, v3}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_1

    .line 87
    .line 88
    new-instance v3, La/b660;

    .line 89
    .line 90
    iget-object v4, v8, La/g45;->a:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v4, La/f6i;

    .line 93
    .line 94
    iget-object v4, v4, La/f6i;->e:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v4, La/eu00;

    .line 97
    .line 98
    new-instance v0, La/wq30;

    .line 99
    .line 100
    const/4 v7, 0x1

    .line 101
    move-object v12, v3

    .line 102
    move-object v14, v4

    .line 103
    move-object/from16 v3, p3

    .line 104
    .line 105
    move/from16 v4, p4

    .line 106
    .line 107
    invoke-direct/range {v0 .. v7}, La/wq30;-><init>(La/xq30;La/v0;La/z3;IILa/i4d0;B)V

    .line 108
    .line 109
    .line 110
    invoke-direct {v12, v14, v0}, La/b660;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 111
    .line 112
    .line 113
    move-object v3, v12

    .line 114
    goto :goto_2

    .line 115
    :cond_1
    sget-object v3, La/ujn;->c:La/f93;

    .line 116
    .line 117
    :goto_2
    iget-object v0, v8, La/g45;->h:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, La/qgd;

    .line 120
    .line 121
    invoke-virtual {v0, v15}, La/qgd;->d0(La/a4d0;)La/wsy;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    const/4 v1, 0x0

    .line 126
    invoke-static {v9, v0, v1, v3, v5}, La/obb;->M(La/kp9;La/wsy;La/g950;La/g93;I)La/c8z;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-eqz v0, :cond_2

    .line 131
    .line 132
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    :cond_2
    move-object/from16 v1, p0

    .line 136
    .line 137
    move v5, v13

    .line 138
    goto :goto_0

    .line 139
    :cond_3
    const/4 v1, 0x0

    .line 140
    invoke-static {}, La/q3d;->p()V

    .line 141
    .line 142
    .line 143
    throw v1

    .line 144
    :cond_4
    return-object v10
.end method

.method public final c(La/z3;II)La/g93;
    .locals 3

    .line 1
    sget-object v0, La/njq;->c:La/kjq;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    sget-object p0, La/ujn;->c:La/f93;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance p2, La/b660;

    .line 17
    .line 18
    iget-object v0, p0, La/xq30;->a:La/g45;

    .line 19
    .line 20
    iget-object v0, v0, La/g45;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/f6i;

    .line 23
    .line 24
    iget-object v0, v0, La/f6i;->e:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, La/eu00;

    .line 27
    .line 28
    new-instance v1, La/uq30;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v1, p0, p1, p3, v2}, La/uq30;-><init>(La/xq30;La/z3;IB)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p2, v0, v1}, La/b660;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 35
    .line 36
    .line 37
    return-object p2
.end method

.method public final d(La/p3d0;Z)La/g93;
    .locals 3

    .line 1
    sget-object v0, La/njq;->c:La/kjq;

    .line 2
    .line 3
    iget v1, p1, La/p3d0;->d:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object p0, La/ujn;->c:La/f93;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance v0, La/b660;

    .line 19
    .line 20
    iget-object v1, p0, La/xq30;->a:La/g45;

    .line 21
    .line 22
    iget-object v1, v1, La/g45;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, La/f6i;

    .line 25
    .line 26
    iget-object v1, v1, La/f6i;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, La/eu00;

    .line 29
    .line 30
    new-instance v2, La/vq30;

    .line 31
    .line 32
    invoke-direct {v2, p0, p2, p1}, La/vq30;-><init>(La/xq30;ZLa/p3d0;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1, v2}, La/b660;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public final e(La/v2d0;Z)La/xek;
    .locals 14

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v12, p0, La/xq30;->a:La/g45;

    .line 5
    .line 6
    iget-object v1, v12, La/g45;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, La/vjj;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast v1, La/wm40;

    .line 14
    .line 15
    new-instance v2, La/xek;

    .line 16
    .line 17
    iget v3, p1, La/v2d0;->d:I

    .line 18
    .line 19
    const/4 v13, 0x1

    .line 20
    invoke-virtual {p0, p1, v3, v13}, La/xq30;->c(La/z3;II)La/g93;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-object v0, v12, La/g45;->b:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v7, v0

    .line 27
    check-cast v7, La/h950;

    .line 28
    .line 29
    iget-object v0, v12, La/g45;->d:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v8, v0

    .line 32
    check-cast v8, La/roi0;

    .line 33
    .line 34
    iget-object v0, v12, La/g45;->e:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v9, v0

    .line 37
    check-cast v9, La/xbu0;

    .line 38
    .line 39
    iget-object v0, v12, La/g45;->g:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v10, v0

    .line 42
    check-cast v10, La/hfk;

    .line 43
    .line 44
    move-object v0, v2

    .line 45
    const/4 v2, 0x0

    .line 46
    const/4 v5, 0x1

    .line 47
    const/4 v11, 0x0

    .line 48
    move-object v6, p1

    .line 49
    move/from16 v4, p2

    .line 50
    .line 51
    invoke-direct/range {v0 .. v11}, La/xek;-><init>(La/wm40;La/x4e;La/g93;ZILa/v2d0;La/h950;La/roi0;La/xbu0;La/hfk;La/gmk0;)V

    .line 52
    .line 53
    .line 54
    sget-object v2, La/iun;->a:La/iun;

    .line 55
    .line 56
    invoke-static {v12, v0, v2}, La/g45;->i(La/g45;La/yjj;Ljava/util/List;)La/g45;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iget-object v2, v2, La/g45;->i:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, La/xq30;

    .line 63
    .line 64
    iget-object v3, p1, La/v2d0;->e:Ljava/util/List;

    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v3, p1, v13}, La/xq30;->h(Ljava/util/List;La/z3;I)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    sget-object v3, La/njq;->d:La/ljq;

    .line 74
    .line 75
    iget v4, p1, La/v2d0;->d:I

    .line 76
    .line 77
    invoke-virtual {v3, v4}, La/ljq;->e(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, La/o4d0;

    .line 82
    .line 83
    if-nez v3, :cond_0

    .line 84
    .line 85
    const/4 v3, -0x1

    .line 86
    goto :goto_0

    .line 87
    :cond_0
    sget-object v4, La/v4d0;->b:[I

    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    aget v3, v4, v3

    .line 94
    .line 95
    :goto_0
    packed-switch v3, :pswitch_data_0

    .line 96
    .line 97
    .line 98
    sget-object v3, La/uek;->a:La/tek;

    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :pswitch_0
    sget-object v3, La/uek;->f:La/tek;

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :pswitch_1
    sget-object v3, La/uek;->e:La/tek;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :pswitch_2
    sget-object v3, La/uek;->c:La/tek;

    .line 117
    .line 118
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :pswitch_3
    sget-object v3, La/uek;->b:La/tek;

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :pswitch_4
    sget-object v3, La/uek;->a:La/tek;

    .line 129
    .line 130
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :pswitch_5
    sget-object v3, La/uek;->d:La/tek;

    .line 135
    .line 136
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    :goto_1
    invoke-virtual {v0, v2, v3}, La/flc;->C1(Ljava/util/List;La/tek;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, La/wm40;->I()La/kzj0;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v0, v2}, La/oer;->x1(La/kzj0;)V

    .line 147
    .line 148
    .line 149
    invoke-interface {v1}, La/sq30;->Q()Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    iput-boolean v1, v0, La/oer;->s:Z

    .line 154
    .line 155
    sget-object v1, La/njq;->o:La/kjq;

    .line 156
    .line 157
    iget v2, p1, La/v2d0;->d:I

    .line 158
    .line 159
    invoke-virtual {v1, v2}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    xor-int/2addr v1, v13

    .line 168
    iput-boolean v1, v0, La/oer;->w:Z

    .line 169
    .line 170
    return-object v0

    .line 171
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(La/i3d0;)La/sfk;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    iget-object v12, v0, La/xq30;->a:La/g45;

    .line 6
    .line 7
    iget-object v1, v12, La/g45;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/h950;

    .line 10
    .line 11
    iget-object v2, v12, La/g45;->d:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v8, v2

    .line 14
    check-cast v8, La/roi0;

    .line 15
    .line 16
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget v2, v6, La/i3d0;->c:I

    .line 20
    .line 21
    const/4 v13, 0x1

    .line 22
    and-int/2addr v2, v13

    .line 23
    if-ne v2, v13, :cond_0

    .line 24
    .line 25
    iget v2, v6, La/i3d0;->d:I

    .line 26
    .line 27
    :goto_0
    move v14, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    iget v2, v6, La/i3d0;->e:I

    .line 30
    .line 31
    and-int/lit8 v3, v2, 0x3f

    .line 32
    .line 33
    shr-int/lit8 v2, v2, 0x8

    .line 34
    .line 35
    shl-int/lit8 v2, v2, 0x6

    .line 36
    .line 37
    add-int/2addr v2, v3

    .line 38
    goto :goto_0

    .line 39
    :goto_1
    invoke-virtual {v0, v6, v14, v13}, La/xq30;->c(La/z3;II)La/g93;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    iget v2, v6, La/i3d0;->c:I

    .line 44
    .line 45
    and-int/lit8 v4, v2, 0x20

    .line 46
    .line 47
    const/16 v5, 0x20

    .line 48
    .line 49
    if-ne v4, v5, :cond_1

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    const/16 v4, 0x40

    .line 53
    .line 54
    and-int/2addr v2, v4

    .line 55
    if-ne v2, v4, :cond_2

    .line 56
    .line 57
    :goto_2
    new-instance v2, La/vek;

    .line 58
    .line 59
    iget-object v4, v12, La/g45;->a:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, La/f6i;

    .line 62
    .line 63
    iget-object v4, v4, La/f6i;->e:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v4, La/eu00;

    .line 66
    .line 67
    new-instance v5, La/uq30;

    .line 68
    .line 69
    invoke-direct {v5, v0, v6, v13, v13}, La/uq30;-><init>(La/xq30;La/z3;IB)V

    .line 70
    .line 71
    .line 72
    invoke-direct {v2, v4, v5}, La/vek;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 73
    .line 74
    .line 75
    :goto_3
    move-object v15, v2

    .line 76
    goto :goto_4

    .line 77
    :cond_2
    sget-object v2, La/ujn;->c:La/f93;

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :goto_4
    iget-object v0, v12, La/g45;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, La/vjj;

    .line 83
    .line 84
    invoke-static {v0}, La/rek;->g(La/vjj;)La/swq;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget v2, v6, La/i3d0;->f:I

    .line 89
    .line 90
    invoke-static {v1, v2}, La/ydx;->L(La/h950;I)La/g950;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v0, v2}, La/swq;->a(La/g950;)La/swq;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sget-object v2, La/zmn0;->a:La/swq;

    .line 99
    .line 100
    invoke-virtual {v0, v2}, La/swq;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_3

    .line 105
    .line 106
    sget-object v0, La/xbu0;->b:La/xbu0;

    .line 107
    .line 108
    :goto_5
    move-object v9, v0

    .line 109
    goto :goto_6

    .line 110
    :cond_3
    iget-object v0, v12, La/g45;->e:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, La/xbu0;

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :goto_6
    new-instance v0, La/sfk;

    .line 116
    .line 117
    iget-object v2, v12, La/g45;->c:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v2, La/vjj;

    .line 120
    .line 121
    iget v4, v6, La/i3d0;->f:I

    .line 122
    .line 123
    invoke-static {v1, v4}, La/ydx;->L(La/h950;I)La/g950;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    sget-object v1, La/njq;->q:La/ljq;

    .line 128
    .line 129
    invoke-virtual {v1, v14}, La/ljq;->e(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, La/j3d0;

    .line 134
    .line 135
    invoke-static {v1}, La/l8x;->k0(La/j3d0;)I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    iget-object v1, v12, La/g45;->b:Ljava/lang/Object;

    .line 140
    .line 141
    move-object v7, v1

    .line 142
    check-cast v7, La/h950;

    .line 143
    .line 144
    iget-object v1, v12, La/g45;->g:Ljava/lang/Object;

    .line 145
    .line 146
    move-object v10, v1

    .line 147
    check-cast v10, La/hfk;

    .line 148
    .line 149
    move-object v1, v2

    .line 150
    const/4 v2, 0x0

    .line 151
    const/4 v11, 0x0

    .line 152
    invoke-direct/range {v0 .. v11}, La/sfk;-><init>(La/vjj;La/fyj0;La/g93;La/g950;ILa/i3d0;La/h950;La/roi0;La/xbu0;La/hfk;La/gmk0;)V

    .line 153
    .line 154
    .line 155
    iget-object v1, v6, La/i3d0;->i:Ljava/util/List;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-static {v12, v0, v1}, La/g45;->i(La/g45;La/yjj;Ljava/util/List;)La/g45;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    iget-object v2, v1, La/g45;->i:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v2, La/xq30;

    .line 167
    .line 168
    iget-object v1, v1, La/g45;->h:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v1, La/qgd;

    .line 171
    .line 172
    invoke-static {v6, v8}, La/m8x;->f0(La/i3d0;La/roi0;)La/a4d0;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    const/4 v4, 0x0

    .line 177
    if-eqz v3, :cond_5

    .line 178
    .line 179
    sget-object v5, La/njq;->A:La/kjq;

    .line 180
    .line 181
    invoke-virtual {v5, v14}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    if-nez v5, :cond_4

    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_4
    move-object v3, v4

    .line 193
    :goto_7
    if-eqz v3, :cond_5

    .line 194
    .line 195
    invoke-virtual {v1, v3}, La/qgd;->d0(La/a4d0;)La/wsy;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    if-eqz v3, :cond_5

    .line 200
    .line 201
    invoke-static {v0, v3, v15}, La/obb;->S(La/kp9;La/wsy;La/g93;)La/c8z;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    move-object/from16 v17, v3

    .line 206
    .line 207
    goto :goto_8

    .line 208
    :cond_5
    move-object/from16 v17, v4

    .line 209
    .line 210
    :goto_8
    iget-object v3, v12, La/g45;->c:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v3, La/vjj;

    .line 213
    .line 214
    instance-of v5, v3, La/wm40;

    .line 215
    .line 216
    if-eqz v5, :cond_6

    .line 217
    .line 218
    check-cast v3, La/wm40;

    .line 219
    .line 220
    goto :goto_9

    .line 221
    :cond_6
    move-object v3, v4

    .line 222
    :goto_9
    if-eqz v3, :cond_7

    .line 223
    .line 224
    invoke-virtual {v3}, La/wm40;->f0()La/c8z;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    goto :goto_a

    .line 229
    :cond_7
    move-object v3, v4

    .line 230
    :goto_a
    if-eqz v3, :cond_8

    .line 231
    .line 232
    sget-object v5, La/njq;->A:La/kjq;

    .line 233
    .line 234
    invoke-virtual {v5, v14}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    if-nez v5, :cond_8

    .line 243
    .line 244
    move-object/from16 v18, v3

    .line 245
    .line 246
    goto :goto_b

    .line 247
    :cond_8
    move-object/from16 v18, v4

    .line 248
    .line 249
    :goto_b
    invoke-static {v6, v8}, La/m8x;->L(La/i3d0;La/roi0;)Ljava/util/List;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    iget-object v4, v6, La/i3d0;->o:Ljava/util/List;

    .line 254
    .line 255
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v3, v4, v6, v13}, La/xq30;->b(Ljava/util/List;Ljava/util/List;La/z3;I)Ljava/util/ArrayList;

    .line 259
    .line 260
    .line 261
    move-result-object v19

    .line 262
    invoke-virtual {v1}, La/qgd;->E()Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v20

    .line 266
    iget-object v3, v6, La/i3d0;->p:Ljava/util/List;

    .line 267
    .line 268
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2, v3, v6, v13}, La/xq30;->h(Ljava/util/List;La/z3;I)Ljava/util/List;

    .line 272
    .line 273
    .line 274
    move-result-object v21

    .line 275
    invoke-static {v6, v8}, La/m8x;->i0(La/i3d0;La/roi0;)La/a4d0;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-virtual {v1, v2}, La/qgd;->d0(La/a4d0;)La/wsy;

    .line 280
    .line 281
    .line 282
    move-result-object v22

    .line 283
    sget-object v1, La/njq;->e:La/ljq;

    .line 284
    .line 285
    invoke-virtual {v1, v14}, La/ljq;->e(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    check-cast v1, La/k3d0;

    .line 290
    .line 291
    invoke-static {v1}, La/lwf;->a(La/k3d0;)La/gm40;

    .line 292
    .line 293
    .line 294
    move-result-object v23

    .line 295
    sget-object v1, La/njq;->d:La/ljq;

    .line 296
    .line 297
    invoke-virtual {v1, v14}, La/ljq;->e(I)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    check-cast v1, La/o4d0;

    .line 302
    .line 303
    invoke-static {v1}, La/l8x;->V(La/o4d0;)La/tek;

    .line 304
    .line 305
    .line 306
    move-result-object v24

    .line 307
    sget-object v25, La/lun;->a:La/lun;

    .line 308
    .line 309
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    move-object/from16 v16, v0

    .line 313
    .line 314
    invoke-virtual/range {v16 .. v25}, La/fyj0;->C1(La/c8z;La/c8z;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/wsy;La/gm40;La/tek;Ljava/util/Map;)La/fyj0;

    .line 315
    .line 316
    .line 317
    sget-object v1, La/njq;->r:La/kjq;

    .line 318
    .line 319
    invoke-virtual {v1, v14}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    iput-boolean v1, v0, La/oer;->n:Z

    .line 328
    .line 329
    sget-object v1, La/njq;->s:La/kjq;

    .line 330
    .line 331
    invoke-virtual {v1, v14}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    iput-boolean v1, v0, La/oer;->o:Z

    .line 340
    .line 341
    sget-object v1, La/njq;->v:La/kjq;

    .line 342
    .line 343
    invoke-virtual {v1, v14}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    iput-boolean v1, v0, La/oer;->p:Z

    .line 352
    .line 353
    sget-object v1, La/njq;->t:La/kjq;

    .line 354
    .line 355
    invoke-virtual {v1, v14}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 360
    .line 361
    .line 362
    move-result v1

    .line 363
    iput-boolean v1, v0, La/oer;->q:Z

    .line 364
    .line 365
    sget-object v1, La/njq;->u:La/kjq;

    .line 366
    .line 367
    invoke-virtual {v1, v14}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    iput-boolean v1, v0, La/oer;->r:Z

    .line 376
    .line 377
    sget-object v1, La/njq;->w:La/kjq;

    .line 378
    .line 379
    invoke-virtual {v1, v14}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    iput-boolean v1, v0, La/oer;->v:Z

    .line 388
    .line 389
    sget-object v1, La/njq;->x:La/kjq;

    .line 390
    .line 391
    invoke-virtual {v1, v14}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    iput-boolean v1, v0, La/oer;->s:Z

    .line 400
    .line 401
    sget-object v1, La/njq;->y:La/kjq;

    .line 402
    .line 403
    invoke-virtual {v1, v14}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    xor-int/2addr v1, v13

    .line 412
    iput-boolean v1, v0, La/oer;->w:Z

    .line 413
    .line 414
    iget-object v1, v12, La/g45;->a:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v1, La/f6i;

    .line 417
    .line 418
    iget-object v1, v1, La/f6i;->o:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast v1, La/std;

    .line 421
    .line 422
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    return-object v0
.end method

.method public final g(La/p3d0;Z)La/rfk;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v15, p1

    .line 4
    .line 5
    sget-object v20, La/ujn;->c:La/f93;

    .line 6
    .line 7
    iget-object v1, v0, La/xq30;->a:La/g45;

    .line 8
    .line 9
    iget-object v2, v1, La/g45;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, La/h950;

    .line 12
    .line 13
    iget-object v3, v1, La/g45;->d:Ljava/lang/Object;

    .line 14
    .line 15
    move-object/from16 v17, v3

    .line 16
    .line 17
    check-cast v17, La/roi0;

    .line 18
    .line 19
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget v3, v15, La/p3d0;->c:I

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    and-int/2addr v3, v4

    .line 26
    const/16 v21, 0x6

    .line 27
    .line 28
    if-ne v3, v4, :cond_0

    .line 29
    .line 30
    iget v3, v15, La/p3d0;->d:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget v3, v15, La/p3d0;->e:I

    .line 34
    .line 35
    and-int/lit8 v5, v3, 0x3f

    .line 36
    .line 37
    shr-int/lit8 v3, v3, 0x8

    .line 38
    .line 39
    shl-int/lit8 v3, v3, 0x6

    .line 40
    .line 41
    add-int/2addr v3, v5

    .line 42
    :goto_0
    const/4 v5, 0x0

    .line 43
    if-eqz p2, :cond_3

    .line 44
    .line 45
    iget-object v7, v15, La/p3d0;->u:Ljava/util/List;

    .line 46
    .line 47
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v8, Ljava/util/ArrayList;

    .line 51
    .line 52
    const/16 v9, 0xa

    .line 53
    .line 54
    invoke-static {v7, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    if-eqz v9, :cond_1

    .line 70
    .line 71
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    check-cast v9, La/p2d0;

    .line 76
    .line 77
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object v10, v0, La/xq30;->b:La/ehf0;

    .line 81
    .line 82
    invoke-virtual {v10, v9, v2}, La/ehf0;->d(La/p2d0;La/h950;)La/u83;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-eqz v7, :cond_2

    .line 95
    .line 96
    move-object/from16 v7, v20

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    new-instance v7, La/i93;

    .line 100
    .line 101
    invoke-direct {v7, v8, v5}, La/i93;-><init>(Ljava/util/List;B)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    const/4 v7, 0x0

    .line 106
    :goto_2
    new-instance v23, La/rfk;

    .line 107
    .line 108
    iget-object v8, v1, La/g45;->c:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v8, La/vjj;

    .line 111
    .line 112
    if-nez v7, :cond_4

    .line 113
    .line 114
    const/4 v7, 0x2

    .line 115
    invoke-virtual {v0, v15, v3, v7}, La/xq30;->c(La/z3;II)La/g93;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    :cond_4
    sget-object v9, La/njq;->e:La/ljq;

    .line 120
    .line 121
    invoke-virtual {v9, v3}, La/ljq;->e(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    check-cast v10, La/k3d0;

    .line 126
    .line 127
    invoke-static {v10}, La/lwf;->a(La/k3d0;)La/gm40;

    .line 128
    .line 129
    .line 130
    move-result-object v10

    .line 131
    sget-object v11, La/njq;->d:La/ljq;

    .line 132
    .line 133
    invoke-virtual {v11, v3}, La/ljq;->e(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v12

    .line 137
    check-cast v12, La/o4d0;

    .line 138
    .line 139
    invoke-static {v12}, La/l8x;->V(La/o4d0;)La/tek;

    .line 140
    .line 141
    .line 142
    move-result-object v12

    .line 143
    sget-object v13, La/njq;->B:La/kjq;

    .line 144
    .line 145
    invoke-virtual {v13, v3}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 150
    .line 151
    .line 152
    move-result v13

    .line 153
    iget v14, v15, La/p3d0;->f:I

    .line 154
    .line 155
    invoke-static {v2, v14}, La/ydx;->L(La/h950;I)La/g950;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    sget-object v14, La/njq;->q:La/ljq;

    .line 160
    .line 161
    invoke-virtual {v14, v3}, La/ljq;->e(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v14

    .line 165
    check-cast v14, La/j3d0;

    .line 166
    .line 167
    invoke-static {v14}, La/l8x;->k0(La/j3d0;)I

    .line 168
    .line 169
    .line 170
    move-result v14

    .line 171
    sget-object v4, La/njq;->F:La/kjq;

    .line 172
    .line 173
    invoke-virtual {v4, v3}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    sget-object v5, La/njq;->E:La/kjq;

    .line 182
    .line 183
    invoke-virtual {v5, v3}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    sget-object v6, La/njq;->H:La/kjq;

    .line 192
    .line 193
    invoke-virtual {v6, v3}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    move-object/from16 p2, v2

    .line 202
    .line 203
    sget-object v2, La/njq;->I:La/kjq;

    .line 204
    .line 205
    invoke-virtual {v2, v3}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    move/from16 v22, v2

    .line 214
    .line 215
    sget-object v2, La/njq;->J:La/kjq;

    .line 216
    .line 217
    invoke-virtual {v2, v3}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    move/from16 v24, v2

    .line 226
    .line 227
    iget-object v2, v1, La/g45;->b:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v2, La/h950;

    .line 230
    .line 231
    move-object/from16 v25, v2

    .line 232
    .line 233
    iget-object v2, v1, La/g45;->e:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v2, La/xbu0;

    .line 236
    .line 237
    move-object/from16 v26, v2

    .line 238
    .line 239
    iget-object v2, v1, La/g45;->g:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v2, La/hfk;

    .line 242
    .line 243
    move/from16 v27, v3

    .line 244
    .line 245
    const/4 v3, 0x0

    .line 246
    move-object v0, v12

    .line 247
    move v12, v6

    .line 248
    move-object v6, v0

    .line 249
    move-object v0, v1

    .line 250
    move-object/from16 v19, v2

    .line 251
    .line 252
    move-object v2, v8

    .line 253
    move-object/from16 v33, v9

    .line 254
    .line 255
    move-object/from16 v34, v11

    .line 256
    .line 257
    move v9, v14

    .line 258
    move-object/from16 v1, v23

    .line 259
    .line 260
    move/from16 v14, v24

    .line 261
    .line 262
    move-object/from16 v16, v25

    .line 263
    .line 264
    move-object/from16 v18, v26

    .line 265
    .line 266
    move-object/from16 v8, p2

    .line 267
    .line 268
    move v11, v5

    .line 269
    move-object v5, v10

    .line 270
    move/from16 p2, v27

    .line 271
    .line 272
    move v10, v4

    .line 273
    move-object v4, v7

    .line 274
    move v7, v13

    .line 275
    move/from16 v13, v22

    .line 276
    .line 277
    invoke-direct/range {v1 .. v19}, La/rfk;-><init>(La/vjj;La/d0d0;La/g93;La/gm40;La/tek;ZLa/g950;IZZZZZLa/p3d0;La/h950;La/roi0;La/xbu0;La/hfk;)V

    .line 278
    .line 279
    .line 280
    move-object/from16 v3, v17

    .line 281
    .line 282
    iget-object v2, v15, La/p3d0;->i:Ljava/util/List;

    .line 283
    .line 284
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-static {v0, v1, v2}, La/g45;->i(La/g45;La/yjj;Ljava/util/List;)La/g45;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    iget-object v4, v2, La/g45;->h:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v4, La/qgd;

    .line 294
    .line 295
    sget-object v5, La/njq;->C:La/kjq;

    .line 296
    .line 297
    move/from16 v6, p2

    .line 298
    .line 299
    invoke-virtual {v5, v6}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    const/4 v7, 0x3

    .line 308
    if-eqz v5, :cond_6

    .line 309
    .line 310
    iget v8, v15, La/p3d0;->c:I

    .line 311
    .line 312
    and-int/lit8 v9, v8, 0x20

    .line 313
    .line 314
    const/16 v10, 0x20

    .line 315
    .line 316
    if-ne v9, v10, :cond_5

    .line 317
    .line 318
    goto :goto_3

    .line 319
    :cond_5
    const/16 v9, 0x40

    .line 320
    .line 321
    and-int/2addr v8, v9

    .line 322
    if-ne v8, v9, :cond_6

    .line 323
    .line 324
    :goto_3
    new-instance v8, La/vek;

    .line 325
    .line 326
    iget-object v9, v0, La/g45;->a:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v9, La/f6i;

    .line 329
    .line 330
    iget-object v9, v9, La/f6i;->e:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v9, La/eu00;

    .line 333
    .line 334
    new-instance v10, La/uq30;

    .line 335
    .line 336
    const/4 v11, 0x1

    .line 337
    move-object/from16 v14, p0

    .line 338
    .line 339
    invoke-direct {v10, v14, v15, v7, v11}, La/uq30;-><init>(La/xq30;La/z3;IB)V

    .line 340
    .line 341
    .line 342
    invoke-direct {v8, v9, v10}, La/vek;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 343
    .line 344
    .line 345
    goto :goto_4

    .line 346
    :cond_6
    const/4 v11, 0x1

    .line 347
    move-object/from16 v14, p0

    .line 348
    .line 349
    move-object/from16 v8, v20

    .line 350
    .line 351
    :goto_4
    invoke-static {v15, v3}, La/m8x;->j0(La/p3d0;La/roi0;)La/a4d0;

    .line 352
    .line 353
    .line 354
    move-result-object v9

    .line 355
    invoke-virtual {v4, v9}, La/qgd;->d0(La/a4d0;)La/wsy;

    .line 356
    .line 357
    .line 358
    move-result-object v9

    .line 359
    invoke-virtual {v4}, La/qgd;->E()Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v10

    .line 363
    iget-object v12, v0, La/g45;->c:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v12, La/vjj;

    .line 366
    .line 367
    instance-of v13, v12, La/wm40;

    .line 368
    .line 369
    if-eqz v13, :cond_7

    .line 370
    .line 371
    check-cast v12, La/wm40;

    .line 372
    .line 373
    goto :goto_5

    .line 374
    :cond_7
    const/4 v12, 0x0

    .line 375
    :goto_5
    if-eqz v12, :cond_8

    .line 376
    .line 377
    invoke-virtual {v12}, La/wm40;->f0()La/c8z;

    .line 378
    .line 379
    .line 380
    move-result-object v12

    .line 381
    goto :goto_6

    .line 382
    :cond_8
    const/4 v12, 0x0

    .line 383
    :goto_6
    if-eqz v12, :cond_9

    .line 384
    .line 385
    sget-object v13, La/njq;->L:La/kjq;

    .line 386
    .line 387
    invoke-virtual {v13, v6}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 388
    .line 389
    .line 390
    move-result-object v13

    .line 391
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 392
    .line 393
    .line 394
    move-result v13

    .line 395
    if-nez v13, :cond_9

    .line 396
    .line 397
    move/from16 v16, v11

    .line 398
    .line 399
    move-object v11, v12

    .line 400
    goto :goto_7

    .line 401
    :cond_9
    move/from16 v16, v11

    .line 402
    .line 403
    const/4 v11, 0x0

    .line 404
    :goto_7
    invoke-static {v15, v3}, La/m8x;->g0(La/p3d0;La/roi0;)La/a4d0;

    .line 405
    .line 406
    .line 407
    move-result-object v12

    .line 408
    if-eqz v12, :cond_b

    .line 409
    .line 410
    sget-object v13, La/njq;->L:La/kjq;

    .line 411
    .line 412
    invoke-virtual {v13, v6}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 413
    .line 414
    .line 415
    move-result-object v13

    .line 416
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 417
    .line 418
    .line 419
    move-result v13

    .line 420
    if-nez v13, :cond_a

    .line 421
    .line 422
    goto :goto_8

    .line 423
    :cond_a
    const/4 v12, 0x0

    .line 424
    :goto_8
    if-eqz v12, :cond_b

    .line 425
    .line 426
    invoke-virtual {v4, v12}, La/qgd;->d0(La/a4d0;)La/wsy;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    if-eqz v4, :cond_b

    .line 431
    .line 432
    invoke-static {v1, v4, v8}, La/obb;->S(La/kp9;La/wsy;La/g93;)La/c8z;

    .line 433
    .line 434
    .line 435
    move-result-object v4

    .line 436
    move-object v12, v4

    .line 437
    goto :goto_9

    .line 438
    :cond_b
    const/4 v12, 0x0

    .line 439
    :goto_9
    iget-object v4, v2, La/g45;->i:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v4, La/xq30;

    .line 442
    .line 443
    invoke-static {v15, v3}, La/m8x;->M(La/p3d0;La/roi0;)Ljava/util/List;

    .line 444
    .line 445
    .line 446
    move-result-object v3

    .line 447
    iget-object v8, v15, La/p3d0;->o:Ljava/util/List;

    .line 448
    .line 449
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v4, v3, v8, v15, v7}, La/xq30;->b(Ljava/util/List;Ljava/util/List;La/z3;I)Ljava/util/ArrayList;

    .line 453
    .line 454
    .line 455
    move-result-object v13

    .line 456
    move-object v8, v1

    .line 457
    move/from16 v1, v16

    .line 458
    .line 459
    invoke-virtual/range {v8 .. v13}, La/f0d0;->w1(La/wsy;Ljava/util/List;La/c8z;La/c8z;Ljava/util/List;)V

    .line 460
    .line 461
    .line 462
    move-object/from16 v23, v8

    .line 463
    .line 464
    sget-object v3, La/njq;->c:La/kjq;

    .line 465
    .line 466
    invoke-virtual {v3, v6}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    move-object/from16 v4, v34

    .line 475
    .line 476
    invoke-virtual {v4, v6}, La/ljq;->e(I)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v8

    .line 480
    check-cast v8, La/o4d0;

    .line 481
    .line 482
    move-object/from16 v9, v33

    .line 483
    .line 484
    invoke-virtual {v9, v6}, La/ljq;->e(I)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v10

    .line 488
    check-cast v10, La/k3d0;

    .line 489
    .line 490
    invoke-static {v3, v8, v10}, La/njq;->b(ZLa/o4d0;La/k3d0;)I

    .line 491
    .line 492
    .line 493
    move-result v3

    .line 494
    sget-object v32, La/gmk0;->x0:La/gne0;

    .line 495
    .line 496
    if-eqz v5, :cond_e

    .line 497
    .line 498
    iget v5, v15, La/p3d0;->c:I

    .line 499
    .line 500
    const/16 v8, 0x100

    .line 501
    .line 502
    and-int/2addr v5, v8

    .line 503
    if-ne v5, v8, :cond_c

    .line 504
    .line 505
    iget v5, v15, La/p3d0;->q:I

    .line 506
    .line 507
    goto :goto_a

    .line 508
    :cond_c
    move v5, v3

    .line 509
    :goto_a
    sget-object v8, La/njq;->P:La/kjq;

    .line 510
    .line 511
    invoke-virtual {v8, v5}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 512
    .line 513
    .line 514
    move-result-object v8

    .line 515
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 516
    .line 517
    .line 518
    move-result v8

    .line 519
    sget-object v10, La/njq;->Q:La/kjq;

    .line 520
    .line 521
    invoke-virtual {v10, v5}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 522
    .line 523
    .line 524
    move-result-object v10

    .line 525
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 526
    .line 527
    .line 528
    move-result v28

    .line 529
    sget-object v10, La/njq;->R:La/kjq;

    .line 530
    .line 531
    invoke-virtual {v10, v5}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 532
    .line 533
    .line 534
    move-result-object v10

    .line 535
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 536
    .line 537
    .line 538
    move-result v29

    .line 539
    invoke-virtual {v14, v15, v5, v7}, La/xq30;->c(La/z3;II)La/g93;

    .line 540
    .line 541
    .line 542
    move-result-object v24

    .line 543
    if-eqz v8, :cond_d

    .line 544
    .line 545
    new-instance v22, La/g0d0;

    .line 546
    .line 547
    invoke-virtual {v9, v5}, La/ljq;->e(I)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v7

    .line 551
    check-cast v7, La/k3d0;

    .line 552
    .line 553
    invoke-static {v7}, La/lwf;->a(La/k3d0;)La/gm40;

    .line 554
    .line 555
    .line 556
    move-result-object v25

    .line 557
    invoke-virtual {v4, v5}, La/ljq;->e(I)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v5

    .line 561
    check-cast v5, La/o4d0;

    .line 562
    .line 563
    invoke-static {v5}, La/l8x;->V(La/o4d0;)La/tek;

    .line 564
    .line 565
    .line 566
    move-result-object v26

    .line 567
    xor-int/lit8 v27, v8, 0x1

    .line 568
    .line 569
    invoke-virtual/range {v23 .. v23}, La/f0d0;->l()I

    .line 570
    .line 571
    .line 572
    move-result v30

    .line 573
    const/16 v31, 0x0

    .line 574
    .line 575
    invoke-direct/range {v22 .. v32}, La/g0d0;-><init>(La/d0d0;La/g93;La/gm40;La/tek;ZZZILa/g0d0;La/gmk0;)V

    .line 576
    .line 577
    .line 578
    move-object/from16 v8, v23

    .line 579
    .line 580
    move-object/from16 v5, v22

    .line 581
    .line 582
    goto :goto_b

    .line 583
    :cond_d
    move-object/from16 v8, v23

    .line 584
    .line 585
    move-object/from16 v5, v24

    .line 586
    .line 587
    invoke-static {v8, v5}, La/obb;->N(La/d0d0;La/g93;)La/g0d0;

    .line 588
    .line 589
    .line 590
    move-result-object v5

    .line 591
    :goto_b
    invoke-virtual {v8}, La/f0d0;->getReturnType()La/wsy;

    .line 592
    .line 593
    .line 594
    move-result-object v7

    .line 595
    invoke-virtual {v5, v7}, La/g0d0;->s1(La/wsy;)V

    .line 596
    .line 597
    .line 598
    goto :goto_c

    .line 599
    :cond_e
    move-object/from16 v8, v23

    .line 600
    .line 601
    const/4 v5, 0x0

    .line 602
    :goto_c
    sget-object v7, La/njq;->D:La/kjq;

    .line 603
    .line 604
    invoke-virtual {v7, v6}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 605
    .line 606
    .line 607
    move-result-object v7

    .line 608
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 609
    .line 610
    .line 611
    move-result v7

    .line 612
    if-eqz v7, :cond_12

    .line 613
    .line 614
    iget v7, v15, La/p3d0;->c:I

    .line 615
    .line 616
    const/16 v10, 0x200

    .line 617
    .line 618
    and-int/2addr v7, v10

    .line 619
    if-ne v7, v10, :cond_f

    .line 620
    .line 621
    iget v3, v15, La/p3d0;->r:I

    .line 622
    .line 623
    :cond_f
    sget-object v7, La/njq;->P:La/kjq;

    .line 624
    .line 625
    invoke-virtual {v7, v3}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 626
    .line 627
    .line 628
    move-result-object v7

    .line 629
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 630
    .line 631
    .line 632
    move-result v7

    .line 633
    sget-object v10, La/njq;->Q:La/kjq;

    .line 634
    .line 635
    invoke-virtual {v10, v3}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 636
    .line 637
    .line 638
    move-result-object v10

    .line 639
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 640
    .line 641
    .line 642
    move-result v28

    .line 643
    sget-object v10, La/njq;->R:La/kjq;

    .line 644
    .line 645
    invoke-virtual {v10, v3}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 646
    .line 647
    .line 648
    move-result-object v10

    .line 649
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 650
    .line 651
    .line 652
    move-result v29

    .line 653
    const/4 v10, 0x4

    .line 654
    invoke-virtual {v14, v15, v3, v10}, La/xq30;->c(La/z3;II)La/g93;

    .line 655
    .line 656
    .line 657
    move-result-object v24

    .line 658
    if-eqz v7, :cond_11

    .line 659
    .line 660
    new-instance v22, La/n0d0;

    .line 661
    .line 662
    invoke-virtual {v9, v3}, La/ljq;->e(I)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v9

    .line 666
    check-cast v9, La/k3d0;

    .line 667
    .line 668
    invoke-static {v9}, La/lwf;->a(La/k3d0;)La/gm40;

    .line 669
    .line 670
    .line 671
    move-result-object v25

    .line 672
    invoke-virtual {v4, v3}, La/ljq;->e(I)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v3

    .line 676
    check-cast v3, La/o4d0;

    .line 677
    .line 678
    invoke-static {v3}, La/l8x;->V(La/o4d0;)La/tek;

    .line 679
    .line 680
    .line 681
    move-result-object v26

    .line 682
    xor-int/lit8 v27, v7, 0x1

    .line 683
    .line 684
    invoke-virtual {v8}, La/f0d0;->l()I

    .line 685
    .line 686
    .line 687
    move-result v30

    .line 688
    const/16 v31, 0x0

    .line 689
    .line 690
    move-object/from16 v23, v8

    .line 691
    .line 692
    invoke-direct/range {v22 .. v32}, La/n0d0;-><init>(La/d0d0;La/g93;La/gm40;La/tek;ZZZILa/n0d0;La/gmk0;)V

    .line 693
    .line 694
    .line 695
    move-object/from16 v3, v22

    .line 696
    .line 697
    sget-object v4, La/iun;->a:La/iun;

    .line 698
    .line 699
    invoke-static {v2, v3, v4}, La/g45;->i(La/g45;La/yjj;Ljava/util/List;)La/g45;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    iget-object v2, v2, La/g45;->i:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v2, La/xq30;

    .line 706
    .line 707
    iget-object v4, v15, La/p3d0;->p:La/i4d0;

    .line 708
    .line 709
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 710
    .line 711
    .line 712
    move-result-object v4

    .line 713
    invoke-virtual {v2, v4, v15, v10}, La/xq30;->h(Ljava/util/List;La/z3;I)Ljava/util/List;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v2

    .line 721
    check-cast v2, La/k3u0;

    .line 722
    .line 723
    if-eqz v2, :cond_10

    .line 724
    .line 725
    iput-object v2, v3, La/n0d0;->n:La/k3u0;

    .line 726
    .line 727
    const/4 v2, 0x0

    .line 728
    goto :goto_d

    .line 729
    :cond_10
    invoke-static/range {v21 .. v21}, La/n0d0;->k0(I)V

    .line 730
    .line 731
    .line 732
    const/4 v2, 0x0

    .line 733
    throw v2

    .line 734
    :cond_11
    move-object/from16 v3, v24

    .line 735
    .line 736
    const/4 v2, 0x0

    .line 737
    invoke-static {v8, v3}, La/obb;->O(La/d0d0;La/g93;)La/n0d0;

    .line 738
    .line 739
    .line 740
    move-result-object v3

    .line 741
    goto :goto_d

    .line 742
    :cond_12
    const/4 v2, 0x0

    .line 743
    move-object v3, v2

    .line 744
    :goto_d
    sget-object v4, La/njq;->G:La/kjq;

    .line 745
    .line 746
    invoke-virtual {v4, v6}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 747
    .line 748
    .line 749
    move-result-object v4

    .line 750
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 751
    .line 752
    .line 753
    move-result v4

    .line 754
    if-eqz v4, :cond_13

    .line 755
    .line 756
    new-instance v4, La/tq30;

    .line 757
    .line 758
    const/4 v6, 0x0

    .line 759
    invoke-direct {v4, v14, v15, v8, v6}, La/tq30;-><init>(La/xq30;La/p3d0;La/rfk;B)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v8, v2, v4}, La/f0d0;->u1(La/bu00;Lkotlin/jvm/functions/Function0;)V

    .line 763
    .line 764
    .line 765
    goto :goto_e

    .line 766
    :cond_13
    const/4 v6, 0x0

    .line 767
    :goto_e
    iget-object v0, v0, La/g45;->c:Ljava/lang/Object;

    .line 768
    .line 769
    check-cast v0, La/vjj;

    .line 770
    .line 771
    instance-of v4, v0, La/wm40;

    .line 772
    .line 773
    if-eqz v4, :cond_14

    .line 774
    .line 775
    check-cast v0, La/wm40;

    .line 776
    .line 777
    goto :goto_f

    .line 778
    :cond_14
    move-object v0, v2

    .line 779
    :goto_f
    if-eqz v0, :cond_15

    .line 780
    .line 781
    invoke-virtual {v0}, La/wm40;->r()La/slc;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    goto :goto_10

    .line 786
    :cond_15
    move-object v0, v2

    .line 787
    :goto_10
    sget-object v4, La/slc;->e:La/slc;

    .line 788
    .line 789
    if-ne v0, v4, :cond_16

    .line 790
    .line 791
    new-instance v0, La/tq30;

    .line 792
    .line 793
    invoke-direct {v0, v14, v15, v8, v1}, La/tq30;-><init>(La/xq30;La/p3d0;La/rfk;B)V

    .line 794
    .line 795
    .line 796
    invoke-virtual {v8, v2, v0}, La/f0d0;->u1(La/bu00;Lkotlin/jvm/functions/Function0;)V

    .line 797
    .line 798
    .line 799
    :cond_16
    new-instance v0, La/tqp;

    .line 800
    .line 801
    invoke-virtual {v14, v15, v6}, La/xq30;->d(La/p3d0;Z)La/g93;

    .line 802
    .line 803
    .line 804
    move-result-object v2

    .line 805
    invoke-direct {v0, v2}, La/p4;-><init>(La/g93;)V

    .line 806
    .line 807
    .line 808
    new-instance v2, La/tqp;

    .line 809
    .line 810
    invoke-virtual {v14, v15, v1}, La/xq30;->d(La/p3d0;Z)La/g93;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    invoke-direct {v2, v1}, La/p4;-><init>(La/g93;)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v8, v5, v3, v0, v2}, La/f0d0;->t1(La/g0d0;La/n0d0;La/tqp;La/tqp;)V

    .line 818
    .line 819
    .line 820
    return-object v8
.end method

.method public final h(Ljava/util/List;La/z3;I)Ljava/util/List;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v8, v1, La/xq30;->a:La/g45;

    .line 4
    .line 5
    iget-object v0, v8, La/g45;->d:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v9, v0

    .line 8
    check-cast v9, La/roi0;

    .line 9
    .line 10
    iget-object v0, v8, La/g45;->h:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v10, v0

    .line 13
    check-cast v10, La/qgd;

    .line 14
    .line 15
    iget-object v0, v8, La/g45;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/vjj;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-object v12, v0

    .line 23
    check-cast v12, La/kp9;

    .line 24
    .line 25
    invoke-interface {v12}, La/vjj;->j()La/vjj;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0}, La/xq30;->a(La/vjj;)La/v0;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v11, Ljava/util/ArrayList;

    .line 37
    .line 38
    const/16 v0, 0xa

    .line 39
    .line 40
    move-object/from16 v3, p1

    .line 41
    .line 42
    invoke-static {v3, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-direct {v11, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v23

    .line 53
    const/16 v24, 0x0

    .line 54
    .line 55
    move/from16 v14, v24

    .line 56
    .line 57
    :goto_0
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_6

    .line 62
    .line 63
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    add-int/lit8 v25, v14, 0x1

    .line 68
    .line 69
    if-ltz v14, :cond_5

    .line 70
    .line 71
    move-object v6, v0

    .line 72
    check-cast v6, La/i4d0;

    .line 73
    .line 74
    iget v0, v6, La/i4d0;->c:I

    .line 75
    .line 76
    const/4 v3, 0x1

    .line 77
    and-int/2addr v0, v3

    .line 78
    if-ne v0, v3, :cond_0

    .line 79
    .line 80
    iget v0, v6, La/i4d0;->d:I

    .line 81
    .line 82
    move v15, v0

    .line 83
    goto :goto_1

    .line 84
    :cond_0
    move/from16 v15, v24

    .line 85
    .line 86
    :goto_1
    if-eqz v2, :cond_1

    .line 87
    .line 88
    sget-object v0, La/njq;->c:La/kjq;

    .line 89
    .line 90
    invoke-virtual {v0, v15}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    new-instance v0, La/b660;

    .line 101
    .line 102
    iget-object v3, v8, La/g45;->a:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v3, La/f6i;

    .line 105
    .line 106
    iget-object v3, v3, La/f6i;->e:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v3, La/eu00;

    .line 109
    .line 110
    move-object v4, v0

    .line 111
    new-instance v0, La/wq30;

    .line 112
    .line 113
    const/4 v7, 0x0

    .line 114
    move-object v13, v3

    .line 115
    move v5, v14

    .line 116
    const/16 p1, 0x0

    .line 117
    .line 118
    move-object/from16 v3, p2

    .line 119
    .line 120
    move-object v14, v4

    .line 121
    move/from16 v4, p3

    .line 122
    .line 123
    invoke-direct/range {v0 .. v7}, La/wq30;-><init>(La/xq30;La/v0;La/z3;IILa/i4d0;B)V

    .line 124
    .line 125
    .line 126
    invoke-direct {v14, v13, v0}, La/b660;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 127
    .line 128
    .line 129
    move-object v0, v14

    .line 130
    goto :goto_2

    .line 131
    :cond_1
    move v5, v14

    .line 132
    const/16 p1, 0x0

    .line 133
    .line 134
    sget-object v0, La/ujn;->c:La/f93;

    .line 135
    .line 136
    :goto_2
    iget-object v1, v8, La/g45;->b:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v1, La/h950;

    .line 139
    .line 140
    iget v3, v6, La/i4d0;->e:I

    .line 141
    .line 142
    invoke-static {v1, v3}, La/ydx;->L(La/h950;I)La/g950;

    .line 143
    .line 144
    .line 145
    move-result-object v16

    .line 146
    invoke-static {v6, v9}, La/m8x;->z0(La/i4d0;La/roi0;)La/a4d0;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v10, v1}, La/qgd;->d0(La/a4d0;)La/wsy;

    .line 151
    .line 152
    .line 153
    move-result-object v17

    .line 154
    sget-object v1, La/njq;->M:La/kjq;

    .line 155
    .line 156
    invoke-virtual {v1, v15}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 161
    .line 162
    .line 163
    move-result v18

    .line 164
    sget-object v1, La/njq;->N:La/kjq;

    .line 165
    .line 166
    invoke-virtual {v1, v15}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 171
    .line 172
    .line 173
    move-result v19

    .line 174
    sget-object v1, La/njq;->O:La/kjq;

    .line 175
    .line 176
    invoke-virtual {v1, v15}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 181
    .line 182
    .line 183
    move-result v20

    .line 184
    iget v1, v6, La/i4d0;->c:I

    .line 185
    .line 186
    and-int/lit8 v3, v1, 0x10

    .line 187
    .line 188
    const/16 v4, 0x10

    .line 189
    .line 190
    if-ne v3, v4, :cond_2

    .line 191
    .line 192
    iget-object v1, v6, La/i4d0;->h:La/a4d0;

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_2
    and-int/lit8 v1, v1, 0x20

    .line 196
    .line 197
    const/16 v3, 0x20

    .line 198
    .line 199
    if-ne v1, v3, :cond_3

    .line 200
    .line 201
    iget v1, v6, La/i4d0;->i:I

    .line 202
    .line 203
    invoke-virtual {v9, v1}, La/roi0;->c(I)La/a4d0;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    goto :goto_3

    .line 208
    :cond_3
    move-object/from16 v1, p1

    .line 209
    .line 210
    :goto_3
    if-eqz v1, :cond_4

    .line 211
    .line 212
    invoke-virtual {v10, v1}, La/qgd;->d0(La/a4d0;)La/wsy;

    .line 213
    .line 214
    .line 215
    move-result-object v13

    .line 216
    move-object/from16 v21, v13

    .line 217
    .line 218
    :goto_4
    move-object v1, v11

    .line 219
    goto :goto_5

    .line 220
    :cond_4
    move-object/from16 v21, p1

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :goto_5
    new-instance v11, La/k3u0;

    .line 224
    .line 225
    const/4 v13, 0x0

    .line 226
    sget-object v22, La/gmk0;->x0:La/gne0;

    .line 227
    .line 228
    move-object v15, v0

    .line 229
    move v14, v5

    .line 230
    invoke-direct/range {v11 .. v22}, La/k3u0;-><init>(La/kp9;La/k3u0;ILa/g93;La/g950;La/wsy;ZZZLa/wsy;La/gmk0;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-object v11, v1

    .line 237
    move/from16 v14, v25

    .line 238
    .line 239
    move-object/from16 v1, p0

    .line 240
    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :cond_5
    const/16 p1, 0x0

    .line 244
    .line 245
    invoke-static {}, La/q3d;->p()V

    .line 246
    .line 247
    .line 248
    throw p1

    .line 249
    :cond_6
    move-object v1, v11

    .line 250
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    return-object v0
.end method
