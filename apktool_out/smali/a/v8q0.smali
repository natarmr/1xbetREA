.class public abstract La/v8q0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/ozp0;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/ozp0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/zfn;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, La/v8q0;->a:La/zfn;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V
    .locals 46

    move-object/from16 v0, p21

    move/from16 v1, p22

    move/from16 v2, p23

    move/from16 v3, p24

    const v4, 0x6bda414b

    .line 1
    invoke-virtual {v0, v4}, La/fet;->g0(I)La/fet;

    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_1
    move-object/from16 v4, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v3, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    :cond_2
    move-object/from16 v11, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v11, v1, 0x30

    if-nez v11, :cond_2

    move-object/from16 v11, p1

    invoke-virtual {v0, v11}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v12, 0x20

    goto :goto_2

    :cond_4
    const/16 v12, 0x10

    :goto_2
    or-int/2addr v7, v12

    :goto_3
    and-int/lit8 v12, v3, 0x4

    if-eqz v12, :cond_5

    or-int/lit16 v7, v7, 0x180

    move-wide/from16 v5, p2

    goto :goto_5

    :cond_5
    and-int/lit16 v15, v1, 0x180

    move-wide/from16 v5, p2

    if-nez v15, :cond_7

    invoke-virtual {v0, v5, v6}, La/fet;->f(J)Z

    move-result v17

    if-eqz v17, :cond_6

    const/16 v17, 0x100

    goto :goto_4

    :cond_6
    const/16 v17, 0x80

    :goto_4
    or-int v7, v7, v17

    :cond_7
    :goto_5
    and-int/lit8 v17, v3, 0x8

    const/16 v18, 0x400

    const/16 v19, 0x800

    if-eqz v17, :cond_9

    or-int/lit16 v7, v7, 0xc00

    :cond_8
    move-object/from16 v9, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v1, 0xc00

    if-nez v9, :cond_8

    move-object/from16 v9, p4

    invoke-virtual {v0, v9}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_a

    move/from16 v21, v19

    goto :goto_6

    :cond_a
    move/from16 v21, v18

    :goto_6
    or-int v7, v7, v21

    :goto_7
    and-int/lit8 v21, v3, 0x10

    const/16 v22, 0x2000

    const/16 v23, 0x4000

    if-eqz v21, :cond_b

    or-int/lit16 v7, v7, 0x6000

    move-wide/from16 v13, p5

    goto :goto_9

    :cond_b
    and-int/lit16 v10, v1, 0x6000

    move-wide/from16 v13, p5

    if-nez v10, :cond_d

    invoke-virtual {v0, v13, v14}, La/fet;->f(J)Z

    move-result v26

    if-eqz v26, :cond_c

    move/from16 v26, v23

    goto :goto_8

    :cond_c
    move/from16 v26, v22

    :goto_8
    or-int v7, v7, v26

    :cond_d
    :goto_9
    and-int/lit8 v26, v3, 0x20

    const/high16 v27, 0x10000

    const/high16 v28, 0x30000

    const/high16 v29, 0x20000

    if-eqz v26, :cond_e

    or-int v7, v7, v28

    move-object/from16 v10, p7

    goto :goto_b

    :cond_e
    and-int v30, v1, v28

    move-object/from16 v10, p7

    if-nez v30, :cond_10

    invoke-virtual {v0, v10}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_f

    move/from16 v31, v29

    goto :goto_a

    :cond_f
    move/from16 v31, v27

    :goto_a
    or-int v7, v7, v31

    :cond_10
    :goto_b
    and-int/lit8 v31, v3, 0x40

    const/high16 v32, 0x80000

    const/high16 v33, 0x100000

    const/high16 v34, 0x180000

    if-eqz v31, :cond_11

    or-int v7, v7, v34

    move-object/from16 v15, p8

    goto :goto_d

    :cond_11
    and-int v35, v1, v34

    move-object/from16 v15, p8

    if-nez v35, :cond_13

    invoke-virtual {v0, v15}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v36

    if-eqz v36, :cond_12

    move/from16 v36, v33

    goto :goto_c

    :cond_12
    move/from16 v36, v32

    :goto_c
    or-int v7, v7, v36

    :cond_13
    :goto_d
    and-int/lit16 v1, v3, 0x80

    const/high16 v36, 0x400000

    const/high16 v37, 0x800000

    const/high16 v38, 0xc00000

    if-eqz v1, :cond_15

    or-int v7, v7, v38

    :cond_14
    move/from16 v39, v1

    move-object/from16 v1, p9

    goto :goto_f

    :cond_15
    and-int v39, p22, v38

    if-nez v39, :cond_14

    move/from16 v39, v1

    move-object/from16 v1, p9

    invoke-virtual {v0, v1}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v40

    if-eqz v40, :cond_16

    move/from16 v40, v37

    goto :goto_e

    :cond_16
    move/from16 v40, v36

    :goto_e
    or-int v7, v7, v40

    :goto_f
    and-int/lit16 v1, v3, 0x100

    const/high16 v40, 0x6000000

    if-eqz v1, :cond_17

    or-int v7, v7, v40

    move-wide/from16 v4, p10

    goto :goto_11

    :cond_17
    and-int v40, p22, v40

    move-wide/from16 v4, p10

    if-nez v40, :cond_19

    invoke-virtual {v0, v4, v5}, La/fet;->f(J)Z

    move-result v6

    if-eqz v6, :cond_18

    const/high16 v6, 0x4000000

    goto :goto_10

    :cond_18
    const/high16 v6, 0x2000000

    :goto_10
    or-int/2addr v7, v6

    :cond_19
    :goto_11
    and-int/lit16 v6, v3, 0x200

    const/high16 v40, 0x30000000

    move/from16 v41, v1

    const/4 v1, 0x0

    if-eqz v6, :cond_1a

    or-int v7, v7, v40

    goto :goto_13

    :cond_1a
    and-int v6, p22, v40

    if-nez v6, :cond_1c

    invoke-virtual {v0, v1}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1b

    const/high16 v6, 0x20000000

    goto :goto_12

    :cond_1b
    const/high16 v6, 0x10000000

    :goto_12
    or-int/2addr v7, v6

    :cond_1c
    :goto_13
    and-int/lit16 v6, v3, 0x400

    if-eqz v6, :cond_1d

    or-int/lit8 v16, v2, 0x6

    move-object/from16 v1, p12

    goto :goto_15

    :cond_1d
    and-int/lit8 v40, v2, 0x6

    move-object/from16 v1, p12

    if-nez v40, :cond_1f

    invoke-virtual {v0, v1}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v42

    if-eqz v42, :cond_1e

    const/16 v16, 0x4

    goto :goto_14

    :cond_1e
    const/16 v16, 0x2

    :goto_14
    or-int v16, v2, v16

    goto :goto_15

    :cond_1f
    move/from16 v16, v2

    :goto_15
    and-int/lit16 v1, v3, 0x800

    if-eqz v1, :cond_21

    or-int/lit8 v16, v16, 0x30

    move-wide/from16 v4, p13

    :cond_20
    :goto_16
    move/from16 v20, v1

    move/from16 v1, v16

    goto :goto_18

    :cond_21
    and-int/lit8 v35, v2, 0x30

    move-wide/from16 v4, p13

    if-nez v35, :cond_20

    invoke-virtual {v0, v4, v5}, La/fet;->f(J)Z

    move-result v35

    if-eqz v35, :cond_22

    const/16 v24, 0x20

    goto :goto_17

    :cond_22
    const/16 v24, 0x10

    :goto_17
    or-int v16, v16, v24

    goto :goto_16

    :goto_18
    and-int/lit16 v4, v3, 0x1000

    if-eqz v4, :cond_24

    or-int/lit16 v1, v1, 0x180

    :cond_23
    move/from16 v5, p15

    goto :goto_1a

    :cond_24
    and-int/lit16 v5, v2, 0x180

    if-nez v5, :cond_23

    move/from16 v5, p15

    invoke-virtual {v0, v5}, La/fet;->e(I)Z

    move-result v16

    if-eqz v16, :cond_25

    const/16 v25, 0x100

    goto :goto_19

    :cond_25
    const/16 v25, 0x80

    :goto_19
    or-int v1, v1, v25

    :goto_1a
    move/from16 v16, v4

    and-int/lit16 v4, v3, 0x2000

    if-eqz v4, :cond_26

    or-int/lit16 v1, v1, 0xc00

    goto :goto_1b

    :cond_26
    move/from16 v24, v1

    and-int/lit16 v1, v2, 0xc00

    if-nez v1, :cond_28

    move/from16 v1, p16

    invoke-virtual {v0, v1}, La/fet;->h(Z)Z

    move-result v25

    if-eqz v25, :cond_27

    move/from16 v18, v19

    :cond_27
    or-int v18, v24, v18

    move/from16 v1, v18

    goto :goto_1b

    :cond_28
    move/from16 v1, p16

    move/from16 v1, v24

    :goto_1b
    move/from16 v18, v4

    and-int/lit16 v4, v3, 0x4000

    if-eqz v4, :cond_2a

    or-int/lit16 v1, v1, 0x6000

    move/from16 v19, v1

    :cond_29
    move/from16 v1, p17

    goto :goto_1c

    :cond_2a
    move/from16 v19, v1

    and-int/lit16 v1, v2, 0x6000

    if-nez v1, :cond_29

    move/from16 v1, p17

    invoke-virtual {v0, v1}, La/fet;->e(I)Z

    move-result v24

    if-eqz v24, :cond_2b

    move/from16 v22, v23

    :cond_2b
    or-int v19, v19, v22

    :goto_1c
    const v22, 0x8000

    and-int v22, v3, v22

    if-eqz v22, :cond_2c

    or-int v19, v19, v28

    move/from16 v1, p18

    goto :goto_1e

    :cond_2c
    and-int v23, v2, v28

    move/from16 v1, p18

    if-nez v23, :cond_2e

    invoke-virtual {v0, v1}, La/fet;->e(I)Z

    move-result v23

    if-eqz v23, :cond_2d

    move/from16 v23, v29

    goto :goto_1d

    :cond_2d
    move/from16 v23, v27

    :goto_1d
    or-int v19, v19, v23

    :cond_2e
    :goto_1e
    and-int v23, v3, v27

    if-eqz v23, :cond_2f

    or-int v19, v19, v34

    move-object/from16 v1, p19

    goto :goto_1f

    :cond_2f
    and-int v24, v2, v34

    move-object/from16 v1, p19

    if-nez v24, :cond_31

    invoke-virtual {v0, v1}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_30

    move/from16 v32, v33

    :cond_30
    or-int v19, v19, v32

    :cond_31
    :goto_1f
    and-int v24, v2, v38

    if-nez v24, :cond_33

    and-int v24, v3, v29

    move-object/from16 v1, p20

    if-nez v24, :cond_32

    invoke-virtual {v0, v1}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_32

    move/from16 v36, v37

    :cond_32
    or-int v19, v19, v36

    goto :goto_20

    :cond_33
    move-object/from16 v1, p20

    :goto_20
    const v24, 0x12492493

    and-int v1, v7, v24

    const v2, 0x12492492

    const/4 v3, 0x0

    const/16 v24, 0x1

    if-ne v1, v2, :cond_35

    const v1, 0x492493

    and-int v1, v19, v1

    const v2, 0x492492

    if-eq v1, v2, :cond_34

    goto :goto_21

    :cond_34
    move v1, v3

    goto :goto_22

    :cond_35
    :goto_21
    move/from16 v1, v24

    :goto_22
    and-int/lit8 v2, v7, 0x1

    invoke-virtual {v0, v2, v1}, La/fet;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_4c

    invoke-virtual {v0}, La/fet;->Z()V

    and-int/lit8 v1, p22, 0x1

    const v2, -0x1c00001

    if-eqz v1, :cond_39

    invoke-virtual {v0}, La/fet;->B()Z

    move-result v1

    if-eqz v1, :cond_36

    goto :goto_23

    .line 2
    :cond_36
    invoke-virtual {v0}, La/fet;->X()V

    and-int v1, p24, v29

    if-eqz v1, :cond_37

    and-int v19, v19, v2

    :cond_37
    move-wide/from16 v27, p2

    move-object/from16 v1, p9

    move-wide/from16 v25, p10

    move-object/from16 v6, p12

    move-wide/from16 v20, p13

    move/from16 v8, p16

    move/from16 v4, p17

    move/from16 v24, p18

    move-object/from16 v40, p19

    move-wide v12, v13

    :cond_38
    move-object/from16 v14, p20

    goto/16 :goto_2e

    :cond_39
    :goto_23
    if-eqz v8, :cond_3a

    .line 3
    sget-object v1, La/jm40;->b:La/jm40;

    move-object v11, v1

    :cond_3a
    if-eqz v12, :cond_3b

    .line 4
    sget-wide v27, La/y3d;->g:J

    goto :goto_24

    :cond_3b
    move-wide/from16 v27, p2

    :goto_24
    if-eqz v17, :cond_3c

    const/4 v9, 0x0

    :cond_3c
    if-eqz v21, :cond_3d

    .line 5
    sget-wide v12, La/daq0;->c:J

    goto :goto_25

    :cond_3d
    move-wide v12, v13

    :goto_25
    if-eqz v26, :cond_3e

    const/4 v10, 0x0

    :cond_3e
    if-eqz v31, :cond_3f

    const/4 v15, 0x0

    :cond_3f
    if-eqz v39, :cond_40

    const/4 v1, 0x0

    goto :goto_26

    :cond_40
    move-object/from16 v1, p9

    :goto_26
    if-eqz v41, :cond_41

    .line 6
    sget-wide v25, La/daq0;->c:J

    goto :goto_27

    :cond_41
    move-wide/from16 v25, p10

    :goto_27
    if-eqz v6, :cond_42

    const/4 v6, 0x0

    goto :goto_28

    :cond_42
    move-object/from16 v6, p12

    :goto_28
    if-eqz v20, :cond_43

    .line 7
    sget-wide v20, La/daq0;->c:J

    goto :goto_29

    :cond_43
    move-wide/from16 v20, p13

    :goto_29
    if-eqz v16, :cond_44

    move/from16 v5, v24

    :cond_44
    if-eqz v18, :cond_45

    move/from16 v8, v24

    goto :goto_2a

    :cond_45
    move/from16 v8, p16

    :goto_2a
    if-eqz v4, :cond_46

    const v4, 0x7fffffff

    goto :goto_2b

    :cond_46
    move/from16 v4, p17

    :goto_2b
    if-eqz v22, :cond_47

    goto :goto_2c

    :cond_47
    move/from16 v24, p18

    :goto_2c
    if-eqz v23, :cond_48

    const/16 v40, 0x0

    goto :goto_2d

    :cond_48
    move-object/from16 v40, p19

    :goto_2d
    and-int v14, p24, v29

    if-eqz v14, :cond_38

    .line 8
    sget-object v14, La/v8q0;->a:La/zfn;

    .line 9
    invoke-virtual {v0, v14}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, La/y9q0;

    and-int v19, v19, v2

    .line 10
    :goto_2e
    invoke-virtual {v0}, La/fet;->s()V

    const v2, -0x21b08752

    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    const-wide/16 v16, 0x10

    cmp-long v2, v27, v16

    if-eqz v2, :cond_49

    move-object/from16 p8, v1

    move-wide/from16 v22, v27

    goto :goto_30

    :cond_49
    const v2, -0x21b0844d

    .line 11
    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    .line 12
    invoke-virtual {v14}, La/y9q0;->b()J

    move-result-wide v22

    cmp-long v2, v22, v16

    if-eqz v2, :cond_4a

    move-object/from16 p8, v1

    goto :goto_2f

    .line 13
    :cond_4a
    sget-object v2, La/yde;->a:La/zfn;

    .line 14
    invoke-virtual {v0, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    move-result-object v2

    .line 15
    check-cast v2, La/y3d;

    move-object/from16 p8, v1

    .line 16
    iget-wide v1, v2, La/y3d;->a:J

    move-wide/from16 v22, v1

    .line 17
    :goto_2f
    invoke-virtual {v0, v3}, La/fet;->r(Z)V

    :goto_30
    invoke-virtual {v0, v3}, La/fet;->r(Z)V

    if-eqz v6, :cond_4b

    .line 18
    iget v3, v6, La/f2q0;->a:I

    :cond_4b
    const v1, 0xfd6f50

    move/from16 p14, v1

    move/from16 p11, v3

    move-object/from16 p7, v10

    move-wide/from16 p4, v12

    move-object/from16 p1, v14

    move-object/from16 p6, v15

    move-wide/from16 p12, v20

    move-wide/from16 p2, v22

    move-wide/from16 p9, v25

    .line 19
    invoke-static/range {p1 .. p14}, La/y9q0;->e(La/y9q0;JJLa/psq;La/lsq;La/nrq;JIJI)La/y9q0;

    move-result-object v1

    move-object/from16 v2, p8

    and-int/lit8 v3, v7, 0x7e

    shr-int/lit8 v0, v19, 0x9

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr v0, v3

    shl-int/lit8 v3, v19, 0x6

    const v16, 0xe000

    and-int v16, v3, v16

    or-int v0, v0, v16

    const/high16 v16, 0x70000

    and-int v16, v3, v16

    or-int v0, v0, v16

    const/high16 v16, 0x380000

    and-int v16, v3, v16

    or-int v0, v0, v16

    const/high16 v16, 0x1c00000

    and-int v3, v3, v16

    or-int/2addr v0, v3

    shl-int/lit8 v3, v7, 0x12

    const/high16 v7, 0x70000000

    and-int/2addr v3, v7

    or-int/2addr v0, v3

    const/16 v3, 0x100

    const/4 v7, 0x0

    move-object/from16 p1, p0

    move-object/from16 p11, p21

    move/from16 p12, v0

    move-object/from16 p3, v1

    move/from16 p13, v3

    move/from16 p7, v4

    move/from16 p5, v5

    move-object/from16 p9, v7

    move/from16 p6, v8

    move-object/from16 p10, v9

    move-object/from16 p2, v11

    move/from16 p8, v24

    move-object/from16 p4, v40

    .line 20
    invoke-static/range {p1 .. p13}, La/aad;->e(Ljava/lang/String;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILa/n4d;La/n05;La/fet;II)V

    move-wide/from16 v16, v12

    move-object v13, v6

    move-wide/from16 v6, v16

    move/from16 v18, v4

    move/from16 v16, v5

    move/from16 v17, v8

    move-object v5, v9

    move-object v8, v10

    move-object v9, v15

    move/from16 v19, v24

    move-wide/from16 v3, v27

    move-object v10, v2

    move-object v2, v11

    move-wide/from16 v11, v25

    move-wide/from16 v44, v20

    move-object/from16 v21, v14

    move-wide/from16 v14, v44

    move-object/from16 v20, v40

    goto :goto_31

    .line 21
    :cond_4c
    invoke-virtual/range {p21 .. p21}, La/fet;->X()V

    move-wide/from16 v3, p2

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move/from16 v16, v5

    move-object v5, v9

    move-object v8, v10

    move-object v2, v11

    move-wide v6, v13

    move-object v9, v15

    move-object/from16 v10, p9

    move-wide/from16 v11, p10

    move-object/from16 v13, p12

    move-wide/from16 v14, p13

    .line 22
    :goto_31
    invoke-virtual/range {p21 .. p21}, La/fet;->u()La/yfe0;

    move-result-object v0

    if-eqz v0, :cond_4d

    move-object v1, v0

    new-instance v0, La/u8q0;

    move/from16 v22, p22

    move/from16 v23, p23

    move/from16 v24, p24

    move-object/from16 v43, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v24}, La/u8q0;-><init>(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;III)V

    move-object/from16 v1, v43

    .line 23
    iput-object v0, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    :cond_4d
    return-void
.end method

.method public static final b(La/j83;La/mm40;JLa/n05;JLa/nrq;JLa/f2q0;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V
    .locals 58

    move-object/from16 v1, p0

    move-object/from16 v0, p20

    move/from16 v2, p21

    move/from16 v3, p22

    move/from16 v4, p23

    const v5, 0x116b5779

    .line 1
    invoke-virtual {v0, v5}, La/fet;->g0(I)La/fet;

    and-int/lit8 v5, v2, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v0, v1}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v2

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    and-int/lit8 v8, v4, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v5, v5, 0x30

    :cond_2
    move-object/from16 v11, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v11, v2, 0x30

    if-nez v11, :cond_2

    move-object/from16 v11, p1

    invoke-virtual {v0, v11}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v12, 0x20

    goto :goto_2

    :cond_4
    const/16 v12, 0x10

    :goto_2
    or-int/2addr v5, v12

    :goto_3
    and-int/lit8 v12, v4, 0x4

    if-eqz v12, :cond_5

    or-int/lit16 v5, v5, 0x180

    move-wide/from16 v10, p2

    goto :goto_5

    :cond_5
    and-int/lit16 v15, v2, 0x180

    move-wide/from16 v10, p2

    if-nez v15, :cond_7

    invoke-virtual {v0, v10, v11}, La/fet;->f(J)Z

    move-result v16

    if-eqz v16, :cond_6

    const/16 v16, 0x100

    goto :goto_4

    :cond_6
    const/16 v16, 0x80

    :goto_4
    or-int v5, v5, v16

    :cond_7
    :goto_5
    and-int/lit8 v16, v4, 0x8

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-eqz v16, :cond_9

    or-int/lit16 v5, v5, 0xc00

    :cond_8
    move-object/from16 v6, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v6, v2, 0xc00

    if-nez v6, :cond_8

    move-object/from16 v6, p4

    invoke-virtual {v0, v6}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_a

    move/from16 v20, v18

    goto :goto_6

    :cond_a
    move/from16 v20, v17

    :goto_6
    or-int v5, v5, v20

    :goto_7
    const v20, 0x1b6000

    or-int v20, v5, v20

    and-int/lit16 v13, v4, 0x80

    const/high16 v22, 0x400000

    const/high16 v23, 0x800000

    const/high16 v24, 0xc00000

    if-eqz v13, :cond_c

    const v20, 0xdb6000

    or-int v20, v5, v20

    :cond_b
    move-object/from16 v5, p7

    goto :goto_9

    :cond_c
    and-int v5, v2, v24

    if-nez v5, :cond_b

    move-object/from16 v5, p7

    invoke-virtual {v0, v5}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_d

    move/from16 v25, v23

    goto :goto_8

    :cond_d
    move/from16 v25, v22

    :goto_8
    or-int v20, v20, v25

    :goto_9
    and-int/lit16 v14, v4, 0x100

    const/high16 v26, 0x2000000

    const/high16 v27, 0x4000000

    const/high16 v28, 0x6000000

    if-eqz v14, :cond_e

    or-int v20, v20, v28

    move-wide/from16 v9, p8

    goto :goto_b

    :cond_e
    and-int v29, v2, v28

    move-wide/from16 v9, p8

    if-nez v29, :cond_10

    invoke-virtual {v0, v9, v10}, La/fet;->f(J)Z

    move-result v11

    if-eqz v11, :cond_f

    move/from16 v11, v27

    goto :goto_a

    :cond_f
    move/from16 v11, v26

    :goto_a
    or-int v20, v20, v11

    :cond_10
    :goto_b
    const/high16 v11, 0x30000000

    or-int v11, v20, v11

    and-int/lit16 v15, v4, 0x400

    if-eqz v15, :cond_11

    or-int/lit8 v19, v3, 0x6

    move-object/from16 v7, p10

    goto :goto_d

    :cond_11
    and-int/lit8 v30, v3, 0x6

    move-object/from16 v7, p10

    if-nez v30, :cond_13

    invoke-virtual {v0, v7}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_12

    const/16 v19, 0x4

    goto :goto_c

    :cond_12
    const/16 v19, 0x2

    :goto_c
    or-int v19, v3, v19

    goto :goto_d

    :cond_13
    move/from16 v19, v3

    :goto_d
    and-int/lit16 v2, v4, 0x800

    if-eqz v2, :cond_15

    or-int/lit8 v19, v19, 0x30

    move-wide/from16 v5, p11

    :cond_14
    :goto_e
    move/from16 v20, v2

    move/from16 v2, v19

    goto :goto_10

    :cond_15
    and-int/lit8 v31, v3, 0x30

    move-wide/from16 v5, p11

    if-nez v31, :cond_14

    invoke-virtual {v0, v5, v6}, La/fet;->f(J)Z

    move-result v31

    if-eqz v31, :cond_16

    const/16 v20, 0x20

    goto :goto_f

    :cond_16
    const/16 v20, 0x10

    :goto_f
    or-int v19, v19, v20

    goto :goto_e

    :goto_10
    and-int/lit16 v5, v4, 0x1000

    if-eqz v5, :cond_18

    or-int/lit16 v2, v2, 0x180

    :cond_17
    move/from16 v6, p13

    goto :goto_12

    :cond_18
    and-int/lit16 v6, v3, 0x180

    if-nez v6, :cond_17

    move/from16 v6, p13

    invoke-virtual {v0, v6}, La/fet;->e(I)Z

    move-result v19

    if-eqz v19, :cond_19

    const/16 v25, 0x100

    goto :goto_11

    :cond_19
    const/16 v25, 0x80

    :goto_11
    or-int v2, v2, v25

    :goto_12
    move/from16 v19, v5

    and-int/lit16 v5, v4, 0x2000

    if-eqz v5, :cond_1a

    or-int/lit16 v2, v2, 0xc00

    goto :goto_13

    :cond_1a
    move/from16 v21, v2

    and-int/lit16 v2, v3, 0xc00

    if-nez v2, :cond_1c

    move/from16 v2, p14

    invoke-virtual {v0, v2}, La/fet;->h(Z)Z

    move-result v25

    if-eqz v25, :cond_1b

    move/from16 v17, v18

    :cond_1b
    or-int v17, v21, v17

    move/from16 v2, v17

    goto :goto_13

    :cond_1c
    move/from16 v2, p14

    move/from16 v2, v21

    :goto_13
    move/from16 v17, v5

    and-int/lit16 v5, v4, 0x4000

    if-eqz v5, :cond_1e

    or-int/lit16 v2, v2, 0x6000

    move/from16 v18, v2

    :cond_1d
    move/from16 v2, p15

    goto :goto_15

    :cond_1e
    move/from16 v18, v2

    and-int/lit16 v2, v3, 0x6000

    if-nez v2, :cond_1d

    move/from16 v2, p15

    invoke-virtual {v0, v2}, La/fet;->e(I)Z

    move-result v21

    if-eqz v21, :cond_1f

    const/16 v21, 0x4000

    goto :goto_14

    :cond_1f
    const/16 v21, 0x2000

    :goto_14
    or-int v18, v18, v21

    :goto_15
    const v21, 0x8000

    and-int v21, v4, v21

    const/high16 v25, 0x10000

    const/high16 v31, 0x20000

    const/high16 v32, 0x30000

    if-eqz v21, :cond_20

    or-int v18, v18, v32

    move/from16 v2, p16

    goto :goto_17

    :cond_20
    and-int v32, v3, v32

    move/from16 v2, p16

    if-nez v32, :cond_22

    invoke-virtual {v0, v2}, La/fet;->e(I)Z

    move-result v32

    if-eqz v32, :cond_21

    move/from16 v32, v31

    goto :goto_16

    :cond_21
    move/from16 v32, v25

    :goto_16
    or-int v18, v18, v32

    :cond_22
    :goto_17
    and-int v25, v4, v25

    const/high16 v32, 0x180000

    if-eqz v25, :cond_23

    or-int v18, v18, v32

    move-object/from16 v2, p17

    goto :goto_19

    :cond_23
    and-int v32, v3, v32

    move-object/from16 v2, p17

    if-nez v32, :cond_25

    invoke-virtual {v0, v2}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_24

    const/high16 v32, 0x100000

    goto :goto_18

    :cond_24
    const/high16 v32, 0x80000

    :goto_18
    or-int v18, v18, v32

    :cond_25
    :goto_19
    and-int v31, v4, v31

    if-eqz v31, :cond_26

    or-int v18, v18, v24

    move-object/from16 v2, p18

    goto :goto_1a

    :cond_26
    and-int v24, v3, v24

    move-object/from16 v2, p18

    if-nez v24, :cond_28

    invoke-virtual {v0, v2}, La/fet;->i(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_27

    move/from16 v22, v23

    :cond_27
    or-int v18, v18, v22

    :cond_28
    :goto_1a
    and-int v22, v3, v28

    const/high16 v23, 0x40000

    if-nez v22, :cond_2a

    and-int v22, v4, v23

    move-object/from16 v2, p19

    if-nez v22, :cond_29

    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_29

    move/from16 v26, v27

    :cond_29
    or-int v18, v18, v26

    goto :goto_1b

    :cond_2a
    move-object/from16 v2, p19

    :goto_1b
    const v22, 0x12492493

    and-int v2, v11, v22

    const v3, 0x12492492

    const/16 v22, 0x1

    if-ne v2, v3, :cond_2c

    const v2, 0x2492493

    and-int v2, v18, v2

    const v3, 0x2492492

    if-eq v2, v3, :cond_2b

    goto :goto_1c

    :cond_2b
    const/4 v2, 0x0

    goto :goto_1d

    :cond_2c
    :goto_1c
    move/from16 v2, v22

    :goto_1d
    and-int/lit8 v3, v11, 0x1

    invoke-virtual {v0, v3, v2}, La/fet;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_47

    invoke-virtual {v0}, La/fet;->Z()V

    and-int/lit8 v2, p21, 0x1

    const v24, -0xe000001

    sget-object v3, La/ukd;->a:La/cl5;

    if-eqz v2, :cond_2f

    invoke-virtual {v0}, La/fet;->B()Z

    move-result v2

    if-eqz v2, :cond_2d

    goto :goto_1f

    .line 2
    :cond_2d
    invoke-virtual {v0}, La/fet;->X()V

    and-int v2, p23, v23

    if-eqz v2, :cond_2e

    and-int v18, v18, v24

    :cond_2e
    move-object/from16 v2, p1

    move-wide/from16 v27, p2

    move-object/from16 v8, p4

    move-wide/from16 v32, p5

    move-object/from16 v12, p7

    move-wide/from16 v13, p11

    move/from16 v15, p14

    move/from16 v5, p15

    move/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v4, p18

    move/from16 v20, v18

    :goto_1e
    move-object/from16 v18, p19

    goto/16 :goto_2b

    :cond_2f
    :goto_1f
    if-eqz v8, :cond_30

    .line 3
    sget-object v2, La/jm40;->b:La/jm40;

    goto :goto_20

    :cond_30
    move-object/from16 v2, p1

    :goto_20
    if-eqz v12, :cond_31

    .line 4
    sget-wide v27, La/y3d;->g:J

    goto :goto_21

    :cond_31
    move-wide/from16 v27, p2

    :goto_21
    if-eqz v16, :cond_32

    const/4 v8, 0x0

    goto :goto_22

    :cond_32
    move-object/from16 v8, p4

    .line 5
    :goto_22
    sget-wide v32, La/daq0;->c:J

    if-eqz v13, :cond_33

    const/4 v12, 0x0

    goto :goto_23

    :cond_33
    move-object/from16 v12, p7

    :goto_23
    if-eqz v14, :cond_34

    move-wide/from16 v9, v32

    :cond_34
    if-eqz v15, :cond_35

    const/4 v7, 0x0

    :cond_35
    if-eqz v20, :cond_36

    move-wide/from16 v13, v32

    goto :goto_24

    :cond_36
    move-wide/from16 v13, p11

    :goto_24
    if-eqz v19, :cond_37

    move/from16 v6, v22

    :cond_37
    if-eqz v17, :cond_38

    move/from16 v15, v22

    goto :goto_25

    :cond_38
    move/from16 v15, p14

    :goto_25
    if-eqz v5, :cond_39

    const v5, 0x7fffffff

    goto :goto_26

    :cond_39
    move/from16 v5, p15

    :goto_26
    if-eqz v21, :cond_3a

    move/from16 v16, v22

    goto :goto_27

    :cond_3a
    move/from16 v16, p16

    :goto_27
    if-eqz v25, :cond_3b

    .line 6
    sget-object v17, La/lun;->a:La/lun;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_28

    :cond_3b
    move-object/from16 v17, p17

    :goto_28
    if-eqz v31, :cond_3d

    .line 7
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_3c

    .line 8
    new-instance v4, La/t6q0;

    move-object/from16 p1, v2

    const/16 v2, 0xd

    invoke-direct {v4, v2}, La/t6q0;-><init>(B)V

    .line 9
    invoke-virtual {v0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    goto :goto_29

    :cond_3c
    move-object/from16 p1, v2

    .line 10
    :goto_29
    move-object v2, v4

    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_2a

    :cond_3d
    move-object/from16 p1, v2

    move-object/from16 v2, p18

    :goto_2a
    and-int v4, p23, v23

    if-eqz v4, :cond_3e

    .line 11
    sget-object v4, La/v8q0;->a:La/zfn;

    .line 12
    invoke-virtual {v0, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/y9q0;

    and-int v18, v18, v24

    move/from16 v20, v18

    move-object/from16 v18, v4

    move-object v4, v2

    move-object/from16 v2, p1

    goto :goto_2b

    :cond_3e
    move-object v4, v2

    move/from16 v20, v18

    move-object/from16 v2, p1

    goto/16 :goto_1e

    .line 13
    :goto_2b
    invoke-virtual {v0}, La/fet;->s()V

    move-object/from16 p15, v2

    const v2, 0x63f3c35c

    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    const-wide/16 v23, 0x10

    cmp-long v2, v27, v23

    if-eqz v2, :cond_3f

    move-object/from16 p17, v4

    move/from16 p16, v5

    move-wide/from16 v34, v27

    const/4 v2, 0x0

    goto :goto_2e

    :cond_3f
    const v2, 0x63f3c661

    .line 14
    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    .line 15
    invoke-virtual/range {v18 .. v18}, La/y9q0;->b()J

    move-result-wide v34

    cmp-long v2, v34, v23

    if-eqz v2, :cond_40

    move-object/from16 p17, v4

    move/from16 p16, v5

    :goto_2c
    const/4 v2, 0x0

    goto :goto_2d

    .line 16
    :cond_40
    sget-object v2, La/yde;->a:La/zfn;

    .line 17
    invoke-virtual {v0, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    move-result-object v2

    .line 18
    check-cast v2, La/y3d;

    move-object/from16 p17, v4

    move/from16 p16, v5

    .line 19
    iget-wide v4, v2, La/y3d;->a:J

    move-wide/from16 v34, v4

    goto :goto_2c

    .line 20
    :goto_2d
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    :goto_2e
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 21
    sget-object v4, La/v4d;->a:La/zfn;

    .line 22
    invoke-virtual {v0, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    move-result-object v4

    .line 23
    check-cast v4, La/t4d;

    .line 24
    iget-wide v4, v4, La/t4d;->a:J

    .line 25
    invoke-virtual {v0, v4, v5}, La/fet;->f(J)Z

    move-result v21

    .line 26
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    move-result-object v2

    if-nez v21, :cond_41

    if-ne v2, v3, :cond_42

    .line 27
    :cond_41
    new-instance v2, La/f9q0;

    .line 28
    new-instance v36, La/smk0;

    const/16 v55, 0x0

    const v56, 0xeffe

    const-wide/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const-wide/16 v46, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const-wide/16 v51, 0x0

    sget-object v53, La/k5q0;->c:La/k5q0;

    const/16 v54, 0x0

    move-wide/from16 v37, v4

    invoke-direct/range {v36 .. v56}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;I)V

    move-object/from16 v4, v36

    const/4 v5, 0x0

    .line 29
    invoke-direct {v2, v4, v5, v5, v5}, La/f9q0;-><init>(La/smk0;La/smk0;La/smk0;La/smk0;)V

    .line 30
    invoke-virtual {v0, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 31
    :cond_42
    check-cast v2, La/f9q0;

    and-int/lit8 v4, v11, 0xe

    const/4 v5, 0x4

    if-ne v4, v5, :cond_43

    goto :goto_2f

    :cond_43
    const/16 v22, 0x0

    .line 32
    :goto_2f
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int v4, v22, v4

    .line 33
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_44

    if-ne v5, v3, :cond_45

    .line 34
    :cond_44
    new-instance v3, La/nop0;

    const/16 v4, 0x10

    invoke-direct {v3, v2, v4}, La/nop0;-><init>(Ljava/lang/Object;B)V

    invoke-virtual {v1, v3}, La/j83;->b(Lkotlin/jvm/functions/Function1;)La/j83;

    move-result-object v5

    .line 35
    invoke-virtual {v0, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 36
    :cond_45
    check-cast v5, La/j83;

    if-eqz v7, :cond_46

    .line 37
    iget v4, v7, La/f2q0;->a:I

    goto :goto_30

    :cond_46
    const/4 v4, 0x0

    :goto_30
    const v2, 0xfd6f50

    const/4 v3, 0x0

    const/16 v19, 0x0

    move/from16 p14, v2

    move-object/from16 p6, v3

    move/from16 p11, v4

    move-wide/from16 p9, v9

    move-object/from16 p8, v12

    move-wide/from16 p12, v13

    move-object/from16 p1, v18

    move-object/from16 p7, v19

    move-wide/from16 p4, v32

    move-wide/from16 p2, v34

    .line 38
    invoke-static/range {p1 .. p14}, La/y9q0;->e(La/y9q0;JJLa/psq;La/lsq;La/nrq;JIJI)La/y9q0;

    move-result-object v2

    move-object/from16 v4, p1

    and-int/lit8 v3, v11, 0x70

    shr-int/lit8 v0, v20, 0xc

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr v0, v3

    shl-int/lit8 v3, v20, 0x6

    const v18, 0xe000

    and-int v18, v3, v18

    or-int v0, v0, v18

    const/high16 v18, 0x70000

    and-int v18, v3, v18

    or-int v0, v0, v18

    const/high16 v18, 0x380000

    and-int v18, v3, v18

    or-int v0, v0, v18

    const/high16 v18, 0x1c00000

    and-int v18, v3, v18

    or-int v0, v0, v18

    const/high16 v18, 0xe000000

    and-int v3, v3, v18

    or-int/2addr v0, v3

    shr-int/lit8 v3, v11, 0x9

    and-int/lit8 v3, v3, 0xe

    const/16 v11, 0x200

    move-object/from16 p2, p15

    move/from16 p7, p16

    move-object/from16 p4, p17

    move-object/from16 p11, p20

    move/from16 p12, v0

    move-object/from16 p3, v2

    move/from16 p13, v3

    move-object/from16 p1, v5

    move/from16 p5, v6

    move-object/from16 p10, v8

    move/from16 p14, v11

    move/from16 p6, v15

    move/from16 p8, v16

    move-object/from16 p9, v17

    .line 39
    invoke-static/range {p1 .. p14}, La/aad;->d(La/j83;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;La/n05;La/fet;III)V

    move-object/from16 v0, p2

    move-object/from16 v2, p4

    move/from16 v5, p7

    move-object/from16 v19, v2

    move-object/from16 v20, v4

    move-object v11, v7

    move-object/from16 v18, v17

    move-wide/from16 v3, v27

    move-object v2, v0

    move/from16 v17, v16

    move/from16 v16, v5

    move-object v5, v8

    move-object v8, v12

    move-wide v12, v13

    move v14, v6

    move-wide/from16 v6, v32

    goto :goto_31

    .line 40
    :cond_47
    invoke-virtual/range {p20 .. p20}, La/fet;->X()V

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v8, p7

    move-wide/from16 v12, p11

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move v14, v6

    move-object v11, v7

    move-wide/from16 v6, p5

    .line 41
    :goto_31
    invoke-virtual/range {p20 .. p20}, La/fet;->u()La/yfe0;

    move-result-object v0

    if-eqz v0, :cond_48

    move-object/from16 v21, v0

    new-instance v0, La/t8q0;

    move/from16 v22, p22

    move/from16 v23, p23

    move-object/from16 v57, v21

    move/from16 v21, p21

    invoke-direct/range {v0 .. v23}, La/t8q0;-><init>(La/j83;La/mm40;JLa/n05;JLa/nrq;JLa/f2q0;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;La/y9q0;III)V

    move-object v1, v0

    move-object/from16 v0, v57

    .line 42
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    :cond_48
    return-void
.end method
