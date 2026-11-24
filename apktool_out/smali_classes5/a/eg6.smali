.class public final synthetic La/eg6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/eg6;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/eg6;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/eg6;->a:La/eg6;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.sportgame.core.data.models.betbuilder.BetBuilderEventsRequest.GameKeyRequest"

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "gameId"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "gameVid"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "gameType"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "period"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    sput-object v1, La/eg6;->descriptor:La/ugi0;

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
    sget-object v0, La/s710;->a:La/s710;

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
    const/4 v1, 0x2

    .line 15
    aput-object v0, p0, v1

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    aput-object v0, p0, v1

    .line 19
    .line 20
    return-object p0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object p0, La/eg6;->descriptor:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p1, p0}, La/rkj;->a(La/ugi0;)La/bld;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    move v5, v1

    .line 12
    move v8, v5

    .line 13
    move v9, v8

    .line 14
    move v10, v9

    .line 15
    move-wide v6, v2

    .line 16
    move v2, v0

    .line 17
    :goto_0
    if-eqz v2, :cond_5

    .line 18
    .line 19
    invoke-interface {p1, p0}, La/bld;->f(La/ugi0;)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, -0x1

    .line 24
    if-eq v3, v4, :cond_4

    .line 25
    .line 26
    if-eqz v3, :cond_3

    .line 27
    .line 28
    if-eq v3, v0, :cond_2

    .line 29
    .line 30
    const/4 v4, 0x2

    .line 31
    if-eq v3, v4, :cond_1

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    if-ne v3, v4, :cond_0

    .line 35
    .line 36
    invoke-interface {p1, p0, v4}, La/bld;->j(La/ugi0;I)I

    .line 37
    .line 38
    .line 39
    move-result v10

    .line 40
    or-int/lit8 v5, v5, 0x8

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {v3}, La/itt0;->c(I)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0

    .line 48
    :cond_1
    invoke-interface {p1, p0, v4}, La/bld;->j(La/ugi0;I)I

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    or-int/lit8 v5, v5, 0x4

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-interface {p1, p0, v0}, La/bld;->j(La/ugi0;I)I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    or-int/lit8 v5, v5, 0x2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    invoke-interface {p1, p0, v1}, La/bld;->r(La/ugi0;I)J

    .line 63
    .line 64
    .line 65
    move-result-wide v6

    .line 66
    or-int/lit8 v5, v5, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    move v2, v1

    .line 70
    goto :goto_0

    .line 71
    :cond_5
    invoke-interface {p1, p0}, La/bld;->c(La/ugi0;)V

    .line 72
    .line 73
    .line 74
    new-instance v4, La/gg6;

    .line 75
    .line 76
    invoke-direct/range {v4 .. v10}, La/gg6;-><init>(IJIII)V

    .line 77
    .line 78
    .line 79
    return-object v4
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/eg6;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, La/gg6;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/eg6;->descriptor:La/ugi0;

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
    iget-wide v1, p2, La/gg6;->a:J

    .line 14
    .line 15
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iget v1, p2, La/gg6;->b:I

    .line 20
    .line 21
    invoke-interface {p1, v0, v1, p0}, La/cld;->i(IILa/ugi0;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    iget v1, p2, La/gg6;->c:I

    .line 26
    .line 27
    invoke-interface {p1, v0, v1, p0}, La/cld;->i(IILa/ugi0;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    iget p2, p2, La/gg6;->d:I

    .line 32
    .line 33
    invoke-interface {p1, v0, p2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
