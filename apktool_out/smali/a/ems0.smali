.class public final La/ems0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:La/vdv0;

.field public b:La/vdv0;

.field public c:La/vdv0;

.field public d:La/zr40;

.field public e:Z

.field public f:La/ywu;

.field public g:La/ywu;

.field public h:La/ywu;

.field public i:I


# virtual methods
.method public final a(IIFLa/fms0;)V
    .locals 51

    move-object/from16 v0, p0

    move/from16 v1, p2

    .line 1
    iget-object v3, v0, La/ems0;->c:La/vdv0;

    iget-object v4, v0, La/ems0;->d:La/zr40;

    iput v1, v0, La/ems0;->i:I

    .line 2
    iget-boolean v5, v0, La/ems0;->e:Z

    if-eqz v5, :cond_85

    .line 3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 4
    iget-object v5, v4, La/zr40;->f:La/bs40;

    .line 5
    iget-object v6, v4, La/zr40;->e:La/bs40;

    iget-object v7, v4, La/zr40;->r:Ljava/util/ArrayList;

    iget-object v8, v4, La/zr40;->d:La/qt40;

    iget-object v9, v4, La/zr40;->c:La/qt40;

    iget-object v10, v4, La/zr40;->t:Ljava/util/ArrayList;

    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    .line 6
    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    .line 7
    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12}, Ljava/util/HashSet;-><init>()V

    .line 8
    new-instance v13, Ljava/util/HashSet;

    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    .line 9
    new-instance v14, Ljava/util/HashMap;

    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 10
    iget-object v15, v4, La/zr40;->Y:La/zr40;

    if-nez v15, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, v15, La/zr40;->c:La/qt40;

    invoke-virtual {v9, v15, v1}, La/qt40;->e(La/zr40;La/qt40;)V

    .line 12
    iget-object v1, v4, La/zr40;->Y:La/zr40;

    iget-object v15, v1, La/zr40;->d:La/qt40;

    invoke-virtual {v8, v1, v15}, La/qt40;->e(La/zr40;La/qt40;)V

    .line 13
    :goto_0
    iget v1, v4, La/zr40;->x:I

    const/4 v15, -0x1

    move-object/from16 v16, v10

    if-eq v1, v15, :cond_1

    iget v10, v9, La/qt40;->i:I

    if-ne v10, v15, :cond_1

    .line 14
    iput v1, v9, La/qt40;->i:I

    .line 15
    :cond_1
    iget v1, v6, La/bs40;->a:F

    .line 16
    iget v10, v5, La/bs40;->a:F

    invoke-static {v1, v10}, La/bs40;->b(FF)Z

    move-result v1

    const-string v10, "alpha"

    if-eqz v1, :cond_2

    .line 17
    invoke-virtual {v12, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_2
    const/4 v1, 0x0

    .line 18
    invoke-static {v1, v1}, La/bs40;->b(FF)Z

    move-result v17

    const-string v15, "translationZ"

    if-eqz v17, :cond_3

    .line 19
    invoke-virtual {v12, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 20
    :cond_3
    iget-byte v1, v6, La/bs40;->b:B

    move-object/from16 v18, v11

    iget-byte v11, v5, La/bs40;->b:B

    const/4 v2, 0x4

    if-eq v1, v11, :cond_5

    if-eq v1, v2, :cond_4

    if-ne v11, v2, :cond_5

    .line 21
    :cond_4
    invoke-virtual {v12, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 22
    :cond_5
    iget v1, v6, La/bs40;->c:F

    iget v11, v5, La/bs40;->c:F

    invoke-static {v1, v11}, La/bs40;->b(FF)Z

    move-result v1

    const-string v11, "rotationZ"

    if-eqz v1, :cond_6

    .line 23
    invoke-virtual {v12, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_6
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 24
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v19

    move/from16 v20, v2

    const-string v2, "pathRotate"

    if-eqz v19, :cond_7

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v19

    if-nez v19, :cond_8

    .line 25
    :cond_7
    invoke-virtual {v12, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 26
    :cond_8
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v19

    move/from16 v21, v1

    const-string v1, "progress"

    if-eqz v19, :cond_a

    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->isNaN(F)Z

    move-result v19

    if-nez v19, :cond_9

    goto :goto_2

    :cond_9
    :goto_1
    move-object/from16 v19, v3

    goto :goto_3

    .line 27
    :cond_a
    :goto_2
    invoke-virtual {v12, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 28
    :goto_3
    iget v3, v6, La/bs40;->d:F

    iget v0, v5, La/bs40;->d:F

    invoke-static {v3, v0}, La/bs40;->b(FF)Z

    move-result v0

    const-string v3, "rotationX"

    if-eqz v0, :cond_b

    .line 29
    invoke-virtual {v12, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 30
    :cond_b
    iget v0, v6, La/bs40;->e:F

    move-object/from16 v22, v3

    iget v3, v5, La/bs40;->e:F

    invoke-static {v0, v3}, La/bs40;->b(FF)Z

    move-result v0

    const-string v3, "rotationY"

    if-eqz v0, :cond_c

    .line 31
    invoke-virtual {v12, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 32
    :cond_c
    iget v0, v6, La/bs40;->h:F

    move-object/from16 v23, v3

    iget v3, v5, La/bs40;->h:F

    invoke-static {v0, v3}, La/bs40;->b(FF)Z

    move-result v0

    const-string v3, "pivotX"

    if-eqz v0, :cond_d

    .line 33
    invoke-virtual {v12, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 34
    :cond_d
    iget v0, v6, La/bs40;->i:F

    move-object/from16 v24, v11

    iget v11, v5, La/bs40;->i:F

    invoke-static {v0, v11}, La/bs40;->b(FF)Z

    move-result v0

    const-string v11, "pivotY"

    if-eqz v0, :cond_e

    .line 35
    invoke-virtual {v12, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 36
    :cond_e
    iget v0, v6, La/bs40;->f:F

    move-object/from16 v25, v1

    iget v1, v5, La/bs40;->f:F

    invoke-static {v0, v1}, La/bs40;->b(FF)Z

    move-result v0

    const-string v1, "scaleX"

    if-eqz v0, :cond_f

    .line 37
    invoke-virtual {v12, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 38
    :cond_f
    iget v0, v6, La/bs40;->g:F

    move-object/from16 v26, v3

    iget v3, v5, La/bs40;->g:F

    invoke-static {v0, v3}, La/bs40;->b(FF)Z

    move-result v0

    const-string v3, "scaleY"

    if-eqz v0, :cond_10

    .line 39
    invoke-virtual {v12, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 40
    :cond_10
    iget v0, v6, La/bs40;->j:F

    move-object/from16 v27, v11

    iget v11, v5, La/bs40;->j:F

    invoke-static {v0, v11}, La/bs40;->b(FF)Z

    move-result v0

    const-string v11, "translationX"

    if-eqz v0, :cond_11

    .line 41
    invoke-virtual {v12, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 42
    :cond_11
    iget v0, v6, La/bs40;->k:F

    move-object/from16 v28, v11

    iget v11, v5, La/bs40;->k:F

    invoke-static {v0, v11}, La/bs40;->b(FF)Z

    move-result v0

    const-string v11, "translationY"

    if-eqz v0, :cond_12

    .line 43
    invoke-virtual {v12, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 44
    :cond_12
    iget v0, v6, La/bs40;->l:F

    move-object/from16 v29, v6

    iget v6, v5, La/bs40;->l:F

    invoke-static {v0, v6}, La/bs40;->b(FF)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 45
    invoke-virtual {v12, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_13
    const/4 v0, 0x0

    .line 46
    invoke-static {v0, v0}, La/bs40;->b(FF)Z

    move-result v6

    const-string v0, "elevation"

    if-eqz v6, :cond_14

    .line 47
    invoke-virtual {v12, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_14
    if-eqz v16, :cond_37

    .line 48
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v34

    :goto_4
    invoke-interface/range {v34 .. v34}, Ljava/util/Iterator;->hasNext()Z

    move-result v35

    if-eqz v35, :cond_37

    invoke-interface/range {v34 .. v34}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v35

    move-object/from16 v6, v35

    check-cast v6, La/qs40;

    move-object/from16 v35, v5

    .line 49
    instance-of v5, v6, La/ts40;

    if-eqz v5, :cond_34

    .line 50
    check-cast v6, La/ts40;

    .line 51
    new-instance v5, La/qt40;

    .line 52
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    move-object/from16 v37, v11

    move/from16 v11, v21

    .line 53
    iput v11, v5, La/qt40;->h:F

    const/4 v11, -0x1

    .line 54
    iput v11, v5, La/qt40;->i:I

    const/4 v11, 0x0

    .line 55
    iput-object v11, v5, La/qt40;->j:Ljava/lang/String;

    move-object/from16 v36, v15

    const/high16 v15, 0x7fc00000    # Float.NaN

    .line 56
    iput v15, v5, La/qt40;->k:F

    .line 57
    iput-object v11, v5, La/qt40;->l:La/zr40;

    .line 58
    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    iput-object v15, v5, La/qt40;->m:Ljava/util/HashMap;

    const/4 v15, 0x0

    .line 59
    iput v15, v5, La/qt40;->n:I

    const/16 v15, 0x12

    .line 60
    new-array v11, v15, [D

    iput-object v11, v5, La/qt40;->o:[D

    .line 61
    new-array v11, v15, [D

    iput-object v11, v5, La/qt40;->p:[D

    .line 62
    iget-object v11, v9, La/qt40;->j:Ljava/lang/String;

    const/high16 v15, 0x42c80000    # 100.0f

    if-eqz v11, :cond_1f

    .line 63
    iget v11, v6, La/qs40;->a:I

    int-to-float v11, v11

    div-float/2addr v11, v15

    .line 64
    iput v11, v5, La/qt40;->b:F

    .line 65
    iget v15, v6, La/ts40;->j:I

    iput v15, v5, La/qt40;->n:I

    .line 66
    iget v15, v6, La/ts40;->f:F

    invoke-static {v15}, Ljava/lang/Float;->isNaN(F)Z

    move-result v15

    if-eqz v15, :cond_15

    move v15, v11

    :goto_5
    move-object/from16 v38, v1

    goto :goto_6

    :cond_15
    iget v15, v6, La/ts40;->f:F

    goto :goto_5

    .line 67
    :goto_6
    iget v1, v6, La/ts40;->g:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_16

    move v1, v11

    :goto_7
    move-object/from16 v39, v3

    goto :goto_8

    :cond_16
    iget v1, v6, La/ts40;->g:F

    goto :goto_7

    .line 68
    :goto_8
    iget v3, v8, La/qt40;->f:F

    move/from16 v40, v3

    iget v3, v9, La/qt40;->f:F

    sub-float v40, v40, v3

    move/from16 v41, v3

    .line 69
    iget v3, v8, La/qt40;->g:F

    move/from16 v42, v3

    iget v3, v9, La/qt40;->g:F

    sub-float v42, v42, v3

    move/from16 v43, v3

    .line 70
    iget v3, v5, La/qt40;->b:F

    iput v3, v5, La/qt40;->c:F

    mul-float v40, v40, v15

    add-float v3, v40, v41

    float-to-int v3, v3

    int-to-float v3, v3

    .line 71
    iput v3, v5, La/qt40;->f:F

    mul-float v42, v42, v1

    add-float v3, v42, v43

    float-to-int v3, v3

    int-to-float v3, v3

    .line 72
    iput v3, v5, La/qt40;->g:F

    .line 73
    iget v3, v6, La/ts40;->j:I

    move-object/from16 v40, v0

    .line 74
    iget v0, v6, La/ts40;->h:F

    move/from16 v41, v0

    const/4 v0, 0x1

    if-eq v3, v0, :cond_1c

    const/4 v0, 0x2

    if-eq v3, v0, :cond_19

    .line 75
    invoke-static/range {v41 .. v41}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_17

    move v0, v11

    goto :goto_9

    .line 76
    :cond_17
    iget v0, v6, La/ts40;->h:F

    :goto_9
    iget v1, v8, La/qt40;->d:F

    iget v3, v9, La/qt40;->d:F

    invoke-static {v1, v3, v0, v3}, La/rw2;->a(FFFF)F

    move-result v0

    iput v0, v5, La/qt40;->d:F

    .line 77
    iget v0, v6, La/ts40;->i:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_18

    goto :goto_a

    .line 78
    :cond_18
    iget v11, v6, La/ts40;->i:F

    :goto_a
    iget v0, v8, La/qt40;->e:F

    iget v1, v9, La/qt40;->e:F

    invoke-static {v0, v1, v11, v1}, La/rw2;->a(FFFF)F

    move-result v0

    iput v0, v5, La/qt40;->e:F

    goto :goto_f

    .line 79
    :cond_19
    invoke-static/range {v41 .. v41}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_1a

    iget v0, v8, La/qt40;->d:F

    iget v1, v9, La/qt40;->d:F

    invoke-static {v0, v1, v11, v1}, La/rw2;->a(FFFF)F

    move-result v0

    goto :goto_b

    .line 80
    :cond_1a
    iget v0, v6, La/ts40;->h:F

    invoke-static {v1, v15}, Ljava/lang/Math;->min(FF)F

    move-result v1

    mul-float/2addr v0, v1

    :goto_b
    iput v0, v5, La/qt40;->d:F

    .line 81
    iget v0, v6, La/ts40;->i:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 82
    iget v0, v8, La/qt40;->e:F

    iget v1, v9, La/qt40;->e:F

    invoke-static {v0, v1, v11, v1}, La/rw2;->a(FFFF)F

    move-result v0

    goto :goto_c

    :cond_1b
    iget v0, v6, La/ts40;->i:F

    :goto_c
    iput v0, v5, La/qt40;->e:F

    goto :goto_f

    .line 83
    :cond_1c
    invoke-static/range {v41 .. v41}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_1d

    move v0, v11

    goto :goto_d

    .line 84
    :cond_1d
    iget v0, v6, La/ts40;->h:F

    :goto_d
    iget v1, v8, La/qt40;->d:F

    iget v3, v9, La/qt40;->d:F

    invoke-static {v1, v3, v0, v3}, La/rw2;->a(FFFF)F

    move-result v0

    iput v0, v5, La/qt40;->d:F

    .line 85
    iget v0, v6, La/ts40;->i:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_1e

    goto :goto_e

    .line 86
    :cond_1e
    iget v11, v6, La/ts40;->i:F

    :goto_e
    iget v0, v8, La/qt40;->e:F

    iget v1, v9, La/qt40;->e:F

    invoke-static {v0, v1, v11, v1}, La/rw2;->a(FFFF)F

    move-result v0

    iput v0, v5, La/qt40;->e:F

    .line 87
    :goto_f
    iget-object v0, v9, La/qt40;->j:Ljava/lang/String;

    iput-object v0, v5, La/qt40;->j:Ljava/lang/String;

    .line 88
    iget-object v0, v6, La/ts40;->e:Ljava/lang/String;

    invoke-static {v0}, La/fhn;->f(Ljava/lang/String;)La/fhn;

    move-result-object v0

    iput-object v0, v5, La/qt40;->a:La/fhn;

    const/4 v11, -0x1

    .line 89
    iput v11, v5, La/qt40;->i:I

    const/high16 v21, 0x7fc00000    # Float.NaN

    goto/16 :goto_1f

    :cond_1f
    move-object/from16 v40, v0

    move-object/from16 v38, v1

    move-object/from16 v39, v3

    .line 90
    iget v0, v6, La/ts40;->j:I

    .line 91
    iget v1, v6, La/qs40;->a:I

    const/4 v11, 0x1

    if-eq v0, v11, :cond_2b

    const/4 v11, 0x2

    if-eq v0, v11, :cond_26

    int-to-float v0, v1

    div-float/2addr v0, v15

    .line 92
    iput v0, v5, La/qt40;->b:F

    .line 93
    iget v1, v6, La/ts40;->f:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_20

    move v1, v0

    goto :goto_10

    :cond_20
    iget v1, v6, La/ts40;->f:F

    .line 94
    :goto_10
    iget v11, v6, La/ts40;->g:F

    invoke-static {v11}, Ljava/lang/Float;->isNaN(F)Z

    move-result v11

    if-eqz v11, :cond_21

    move v11, v0

    goto :goto_11

    :cond_21
    iget v11, v6, La/ts40;->g:F

    .line 95
    :goto_11
    iget v15, v8, La/qt40;->f:F

    const/high16 v41, 0x40000000    # 2.0f

    iget v3, v9, La/qt40;->f:F

    sub-float v42, v15, v3

    move/from16 v43, v0

    .line 96
    iget v0, v8, La/qt40;->g:F

    move/from16 v44, v0

    iget v0, v9, La/qt40;->g:F

    sub-float v45, v44, v0

    move/from16 v46, v0

    .line 97
    iget v0, v5, La/qt40;->b:F

    iput v0, v5, La/qt40;->c:F

    .line 98
    iget v0, v9, La/qt40;->d:F

    div-float v47, v3, v41

    add-float v47, v47, v0

    move/from16 v48, v0

    .line 99
    iget v0, v9, La/qt40;->e:F

    div-float v49, v46, v41

    add-float v49, v49, v0

    move/from16 v50, v0

    .line 100
    iget v0, v8, La/qt40;->d:F

    div-float v15, v15, v41

    add-float/2addr v15, v0

    .line 101
    iget v0, v8, La/qt40;->e:F

    div-float v44, v44, v41

    add-float v44, v44, v0

    sub-float v15, v15, v47

    sub-float v44, v44, v49

    mul-float v0, v15, v43

    add-float v0, v0, v48

    mul-float v42, v42, v1

    div-float v1, v42, v41

    sub-float/2addr v0, v1

    float-to-int v0, v0

    int-to-float v0, v0

    .line 102
    iput v0, v5, La/qt40;->d:F

    mul-float v0, v44, v43

    add-float v0, v0, v50

    mul-float v45, v45, v11

    div-float v11, v45, v41

    sub-float/2addr v0, v11

    float-to-int v0, v0

    int-to-float v0, v0

    .line 103
    iput v0, v5, La/qt40;->e:F

    add-float v3, v3, v42

    float-to-int v0, v3

    int-to-float v0, v0

    .line 104
    iput v0, v5, La/qt40;->f:F

    add-float v0, v46, v45

    float-to-int v0, v0

    int-to-float v0, v0

    .line 105
    iput v0, v5, La/qt40;->g:F

    .line 106
    iget v0, v6, La/ts40;->h:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_22

    move/from16 v0, v43

    :goto_12
    const/high16 v21, 0x7fc00000    # Float.NaN

    goto :goto_13

    :cond_22
    iget v0, v6, La/ts40;->h:F

    goto :goto_12

    .line 107
    :goto_13
    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_23

    const/4 v3, 0x0

    :goto_14
    move/from16 v41, v0

    goto :goto_15

    :cond_23
    move/from16 v3, v21

    goto :goto_14

    .line 108
    :goto_15
    iget v0, v6, La/ts40;->i:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_24

    move/from16 v0, v43

    goto :goto_16

    :cond_24
    iget v0, v6, La/ts40;->i:F

    .line 109
    :goto_16
    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->isNaN(F)Z

    move-result v42

    if-eqz v42, :cond_25

    const/16 v42, 0x0

    :goto_17
    move/from16 v43, v0

    const/4 v0, 0x0

    goto :goto_18

    :cond_25
    move/from16 v42, v21

    goto :goto_17

    .line 110
    :goto_18
    iput v0, v5, La/qt40;->n:I

    .line 111
    iget v0, v9, La/qt40;->d:F

    mul-float v41, v41, v15

    add-float v41, v41, v0

    mul-float v42, v42, v44

    add-float v42, v42, v41

    sub-float v0, v42, v1

    float-to-int v0, v0

    int-to-float v0, v0

    iput v0, v5, La/qt40;->d:F

    .line 112
    iget v0, v9, La/qt40;->e:F

    mul-float/2addr v15, v3

    add-float/2addr v15, v0

    mul-float v44, v44, v43

    add-float v44, v44, v15

    sub-float v0, v44, v11

    float-to-int v0, v0

    int-to-float v0, v0

    iput v0, v5, La/qt40;->e:F

    .line 113
    iget-object v0, v6, La/ts40;->e:Ljava/lang/String;

    invoke-static {v0}, La/fhn;->f(Ljava/lang/String;)La/fhn;

    move-result-object v0

    iput-object v0, v5, La/qt40;->a:La/fhn;

    const/4 v11, -0x1

    .line 114
    iput v11, v5, La/qt40;->i:I

    goto/16 :goto_1f

    :cond_26
    const/high16 v21, 0x7fc00000    # Float.NaN

    const/high16 v41, 0x40000000    # 2.0f

    int-to-float v0, v1

    div-float/2addr v0, v15

    .line 115
    iput v0, v5, La/qt40;->b:F

    .line 116
    iget v1, v6, La/ts40;->f:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_27

    move v1, v0

    goto :goto_19

    :cond_27
    iget v1, v6, La/ts40;->f:F

    .line 117
    :goto_19
    iget v3, v6, La/ts40;->g:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_28

    move v3, v0

    goto :goto_1a

    :cond_28
    iget v3, v6, La/ts40;->g:F

    .line 118
    :goto_1a
    iget v11, v8, La/qt40;->f:F

    iget v15, v9, La/qt40;->f:F

    sub-float v42, v11, v15

    move/from16 v43, v0

    .line 119
    iget v0, v8, La/qt40;->g:F

    move/from16 v44, v0

    iget v0, v9, La/qt40;->g:F

    sub-float v45, v44, v0

    move/from16 v46, v0

    .line 120
    iget v0, v5, La/qt40;->b:F

    iput v0, v5, La/qt40;->c:F

    .line 121
    iget v0, v9, La/qt40;->d:F

    div-float v47, v15, v41

    add-float v47, v47, v0

    move/from16 v48, v0

    .line 122
    iget v0, v9, La/qt40;->e:F

    div-float v49, v46, v41

    add-float v49, v49, v0

    move/from16 v50, v0

    .line 123
    iget v0, v8, La/qt40;->d:F

    div-float v11, v11, v41

    add-float/2addr v11, v0

    .line 124
    iget v0, v8, La/qt40;->e:F

    div-float v44, v44, v41

    add-float v44, v44, v0

    sub-float v11, v11, v47

    sub-float v44, v44, v49

    mul-float v11, v11, v43

    add-float v11, v11, v48

    mul-float v42, v42, v1

    div-float v0, v42, v41

    sub-float/2addr v11, v0

    float-to-int v0, v11

    int-to-float v0, v0

    .line 125
    iput v0, v5, La/qt40;->d:F

    mul-float v44, v44, v43

    add-float v44, v44, v50

    mul-float v45, v45, v3

    div-float v0, v45, v41

    sub-float v0, v44, v0

    float-to-int v0, v0

    int-to-float v0, v0

    .line 126
    iput v0, v5, La/qt40;->e:F

    add-float v15, v15, v42

    float-to-int v0, v15

    int-to-float v0, v0

    .line 127
    iput v0, v5, La/qt40;->f:F

    add-float v0, v46, v45

    float-to-int v0, v0

    int-to-float v0, v0

    .line 128
    iput v0, v5, La/qt40;->g:F

    const/4 v11, 0x2

    .line 129
    iput v11, v5, La/qt40;->n:I

    .line 130
    iget v0, v6, La/ts40;->h:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_29

    .line 131
    iget v0, v5, La/qt40;->f:F

    float-to-int v0, v0

    sub-int v0, p1, v0

    .line 132
    iget v1, v6, La/ts40;->h:F

    int-to-float v0, v0

    mul-float/2addr v1, v0

    float-to-int v0, v1

    int-to-float v0, v0

    iput v0, v5, La/qt40;->d:F

    .line 133
    :cond_29
    iget v0, v6, La/ts40;->i:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_2a

    .line 134
    iget v0, v5, La/qt40;->g:F

    float-to-int v0, v0

    sub-int v0, p2, v0

    .line 135
    iget v1, v6, La/ts40;->i:F

    int-to-float v0, v0

    mul-float/2addr v1, v0

    float-to-int v0, v1

    int-to-float v0, v0

    iput v0, v5, La/qt40;->e:F

    .line 136
    :cond_2a
    iget-object v0, v5, La/qt40;->j:Ljava/lang/String;

    iput-object v0, v5, La/qt40;->j:Ljava/lang/String;

    .line 137
    iget-object v0, v6, La/ts40;->e:Ljava/lang/String;

    invoke-static {v0}, La/fhn;->f(Ljava/lang/String;)La/fhn;

    move-result-object v0

    iput-object v0, v5, La/qt40;->a:La/fhn;

    const/4 v11, -0x1

    .line 138
    iput v11, v5, La/qt40;->i:I

    goto/16 :goto_1f

    :cond_2b
    const/high16 v21, 0x7fc00000    # Float.NaN

    const/high16 v41, 0x40000000    # 2.0f

    int-to-float v0, v1

    div-float/2addr v0, v15

    .line 139
    iput v0, v5, La/qt40;->b:F

    .line 140
    iget v1, v6, La/ts40;->f:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_2c

    move v1, v0

    goto :goto_1b

    :cond_2c
    iget v1, v6, La/ts40;->f:F

    .line 141
    :goto_1b
    iget v3, v6, La/ts40;->g:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_2d

    move v3, v0

    goto :goto_1c

    :cond_2d
    iget v3, v6, La/ts40;->g:F

    .line 142
    :goto_1c
    iget v11, v8, La/qt40;->f:F

    iget v15, v9, La/qt40;->f:F

    sub-float/2addr v11, v15

    .line 143
    iget v15, v8, La/qt40;->g:F

    move/from16 v42, v0

    iget v0, v9, La/qt40;->g:F

    sub-float/2addr v15, v0

    .line 144
    iget v0, v5, La/qt40;->b:F

    iput v0, v5, La/qt40;->c:F

    .line 145
    iget v0, v6, La/ts40;->h:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_2e

    goto :goto_1d

    :cond_2e
    iget v0, v6, La/ts40;->h:F

    move/from16 v42, v0

    .line 146
    :goto_1d
    iget v0, v9, La/qt40;->d:F

    move/from16 v43, v0

    iget v0, v9, La/qt40;->f:F

    div-float v44, v0, v41

    add-float v44, v44, v43

    move/from16 v45, v0

    .line 147
    iget v0, v9, La/qt40;->e:F

    move/from16 v46, v0

    iget v0, v9, La/qt40;->g:F

    div-float v47, v0, v41

    add-float v47, v47, v46

    move/from16 v48, v0

    .line 148
    iget v0, v8, La/qt40;->d:F

    move/from16 v49, v0

    iget v0, v8, La/qt40;->f:F

    div-float v0, v0, v41

    add-float v0, v0, v49

    move/from16 v49, v0

    .line 149
    iget v0, v8, La/qt40;->e:F

    move/from16 v50, v0

    iget v0, v8, La/qt40;->g:F

    div-float v0, v0, v41

    add-float v0, v0, v50

    sub-float v44, v49, v44

    sub-float v0, v0, v47

    mul-float v47, v44, v42

    add-float v43, v43, v47

    mul-float/2addr v11, v1

    div-float v1, v11, v41

    move/from16 v49, v1

    sub-float v1, v43, v49

    float-to-int v1, v1

    int-to-float v1, v1

    .line 150
    iput v1, v5, La/qt40;->d:F

    mul-float v42, v42, v0

    add-float v1, v46, v42

    mul-float/2addr v15, v3

    div-float v3, v15, v41

    sub-float/2addr v1, v3

    float-to-int v1, v1

    int-to-float v1, v1

    .line 151
    iput v1, v5, La/qt40;->e:F

    add-float v1, v45, v11

    float-to-int v1, v1

    int-to-float v1, v1

    .line 152
    iput v1, v5, La/qt40;->f:F

    add-float v1, v48, v15

    float-to-int v1, v1

    int-to-float v1, v1

    .line 153
    iput v1, v5, La/qt40;->g:F

    .line 154
    iget v1, v6, La/ts40;->i:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_2f

    const/4 v1, 0x0

    goto :goto_1e

    .line 155
    :cond_2f
    iget v1, v6, La/ts40;->i:F

    :goto_1e
    neg-float v0, v0

    mul-float/2addr v0, v1

    mul-float v44, v44, v1

    const/4 v11, 0x1

    .line 156
    iput v11, v5, La/qt40;->n:I

    .line 157
    iget v1, v9, La/qt40;->d:F

    add-float v1, v1, v47

    sub-float v1, v1, v49

    float-to-int v1, v1

    int-to-float v1, v1

    .line 158
    iget v11, v9, La/qt40;->e:F

    add-float v11, v11, v42

    sub-float/2addr v11, v3

    float-to-int v3, v11

    int-to-float v3, v3

    add-float/2addr v1, v0

    .line 159
    iput v1, v5, La/qt40;->d:F

    add-float v3, v3, v44

    .line 160
    iput v3, v5, La/qt40;->e:F

    .line 161
    iget-object v0, v5, La/qt40;->j:Ljava/lang/String;

    iput-object v0, v5, La/qt40;->j:Ljava/lang/String;

    .line 162
    iget-object v0, v6, La/ts40;->e:Ljava/lang/String;

    invoke-static {v0}, La/fhn;->f(Ljava/lang/String;)La/fhn;

    move-result-object v0

    iput-object v0, v5, La/qt40;->a:La/fhn;

    const/4 v11, -0x1

    .line 163
    iput v11, v5, La/qt40;->i:I

    .line 164
    :goto_1f
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_30
    :goto_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_31

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/qt40;

    .line 165
    iget v11, v5, La/qt40;->c:F

    iget v15, v3, La/qt40;->c:F

    cmpl-float v11, v11, v15

    if-nez v11, :cond_30

    move-object v1, v3

    goto :goto_20

    :cond_31
    if-eqz v1, :cond_32

    .line 166
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 167
    :cond_32
    invoke-static {v7, v5}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_33

    .line 168
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, " KeyPath position \""

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v5, La/qt40;->c:F

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, "\" outside of range"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "MotionController"

    invoke-static {v3, v1}, La/hxm0;->u(Ljava/lang/String;Ljava/lang/String;)V

    :cond_33
    neg-int v0, v0

    const/16 v31, 0x1

    add-int/lit8 v0, v0, -0x1

    .line 169
    invoke-virtual {v7, v0, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 170
    iget v0, v6, La/ts40;->d:I

    const/4 v11, -0x1

    if-eq v0, v11, :cond_36

    .line 171
    iput v0, v4, La/zr40;->b:I

    goto :goto_21

    :cond_34
    move-object/from16 v40, v0

    move-object/from16 v38, v1

    move-object/from16 v39, v3

    move-object/from16 v37, v11

    move-object/from16 v36, v15

    .line 172
    instance-of v0, v6, La/ss40;

    if-eqz v0, :cond_35

    .line 173
    invoke-virtual {v6, v13}, La/qs40;->a(Ljava/util/HashSet;)V

    goto :goto_21

    .line 174
    :cond_35
    invoke-virtual {v6, v14}, La/qs40;->b(Ljava/util/HashMap;)V

    .line 175
    invoke-virtual {v6, v12}, La/qs40;->a(Ljava/util/HashSet;)V

    :cond_36
    :goto_21
    move-object/from16 v5, v35

    move-object/from16 v15, v36

    move-object/from16 v11, v37

    move-object/from16 v1, v38

    move-object/from16 v3, v39

    move-object/from16 v0, v40

    goto/16 :goto_4

    :cond_37
    move-object/from16 v40, v0

    move-object/from16 v38, v1

    move-object/from16 v39, v3

    move-object/from16 v35, v5

    move-object/from16 v37, v11

    move-object/from16 v36, v15

    .line 176
    invoke-virtual {v12}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    const/16 v3, 0xa

    const-string v6, ","

    const-string v11, "CUSTOM,"

    if-nez v0, :cond_53

    .line 177
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, v4, La/zr40;->v:Ljava/util/HashMap;

    .line 178
    invoke-virtual {v12}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_3c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    .line 179
    invoke-virtual {v15, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v17

    if-eqz v17, :cond_3b

    const/16 p1, 0x3

    .line 180
    new-instance v1, La/zz2;

    invoke-direct {v1, v3}, La/zz2;-><init>(B)V

    .line 181
    invoke-virtual {v15, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v17

    const/16 v31, 0x1

    aget-object v5, v17, v31

    .line 182
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_23
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v34

    if-eqz v34, :cond_3a

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v34

    move-object/from16 v3, v34

    check-cast v3, La/qs40;

    move-object/from16 v34, v0

    .line 183
    iget-object v0, v3, La/qs40;->c:Ljava/util/HashMap;

    if-nez v0, :cond_39

    :cond_38
    :goto_24
    move-object/from16 v0, v34

    const/16 v3, 0xa

    goto :goto_23

    .line 184
    :cond_39
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/iyf;

    if-eqz v0, :cond_38

    .line 185
    iget v3, v3, La/qs40;->a:I

    invoke-virtual {v1, v3, v0}, La/zz2;->b(ILa/iyf;)V

    goto :goto_24

    :cond_3a
    move-object/from16 v34, v0

    .line 186
    new-instance v0, La/yzk0;

    .line 187
    invoke-direct {v0}, La/zzk0;-><init>()V

    .line 188
    invoke-virtual {v15, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const/16 v31, 0x1

    aget-object v3, v3, v31

    .line 189
    iput-object v1, v0, La/yzk0;->f:La/zz2;

    goto :goto_25

    :cond_3b
    move-object/from16 v34, v0

    const/16 p1, 0x3

    .line 190
    new-instance v0, La/xzk0;

    .line 191
    invoke-direct {v0}, La/zzk0;-><init>()V

    .line 192
    iput-object v15, v0, La/xzk0;->f:Ljava/lang/String;

    .line 193
    :goto_25
    iput-object v15, v0, La/zzk0;->e:Ljava/lang/String;

    .line 194
    iget-object v1, v4, La/zr40;->v:Ljava/util/HashMap;

    invoke-virtual {v1, v15, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v34

    const/16 v3, 0xa

    goto :goto_22

    :cond_3c
    const/16 p1, 0x3

    if-eqz v16, :cond_50

    .line 195
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_26
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_50

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/qs40;

    .line 196
    instance-of v3, v1, La/rs40;

    if-eqz v3, :cond_4f

    .line 197
    iget-object v3, v4, La/zr40;->v:Ljava/util/HashMap;

    check-cast v1, La/rs40;

    .line 198
    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_27
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_4f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    .line 199
    invoke-virtual {v3, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v34, v0

    move-object/from16 v0, v17

    check-cast v0, La/zzk0;

    if-nez v0, :cond_3d

    :goto_28
    move-object/from16 v0, v34

    goto :goto_27

    :cond_3d
    move-object/from16 v17, v3

    .line 200
    const-string v3, "CUSTOM"

    invoke-virtual {v15, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3f

    const/4 v3, 0x7

    .line 201
    invoke-virtual {v15, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 202
    iget-object v15, v1, La/qs40;->c:Ljava/util/HashMap;

    invoke-virtual {v15, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/iyf;

    if-eqz v3, :cond_3e

    .line 203
    check-cast v0, La/yzk0;

    iget v15, v1, La/qs40;->a:I

    .line 204
    iget-object v0, v0, La/yzk0;->f:La/zz2;

    invoke-virtual {v0, v15, v3}, La/zz2;->b(ILa/iyf;)V

    :cond_3e
    move-object/from16 v3, v17

    goto :goto_28

    .line 205
    :cond_3f
    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    :goto_29
    move-object/from16 v3, v22

    move-object/from16 v42, v40

    :goto_2a
    move-object/from16 v40, v38

    :goto_2b
    move-object/from16 v38, v27

    :goto_2c
    move-object/from16 v27, v26

    :goto_2d
    const/16 v26, -0x1

    goto/16 :goto_32

    :sswitch_0
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_40

    goto :goto_29

    :cond_40
    const/16 v3, 0xd

    goto :goto_2e

    :sswitch_1
    invoke-virtual {v15, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_41

    goto :goto_29

    :cond_41
    const/16 v3, 0xc

    :goto_2e
    move-object/from16 v42, v40

    move-object/from16 v40, v38

    move-object/from16 v38, v27

    move-object/from16 v27, v26

    move/from16 v26, v3

    goto/16 :goto_30

    :sswitch_2
    move-object/from16 v3, v40

    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v40

    if-nez v40, :cond_42

    move-object/from16 v42, v3

    goto :goto_2f

    :cond_42
    const/16 v40, 0xb

    move-object/from16 v42, v27

    move-object/from16 v27, v26

    move/from16 v26, v40

    move-object/from16 v40, v38

    move-object/from16 v38, v42

    move-object/from16 v42, v3

    goto/16 :goto_30

    :sswitch_3
    move-object/from16 v3, v39

    move-object/from16 v42, v40

    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v39

    if-nez v39, :cond_43

    move-object/from16 v39, v3

    :goto_2f
    move-object/from16 v3, v22

    goto :goto_2a

    :cond_43
    move-object/from16 v39, v3

    move-object/from16 v3, v22

    move-object/from16 v40, v38

    move-object/from16 v38, v27

    move-object/from16 v27, v26

    const/16 v26, 0xa

    goto/16 :goto_32

    :sswitch_4
    move-object/from16 v3, v38

    move-object/from16 v42, v40

    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v38

    if-nez v38, :cond_44

    move-object/from16 v40, v3

    move-object/from16 v3, v22

    goto :goto_2b

    :cond_44
    const/16 v38, 0x9

    move-object/from16 v40, v27

    move-object/from16 v27, v26

    move/from16 v26, v38

    move-object/from16 v38, v40

    move-object/from16 v40, v3

    goto/16 :goto_30

    :sswitch_5
    move-object/from16 v3, v27

    move-object/from16 v42, v40

    move-object/from16 v40, v38

    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v27

    if-nez v27, :cond_45

    move-object/from16 v38, v3

    move-object/from16 v3, v22

    goto/16 :goto_2c

    :cond_45
    const/16 v27, 0x8

    move/from16 v38, v27

    move-object/from16 v27, v26

    move/from16 v26, v38

    move-object/from16 v38, v3

    goto/16 :goto_30

    :sswitch_6
    move-object/from16 v3, v26

    move-object/from16 v42, v40

    move-object/from16 v40, v38

    move-object/from16 v38, v27

    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v26

    if-nez v26, :cond_46

    move-object/from16 v27, v3

    goto/16 :goto_31

    :cond_46
    const/16 v26, 0x7

    move-object/from16 v27, v3

    goto/16 :goto_30

    :sswitch_7
    move-object/from16 v3, v25

    move-object/from16 v42, v40

    move-object/from16 v40, v38

    move-object/from16 v38, v27

    move-object/from16 v27, v26

    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v25

    if-nez v25, :cond_47

    move-object/from16 v25, v3

    goto/16 :goto_31

    :cond_47
    move-object/from16 v25, v3

    move-object/from16 v3, v22

    const/16 v26, 0x6

    goto/16 :goto_32

    :sswitch_8
    move-object/from16 v3, v36

    move-object/from16 v42, v40

    move-object/from16 v40, v38

    move-object/from16 v38, v27

    move-object/from16 v27, v26

    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v26

    if-nez v26, :cond_48

    move-object/from16 v36, v3

    goto/16 :goto_31

    :cond_48
    const/16 v26, 0x5

    move-object/from16 v36, v3

    goto :goto_30

    :sswitch_9
    move-object/from16 v3, v37

    move-object/from16 v42, v40

    move-object/from16 v40, v38

    move-object/from16 v38, v27

    move-object/from16 v27, v26

    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v26

    if-nez v26, :cond_49

    goto :goto_31

    :cond_49
    move/from16 v26, v20

    goto :goto_30

    :sswitch_a
    move-object/from16 v3, v28

    move-object/from16 v42, v40

    move-object/from16 v40, v38

    move-object/from16 v38, v27

    move-object/from16 v27, v26

    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v26

    if-nez v26, :cond_4a

    move-object/from16 v28, v3

    goto :goto_31

    :cond_4a
    move/from16 v26, p1

    move-object/from16 v28, v3

    :goto_30
    move-object/from16 v3, v22

    goto :goto_32

    :sswitch_b
    move-object/from16 v3, v24

    move-object/from16 v42, v40

    move-object/from16 v40, v38

    move-object/from16 v38, v27

    move-object/from16 v27, v26

    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    if-nez v24, :cond_4b

    move-object/from16 v24, v3

    goto :goto_31

    :cond_4b
    move-object/from16 v24, v3

    move-object/from16 v3, v22

    const/16 v26, 0x2

    goto :goto_32

    :sswitch_c
    move-object/from16 v3, v23

    move-object/from16 v42, v40

    move-object/from16 v40, v38

    move-object/from16 v38, v27

    move-object/from16 v27, v26

    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-nez v23, :cond_4c

    move-object/from16 v23, v3

    :goto_31
    move-object/from16 v3, v22

    goto/16 :goto_2d

    :cond_4c
    move-object/from16 v23, v3

    move-object/from16 v3, v22

    const/16 v26, 0x1

    goto :goto_32

    :sswitch_d
    move-object/from16 v3, v22

    move-object/from16 v42, v40

    move-object/from16 v40, v38

    move-object/from16 v38, v27

    move-object/from16 v27, v26

    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-nez v22, :cond_4d

    goto/16 :goto_2d

    :cond_4d
    const/16 v26, 0x0

    :goto_32
    packed-switch v26, :pswitch_data_0

    .line 206
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    move-object/from16 v22, v3

    const-string v3, "not supported by KeyAttributes "

    invoke-virtual {v3, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto/16 :goto_33

    :pswitch_0
    move-object/from16 v22, v3

    .line 207
    iget v3, v1, La/rs40;->l:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_4e

    .line 208
    iget v3, v1, La/qs40;->a:I

    iget v15, v1, La/rs40;->l:F

    invoke-virtual {v0, v15, v3}, La/zzk0;->b(FI)V

    goto/16 :goto_33

    :pswitch_1
    move-object/from16 v22, v3

    .line 209
    iget v3, v1, La/rs40;->e:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_4e

    .line 210
    iget v3, v1, La/qs40;->a:I

    iget v15, v1, La/rs40;->e:F

    invoke-virtual {v0, v15, v3}, La/zzk0;->b(FI)V

    goto/16 :goto_33

    :pswitch_2
    move-object/from16 v22, v3

    .line 211
    iget v3, v1, La/rs40;->f:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_4e

    .line 212
    iget v3, v1, La/qs40;->a:I

    iget v15, v1, La/rs40;->f:F

    invoke-virtual {v0, v15, v3}, La/zzk0;->b(FI)V

    goto/16 :goto_33

    :pswitch_3
    move-object/from16 v22, v3

    .line 213
    iget v3, v1, La/rs40;->n:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_4e

    .line 214
    iget v3, v1, La/qs40;->a:I

    iget v15, v1, La/rs40;->n:F

    invoke-virtual {v0, v15, v3}, La/zzk0;->b(FI)V

    goto/16 :goto_33

    :pswitch_4
    move-object/from16 v22, v3

    .line 215
    iget v3, v1, La/rs40;->m:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_4e

    .line 216
    iget v3, v1, La/qs40;->a:I

    iget v15, v1, La/rs40;->m:F

    invoke-virtual {v0, v15, v3}, La/zzk0;->b(FI)V

    goto/16 :goto_33

    :pswitch_5
    move-object/from16 v22, v3

    .line 217
    iget v3, v1, La/rs40;->i:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_4e

    .line 218
    iget v3, v1, La/qs40;->a:I

    iget v15, v1, La/rs40;->k:F

    invoke-virtual {v0, v15, v3}, La/zzk0;->b(FI)V

    goto/16 :goto_33

    :pswitch_6
    move-object/from16 v22, v3

    .line 219
    iget v3, v1, La/rs40;->h:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_4e

    .line 220
    iget v3, v1, La/qs40;->a:I

    iget v15, v1, La/rs40;->j:F

    invoke-virtual {v0, v15, v3}, La/zzk0;->b(FI)V

    goto/16 :goto_33

    :pswitch_7
    move-object/from16 v22, v3

    .line 221
    iget v3, v1, La/rs40;->r:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_4e

    .line 222
    iget v3, v1, La/qs40;->a:I

    iget v15, v1, La/rs40;->r:F

    invoke-virtual {v0, v15, v3}, La/zzk0;->b(FI)V

    goto/16 :goto_33

    :pswitch_8
    move-object/from16 v22, v3

    .line 223
    iget v3, v1, La/rs40;->q:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_4e

    .line 224
    iget v3, v1, La/qs40;->a:I

    iget v15, v1, La/rs40;->q:F

    invoke-virtual {v0, v15, v3}, La/zzk0;->b(FI)V

    goto :goto_33

    :pswitch_9
    move-object/from16 v22, v3

    .line 225
    iget v3, v1, La/rs40;->p:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_4e

    .line 226
    iget v3, v1, La/qs40;->a:I

    iget v15, v1, La/rs40;->p:F

    invoke-virtual {v0, v15, v3}, La/zzk0;->b(FI)V

    goto :goto_33

    :pswitch_a
    move-object/from16 v22, v3

    .line 227
    iget v3, v1, La/rs40;->o:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_4e

    .line 228
    iget v3, v1, La/qs40;->a:I

    iget v15, v1, La/rs40;->o:F

    invoke-virtual {v0, v15, v3}, La/zzk0;->b(FI)V

    goto :goto_33

    :pswitch_b
    move-object/from16 v22, v3

    .line 229
    iget v3, v1, La/rs40;->g:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_4e

    .line 230
    iget v3, v1, La/qs40;->a:I

    iget v15, v1, La/rs40;->g:F

    invoke-virtual {v0, v15, v3}, La/zzk0;->b(FI)V

    goto :goto_33

    :pswitch_c
    move-object/from16 v22, v3

    .line 231
    iget v3, v1, La/rs40;->i:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_4e

    .line 232
    iget v3, v1, La/qs40;->a:I

    iget v15, v1, La/rs40;->i:F

    invoke-virtual {v0, v15, v3}, La/zzk0;->b(FI)V

    goto :goto_33

    :pswitch_d
    move-object/from16 v22, v3

    .line 233
    iget v3, v1, La/rs40;->h:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_4e

    .line 234
    iget v3, v1, La/qs40;->a:I

    iget v15, v1, La/rs40;->h:F

    invoke-virtual {v0, v15, v3}, La/zzk0;->b(FI)V

    :cond_4e
    :goto_33
    move-object/from16 v3, v17

    move-object/from16 v26, v27

    move-object/from16 v0, v34

    move-object/from16 v27, v38

    move-object/from16 v38, v40

    move-object/from16 v40, v42

    goto/16 :goto_27

    :cond_4f
    move-object/from16 v34, v0

    move-object/from16 v42, v40

    move-object/from16 v40, v38

    move-object/from16 v38, v27

    move-object/from16 v27, v26

    move-object/from16 v26, v27

    move-object/from16 v0, v34

    move-object/from16 v27, v38

    move-object/from16 v38, v40

    move-object/from16 v40, v42

    goto/16 :goto_26

    .line 235
    :cond_50
    iget-object v0, v4, La/zr40;->v:Ljava/util/HashMap;

    move-object/from16 v1, v29

    const/4 v15, 0x0

    invoke-virtual {v1, v0, v15}, La/bs40;->a(Ljava/util/HashMap;I)V

    .line 236
    iget-object v0, v4, La/zr40;->v:Ljava/util/HashMap;

    const/16 v1, 0x64

    move-object/from16 v3, v35

    invoke-virtual {v3, v0, v1}, La/bs40;->a(Ljava/util/HashMap;I)V

    .line 237
    iget-object v0, v4, La/zr40;->v:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_51
    :goto_34
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_54

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 238
    invoke-virtual {v14, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_52

    .line 239
    invoke-virtual {v14, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_52

    .line 240
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_35

    :cond_52
    const/4 v3, 0x0

    .line 241
    :goto_35
    iget-object v5, v4, La/zr40;->v:Ljava/util/HashMap;

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/zzk0;

    if-eqz v1, :cond_51

    .line 242
    invoke-virtual {v1, v3}, La/zzk0;->d(I)V

    goto :goto_34

    :cond_53
    const/16 p1, 0x3

    .line 243
    :cond_54
    invoke-virtual/range {v18 .. v18}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5e

    .line 244
    iget-object v0, v4, La/zr40;->u:Ljava/util/HashMap;

    if-nez v0, :cond_55

    .line 245
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, v4, La/zr40;->u:Ljava/util/HashMap;

    .line 246
    :cond_55
    invoke-virtual/range {v18 .. v18}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 247
    iget-object v3, v4, La/zr40;->u:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_56

    goto :goto_36

    .line 248
    :cond_56
    invoke-virtual {v1, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5a

    .line 249
    new-instance v3, La/zz2;

    const/16 v5, 0xa

    invoke-direct {v3, v5}, La/zz2;-><init>(B)V

    .line 250
    invoke-virtual {v1, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    const/16 v31, 0x1

    aget-object v10, v10, v31

    .line 251
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_37
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_59

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v5, v17

    check-cast v5, La/qs40;

    move-object/from16 v17, v0

    .line 252
    iget-object v0, v5, La/qs40;->c:Ljava/util/HashMap;

    if-nez v0, :cond_58

    :cond_57
    :goto_38
    move-object/from16 v0, v17

    const/16 v5, 0xa

    goto :goto_37

    .line 253
    :cond_58
    invoke-virtual {v0, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/iyf;

    if-eqz v0, :cond_57

    .line 254
    iget v5, v5, La/qs40;->a:I

    invoke-virtual {v3, v5, v0}, La/zz2;->b(ILa/iyf;)V

    goto :goto_38

    :cond_59
    move-object/from16 v17, v0

    .line 255
    new-instance v0, La/yzk0;

    .line 256
    invoke-direct {v0}, La/zzk0;-><init>()V

    .line 257
    invoke-virtual {v1, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    const/16 v31, 0x1

    aget-object v5, v5, v31

    .line 258
    iput-object v3, v0, La/yzk0;->f:La/zz2;

    goto :goto_39

    :cond_5a
    move-object/from16 v17, v0

    .line 259
    new-instance v0, La/xzk0;

    .line 260
    invoke-direct {v0}, La/zzk0;-><init>()V

    .line 261
    iput-object v1, v0, La/xzk0;->f:Ljava/lang/String;

    .line 262
    :goto_39
    iput-object v1, v0, La/zzk0;->e:Ljava/lang/String;

    move-object/from16 v0, v17

    goto :goto_36

    :cond_5b
    if-eqz v16, :cond_5c

    .line 263
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/qs40;

    goto :goto_3a

    .line 264
    :cond_5c
    iget-object v0, v4, La/zr40;->u:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 265
    invoke-virtual {v14, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5d

    .line 266
    invoke-virtual {v14, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_3c

    :cond_5d
    const/4 v3, 0x0

    .line 267
    :goto_3c
    iget-object v5, v4, La/zr40;->u:Ljava/util/HashMap;

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/rlu0;

    invoke-virtual {v1, v3}, La/rlu0;->e(I)V

    goto :goto_3b

    .line 268
    :cond_5e
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v1, v0, 0x2

    new-array v3, v1, [La/qt40;

    const/4 v15, 0x0

    .line 269
    aput-object v9, v3, v15

    const/16 v31, 0x1

    add-int/lit8 v0, v0, 0x1

    .line 270
    aput-object v8, v3, v0

    .line 271
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5f

    iget v0, v4, La/zr40;->b:I

    const/4 v5, -0x1

    if-ne v0, v5, :cond_5f

    .line 272
    iput v15, v4, La/zr40;->b:I

    .line 273
    :cond_5f
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v5, 0x1

    :goto_3d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_60

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/qt40;

    add-int/lit8 v7, v5, 0x1

    .line 274
    aput-object v6, v3, v5

    move v5, v7

    goto :goto_3d

    .line 275
    :cond_60
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 276
    iget-object v5, v8, La/qt40;->m:Ljava/util/HashMap;

    invoke-virtual {v5}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_61
    :goto_3e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_62

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 277
    iget-object v7, v9, La/qt40;->m:Ljava/util/HashMap;

    invoke-virtual {v7, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_61

    .line 278
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v12, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_61

    .line 279
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3e

    :cond_62
    const/4 v15, 0x0

    .line 280
    new-array v5, v15, [Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, v4, La/zr40;->o:[Ljava/lang/String;

    .line 281
    array-length v0, v0

    new-array v0, v0, [I

    iput-object v0, v4, La/zr40;->p:[I

    const/4 v0, 0x0

    .line 282
    :goto_3f
    iget-object v5, v4, La/zr40;->o:[Ljava/lang/String;

    array-length v6, v5

    if-ge v0, v6, :cond_65

    .line 283
    aget-object v5, v5, v0

    .line 284
    iget-object v6, v4, La/zr40;->p:[I

    const/16 v32, 0x0

    aput v32, v6, v0

    const/4 v6, 0x0

    :goto_40
    if-ge v6, v1, :cond_64

    .line 285
    aget-object v7, v3, v6

    iget-object v7, v7, La/qt40;->m:Ljava/util/HashMap;

    invoke-virtual {v7, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_63

    .line 286
    aget-object v7, v3, v6

    iget-object v7, v7, La/qt40;->m:Ljava/util/HashMap;

    invoke-virtual {v7, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/iyf;

    if-eqz v7, :cond_63

    .line 287
    iget-object v5, v4, La/zr40;->p:[I

    aget v6, v5, v0

    invoke-virtual {v7}, La/iyf;->d()I

    move-result v7

    add-int/2addr v7, v6

    aput v7, v5, v0

    goto :goto_41

    :cond_63
    add-int/lit8 v6, v6, 0x1

    goto :goto_40

    :cond_64
    :goto_41
    add-int/lit8 v0, v0, 0x1

    goto :goto_3f

    :cond_65
    const/16 v32, 0x0

    .line 288
    aget-object v0, v3, v32

    iget v0, v0, La/qt40;->i:I

    const/4 v11, -0x1

    if-eq v0, v11, :cond_66

    const/4 v0, 0x1

    goto :goto_42

    :cond_66
    const/4 v0, 0x0

    .line 289
    :goto_42
    array-length v5, v5

    const/16 v33, 0x12

    add-int v6, v33, v5

    new-array v5, v6, [Z

    const/4 v7, 0x1

    :goto_43
    if-ge v7, v1, :cond_6b

    .line 290
    aget-object v8, v3, v7

    add-int/lit8 v9, v7, -0x1

    aget-object v9, v3, v9

    .line 291
    iget v10, v8, La/qt40;->d:F

    .line 292
    iget v11, v9, La/qt40;->d:F

    invoke-static {v10, v11}, La/qt40;->b(FF)Z

    move-result v10

    .line 293
    iget v11, v8, La/qt40;->e:F

    iget v12, v9, La/qt40;->e:F

    invoke-static {v11, v12}, La/qt40;->b(FF)Z

    move-result v11

    const/16 v32, 0x0

    .line 294
    aget-boolean v12, v5, v32

    iget v14, v8, La/qt40;->c:F

    iget v15, v9, La/qt40;->c:F

    invoke-static {v14, v15}, La/qt40;->b(FF)Z

    move-result v14

    or-int/2addr v12, v14

    aput-boolean v12, v5, v32

    const/16 v31, 0x1

    .line 295
    aget-boolean v12, v5, v31

    if-nez v10, :cond_68

    if-nez v11, :cond_68

    if-eqz v0, :cond_67

    goto :goto_44

    :cond_67
    const/4 v14, 0x0

    goto :goto_45

    :cond_68
    :goto_44
    move/from16 v14, v31

    :goto_45
    or-int/2addr v12, v14

    aput-boolean v12, v5, v31

    const/16 v30, 0x2

    .line 296
    aget-boolean v12, v5, v30

    if-nez v10, :cond_6a

    if-nez v11, :cond_6a

    if-eqz v0, :cond_69

    goto :goto_46

    :cond_69
    const/4 v10, 0x0

    goto :goto_47

    :cond_6a
    :goto_46
    const/4 v10, 0x1

    :goto_47
    or-int/2addr v10, v12

    aput-boolean v10, v5, v30

    .line 297
    aget-boolean v10, v5, p1

    iget v11, v8, La/qt40;->f:F

    iget v12, v9, La/qt40;->f:F

    invoke-static {v11, v12}, La/qt40;->b(FF)Z

    move-result v11

    or-int/2addr v10, v11

    aput-boolean v10, v5, p1

    .line 298
    aget-boolean v10, v5, v20

    iget v8, v8, La/qt40;->g:F

    iget v9, v9, La/qt40;->g:F

    invoke-static {v8, v9}, La/qt40;->b(FF)Z

    move-result v8

    or-int/2addr v8, v10

    aput-boolean v8, v5, v20

    add-int/lit8 v7, v7, 0x1

    goto :goto_43

    :cond_6b
    const/4 v0, 0x1

    const/4 v7, 0x0

    :goto_48
    if-ge v0, v6, :cond_6d

    .line 299
    aget-boolean v8, v5, v0

    if-eqz v8, :cond_6c

    add-int/lit8 v7, v7, 0x1

    :cond_6c
    add-int/lit8 v0, v0, 0x1

    goto :goto_48

    .line 300
    :cond_6d
    new-array v0, v7, [I

    iput-object v0, v4, La/zr40;->l:[I

    const/4 v11, 0x2

    .line 301
    invoke-static {v11, v7}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 302
    new-array v7, v0, [D

    iput-object v7, v4, La/zr40;->m:[D

    .line 303
    new-array v0, v0, [D

    iput-object v0, v4, La/zr40;->n:[D

    const/4 v0, 0x1

    const/4 v7, 0x0

    :goto_49
    if-ge v0, v6, :cond_6f

    .line 304
    aget-boolean v8, v5, v0

    if-eqz v8, :cond_6e

    .line 305
    iget-object v8, v4, La/zr40;->l:[I

    add-int/lit8 v9, v7, 0x1

    aput v0, v8, v7

    move v7, v9

    :cond_6e
    add-int/lit8 v0, v0, 0x1

    goto :goto_49

    .line 306
    :cond_6f
    iget-object v0, v4, La/zr40;->l:[I

    array-length v0, v0

    const/4 v11, 0x2

    new-array v5, v11, [I

    const/16 v31, 0x1

    aput v0, v5, v31

    const/16 v32, 0x0

    aput v1, v5, v32

    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [[D

    .line 307
    new-array v6, v1, [D

    const/4 v7, 0x0

    :goto_4a
    if-ge v7, v1, :cond_72

    .line 308
    aget-object v8, v3, v7

    aget-object v9, v5, v7

    iget-object v10, v4, La/zr40;->l:[I

    .line 309
    iget v11, v8, La/qt40;->c:F

    .line 310
    iget v12, v8, La/qt40;->d:F

    iget v14, v8, La/qt40;->e:F

    iget v15, v8, La/qt40;->f:F

    move-object/from16 v17, v3

    iget v3, v8, La/qt40;->g:F

    iget v8, v8, La/qt40;->h:F

    move/from16 v18, v3

    move/from16 v22, v7

    const/4 v3, 0x6

    new-array v7, v3, [F

    const/16 v32, 0x0

    aput v11, v7, v32

    const/16 v31, 0x1

    aput v12, v7, v31

    const/16 v30, 0x2

    aput v14, v7, v30

    aput v15, v7, p1

    aput v18, v7, v20

    const/4 v3, 0x5

    aput v8, v7, v3

    const/4 v3, 0x0

    const/4 v8, 0x0

    .line 311
    :goto_4b
    array-length v11, v10

    if-ge v3, v11, :cond_71

    .line 312
    aget v11, v10, v3

    const/4 v12, 0x6

    if-ge v11, v12, :cond_70

    add-int/lit8 v12, v8, 0x1

    .line 313
    aget v11, v7, v11

    float-to-double v14, v11

    aput-wide v14, v9, v8

    move v8, v12

    :cond_70
    add-int/lit8 v3, v3, 0x1

    goto :goto_4b

    .line 314
    :cond_71
    aget-object v3, v17, v22

    iget v3, v3, La/qt40;->b:F

    float-to-double v7, v3

    aput-wide v7, v6, v22

    add-int/lit8 v7, v22, 0x1

    move-object/from16 v3, v17

    goto :goto_4a

    :cond_72
    move-object/from16 v17, v3

    const/4 v3, 0x0

    .line 315
    :goto_4c
    iget-object v7, v4, La/zr40;->l:[I

    array-length v8, v7

    if-ge v3, v8, :cond_74

    .line 316
    aget v7, v7, v3

    const/4 v12, 0x6

    if-ge v7, v12, :cond_73

    .line 317
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v8, v4, La/zr40;->l:[I

    aget v8, v8, v3

    sget-object v9, La/qt40;->q:[Ljava/lang/String;

    aget-object v8, v9, v8

    const-string v9, " ["

    .line 318
    invoke-static {v7, v8, v9}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    :goto_4d
    if-ge v8, v1, :cond_73

    .line 319
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v7, v5, v8

    aget-wide v10, v7, v3

    invoke-virtual {v9, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    add-int/lit8 v8, v8, 0x1

    goto :goto_4d

    :cond_73
    add-int/lit8 v3, v3, 0x1

    goto :goto_4c

    .line 320
    :cond_74
    iget-object v3, v4, La/zr40;->o:[Ljava/lang/String;

    array-length v3, v3

    const/16 v31, 0x1

    add-int/lit8 v3, v3, 0x1

    new-array v3, v3, [La/kpb;

    iput-object v3, v4, La/zr40;->g:[La/kpb;

    const/4 v3, 0x0

    .line 321
    :goto_4e
    iget-object v7, v4, La/zr40;->o:[Ljava/lang/String;

    array-length v8, v7

    if-ge v3, v8, :cond_7c

    .line 322
    aget-object v7, v7, v3

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_4f
    if-ge v8, v1, :cond_7b

    .line 323
    aget-object v12, v17, v8

    .line 324
    iget-object v12, v12, La/qt40;->m:Ljava/util/HashMap;

    .line 325
    invoke-virtual {v12, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7a

    if-nez v11, :cond_76

    .line 326
    new-array v10, v1, [D

    .line 327
    aget-object v11, v17, v8

    .line 328
    iget-object v11, v11, La/qt40;->m:Ljava/util/HashMap;

    .line 329
    invoke-virtual {v11, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, La/iyf;

    if-nez v11, :cond_75

    const/4 v11, 0x0

    :goto_50
    const/4 v12, 0x2

    goto :goto_51

    .line 330
    :cond_75
    invoke-virtual {v11}, La/iyf;->d()I

    move-result v11

    goto :goto_50

    .line 331
    :goto_51
    new-array v14, v12, [I

    const/16 v31, 0x1

    aput v11, v14, v31

    const/16 v32, 0x0

    aput v1, v14, v32

    invoke-static {v0, v14}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [[D

    .line 332
    :cond_76
    aget-object v12, v17, v8

    iget v14, v12, La/qt40;->b:F

    float-to-double v14, v14

    aput-wide v14, v10, v9

    .line 333
    aget-object v14, v11, v9

    .line 334
    iget-object v12, v12, La/qt40;->m:Ljava/util/HashMap;

    invoke-virtual {v12, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La/iyf;

    if-nez v12, :cond_77

    move/from16 v18, v3

    move-object/from16 p1, v7

    move v15, v8

    goto :goto_53

    .line 335
    :cond_77
    invoke-virtual {v12}, La/iyf;->d()I

    move-result v15

    move/from16 v18, v3

    const/4 v3, 0x1

    if-ne v15, v3, :cond_78

    .line 336
    invoke-virtual {v12}, La/iyf;->b()F

    move-result v3

    move-object/from16 p1, v7

    move v15, v8

    float-to-double v7, v3

    const/16 v32, 0x0

    aput-wide v7, v14, v32

    goto :goto_53

    :cond_78
    move-object/from16 p1, v7

    move v15, v8

    .line 337
    invoke-virtual {v12}, La/iyf;->d()I

    move-result v3

    .line 338
    new-array v7, v3, [F

    .line 339
    invoke-virtual {v12, v7}, La/iyf;->c([F)V

    const/4 v8, 0x0

    const/4 v12, 0x0

    :goto_52
    if-ge v8, v3, :cond_79

    add-int/lit8 v20, v12, 0x1

    move/from16 p2, v3

    .line 340
    aget v3, v7, v8

    move-object/from16 v22, v7

    move/from16 v23, v8

    float-to-double v7, v3

    aput-wide v7, v14, v12

    add-int/lit8 v8, v23, 0x1

    move/from16 v3, p2

    move/from16 v12, v20

    move-object/from16 v7, v22

    goto :goto_52

    :cond_79
    :goto_53
    add-int/lit8 v9, v9, 0x1

    goto :goto_54

    :cond_7a
    move/from16 v18, v3

    move-object/from16 p1, v7

    move v15, v8

    :goto_54
    add-int/lit8 v8, v15, 0x1

    move-object/from16 v7, p1

    move/from16 v3, v18

    goto/16 :goto_4f

    :cond_7b
    move/from16 v18, v3

    .line 341
    invoke-static {v10, v9}, Ljava/util/Arrays;->copyOf([DI)[D

    move-result-object v3

    .line 342
    invoke-static {v11, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [[D

    .line 343
    iget-object v8, v4, La/zr40;->g:[La/kpb;

    add-int/lit8 v9, v18, 0x1

    iget v10, v4, La/zr40;->b:I

    invoke-static {v10, v3, v7}, La/kpb;->y(I[D[[D)La/kpb;

    move-result-object v3

    aput-object v3, v8, v9

    move v3, v9

    goto/16 :goto_4e

    .line 344
    :cond_7c
    iget-object v3, v4, La/zr40;->g:[La/kpb;

    iget v7, v4, La/zr40;->b:I

    invoke-static {v7, v6, v5}, La/kpb;->y(I[D[[D)La/kpb;

    move-result-object v5

    const/16 v32, 0x0

    aput-object v5, v3, v32

    .line 345
    aget-object v3, v17, v32

    iget v3, v3, La/qt40;->i:I

    const/4 v11, -0x1

    if-eq v3, v11, :cond_7e

    .line 346
    new-array v3, v1, [I

    .line 347
    new-array v5, v1, [D

    const/4 v11, 0x2

    .line 348
    new-array v6, v11, [I

    const/16 v31, 0x1

    aput v11, v6, v31

    aput v1, v6, v32

    invoke-static {v0, v6}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[D

    const/4 v15, 0x0

    :goto_55
    if-ge v15, v1, :cond_7d

    .line 349
    aget-object v6, v17, v15

    iget v7, v6, La/qt40;->i:I

    aput v7, v3, v15

    .line 350
    iget v7, v6, La/qt40;->b:F

    float-to-double v7, v7

    aput-wide v7, v5, v15

    .line 351
    aget-object v7, v0, v15

    iget v8, v6, La/qt40;->d:F

    float-to-double v8, v8

    const/16 v32, 0x0

    aput-wide v8, v7, v32

    .line 352
    iget v6, v6, La/qt40;->e:F

    float-to-double v8, v6

    const/16 v31, 0x1

    aput-wide v8, v7, v31

    add-int/lit8 v15, v15, 0x1

    goto :goto_55

    .line 353
    :cond_7d
    new-instance v1, La/aw3;

    invoke-direct {v1, v3, v5, v0}, La/aw3;-><init>([I[D[[D)V

    .line 354
    iput-object v1, v4, La/zr40;->h:La/aw3;

    .line 355
    :cond_7e
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, v4, La/zr40;->w:Ljava/util/HashMap;

    if-eqz v16, :cond_84

    .line 356
    invoke-virtual {v13}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move/from16 v1, v21

    :goto_56
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_81

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 357
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7f

    .line 358
    new-instance v5, La/aky;

    .line 359
    invoke-direct {v5}, La/cky;-><init>()V

    .line 360
    invoke-static {v3}, La/k0t0;->a(Ljava/lang/String;)I

    move-result v6

    iput v6, v5, La/aky;->g:I

    goto :goto_57

    .line 361
    :cond_7f
    new-instance v5, La/zjy;

    .line 362
    invoke-direct {v5}, La/cky;-><init>()V

    .line 363
    invoke-static {v3}, La/k0t0;->a(Ljava/lang/String;)I

    move-result v6

    iput v6, v5, La/zjy;->g:I

    .line 364
    :goto_57
    iget v6, v5, La/cky;->e:I

    const/4 v11, 0x1

    if-ne v6, v11, :cond_80

    .line 365
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-eqz v6, :cond_80

    .line 366
    invoke-virtual {v4}, La/zr40;->g()F

    move-result v1

    .line 367
    :cond_80
    iput-object v3, v5, La/cky;->b:Ljava/lang/String;

    .line 368
    iget-object v6, v4, La/zr40;->w:Ljava/util/HashMap;

    invoke-virtual {v6, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_56

    .line 369
    :cond_81
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_82
    :goto_58
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_83

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/qs40;

    .line 370
    instance-of v2, v1, La/ss40;

    if-eqz v2, :cond_82

    .line 371
    check-cast v1, La/ss40;

    iget-object v2, v4, La/zr40;->w:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, La/ss40;->f(Ljava/util/HashMap;)V

    goto :goto_58

    .line 372
    :cond_83
    iget-object v0, v4, La/zr40;->w:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_59
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_84

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/cky;

    .line 373
    invoke-virtual {v1}, La/cky;->d()V

    goto :goto_59

    :cond_84
    const/4 v15, 0x0

    move-object/from16 v0, p0

    .line 374
    iput-boolean v15, v0, La/ems0;->e:Z

    goto :goto_5a

    :cond_85
    move-object/from16 v19, v3

    .line 375
    :goto_5a
    iget-object v1, v0, La/ems0;->a:La/vdv0;

    iget-object v2, v0, La/ems0;->b:La/vdv0;

    move/from16 v3, p3

    move-object/from16 v5, p4

    move-object/from16 v6, v19

    invoke-static {v6, v1, v2, v5, v3}, La/vdv0;->b(La/vdv0;La/vdv0;La/vdv0;La/fms0;F)V

    .line 376
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    iget-object v0, v0, La/ems0;->h:La/ywu;

    .line 378
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 379
    invoke-virtual {v4, v0, v3}, La/zr40;->h(La/ywu;F)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4a771f66 -> :sswitch_d
        -0x4a771f65 -> :sswitch_c
        -0x4a771f64 -> :sswitch_b
        -0x490b9c39 -> :sswitch_a
        -0x490b9c38 -> :sswitch_9
        -0x490b9c37 -> :sswitch_8
        -0x3bab3dd3 -> :sswitch_7
        -0x3ae243aa -> :sswitch_6
        -0x3ae243a9 -> :sswitch_5
        -0x3621dfb2 -> :sswitch_4
        -0x3621dfb1 -> :sswitch_3
        -0x42d1a3 -> :sswitch_2
        0x589b15e -> :sswitch_1
        0x2fdfbde0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
