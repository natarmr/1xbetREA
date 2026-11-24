.class public final La/rua0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final G:Ljava/util/List;

.field public static final H:La/j700;


# instance fields
.field public final A:La/pmi0;

.field public final B:La/dxt;

.field public final C:La/lrc;

.field public D:La/bby;

.field public E:La/bby;

.field public final F:La/c4m0;

.field public final o:La/tzi;

.field public final p:La/fvt0;

.field public final q:La/nv20;

.field public final r:La/ivn;

.field public final s:La/vjp;

.field public final t:La/qv2;

.field public final u:La/h3c;

.field public final v:La/i1w0;

.field public final w:La/m1e;

.field public final x:La/duj;

.field public final y:La/mne;

.field public final z:La/lef0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x13a

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, La/rua0;->G:Ljava/util/List;

    .line 12
    .line 13
    sget-object v0, La/j700;->a:La/j700;

    .line 14
    .line 15
    sput-object v0, La/rua0;->H:La/j700;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(La/vzg0;La/tzi;La/g2v;La/ctf0;La/pru;La/lbu;La/r9u;La/fvt0;La/nv20;La/ivn;La/vjp;La/qv2;La/h3c;La/i1w0;La/m1e;La/duj;La/mne;La/xfu;La/lef0;La/pmi0;La/dxt;La/sqt;La/lrc;)V
    .locals 10

    .line 1
    move-object/from16 v0, p17

    .line 2
    .line 3
    move-object/from16 v1, p19

    .line 4
    .line 5
    move-object/from16 v2, p20

    .line 6
    .line 7
    move-object/from16 v3, p21

    .line 8
    .line 9
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p15 .. p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v4, La/enm;

    .line 19
    .line 20
    move-object v9, p4

    .line 21
    move-object v5, p5

    .line 22
    move-object/from16 v7, p6

    .line 23
    .line 24
    move-object/from16 v8, p7

    .line 25
    .line 26
    move-object/from16 v6, p22

    .line 27
    .line 28
    invoke-direct/range {v4 .. v9}, La/enm;-><init>(La/pru;La/sqt;La/lbu;La/r9u;La/ctf0;)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/o20;

    .line 32
    .line 33
    const/16 v6, 0x13

    .line 34
    .line 35
    invoke-direct {v5, p4, p3, v6}, La/o20;-><init>(La/ctf0;La/g2v;B)V

    .line 36
    .line 37
    .line 38
    iget-object p3, v0, La/mne;->a:La/rwj;

    .line 39
    .line 40
    invoke-static {p3, p3}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 41
    .line 42
    .line 43
    move-result-object p4

    .line 44
    invoke-direct {p0, p1, v4, v5, p4}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/g090;)V

    .line 45
    .line 46
    .line 47
    iput-object p2, p0, La/rua0;->o:La/tzi;

    .line 48
    .line 49
    move-object/from16 p1, p8

    .line 50
    .line 51
    iput-object p1, p0, La/rua0;->p:La/fvt0;

    .line 52
    .line 53
    move-object/from16 p1, p9

    .line 54
    .line 55
    iput-object p1, p0, La/rua0;->q:La/nv20;

    .line 56
    .line 57
    move-object/from16 p1, p10

    .line 58
    .line 59
    iput-object p1, p0, La/rua0;->r:La/ivn;

    .line 60
    .line 61
    move-object/from16 p1, p11

    .line 62
    .line 63
    iput-object p1, p0, La/rua0;->s:La/vjp;

    .line 64
    .line 65
    move-object/from16 p1, p12

    .line 66
    .line 67
    iput-object p1, p0, La/rua0;->t:La/qv2;

    .line 68
    .line 69
    move-object/from16 p1, p13

    .line 70
    .line 71
    iput-object p1, p0, La/rua0;->u:La/h3c;

    .line 72
    .line 73
    move-object/from16 p1, p14

    .line 74
    .line 75
    iput-object p1, p0, La/rua0;->v:La/i1w0;

    .line 76
    .line 77
    move-object/from16 p1, p15

    .line 78
    .line 79
    iput-object p1, p0, La/rua0;->w:La/m1e;

    .line 80
    .line 81
    move-object/from16 p1, p16

    .line 82
    .line 83
    iput-object p1, p0, La/rua0;->x:La/duj;

    .line 84
    .line 85
    iput-object v0, p0, La/rua0;->y:La/mne;

    .line 86
    .line 87
    iput-object v1, p0, La/rua0;->z:La/lef0;

    .line 88
    .line 89
    iput-object v2, p0, La/rua0;->A:La/pmi0;

    .line 90
    .line 91
    iput-object v3, p0, La/rua0;->B:La/dxt;

    .line 92
    .line 93
    move-object/from16 p1, p23

    .line 94
    .line 95
    iput-object p1, p0, La/rua0;->C:La/lrc;

    .line 96
    .line 97
    iget-object p1, p0, La/rua0;->F:La/c4m0;

    .line 98
    .line 99
    const/4 p2, 0x1

    .line 100
    if-eqz p1, :cond_0

    .line 101
    .line 102
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-ne p1, p2, :cond_0

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_0
    const/4 p1, 0x0

    .line 110
    move-object/from16 p4, p18

    .line 111
    .line 112
    invoke-virtual {p4, p1}, La/xfu;->a(Z)La/p6d;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    new-instance p4, La/s980;

    .line 117
    .line 118
    const/4 v0, 0x0

    .line 119
    const/16 v4, 0x16

    .line 120
    .line 121
    invoke-direct {p4, p0, v0, v4}, La/s980;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 122
    .line 123
    .line 124
    new-instance v0, La/fnq;

    .line 125
    .line 126
    const/4 v4, 0x4

    .line 127
    invoke-direct {v0, p1, p4, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 128
    .line 129
    .line 130
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-static {p1, p3}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {v0, p1}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iput-object p1, p0, La/rua0;->F:La/c4m0;

    .line 143
    .line 144
    :goto_0
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    check-cast p0, La/gua0;

    .line 149
    .line 150
    iget-object p0, p0, La/gua0;->n:La/ghq0;

    .line 151
    .line 152
    iget-object p1, p0, La/ghq0;->a:La/ygq0;

    .line 153
    .line 154
    iget-object p0, p0, La/ghq0;->b:La/wgq0;

    .line 155
    .line 156
    sget-object p3, La/ygq0;->c:La/ygq0;

    .line 157
    .line 158
    if-eq p1, p3, :cond_1

    .line 159
    .line 160
    invoke-virtual {v1, p1, p2}, La/lef0;->i(La/ygq0;Z)V

    .line 161
    .line 162
    .line 163
    :cond_1
    iget-wide p1, p0, La/wgq0;->a:J

    .line 164
    .line 165
    const-wide/16 p3, -0x1

    .line 166
    .line 167
    cmp-long v0, p1, p3

    .line 168
    .line 169
    if-eqz v0, :cond_2

    .line 170
    .line 171
    invoke-virtual {v2, p1, p2}, La/pmi0;->j(J)V

    .line 172
    .line 173
    .line 174
    :cond_2
    iget-wide p0, p0, La/wgq0;->b:J

    .line 175
    .line 176
    cmp-long p2, p0, p3

    .line 177
    .line 178
    if-eqz p2, :cond_3

    .line 179
    .line 180
    invoke-virtual {v3, p0, p1}, La/dxt;->a(J)V

    .line 181
    .line 182
    .line 183
    :cond_3
    return-void
.end method


# virtual methods
.method public final M(Z)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 4
    .line 5
    iget-object v14, v1, La/ocj;->a:La/p7m0;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {v14}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v15

    .line 11
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-object v1, v15

    .line 15
    check-cast v1, La/gua0;

    .line 16
    .line 17
    iget-object v2, v0, La/i3t0;->f:La/oyg0;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-string v4, "KEY_MULTISELECT_ACTIVE_STATE"

    .line 27
    .line 28
    invoke-static {v2, v3, v4}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const v13, 0xffff

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    const/4 v9, 0x0

    .line 42
    const/4 v10, 0x0

    .line 43
    const/4 v11, 0x0

    .line 44
    move/from16 v12, p1

    .line 45
    .line 46
    invoke-static/range {v1 .. v13}, La/gua0;->a(La/gua0;La/fua0;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/util/List;La/zmb;ZZLa/ghq0;ZLorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZI)La/gua0;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v14, v15, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, La/gua0;

    .line 61
    .line 62
    iget-object v1, v1, La/gua0;->b:La/rlp;

    .line 63
    .line 64
    iget-object v1, v1, La/rlp;->d:La/j8l0;

    .line 65
    .line 66
    sget-object v2, La/j8l0;->d:La/j8l0;

    .line 67
    .line 68
    if-ne v1, v2, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, La/gua0;

    .line 76
    .line 77
    iget-object v1, v1, La/gua0;->p:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 78
    .line 79
    if-nez v12, :cond_2

    .line 80
    .line 81
    sget-object v2, La/xun;->a:La/xun;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    iget-object v2, v1, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;->b:Ljava/util/Set;

    .line 85
    .line 86
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v1, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 93
    .line 94
    invoke-direct {v1, v2, v12}, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;-><init>(Ljava/util/Set;Z)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, La/gua0;

    .line 102
    .line 103
    iget-object v2, v2, La/gua0;->p:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 104
    .line 105
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-nez v2, :cond_3

    .line 110
    .line 111
    new-instance v2, La/xh20;

    .line 112
    .line 113
    const/16 v3, 0xb

    .line 114
    .line 115
    invoke-direct {v2, v1, v12, v3}, La/xh20;-><init>(Ljava/lang/Object;ZB)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 119
    .line 120
    .line 121
    :cond_3
    :goto_1
    return-void
.end method

.method public final N(Z)V
    .locals 22

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    const/4 v8, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v0, v2, La/rua0;->D:La/bby;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, v8}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, v2, La/rua0;->D:La/bby;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x1

    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, La/gua0;

    .line 30
    .line 31
    iget-object v0, v0, La/gua0;->a:La/fua0;

    .line 32
    .line 33
    instance-of v0, v0, La/eua0;

    .line 34
    .line 35
    iget-object v1, v2, La/i3t0;->f:La/oyg0;

    .line 36
    .line 37
    iget-object v3, v2, La/i3t0;->i:La/ocj;

    .line 38
    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    iget-object v0, v3, La/ocj;->a:La/p7m0;

    .line 42
    .line 43
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-object v9, v3

    .line 51
    check-cast v9, La/gua0;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const/16 v20, 0x0

    .line 57
    .line 58
    const v21, 0x1ffbf

    .line 59
    .line 60
    .line 61
    const/4 v10, 0x0

    .line 62
    const/4 v11, 0x0

    .line 63
    const/4 v12, 0x0

    .line 64
    const/4 v13, 0x0

    .line 65
    const/4 v14, 0x0

    .line 66
    const/4 v15, 0x1

    .line 67
    const/16 v16, 0x0

    .line 68
    .line 69
    const/16 v17, 0x0

    .line 70
    .line 71
    const/16 v18, 0x0

    .line 72
    .line 73
    const/16 v19, 0x0

    .line 74
    .line 75
    invoke-static/range {v9 .. v21}, La/gua0;->a(La/gua0;La/fua0;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/util/List;La/zmb;ZZLa/ghq0;ZLorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZI)La/gua0;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v0, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_2

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    iget-object v0, v3, La/ocj;->a:La/p7m0;

    .line 87
    .line 88
    :cond_4
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-object v9, v3

    .line 96
    check-cast v9, La/gua0;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    const/16 v20, 0x0

    .line 102
    .line 103
    const v21, 0x1ffbf

    .line 104
    .line 105
    .line 106
    const/4 v10, 0x0

    .line 107
    const/4 v11, 0x0

    .line 108
    const/4 v12, 0x0

    .line 109
    const/4 v13, 0x0

    .line 110
    const/4 v14, 0x0

    .line 111
    const/16 v16, 0x0

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const/16 v18, 0x0

    .line 116
    .line 117
    const/16 v19, 0x0

    .line 118
    .line 119
    move/from16 v15, p1

    .line 120
    .line 121
    invoke-static/range {v9 .. v21}, La/gua0;->a(La/gua0;La/fua0;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/util/List;La/zmb;ZZLa/ghq0;ZLorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZI)La/gua0;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-virtual {v0, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_4

    .line 130
    .line 131
    :goto_0
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    new-instance v0, La/wma0;

    .line 136
    .line 137
    const/4 v6, 0x0

    .line 138
    const/4 v7, 0x4

    .line 139
    const/4 v1, 0x1

    .line 140
    const-class v3, La/rua0;

    .line 141
    .line 142
    const-string v4, "onDataLoadingError"

    .line 143
    .line 144
    const-string v5, "onDataLoadingError(Ljava/lang/Throwable;)V"

    .line 145
    .line 146
    invoke-direct/range {v0 .. v7}, La/wma0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 147
    .line 148
    .line 149
    iget-object v1, v2, La/rua0;->y:La/mne;

    .line 150
    .line 151
    iget-object v12, v1, La/mne;->a:La/rwj;

    .line 152
    .line 153
    new-instance v13, La/e3p;

    .line 154
    .line 155
    const/16 v1, 0x1c

    .line 156
    .line 157
    invoke-direct {v13, v2, v8, v1}, La/e3p;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 158
    .line 159
    .line 160
    const/16 v14, 0xa

    .line 161
    .line 162
    const/4 v11, 0x0

    .line 163
    move-object v10, v0

    .line 164
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    iput-object v0, v2, La/rua0;->D:La/bby;

    .line 169
    .line 170
    return-void
.end method

.method public final O(J)V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/gua0;

    .line 6
    .line 7
    invoke-static {v0}, La/r7x;->x(La/gua0;)La/knb;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, La/knb;->a:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v11, 0x0

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    move-object v3, v2

    .line 29
    check-cast v3, La/rbb;

    .line 30
    .line 31
    iget-wide v3, v3, La/rbb;->a:J

    .line 32
    .line 33
    cmp-long v3, v3, p1

    .line 34
    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v2, v11

    .line 39
    :goto_0
    check-cast v2, La/rbb;

    .line 40
    .line 41
    const/4 v12, 0x3

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    iget-object v5, v2, La/rbb;->c:Ljava/lang/String;

    .line 45
    .line 46
    iget-wide v8, v2, La/rbb;->n:J

    .line 47
    .line 48
    iget-wide v3, v2, La/rbb;->b:J

    .line 49
    .line 50
    iget-object v1, v2, La/rbb;->p:Ljava/util/List;

    .line 51
    .line 52
    new-instance v0, La/qua0;

    .line 53
    .line 54
    const/4 v10, 0x0

    .line 55
    move-object v2, p0

    .line 56
    move-wide v6, p1

    .line 57
    invoke-direct/range {v0 .. v10}, La/qua0;-><init>(Ljava/util/List;La/rua0;JLjava/lang/String;JJLa/yje;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v11, v11, v0, v12}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, La/rbb;

    .line 84
    .line 85
    iget-object v3, v3, La/rbb;->d:Ljava/util/List;

    .line 86
    .line 87
    invoke-static {v1, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    move-object v3, v1

    .line 106
    check-cast v3, La/sum0;

    .line 107
    .line 108
    iget-wide v3, v3, La/sum0;->a:J

    .line 109
    .line 110
    cmp-long v3, v3, p1

    .line 111
    .line 112
    if-nez v3, :cond_4

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_5
    move-object v1, v11

    .line 116
    :goto_2
    check-cast v1, La/sum0;

    .line 117
    .line 118
    if-eqz v1, :cond_6

    .line 119
    .line 120
    iget-object v5, v1, La/sum0;->c:Ljava/lang/String;

    .line 121
    .line 122
    iget-wide v8, v1, La/sum0;->l:J

    .line 123
    .line 124
    iget-wide v3, v1, La/sum0;->b:J

    .line 125
    .line 126
    iget-object v1, v1, La/sum0;->m:Ljava/util/List;

    .line 127
    .line 128
    new-instance v0, La/qua0;

    .line 129
    .line 130
    const/4 v10, 0x0

    .line 131
    move-object v2, p0

    .line 132
    move-wide v6, p1

    .line 133
    invoke-direct/range {v0 .. v10}, La/qua0;-><init>(Ljava/util/List;La/rua0;JLjava/lang/String;JJLa/yje;)V

    .line 134
    .line 135
    .line 136
    invoke-static {p0, v11, v11, v0, v12}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 137
    .line 138
    .line 139
    :cond_6
    return-void
.end method

.method public final P(J)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/gua0;

    .line 6
    .line 7
    iget-object v0, v0, La/gua0;->p:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 8
    .line 9
    iget-object v1, v0, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;->b:Ljava/util/Set;

    .line 10
    .line 11
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, v0, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;->b:Ljava/util/Set;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {v2, p1}, La/eui0;->e(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {v0, p1}, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;->a(Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;Ljava/util/Set;)Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/16 v1, 0xa

    .line 41
    .line 42
    if-lt v0, v1, :cond_1

    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {v2, p1}, La/eui0;->h(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance p2, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    invoke-direct {p2, p1, v0}, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;-><init>(Ljava/util/Set;Z)V

    .line 57
    .line 58
    .line 59
    move-object p1, p2

    .line 60
    :goto_0
    new-instance p2, La/lma0;

    .line 61
    .line 62
    const/4 v0, 0x5

    .line 63
    invoke-direct {p2, p1, v0}, La/lma0;-><init>(Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final Q()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/gua0;

    .line 6
    .line 7
    iget-object v0, v0, La/gua0;->n:La/ghq0;

    .line 8
    .line 9
    iget-object v0, v0, La/ghq0;->b:La/wgq0;

    .line 10
    .line 11
    iget-wide v0, v0, La/wgq0;->a:J

    .line 12
    .line 13
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, La/gua0;

    .line 18
    .line 19
    iget-object v2, v2, La/gua0;->n:La/ghq0;

    .line 20
    .line 21
    iget-object v2, v2, La/ghq0;->b:La/wgq0;

    .line 22
    .line 23
    iget-wide v2, v2, La/wgq0;->b:J

    .line 24
    .line 25
    const-wide/16 v4, -0x1

    .line 26
    .line 27
    cmp-long v6, v0, v4

    .line 28
    .line 29
    if-eqz v6, :cond_1

    .line 30
    .line 31
    cmp-long v4, v2, v4

    .line 32
    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v4, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate$Interval;

    .line 37
    .line 38
    new-instance v5, Ljava/util/Date;

    .line 39
    .line 40
    invoke-direct {v5, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 41
    .line 42
    .line 43
    new-instance v0, Ljava/util/Date;

    .line 44
    .line 45
    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v4, v5, v0}, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate$Interval;-><init>(Ljava/util/Date;Ljava/util/Date;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    :goto_0
    new-instance v4, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate$SingleDate;

    .line 53
    .line 54
    new-instance v2, Ljava/util/Date;

    .line 55
    .line 56
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 57
    .line 58
    .line 59
    invoke-direct {v4, v2}, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate$SingleDate;-><init>(Ljava/util/Date;)V

    .line 60
    .line 61
    .line 62
    :goto_1
    new-instance v0, La/zta0;

    .line 63
    .line 64
    invoke-direct {v0, v4}, La/zta0;-><init>(Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 28

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    check-cast v0, La/zqa0;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-super {v2, v0}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, La/vqa0;->a:La/vqa0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v11, 0x3

    .line 20
    const/4 v12, 0x0

    .line 21
    const/4 v3, 0x1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v0, v2, La/rua0;->E:La/bby;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-ne v0, v3, :cond_0

    .line 33
    .line 34
    goto/16 :goto_b

    .line 35
    .line 36
    :cond_0
    new-instance v0, La/epp;

    .line 37
    .line 38
    const/16 v1, 0x1c

    .line 39
    .line 40
    invoke-direct {v0, v2, v12, v1}, La/epp;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v12, v12, v0, v11}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, v2, La/rua0;->E:La/bby;

    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    sget-object v1, La/wqa0;->a:La/wqa0;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    iget-object v0, v2, La/rua0;->E:La/bby;

    .line 59
    .line 60
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, v2, La/rua0;->D:La/bby;

    .line 64
    .line 65
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    sget-object v1, La/oqa0;->a:La/oqa0;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    invoke-virtual {v2, v3}, La/rua0;->N(Z)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    sget-object v1, La/mqa0;->a:La/mqa0;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    const/4 v4, 0x0

    .line 88
    if-eqz v1, :cond_4

    .line 89
    .line 90
    invoke-virtual {v2, v4}, La/rua0;->N(Z)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_4
    sget-object v1, La/pqa0;->a:La/pqa0;

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    iget-object v5, v2, La/i3t0;->f:La/oyg0;

    .line 101
    .line 102
    iget-object v6, v2, La/i3t0;->i:La/ocj;

    .line 103
    .line 104
    if-eqz v1, :cond_6

    .line 105
    .line 106
    iget-object v1, v6, La/ocj;->a:La/p7m0;

    .line 107
    .line 108
    :cond_5
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-object v6, v0

    .line 116
    check-cast v6, La/gua0;

    .line 117
    .line 118
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    const/16 v17, 0x0

    .line 122
    .line 123
    const v18, 0x1feff

    .line 124
    .line 125
    .line 126
    const/4 v7, 0x0

    .line 127
    const/4 v8, 0x0

    .line 128
    const/4 v9, 0x0

    .line 129
    const/4 v10, 0x0

    .line 130
    const/4 v11, 0x0

    .line 131
    const/4 v12, 0x0

    .line 132
    const/4 v13, 0x0

    .line 133
    const/4 v14, 0x0

    .line 134
    const/4 v15, 0x0

    .line 135
    const/16 v16, 0x0

    .line 136
    .line 137
    invoke-static/range {v6 .. v18}, La/gua0;->a(La/gua0;La/fua0;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/util/List;La/zmb;ZZLa/ghq0;ZLorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZI)La/gua0;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_5

    .line 146
    .line 147
    return-void

    .line 148
    :cond_6
    sget-object v1, La/cqa0;->a:La/cqa0;

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    const-string v7, "KEY_SEARCH_QUERY"

    .line 155
    .line 156
    iget-object v8, v2, La/rua0;->v:La/i1w0;

    .line 157
    .line 158
    if-eqz v1, :cond_a

    .line 159
    .line 160
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, La/gua0;

    .line 165
    .line 166
    iget-boolean v0, v0, La/gua0;->k:Z

    .line 167
    .line 168
    if-eqz v0, :cond_8

    .line 169
    .line 170
    iget-object v0, v6, La/ocj;->a:La/p7m0;

    .line 171
    .line 172
    :cond_7
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-object v8, v1

    .line 180
    check-cast v8, La/gua0;

    .line 181
    .line 182
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    const-string v10, ""

    .line 186
    .line 187
    invoke-static {v5, v10, v7}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    const/16 v19, 0x0

    .line 191
    .line 192
    const v20, 0x1fbfb

    .line 193
    .line 194
    .line 195
    const/4 v9, 0x0

    .line 196
    const/4 v11, 0x0

    .line 197
    const/4 v12, 0x0

    .line 198
    const/4 v13, 0x0

    .line 199
    const/4 v14, 0x0

    .line 200
    const/4 v15, 0x0

    .line 201
    const/16 v16, 0x0

    .line 202
    .line 203
    const/16 v17, 0x0

    .line 204
    .line 205
    const/16 v18, 0x0

    .line 206
    .line 207
    invoke-static/range {v8 .. v20}, La/gua0;->a(La/gua0;La/fua0;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/util/List;La/zmb;ZZLa/ghq0;ZLorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZI)La/gua0;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-eqz v1, :cond_7

    .line 216
    .line 217
    return-void

    .line 218
    :cond_8
    iget-object v0, v2, La/rua0;->F:La/c4m0;

    .line 219
    .line 220
    if-eqz v0, :cond_9

    .line 221
    .line 222
    invoke-virtual {v0, v12}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 223
    .line 224
    .line 225
    :cond_9
    iget-object v0, v2, La/rua0;->C:La/lrc;

    .line 226
    .line 227
    invoke-virtual {v0, v3}, La/lrc;->z(Z)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 234
    .line 235
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 236
    .line 237
    .line 238
    new-instance v1, La/c8d;

    .line 239
    .line 240
    sget-object v2, La/y7d;->a:La/v7d;

    .line 241
    .line 242
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 243
    .line 244
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v0, v1, v8, v0, v4}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    :goto_0
    move-object v1, v0

    .line 252
    check-cast v1, La/paw;

    .line 253
    .line 254
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    if-eqz v2, :cond_35

    .line 259
    .line 260
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    check-cast v1, La/oe50;

    .line 265
    .line 266
    invoke-virtual {v8, v1}, La/i1w0;->a(La/oe50;)V

    .line 267
    .line 268
    .line 269
    goto :goto_0

    .line 270
    :cond_a
    sget-object v1, La/gqa0;->a:La/gqa0;

    .line 271
    .line 272
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-eqz v1, :cond_c

    .line 277
    .line 278
    iget-object v1, v6, La/ocj;->a:La/p7m0;

    .line 279
    .line 280
    :cond_b
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    move-object v6, v0

    .line 288
    check-cast v6, La/gua0;

    .line 289
    .line 290
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    const/16 v17, 0x0

    .line 294
    .line 295
    const v18, 0x1fbff

    .line 296
    .line 297
    .line 298
    const/4 v7, 0x0

    .line 299
    const/4 v8, 0x0

    .line 300
    const/4 v9, 0x0

    .line 301
    const/4 v10, 0x0

    .line 302
    const/4 v11, 0x0

    .line 303
    const/4 v12, 0x0

    .line 304
    const/4 v13, 0x1

    .line 305
    const/4 v14, 0x0

    .line 306
    const/4 v15, 0x0

    .line 307
    const/16 v16, 0x0

    .line 308
    .line 309
    invoke-static/range {v6 .. v18}, La/gua0;->a(La/gua0;La/fua0;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/util/List;La/zmb;ZZLa/ghq0;ZLorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZI)La/gua0;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-eqz v0, :cond_b

    .line 318
    .line 319
    return-void

    .line 320
    :cond_c
    instance-of v1, v0, La/kqa0;

    .line 321
    .line 322
    if-eqz v1, :cond_e

    .line 323
    .line 324
    check-cast v0, La/kqa0;

    .line 325
    .line 326
    iget-object v10, v0, La/kqa0;->a:Ljava/lang/String;

    .line 327
    .line 328
    iget-object v1, v6, La/ocj;->a:La/p7m0;

    .line 329
    .line 330
    :cond_d
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    move-object v8, v0

    .line 338
    check-cast v8, La/gua0;

    .line 339
    .line 340
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    invoke-static {v5, v10, v7}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    const/16 v19, 0x0

    .line 347
    .line 348
    const v20, 0x1fffb

    .line 349
    .line 350
    .line 351
    const/4 v9, 0x0

    .line 352
    const/4 v11, 0x0

    .line 353
    const/4 v12, 0x0

    .line 354
    const/4 v13, 0x0

    .line 355
    const/4 v14, 0x0

    .line 356
    const/4 v15, 0x0

    .line 357
    const/16 v16, 0x0

    .line 358
    .line 359
    const/16 v17, 0x0

    .line 360
    .line 361
    const/16 v18, 0x0

    .line 362
    .line 363
    invoke-static/range {v8 .. v20}, La/gua0;->a(La/gua0;La/fua0;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/util/List;La/zmb;ZZLa/ghq0;ZLorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZI)La/gua0;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    if-eqz v0, :cond_d

    .line 372
    .line 373
    return-void

    .line 374
    :cond_e
    sget-object v1, La/hqa0;->a:La/hqa0;

    .line 375
    .line 376
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    if-eqz v1, :cond_13

    .line 381
    .line 382
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    check-cast v0, La/gua0;

    .line 387
    .line 388
    iget-object v0, v0, La/gua0;->f:La/zmb;

    .line 389
    .line 390
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-eqz v0, :cond_10

    .line 395
    .line 396
    if-ne v0, v3, :cond_f

    .line 397
    .line 398
    sget-object v0, La/zmb;->a:La/zmb;

    .line 399
    .line 400
    goto :goto_1

    .line 401
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 402
    .line 403
    .line 404
    return-void

    .line 405
    :cond_10
    sget-object v0, La/zmb;->b:La/zmb;

    .line 406
    .line 407
    :goto_1
    iget-object v1, v6, La/ocj;->a:La/p7m0;

    .line 408
    .line 409
    :goto_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    move-object v13, v4

    .line 417
    check-cast v13, La/gua0;

    .line 418
    .line 419
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    const-string v6, "KEY_CHAMP_SORT_TYPE"

    .line 423
    .line 424
    invoke-static {v5, v0, v6}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    const/16 v24, 0x0

    .line 428
    .line 429
    const v25, 0x1ffdf

    .line 430
    .line 431
    .line 432
    const/4 v14, 0x0

    .line 433
    const/4 v15, 0x0

    .line 434
    const/16 v16, 0x0

    .line 435
    .line 436
    const/16 v17, 0x0

    .line 437
    .line 438
    const/16 v19, 0x0

    .line 439
    .line 440
    const/16 v20, 0x0

    .line 441
    .line 442
    const/16 v21, 0x0

    .line 443
    .line 444
    const/16 v22, 0x0

    .line 445
    .line 446
    const/16 v23, 0x0

    .line 447
    .line 448
    move-object/from16 v18, v0

    .line 449
    .line 450
    invoke-static/range {v13 .. v25}, La/gua0;->a(La/gua0;La/fua0;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/util/List;La/zmb;ZZLa/ghq0;ZLorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZI)La/gua0;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    invoke-virtual {v1, v4, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    if-eqz v0, :cond_12

    .line 459
    .line 460
    iget-object v0, v2, La/rua0;->D:La/bby;

    .line 461
    .line 462
    if-eqz v0, :cond_11

    .line 463
    .line 464
    invoke-interface {v0, v12}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 465
    .line 466
    .line 467
    :cond_11
    invoke-virtual {v2, v3}, La/rua0;->N(Z)V

    .line 468
    .line 469
    .line 470
    return-void

    .line 471
    :cond_12
    move-object/from16 v0, v18

    .line 472
    .line 473
    goto :goto_2

    .line 474
    :cond_13
    sget-object v1, La/fqa0;->a:La/fqa0;

    .line 475
    .line 476
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    if-eqz v1, :cond_14

    .line 481
    .line 482
    new-instance v0, La/aua0;

    .line 483
    .line 484
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    check-cast v1, La/gua0;

    .line 489
    .line 490
    iget-object v1, v1, La/gua0;->n:La/ghq0;

    .line 491
    .line 492
    sget-object v3, La/jhq0;->a:La/jhq0;

    .line 493
    .line 494
    invoke-direct {v0, v1}, La/aua0;-><init>(La/ghq0;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    return-void

    .line 501
    :cond_14
    sget-object v1, La/nqa0;->a:La/nqa0;

    .line 502
    .line 503
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v1

    .line 507
    if-eqz v1, :cond_15

    .line 508
    .line 509
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    check-cast v0, La/gua0;

    .line 514
    .line 515
    iget-boolean v0, v0, La/gua0;->l:Z

    .line 516
    .line 517
    if-eqz v0, :cond_35

    .line 518
    .line 519
    invoke-virtual {v2}, La/rua0;->Q()V

    .line 520
    .line 521
    .line 522
    return-void

    .line 523
    :cond_15
    instance-of v1, v0, La/iqa0;

    .line 524
    .line 525
    const/4 v7, 0x6

    .line 526
    iget-object v9, v2, La/rua0;->z:La/lef0;

    .line 527
    .line 528
    if-eqz v1, :cond_18

    .line 529
    .line 530
    check-cast v0, La/iqa0;

    .line 531
    .line 532
    iget-object v0, v0, La/iqa0;->a:La/chq0;

    .line 533
    .line 534
    instance-of v1, v0, La/ahq0;

    .line 535
    .line 536
    if-eqz v1, :cond_16

    .line 537
    .line 538
    sget-object v1, La/ygq0;->b:La/j6m0;

    .line 539
    .line 540
    check-cast v0, La/ahq0;

    .line 541
    .line 542
    iget-byte v0, v0, La/ahq0;->a:B

    .line 543
    .line 544
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    invoke-static {v0}, La/j6m0;->a(I)La/ygq0;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    invoke-virtual {v9, v0, v4}, La/lef0;->i(La/ygq0;Z)V

    .line 552
    .line 553
    .line 554
    new-instance v1, La/lma0;

    .line 555
    .line 556
    invoke-direct {v1, v0, v7}, La/lma0;-><init>(Ljava/lang/Object;B)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v2, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 560
    .line 561
    .line 562
    return-void

    .line 563
    :cond_16
    instance-of v0, v0, La/bhq0;

    .line 564
    .line 565
    if-eqz v0, :cond_17

    .line 566
    .line 567
    invoke-virtual {v2}, La/rua0;->Q()V

    .line 568
    .line 569
    .line 570
    return-void

    .line 571
    :cond_17
    invoke-static {}, La/t9f;->b()V

    .line 572
    .line 573
    .line 574
    return-void

    .line 575
    :cond_18
    instance-of v1, v0, La/uqa0;

    .line 576
    .line 577
    if-eqz v1, :cond_19

    .line 578
    .line 579
    check-cast v0, La/uqa0;

    .line 580
    .line 581
    iget-object v0, v0, La/uqa0;->a:La/ygq0;

    .line 582
    .line 583
    invoke-virtual {v9, v0, v4}, La/lef0;->i(La/ygq0;Z)V

    .line 584
    .line 585
    .line 586
    new-instance v1, La/lma0;

    .line 587
    .line 588
    invoke-direct {v1, v0, v7}, La/lma0;-><init>(Ljava/lang/Object;B)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v2, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 592
    .line 593
    .line 594
    return-void

    .line 595
    :cond_19
    instance-of v1, v0, La/tqa0;

    .line 596
    .line 597
    if-eqz v1, :cond_1a

    .line 598
    .line 599
    check-cast v0, La/tqa0;

    .line 600
    .line 601
    iget-object v0, v0, La/tqa0;->a:Ljava/util/Date;

    .line 602
    .line 603
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 604
    .line 605
    .line 606
    move-result-wide v5

    .line 607
    iget-object v1, v2, La/rua0;->A:La/pmi0;

    .line 608
    .line 609
    invoke-virtual {v1, v5, v6}, La/pmi0;->j(J)V

    .line 610
    .line 611
    .line 612
    new-instance v1, La/oua0;

    .line 613
    .line 614
    invoke-direct {v1, v0, v5, v6, v4}, La/oua0;-><init>(Ljava/util/Date;JB)V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v2, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 618
    .line 619
    .line 620
    return-void

    .line 621
    :cond_1a
    instance-of v1, v0, La/sqa0;

    .line 622
    .line 623
    if-eqz v1, :cond_1b

    .line 624
    .line 625
    check-cast v0, La/sqa0;

    .line 626
    .line 627
    iget-object v0, v0, La/sqa0;->a:Ljava/util/Date;

    .line 628
    .line 629
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 630
    .line 631
    .line 632
    move-result-wide v5

    .line 633
    iget-object v1, v2, La/rua0;->B:La/dxt;

    .line 634
    .line 635
    invoke-virtual {v1, v5, v6}, La/dxt;->a(J)V

    .line 636
    .line 637
    .line 638
    new-instance v1, La/oua0;

    .line 639
    .line 640
    invoke-direct {v1, v0, v5, v6, v3}, La/oua0;-><init>(Ljava/util/Date;JB)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v2, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    check-cast v0, La/gua0;

    .line 651
    .line 652
    iget-boolean v0, v0, La/gua0;->l:Z

    .line 653
    .line 654
    if-eqz v0, :cond_35

    .line 655
    .line 656
    sget-object v0, La/ygq0;->p:La/ygq0;

    .line 657
    .line 658
    invoke-virtual {v9, v0, v4}, La/lef0;->i(La/ygq0;Z)V

    .line 659
    .line 660
    .line 661
    new-instance v1, La/lma0;

    .line 662
    .line 663
    invoke-direct {v1, v0, v7}, La/lma0;-><init>(Ljava/lang/Object;B)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {v2, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 667
    .line 668
    .line 669
    return-void

    .line 670
    :cond_1b
    instance-of v1, v0, La/aqa0;

    .line 671
    .line 672
    if-eqz v1, :cond_1e

    .line 673
    .line 674
    check-cast v0, La/aqa0;

    .line 675
    .line 676
    iget-wide v3, v0, La/aqa0;->a:J

    .line 677
    .line 678
    iget-wide v0, v0, La/aqa0;->b:J

    .line 679
    .line 680
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v7

    .line 684
    check-cast v7, La/gua0;

    .line 685
    .line 686
    iget-object v7, v7, La/gua0;->f:La/zmb;

    .line 687
    .line 688
    invoke-static {v7, v3, v4, v0, v1}, La/f7k;->K(La/zmb;JJ)Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    check-cast v1, La/gua0;

    .line 697
    .line 698
    iget-object v1, v1, La/gua0;->d:Ljava/util/Set;

    .line 699
    .line 700
    check-cast v1, Ljava/lang/Iterable;

    .line 701
    .line 702
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 703
    .line 704
    .line 705
    move-result-object v10

    .line 706
    invoke-interface {v10, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 707
    .line 708
    .line 709
    move-result v1

    .line 710
    if-nez v1, :cond_1c

    .line 711
    .line 712
    invoke-interface {v10, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    :cond_1c
    iget-object v1, v6, La/ocj;->a:La/p7m0;

    .line 716
    .line 717
    :cond_1d
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    move-object v7, v0

    .line 725
    check-cast v7, La/gua0;

    .line 726
    .line 727
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 728
    .line 729
    .line 730
    const-string v2, "EXPANDED_STATE_KEY"

    .line 731
    .line 732
    invoke-static {v5, v10, v2}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    const/16 v18, 0x0

    .line 736
    .line 737
    const v19, 0x1fff7

    .line 738
    .line 739
    .line 740
    const/4 v8, 0x0

    .line 741
    const/4 v9, 0x0

    .line 742
    const/4 v11, 0x0

    .line 743
    const/4 v12, 0x0

    .line 744
    const/4 v13, 0x0

    .line 745
    const/4 v14, 0x0

    .line 746
    const/4 v15, 0x0

    .line 747
    const/16 v16, 0x0

    .line 748
    .line 749
    const/16 v17, 0x0

    .line 750
    .line 751
    invoke-static/range {v7 .. v19}, La/gua0;->a(La/gua0;La/fua0;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/util/List;La/zmb;ZZLa/ghq0;ZLorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZI)La/gua0;

    .line 752
    .line 753
    .line 754
    move-result-object v2

    .line 755
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 756
    .line 757
    .line 758
    move-result v0

    .line 759
    if-eqz v0, :cond_1d

    .line 760
    .line 761
    return-void

    .line 762
    :cond_1e
    instance-of v1, v0, La/bqa0;

    .line 763
    .line 764
    if-eqz v1, :cond_1f

    .line 765
    .line 766
    check-cast v0, La/bqa0;

    .line 767
    .line 768
    iget-wide v0, v0, La/bqa0;->a:J

    .line 769
    .line 770
    invoke-virtual {v2, v0, v1}, La/rua0;->O(J)V

    .line 771
    .line 772
    .line 773
    return-void

    .line 774
    :cond_1f
    instance-of v1, v0, La/xqa0;

    .line 775
    .line 776
    if-eqz v1, :cond_26

    .line 777
    .line 778
    check-cast v0, La/xqa0;

    .line 779
    .line 780
    iget-wide v6, v0, La/xqa0;->a:J

    .line 781
    .line 782
    iget-wide v8, v0, La/xqa0;->b:J

    .line 783
    .line 784
    iget-object v0, v0, La/xqa0;->d:Ljava/lang/String;

    .line 785
    .line 786
    const-wide/16 v3, -0x2

    .line 787
    .line 788
    cmp-long v1, v6, v3

    .line 789
    .line 790
    if-nez v1, :cond_20

    .line 791
    .line 792
    goto/16 :goto_b

    .line 793
    .line 794
    :cond_20
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v1

    .line 798
    check-cast v1, La/gua0;

    .line 799
    .line 800
    invoke-static {v1}, La/r7x;->x(La/gua0;)La/knb;

    .line 801
    .line 802
    .line 803
    move-result-object v1

    .line 804
    iget-object v1, v1, La/knb;->a:Ljava/util/List;

    .line 805
    .line 806
    new-instance v3, Ljava/util/ArrayList;

    .line 807
    .line 808
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 809
    .line 810
    .line 811
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 812
    .line 813
    .line 814
    move-result-object v1

    .line 815
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 816
    .line 817
    .line 818
    move-result v4

    .line 819
    if-eqz v4, :cond_21

    .line 820
    .line 821
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v4

    .line 825
    check-cast v4, La/rbb;

    .line 826
    .line 827
    iget-object v4, v4, La/rbb;->d:Ljava/util/List;

    .line 828
    .line 829
    invoke-static {v3, v4}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 830
    .line 831
    .line 832
    goto :goto_3

    .line 833
    :cond_21
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 834
    .line 835
    .line 836
    move-result-object v1

    .line 837
    :cond_22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 838
    .line 839
    .line 840
    move-result v3

    .line 841
    if-eqz v3, :cond_23

    .line 842
    .line 843
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v3

    .line 847
    move-object v4, v3

    .line 848
    check-cast v4, La/sum0;

    .line 849
    .line 850
    iget-wide v4, v4, La/sum0;->a:J

    .line 851
    .line 852
    cmp-long v4, v4, v6

    .line 853
    .line 854
    if-nez v4, :cond_22

    .line 855
    .line 856
    goto :goto_4

    .line 857
    :cond_23
    move-object v3, v12

    .line 858
    :goto_4
    check-cast v3, La/sum0;

    .line 859
    .line 860
    if-eqz v3, :cond_25

    .line 861
    .line 862
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 863
    .line 864
    .line 865
    move-result v1

    .line 866
    if-nez v1, :cond_24

    .line 867
    .line 868
    iget-object v0, v3, La/sum0;->c:Ljava/lang/String;

    .line 869
    .line 870
    :cond_24
    move-object v5, v0

    .line 871
    iget-wide v0, v3, La/sum0;->b:J

    .line 872
    .line 873
    iget-object v3, v3, La/sum0;->m:Ljava/util/List;

    .line 874
    .line 875
    move-wide/from16 v26, v0

    .line 876
    .line 877
    move-object v1, v3

    .line 878
    move-wide/from16 v3, v26

    .line 879
    .line 880
    new-instance v0, La/qua0;

    .line 881
    .line 882
    const/4 v10, 0x0

    .line 883
    invoke-direct/range {v0 .. v10}, La/qua0;-><init>(Ljava/util/List;La/rua0;JLjava/lang/String;JJLa/yje;)V

    .line 884
    .line 885
    .line 886
    invoke-static {v2, v12, v12, v0, v11}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 887
    .line 888
    .line 889
    return-void

    .line 890
    :cond_25
    invoke-virtual {v2, v6, v7}, La/rua0;->O(J)V

    .line 891
    .line 892
    .line 893
    return-void

    .line 894
    :cond_26
    instance-of v1, v0, La/zpa0;

    .line 895
    .line 896
    if-eqz v1, :cond_27

    .line 897
    .line 898
    check-cast v0, La/zpa0;

    .line 899
    .line 900
    iget-object v1, v0, La/zpa0;->a:La/npn;

    .line 901
    .line 902
    iget-boolean v0, v0, La/zpa0;->b:Z

    .line 903
    .line 904
    new-instance v3, La/r91;

    .line 905
    .line 906
    const/16 v4, 0x19

    .line 907
    .line 908
    invoke-direct {v3, v2, v0, v1, v4}, La/r91;-><init>(Ljava/lang/Object;ZLjava/lang/Object;B)V

    .line 909
    .line 910
    .line 911
    invoke-virtual {v8, v3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 912
    .line 913
    .line 914
    return-void

    .line 915
    :cond_27
    instance-of v1, v0, La/jqa0;

    .line 916
    .line 917
    const/16 v5, 0xa

    .line 918
    .line 919
    if-eqz v1, :cond_2e

    .line 920
    .line 921
    check-cast v0, La/jqa0;

    .line 922
    .line 923
    iget-wide v0, v0, La/jqa0;->a:J

    .line 924
    .line 925
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    move-result-object v4

    .line 929
    check-cast v4, La/gua0;

    .line 930
    .line 931
    iget-boolean v4, v4, La/gua0;->q:Z

    .line 932
    .line 933
    if-nez v4, :cond_2d

    .line 934
    .line 935
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 936
    .line 937
    .line 938
    move-result-object v4

    .line 939
    check-cast v4, La/gua0;

    .line 940
    .line 941
    invoke-static {v4}, La/r7x;->x(La/gua0;)La/knb;

    .line 942
    .line 943
    .line 944
    move-result-object v4

    .line 945
    iget-object v4, v4, La/knb;->a:Ljava/util/List;

    .line 946
    .line 947
    new-instance v6, Ljava/util/ArrayList;

    .line 948
    .line 949
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 950
    .line 951
    .line 952
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 953
    .line 954
    .line 955
    move-result-object v4

    .line 956
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 957
    .line 958
    .line 959
    move-result v7

    .line 960
    if-eqz v7, :cond_2a

    .line 961
    .line 962
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 963
    .line 964
    .line 965
    move-result-object v7

    .line 966
    check-cast v7, La/rbb;

    .line 967
    .line 968
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 969
    .line 970
    .line 971
    move-result-object v8

    .line 972
    iget-object v9, v7, La/rbb;->d:Ljava/util/List;

    .line 973
    .line 974
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 975
    .line 976
    .line 977
    move-result v9

    .line 978
    if-eqz v9, :cond_28

    .line 979
    .line 980
    iget-wide v9, v7, La/rbb;->a:J

    .line 981
    .line 982
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 983
    .line 984
    .line 985
    move-result-object v9

    .line 986
    invoke-virtual {v8, v9}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 987
    .line 988
    .line 989
    :cond_28
    iget-object v7, v7, La/rbb;->d:Ljava/util/List;

    .line 990
    .line 991
    new-instance v9, Ljava/util/ArrayList;

    .line 992
    .line 993
    invoke-static {v7, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 994
    .line 995
    .line 996
    move-result v10

    .line 997
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 998
    .line 999
    .line 1000
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v7

    .line 1004
    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1005
    .line 1006
    .line 1007
    move-result v10

    .line 1008
    if-eqz v10, :cond_29

    .line 1009
    .line 1010
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v10

    .line 1014
    check-cast v10, La/sum0;

    .line 1015
    .line 1016
    iget-wide v10, v10, La/sum0;->a:J

    .line 1017
    .line 1018
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v10

    .line 1022
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1023
    .line 1024
    .line 1025
    goto :goto_6

    .line 1026
    :cond_29
    invoke-virtual {v8, v9}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1027
    .line 1028
    .line 1029
    invoke-static {v8}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v7

    .line 1033
    invoke-static {v6, v7}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1034
    .line 1035
    .line 1036
    goto :goto_5

    .line 1037
    :cond_2a
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1038
    .line 1039
    .line 1040
    move-result v4

    .line 1041
    if-eqz v4, :cond_2b

    .line 1042
    .line 1043
    goto :goto_7

    .line 1044
    :cond_2b
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v4

    .line 1048
    :cond_2c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1049
    .line 1050
    .line 1051
    move-result v5

    .line 1052
    if-eqz v5, :cond_2d

    .line 1053
    .line 1054
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v5

    .line 1058
    check-cast v5, Ljava/lang/Number;

    .line 1059
    .line 1060
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 1061
    .line 1062
    .line 1063
    move-result-wide v5

    .line 1064
    cmp-long v5, v5, v0

    .line 1065
    .line 1066
    if-nez v5, :cond_2c

    .line 1067
    .line 1068
    invoke-virtual {v2, v0, v1}, La/rua0;->P(J)V

    .line 1069
    .line 1070
    .line 1071
    :cond_2d
    :goto_7
    invoke-virtual {v2, v3}, La/rua0;->M(Z)V

    .line 1072
    .line 1073
    .line 1074
    return-void

    .line 1075
    :cond_2e
    instance-of v1, v0, La/rqa0;

    .line 1076
    .line 1077
    if-eqz v1, :cond_2f

    .line 1078
    .line 1079
    check-cast v0, La/rqa0;

    .line 1080
    .line 1081
    iget-wide v0, v0, La/rqa0;->a:J

    .line 1082
    .line 1083
    invoke-virtual {v2, v0, v1}, La/rua0;->P(J)V

    .line 1084
    .line 1085
    .line 1086
    return-void

    .line 1087
    :cond_2f
    sget-object v1, La/qqa0;->a:La/qqa0;

    .line 1088
    .line 1089
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1090
    .line 1091
    .line 1092
    move-result v1

    .line 1093
    if-eqz v1, :cond_36

    .line 1094
    .line 1095
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v0

    .line 1099
    check-cast v0, La/gua0;

    .line 1100
    .line 1101
    invoke-static {v0}, La/r7x;->x(La/gua0;)La/knb;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    iget-object v0, v0, La/knb;->a:Ljava/util/List;

    .line 1106
    .line 1107
    new-instance v1, Ljava/util/ArrayList;

    .line 1108
    .line 1109
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1110
    .line 1111
    .line 1112
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v0

    .line 1116
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1117
    .line 1118
    .line 1119
    move-result v4

    .line 1120
    if-eqz v4, :cond_31

    .line 1121
    .line 1122
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v4

    .line 1126
    check-cast v4, La/rbb;

    .line 1127
    .line 1128
    iget-wide v6, v4, La/rbb;->a:J

    .line 1129
    .line 1130
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v6

    .line 1134
    invoke-static {v6}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v6

    .line 1138
    iget-object v4, v4, La/rbb;->d:Ljava/util/List;

    .line 1139
    .line 1140
    new-instance v7, Ljava/util/ArrayList;

    .line 1141
    .line 1142
    invoke-static {v4, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1143
    .line 1144
    .line 1145
    move-result v9

    .line 1146
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 1147
    .line 1148
    .line 1149
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v4

    .line 1153
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1154
    .line 1155
    .line 1156
    move-result v9

    .line 1157
    if-eqz v9, :cond_30

    .line 1158
    .line 1159
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v9

    .line 1163
    check-cast v9, La/sum0;

    .line 1164
    .line 1165
    iget-wide v9, v9, La/sum0;->a:J

    .line 1166
    .line 1167
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v9

    .line 1171
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1172
    .line 1173
    .line 1174
    goto :goto_9

    .line 1175
    :cond_30
    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v4

    .line 1179
    invoke-static {v1, v4}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1180
    .line 1181
    .line 1182
    goto :goto_8

    .line 1183
    :cond_31
    new-instance v0, Ljava/util/ArrayList;

    .line 1184
    .line 1185
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1186
    .line 1187
    .line 1188
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v1

    .line 1192
    :cond_32
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1193
    .line 1194
    .line 1195
    move-result v4

    .line 1196
    if-eqz v4, :cond_33

    .line 1197
    .line 1198
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v4

    .line 1202
    move-object v5, v4

    .line 1203
    check-cast v5, Ljava/lang/Number;

    .line 1204
    .line 1205
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 1206
    .line 1207
    .line 1208
    move-result-wide v5

    .line 1209
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v7

    .line 1213
    check-cast v7, La/gua0;

    .line 1214
    .line 1215
    iget-object v7, v7, La/gua0;->p:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 1216
    .line 1217
    iget-object v7, v7, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;->b:Ljava/util/Set;

    .line 1218
    .line 1219
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v5

    .line 1223
    invoke-interface {v7, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1224
    .line 1225
    .line 1226
    move-result v5

    .line 1227
    if-eqz v5, :cond_32

    .line 1228
    .line 1229
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1230
    .line 1231
    .line 1232
    goto :goto_a

    .line 1233
    :cond_33
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1234
    .line 1235
    .line 1236
    move-result v1

    .line 1237
    if-le v1, v3, :cond_34

    .line 1238
    .line 1239
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v0

    .line 1243
    new-instance v1, La/zga0;

    .line 1244
    .line 1245
    const/4 v3, 0x7

    .line 1246
    invoke-direct {v1, v2, v0, v3}, La/zga0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v8, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 1250
    .line 1251
    .line 1252
    return-void

    .line 1253
    :cond_34
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v0

    .line 1257
    check-cast v0, Ljava/lang/Long;

    .line 1258
    .line 1259
    if-eqz v0, :cond_35

    .line 1260
    .line 1261
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 1262
    .line 1263
    .line 1264
    move-result-wide v0

    .line 1265
    invoke-virtual {v2, v0, v1}, La/rua0;->O(J)V

    .line 1266
    .line 1267
    .line 1268
    :cond_35
    :goto_b
    return-void

    .line 1269
    :cond_36
    sget-object v1, La/eqa0;->a:La/eqa0;

    .line 1270
    .line 1271
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1272
    .line 1273
    .line 1274
    move-result v1

    .line 1275
    if-eqz v1, :cond_37

    .line 1276
    .line 1277
    invoke-virtual {v2, v4}, La/rua0;->M(Z)V

    .line 1278
    .line 1279
    .line 1280
    return-void

    .line 1281
    :cond_37
    sget-object v1, La/ypa0;->a:La/ypa0;

    .line 1282
    .line 1283
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1284
    .line 1285
    .line 1286
    move-result v0

    .line 1287
    if-eqz v0, :cond_38

    .line 1288
    .line 1289
    invoke-virtual {v2}, La/i3t0;->E()V

    .line 1290
    .line 1291
    .line 1292
    return-void

    .line 1293
    :cond_38
    invoke-static {}, La/t9f;->b()V

    .line 1294
    .line 1295
    .line 1296
    return-void
.end method
