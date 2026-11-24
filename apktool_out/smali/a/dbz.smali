.class public final La/dbz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/hz40;

.field public b:Landroidx/compose/foundation/lazy/layout/c;

.field public c:I

.field public final d:La/iz40;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;

.field public j:La/hwk;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/u1h0;->a:[J

    .line 5
    .line 6
    new-instance v0, La/hz40;

    .line 7
    .line 8
    invoke-direct {v0}, La/hz40;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/dbz;->a:La/hz40;

    .line 12
    .line 13
    sget-object v0, La/v1h0;->a:La/iz40;

    .line 14
    .line 15
    new-instance v0, La/iz40;

    .line 16
    .line 17
    invoke-direct {v0}, La/iz40;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/dbz;->d:La/iz40;

    .line 21
    .line 22
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, La/dbz;->e:Ljava/util/ArrayList;

    .line 28
    .line 29
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, La/dbz;->f:Ljava/util/ArrayList;

    .line 35
    .line 36
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, La/dbz;->g:Ljava/util/ArrayList;

    .line 42
    .line 43
    new-instance v0, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, La/dbz;->h:Ljava/util/ArrayList;

    .line 49
    .line 50
    new-instance v0, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, La/dbz;->i:Ljava/util/ArrayList;

    .line 56
    .line 57
    return-void
.end method

.method public static c(La/kbz;ILa/bbz;Z)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, La/kbz;->i(I)J

    .line 3
    .line 4
    .line 5
    move-result-wide v1

    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    const/4 p3, 0x1

    .line 9
    invoke-static {v0, p1, p3, v1, v2}, La/ikx;->a(IIIJ)J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p3, 0x2

    .line 15
    invoke-static {p1, v0, p3, v1, v2}, La/ikx;->a(IIIJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    :goto_0
    iget-object p1, p2, La/bbz;->a:[La/zaz;

    .line 20
    .line 21
    array-length p2, p1

    .line 22
    move p3, v0

    .line 23
    :goto_1
    if-ge v0, p2, :cond_2

    .line 24
    .line 25
    aget-object v5, p1, v0

    .line 26
    .line 27
    add-int/lit8 v6, p3, 0x1

    .line 28
    .line 29
    if-eqz v5, :cond_1

    .line 30
    .line 31
    invoke-interface {p0, p3}, La/kbz;->i(I)J

    .line 32
    .line 33
    .line 34
    move-result-wide v7

    .line 35
    invoke-static {v7, v8, v1, v2}, La/ikx;->c(JJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide v7

    .line 39
    invoke-static {v3, v4, v7, v8}, La/ikx;->d(JJ)J

    .line 40
    .line 41
    .line 42
    move-result-wide v7

    .line 43
    iput-wide v7, v5, La/zaz;->l:J

    .line 44
    .line 45
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    move p3, v6

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    return-void
.end method

.method public static h([ILa/kbz;Z)I
    .locals 5

    .line 1
    invoke-interface {p1}, La/kbz;->j()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1}, La/kbz;->b()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, v0

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    aget v3, p0, v0

    .line 14
    .line 15
    invoke-static {p1, p2}, La/j120;->Z(La/kbz;Z)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    add-int/2addr v4, v3

    .line 20
    aput v4, p0, v0

    .line 21
    .line 22
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return v2
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)La/zaz;
    .locals 0

    .line 1
    iget-object p0, p0, La/dbz;->a:La/hz40;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/bbz;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, La/bbz;->a:[La/zaz;

    .line 12
    .line 13
    aget-object p0, p0, p1

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method

.method public final b()J
    .locals 12

    .line 1
    iget-object p0, p0, La/dbz;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    :goto_0
    if-ge v3, v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    check-cast v4, La/zaz;

    .line 17
    .line 18
    iget-object v5, v4, La/zaz;->o:La/dfv;

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    const/16 v6, 0x20

    .line 23
    .line 24
    shr-long v7, v1, v6

    .line 25
    .line 26
    long-to-int v7, v7

    .line 27
    iget-wide v8, v4, La/zaz;->l:J

    .line 28
    .line 29
    shr-long/2addr v8, v6

    .line 30
    long-to-int v8, v8

    .line 31
    iget-wide v9, v5, La/dfv;->u:J

    .line 32
    .line 33
    shr-long/2addr v9, v6

    .line 34
    long-to-int v9, v9

    .line 35
    add-int/2addr v8, v9

    .line 36
    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    const-wide v8, 0xffffffffL

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    and-long/2addr v1, v8

    .line 46
    long-to-int v1, v1

    .line 47
    iget-wide v10, v4, La/zaz;->l:J

    .line 48
    .line 49
    and-long/2addr v10, v8

    .line 50
    long-to-int v2, v10

    .line 51
    iget-wide v4, v5, La/dfv;->u:J

    .line 52
    .line 53
    and-long/2addr v4, v8

    .line 54
    long-to-int v4, v4

    .line 55
    add-int/2addr v2, v4

    .line 56
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    int-to-long v4, v7

    .line 61
    shl-long/2addr v4, v6

    .line 62
    int-to-long v1, v1

    .line 63
    and-long/2addr v1, v8

    .line 64
    or-long/2addr v1, v4

    .line 65
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    return-wide v1
.end method

.method public final d(IIILjava/util/ArrayList;Landroidx/compose/foundation/lazy/layout/c;La/p4;ZZIZIILa/vne;La/afv;)V
    .locals 53

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v13, p9

    .line 1
    iget-object v14, v0, La/dbz;->b:Landroidx/compose/foundation/lazy/layout/c;

    .line 2
    iput-object v5, v0, La/dbz;->b:Landroidx/compose/foundation/lazy/layout/c;

    .line 3
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_0
    const/16 v20, 0x0

    iget-object v8, v0, La/dbz;->a:La/hz40;

    if-ge v7, v6, :cond_3

    .line 4
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 5
    check-cast v9, La/kbz;

    .line 6
    invoke-interface {v9}, La/kbz;->g()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v10, :cond_2

    .line 7
    invoke-interface {v9}, La/kbz;->g()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La/pu90;

    invoke-virtual {v12}, La/pu90;->n()Ljava/lang/Object;

    move-result-object v12

    .line 8
    instance-of v15, v12, La/oaz;

    if-eqz v15, :cond_0

    check-cast v12, La/oaz;

    goto :goto_2

    :cond_0
    move-object/from16 v12, v20

    :goto_2
    if-eqz v12, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 9
    :cond_3
    invoke-virtual {v8}, La/hz40;->i()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 10
    invoke-virtual {v0}, La/dbz;->e()V

    return-void

    .line 11
    :cond_4
    :goto_3
    iget v15, v0, La/dbz;->c:I

    .line 12
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/kbz;

    if-eqz v6, :cond_5

    invoke-interface {v6}, La/kbz;->getIndex()I

    move-result v6

    goto :goto_4

    :cond_5
    const/4 v6, 0x0

    :goto_4
    iput v6, v0, La/dbz;->c:I

    const/16 v22, 0x20

    const-wide v23, 0xffffffffL

    if-eqz p7, :cond_6

    int-to-long v6, v1

    and-long v6, v6, v23

    goto :goto_5

    :cond_6
    int-to-long v6, v1

    shl-long v6, v6, v22

    :goto_5
    if-nez p8, :cond_8

    if-nez p10, :cond_7

    goto :goto_6

    :cond_7
    const/16 v25, 0x0

    goto :goto_7

    :cond_8
    :goto_6
    const/16 v25, 0x1

    .line 13
    :goto_7
    iget-object v9, v8, La/hz40;->b:[Ljava/lang/Object;

    .line 14
    iget-object v10, v8, La/hz40;->a:[J

    .line 15
    array-length v11, v10

    const/4 v12, 0x2

    sub-int/2addr v11, v12

    const-wide/16 v26, 0x80

    const-wide/16 v28, 0xff

    const/16 v30, 0x7

    .line 16
    iget-object v1, v0, La/dbz;->d:La/iz40;

    const-wide v31, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    if-ltz v11, :cond_c

    const/4 v12, 0x0

    :goto_8
    const/16 v33, 0x8

    .line 17
    aget-wide v2, v10, v12

    move-wide/from16 v16, v6

    not-long v6, v2

    shl-long v6, v6, v30

    and-long/2addr v6, v2

    and-long v6, v6, v31

    cmp-long v6, v6, v31

    if-eqz v6, :cond_b

    sub-int v6, v12, v11

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    rsub-int/lit8 v6, v6, 0x8

    const/4 v7, 0x0

    :goto_9
    if-ge v7, v6, :cond_a

    and-long v18, v2, v28

    cmp-long v18, v18, v26

    if-gez v18, :cond_9

    shl-int/lit8 v18, v12, 0x3

    add-int v18, v18, v7

    move-wide/from16 v34, v2

    .line 18
    aget-object v2, v9, v18

    .line 19
    invoke-virtual {v1, v2}, La/iz40;->a(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_9
    move-wide/from16 v34, v2

    :goto_a
    shr-long v2, v34, v33

    add-int/lit8 v7, v7, 0x1

    goto :goto_9

    :cond_a
    move/from16 v2, v33

    if-ne v6, v2, :cond_d

    :cond_b
    if-eq v12, v11, :cond_d

    add-int/lit8 v12, v12, 0x1

    move-wide/from16 v6, v16

    goto :goto_8

    :cond_c
    move-wide/from16 v16, v6

    .line 20
    :cond_d
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_b
    iget-object v6, v0, La/dbz;->i:Ljava/util/ArrayList;

    iget-object v9, v0, La/dbz;->f:Ljava/util/ArrayList;

    iget-object v10, v0, La/dbz;->e:Ljava/util/ArrayList;

    if-ge v3, v2, :cond_1f

    .line 21
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 22
    check-cast v11, La/kbz;

    .line 23
    invoke-interface {v11}, La/kbz;->getKey()Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v1, v12}, La/iz40;->l(Ljava/lang/Object;)Z

    .line 24
    invoke-interface {v11}, La/kbz;->g()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    const/4 v7, 0x0

    :goto_c
    if-ge v7, v12, :cond_1e

    move/from16 v19, v2

    .line 25
    invoke-interface {v11}, La/kbz;->g()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/pu90;

    invoke-virtual {v2}, La/pu90;->n()Ljava/lang/Object;

    move-result-object v2

    move/from16 v21, v3

    .line 26
    instance-of v3, v2, La/oaz;

    if-eqz v3, :cond_e

    check-cast v2, La/oaz;

    goto :goto_d

    :cond_e
    move-object/from16 v2, v20

    :goto_d
    if-eqz v2, :cond_1d

    .line 27
    invoke-interface {v11}, La/kbz;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v8, v2}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/bbz;

    if-eqz v14, :cond_f

    .line 28
    invoke-interface {v11}, La/kbz;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v14, v3}, Landroidx/compose/foundation/lazy/layout/c;->a(Ljava/lang/Object;)I

    move-result v3

    :goto_e
    const/4 v7, -0x1

    goto :goto_f

    :cond_f
    const/4 v3, -0x1

    goto :goto_e

    :goto_f
    if-ne v3, v7, :cond_10

    if-eqz v14, :cond_10

    const/16 v18, 0x1

    goto :goto_10

    :cond_10
    const/16 v18, 0x0

    :goto_10
    if-nez v2, :cond_16

    .line 29
    new-instance v6, La/bbz;

    invoke-direct {v6, v0}, La/bbz;-><init>(La/dbz;)V

    move/from16 v12, p7

    move-object v2, v8

    move-object/from16 v36, v9

    move-object/from16 v37, v10

    move-object v7, v11

    move-wide/from16 v4, v16

    move/from16 v10, p11

    move/from16 v11, p12

    move-object/from16 v8, p13

    move-object/from16 v9, p14

    .line 30
    invoke-static/range {v6 .. v12}, La/bbz;->b(La/bbz;La/kbz;La/vne;La/afv;IIZ)V

    .line 31
    invoke-interface {v7}, La/kbz;->getKey()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v2, v8, v6}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    invoke-interface {v7}, La/kbz;->getIndex()I

    move-result v8

    if-eq v8, v3, :cond_13

    const/4 v8, -0x1

    if-eq v3, v8, :cond_13

    if-ge v3, v15, :cond_11

    move-object/from16 v3, v37

    .line 33
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_11
    move-object/from16 v6, v36

    .line 34
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_12
    :goto_11
    move-wide v9, v4

    move v8, v12

    move/from16 v16, v15

    :goto_12
    const/4 v4, 0x2

    goto/16 :goto_19

    :cond_13
    const/4 v3, 0x0

    .line 35
    invoke-interface {v7, v3}, La/kbz;->i(I)J

    move-result-wide v8

    if-eqz v12, :cond_14

    and-long v8, v8, v23

    :goto_13
    long-to-int v3, v8

    goto :goto_14

    :cond_14
    shr-long v8, v8, v22

    goto :goto_13

    .line 36
    :goto_14
    invoke-static {v7, v3, v6, v12}, La/dbz;->c(La/kbz;ILa/bbz;Z)V

    if-eqz v18, :cond_12

    .line 37
    iget-object v3, v6, La/bbz;->a:[La/zaz;

    .line 38
    array-length v6, v3

    const/4 v7, 0x0

    :goto_15
    if-ge v7, v6, :cond_12

    aget-object v8, v3, v7

    if-eqz v8, :cond_15

    .line 39
    invoke-virtual {v8}, La/zaz;->a()V

    :cond_15
    add-int/lit8 v7, v7, 0x1

    goto :goto_15

    :cond_16
    move/from16 v12, p7

    move-object v3, v2

    move-object v2, v8

    move-object v7, v11

    move-wide/from16 v4, v16

    const/4 v8, 0x2

    if-eqz v25, :cond_12

    move/from16 v10, p11

    move/from16 v11, p12

    move-object/from16 v9, p14

    move/from16 v16, v15

    move-object v15, v6

    move-object v6, v3

    move v3, v8

    move-object/from16 v8, p13

    .line 40
    invoke-static/range {v6 .. v12}, La/bbz;->b(La/bbz;La/kbz;La/vne;La/afv;IIZ)V

    move-object v11, v7

    move v8, v12

    .line 41
    iget-object v7, v6, La/bbz;->a:[La/zaz;

    .line 42
    array-length v9, v7

    const/4 v10, 0x0

    :goto_16
    if-ge v10, v9, :cond_19

    aget-object v12, v7, v10

    if-eqz v12, :cond_18

    move-wide/from16 v35, v4

    .line 43
    iget-wide v3, v12, La/zaz;->l:J

    move v5, v9

    move/from16 v17, v10

    const-wide v9, 0x7fffffff7fffffffL

    .line 44
    invoke-static {v3, v4, v9, v10}, La/ikx;->b(JJ)Z

    move-result v3

    if-nez v3, :cond_17

    .line 45
    iget-wide v3, v12, La/zaz;->l:J

    move-wide/from16 v9, v35

    invoke-static {v3, v4, v9, v10}, La/ikx;->d(JJ)J

    move-result-wide v3

    iput-wide v3, v12, La/zaz;->l:J

    goto :goto_17

    :cond_17
    move-wide/from16 v9, v35

    goto :goto_17

    :cond_18
    move/from16 v17, v10

    move-wide/from16 v51, v4

    move v5, v9

    move-wide/from16 v9, v51

    :goto_17
    add-int/lit8 v3, v17, 0x1

    move-wide/from16 v51, v9

    move v9, v5

    move-wide/from16 v4, v51

    move v10, v3

    const/4 v3, 0x2

    goto :goto_16

    :cond_19
    move-wide v9, v4

    if-eqz v18, :cond_1c

    .line 46
    iget-object v3, v6, La/bbz;->a:[La/zaz;

    .line 47
    array-length v4, v3

    const/4 v5, 0x0

    :goto_18
    if-ge v5, v4, :cond_1c

    aget-object v6, v3, v5

    if-eqz v6, :cond_1b

    .line 48
    invoke-virtual {v6}, La/zaz;->c()Z

    move-result v7

    if-eqz v7, :cond_1a

    .line 49
    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 50
    iget-object v7, v0, La/dbz;->j:La/hwk;

    if-eqz v7, :cond_1a

    invoke-static {v7}, La/vfc;->J(La/ehl;)V

    .line 51
    :cond_1a
    invoke-virtual {v6}, La/zaz;->a()V

    :cond_1b
    add-int/lit8 v5, v5, 0x1

    goto :goto_18

    :cond_1c
    const/4 v3, 0x0

    .line 52
    invoke-virtual {v0, v11, v3}, La/dbz;->g(La/kbz;Z)V

    goto/16 :goto_12

    :cond_1d
    move-object v2, v8

    move-object v3, v10

    const/4 v4, 0x2

    move/from16 v8, p7

    move/from16 v51, v15

    move-object v15, v6

    move-object v6, v9

    move-wide/from16 v9, v16

    move/from16 v16, v51

    add-int/lit8 v7, v7, 0x1

    move-wide v4, v9

    move-object v9, v6

    move-object v6, v15

    move/from16 v15, v16

    move-wide/from16 v16, v4

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object v8, v2

    move-object v10, v3

    move/from16 v2, v19

    move/from16 v3, v21

    goto/16 :goto_c

    :cond_1e
    move/from16 v19, v2

    move/from16 v21, v3

    move-object v2, v8

    move-wide/from16 v9, v16

    const/4 v4, 0x2

    move/from16 v8, p7

    move/from16 v16, v15

    .line 53
    invoke-interface {v11}, La/kbz;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, La/dbz;->f(Ljava/lang/Object;)V

    :goto_19
    add-int/lit8 v3, v21, 0x1

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object v8, v2

    move/from16 v15, v16

    move/from16 v2, v19

    move-wide/from16 v16, v9

    goto/16 :goto_b

    :cond_1f
    move-object v15, v6

    move-object v2, v8

    move-object v6, v9

    move-object v3, v10

    const/4 v4, 0x2

    move/from16 v8, p7

    .line 54
    new-array v5, v13, [I

    const/4 v7, 0x6

    if-eqz v25, :cond_25

    if-eqz v14, :cond_25

    .line 55
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_22

    .line 56
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v10, 0x1

    if-le v9, v10, :cond_20

    new-instance v9, La/cbz;

    invoke-direct {v9, v14, v4}, La/cbz;-><init>(Landroidx/compose/foundation/lazy/layout/c;B)V

    invoke-static {v9, v3}, La/v3d;->t(Ljava/util/Comparator;Ljava/util/List;)V

    .line 57
    :cond_20
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_1a
    if-ge v10, v9, :cond_21

    .line 58
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 59
    check-cast v11, La/kbz;

    .line 60
    invoke-static {v5, v11, v8}, La/dbz;->h([ILa/kbz;Z)I

    move-result v12

    sub-int v12, p11, v12

    move/from16 p10, v4

    .line 61
    invoke-interface {v11}, La/kbz;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v4, La/bbz;

    .line 62
    invoke-static {v11, v12, v4, v8}, La/dbz;->c(La/kbz;ILa/bbz;Z)V

    const/4 v4, 0x0

    .line 63
    invoke-virtual {v0, v11, v4}, La/dbz;->g(La/kbz;Z)V

    add-int/lit8 v10, v10, 0x1

    move/from16 v4, p10

    goto :goto_1a

    :cond_21
    move/from16 p10, v4

    const/4 v4, 0x0

    .line 64
    invoke-static {v5, v4, v4, v7}, La/qx3;->o([IIII)V

    goto :goto_1b

    :cond_22
    move/from16 p10, v4

    const/4 v4, 0x0

    .line 65
    :goto_1b
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_26

    .line 66
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v10, 0x1

    if-le v9, v10, :cond_23

    new-instance v9, La/cbz;

    invoke-direct {v9, v14, v4}, La/cbz;-><init>(Landroidx/compose/foundation/lazy/layout/c;B)V

    invoke-static {v9, v6}, La/v3d;->t(Ljava/util/Comparator;Ljava/util/List;)V

    .line 67
    :cond_23
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v9, 0x0

    :goto_1c
    if-ge v9, v4, :cond_24

    .line 68
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 69
    check-cast v10, La/kbz;

    .line 70
    invoke-static {v5, v10, v8}, La/dbz;->h([ILa/kbz;Z)I

    move-result v11

    add-int v11, v11, p12

    .line 71
    invoke-static {v10, v8}, La/j120;->Z(La/kbz;Z)I

    move-result v12

    sub-int/2addr v11, v12

    .line 72
    invoke-interface {v10}, La/kbz;->getKey()Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v2, v12}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v12, La/bbz;

    .line 73
    invoke-static {v10, v11, v12, v8}, La/dbz;->c(La/kbz;ILa/bbz;Z)V

    const/4 v11, 0x0

    .line 74
    invoke-virtual {v0, v10, v11}, La/dbz;->g(La/kbz;Z)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_1c

    :cond_24
    const/4 v11, 0x0

    .line 75
    invoke-static {v5, v11, v11, v7}, La/qx3;->o([IIII)V

    goto :goto_1d

    :cond_25
    move/from16 p10, v4

    .line 76
    :cond_26
    :goto_1d
    iget-object v4, v1, La/iz40;->b:[Ljava/lang/Object;

    .line 77
    iget-object v9, v1, La/iz40;->a:[J

    .line 78
    array-length v10, v9

    add-int/lit8 v10, v10, -0x2

    .line 79
    iget-object v12, v0, La/dbz;->h:Ljava/util/ArrayList;

    iget-object v11, v0, La/dbz;->g:Ljava/util/ArrayList;

    if-ltz v10, :cond_3b

    move-object/from16 v35, v1

    const/4 v1, 0x0

    .line 80
    :goto_1e
    aget-wide v7, v9, v1

    move-object/from16 v37, v3

    move-object/from16 v38, v4

    not-long v3, v7

    shl-long v3, v3, v30

    and-long/2addr v3, v7

    and-long v3, v3, v31

    cmp-long v3, v3, v31

    if-eqz v3, :cond_3a

    sub-int v3, v1, v10

    not-int v3, v3

    ushr-int/lit8 v3, v3, 0x1f

    const/16 v33, 0x8

    rsub-int/lit8 v3, v3, 0x8

    move-wide/from16 v39, v7

    const/4 v4, 0x0

    :goto_1f
    if-ge v4, v3, :cond_39

    and-long v7, v39, v28

    cmp-long v7, v7, v26

    if-gez v7, :cond_38

    shl-int/lit8 v7, v1, 0x3

    add-int/2addr v7, v4

    .line 81
    aget-object v7, v38, v7

    .line 82
    invoke-virtual {v2, v7}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La/bbz;

    if-nez v8, :cond_27

    goto/16 :goto_2a

    :cond_27
    move/from16 v41, v4

    move-object/from16 v48, v6

    move-object/from16 v4, p5

    .line 83
    invoke-virtual {v4, v7}, Landroidx/compose/foundation/lazy/layout/c;->a(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v49, v9

    .line 84
    iget v9, v8, La/bbz;->e:I

    .line 85
    invoke-static {v13, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    .line 86
    iput v9, v8, La/bbz;->e:I

    sub-int v9, v13, v9

    move/from16 v50, v10

    .line 87
    iget v10, v8, La/bbz;->d:I

    .line 88
    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    move-result v9

    .line 89
    iput v9, v8, La/bbz;->d:I

    const/4 v9, -0x1

    if-ne v6, v9, :cond_32

    .line 90
    iget-object v6, v8, La/bbz;->a:[La/zaz;

    .line 91
    array-length v10, v6

    const/4 v9, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    :goto_20
    if-ge v9, v10, :cond_30

    move-object/from16 v44, v6

    aget-object v6, v44, v9

    add-int/lit8 v45, v43, 0x1

    if-eqz v6, :cond_2e

    .line 92
    invoke-virtual {v6}, La/zaz;->c()Z

    move-result v16

    if-eqz v16, :cond_28

    move/from16 v46, v9

    move/from16 v47, v10

    move-object/from16 v16, v11

    move-object/from16 v13, v20

    const/4 v11, 0x3

    goto/16 :goto_23

    :cond_28
    move/from16 v46, v9

    .line 93
    iget-object v9, v6, La/zaz;->k:La/pz40;

    .line 94
    check-cast v9, La/hgk0;

    invoke-virtual {v9}, La/hgk0;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_29

    .line 95
    invoke-virtual {v6}, La/zaz;->d()V

    .line 96
    iget-object v9, v8, La/bbz;->a:[La/zaz;

    .line 97
    aput-object v20, v9, v43

    .line 98
    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 99
    iget-object v6, v0, La/dbz;->j:La/hwk;

    if-eqz v6, :cond_2f

    invoke-static {v6}, La/vfc;->J(La/ehl;)V

    goto :goto_24

    .line 100
    :cond_29
    iget-object v9, v6, La/zaz;->o:La/dfv;

    if-eqz v9, :cond_2b

    move-object/from16 v19, v9

    .line 101
    iget-object v9, v6, La/zaz;->f:La/cfq;

    .line 102
    invoke-virtual {v6}, La/zaz;->c()Z

    move-result v16

    if-nez v16, :cond_2b

    if-nez v9, :cond_2a

    goto :goto_21

    :cond_2a
    move-object/from16 v18, v9

    .line 103
    iget-object v9, v6, La/zaz;->j:La/pz40;

    move-object/from16 v16, v9

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move/from16 v47, v10

    .line 104
    move-object/from16 v10, v16

    check-cast v10, La/hgk0;

    invoke-virtual {v10, v9}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 105
    iget-object v9, v6, La/zaz;->a:La/vne;

    new-instance v16, La/c6y;

    const/16 v21, 0xd

    move-object/from16 v17, v6

    invoke-direct/range {v16 .. v21}, La/c6y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    move-object/from16 v10, v16

    move-object/from16 v13, v20

    move-object/from16 v16, v11

    const/4 v11, 0x3

    .line 106
    invoke-static {v9, v13, v13, v10, v11}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    goto :goto_22

    :cond_2b
    :goto_21
    move/from16 v47, v10

    move-object/from16 v16, v11

    move-object/from16 v13, v20

    const/4 v11, 0x3

    .line 107
    :goto_22
    invoke-virtual {v6}, La/zaz;->c()Z

    move-result v9

    if-eqz v9, :cond_2d

    .line 108
    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    iget-object v6, v0, La/dbz;->j:La/hwk;

    if-eqz v6, :cond_2c

    invoke-static {v6}, La/vfc;->J(La/ehl;)V

    :cond_2c
    :goto_23
    const/16 v42, 0x1

    goto :goto_25

    .line 110
    :cond_2d
    invoke-virtual {v6}, La/zaz;->d()V

    .line 111
    iget-object v6, v8, La/bbz;->a:[La/zaz;

    .line 112
    aput-object v13, v6, v43

    goto :goto_25

    :cond_2e
    move/from16 v46, v9

    :cond_2f
    :goto_24
    move/from16 v47, v10

    move-object/from16 v16, v11

    move-object/from16 v13, v20

    const/4 v11, 0x3

    :goto_25
    add-int/lit8 v9, v46, 0x1

    move-object/from16 v20, v13

    move-object/from16 v11, v16

    move-object/from16 v6, v44

    move/from16 v43, v45

    move/from16 v10, v47

    move/from16 v13, p9

    goto/16 :goto_20

    :cond_30
    move-object/from16 v16, v11

    move-object/from16 v13, v20

    const/4 v11, 0x3

    if-nez v42, :cond_31

    .line 113
    invoke-virtual {v0, v7}, La/dbz;->f(Ljava/lang/Object;)V

    :cond_31
    :goto_26
    move-object/from16 v17, v5

    move-object v5, v12

    move-object/from16 v18, v14

    move-object/from16 v14, v16

    const/16 v34, -0x1

    move-object/from16 v16, v15

    move/from16 v15, v50

    goto/16 :goto_29

    :cond_32
    move-object/from16 v16, v11

    move-object/from16 v13, v20

    const/4 v11, 0x3

    .line 114
    iget-object v9, v8, La/bbz;->b:La/p4e;

    .line 115
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    iget-wide v9, v9, La/p4e;->a:J

    .line 117
    iget v11, v8, La/bbz;->d:I

    .line 118
    iget v13, v8, La/bbz;->e:I

    move-object/from16 v42, p6

    move/from16 v43, v6

    move-wide/from16 v46, v9

    move/from16 v44, v11

    move/from16 v45, v13

    .line 119
    invoke-virtual/range {v42 .. v47}, La/p4;->w0(IIIJ)La/kbz;

    move-result-object v6

    move/from16 v13, v43

    .line 120
    invoke-interface {v6}, La/kbz;->e()V

    .line 121
    iget-object v9, v8, La/bbz;->a:[La/zaz;

    .line 122
    array-length v10, v9

    const/4 v11, 0x0

    :goto_27
    if-ge v11, v10, :cond_36

    move-object/from16 v17, v6

    aget-object v6, v9, v11

    if-eqz v6, :cond_34

    .line 123
    iget-object v6, v6, La/zaz;->h:La/pz40;

    .line 124
    check-cast v6, La/hgk0;

    invoke-virtual {v6}, La/hgk0;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    move-object/from16 v18, v9

    const/4 v9, 0x1

    if-ne v6, v9, :cond_35

    :cond_33
    move-object v6, v12

    goto :goto_28

    :cond_34
    move-object/from16 v18, v9

    :cond_35
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v6, v17

    move-object/from16 v9, v18

    goto :goto_27

    :cond_36
    move-object/from16 v17, v6

    if-eqz v14, :cond_33

    .line 125
    invoke-virtual {v14, v7}, Landroidx/compose/foundation/lazy/layout/c;->a(Ljava/lang/Object;)I

    move-result v6

    if-ne v13, v6, :cond_33

    .line 126
    invoke-virtual {v0, v7}, La/dbz;->f(Ljava/lang/Object;)V

    goto :goto_26

    .line 127
    :goto_28
    iget v12, v8, La/bbz;->c:I

    move/from16 v10, p11

    move/from16 v11, p12

    move-object/from16 v9, p14

    move-object/from16 v18, v14

    move-object/from16 v14, v16

    move-object/from16 v7, v17

    const/16 v34, -0x1

    move-object/from16 v17, v5

    move-object v5, v6

    move-object v6, v8

    move-object/from16 v16, v15

    move/from16 v15, v50

    move-object/from16 v8, p13

    .line 128
    invoke-virtual/range {v6 .. v12}, La/bbz;->a(La/kbz;La/vne;La/afv;III)V

    .line 129
    iget v6, v0, La/dbz;->c:I

    if-ge v13, v6, :cond_37

    .line 130
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_29

    .line 131
    :cond_37
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_29
    const/16 v6, 0x8

    goto :goto_2b

    :cond_38
    :goto_2a
    move/from16 v41, v4

    move-object/from16 v17, v5

    move-object/from16 v48, v6

    move-object/from16 v49, v9

    move-object v5, v12

    move-object/from16 v18, v14

    move-object/from16 v16, v15

    const/16 v34, -0x1

    move-object/from16 v4, p5

    move v15, v10

    move-object v14, v11

    goto :goto_29

    :goto_2b
    shr-long v39, v39, v6

    add-int/lit8 v7, v41, 0x1

    move/from16 v13, p9

    move-object v12, v5

    move v4, v7

    move-object v11, v14

    move v10, v15

    move-object/from16 v15, v16

    move-object/from16 v5, v17

    move-object/from16 v14, v18

    move-object/from16 v6, v48

    move-object/from16 v9, v49

    const/16 v20, 0x0

    goto/16 :goto_1f

    :cond_39
    move-object/from16 v4, p5

    move-object/from16 v17, v5

    move-object/from16 v48, v6

    move-object/from16 v49, v9

    move-object v5, v12

    move-object/from16 v18, v14

    move-object/from16 v16, v15

    const/16 v6, 0x8

    const/16 v34, -0x1

    move v15, v10

    move-object v14, v11

    if-ne v3, v6, :cond_3c

    goto :goto_2c

    :cond_3a
    move-object/from16 v4, p5

    move-object/from16 v17, v5

    move-object/from16 v48, v6

    move-object/from16 v49, v9

    move-object v5, v12

    move-object/from16 v18, v14

    move-object/from16 v16, v15

    const/16 v6, 0x8

    const/16 v34, -0x1

    move v15, v10

    move-object v14, v11

    :goto_2c
    if-eq v1, v15, :cond_3c

    add-int/lit8 v1, v1, 0x1

    move/from16 v13, p9

    move-object v12, v5

    move-object v11, v14

    move v10, v15

    move-object/from16 v15, v16

    move-object/from16 v5, v17

    move-object/from16 v14, v18

    move-object/from16 v3, v37

    move-object/from16 v4, v38

    move-object/from16 v6, v48

    move-object/from16 v9, v49

    const/16 v20, 0x0

    goto/16 :goto_1e

    :cond_3b
    move-object/from16 v4, p5

    move-object/from16 v35, v1

    move-object/from16 v37, v3

    move-object/from16 v17, v5

    move-object/from16 v48, v6

    move-object v14, v11

    move-object v5, v12

    .line 132
    :cond_3c
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_42

    .line 133
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v10, 0x1

    if-le v1, v10, :cond_3d

    new-instance v1, La/cbz;

    const/4 v11, 0x3

    invoke-direct {v1, v4, v11}, La/cbz;-><init>(Landroidx/compose/foundation/lazy/layout/c;B)V

    invoke-static {v1, v14}, La/v3d;->t(Ljava/util/Comparator;Ljava/util/List;)V

    .line 134
    :cond_3d
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_2d
    if-ge v3, v1, :cond_41

    .line 135
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 136
    check-cast v6, La/kbz;

    .line 137
    invoke-interface {v6}, La/kbz;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v2, v7}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v7, La/bbz;

    move/from16 v12, p7

    move-object/from16 v8, v17

    .line 138
    invoke-static {v8, v6, v12}, La/dbz;->h([ILa/kbz;Z)I

    move-result v9

    if-eqz p8, :cond_3f

    .line 139
    invoke-static/range {p4 .. p4}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/kbz;

    const/4 v11, 0x0

    .line 140
    invoke-interface {v10, v11}, La/kbz;->i(I)J

    move-result-wide v15

    if-eqz v12, :cond_3e

    and-long v10, v15, v23

    :goto_2e
    long-to-int v10, v10

    goto :goto_2f

    :cond_3e
    shr-long v10, v15, v22

    goto :goto_2e

    .line 141
    :cond_3f
    iget v10, v7, La/bbz;->f:I

    :goto_2f
    sub-int/2addr v10, v9

    .line 142
    iget v7, v7, La/bbz;->c:I

    move/from16 v9, p2

    move/from16 v11, p3

    .line 143
    invoke-interface {v6, v10, v7, v9, v11}, La/kbz;->a(IIII)V

    if-eqz v25, :cond_40

    const/4 v10, 0x1

    .line 144
    invoke-virtual {v0, v6, v10}, La/dbz;->g(La/kbz;Z)V

    :cond_40
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v17, v8

    goto :goto_2d

    :cond_41
    move/from16 v9, p2

    move/from16 v11, p3

    move/from16 v12, p7

    move-object/from16 v8, v17

    const/4 v3, 0x6

    const/4 v6, 0x0

    .line 145
    invoke-static {v8, v6, v6, v3}, La/qx3;->o([IIII)V

    goto :goto_30

    :cond_42
    move/from16 v9, p2

    move/from16 v11, p3

    move/from16 v12, p7

    move-object/from16 v8, v17

    .line 146
    :goto_30
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_45

    .line 147
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v10, 0x1

    if-le v1, v10, :cond_43

    new-instance v1, La/cbz;

    invoke-direct {v1, v4, v10}, La/cbz;-><init>(Landroidx/compose/foundation/lazy/layout/c;B)V

    invoke-static {v1, v5}, La/v3d;->t(Ljava/util/Comparator;Ljava/util/List;)V

    .line 148
    :cond_43
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_31
    if-ge v3, v1, :cond_45

    .line 149
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 150
    check-cast v4, La/kbz;

    .line 151
    invoke-interface {v4}, La/kbz;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v2, v6}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v6, La/bbz;

    .line 152
    invoke-static {v8, v4, v12}, La/dbz;->h([ILa/kbz;Z)I

    move-result v7

    .line 153
    iget v10, v6, La/bbz;->g:I

    .line 154
    invoke-static {v4, v12}, La/j120;->Z(La/kbz;Z)I

    move-result v13

    sub-int/2addr v10, v13

    add-int/2addr v10, v7

    .line 155
    iget v6, v6, La/bbz;->c:I

    .line 156
    invoke-interface {v4, v10, v6, v9, v11}, La/kbz;->a(IIII)V

    const/4 v10, 0x1

    if-eqz v25, :cond_44

    .line 157
    invoke-virtual {v0, v4, v10}, La/dbz;->g(La/kbz;Z)V

    :cond_44
    add-int/lit8 v3, v3, 0x1

    goto :goto_31

    .line 158
    :cond_45
    invoke-static {v14}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    move-object/from16 v4, p4

    const/4 v3, 0x0

    .line 159
    invoke-virtual {v4, v3, v14}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 160
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 161
    invoke-virtual/range {v37 .. v37}, Ljava/util/ArrayList;->clear()V

    .line 162
    invoke-virtual/range {v48 .. v48}, Ljava/util/ArrayList;->clear()V

    .line 163
    invoke-virtual {v14}, Ljava/util/ArrayList;->clear()V

    .line 164
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 165
    invoke-virtual/range {v35 .. v35}, La/iz40;->b()V

    return-void
.end method

.method public final e()V
    .locals 14

    .line 1
    iget-object p0, p0, La/dbz;->a:La/hz40;

    .line 2
    .line 3
    invoke-virtual {p0}, La/hz40;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_5

    .line 8
    .line 9
    iget-object v0, p0, La/hz40;->c:[Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v1, p0, La/hz40;->a:[J

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    add-int/lit8 v2, v2, -0x2

    .line 15
    .line 16
    if-ltz v2, :cond_4

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v3

    .line 20
    :goto_0
    aget-wide v5, v1, v4

    .line 21
    .line 22
    not-long v7, v5

    .line 23
    const/4 v9, 0x7

    .line 24
    shl-long/2addr v7, v9

    .line 25
    and-long/2addr v7, v5

    .line 26
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr v7, v9

    .line 32
    cmp-long v7, v7, v9

    .line 33
    .line 34
    if-eqz v7, :cond_3

    .line 35
    .line 36
    sub-int v7, v4, v2

    .line 37
    .line 38
    not-int v7, v7

    .line 39
    ushr-int/lit8 v7, v7, 0x1f

    .line 40
    .line 41
    const/16 v8, 0x8

    .line 42
    .line 43
    rsub-int/lit8 v7, v7, 0x8

    .line 44
    .line 45
    move v9, v3

    .line 46
    :goto_1
    if-ge v9, v7, :cond_2

    .line 47
    .line 48
    const-wide/16 v10, 0xff

    .line 49
    .line 50
    and-long/2addr v10, v5

    .line 51
    const-wide/16 v12, 0x80

    .line 52
    .line 53
    cmp-long v10, v10, v12

    .line 54
    .line 55
    if-gez v10, :cond_1

    .line 56
    .line 57
    shl-int/lit8 v10, v4, 0x3

    .line 58
    .line 59
    add-int/2addr v10, v9

    .line 60
    aget-object v10, v0, v10

    .line 61
    .line 62
    check-cast v10, La/bbz;

    .line 63
    .line 64
    iget-object v10, v10, La/bbz;->a:[La/zaz;

    .line 65
    .line 66
    array-length v11, v10

    .line 67
    move v12, v3

    .line 68
    :goto_2
    if-ge v12, v11, :cond_1

    .line 69
    .line 70
    aget-object v13, v10, v12

    .line 71
    .line 72
    if-eqz v13, :cond_0

    .line 73
    .line 74
    invoke-virtual {v13}, La/zaz;->d()V

    .line 75
    .line 76
    .line 77
    :cond_0
    add-int/lit8 v12, v12, 0x1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_1
    shr-long/2addr v5, v8

    .line 81
    add-int/lit8 v9, v9, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    if-ne v7, v8, :cond_4

    .line 85
    .line 86
    :cond_3
    if-eq v4, v2, :cond_4

    .line 87
    .line 88
    add-int/lit8 v4, v4, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    invoke-virtual {p0}, La/hz40;->a()V

    .line 92
    .line 93
    .line 94
    :cond_5
    return-void
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/dbz;->a:La/hz40;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/hz40;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/bbz;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, La/bbz;->a:[La/zaz;

    .line 12
    .line 13
    array-length p1, p0

    .line 14
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-ge v0, p1, :cond_1

    .line 16
    .line 17
    aget-object v1, p0, v0

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1}, La/zaz;->d()V

    .line 22
    .line 23
    .line 24
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-void
.end method

.method public final g(La/kbz;Z)V
    .locals 13

    .line 1
    iget-object p0, p0, La/dbz;->a:La/hz40;

    .line 2
    .line 3
    invoke-interface {p1}, La/kbz;->getKey()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    check-cast p0, La/bbz;

    .line 15
    .line 16
    iget-object p0, p0, La/bbz;->a:[La/zaz;

    .line 17
    .line 18
    array-length v0, p0

    .line 19
    const/4 v1, 0x0

    .line 20
    move v2, v1

    .line 21
    :goto_0
    if-ge v1, v0, :cond_3

    .line 22
    .line 23
    aget-object v4, p0, v1

    .line 24
    .line 25
    add-int/lit8 v10, v2, 0x1

    .line 26
    .line 27
    if-eqz v4, :cond_2

    .line 28
    .line 29
    invoke-interface {p1, v2}, La/kbz;->i(I)J

    .line 30
    .line 31
    .line 32
    move-result-wide v11

    .line 33
    iget-wide v2, v4, La/zaz;->l:J

    .line 34
    .line 35
    const-wide v5, 0x7fffffff7fffffffL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3, v5, v6}, La/ikx;->b(JJ)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_1

    .line 45
    .line 46
    invoke-static {v2, v3, v11, v12}, La/ikx;->b(JJ)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-nez v5, :cond_1

    .line 51
    .line 52
    invoke-static {v11, v12, v2, v3}, La/ikx;->c(JJ)J

    .line 53
    .line 54
    .line 55
    move-result-wide v2

    .line 56
    iget-object v5, v4, La/zaz;->e:La/cfq;

    .line 57
    .line 58
    if-nez v5, :cond_0

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    iget-object v6, v4, La/zaz;->r:La/pz40;

    .line 62
    .line 63
    check-cast v6, La/hgk0;

    .line 64
    .line 65
    invoke-virtual {v6}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    check-cast v6, La/ikx;

    .line 70
    .line 71
    iget-wide v6, v6, La/ikx;->a:J

    .line 72
    .line 73
    invoke-static {v6, v7, v2, v3}, La/ikx;->c(JJ)J

    .line 74
    .line 75
    .line 76
    move-result-wide v6

    .line 77
    invoke-virtual {v4, v6, v7}, La/zaz;->e(J)V

    .line 78
    .line 79
    .line 80
    iget-object v2, v4, La/zaz;->h:La/pz40;

    .line 81
    .line 82
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 83
    .line 84
    check-cast v2, La/hgk0;

    .line 85
    .line 86
    invoke-virtual {v2, v3}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iput-boolean p2, v4, La/zaz;->g:Z

    .line 90
    .line 91
    iget-object v2, v4, La/zaz;->a:La/vne;

    .line 92
    .line 93
    new-instance v3, La/n1;

    .line 94
    .line 95
    const/4 v8, 0x0

    .line 96
    const/16 v9, 0x11

    .line 97
    .line 98
    invoke-direct/range {v3 .. v9}, La/n1;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V

    .line 99
    .line 100
    .line 101
    const/4 v5, 0x3

    .line 102
    const/4 v6, 0x0

    .line 103
    invoke-static {v2, v6, v6, v3, v5}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 104
    .line 105
    .line 106
    :cond_1
    :goto_1
    iput-wide v11, v4, La/zaz;->l:J

    .line 107
    .line 108
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 109
    .line 110
    move v2, v10

    .line 111
    goto :goto_0

    .line 112
    :cond_3
    return-void
.end method
