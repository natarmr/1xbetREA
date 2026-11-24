.class public final La/c0t;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic b0:I


# instance fields
.field public final A:La/e1u;

.field public final B:La/b8u;

.field public final C:La/reu;

.field public final D:La/vpu;

.field public final E:La/hqc;

.field public final F:La/j3c;

.field public final G:La/zsr;

.field public final H:La/rpt;

.field public final I:La/kut;

.field public final J:La/lbu;

.field public final K:La/m1e;

.field public final L:La/oeg0;

.field public final M:La/kys0;

.field public final N:La/dwu;

.field public final O:La/ctf0;

.field public P:La/c4m0;

.field public Q:La/c4m0;

.field public R:La/bby;

.field public S:La/c4m0;

.field public T:La/bby;

.field public U:La/c4m0;

.field public V:La/c4m0;

.field public W:La/c4m0;

.field public X:La/c4m0;

.field public Y:La/c4m0;

.field public Z:Z

.field public a0:La/bby;

.field public final o:La/vzg0;

.field public final p:Ljava/lang/String;

.field public final q:La/mne;

.field public final r:Lorg/xplatform/ufc/api/game/UfcGameParams;

.field public final s:La/tzi;

.field public final t:La/iw20;

.field public final u:La/drm0;

.field public final v:La/sbu;

.field public final w:La/a7q;

.field public final x:La/rus;

.field public final y:La/g3j;

.field public final z:La/xpr;


# direct methods
.method public constructor <init>(La/vzg0;Ljava/lang/String;La/mne;Lorg/xplatform/ufc/api/game/UfcGameParams;La/tzi;La/iw20;La/drm0;La/sbu;La/a7q;La/rus;La/g3j;La/xpr;La/e1u;La/b8u;La/reu;La/vpu;La/hqc;La/j3c;La/e1u;La/zsr;La/rpt;La/kut;La/lbu;La/m1e;La/oeg0;La/kys0;La/uxs0;La/dwu;La/r9u;La/ctf0;La/lbu;La/pru;La/g2v;)V
    .locals 11

    .line 1
    move-object/from16 v0, p12

    .line 2
    .line 3
    move-object/from16 v1, p30

    .line 4
    .line 5
    invoke-virtual/range {p24 .. p24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p25 .. p25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {p29 .. p29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v2, p3, La/mne;->c:La/vs10;

    .line 18
    .line 19
    iget-object v3, p3, La/mne;->a:La/rwj;

    .line 20
    .line 21
    invoke-static {v2, v3}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v3, La/co0;

    .line 26
    .line 27
    const/4 v10, 0x5

    .line 28
    move-object v5, p1

    .line 29
    move-object v6, p4

    .line 30
    move-object/from16 v7, p19

    .line 31
    .line 32
    move-object/from16 v9, p29

    .line 33
    .line 34
    move-object/from16 v4, p31

    .line 35
    .line 36
    move-object/from16 v8, p32

    .line 37
    .line 38
    invoke-direct/range {v3 .. v10}, La/co0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/pru;Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    new-instance v4, La/o20;

    .line 42
    .line 43
    const/16 v6, 0xa

    .line 44
    .line 45
    move-object/from16 v7, p33

    .line 46
    .line 47
    invoke-direct {v4, v1, v7, v6}, La/o20;-><init>(La/ctf0;La/g2v;B)V

    .line 48
    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    invoke-direct {p0, v3, v2, v4, v6}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, La/c0t;->o:La/vzg0;

    .line 55
    .line 56
    iput-object p2, p0, La/c0t;->p:Ljava/lang/String;

    .line 57
    .line 58
    iput-object p3, p0, La/c0t;->q:La/mne;

    .line 59
    .line 60
    iput-object p4, p0, La/c0t;->r:Lorg/xplatform/ufc/api/game/UfcGameParams;

    .line 61
    .line 62
    move-object/from16 p1, p5

    .line 63
    .line 64
    iput-object p1, p0, La/c0t;->s:La/tzi;

    .line 65
    .line 66
    move-object/from16 p1, p6

    .line 67
    .line 68
    iput-object p1, p0, La/c0t;->t:La/iw20;

    .line 69
    .line 70
    move-object/from16 p1, p7

    .line 71
    .line 72
    iput-object p1, p0, La/c0t;->u:La/drm0;

    .line 73
    .line 74
    move-object/from16 p1, p8

    .line 75
    .line 76
    iput-object p1, p0, La/c0t;->v:La/sbu;

    .line 77
    .line 78
    move-object/from16 p1, p9

    .line 79
    .line 80
    iput-object p1, p0, La/c0t;->w:La/a7q;

    .line 81
    .line 82
    move-object/from16 p1, p10

    .line 83
    .line 84
    iput-object p1, p0, La/c0t;->x:La/rus;

    .line 85
    .line 86
    move-object/from16 p1, p11

    .line 87
    .line 88
    iput-object p1, p0, La/c0t;->y:La/g3j;

    .line 89
    .line 90
    iput-object v0, p0, La/c0t;->z:La/xpr;

    .line 91
    .line 92
    move-object/from16 p1, p13

    .line 93
    .line 94
    iput-object p1, p0, La/c0t;->A:La/e1u;

    .line 95
    .line 96
    move-object/from16 p1, p14

    .line 97
    .line 98
    iput-object p1, p0, La/c0t;->B:La/b8u;

    .line 99
    .line 100
    move-object/from16 p1, p15

    .line 101
    .line 102
    iput-object p1, p0, La/c0t;->C:La/reu;

    .line 103
    .line 104
    move-object/from16 p1, p16

    .line 105
    .line 106
    iput-object p1, p0, La/c0t;->D:La/vpu;

    .line 107
    .line 108
    move-object/from16 p1, p17

    .line 109
    .line 110
    iput-object p1, p0, La/c0t;->E:La/hqc;

    .line 111
    .line 112
    move-object/from16 p1, p18

    .line 113
    .line 114
    iput-object p1, p0, La/c0t;->F:La/j3c;

    .line 115
    .line 116
    move-object/from16 p1, p20

    .line 117
    .line 118
    iput-object p1, p0, La/c0t;->G:La/zsr;

    .line 119
    .line 120
    move-object/from16 p1, p21

    .line 121
    .line 122
    iput-object p1, p0, La/c0t;->H:La/rpt;

    .line 123
    .line 124
    move-object/from16 p1, p22

    .line 125
    .line 126
    iput-object p1, p0, La/c0t;->I:La/kut;

    .line 127
    .line 128
    move-object/from16 p1, p23

    .line 129
    .line 130
    iput-object p1, p0, La/c0t;->J:La/lbu;

    .line 131
    .line 132
    move-object/from16 p1, p24

    .line 133
    .line 134
    iput-object p1, p0, La/c0t;->K:La/m1e;

    .line 135
    .line 136
    move-object/from16 p1, p25

    .line 137
    .line 138
    iput-object p1, p0, La/c0t;->L:La/oeg0;

    .line 139
    .line 140
    move-object/from16 p1, p26

    .line 141
    .line 142
    iput-object p1, p0, La/c0t;->M:La/kys0;

    .line 143
    .line 144
    move-object/from16 p1, p28

    .line 145
    .line 146
    iput-object p1, p0, La/c0t;->N:La/dwu;

    .line 147
    .line 148
    iput-object v1, p0, La/c0t;->O:La/ctf0;

    .line 149
    .line 150
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    iget-object p2, p3, La/mne;->c:La/vs10;

    .line 155
    .line 156
    new-instance p3, La/b0t;

    .line 157
    .line 158
    const/4 v1, 0x3

    .line 159
    invoke-direct {p3, p0, v6, v1}, La/b0t;-><init>(La/c0t;La/yje;B)V

    .line 160
    .line 161
    .line 162
    const/16 v1, 0xb

    .line 163
    .line 164
    const/4 v2, 0x0

    .line 165
    const/4 v3, 0x0

    .line 166
    move-object p4, p2

    .line 167
    move-object/from16 p5, p3

    .line 168
    .line 169
    move/from16 p6, v1

    .line 170
    .line 171
    move-object p2, v2

    .line 172
    move-object p3, v3

    .line 173
    invoke-static/range {p1 .. p6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 174
    .line 175
    .line 176
    const/4 p1, 0x1

    .line 177
    new-array p1, p1, [La/wpr;

    .line 178
    .line 179
    sget-object p2, La/upr;->a:La/upr;

    .line 180
    .line 181
    const/4 p3, 0x0

    .line 182
    aput-object p2, p1, p3

    .line 183
    .line 184
    invoke-static {p0, v0, p1}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 185
    .line 186
    .line 187
    return-void
.end method


# virtual methods
.method public final M(La/ats;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/zzs;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/zzs;

    .line 7
    .line 8
    iget v1, v0, La/zzs;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/zzs;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/zzs;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/zzs;-><init>(La/c0t;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/zzs;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/zzs;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_2

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_3

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    check-cast p2, La/wrs;

    .line 57
    .line 58
    iget-object p2, p2, La/wrs;->m:La/yws;

    .line 59
    .line 60
    if-nez p2, :cond_a

    .line 61
    .line 62
    iget-object p1, p1, La/ats;->a:La/jlr;

    .line 63
    .line 64
    invoke-static {p1}, La/d5c;->C(La/jlr;)La/m9s;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_9

    .line 69
    .line 70
    iget-object p1, p1, La/m9s;->u:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-lez p2, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    move-object p1, v4

    .line 80
    :goto_1
    if-eqz p1, :cond_9

    .line 81
    .line 82
    :try_start_1
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 83
    .line 84
    iget-object p0, p0, La/c0t;->J:La/lbu;

    .line 85
    .line 86
    iput v3, v0, La/zzs;->k:I

    .line 87
    .line 88
    invoke-virtual {p0, p1, v0}, La/lbu;->f(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    if-ne p2, v1, :cond_4

    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_4
    :goto_2
    check-cast p2, Ljava/lang/String;

    .line 96
    .line 97
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :goto_3
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 101
    .line 102
    new-instance p2, La/g0g0;

    .line 103
    .line 104
    invoke-direct {p2, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    :goto_4
    invoke-static {p2}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    instance-of p0, p0, La/lws;

    .line 112
    .line 113
    instance-of p1, p2, La/g0g0;

    .line 114
    .line 115
    if-eqz p1, :cond_5

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_5
    move-object v4, p2

    .line 119
    :goto_5
    check-cast v4, Ljava/lang/String;

    .line 120
    .line 121
    new-instance p1, La/yws;

    .line 122
    .line 123
    if-nez v4, :cond_6

    .line 124
    .line 125
    const-string p2, ""

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_6
    move-object p2, v4

    .line 129
    :goto_6
    const/4 v0, 0x0

    .line 130
    if-nez p0, :cond_8

    .line 131
    .line 132
    if-eqz v4, :cond_7

    .line 133
    .line 134
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-lez v1, :cond_7

    .line 139
    .line 140
    goto :goto_7

    .line 141
    :cond_7
    move v3, v0

    .line 142
    :cond_8
    :goto_7
    invoke-direct {p1, v3, p0, p2, v0}, La/yws;-><init>(ZZLjava/lang/String;I)V

    .line 143
    .line 144
    .line 145
    return-object p1

    .line 146
    :cond_9
    return-object v4

    .line 147
    :cond_a
    return-object p2
.end method

.method public final v()V
    .locals 1

    .line 1
    sget-object v0, La/ocs;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    iget-object p0, p0, La/c0t;->p:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, La/ocs;->a:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/amr;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-super {v0, v1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    instance-of v2, v1, La/qlr;

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    const/4 v4, 0x1

    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v6, 0x0

    .line 19
    if-eqz v2, :cond_a

    .line 20
    .line 21
    iget-object v1, v0, La/c0t;->Y:La/c4m0;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v1, v0, La/c0t;->K:La/m1e;

    .line 29
    .line 30
    invoke-interface {v1}, La/m1e;->b()La/gmq;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    new-instance v2, La/b0t;

    .line 35
    .line 36
    invoke-direct {v2, v0, v6, v4}, La/b0t;-><init>(La/c0t;La/yje;B)V

    .line 37
    .line 38
    .line 39
    new-instance v7, La/fnq;

    .line 40
    .line 41
    const/4 v8, 0x4

    .line 42
    invoke-direct {v7, v1, v2, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v2, v0, La/c0t;->q:La/mne;

    .line 50
    .line 51
    iget-object v9, v2, La/mne;->a:La/rwj;

    .line 52
    .line 53
    invoke-static {v1, v9}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    sget-object v10, La/foe;->h:La/foe;

    .line 58
    .line 59
    invoke-static {v7, v1, v10}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iput-object v1, v0, La/c0t;->Y:La/c4m0;

    .line 64
    .line 65
    iget-object v1, v0, La/c0t;->P:La/c4m0;

    .line 66
    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, La/wrs;

    .line 77
    .line 78
    iget-object v1, v1, La/wrs;->b:La/gps;

    .line 79
    .line 80
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, La/wrs;

    .line 85
    .line 86
    iget-object v2, v2, La/wrs;->s:La/sff0;

    .line 87
    .line 88
    iget-boolean v2, v2, La/sff0;->J1:Z

    .line 89
    .line 90
    iget-object v7, v0, La/c0t;->s:La/tzi;

    .line 91
    .line 92
    invoke-virtual {v7, v1, v2}, La/tzi;->l(La/gps;Z)La/gmq;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    new-instance v2, La/fhq;

    .line 97
    .line 98
    const/4 v7, 0x6

    .line 99
    invoke-direct {v2, v0, v6, v7}, La/fhq;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 100
    .line 101
    .line 102
    new-instance v7, La/fnq;

    .line 103
    .line 104
    invoke-direct {v7, v1, v2, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 105
    .line 106
    .line 107
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-static {v1, v9}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-static {v7, v1, v10}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    iput-object v1, v0, La/c0t;->P:La/c4m0;

    .line 120
    .line 121
    iget-object v1, v0, La/c0t;->Q:La/c4m0;

    .line 122
    .line 123
    if-eqz v1, :cond_2

    .line 124
    .line 125
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 126
    .line 127
    .line 128
    :cond_2
    const-wide/16 v1, 0xbd

    .line 129
    .line 130
    const-wide/16 v11, 0x0

    .line 131
    .line 132
    iget-object v7, v0, La/c0t;->w:La/a7q;

    .line 133
    .line 134
    invoke-virtual {v7, v1, v2, v11, v12}, La/a7q;->a(JJ)La/vsg0;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    new-instance v2, La/a0t;

    .line 139
    .line 140
    invoke-direct {v2, v0, v6, v3}, La/a0t;-><init>(La/c0t;La/yje;B)V

    .line 141
    .line 142
    .line 143
    new-instance v7, La/fnq;

    .line 144
    .line 145
    invoke-direct {v7, v1, v2, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 146
    .line 147
    .line 148
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-static {v1, v9}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-static {v7, v1, v10}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    iput-object v1, v0, La/c0t;->Q:La/c4m0;

    .line 161
    .line 162
    iget-object v1, v0, La/c0t;->U:La/c4m0;

    .line 163
    .line 164
    if-eqz v1, :cond_3

    .line 165
    .line 166
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 167
    .line 168
    .line 169
    :cond_3
    iget-object v1, v0, La/c0t;->D:La/vpu;

    .line 170
    .line 171
    invoke-virtual {v1}, La/vpu;->a()La/fnq;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    new-instance v2, La/b0t;

    .line 176
    .line 177
    invoke-direct {v2, v0, v6, v3}, La/b0t;-><init>(La/c0t;La/yje;B)V

    .line 178
    .line 179
    .line 180
    new-instance v3, La/fnq;

    .line 181
    .line 182
    invoke-direct {v3, v1, v2, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 183
    .line 184
    .line 185
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-static {v1, v9}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-static {v3, v1, v10}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    iput-object v1, v0, La/c0t;->U:La/c4m0;

    .line 198
    .line 199
    iget-object v1, v0, La/c0t;->V:La/c4m0;

    .line 200
    .line 201
    if-eqz v1, :cond_4

    .line 202
    .line 203
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 204
    .line 205
    .line 206
    :cond_4
    iget-object v1, v0, La/c0t;->E:La/hqc;

    .line 207
    .line 208
    invoke-virtual {v1}, La/hqc;->a()La/gmq;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    new-instance v2, La/a0t;

    .line 213
    .line 214
    invoke-direct {v2, v0, v6, v4}, La/a0t;-><init>(La/c0t;La/yje;B)V

    .line 215
    .line 216
    .line 217
    new-instance v3, La/fnq;

    .line 218
    .line 219
    invoke-direct {v3, v1, v2, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 220
    .line 221
    .line 222
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-static {v1, v9}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-static {v3, v1, v10}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    iput-object v1, v0, La/c0t;->V:La/c4m0;

    .line 235
    .line 236
    iget-object v1, v0, La/c0t;->W:La/c4m0;

    .line 237
    .line 238
    if-eqz v1, :cond_5

    .line 239
    .line 240
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 241
    .line 242
    .line 243
    :cond_5
    iget-object v1, v0, La/c0t;->H:La/rpt;

    .line 244
    .line 245
    invoke-virtual {v1}, La/rpt;->b()La/p6d;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    new-instance v2, La/b0t;

    .line 250
    .line 251
    invoke-direct {v2, v0, v6, v5}, La/b0t;-><init>(La/c0t;La/yje;B)V

    .line 252
    .line 253
    .line 254
    new-instance v3, La/fnq;

    .line 255
    .line 256
    invoke-direct {v3, v1, v2, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 257
    .line 258
    .line 259
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-static {v1, v9}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-static {v3, v1, v10}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    iput-object v1, v0, La/c0t;->W:La/c4m0;

    .line 272
    .line 273
    iget-object v1, v0, La/c0t;->X:La/c4m0;

    .line 274
    .line 275
    if-eqz v1, :cond_6

    .line 276
    .line 277
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 278
    .line 279
    .line 280
    :cond_6
    iget-object v1, v0, La/c0t;->I:La/kut;

    .line 281
    .line 282
    invoke-virtual {v1}, La/kut;->a()La/qoj0;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    new-instance v2, La/a0t;

    .line 287
    .line 288
    invoke-direct {v2, v0, v6, v5}, La/a0t;-><init>(La/c0t;La/yje;B)V

    .line 289
    .line 290
    .line 291
    new-instance v3, La/fnq;

    .line 292
    .line 293
    invoke-direct {v3, v1, v2, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 294
    .line 295
    .line 296
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-static {v1, v9}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-static {v3, v1, v10}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    iput-object v1, v0, La/c0t;->X:La/c4m0;

    .line 309
    .line 310
    iget-object v1, v0, La/c0t;->R:La/bby;

    .line 311
    .line 312
    if-eqz v1, :cond_7

    .line 313
    .line 314
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 315
    .line 316
    .line 317
    :cond_7
    iget-object v1, v0, La/c0t;->T:La/bby;

    .line 318
    .line 319
    if-eqz v1, :cond_8

    .line 320
    .line 321
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 322
    .line 323
    .line 324
    :cond_8
    new-instance v3, La/g7p;

    .line 325
    .line 326
    const/16 v7, 0x1c

    .line 327
    .line 328
    invoke-direct {v3, v0, v7}, La/g7p;-><init>(Ljava/lang/Object;B)V

    .line 329
    .line 330
    .line 331
    new-instance v4, La/t4s;

    .line 332
    .line 333
    const/16 v1, 0x1b

    .line 334
    .line 335
    invoke-direct {v4, v1}, La/t4s;-><init>(B)V

    .line 336
    .line 337
    .line 338
    const/16 v5, 0x75

    .line 339
    .line 340
    iget-object v1, v0, La/c0t;->x:La/rus;

    .line 341
    .line 342
    const/4 v2, 0x0

    .line 343
    invoke-static/range {v0 .. v5}, La/i3t0;->F(La/i3t0;La/j3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    iput-object v1, v0, La/c0t;->R:La/bby;

    .line 348
    .line 349
    new-instance v4, La/t4s;

    .line 350
    .line 351
    invoke-direct {v4, v7}, La/t4s;-><init>(B)V

    .line 352
    .line 353
    .line 354
    const/16 v5, 0x77

    .line 355
    .line 356
    iget-object v1, v0, La/c0t;->y:La/g3j;

    .line 357
    .line 358
    const/4 v3, 0x0

    .line 359
    invoke-static/range {v0 .. v5}, La/i3t0;->F(La/i3t0;La/j3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    iput-object v1, v0, La/c0t;->T:La/bby;

    .line 364
    .line 365
    iget-object v1, v0, La/c0t;->S:La/c4m0;

    .line 366
    .line 367
    if-eqz v1, :cond_9

    .line 368
    .line 369
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 370
    .line 371
    .line 372
    :cond_9
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    check-cast v1, La/wrs;

    .line 377
    .line 378
    iget-object v1, v1, La/wrs;->v:Ljava/util/List;

    .line 379
    .line 380
    sget-object v2, La/dam0;->a:La/dam0;

    .line 381
    .line 382
    iget-object v3, v0, La/c0t;->N:La/dwu;

    .line 383
    .line 384
    invoke-virtual {v3, v1, v2}, La/dwu;->a(Ljava/util/List;La/dam0;)La/zj2;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    new-instance v2, La/a0t;

    .line 389
    .line 390
    const/4 v3, 0x3

    .line 391
    invoke-direct {v2, v0, v6, v3}, La/a0t;-><init>(La/c0t;La/yje;B)V

    .line 392
    .line 393
    .line 394
    new-instance v3, La/fnq;

    .line 395
    .line 396
    invoke-direct {v3, v1, v2, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 397
    .line 398
    .line 399
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    invoke-static {v1, v9}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    invoke-static {v3, v1, v10}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    iput-object v1, v0, La/c0t;->S:La/c4m0;

    .line 412
    .line 413
    return-void

    .line 414
    :cond_a
    instance-of v2, v1, La/plr;

    .line 415
    .line 416
    if-eqz v2, :cond_15

    .line 417
    .line 418
    iget-object v1, v0, La/c0t;->R:La/bby;

    .line 419
    .line 420
    if-eqz v1, :cond_b

    .line 421
    .line 422
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 423
    .line 424
    .line 425
    :cond_b
    iget-object v1, v0, La/c0t;->T:La/bby;

    .line 426
    .line 427
    if-eqz v1, :cond_c

    .line 428
    .line 429
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 430
    .line 431
    .line 432
    :cond_c
    iget-object v1, v0, La/c0t;->P:La/c4m0;

    .line 433
    .line 434
    if-eqz v1, :cond_d

    .line 435
    .line 436
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 437
    .line 438
    .line 439
    :cond_d
    iget-object v1, v0, La/c0t;->Q:La/c4m0;

    .line 440
    .line 441
    if-eqz v1, :cond_e

    .line 442
    .line 443
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 444
    .line 445
    .line 446
    :cond_e
    iget-object v1, v0, La/c0t;->U:La/c4m0;

    .line 447
    .line 448
    if-eqz v1, :cond_f

    .line 449
    .line 450
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 451
    .line 452
    .line 453
    :cond_f
    iget-object v1, v0, La/c0t;->V:La/c4m0;

    .line 454
    .line 455
    if-eqz v1, :cond_10

    .line 456
    .line 457
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 458
    .line 459
    .line 460
    :cond_10
    iget-object v1, v0, La/c0t;->W:La/c4m0;

    .line 461
    .line 462
    if-eqz v1, :cond_11

    .line 463
    .line 464
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 465
    .line 466
    .line 467
    :cond_11
    iget-object v1, v0, La/c0t;->X:La/c4m0;

    .line 468
    .line 469
    if-eqz v1, :cond_12

    .line 470
    .line 471
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 472
    .line 473
    .line 474
    :cond_12
    iget-object v1, v0, La/c0t;->Y:La/c4m0;

    .line 475
    .line 476
    if-eqz v1, :cond_13

    .line 477
    .line 478
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 479
    .line 480
    .line 481
    :cond_13
    iget-object v1, v0, La/c0t;->a0:La/bby;

    .line 482
    .line 483
    if-eqz v1, :cond_14

    .line 484
    .line 485
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 486
    .line 487
    .line 488
    :cond_14
    iget-object v0, v0, La/c0t;->S:La/c4m0;

    .line 489
    .line 490
    if-eqz v0, :cond_44

    .line 491
    .line 492
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 493
    .line 494
    .line 495
    return-void

    .line 496
    :cond_15
    instance-of v2, v1, La/olr;

    .line 497
    .line 498
    if-eqz v2, :cond_16

    .line 499
    .line 500
    invoke-virtual {v0}, La/i3t0;->E()V

    .line 501
    .line 502
    .line 503
    return-void

    .line 504
    :cond_16
    instance-of v2, v1, La/wlr;

    .line 505
    .line 506
    iget-object v7, v0, La/i3t0;->f:La/oyg0;

    .line 507
    .line 508
    iget-object v8, v0, La/i3t0;->i:La/ocj;

    .line 509
    .line 510
    if-eqz v2, :cond_18

    .line 511
    .line 512
    iget-object v2, v8, La/ocj;->a:La/p7m0;

    .line 513
    .line 514
    :cond_17
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    move-object v8, v1

    .line 522
    check-cast v8, La/wrs;

    .line 523
    .line 524
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    sget-object v3, La/da10;->b:La/da10;

    .line 528
    .line 529
    const-wide/16 v27, 0x0

    .line 530
    .line 531
    const v29, 0x3f7ffff

    .line 532
    .line 533
    .line 534
    const/4 v9, 0x0

    .line 535
    const/4 v10, 0x0

    .line 536
    const/4 v11, 0x0

    .line 537
    const/4 v12, 0x0

    .line 538
    const/4 v13, 0x0

    .line 539
    const/4 v14, 0x0

    .line 540
    const/4 v15, 0x0

    .line 541
    const/16 v16, 0x0

    .line 542
    .line 543
    const/16 v17, 0x0

    .line 544
    .line 545
    const/16 v18, 0x0

    .line 546
    .line 547
    const/16 v19, 0x0

    .line 548
    .line 549
    const/16 v20, 0x0

    .line 550
    .line 551
    const/16 v21, 0x0

    .line 552
    .line 553
    const/16 v22, 0x0

    .line 554
    .line 555
    const/16 v23, 0x0

    .line 556
    .line 557
    const/16 v24, 0x0

    .line 558
    .line 559
    const-wide/16 v25, 0x0

    .line 560
    .line 561
    invoke-static/range {v8 .. v29}, La/wrs;->a(La/wrs;La/gps;La/jlr;La/ypl0;La/bqr;La/xus;Ljava/lang/String;Ljava/util/List;La/rsp;La/lov;Ljava/util/List;La/yws;ZZZLjava/util/ArrayList;ZJJI)La/wrs;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    invoke-virtual {v2, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v1

    .line 569
    if-eqz v1, :cond_17

    .line 570
    .line 571
    iget-object v0, v0, La/c0t;->t:La/iw20;

    .line 572
    .line 573
    invoke-virtual {v0}, La/iw20;->h()V

    .line 574
    .line 575
    .line 576
    return-void

    .line 577
    :cond_18
    instance-of v2, v1, La/vlr;

    .line 578
    .line 579
    iget-object v9, v0, La/c0t;->L:La/oeg0;

    .line 580
    .line 581
    if-eqz v2, :cond_19

    .line 582
    .line 583
    invoke-virtual {v9}, La/oeg0;->c()La/i1w0;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    new-instance v2, La/c8d;

    .line 592
    .line 593
    sget-object v3, La/y7d;->a:La/v7d;

    .line 594
    .line 595
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 596
    .line 597
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 598
    .line 599
    .line 600
    invoke-static {v1, v2, v0, v1, v5}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    :goto_0
    move-object v2, v1

    .line 605
    check-cast v2, La/paw;

    .line 606
    .line 607
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 608
    .line 609
    .line 610
    move-result v3

    .line 611
    if-eqz v3, :cond_44

    .line 612
    .line 613
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    check-cast v2, La/oe50;

    .line 618
    .line 619
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 620
    .line 621
    .line 622
    goto :goto_0

    .line 623
    :cond_19
    instance-of v2, v1, La/xlr;

    .line 624
    .line 625
    if-eqz v2, :cond_1b

    .line 626
    .line 627
    iget-object v2, v8, La/ocj;->a:La/p7m0;

    .line 628
    .line 629
    :cond_1a
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    move-object v8, v0

    .line 637
    check-cast v8, La/wrs;

    .line 638
    .line 639
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    const-wide/16 v27, 0x0

    .line 643
    .line 644
    const v29, 0x3bfffff

    .line 645
    .line 646
    .line 647
    const/4 v9, 0x0

    .line 648
    const/4 v10, 0x0

    .line 649
    const/4 v11, 0x0

    .line 650
    const/4 v12, 0x0

    .line 651
    const/4 v13, 0x0

    .line 652
    const/4 v14, 0x0

    .line 653
    const/4 v15, 0x0

    .line 654
    const/16 v16, 0x0

    .line 655
    .line 656
    const/16 v17, 0x0

    .line 657
    .line 658
    const/16 v18, 0x0

    .line 659
    .line 660
    const/16 v19, 0x0

    .line 661
    .line 662
    const/16 v20, 0x0

    .line 663
    .line 664
    const/16 v21, 0x0

    .line 665
    .line 666
    const/16 v22, 0x0

    .line 667
    .line 668
    const/16 v23, 0x0

    .line 669
    .line 670
    const/16 v24, 0x0

    .line 671
    .line 672
    const-wide/16 v25, 0x0

    .line 673
    .line 674
    invoke-static/range {v8 .. v29}, La/wrs;->a(La/wrs;La/gps;La/jlr;La/ypl0;La/bqr;La/xus;Ljava/lang/String;Ljava/util/List;La/rsp;La/lov;Ljava/util/List;La/yws;ZZZLjava/util/ArrayList;ZJJI)La/wrs;

    .line 675
    .line 676
    .line 677
    move-result-object v1

    .line 678
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    move-result v0

    .line 682
    if-eqz v0, :cond_1a

    .line 683
    .line 684
    return-void

    .line 685
    :cond_1b
    instance-of v2, v1, La/zlr;

    .line 686
    .line 687
    const/16 v10, 0xa

    .line 688
    .line 689
    iget-object v11, v0, La/c0t;->r:Lorg/xplatform/ufc/api/game/UfcGameParams;

    .line 690
    .line 691
    if-eqz v2, :cond_31

    .line 692
    .line 693
    check-cast v1, La/zlr;

    .line 694
    .line 695
    iget-object v1, v1, La/zlr;->a:La/nus;

    .line 696
    .line 697
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v2

    .line 701
    check-cast v2, La/wrs;

    .line 702
    .line 703
    iget-object v2, v2, La/wrs;->v:Ljava/util/List;

    .line 704
    .line 705
    new-instance v6, Ljava/util/ArrayList;

    .line 706
    .line 707
    invoke-static {v2, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 708
    .line 709
    .line 710
    move-result v7

    .line 711
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 712
    .line 713
    .line 714
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 719
    .line 720
    .line 721
    move-result v7

    .line 722
    if-eqz v7, :cond_1c

    .line 723
    .line 724
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object v7

    .line 728
    check-cast v7, La/t9m0;

    .line 729
    .line 730
    iget-short v7, v7, La/t9m0;->a:S

    .line 731
    .line 732
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 733
    .line 734
    .line 735
    move-result-object v7

    .line 736
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 737
    .line 738
    .line 739
    goto :goto_1

    .line 740
    :cond_1c
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v2

    .line 744
    check-cast v2, La/wrs;

    .line 745
    .line 746
    iget-object v2, v2, La/wrs;->h:Ljava/util/List;

    .line 747
    .line 748
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v7

    .line 752
    check-cast v7, La/wrs;

    .line 753
    .line 754
    iget-object v7, v7, La/wrs;->k:La/lov;

    .line 755
    .line 756
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 757
    .line 758
    .line 759
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 760
    .line 761
    .line 762
    move-result-object v8

    .line 763
    sget-object v9, La/yrs;->c:La/c0o;

    .line 764
    .line 765
    invoke-virtual {v9}, La/b3;->iterator()Ljava/util/Iterator;

    .line 766
    .line 767
    .line 768
    move-result-object v9

    .line 769
    :cond_1d
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 770
    .line 771
    .line 772
    move-result v10

    .line 773
    if-eqz v10, :cond_2a

    .line 774
    .line 775
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v10

    .line 779
    check-cast v10, La/yrs;

    .line 780
    .line 781
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 782
    .line 783
    .line 784
    move-result v12

    .line 785
    iget-object v10, v10, La/yrs;->a:La/t9m0;

    .line 786
    .line 787
    iget-short v10, v10, La/t9m0;->a:S

    .line 788
    .line 789
    if-eqz v12, :cond_28

    .line 790
    .line 791
    if-ne v12, v4, :cond_27

    .line 792
    .line 793
    if-eqz v7, :cond_26

    .line 794
    .line 795
    iget-object v12, v7, La/lov;->e:Ljava/util/List;

    .line 796
    .line 797
    if-eqz v12, :cond_1e

    .line 798
    .line 799
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 800
    .line 801
    .line 802
    move-result v13

    .line 803
    if-eqz v13, :cond_1e

    .line 804
    .line 805
    goto :goto_3

    .line 806
    :cond_1e
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 807
    .line 808
    .line 809
    move-result-object v12

    .line 810
    :cond_1f
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 811
    .line 812
    .line 813
    move-result v13

    .line 814
    if-eqz v13, :cond_20

    .line 815
    .line 816
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    move-result-object v13

    .line 820
    check-cast v13, La/n4t0;

    .line 821
    .line 822
    invoke-static {v13}, La/tlb;->X(La/n4t0;)Z

    .line 823
    .line 824
    .line 825
    move-result v13

    .line 826
    if-eqz v13, :cond_1f

    .line 827
    .line 828
    goto :goto_2

    .line 829
    :cond_20
    :goto_3
    iget-object v12, v7, La/lov;->f:Ljava/util/List;

    .line 830
    .line 831
    if-eqz v12, :cond_21

    .line 832
    .line 833
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 834
    .line 835
    .line 836
    move-result v13

    .line 837
    if-eqz v13, :cond_21

    .line 838
    .line 839
    goto :goto_4

    .line 840
    :cond_21
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 841
    .line 842
    .line 843
    move-result-object v12

    .line 844
    :cond_22
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 845
    .line 846
    .line 847
    move-result v13

    .line 848
    if-eqz v13, :cond_23

    .line 849
    .line 850
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v13

    .line 854
    check-cast v13, La/n4t0;

    .line 855
    .line 856
    invoke-static {v13}, La/tlb;->X(La/n4t0;)Z

    .line 857
    .line 858
    .line 859
    move-result v13

    .line 860
    if-eqz v13, :cond_22

    .line 861
    .line 862
    goto :goto_2

    .line 863
    :cond_23
    :goto_4
    iget-object v12, v7, La/lov;->g:Ljava/util/List;

    .line 864
    .line 865
    if-eqz v12, :cond_24

    .line 866
    .line 867
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 868
    .line 869
    .line 870
    move-result v13

    .line 871
    if-eqz v13, :cond_24

    .line 872
    .line 873
    goto :goto_5

    .line 874
    :cond_24
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 875
    .line 876
    .line 877
    move-result-object v12

    .line 878
    :cond_25
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 879
    .line 880
    .line 881
    move-result v13

    .line 882
    if-eqz v13, :cond_26

    .line 883
    .line 884
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object v13

    .line 888
    check-cast v13, La/n4t0;

    .line 889
    .line 890
    invoke-static {v13}, La/tlb;->X(La/n4t0;)Z

    .line 891
    .line 892
    .line 893
    move-result v13

    .line 894
    if-eqz v13, :cond_25

    .line 895
    .line 896
    goto :goto_2

    .line 897
    :cond_26
    :goto_5
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 898
    .line 899
    .line 900
    move-result-object v10

    .line 901
    invoke-virtual {v8, v10}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 902
    .line 903
    .line 904
    goto/16 :goto_2

    .line 905
    .line 906
    :cond_27
    invoke-static {}, La/t9f;->b()V

    .line 907
    .line 908
    .line 909
    return-void

    .line 910
    :cond_28
    invoke-static {v5, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v12

    .line 914
    check-cast v12, La/mxp;

    .line 915
    .line 916
    invoke-static {v4, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v13

    .line 920
    check-cast v13, La/mxp;

    .line 921
    .line 922
    if-eqz v12, :cond_29

    .line 923
    .line 924
    if-eqz v13, :cond_29

    .line 925
    .line 926
    invoke-static {v12, v13}, La/tdc;->h0(La/mxp;La/mxp;)Z

    .line 927
    .line 928
    .line 929
    move-result v14

    .line 930
    if-nez v14, :cond_1d

    .line 931
    .line 932
    invoke-static {v12, v13}, La/tdc;->a0(La/mxp;La/mxp;)Z

    .line 933
    .line 934
    .line 935
    move-result v14

    .line 936
    if-nez v14, :cond_1d

    .line 937
    .line 938
    invoke-static {v12, v13}, La/tdc;->S(La/mxp;La/mxp;)Z

    .line 939
    .line 940
    .line 941
    move-result v12

    .line 942
    if-nez v12, :cond_1d

    .line 943
    .line 944
    :cond_29
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 945
    .line 946
    .line 947
    move-result-object v10

    .line 948
    invoke-virtual {v8, v10}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 949
    .line 950
    .line 951
    goto/16 :goto_2

    .line 952
    .line 953
    :cond_2a
    invoke-static {v8}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 954
    .line 955
    .line 956
    move-result-object v2

    .line 957
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v7

    .line 961
    check-cast v7, La/wrs;

    .line 962
    .line 963
    iget-object v7, v7, La/wrs;->u:Ljava/util/List;

    .line 964
    .line 965
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 966
    .line 967
    .line 968
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 969
    .line 970
    .line 971
    move-result v8

    .line 972
    if-eqz v8, :cond_2b

    .line 973
    .line 974
    goto :goto_7

    .line 975
    :cond_2b
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 976
    .line 977
    .line 978
    move-result-object v8

    .line 979
    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 980
    .line 981
    .line 982
    move-result v9

    .line 983
    if-eqz v9, :cond_30

    .line 984
    .line 985
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 986
    .line 987
    .line 988
    move-result-object v9

    .line 989
    check-cast v9, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 990
    .line 991
    iget-boolean v10, v9, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->c:Z

    .line 992
    .line 993
    if-eqz v10, :cond_2c

    .line 994
    .line 995
    iget v9, v9, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->b:I

    .line 996
    .line 997
    const v10, 0x7fffffff

    .line 998
    .line 999
    .line 1000
    if-ne v9, v10, :cond_2c

    .line 1001
    .line 1002
    goto :goto_6

    .line 1003
    :cond_2c
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 1004
    .line 1005
    .line 1006
    move-result v8

    .line 1007
    if-eqz v8, :cond_2d

    .line 1008
    .line 1009
    goto :goto_7

    .line 1010
    :cond_2d
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v8

    .line 1014
    :cond_2e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1015
    .line 1016
    .line 1017
    move-result v9

    .line 1018
    if-eqz v9, :cond_30

    .line 1019
    .line 1020
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v9

    .line 1024
    check-cast v9, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 1025
    .line 1026
    iget-boolean v10, v9, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->c:Z

    .line 1027
    .line 1028
    if-eqz v10, :cond_2f

    .line 1029
    .line 1030
    iget v10, v9, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->b:I

    .line 1031
    .line 1032
    invoke-interface {v7, v9}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 1033
    .line 1034
    .line 1035
    move-result v9

    .line 1036
    if-eq v10, v9, :cond_2e

    .line 1037
    .line 1038
    :cond_2f
    move v7, v4

    .line 1039
    goto :goto_8

    .line 1040
    :cond_30
    :goto_7
    move v7, v5

    .line 1041
    :goto_8
    new-instance v8, La/owq0;

    .line 1042
    .line 1043
    invoke-direct {v8, v6, v2, v7}, La/owq0;-><init>(Ljava/util/List;Ljava/util/List;Z)V

    .line 1044
    .line 1045
    .line 1046
    new-instance v2, La/jus;

    .line 1047
    .line 1048
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v6

    .line 1052
    check-cast v6, La/wrs;

    .line 1053
    .line 1054
    iget-object v6, v6, La/wrs;->c:La/jlr;

    .line 1055
    .line 1056
    invoke-static {v6}, La/d5c;->C(La/jlr;)La/m9s;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v6

    .line 1060
    iget v7, v11, Lorg/xplatform/ufc/api/game/UfcGameParams;->g:I

    .line 1061
    .line 1062
    invoke-direct {v2, v6, v8, v7}, La/jus;-><init>(La/m9s;La/owq0;I)V

    .line 1063
    .line 1064
    .line 1065
    new-array v3, v3, [La/nus;

    .line 1066
    .line 1067
    aput-object v2, v3, v5

    .line 1068
    .line 1069
    aput-object v1, v3, v4

    .line 1070
    .line 1071
    iget-object v1, v0, La/c0t;->x:La/rus;

    .line 1072
    .line 1073
    invoke-static {v0, v1, v3}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 1074
    .line 1075
    .line 1076
    return-void

    .line 1077
    :cond_31
    instance-of v2, v1, La/ulr;

    .line 1078
    .line 1079
    iget-object v12, v0, La/c0t;->M:La/kys0;

    .line 1080
    .line 1081
    if-eqz v2, :cond_35

    .line 1082
    .line 1083
    check-cast v1, La/ulr;

    .line 1084
    .line 1085
    iget-object v1, v1, La/ulr;->a:La/ims;

    .line 1086
    .line 1087
    instance-of v2, v1, La/hms;

    .line 1088
    .line 1089
    if-eqz v2, :cond_33

    .line 1090
    .line 1091
    check-cast v1, La/hms;

    .line 1092
    .line 1093
    iget-wide v0, v1, La/hms;->a:J

    .line 1094
    .line 1095
    invoke-virtual {v9}, La/oeg0;->c()La/i1w0;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v2

    .line 1099
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1100
    .line 1101
    .line 1102
    new-instance v3, La/k0w0;

    .line 1103
    .line 1104
    invoke-direct {v3, v2}, La/k0w0;-><init>(La/i1w0;)V

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1108
    .line 1109
    .line 1110
    new-instance v4, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getFighterFragmentScreen$1;

    .line 1111
    .line 1112
    invoke-direct {v4, v0, v1}, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getFighterFragmentScreen$1;-><init>(J)V

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v3, v4}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1116
    .line 1117
    .line 1118
    iget-object v0, v3, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1119
    .line 1120
    invoke-static {v2, v0, v5}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v0

    .line 1124
    :goto_9
    move-object v1, v0

    .line 1125
    check-cast v1, La/paw;

    .line 1126
    .line 1127
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1128
    .line 1129
    .line 1130
    move-result v3

    .line 1131
    if-eqz v3, :cond_32

    .line 1132
    .line 1133
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v1

    .line 1137
    check-cast v1, La/oe50;

    .line 1138
    .line 1139
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 1140
    .line 1141
    .line 1142
    goto :goto_9

    .line 1143
    :cond_32
    return-void

    .line 1144
    :cond_33
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v2

    .line 1148
    check-cast v2, La/wrs;

    .line 1149
    .line 1150
    iget-object v2, v2, La/wrs;->c:La/jlr;

    .line 1151
    .line 1152
    invoke-static {v2}, La/d5c;->C(La/jlr;)La/m9s;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v12

    .line 1156
    if-nez v12, :cond_34

    .line 1157
    .line 1158
    goto/16 :goto_c

    .line 1159
    .line 1160
    :cond_34
    new-instance v6, La/ems;

    .line 1161
    .line 1162
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v2

    .line 1166
    check-cast v2, La/wrs;

    .line 1167
    .line 1168
    iget-object v11, v2, La/wrs;->l:Ljava/util/List;

    .line 1169
    .line 1170
    const-wide/16 v7, 0xbd

    .line 1171
    .line 1172
    const-wide/16 v9, 0x0

    .line 1173
    .line 1174
    invoke-direct/range {v6 .. v12}, La/ems;-><init>(JJLjava/util/List;La/m9s;)V

    .line 1175
    .line 1176
    .line 1177
    new-array v2, v3, [La/ims;

    .line 1178
    .line 1179
    aput-object v6, v2, v5

    .line 1180
    .line 1181
    aput-object v1, v2, v4

    .line 1182
    .line 1183
    iget-object v1, v0, La/c0t;->y:La/g3j;

    .line 1184
    .line 1185
    invoke-static {v0, v1, v2}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 1186
    .line 1187
    .line 1188
    return-void

    .line 1189
    :cond_35
    instance-of v2, v1, La/rlr;

    .line 1190
    .line 1191
    if-eqz v2, :cond_3b

    .line 1192
    .line 1193
    check-cast v1, La/rlr;

    .line 1194
    .line 1195
    iget-object v1, v1, La/rlr;->a:La/hdb;

    .line 1196
    .line 1197
    instance-of v2, v1, La/edb;

    .line 1198
    .line 1199
    if-eqz v2, :cond_39

    .line 1200
    .line 1201
    iget-object v1, v11, Lorg/xplatform/ufc/api/game/UfcGameParams;->f:Ljava/lang/String;

    .line 1202
    .line 1203
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1204
    .line 1205
    .line 1206
    move-result v2

    .line 1207
    if-nez v2, :cond_38

    .line 1208
    .line 1209
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v1

    .line 1213
    check-cast v1, La/wrs;

    .line 1214
    .line 1215
    iget-object v1, v1, La/wrs;->c:La/jlr;

    .line 1216
    .line 1217
    invoke-static {v1}, La/d5c;->C(La/jlr;)La/m9s;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v1

    .line 1221
    if-eqz v1, :cond_36

    .line 1222
    .line 1223
    iget-object v6, v1, La/m9s;->f:Ljava/lang/String;

    .line 1224
    .line 1225
    :cond_36
    if-nez v6, :cond_37

    .line 1226
    .line 1227
    const-string v1, ""

    .line 1228
    .line 1229
    goto :goto_a

    .line 1230
    :cond_37
    move-object v1, v6

    .line 1231
    :cond_38
    :goto_a
    invoke-virtual {v9}, La/oeg0;->c()La/i1w0;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v2

    .line 1235
    new-instance v3, La/f3s;

    .line 1236
    .line 1237
    const/16 v4, 0xb

    .line 1238
    .line 1239
    invoke-direct {v3, v0, v1, v4}, La/f3s;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual {v2, v3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 1243
    .line 1244
    .line 1245
    return-void

    .line 1246
    :cond_39
    instance-of v0, v1, La/fdb;

    .line 1247
    .line 1248
    if-eqz v0, :cond_44

    .line 1249
    .line 1250
    invoke-virtual {v9}, La/oeg0;->c()La/i1w0;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v0

    .line 1254
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1255
    .line 1256
    .line 1257
    new-instance v1, La/k0w0;

    .line 1258
    .line 1259
    invoke-direct {v1, v0}, La/k0w0;-><init>(La/i1w0;)V

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1263
    .line 1264
    .line 1265
    new-instance v2, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getHomeFragmentScreen$1;

    .line 1266
    .line 1267
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1271
    .line 1272
    .line 1273
    iget-object v1, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1274
    .line 1275
    invoke-static {v0, v1, v5}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v1

    .line 1279
    :goto_b
    move-object v2, v1

    .line 1280
    check-cast v2, La/paw;

    .line 1281
    .line 1282
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 1283
    .line 1284
    .line 1285
    move-result v3

    .line 1286
    if-eqz v3, :cond_3a

    .line 1287
    .line 1288
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v2

    .line 1292
    check-cast v2, La/oe50;

    .line 1293
    .line 1294
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 1295
    .line 1296
    .line 1297
    goto :goto_b

    .line 1298
    :cond_3a
    return-void

    .line 1299
    :cond_3b
    instance-of v2, v1, La/slr;

    .line 1300
    .line 1301
    if-eqz v2, :cond_40

    .line 1302
    .line 1303
    check-cast v1, La/slr;

    .line 1304
    .line 1305
    iget-object v1, v1, La/slr;->a:La/uss;

    .line 1306
    .line 1307
    instance-of v2, v1, La/sss;

    .line 1308
    .line 1309
    if-eqz v2, :cond_3d

    .line 1310
    .line 1311
    iget-object v2, v8, La/ocj;->a:La/p7m0;

    .line 1312
    .line 1313
    :cond_3c
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v0

    .line 1317
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1318
    .line 1319
    .line 1320
    move-object v8, v0

    .line 1321
    check-cast v8, La/wrs;

    .line 1322
    .line 1323
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1324
    .line 1325
    .line 1326
    move-object v3, v1

    .line 1327
    check-cast v3, La/sss;

    .line 1328
    .line 1329
    iget-object v3, v3, La/sss;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeVideoEvent;

    .line 1330
    .line 1331
    invoke-static {v3}, La/e49;->a(Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeVideoEvent;)Z

    .line 1332
    .line 1333
    .line 1334
    move-result v22

    .line 1335
    const-wide/16 v27, 0x0

    .line 1336
    .line 1337
    const v29, 0x3fdffff

    .line 1338
    .line 1339
    .line 1340
    const/4 v9, 0x0

    .line 1341
    const/4 v10, 0x0

    .line 1342
    const/4 v11, 0x0

    .line 1343
    const/4 v12, 0x0

    .line 1344
    const/4 v13, 0x0

    .line 1345
    const/4 v14, 0x0

    .line 1346
    const/4 v15, 0x0

    .line 1347
    const/16 v16, 0x0

    .line 1348
    .line 1349
    const/16 v17, 0x0

    .line 1350
    .line 1351
    const/16 v18, 0x0

    .line 1352
    .line 1353
    const/16 v19, 0x0

    .line 1354
    .line 1355
    const/16 v20, 0x0

    .line 1356
    .line 1357
    const/16 v21, 0x0

    .line 1358
    .line 1359
    const/16 v23, 0x0

    .line 1360
    .line 1361
    const/16 v24, 0x0

    .line 1362
    .line 1363
    const-wide/16 v25, 0x0

    .line 1364
    .line 1365
    invoke-static/range {v8 .. v29}, La/wrs;->a(La/wrs;La/gps;La/jlr;La/ypl0;La/bqr;La/xus;Ljava/lang/String;Ljava/util/List;La/rsp;La/lov;Ljava/util/List;La/yws;ZZZLjava/util/ArrayList;ZJJI)La/wrs;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v3

    .line 1369
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1370
    .line 1371
    .line 1372
    move-result v0

    .line 1373
    if-eqz v0, :cond_3c

    .line 1374
    .line 1375
    return-void

    .line 1376
    :cond_3d
    instance-of v1, v1, La/tss;

    .line 1377
    .line 1378
    if-eqz v1, :cond_3f

    .line 1379
    .line 1380
    const/4 v4, 0x0

    .line 1381
    const/4 v5, 0x6

    .line 1382
    iget-object v1, v0, La/c0t;->z:La/xpr;

    .line 1383
    .line 1384
    sget-object v2, La/tpr;->a:La/tpr;

    .line 1385
    .line 1386
    const/4 v3, 0x0

    .line 1387
    invoke-static/range {v0 .. v5}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 1388
    .line 1389
    .line 1390
    iget-object v1, v8, La/ocj;->a:La/p7m0;

    .line 1391
    .line 1392
    :cond_3e
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v2

    .line 1396
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1397
    .line 1398
    .line 1399
    move-object v8, v2

    .line 1400
    check-cast v8, La/wrs;

    .line 1401
    .line 1402
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1403
    .line 1404
    .line 1405
    const-wide/16 v27, 0x0

    .line 1406
    .line 1407
    const v29, 0x3fdffff

    .line 1408
    .line 1409
    .line 1410
    const/4 v9, 0x0

    .line 1411
    const/4 v10, 0x0

    .line 1412
    const/4 v11, 0x0

    .line 1413
    const/4 v12, 0x0

    .line 1414
    const/4 v13, 0x0

    .line 1415
    const/4 v14, 0x0

    .line 1416
    const/4 v15, 0x0

    .line 1417
    const/16 v16, 0x0

    .line 1418
    .line 1419
    const/16 v17, 0x0

    .line 1420
    .line 1421
    const/16 v18, 0x0

    .line 1422
    .line 1423
    const/16 v19, 0x0

    .line 1424
    .line 1425
    const/16 v20, 0x0

    .line 1426
    .line 1427
    const/16 v21, 0x0

    .line 1428
    .line 1429
    const/16 v22, 0x1

    .line 1430
    .line 1431
    const/16 v23, 0x0

    .line 1432
    .line 1433
    const/16 v24, 0x0

    .line 1434
    .line 1435
    const-wide/16 v25, 0x0

    .line 1436
    .line 1437
    invoke-static/range {v8 .. v29}, La/wrs;->a(La/wrs;La/gps;La/jlr;La/ypl0;La/bqr;La/xus;Ljava/lang/String;Ljava/util/List;La/rsp;La/lov;Ljava/util/List;La/yws;ZZZLjava/util/ArrayList;ZJJI)La/wrs;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v3

    .line 1441
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1442
    .line 1443
    .line 1444
    move-result v2

    .line 1445
    if-eqz v2, :cond_3e

    .line 1446
    .line 1447
    iget-object v0, v0, La/c0t;->G:La/zsr;

    .line 1448
    .line 1449
    invoke-virtual {v0}, La/zsr;->a()V

    .line 1450
    .line 1451
    .line 1452
    return-void

    .line 1453
    :cond_3f
    invoke-static {}, La/t9f;->b()V

    .line 1454
    .line 1455
    .line 1456
    return-void

    .line 1457
    :cond_40
    instance-of v2, v1, La/ylr;

    .line 1458
    .line 1459
    if-eqz v2, :cond_45

    .line 1460
    .line 1461
    check-cast v1, La/ylr;

    .line 1462
    .line 1463
    iget-object v0, v1, La/ylr;->a:Ljava/lang/String;

    .line 1464
    .line 1465
    const-string v2, "GENERAL_STATISTIC"

    .line 1466
    .line 1467
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1468
    .line 1469
    .line 1470
    move-result v2

    .line 1471
    if-eqz v2, :cond_42

    .line 1472
    .line 1473
    iget-object v2, v8, La/ocj;->a:La/p7m0;

    .line 1474
    .line 1475
    :cond_41
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v0

    .line 1479
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1480
    .line 1481
    .line 1482
    move-object v8, v0

    .line 1483
    check-cast v8, La/wrs;

    .line 1484
    .line 1485
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1486
    .line 1487
    .line 1488
    iget-wide v3, v1, La/ylr;->b:J

    .line 1489
    .line 1490
    const-wide/16 v27, 0x0

    .line 1491
    .line 1492
    const v29, 0x37fffff

    .line 1493
    .line 1494
    .line 1495
    const/4 v9, 0x0

    .line 1496
    const/4 v10, 0x0

    .line 1497
    const/4 v11, 0x0

    .line 1498
    const/4 v12, 0x0

    .line 1499
    const/4 v13, 0x0

    .line 1500
    const/4 v14, 0x0

    .line 1501
    const/4 v15, 0x0

    .line 1502
    const/16 v16, 0x0

    .line 1503
    .line 1504
    const/16 v17, 0x0

    .line 1505
    .line 1506
    const/16 v18, 0x0

    .line 1507
    .line 1508
    const/16 v19, 0x0

    .line 1509
    .line 1510
    const/16 v20, 0x0

    .line 1511
    .line 1512
    const/16 v21, 0x0

    .line 1513
    .line 1514
    const/16 v22, 0x0

    .line 1515
    .line 1516
    const/16 v23, 0x0

    .line 1517
    .line 1518
    const/16 v24, 0x0

    .line 1519
    .line 1520
    move-wide/from16 v25, v3

    .line 1521
    .line 1522
    invoke-static/range {v8 .. v29}, La/wrs;->a(La/wrs;La/gps;La/jlr;La/ypl0;La/bqr;La/xus;Ljava/lang/String;Ljava/util/List;La/rsp;La/lov;Ljava/util/List;La/yws;ZZZLjava/util/ArrayList;ZJJI)La/wrs;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v3

    .line 1526
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1527
    .line 1528
    .line 1529
    move-result v0

    .line 1530
    if-eqz v0, :cond_41

    .line 1531
    .line 1532
    return-void

    .line 1533
    :cond_42
    const-string v2, "HEAD_TO_HEAD_STATISTIC"

    .line 1534
    .line 1535
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1536
    .line 1537
    .line 1538
    move-result v0

    .line 1539
    if-eqz v0, :cond_44

    .line 1540
    .line 1541
    iget-object v0, v8, La/ocj;->a:La/p7m0;

    .line 1542
    .line 1543
    :cond_43
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v2

    .line 1547
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1548
    .line 1549
    .line 1550
    move-object v8, v2

    .line 1551
    check-cast v8, La/wrs;

    .line 1552
    .line 1553
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1554
    .line 1555
    .line 1556
    iget-wide v3, v1, La/ylr;->b:J

    .line 1557
    .line 1558
    const v29, 0x2ffffff

    .line 1559
    .line 1560
    .line 1561
    const/4 v9, 0x0

    .line 1562
    const/4 v10, 0x0

    .line 1563
    const/4 v11, 0x0

    .line 1564
    const/4 v12, 0x0

    .line 1565
    const/4 v13, 0x0

    .line 1566
    const/4 v14, 0x0

    .line 1567
    const/4 v15, 0x0

    .line 1568
    const/16 v16, 0x0

    .line 1569
    .line 1570
    const/16 v17, 0x0

    .line 1571
    .line 1572
    const/16 v18, 0x0

    .line 1573
    .line 1574
    const/16 v19, 0x0

    .line 1575
    .line 1576
    const/16 v20, 0x0

    .line 1577
    .line 1578
    const/16 v21, 0x0

    .line 1579
    .line 1580
    const/16 v22, 0x0

    .line 1581
    .line 1582
    const/16 v23, 0x0

    .line 1583
    .line 1584
    const/16 v24, 0x0

    .line 1585
    .line 1586
    const-wide/16 v25, 0x0

    .line 1587
    .line 1588
    move-wide/from16 v27, v3

    .line 1589
    .line 1590
    invoke-static/range {v8 .. v29}, La/wrs;->a(La/wrs;La/gps;La/jlr;La/ypl0;La/bqr;La/xus;Ljava/lang/String;Ljava/util/List;La/rsp;La/lov;Ljava/util/List;La/yws;ZZZLjava/util/ArrayList;ZJJI)La/wrs;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v3

    .line 1594
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1595
    .line 1596
    .line 1597
    move-result v2

    .line 1598
    if-eqz v2, :cond_43

    .line 1599
    .line 1600
    :cond_44
    :goto_c
    return-void

    .line 1601
    :cond_45
    instance-of v2, v1, La/tlr;

    .line 1602
    .line 1603
    if-eqz v2, :cond_47

    .line 1604
    .line 1605
    check-cast v1, La/tlr;

    .line 1606
    .line 1607
    iget-object v2, v1, La/tlr;->a:Ljava/lang/String;

    .line 1608
    .line 1609
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1610
    .line 1611
    .line 1612
    move-result v2

    .line 1613
    if-nez v2, :cond_46

    .line 1614
    .line 1615
    new-instance v1, La/srs;

    .line 1616
    .line 1617
    new-array v2, v5, [Ljava/lang/Object;

    .line 1618
    .line 1619
    iget-object v3, v0, La/c0t;->O:La/ctf0;

    .line 1620
    .line 1621
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 1622
    .line 1623
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v2

    .line 1627
    const v4, 0x7f1313ec    # 1.9549996E38f

    .line 1628
    .line 1629
    .line 1630
    invoke-virtual {v3, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v2

    .line 1634
    invoke-direct {v1, v2}, La/srs;-><init>(Ljava/lang/String;)V

    .line 1635
    .line 1636
    .line 1637
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1638
    .line 1639
    .line 1640
    return-void

    .line 1641
    :cond_46
    invoke-virtual {v9}, La/oeg0;->c()La/i1w0;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v2

    .line 1645
    new-instance v3, La/f3s;

    .line 1646
    .line 1647
    invoke-direct {v3, v0, v1, v10}, La/f3s;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1648
    .line 1649
    .line 1650
    invoke-virtual {v2, v3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 1651
    .line 1652
    .line 1653
    return-void

    .line 1654
    :cond_47
    invoke-static {}, La/t9f;->b()V

    .line 1655
    .line 1656
    .line 1657
    return-void
.end method
