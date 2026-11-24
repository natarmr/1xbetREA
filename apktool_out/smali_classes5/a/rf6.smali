.class public abstract La/rf6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 v0, 0x42000000    # 32.0f

    .line 4
    .line 5
    sput v0, La/rf6;->a:F

    .line 6
    .line 7
    return-void
.end method

.method public static final a(La/mm40;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 59

    move-object/from16 v1, p0

    move/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v10, p6

    move/from16 v0, p7

    sget-object v2, La/tf6;->a:La/tf6;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, 0x29374a1b

    .line 1
    invoke-virtual {v10, v2}, La/fet;->g0(I)La/fet;

    and-int/lit8 v2, v0, 0x6

    const/4 v4, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    or-int/2addr v2, v0

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    and-int/lit8 v7, v0, 0x30

    move-object/from16 v14, p1

    if-nez v7, :cond_3

    invoke-virtual {v10, v14}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v2, v7

    :cond_3
    and-int/lit16 v7, v0, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v10, v3}, La/fet;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v2, v7

    :cond_5
    and-int/lit16 v7, v0, 0xc00

    const/4 v8, 0x1

    if-nez v7, :cond_7

    invoke-virtual {v10, v8}, La/fet;->e(I)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v2, v7

    :cond_7
    and-int/lit16 v7, v0, 0x6000

    if-nez v7, :cond_9

    move/from16 v7, p3

    invoke-virtual {v10, v7}, La/fet;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x4000

    goto :goto_5

    :cond_8
    const/16 v9, 0x2000

    :goto_5
    or-int/2addr v2, v9

    goto :goto_6

    :cond_9
    move/from16 v7, p3

    :goto_6
    const/high16 v9, 0x30000

    and-int/2addr v9, v0

    if-nez v9, :cond_b

    invoke-virtual {v10, v5}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/high16 v9, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v9, 0x10000

    :goto_7
    or-int/2addr v2, v9

    :cond_b
    const/high16 v9, 0x180000

    and-int/2addr v9, v0

    const/high16 v12, 0x100000

    if-nez v9, :cond_d

    invoke-virtual {v10, v6}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_c

    move v9, v12

    goto :goto_8

    :cond_c
    const/high16 v9, 0x80000

    :goto_8
    or-int/2addr v2, v9

    :cond_d
    const v9, 0x92493

    and-int/2addr v9, v2

    const v8, 0x92492

    const/4 v14, 0x0

    if-eq v9, v8, :cond_e

    const/4 v8, 0x1

    goto :goto_9

    :cond_e
    move v8, v14

    :goto_9
    and-int/lit8 v9, v2, 0x1

    invoke-virtual {v10, v9, v8}, La/fet;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_35

    .line 2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    shr-int/lit8 v9, v2, 0x6

    and-int/lit8 v9, v9, 0xe

    const/4 v15, 0x0

    invoke-static {v8, v15, v10, v9, v4}, La/phu0;->Z(Ljava/lang/Object;Ljava/lang/String;La/fet;II)La/oms0;

    move-result-object v8

    .line 3
    iget-object v9, v8, La/oms0;->a:La/p4;

    invoke-virtual {v9}, La/p4;->y0()Ljava/lang/Object;

    move-result-object v9

    .line 4
    invoke-virtual {v10, v8}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v18

    const/high16 v19, 0x380000

    and-int v11, v2, v19

    if-ne v11, v12, :cond_f

    const/4 v11, 0x1

    goto :goto_a

    :cond_f
    move v11, v14

    :goto_a
    or-int v11, v18, v11

    .line 5
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    move-result-object v12

    .line 6
    sget-object v13, La/ukd;->a:La/cl5;

    if-nez v11, :cond_10

    if-ne v12, v13, :cond_11

    .line 7
    :cond_10
    new-instance v12, La/cm3;

    const/16 v11, 0x18

    invoke-direct {v12, v8, v6, v15, v11}, La/cm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 8
    invoke-virtual {v10, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 9
    :cond_11
    check-cast v12, Lkotlin/jvm/functions/Function2;

    invoke-static {v10, v9, v12}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const/16 v11, 0x1b0

    const/4 v12, 0x4

    move-object v7, v8

    const/16 v8, 0x1f4

    const/16 v9, 0x1f4

    .line 10
    invoke-static/range {v7 .. v12}, La/rf6;->c(La/oms0;IILa/fet;II)La/cms0;

    move-result-object v8

    move-object v9, v8

    const/16 v8, 0x1f4

    move-object v10, v9

    const/16 v9, 0x64

    move-object/from16 v32, v10

    move-object/from16 v10, p6

    .line 11
    invoke-static/range {v7 .. v12}, La/rf6;->c(La/oms0;IILa/fet;II)La/cms0;

    move-result-object v8

    const/16 v11, 0xdb0

    const/4 v12, 0x0

    move-object v9, v8

    const/16 v8, 0x96

    move-object v10, v9

    const/16 v9, 0x64

    move-object/from16 v33, v10

    move-object/from16 v10, p6

    .line 12
    invoke-static/range {v7 .. v12}, La/rf6;->c(La/oms0;IILa/fet;II)La/cms0;

    move-result-object v8

    move-object/from16 v16, v7

    .line 13
    invoke-static/range {p3 .. p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    shr-int/lit8 v9, v2, 0xc

    and-int/lit8 v9, v9, 0xe

    invoke-static {v7, v15, v10, v9, v4}, La/phu0;->Z(Ljava/lang/Object;Ljava/lang/String;La/fet;II)La/oms0;

    move-result-object v7

    iget-object v9, v7, La/oms0;->a:La/p4;

    .line 14
    sget-object v11, La/hp4;->j:La/lxs0;

    .line 15
    invoke-virtual {v7}, La/oms0;->h()Z

    move-result v12

    if-nez v12, :cond_15

    const v12, 0x6355e4b0

    invoke-virtual {v10, v12}, La/fet;->e0(I)V

    .line 16
    invoke-virtual {v10, v7}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v12

    .line 17
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    move-result-object v15

    if-nez v12, :cond_12

    if-ne v15, v13, :cond_14

    .line 18
    :cond_12
    invoke-static {}, La/vdx;->J()La/rfk0;

    move-result-object v12

    if-eqz v12, :cond_13

    .line 19
    invoke-virtual {v12}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v15

    goto :goto_b

    :cond_13
    const/4 v15, 0x0

    .line 20
    :goto_b
    invoke-static {v12}, La/vdx;->W(La/rfk0;)La/rfk0;

    move-result-object v4

    .line 21
    :try_start_0
    invoke-virtual {v9}, La/p4;->y0()Ljava/lang/Object;

    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    invoke-static {v12, v4, v15}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 23
    invoke-virtual {v10, v9}, La/fet;->o0(Ljava/lang/Object;)V

    move-object v15, v9

    .line 24
    :cond_14
    invoke-virtual {v10, v14}, La/fet;->r(Z)V

    goto :goto_c

    :catchall_0
    move-exception v0

    .line 25
    invoke-static {v12, v4, v15}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    throw v0

    :cond_15
    const v4, 0x6359c50d

    .line 26
    invoke-static {v10, v4, v14, v9}, La/vqd;->j(La/fet;IZLa/p4;)Ljava/lang/Object;

    move-result-object v15

    .line 27
    :goto_c
    check-cast v15, Ljava/lang/Boolean;

    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const v9, 0x772e845b

    .line 28
    invoke-virtual {v10, v9}, La/fet;->e0(I)V

    if-eqz v4, :cond_16

    const/high16 v4, 0x3f800000    # 1.0f

    goto :goto_d

    :cond_16
    const/4 v4, 0x0

    .line 29
    :goto_d
    invoke-virtual {v10, v14}, La/fet;->r(Z)V

    .line 30
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    .line 31
    invoke-virtual {v10, v7}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v20

    .line 32
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    move-result-object v12

    if-nez v20, :cond_17

    if-ne v12, v13, :cond_18

    .line 33
    :cond_17
    new-instance v12, La/gb3;

    const/16 v15, 0x10

    invoke-direct {v12, v7, v15}, La/gb3;-><init>(La/oms0;B)V

    .line 34
    invoke-static {v12}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    move-result-object v12

    .line 35
    invoke-virtual {v10, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 36
    :cond_18
    check-cast v12, La/l7m0;

    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    .line 37
    invoke-virtual {v10, v9}, La/fet;->e0(I)V

    if-eqz v12, :cond_19

    const/high16 v9, 0x3f800000    # 1.0f

    goto :goto_e

    :cond_19
    const/4 v9, 0x0

    .line 38
    :goto_e
    invoke-virtual {v10, v14}, La/fet;->r(Z)V

    .line 39
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    .line 40
    invoke-virtual {v10, v7}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v12

    .line 41
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    move-result-object v15

    if-nez v12, :cond_1a

    if-ne v15, v13, :cond_1b

    .line 42
    :cond_1a
    new-instance v12, La/gb3;

    const/16 v15, 0x11

    invoke-direct {v12, v7, v15}, La/gb3;-><init>(La/oms0;B)V

    .line 43
    invoke-static {v12}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    move-result-object v15

    .line 44
    invoke-virtual {v10, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 45
    :cond_1b
    check-cast v15, La/l7m0;

    invoke-interface {v15}, La/l7m0;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La/ams0;

    .line 46
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v12, -0x78360820

    .line 47
    invoke-virtual {v10, v12}, La/fet;->e0(I)V

    const/16 v12, 0x64

    .line 48
    sget-object v15, La/hhn;->b:La/zsf;

    const/4 v0, 0x2

    .line 49
    invoke-static {v12, v14, v15, v0}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    move-result-object v12

    .line 50
    invoke-virtual {v10, v14}, La/fet;->r(Z)V

    move-object v0, v13

    const/4 v13, 0x0

    move-object v15, v12

    move-object v12, v10

    move-object v10, v15

    move-object v15, v0

    move-object v0, v8

    move-object v8, v4

    const/high16 v4, 0x3f800000    # 1.0f

    .line 51
    invoke-static/range {v7 .. v13}, La/phu0;->E(La/oms0;Ljava/lang/Object;Ljava/lang/Object;La/cfq;La/lxs0;La/fet;I)La/cms0;

    move-result-object v13

    move-object v10, v12

    .line 52
    sget-object v7, La/s6t0;->a:La/pz40;

    invoke-static {}, La/s6t0;->b()La/taq0;

    move-result-object v7

    and-int/lit16 v8, v2, 0x1c00

    const/16 v9, 0x800

    if-ne v8, v9, :cond_1c

    const/4 v8, 0x1

    goto :goto_f

    :cond_1c
    move v8, v14

    :goto_f
    invoke-virtual {v10, v7}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v7, v8

    .line 53
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_1d

    if-ne v8, v15, :cond_1e

    .line 54
    :cond_1d
    new-instance v21, La/pf6;

    .line 55
    sget-object v7, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite30-0d7_KjU()J

    move-result-wide v22

    .line 56
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    move-result-wide v24

    .line 57
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    move-result-wide v26

    .line 58
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack-0d7_KjU()J

    move-result-wide v28

    .line 59
    invoke-direct/range {v21 .. v29}, La/pf6;-><init>(JJJJ)V

    move-object/from16 v8, v21

    .line 60
    invoke-virtual {v10, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 61
    :cond_1e
    move-object v7, v8

    check-cast v7, La/pf6;

    .line 62
    iget-wide v8, v7, La/pf6;->b:J

    .line 63
    iget-wide v10, v7, La/pf6;->a:J

    move-object/from16 v12, p6

    move-object v4, v7

    move-object/from16 v7, v16

    .line 64
    invoke-static/range {v7 .. v12}, La/rf6;->b(La/oms0;JJLa/fet;)La/cms0;

    move-result-object v8

    move-object v10, v8

    .line 65
    iget-wide v8, v4, La/pf6;->d:J

    .line 66
    iget-wide v11, v4, La/pf6;->c:J

    move-object v4, v10

    move-wide v10, v11

    move-object/from16 v12, p6

    .line 67
    invoke-static/range {v7 .. v12}, La/rf6;->b(La/oms0;JJLa/fet;)La/cms0;

    move-result-object v8

    move-object/from16 v34, v7

    move-object v10, v12

    .line 68
    sget-object v7, La/gqw0;->a:La/zx7;

    .line 69
    invoke-static {v7, v14}, La/zq8;->c(La/u12;Z)La/tj30;

    move-result-object v7

    .line 70
    iget-wide v11, v10, La/fet;->T:J

    .line 71
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    .line 72
    invoke-virtual {v10}, La/fet;->m()La/bh90;

    move-result-object v11

    .line 73
    invoke-static {v10, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    move-result-object v12

    .line 74
    sget-object v16, La/mkd;->c0:La/gqw0;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    invoke-virtual {v10}, La/fet;->i0()V

    .line 76
    iget-boolean v14, v10, La/fet;->S:Z

    .line 77
    sget-object v1, La/e7z;->u1:La/pcy;

    if-eqz v14, :cond_1f

    .line 78
    invoke-virtual {v10, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    goto :goto_10

    .line 79
    :cond_1f
    invoke-virtual {v10}, La/fet;->r0()V

    .line 80
    :goto_10
    sget-object v14, La/gqw0;->x:La/shd;

    .line 81
    invoke-static {v10, v7, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 82
    sget-object v7, La/gqw0;->w:La/shd;

    .line 83
    invoke-static {v10, v11, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 84
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 85
    sget-object v11, La/gqw0;->y:La/shd;

    .line 86
    invoke-static {v10, v9, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 87
    invoke-static {v10}, La/jpm0;->n(La/fet;)V

    .line 88
    sget-object v9, La/gqw0;->v:La/shd;

    .line 89
    invoke-static {v10, v12, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 90
    sget-object v12, La/jm40;->b:La/jm40;

    move/from16 v27, v2

    move-object/from16 v17, v13

    const/4 v2, 0x0

    const/4 v13, 0x1

    invoke-static {v12, v2, v13}, La/phu0;->H(La/mm40;La/ltc;I)La/mm40;

    move-result-object v35

    xor-int/lit8 v38, v3, 0x1

    const/high16 v2, 0x70000

    and-int v2, v27, v2

    const/high16 v13, 0x20000

    if-ne v2, v13, :cond_20

    const/16 v18, 0x1

    goto :goto_11

    :cond_20
    const/16 v18, 0x0

    .line 91
    :goto_11
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    move-result-object v13

    if-nez v18, :cond_21

    if-ne v13, v15, :cond_22

    .line 92
    :cond_21
    new-instance v13, La/fj4;

    const/16 v3, 0x1c

    invoke-direct {v13, v5, v3}, La/fj4;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 93
    invoke-virtual {v10, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 94
    :cond_22
    move-object/from16 v40, v13

    check-cast v40, Lkotlin/jvm/functions/Function0;

    const/16 v41, 0x18

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v39, 0x0

    .line 95
    invoke-static/range {v35 .. v41}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    move-result-object v3

    move-object/from16 v13, v32

    .line 96
    invoke-virtual {v10, v13}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v18

    .line 97
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    move-result-object v6

    if-nez v18, :cond_23

    if-ne v6, v15, :cond_24

    .line 98
    :cond_23
    new-instance v6, La/qf6;

    const/4 v5, 0x0

    invoke-direct {v6, v13, v5}, La/qf6;-><init>(Ljava/lang/Object;B)V

    .line 99
    invoke-virtual {v10, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 100
    :cond_24
    check-cast v6, La/tj30;

    move-object v13, v4

    .line 101
    iget-wide v4, v10, La/fet;->T:J

    .line 102
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    .line 103
    invoke-virtual {v10}, La/fet;->m()La/bh90;

    move-result-object v5

    .line 104
    invoke-static {v10, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    move-result-object v3

    .line 105
    invoke-virtual {v10}, La/fet;->i0()V

    move-object/from16 v18, v13

    .line 106
    iget-boolean v13, v10, La/fet;->S:Z

    if-eqz v13, :cond_25

    .line 107
    invoke-virtual {v10, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    goto :goto_12

    .line 108
    :cond_25
    invoke-virtual {v10}, La/fet;->r0()V

    .line 109
    :goto_12
    invoke-static {v10, v6, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 110
    invoke-static {v10, v5, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 111
    invoke-static {v4, v10, v11, v10}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 112
    invoke-static {v10, v3, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 113
    const-string v3, "BetBuilderButton"

    invoke-static {v12, v3}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    move-result-object v3

    .line 114
    invoke-static {v3}, La/lgb;->K(La/mm40;)La/mm40;

    move-result-object v3

    .line 115
    sget-object v4, La/qmk;->a:La/zcl;

    const/high16 v4, 0x42000000    # 32.0f

    invoke-static {v3, v4}, La/o7k0;->e(La/mm40;F)La/mm40;

    move-result-object v3

    move-object/from16 v13, v18

    .line 116
    invoke-virtual {v10, v13}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v4

    .line 117
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_26

    if-ne v5, v15, :cond_27

    .line 118
    :cond_26
    new-instance v5, La/yd1;

    const/16 v4, 0x13

    invoke-direct {v5, v13, v4}, La/yd1;-><init>(La/l7m0;B)V

    .line 119
    invoke-virtual {v10, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 120
    :cond_27
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v5}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    move-result-object v3

    .line 121
    sget-object v4, La/gqw0;->k:La/yx7;

    .line 122
    sget-object v5, La/uc9;->a:La/lw3;

    const/16 v6, 0x30

    .line 123
    invoke-static {v5, v4, v10, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    move-result-object v4

    move-object v5, v7

    .line 124
    iget-wide v6, v10, La/fet;->T:J

    .line 125
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    .line 126
    invoke-virtual {v10}, La/fet;->m()La/bh90;

    move-result-object v7

    .line 127
    invoke-static {v10, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    move-result-object v3

    .line 128
    invoke-virtual {v10}, La/fet;->i0()V

    .line 129
    iget-boolean v13, v10, La/fet;->S:Z

    if-eqz v13, :cond_28

    .line 130
    invoke-virtual {v10, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    goto :goto_13

    .line 131
    :cond_28
    invoke-virtual {v10}, La/fet;->r0()V

    .line 132
    :goto_13
    invoke-static {v10, v4, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 133
    invoke-static {v10, v7, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 134
    invoke-static {v6, v10, v11, v10}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 135
    invoke-static {v10, v3, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 136
    sget v3, La/rf6;->a:F

    invoke-static {v12, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    move-result-object v3

    .line 137
    sget-object v4, La/gqw0;->e:La/zx7;

    const/4 v6, 0x0

    .line 138
    invoke-static {v4, v6}, La/zq8;->c(La/u12;Z)La/tj30;

    move-result-object v4

    .line 139
    iget-wide v6, v10, La/fet;->T:J

    .line 140
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    .line 141
    invoke-virtual {v10}, La/fet;->m()La/bh90;

    move-result-object v7

    .line 142
    invoke-static {v10, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    move-result-object v3

    .line 143
    invoke-virtual {v10}, La/fet;->i0()V

    .line 144
    iget-boolean v13, v10, La/fet;->S:Z

    if-eqz v13, :cond_29

    .line 145
    invoke-virtual {v10, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    goto :goto_14

    .line 146
    :cond_29
    invoke-virtual {v10}, La/fet;->r0()V

    .line 147
    :goto_14
    invoke-static {v10, v4, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 148
    invoke-static {v10, v7, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 149
    invoke-static {v6, v10, v11, v10}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 150
    invoke-static {v10, v3, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    move-object/from16 v35, v12

    .line 151
    new-instance v12, La/m0x;

    const v1, 0x7f080855

    const/4 v3, 0x6

    const/4 v4, 0x0

    invoke-direct {v12, v1, v4, v3}, La/m0x;-><init>(ILa/bzw;I)V

    .line 152
    iget-object v1, v8, La/cms0;->j:La/pz40;

    .line 153
    check-cast v1, La/hgk0;

    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 154
    check-cast v1, La/y3d;

    .line 155
    iget-wide v5, v1, La/y3d;->a:J

    const/16 v24, 0xc00

    const/16 v25, 0x1fe9

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v1, v15

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v28, v23

    const/16 v23, 0x0

    move-wide/from16 v57, v5

    move-object v5, v8

    move-wide/from16 v8, v57

    move-object/from16 v22, p6

    move-object v6, v1

    move-object/from16 v1, v28

    const/4 v3, 0x1

    .line 156
    invoke-static/range {v7 .. v25}, La/ebc;->b(La/mm40;JFZLa/o0x;Ljava/lang/Integer;La/o0x;Ljava/lang/Integer;La/o0x;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;La/fet;III)V

    move-object/from16 v10, v22

    .line 157
    invoke-virtual {v10, v3}, La/fet;->r(Z)V

    .line 158
    new-instance v11, La/x7z;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v11, v7, v3}, La/x7z;-><init>(FZ)V

    const/4 v15, 0x0

    const/16 v16, 0xb

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/high16 v14, 0x41000000    # 8.0f

    .line 159
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    move-result-object v7

    move-object/from16 v9, v33

    .line 160
    invoke-virtual {v10, v9}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v8

    .line 161
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    move-result-object v11

    if-nez v8, :cond_2a

    if-ne v11, v6, :cond_2b

    .line 162
    :cond_2a
    new-instance v11, La/yd1;

    const/16 v8, 0x14

    invoke-direct {v11, v9, v8}, La/yd1;-><init>(La/l7m0;B)V

    .line 163
    invoke-virtual {v10, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 164
    :cond_2b
    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-static {v7, v11}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    move-result-object v8

    .line 165
    iget-object v5, v5, La/cms0;->j:La/pz40;

    .line 166
    check-cast v5, La/hgk0;

    invoke-virtual {v5}, La/hgk0;->getValue()Ljava/lang/Object;

    move-result-object v7

    .line 167
    check-cast v7, La/y3d;

    .line 168
    iget-wide v11, v7, La/y3d;->a:J

    .line 169
    sget-object v48, La/j1t0;->c:La/qrq;

    .line 170
    sget-wide v45, La/qmk;->r:J

    .line 171
    sget-wide v54, La/qmk;->F:J

    .line 172
    new-instance v42, La/y9q0;

    const/16 v53, 0x0

    const v56, 0xfdffdd

    const-wide/16 v43, 0x0

    const/16 v47, 0x0

    const-wide/16 v49, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    invoke-direct/range {v42 .. v56}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    shr-int/lit8 v7, v27, 0x3

    and-int/lit8 v29, v7, 0xe

    const/16 v30, 0x6180

    const v31, 0x1aff8

    move-wide v9, v11

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x2

    const/16 v23, 0x0

    const/16 v24, 0x1

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v7, p1

    move-object/from16 v28, p6

    move-object/from16 v27, v42

    .line 173
    invoke-static/range {v7 .. v31}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    move-object/from16 v10, v28

    const/16 v39, 0x0

    const/16 v40, 0xb

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/high16 v38, 0x40c00000    # 6.0f

    .line 174
    invoke-static/range {v35 .. v40}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    move-result-object v7

    .line 175
    invoke-virtual {v10, v0}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v8

    .line 176
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_2c

    if-ne v9, v6, :cond_2d

    .line 177
    :cond_2c
    new-instance v9, La/yd1;

    const/16 v8, 0x15

    invoke-direct {v9, v0, v8}, La/yd1;-><init>(La/l7m0;B)V

    .line 178
    invoke-virtual {v10, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 179
    :cond_2d
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v7, v9}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    move-result-object v7

    .line 180
    new-instance v0, La/m0x;

    const v8, 0x7f080800

    const/4 v9, 0x6

    invoke-direct {v0, v8, v4, v9}, La/m0x;-><init>(ILa/bzw;I)V

    .line 181
    invoke-virtual {v5}, La/hgk0;->getValue()Ljava/lang/Object;

    move-result-object v5

    .line 182
    check-cast v5, La/y3d;

    .line 183
    iget-wide v8, v5, La/y3d;->a:J

    if-eqz p2, :cond_31

    .line 184
    invoke-virtual/range {v34 .. v34}, La/oms0;->g()Z

    move-result v5

    if-nez v5, :cond_31

    const v4, -0x5a8e910b

    invoke-virtual {v10, v4}, La/fet;->e0(I)V

    const/high16 v13, 0x20000

    if-ne v2, v13, :cond_2e

    move v2, v3

    goto :goto_15

    :cond_2e
    const/4 v2, 0x0

    .line 185
    :goto_15
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_30

    if-ne v4, v6, :cond_2f

    goto :goto_16

    :cond_2f
    move-object/from16 v5, p4

    goto :goto_17

    .line 186
    :cond_30
    :goto_16
    new-instance v4, La/fj4;

    const/16 v2, 0x1d

    move-object/from16 v5, p4

    invoke-direct {v4, v5, v2}, La/fj4;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 187
    invoke-virtual {v10, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 188
    :goto_17
    move-object v15, v4

    check-cast v15, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 189
    invoke-virtual {v10, v2}, La/fet;->r(Z)V

    move-object/from16 v21, v15

    goto :goto_18

    :cond_31
    move-object/from16 v5, p4

    const/4 v2, 0x0

    const v11, -0x5a8d4276

    .line 190
    invoke-virtual {v10, v11}, La/fet;->e0(I)V

    .line 191
    invoke-virtual {v10, v2}, La/fet;->r(Z)V

    move-object/from16 v21, v4

    :goto_18
    const/16 v24, 0x0

    const/16 v25, 0x1ef8

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, p6

    move-object/from16 v16, v0

    move-object/from16 v0, v35

    .line 192
    invoke-static/range {v7 .. v25}, La/ebc;->b(La/mm40;JFZLa/o0x;Ljava/lang/Integer;La/o0x;Ljava/lang/Integer;La/o0x;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;La/fet;III)V

    move-object/from16 v10, v22

    .line 193
    invoke-virtual {v10, v3}, La/fet;->r(Z)V

    .line 194
    invoke-virtual {v10, v3}, La/fet;->r(Z)V

    .line 195
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v6, :cond_32

    .line 196
    new-instance v4, La/qf5;

    sget-object v7, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    move-result-wide v7

    .line 197
    new-instance v9, La/y3d;

    invoke-direct {v9, v7, v8}, La/y3d;-><init>(J)V

    const/4 v7, 0x2

    .line 198
    invoke-direct {v4, v7, v9}, La/qf5;-><init>(ILa/y3d;)V

    .line 199
    invoke-virtual {v10, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 200
    :cond_32
    check-cast v4, La/qf5;

    .line 201
    sget-object v7, La/gqw0;->c:La/zx7;

    .line 202
    sget-object v8, La/jr8;->a:La/jr8;

    invoke-virtual {v8, v0, v7}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    move-result-object v0

    const/high16 v7, -0x40000000    # -2.0f

    const/4 v8, 0x0

    .line 203
    invoke-static {v0, v8, v7}, La/ffb0;->Q(La/mm40;FF)La/mm40;

    move-result-object v0

    .line 204
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v7

    .line 205
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_33

    if-ne v8, v6, :cond_34

    .line 206
    :cond_33
    new-instance v8, La/yd1;

    const/16 v6, 0x16

    invoke-direct {v8, v1, v6}, La/yd1;-><init>(La/l7m0;B)V

    .line 207
    invoke-virtual {v10, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 208
    :cond_34
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v8}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    move-result-object v0

    const/16 v1, 0x30

    .line 209
    invoke-static {v0, v4, v10, v1, v2}, La/thb;->f(La/mm40;La/uf5;La/fet;II)V

    .line 210
    invoke-virtual {v10, v3}, La/fet;->r(Z)V

    goto :goto_19

    .line 211
    :cond_35
    invoke-virtual {v10}, La/fet;->X()V

    .line 212
    :goto_19
    invoke-virtual {v10}, La/fet;->u()La/yfe0;

    move-result-object v8

    if-eqz v8, :cond_36

    new-instance v0, La/ag;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, La/ag;-><init>(La/mm40;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V

    .line 213
    iput-object v0, v8, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    :cond_36
    return-void
.end method

.method public static final b(La/oms0;JJLa/fet;)La/cms0;
    .locals 11

    .line 1
    move-object/from16 v5, p5

    .line 2
    .line 3
    iget-object v0, p0, La/oms0;->d:La/pz40;

    .line 4
    .line 5
    iget-object v1, p0, La/oms0;->a:La/p4;

    .line 6
    .line 7
    check-cast v0, La/hgk0;

    .line 8
    .line 9
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const v2, 0xa06f795

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5, v2}, La/fet;->e0(I)V

    .line 23
    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    move-wide v3, p1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-wide v3, p3

    .line 30
    :goto_0
    const/4 v0, 0x0

    .line 31
    invoke-virtual {v5, v0}, La/fet;->r(Z)V

    .line 32
    .line 33
    .line 34
    invoke-static {v3, v4}, La/y3d;->f(J)La/y4d;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v5, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    const/4 v7, 0x2

    .line 47
    sget-object v8, La/ukd;->a:La/cl5;

    .line 48
    .line 49
    if-nez v4, :cond_1

    .line 50
    .line 51
    if-ne v6, v8, :cond_2

    .line 52
    .line 53
    :cond_1
    sget-object v4, La/qja;->j:La/qja;

    .line 54
    .line 55
    new-instance v6, La/s43;

    .line 56
    .line 57
    invoke-direct {v6, v3, v7}, La/s43;-><init>(Ljava/lang/Object;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {v4, v6, v5}, La/kng0;->d(La/qja;La/s43;La/fet;)La/lxs0;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    :cond_2
    move-object v4, v6

    .line 65
    check-cast v4, La/lxs0;

    .line 66
    .line 67
    invoke-virtual {p0}, La/oms0;->h()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-nez v3, :cond_6

    .line 72
    .line 73
    const v3, 0x6355e4b0

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, v3}, La/fet;->e0(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    if-nez v3, :cond_3

    .line 88
    .line 89
    if-ne v6, v8, :cond_5

    .line 90
    .line 91
    :cond_3
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    if-eqz v3, :cond_4

    .line 96
    .line 97
    invoke-virtual {v3}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    goto :goto_1

    .line 102
    :cond_4
    const/4 v6, 0x0

    .line 103
    :goto_1
    invoke-static {v3}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    :try_start_0
    invoke-virtual {v1}, La/p4;->y0()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    invoke-static {v3, v9, v6}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    move-object v6, v1

    .line 118
    :cond_5
    invoke-virtual {v5, v0}, La/fet;->r(Z)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :catchall_0
    move-exception v0

    .line 123
    move-object p0, v0

    .line 124
    invoke-static {v3, v9, v6}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 125
    .line 126
    .line 127
    throw p0

    .line 128
    :cond_6
    const v3, 0x6359c50d

    .line 129
    .line 130
    .line 131
    invoke-static {v5, v3, v0, v1}, La/vqd;->j(La/fet;IZLa/p4;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    :goto_2
    check-cast v6, Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    invoke-virtual {v5, v2}, La/fet;->e0(I)V

    .line 142
    .line 143
    .line 144
    if-eqz v1, :cond_7

    .line 145
    .line 146
    move-wide v9, p1

    .line 147
    goto :goto_3

    .line 148
    :cond_7
    move-wide v9, p3

    .line 149
    :goto_3
    invoke-static {v5, v0, v9, v10}, La/dw9;->f(La/fet;ZJ)La/y3d;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v5, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    if-nez v3, :cond_8

    .line 162
    .line 163
    if-ne v6, v8, :cond_9

    .line 164
    .line 165
    :cond_8
    new-instance v3, La/gb3;

    .line 166
    .line 167
    const/16 v6, 0x12

    .line 168
    .line 169
    invoke-direct {v3, p0, v6}, La/gb3;-><init>(La/oms0;B)V

    .line 170
    .line 171
    .line 172
    invoke-static {v3}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    invoke-virtual {v5, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :cond_9
    check-cast v6, La/l7m0;

    .line 180
    .line 181
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, Ljava/lang/Boolean;

    .line 186
    .line 187
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    invoke-virtual {v5, v2}, La/fet;->e0(I)V

    .line 192
    .line 193
    .line 194
    if-eqz v3, :cond_a

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_a
    move-wide p1, p3

    .line 198
    :goto_4
    invoke-static {v5, v0, p1, p2}, La/dw9;->f(La/fet;ZJ)La/y3d;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-virtual {v5, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    if-nez p1, :cond_b

    .line 211
    .line 212
    if-ne p2, v8, :cond_c

    .line 213
    .line 214
    :cond_b
    new-instance p1, La/gb3;

    .line 215
    .line 216
    const/16 p2, 0x13

    .line 217
    .line 218
    invoke-direct {p1, p0, p2}, La/gb3;-><init>(La/oms0;B)V

    .line 219
    .line 220
    .line 221
    invoke-static {p1}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 222
    .line 223
    .line 224
    move-result-object p2

    .line 225
    invoke-virtual {v5, p2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :cond_c
    check-cast p2, La/l7m0;

    .line 229
    .line 230
    invoke-interface {p2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    check-cast p1, La/ams0;

    .line 235
    .line 236
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    const p2, 0xcf1ca9

    .line 240
    .line 241
    .line 242
    invoke-virtual {v5, p2}, La/fet;->e0(I)V

    .line 243
    .line 244
    .line 245
    invoke-interface {p1}, La/ams0;->b()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    check-cast p1, Ljava/lang/Boolean;

    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    if-eqz p1, :cond_d

    .line 256
    .line 257
    const/16 p1, 0x64

    .line 258
    .line 259
    sget-object p2, La/hhn;->b:La/zsf;

    .line 260
    .line 261
    invoke-static {p1, v0, p2, v7}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    :goto_5
    move-object v3, p1

    .line 266
    goto :goto_6

    .line 267
    :cond_d
    const/16 p1, 0x1f4

    .line 268
    .line 269
    sget-object p2, La/hhn;->b:La/zsf;

    .line 270
    .line 271
    invoke-static {p1, v0, p2, v7}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    goto :goto_5

    .line 276
    :goto_6
    invoke-virtual {v5, v0}, La/fet;->r(Z)V

    .line 277
    .line 278
    .line 279
    const/4 v6, 0x0

    .line 280
    move-object v0, p0

    .line 281
    invoke-static/range {v0 .. v6}, La/phu0;->E(La/oms0;Ljava/lang/Object;Ljava/lang/Object;La/cfq;La/lxs0;La/fet;I)La/cms0;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    return-object p0
.end method

.method public static final c(La/oms0;IILa/fet;II)La/cms0;
    .locals 8

    .line 1
    and-int/lit8 p4, p5, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/16 p4, 0x64

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/16 p4, 0x258

    .line 9
    .line 10
    :goto_0
    sget-object v4, La/hp4;->j:La/lxs0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/oms0;->h()Z

    .line 13
    .line 14
    .line 15
    move-result p5

    .line 16
    iget-object v0, p0, La/oms0;->a:La/p4;

    .line 17
    .line 18
    sget-object v1, La/ukd;->a:La/cl5;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-nez p5, :cond_4

    .line 22
    .line 23
    const p5, 0x6355e4b0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p3, p5}, La/fet;->e0(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p5

    .line 33
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-nez p5, :cond_1

    .line 38
    .line 39
    if-ne v3, v1, :cond_3

    .line 40
    .line 41
    :cond_1
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 42
    .line 43
    .line 44
    move-result-object p5

    .line 45
    if-eqz p5, :cond_2

    .line 46
    .line 47
    invoke-virtual {p5}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const/4 v3, 0x0

    .line 53
    :goto_1
    invoke-static {p5}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    :try_start_0
    invoke-virtual {v0}, La/p4;->y0()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    invoke-static {p5, v5, v3}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-object v3, v0

    .line 68
    :cond_3
    invoke-virtual {p3, v2}, La/fet;->r(Z)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    move-object p0, v0

    .line 74
    invoke-static {p5, v5, v3}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 75
    .line 76
    .line 77
    throw p0

    .line 78
    :cond_4
    const p5, 0x6359c50d

    .line 79
    .line 80
    .line 81
    invoke-static {p3, p5, v2, v0}, La/vqd;->j(La/fet;IZLa/p4;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    :goto_2
    check-cast v3, Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result p5

    .line 91
    const v0, 0x60b40c00

    .line 92
    .line 93
    .line 94
    invoke-virtual {p3, v0}, La/fet;->e0(I)V

    .line 95
    .line 96
    .line 97
    const/4 v3, 0x0

    .line 98
    const/high16 v5, 0x3f800000    # 1.0f

    .line 99
    .line 100
    if-eqz p5, :cond_5

    .line 101
    .line 102
    move p5, v5

    .line 103
    goto :goto_3

    .line 104
    :cond_5
    move p5, v3

    .line 105
    :goto_3
    invoke-virtual {p3, v2}, La/fet;->r(Z)V

    .line 106
    .line 107
    .line 108
    invoke-static {p5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 109
    .line 110
    .line 111
    move-result-object p5

    .line 112
    invoke-virtual {p3, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    if-nez v6, :cond_6

    .line 121
    .line 122
    if-ne v7, v1, :cond_7

    .line 123
    .line 124
    :cond_6
    new-instance v6, La/gb3;

    .line 125
    .line 126
    const/16 v7, 0x14

    .line 127
    .line 128
    invoke-direct {v6, p0, v7}, La/gb3;-><init>(La/oms0;B)V

    .line 129
    .line 130
    .line 131
    invoke-static {v6}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    invoke-virtual {p3, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_7
    check-cast v7, La/l7m0;

    .line 139
    .line 140
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    check-cast v6, Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    invoke-virtual {p3, v0}, La/fet;->e0(I)V

    .line 151
    .line 152
    .line 153
    if-eqz v6, :cond_8

    .line 154
    .line 155
    move v3, v5

    .line 156
    :cond_8
    invoke-virtual {p3, v2}, La/fet;->r(Z)V

    .line 157
    .line 158
    .line 159
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {p3, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    if-nez v3, :cond_9

    .line 172
    .line 173
    if-ne v5, v1, :cond_a

    .line 174
    .line 175
    :cond_9
    new-instance v1, La/gb3;

    .line 176
    .line 177
    const/16 v3, 0x15

    .line 178
    .line 179
    invoke-direct {v1, p0, v3}, La/gb3;-><init>(La/oms0;B)V

    .line 180
    .line 181
    .line 182
    invoke-static {v1}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-virtual {p3, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    :cond_a
    check-cast v5, La/l7m0;

    .line 190
    .line 191
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    check-cast v1, La/ams0;

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    const v3, 0x7ff00805

    .line 201
    .line 202
    .line 203
    invoke-virtual {p3, v3}, La/fet;->e0(I)V

    .line 204
    .line 205
    .line 206
    invoke-interface {v1}, La/ams0;->b()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    check-cast v1, Ljava/lang/Boolean;

    .line 211
    .line 212
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-eqz v1, :cond_b

    .line 217
    .line 218
    sget-object p2, La/hhn;->b:La/zsf;

    .line 219
    .line 220
    new-instance v1, La/uts0;

    .line 221
    .line 222
    invoke-direct {v1, p1, p4, p2}, La/uts0;-><init>(IILa/ghn;)V

    .line 223
    .line 224
    .line 225
    :goto_4
    move-object v3, v1

    .line 226
    goto :goto_5

    .line 227
    :cond_b
    sget-object p1, La/hhn;->b:La/zsf;

    .line 228
    .line 229
    const/4 p4, 0x2

    .line 230
    invoke-static {p2, v2, p1, p4}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    goto :goto_4

    .line 235
    :goto_5
    invoke-virtual {p3, v2}, La/fet;->r(Z)V

    .line 236
    .line 237
    .line 238
    const/4 v6, 0x0

    .line 239
    move-object v5, p3

    .line 240
    move-object v1, p5

    .line 241
    move-object v2, v0

    .line 242
    move-object v0, p0

    .line 243
    invoke-static/range {v0 .. v6}, La/phu0;->E(La/oms0;Ljava/lang/Object;Ljava/lang/Object;La/cfq;La/lxs0;La/fet;I)La/cms0;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    return-object p0
.end method
