.class public final La/v03;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ao80;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/y9q0;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:La/mrq;

.field public final f:La/w6k;

.field public final g:La/j23;

.field public final h:Ljava/lang/CharSequence;

.field public final i:La/q6z;

.field public j:La/y3v;

.field public final k:Z

.field public final l:I

.field public final m:I


# direct methods
.method public constructor <init>(Ljava/lang/String;La/y9q0;Ljava/util/List;Ljava/util/List;La/mrq;La/w6k;Z)V
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, p1

    .line 2
    iput-object v4, v0, La/v03;->a:Ljava/lang/String;

    .line 3
    iput-object v1, v0, La/v03;->b:La/y9q0;

    .line 4
    iput-object v2, v0, La/v03;->c:Ljava/util/List;

    move-object/from16 v4, p4

    .line 5
    iput-object v4, v0, La/v03;->d:Ljava/util/List;

    move-object/from16 v4, p5

    .line 6
    iput-object v4, v0, La/v03;->e:La/mrq;

    .line 7
    iput-object v3, v0, La/v03;->f:La/w6k;

    .line 8
    new-instance v4, La/j23;

    invoke-interface {v3}, La/w6k;->getDensity()F

    move-result v5

    const/4 v6, 0x1

    .line 9
    invoke-direct {v4, v6}, Landroid/text/TextPaint;-><init>(I)V

    .line 10
    iput v5, v4, Landroid/text/TextPaint;->density:F

    .line 11
    sget-object v5, La/k5q0;->b:La/k5q0;

    .line 12
    iput-object v5, v4, La/j23;->b:La/k5q0;

    const/4 v5, 0x3

    .line 13
    iput-byte v5, v4, La/j23;->c:B

    .line 14
    sget-object v7, La/ljj0;->d:La/ljj0;

    .line 15
    iput-object v7, v4, La/j23;->d:La/ljj0;

    .line 16
    iput-object v4, v0, La/v03;->g:La/j23;

    .line 17
    invoke-static {v1}, La/m8x;->V(La/y9q0;)Z

    move-result v7

    iget-object v8, v1, La/y9q0;->a:La/smk0;

    iget-object v1, v1, La/y9q0;->b:La/eo80;

    const/4 v9, 0x0

    if-nez v7, :cond_0

    move v7, v9

    goto :goto_1

    .line 18
    :cond_0
    sget-object v7, La/usn;->a:La/clc;

    .line 19
    sget-object v7, La/usn;->a:La/clc;

    .line 20
    iget-object v10, v7, La/clc;->b:Ljava/lang/Object;

    check-cast v10, La/l7m0;

    if-eqz v10, :cond_1

    goto :goto_0

    .line 21
    :cond_1
    invoke-static {}, La/qsn;->d()Z

    move-result v10

    if-eqz v10, :cond_2

    .line 22
    invoke-virtual {v7}, La/clc;->e()La/l7m0;

    move-result-object v10

    iput-object v10, v7, La/clc;->b:Ljava/lang/Object;

    goto :goto_0

    .line 23
    :cond_2
    sget-object v10, La/y0x0;->i:La/p3x;

    .line 24
    :goto_0
    invoke-interface {v10}, La/l7m0;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 25
    :goto_1
    iput-boolean v7, v0, La/v03;->k:Z

    .line 26
    iget v7, v1, La/eo80;->b:I

    .line 27
    iget-object v10, v8, La/smk0;->k:La/rs00;

    const/4 v11, 0x4

    const/4 v13, 0x2

    if-ne v7, v11, :cond_4

    :cond_3
    :goto_2
    move v7, v13

    goto :goto_4

    :cond_4
    const/4 v11, 0x5

    if-ne v7, v11, :cond_6

    :cond_5
    move v7, v5

    goto :goto_4

    :cond_6
    if-ne v7, v6, :cond_7

    move v7, v9

    goto :goto_4

    :cond_7
    if-ne v7, v13, :cond_8

    move v7, v6

    goto :goto_4

    :cond_8
    if-ne v7, v5, :cond_9

    goto :goto_3

    :cond_9
    if-nez v7, :cond_7c

    :goto_3
    if-eqz v10, :cond_a

    .line 28
    iget-object v7, v10, La/rs00;->a:Ljava/util/List;

    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/qs00;

    .line 29
    iget-object v7, v7, La/qs00;->a:Ljava/util/Locale;

    if-nez v7, :cond_b

    .line 30
    :cond_a
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    .line 31
    :cond_b
    invoke-static {v7}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result v7

    if-eqz v7, :cond_3

    if-eq v7, v6, :cond_5

    goto :goto_2

    .line 32
    :goto_4
    iput v7, v0, La/v03;->l:I

    const/4 v7, -0x1

    .line 33
    iput v7, v0, La/v03;->m:I

    .line 34
    new-instance v10, La/awh;

    invoke-direct {v10, v0, v13}, La/awh;-><init>(Ljava/lang/Object;B)V

    .line 35
    iget-object v1, v1, La/eo80;->i:La/i9q0;

    if-nez v1, :cond_c

    .line 36
    sget-object v1, La/i9q0;->c:La/i9q0;

    .line 37
    :cond_c
    iget-boolean v11, v1, La/i9q0;->b:Z

    if-eqz v11, :cond_d

    .line 38
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v11

    or-int/lit16 v11, v11, 0x80

    goto :goto_5

    .line 39
    :cond_d
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v11

    and-int/lit16 v11, v11, -0x81

    .line 40
    :goto_5
    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setFlags(I)V

    .line 41
    iget v1, v1, La/i9q0;->a:I

    if-ne v1, v6, :cond_e

    .line 42
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v1

    or-int/lit8 v1, v1, 0x40

    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setFlags(I)V

    .line 43
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_6

    :cond_e
    if-ne v1, v13, :cond_f

    .line 44
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 45
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_6

    :cond_f
    if-ne v1, v5, :cond_10

    .line 46
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 47
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_6

    .line 48
    :cond_10
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 49
    :goto_6
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v1

    move v5, v9

    :goto_7
    if-ge v5, v1, :cond_12

    .line 50
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 51
    move-object v14, v11

    check-cast v14, La/i83;

    .line 52
    iget-object v14, v14, La/i83;->a:Ljava/lang/Object;

    .line 53
    instance-of v14, v14, La/smk0;

    if-eqz v14, :cond_11

    goto :goto_8

    :cond_11
    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :cond_12
    const/4 v11, 0x0

    :goto_8
    if-eqz v11, :cond_13

    move v1, v6

    goto :goto_9

    :cond_13
    move v1, v9

    .line 54
    :goto_9
    iget-wide v14, v8, La/smk0;->b:J

    iget-object v2, v8, La/smk0;->c:La/psq;

    iget-object v5, v8, La/smk0;->d:La/lsq;

    iget-object v11, v8, La/smk0;->g:Ljava/lang/String;

    const/16 p1, 0x0

    iget-object v12, v8, La/smk0;->k:La/rs00;

    move/from16 p4, v6

    iget-object v6, v8, La/smk0;->a:La/e8q0;

    iget-object v13, v8, La/smk0;->j:La/f8q0;

    move-object/from16 p7, v10

    iget-wide v9, v8, La/smk0;->h:J

    move-object/from16 v16, v8

    .line 55
    invoke-static {v14, v15}, La/daq0;->b(J)J

    move-result-wide v7

    move/from16 p3, v1

    move-object/from16 v18, v2

    const-wide v1, 0x100000000L

    .line 56
    invoke-static {v7, v8, v1, v2}, La/eaq0;->a(JJ)Z

    move-result v19

    const-wide v1, 0x200000000L

    if-eqz v19, :cond_15

    invoke-interface {v3, v14, v15}, La/w6k;->X(J)F

    move-result v7

    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    :cond_14
    :goto_a
    move-object/from16 v7, v16

    goto :goto_b

    .line 57
    :cond_15
    invoke-static {v7, v8, v1, v2}, La/eaq0;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_14

    .line 58
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v7

    invoke-static {v14, v15}, La/daq0;->c(J)F

    move-result v8

    mul-float/2addr v8, v7

    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_a

    .line 59
    :goto_b
    iget-object v8, v7, La/smk0;->f:La/nrq;

    if-nez v8, :cond_17

    if-nez v5, :cond_17

    if-eqz v18, :cond_16

    goto :goto_c

    :cond_16
    move-object/from16 v1, p7

    move-object/from16 v16, v6

    goto :goto_12

    :cond_17
    :goto_c
    if-nez v18, :cond_18

    .line 60
    sget-object v14, La/psq;->e:La/psq;

    goto :goto_d

    :cond_18
    move-object/from16 v14, v18

    :goto_d
    if-eqz v5, :cond_19

    .line 61
    iget v5, v5, La/lsq;->a:I

    goto :goto_e

    :cond_19
    const/4 v5, 0x0

    .line 62
    :goto_e
    iget-object v15, v7, La/smk0;->e:La/msq;

    if-eqz v15, :cond_1a

    .line 63
    iget v15, v15, La/msq;->a:I

    :goto_f
    move-object/from16 v1, p7

    goto :goto_10

    :cond_1a
    const v15, 0xffff

    goto :goto_f

    .line 64
    :goto_10
    iget-object v2, v1, La/awh;->b:Ljava/lang/Object;

    check-cast v2, La/v03;

    move-object/from16 v16, v6

    .line 65
    iget-object v6, v2, La/v03;->e:La/mrq;

    check-cast v6, La/orq;

    invoke-virtual {v6, v8, v14, v5, v15}, La/orq;->b(La/nrq;La/psq;II)La/b1t0;

    move-result-object v5

    .line 66
    instance-of v6, v5, La/a1t0;

    if-nez v6, :cond_1b

    .line 67
    new-instance v6, La/y3v;

    iget-object v8, v2, La/v03;->j:La/y3v;

    invoke-direct {v6, v5, v8}, La/y3v;-><init>(La/b1t0;La/y3v;)V

    .line 68
    iput-object v6, v2, La/v03;->j:La/y3v;

    .line 69
    iget-object v2, v6, La/y3v;->d:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v2, Landroid/graphics/Typeface;

    goto :goto_11

    .line 70
    :cond_1b
    check-cast v5, La/a1t0;

    .line 71
    iget-object v2, v5, La/a1t0;->a:Ljava/lang/Object;

    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v2, Landroid/graphics/Typeface;

    .line 73
    :goto_11
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :goto_12
    const/16 v2, 0xa

    if-eqz v12, :cond_1d

    .line 74
    sget-object v5, La/rs00;->c:La/rs00;

    .line 75
    sget-object v5, La/wv90;->a:La/khf0;

    .line 76
    invoke-virtual {v5}, La/khf0;->u()La/rs00;

    move-result-object v5

    .line 77
    invoke-virtual {v12, v5}, La/rs00;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1d

    .line 78
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v12, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    iget-object v6, v12, La/rs00;->a:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 80
    :goto_13
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 81
    check-cast v8, La/qs00;

    .line 82
    iget-object v8, v8, La/qs00;->a:Ljava/util/Locale;

    .line 83
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_1c
    const/4 v8, 0x0

    .line 84
    new-array v6, v8, [Ljava/util/Locale;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    .line 85
    check-cast v5, [Ljava/util/Locale;

    array-length v6, v5

    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Ljava/util/Locale;

    new-instance v6, Landroid/os/LocaleList;

    invoke-direct {v6, v5}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 86
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextLocales(Landroid/os/LocaleList;)V

    :cond_1d
    if-eqz v11, :cond_1e

    .line 87
    const-string v5, ""

    .line 88
    invoke-virtual {v11, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1e

    .line 89
    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    :cond_1e
    if-eqz v13, :cond_1f

    .line 90
    sget-object v5, La/f8q0;->c:La/f8q0;

    .line 91
    invoke-virtual {v13, v5}, La/f8q0;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1f

    .line 92
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v5

    .line 93
    iget v6, v13, La/f8q0;->a:F

    mul-float/2addr v5, v6

    .line 94
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 95
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v5

    .line 96
    iget v6, v13, La/f8q0;->b:F

    add-float/2addr v5, v6

    .line 97
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 98
    :cond_1f
    invoke-interface/range {v16 .. v16}, La/e8q0;->h()J

    move-result-wide v5

    .line 99
    invoke-virtual {v4, v5, v6}, La/j23;->d(J)V

    .line 100
    invoke-interface/range {v16 .. v16}, La/e8q0;->l()La/t89;

    move-result-object v5

    const-wide v11, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 101
    invoke-interface/range {v16 .. v16}, La/e8q0;->g()F

    move-result v6

    .line 102
    invoke-virtual {v4, v5, v11, v12, v6}, La/j23;->c(La/t89;JF)V

    .line 103
    iget-object v5, v7, La/smk0;->n:La/ljj0;

    .line 104
    invoke-virtual {v4, v5}, La/j23;->f(La/ljj0;)V

    .line 105
    iget-object v5, v7, La/smk0;->m:La/k5q0;

    .line 106
    invoke-virtual {v4, v5}, La/j23;->g(La/k5q0;)V

    .line 107
    iget-object v5, v7, La/smk0;->o:La/agc;

    .line 108
    invoke-virtual {v4, v5}, La/j23;->e(La/agc;)V

    .line 109
    invoke-static {v9, v10}, La/daq0;->b(J)J

    move-result-wide v5

    const-wide v11, 0x100000000L

    invoke-static {v5, v6, v11, v12}, La/eaq0;->a(JJ)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_22

    invoke-static {v9, v10}, La/daq0;->c(J)F

    move-result v5

    cmpg-float v5, v5, v6

    if-nez v5, :cond_20

    goto :goto_14

    .line 110
    :cond_20
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v5

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v8

    mul-float/2addr v8, v5

    .line 111
    invoke-interface {v3, v9, v10}, La/w6k;->X(J)F

    move-result v3

    cmpg-float v5, v8, v6

    if-nez v5, :cond_21

    goto :goto_15

    :cond_21
    div-float/2addr v3, v8

    .line 112
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    goto :goto_15

    .line 113
    :cond_22
    :goto_14
    invoke-static {v9, v10}, La/daq0;->b(J)J

    move-result-wide v11

    const-wide v13, 0x200000000L

    invoke-static {v11, v12, v13, v14}, La/eaq0;->a(JJ)Z

    move-result v3

    if-eqz v3, :cond_23

    .line 114
    invoke-static {v9, v10}, La/daq0;->c(J)F

    move-result v3

    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 115
    :cond_23
    :goto_15
    iget-wide v3, v7, La/smk0;->l:J

    .line 116
    iget-object v5, v7, La/smk0;->i:La/j56;

    if-eqz p3, :cond_25

    .line 117
    invoke-static {v9, v10}, La/daq0;->b(J)J

    move-result-wide v7

    const-wide v11, 0x100000000L

    invoke-static {v7, v8, v11, v12}, La/eaq0;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_25

    invoke-static {v9, v10}, La/daq0;->c(J)F

    move-result v7

    cmpg-float v7, v7, v6

    if-nez v7, :cond_24

    goto :goto_16

    :cond_24
    move/from16 v7, p4

    goto :goto_17

    :cond_25
    :goto_16
    const/4 v7, 0x0

    .line 118
    :goto_17
    sget-wide v11, La/y3d;->g:J

    .line 119
    invoke-static {v3, v4, v11, v12}, La/h2t0;->a(JJ)Z

    move-result v8

    if-nez v8, :cond_26

    .line 120
    sget-wide v13, La/y3d;->f:J

    .line 121
    invoke-static {v3, v4, v13, v14}, La/h2t0;->a(JJ)Z

    move-result v8

    if-nez v8, :cond_26

    move/from16 v8, p4

    goto :goto_18

    :cond_26
    const/4 v8, 0x0

    :goto_18
    if-eqz v5, :cond_28

    .line 122
    iget v13, v5, La/j56;->a:F

    .line 123
    invoke-static {v13, v6}, Ljava/lang/Float;->compare(FF)I

    move-result v13

    if-nez v13, :cond_27

    goto :goto_19

    :cond_27
    move/from16 v13, p4

    goto :goto_1a

    :cond_28
    :goto_19
    const/4 v13, 0x0

    :goto_1a
    if-nez v7, :cond_29

    if-nez v8, :cond_29

    if-nez v13, :cond_29

    move-object/from16 v3, p1

    goto :goto_1f

    :cond_29
    if-eqz v7, :cond_2a

    :goto_1b
    move-wide/from16 v30, v9

    goto :goto_1c

    .line 124
    :cond_2a
    sget-wide v9, La/daq0;->c:J

    goto :goto_1b

    :goto_1c
    if-eqz v8, :cond_2b

    move-wide/from16 v35, v3

    goto :goto_1d

    :cond_2b
    move-wide/from16 v35, v11

    :goto_1d
    if-eqz v13, :cond_2c

    move-object/from16 v32, v5

    goto :goto_1e

    :cond_2c
    move-object/from16 v32, p1

    .line 125
    :goto_1e
    new-instance v20, La/smk0;

    const/16 v39, 0x0

    const v40, 0xf67f

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v20 .. v40}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;I)V

    move-object/from16 v3, v20

    .line 126
    :goto_1f
    iget-object v4, v0, La/v03;->c:Ljava/util/List;

    if-eqz v3, :cond_2f

    .line 127
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v7, 0x0

    :goto_20
    if-ge v7, v4, :cond_2e

    if-nez v7, :cond_2d

    .line 128
    new-instance v8, La/i83;

    .line 129
    iget-object v9, v0, La/v03;->a:Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v10, 0x0

    .line 130
    invoke-direct {v8, v10, v9, v3}, La/i83;-><init>(IILjava/lang/Object;)V

    goto :goto_21

    .line 131
    :cond_2d
    iget-object v8, v0, La/v03;->c:Ljava/util/List;

    add-int/lit8 v9, v7, -0x1

    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La/i83;

    .line 132
    :goto_21
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_20

    :cond_2e
    move-object v4, v5

    .line 133
    :cond_2f
    iget-object v3, v0, La/v03;->a:Ljava/lang/String;

    .line 134
    iget-object v5, v0, La/v03;->g:La/j23;

    invoke-virtual {v5}, Landroid/graphics/Paint;->getTextSize()F

    move-result v5

    .line 135
    iget-object v7, v0, La/v03;->b:La/y9q0;

    .line 136
    iget-object v8, v0, La/v03;->d:Ljava/util/List;

    .line 137
    iget-object v12, v0, La/v03;->f:La/w6k;

    .line 138
    iget-boolean v9, v0, La/v03;->k:Z

    .line 139
    iget-object v10, v0, La/v03;->a:Ljava/lang/String;

    iget v11, v0, La/v03;->m:I

    const/4 v13, -0x1

    if-ne v11, v13, :cond_32

    .line 140
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    const/16 v13, 0x200

    if-gt v11, v13, :cond_31

    invoke-static {v10, v2}, Lkotlin/text/StringsKt;->P(Ljava/lang/CharSequence;C)Z

    move-result v10

    if-eqz v10, :cond_30

    goto :goto_22

    :cond_30
    const/4 v10, 0x0

    goto :goto_23

    :cond_31
    :goto_22
    move/from16 v10, p4

    .line 141
    :goto_23
    iput v10, v0, La/v03;->m:I

    .line 142
    :cond_32
    sget-object v10, La/u03;->a:La/t03;

    if-eqz v9, :cond_36

    .line 143
    invoke-static {}, La/qsn;->d()Z

    move-result v9

    if-eqz v9, :cond_36

    .line 144
    iget-object v9, v7, La/y9q0;->c:La/rw90;

    if-eqz v9, :cond_33

    .line 145
    iget-object v9, v9, La/rw90;->a:La/ew90;

    if-eqz v9, :cond_33

    .line 146
    iget v9, v9, La/ew90;->b:I

    .line 147
    new-instance v10, La/etn;

    invoke-direct {v10, v9}, La/etn;-><init>(I)V

    goto :goto_24

    :cond_33
    move-object/from16 v10, p1

    :goto_24
    if-nez v10, :cond_35

    :cond_34
    const/4 v9, 0x0

    goto :goto_25

    .line 148
    :cond_35
    iget v9, v10, La/etn;->a:I

    const/4 v10, 0x2

    if-ne v9, v10, :cond_34

    move/from16 v9, p4

    .line 149
    :goto_25
    invoke-static {}, La/qsn;->a()La/qsn;

    move-result-object v10

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v11

    const/4 v13, 0x0

    invoke-virtual {v10, v13, v11, v9, v3}, La/qsn;->g(IIILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_26

    :cond_36
    move-object v9, v3

    .line 150
    :goto_26
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v10

    const-wide/16 v13, 0x0

    const-wide v15, 0xff00000000L

    if-eqz v10, :cond_37

    .line 151
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_37

    .line 152
    iget-object v10, v7, La/y9q0;->b:La/eo80;

    .line 153
    iget-object v10, v10, La/eo80;->d:La/g8q0;

    .line 154
    sget-object v11, La/g8q0;->c:La/g8q0;

    .line 155
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_37

    .line 156
    iget-object v10, v7, La/y9q0;->b:La/eo80;

    .line 157
    iget-wide v10, v10, La/eo80;->c:J

    and-long/2addr v10, v15

    cmp-long v10, v10, v13

    if-nez v10, :cond_37

    goto/16 :goto_53

    .line 158
    :cond_37
    instance-of v10, v9, Landroid/text/Spannable;

    if-eqz v10, :cond_38

    .line 159
    check-cast v9, Landroid/text/Spannable;

    goto :goto_27

    .line 160
    :cond_38
    new-instance v10, Landroid/text/SpannableString;

    invoke-direct {v10, v9}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object v9, v10

    .line 161
    :goto_27
    iget-object v10, v7, La/y9q0;->a:La/smk0;

    iget-object v11, v7, La/y9q0;->b:La/eo80;

    move/from16 p2, v6

    .line 162
    iget-object v6, v10, La/smk0;->m:La/k5q0;

    move-wide/from16 p6, v13

    .line 163
    sget-object v13, La/k5q0;->c:La/k5q0;

    .line 164
    invoke-static {v6, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/16 v13, 0x21

    if-eqz v6, :cond_39

    .line 165
    sget-object v6, La/u03;->a:La/t03;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v14, 0x0

    .line 166
    invoke-interface {v9, v6, v14, v3, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 167
    :cond_39
    iget-object v3, v7, La/y9q0;->c:La/rw90;

    if-eqz v3, :cond_3a

    .line 168
    iget-object v3, v3, La/rw90;->a:La/ew90;

    if-eqz v3, :cond_3a

    .line 169
    iget-boolean v3, v3, La/ew90;->a:Z

    goto :goto_28

    :cond_3a
    const/4 v3, 0x0

    :goto_28
    if-eqz v3, :cond_3c

    .line 170
    iget-object v3, v11, La/eo80;->f:La/m600;

    if-nez v3, :cond_3c

    .line 171
    iget-wide v2, v11, La/eo80;->c:J

    .line 172
    invoke-static {v2, v3, v5, v12}, La/azw;->T(JFLa/w6k;)F

    move-result v2

    .line 173
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_3b

    .line 174
    new-instance v3, La/i600;

    invoke-direct {v3, v2}, La/i600;-><init>(F)V

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v14, 0x0

    .line 175
    invoke-interface {v9, v3, v14, v2, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_3b
    const/4 v14, 0x0

    goto :goto_2e

    .line 176
    :cond_3c
    iget-object v3, v11, La/eo80;->f:La/m600;

    if-nez v3, :cond_3d

    .line 177
    sget-object v3, La/m600;->d:La/m600;

    .line 178
    :cond_3d
    iget-wide v6, v11, La/eo80;->c:J

    .line 179
    invoke-static {v6, v7, v5, v12}, La/azw;->T(JFLa/w6k;)F

    move-result v21

    .line 180
    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-nez v6, :cond_3b

    .line 181
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_3e

    goto :goto_29

    :cond_3e
    invoke-static {v9}, La/ttm0;->J(Ljava/lang/CharSequence;)C

    move-result v6

    if-ne v6, v2, :cond_3f

    :goto_29
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    :goto_2a
    move/from16 v22, v2

    goto :goto_2b

    :cond_3f
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v2

    goto :goto_2a

    .line 182
    :goto_2b
    new-instance v20, La/n600;

    .line 183
    iget v2, v3, La/m600;->b:I

    and-int/lit8 v6, v2, 0x1

    if-lez v6, :cond_40

    move/from16 v23, p4

    goto :goto_2c

    :cond_40
    const/16 v23, 0x0

    :goto_2c
    and-int/lit8 v2, v2, 0x10

    if-lez v2, :cond_41

    move/from16 v24, p4

    goto :goto_2d

    :cond_41
    const/16 v24, 0x0

    .line 184
    :goto_2d
    iget v2, v3, La/m600;->a:F

    .line 185
    iget v3, v3, La/m600;->c:I

    move/from16 v25, v2

    move/from16 v26, v3

    .line 186
    invoke-direct/range {v20 .. v26}, La/n600;-><init>(FIZZFI)V

    move-object/from16 v2, v20

    .line 187
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v14, 0x0

    .line 188
    invoke-interface {v9, v2, v14, v3, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 189
    :goto_2e
    iget-object v2, v11, La/eo80;->d:La/g8q0;

    if-eqz v2, :cond_43

    .line 190
    iget-wide v6, v2, La/g8q0;->a:J

    iget-wide v2, v2, La/g8q0;->b:J

    move/from16 p5, v14

    move-wide/from16 v20, v15

    .line 191
    invoke-static/range {p5 .. p5}, La/idm0;->t(I)J

    move-result-wide v14

    invoke-static {v6, v7, v14, v15}, La/daq0;->a(JJ)Z

    move-result v14

    if-eqz v14, :cond_42

    invoke-static/range {p5 .. p5}, La/idm0;->t(I)J

    move-result-wide v14

    invoke-static {v2, v3, v14, v15}, La/daq0;->a(JJ)Z

    move-result v14

    if-nez v14, :cond_43

    :cond_42
    and-long v14, v6, v20

    cmp-long v14, v14, p6

    if-nez v14, :cond_44

    :cond_43
    :goto_2f
    move-object/from16 p7, v1

    goto/16 :goto_32

    :cond_44
    and-long v14, v2, v20

    cmp-long v14, v14, p6

    if-nez v14, :cond_45

    goto :goto_2f

    .line 192
    :cond_45
    invoke-static {v6, v7}, La/daq0;->b(J)J

    move-result-wide v14

    move-object/from16 p7, v1

    const-wide v0, 0x100000000L

    .line 193
    invoke-static {v14, v15, v0, v1}, La/eaq0;->a(JJ)Z

    move-result v16

    if-eqz v16, :cond_46

    invoke-interface {v12, v6, v7}, La/w6k;->X(J)F

    move-result v6

    const-wide v0, 0x200000000L

    goto :goto_30

    :cond_46
    const-wide v0, 0x200000000L

    .line 194
    invoke-static {v14, v15, v0, v1}, La/eaq0;->a(JJ)Z

    move-result v14

    if-eqz v14, :cond_47

    invoke-static {v6, v7}, La/daq0;->c(J)F

    move-result v6

    mul-float/2addr v6, v5

    goto :goto_30

    :cond_47
    move/from16 v6, p2

    .line 195
    :goto_30
    invoke-static {v2, v3}, La/daq0;->b(J)J

    move-result-wide v14

    const-wide v0, 0x100000000L

    .line 196
    invoke-static {v14, v15, v0, v1}, La/eaq0;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_48

    invoke-interface {v12, v2, v3}, La/w6k;->X(J)F

    move-result v0

    goto :goto_31

    :cond_48
    const-wide v0, 0x200000000L

    .line 197
    invoke-static {v14, v15, v0, v1}, La/eaq0;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_49

    invoke-static {v2, v3}, La/daq0;->c(J)F

    move-result v0

    mul-float/2addr v0, v5

    goto :goto_31

    :cond_49
    move/from16 v0, p2

    .line 198
    :goto_31
    new-instance v1, Landroid/text/style/LeadingMarginSpan$Standard;

    float-to-double v2, v6

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v2, v2

    float-to-double v6, v0

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-float v0, v6

    float-to-int v0, v0

    invoke-direct {v1, v2, v0}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    .line 199
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v14, 0x0

    .line 200
    invoke-interface {v9, v1, v14, v0, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 201
    :goto_32
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 202
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_33
    if-ge v2, v1, :cond_4d

    .line 203
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 204
    check-cast v3, La/i83;

    .line 205
    iget-object v6, v3, La/i83;->a:Ljava/lang/Object;

    .line 206
    instance-of v7, v6, La/smk0;

    if-eqz v7, :cond_4c

    move-object v7, v6

    check-cast v7, La/smk0;

    .line 207
    iget-object v14, v7, La/smk0;->f:La/nrq;

    if-nez v14, :cond_4b

    .line 208
    iget-object v14, v7, La/smk0;->d:La/lsq;

    if-nez v14, :cond_4b

    .line 209
    iget-object v7, v7, La/smk0;->c:La/psq;

    if-eqz v7, :cond_4a

    goto :goto_34

    .line 210
    :cond_4a
    check-cast v6, La/smk0;

    .line 211
    iget-object v6, v6, La/smk0;->e:La/msq;

    if-eqz v6, :cond_4c

    .line 212
    :cond_4b
    :goto_34
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4c
    add-int/lit8 v2, v2, 0x1

    goto :goto_33

    .line 213
    :cond_4d
    iget-object v1, v10, La/smk0;->f:La/nrq;

    if-nez v1, :cond_50

    .line 214
    iget-object v2, v10, La/smk0;->d:La/lsq;

    if-nez v2, :cond_50

    .line 215
    iget-object v2, v10, La/smk0;->c:La/psq;

    if-eqz v2, :cond_4e

    goto :goto_35

    .line 216
    :cond_4e
    iget-object v2, v10, La/smk0;->e:La/msq;

    if-eqz v2, :cond_4f

    goto :goto_35

    :cond_4f
    move-object/from16 v1, p1

    goto :goto_36

    .line 217
    :cond_50
    :goto_35
    iget-object v2, v10, La/smk0;->c:La/psq;

    .line 218
    iget-object v3, v10, La/smk0;->d:La/lsq;

    .line 219
    iget-object v6, v10, La/smk0;->e:La/msq;

    .line 220
    new-instance v20, La/smk0;

    const/16 v39, 0x0

    const v40, 0xffc3

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    move-object/from16 v28, v1

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move-object/from16 v27, v6

    invoke-direct/range {v20 .. v40}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;I)V

    move-object/from16 v1, v20

    .line 221
    :goto_36
    new-instance v2, La/in80;

    const/16 v3, 0x1d

    move-object/from16 v6, p7

    invoke-direct {v2, v9, v6, v3}, La/in80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 222
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move/from16 v6, p4

    if-gt v3, v6, :cond_52

    .line 223
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5a

    const/4 v14, 0x0

    .line 224
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/i83;

    .line 225
    iget-object v3, v3, La/i83;->a:Ljava/lang/Object;

    .line 226
    check-cast v3, La/smk0;

    if-nez v1, :cond_51

    goto :goto_37

    .line 227
    :cond_51
    invoke-virtual {v1, v3}, La/smk0;->d(La/smk0;)La/smk0;

    move-result-object v3

    .line 228
    :goto_37
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/i83;

    .line 229
    iget v1, v1, La/i83;->b:I

    .line 230
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 231
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/i83;

    .line 232
    iget v0, v0, La/i83;->c:I

    .line 233
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 234
    invoke-virtual {v2, v3, v1, v0}, La/in80;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_3e

    .line 235
    :cond_52
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    mul-int/lit8 v6, v3, 0x2

    .line 236
    new-array v7, v6, [I

    .line 237
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v14, 0x0

    :goto_38
    if-ge v14, v10, :cond_53

    .line 238
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    .line 239
    check-cast v15, La/i83;

    .line 240
    iget v13, v15, La/i83;->b:I

    .line 241
    aput v13, v7, v14

    add-int v13, v14, v3

    .line 242
    iget v15, v15, La/i83;->c:I

    .line 243
    aput v15, v7, v13

    add-int/lit8 v14, v14, 0x1

    const/16 v13, 0x21

    goto :goto_38

    :cond_53
    const/4 v13, 0x1

    if-le v6, v13, :cond_54

    .line 244
    invoke-static {v7}, Ljava/util/Arrays;->sort([I)V

    :cond_54
    if-eqz v6, :cond_7b

    const/4 v14, 0x0

    .line 245
    aget v3, v7, v14

    move v10, v3

    const/4 v3, 0x0

    :goto_39
    if-ge v3, v6, :cond_5a

    .line 246
    aget v13, v7, v3

    if-ne v13, v10, :cond_55

    move-object/from16 p7, v0

    move-object/from16 p6, v1

    move/from16 v16, v3

    move/from16 v17, v6

    goto :goto_3d

    .line 247
    :cond_55
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v14

    move-object/from16 p6, v1

    const/4 v15, 0x0

    :goto_3a
    if-ge v15, v14, :cond_58

    .line 248
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 p7, v0

    .line 249
    move-object/from16 v0, v16

    check-cast v0, La/i83;

    move/from16 v16, v3

    .line 250
    iget v3, v0, La/i83;->b:I

    move/from16 v17, v6

    .line 251
    iget v6, v0, La/i83;->c:I

    if-eq v3, v6, :cond_57

    .line 252
    invoke-static {v10, v13, v3, v6}, La/k83;->b(IIII)Z

    move-result v3

    if-eqz v3, :cond_57

    .line 253
    iget-object v0, v0, La/i83;->a:Ljava/lang/Object;

    .line 254
    check-cast v0, La/smk0;

    if-nez v1, :cond_56

    :goto_3b
    move-object v1, v0

    goto :goto_3c

    .line 255
    :cond_56
    invoke-virtual {v1, v0}, La/smk0;->d(La/smk0;)La/smk0;

    move-result-object v0

    goto :goto_3b

    :cond_57
    :goto_3c
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, p7

    move/from16 v3, v16

    move/from16 v6, v17

    goto :goto_3a

    :cond_58
    move-object/from16 p7, v0

    move/from16 v16, v3

    move/from16 v17, v6

    if-eqz v1, :cond_59

    .line 256
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v1, v0, v3}, La/in80;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_59
    move v10, v13

    :goto_3d
    add-int/lit8 v3, v16, 0x1

    move-object/from16 v1, p6

    move-object/from16 v0, p7

    move/from16 v6, v17

    goto :goto_39

    .line 257
    :cond_5a
    :goto_3e
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_3f
    if-ge v1, v0, :cond_6b

    .line 258
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/i83;

    .line 259
    iget-object v6, v3, La/i83;->a:Ljava/lang/Object;

    .line 260
    instance-of v7, v6, La/smk0;

    if-eqz v7, :cond_5b

    .line 261
    iget v13, v3, La/i83;->b:I

    .line 262
    iget v14, v3, La/i83;->c:I

    if-ltz v13, :cond_5b

    .line 263
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v13, v3, :cond_5b

    if-le v14, v13, :cond_5b

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-le v14, v3, :cond_5c

    :cond_5b
    move/from16 p6, v0

    move v3, v1

    move/from16 p7, v2

    move-object v7, v9

    move-object/from16 v20, v11

    move-object v10, v12

    goto/16 :goto_48

    .line 264
    :cond_5c
    check-cast v6, La/smk0;

    move/from16 p6, v0

    move v3, v1

    iget-wide v0, v6, La/smk0;->h:J

    .line 265
    iget-object v7, v6, La/smk0;->i:La/j56;

    iget-object v10, v6, La/smk0;->a:La/e8q0;

    if-eqz v7, :cond_5d

    .line 266
    iget v7, v7, La/j56;->a:F

    .line 267
    new-instance v15, La/k56;

    move-wide/from16 v16, v0

    const/4 v0, 0x0

    invoke-direct {v15, v7, v0}, La/k56;-><init>(FB)V

    const/16 v0, 0x21

    .line 268
    invoke-interface {v9, v15, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_40

    :cond_5d
    move-wide/from16 v16, v0

    .line 269
    :goto_40
    invoke-interface {v10}, La/e8q0;->h()J

    move-result-wide v0

    .line 270
    invoke-static {v9, v0, v1, v13, v14}, La/azw;->U(Landroid/text/Spannable;JII)V

    .line 271
    invoke-interface {v10}, La/e8q0;->l()La/t89;

    move-result-object v0

    .line 272
    invoke-interface {v10}, La/e8q0;->g()F

    move-result v1

    if-eqz v0, :cond_5f

    .line 273
    instance-of v7, v0, La/skk0;

    if-eqz v7, :cond_5e

    .line 274
    check-cast v0, La/skk0;

    .line 275
    iget-wide v0, v0, La/skk0;->a:J

    .line 276
    invoke-static {v9, v0, v1, v13, v14}, La/azw;->U(Landroid/text/Spannable;JII)V

    goto :goto_41

    .line 277
    :cond_5e
    new-instance v7, La/jjj0;

    check-cast v0, La/ijj0;

    invoke-direct {v7, v0, v1}, La/jjj0;-><init>(La/ijj0;F)V

    const/16 v0, 0x21

    .line 278
    invoke-interface {v9, v7, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 279
    :cond_5f
    :goto_41
    iget-object v0, v6, La/smk0;->m:La/k5q0;

    if-eqz v0, :cond_62

    .line 280
    iget v0, v0, La/k5q0;->a:I

    .line 281
    new-instance v1, La/l5q0;

    or-int/lit8 v7, v0, 0x1

    if-ne v7, v0, :cond_60

    const/4 v7, 0x1

    goto :goto_42

    :cond_60
    const/4 v7, 0x0

    :goto_42
    or-int/lit8 v10, v0, 0x2

    if-ne v10, v0, :cond_61

    const/4 v0, 0x1

    goto :goto_43

    :cond_61
    const/4 v0, 0x0

    :goto_43
    invoke-direct {v1, v7, v0}, La/l5q0;-><init>(ZZ)V

    const/16 v0, 0x21

    .line 282
    invoke-interface {v9, v1, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :goto_44
    move-object v1, v11

    goto :goto_45

    :cond_62
    const/16 v0, 0x21

    goto :goto_44

    .line 283
    :goto_45
    iget-wide v10, v6, La/smk0;->b:J

    .line 284
    invoke-static/range {v9 .. v14}, La/azw;->V(Landroid/text/Spannable;JLa/w6k;II)V

    move-object v7, v9

    .line 285
    iget-object v9, v6, La/smk0;->g:Ljava/lang/String;

    if-eqz v9, :cond_63

    .line 286
    new-instance v10, La/fyc;

    const/4 v11, 0x1

    invoke-direct {v10, v9, v11}, La/fyc;-><init>(Ljava/lang/Object;B)V

    .line 287
    invoke-interface {v7, v10, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 288
    :cond_63
    iget-object v9, v6, La/smk0;->j:La/f8q0;

    if-eqz v9, :cond_64

    .line 289
    new-instance v10, Landroid/text/style/ScaleXSpan;

    .line 290
    iget v11, v9, La/f8q0;->a:F

    .line 291
    invoke-direct {v10, v11}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 292
    invoke-interface {v7, v10, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 293
    new-instance v10, La/k56;

    .line 294
    iget v9, v9, La/f8q0;->b:F

    const/4 v11, 0x1

    .line 295
    invoke-direct {v10, v9, v11}, La/k56;-><init>(FB)V

    .line 296
    invoke-interface {v7, v10, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_46

    :cond_64
    const/4 v11, 0x1

    .line 297
    :goto_46
    iget-object v9, v6, La/smk0;->k:La/rs00;

    .line 298
    invoke-static {v7, v9, v13, v14}, La/azw;->W(Landroid/text/Spannable;La/rs00;II)V

    .line 299
    iget-wide v9, v6, La/smk0;->l:J

    const-wide/16 v20, 0x10

    cmp-long v15, v9, v20

    if-eqz v15, :cond_65

    .line 300
    new-instance v15, Landroid/text/style/BackgroundColorSpan;

    invoke-static {v9, v10}, La/fbc;->U(J)I

    move-result v9

    invoke-direct {v15, v9}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 301
    invoke-interface {v7, v15, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 302
    :cond_65
    iget-object v9, v6, La/smk0;->n:La/ljj0;

    if-eqz v9, :cond_67

    move-object v10, v12

    .line 303
    iget-wide v11, v9, La/ljj0;->b:J

    .line 304
    new-instance v15, La/vjj0;

    move-object/from16 v20, v1

    .line 305
    iget-wide v0, v9, La/ljj0;->a:J

    .line 306
    invoke-static {v0, v1}, La/fbc;->U(J)I

    move-result v0

    const/16 v1, 0x20

    move/from16 p7, v2

    shr-long v1, v11, v1

    long-to-int v1, v1

    .line 307
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const-wide v21, 0xffffffffL

    and-long v11, v11, v21

    long-to-int v2, v11

    .line 308
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 309
    iget v9, v9, La/ljj0;->c:F

    cmpg-float v11, v9, p2

    if-nez v11, :cond_66

    const/4 v9, 0x1

    .line 310
    :cond_66
    invoke-direct {v15, v1, v2, v9, v0}, La/vjj0;-><init>(FFFI)V

    const/16 v0, 0x21

    .line 311
    invoke-interface {v7, v15, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_47

    :cond_67
    move-object/from16 v20, v1

    move/from16 p7, v2

    move-object v10, v12

    .line 312
    :goto_47
    iget-object v1, v6, La/smk0;->o:La/agc;

    if-eqz v1, :cond_68

    .line 313
    new-instance v2, La/ghl;

    invoke-direct {v2, v1}, La/ghl;-><init>(La/agc;)V

    .line 314
    invoke-interface {v7, v2, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 315
    :cond_68
    invoke-static/range {v16 .. v17}, La/daq0;->b(J)J

    move-result-wide v0

    const-wide v11, 0x100000000L

    invoke-static {v0, v1, v11, v12}, La/eaq0;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_69

    invoke-static/range {v16 .. v17}, La/daq0;->b(J)J

    move-result-wide v0

    const-wide v13, 0x200000000L

    invoke-static {v0, v1, v13, v14}, La/eaq0;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_6a

    :cond_69
    const/4 v2, 0x1

    goto :goto_49

    :cond_6a
    :goto_48
    move/from16 v2, p7

    :goto_49
    add-int/lit8 v1, v3, 0x1

    move/from16 v0, p6

    move-object v9, v7

    move-object v12, v10

    move-object/from16 v11, v20

    goto/16 :goto_3f

    :cond_6b
    move/from16 p7, v2

    move-object v7, v9

    move-object/from16 v20, v11

    move-object v10, v12

    if-eqz p7, :cond_71

    .line 316
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_4a
    if-ge v1, v0, :cond_71

    .line 317
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/i83;

    .line 318
    iget-object v3, v2, La/i83;->a:Ljava/lang/Object;

    .line 319
    check-cast v3, La/f83;

    .line 320
    instance-of v6, v3, La/smk0;

    if-eqz v6, :cond_6c

    .line 321
    iget v6, v2, La/i83;->b:I

    .line 322
    iget v2, v2, La/i83;->c:I

    if-ltz v6, :cond_6c

    .line 323
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-ge v6, v9, :cond_6c

    if-le v2, v6, :cond_6c

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-le v2, v9, :cond_6d

    :cond_6c
    move/from16 p4, v0

    move v3, v1

    goto :goto_4c

    .line 324
    :cond_6d
    check-cast v3, La/smk0;

    .line 325
    iget-wide v11, v3, La/smk0;->h:J

    .line 326
    invoke-static {v11, v12}, La/daq0;->b(J)J

    move-result-wide v13

    move/from16 p4, v0

    move v3, v1

    const-wide v0, 0x100000000L

    .line 327
    invoke-static {v13, v14, v0, v1}, La/eaq0;->a(JJ)Z

    move-result v9

    if-eqz v9, :cond_6e

    new-instance v0, La/ckz;

    invoke-interface {v10, v11, v12}, La/w6k;->X(J)F

    move-result v1

    invoke-direct {v0, v1}, La/ckz;-><init>(F)V

    goto :goto_4b

    :cond_6e
    const-wide v0, 0x200000000L

    .line 328
    invoke-static {v13, v14, v0, v1}, La/eaq0;->a(JJ)Z

    move-result v9

    if-eqz v9, :cond_6f

    .line 329
    new-instance v0, La/bkz;

    invoke-static {v11, v12}, La/daq0;->c(J)F

    move-result v1

    invoke-direct {v0, v1}, La/bkz;-><init>(F)V

    goto :goto_4b

    :cond_6f
    move-object/from16 v0, p1

    :goto_4b
    if-eqz v0, :cond_70

    const/16 v1, 0x21

    .line 330
    invoke-interface {v7, v0, v6, v2, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_70
    :goto_4c
    add-int/lit8 v1, v3, 0x1

    move/from16 v0, p4

    goto :goto_4a

    :cond_71
    move-object/from16 v1, v20

    .line 331
    iget-object v0, v1, La/eo80;->d:La/g8q0;

    if-eqz v0, :cond_74

    .line 332
    iget-wide v0, v0, La/g8q0;->a:J

    .line 333
    invoke-static {v0, v1}, La/daq0;->b(J)J

    move-result-wide v2

    const-wide v11, 0x100000000L

    .line 334
    invoke-static {v2, v3, v11, v12}, La/eaq0;->a(JJ)Z

    move-result v6

    if-eqz v6, :cond_72

    invoke-interface {v10, v0, v1}, La/w6k;->X(J)F

    move-result v6

    goto :goto_4d

    :cond_72
    const-wide v13, 0x200000000L

    .line 335
    invoke-static {v2, v3, v13, v14}, La/eaq0;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_73

    invoke-static {v0, v1}, La/daq0;->c(J)F

    move-result v0

    mul-float v6, v0, v5

    goto :goto_4d

    :cond_73
    move/from16 v6, p2

    :goto_4d
    move v14, v6

    goto :goto_4e

    :cond_74
    move/from16 v14, p2

    .line 336
    :goto_4e
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_4f
    if-ge v1, v0, :cond_77

    .line 337
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 338
    check-cast v2, La/i83;

    .line 339
    iget-object v3, v2, La/i83;->a:Ljava/lang/Object;

    .line 340
    instance-of v6, v3, La/nd9;

    if-eqz v6, :cond_75

    check-cast v3, La/nd9;

    goto :goto_50

    :cond_75
    move-object/from16 v3, p1

    :goto_50
    if-eqz v3, :cond_76

    .line 341
    iget-wide v11, v3, La/nd9;->a:J

    .line 342
    invoke-static {v11, v12, v5, v10}, La/azw;->S(JFLa/w6k;)F

    move-result v6

    .line 343
    iget-wide v11, v3, La/nd9;->b:J

    .line 344
    invoke-static {v11, v12, v5, v10}, La/azw;->S(JFLa/w6k;)F

    move-result v11

    .line 345
    iget-wide v12, v3, La/nd9;->c:J

    .line 346
    invoke-static {v12, v13, v5, v10}, La/azw;->S(JFLa/w6k;)F

    move-result v12

    .line 347
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_76

    invoke-static {v11}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_76

    invoke-static {v12}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_76

    .line 348
    new-instance v9, La/bxf;

    move-object v13, v10

    move v10, v6

    invoke-direct/range {v9 .. v14}, La/bxf;-><init>(FFFLa/w6k;F)V

    move-object v10, v13

    .line 349
    iget v3, v2, La/i83;->b:I

    .line 350
    iget v2, v2, La/i83;->c:I

    const/16 v6, 0x21

    .line 351
    invoke-interface {v7, v9, v3, v2, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_51

    :cond_76
    const/16 v6, 0x21

    :goto_51
    add-int/lit8 v1, v1, 0x1

    goto :goto_4f

    .line 352
    :cond_77
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v0

    if-lez v0, :cond_7a

    const/4 v14, 0x0

    .line 353
    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 354
    check-cast v0, La/i83;

    .line 355
    iget-object v1, v0, La/i83;->a:Ljava/lang/Object;

    if-nez v1, :cond_79

    .line 356
    iget v1, v0, La/i83;->b:I

    .line 357
    iget v0, v0, La/i83;->c:I

    .line 358
    const-class v2, La/v0t0;

    invoke-interface {v7, v1, v0, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    .line 359
    array-length v1, v0

    move v9, v14

    :goto_52
    if-ge v9, v1, :cond_78

    aget-object v2, v0, v9

    check-cast v2, La/v0t0;

    .line 360
    invoke-interface {v7, v2}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_52

    .line 361
    :cond_78
    new-instance v0, La/vu90;

    .line 362
    throw p1

    .line 363
    :cond_79
    invoke-static {}, La/hny;->b()V

    throw p1

    :cond_7a
    move-object/from16 v0, p0

    move-object v9, v7

    .line 364
    :goto_53
    iput-object v9, v0, La/v03;->h:Ljava/lang/CharSequence;

    .line 365
    new-instance v1, La/q6z;

    iget-object v2, v0, La/v03;->g:La/j23;

    iget v3, v0, La/v03;->l:I

    invoke-direct {v1, v9, v2, v3}, La/q6z;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    iput-object v1, v0, La/v03;->i:La/q6z;

    return-void

    .line 366
    :cond_7b
    const-string v0, "Array is empty."

    invoke-static {v0}, La/v4i0;->o(Ljava/lang/String;)V

    throw p1

    :cond_7c
    const/16 p1, 0x0

    .line 367
    const-string v0, "Invalid TextDirection."

    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b()Z
    .locals 2

    .line 1
    iget-object v0, p0, La/v03;->j:La/y3v;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, La/y3v;->r()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-nez v0, :cond_4

    .line 13
    .line 14
    iget-boolean v0, p0, La/v03;->k:Z

    .line 15
    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    iget-object p0, p0, La/v03;->b:La/y9q0;

    .line 19
    .line 20
    invoke-static {p0}, La/m8x;->V(La/y9q0;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_3

    .line 25
    .line 26
    sget-object p0, La/usn;->a:La/clc;

    .line 27
    .line 28
    sget-object p0, La/usn;->a:La/clc;

    .line 29
    .line 30
    iget-object v0, p0, La/clc;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, La/l7m0;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-static {}, La/qsn;->d()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, La/clc;->e()La/l7m0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, La/clc;->b:Ljava/lang/Object;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    sget-object v0, La/y0x0;->i:La/p3x;

    .line 51
    .line 52
    :goto_1
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    return v1

    .line 66
    :cond_4
    :goto_2
    const/4 p0, 0x1

    .line 67
    return p0
.end method

.method public final e()F
    .locals 0

    .line 1
    iget-object p0, p0, La/v03;->i:La/q6z;

    .line 2
    .line 3
    invoke-virtual {p0}, La/q6z;->c()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final f()F
    .locals 10

    .line 1
    iget-object p0, p0, La/v03;->i:La/q6z;

    .line 2
    .line 3
    iget v0, p0, La/q6z;->e:F

    .line 4
    .line 5
    iget-object v1, p0, La/q6z;->b:Landroid/text/TextPaint;

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget p0, p0, La/q6z;->e:F

    .line 14
    .line 15
    return p0

    .line 16
    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Ljava/text/BreakIterator;->getLineInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v2, La/gvb;

    .line 25
    .line 26
    iget-object v3, p0, La/q6z;->a:Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-direct {v2, v4, v3}, La/gvb;-><init>(ILjava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/text/BreakIterator;->setText(Ljava/text/CharacterIterator;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Ljava/util/PriorityQueue;

    .line 39
    .line 40
    sget-object v3, La/cjx;->q:La/l13;

    .line 41
    .line 42
    const/16 v4, 0xa

    .line 43
    .line 44
    invoke-direct {v2, v4, v3}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/text/BreakIterator;->next()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v5, 0x0

    .line 52
    :goto_0
    const/4 v6, -0x1

    .line 53
    if-eq v3, v6, :cond_3

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->size()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    const/4 v7, 0x1

    .line 60
    if-ge v6, v4, :cond_1

    .line 61
    .line 62
    new-instance v6, Lkotlin/ranges/IntRange;

    .line 63
    .line 64
    invoke-direct {v6, v5, v3, v7}, Lkotlin/ranges/a;-><init>(III)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v6}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    check-cast v6, Lkotlin/ranges/IntRange;

    .line 76
    .line 77
    if-eqz v6, :cond_2

    .line 78
    .line 79
    iget v8, v6, Lkotlin/ranges/a;->b:I

    .line 80
    .line 81
    iget v6, v6, Lkotlin/ranges/a;->a:I

    .line 82
    .line 83
    sub-int/2addr v8, v6

    .line 84
    sub-int v6, v3, v5

    .line 85
    .line 86
    if-ge v8, v6, :cond_2

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    new-instance v6, Lkotlin/ranges/IntRange;

    .line 92
    .line 93
    invoke-direct {v6, v5, v3, v7}, Lkotlin/ranges/a;-><init>(III)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v6}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/text/BreakIterator;->next()I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    move v9, v5

    .line 104
    move v5, v3

    .line 105
    move v3, v9

    .line 106
    goto :goto_0

    .line 107
    :cond_3
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    const/4 v3, 0x0

    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_4
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_6

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    check-cast v2, Lkotlin/ranges/IntRange;

    .line 130
    .line 131
    iget v3, v2, Lkotlin/ranges/a;->a:I

    .line 132
    .line 133
    iget v2, v2, Lkotlin/ranges/a;->b:I

    .line 134
    .line 135
    invoke-virtual {p0}, La/q6z;->b()Ljava/lang/CharSequence;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-static {v4, v3, v2, v1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    move v3, v2

    .line 144
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_5

    .line 149
    .line 150
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    check-cast v2, Lkotlin/ranges/IntRange;

    .line 155
    .line 156
    iget v4, v2, Lkotlin/ranges/a;->a:I

    .line 157
    .line 158
    iget v2, v2, Lkotlin/ranges/a;->b:I

    .line 159
    .line 160
    invoke-virtual {p0}, La/q6z;->b()Ljava/lang/CharSequence;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-static {v5, v4, v2, v1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    goto :goto_2

    .line 173
    :cond_5
    :goto_3
    iput v3, p0, La/q6z;->e:F

    .line 174
    .line 175
    return v3

    .line 176
    :cond_6
    invoke-static {}, La/itt0;->a()V

    .line 177
    .line 178
    .line 179
    return v3
.end method
