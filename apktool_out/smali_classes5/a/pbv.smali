.class public final La/pbv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/obv;

.field public static final s:[La/a8z;


# instance fields
.field public final a:J

.field public final b:Ljava/util/List;

.field public final c:Ljava/lang/String;

.field public final d:La/hcs;

.field public final e:La/a570;

.field public final f:Ljava/lang/String;

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:Z

.field public final n:La/hds;

.field public final o:Z

.field public final p:Z

.field public final q:Z

.field public final r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/obv;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/pbv;->Companion:La/obv;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/tet;

    .line 11
    .line 12
    const/16 v2, 0x1c

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/tet;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/16 v1, 0x12

    .line 22
    .line 23
    new-array v1, v1, [La/a8z;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    aput-object v3, v1, v2

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    aput-object v0, v1, v2

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    aput-object v3, v1, v0

    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    aput-object v3, v1, v0

    .line 37
    .line 38
    const/4 v0, 0x4

    .line 39
    aput-object v3, v1, v0

    .line 40
    .line 41
    const/4 v0, 0x5

    .line 42
    aput-object v3, v1, v0

    .line 43
    .line 44
    const/4 v0, 0x6

    .line 45
    aput-object v3, v1, v0

    .line 46
    .line 47
    const/4 v0, 0x7

    .line 48
    aput-object v3, v1, v0

    .line 49
    .line 50
    const/16 v0, 0x8

    .line 51
    .line 52
    aput-object v3, v1, v0

    .line 53
    .line 54
    const/16 v0, 0x9

    .line 55
    .line 56
    aput-object v3, v1, v0

    .line 57
    .line 58
    const/16 v0, 0xa

    .line 59
    .line 60
    aput-object v3, v1, v0

    .line 61
    .line 62
    const/16 v0, 0xb

    .line 63
    .line 64
    aput-object v3, v1, v0

    .line 65
    .line 66
    const/16 v0, 0xc

    .line 67
    .line 68
    aput-object v3, v1, v0

    .line 69
    .line 70
    const/16 v0, 0xd

    .line 71
    .line 72
    aput-object v3, v1, v0

    .line 73
    .line 74
    const/16 v0, 0xe

    .line 75
    .line 76
    aput-object v3, v1, v0

    .line 77
    .line 78
    const/16 v0, 0xf

    .line 79
    .line 80
    aput-object v3, v1, v0

    .line 81
    .line 82
    const/16 v0, 0x10

    .line 83
    .line 84
    aput-object v3, v1, v0

    .line 85
    .line 86
    const/16 v0, 0x11

    .line 87
    .line 88
    aput-object v3, v1, v0

    .line 89
    .line 90
    sput-object v1, La/pbv;->s:[La/a8z;

    .line 91
    .line 92
    return-void
.end method

.method public synthetic constructor <init>(IJLjava/util/List;Ljava/lang/String;La/hcs;La/a570;Ljava/lang/String;ZZZZZZZLa/hds;ZZZZ)V
    .locals 2

    .line 1
    const v0, 0xefff

    .line 2
    .line 3
    .line 4
    and-int v1, p1, v0

    .line 5
    .line 6
    if-ne v0, v1, :cond_3

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-wide p2, p0, La/pbv;->a:J

    .line 12
    .line 13
    iput-object p4, p0, La/pbv;->b:Ljava/util/List;

    .line 14
    .line 15
    iput-object p5, p0, La/pbv;->c:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p6, p0, La/pbv;->d:La/hcs;

    .line 18
    .line 19
    iput-object p7, p0, La/pbv;->e:La/a570;

    .line 20
    .line 21
    iput-object p8, p0, La/pbv;->f:Ljava/lang/String;

    .line 22
    .line 23
    iput-boolean p9, p0, La/pbv;->g:Z

    .line 24
    .line 25
    iput-boolean p10, p0, La/pbv;->h:Z

    .line 26
    .line 27
    iput-boolean p11, p0, La/pbv;->i:Z

    .line 28
    .line 29
    iput-boolean p12, p0, La/pbv;->j:Z

    .line 30
    .line 31
    iput-boolean p13, p0, La/pbv;->k:Z

    .line 32
    .line 33
    move/from16 p2, p14

    .line 34
    .line 35
    iput-boolean p2, p0, La/pbv;->l:Z

    .line 36
    .line 37
    and-int/lit16 p2, p1, 0x1000

    .line 38
    .line 39
    const/4 p3, 0x0

    .line 40
    if-nez p2, :cond_0

    .line 41
    .line 42
    iput-boolean p3, p0, La/pbv;->m:Z

    .line 43
    .line 44
    :goto_0
    move-object/from16 p2, p16

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    move/from16 p2, p15

    .line 48
    .line 49
    iput-boolean p2, p0, La/pbv;->m:Z

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :goto_1
    iput-object p2, p0, La/pbv;->n:La/hds;

    .line 53
    .line 54
    move/from16 p2, p17

    .line 55
    .line 56
    iput-boolean p2, p0, La/pbv;->o:Z

    .line 57
    .line 58
    move/from16 p2, p18

    .line 59
    .line 60
    iput-boolean p2, p0, La/pbv;->p:Z

    .line 61
    .line 62
    const/high16 p2, 0x10000

    .line 63
    .line 64
    and-int/2addr p2, p1

    .line 65
    if-nez p2, :cond_1

    .line 66
    .line 67
    const/4 p2, 0x1

    .line 68
    :goto_2
    iput-boolean p2, p0, La/pbv;->q:Z

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_1
    move/from16 p2, p19

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :goto_3
    const/high16 p2, 0x20000

    .line 75
    .line 76
    and-int/2addr p1, p2

    .line 77
    if-nez p1, :cond_2

    .line 78
    .line 79
    iput-boolean p3, p0, La/pbv;->r:Z

    .line 80
    .line 81
    return-void

    .line 82
    :cond_2
    move/from16 p1, p20

    .line 83
    .line 84
    iput-boolean p1, p0, La/pbv;->r:Z

    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    sget-object p0, La/nbv;->a:La/nbv;

    .line 88
    .line 89
    invoke-virtual {p0}, La/nbv;->getDescriptor()La/ugi0;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p1, v0, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 94
    .line 95
    .line 96
    const/4 p0, 0x0

    .line 97
    throw p0
.end method

.method public synthetic constructor <init>(JLjava/util/List;Ljava/lang/String;La/hcs;La/a570;Ljava/lang/String;ZZZZZZLa/hds;ZZZI)V
    .locals 21

    const/high16 v0, 0x20000

    and-int v0, p18, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move/from16 v20, v0

    goto :goto_0

    :cond_0
    move/from16 v20, p17

    :goto_0
    const/4 v15, 0x0

    const/16 v19, 0x1

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v16, p14

    move/from16 v17, p15

    move/from16 v18, p16

    .line 117
    invoke-direct/range {v1 .. v20}, La/pbv;-><init>(JLjava/util/List;Ljava/lang/String;La/hcs;La/a570;Ljava/lang/String;ZZZZZZZLa/hds;ZZZZ)V

    return-void
.end method

.method public constructor <init>(JLjava/util/List;Ljava/lang/String;La/hcs;La/a570;Ljava/lang/String;ZZZZZZZLa/hds;ZZZZ)V
    .locals 0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    iput-wide p1, p0, La/pbv;->a:J

    .line 100
    iput-object p3, p0, La/pbv;->b:Ljava/util/List;

    .line 101
    iput-object p4, p0, La/pbv;->c:Ljava/lang/String;

    .line 102
    iput-object p5, p0, La/pbv;->d:La/hcs;

    .line 103
    iput-object p6, p0, La/pbv;->e:La/a570;

    .line 104
    iput-object p7, p0, La/pbv;->f:Ljava/lang/String;

    .line 105
    iput-boolean p8, p0, La/pbv;->g:Z

    .line 106
    iput-boolean p9, p0, La/pbv;->h:Z

    .line 107
    iput-boolean p10, p0, La/pbv;->i:Z

    .line 108
    iput-boolean p11, p0, La/pbv;->j:Z

    .line 109
    iput-boolean p12, p0, La/pbv;->k:Z

    .line 110
    iput-boolean p13, p0, La/pbv;->l:Z

    .line 111
    iput-boolean p14, p0, La/pbv;->m:Z

    .line 112
    iput-object p15, p0, La/pbv;->n:La/hds;

    move/from16 p1, p16

    .line 113
    iput-boolean p1, p0, La/pbv;->o:Z

    move/from16 p1, p17

    .line 114
    iput-boolean p1, p0, La/pbv;->p:Z

    move/from16 p1, p18

    .line 115
    iput-boolean p1, p0, La/pbv;->q:Z

    move/from16 p1, p19

    .line 116
    iput-boolean p1, p0, La/pbv;->r:Z

    return-void
.end method

.method public static a(La/pbv;La/hds;ZZI)La/pbv;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p4

    .line 4
    .line 5
    iget-wide v2, v0, La/pbv;->a:J

    .line 6
    .line 7
    move-wide v4, v2

    .line 8
    iget-object v3, v0, La/pbv;->b:Ljava/util/List;

    .line 9
    .line 10
    move-wide v5, v4

    .line 11
    iget-object v4, v0, La/pbv;->c:Ljava/lang/String;

    .line 12
    .line 13
    move-wide v6, v5

    .line 14
    iget-object v5, v0, La/pbv;->d:La/hcs;

    .line 15
    .line 16
    move-wide v7, v6

    .line 17
    iget-object v6, v0, La/pbv;->e:La/a570;

    .line 18
    .line 19
    move-wide v8, v7

    .line 20
    iget-object v7, v0, La/pbv;->f:Ljava/lang/String;

    .line 21
    .line 22
    move-wide v9, v8

    .line 23
    iget-boolean v8, v0, La/pbv;->g:Z

    .line 24
    .line 25
    move-wide v10, v9

    .line 26
    iget-boolean v9, v0, La/pbv;->h:Z

    .line 27
    .line 28
    move-wide v11, v10

    .line 29
    iget-boolean v10, v0, La/pbv;->i:Z

    .line 30
    .line 31
    move-wide v12, v11

    .line 32
    iget-boolean v11, v0, La/pbv;->j:Z

    .line 33
    .line 34
    move-wide v13, v12

    .line 35
    iget-boolean v12, v0, La/pbv;->k:Z

    .line 36
    .line 37
    move-wide v14, v13

    .line 38
    iget-boolean v13, v0, La/pbv;->l:Z

    .line 39
    .line 40
    move-wide v15, v14

    .line 41
    iget-boolean v14, v0, La/pbv;->m:Z

    .line 42
    .line 43
    and-int/lit16 v2, v1, 0x2000

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    iget-object v2, v0, La/pbv;->n:La/hds;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move-object/from16 v2, p1

    .line 51
    .line 52
    :goto_0
    iget-boolean v1, v0, La/pbv;->o:Z

    .line 53
    .line 54
    const v17, 0x8000

    .line 55
    .line 56
    .line 57
    and-int v17, p4, v17

    .line 58
    .line 59
    if-eqz v17, :cond_1

    .line 60
    .line 61
    move/from16 v17, v1

    .line 62
    .line 63
    iget-boolean v1, v0, La/pbv;->p:Z

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    move/from16 v17, v1

    .line 67
    .line 68
    move/from16 v1, p2

    .line 69
    .line 70
    :goto_1
    const/high16 v18, 0x10000

    .line 71
    .line 72
    and-int v18, p4, v18

    .line 73
    .line 74
    move/from16 p1, v1

    .line 75
    .line 76
    if-eqz v18, :cond_2

    .line 77
    .line 78
    iget-boolean v1, v0, La/pbv;->q:Z

    .line 79
    .line 80
    move/from16 v18, v1

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    move/from16 v18, p3

    .line 84
    .line 85
    :goto_2
    iget-boolean v1, v0, La/pbv;->r:Z

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    new-instance v0, La/pbv;

    .line 109
    .line 110
    move/from16 v19, v1

    .line 111
    .line 112
    move/from16 v20, v17

    .line 113
    .line 114
    move/from16 v17, p1

    .line 115
    .line 116
    move-wide/from16 v21, v15

    .line 117
    .line 118
    move-object v15, v2

    .line 119
    move-wide/from16 v1, v21

    .line 120
    .line 121
    move/from16 v16, v20

    .line 122
    .line 123
    invoke-direct/range {v0 .. v19}, La/pbv;-><init>(JLjava/util/List;Ljava/lang/String;La/hcs;La/a570;Ljava/lang/String;ZZZZZZZLa/hds;ZZZZ)V

    .line 124
    .line 125
    .line 126
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/pbv;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/pbv;

    .line 12
    .line 13
    iget-wide v3, p0, La/pbv;->a:J

    .line 14
    .line 15
    iget-wide v5, p1, La/pbv;->a:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    iget-object v1, p0, La/pbv;->b:Ljava/util/List;

    .line 23
    .line 24
    iget-object v3, p1, La/pbv;->b:Ljava/util/List;

    .line 25
    .line 26
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget-object v1, p0, La/pbv;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v3, p1, La/pbv;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_4

    .line 42
    .line 43
    return v2

    .line 44
    :cond_4
    iget-object v1, p0, La/pbv;->d:La/hcs;

    .line 45
    .line 46
    iget-object v3, p1, La/pbv;->d:La/hcs;

    .line 47
    .line 48
    if-eq v1, v3, :cond_5

    .line 49
    .line 50
    return v2

    .line 51
    :cond_5
    iget-object v1, p0, La/pbv;->e:La/a570;

    .line 52
    .line 53
    iget-object v3, p1, La/pbv;->e:La/a570;

    .line 54
    .line 55
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_6

    .line 60
    .line 61
    return v2

    .line 62
    :cond_6
    iget-object v1, p0, La/pbv;->f:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v3, p1, La/pbv;->f:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_7

    .line 71
    .line 72
    return v2

    .line 73
    :cond_7
    iget-boolean v1, p0, La/pbv;->g:Z

    .line 74
    .line 75
    iget-boolean v3, p1, La/pbv;->g:Z

    .line 76
    .line 77
    if-eq v1, v3, :cond_8

    .line 78
    .line 79
    return v2

    .line 80
    :cond_8
    iget-boolean v1, p0, La/pbv;->h:Z

    .line 81
    .line 82
    iget-boolean v3, p1, La/pbv;->h:Z

    .line 83
    .line 84
    if-eq v1, v3, :cond_9

    .line 85
    .line 86
    return v2

    .line 87
    :cond_9
    iget-boolean v1, p0, La/pbv;->i:Z

    .line 88
    .line 89
    iget-boolean v3, p1, La/pbv;->i:Z

    .line 90
    .line 91
    if-eq v1, v3, :cond_a

    .line 92
    .line 93
    return v2

    .line 94
    :cond_a
    iget-boolean v1, p0, La/pbv;->j:Z

    .line 95
    .line 96
    iget-boolean v3, p1, La/pbv;->j:Z

    .line 97
    .line 98
    if-eq v1, v3, :cond_b

    .line 99
    .line 100
    return v2

    .line 101
    :cond_b
    iget-boolean v1, p0, La/pbv;->k:Z

    .line 102
    .line 103
    iget-boolean v3, p1, La/pbv;->k:Z

    .line 104
    .line 105
    if-eq v1, v3, :cond_c

    .line 106
    .line 107
    return v2

    .line 108
    :cond_c
    iget-boolean v1, p0, La/pbv;->l:Z

    .line 109
    .line 110
    iget-boolean v3, p1, La/pbv;->l:Z

    .line 111
    .line 112
    if-eq v1, v3, :cond_d

    .line 113
    .line 114
    return v2

    .line 115
    :cond_d
    iget-boolean v1, p0, La/pbv;->m:Z

    .line 116
    .line 117
    iget-boolean v3, p1, La/pbv;->m:Z

    .line 118
    .line 119
    if-eq v1, v3, :cond_e

    .line 120
    .line 121
    return v2

    .line 122
    :cond_e
    iget-object v1, p0, La/pbv;->n:La/hds;

    .line 123
    .line 124
    iget-object v3, p1, La/pbv;->n:La/hds;

    .line 125
    .line 126
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-nez v1, :cond_f

    .line 131
    .line 132
    return v2

    .line 133
    :cond_f
    iget-boolean v1, p0, La/pbv;->o:Z

    .line 134
    .line 135
    iget-boolean v3, p1, La/pbv;->o:Z

    .line 136
    .line 137
    if-eq v1, v3, :cond_10

    .line 138
    .line 139
    return v2

    .line 140
    :cond_10
    iget-boolean v1, p0, La/pbv;->p:Z

    .line 141
    .line 142
    iget-boolean v3, p1, La/pbv;->p:Z

    .line 143
    .line 144
    if-eq v1, v3, :cond_11

    .line 145
    .line 146
    return v2

    .line 147
    :cond_11
    iget-boolean v1, p0, La/pbv;->q:Z

    .line 148
    .line 149
    iget-boolean v3, p1, La/pbv;->q:Z

    .line 150
    .line 151
    if-eq v1, v3, :cond_12

    .line 152
    .line 153
    return v2

    .line 154
    :cond_12
    iget-boolean p0, p0, La/pbv;->r:Z

    .line 155
    .line 156
    iget-boolean p1, p1, La/pbv;->r:Z

    .line 157
    .line 158
    if-eq p0, p1, :cond_13

    .line 159
    .line 160
    return v2

    .line 161
    :cond_13
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, La/pbv;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, La/pbv;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/pbv;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/pbv;->d:La/hcs;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object v0, p0, La/pbv;->e:La/a570;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    add-int/2addr v0, v2

    .line 37
    mul-int/2addr v0, v1

    .line 38
    iget-object v2, p0, La/pbv;->f:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-boolean v2, p0, La/pbv;->g:Z

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-boolean v2, p0, La/pbv;->h:Z

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-boolean v2, p0, La/pbv;->i:Z

    .line 57
    .line 58
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-boolean v2, p0, La/pbv;->j:Z

    .line 63
    .line 64
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-boolean v2, p0, La/pbv;->k:Z

    .line 69
    .line 70
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-boolean v2, p0, La/pbv;->l:Z

    .line 75
    .line 76
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-boolean v2, p0, La/pbv;->m:Z

    .line 81
    .line 82
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-object v2, p0, La/pbv;->n:La/hds;

    .line 87
    .line 88
    invoke-virtual {v2}, La/hds;->hashCode()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    add-int/2addr v2, v0

    .line 93
    mul-int/2addr v2, v1

    .line 94
    iget-boolean v0, p0, La/pbv;->o:Z

    .line 95
    .line 96
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-boolean v2, p0, La/pbv;->p:Z

    .line 101
    .line 102
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iget-boolean v2, p0, La/pbv;->q:Z

    .line 107
    .line 108
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iget-boolean p0, p0, La/pbv;->r:Z

    .line 113
    .line 114
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    add-int/2addr p0, v0

    .line 119
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "GpResult(id="

    .line 2
    .line 3
    const-string v1, ", applyCategories="

    .line 4
    .line 5
    iget-wide v2, p0, La/pbv;->a:J

    .line 6
    .line 7
    iget-object v4, p0, La/pbv;->b:Ljava/util/List;

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, v4}, La/cs0;->p(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", gameName="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/pbv;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", gameFlag="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/pbv;->d:La/hcs;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", gameType="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/pbv;->e:La/a570;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", maxCoef="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/pbv;->f:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", isGameWithCashback="

    .line 54
    .line 55
    const-string v2, ", isBonusAllowedFromSecondaryAccount="

    .line 56
    .line 57
    iget-boolean v3, p0, La/pbv;->g:Z

    .line 58
    .line 59
    iget-boolean v4, p0, La/pbv;->h:Z

    .line 60
    .line 61
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 62
    .line 63
    .line 64
    const-string v1, ", isBonusAccountAllowed="

    .line 65
    .line 66
    const-string v2, ", availabilityGameFromBonusAcc="

    .line 67
    .line 68
    iget-boolean v3, p0, La/pbv;->i:Z

    .line 69
    .line 70
    iget-boolean v4, p0, La/pbv;->j:Z

    .line 71
    .line 72
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 73
    .line 74
    .line 75
    const-string v1, ", forceIFrame="

    .line 76
    .line 77
    const-string v2, ", bonusAllowed="

    .line 78
    .line 79
    iget-boolean v3, p0, La/pbv;->k:Z

    .line 80
    .line 81
    iget-boolean v4, p0, La/pbv;->l:Z

    .line 82
    .line 83
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 84
    .line 85
    .line 86
    const-string v1, ", favoriteGame="

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget-boolean v1, p0, La/pbv;->m:Z

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, ", imageInfo="

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    iget-object v1, p0, La/pbv;->n:La/hds;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v1, ", demoModeAvailable="

    .line 107
    .line 108
    const-string v2, ", underMaintenance="

    .line 109
    .line 110
    iget-boolean v3, p0, La/pbv;->o:Z

    .line 111
    .line 112
    iget-boolean v4, p0, La/pbv;->p:Z

    .line 113
    .line 114
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 115
    .line 116
    .line 117
    const-string v1, ", enable="

    .line 118
    .line 119
    const-string v2, ", fullScreenEnable="

    .line 120
    .line 121
    iget-boolean v3, p0, La/pbv;->q:Z

    .line 122
    .line 123
    iget-boolean p0, p0, La/pbv;->r:Z

    .line 124
    .line 125
    invoke-static {v1, v2, v0, v3, p0}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 126
    .line 127
    .line 128
    const-string p0, ")"

    .line 129
    .line 130
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0
.end method
