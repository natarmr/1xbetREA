.class public final La/lbh0;
.super La/hel;
.source "SourceFile"

# interfaces
.implements La/lky;
.implements La/qai0;


# instance fields
.field public final k1:La/yj50;

.field public l1:La/iob0;

.field public m1:La/a5;

.field public n1:Z

.field public o1:Z

.field public p1:La/iu40;

.field public q1:La/pds0;

.field public final r1:La/iuj;

.field public final s1:La/sch0;

.field public final t1:La/hbh0;

.field public final u1:La/nqq;

.field public final v1:La/nee;


# direct methods
.method public constructor <init>(La/j39;La/qkq;La/gy40;La/ma80;La/vf80;La/bch0;ZZ)V
    .locals 10

    .line 1
    move/from16 v9, p7

    .line 2
    .line 3
    sget-object v0, La/dwi0;->a:La/b5;

    .line 4
    .line 5
    invoke-direct {p0, v0, v9, p3, p4}, La/hel;-><init>(Lkotlin/jvm/functions/Function1;ZLa/gy40;La/ma80;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, La/yj50;

    .line 9
    .line 10
    invoke-direct {v0}, La/yj50;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, La/lbh0;->k1:La/yj50;

    .line 14
    .line 15
    new-instance v0, La/iuj;

    .line 16
    .line 17
    sget-object v1, La/fbh0;->c:La/yk80;

    .line 18
    .line 19
    new-instance v3, La/epi0;

    .line 20
    .line 21
    invoke-direct {v3, v1}, La/epi0;-><init>(La/w6k;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, La/sjj;

    .line 25
    .line 26
    invoke-direct {v1, v3}, La/sjj;-><init>(La/glq;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, La/iuj;-><init>(La/sjj;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, La/lbh0;->r1:La/iuj;

    .line 33
    .line 34
    if-nez p2, :cond_0

    .line 35
    .line 36
    move-object v3, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v3, p2

    .line 39
    :goto_0
    iget-object v6, p0, La/lbh0;->k1:La/yj50;

    .line 40
    .line 41
    new-instance v0, La/sch0;

    .line 42
    .line 43
    new-instance v8, La/ibh0;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-direct {v8, p0, v1}, La/ibh0;-><init>(La/lbh0;B)V

    .line 47
    .line 48
    .line 49
    move-object v7, p0

    .line 50
    move-object v4, p4

    .line 51
    move-object v2, p5

    .line 52
    move-object/from16 v1, p6

    .line 53
    .line 54
    move/from16 v5, p8

    .line 55
    .line 56
    invoke-direct/range {v0 .. v8}, La/sch0;-><init>(La/bch0;La/vf80;La/qkq;La/ma80;ZLa/yj50;La/lbh0;La/ibh0;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, La/lbh0;->s1:La/sch0;

    .line 60
    .line 61
    new-instance v8, La/hbh0;

    .line 62
    .line 63
    invoke-direct {v8, v0, v9}, La/hbh0;-><init>(La/sch0;Z)V

    .line 64
    .line 65
    .line 66
    iput-object v8, p0, La/lbh0;->t1:La/hbh0;

    .line 67
    .line 68
    new-instance v1, La/nqq;

    .line 69
    .line 70
    const/16 v2, 0xa

    .line 71
    .line 72
    const/4 v3, 0x2

    .line 73
    const/4 v4, 0x0

    .line 74
    invoke-direct {v1, v3, v4, v2}, La/nqq;-><init>(ILkotlin/jvm/functions/Function2;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v1}, La/f3k;->Z0(La/yzj;)La/yzj;

    .line 78
    .line 79
    .line 80
    iput-object v1, p0, La/lbh0;->u1:La/nqq;

    .line 81
    .line 82
    new-instance v1, La/nee;

    .line 83
    .line 84
    new-instance v6, La/ibh0;

    .line 85
    .line 86
    const/4 v2, 0x1

    .line 87
    invoke-direct {v6, p0, v2}, La/ibh0;-><init>(La/lbh0;B)V

    .line 88
    .line 89
    .line 90
    move-object v5, p1

    .line 91
    move-object v2, p4

    .line 92
    move/from16 v4, p8

    .line 93
    .line 94
    move-object v3, v0

    .line 95
    invoke-direct/range {v1 .. v6}, La/nee;-><init>(La/ma80;La/sch0;ZLa/j39;La/ibh0;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v1}, La/f3k;->Z0(La/yzj;)La/yzj;

    .line 99
    .line 100
    .line 101
    iput-object v1, p0, La/lbh0;->v1:La/nee;

    .line 102
    .line 103
    iget-object v0, p0, La/lbh0;->k1:La/yj50;

    .line 104
    .line 105
    new-instance v2, La/ek50;

    .line 106
    .line 107
    invoke-direct {v2, v8, v0}, La/ek50;-><init>(La/vj50;La/yj50;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v2}, La/f3k;->Z0(La/yzj;)La/yzj;

    .line 111
    .line 112
    .line 113
    new-instance v0, La/g39;

    .line 114
    .line 115
    invoke-direct {v0}, La/lm40;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object v1, v0, La/g39;->o:La/nee;

    .line 119
    .line 120
    invoke-virtual {p0, v0}, La/f3k;->Z0(La/yzj;)La/yzj;

    .line 121
    .line 122
    .line 123
    return-void
.end method


# virtual methods
.method public final O0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final R0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/lbh0;->p1:La/iu40;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, La/e7z;->z:La/w6k;

    .line 10
    .line 11
    iput-object v1, v0, La/d660;->c:La/w6k;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, La/lbh0;->q1:La/pds0;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v1, v1, La/e7z;->z:La/w6k;

    .line 22
    .line 23
    iput-object v1, v0, La/d660;->c:La/w6k;

    .line 24
    .line 25
    :cond_1
    iget-boolean v0, p0, La/lm40;->n:Z

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v0, v0, La/e7z;->z:La/w6k;

    .line 35
    .line 36
    iget-object p0, p0, La/lbh0;->r1:La/iuj;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v1, La/epi0;

    .line 42
    .line 43
    invoke-direct {v1, v0}, La/epi0;-><init>(La/w6k;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, La/sjj;

    .line 47
    .line 48
    invoke-direct {v0, v1}, La/sjj;-><init>(La/glq;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, La/iuj;->a:La/sjj;

    .line 52
    .line 53
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/hel;->n0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/lbh0;->p1:La/iu40;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v1, v1, La/e7z;->z:La/w6k;

    .line 13
    .line 14
    iput-object v1, v0, La/d660;->c:La/w6k;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, La/lbh0;->q1:La/pds0;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v1, v1, La/e7z;->z:La/w6k;

    .line 25
    .line 26
    iput-object v1, v0, La/d660;->c:La/w6k;

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0}, La/hel;->n0()V

    .line 29
    .line 30
    .line 31
    iget-boolean v0, p0, La/lm40;->n:Z

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v0, v0, La/e7z;->z:La/w6k;

    .line 41
    .line 42
    iget-object p0, p0, La/lbh0;->r1:La/iuj;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance v1, La/epi0;

    .line 48
    .line 49
    invoke-direct {v1, v0}, La/epi0;-><init>(La/w6k;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, La/sjj;

    .line 53
    .line 54
    invoke-direct {v0, v1}, La/sjj;-><init>(La/glq;)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, La/iuj;->a:La/sjj;

    .line 58
    .line 59
    return-void
.end method

.method public final c0(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final d1(La/ic1;La/xb2;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, La/c050;->b:La/c050;

    .line 2
    .line 3
    new-instance v1, La/kmg0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0xd

    .line 7
    .line 8
    iget-object p0, p0, La/lbh0;->s1:La/sch0;

    .line 9
    .line 10
    invoke-direct {v1, p1, p0, v2, v3}, La/kmg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0, v1, p2}, La/sch0;->g(La/c050;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, La/wne;->a:La/wne;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0
.end method

.method public final h(La/woa0;La/xoa0;J)V
    .locals 18

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    iget-object v0, v8, La/woa0;->a:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    if-ge v3, v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, La/dpa0;

    .line 21
    .line 22
    iget-object v5, v2, La/hel;->r:Lkotlin/jvm/functions/Function1;

    .line 23
    .line 24
    iget v4, v4, La/dpa0;->i:I

    .line 25
    .line 26
    new-instance v6, La/lpa0;

    .line 27
    .line 28
    invoke-direct {v6, v4}, La/lpa0;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v5, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    invoke-super/range {p0 .. p4}, La/hel;->h(La/woa0;La/xoa0;J)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    iget-boolean v0, v2, La/hel;->s:Z

    .line 51
    .line 52
    if-eqz v0, :cond_13

    .line 53
    .line 54
    iget-object v0, v2, La/hel;->A:La/amt;

    .line 55
    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    new-instance v0, La/amt;

    .line 59
    .line 60
    invoke-direct {v0, v2}, La/amt;-><init>(La/zlt;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v0}, La/f3k;->Z0(La/yzj;)La/yzj;

    .line 64
    .line 65
    .line 66
    iput-object v0, v2, La/hel;->A:La/amt;

    .line 67
    .line 68
    :cond_2
    sget-object v11, La/xoa0;->a:La/xoa0;

    .line 69
    .line 70
    const/4 v12, 0x3

    .line 71
    const/4 v13, 0x0

    .line 72
    const/4 v14, 0x6

    .line 73
    const/4 v15, 0x1

    .line 74
    if-ne v9, v11, :cond_4

    .line 75
    .line 76
    iget v0, v8, La/woa0;->f:I

    .line 77
    .line 78
    if-ne v0, v14, :cond_4

    .line 79
    .line 80
    iget-boolean v0, v2, La/lbh0;->n1:Z

    .line 81
    .line 82
    if-nez v0, :cond_3

    .line 83
    .line 84
    new-instance v0, La/iu40;

    .line 85
    .line 86
    new-instance v1, La/do20;

    .line 87
    .line 88
    invoke-static {v2}, La/tdc;->Z(La/yzj;)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-static {v3}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-direct {v1, v3}, La/do20;-><init>(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    move-object v3, v0

    .line 104
    new-instance v0, La/jbh0;

    .line 105
    .line 106
    const/4 v6, 0x4

    .line 107
    const/4 v7, 0x0

    .line 108
    move-object v4, v1

    .line 109
    const/4 v1, 0x2

    .line 110
    move-object v5, v3

    .line 111
    const-class v3, La/lbh0;

    .line 112
    .line 113
    move-object/from16 v16, v4

    .line 114
    .line 115
    const-string v4, "onMouseWheelScrollStopped"

    .line 116
    .line 117
    move-object/from16 v17, v5

    .line 118
    .line 119
    const-string v5, "onMouseWheelScrollStopped-TH1AsA0(J)V"

    .line 120
    .line 121
    move-object/from16 v14, v16

    .line 122
    .line 123
    move-object/from16 v10, v17

    .line 124
    .line 125
    invoke-direct/range {v0 .. v7}, La/jbh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 126
    .line 127
    .line 128
    invoke-static {v2}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    iget-object v1, v1, La/e7z;->z:La/w6k;

    .line 133
    .line 134
    iget-object v3, v2, La/lbh0;->s1:La/sch0;

    .line 135
    .line 136
    invoke-direct {v10, v3, v14, v0, v1}, La/iu40;-><init>(La/sch0;La/do20;La/jbh0;La/w6k;)V

    .line 137
    .line 138
    .line 139
    iput-object v10, v2, La/lbh0;->p1:La/iu40;

    .line 140
    .line 141
    iput-boolean v15, v2, La/lbh0;->n1:Z

    .line 142
    .line 143
    :cond_3
    iget-object v0, v2, La/lbh0;->p1:La/iu40;

    .line 144
    .line 145
    if-eqz v0, :cond_4

    .line 146
    .line 147
    invoke-virtual {v2}, La/lm40;->N0()La/vne;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    iget-object v3, v0, La/iu40;->h:La/c4m0;

    .line 152
    .line 153
    if-nez v3, :cond_4

    .line 154
    .line 155
    new-instance v3, La/fhq;

    .line 156
    .line 157
    const/16 v4, 0x1b

    .line 158
    .line 159
    invoke-direct {v3, v0, v13, v4}, La/fhq;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 160
    .line 161
    .line 162
    invoke-static {v1, v13, v13, v3, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    iput-object v1, v0, La/iu40;->h:La/c4m0;

    .line 167
    .line 168
    :cond_4
    iget-object v0, v2, La/lbh0;->p1:La/iu40;

    .line 169
    .line 170
    if-eqz v0, :cond_8

    .line 171
    .line 172
    iget v1, v8, La/woa0;->f:I

    .line 173
    .line 174
    const/4 v3, 0x6

    .line 175
    if-ne v1, v3, :cond_8

    .line 176
    .line 177
    iget-object v1, v8, La/woa0;->a:Ljava/util/List;

    .line 178
    .line 179
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    const/4 v4, 0x0

    .line 184
    :goto_2
    if-ge v4, v3, :cond_6

    .line 185
    .line 186
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    check-cast v5, La/dpa0;

    .line 191
    .line 192
    invoke-virtual {v5}, La/dpa0;->c()Z

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    if-eqz v5, :cond_5

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_6
    sget-object v1, La/xoa0;->a:La/xoa0;

    .line 203
    .line 204
    if-ne v9, v1, :cond_7

    .line 205
    .line 206
    iget-boolean v1, v0, La/d660;->d:Z

    .line 207
    .line 208
    if-eqz v1, :cond_7

    .line 209
    .line 210
    invoke-virtual {v0, v8}, La/iu40;->f(La/woa0;)Z

    .line 211
    .line 212
    .line 213
    invoke-static {v8}, La/d660;->a(La/woa0;)V

    .line 214
    .line 215
    .line 216
    :cond_7
    sget-object v1, La/xoa0;->b:La/xoa0;

    .line 217
    .line 218
    if-ne v9, v1, :cond_8

    .line 219
    .line 220
    iget-boolean v1, v0, La/d660;->d:Z

    .line 221
    .line 222
    if-nez v1, :cond_8

    .line 223
    .line 224
    invoke-virtual {v0, v8}, La/iu40;->f(La/woa0;)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_8

    .line 229
    .line 230
    invoke-static {v8}, La/d660;->a(La/woa0;)V

    .line 231
    .line 232
    .line 233
    :cond_8
    :goto_3
    const/16 v10, 0xc

    .line 234
    .line 235
    const/16 v14, 0xb

    .line 236
    .line 237
    const/16 v0, 0xa

    .line 238
    .line 239
    if-ne v9, v11, :cond_c

    .line 240
    .line 241
    iget v1, v8, La/woa0;->f:I

    .line 242
    .line 243
    if-ne v1, v0, :cond_9

    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_9
    if-ne v1, v14, :cond_a

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_a
    if-ne v1, v10, :cond_c

    .line 250
    .line 251
    :goto_4
    iget-boolean v1, v2, La/lbh0;->o1:Z

    .line 252
    .line 253
    if-nez v1, :cond_b

    .line 254
    .line 255
    new-instance v11, La/pds0;

    .line 256
    .line 257
    move v1, v0

    .line 258
    new-instance v0, La/jbh0;

    .line 259
    .line 260
    const/4 v6, 0x4

    .line 261
    const/4 v7, 0x1

    .line 262
    move v3, v1

    .line 263
    const/4 v1, 0x2

    .line 264
    move v4, v3

    .line 265
    const-class v3, La/lbh0;

    .line 266
    .line 267
    move v5, v4

    .line 268
    const-string v4, "onTrackpadScrollStopped"

    .line 269
    .line 270
    move/from16 v16, v5

    .line 271
    .line 272
    const-string v5, "onTrackpadScrollStopped-TH1AsA0(J)V"

    .line 273
    .line 274
    move/from16 v10, v16

    .line 275
    .line 276
    invoke-direct/range {v0 .. v7}, La/jbh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 277
    .line 278
    .line 279
    invoke-static {v2}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    iget-object v1, v1, La/e7z;->z:La/w6k;

    .line 284
    .line 285
    iget-object v3, v2, La/lbh0;->s1:La/sch0;

    .line 286
    .line 287
    invoke-direct {v11, v3, v0, v1}, La/pds0;-><init>(La/sch0;La/jbh0;La/w6k;)V

    .line 288
    .line 289
    .line 290
    iput-object v11, v2, La/lbh0;->q1:La/pds0;

    .line 291
    .line 292
    iput-boolean v15, v2, La/lbh0;->o1:Z

    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_b
    move v10, v0

    .line 296
    :goto_5
    iget-object v0, v2, La/lbh0;->q1:La/pds0;

    .line 297
    .line 298
    if-eqz v0, :cond_d

    .line 299
    .line 300
    invoke-virtual {v2}, La/lm40;->N0()La/vne;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    iget-object v3, v0, La/pds0;->g:La/c4m0;

    .line 305
    .line 306
    if-nez v3, :cond_d

    .line 307
    .line 308
    new-instance v3, La/pnd0;

    .line 309
    .line 310
    const/16 v4, 0x10

    .line 311
    .line 312
    invoke-direct {v3, v0, v13, v4}, La/pnd0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 313
    .line 314
    .line 315
    invoke-static {v1, v13, v13, v3, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    iput-object v1, v0, La/pds0;->g:La/c4m0;

    .line 320
    .line 321
    goto :goto_6

    .line 322
    :cond_c
    move v10, v0

    .line 323
    :cond_d
    :goto_6
    iget-object v0, v2, La/lbh0;->q1:La/pds0;

    .line 324
    .line 325
    if-eqz v0, :cond_13

    .line 326
    .line 327
    iget v1, v8, La/woa0;->f:I

    .line 328
    .line 329
    if-ne v1, v10, :cond_e

    .line 330
    .line 331
    goto :goto_7

    .line 332
    :cond_e
    if-ne v1, v14, :cond_f

    .line 333
    .line 334
    goto :goto_7

    .line 335
    :cond_f
    const/16 v2, 0xc

    .line 336
    .line 337
    if-ne v1, v2, :cond_13

    .line 338
    .line 339
    :goto_7
    iget-object v1, v8, La/woa0;->a:Ljava/util/List;

    .line 340
    .line 341
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    const/4 v10, 0x0

    .line 346
    :goto_8
    if-ge v10, v2, :cond_11

    .line 347
    .line 348
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    check-cast v3, La/dpa0;

    .line 353
    .line 354
    invoke-virtual {v3}, La/dpa0;->c()Z

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    if-eqz v3, :cond_10

    .line 359
    .line 360
    goto :goto_9

    .line 361
    :cond_10
    add-int/lit8 v10, v10, 0x1

    .line 362
    .line 363
    goto :goto_8

    .line 364
    :cond_11
    sget-object v1, La/xoa0;->a:La/xoa0;

    .line 365
    .line 366
    if-ne v9, v1, :cond_12

    .line 367
    .line 368
    iget-boolean v1, v0, La/d660;->d:Z

    .line 369
    .line 370
    if-eqz v1, :cond_12

    .line 371
    .line 372
    invoke-virtual {v0, v8}, La/pds0;->d(La/woa0;)Z

    .line 373
    .line 374
    .line 375
    invoke-static {v8}, La/d660;->a(La/woa0;)V

    .line 376
    .line 377
    .line 378
    :cond_12
    sget-object v1, La/xoa0;->b:La/xoa0;

    .line 379
    .line 380
    if-ne v9, v1, :cond_13

    .line 381
    .line 382
    iget-boolean v1, v0, La/d660;->d:Z

    .line 383
    .line 384
    if-nez v1, :cond_13

    .line 385
    .line 386
    invoke-virtual {v0, v8}, La/pds0;->d(La/woa0;)Z

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    if-eqz v0, :cond_13

    .line 391
    .line 392
    invoke-static {v8}, La/d660;->a(La/woa0;)V

    .line 393
    .line 394
    .line 395
    :cond_13
    :goto_9
    return-void
.end method

.method public final i1(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final j1(La/qdl;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, La/lm40;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, La/lbh0;->k1:La/yj50;

    .line 7
    .line 8
    invoke-virtual {v0}, La/yj50;->c()La/vne;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/kbh0;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, p1, p0, v3, v2}, La/kbh0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x3

    .line 20
    invoke-static {v0, v3, v3, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final l0(Landroid/view/KeyEvent;)Z
    .locals 10

    .line 1
    iget-boolean v0, p0, La/hel;->s:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    invoke-static {p1}, La/n7x;->C(Landroid/view/KeyEvent;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    sget-wide v4, La/qjy;->D:J

    .line 11
    .line 12
    invoke-static {v2, v3, v4, v5}, La/qjy;->a(JJ)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v0}, La/u7x;->c(I)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    sget-wide v4, La/qjy;->C:J

    .line 27
    .line 28
    invoke-static {v2, v3, v4, v5}, La/qjy;->a(JJ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_5

    .line 33
    .line 34
    :cond_0
    invoke-static {p1}, La/n7x;->H(Landroid/view/KeyEvent;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v2, 0x2

    .line 39
    if-ne v0, v2, :cond_5

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_5

    .line 46
    .line 47
    iget-object v0, p0, La/lbh0;->s1:La/sch0;

    .line 48
    .line 49
    iget-object v0, v0, La/sch0;->d:La/ma80;

    .line 50
    .line 51
    sget-object v2, La/ma80;->a:La/ma80;

    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    if-ne v0, v2, :cond_1

    .line 55
    .line 56
    move v1, v3

    .line 57
    :cond_1
    const/4 v0, 0x0

    .line 58
    const/16 v2, 0x20

    .line 59
    .line 60
    const-wide v4, 0xffffffffL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    iget-object v6, p0, La/lbh0;->v1:La/nee;

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    invoke-virtual {v6}, La/nee;->a1()J

    .line 70
    .line 71
    .line 72
    move-result-wide v6

    .line 73
    and-long/2addr v6, v4

    .line 74
    long-to-int v1, v6

    .line 75
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    invoke-static {p1}, La/u7x;->c(I)J

    .line 80
    .line 81
    .line 82
    move-result-wide v6

    .line 83
    sget-wide v8, La/qjy;->C:J

    .line 84
    .line 85
    invoke-static {v6, v7, v8, v9}, La/qjy;->a(JJ)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    int-to-float p1, v1

    .line 92
    goto :goto_0

    .line 93
    :cond_2
    int-to-float p1, v1

    .line 94
    neg-float p1, p1

    .line 95
    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    int-to-long v0, v0

    .line 100
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    int-to-long v6, p1

    .line 105
    shl-long/2addr v0, v2

    .line 106
    and-long/2addr v4, v6

    .line 107
    or-long/2addr v0, v4

    .line 108
    :goto_1
    move-wide v6, v0

    .line 109
    goto :goto_3

    .line 110
    :cond_3
    invoke-virtual {v6}, La/nee;->a1()J

    .line 111
    .line 112
    .line 113
    move-result-wide v6

    .line 114
    shr-long/2addr v6, v2

    .line 115
    long-to-int v1, v6

    .line 116
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    invoke-static {p1}, La/u7x;->c(I)J

    .line 121
    .line 122
    .line 123
    move-result-wide v6

    .line 124
    sget-wide v8, La/qjy;->C:J

    .line 125
    .line 126
    invoke-static {v6, v7, v8, v9}, La/qjy;->a(JJ)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_4

    .line 131
    .line 132
    int-to-float p1, v1

    .line 133
    goto :goto_2

    .line 134
    :cond_4
    int-to-float p1, v1

    .line 135
    neg-float p1, p1

    .line 136
    :goto_2
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    int-to-long v6, p1

    .line 141
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    int-to-long v0, p1

    .line 146
    shl-long/2addr v6, v2

    .line 147
    and-long/2addr v0, v4

    .line 148
    or-long/2addr v0, v6

    .line 149
    goto :goto_1

    .line 150
    :goto_3
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    new-instance v4, La/a5;

    .line 155
    .line 156
    const/4 v9, 0x1

    .line 157
    const/4 v8, 0x0

    .line 158
    move-object v5, p0

    .line 159
    invoke-direct/range {v4 .. v9}, La/a5;-><init>(La/lbh0;JLa/yje;B)V

    .line 160
    .line 161
    .line 162
    const/4 p0, 0x3

    .line 163
    invoke-static {p1, v8, v8, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 164
    .line 165
    .line 166
    return v3

    .line 167
    :cond_5
    return v1
.end method

.method public final u1(La/j39;La/qkq;La/gy40;La/ma80;La/vf80;La/bch0;ZZ)V
    .locals 6

    .line 1
    iget-boolean v3, p0, La/hel;->s:Z

    .line 2
    .line 3
    if-eq v3, p7, :cond_0

    .line 4
    .line 5
    iget-object v3, p0, La/lbh0;->t1:La/hbh0;

    .line 6
    .line 7
    iput-boolean p7, v3, La/hbh0;->b:Z

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    iput-object v3, p0, La/lbh0;->l1:La/iob0;

    .line 11
    .line 12
    iput-object v3, p0, La/lbh0;->m1:La/a5;

    .line 13
    .line 14
    invoke-static {p0}, La/s0x;->S(La/qai0;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    if-nez p2, :cond_1

    .line 18
    .line 19
    iget-object p2, p0, La/lbh0;->r1:La/iuj;

    .line 20
    .line 21
    :cond_1
    iget-object v3, p0, La/lbh0;->s1:La/sch0;

    .line 22
    .line 23
    iget-object v4, v3, La/sch0;->a:La/bch0;

    .line 24
    .line 25
    invoke-static {v4, p6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/4 v5, 0x1

    .line 30
    if-nez v4, :cond_2

    .line 31
    .line 32
    iput-object p6, v3, La/sch0;->a:La/bch0;

    .line 33
    .line 34
    move v0, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const/4 v0, 0x0

    .line 37
    :goto_0
    iput-object p5, v3, La/sch0;->b:La/vf80;

    .line 38
    .line 39
    iget-object p5, v3, La/sch0;->d:La/ma80;

    .line 40
    .line 41
    if-eq p5, p4, :cond_3

    .line 42
    .line 43
    iput-object p4, v3, La/sch0;->d:La/ma80;

    .line 44
    .line 45
    move-object p5, p4

    .line 46
    move v0, v5

    .line 47
    :cond_3
    iget-boolean v4, v3, La/sch0;->e:Z

    .line 48
    .line 49
    if-eq v4, p8, :cond_4

    .line 50
    .line 51
    iput-boolean p8, v3, La/sch0;->e:Z

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_4
    move v5, v0

    .line 55
    :goto_1
    iput-object p2, v3, La/sch0;->c:La/qkq;

    .line 56
    .line 57
    iget-object p2, p0, La/lbh0;->k1:La/yj50;

    .line 58
    .line 59
    iput-object p2, v3, La/sch0;->f:La/yj50;

    .line 60
    .line 61
    iget-object p2, p0, La/lbh0;->v1:La/nee;

    .line 62
    .line 63
    iput-object p4, p2, La/nee;->o:La/ma80;

    .line 64
    .line 65
    iput-boolean p8, p2, La/nee;->q:Z

    .line 66
    .line 67
    iput-object p1, p2, La/nee;->r:La/j39;

    .line 68
    .line 69
    sget-object v1, La/dwi0;->a:La/b5;

    .line 70
    .line 71
    sget-object p1, La/ma80;->a:La/ma80;

    .line 72
    .line 73
    if-ne p5, p1, :cond_5

    .line 74
    .line 75
    :goto_2
    move-object v0, p0

    .line 76
    move-object v4, p1

    .line 77
    move-object v3, p3

    .line 78
    move v2, p7

    .line 79
    goto :goto_3

    .line 80
    :cond_5
    sget-object p1, La/ma80;->b:La/ma80;

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :goto_3
    invoke-virtual/range {v0 .. v5}, La/hel;->t1(Lkotlin/jvm/functions/Function1;ZLa/gy40;La/ma80;Z)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final x0(La/abi0;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, La/hel;->s:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, La/lbh0;->l1:La/iob0;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, La/lbh0;->m1:La/a5;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :cond_0
    new-instance v0, La/iob0;

    .line 15
    .line 16
    const/16 v2, 0x15

    .line 17
    .line 18
    invoke-direct {v0, p0, v2}, La/iob0;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/lbh0;->l1:La/iob0;

    .line 22
    .line 23
    new-instance v0, La/a5;

    .line 24
    .line 25
    invoke-direct {v0, p0, v1}, La/a5;-><init>(La/lbh0;La/yje;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/lbh0;->m1:La/a5;

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, La/lbh0;->l1:La/iob0;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    sget-object v2, La/yai0;->a:[La/iiy;

    .line 35
    .line 36
    sget-object v2, La/mai0;->d:La/zai0;

    .line 37
    .line 38
    new-instance v3, La/m6;

    .line 39
    .line 40
    invoke-direct {v3, v1, v0}, La/m6;-><init>(Ljava/lang/String;La/wdr;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v2, v3}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object p0, p0, La/lbh0;->m1:La/a5;

    .line 47
    .line 48
    if-eqz p0, :cond_3

    .line 49
    .line 50
    sget-object v0, La/yai0;->a:[La/iiy;

    .line 51
    .line 52
    sget-object v0, La/mai0;->e:La/zai0;

    .line 53
    .line 54
    invoke-interface {p1, v0, p0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    return-void
.end method
