.class public final synthetic La/xos;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/xos;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/xos;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/xos;->a:La/xos;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.cyber.game.core.game_details.domain.model.GameRequestState.FetchGameDetails"

    .line 11
    .line 12
    const/4 v3, 0x3

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
    const-string v0, "feedKind"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "sportId"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    sput-object v1, La/xos;->descriptor:La/ugi0;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 3

    .line 1
    sget-object p0, La/zos;->d:[La/a8z;

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    new-array v0, v0, [La/jiy;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    sget-object v2, La/zcs;->a:La/zcs;

    .line 8
    .line 9
    aput-object v2, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    aget-object p0, p0, v1

    .line 13
    .line 14
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    aput-object p0, v0, v1

    .line 19
    .line 20
    const/4 p0, 0x2

    .line 21
    sget-object v1, La/s710;->a:La/s710;

    .line 22
    .line 23
    aput-object v1, v0, p0

    .line 24
    .line 25
    return-object v0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object p0, La/xos;->descriptor:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p1, p0}, La/rkj;->a(La/ugi0;)La/bld;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, La/zos;->d:[La/a8z;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    move v7, v2

    .line 15
    move-object v8, v3

    .line 16
    move-object v9, v8

    .line 17
    move-wide v10, v4

    .line 18
    move v4, v1

    .line 19
    :goto_0
    if-eqz v4, :cond_4

    .line 20
    .line 21
    invoke-interface {p1, p0}, La/bld;->f(La/ugi0;)I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v6, -0x1

    .line 26
    if-eq v5, v6, :cond_3

    .line 27
    .line 28
    if-eqz v5, :cond_2

    .line 29
    .line 30
    if-eq v5, v1, :cond_1

    .line 31
    .line 32
    const/4 v6, 0x2

    .line 33
    if-ne v5, v6, :cond_0

    .line 34
    .line 35
    invoke-interface {p1, p0, v6}, La/bld;->r(La/ugi0;I)J

    .line 36
    .line 37
    .line 38
    move-result-wide v10

    .line 39
    or-int/lit8 v7, v7, 0x4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {v5}, La/itt0;->c(I)V

    .line 43
    .line 44
    .line 45
    return-object v3

    .line 46
    :cond_1
    aget-object v5, v0, v1

    .line 47
    .line 48
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    check-cast v5, La/jiy;

    .line 53
    .line 54
    invoke-interface {p1, p0, v1, v5, v9}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    move-object v9, v5

    .line 59
    check-cast v9, La/sip;

    .line 60
    .line 61
    or-int/lit8 v7, v7, 0x2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    sget-object v5, La/zcs;->a:La/zcs;

    .line 65
    .line 66
    invoke-interface {p1, p0, v2, v5, v8}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    move-object v8, v5

    .line 71
    check-cast v8, La/bds;

    .line 72
    .line 73
    or-int/lit8 v7, v7, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    move v4, v2

    .line 77
    goto :goto_0

    .line 78
    :cond_4
    invoke-interface {p1, p0}, La/bld;->c(La/ugi0;)V

    .line 79
    .line 80
    .line 81
    new-instance v6, La/zos;

    .line 82
    .line 83
    invoke-direct/range {v6 .. v11}, La/zos;-><init>(ILa/bds;La/sip;J)V

    .line 84
    .line 85
    .line 86
    return-object v6
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/xos;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p2, La/zos;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/xos;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, La/zos;->d:[La/a8z;

    .line 13
    .line 14
    sget-object v1, La/zcs;->a:La/zcs;

    .line 15
    .line 16
    iget-wide v2, p2, La/zos;->a:J

    .line 17
    .line 18
    new-instance v4, La/bds;

    .line 19
    .line 20
    invoke-direct {v4, v2, v3}, La/bds;-><init>(J)V

    .line 21
    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-interface {p1, p0, v2, v1, v4}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    aget-object v0, v0, v1

    .line 29
    .line 30
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, La/jiy;

    .line 35
    .line 36
    iget-object v2, p2, La/zos;->b:La/sip;

    .line 37
    .line 38
    invoke-interface {p1, p0, v1, v0, v2}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x2

    .line 42
    iget-wide v1, p2, La/zos;->c:J

    .line 43
    .line 44
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method
