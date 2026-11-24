.class public final La/aog0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic G:I


# instance fields
.field public final A:La/mne;

.field public final B:La/grj;

.field public final C:La/i1w0;

.field public D:La/c4m0;

.field public E:La/bby;

.field public F:La/bby;

.field public final o:La/tlg0;

.field public final p:La/nv20;

.field public final q:La/tzi;

.field public final r:La/m1e;

.field public final s:La/duj;

.field public final t:La/u58;

.field public final u:La/ag3;

.field public final v:La/gg5;

.field public final w:La/au0;

.field public final x:La/ih5;

.field public final y:La/l7k;

.field public final z:La/cmt;


# direct methods
.method public constructor <init>(La/tlg0;La/nv20;La/tzi;La/m1e;La/duj;La/u58;La/ag3;La/gg5;La/au0;La/ih5;La/l7k;La/cmt;La/mne;La/ctf0;La/grj;La/bzt;La/i1w0;)V
    .locals 7

    .line 1
    move-object/from16 v0, p13

    .line 2
    .line 3
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p14 .. p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v3, La/gvb0;

    .line 10
    .line 11
    const/16 v1, 0x1d

    .line 12
    .line 13
    move-object/from16 v2, p16

    .line 14
    .line 15
    invoke-direct {v3, p1, v2, v1}, La/gvb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    new-instance v4, La/iv80;

    .line 19
    .line 20
    const/16 v1, 0x1a

    .line 21
    .line 22
    move-object/from16 v2, p14

    .line 23
    .line 24
    invoke-direct {v4, v2, v1}, La/iv80;-><init>(La/ctf0;B)V

    .line 25
    .line 26
    .line 27
    iget-object v1, v0, La/mne;->a:La/rwj;

    .line 28
    .line 29
    invoke-static {v1, v1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v2, 0x0

    .line 35
    move-object v1, p0

    .line 36
    invoke-direct/range {v1 .. v6}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, La/aog0;->o:La/tlg0;

    .line 40
    .line 41
    iput-object p2, p0, La/aog0;->p:La/nv20;

    .line 42
    .line 43
    iput-object p3, p0, La/aog0;->q:La/tzi;

    .line 44
    .line 45
    iput-object p4, p0, La/aog0;->r:La/m1e;

    .line 46
    .line 47
    iput-object p5, p0, La/aog0;->s:La/duj;

    .line 48
    .line 49
    iput-object p6, p0, La/aog0;->t:La/u58;

    .line 50
    .line 51
    iput-object p7, p0, La/aog0;->u:La/ag3;

    .line 52
    .line 53
    iput-object p8, p0, La/aog0;->v:La/gg5;

    .line 54
    .line 55
    move-object/from16 p2, p9

    .line 56
    .line 57
    iput-object p2, p0, La/aog0;->w:La/au0;

    .line 58
    .line 59
    move-object/from16 p2, p10

    .line 60
    .line 61
    iput-object p2, p0, La/aog0;->x:La/ih5;

    .line 62
    .line 63
    move-object/from16 p2, p11

    .line 64
    .line 65
    iput-object p2, p0, La/aog0;->y:La/l7k;

    .line 66
    .line 67
    move-object/from16 p2, p12

    .line 68
    .line 69
    iput-object p2, p0, La/aog0;->z:La/cmt;

    .line 70
    .line 71
    iput-object v0, p0, La/aog0;->A:La/mne;

    .line 72
    .line 73
    move-object/from16 p2, p15

    .line 74
    .line 75
    iput-object p2, p0, La/aog0;->B:La/grj;

    .line 76
    .line 77
    move-object/from16 p2, p17

    .line 78
    .line 79
    iput-object p2, p0, La/aog0;->C:La/i1w0;

    .line 80
    .line 81
    iget-object p1, p1, La/tlg0;->a:Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 82
    .line 83
    iget-object p2, p1, Lorg/xplatform/rules/api/presentation/models/RuleData;->b:Ljava/util/Map;

    .line 84
    .line 85
    const-string p3, "TITLE_KEY"

    .line 86
    .line 87
    invoke-interface {p2, p3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    if-eqz p2, :cond_0

    .line 92
    .line 93
    iget-object p1, p1, Lorg/xplatform/rules/api/presentation/models/RuleData;->b:Ljava/util/Map;

    .line 94
    .line 95
    const-string p2, "DESCRIPTION_KEY"

    .line 96
    .line 97
    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_0

    .line 102
    .line 103
    new-instance p1, La/dke0;

    .line 104
    .line 105
    const/16 p2, 0x18

    .line 106
    .line 107
    invoke-direct {p1, p0, p2}, La/dke0;-><init>(Ljava/lang/Object;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_0
    invoke-virtual {p0}, La/aog0;->M()V

    .line 115
    .line 116
    .line 117
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 15

    .line 1
    iget-object v0, p0, La/aog0;->E:La/bby;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, La/aog0;->o:La/tlg0;

    .line 14
    .line 15
    iget-boolean v0, v0, La/tlg0;->b:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    sget-object v0, La/bm5;->d:La/bm5;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    sget-object v0, La/bm5;->a:La/bm5;

    .line 23
    .line 24
    :goto_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v3, p0, La/aog0;->A:La/mne;

    .line 29
    .line 30
    iget-object v11, v3, La/mne;->b:La/dvj;

    .line 31
    .line 32
    const-class v3, La/kcy;

    .line 33
    .line 34
    const-class v4, La/ff5;

    .line 35
    .line 36
    filled-new-array {v3, v4}, [Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    sget-object v3, La/i2o;->i1:La/i2o;

    .line 45
    .line 46
    invoke-virtual {v3}, La/i2o;->getErrorCode()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    sget-object v4, La/i2o;->j1:La/i2o;

    .line 55
    .line 56
    invoke-virtual {v4}, La/i2o;->getErrorCode()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    sget-object v5, La/i2o;->k1:La/i2o;

    .line 65
    .line 66
    invoke-virtual {v5}, La/i2o;->getErrorCode()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    sget-object v6, La/i2o;->l1:La/i2o;

    .line 75
    .line 76
    invoke-virtual {v6}, La/i2o;->getErrorCode()I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    sget-object v8, La/i2o;->E2:La/i2o;

    .line 85
    .line 86
    invoke-virtual {v8}, La/i2o;->getErrorCode()I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    filled-new-array {v3, v4, v5, v6, v8}, [Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    new-instance v9, La/k6d0;

    .line 103
    .line 104
    const/4 v3, 0x0

    .line 105
    const/16 v4, 0x19

    .line 106
    .line 107
    invoke-direct {v9, p0, v0, v3, v4}, La/k6d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 108
    .line 109
    .line 110
    new-instance v12, La/vng0;

    .line 111
    .line 112
    invoke-direct {v12, p0, v1}, La/vng0;-><init>(La/aog0;B)V

    .line 113
    .line 114
    .line 115
    const/4 v13, 0x0

    .line 116
    const/16 v14, 0x244

    .line 117
    .line 118
    const-string v3, "RulesViewModel_getRules()"

    .line 119
    .line 120
    const/4 v4, 0x3

    .line 121
    const-wide/16 v5, 0x0

    .line 122
    .line 123
    const/4 v10, 0x0

    .line 124
    invoke-static/range {v2 .. v14}, La/sac;->i0(La/vne;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)La/bby;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iput-object v0, p0, La/aog0;->E:La/bby;

    .line 129
    .line 130
    return-void
.end method

.method public final N(La/bm5;La/zje;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, La/xng0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/xng0;

    .line 11
    .line 12
    iget v3, v2, La/xng0;->l:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/xng0;->l:I

    .line 22
    .line 23
    :goto_0
    move-object v8, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, La/xng0;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, La/xng0;-><init>(La/aog0;La/zje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v8, La/xng0;->j:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v2, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v3, v8, La/xng0;->l:I

    .line 36
    .line 37
    const/4 v10, 0x0

    .line 38
    const/4 v11, 0x1

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    if-ne v3, v11, :cond_1

    .line 42
    .line 43
    iget-object v0, v8, La/xng0;->i:La/aog0;

    .line 44
    .line 45
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v10

    .line 55
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, v0, La/aog0;->o:La/tlg0;

    .line 59
    .line 60
    iget-object v1, v1, La/tlg0;->a:Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 61
    .line 62
    iget-object v4, v1, Lorg/xplatform/rules/api/presentation/models/RuleData;->a:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v5, v1, Lorg/xplatform/rules/api/presentation/models/RuleData;->b:Ljava/util/Map;

    .line 65
    .line 66
    iget-object v6, v1, Lorg/xplatform/rules/api/presentation/models/RuleData;->c:Ljava/lang/String;

    .line 67
    .line 68
    iput-object v0, v8, La/xng0;->i:La/aog0;

    .line 69
    .line 70
    iput v11, v8, La/xng0;->l:I

    .line 71
    .line 72
    iget-object v3, v0, La/aog0;->q:La/tzi;

    .line 73
    .line 74
    const/16 v9, 0x28

    .line 75
    .line 76
    move-object/from16 v7, p1

    .line 77
    .line 78
    invoke-static/range {v3 .. v9}, La/tzi;->r(La/tzi;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;La/bm5;La/zje;I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-ne v1, v2, :cond_3

    .line 83
    .line 84
    return-object v2

    .line 85
    :cond_3
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 86
    .line 87
    iget-object v0, v0, La/aog0;->o:La/tlg0;

    .line 88
    .line 89
    iget-object v0, v0, La/tlg0;->a:Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 90
    .line 91
    iget-object v2, v0, Lorg/xplatform/rules/api/presentation/models/RuleData;->b:Ljava/util/Map;

    .line 92
    .line 93
    iget-object v3, v0, Lorg/xplatform/rules/api/presentation/models/RuleData;->b:Ljava/util/Map;

    .line 94
    .line 95
    const-string v4, "TITLE_KEY"

    .line 96
    .line 97
    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_4

    .line 102
    .line 103
    const-string v3, "DESCRIPTION_KEY"

    .line 104
    .line 105
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-eqz v5, :cond_4

    .line 110
    .line 111
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->N0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    new-instance v5, La/wtf0;

    .line 116
    .line 117
    const/16 v6, 0x1a

    .line 118
    .line 119
    invoke-direct {v5, v6}, La/wtf0;-><init>(B)V

    .line 120
    .line 121
    .line 122
    new-instance v6, La/wng0;

    .line 123
    .line 124
    invoke-direct {v6, v5}, La/wng0;-><init>(La/wtf0;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->removeIf(Ljava/util/function/Predicate;)Z

    .line 128
    .line 129
    .line 130
    new-instance v12, La/ykg0;

    .line 131
    .line 132
    const-string v5, ""

    .line 133
    .line 134
    invoke-interface {v2, v4, v5}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    move-object v14, v4

    .line 139
    check-cast v14, Ljava/lang/String;

    .line 140
    .line 141
    new-instance v15, La/ysw;

    .line 142
    .line 143
    iget-object v4, v0, Lorg/xplatform/rules/api/presentation/models/RuleData;->c:Ljava/lang/String;

    .line 144
    .line 145
    const/4 v6, 0x7

    .line 146
    invoke-direct {v15, v4, v6}, La/ysw;-><init>(Ljava/lang/String;I)V

    .line 147
    .line 148
    .line 149
    new-instance v4, La/ysw;

    .line 150
    .line 151
    iget-object v0, v0, Lorg/xplatform/rules/api/presentation/models/RuleData;->d:Ljava/lang/String;

    .line 152
    .line 153
    invoke-direct {v4, v0, v6}, La/ysw;-><init>(Ljava/lang/String;I)V

    .line 154
    .line 155
    .line 156
    sget-object v17, La/clg0;->c:La/clg0;

    .line 157
    .line 158
    const/4 v13, 0x1

    .line 159
    move-object/from16 v16, v4

    .line 160
    .line 161
    invoke-direct/range {v12 .. v17}, La/ykg0;-><init>(ZLjava/lang/String;La/ysw;La/ysw;La/clg0;)V

    .line 162
    .line 163
    .line 164
    const/4 v0, 0x0

    .line 165
    invoke-virtual {v1, v0, v12}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    new-instance v16, La/ykg0;

    .line 169
    .line 170
    invoke-interface {v2, v3, v5}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    move-object/from16 v18, v0

    .line 175
    .line 176
    check-cast v18, Ljava/lang/String;

    .line 177
    .line 178
    new-instance v0, La/ysw;

    .line 179
    .line 180
    const/16 v2, 0xf

    .line 181
    .line 182
    invoke-direct {v0, v10, v2}, La/ysw;-><init>(Ljava/lang/String;I)V

    .line 183
    .line 184
    .line 185
    move-object/from16 v21, v17

    .line 186
    .line 187
    const/16 v17, 0x0

    .line 188
    .line 189
    move-object/from16 v20, v0

    .line 190
    .line 191
    move-object/from16 v19, v0

    .line 192
    .line 193
    invoke-direct/range {v16 .. v21}, La/ykg0;-><init>(ZLjava/lang/String;La/ysw;La/ysw;La/clg0;)V

    .line 194
    .line 195
    .line 196
    move-object/from16 v0, v16

    .line 197
    .line 198
    invoke-virtual {v1, v11, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :cond_4
    return-object v1
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 14

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/olg0;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-super {p0, v0}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    instance-of v1, v0, La/ilg0;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    iget-object v4, p0, La/aog0;->A:La/mne;

    .line 14
    .line 15
    iget-object v5, p0, La/aog0;->r:La/m1e;

    .line 16
    .line 17
    const/4 v6, 0x1

    .line 18
    const/4 v7, 0x0

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, La/aog0;->D:La/c4m0;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-ne v0, v6, :cond_0

    .line 30
    .line 31
    goto/16 :goto_3

    .line 32
    .line 33
    :cond_0
    invoke-interface {v5}, La/m1e;->b()La/gmq;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, La/yng0;

    .line 38
    .line 39
    invoke-direct {v1, p0, v7, v3}, La/yng0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 40
    .line 41
    .line 42
    new-instance v3, La/fnq;

    .line 43
    .line 44
    const/4 v5, 0x4

    .line 45
    invoke-direct {v3, v0, v1, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 46
    .line 47
    .line 48
    sget-object v0, La/zng0;->h:La/zng0;

    .line 49
    .line 50
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v4, v4, La/mne;->a:La/rwj;

    .line 55
    .line 56
    invoke-static {v1, v4}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v3, v1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/aog0;->D:La/c4m0;

    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    instance-of v1, v0, La/hlg0;

    .line 68
    .line 69
    if-eqz v1, :cond_2

    .line 70
    .line 71
    iget-object v0, p0, La/aog0;->D:La/c4m0;

    .line 72
    .line 73
    if-eqz v0, :cond_14

    .line 74
    .line 75
    invoke-virtual {v0, v7}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    instance-of v1, v0, La/klg0;

    .line 80
    .line 81
    iget-object v8, p0, La/aog0;->C:La/i1w0;

    .line 82
    .line 83
    if-eqz v1, :cond_3

    .line 84
    .line 85
    invoke-static {v8}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    new-instance v1, La/c8d;

    .line 90
    .line 91
    sget-object v2, La/y7d;->a:La/v7d;

    .line 92
    .line 93
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 94
    .line 95
    invoke-direct {v1, v2, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v1, v8, v0, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    :goto_0
    move-object v1, v0

    .line 103
    check-cast v1, La/paw;

    .line 104
    .line 105
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_14

    .line 110
    .line 111
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, La/oe50;

    .line 116
    .line 117
    invoke-virtual {v8, v1}, La/i1w0;->a(La/oe50;)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_3
    instance-of v1, v0, La/llg0;

    .line 122
    .line 123
    if-eqz v1, :cond_10

    .line 124
    .line 125
    check-cast v0, La/llg0;

    .line 126
    .line 127
    iget-object v1, v0, La/llg0;->a:Ljava/lang/String;

    .line 128
    .line 129
    iget-boolean v0, v0, La/llg0;->b:Z

    .line 130
    .line 131
    if-eqz v0, :cond_4

    .line 132
    .line 133
    new-instance v0, La/eng0;

    .line 134
    .line 135
    invoke-direct {v0, v1}, La/eng0;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-nez v0, :cond_5

    .line 147
    .line 148
    goto/16 :goto_3

    .line 149
    .line 150
    :cond_5
    const-string v0, "tel:"

    .line 151
    .line 152
    invoke-static {v1, v0, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    const-string v4, "point"

    .line 157
    .line 158
    const-string v5, "information_contacts_call"

    .line 159
    .line 160
    iget-object v6, p0, La/aog0;->v:La/gg5;

    .line 161
    .line 162
    iget-object v9, p0, La/aog0;->t:La/u58;

    .line 163
    .line 164
    if-eqz v0, :cond_6

    .line 165
    .line 166
    iget-object v0, v9, La/u58;->a:La/kt2;

    .line 167
    .line 168
    new-instance v3, Lkotlin/Pair;

    .line 169
    .line 170
    const-string v7, "phone"

    .line 171
    .line 172
    invoke-direct {v3, v4, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-static {v3}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-interface {v0, v5, v3}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v6}, La/gg5;->o()V

    .line 183
    .line 184
    .line 185
    new-instance v0, La/fng0;

    .line 186
    .line 187
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-direct {v0, v1}, La/fng0;-><init>(Landroid/net/Uri;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_6
    const-string v0, "tg://resolve?domain"

    .line 199
    .line 200
    invoke-static {v1, v0, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_7

    .line 205
    .line 206
    iget-object v0, v9, La/u58;->a:La/kt2;

    .line 207
    .line 208
    new-instance v3, Lkotlin/Pair;

    .line 209
    .line 210
    const-string v7, "telegram"

    .line 211
    .line 212
    invoke-direct {v3, v4, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v3}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-interface {v0, v5, v3}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v6}, La/gg5;->s()V

    .line 223
    .line 224
    .line 225
    new-instance v0, La/gng0;

    .line 226
    .line 227
    invoke-direct {v0, v1}, La/gng0;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :cond_7
    const-string v0, "viber://chat?number"

    .line 235
    .line 236
    invoke-static {v1, v0, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-eqz v0, :cond_8

    .line 241
    .line 242
    iget-object v0, v9, La/u58;->a:La/kt2;

    .line 243
    .line 244
    const-string v7, "viber"

    .line 245
    .line 246
    invoke-static {v4, v7, v0, v5}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    iget-object v0, v6, La/gg5;->a:La/s1p;

    .line 250
    .line 251
    new-instance v4, La/j1p;

    .line 252
    .line 253
    invoke-direct {v4, v7, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 254
    .line 255
    .line 256
    invoke-static {v4}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    const-wide/16 v4, 0xc08

    .line 261
    .line 262
    invoke-virtual {v0, v3, v4, v5}, La/s1p;->a(Ljava/util/Set;J)V

    .line 263
    .line 264
    .line 265
    new-instance v0, La/gng0;

    .line 266
    .line 267
    invoke-direct {v0, v1}, La/gng0;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    return-void

    .line 274
    :cond_8
    const-string v0, "facebook.com"

    .line 275
    .line 276
    invoke-static {v1, v0, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    iget-object v5, p0, La/aog0;->w:La/au0;

    .line 281
    .line 282
    const-string v6, "instagram.com"

    .line 283
    .line 284
    if-nez v4, :cond_c

    .line 285
    .line 286
    invoke-static {v1, v6, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    if-eqz v4, :cond_9

    .line 291
    .line 292
    goto :goto_1

    .line 293
    :cond_9
    const-string v0, "twitter.com"

    .line 294
    .line 295
    invoke-static {v1, v0, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-eqz v0, :cond_a

    .line 300
    .line 301
    sget-object v0, La/ohk0;->d:La/ohk0;

    .line 302
    .line 303
    invoke-virtual {v5, v0}, La/au0;->p(La/ohk0;)V

    .line 304
    .line 305
    .line 306
    new-instance v0, La/gng0;

    .line 307
    .line 308
    invoke-direct {v0, v1}, La/gng0;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :cond_a
    const-string v0, "mailto"

    .line 316
    .line 317
    invoke-static {v1, v0, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-eqz v0, :cond_b

    .line 322
    .line 323
    new-instance v0, La/hng0;

    .line 324
    .line 325
    invoke-direct {v0, v1}, La/hng0;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    return-void

    .line 332
    :cond_b
    new-instance v0, La/dff0;

    .line 333
    .line 334
    const/16 v3, 0x13

    .line 335
    .line 336
    invoke-direct {v0, p0, v1, v3}, La/dff0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v8, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
    :cond_c
    :goto_1
    invoke-static {v1, v0, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-eqz v0, :cond_d

    .line 348
    .line 349
    sget-object v7, La/ohk0;->b:La/ohk0;

    .line 350
    .line 351
    goto :goto_2

    .line 352
    :cond_d
    invoke-static {v1, v6, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-eqz v0, :cond_e

    .line 357
    .line 358
    sget-object v7, La/ohk0;->c:La/ohk0;

    .line 359
    .line 360
    :cond_e
    :goto_2
    if-eqz v7, :cond_f

    .line 361
    .line 362
    iget-object v0, v7, La/ohk0;->a:Ljava/lang/String;

    .line 363
    .line 364
    iget-object v3, p0, La/aog0;->u:La/ag3;

    .line 365
    .line 366
    iget-object v3, v3, La/ag3;->a:La/kt2;

    .line 367
    .line 368
    const-string v4, "information_smm_call"

    .line 369
    .line 370
    const-string v6, "social_media"

    .line 371
    .line 372
    invoke-static {v6, v0, v3, v4}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v5, v7}, La/au0;->p(La/ohk0;)V

    .line 376
    .line 377
    .line 378
    :cond_f
    new-instance v0, La/gng0;

    .line 379
    .line 380
    invoke-direct {v0, v1}, La/gng0;-><init>(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    return-void

    .line 387
    :cond_10
    instance-of v1, v0, La/mlg0;

    .line 388
    .line 389
    if-eqz v1, :cond_11

    .line 390
    .line 391
    invoke-interface {v5}, La/m1e;->c()Z

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    if-eqz v0, :cond_14

    .line 396
    .line 397
    invoke-virtual {p0}, La/aog0;->M()V

    .line 398
    .line 399
    .line 400
    return-void

    .line 401
    :cond_11
    sget-object v1, La/jlg0;->a:La/jlg0;

    .line 402
    .line 403
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    if-eqz v1, :cond_12

    .line 408
    .line 409
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 410
    .line 411
    .line 412
    return-void

    .line 413
    :cond_12
    sget-object v1, La/nlg0;->a:La/nlg0;

    .line 414
    .line 415
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v0

    .line 419
    if-eqz v0, :cond_15

    .line 420
    .line 421
    iget-object v0, p0, La/aog0;->F:La/bby;

    .line 422
    .line 423
    if-eqz v0, :cond_13

    .line 424
    .line 425
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-ne v0, v6, :cond_13

    .line 430
    .line 431
    goto :goto_3

    .line 432
    :cond_13
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    check-cast v0, La/ong0;

    .line 437
    .line 438
    iget-object v0, v0, La/ong0;->h:La/xkg0;

    .line 439
    .line 440
    if-eqz v0, :cond_14

    .line 441
    .line 442
    iget-object v1, v0, La/xkg0;->b:Ljava/lang/String;

    .line 443
    .line 444
    iget-object v0, v0, La/xkg0;->a:Ljava/lang/String;

    .line 445
    .line 446
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 447
    .line 448
    .line 449
    move-result-object v8

    .line 450
    iget-object v11, v4, La/mne;->a:La/rwj;

    .line 451
    .line 452
    new-instance v9, La/vng0;

    .line 453
    .line 454
    invoke-direct {v9, p0, v3}, La/vng0;-><init>(La/aog0;B)V

    .line 455
    .line 456
    .line 457
    new-instance v12, La/qkb0;

    .line 458
    .line 459
    const/16 v5, 0x9

    .line 460
    .line 461
    move-object v2, p0

    .line 462
    move-object v3, v0

    .line 463
    move-object v4, v7

    .line 464
    move-object v0, v12

    .line 465
    invoke-direct/range {v0 .. v5}, La/qkb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 466
    .line 467
    .line 468
    const/16 v13, 0xa

    .line 469
    .line 470
    const/4 v10, 0x0

    .line 471
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    iput-object v0, p0, La/aog0;->F:La/bby;

    .line 476
    .line 477
    :cond_14
    :goto_3
    return-void

    .line 478
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 479
    .line 480
    .line 481
    return-void
.end method
