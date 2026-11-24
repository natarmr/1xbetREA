.class public final synthetic La/quy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/quy;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/quy;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/quy;->a:La/quy;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.feature.online_call.api.domain.language_selector_block_status.model.LanguageSelectorBlockModel"

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "clickStatus"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "isSubsequentBlock"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "endBlockingTime"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "lastRoundedBlockTime"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "isUnfinishedBlockTimeLeft"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    sput-object v1, La/quy;->descriptor:La/ugi0;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 3

    .line 1
    sget-object p0, La/suy;->f:[La/a8z;

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    new-array v0, v0, [La/jiy;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aget-object p0, p0, v1

    .line 8
    .line 9
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    aput-object p0, v0, v1

    .line 14
    .line 15
    sget-object p0, La/sm8;->a:La/sm8;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    aput-object p0, v0, v1

    .line 19
    .line 20
    sget-object v1, La/s710;->a:La/s710;

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    aput-object v1, v0, v2

    .line 24
    .line 25
    const/4 v2, 0x3

    .line 26
    aput-object v1, v0, v2

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    aput-object p0, v0, v1

    .line 30
    .line 31
    return-object v0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 17

    .line 1
    sget-object v0, La/quy;->descriptor:La/ugi0;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1, v0}, La/rkj;->a(La/ugi0;)La/bld;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, La/suy;->f:[La/a8z;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const-wide/16 v6, 0x0

    .line 15
    .line 16
    move v9, v4

    .line 17
    move v11, v9

    .line 18
    move/from16 v16, v11

    .line 19
    .line 20
    move-object v10, v5

    .line 21
    move-wide v12, v6

    .line 22
    move-wide v14, v12

    .line 23
    move v6, v3

    .line 24
    :goto_0
    if-eqz v6, :cond_6

    .line 25
    .line 26
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    const/4 v8, -0x1

    .line 31
    if-eq v7, v8, :cond_5

    .line 32
    .line 33
    if-eqz v7, :cond_4

    .line 34
    .line 35
    if-eq v7, v3, :cond_3

    .line 36
    .line 37
    const/4 v8, 0x2

    .line 38
    if-eq v7, v8, :cond_2

    .line 39
    .line 40
    const/4 v8, 0x3

    .line 41
    if-eq v7, v8, :cond_1

    .line 42
    .line 43
    const/4 v8, 0x4

    .line 44
    if-ne v7, v8, :cond_0

    .line 45
    .line 46
    invoke-interface {v1, v0, v8}, La/bld;->B(La/ugi0;I)Z

    .line 47
    .line 48
    .line 49
    move-result v16

    .line 50
    or-int/lit8 v9, v9, 0x10

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-static {v7}, La/itt0;->c(I)V

    .line 54
    .line 55
    .line 56
    return-object v5

    .line 57
    :cond_1
    invoke-interface {v1, v0, v8}, La/bld;->r(La/ugi0;I)J

    .line 58
    .line 59
    .line 60
    move-result-wide v14

    .line 61
    or-int/lit8 v9, v9, 0x8

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-interface {v1, v0, v8}, La/bld;->r(La/ugi0;I)J

    .line 65
    .line 66
    .line 67
    move-result-wide v12

    .line 68
    or-int/lit8 v9, v9, 0x4

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    invoke-interface {v1, v0, v3}, La/bld;->B(La/ugi0;I)Z

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    or-int/lit8 v9, v9, 0x2

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    aget-object v7, v2, v4

    .line 79
    .line 80
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    check-cast v7, La/jiy;

    .line 85
    .line 86
    invoke-interface {v1, v0, v4, v7, v10}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    move-object v10, v7

    .line 91
    check-cast v10, La/wuy;

    .line 92
    .line 93
    or-int/lit8 v9, v9, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_5
    move v6, v4

    .line 97
    goto :goto_0

    .line 98
    :cond_6
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 99
    .line 100
    .line 101
    new-instance v8, La/suy;

    .line 102
    .line 103
    invoke-direct/range {v8 .. v16}, La/suy;-><init>(ILa/wuy;ZJJZ)V

    .line 104
    .line 105
    .line 106
    return-object v8
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/quy;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, La/suy;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/quy;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, La/suy;->f:[La/a8z;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    aget-object v0, v0, v1

    .line 16
    .line 17
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, La/jiy;

    .line 22
    .line 23
    iget-object v2, p2, La/suy;->a:La/wuy;

    .line 24
    .line 25
    invoke-interface {p1, p0, v1, v0, v2}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    iget-boolean v1, p2, La/suy;->b:Z

    .line 30
    .line 31
    invoke-interface {p1, p0, v0, v1}, La/cld;->x(La/ugi0;IZ)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x2

    .line 35
    iget-wide v1, p2, La/suy;->c:J

    .line 36
    .line 37
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x3

    .line 41
    iget-wide v1, p2, La/suy;->d:J

    .line 42
    .line 43
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x4

    .line 47
    iget-boolean p2, p2, La/suy;->e:Z

    .line 48
    .line 49
    invoke-interface {p1, p0, v0, p2}, La/cld;->x(La/ugi0;IZ)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method
