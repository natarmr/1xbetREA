.class public final synthetic La/dff;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/dff;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/dff;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/dff;->a:La/dff;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.crystal.data.models.resquests.CrystalGameRequest"

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "BAC"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "BS"

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "BINF"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    sput-object v1, La/dff;->descriptor:La/ugi0;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 4

    .line 1
    sget-object p0, La/tbl;->a:La/tbl;

    .line 2
    .line 3
    invoke-static {p0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, La/zf8;->a:La/zf8;

    .line 8
    .line 9
    invoke-static {v0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x3

    .line 14
    new-array v1, v1, [La/jiy;

    .line 15
    .line 16
    sget-object v2, La/s710;->a:La/s710;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    aput-object v2, v1, v3

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    aput-object p0, v1, v2

    .line 23
    .line 24
    const/4 p0, 0x2

    .line 25
    aput-object v0, v1, p0

    .line 26
    .line 27
    return-object v1
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object p0, La/dff;->descriptor:La/ugi0;

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
    const/4 v4, 0x0

    .line 12
    move v6, v1

    .line 13
    move-wide v7, v2

    .line 14
    move-object v9, v4

    .line 15
    move-object v10, v9

    .line 16
    move v2, v0

    .line 17
    :goto_0
    if-eqz v2, :cond_4

    .line 18
    .line 19
    invoke-interface {p1, p0}, La/bld;->f(La/ugi0;)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v5, -0x1

    .line 24
    if-eq v3, v5, :cond_3

    .line 25
    .line 26
    if-eqz v3, :cond_2

    .line 27
    .line 28
    if-eq v3, v0, :cond_1

    .line 29
    .line 30
    const/4 v5, 0x2

    .line 31
    if-ne v3, v5, :cond_0

    .line 32
    .line 33
    sget-object v3, La/zf8;->a:La/zf8;

    .line 34
    .line 35
    invoke-interface {p1, p0, v5, v3, v9}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    move-object v9, v3

    .line 40
    check-cast v9, La/bg8;

    .line 41
    .line 42
    or-int/lit8 v6, v6, 0x4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {v3}, La/itt0;->c(I)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :cond_1
    sget-object v3, La/tbl;->a:La/tbl;

    .line 50
    .line 51
    invoke-interface {p1, p0, v0, v3, v10}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    move-object v10, v3

    .line 56
    check-cast v10, Ljava/lang/Double;

    .line 57
    .line 58
    or-int/lit8 v6, v6, 0x2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-interface {p1, p0, v1}, La/bld;->r(La/ugi0;I)J

    .line 62
    .line 63
    .line 64
    move-result-wide v7

    .line 65
    or-int/lit8 v6, v6, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    move v2, v1

    .line 69
    goto :goto_0

    .line 70
    :cond_4
    invoke-interface {p1, p0}, La/bld;->c(La/ugi0;)V

    .line 71
    .line 72
    .line 73
    new-instance v5, La/fff;

    .line 74
    .line 75
    invoke-direct/range {v5 .. v10}, La/fff;-><init>(IJLa/bg8;Ljava/lang/Double;)V

    .line 76
    .line 77
    .line 78
    return-object v5
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/dff;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, La/fff;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/dff;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-wide v0, p2, La/fff;->a:J

    .line 13
    .line 14
    iget-object v2, p2, La/fff;->c:La/bg8;

    .line 15
    .line 16
    iget-object p2, p2, La/fff;->b:Ljava/lang/Double;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-interface {p1, p0, v3, v0, v1}, La/cld;->n(La/ugi0;IJ)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    if-eqz p2, :cond_1

    .line 30
    .line 31
    :goto_0
    sget-object v0, La/tbl;->a:La/tbl;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-interface {p1, p0, v1, v0, p2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    if-eqz v2, :cond_3

    .line 45
    .line 46
    :goto_1
    sget-object p2, La/zf8;->a:La/zf8;

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    invoke-interface {p1, p0, v0, p2, v2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_3
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method
