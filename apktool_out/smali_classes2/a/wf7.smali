.class public final synthetic La/wf7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/wf7;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/wf7;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/wf7;->a:La/wf7;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.limits.ie.impl.data.models.requests.BetLimitsWithPeriodValueRequest"

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "limitValue"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "limitType"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "currency"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "numberOfPeriods"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    sput-object v1, La/wf7;->descriptor:La/ugi0;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 2

    .line 1
    const/4 p0, 0x4

    .line 2
    new-array p0, p0, [La/jiy;

    .line 3
    .line 4
    sget-object v0, La/tbl;->a:La/tbl;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aput-object v0, p0, v1

    .line 8
    .line 9
    sget-object v0, La/okx;->a:La/okx;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    aput-object v0, p0, v1

    .line 13
    .line 14
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    aput-object v0, p0, v1

    .line 18
    .line 19
    sget-object v0, La/s710;->a:La/s710;

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    aput-object v0, p0, v1

    .line 23
    .line 24
    return-object p0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 17

    .line 1
    sget-object v0, La/wf7;->descriptor:La/ugi0;

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
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const-wide/16 v7, 0x0

    .line 15
    .line 16
    move v10, v3

    .line 17
    move v13, v10

    .line 18
    move-wide v11, v4

    .line 19
    move-object v14, v6

    .line 20
    move-wide v15, v7

    .line 21
    move v4, v2

    .line 22
    :goto_0
    if-eqz v4, :cond_5

    .line 23
    .line 24
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    const/4 v7, -0x1

    .line 29
    if-eq v5, v7, :cond_4

    .line 30
    .line 31
    if-eqz v5, :cond_3

    .line 32
    .line 33
    if-eq v5, v2, :cond_2

    .line 34
    .line 35
    const/4 v7, 0x2

    .line 36
    if-eq v5, v7, :cond_1

    .line 37
    .line 38
    const/4 v7, 0x3

    .line 39
    if-ne v5, v7, :cond_0

    .line 40
    .line 41
    invoke-interface {v1, v0, v7}, La/bld;->r(La/ugi0;I)J

    .line 42
    .line 43
    .line 44
    move-result-wide v15

    .line 45
    or-int/lit8 v10, v10, 0x8

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {v5}, La/itt0;->c(I)V

    .line 49
    .line 50
    .line 51
    return-object v6

    .line 52
    :cond_1
    invoke-interface {v1, v0, v7}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v14

    .line 56
    or-int/lit8 v10, v10, 0x4

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-interface {v1, v0, v2}, La/bld;->j(La/ugi0;I)I

    .line 60
    .line 61
    .line 62
    move-result v13

    .line 63
    or-int/lit8 v10, v10, 0x2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    invoke-interface {v1, v0, v3}, La/bld;->t(La/ugi0;I)D

    .line 67
    .line 68
    .line 69
    move-result-wide v11

    .line 70
    or-int/lit8 v10, v10, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    move v4, v3

    .line 74
    goto :goto_0

    .line 75
    :cond_5
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 76
    .line 77
    .line 78
    new-instance v9, La/yf7;

    .line 79
    .line 80
    invoke-direct/range {v9 .. v16}, La/yf7;-><init>(IDILjava/lang/String;J)V

    .line 81
    .line 82
    .line 83
    return-object v9
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/wf7;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, La/yf7;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/wf7;->descriptor:La/ugi0;

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
    iget-wide v1, p2, La/yf7;->a:D

    .line 14
    .line 15
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->j(La/ugi0;ID)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iget v1, p2, La/yf7;->b:I

    .line 20
    .line 21
    invoke-interface {p1, v0, v1, p0}, La/cld;->i(IILa/ugi0;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    iget-object v1, p2, La/yf7;->c:Ljava/lang/String;

    .line 26
    .line 27
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    iget-wide v1, p2, La/yf7;->d:J

    .line 32
    .line 33
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
