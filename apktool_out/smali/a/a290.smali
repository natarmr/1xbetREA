.class public final La/a290;
.super La/hwt0;
.source "SourceFile"


# instance fields
.field public b:La/t89;

.field public c:F

.field public d:Ljava/util/List;

.field public e:F

.field public f:F

.field public g:La/t89;

.field public h:I

.field public i:I

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:La/vtm0;

.field public final r:La/w03;

.field public s:La/w03;

.field public t:La/w03;

.field public final u:La/a8z;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, La/a290;->c:F

    .line 7
    .line 8
    sget-object v1, La/q4u0;->a:La/iun;

    .line 9
    .line 10
    iput-object v1, p0, La/a290;->d:Ljava/util/List;

    .line 11
    .line 12
    iput v0, p0, La/a290;->e:F

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput v1, p0, La/a290;->h:I

    .line 16
    .line 17
    iput v1, p0, La/a290;->i:I

    .line 18
    .line 19
    const/high16 v1, 0x40800000    # 4.0f

    .line 20
    .line 21
    iput v1, p0, La/a290;->j:F

    .line 22
    .line 23
    iput v0, p0, La/a290;->l:F

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, La/a290;->n:Z

    .line 27
    .line 28
    iput-boolean v0, p0, La/a290;->o:Z

    .line 29
    .line 30
    invoke-static {}, La/z03;->a()La/w03;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, La/a290;->r:La/w03;

    .line 35
    .line 36
    iput-object v0, p0, La/a290;->s:La/w03;

    .line 37
    .line 38
    sget-object v0, La/wez;->b:La/wez;

    .line 39
    .line 40
    new-instance v1, La/i280;

    .line 41
    .line 42
    const/16 v2, 0x12

    .line 43
    .line 44
    invoke-direct {v1, v2}, La/i280;-><init>(B)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, La/a290;->u:La/a8z;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final a(La/fhl;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, La/a290;->n:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, La/a290;->d:Ljava/util/List;

    .line 8
    .line 9
    iget-object v2, v0, La/a290;->r:La/w03;

    .line 10
    .line 11
    invoke-static {v1, v2}, La/tfx;->L(Ljava/util/List;La/w03;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, La/a290;->e()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-boolean v1, v0, La/a290;->p:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, La/a290;->e()V

    .line 23
    .line 24
    .line 25
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 26
    iput-boolean v1, v0, La/a290;->n:Z

    .line 27
    .line 28
    iput-boolean v1, v0, La/a290;->p:Z

    .line 29
    .line 30
    iget-object v4, v0, La/a290;->b:La/t89;

    .line 31
    .line 32
    if-eqz v4, :cond_2

    .line 33
    .line 34
    iget-object v3, v0, La/a290;->s:La/w03;

    .line 35
    .line 36
    iget v5, v0, La/a290;->c:F

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    const/16 v7, 0x38

    .line 40
    .line 41
    move-object/from16 v2, p1

    .line 42
    .line 43
    invoke-static/range {v2 .. v7}, La/fhl;->K0(La/fhl;La/w03;La/t89;FLa/agc;I)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object v10, v0, La/a290;->g:La/t89;

    .line 47
    .line 48
    if-eqz v10, :cond_5

    .line 49
    .line 50
    iget-object v2, v0, La/a290;->q:La/vtm0;

    .line 51
    .line 52
    iget-boolean v3, v0, La/a290;->o:Z

    .line 53
    .line 54
    if-nez v3, :cond_4

    .line 55
    .line 56
    if-nez v2, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    move-object v12, v2

    .line 60
    goto :goto_2

    .line 61
    :cond_4
    :goto_1
    new-instance v11, La/vtm0;

    .line 62
    .line 63
    iget v12, v0, La/a290;->f:F

    .line 64
    .line 65
    iget v13, v0, La/a290;->j:F

    .line 66
    .line 67
    iget v14, v0, La/a290;->h:I

    .line 68
    .line 69
    iget v15, v0, La/a290;->i:I

    .line 70
    .line 71
    const/16 v16, 0x0

    .line 72
    .line 73
    const/16 v17, 0x10

    .line 74
    .line 75
    invoke-direct/range {v11 .. v17}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 76
    .line 77
    .line 78
    iput-object v11, v0, La/a290;->q:La/vtm0;

    .line 79
    .line 80
    iput-boolean v1, v0, La/a290;->o:Z

    .line 81
    .line 82
    move-object v12, v11

    .line 83
    :goto_2
    iget-object v9, v0, La/a290;->s:La/w03;

    .line 84
    .line 85
    iget v11, v0, La/a290;->e:F

    .line 86
    .line 87
    const/16 v13, 0x30

    .line 88
    .line 89
    move-object/from16 v8, p1

    .line 90
    .line 91
    invoke-static/range {v8 .. v13}, La/fhl;->K0(La/fhl;La/w03;La/t89;FLa/agc;I)V

    .line 92
    .line 93
    .line 94
    :cond_5
    return-void
.end method

.method public final e()V
    .locals 7

    .line 1
    iget v0, p0, La/a290;->k:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v0, v0, v1

    .line 5
    .line 6
    iget-object v2, p0, La/a290;->r:La/w03;

    .line 7
    .line 8
    const/high16 v3, 0x3f800000    # 1.0f

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget v0, p0, La/a290;->l:F

    .line 13
    .line 14
    cmpg-float v0, v0, v3

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iput-object v2, p0, La/a290;->s:La/w03;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v0, p0, La/a290;->s:La/w03;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    if-eq v0, v2, :cond_2

    .line 25
    .line 26
    iget-object v0, v0, La/w03;->a:Landroid/graphics/Path;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/graphics/Path;->getFillType()Landroid/graphics/Path$FillType;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v5, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 33
    .line 34
    if-ne v0, v5, :cond_1

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move v0, v4

    .line 39
    :goto_0
    iget-object v5, p0, La/a290;->s:La/w03;

    .line 40
    .line 41
    invoke-virtual {v5}, La/w03;->i()V

    .line 42
    .line 43
    .line 44
    iget-object v5, p0, La/a290;->s:La/w03;

    .line 45
    .line 46
    invoke-virtual {v5, v0}, La/w03;->j(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-static {}, La/z03;->a()La/w03;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, La/a290;->s:La/w03;

    .line 55
    .line 56
    :goto_1
    iget-object v0, p0, La/a290;->u:La/a8z;

    .line 57
    .line 58
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, La/y03;

    .line 63
    .line 64
    iget-object v5, v5, La/y03;->a:Landroid/graphics/PathMeasure;

    .line 65
    .line 66
    iget-object v2, v2, La/w03;->a:Landroid/graphics/Path;

    .line 67
    .line 68
    invoke-virtual {v5, v2, v4}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, La/y03;

    .line 76
    .line 77
    iget-object v2, v2, La/y03;->a:Landroid/graphics/PathMeasure;

    .line 78
    .line 79
    invoke-virtual {v2}, Landroid/graphics/PathMeasure;->getLength()F

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    iget v4, p0, La/a290;->k:F

    .line 84
    .line 85
    iget v5, p0, La/a290;->m:F

    .line 86
    .line 87
    add-float/2addr v4, v5

    .line 88
    rem-float/2addr v4, v3

    .line 89
    mul-float/2addr v4, v2

    .line 90
    iget v6, p0, La/a290;->l:F

    .line 91
    .line 92
    add-float/2addr v6, v5

    .line 93
    rem-float/2addr v6, v3

    .line 94
    mul-float/2addr v6, v2

    .line 95
    cmpl-float v3, v4, v6

    .line 96
    .line 97
    if-lez v3, :cond_4

    .line 98
    .line 99
    iget-object v3, p0, La/a290;->t:La/w03;

    .line 100
    .line 101
    if-eqz v3, :cond_3

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    invoke-static {}, La/z03;->a()La/w03;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    iput-object v3, p0, La/a290;->t:La/w03;

    .line 109
    .line 110
    :goto_2
    invoke-virtual {v3}, La/w03;->h()V

    .line 111
    .line 112
    .line 113
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    check-cast v5, La/y03;

    .line 118
    .line 119
    invoke-virtual {v5, v4, v2, v3}, La/y03;->a(FFLa/w03;)V

    .line 120
    .line 121
    .line 122
    iget-object v2, p0, La/a290;->s:La/w03;

    .line 123
    .line 124
    invoke-static {v2, v3}, La/w03;->a(La/w03;La/w03;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3}, La/w03;->h()V

    .line 128
    .line 129
    .line 130
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, La/y03;

    .line 135
    .line 136
    invoke-virtual {v0, v1, v6, v3}, La/y03;->a(FFLa/w03;)V

    .line 137
    .line 138
    .line 139
    iget-object p0, p0, La/a290;->s:La/w03;

    .line 140
    .line 141
    invoke-static {p0, v3}, La/w03;->a(La/w03;La/w03;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_4
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, La/y03;

    .line 150
    .line 151
    iget-object p0, p0, La/a290;->s:La/w03;

    .line 152
    .line 153
    invoke-virtual {v0, v4, v6, p0}, La/y03;->a(FFLa/w03;)V

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/a290;->r:La/w03;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
