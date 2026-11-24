.class public final La/qrm0;
.super La/fot0;
.source "SourceFile"


# instance fields
.field public A:La/cmn0;

.field public B:La/tii0;

.field public C:La/tii0;

.field public D:La/uii0;

.field public final r:La/rrm0;

.field public final s:La/fnu0;

.field public final t:La/c5k;

.field public final u:La/c5k;

.field public v:La/cyu;

.field public w:La/kki;

.field public x:La/cmn0;

.field public y:La/cmn0;

.field public z:La/cmn0;


# direct methods
.method public constructor <init>(La/s0a;La/s0a;La/c5k;La/c5k;Ljava/util/HashSet;La/ipt0;)V
    .locals 1

    .line 1
    invoke-static {p5}, La/qrm0;->K(Ljava/util/HashSet;)La/rrm0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, La/fot0;-><init>(La/fpt0;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p5}, La/qrm0;->K(Ljava/util/HashSet;)La/rrm0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, La/qrm0;->r:La/rrm0;

    .line 13
    .line 14
    iput-object p3, p0, La/qrm0;->t:La/c5k;

    .line 15
    .line 16
    iput-object p4, p0, La/qrm0;->u:La/c5k;

    .line 17
    .line 18
    move-object p3, p2

    .line 19
    move-object p2, p1

    .line 20
    new-instance p1, La/fnu0;

    .line 21
    .line 22
    move-object p4, p5

    .line 23
    move-object p5, p6

    .line 24
    new-instance p6, La/b0l0;

    .line 25
    .line 26
    const/4 v0, 0x6

    .line 27
    invoke-direct {p6, p0, v0}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    invoke-direct/range {p1 .. p6}, La/fnu0;-><init>(La/s0a;La/s0a;Ljava/util/HashSet;La/ipt0;La/b0l0;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, La/qrm0;->s:La/fnu0;

    .line 34
    .line 35
    invoke-virtual {p4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, La/fot0;

    .line 44
    .line 45
    iget-object p1, p1, La/fot0;->h:Ljava/util/HashSet;

    .line 46
    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    new-instance p2, Ljava/util/HashSet;

    .line 50
    .line 51
    invoke-direct {p2, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 p2, 0x0

    .line 56
    :goto_0
    iput-object p2, p0, La/fot0;->h:Ljava/util/HashSet;

    .line 57
    .line 58
    return-void
.end method

.method public static K(Ljava/util/HashSet;)La/rrm0;
    .locals 5

    .line 1
    new-instance v0, La/eyg0;

    .line 2
    .line 3
    invoke-static {}, La/wy40;->l()La/wy40;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, La/eyg0;-><init>(La/wy40;)V

    .line 8
    .line 9
    .line 10
    sget-object v0, La/h0x;->h0:La/u15;

    .line 11
    .line 12
    const/16 v2, 0x22

    .line 13
    .line 14
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v0, v2}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, La/fot0;

    .line 41
    .line 42
    iget-object v3, v2, La/fot0;->i:La/fpt0;

    .line 43
    .line 44
    sget-object v4, La/fpt0;->N0:La/u15;

    .line 45
    .line 46
    invoke-interface {v3, v4}, La/qae0;->f(La/u15;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    iget-object v2, v2, La/fot0;->i:La/fpt0;

    .line 53
    .line 54
    invoke-interface {v2}, La/fpt0;->v()La/hpt0;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const-string v2, "StreamSharing"

    .line 63
    .line 64
    const-string v3, "A child does not have capture type."

    .line 65
    .line 66
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    sget-object p0, La/rrm0;->b:La/u15;

    .line 71
    .line 72
    invoke-virtual {v1, p0, v0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object p0, La/w0x;->n0:La/u15;

    .line 76
    .line 77
    const/4 v0, 0x2

    .line 78
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v1, p0, v0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    sget-object p0, La/fpt0;->S0:La/u15;

    .line 86
    .line 87
    sget-object v0, La/urm0;->f:La/urm0;

    .line 88
    .line 89
    invoke-virtual {v1, p0, v0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    new-instance p0, La/rrm0;

    .line 93
    .line 94
    invoke-static {v1}, La/b780;->j(La/drd;)La/b780;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-direct {p0, v0}, La/rrm0;-><init>(La/b780;)V

    .line 99
    .line 100
    .line 101
    return-object p0
.end method


# virtual methods
.method public final A()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/qrm0;->G()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/qrm0;->s:La/fnu0;

    .line 5
    .line 6
    iget-object v0, p0, La/fnu0;->a:Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, La/fot0;

    .line 23
    .line 24
    iget-object v2, p0, La/fnu0;->c:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, La/enu0;

    .line 31
    .line 32
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, La/fot0;->D(La/s0a;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
.end method

.method public final G()V
    .locals 4

    .line 1
    iget-object v0, p0, La/qrm0;->D:La/uii0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, La/uii0;->b()V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, La/qrm0;->D:La/uii0;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, La/qrm0;->x:La/cmn0;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, La/cmn0;->b()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, La/qrm0;->x:La/cmn0;

    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, La/qrm0;->y:La/cmn0;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, La/cmn0;->b()V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, La/qrm0;->y:La/cmn0;

    .line 28
    .line 29
    :cond_2
    iget-object v0, p0, La/qrm0;->z:La/cmn0;

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-virtual {v0}, La/cmn0;->b()V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, La/qrm0;->z:La/cmn0;

    .line 37
    .line 38
    :cond_3
    iget-object v0, p0, La/qrm0;->A:La/cmn0;

    .line 39
    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    invoke-virtual {v0}, La/cmn0;->b()V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, La/qrm0;->A:La/cmn0;

    .line 46
    .line 47
    :cond_4
    iget-object v0, p0, La/qrm0;->v:La/cyu;

    .line 48
    .line 49
    if-eqz v0, :cond_5

    .line 50
    .line 51
    iget-object v2, v0, La/cyu;->a:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, La/txj;

    .line 54
    .line 55
    invoke-virtual {v2}, La/txj;->release()V

    .line 56
    .line 57
    .line 58
    new-instance v2, La/apj0;

    .line 59
    .line 60
    const/4 v3, 0x6

    .line 61
    invoke-direct {v2, v0, v3}, La/apj0;-><init>(Ljava/lang/Object;B)V

    .line 62
    .line 63
    .line 64
    invoke-static {v2}, La/ofm0;->w(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    iput-object v1, p0, La/qrm0;->v:La/cyu;

    .line 68
    .line 69
    :cond_5
    iget-object v0, p0, La/qrm0;->w:La/kki;

    .line 70
    .line 71
    if-eqz v0, :cond_6

    .line 72
    .line 73
    iget-object v2, v0, La/kki;->e:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, La/jmn0;

    .line 76
    .line 77
    invoke-interface {v2}, La/jmn0;->release()V

    .line 78
    .line 79
    .line 80
    new-instance v2, La/ccf;

    .line 81
    .line 82
    const/16 v3, 0x12

    .line 83
    .line 84
    invoke-direct {v2, v0, v3}, La/ccf;-><init>(Ljava/lang/Object;B)V

    .line 85
    .line 86
    .line 87
    invoke-static {v2}, La/ofm0;->w(Ljava/lang/Runnable;)V

    .line 88
    .line 89
    .line 90
    iput-object v1, p0, La/qrm0;->w:La/kki;

    .line 91
    .line 92
    :cond_6
    return-void
.end method

.method public final H(Ljava/lang/String;Ljava/lang/String;La/fpt0;La/h55;La/h55;)Ljava/util/List;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p4

    .line 4
    .line 5
    move-object/from16 v3, p5

    .line 6
    .line 7
    iget-object v10, v4, La/h55;->c:La/agn;

    .line 8
    .line 9
    invoke-static {}, La/ofm0;->m()V

    .line 10
    .line 11
    .line 12
    const-string v11, "   outputConfig = "

    .line 13
    .line 14
    const-string v12, "SurfaceProcessorNode"

    .line 15
    .line 16
    iget-object v6, v0, La/qrm0;->s:La/fnu0;

    .line 17
    .line 18
    const/4 v14, 0x0

    .line 19
    if-nez v3, :cond_8

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    move-object/from16 v2, p2

    .line 25
    .line 26
    move-object/from16 v3, p3

    .line 27
    .line 28
    invoke-virtual/range {v0 .. v5}, La/qrm0;->I(Ljava/lang/String;Ljava/lang/String;La/fpt0;La/h55;La/h55;)La/cmn0;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    move-object v15, v0

    .line 33
    invoke-virtual {v15}, La/fot0;->d()La/s0a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    new-instance v7, La/cyu;

    .line 41
    .line 42
    new-instance v1, La/txj;

    .line 43
    .line 44
    invoke-direct {v1, v10}, La/txj;-><init>(La/agn;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v0, v7, La/cyu;->b:Ljava/lang/Object;

    .line 51
    .line 52
    iput-object v1, v7, La/cyu;->a:Ljava/lang/Object;

    .line 53
    .line 54
    iput-object v7, v15, La/qrm0;->v:La/cyu;

    .line 55
    .line 56
    iget-object v0, v15, La/fot0;->l:Landroid/graphics/Rect;

    .line 57
    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    move v0, v14

    .line 63
    :goto_0
    invoke-virtual {v15}, La/fot0;->m()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    new-instance v8, Ljava/util/HashMap;

    .line 71
    .line 72
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 73
    .line 74
    .line 75
    iget-object v1, v6, La/fnu0;->a:Ljava/util/HashSet;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_1

    .line 86
    .line 87
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, La/fot0;

    .line 92
    .line 93
    iget-object v2, v6, La/fnu0;->k:La/ksf0;

    .line 94
    .line 95
    iget-object v3, v6, La/fnu0;->f:La/s0a;

    .line 96
    .line 97
    move-object/from16 v27, v6

    .line 98
    .line 99
    move v6, v0

    .line 100
    move-object/from16 v0, v27

    .line 101
    .line 102
    invoke-virtual/range {v0 .. v6}, La/fnu0;->s(La/fot0;La/ksf0;La/s0a;La/cmn0;IZ)La/l45;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    iget-object v3, v0, La/fnu0;->f:La/s0a;

    .line 107
    .line 108
    iget-object v10, v1, La/fot0;->i:La/fpt0;

    .line 109
    .line 110
    check-cast v10, La/w0x;

    .line 111
    .line 112
    invoke-interface {v10, v14}, La/w0x;->s(I)I

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    invoke-interface {v3}, La/s0a;->a()La/j0a;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-interface {v3, v10}, La/j0a;->B(I)I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    iget-object v10, v0, La/fnu0;->c:Ljava/util/HashMap;

    .line 125
    .line 126
    invoke-virtual {v10, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    check-cast v10, La/enu0;

    .line 131
    .line 132
    invoke-static {v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    iget-object v10, v10, La/enu0;->c:La/hnu0;

    .line 136
    .line 137
    iput v3, v10, La/hnu0;->c:I

    .line 138
    .line 139
    invoke-virtual {v8, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move/from16 v27, v6

    .line 143
    .line 144
    move-object v6, v0

    .line 145
    move/from16 v0, v27

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_1
    move-object/from16 v27, v6

    .line 149
    .line 150
    move v6, v0

    .line 151
    move-object/from16 v0, v27

    .line 152
    .line 153
    new-instance v1, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-virtual {v8}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 160
    .line 161
    .line 162
    if-eqz v4, :cond_7

    .line 163
    .line 164
    iget-object v2, v7, La/cyu;->a:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v2, La/txj;

    .line 167
    .line 168
    invoke-static {}, La/ofm0;->m()V

    .line 169
    .line 170
    .line 171
    new-instance v3, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    const-string v5, "[StreamSharing] SurfaceProcessorNode Transform (Processor="

    .line 174
    .line 175
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const-string v5, "\n   inputEdge = "

    .line 182
    .line 183
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-static {v12, v3}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    if-eqz v5, :cond_2

    .line 205
    .line 206
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    check-cast v5, La/l45;

    .line 211
    .line 212
    new-instance v9, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-static {v12, v5}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_2
    new-instance v3, La/btd;

    .line 229
    .line 230
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 231
    .line 232
    .line 233
    iput-object v3, v7, La/cyu;->c:Ljava/lang/Object;

    .line 234
    .line 235
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    if-eqz v3, :cond_4

    .line 244
    .line 245
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    check-cast v3, La/l45;

    .line 250
    .line 251
    iget-object v5, v7, La/cyu;->c:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v5, La/btd;

    .line 254
    .line 255
    iget-object v9, v3, La/l45;->d:Landroid/graphics/Rect;

    .line 256
    .line 257
    iget v10, v3, La/l45;->f:I

    .line 258
    .line 259
    iget-boolean v11, v3, La/l45;->g:Z

    .line 260
    .line 261
    new-instance v12, Landroid/graphics/Matrix;

    .line 262
    .line 263
    iget-object v13, v4, La/cmn0;->b:Landroid/graphics/Matrix;

    .line 264
    .line 265
    invoke-direct {v12, v13}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 266
    .line 267
    .line 268
    new-instance v13, Landroid/graphics/RectF;

    .line 269
    .line 270
    invoke-direct {v13, v9}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 271
    .line 272
    .line 273
    iget-object v14, v3, La/l45;->e:Landroid/util/Size;

    .line 274
    .line 275
    move-object/from16 p1, v1

    .line 276
    .line 277
    invoke-static {v14}, La/jls0;->h(Landroid/util/Size;)Landroid/graphics/RectF;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-static {v13, v1, v10, v11}, La/jls0;->a(Landroid/graphics/RectF;Landroid/graphics/RectF;IZ)Landroid/graphics/Matrix;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    invoke-virtual {v12, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 286
    .line 287
    .line 288
    invoke-static {v9}, La/jls0;->f(Landroid/graphics/Rect;)Landroid/util/Size;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-static {v10, v1}, La/jls0;->g(ILandroid/util/Size;)Landroid/util/Size;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    const/4 v9, 0x0

    .line 297
    invoke-static {v1, v9, v14}, La/jls0;->d(Landroid/util/Size;ZLandroid/util/Size;)Z

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    invoke-static {v1}, La/z1x;->u(Z)V

    .line 302
    .line 303
    .line 304
    new-instance v1, Landroid/graphics/Rect;

    .line 305
    .line 306
    invoke-virtual {v14}, Landroid/util/Size;->getWidth()I

    .line 307
    .line 308
    .line 309
    move-result v13

    .line 310
    move-object/from16 p2, v8

    .line 311
    .line 312
    invoke-virtual {v14}, Landroid/util/Size;->getHeight()I

    .line 313
    .line 314
    .line 315
    move-result v8

    .line 316
    invoke-direct {v1, v9, v9, v13, v8}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 317
    .line 318
    .line 319
    iget-object v8, v4, La/cmn0;->g:La/h55;

    .line 320
    .line 321
    invoke-virtual {v8}, La/h55;->b()La/qgd;

    .line 322
    .line 323
    .line 324
    move-result-object v8

    .line 325
    iput-object v14, v8, La/qgd;->b:Ljava/lang/Object;

    .line 326
    .line 327
    invoke-virtual {v8}, La/qgd;->i()La/h55;

    .line 328
    .line 329
    .line 330
    move-result-object v19

    .line 331
    new-instance v16, La/cmn0;

    .line 332
    .line 333
    iget v8, v3, La/l45;->b:I

    .line 334
    .line 335
    iget v9, v3, La/l45;->c:I

    .line 336
    .line 337
    iget v13, v4, La/cmn0;->i:I

    .line 338
    .line 339
    sub-int v23, v13, v10

    .line 340
    .line 341
    iget-boolean v10, v4, La/cmn0;->e:Z

    .line 342
    .line 343
    if-eq v10, v11, :cond_3

    .line 344
    .line 345
    const/16 v25, 0x1

    .line 346
    .line 347
    goto :goto_4

    .line 348
    :cond_3
    const/16 v25, 0x0

    .line 349
    .line 350
    :goto_4
    const/16 v21, 0x0

    .line 351
    .line 352
    const/16 v24, -0x1

    .line 353
    .line 354
    move-object/from16 v22, v1

    .line 355
    .line 356
    move/from16 v17, v8

    .line 357
    .line 358
    move/from16 v18, v9

    .line 359
    .line 360
    move-object/from16 v20, v12

    .line 361
    .line 362
    invoke-direct/range {v16 .. v25}, La/cmn0;-><init>(IILa/h55;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    .line 363
    .line 364
    .line 365
    move-object/from16 v1, v16

    .line 366
    .line 367
    invoke-virtual {v5, v3, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-object/from16 v1, p1

    .line 371
    .line 372
    move-object/from16 v8, p2

    .line 373
    .line 374
    const/4 v14, 0x0

    .line 375
    goto/16 :goto_3

    .line 376
    .line 377
    :cond_4
    move-object/from16 p2, v8

    .line 378
    .line 379
    iget-object v1, v7, La/cyu;->b:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v1, La/s0a;

    .line 382
    .line 383
    const/4 v3, 0x1

    .line 384
    invoke-virtual {v4, v1, v3}, La/cmn0;->c(La/s0a;Z)La/pmn0;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    invoke-virtual {v2, v1}, La/txj;->b(La/pmn0;)V

    .line 389
    .line 390
    .line 391
    iget-object v1, v7, La/cyu;->c:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v1, La/btd;

    .line 394
    .line 395
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 404
    .line 405
    .line 406
    move-result v2

    .line 407
    if-eqz v2, :cond_5

    .line 408
    .line 409
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    check-cast v2, Ljava/util/Map$Entry;

    .line 414
    .line 415
    invoke-virtual {v7, v4, v2}, La/cyu;->f(La/cmn0;Ljava/util/Map$Entry;)V

    .line 416
    .line 417
    .line 418
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    check-cast v3, La/cmn0;

    .line 423
    .line 424
    new-instance v5, La/b1;

    .line 425
    .line 426
    const/16 v8, 0x1a

    .line 427
    .line 428
    invoke-direct {v5, v7, v4, v2, v8}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    invoke-static {}, La/ofm0;->m()V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v3}, La/cmn0;->a()V

    .line 438
    .line 439
    .line 440
    iget-object v2, v3, La/cmn0;->m:Ljava/util/HashSet;

    .line 441
    .line 442
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    goto :goto_5

    .line 446
    :cond_5
    iget-object v1, v7, La/cyu;->c:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v1, La/btd;

    .line 449
    .line 450
    new-instance v2, La/ad3;

    .line 451
    .line 452
    const/4 v3, 0x3

    .line 453
    invoke-direct {v2, v1, v3}, La/ad3;-><init>(Ljava/lang/Object;B)V

    .line 454
    .line 455
    .line 456
    iget-object v1, v4, La/cmn0;->o:Ljava/util/ArrayList;

    .line 457
    .line 458
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    iget-object v1, v7, La/cyu;->c:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v1, La/btd;

    .line 464
    .line 465
    new-instance v2, Ljava/util/HashMap;

    .line 466
    .line 467
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {p2 .. p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 479
    .line 480
    .line 481
    move-result v5

    .line 482
    if-eqz v5, :cond_6

    .line 483
    .line 484
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v5

    .line 488
    check-cast v5, Ljava/util/Map$Entry;

    .line 489
    .line 490
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v7

    .line 494
    check-cast v7, La/fot0;

    .line 495
    .line 496
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v5

    .line 500
    invoke-virtual {v1, v5}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v5

    .line 504
    check-cast v5, La/cmn0;

    .line 505
    .line 506
    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    goto :goto_6

    .line 510
    :cond_6
    invoke-virtual {v0, v4, v6}, La/fnu0;->v(La/cmn0;Z)Ljava/util/HashMap;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    invoke-virtual {v0, v2, v1}, La/fnu0;->y(Ljava/util/HashMap;Ljava/util/HashMap;)V

    .line 515
    .line 516
    .line 517
    iget-object v0, v15, La/qrm0;->B:La/tii0;

    .line 518
    .line 519
    invoke-virtual {v0}, La/tii0;->c()La/xii0;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    new-instance v1, Ljava/util/ArrayList;

    .line 528
    .line 529
    const/4 v3, 0x1

    .line 530
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 531
    .line 532
    .line 533
    const/16 v26, 0x0

    .line 534
    .line 535
    aget-object v0, v0, v26

    .line 536
    .line 537
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    return-object v0

    .line 548
    :cond_7
    const-string v0, "Null surfaceEdge"

    .line 549
    .line 550
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    const/4 v0, 0x0

    .line 554
    return-object v0

    .line 555
    :cond_8
    move-object v15, v0

    .line 556
    move-object v0, v6

    .line 557
    invoke-virtual/range {p0 .. p5}, La/qrm0;->I(Ljava/lang/String;Ljava/lang/String;La/fpt0;La/h55;La/h55;)La/cmn0;

    .line 558
    .line 559
    .line 560
    move-result-object v13

    .line 561
    move-object v1, v0

    .line 562
    new-instance v0, La/cmn0;

    .line 563
    .line 564
    iget-object v4, v15, La/fot0;->m:Landroid/graphics/Matrix;

    .line 565
    .line 566
    invoke-virtual {v15}, La/fot0;->j()La/s0a;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    invoke-interface {v2}, La/s0a;->q()Z

    .line 574
    .line 575
    .line 576
    move-result v5

    .line 577
    iget-object v2, v3, La/h55;->a:Landroid/util/Size;

    .line 578
    .line 579
    iget-object v6, v15, La/fot0;->l:Landroid/graphics/Rect;

    .line 580
    .line 581
    if-eqz v6, :cond_9

    .line 582
    .line 583
    const/4 v9, 0x0

    .line 584
    goto :goto_7

    .line 585
    :cond_9
    new-instance v6, Landroid/graphics/Rect;

    .line 586
    .line 587
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 588
    .line 589
    .line 590
    move-result v7

    .line 591
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    const/4 v9, 0x0

    .line 596
    invoke-direct {v6, v9, v9, v7, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 597
    .line 598
    .line 599
    :goto_7
    invoke-virtual {v15}, La/fot0;->j()La/s0a;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v15, v2, v9}, La/fot0;->i(La/s0a;Z)I

    .line 607
    .line 608
    .line 609
    move-result v7

    .line 610
    invoke-virtual {v15}, La/fot0;->j()La/s0a;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v15, v2}, La/fot0;->p(La/s0a;)Z

    .line 618
    .line 619
    .line 620
    move-result v9

    .line 621
    move-object v2, v1

    .line 622
    const/4 v1, 0x3

    .line 623
    move-object v8, v2

    .line 624
    const/16 v2, 0x22

    .line 625
    .line 626
    move-object v14, v8

    .line 627
    const/4 v8, -0x1

    .line 628
    invoke-direct/range {v0 .. v9}, La/cmn0;-><init>(IILa/h55;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    .line 629
    .line 630
    .line 631
    iput-object v0, v15, La/qrm0;->y:La/cmn0;

    .line 632
    .line 633
    invoke-virtual {v15}, La/fot0;->j()La/s0a;

    .line 634
    .line 635
    .line 636
    move-result-object v1

    .line 637
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    iput-object v0, v15, La/qrm0;->A:La/cmn0;

    .line 641
    .line 642
    iget-object v0, v15, La/qrm0;->y:La/cmn0;

    .line 643
    .line 644
    move-object/from16 v4, p3

    .line 645
    .line 646
    invoke-virtual {v15, v0, v4, v3}, La/qrm0;->J(La/cmn0;La/fpt0;La/h55;)La/tii0;

    .line 647
    .line 648
    .line 649
    move-result-object v7

    .line 650
    iput-object v7, v15, La/qrm0;->C:La/tii0;

    .line 651
    .line 652
    iget-object v0, v15, La/qrm0;->D:La/uii0;

    .line 653
    .line 654
    if-eqz v0, :cond_a

    .line 655
    .line 656
    invoke-virtual {v0}, La/uii0;->b()V

    .line 657
    .line 658
    .line 659
    :cond_a
    new-instance v8, La/uii0;

    .line 660
    .line 661
    new-instance v0, La/prm0;

    .line 662
    .line 663
    move-object/from16 v2, p1

    .line 664
    .line 665
    move-object/from16 v5, p4

    .line 666
    .line 667
    move-object v6, v3

    .line 668
    move-object v1, v15

    .line 669
    move-object/from16 v3, p2

    .line 670
    .line 671
    invoke-direct/range {v0 .. v6}, La/prm0;-><init>(La/qrm0;Ljava/lang/String;Ljava/lang/String;La/fpt0;La/h55;La/h55;)V

    .line 672
    .line 673
    .line 674
    invoke-direct {v8, v0}, La/uii0;-><init>(La/vii0;)V

    .line 675
    .line 676
    .line 677
    iput-object v8, v15, La/qrm0;->D:La/uii0;

    .line 678
    .line 679
    iput-object v8, v7, La/sii0;->f:La/uii0;

    .line 680
    .line 681
    iget-object v7, v15, La/qrm0;->A:La/cmn0;

    .line 682
    .line 683
    invoke-virtual {v15}, La/fot0;->d()La/s0a;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    invoke-virtual {v15}, La/fot0;->j()La/s0a;

    .line 688
    .line 689
    .line 690
    move-result-object v1

    .line 691
    new-instance v2, La/kki;

    .line 692
    .line 693
    new-instance v3, La/mbn;

    .line 694
    .line 695
    iget-object v4, v15, La/qrm0;->t:La/c5k;

    .line 696
    .line 697
    iget-object v5, v15, La/qrm0;->u:La/c5k;

    .line 698
    .line 699
    invoke-direct {v3, v10, v4, v5}, La/mbn;-><init>(La/agn;La/c5k;La/c5k;)V

    .line 700
    .line 701
    .line 702
    invoke-direct {v2, v0, v1, v3}, La/kki;-><init>(La/s0a;La/s0a;La/jmn0;)V

    .line 703
    .line 704
    .line 705
    iput-object v2, v15, La/qrm0;->w:La/kki;

    .line 706
    .line 707
    iget-object v0, v15, La/fot0;->l:Landroid/graphics/Rect;

    .line 708
    .line 709
    if-eqz v0, :cond_b

    .line 710
    .line 711
    const/4 v6, 0x1

    .line 712
    goto :goto_8

    .line 713
    :cond_b
    const/4 v6, 0x0

    .line 714
    :goto_8
    invoke-virtual {v15}, La/fot0;->m()I

    .line 715
    .line 716
    .line 717
    move-result v5

    .line 718
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    new-instance v8, Ljava/util/HashMap;

    .line 722
    .line 723
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 724
    .line 725
    .line 726
    iget-object v0, v14, La/fnu0;->a:Ljava/util/HashSet;

    .line 727
    .line 728
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 729
    .line 730
    .line 731
    move-result-object v9

    .line 732
    :goto_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 733
    .line 734
    .line 735
    move-result v0

    .line 736
    if-eqz v0, :cond_c

    .line 737
    .line 738
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    move-object v1, v0

    .line 743
    check-cast v1, La/fot0;

    .line 744
    .line 745
    iget-object v2, v14, La/fnu0;->k:La/ksf0;

    .line 746
    .line 747
    iget-object v3, v14, La/fnu0;->f:La/s0a;

    .line 748
    .line 749
    move-object v4, v13

    .line 750
    move-object v0, v14

    .line 751
    invoke-virtual/range {v0 .. v6}, La/fnu0;->s(La/fot0;La/ksf0;La/s0a;La/cmn0;IZ)La/l45;

    .line 752
    .line 753
    .line 754
    move-result-object v10

    .line 755
    iget-object v2, v0, La/fnu0;->l:La/ksf0;

    .line 756
    .line 757
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    iget-object v3, v0, La/fnu0;->g:La/s0a;

    .line 761
    .line 762
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-object v4, v7

    .line 766
    invoke-virtual/range {v0 .. v6}, La/fnu0;->s(La/fot0;La/ksf0;La/s0a;La/cmn0;IZ)La/l45;

    .line 767
    .line 768
    .line 769
    move-result-object v2

    .line 770
    iget-object v3, v0, La/fnu0;->f:La/s0a;

    .line 771
    .line 772
    iget-object v7, v1, La/fot0;->i:La/fpt0;

    .line 773
    .line 774
    check-cast v7, La/w0x;

    .line 775
    .line 776
    const/4 v14, 0x0

    .line 777
    invoke-interface {v7, v14}, La/w0x;->s(I)I

    .line 778
    .line 779
    .line 780
    move-result v7

    .line 781
    invoke-interface {v3}, La/s0a;->a()La/j0a;

    .line 782
    .line 783
    .line 784
    move-result-object v3

    .line 785
    invoke-interface {v3, v7}, La/j0a;->B(I)I

    .line 786
    .line 787
    .line 788
    move-result v3

    .line 789
    iget-object v7, v0, La/fnu0;->c:Ljava/util/HashMap;

    .line 790
    .line 791
    invoke-virtual {v7, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v7

    .line 795
    check-cast v7, La/enu0;

    .line 796
    .line 797
    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    iget-object v7, v7, La/enu0;->c:La/hnu0;

    .line 801
    .line 802
    iput v3, v7, La/hnu0;->c:I

    .line 803
    .line 804
    new-instance v3, La/k35;

    .line 805
    .line 806
    invoke-direct {v3, v10, v2}, La/k35;-><init>(La/l45;La/l45;)V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v8, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-object v14, v0

    .line 813
    move-object v7, v4

    .line 814
    goto :goto_9

    .line 815
    :cond_c
    move-object v4, v7

    .line 816
    move-object v0, v14

    .line 817
    iget-object v1, v15, La/qrm0;->w:La/kki;

    .line 818
    .line 819
    new-instance v2, Ljava/util/ArrayList;

    .line 820
    .line 821
    invoke-virtual {v8}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 822
    .line 823
    .line 824
    move-result-object v3

    .line 825
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 826
    .line 827
    .line 828
    new-instance v3, La/l35;

    .line 829
    .line 830
    invoke-direct {v3, v13, v4, v2}, La/l35;-><init>(La/cmn0;La/cmn0;Ljava/util/ArrayList;)V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 834
    .line 835
    .line 836
    invoke-static {}, La/ofm0;->m()V

    .line 837
    .line 838
    .line 839
    new-instance v5, Ljava/lang/StringBuilder;

    .line 840
    .line 841
    const-string v7, "[StreamSharing] DualSurfaceProcessorNode Transform Processor = "

    .line 842
    .line 843
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 844
    .line 845
    .line 846
    iget-object v7, v1, La/kki;->e:Ljava/lang/Object;

    .line 847
    .line 848
    check-cast v7, La/jmn0;

    .line 849
    .line 850
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 851
    .line 852
    .line 853
    const-string v9, "\n   primary input = "

    .line 854
    .line 855
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 856
    .line 857
    .line 858
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 859
    .line 860
    .line 861
    const-string v9, "\n   secondary input = "

    .line 862
    .line 863
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 864
    .line 865
    .line 866
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 867
    .line 868
    .line 869
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    move-result-object v4

    .line 873
    const-string v5, "DualSurfaceProcessorNode"

    .line 874
    .line 875
    invoke-static {v5, v4}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 876
    .line 877
    .line 878
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 879
    .line 880
    .line 881
    move-result-object v2

    .line 882
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 883
    .line 884
    .line 885
    move-result v4

    .line 886
    if-eqz v4, :cond_d

    .line 887
    .line 888
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v4

    .line 892
    check-cast v4, La/k35;

    .line 893
    .line 894
    new-instance v5, Ljava/lang/StringBuilder;

    .line 895
    .line 896
    invoke-direct {v5, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 900
    .line 901
    .line 902
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 903
    .line 904
    .line 905
    move-result-object v4

    .line 906
    invoke-static {v12, v4}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 907
    .line 908
    .line 909
    goto :goto_a

    .line 910
    :cond_d
    iput-object v3, v1, La/kki;->f:Ljava/lang/Object;

    .line 911
    .line 912
    new-instance v2, La/btd;

    .line 913
    .line 914
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 915
    .line 916
    .line 917
    iput-object v2, v1, La/kki;->d:Ljava/lang/Object;

    .line 918
    .line 919
    iget-object v2, v1, La/kki;->f:Ljava/lang/Object;

    .line 920
    .line 921
    check-cast v2, La/l35;

    .line 922
    .line 923
    iget-object v3, v2, La/l35;->a:La/cmn0;

    .line 924
    .line 925
    iget-object v4, v2, La/l35;->b:La/cmn0;

    .line 926
    .line 927
    iget-object v2, v2, La/l35;->c:Ljava/util/ArrayList;

    .line 928
    .line 929
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 930
    .line 931
    .line 932
    move-result-object v2

    .line 933
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 934
    .line 935
    .line 936
    move-result v5

    .line 937
    if-eqz v5, :cond_f

    .line 938
    .line 939
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object v5

    .line 943
    check-cast v5, La/k35;

    .line 944
    .line 945
    iget-object v9, v1, La/kki;->d:Ljava/lang/Object;

    .line 946
    .line 947
    check-cast v9, La/btd;

    .line 948
    .line 949
    iget-object v10, v5, La/k35;->a:La/l45;

    .line 950
    .line 951
    iget-object v11, v10, La/l45;->d:Landroid/graphics/Rect;

    .line 952
    .line 953
    iget v12, v10, La/l45;->f:I

    .line 954
    .line 955
    iget-boolean v14, v10, La/l45;->g:Z

    .line 956
    .line 957
    move-object/from16 p1, v2

    .line 958
    .line 959
    new-instance v2, Landroid/graphics/Matrix;

    .line 960
    .line 961
    move-object/from16 p2, v8

    .line 962
    .line 963
    iget-object v8, v3, La/cmn0;->b:Landroid/graphics/Matrix;

    .line 964
    .line 965
    invoke-direct {v2, v8}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 966
    .line 967
    .line 968
    new-instance v8, Landroid/graphics/RectF;

    .line 969
    .line 970
    invoke-direct {v8, v11}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 971
    .line 972
    .line 973
    move-object/from16 v16, v11

    .line 974
    .line 975
    iget-object v11, v10, La/l45;->e:Landroid/util/Size;

    .line 976
    .line 977
    invoke-static {v11}, La/jls0;->h(Landroid/util/Size;)Landroid/graphics/RectF;

    .line 978
    .line 979
    .line 980
    move-result-object v15

    .line 981
    invoke-static {v8, v15, v12, v14}, La/jls0;->a(Landroid/graphics/RectF;Landroid/graphics/RectF;IZ)Landroid/graphics/Matrix;

    .line 982
    .line 983
    .line 984
    move-result-object v8

    .line 985
    invoke-virtual {v2, v8}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 986
    .line 987
    .line 988
    invoke-static/range {v16 .. v16}, La/jls0;->f(Landroid/graphics/Rect;)Landroid/util/Size;

    .line 989
    .line 990
    .line 991
    move-result-object v8

    .line 992
    invoke-static {v12, v8}, La/jls0;->g(ILandroid/util/Size;)Landroid/util/Size;

    .line 993
    .line 994
    .line 995
    move-result-object v8

    .line 996
    const/4 v15, 0x0

    .line 997
    invoke-static {v8, v15, v11}, La/jls0;->d(Landroid/util/Size;ZLandroid/util/Size;)Z

    .line 998
    .line 999
    .line 1000
    move-result v8

    .line 1001
    invoke-static {v8}, La/z1x;->u(Z)V

    .line 1002
    .line 1003
    .line 1004
    new-instance v8, Landroid/graphics/Rect;

    .line 1005
    .line 1006
    move-object/from16 v20, v2

    .line 1007
    .line 1008
    invoke-virtual {v11}, Landroid/util/Size;->getWidth()I

    .line 1009
    .line 1010
    .line 1011
    move-result v2

    .line 1012
    move/from16 v16, v12

    .line 1013
    .line 1014
    invoke-virtual {v11}, Landroid/util/Size;->getHeight()I

    .line 1015
    .line 1016
    .line 1017
    move-result v12

    .line 1018
    invoke-direct {v8, v15, v15, v2, v12}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 1019
    .line 1020
    .line 1021
    iget-object v2, v3, La/cmn0;->g:La/h55;

    .line 1022
    .line 1023
    invoke-virtual {v2}, La/h55;->b()La/qgd;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v2

    .line 1027
    iput-object v11, v2, La/qgd;->b:Ljava/lang/Object;

    .line 1028
    .line 1029
    invoke-virtual {v2}, La/qgd;->i()La/h55;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v19

    .line 1033
    move/from16 v2, v16

    .line 1034
    .line 1035
    new-instance v16, La/cmn0;

    .line 1036
    .line 1037
    iget v11, v10, La/l45;->b:I

    .line 1038
    .line 1039
    iget v10, v10, La/l45;->c:I

    .line 1040
    .line 1041
    iget v12, v3, La/cmn0;->i:I

    .line 1042
    .line 1043
    sub-int v23, v12, v2

    .line 1044
    .line 1045
    iget-boolean v2, v3, La/cmn0;->e:Z

    .line 1046
    .line 1047
    if-eq v2, v14, :cond_e

    .line 1048
    .line 1049
    const/16 v25, 0x1

    .line 1050
    .line 1051
    goto :goto_c

    .line 1052
    :cond_e
    const/16 v25, 0x0

    .line 1053
    .line 1054
    :goto_c
    const/16 v21, 0x0

    .line 1055
    .line 1056
    const/16 v24, -0x1

    .line 1057
    .line 1058
    move-object/from16 v22, v8

    .line 1059
    .line 1060
    move/from16 v18, v10

    .line 1061
    .line 1062
    move/from16 v17, v11

    .line 1063
    .line 1064
    invoke-direct/range {v16 .. v25}, La/cmn0;-><init>(IILa/h55;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    .line 1065
    .line 1066
    .line 1067
    move-object/from16 v2, v16

    .line 1068
    .line 1069
    invoke-virtual {v9, v5, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    move-object/from16 v15, p0

    .line 1073
    .line 1074
    move-object/from16 v2, p1

    .line 1075
    .line 1076
    move-object/from16 v8, p2

    .line 1077
    .line 1078
    goto/16 :goto_b

    .line 1079
    .line 1080
    :cond_f
    move-object/from16 p2, v8

    .line 1081
    .line 1082
    iget-object v2, v1, La/kki;->b:Ljava/lang/Object;

    .line 1083
    .line 1084
    check-cast v2, La/s0a;

    .line 1085
    .line 1086
    const/4 v5, 0x1

    .line 1087
    invoke-virtual {v3, v2, v5}, La/cmn0;->c(La/s0a;Z)La/pmn0;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v2

    .line 1091
    invoke-interface {v7, v2}, La/jmn0;->b(La/pmn0;)V

    .line 1092
    .line 1093
    .line 1094
    iget-object v2, v1, La/kki;->c:Ljava/lang/Object;

    .line 1095
    .line 1096
    check-cast v2, La/s0a;

    .line 1097
    .line 1098
    const/4 v9, 0x0

    .line 1099
    invoke-virtual {v4, v2, v9}, La/cmn0;->c(La/s0a;Z)La/pmn0;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v2

    .line 1103
    invoke-interface {v7, v2}, La/jmn0;->b(La/pmn0;)V

    .line 1104
    .line 1105
    .line 1106
    iget-object v2, v1, La/kki;->b:Ljava/lang/Object;

    .line 1107
    .line 1108
    move-object/from16 v17, v2

    .line 1109
    .line 1110
    check-cast v17, La/s0a;

    .line 1111
    .line 1112
    iget-object v2, v1, La/kki;->c:Ljava/lang/Object;

    .line 1113
    .line 1114
    move-object/from16 v18, v2

    .line 1115
    .line 1116
    check-cast v18, La/s0a;

    .line 1117
    .line 1118
    iget-object v2, v1, La/kki;->d:Ljava/lang/Object;

    .line 1119
    .line 1120
    check-cast v2, La/btd;

    .line 1121
    .line 1122
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v2

    .line 1126
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v2

    .line 1130
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1131
    .line 1132
    .line 1133
    move-result v5

    .line 1134
    if-eqz v5, :cond_10

    .line 1135
    .line 1136
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v5

    .line 1140
    move-object/from16 v21, v5

    .line 1141
    .line 1142
    check-cast v21, Ljava/util/Map$Entry;

    .line 1143
    .line 1144
    move-object/from16 v16, v1

    .line 1145
    .line 1146
    move-object/from16 v19, v3

    .line 1147
    .line 1148
    move-object/from16 v20, v4

    .line 1149
    .line 1150
    invoke-virtual/range {v16 .. v21}, La/kki;->b(La/s0a;La/s0a;La/cmn0;La/cmn0;Ljava/util/Map$Entry;)V

    .line 1151
    .line 1152
    .line 1153
    invoke-interface/range {v21 .. v21}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v1

    .line 1157
    check-cast v1, La/cmn0;

    .line 1158
    .line 1159
    move-object/from16 v22, v21

    .line 1160
    .line 1161
    move-object/from16 v21, v20

    .line 1162
    .line 1163
    move-object/from16 v20, v19

    .line 1164
    .line 1165
    move-object/from16 v19, v18

    .line 1166
    .line 1167
    move-object/from16 v18, v17

    .line 1168
    .line 1169
    move-object/from16 v17, v16

    .line 1170
    .line 1171
    new-instance v16, La/nbn;

    .line 1172
    .line 1173
    const/16 v23, 0x0

    .line 1174
    .line 1175
    invoke-direct/range {v16 .. v23}, La/nbn;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1176
    .line 1177
    .line 1178
    move-object/from16 v4, v16

    .line 1179
    .line 1180
    move-object/from16 v3, v17

    .line 1181
    .line 1182
    move-object/from16 v17, v18

    .line 1183
    .line 1184
    move-object/from16 v18, v19

    .line 1185
    .line 1186
    move-object/from16 v19, v20

    .line 1187
    .line 1188
    move-object/from16 v20, v21

    .line 1189
    .line 1190
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1191
    .line 1192
    .line 1193
    invoke-static {}, La/ofm0;->m()V

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v1}, La/cmn0;->a()V

    .line 1197
    .line 1198
    .line 1199
    iget-object v1, v1, La/cmn0;->m:Ljava/util/HashSet;

    .line 1200
    .line 1201
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1202
    .line 1203
    .line 1204
    move-object v1, v3

    .line 1205
    move-object/from16 v3, v19

    .line 1206
    .line 1207
    move-object/from16 v4, v20

    .line 1208
    .line 1209
    goto :goto_d

    .line 1210
    :cond_10
    move-object v3, v1

    .line 1211
    iget-object v1, v3, La/kki;->d:Ljava/lang/Object;

    .line 1212
    .line 1213
    check-cast v1, La/btd;

    .line 1214
    .line 1215
    new-instance v2, Ljava/util/HashMap;

    .line 1216
    .line 1217
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 1218
    .line 1219
    .line 1220
    invoke-virtual/range {p2 .. p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v3

    .line 1224
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v3

    .line 1228
    :goto_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1229
    .line 1230
    .line 1231
    move-result v4

    .line 1232
    if-eqz v4, :cond_11

    .line 1233
    .line 1234
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v4

    .line 1238
    check-cast v4, Ljava/util/Map$Entry;

    .line 1239
    .line 1240
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v5

    .line 1244
    check-cast v5, La/fot0;

    .line 1245
    .line 1246
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v4

    .line 1250
    invoke-virtual {v1, v4}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v4

    .line 1254
    check-cast v4, La/cmn0;

    .line 1255
    .line 1256
    invoke-virtual {v2, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1257
    .line 1258
    .line 1259
    goto :goto_e

    .line 1260
    :cond_11
    invoke-virtual {v0, v13, v6}, La/fnu0;->v(La/cmn0;Z)Ljava/util/HashMap;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v1

    .line 1264
    invoke-virtual {v0, v2, v1}, La/fnu0;->y(Ljava/util/HashMap;Ljava/util/HashMap;)V

    .line 1265
    .line 1266
    .line 1267
    move-object/from16 v15, p0

    .line 1268
    .line 1269
    iget-object v0, v15, La/qrm0;->B:La/tii0;

    .line 1270
    .line 1271
    invoke-virtual {v0}, La/tii0;->c()La/xii0;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v0

    .line 1275
    iget-object v1, v15, La/qrm0;->C:La/tii0;

    .line 1276
    .line 1277
    invoke-virtual {v1}, La/tii0;->c()La/xii0;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v1

    .line 1281
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v0

    .line 1285
    new-instance v1, Ljava/util/ArrayList;

    .line 1286
    .line 1287
    const/4 v2, 0x2

    .line 1288
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1289
    .line 1290
    .line 1291
    move v14, v9

    .line 1292
    :goto_f
    if-ge v14, v2, :cond_12

    .line 1293
    .line 1294
    aget-object v3, v0, v14

    .line 1295
    .line 1296
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1300
    .line 1301
    .line 1302
    add-int/lit8 v14, v14, 0x1

    .line 1303
    .line 1304
    goto :goto_f

    .line 1305
    :cond_12
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v0

    .line 1309
    return-object v0
.end method

.method public final I(Ljava/lang/String;Ljava/lang/String;La/fpt0;La/h55;La/h55;)La/cmn0;
    .locals 10

    .line 1
    new-instance v0, La/cmn0;

    .line 2
    .line 3
    iget-object v4, p0, La/fot0;->m:Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-virtual {p0}, La/fot0;->d()La/s0a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-interface {v1}, La/s0a;->q()Z

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    iget-object v1, p4, La/h55;->a:Landroid/util/Size;

    .line 17
    .line 18
    iget-object v2, p0, La/fot0;->l:Landroid/graphics/Rect;

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Landroid/graphics/Rect;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-direct {v2, v6, v6, v7, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-virtual {p0}, La/fot0;->d()La/s0a;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1, v6}, La/fot0;->i(La/s0a;Z)I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    invoke-virtual {p0}, La/fot0;->d()La/s0a;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v1}, La/fot0;->p(La/s0a;)Z

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    const/4 v1, 0x3

    .line 60
    move-object v6, v2

    .line 61
    const/16 v2, 0x22

    .line 62
    .line 63
    const/4 v8, -0x1

    .line 64
    move-object v3, p4

    .line 65
    invoke-direct/range {v0 .. v9}, La/cmn0;-><init>(IILa/h55;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, La/qrm0;->x:La/cmn0;

    .line 69
    .line 70
    invoke-virtual {p0}, La/fot0;->d()La/s0a;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, La/qrm0;->z:La/cmn0;

    .line 78
    .line 79
    iget-object v0, p0, La/qrm0;->x:La/cmn0;

    .line 80
    .line 81
    invoke-virtual {p0, v0, p3, p4}, La/qrm0;->J(La/cmn0;La/fpt0;La/h55;)La/tii0;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    iput-object v7, p0, La/qrm0;->B:La/tii0;

    .line 86
    .line 87
    iget-object v0, p0, La/qrm0;->D:La/uii0;

    .line 88
    .line 89
    if-eqz v0, :cond_1

    .line 90
    .line 91
    invoke-virtual {v0}, La/uii0;->b()V

    .line 92
    .line 93
    .line 94
    :cond_1
    new-instance v8, La/uii0;

    .line 95
    .line 96
    new-instance v0, La/prm0;

    .line 97
    .line 98
    move-object v1, p0

    .line 99
    move-object v2, p1

    .line 100
    move-object v3, p2

    .line 101
    move-object v4, p3

    .line 102
    move-object v5, p4

    .line 103
    move-object v6, p5

    .line 104
    invoke-direct/range {v0 .. v6}, La/prm0;-><init>(La/qrm0;Ljava/lang/String;Ljava/lang/String;La/fpt0;La/h55;La/h55;)V

    .line 105
    .line 106
    .line 107
    invoke-direct {v8, v0}, La/uii0;-><init>(La/vii0;)V

    .line 108
    .line 109
    .line 110
    iput-object v8, p0, La/qrm0;->D:La/uii0;

    .line 111
    .line 112
    iput-object v8, v7, La/sii0;->f:La/uii0;

    .line 113
    .line 114
    iget-object p0, p0, La/qrm0;->z:La/cmn0;

    .line 115
    .line 116
    return-object p0
.end method

.method public final J(La/cmn0;La/fpt0;La/h55;)La/tii0;
    .locals 11

    .line 1
    iget-object v0, p3, La/h55;->a:Landroid/util/Size;

    .line 2
    .line 3
    invoke-static {p2, v0}, La/tii0;->d(La/fpt0;Landroid/util/Size;)La/tii0;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-object v0, p2, La/sii0;->b:La/ucs0;

    .line 8
    .line 9
    iget-object v1, p0, La/qrm0;->s:La/fnu0;

    .line 10
    .line 11
    iget-object v2, v1, La/fnu0;->a:Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, -0x1

    .line 18
    move v4, v3

    .line 19
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-eqz v5, :cond_1

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    check-cast v5, La/fot0;

    .line 30
    .line 31
    iget-object v5, v5, La/fot0;->i:La/fpt0;

    .line 32
    .line 33
    sget-object v6, La/fpt0;->C0:La/u15;

    .line 34
    .line 35
    invoke-interface {v5, v6}, La/qae0;->d(La/u15;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    check-cast v5, La/xii0;

    .line 40
    .line 41
    iget-object v5, v5, La/xii0;->g:La/t7a;

    .line 42
    .line 43
    iget v5, v5, La/t7a;->c:I

    .line 44
    .line 45
    sget-object v6, La/xii0;->j:Ljava/util/List;

    .line 46
    .line 47
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-interface {v6, v7}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-interface {v6, v8}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-lt v7, v6, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move v4, v5

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    if-eq v4, v3, :cond_2

    .line 69
    .line 70
    iput v4, v0, La/ucs0;->b:I

    .line 71
    .line 72
    :cond_2
    iget-object v2, p3, La/h55;->a:Landroid/util/Size;

    .line 73
    .line 74
    iget-object v4, v1, La/fnu0;->a:Ljava/util/HashSet;

    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_9

    .line 85
    .line 86
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    check-cast v5, La/fot0;

    .line 91
    .line 92
    iget-object v5, v5, La/fot0;->i:La/fpt0;

    .line 93
    .line 94
    invoke-static {v5, v2}, La/tii0;->d(La/fpt0;Landroid/util/Size;)La/tii0;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-virtual {v5}, La/tii0;->c()La/xii0;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    iget-object v6, v5, La/xii0;->g:La/t7a;

    .line 103
    .line 104
    iget-object v7, v6, La/t7a;->d:Ljava/util/List;

    .line 105
    .line 106
    invoke-virtual {v0, v7}, La/ucs0;->e(Ljava/util/Collection;)V

    .line 107
    .line 108
    .line 109
    iget-object v7, v5, La/xii0;->e:Ljava/util/List;

    .line 110
    .line 111
    iget-object v8, p2, La/sii0;->e:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    :cond_3
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    if-eqz v9, :cond_4

    .line 122
    .line 123
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    check-cast v9, La/vx9;

    .line 128
    .line 129
    invoke-virtual {v0, v9}, La/ucs0;->f(La/vx9;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    if-nez v10, :cond_3

    .line 137
    .line 138
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    iget-object v7, v5, La/xii0;->d:Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    if-eqz v8, :cond_6

    .line 153
    .line 154
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    check-cast v8, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 159
    .line 160
    iget-object v9, p2, La/sii0;->d:Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v10

    .line 166
    if-eqz v10, :cond_5

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_5
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_6
    iget-object v5, v5, La/xii0;->c:Ljava/util/List;

    .line 174
    .line 175
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-eqz v7, :cond_8

    .line 184
    .line 185
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    check-cast v7, Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 190
    .line 191
    iget-object v8, p2, La/sii0;->c:Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    if-eqz v9, :cond_7

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_7
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_8
    iget-object v5, v6, La/t7a;->b:La/b780;

    .line 205
    .line 206
    invoke-virtual {v0, v5}, La/ucs0;->g(La/drd;)V

    .line 207
    .line 208
    .line 209
    goto/16 :goto_1

    .line 210
    .line 211
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-static {}, La/ofm0;->m()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1}, La/cmn0;->a()V

    .line 218
    .line 219
    .line 220
    iget-boolean v2, p1, La/cmn0;->j:Z

    .line 221
    .line 222
    const/4 v4, 0x1

    .line 223
    xor-int/2addr v2, v4

    .line 224
    const-string v5, "Consumer can only be linked once."

    .line 225
    .line 226
    invoke-static {v5, v2}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 227
    .line 228
    .line 229
    iput-boolean v4, p1, La/cmn0;->j:Z

    .line 230
    .line 231
    iget-object p1, p1, La/cmn0;->l:La/bmn0;

    .line 232
    .line 233
    iget-object v2, p3, La/h55;->c:La/agn;

    .line 234
    .line 235
    invoke-virtual {p2, p1, v2, v3}, La/tii0;->b(La/hzj;La/agn;I)V

    .line 236
    .line 237
    .line 238
    iget-object p1, v1, La/fnu0;->h:La/wx9;

    .line 239
    .line 240
    invoke-virtual {v0, p1}, La/ucs0;->f(La/vx9;)V

    .line 241
    .line 242
    .line 243
    iget-object p1, p3, La/h55;->f:La/drd;

    .line 244
    .line 245
    if-eqz p1, :cond_a

    .line 246
    .line 247
    invoke-virtual {v0, p1}, La/ucs0;->g(La/drd;)V

    .line 248
    .line 249
    .line 250
    :cond_a
    iget p1, p3, La/h55;->d:I

    .line 251
    .line 252
    iput p1, p2, La/sii0;->h:I

    .line 253
    .line 254
    invoke-virtual {p0, p2, p3}, La/fot0;->a(La/tii0;La/h55;)V

    .line 255
    .line 256
    .line 257
    return-object p2
.end method

.method public final g(ZLa/ipt0;)La/fpt0;
    .locals 3

    .line 1
    iget-object v0, p0, La/qrm0;->r:La/rrm0;

    .line 2
    .line 3
    invoke-interface {v0}, La/fpt0;->v()La/hpt0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-interface {p2, v1, v2}, La/ipt0;->a(La/hpt0;I)La/drd;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, v0, La/rrm0;->a:La/b780;

    .line 15
    .line 16
    invoke-static {p2, p1}, La/drd;->r(La/drd;La/drd;)La/b780;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :cond_0
    if-nez p2, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :cond_1
    invoke-virtual {p0, p2}, La/qrm0;->n(La/drd;)La/ept0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, La/eyg0;

    .line 29
    .line 30
    invoke-virtual {p0}, La/eyg0;->e()La/fpt0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final k(La/n0a;)Ljava/util/Set;
    .locals 2

    .line 1
    iget-object p0, p0, La/qrm0;->s:La/fnu0;

    .line 2
    .line 3
    iget-object p0, p0, La/fnu0;->a:Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/HashSet;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, La/fot0;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, La/fot0;->k(La/n0a;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    if-nez v1, :cond_2

    .line 37
    .line 38
    new-instance v1, Ljava/util/HashSet;

    .line 39
    .line 40
    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-interface {v1, v0}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    return-object v1
.end method

.method public final l()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance p0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public final n(La/drd;)La/ept0;
    .locals 0

    .line 1
    new-instance p0, La/eyg0;

    .line 2
    .line 3
    invoke-static {p1}, La/wy40;->p(La/drd;)La/wy40;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, La/eyg0;-><init>(La/wy40;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final t()V
    .locals 5

    .line 1
    iget-object p0, p0, La/qrm0;->s:La/fnu0;

    .line 2
    .line 3
    iget-object v0, p0, La/fnu0;->a:Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, La/fot0;

    .line 20
    .line 21
    iget-object v2, p0, La/fnu0;->c:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, La/enu0;

    .line 28
    .line 29
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    iget-object v4, p0, La/fnu0;->e:La/ipt0;

    .line 34
    .line 35
    invoke-virtual {v1, v3, v4}, La/fot0;->g(ZLa/ipt0;)La/fpt0;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-virtual {v1, v2, v4, v4, v3}, La/fot0;->b(La/s0a;La/s0a;La/fpt0;La/fpt0;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-void
.end method

.method public final u()V
    .locals 1

    .line 1
    iget-object p0, p0, La/qrm0;->s:La/fnu0;

    .line 2
    .line 3
    iget-object p0, p0, La/fnu0;->a:Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/fot0;

    .line 20
    .line 21
    invoke-virtual {v0}, La/fot0;->u()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final v(La/n0a;La/ept0;)La/fpt0;
    .locals 17

    .line 1
    invoke-interface/range {p2 .. p2}, La/xro;->b()La/wy40;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move-object/from16 v1, p0

    .line 6
    .line 7
    iget-object v1, v1, La/qrm0;->s:La/fnu0;

    .line 8
    .line 9
    iget-object v2, v1, La/fnu0;->i:Ljava/util/HashSet;

    .line 10
    .line 11
    iget-object v3, v1, La/fnu0;->k:La/ksf0;

    .line 12
    .line 13
    iget-object v4, v3, La/ksf0;->f:La/n0a;

    .line 14
    .line 15
    const/16 v5, 0x22

    .line 16
    .line 17
    invoke-interface {v4, v5}, La/n0a;->p(I)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    const/4 v7, 0x0

    .line 22
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    iget-object v9, v3, La/ksf0;->d:Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-virtual {v9}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v10

    .line 32
    :cond_0
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v11

    .line 36
    const/4 v12, 0x0

    .line 37
    const/4 v13, 0x1

    .line 38
    if-eqz v11, :cond_2

    .line 39
    .line 40
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v11

    .line 44
    check-cast v11, La/fpt0;

    .line 45
    .line 46
    sget-object v14, La/fpt0;->M0:La/u15;

    .line 47
    .line 48
    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-interface {v11, v14, v15}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v14

    .line 54
    check-cast v14, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result v14

    .line 60
    if-eqz v14, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    instance-of v14, v11, La/w0x;

    .line 64
    .line 65
    if-eqz v14, :cond_0

    .line 66
    .line 67
    check-cast v11, La/w0x;

    .line 68
    .line 69
    sget-object v14, La/w0x;->s0:La/u15;

    .line 70
    .line 71
    invoke-interface {v11, v14, v12}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    check-cast v11, La/isf0;

    .line 76
    .line 77
    if-eqz v11, :cond_0

    .line 78
    .line 79
    iget v11, v11, La/isf0;->c:I

    .line 80
    .line 81
    if-ne v11, v13, :cond_0

    .line 82
    .line 83
    new-instance v10, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v4, v5}, La/n0a;->i(I)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 93
    .line 94
    .line 95
    move-object v6, v10

    .line 96
    :cond_2
    sget-object v4, La/w0x;->r0:La/u15;

    .line 97
    .line 98
    invoke-virtual {v0, v4, v12}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    check-cast v4, Ljava/util/List;

    .line 103
    .line 104
    if-eqz v4, :cond_5

    .line 105
    .line 106
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-eqz v6, :cond_4

    .line 115
    .line 116
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    check-cast v6, Landroid/util/Pair;

    .line 121
    .line 122
    iget-object v10, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v10, Ljava/lang/Integer;

    .line 125
    .line 126
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    invoke-virtual {v10, v11}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    if-eqz v10, :cond_3

    .line 135
    .line 136
    iget-object v4, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v4, [Landroid/util/Size;

    .line 139
    .line 140
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    :goto_1
    move-object v6, v4

    .line 145
    goto :goto_2

    .line 146
    :cond_4
    new-instance v4, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_5
    :goto_2
    iget-object v4, v3, La/ksf0;->c:Landroid/util/Rational;

    .line 153
    .line 154
    new-instance v5, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 157
    .line 158
    .line 159
    new-instance v10, Ljava/util/HashSet;

    .line 160
    .line 161
    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v9}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v14

    .line 172
    if-eqz v14, :cond_6

    .line 173
    .line 174
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v14

    .line 178
    check-cast v14, La/fpt0;

    .line 179
    .line 180
    invoke-virtual {v3, v14}, La/ksf0;->c(La/fpt0;)Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v14

    .line 184
    invoke-interface {v10, v14}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 185
    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_6
    invoke-virtual {v10}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    :cond_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v11

    .line 196
    if-eqz v11, :cond_8

    .line 197
    .line 198
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v11

    .line 202
    check-cast v11, Landroid/util/Size;

    .line 203
    .line 204
    invoke-static {v4, v11}, La/ky3;->a(Landroid/util/Rational;Landroid/util/Size;)Z

    .line 205
    .line 206
    .line 207
    move-result v11

    .line 208
    if-nez v11, :cond_7

    .line 209
    .line 210
    iget-object v10, v3, La/ksf0;->b:Landroid/util/Rational;

    .line 211
    .line 212
    invoke-virtual {v3, v10, v6, v7}, La/ksf0;->g(Landroid/util/Rational;Ljava/util/List;Z)Ljava/util/ArrayList;

    .line 213
    .line 214
    .line 215
    move-result-object v10

    .line 216
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 217
    .line 218
    .line 219
    :cond_8
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 220
    .line 221
    .line 222
    move-result v10

    .line 223
    invoke-virtual {v9}, Ljava/util/HashSet;->isEmpty()Z

    .line 224
    .line 225
    .line 226
    move-result v11

    .line 227
    if-eqz v11, :cond_9

    .line 228
    .line 229
    move-object/from16 p0, v12

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_9
    invoke-virtual {v9}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v11

    .line 240
    if-eqz v11, :cond_f

    .line 241
    .line 242
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v11

    .line 246
    check-cast v11, La/fpt0;

    .line 247
    .line 248
    invoke-virtual {v3, v11}, La/ksf0;->c(La/fpt0;)Ljava/util/List;

    .line 249
    .line 250
    .line 251
    move-result-object v11

    .line 252
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object v11

    .line 256
    move v14, v7

    .line 257
    move v15, v14

    .line 258
    :goto_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result v16

    .line 262
    if-eqz v16, :cond_d

    .line 263
    .line 264
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v16

    .line 268
    move-object/from16 p0, v12

    .line 269
    .line 270
    move-object/from16 v12, v16

    .line 271
    .line 272
    check-cast v12, Landroid/util/Size;

    .line 273
    .line 274
    invoke-static {v4, v12}, La/ky3;->a(Landroid/util/Rational;Landroid/util/Size;)Z

    .line 275
    .line 276
    .line 277
    move-result v12

    .line 278
    if-eqz v12, :cond_a

    .line 279
    .line 280
    move v14, v13

    .line 281
    :cond_a
    if-eqz v15, :cond_b

    .line 282
    .line 283
    if-eqz v12, :cond_b

    .line 284
    .line 285
    goto :goto_6

    .line 286
    :cond_b
    if-nez v12, :cond_c

    .line 287
    .line 288
    move v15, v13

    .line 289
    :cond_c
    move-object/from16 v12, p0

    .line 290
    .line 291
    goto :goto_5

    .line 292
    :cond_d
    move-object/from16 p0, v12

    .line 293
    .line 294
    if-nez v14, :cond_e

    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_e
    move-object/from16 v12, p0

    .line 298
    .line 299
    goto :goto_4

    .line 300
    :cond_f
    move-object/from16 p0, v12

    .line 301
    .line 302
    move v10, v7

    .line 303
    :goto_6
    invoke-virtual {v3, v4, v6, v7}, La/ksf0;->g(Landroid/util/Rational;Ljava/util/List;Z)Ljava/util/ArrayList;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    invoke-virtual {v5, v10, v4}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 308
    .line 309
    .line 310
    invoke-virtual {v3, v6, v7}, La/ksf0;->f(Ljava/util/List;Z)Ljava/util/ArrayList;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 315
    .line 316
    .line 317
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    const-string v9, "ResolutionsMerger"

    .line 322
    .line 323
    if-eqz v4, :cond_10

    .line 324
    .line 325
    const-string v4, "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV."

    .line 326
    .line 327
    invoke-static {v9, v4}, La/l8x;->E0(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v3, v6, v13}, La/ksf0;->f(Ljava/util/List;Z)Ljava/util/ArrayList;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 335
    .line 336
    .line 337
    :cond_10
    new-instance v3, Ljava/lang/StringBuilder;

    .line 338
    .line 339
    const-string v4, "Parent resolutions: "

    .line 340
    .line 341
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    invoke-static {v9, v3}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    sget-object v3, La/w0x;->t0:La/u15;

    .line 355
    .line 356
    invoke-virtual {v0, v3, v5}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    sget-object v3, La/fpt0;->G0:La/u15;

    .line 360
    .line 361
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    move v5, v7

    .line 366
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v6

    .line 370
    if-eqz v6, :cond_11

    .line 371
    .line 372
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v6

    .line 376
    check-cast v6, La/fpt0;

    .line 377
    .line 378
    sget-object v9, La/fpt0;->G0:La/u15;

    .line 379
    .line 380
    invoke-interface {v6, v9, v8}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v6

    .line 384
    check-cast v6, Ljava/lang/Integer;

    .line 385
    .line 386
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 387
    .line 388
    .line 389
    move-result v6

    .line 390
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 391
    .line 392
    .line 393
    move-result v5

    .line 394
    goto :goto_7

    .line 395
    :cond_11
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    invoke-virtual {v0, v3, v4}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    new-instance v3, Ljava/util/ArrayList;

    .line 403
    .line 404
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 408
    .line 409
    .line 410
    move-result-object v4

    .line 411
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 412
    .line 413
    .line 414
    move-result v5

    .line 415
    if-eqz v5, :cond_12

    .line 416
    .line 417
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v5

    .line 421
    check-cast v5, La/fpt0;

    .line 422
    .line 423
    sget-object v6, La/h0x;->j0:La/u15;

    .line 424
    .line 425
    sget-object v9, La/agn;->c:La/agn;

    .line 426
    .line 427
    invoke-interface {v5, v6, v9}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    check-cast v5, La/agn;

    .line 432
    .line 433
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    goto :goto_8

    .line 440
    :cond_12
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 441
    .line 442
    .line 443
    move-result v4

    .line 444
    if-eqz v4, :cond_13

    .line 445
    .line 446
    goto/16 :goto_d

    .line 447
    .line 448
    :cond_13
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    check-cast v4, La/agn;

    .line 453
    .line 454
    iget v5, v4, La/agn;->a:I

    .line 455
    .line 456
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    iget v4, v4, La/agn;->b:I

    .line 461
    .line 462
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    move v6, v13

    .line 467
    :goto_9
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 468
    .line 469
    .line 470
    move-result v7

    .line 471
    if-ge v6, v7, :cond_1e

    .line 472
    .line 473
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v7

    .line 477
    check-cast v7, La/agn;

    .line 478
    .line 479
    iget v9, v7, La/agn;->a:I

    .line 480
    .line 481
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 482
    .line 483
    .line 484
    move-result-object v9

    .line 485
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 486
    .line 487
    .line 488
    move-result-object v10

    .line 489
    const/4 v11, 0x2

    .line 490
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 491
    .line 492
    .line 493
    move-result-object v11

    .line 494
    invoke-virtual {v5, v8}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v12

    .line 498
    if-eqz v12, :cond_14

    .line 499
    .line 500
    :goto_a
    move-object v5, v9

    .line 501
    goto :goto_b

    .line 502
    :cond_14
    invoke-virtual {v9, v8}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v12

    .line 506
    if-eqz v12, :cond_15

    .line 507
    .line 508
    goto :goto_b

    .line 509
    :cond_15
    invoke-virtual {v5, v11}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    move-result v12

    .line 513
    if-eqz v12, :cond_16

    .line 514
    .line 515
    invoke-virtual {v9, v10}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result v12

    .line 519
    if-nez v12, :cond_16

    .line 520
    .line 521
    goto :goto_a

    .line 522
    :cond_16
    invoke-virtual {v9, v11}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    move-result v11

    .line 526
    if-eqz v11, :cond_17

    .line 527
    .line 528
    invoke-virtual {v5, v10}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 529
    .line 530
    .line 531
    move-result v10

    .line 532
    if-nez v10, :cond_17

    .line 533
    .line 534
    goto :goto_b

    .line 535
    :cond_17
    invoke-virtual {v5, v9}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v9

    .line 539
    if-eqz v9, :cond_18

    .line 540
    .line 541
    goto :goto_b

    .line 542
    :cond_18
    move-object/from16 v5, p0

    .line 543
    .line 544
    :goto_b
    iget v7, v7, La/agn;->b:I

    .line 545
    .line 546
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 547
    .line 548
    .line 549
    move-result-object v7

    .line 550
    invoke-virtual {v4, v8}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    move-result v9

    .line 554
    if-eqz v9, :cond_19

    .line 555
    .line 556
    move-object v4, v7

    .line 557
    goto :goto_c

    .line 558
    :cond_19
    invoke-virtual {v7, v8}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v9

    .line 562
    if-eqz v9, :cond_1a

    .line 563
    .line 564
    goto :goto_c

    .line 565
    :cond_1a
    invoke-virtual {v4, v7}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v7

    .line 569
    if-eqz v7, :cond_1b

    .line 570
    .line 571
    goto :goto_c

    .line 572
    :cond_1b
    move-object/from16 v4, p0

    .line 573
    .line 574
    :goto_c
    if-eqz v5, :cond_1d

    .line 575
    .line 576
    if-nez v4, :cond_1c

    .line 577
    .line 578
    goto :goto_d

    .line 579
    :cond_1c
    add-int/lit8 v6, v6, 0x1

    .line 580
    .line 581
    goto :goto_9

    .line 582
    :cond_1d
    :goto_d
    move-object/from16 v3, p0

    .line 583
    .line 584
    goto :goto_e

    .line 585
    :cond_1e
    new-instance v3, La/agn;

    .line 586
    .line 587
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 588
    .line 589
    .line 590
    move-result v5

    .line 591
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 592
    .line 593
    .line 594
    move-result v4

    .line 595
    invoke-direct {v3, v5, v4}, La/agn;-><init>(II)V

    .line 596
    .line 597
    .line 598
    :goto_e
    if-eqz v3, :cond_24

    .line 599
    .line 600
    sget-object v4, La/h0x;->j0:La/u15;

    .line 601
    .line 602
    invoke-virtual {v0, v4, v3}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    sget-object v3, La/fpt0;->I0:La/u15;

    .line 606
    .line 607
    sget-object v4, La/h55;->h:Landroid/util/Range;

    .line 608
    .line 609
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 614
    .line 615
    .line 616
    move-result v5

    .line 617
    if-eqz v5, :cond_20

    .line 618
    .line 619
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v5

    .line 623
    check-cast v5, La/fpt0;

    .line 624
    .line 625
    sget-object v6, La/fpt0;->I0:La/u15;

    .line 626
    .line 627
    invoke-interface {v5, v6, v4}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v5

    .line 631
    check-cast v5, Landroid/util/Range;

    .line 632
    .line 633
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    sget-object v6, La/h55;->h:Landroid/util/Range;

    .line 637
    .line 638
    invoke-virtual {v6, v4}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    .line 639
    .line 640
    .line 641
    move-result v6

    .line 642
    if-eqz v6, :cond_1f

    .line 643
    .line 644
    move-object v4, v5

    .line 645
    goto :goto_f

    .line 646
    :cond_1f
    :try_start_0
    invoke-virtual {v4, v5}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    .line 647
    .line 648
    .line 649
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 650
    goto :goto_f

    .line 651
    :catch_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 652
    .line 653
    const-string v6, "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: "

    .line 654
    .line 655
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 659
    .line 660
    .line 661
    const-string v6, " <<>> "

    .line 662
    .line 663
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v2

    .line 673
    const-string v6, "VirtualCameraAdapter"

    .line 674
    .line 675
    invoke-static {v6, v2}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v4, v5}, Landroid/util/Range;->extend(Landroid/util/Range;)Landroid/util/Range;

    .line 679
    .line 680
    .line 681
    move-result-object v4

    .line 682
    :cond_20
    invoke-virtual {v0, v3, v4}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    iget-object v2, v1, La/fnu0;->a:Ljava/util/HashSet;

    .line 686
    .line 687
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 688
    .line 689
    .line 690
    move-result-object v2

    .line 691
    :cond_21
    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 692
    .line 693
    .line 694
    move-result v3

    .line 695
    if-eqz v3, :cond_23

    .line 696
    .line 697
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v3

    .line 701
    check-cast v3, La/fot0;

    .line 702
    .line 703
    iget-object v4, v1, La/fnu0;->j:Ljava/util/HashMap;

    .line 704
    .line 705
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object v3

    .line 709
    check-cast v3, La/fpt0;

    .line 710
    .line 711
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    invoke-interface {v3}, La/fpt0;->n()I

    .line 715
    .line 716
    .line 717
    move-result v4

    .line 718
    if-eqz v4, :cond_22

    .line 719
    .line 720
    sget-object v4, La/fpt0;->P0:La/u15;

    .line 721
    .line 722
    invoke-interface {v3}, La/fpt0;->n()I

    .line 723
    .line 724
    .line 725
    move-result v5

    .line 726
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 727
    .line 728
    .line 729
    move-result-object v5

    .line 730
    invoke-virtual {v0, v4, v5}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 731
    .line 732
    .line 733
    :cond_22
    invoke-interface {v3}, La/fpt0;->q()I

    .line 734
    .line 735
    .line 736
    move-result v4

    .line 737
    if-eqz v4, :cond_21

    .line 738
    .line 739
    sget-object v4, La/fpt0;->O0:La/u15;

    .line 740
    .line 741
    invoke-interface {v3}, La/fpt0;->q()I

    .line 742
    .line 743
    .line 744
    move-result v3

    .line 745
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 746
    .line 747
    .line 748
    move-result-object v3

    .line 749
    invoke-virtual {v0, v4, v3}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 750
    .line 751
    .line 752
    goto :goto_10

    .line 753
    :cond_23
    invoke-interface/range {p2 .. p2}, La/ept0;->e()La/fpt0;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    return-object v0

    .line 758
    :cond_24
    const-string v0, "Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children."

    .line 759
    .line 760
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    return-object p0
.end method

.method public final w()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/fot0;->a:Z

    .line 3
    .line 4
    iget-object p0, p0, La/qrm0;->s:La/fnu0;

    .line 5
    .line 6
    iget-object p0, p0, La/fnu0;->a:Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, La/fot0;

    .line 23
    .line 24
    invoke-virtual {v0}, La/fot0;->w()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public final x()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, La/fot0;->a:Z

    .line 3
    .line 4
    iget-object p0, p0, La/qrm0;->s:La/fnu0;

    .line 5
    .line 6
    iget-object p0, p0, La/fnu0;->a:Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, La/fot0;

    .line 23
    .line 24
    invoke-virtual {v0}, La/fot0;->x()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public final y(La/drd;)La/h55;
    .locals 3

    .line 1
    iget-object v0, p0, La/qrm0;->B:La/tii0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/tii0;->a(La/drd;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/qrm0;->B:La/tii0;

    .line 7
    .line 8
    invoke-virtual {v0}, La/tii0;->c()La/xii0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    aget-object v0, v0, v2

    .line 24
    .line 25
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v0}, La/fot0;->E(Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, La/fot0;->j:La/h55;

    .line 39
    .line 40
    invoke-virtual {p0}, La/h55;->b()La/qgd;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iput-object p1, p0, La/qgd;->g:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p0}, La/qgd;->i()La/h55;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public final z(La/h55;La/h55;)La/h55;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "onSuggestedStreamSpecUpdated: primaryStreamSpec = "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, ", secondaryStreamSpec "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "StreamSharing"

    .line 24
    .line 25
    invoke-static {v1, v0}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, La/fot0;->f()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {p0}, La/fot0;->j()La/s0a;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    :goto_0
    move-object v4, v0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-virtual {p0}, La/fot0;->j()La/s0a;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0}, La/s0a;->h()La/n0a;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {v0}, La/n0a;->e()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    goto :goto_0

    .line 54
    :goto_1
    iget-object v5, p0, La/fot0;->i:La/fpt0;

    .line 55
    .line 56
    move-object v2, p0

    .line 57
    move-object v6, p1

    .line 58
    move-object v7, p2

    .line 59
    invoke-virtual/range {v2 .. v7}, La/qrm0;->H(Ljava/lang/String;Ljava/lang/String;La/fpt0;La/h55;La/h55;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {v2, p0}, La/fot0;->E(Ljava/util/List;)V

    .line 64
    .line 65
    .line 66
    const/4 p0, 0x1

    .line 67
    iput p0, v2, La/fot0;->e:I

    .line 68
    .line 69
    invoke-virtual {v2}, La/fot0;->s()V

    .line 70
    .line 71
    .line 72
    return-object v6
.end method
