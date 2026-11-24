.class public abstract La/pzp0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;

.field public static final b:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/ozp0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La/ozp0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v2, La/zfn;

    .line 8
    .line 9
    invoke-direct {v2, v0, v1}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 10
    .line 11
    .line 12
    sput-object v2, La/pzp0;->a:La/zfn;

    .line 13
    .line 14
    sget-object v0, La/pul;->r:La/pul;

    .line 15
    .line 16
    new-instance v2, La/zfn;

    .line 17
    .line 18
    invoke-direct {v2, v0, v1}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 19
    .line 20
    .line 21
    sput-object v2, La/pzp0;->b:La/zfn;

    .line 22
    .line 23
    return-void
.end method

.method public static final a(La/ugd;La/fet;I)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    const v3, 0x277d80e8

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v3}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v3, v2, 0x3

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    if-eq v3, v4, :cond_0

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v3, 0x0

    .line 21
    :goto_0
    and-int/lit8 v5, v2, 0x1

    .line 22
    .line 23
    invoke-virtual {v1, v5, v3}, La/fet;->U(IZ)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    sget-object v11, La/j1t0;->c:La/qrq;

    .line 30
    .line 31
    sget-wide v8, La/qmk;->s:J

    .line 32
    .line 33
    sget-wide v17, La/qmk;->G:J

    .line 34
    .line 35
    new-instance v5, La/y9q0;

    .line 36
    .line 37
    const/16 v16, 0x0

    .line 38
    .line 39
    const v19, 0xfdffdd

    .line 40
    .line 41
    .line 42
    const-wide/16 v6, 0x0

    .line 43
    .line 44
    const/4 v10, 0x0

    .line 45
    const-wide/16 v12, 0x0

    .line 46
    .line 47
    const/4 v14, 0x0

    .line 48
    const/4 v15, 0x0

    .line 49
    invoke-direct/range {v5 .. v19}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 50
    .line 51
    .line 52
    sget-object v3, La/pzp0;->a:La/zfn;

    .line 53
    .line 54
    invoke-virtual {v3, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    sget-object v5, La/s6t0;->a:La/pz40;

    .line 59
    .line 60
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    iget-object v5, v5, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 65
    .line 66
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 67
    .line 68
    .line 69
    move-result-wide v5

    .line 70
    new-instance v7, La/y3d;

    .line 71
    .line 72
    invoke-direct {v7, v5, v6}, La/y3d;-><init>(J)V

    .line 73
    .line 74
    .line 75
    sget-object v5, La/pzp0;->b:La/zfn;

    .line 76
    .line 77
    invoke-virtual {v5, v7}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    filled-new-array {v3, v5}, [La/l5d0;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    const/16 v5, 0x30

    .line 86
    .line 87
    invoke-static {v3, v0, v1, v5}, La/obc;->e([La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    invoke-virtual {v1}, La/fet;->X()V

    .line 92
    .line 93
    .line 94
    :goto_1
    invoke-virtual {v1}, La/fet;->u()La/yfe0;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    if-eqz v1, :cond_2

    .line 99
    .line 100
    new-instance v3, La/kqj0;

    .line 101
    .line 102
    invoke-direct {v3, v0, v2, v4}, La/kqj0;-><init>(La/ugd;IB)V

    .line 103
    .line 104
    .line 105
    iput-object v3, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 106
    .line 107
    :cond_2
    return-void
.end method

.method public static final b(La/ugd;La/fet;I)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    const v3, -0x30f1dc52

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v3}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v3, v2, 0x3

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    const/4 v5, 0x2

    .line 17
    if-eq v3, v5, :cond_0

    .line 18
    .line 19
    move v3, v4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v3, 0x0

    .line 22
    :goto_0
    and-int/lit8 v5, v2, 0x1

    .line 23
    .line 24
    invoke-virtual {v1, v5, v3}, La/fet;->U(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    sget-object v11, La/j1t0;->b:La/qrq;

    .line 31
    .line 32
    sget-wide v8, La/qmk;->q:J

    .line 33
    .line 34
    sget-wide v17, La/qmk;->D:J

    .line 35
    .line 36
    new-instance v5, La/y9q0;

    .line 37
    .line 38
    const/16 v16, 0x0

    .line 39
    .line 40
    const v19, 0xfdff9d

    .line 41
    .line 42
    .line 43
    const-wide/16 v6, 0x0

    .line 44
    .line 45
    const/4 v10, 0x0

    .line 46
    const-wide/16 v12, 0x0

    .line 47
    .line 48
    const/4 v14, 0x0

    .line 49
    const/4 v15, 0x0

    .line 50
    invoke-direct/range {v5 .. v19}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 51
    .line 52
    .line 53
    sget-object v3, La/pzp0;->a:La/zfn;

    .line 54
    .line 55
    invoke-virtual {v3, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    sget-object v5, La/s6t0;->a:La/pz40;

    .line 60
    .line 61
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    iget-object v5, v5, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 66
    .line 67
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 68
    .line 69
    .line 70
    move-result-wide v5

    .line 71
    new-instance v7, La/y3d;

    .line 72
    .line 73
    invoke-direct {v7, v5, v6}, La/y3d;-><init>(J)V

    .line 74
    .line 75
    .line 76
    sget-object v5, La/pzp0;->b:La/zfn;

    .line 77
    .line 78
    invoke-virtual {v5, v7}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    filled-new-array {v3, v5}, [La/l5d0;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    const/16 v5, 0x30

    .line 87
    .line 88
    invoke-static {v3, v0, v1, v5}, La/obc;->e([La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    invoke-virtual {v1}, La/fet;->X()V

    .line 93
    .line 94
    .line 95
    :goto_1
    invoke-virtual {v1}, La/fet;->u()La/yfe0;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    if-eqz v1, :cond_2

    .line 100
    .line 101
    new-instance v3, La/kqj0;

    .line 102
    .line 103
    invoke-direct {v3, v0, v2, v4}, La/kqj0;-><init>(La/ugd;IB)V

    .line 104
    .line 105
    .line 106
    iput-object v3, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 107
    .line 108
    :cond_2
    return-void
.end method
