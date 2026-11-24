.class public final synthetic La/cc9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/cc9;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/cc9;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/cc9;->a:La/cc9;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.betting.core.make_bet.data.model.BuilderEventRequest"

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "Coef"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "Param"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "Player"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "PlayerName"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "Type"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    sput-object v1, La/cc9;->descriptor:La/ugi0;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 3

    .line 1
    sget-object p0, La/ysm0;->a:La/ysm0;

    .line 2
    .line 3
    invoke-static {p0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x5

    .line 8
    new-array v1, v1, [La/jiy;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aput-object p0, v1, v2

    .line 12
    .line 13
    sget-object p0, La/tbl;->a:La/tbl;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    aput-object p0, v1, v2

    .line 17
    .line 18
    sget-object p0, La/s710;->a:La/s710;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    aput-object p0, v1, v2

    .line 22
    .line 23
    const/4 v2, 0x3

    .line 24
    aput-object v0, v1, v2

    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    aput-object p0, v1, v0

    .line 28
    .line 29
    return-object v1
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 19

    .line 1
    sget-object v0, La/cc9;->descriptor:La/ugi0;

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
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    const-wide/16 v5, 0x0

    .line 13
    .line 14
    const-wide/16 v7, 0x0

    .line 15
    .line 16
    move v12, v3

    .line 17
    move-object/from16 v17, v4

    .line 18
    .line 19
    move-wide v10, v5

    .line 20
    move-wide v13, v7

    .line 21
    move-wide v15, v13

    .line 22
    move v5, v2

    .line 23
    move-object/from16 v6, v17

    .line 24
    .line 25
    :goto_0
    if-eqz v5, :cond_6

    .line 26
    .line 27
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    const/4 v8, -0x1

    .line 32
    if-eq v7, v8, :cond_5

    .line 33
    .line 34
    if-eqz v7, :cond_4

    .line 35
    .line 36
    if-eq v7, v2, :cond_3

    .line 37
    .line 38
    const/4 v8, 0x2

    .line 39
    if-eq v7, v8, :cond_2

    .line 40
    .line 41
    const/4 v8, 0x3

    .line 42
    if-eq v7, v8, :cond_1

    .line 43
    .line 44
    const/4 v8, 0x4

    .line 45
    if-ne v7, v8, :cond_0

    .line 46
    .line 47
    invoke-interface {v1, v0, v8}, La/bld;->r(La/ugi0;I)J

    .line 48
    .line 49
    .line 50
    move-result-wide v15

    .line 51
    or-int/lit8 v12, v12, 0x10

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-static {v7}, La/itt0;->c(I)V

    .line 55
    .line 56
    .line 57
    return-object v4

    .line 58
    :cond_1
    sget-object v7, La/ysm0;->a:La/ysm0;

    .line 59
    .line 60
    invoke-interface {v1, v0, v8, v7, v6}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    check-cast v6, Ljava/lang/String;

    .line 65
    .line 66
    or-int/lit8 v12, v12, 0x8

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    invoke-interface {v1, v0, v8}, La/bld;->r(La/ugi0;I)J

    .line 70
    .line 71
    .line 72
    move-result-wide v13

    .line 73
    or-int/lit8 v12, v12, 0x4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    invoke-interface {v1, v0, v2}, La/bld;->t(La/ugi0;I)D

    .line 77
    .line 78
    .line 79
    move-result-wide v10

    .line 80
    or-int/lit8 v12, v12, 0x2

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    invoke-interface {v1, v0, v3}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v17

    .line 87
    or-int/lit8 v12, v12, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    move v5, v3

    .line 91
    goto :goto_0

    .line 92
    :cond_6
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 93
    .line 94
    .line 95
    new-instance v9, La/ec9;

    .line 96
    .line 97
    move-object/from16 v18, v6

    .line 98
    .line 99
    invoke-direct/range {v9 .. v18}, La/ec9;-><init>(DIJJLjava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-object v9
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/cc9;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, La/ec9;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/cc9;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    iget-object v1, p2, La/ec9;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iget-wide v1, p2, La/ec9;->b:D

    .line 20
    .line 21
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->j(La/ugi0;ID)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    iget-wide v1, p2, La/ec9;->c:J

    .line 26
    .line 27
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 28
    .line 29
    .line 30
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 31
    .line 32
    iget-object v1, p2, La/ec9;->d:Ljava/lang/String;

    .line 33
    .line 34
    const/4 v2, 0x3

    .line 35
    invoke-interface {p1, p0, v2, v0, v1}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x4

    .line 39
    iget-wide v1, p2, La/ec9;->e:J

    .line 40
    .line 41
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
