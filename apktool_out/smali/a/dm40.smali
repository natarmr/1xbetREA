.class public abstract La/dm40;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/high16 v0, 0x3f000000    # 0.5f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, La/osm0;->e(FF)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    sput-wide v0, La/dm40;->a:J

    .line 9
    .line 10
    return-void
.end method

.method public static final a(Lkotlin/jvm/functions/Function0;La/mm40;La/xpj0;FZLa/yjj0;JJJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/em40;La/ugd;La/fet;II)V
    .locals 28

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v8, p16

    move/from16 v9, p17

    move/from16 v10, p18

    const v0, 0x7188eb30

    .line 1
    invoke-virtual {v8, v0}, La/fet;->g0(I)La/fet;

    and-int/lit8 v0, v9, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v8, v1}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int/2addr v0, v9

    goto :goto_1

    :cond_1
    move v0, v9

    :goto_1
    and-int/lit8 v4, v9, 0x30

    const/16 v5, 0x10

    const/16 v6, 0x20

    move-object/from16 v12, p1

    if-nez v4, :cond_3

    invoke-virtual {v8, v12}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v6

    goto :goto_2

    :cond_2
    move v4, v5

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit16 v4, v9, 0x180

    const/16 v7, 0x80

    if-nez v4, :cond_5

    invoke-virtual {v8, v3}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    move v4, v7

    :goto_3
    or-int/2addr v0, v4

    :cond_5
    or-int/lit16 v0, v0, 0x6c00

    const/high16 v4, 0x30000

    and-int/2addr v4, v9

    move-object/from16 v14, p5

    if-nez v4, :cond_7

    invoke-virtual {v8, v14}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/high16 v4, 0x20000

    goto :goto_4

    :cond_6
    const/high16 v4, 0x10000

    :goto_4
    or-int/2addr v0, v4

    :cond_7
    const/high16 v4, 0x180000

    and-int/2addr v4, v9

    move-wide/from16 v11, p6

    if-nez v4, :cond_9

    invoke-virtual {v8, v11, v12}, La/fet;->f(J)Z

    move-result v4

    if-eqz v4, :cond_8

    const/high16 v4, 0x100000

    goto :goto_5

    :cond_8
    const/high16 v4, 0x80000

    :goto_5
    or-int/2addr v0, v4

    :cond_9
    const/high16 v4, 0xc00000

    and-int/2addr v4, v9

    move-wide/from16 v13, p8

    if-nez v4, :cond_b

    invoke-virtual {v8, v13, v14}, La/fet;->f(J)Z

    move-result v4

    if-eqz v4, :cond_a

    const/high16 v4, 0x800000

    goto :goto_6

    :cond_a
    const/high16 v4, 0x400000

    :goto_6
    or-int/2addr v0, v4

    :cond_b
    const/high16 v4, 0x6000000

    or-int/2addr v0, v4

    const/high16 v4, 0x30000000

    and-int/2addr v4, v9

    move-wide/from16 v11, p10

    if-nez v4, :cond_d

    invoke-virtual {v8, v11, v12}, La/fet;->f(J)Z

    move-result v4

    if-eqz v4, :cond_c

    const/high16 v4, 0x20000000

    goto :goto_7

    :cond_c
    const/high16 v4, 0x10000000

    :goto_7
    or-int/2addr v0, v4

    :cond_d
    and-int/lit8 v4, v10, 0x6

    if-nez v4, :cond_f

    move-object/from16 v4, p12

    invoke-virtual {v8, v4}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_e

    const/4 v2, 0x4

    :cond_e
    or-int/2addr v2, v10

    goto :goto_8

    :cond_f
    move-object/from16 v4, p12

    move v2, v10

    :goto_8
    and-int/lit8 v17, v10, 0x30

    move-object/from16 v15, p13

    if-nez v17, :cond_11

    invoke-virtual {v8, v15}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_10

    move v5, v6

    :cond_10
    or-int/2addr v2, v5

    :cond_11
    and-int/lit16 v5, v10, 0x180

    if-nez v5, :cond_13

    move-object/from16 v5, p14

    invoke-virtual {v8, v5}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_12

    const/16 v7, 0x100

    :cond_12
    or-int/2addr v2, v7

    goto :goto_9

    :cond_13
    move-object/from16 v5, p14

    :goto_9
    and-int/lit16 v6, v10, 0xc00

    if-nez v6, :cond_15

    move-object/from16 v6, p15

    invoke-virtual {v8, v6}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_14

    const/16 v7, 0x800

    goto :goto_a

    :cond_14
    const/16 v7, 0x400

    :goto_a
    or-int/2addr v2, v7

    goto :goto_b

    :cond_15
    move-object/from16 v6, p15

    :goto_b
    const v7, 0x12492493

    and-int/2addr v7, v0

    const v4, 0x12492492

    if-ne v7, v4, :cond_17

    and-int/lit16 v4, v2, 0x493

    const/16 v7, 0x492

    if-eq v4, v7, :cond_16

    goto :goto_c

    :cond_16
    const/4 v4, 0x0

    goto :goto_d

    :cond_17
    :goto_c
    const/4 v4, 0x1

    :goto_d
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v8, v7, v4}, La/fet;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_39

    invoke-virtual {v8}, La/fet;->Z()V

    and-int/lit8 v4, p17, 0x1

    if-eqz v4, :cond_19

    invoke-virtual {v8}, La/fet;->B()Z

    move-result v4

    if-eqz v4, :cond_18

    goto :goto_e

    .line 2
    :cond_18
    invoke-virtual {v8}, La/fet;->X()V

    move/from16 v19, p3

    move/from16 v11, p4

    goto :goto_f

    .line 3
    :cond_19
    :goto_e
    sget v4, La/uo8;->c:F

    move/from16 v19, v4

    const/4 v11, 0x1

    .line 4
    :goto_f
    invoke-virtual {v8}, La/fet;->s()V

    .line 5
    sget-object v4, La/yt40;->a:La/yt40;

    invoke-static {v4, v8}, La/d7x;->P(La/yt40;La/fet;)La/nul0;

    move-result-object v6

    .line 6
    invoke-static {v4, v8}, La/d7x;->P(La/yt40;La/fet;)La/nul0;

    move-result-object v4

    .line 7
    sget-object v7, La/yt40;->d:La/yt40;

    invoke-static {v7, v8}, La/d7x;->P(La/yt40;La/fet;)La/nul0;

    move-result-object v7

    and-int/lit16 v12, v0, 0x380

    xor-int/lit16 v12, v12, 0x180

    const/16 v9, 0x100

    if-le v12, v9, :cond_1b

    .line 8
    invoke-virtual {v8, v3}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_1a

    goto :goto_10

    :cond_1a
    move/from16 v21, v2

    goto :goto_11

    :cond_1b
    :goto_10
    move/from16 v21, v2

    and-int/lit16 v2, v0, 0x180

    if-ne v2, v9, :cond_1c

    :goto_11
    const/4 v2, 0x1

    goto :goto_12

    :cond_1c
    const/4 v2, 0x0

    :goto_12
    invoke-virtual {v8, v4}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v2, v9

    invoke-virtual {v8, v7}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v2, v9

    invoke-virtual {v8, v6}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v2, v9

    .line 9
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    move-result-object v9

    move-object/from16 p3, v7

    .line 10
    sget-object v7, La/ukd;->a:La/cl5;

    if-nez v2, :cond_1e

    if-ne v9, v7, :cond_1d

    goto :goto_13

    :cond_1d
    move-object v2, v9

    move-object v9, v7

    goto :goto_14

    .line 11
    :cond_1e
    :goto_13
    new-instance v2, La/np8;

    move-object v9, v7

    const/4 v7, 0x1

    move-object/from16 v5, p3

    invoke-direct/range {v2 .. v7}, La/np8;-><init>(La/xpj0;La/nul0;La/nul0;La/nul0;B)V

    .line 12
    invoke-virtual {v8, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 13
    :goto_14
    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-static {v2, v8}, La/m0x0;->D(Lkotlin/jvm/functions/Function0;La/fet;)V

    .line 14
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v9, :cond_1f

    .line 15
    sget-object v2, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 16
    invoke-static {v2, v8}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    move-result-object v2

    .line 17
    invoke-virtual {v8, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 18
    :cond_1f
    check-cast v2, La/vne;

    const/16 v4, 0x100

    if-le v12, v4, :cond_20

    .line 19
    invoke-virtual {v8, v3}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_21

    :cond_20
    and-int/lit16 v5, v0, 0x180

    if-ne v5, v4, :cond_22

    :cond_21
    const/4 v4, 0x1

    goto :goto_15

    :cond_22
    const/4 v4, 0x0

    :goto_15
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    and-int/lit8 v5, v0, 0xe

    const/4 v6, 0x4

    if-ne v5, v6, :cond_23

    const/4 v6, 0x1

    goto :goto_16

    :cond_23
    const/4 v6, 0x0

    :goto_16
    or-int/2addr v4, v6

    .line 20
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_24

    if-ne v6, v9, :cond_25

    .line 21
    :cond_24
    new-instance v6, La/yl40;

    invoke-direct {v6, v3, v2, v1}, La/yl40;-><init>(La/xpj0;La/vne;Lkotlin/jvm/functions/Function0;)V

    .line 22
    invoke-virtual {v8, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 23
    :cond_25
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 24
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v4

    const/16 v7, 0x100

    if-le v12, v7, :cond_27

    invoke-virtual {v8, v3}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_26

    goto :goto_17

    :cond_26
    move/from16 p3, v4

    goto :goto_18

    :cond_27
    :goto_17
    move/from16 p3, v4

    and-int/lit16 v4, v0, 0x180

    if-ne v4, v7, :cond_28

    :goto_18
    const/4 v4, 0x1

    goto :goto_19

    :cond_28
    const/4 v4, 0x0

    :goto_19
    or-int v4, p3, v4

    const/4 v7, 0x4

    if-ne v5, v7, :cond_29

    const/4 v7, 0x1

    goto :goto_1a

    :cond_29
    const/4 v7, 0x0

    :goto_1a
    or-int/2addr v4, v7

    .line 25
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_2b

    if-ne v7, v9, :cond_2a

    goto :goto_1b

    :cond_2a
    const/4 v4, 0x1

    goto :goto_1c

    .line 26
    :cond_2b
    :goto_1b
    new-instance v7, La/jl40;

    const/4 v4, 0x1

    invoke-direct {v7, v2, v3, v1, v4}, La/jl40;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 27
    invoke-virtual {v8, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 28
    :goto_1c
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 29
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v9, :cond_2c

    const/4 v4, 0x0

    .line 30
    invoke-static {v4}, La/xf0;->c(F)La/t33;

    move-result-object v4

    .line 31
    invoke-virtual {v8, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 32
    :cond_2c
    check-cast v4, La/t33;

    move-object/from16 p3, v6

    const/16 v6, 0x100

    if-le v12, v6, :cond_2d

    .line 33
    invoke-virtual {v8, v3}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_2e

    :cond_2d
    and-int/lit16 v1, v0, 0x180

    if-ne v1, v6, :cond_2f

    :cond_2e
    const/4 v1, 0x1

    goto :goto_1d

    :cond_2f
    const/4 v1, 0x0

    :goto_1d
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v16

    or-int v1, v1, v16

    invoke-virtual {v8, v4}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v16

    or-int v1, v1, v16

    const/4 v6, 0x4

    if-ne v5, v6, :cond_30

    const/4 v5, 0x1

    goto :goto_1e

    :cond_30
    const/4 v5, 0x0

    :goto_1e
    or-int/2addr v1, v5

    .line 34
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_31

    if-ne v5, v9, :cond_32

    :cond_31
    move v1, v0

    goto :goto_1f

    :cond_32
    move v6, v0

    move-object v3, v4

    const/16 v20, 0x1

    goto :goto_20

    .line 35
    :goto_1f
    new-instance v0, La/mr0;

    const/16 v5, 0x15

    move v6, v1

    move-object v1, v3

    move-object v3, v4

    const/16 v20, 0x1

    move-object/from16 v4, p0

    invoke-direct/range {v0 .. v5}, La/mr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 36
    invoke-virtual {v8, v0}, La/fet;->o0(Ljava/lang/Object;)V

    move-object v5, v0

    .line 37
    :goto_20
    move-object/from16 v22, v5

    check-cast v22, Lkotlin/jvm/functions/Function0;

    .line 38
    new-instance v0, La/bm40;

    move-object/from16 v4, p2

    move-object/from16 v17, p12

    move-object/from16 v5, p14

    move/from16 v23, v6

    move-object v8, v7

    move-object/from16 v26, v9

    move/from16 v25, v12

    move-object/from16 v18, v15

    move/from16 v10, v19

    move/from16 v24, v21

    move-object/from16 v9, p1

    move-object/from16 v12, p5

    move-object/from16 v19, p15

    move-object v7, v2

    move-object v6, v3

    move-wide v15, v13

    move-object/from16 v3, p3

    move-wide/from16 v13, p6

    move-wide/from16 v1, p10

    invoke-direct/range {v0 .. v19}, La/bm40;-><init>(JLkotlin/jvm/functions/Function0;La/xpj0;La/em40;La/t33;La/vne;Lkotlin/jvm/functions/Function1;La/mm40;FZLa/yjj0;JJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/ugd;)V

    move-object v8, v4

    move-object v3, v6

    const v1, 0x3c33c970

    move-object/from16 v6, p16

    invoke-static {v1, v0, v6}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    move-result-object v5

    move/from16 v9, v23

    shr-int/lit8 v0, v9, 0x12

    and-int/lit8 v0, v0, 0x70

    or-int/lit16 v0, v0, 0x6000

    move/from16 v2, v24

    and-int/lit16 v1, v2, 0x380

    or-int/2addr v0, v1

    or-int/lit16 v7, v0, 0x1000

    move-wide/from16 v1, p8

    move-object v4, v3

    move-object/from16 v0, v22

    move-object/from16 v3, p14

    .line 39
    invoke-static/range {v0 .. v7}, La/uvw;->e(Lkotlin/jvm/functions/Function0;JLa/em40;La/t33;La/ugd;La/fet;I)V

    .line 40
    iget-object v0, v8, La/xpj0;->e:La/qv2;

    .line 41
    invoke-virtual {v0}, La/qv2;->j()La/no20;

    move-result-object v0

    sget-object v1, La/ypj0;->b:La/ypj0;

    .line 42
    iget-object v0, v0, La/no20;->a:Ljava/util/Map;

    .line 43
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_38

    const v0, 0x2c9c96f2

    .line 44
    invoke-virtual {v6, v0}, La/fet;->e0(I)V

    move/from16 v0, v25

    const/16 v4, 0x100

    if-le v0, v4, :cond_33

    .line 45
    invoke-virtual {v6, v8}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_34

    :cond_33
    and-int/lit16 v0, v9, 0x180

    if-ne v0, v4, :cond_35

    :cond_34
    move/from16 v9, v20

    goto :goto_21

    :cond_35
    const/4 v9, 0x0

    .line 46
    :goto_21
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    move-result-object v0

    if-nez v9, :cond_36

    move-object/from16 v9, v26

    if-ne v0, v9, :cond_37

    .line 47
    :cond_36
    new-instance v0, La/xp8;

    const/16 v1, 0x9

    const/4 v2, 0x0

    invoke-direct {v0, v8, v2, v1}, La/xp8;-><init>(La/xpj0;La/yje;B)V

    .line 48
    invoke-virtual {v6, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 49
    :cond_37
    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {v6, v8, v0}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const/4 v0, 0x0

    .line 50
    invoke-virtual {v6, v0}, La/fet;->r(Z)V

    goto :goto_22

    :cond_38
    const/4 v0, 0x0

    const v1, 0x2c9d8732

    .line 51
    invoke-virtual {v6, v1}, La/fet;->e0(I)V

    .line 52
    invoke-virtual {v6, v0}, La/fet;->r(Z)V

    :goto_22
    move v4, v10

    move v5, v11

    goto :goto_23

    :cond_39
    move-object v6, v8

    move-object v8, v3

    .line 53
    invoke-virtual {v6}, La/fet;->X()V

    move/from16 v4, p3

    move/from16 v5, p4

    .line 54
    :goto_23
    invoke-virtual {v6}, La/fet;->u()La/yfe0;

    move-result-object v0

    if-eqz v0, :cond_3a

    move-object v1, v0

    new-instance v0, La/zl40;

    move-object/from16 v2, p1

    move-object/from16 v6, p5

    move-wide/from16 v9, p8

    move-wide/from16 v11, p10

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v27, v1

    move-object v3, v8

    move-object/from16 v1, p0

    move-wide/from16 v7, p6

    invoke-direct/range {v0 .. v18}, La/zl40;-><init>(Lkotlin/jvm/functions/Function0;La/mm40;La/xpj0;FZLa/yjj0;JJJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/em40;La/ugd;II)V

    move-object/from16 v1, v27

    .line 55
    iput-object v0, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    :cond_3a
    return-void
.end method

.method public static final b(La/t33;La/vne;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/mm40;La/xpj0;FZLa/yjj0;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/ugd;La/fet;I)V
    .locals 37

    move-object/from16 v1, p0

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    move-object/from16 v3, p5

    move/from16 v11, p6

    move/from16 v8, p7

    move-object/from16 v12, p17

    const v0, -0x23aaf70

    .line 1
    invoke-virtual {v12, v0}, La/fet;->g0(I)La/fet;

    invoke-virtual {v12, v1}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int v0, p18, v0

    move-object/from16 v7, p1

    invoke-virtual {v12, v7}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x100

    goto :goto_1

    :cond_1
    const/16 v5, 0x80

    :goto_1
    or-int/2addr v0, v5

    move-object/from16 v5, p2

    invoke-virtual {v12, v5}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v14

    const/16 v16, 0x400

    if-eqz v14, :cond_2

    const/16 v14, 0x800

    goto :goto_2

    :cond_2
    move/from16 v14, v16

    :goto_2
    or-int/2addr v0, v14

    invoke-virtual {v12, v9}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v14

    const/16 v18, 0x2000

    if-eqz v14, :cond_3

    const/16 v14, 0x4000

    goto :goto_3

    :cond_3
    move/from16 v14, v18

    :goto_3
    or-int/2addr v0, v14

    invoke-virtual {v12, v10}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v14

    const/high16 v19, 0x10000

    const/high16 v20, 0x20000

    if-eqz v14, :cond_4

    move/from16 v14, v20

    goto :goto_4

    :cond_4
    move/from16 v14, v19

    :goto_4
    or-int/2addr v0, v14

    invoke-virtual {v12, v3}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    const/high16 v14, 0x100000

    goto :goto_5

    :cond_5
    const/high16 v14, 0x80000

    :goto_5
    or-int/2addr v0, v14

    invoke-virtual {v12, v11}, La/fet;->d(F)Z

    move-result v14

    if-eqz v14, :cond_6

    const/high16 v14, 0x800000

    goto :goto_6

    :cond_6
    const/high16 v14, 0x400000

    :goto_6
    or-int/2addr v0, v14

    invoke-virtual {v12, v8}, La/fet;->h(Z)Z

    move-result v14

    if-eqz v14, :cond_7

    const/high16 v14, 0x4000000

    goto :goto_7

    :cond_7
    const/high16 v14, 0x2000000

    :goto_7
    or-int/2addr v0, v14

    move-object/from16 v14, p8

    invoke-virtual {v12, v14}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_8

    const/high16 v22, 0x20000000

    goto :goto_8

    :cond_8
    const/high16 v22, 0x10000000

    :goto_8
    or-int v22, v0, v22

    move-wide/from16 v13, p9

    invoke-virtual {v12, v13, v14}, La/fet;->f(J)Z

    move-result v23

    if-eqz v23, :cond_9

    const/16 v26, 0x4

    :goto_9
    move-wide/from16 v4, p11

    goto :goto_a

    :cond_9
    const/16 v26, 0x2

    goto :goto_9

    :goto_a
    invoke-virtual {v12, v4, v5}, La/fet;->f(J)Z

    move-result v27

    if-eqz v27, :cond_a

    const/16 v17, 0x20

    goto :goto_b

    :cond_a
    const/16 v17, 0x10

    :goto_b
    or-int v17, v26, v17

    move/from16 v15, p13

    invoke-virtual {v12, v15}, La/fet;->d(F)Z

    move-result v27

    if-eqz v27, :cond_b

    const/16 v21, 0x100

    goto :goto_c

    :cond_b
    const/16 v21, 0x80

    :goto_c
    or-int v17, v17, v21

    move-object/from16 v2, p14

    invoke-virtual {v12, v2}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_c

    const/16 v16, 0x800

    :cond_c
    or-int v16, v17, v16

    move-object/from16 v0, p15

    invoke-virtual {v12, v0}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_d

    const/16 v18, 0x4000

    :cond_d
    or-int v16, v16, v18

    move-object/from16 v6, p16

    invoke-virtual {v12, v6}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_e

    move/from16 v19, v20

    :cond_e
    or-int v16, v16, v19

    const v19, 0x12492493

    and-int v0, v22, v19

    const v2, 0x12492492

    const/4 v4, 0x1

    if-ne v0, v2, :cond_10

    const v0, 0x12493

    and-int v0, v16, v0

    const v2, 0x12492

    if-eq v0, v2, :cond_f

    goto :goto_d

    :cond_f
    const/4 v0, 0x0

    goto :goto_e

    :cond_10
    :goto_d
    move v0, v4

    :goto_e
    and-int/lit8 v2, v22, 0x1

    invoke-virtual {v12, v2, v0}, La/fet;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-virtual {v12}, La/fet;->Z()V

    and-int/lit8 v0, p18, 0x1

    if-eqz v0, :cond_12

    invoke-virtual {v12}, La/fet;->B()Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_f

    .line 2
    :cond_11
    invoke-virtual {v12}, La/fet;->X()V

    :cond_12
    :goto_f
    invoke-virtual {v12}, La/fet;->s()V

    const v0, 0x7f130c42

    .line 3
    invoke-static {v0, v12}, La/jtt0;->j(ILa/fet;)Ljava/lang/String;

    move-result-object v0

    .line 4
    sget-object v2, La/gqw0;->b:La/zx7;

    .line 5
    sget-object v5, La/jr8;->a:La/jr8;

    invoke-virtual {v5, v10, v2}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    move-result-object v2

    const/4 v5, 0x0

    .line 6
    invoke-static {v2, v5, v11, v4}, La/o7k0;->u(La/mm40;FFI)La/mm40;

    move-result-object v2

    const/high16 v5, 0x3f800000    # 1.0f

    .line 7
    invoke-static {v2, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    move-result-object v2

    const/high16 v20, 0x380000

    .line 8
    sget-object v5, La/jm40;->b:La/jm40;

    sget-object v4, La/ukd;->a:La/cl5;

    const/high16 v25, 0x180000

    if-eqz v8, :cond_18

    const v6, -0x5e4bf1b7

    .line 9
    invoke-virtual {v12, v6}, La/fet;->e0(I)V

    and-int v6, v22, v20

    xor-int v6, v6, v25

    const/high16 v7, 0x100000

    if-le v6, v7, :cond_13

    .line 10
    invoke-virtual {v12, v3}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    :cond_13
    and-int v6, v22, v25

    if-ne v6, v7, :cond_15

    :cond_14
    const/4 v6, 0x1

    goto :goto_10

    :cond_15
    const/4 v6, 0x0

    .line 11
    :goto_10
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_16

    if-ne v7, v4, :cond_17

    .line 12
    :cond_16
    sget-object v6, La/ma80;->a:La/ma80;

    .line 13
    sget-object v6, La/tpj0;->a:La/uts0;

    .line 14
    new-instance v7, La/spj0;

    invoke-direct {v7, v3, v9}, La/spj0;-><init>(La/xpj0;Lkotlin/jvm/functions/Function1;)V

    .line 15
    invoke-virtual {v12, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 16
    :cond_17
    check-cast v7, La/vj50;

    const/4 v6, 0x0

    .line 17
    invoke-static {v5, v7, v6}, La/cjx;->V(La/mm40;La/vj50;La/yj50;)La/mm40;

    move-result-object v5

    const/4 v6, 0x0

    .line 18
    invoke-virtual {v12, v6}, La/fet;->r(Z)V

    goto :goto_11

    :cond_18
    const/4 v6, 0x0

    const v7, -0x5e4bb908

    .line 19
    invoke-virtual {v12, v7}, La/fet;->e0(I)V

    .line 20
    invoke-virtual {v12, v6}, La/fet;->r(Z)V

    .line 21
    :goto_11
    invoke-interface {v2, v5}, La/mm40;->e(La/mm40;)La/mm40;

    move-result-object v2

    .line 22
    iget-object v5, v3, La/xpj0;->e:La/qv2;

    iget-object v6, v3, La/xpj0;->e:La/qv2;

    .line 23
    sget-object v30, La/ma80;->a:La/ma80;

    and-int v7, v22, v20

    xor-int v7, v7, v25

    const/high16 v8, 0x100000

    if-le v7, v8, :cond_19

    invoke-virtual {v12, v3}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v18

    if-nez v18, :cond_1a

    :cond_19
    and-int v10, v22, v25

    if-ne v10, v8, :cond_1b

    :cond_1a
    const/4 v8, 0x1

    goto :goto_12

    :cond_1b
    const/4 v8, 0x0

    .line 24
    :goto_12
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_1c

    if-ne v10, v4, :cond_1d

    .line 25
    :cond_1c
    new-instance v10, La/pi40;

    const/4 v8, 0x4

    invoke-direct {v10, v3, v8}, La/pi40;-><init>(Ljava/lang/Object;B)V

    .line 26
    invoke-virtual {v12, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 27
    :cond_1d
    check-cast v10, Lkotlin/jvm/functions/Function2;

    invoke-static {v2, v5, v10}, La/s5x0;->E(La/mm40;La/qv2;Lkotlin/jvm/functions/Function2;)La/mm40;

    move-result-object v28

    .line 28
    iget-object v2, v6, La/qv2;->g:Ljava/lang/Object;

    move-object/from16 v29, v2

    check-cast v29, La/pv2;

    if-eqz p7, :cond_1e

    .line 29
    invoke-virtual {v3}, La/xpj0;->e()Z

    move-result v2

    if-eqz v2, :cond_1e

    const/16 v31, 0x1

    goto :goto_13

    :cond_1e
    const/16 v31, 0x0

    .line 30
    :goto_13
    iget-object v2, v6, La/qv2;->i:Ljava/lang/Object;

    check-cast v2, La/pz40;

    .line 31
    check-cast v2, La/hgk0;

    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1f

    const/16 v32, 0x1

    goto :goto_14

    :cond_1f
    const/16 v32, 0x0

    :goto_14
    const v10, 0xe000

    and-int v2, v22, v10

    const/16 v5, 0x4000

    if-ne v2, v5, :cond_20

    const/4 v2, 0x1

    goto :goto_15

    :cond_20
    const/4 v2, 0x0

    .line 32
    :goto_15
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_21

    if-ne v5, v4, :cond_22

    .line 33
    :cond_21
    new-instance v5, La/itv0;

    const/4 v2, 0x2

    const/4 v8, 0x0

    invoke-direct {v5, v9, v8, v2}, La/itv0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 34
    invoke-virtual {v12, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 35
    :cond_22
    move-object/from16 v34, v5

    check-cast v34, La/xdr;

    const/16 v35, 0xa8

    const/16 v33, 0x0

    .line 36
    invoke-static/range {v28 .. v35}, La/uel;->a(La/mm40;La/wel;La/ma80;ZZLa/xdr;La/xdr;I)La/mm40;

    move-result-object v2

    .line 37
    invoke-virtual {v12, v0}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v5

    .line 38
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_23

    if-ne v8, v4, :cond_24

    .line 39
    :cond_23
    new-instance v8, La/ka6;

    const/16 v5, 0xa

    invoke-direct {v8, v0, v5}, La/ka6;-><init>(Ljava/lang/String;B)V

    .line 40
    invoke-virtual {v12, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 41
    :cond_24
    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x0

    .line 42
    invoke-static {v2, v0, v8}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    move-result-object v2

    .line 43
    iget-object v5, v6, La/qv2;->l:Ljava/lang/Object;

    check-cast v5, La/agk0;

    .line 44
    invoke-virtual {v5}, La/agk0;->l()F

    move-result v5

    float-to-int v6, v5

    if-gez v6, :cond_25

    move v6, v0

    .line 45
    :cond_25
    new-instance v5, La/niq;

    invoke-direct {v5, v6}, La/niq;-><init>(I)V

    .line 46
    invoke-static {v2, v5}, La/j120;->L(La/mm40;La/vhv0;)La/mm40;

    move-result-object v2

    const/high16 v8, 0x100000

    if-le v7, v8, :cond_26

    .line 47
    invoke-virtual {v12, v3}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_27

    :cond_26
    and-int v5, v22, v25

    if-ne v5, v8, :cond_28

    :cond_27
    const/4 v6, 0x1

    goto :goto_16

    :cond_28
    move v6, v0

    :goto_16
    and-int/lit8 v5, v22, 0x70

    const/16 v7, 0x20

    if-eq v5, v7, :cond_2a

    invoke-virtual {v12, v1}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_29

    goto :goto_17

    :cond_29
    move v5, v0

    goto :goto_18

    :cond_2a
    :goto_17
    const/4 v5, 0x1

    :goto_18
    or-int v0, v6, v5

    .line 48
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_2b

    if-ne v5, v4, :cond_2c

    .line 49
    :cond_2b
    new-instance v5, La/bw20;

    const/16 v0, 0x1a

    invoke-direct {v5, v3, v1, v0}, La/bw20;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 50
    invoke-virtual {v12, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 51
    :cond_2c
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v5}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    move-result-object v0

    .line 52
    new-instance v2, La/pp8;

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4}, La/pp8;-><init>(La/xpj0;B)V

    invoke-static {v0, v2}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    move-result-object v17

    .line 53
    new-instance v0, La/cm40;

    move-object/from16 v7, p1

    move-object/from16 v6, p2

    move/from16 v8, p7

    move-object/from16 v4, p14

    move-object/from16 v5, p16

    move-object v2, v1

    move-object/from16 v1, p15

    invoke-direct/range {v0 .. v8}, La/cm40;-><init>(Lkotlin/jvm/functions/Function2;La/t33;La/xpj0;Lkotlin/jvm/functions/Function2;La/ugd;Lkotlin/jvm/functions/Function0;La/vne;Z)V

    const v1, 0x2b6fbd6b

    invoke-static {v1, v0, v12}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    move-result-object v21

    shr-int/lit8 v0, v22, 0x18

    and-int/lit8 v0, v0, 0x70

    const/high16 v1, 0xc00000

    or-int/2addr v0, v1

    shl-int/lit8 v1, v16, 0x6

    and-int/lit16 v2, v1, 0x380

    or-int/2addr v0, v2

    and-int/lit16 v2, v1, 0x1c00

    or-int/2addr v0, v2

    and-int/2addr v1, v10

    or-int v23, v0, v1

    const/16 v24, 0x60

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v22, v12

    move/from16 v18, v15

    move-object/from16 v12, v17

    move-wide/from16 v16, p11

    move-wide v14, v13

    move-object/from16 v13, p8

    .line 54
    invoke-static/range {v12 .. v24}, La/gmn0;->a(La/mm40;La/yjj0;JJFFLa/dn8;La/ugd;La/fet;II)V

    goto :goto_19

    .line 55
    :cond_2d
    invoke-virtual/range {p17 .. p17}, La/fet;->X()V

    .line 56
    :goto_19
    invoke-virtual/range {p17 .. p17}, La/fet;->u()La/yfe0;

    move-result-object v0

    if-eqz v0, :cond_2e

    move-object v1, v0

    new-instance v0, La/xl40;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v8, p7

    move-wide/from16 v12, p11

    move/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p18

    move-object/from16 v36, v1

    move-object v4, v9

    move v7, v11

    move-object/from16 v1, p0

    move-object/from16 v9, p8

    move-wide/from16 v10, p9

    invoke-direct/range {v0 .. v18}, La/xl40;-><init>(La/t33;La/vne;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/mm40;La/xpj0;FZLa/yjj0;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/ugd;I)V

    move-object/from16 v1, v36

    .line 57
    iput-object v0, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    :cond_2e
    return-void
.end method

.method public static final c(JLkotlin/jvm/functions/Function0;ZLa/fet;I)V
    .locals 17

    .line 1
    move-wide/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v9, p4

    .line 8
    .line 9
    const v0, -0x17578dd7

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9, v0}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v9, v1, v2}, La/fet;->f(J)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v13, 0x4

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move v0, v13

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x2

    .line 25
    :goto_0
    or-int v0, p5, v0

    .line 26
    .line 27
    invoke-virtual {v9, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const/16 v14, 0x20

    .line 32
    .line 33
    if-eqz v5, :cond_1

    .line 34
    .line 35
    move v5, v14

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/16 v5, 0x10

    .line 38
    .line 39
    :goto_1
    or-int/2addr v0, v5

    .line 40
    invoke-virtual {v9, v4}, La/fet;->h(Z)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    const/16 v5, 0x100

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v5, 0x80

    .line 50
    .line 51
    :goto_2
    or-int/2addr v0, v5

    .line 52
    const/4 v15, 0x1

    .line 53
    invoke-virtual {v9, v15}, La/fet;->h(Z)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_3

    .line 58
    .line 59
    const/16 v5, 0x800

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    const/16 v5, 0x400

    .line 63
    .line 64
    :goto_3
    or-int/2addr v0, v5

    .line 65
    and-int/lit16 v5, v0, 0x493

    .line 66
    .line 67
    const/16 v6, 0x492

    .line 68
    .line 69
    const/4 v7, 0x0

    .line 70
    if-eq v5, v6, :cond_4

    .line 71
    .line 72
    move v5, v15

    .line 73
    goto :goto_4

    .line 74
    :cond_4
    move v5, v7

    .line 75
    :goto_4
    and-int/lit8 v6, v0, 0x1

    .line 76
    .line 77
    invoke-virtual {v9, v6, v5}, La/fet;->U(IZ)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_10

    .line 82
    .line 83
    const-wide/16 v5, 0x10

    .line 84
    .line 85
    cmp-long v5, v1, v5

    .line 86
    .line 87
    if-eqz v5, :cond_f

    .line 88
    .line 89
    const v5, -0x55bf0636

    .line 90
    .line 91
    .line 92
    invoke-virtual {v9, v5}, La/fet;->e0(I)V

    .line 93
    .line 94
    .line 95
    if-eqz v4, :cond_5

    .line 96
    .line 97
    const/high16 v5, 0x3f800000    # 1.0f

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_5
    const/4 v5, 0x0

    .line 101
    :goto_5
    sget-object v6, La/yt40;->c:La/yt40;

    .line 102
    .line 103
    invoke-static {v6, v9}, La/d7x;->P(La/yt40;La/fet;)La/nul0;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    const/4 v10, 0x0

    .line 108
    const/16 v11, 0x1c

    .line 109
    .line 110
    move v8, v7

    .line 111
    const/4 v7, 0x0

    .line 112
    move/from16 v16, v8

    .line 113
    .line 114
    const/4 v8, 0x0

    .line 115
    move/from16 v12, v16

    .line 116
    .line 117
    invoke-static/range {v5 .. v11}, La/d43;->b(FLa/j73;Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;II)La/l7m0;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    const v6, 0x7f13047b

    .line 122
    .line 123
    .line 124
    invoke-static {v6, v9}, La/jtt0;->j(ILa/fet;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    const v7, -0x55ba773b

    .line 129
    .line 130
    .line 131
    invoke-virtual {v9, v7}, La/fet;->e0(I)V

    .line 132
    .line 133
    .line 134
    and-int/lit8 v7, v0, 0x70

    .line 135
    .line 136
    if-ne v7, v14, :cond_6

    .line 137
    .line 138
    move v8, v15

    .line 139
    goto :goto_6

    .line 140
    :cond_6
    move v8, v12

    .line 141
    :goto_6
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    sget-object v11, La/ukd;->a:La/cl5;

    .line 146
    .line 147
    if-nez v8, :cond_7

    .line 148
    .line 149
    if-ne v10, v11, :cond_8

    .line 150
    .line 151
    :cond_7
    new-instance v10, La/zy2;

    .line 152
    .line 153
    invoke-direct {v10, v3, v13}, La/zy2;-><init>(Ljava/lang/Object;B)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v9, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_8
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 160
    .line 161
    sget-object v8, La/jm40;->b:La/jm40;

    .line 162
    .line 163
    invoke-static {v8, v3, v10}, La/fnn0;->a(La/mm40;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)La/mm40;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    invoke-virtual {v9, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    if-ne v7, v14, :cond_9

    .line 172
    .line 173
    move v7, v15

    .line 174
    goto :goto_7

    .line 175
    :cond_9
    move v7, v12

    .line 176
    :goto_7
    or-int/2addr v7, v10

    .line 177
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v10

    .line 181
    if-nez v7, :cond_a

    .line 182
    .line 183
    if-ne v10, v11, :cond_b

    .line 184
    .line 185
    :cond_a
    new-instance v10, La/xfk;

    .line 186
    .line 187
    invoke-direct {v10, v6, v3, v15}, La/xfk;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;B)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v9, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_b
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 194
    .line 195
    invoke-static {v8, v15, v10}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    invoke-virtual {v9, v12}, La/fet;->r(Z)V

    .line 200
    .line 201
    .line 202
    sget-object v7, La/o7k0;->c:La/n0q;

    .line 203
    .line 204
    invoke-interface {v7, v6}, La/mm40;->e(La/mm40;)La/mm40;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    and-int/lit8 v0, v0, 0xe

    .line 209
    .line 210
    if-ne v0, v13, :cond_c

    .line 211
    .line 212
    goto :goto_8

    .line 213
    :cond_c
    move v15, v12

    .line 214
    :goto_8
    invoke-virtual {v9, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    or-int/2addr v0, v15

    .line 219
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    if-nez v0, :cond_d

    .line 224
    .line 225
    if-ne v7, v11, :cond_e

    .line 226
    .line 227
    :cond_d
    new-instance v7, La/m5n;

    .line 228
    .line 229
    const/4 v0, 0x2

    .line 230
    invoke-direct {v7, v1, v2, v5, v0}, La/m5n;-><init>(JLa/l7m0;B)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v9, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    :cond_e
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 237
    .line 238
    invoke-static {v6, v7, v9, v12}, La/p8a;->k(La/mm40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v9, v12}, La/fet;->r(Z)V

    .line 242
    .line 243
    .line 244
    goto :goto_9

    .line 245
    :cond_f
    move v12, v7

    .line 246
    const v0, -0x55b13247

    .line 247
    .line 248
    .line 249
    invoke-virtual {v9, v0}, La/fet;->e0(I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v9, v12}, La/fet;->r(Z)V

    .line 253
    .line 254
    .line 255
    goto :goto_9

    .line 256
    :cond_10
    invoke-virtual {v9}, La/fet;->X()V

    .line 257
    .line 258
    .line 259
    :goto_9
    invoke-virtual {v9}, La/fet;->u()La/yfe0;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    if-eqz v6, :cond_11

    .line 264
    .line 265
    new-instance v0, La/d5m;

    .line 266
    .line 267
    move/from16 v5, p5

    .line 268
    .line 269
    invoke-direct/range {v0 .. v5}, La/d5m;-><init>(JLkotlin/jvm/functions/Function0;ZI)V

    .line 270
    .line 271
    .line 272
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 273
    .line 274
    :cond_11
    return-void
.end method

.method public static final d(La/uag0;F)F
    .locals 4

    .line 1
    iget-wide v0, p0, La/uag0;->r:J

    .line 2
    .line 3
    const/16 v2, 0x20

    .line 4
    .line 5
    shr-long/2addr v0, v2

    .line 6
    long-to-int v0, v0

    .line 7
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/high16 v2, 0x3f800000    # 1.0f

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    cmpg-float v3, v0, v1

    .line 21
    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p0, p0, La/uag0;->t:La/w6k;

    .line 26
    .line 27
    invoke-interface {p0}, La/w6k;->getDensity()F

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    const/high16 v3, 0x42400000    # 48.0f

    .line 32
    .line 33
    mul-float/2addr p0, v3

    .line 34
    invoke-static {p0, v0}, Ljava/lang/Math;->min(FF)F

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-static {v1, p0, p1}, La/l7x;->O(FFF)F

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    div-float/2addr p0, v0

    .line 43
    sub-float/2addr v2, p0

    .line 44
    :cond_1
    :goto_0
    return v2
.end method

.method public static final e(La/uag0;F)F
    .locals 4

    .line 1
    iget-wide v0, p0, La/uag0;->r:J

    .line 2
    .line 3
    const-wide v2, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    and-long/2addr v0, v2

    .line 9
    long-to-int v0, v0

    .line 10
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/high16 v2, 0x3f800000    # 1.0f

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    cmpg-float v3, v0, v1

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p0, p0, La/uag0;->t:La/w6k;

    .line 29
    .line 30
    invoke-interface {p0}, La/w6k;->getDensity()F

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    const/high16 v3, 0x41c00000    # 24.0f

    .line 35
    .line 36
    mul-float/2addr p0, v3

    .line 37
    invoke-static {p0, v0}, Ljava/lang/Math;->min(FF)F

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-static {v1, p0, p1}, La/l7x;->O(FFF)F

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    div-float/2addr p0, v0

    .line 46
    sub-float/2addr v2, p0

    .line 47
    :cond_1
    :goto_0
    return v2
.end method

.method public static final f(La/fet;)La/xpj0;
    .locals 7

    .line 1
    invoke-virtual {p0}, La/fet;->P()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    new-instance v0, La/cp8;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, La/cp8;-><init>(B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    move-object v1, v0

    .line 19
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 20
    .line 21
    sget-object v2, La/ypj0;->a:La/ypj0;

    .line 22
    .line 23
    const/16 v5, 0x180

    .line 24
    .line 25
    const/16 v6, 0x38

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    move-object v4, p0

    .line 29
    invoke-static/range {v1 .. v6}, La/tpj0;->b(Lkotlin/jvm/functions/Function1;La/ypj0;ZLa/fet;II)La/xpj0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method
