.class public final La/tjb0;
.super La/x2t0;
.source "SourceFile"


# static fields
.field public static final synthetic A:I


# instance fields
.field public final h:La/u58;

.field public final i:La/zg;

.field public final j:La/nv20;

.field public final k:La/fvt0;

.field public final l:La/vjp;

.field public final m:La/oeg0;

.field public final n:La/ivn;

.field public final o:La/ctf0;

.field public final p:La/qv2;

.field public final q:La/gg5;

.field public final r:La/eke0;

.field public final s:La/y3v;

.field public final t:La/bn6;

.field public final u:La/je;

.field public final v:La/vqc;

.field public final w:La/h3c;

.field public final x:La/rrc;

.field public final y:La/yo4;

.field public final z:La/zr1;


# direct methods
.method public constructor <init>(La/u58;La/zg;La/nv20;La/fvt0;La/vjp;La/oeg0;La/ivn;La/ctf0;La/qv2;La/gg5;La/eke0;La/y3v;La/bn6;La/je;La/vqc;La/h3c;La/rrc;La/yo4;La/zr1;)V
    .locals 2

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/npa0;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/npa0;-><init>(B)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, La/x2t0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La/tjb0;->h:La/u58;

    .line 15
    .line 16
    iput-object p2, p0, La/tjb0;->i:La/zg;

    .line 17
    .line 18
    iput-object p3, p0, La/tjb0;->j:La/nv20;

    .line 19
    .line 20
    iput-object p4, p0, La/tjb0;->k:La/fvt0;

    .line 21
    .line 22
    iput-object p5, p0, La/tjb0;->l:La/vjp;

    .line 23
    .line 24
    iput-object p6, p0, La/tjb0;->m:La/oeg0;

    .line 25
    .line 26
    iput-object p7, p0, La/tjb0;->n:La/ivn;

    .line 27
    .line 28
    iput-object p8, p0, La/tjb0;->o:La/ctf0;

    .line 29
    .line 30
    iput-object p9, p0, La/tjb0;->p:La/qv2;

    .line 31
    .line 32
    iput-object p10, p0, La/tjb0;->q:La/gg5;

    .line 33
    .line 34
    iput-object p11, p0, La/tjb0;->r:La/eke0;

    .line 35
    .line 36
    iput-object p12, p0, La/tjb0;->s:La/y3v;

    .line 37
    .line 38
    iput-object p13, p0, La/tjb0;->t:La/bn6;

    .line 39
    .line 40
    move-object/from16 p1, p14

    .line 41
    .line 42
    iput-object p1, p0, La/tjb0;->u:La/je;

    .line 43
    .line 44
    move-object/from16 p1, p15

    .line 45
    .line 46
    iput-object p1, p0, La/tjb0;->v:La/vqc;

    .line 47
    .line 48
    move-object/from16 p1, p16

    .line 49
    .line 50
    iput-object p1, p0, La/tjb0;->w:La/h3c;

    .line 51
    .line 52
    move-object/from16 p1, p17

    .line 53
    .line 54
    iput-object p1, p0, La/tjb0;->x:La/rrc;

    .line 55
    .line 56
    move-object/from16 p1, p18

    .line 57
    .line 58
    iput-object p1, p0, La/tjb0;->y:La/yo4;

    .line 59
    .line 60
    move-object/from16 p1, p19

    .line 61
    .line 62
    iput-object p1, p0, La/tjb0;->z:La/zr1;

    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;La/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/c5l0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/tjb0;->l(La/c5l0;La/zje;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final i()V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/e5l0;

    .line 6
    .line 7
    iget-object v0, v0, La/e5l0;->e:La/cmb0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-string v1, "option"

    .line 14
    .line 15
    const-string v2, "popular_top_all_click"

    .line 16
    .line 17
    iget-object v3, p0, La/tjb0;->i:La/zg;

    .line 18
    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    if-eq v0, v4, :cond_3

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    if-eq v0, v4, :cond_2

    .line 26
    .line 27
    const/4 v4, 0x3

    .line 28
    if-eq v0, v4, :cond_1

    .line 29
    .line 30
    const/4 v4, 0x4

    .line 31
    if-ne v0, v4, :cond_0

    .line 32
    .line 33
    iget-object v0, v3, La/zg;->a:La/kt2;

    .line 34
    .line 35
    const-string v3, "champ_all"

    .line 36
    .line 37
    invoke-static {v1, v3, v0, v2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    iget-object v0, v3, La/zg;->a:La/kt2;

    .line 46
    .line 47
    const-string v3, "cybersport"

    .line 48
    .line 49
    invoke-static {v1, v3, v0, v2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    iget-object v0, v3, La/zg;->a:La/kt2;

    .line 54
    .line 55
    const-string v3, "popular_line"

    .line 56
    .line 57
    invoke-static {v1, v3, v0, v2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    iget-object v0, v3, La/zg;->a:La/kt2;

    .line 62
    .line 63
    const-string v3, "popular_live"

    .line 64
    .line 65
    invoke-static {v1, v3, v0, v2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    iget-object v0, v3, La/zg;->a:La/kt2;

    .line 70
    .line 71
    const-string v3, "champ_live"

    .line 72
    .line 73
    invoke-static {v1, v3, v0, v2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, La/e5l0;

    .line 81
    .line 82
    iget-object v0, v0, La/e5l0;->f:La/y1p;

    .line 83
    .line 84
    iget-object p0, p0, La/tjb0;->q:La/gg5;

    .line 85
    .line 86
    invoke-virtual {p0, v0}, La/gg5;->t(La/y1p;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final j(JJLa/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p5, La/njb0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/njb0;

    .line 7
    .line 8
    iget v1, v0, La/njb0;->m:I

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
    iput v1, v0, La/njb0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/njb0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, La/njb0;-><init>(La/tjb0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/njb0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/njb0;->m:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_3

    .line 33
    .line 34
    if-ne v2, v3, :cond_2

    .line 35
    .line 36
    iget-wide p3, v0, La/njb0;->j:J

    .line 37
    .line 38
    iget-wide p1, v0, La/njb0;->i:J

    .line 39
    .line 40
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    move-wide v5, p1

    .line 44
    move-wide v3, p3

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_3
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput-wide p1, v0, La/njb0;->i:J

    .line 57
    .line 58
    iput-wide p3, v0, La/njb0;->j:J

    .line 59
    .line 60
    iput v3, v0, La/njb0;->m:I

    .line 61
    .line 62
    iget-object p5, p0, La/tjb0;->w:La/h3c;

    .line 63
    .line 64
    invoke-virtual {p5, p1, p2, v0}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p5

    .line 68
    if-ne p5, v1, :cond_1

    .line 69
    .line 70
    return-object v1

    .line 71
    :goto_1
    check-cast p5, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-nez p1, :cond_4

    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_4
    new-instance v2, La/qp7;

    .line 83
    .line 84
    const/4 v8, 0x7

    .line 85
    move-object v7, p0

    .line 86
    invoke-direct/range {v2 .. v8}, La/qp7;-><init>(JJLjava/lang/Object;B)V

    .line 87
    .line 88
    .line 89
    invoke-static {v2}, La/pzb;->C(Lkotlin/jvm/functions/Function1;)La/m1g;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    iget-object p1, v7, La/tjb0;->v:La/vqc;

    .line 94
    .line 95
    invoke-virtual {p1, p0}, La/vqc;->k(La/m1g;)V

    .line 96
    .line 97
    .line 98
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0
.end method

.method public final k(JJJLa/zje;Z)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    instance-of v2, v1, La/ojb0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/ojb0;

    .line 11
    .line 12
    iget v3, v2, La/ojb0;->o:I

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
    iput v3, v2, La/ojb0;->o:I

    .line 22
    .line 23
    :goto_0
    move-object v5, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, La/ojb0;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, La/ojb0;-><init>(La/tjb0;La/zje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v5, La/ojb0;->m:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v6, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v2, v5, La/ojb0;->o:I

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-boolean v2, v5, La/ojb0;->l:Z

    .line 43
    .line 44
    iget-wide v3, v5, La/ojb0;->k:J

    .line 45
    .line 46
    iget-wide v6, v5, La/ojb0;->j:J

    .line 47
    .line 48
    iget-wide v8, v5, La/ojb0;->i:J

    .line 49
    .line 50
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move v15, v2

    .line 54
    move-wide v12, v3

    .line 55
    move-wide v10, v6

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    return-object v0

    .line 64
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-wide/from16 v1, p1

    .line 68
    .line 69
    iput-wide v1, v5, La/ojb0;->i:J

    .line 70
    .line 71
    move-wide/from16 v7, p3

    .line 72
    .line 73
    iput-wide v7, v5, La/ojb0;->j:J

    .line 74
    .line 75
    move-wide/from16 v9, p5

    .line 76
    .line 77
    iput-wide v9, v5, La/ojb0;->k:J

    .line 78
    .line 79
    move/from16 v11, p8

    .line 80
    .line 81
    iput-boolean v11, v5, La/ojb0;->l:Z

    .line 82
    .line 83
    iput v3, v5, La/ojb0;->o:I

    .line 84
    .line 85
    move-wide v3, v9

    .line 86
    invoke-virtual/range {v0 .. v5}, La/tjb0;->j(JJLa/zje;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    if-ne v5, v6, :cond_3

    .line 91
    .line 92
    return-object v6

    .line 93
    :cond_3
    move-wide/from16 v12, p5

    .line 94
    .line 95
    move v15, v11

    .line 96
    move-wide v10, v7

    .line 97
    move-wide/from16 v8, p1

    .line 98
    .line 99
    :goto_2
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, La/e5l0;

    .line 104
    .line 105
    iget-object v14, v1, La/e5l0;->a:Ljava/lang/String;

    .line 106
    .line 107
    iget-object v7, v0, La/tjb0;->t:La/bn6;

    .line 108
    .line 109
    invoke-virtual/range {v7 .. v15}, La/bn6;->d(JJJLjava/lang/String;Z)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, La/e5l0;

    .line 117
    .line 118
    iget-object v1, v1, La/e5l0;->a:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v0, v0, La/tjb0;->u:La/je;

    .line 121
    .line 122
    move-object/from16 p0, v0

    .line 123
    .line 124
    move-object/from16 p7, v1

    .line 125
    .line 126
    move-wide/from16 p1, v8

    .line 127
    .line 128
    move-wide/from16 p3, v10

    .line 129
    .line 130
    move-wide/from16 p5, v12

    .line 131
    .line 132
    move/from16 p8, v15

    .line 133
    .line 134
    invoke-virtual/range {p0 .. p8}, La/je;->f(JJJLjava/lang/String;Z)V

    .line 135
    .line 136
    .line 137
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object v0
.end method

.method public final l(La/c5l0;La/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v3, p2, La/pjb0;

    .line 2
    .line 3
    if-eqz v3, :cond_0

    .line 4
    .line 5
    move-object v3, p2

    .line 6
    check-cast v3, La/pjb0;

    .line 7
    .line 8
    iget v4, v3, La/pjb0;->l:I

    .line 9
    .line 10
    const/high16 v5, -0x80000000

    .line 11
    .line 12
    and-int v6, v4, v5

    .line 13
    .line 14
    if-eqz v6, :cond_0

    .line 15
    .line 16
    sub-int/2addr v4, v5

    .line 17
    iput v4, v3, La/pjb0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v3, La/pjb0;

    .line 21
    .line 22
    invoke-direct {v3, p0, p2}, La/pjb0;-><init>(La/tjb0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object v2, v3, La/pjb0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v4, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v5, v3, La/pjb0;->l:I

    .line 30
    .line 31
    const/4 v6, 0x2

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x1

    .line 34
    if-eqz v5, :cond_3

    .line 35
    .line 36
    if-eq v5, v8, :cond_2

    .line 37
    .line 38
    if-ne v5, v6, :cond_1

    .line 39
    .line 40
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_3

    .line 44
    .line 45
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v7

    .line 51
    :cond_2
    iget-object v0, v3, La/pjb0;->i:La/c5l0;

    .line 52
    .line 53
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, v3, La/pjb0;->i:La/c5l0;

    .line 61
    .line 62
    iput v8, v3, La/pjb0;->l:I

    .line 63
    .line 64
    invoke-static {p0, p1, v3}, La/x2t0;->f(La/x2t0;Ljava/lang/Object;La/zje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    if-ne v2, v4, :cond_4

    .line 69
    .line 70
    goto/16 :goto_2

    .line 71
    .line 72
    :cond_4
    move-object v0, p1

    .line 73
    :goto_1
    instance-of v2, v0, La/o4l0;

    .line 74
    .line 75
    iget-object v5, p0, La/x2t0;->b:La/ocj;

    .line 76
    .line 77
    if-eqz v2, :cond_6

    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v2, v5, La/ocj;->a:La/p7m0;

    .line 83
    .line 84
    :cond_5
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    move-object v3, v1

    .line 89
    check-cast v3, La/e5l0;

    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-object v4, v0

    .line 95
    check-cast v4, La/o4l0;

    .line 96
    .line 97
    iget-object v5, v4, La/o4l0;->a:Ljava/lang/String;

    .line 98
    .line 99
    iget-object v10, v4, La/o4l0;->d:La/ms2;

    .line 100
    .line 101
    move-object v6, v5

    .line 102
    iget-object v5, v4, La/o4l0;->b:Ljava/util/List;

    .line 103
    .line 104
    iget-object v7, v4, La/o4l0;->c:La/amb0;

    .line 105
    .line 106
    const/4 v9, 0x0

    .line 107
    const/16 v11, 0x34

    .line 108
    .line 109
    move-object v4, v6

    .line 110
    const/4 v6, 0x0

    .line 111
    const/4 v8, 0x0

    .line 112
    invoke-static/range {v3 .. v11}, La/e5l0;->a(La/e5l0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;La/amb0;La/cmb0;La/y1p;La/ms2;I)La/e5l0;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {v2, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_5

    .line 121
    .line 122
    goto/16 :goto_b

    .line 123
    .line 124
    :cond_6
    sget-object v2, La/n4l0;->a:La/n4l0;

    .line 125
    .line 126
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_7

    .line 131
    .line 132
    invoke-virtual {p0}, La/x2t0;->e()V

    .line 133
    .line 134
    .line 135
    goto/16 :goto_b

    .line 136
    .line 137
    :cond_7
    instance-of v2, v0, La/q4l0;

    .line 138
    .line 139
    if-eqz v2, :cond_9

    .line 140
    .line 141
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object v2, v5, La/ocj;->a:La/p7m0;

    .line 145
    .line 146
    :cond_8
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    move-object v3, v1

    .line 151
    check-cast v3, La/e5l0;

    .line 152
    .line 153
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    move-object v4, v0

    .line 157
    check-cast v4, La/q4l0;

    .line 158
    .line 159
    iget-object v9, v4, La/q4l0;->a:La/y1p;

    .line 160
    .line 161
    const/4 v10, 0x0

    .line 162
    const/16 v11, 0x5f

    .line 163
    .line 164
    const/4 v4, 0x0

    .line 165
    const/4 v5, 0x0

    .line 166
    const/4 v6, 0x0

    .line 167
    const/4 v7, 0x0

    .line 168
    const/4 v8, 0x0

    .line 169
    invoke-static/range {v3 .. v11}, La/e5l0;->a(La/e5l0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;La/amb0;La/cmb0;La/y1p;La/ms2;I)La/e5l0;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {v2, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_8

    .line 178
    .line 179
    goto/16 :goto_b

    .line 180
    .line 181
    :cond_9
    instance-of v2, v0, La/r4l0;

    .line 182
    .line 183
    if-eqz v2, :cond_b

    .line 184
    .line 185
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    iget-object v2, v5, La/ocj;->a:La/p7m0;

    .line 189
    .line 190
    :cond_a
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    move-object v3, v1

    .line 195
    check-cast v3, La/e5l0;

    .line 196
    .line 197
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    move-object v4, v0

    .line 201
    check-cast v4, La/r4l0;

    .line 202
    .line 203
    iget-object v8, v4, La/r4l0;->a:La/cmb0;

    .line 204
    .line 205
    const/4 v10, 0x0

    .line 206
    const/16 v11, 0x6f

    .line 207
    .line 208
    const/4 v4, 0x0

    .line 209
    const/4 v5, 0x0

    .line 210
    const/4 v6, 0x0

    .line 211
    const/4 v7, 0x0

    .line 212
    const/4 v9, 0x0

    .line 213
    invoke-static/range {v3 .. v11}, La/e5l0;->a(La/e5l0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;La/amb0;La/cmb0;La/y1p;La/ms2;I)La/e5l0;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    invoke-virtual {v2, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-eqz v1, :cond_a

    .line 222
    .line 223
    goto/16 :goto_b

    .line 224
    .line 225
    :cond_b
    instance-of v2, v0, La/v4l0;

    .line 226
    .line 227
    iget-object v9, p0, La/tjb0;->m:La/oeg0;

    .line 228
    .line 229
    if-eqz v2, :cond_c

    .line 230
    .line 231
    check-cast v0, La/v4l0;

    .line 232
    .line 233
    iget-boolean v2, v0, La/v4l0;->a:Z

    .line 234
    .line 235
    invoke-virtual {p0}, La/tjb0;->i()V

    .line 236
    .line 237
    .line 238
    sget-object v4, La/xun;->a:La/xun;

    .line 239
    .line 240
    new-instance v3, La/d8h0;

    .line 241
    .line 242
    invoke-direct {v3, v8, v7}, La/d8h0;-><init>(ILjava/util/Set;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v9}, La/oeg0;->c()La/i1w0;

    .line 246
    .line 247
    .line 248
    move-result-object v8

    .line 249
    new-instance v0, La/ljb0;

    .line 250
    .line 251
    const-wide/16 v5, -0x1

    .line 252
    .line 253
    const-string v7, ""

    .line 254
    .line 255
    move-object v1, p0

    .line 256
    invoke-direct/range {v0 .. v7}, La/ljb0;-><init>(La/tjb0;ZLa/f9h0;Ljava/util/Set;JLjava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v8, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 260
    .line 261
    .line 262
    goto/16 :goto_b

    .line 263
    .line 264
    :cond_c
    instance-of v2, v0, La/x4l0;

    .line 265
    .line 266
    if-eqz v2, :cond_10

    .line 267
    .line 268
    check-cast v0, La/x4l0;

    .line 269
    .line 270
    iget-wide v2, v0, La/x4l0;->a:J

    .line 271
    .line 272
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    check-cast v0, La/e5l0;

    .line 277
    .line 278
    iget-object v0, v0, La/e5l0;->c:Ljava/util/List;

    .line 279
    .line 280
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    if-eqz v4, :cond_e

    .line 289
    .line 290
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    move-object v5, v4

    .line 295
    check-cast v5, La/rbb;

    .line 296
    .line 297
    iget-wide v5, v5, La/rbb;->a:J

    .line 298
    .line 299
    cmp-long v5, v5, v2

    .line 300
    .line 301
    if-nez v5, :cond_d

    .line 302
    .line 303
    move-object v7, v4

    .line 304
    :cond_e
    check-cast v7, La/rbb;

    .line 305
    .line 306
    if-nez v7, :cond_f

    .line 307
    .line 308
    goto/16 :goto_b

    .line 309
    .line 310
    :cond_f
    invoke-virtual {v9}, La/oeg0;->c()La/i1w0;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    new-instance v2, La/zga0;

    .line 315
    .line 316
    const/16 v3, 0x10

    .line 317
    .line 318
    invoke-direct {v2, p0, v7, v3}, La/zga0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 322
    .line 323
    .line 324
    goto/16 :goto_b

    .line 325
    .line 326
    :cond_10
    instance-of v2, v0, La/w4l0;

    .line 327
    .line 328
    if-eqz v2, :cond_12

    .line 329
    .line 330
    check-cast v0, La/w4l0;

    .line 331
    .line 332
    iget-wide v8, v0, La/w4l0;->a:J

    .line 333
    .line 334
    iput-object v7, v3, La/pjb0;->i:La/c5l0;

    .line 335
    .line 336
    iput v6, v3, La/pjb0;->l:I

    .line 337
    .line 338
    invoke-virtual {p0, v8, v9, v3}, La/tjb0;->m(JLa/zje;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    if-ne v0, v4, :cond_11

    .line 343
    .line 344
    :goto_2
    return-object v4

    .line 345
    :cond_11
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 346
    .line 347
    return-object v0

    .line 348
    :cond_12
    instance-of v2, v0, La/a5l0;

    .line 349
    .line 350
    if-eqz v2, :cond_13

    .line 351
    .line 352
    check-cast v0, La/a5l0;

    .line 353
    .line 354
    iget v2, v0, La/a5l0;->a:I

    .line 355
    .line 356
    iget-object v0, v0, La/a5l0;->b:Ljava/lang/String;

    .line 357
    .line 358
    invoke-virtual {p0, v2, v0}, La/tjb0;->n(ILjava/lang/String;)V

    .line 359
    .line 360
    .line 361
    goto/16 :goto_b

    .line 362
    .line 363
    :cond_13
    instance-of v2, v0, La/u4l0;

    .line 364
    .line 365
    const/4 v3, 0x0

    .line 366
    if-eqz v2, :cond_15

    .line 367
    .line 368
    check-cast v0, La/u4l0;

    .line 369
    .line 370
    iget-object v0, v0, La/u4l0;->a:La/m7r0;

    .line 371
    .line 372
    invoke-virtual {p0}, La/tjb0;->i()V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v9}, La/oeg0;->c()La/i1w0;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    new-instance v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 383
    .line 384
    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 385
    .line 386
    .line 387
    iget-object v1, p0, La/tjb0;->x:La/rrc;

    .line 388
    .line 389
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    new-instance v5, Lorg/xplatform/feed/navigation/FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1;

    .line 393
    .line 394
    invoke-direct {v5, v1, v0}, Lorg/xplatform/feed/navigation/FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1;-><init>(La/rrc;La/m7r0;)V

    .line 395
    .line 396
    .line 397
    instance-of v0, v5, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 398
    .line 399
    if-eqz v0, :cond_14

    .line 400
    .line 401
    new-instance v0, La/e1w0;

    .line 402
    .line 403
    check-cast v5, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 404
    .line 405
    invoke-direct {v0, v5}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 406
    .line 407
    .line 408
    new-instance v1, La/c8d;

    .line 409
    .line 410
    sget-object v5, La/y7d;->a:La/v7d;

    .line 411
    .line 412
    invoke-direct {v1, v5, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v4, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    goto :goto_4

    .line 419
    :cond_14
    new-instance v0, La/w0w0;

    .line 420
    .line 421
    invoke-direct {v0, v5}, La/w0w0;-><init>(La/m7h0;)V

    .line 422
    .line 423
    .line 424
    new-instance v1, La/c8d;

    .line 425
    .line 426
    sget-object v5, La/y7d;->a:La/v7d;

    .line 427
    .line 428
    invoke-direct {v1, v5, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v4, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    :goto_4
    invoke-static {v2, v4, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    :goto_5
    move-object v1, v0

    .line 439
    check-cast v1, La/paw;

    .line 440
    .line 441
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 442
    .line 443
    .line 444
    move-result v3

    .line 445
    if-eqz v3, :cond_26

    .line 446
    .line 447
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    check-cast v1, La/oe50;

    .line 452
    .line 453
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 454
    .line 455
    .line 456
    goto :goto_5

    .line 457
    :cond_15
    instance-of v2, v0, La/s4l0;

    .line 458
    .line 459
    if-eqz v2, :cond_17

    .line 460
    .line 461
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    iget-object v2, v5, La/ocj;->a:La/p7m0;

    .line 465
    .line 466
    :cond_16
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    move-object v3, v1

    .line 471
    check-cast v3, La/e5l0;

    .line 472
    .line 473
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    move-object v4, v0

    .line 477
    check-cast v4, La/s4l0;

    .line 478
    .line 479
    iget-object v5, v4, La/s4l0;->a:Ljava/util/List;

    .line 480
    .line 481
    const/4 v10, 0x0

    .line 482
    const/16 v11, 0x7d

    .line 483
    .line 484
    const/4 v4, 0x0

    .line 485
    const/4 v6, 0x0

    .line 486
    const/4 v7, 0x0

    .line 487
    const/4 v8, 0x0

    .line 488
    const/4 v9, 0x0

    .line 489
    invoke-static/range {v3 .. v11}, La/e5l0;->a(La/e5l0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;La/amb0;La/cmb0;La/y1p;La/ms2;I)La/e5l0;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    invoke-virtual {v2, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v1

    .line 497
    if-eqz v1, :cond_16

    .line 498
    .line 499
    goto/16 :goto_b

    .line 500
    .line 501
    :cond_17
    sget-object v2, La/t4l0;->a:La/t4l0;

    .line 502
    .line 503
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v2

    .line 507
    const-string v4, "popular_new_top"

    .line 508
    .line 509
    const-string v6, "popular_new_sport"

    .line 510
    .line 511
    iget-object v10, p0, La/tjb0;->q:La/gg5;

    .line 512
    .line 513
    iget-object v11, p0, La/tjb0;->i:La/zg;

    .line 514
    .line 515
    if-eqz v2, :cond_1c

    .line 516
    .line 517
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    check-cast v0, La/e5l0;

    .line 522
    .line 523
    iget-object v0, v0, La/e5l0;->d:La/amb0;

    .line 524
    .line 525
    if-eqz v0, :cond_1a

    .line 526
    .line 527
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 528
    .line 529
    .line 530
    move-result v0

    .line 531
    const-string v2, "all"

    .line 532
    .line 533
    if-eqz v0, :cond_19

    .line 534
    .line 535
    if-eq v0, v8, :cond_18

    .line 536
    .line 537
    goto :goto_6

    .line 538
    :cond_18
    iget-object v0, v11, La/zg;->a:La/kt2;

    .line 539
    .line 540
    new-instance v4, Lkotlin/Pair;

    .line 541
    .line 542
    const-string v5, "sport_id"

    .line 543
    .line 544
    invoke-direct {v4, v5, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    new-instance v5, Lkotlin/Pair;

    .line 548
    .line 549
    const-string v7, "screen"

    .line 550
    .line 551
    invoke-direct {v5, v7, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    filled-new-array {v4, v5}, [Lkotlin/Pair;

    .line 555
    .line 556
    .line 557
    move-result-object v4

    .line 558
    invoke-static {v4}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 559
    .line 560
    .line 561
    move-result-object v4

    .line 562
    const-string v5, "main_header_filter_call"

    .line 563
    .line 564
    invoke-interface {v0, v5, v4}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v10, v2, v6}, La/gg5;->q(Ljava/lang/String;Ljava/lang/String;)V

    .line 571
    .line 572
    .line 573
    goto :goto_6

    .line 574
    :cond_19
    invoke-virtual {v11}, La/zg;->c()V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v10, v2, v4}, La/gg5;->q(Ljava/lang/String;Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    :cond_1a
    :goto_6
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
    move-result-object v2

    .line 591
    sget-object v4, La/j700;->b:La/j700;

    .line 592
    .line 593
    iget-object v1, p0, La/tjb0;->l:La/vjp;

    .line 594
    .line 595
    invoke-virtual {v1, v4}, La/vjp;->a(La/j700;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 596
    .line 597
    .line 598
    move-result-object v1

    .line 599
    instance-of v4, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 600
    .line 601
    if-eqz v4, :cond_1b

    .line 602
    .line 603
    new-instance v4, La/e1w0;

    .line 604
    .line 605
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 606
    .line 607
    invoke-direct {v4, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 608
    .line 609
    .line 610
    new-instance v1, La/c8d;

    .line 611
    .line 612
    sget-object v5, La/y7d;->a:La/v7d;

    .line 613
    .line 614
    invoke-direct {v1, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    goto :goto_7

    .line 621
    :cond_1b
    new-instance v4, La/w0w0;

    .line 622
    .line 623
    invoke-direct {v4, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 624
    .line 625
    .line 626
    new-instance v1, La/c8d;

    .line 627
    .line 628
    sget-object v5, La/y7d;->a:La/v7d;

    .line 629
    .line 630
    invoke-direct {v1, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    :goto_7
    invoke-static {v0, v2, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    :goto_8
    move-object v2, v1

    .line 641
    check-cast v2, La/paw;

    .line 642
    .line 643
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 644
    .line 645
    .line 646
    move-result v3

    .line 647
    if-eqz v3, :cond_26

    .line 648
    .line 649
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    check-cast v2, La/oe50;

    .line 654
    .line 655
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 656
    .line 657
    .line 658
    goto :goto_8

    .line 659
    :cond_1c
    sget-object v2, La/y4l0;->a:La/y4l0;

    .line 660
    .line 661
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    move-result v2

    .line 665
    if-eqz v2, :cond_20

    .line 666
    .line 667
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    check-cast v0, La/e5l0;

    .line 672
    .line 673
    iget-object v0, v0, La/e5l0;->d:La/amb0;

    .line 674
    .line 675
    if-eqz v0, :cond_1f

    .line 676
    .line 677
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 678
    .line 679
    .line 680
    move-result v0

    .line 681
    const-wide/16 v4, -0x1

    .line 682
    .line 683
    if-eqz v0, :cond_1e

    .line 684
    .line 685
    if-eq v0, v8, :cond_1d

    .line 686
    .line 687
    goto :goto_9

    .line 688
    :cond_1d
    invoke-virtual {v11, v4, v5}, La/zg;->j(J)V

    .line 689
    .line 690
    .line 691
    goto :goto_9

    .line 692
    :cond_1e
    invoke-virtual {v11, v4, v5}, La/zg;->k(J)V

    .line 693
    .line 694
    .line 695
    :cond_1f
    :goto_9
    iget-object v0, p0, La/tjb0;->h:La/u58;

    .line 696
    .line 697
    iget-object v0, v0, La/u58;->a:La/kt2;

    .line 698
    .line 699
    new-instance v2, Lkotlin/Pair;

    .line 700
    .line 701
    const-string v4, "settings"

    .line 702
    .line 703
    const-string v5, "Filter"

    .line 704
    .line 705
    invoke-direct {v2, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 706
    .line 707
    .line 708
    invoke-static {v2}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 709
    .line 710
    .line 711
    move-result-object v2

    .line 712
    const-string v4, "main_filter_call"

    .line 713
    .line 714
    invoke-interface {v0, v4, v2}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v9}, La/oeg0;->c()La/i1w0;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    new-instance v2, La/mjb0;

    .line 722
    .line 723
    invoke-direct {v2, p0, v3}, La/mjb0;-><init>(La/tjb0;B)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v0, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 727
    .line 728
    .line 729
    goto :goto_b

    .line 730
    :cond_20
    instance-of v2, v0, La/z4l0;

    .line 731
    .line 732
    if-eqz v2, :cond_24

    .line 733
    .line 734
    check-cast v0, La/z4l0;

    .line 735
    .line 736
    iget v0, v0, La/z4l0;->a:I

    .line 737
    .line 738
    int-to-long v2, v0

    .line 739
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    check-cast v0, La/e5l0;

    .line 744
    .line 745
    iget-object v0, v0, La/e5l0;->d:La/amb0;

    .line 746
    .line 747
    if-eqz v0, :cond_23

    .line 748
    .line 749
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 750
    .line 751
    .line 752
    move-result v0

    .line 753
    if-eqz v0, :cond_22

    .line 754
    .line 755
    if-eq v0, v8, :cond_21

    .line 756
    .line 757
    goto :goto_a

    .line 758
    :cond_21
    invoke-virtual {v11, v2, v3}, La/zg;->j(J)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 762
    .line 763
    .line 764
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    invoke-virtual {v10, v0, v6}, La/gg5;->q(Ljava/lang/String;Ljava/lang/String;)V

    .line 769
    .line 770
    .line 771
    goto :goto_a

    .line 772
    :cond_22
    invoke-virtual {v11, v2, v3}, La/zg;->k(J)V

    .line 773
    .line 774
    .line 775
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    invoke-virtual {v10, v0, v4}, La/gg5;->q(Ljava/lang/String;Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    :cond_23
    :goto_a
    invoke-virtual {v9}, La/oeg0;->c()La/i1w0;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    new-instance v4, La/qi4;

    .line 790
    .line 791
    const/16 v5, 0xd

    .line 792
    .line 793
    invoke-direct {v4, p0, v2, v3, v5}, La/qi4;-><init>(Ljava/lang/Object;JB)V

    .line 794
    .line 795
    .line 796
    invoke-virtual {v0, v4}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 797
    .line 798
    .line 799
    goto :goto_b

    .line 800
    :cond_24
    instance-of v1, v0, La/p4l0;

    .line 801
    .line 802
    if-eqz v1, :cond_27

    .line 803
    .line 804
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 805
    .line 806
    .line 807
    iget-object v1, v5, La/ocj;->a:La/p7m0;

    .line 808
    .line 809
    :cond_25
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v2

    .line 813
    move-object v3, v2

    .line 814
    check-cast v3, La/e5l0;

    .line 815
    .line 816
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 817
    .line 818
    .line 819
    move-object v4, v0

    .line 820
    check-cast v4, La/p4l0;

    .line 821
    .line 822
    iget-object v6, v4, La/p4l0;->a:Ljava/util/List;

    .line 823
    .line 824
    const/4 v10, 0x0

    .line 825
    const/16 v11, 0x7b

    .line 826
    .line 827
    const/4 v4, 0x0

    .line 828
    const/4 v5, 0x0

    .line 829
    const/4 v7, 0x0

    .line 830
    const/4 v8, 0x0

    .line 831
    const/4 v9, 0x0

    .line 832
    invoke-static/range {v3 .. v11}, La/e5l0;->a(La/e5l0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;La/amb0;La/cmb0;La/y1p;La/ms2;I)La/e5l0;

    .line 833
    .line 834
    .line 835
    move-result-object v3

    .line 836
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 837
    .line 838
    .line 839
    move-result v2

    .line 840
    if-eqz v2, :cond_25

    .line 841
    .line 842
    :cond_26
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 843
    .line 844
    return-object v0

    .line 845
    :cond_27
    invoke-static {}, La/t9f;->b()V

    .line 846
    .line 847
    .line 848
    return-object v7
.end method

.method public final m(JLa/zje;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v9, p1

    .line 4
    .line 5
    move-object/from16 v1, p3

    .line 6
    .line 7
    instance-of v2, v1, La/qjb0;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, La/qjb0;

    .line 13
    .line 14
    iget v3, v2, La/qjb0;->m:I

    .line 15
    .line 16
    const/high16 v4, -0x80000000

    .line 17
    .line 18
    and-int v5, v3, v4

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    sub-int/2addr v3, v4

    .line 23
    iput v3, v2, La/qjb0;->m:I

    .line 24
    .line 25
    :goto_0
    move-object v7, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v2, La/qjb0;

    .line 28
    .line 29
    invoke-direct {v2, v0, v1}, La/qjb0;-><init>(La/tjb0;La/zje;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v1, v7, La/qjb0;->k:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v11, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v2, v7, La/qjb0;->m:I

    .line 38
    .line 39
    const/4 v12, 0x2

    .line 40
    const/4 v3, 0x1

    .line 41
    const/4 v13, 0x0

    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    if-eq v2, v3, :cond_2

    .line 45
    .line 46
    if-ne v2, v12, :cond_1

    .line 47
    .line 48
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_9

    .line 52
    .line 53
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v13

    .line 59
    :cond_2
    iget-wide v2, v7, La/qjb0;->i:J

    .line 60
    .line 61
    iget-object v4, v7, La/qjb0;->j:La/rbb;

    .line 62
    .line 63
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move-object v1, v13

    .line 67
    goto/16 :goto_7

    .line 68
    .line 69
    :cond_3
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, La/e5l0;

    .line 77
    .line 78
    iget-object v1, v1, La/e5l0;->c:Ljava/util/List;

    .line 79
    .line 80
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_5

    .line 89
    .line 90
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    move-object v4, v2

    .line 95
    check-cast v4, La/rbb;

    .line 96
    .line 97
    iget-wide v4, v4, La/rbb;->a:J

    .line 98
    .line 99
    cmp-long v4, v4, v9

    .line 100
    .line 101
    if-nez v4, :cond_4

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    move-object v2, v13

    .line 105
    :goto_2
    move-object v14, v2

    .line 106
    check-cast v14, La/rbb;

    .line 107
    .line 108
    if-nez v14, :cond_6

    .line 109
    .line 110
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object v0

    .line 113
    :cond_6
    iget-wide v1, v14, La/rbb;->a:J

    .line 114
    .line 115
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, La/e5l0;

    .line 120
    .line 121
    iget-object v4, v4, La/e5l0;->b:Ljava/util/List;

    .line 122
    .line 123
    new-instance v5, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    :cond_7
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    if-eqz v6, :cond_a

    .line 137
    .line 138
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    move-object v8, v6

    .line 143
    check-cast v8, La/lok0;

    .line 144
    .line 145
    iget-object v8, v8, La/lok0;->t:Ljava/util/List;

    .line 146
    .line 147
    if-eqz v8, :cond_8

    .line 148
    .line 149
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v15

    .line 153
    if-eqz v15, :cond_8

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_8
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    :cond_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v15

    .line 164
    if-eqz v15, :cond_7

    .line 165
    .line 166
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v15

    .line 170
    check-cast v15, Ljava/lang/Number;

    .line 171
    .line 172
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 173
    .line 174
    .line 175
    move-result v15

    .line 176
    if-ne v15, v3, :cond_9

    .line 177
    .line 178
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_a
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    if-eqz v5, :cond_c

    .line 191
    .line 192
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    move-object v6, v5

    .line 197
    check-cast v6, La/lok0;

    .line 198
    .line 199
    iget v6, v6, La/lok0;->a:I

    .line 200
    .line 201
    iget-wide v12, v14, La/rbb;->b:J

    .line 202
    .line 203
    long-to-int v8, v12

    .line 204
    if-ne v6, v8, :cond_b

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_b
    const/4 v12, 0x2

    .line 208
    const/4 v13, 0x0

    .line 209
    goto :goto_4

    .line 210
    :cond_c
    const/4 v5, 0x0

    .line 211
    :goto_5
    check-cast v5, La/lok0;

    .line 212
    .line 213
    if-eqz v5, :cond_d

    .line 214
    .line 215
    iget v1, v5, La/lok0;->a:I

    .line 216
    .line 217
    iget-object v2, v5, La/lok0;->b:Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {v0, v1, v2}, La/tjb0;->n(ILjava/lang/String;)V

    .line 220
    .line 221
    .line 222
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    return-object v0

    .line 225
    :cond_d
    iget-wide v4, v14, La/rbb;->f:J

    .line 226
    .line 227
    const-wide/16 v12, 0x1

    .line 228
    .line 229
    cmp-long v4, v4, v12

    .line 230
    .line 231
    if-nez v4, :cond_11

    .line 232
    .line 233
    iget-wide v1, v14, La/rbb;->n:J

    .line 234
    .line 235
    iget-object v4, v14, La/rbb;->p:Ljava/util/List;

    .line 236
    .line 237
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    check-cast v4, La/ygs;

    .line 242
    .line 243
    if-eqz v4, :cond_e

    .line 244
    .line 245
    iget-wide v4, v4, La/ygs;->B:J

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_e
    const-wide/16 v4, 0x0

    .line 249
    .line 250
    :goto_6
    iget-wide v12, v14, La/rbb;->a:J

    .line 251
    .line 252
    iget-boolean v8, v14, La/rbb;->m:Z

    .line 253
    .line 254
    iput-object v14, v7, La/qjb0;->j:La/rbb;

    .line 255
    .line 256
    iput-wide v9, v7, La/qjb0;->i:J

    .line 257
    .line 258
    iput v3, v7, La/qjb0;->m:I

    .line 259
    .line 260
    move-wide v3, v4

    .line 261
    move-wide v5, v12

    .line 262
    invoke-virtual/range {v0 .. v8}, La/tjb0;->k(JJJLa/zje;Z)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    if-ne v1, v11, :cond_f

    .line 267
    .line 268
    goto :goto_8

    .line 269
    :cond_f
    move-wide v2, v9

    .line 270
    move-object v4, v14

    .line 271
    const/4 v1, 0x0

    .line 272
    :goto_7
    iput-object v1, v7, La/qjb0;->j:La/rbb;

    .line 273
    .line 274
    iput-wide v2, v7, La/qjb0;->i:J

    .line 275
    .line 276
    const/4 v15, 0x2

    .line 277
    iput v15, v7, La/qjb0;->m:I

    .line 278
    .line 279
    invoke-virtual {v0, v4, v7}, La/tjb0;->o(La/rbb;La/zje;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    if-ne v0, v11, :cond_10

    .line 284
    .line 285
    :goto_8
    return-object v11

    .line 286
    :cond_10
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    return-object v0

    .line 289
    :cond_11
    iget-boolean v4, v14, La/rbb;->m:Z

    .line 290
    .line 291
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    check-cast v5, La/e5l0;

    .line 296
    .line 297
    iget-object v5, v5, La/e5l0;->d:La/amb0;

    .line 298
    .line 299
    if-eqz v5, :cond_15

    .line 300
    .line 301
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    iget-object v6, v0, La/tjb0;->i:La/zg;

    .line 306
    .line 307
    if-eqz v5, :cond_13

    .line 308
    .line 309
    if-eq v5, v3, :cond_12

    .line 310
    .line 311
    goto :goto_c

    .line 312
    :cond_12
    invoke-virtual {v6, v4, v1, v2}, La/zg;->i(ZJ)V

    .line 313
    .line 314
    .line 315
    const-string v3, "popular_new_sport"

    .line 316
    .line 317
    goto :goto_b

    .line 318
    :cond_13
    iget-object v3, v6, La/zg;->a:La/kt2;

    .line 319
    .line 320
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 321
    .line 322
    .line 323
    move-result-object v5

    .line 324
    new-instance v6, Lkotlin/Pair;

    .line 325
    .line 326
    const-string v7, "championship_id"

    .line 327
    .line 328
    invoke-direct {v6, v7, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    if-eqz v4, :cond_14

    .line 332
    .line 333
    const-string v5, "live"

    .line 334
    .line 335
    goto :goto_a

    .line 336
    :cond_14
    const-string v5, "line"

    .line 337
    .line 338
    :goto_a
    new-instance v7, Lkotlin/Pair;

    .line 339
    .line 340
    const-string v8, "option"

    .line 341
    .line 342
    invoke-direct {v7, v8, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    new-instance v5, Lkotlin/Pair;

    .line 346
    .line 347
    const-string v8, "screen"

    .line 348
    .line 349
    const-string v9, "popular_new_top"

    .line 350
    .line 351
    invoke-direct {v5, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    filled-new-array {v6, v7, v5}, [Lkotlin/Pair;

    .line 355
    .line 356
    .line 357
    move-result-object v5

    .line 358
    invoke-static {v5}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    const-string v6, "popular_new_champ_click"

    .line 363
    .line 364
    invoke-interface {v3, v6, v5}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 365
    .line 366
    .line 367
    move-object v3, v9

    .line 368
    :goto_b
    iget-object v5, v0, La/tjb0;->q:La/gg5;

    .line 369
    .line 370
    invoke-virtual {v5, v3, v1, v2, v4}, La/gg5;->h(Ljava/lang/String;JZ)V

    .line 371
    .line 372
    .line 373
    :cond_15
    :goto_c
    new-instance v3, Ljava/lang/Long;

    .line 374
    .line 375
    invoke-direct {v3, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 376
    .line 377
    .line 378
    invoke-static {v3}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    iget-boolean v2, v14, La/rbb;->m:Z

    .line 383
    .line 384
    new-instance v3, La/m8h0;

    .line 385
    .line 386
    iget-object v1, v14, La/rbb;->c:Ljava/lang/String;

    .line 387
    .line 388
    invoke-direct {v3, v1}, La/m8h0;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    iget-wide v5, v14, La/rbb;->n:J

    .line 392
    .line 393
    iget-object v7, v14, La/rbb;->c:Ljava/lang/String;

    .line 394
    .line 395
    iget-object v1, v0, La/tjb0;->m:La/oeg0;

    .line 396
    .line 397
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 398
    .line 399
    .line 400
    move-result-object v8

    .line 401
    new-instance v0, La/ljb0;

    .line 402
    .line 403
    move-object/from16 v1, p0

    .line 404
    .line 405
    invoke-direct/range {v0 .. v7}, La/ljb0;-><init>(La/tjb0;ZLa/f9h0;Ljava/util/Set;JLjava/lang/String;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v8, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 409
    .line 410
    .line 411
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 412
    .line 413
    return-object v0
.end method

.method public final n(ILjava/lang/String;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/e5l0;

    .line 6
    .line 7
    iget-object v0, v0, La/e5l0;->d:La/amb0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x2

    .line 17
    const/4 v3, 0x1

    .line 18
    const-wide/16 v4, 0xc2b

    .line 19
    .line 20
    iget-object v6, p0, La/tjb0;->z:La/zr1;

    .line 21
    .line 22
    iget-object v7, p0, La/tjb0;->y:La/yo4;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    if-eq v0, v3, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string v0, "popular_new_sport"

    .line 30
    .line 31
    invoke-virtual {v7, p1, v0}, La/yo4;->p(ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sget-object v7, La/y1p;->b:La/y1p;

    .line 35
    .line 36
    iget-object v6, v6, La/zr1;->a:La/s1p;

    .line 37
    .line 38
    new-instance v7, La/i1p;

    .line 39
    .line 40
    invoke-direct {v7, p1, v2}, La/i1p;-><init>(IB)V

    .line 41
    .line 42
    .line 43
    new-instance v8, La/j1p;

    .line 44
    .line 45
    invoke-direct {v8, v0, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 46
    .line 47
    .line 48
    new-array v0, v2, [La/k1p;

    .line 49
    .line 50
    aput-object v7, v0, v1

    .line 51
    .line 52
    aput-object v8, v0, v3

    .line 53
    .line 54
    invoke-static {v0}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v6, v0, v4, v5}, La/s1p;->a(Ljava/util/Set;J)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const-string v0, "popular_new_top"

    .line 63
    .line 64
    invoke-virtual {v7, p1, v0}, La/yo4;->p(ILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    sget-object v7, La/y1p;->b:La/y1p;

    .line 68
    .line 69
    iget-object v6, v6, La/zr1;->a:La/s1p;

    .line 70
    .line 71
    new-instance v7, La/i1p;

    .line 72
    .line 73
    invoke-direct {v7, p1, v2}, La/i1p;-><init>(IB)V

    .line 74
    .line 75
    .line 76
    new-instance v8, La/j1p;

    .line 77
    .line 78
    invoke-direct {v8, v0, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 79
    .line 80
    .line 81
    new-array v0, v2, [La/k1p;

    .line 82
    .line 83
    aput-object v7, v0, v1

    .line 84
    .line 85
    aput-object v8, v0, v3

    .line 86
    .line 87
    invoke-static {v0}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v6, v0, v4, v5}, La/s1p;->a(Ljava/util/Set;J)V

    .line 92
    .line 93
    .line 94
    :cond_2
    :goto_0
    iget-object v0, p0, La/tjb0;->m:La/oeg0;

    .line 95
    .line 96
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0, v0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-object p0, p0, La/tjb0;->s:La/y3v;

    .line 105
    .line 106
    invoke-virtual {p0, p1, p2}, La/y3v;->h(ILjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {v2, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 111
    .line 112
    .line 113
    iget-object p0, v2, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 114
    .line 115
    invoke-static {v0, p0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    :goto_1
    move-object p1, p0

    .line 120
    check-cast p1, La/paw;

    .line 121
    .line 122
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    if-eqz p2, :cond_3

    .line 127
    .line 128
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    check-cast p1, La/oe50;

    .line 133
    .line 134
    invoke-virtual {v0, p1}, La/i1w0;->a(La/oe50;)V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_3
    return-void
.end method

.method public final o(La/rbb;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, La/rjb0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/rjb0;

    .line 7
    .line 8
    iget v1, v0, La/rjb0;->m:I

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
    iput v1, v0, La/rjb0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/rjb0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/rjb0;-><init>(La/tjb0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/rjb0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/rjb0;->m:I

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
    iget-object p1, v0, La/rjb0;->j:La/ygs;

    .line 37
    .line 38
    iget-object v0, v0, La/rjb0;->i:La/rbb;

    .line 39
    .line 40
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object v4, p1

    .line 44
    move-object v5, v0

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p2, p1, La/rbb;->p:Ljava/util/List;

    .line 57
    .line 58
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    check-cast p2, La/ygs;

    .line 63
    .line 64
    if-nez p2, :cond_3

    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_3
    iget-wide v4, p1, La/rbb;->n:J

    .line 70
    .line 71
    iput-object p1, v0, La/rjb0;->i:La/rbb;

    .line 72
    .line 73
    iput-object p2, v0, La/rjb0;->j:La/ygs;

    .line 74
    .line 75
    iput v3, v0, La/rjb0;->m:I

    .line 76
    .line 77
    iget-object v2, p0, La/tjb0;->w:La/h3c;

    .line 78
    .line 79
    invoke-virtual {v2, v4, v5, v0}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-ne v0, v1, :cond_4

    .line 84
    .line 85
    return-object v1

    .line 86
    :cond_4
    move-object v5, p1

    .line 87
    move-object v4, p2

    .line 88
    move-object p2, v0

    .line 89
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    iget-object p1, p0, La/tjb0;->m:La/oeg0;

    .line 96
    .line 97
    invoke-virtual {p1}, La/oeg0;->c()La/i1w0;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    new-instance v2, La/t13;

    .line 102
    .line 103
    const/16 v7, 0x13

    .line 104
    .line 105
    move-object v3, p0

    .line 106
    invoke-direct/range {v2 .. v7}, La/t13;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZB)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 110
    .line 111
    .line 112
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object p0
.end method

.method public final p(La/rbb;La/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p2, La/sjb0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/sjb0;

    .line 7
    .line 8
    iget v1, v0, La/sjb0;->k:I

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
    iput v1, v0, La/sjb0;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/sjb0;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/sjb0;-><init>(La/tjb0;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v6, La/sjb0;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/sjb0;->k:I

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    const/4 v7, 0x1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v7, :cond_1

    .line 38
    .line 39
    if-ne v1, v2, :cond_2

    .line 40
    .line 41
    :cond_1
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto/16 :goto_7

    .line 45
    .line 46
    :catchall_0
    move-exception v0

    .line 47
    move-object p1, v0

    .line 48
    goto/16 :goto_6

    .line 49
    .line 50
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :try_start_1
    iget-wide v3, p1, La/rbb;->a:J

    .line 61
    .line 62
    move p2, v2

    .line 63
    move-wide v4, v3

    .line 64
    iget-wide v2, p1, La/rbb;->n:J

    .line 65
    .line 66
    iget-object v1, p1, La/rbb;->p:Ljava/util/List;

    .line 67
    .line 68
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, La/ygs;

    .line 73
    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    iget-wide v8, v1, La/ygs;->B:J

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    const-wide/16 v8, 0x0

    .line 80
    .line 81
    :goto_2
    new-instance v1, Ljava/lang/Long;

    .line 82
    .line 83
    invoke-direct {v1, v8, v9}, Ljava/lang/Long;-><init>(J)V

    .line 84
    .line 85
    .line 86
    move-wide v8, v4

    .line 87
    iget-boolean v4, p1, La/rbb;->m:Z

    .line 88
    .line 89
    iget-boolean p1, p1, La/rbb;->l:Z

    .line 90
    .line 91
    if-eqz p1, :cond_6

    .line 92
    .line 93
    iget-object p1, p0, La/tjb0;->j:La/nv20;

    .line 94
    .line 95
    iput v7, v6, La/sjb0;->k:I

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    new-instance p2, La/qgb;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 103
    .line 104
    .line 105
    move-result-wide v1

    .line 106
    invoke-direct {p2, v8, v9, v1, v2}, La/qgb;-><init>(JJ)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p1, La/nv20;->a:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p1, La/khf0;

    .line 112
    .line 113
    invoke-virtual {p1, p2, v6}, La/khf0;->D(La/sgb;La/zje;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-ne p1, v0, :cond_5

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    :goto_3
    if-ne p1, v0, :cond_8

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_6
    iget-object p1, p0, La/tjb0;->k:La/fvt0;

    .line 126
    .line 127
    iput p2, v6, La/sjb0;->k:I

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    new-instance v5, La/qgb;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 135
    .line 136
    .line 137
    move-result-wide v10

    .line 138
    invoke-direct {v5, v8, v9, v10, v11}, La/qgb;-><init>(JJ)V

    .line 139
    .line 140
    .line 141
    iget-object p1, p1, La/fvt0;->a:Ljava/lang/Object;

    .line 142
    .line 143
    move-object v1, p1

    .line 144
    check-cast v1, La/nr;

    .line 145
    .line 146
    invoke-virtual/range {v1 .. v6}, La/nr;->u(JZLa/sgb;La/zje;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-ne p1, v0, :cond_7

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_7
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 154
    .line 155
    :goto_4
    if-ne p1, v0, :cond_8

    .line 156
    .line 157
    :goto_5
    return-object v0

    .line 158
    :goto_6
    new-instance p2, La/mjb0;

    .line 159
    .line 160
    invoke-direct {p2, p0, v7}, La/mjb0;-><init>(La/tjb0;B)V

    .line 161
    .line 162
    .line 163
    iget-object p0, p0, La/tjb0;->n:La/ivn;

    .line 164
    .line 165
    invoke-virtual {p0, p1, p2}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 166
    .line 167
    .line 168
    :cond_8
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object p0
.end method
