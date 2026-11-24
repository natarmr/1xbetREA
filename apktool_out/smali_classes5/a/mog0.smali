.class public final La/mog0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:Lorg/xplatform/rules/api/presentation/models/RuleData;

.field public final c:Z

.field public final d:La/nv20;

.field public final e:La/tzi;

.field public final f:La/m1e;

.field public final g:La/g2v;

.field public final h:La/duj;

.field public final i:La/u58;

.field public final j:La/ag3;

.field public final k:La/gg5;

.field public final l:La/au0;

.field public final m:La/mne;

.field public final n:La/i1w0;

.field public o:La/c4m0;

.field public p:La/bby;

.field public q:Z

.field public final r:La/ol60;

.field public final s:La/p7m0;


# direct methods
.method public constructor <init>(Lorg/xplatform/rules/api/presentation/models/RuleData;ZLa/nv20;La/tzi;La/m1e;La/g2v;La/duj;La/u58;La/ag3;La/gg5;La/au0;La/mne;La/i1w0;)V
    .locals 10

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p13 .. p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, La/w46;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/mog0;->b:Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 11
    .line 12
    iput-boolean p2, p0, La/mog0;->c:Z

    .line 13
    .line 14
    iput-object p3, p0, La/mog0;->d:La/nv20;

    .line 15
    .line 16
    iput-object p4, p0, La/mog0;->e:La/tzi;

    .line 17
    .line 18
    iput-object p5, p0, La/mog0;->f:La/m1e;

    .line 19
    .line 20
    move-object/from16 p2, p6

    .line 21
    .line 22
    iput-object p2, p0, La/mog0;->g:La/g2v;

    .line 23
    .line 24
    move-object/from16 p2, p7

    .line 25
    .line 26
    iput-object p2, p0, La/mog0;->h:La/duj;

    .line 27
    .line 28
    move-object/from16 p2, p8

    .line 29
    .line 30
    iput-object p2, p0, La/mog0;->i:La/u58;

    .line 31
    .line 32
    move-object/from16 p2, p9

    .line 33
    .line 34
    iput-object p2, p0, La/mog0;->j:La/ag3;

    .line 35
    .line 36
    move-object/from16 p2, p10

    .line 37
    .line 38
    iput-object p2, p0, La/mog0;->k:La/gg5;

    .line 39
    .line 40
    move-object/from16 p2, p11

    .line 41
    .line 42
    iput-object p2, p0, La/mog0;->l:La/au0;

    .line 43
    .line 44
    move-object/from16 p2, p12

    .line 45
    .line 46
    iput-object p2, p0, La/mog0;->m:La/mne;

    .line 47
    .line 48
    move-object/from16 p2, p13

    .line 49
    .line 50
    iput-object p2, p0, La/mog0;->n:La/i1w0;

    .line 51
    .line 52
    new-instance p2, La/ol60;

    .line 53
    .line 54
    const/4 v0, 0x3

    .line 55
    invoke-direct {p2, v0}, La/ol60;-><init>(I)V

    .line 56
    .line 57
    .line 58
    iput-object p2, p0, La/mog0;->r:La/ol60;

    .line 59
    .line 60
    sget-object p2, La/gog0;->a:La/gog0;

    .line 61
    .line 62
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    iput-object p2, p0, La/mog0;->s:La/p7m0;

    .line 67
    .line 68
    iget-object p1, p1, Lorg/xplatform/rules/api/presentation/models/RuleData;->b:Ljava/util/Map;

    .line 69
    .line 70
    const-string v0, "TITLE_KEY"

    .line 71
    .line 72
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    const-string v1, "DESCRIPTION_KEY"

    .line 79
    .line 80
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_2

    .line 85
    .line 86
    new-instance p0, La/jog0;

    .line 87
    .line 88
    new-instance v2, La/ykg0;

    .line 89
    .line 90
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Ljava/lang/String;

    .line 95
    .line 96
    const-string v3, ""

    .line 97
    .line 98
    if-nez v0, :cond_0

    .line 99
    .line 100
    move-object v0, v3

    .line 101
    :cond_0
    new-instance v4, La/ysw;

    .line 102
    .line 103
    const/4 v5, 0x0

    .line 104
    const/16 v6, 0xf

    .line 105
    .line 106
    invoke-direct {v4, v5, v6}, La/ysw;-><init>(Ljava/lang/String;I)V

    .line 107
    .line 108
    .line 109
    sget-object v7, La/clg0;->c:La/clg0;

    .line 110
    .line 111
    const/4 v8, 0x1

    .line 112
    move-object v9, v4

    .line 113
    move-object p5, v0

    .line 114
    move-object p3, v2

    .line 115
    move-object/from16 p6, v4

    .line 116
    .line 117
    move-object/from16 p8, v7

    .line 118
    .line 119
    move p4, v8

    .line 120
    move-object/from16 p7, v9

    .line 121
    .line 122
    invoke-direct/range {p3 .. p8}, La/ykg0;-><init>(ZLjava/lang/String;La/ysw;La/ysw;La/clg0;)V

    .line 123
    .line 124
    .line 125
    move-object v0, p3

    .line 126
    move-object/from16 v2, p8

    .line 127
    .line 128
    new-instance v4, La/ykg0;

    .line 129
    .line 130
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    check-cast p1, Ljava/lang/String;

    .line 135
    .line 136
    if-nez p1, :cond_1

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_1
    move-object v3, p1

    .line 140
    :goto_0
    new-instance p1, La/ysw;

    .line 141
    .line 142
    invoke-direct {p1, v5, v6}, La/ysw;-><init>(Ljava/lang/String;I)V

    .line 143
    .line 144
    .line 145
    const/4 v1, 0x0

    .line 146
    move-object v6, p1

    .line 147
    move-object/from16 p6, p1

    .line 148
    .line 149
    move p4, v1

    .line 150
    move-object/from16 p8, v2

    .line 151
    .line 152
    move-object p5, v3

    .line 153
    move-object p3, v4

    .line 154
    move-object/from16 p7, v6

    .line 155
    .line 156
    invoke-direct/range {p3 .. p8}, La/ykg0;-><init>(ZLjava/lang/String;La/ysw;La/ysw;La/clg0;)V

    .line 157
    .line 158
    .line 159
    move-object p1, p3

    .line 160
    filled-new-array {v0, p1}, [La/ykg0;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-static {p1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-direct {p0, p1}, La/jog0;-><init>(Ljava/util/List;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p2, v5, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :cond_2
    invoke-virtual {p0}, La/mog0;->x()V

    .line 176
    .line 177
    .line 178
    return-void
.end method


# virtual methods
.method public final w()La/jkm;
    .locals 10

    .line 1
    sget-object v1, La/pb10;->g:La/pb10;

    .line 2
    .line 3
    new-instance v2, La/b0c0;

    .line 4
    .line 5
    const/4 v8, 0x0

    .line 6
    const/16 v9, 0x17

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const-class v5, La/mog0;

    .line 10
    .line 11
    const-string v6, "refreshDataOnLottieButtonClick"

    .line 12
    .line 13
    const-string v7, "refreshDataOnLottieButtonClick()V"

    .line 14
    .line 15
    move-object v4, p0

    .line 16
    invoke-direct/range {v2 .. v9}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 17
    .line 18
    .line 19
    const/16 v7, 0x5e

    .line 20
    .line 21
    iget-object v0, v4, La/mog0;->g:La/g2v;

    .line 22
    .line 23
    move-object v6, v2

    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    const v4, 0x7f130677

    .line 27
    .line 28
    .line 29
    const v5, 0x7f131690

    .line 30
    .line 31
    .line 32
    invoke-static/range {v0 .. v7}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public final x()V
    .locals 10

    .line 1
    iget-object v0, p0, La/mog0;->p:La/bby;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-boolean v0, p0, La/mog0;->c:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    sget-object v0, La/bm5;->d:La/bm5;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    sget-object v0, La/bm5;->a:La/bm5;

    .line 21
    .line 22
    :goto_0
    iget-object v1, p0, La/mog0;->s:La/p7m0;

    .line 23
    .line 24
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    instance-of v2, v2, La/iog0;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v2, La/hog0;->a:La/hog0;

    .line 37
    .line 38
    invoke-virtual {v1, v3, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    iget-object v1, p0, La/mog0;->m:La/mne;

    .line 46
    .line 47
    iget-object v7, v1, La/mne;->b:La/dvj;

    .line 48
    .line 49
    new-instance v5, La/eme0;

    .line 50
    .line 51
    const/16 v1, 0x1c

    .line 52
    .line 53
    invoke-direct {v5, p0, v1}, La/eme0;-><init>(Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    new-instance v8, La/k6d0;

    .line 57
    .line 58
    const/16 v1, 0x1a

    .line 59
    .line 60
    invoke-direct {v8, p0, v0, v3, v1}, La/k6d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 61
    .line 62
    .line 63
    const/16 v9, 0xa

    .line 64
    .line 65
    const/4 v6, 0x0

    .line 66
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, La/mog0;->p:La/bby;

    .line 71
    .line 72
    return-void
.end method

.method public final y(La/fog0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/mog0;->r:La/ol60;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
