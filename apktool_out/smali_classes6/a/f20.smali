.class public final La/f20;
.super La/w46;
.source "SourceFile"


# static fields
.field public static final F:Ljava/util/List;


# instance fields
.field public final A:La/p7m0;

.field public final B:La/ol60;

.field public C:Z

.field public final D:La/ra10;

.field public final E:La/ra10;

.field public final b:I

.field public final c:La/i1w0;

.field public final d:La/vzg0;

.field public final e:La/ctf0;

.field public final f:La/mne;

.field public final g:La/m1e;

.field public final h:La/l9u0;

.field public final i:La/r46;

.field public final j:La/ljf0;

.field public final k:La/j9i;

.field public final l:La/y2m0;

.field public final m:La/xuz;

.field public final n:La/xb5;

.field public final o:La/rou;

.field public final p:La/r9u;

.field public final q:La/ok50;

.field public final r:La/ljf0;

.field public final s:La/v8d;

.field public final t:La/sff0;

.field public final u:La/p7m0;

.field public final v:Z

.field public w:La/bby;

.field public x:La/bby;

.field public y:La/c4m0;

.field public z:La/c4m0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/cau0;->d:La/cau0;

    .line 2
    .line 3
    sget-object v1, La/cau0;->e:La/cau0;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [La/cau0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, La/f20;->F:Ljava/util/List;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(ILa/i1w0;La/vzg0;La/ctf0;La/mne;La/m1e;La/l9u0;La/r46;La/ljf0;La/j9i;La/y2m0;La/xuz;La/xb5;La/rou;La/r9u;La/ok50;La/ljf0;La/bzt;La/sa10;La/pru;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, La/w46;-><init>()V

    .line 11
    .line 12
    .line 13
    iput p1, p0, La/f20;->b:I

    .line 14
    .line 15
    iput-object p2, p0, La/f20;->c:La/i1w0;

    .line 16
    .line 17
    iput-object p3, p0, La/f20;->d:La/vzg0;

    .line 18
    .line 19
    iput-object p4, p0, La/f20;->e:La/ctf0;

    .line 20
    .line 21
    iput-object p5, p0, La/f20;->f:La/mne;

    .line 22
    .line 23
    iput-object p6, p0, La/f20;->g:La/m1e;

    .line 24
    .line 25
    iput-object p7, p0, La/f20;->h:La/l9u0;

    .line 26
    .line 27
    iput-object p8, p0, La/f20;->i:La/r46;

    .line 28
    .line 29
    iput-object p9, p0, La/f20;->j:La/ljf0;

    .line 30
    .line 31
    iput-object p10, p0, La/f20;->k:La/j9i;

    .line 32
    .line 33
    iput-object p11, p0, La/f20;->l:La/y2m0;

    .line 34
    .line 35
    iput-object p12, p0, La/f20;->m:La/xuz;

    .line 36
    .line 37
    iput-object p13, p0, La/f20;->n:La/xb5;

    .line 38
    .line 39
    iput-object p14, p0, La/f20;->o:La/rou;

    .line 40
    .line 41
    move-object/from16 p1, p15

    .line 42
    .line 43
    iput-object p1, p0, La/f20;->p:La/r9u;

    .line 44
    .line 45
    move-object/from16 p1, p16

    .line 46
    .line 47
    iput-object p1, p0, La/f20;->q:La/ok50;

    .line 48
    .line 49
    move-object/from16 p1, p17

    .line 50
    .line 51
    iput-object p1, p0, La/f20;->r:La/ljf0;

    .line 52
    .line 53
    move-object/from16 p1, p18

    .line 54
    .line 55
    iget-object p1, p1, La/bzt;->a:La/fsd;

    .line 56
    .line 57
    invoke-virtual {p1}, La/fsd;->a()La/v8d;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, p0, La/f20;->s:La/v8d;

    .line 62
    .line 63
    invoke-virtual/range {p20 .. p20}, La/pru;->a()La/sff0;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    iput-object p2, p0, La/f20;->t:La/sff0;

    .line 68
    .line 69
    sget-object p2, La/cau0;->b:La/cau0;

    .line 70
    .line 71
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    iput-object p2, p0, La/f20;->u:La/p7m0;

    .line 76
    .line 77
    iget-object p1, p1, La/v8d;->p:La/lxw;

    .line 78
    .line 79
    sget-object p2, La/lxw;->b:La/lxw;

    .line 80
    .line 81
    const/4 p3, 0x1

    .line 82
    if-ne p1, p2, :cond_0

    .line 83
    .line 84
    move p1, p3

    .line 85
    goto :goto_0

    .line 86
    :cond_0
    const/4 p1, 0x0

    .line 87
    :goto_0
    iput-boolean p1, p0, La/f20;->v:Z

    .line 88
    .line 89
    sget-object p1, La/z10;->a:La/z10;

    .line 90
    .line 91
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iput-object p1, p0, La/f20;->A:La/p7m0;

    .line 96
    .line 97
    new-instance p1, La/ol60;

    .line 98
    .line 99
    sget-object p2, La/i99;->b:La/i99;

    .line 100
    .line 101
    invoke-direct {p1, p3, p2}, La/ol60;-><init>(ILa/i99;)V

    .line 102
    .line 103
    .line 104
    iput-object p1, p0, La/f20;->B:La/ol60;

    .line 105
    .line 106
    sget-object p5, La/pb10;->g:La/pb10;

    .line 107
    .line 108
    new-instance p6, La/f8;

    .line 109
    .line 110
    const/4 p1, 0x0

    .line 111
    const/4 p2, 0x5

    .line 112
    const/4 p7, 0x0

    .line 113
    const-class p3, La/f20;

    .line 114
    .line 115
    const-string p4, "onRefreshData"

    .line 116
    .line 117
    const-string v0, "onRefreshData()V"

    .line 118
    .line 119
    move-object p8, p0

    .line 120
    move p12, p1

    .line 121
    move p13, p2

    .line 122
    move-object p9, p3

    .line 123
    move-object p10, p4

    .line 124
    move-object p11, v0

    .line 125
    invoke-direct/range {p6 .. p13}, La/f8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 126
    .line 127
    .line 128
    const/16 p2, 0x10

    .line 129
    .line 130
    const p3, 0x7f130677

    .line 131
    .line 132
    .line 133
    const p7, 0x7f131111

    .line 134
    .line 135
    .line 136
    move p9, p2

    .line 137
    move-object p8, p6

    .line 138
    move-object/from16 p4, p19

    .line 139
    .line 140
    move p6, p3

    .line 141
    invoke-static/range {p4 .. p9}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    iput-object p2, p0, La/f20;->D:La/ra10;

    .line 146
    .line 147
    const/4 p2, 0x0

    .line 148
    const/16 p3, 0x1c

    .line 149
    .line 150
    const p6, 0x7f130e12

    .line 151
    .line 152
    .line 153
    const/4 p7, 0x0

    .line 154
    move-object p8, p2

    .line 155
    move p9, p3

    .line 156
    invoke-static/range {p4 .. p9}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    iput-object p2, p0, La/f20;->E:La/ra10;

    .line 161
    .line 162
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 8

    .line 1
    iget-object v0, p0, La/f20;->A:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    sget-object v2, La/z10;->a:La/z10;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/f20;->w:La/bby;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v2, 0x1

    .line 21
    if-ne v0, v2, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, La/f20;->w:La/bby;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-object v0, p0, La/f20;->f:La/mne;

    .line 35
    .line 36
    iget-object v5, v0, La/mne;->a:La/rwj;

    .line 37
    .line 38
    new-instance v3, La/u10;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    invoke-direct {v3, p0, v0}, La/u10;-><init>(La/f20;B)V

    .line 42
    .line 43
    .line 44
    new-instance v6, La/oa;

    .line 45
    .line 46
    const/4 v0, 0x3

    .line 47
    invoke-direct {v6, p0, v1, v0}, La/oa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 48
    .line 49
    .line 50
    const/16 v7, 0xa

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, La/f20;->w:La/bby;

    .line 58
    .line 59
    return-void
.end method

.method public final v()V
    .locals 2

    .line 1
    iget-object v0, p0, La/f20;->w:La/bby;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, La/f20;->x:La/bby;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    iget-object p0, p0, La/f20;->y:La/c4m0;

    .line 17
    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 21
    .line 22
    .line 23
    :cond_2
    return-void
.end method

.method public final w(ZLa/zje;)Ljava/lang/Enum;
    .locals 8

    .line 1
    instance-of v0, p2, La/d20;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/d20;

    .line 7
    .line 8
    iget v1, v0, La/d20;->k:I

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
    iput v1, v0, La/d20;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/d20;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/d20;-><init>(La/f20;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/d20;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/d20;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v3, v0, La/d20;->k:I

    .line 51
    .line 52
    iget-object p2, p0, La/f20;->o:La/rou;

    .line 53
    .line 54
    invoke-virtual {p2, p1, v0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    if-ne p2, v1, :cond_3

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_3
    :goto_1
    check-cast p2, La/m2c0;

    .line 62
    .line 63
    iget-object p1, p2, La/m2c0;->k:La/jqt0;

    .line 64
    .line 65
    iget-object v0, p2, La/m2c0;->e0:La/cau0;

    .line 66
    .line 67
    sget-object v1, La/jqt0;->e:La/jqt0;

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    if-eq p1, v1, :cond_5

    .line 71
    .line 72
    sget-object v1, La/jqt0;->d:La/jqt0;

    .line 73
    .line 74
    if-ne p1, v1, :cond_4

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    move p1, v2

    .line 78
    goto :goto_3

    .line 79
    :cond_5
    :goto_2
    move p1, v3

    .line 80
    :goto_3
    sget-object v1, La/cau0;->f:La/cau0;

    .line 81
    .line 82
    if-eq v0, v1, :cond_7

    .line 83
    .line 84
    iget-boolean v1, p2, La/m2c0;->s0:Z

    .line 85
    .line 86
    if-eqz v1, :cond_6

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_6
    move v1, v2

    .line 90
    goto :goto_5

    .line 91
    :cond_7
    :goto_4
    move v1, v3

    .line 92
    :goto_5
    if-eqz p1, :cond_c

    .line 93
    .line 94
    if-nez v1, :cond_c

    .line 95
    .line 96
    iget-object p1, p0, La/f20;->t:La/sff0;

    .line 97
    .line 98
    iget-boolean p1, p1, La/sff0;->M1:Z

    .line 99
    .line 100
    if-eqz p1, :cond_c

    .line 101
    .line 102
    sget-object p1, La/ygp;->i:La/ygp;

    .line 103
    .line 104
    iget-object v1, p0, La/f20;->p:La/r9u;

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iget-object v1, v1, La/r9u;->a:La/j1q0;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object v1, v1, La/j1q0;->a:La/m1q0;

    .line 115
    .line 116
    invoke-virtual {v1, p1}, La/m1q0;->d(La/ygp;)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    iget-object v1, p2, La/m2c0;->j:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v1}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    if-eqz v1, :cond_8

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 129
    .line 130
    .line 131
    move-result-wide v4

    .line 132
    sget-object v1, La/wen;->b:La/uen;

    .line 133
    .line 134
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 135
    .line 136
    .line 137
    move-result-wide v6

    .line 138
    sget-object v1, La/bfn;->e:La/bfn;

    .line 139
    .line 140
    invoke-static {v4, v5, v1}, La/ibc;->w0(JLa/bfn;)J

    .line 141
    .line 142
    .line 143
    move-result-wide v4

    .line 144
    invoke-static {v4, v5}, La/wen;->e(J)J

    .line 145
    .line 146
    .line 147
    move-result-wide v4

    .line 148
    sub-long/2addr v6, v4

    .line 149
    sget-object v1, La/bfn;->d:La/bfn;

    .line 150
    .line 151
    invoke-static {v6, v7, v1}, La/ibc;->w0(JLa/bfn;)J

    .line 152
    .line 153
    .line 154
    move-result-wide v4

    .line 155
    sget-object v1, La/bfn;->h:La/bfn;

    .line 156
    .line 157
    invoke-static {v4, v5, v1}, La/wen;->l(JLa/bfn;)J

    .line 158
    .line 159
    .line 160
    move-result-wide v4

    .line 161
    goto :goto_6

    .line 162
    :cond_8
    const-wide v4, 0x7fffffffffffffffL

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    :goto_6
    const-wide/16 v6, 0x5a

    .line 168
    .line 169
    cmp-long v1, v4, v6

    .line 170
    .line 171
    if-gtz v1, :cond_9

    .line 172
    .line 173
    move v1, v3

    .line 174
    goto :goto_7

    .line 175
    :cond_9
    move v1, v2

    .line 176
    :goto_7
    iget-object v4, p0, La/f20;->s:La/v8d;

    .line 177
    .line 178
    iget-object v4, v4, La/v8d;->p:La/lxw;

    .line 179
    .line 180
    sget-object v5, La/lxw;->b:La/lxw;

    .line 181
    .line 182
    if-ne v4, v5, :cond_a

    .line 183
    .line 184
    move v4, v3

    .line 185
    goto :goto_8

    .line 186
    :cond_a
    move v4, v2

    .line 187
    :goto_8
    sget-object v5, La/cau0;->h:La/cau0;

    .line 188
    .line 189
    if-ne v0, v5, :cond_b

    .line 190
    .line 191
    move v2, v3

    .line 192
    :cond_b
    iget-boolean p2, p2, La/m2c0;->P:Z

    .line 193
    .line 194
    iget-object v5, p0, La/f20;->q:La/ok50;

    .line 195
    .line 196
    iget-object v5, v5, La/ok50;->a:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v5, La/nmt0;

    .line 199
    .line 200
    iget-object v5, v5, La/nmt0;->a:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v5, La/jau0;

    .line 203
    .line 204
    iget-boolean v5, v5, La/jau0;->a:Z

    .line 205
    .line 206
    if-eqz v4, :cond_c

    .line 207
    .line 208
    if-eqz v2, :cond_c

    .line 209
    .line 210
    if-nez p2, :cond_c

    .line 211
    .line 212
    if-eqz v1, :cond_c

    .line 213
    .line 214
    if-nez v5, :cond_c

    .line 215
    .line 216
    if-eqz p1, :cond_c

    .line 217
    .line 218
    iget-object p1, p0, La/f20;->B:La/ol60;

    .line 219
    .line 220
    sget-object p2, La/v10;->a:La/v10;

    .line 221
    .line 222
    invoke-virtual {p1, p2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    iget-object p0, p0, La/f20;->r:La/ljf0;

    .line 226
    .line 227
    iget-object p0, p0, La/ljf0;->a:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast p0, La/nmt0;

    .line 230
    .line 231
    iget-object p0, p0, La/nmt0;->a:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast p0, La/jau0;

    .line 234
    .line 235
    iput-boolean v3, p0, La/jau0;->a:Z

    .line 236
    .line 237
    :cond_c
    return-object v0
.end method

.method public final x()V
    .locals 9

    .line 1
    iget-object v0, p0, La/f20;->u:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, La/cau0;->h:La/cau0;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iget-object v0, p0, La/f20;->f:La/mne;

    .line 17
    .line 18
    iget-object v6, v0, La/mne;->a:La/rwj;

    .line 19
    .line 20
    new-instance v4, La/b5;

    .line 21
    .line 22
    const/16 v0, 0xa

    .line 23
    .line 24
    invoke-direct {v4, v0}, La/b5;-><init>(B)V

    .line 25
    .line 26
    .line 27
    new-instance v7, La/e20;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-direct {v7, p0, v0, v2}, La/e20;-><init>(La/f20;La/yje;B)V

    .line 31
    .line 32
    .line 33
    const/16 v8, 0xa

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    iget-boolean v0, p0, La/f20;->v:Z

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    const-string v0, "DELAY_USER_DATA_UPDATE_KEY"

    .line 45
    .line 46
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 47
    .line 48
    iget-object v3, p0, La/f20;->d:La/vzg0;

    .line 49
    .line 50
    invoke-virtual {v3, v0, v1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, La/f20;->c:La/i1w0;

    .line 54
    .line 55
    invoke-static {v0, v0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object p0, p0, La/f20;->m:La/xuz;

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance p0, Lorg/xplatform/verification/nomapay/impl/navigation/NomaPayWebScreens$NomaPayFragmentScreen;

    .line 65
    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 70
    .line 71
    .line 72
    iget-object p0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 73
    .line 74
    invoke-static {v0, p0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    :goto_0
    move-object v1, p0

    .line 79
    check-cast v1, La/paw;

    .line 80
    .line 81
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_1

    .line 86
    .line 87
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, La/oe50;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, La/i1w0;->a(La/oe50;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    return-void
.end method

.method public final y(La/ra10;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/f20;->v()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/b20;

    .line 5
    .line 6
    invoke-direct {v0, p1}, La/b20;-><init>(La/ra10;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/f20;->A:La/p7m0;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {p0, p1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final z()V
    .locals 5

    .line 1
    iget-object v0, p0, La/f20;->u:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/cau0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x4

    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x6

    .line 18
    iget-object p0, p0, La/f20;->c:La/i1w0;

    .line 19
    .line 20
    if-eq v0, v2, :cond_0

    .line 21
    .line 22
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v2, La/c8d;

    .line 27
    .line 28
    sget-object v3, La/y7d;->a:La/v7d;

    .line 29
    .line 30
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 31
    .line 32
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v2, p0, v0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    move-object v1, v0

    .line 40
    check-cast v1, La/paw;

    .line 41
    .line 42
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, La/oe50;

    .line 53
    .line 54
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v2, La/c8d;

    .line 63
    .line 64
    sget-object v3, La/y7d;->a:La/v7d;

    .line 65
    .line 66
    sget-object v4, La/u0w0;->a:La/u0w0;

    .line 67
    .line 68
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v2, p0, v0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :goto_1
    move-object v1, v0

    .line 76
    check-cast v1, La/paw;

    .line 77
    .line 78
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_1

    .line 83
    .line 84
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, La/oe50;

    .line 89
    .line 90
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    return-void
.end method
