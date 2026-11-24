.class public final synthetic La/ati0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/ati0;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/ati0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/ati0;->a:La/ati0;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.aggregator.impl.promo.data.models.requests.SetStatusBonusRequest"

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "AccId"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "BonusId"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "Status"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    sput-object v1, La/ati0;->descriptor:La/ugi0;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 2

    .line 1
    const/4 p0, 0x3

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
    return-object p0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object p0, La/ati0;->descriptor:La/ugi0;

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
    move v6, v5

    .line 13
    move v7, v6

    .line 14
    move-wide v8, v2

    .line 15
    move v2, v0

    .line 16
    :goto_0
    if-eqz v2, :cond_4

    .line 17
    .line 18
    invoke-interface {p1, p0}, La/bld;->f(La/ugi0;)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, -0x1

    .line 23
    if-eq v3, v4, :cond_3

    .line 24
    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    if-eq v3, v0, :cond_1

    .line 28
    .line 29
    const/4 v4, 0x2

    .line 30
    if-ne v3, v4, :cond_0

    .line 31
    .line 32
    invoke-interface {p1, p0, v4}, La/bld;->j(La/ugi0;I)I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    or-int/lit8 v5, v5, 0x4

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {v3}, La/itt0;->c(I)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return-object p0

    .line 44
    :cond_1
    invoke-interface {p1, p0, v0}, La/bld;->j(La/ugi0;I)I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    or-int/lit8 v5, v5, 0x2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-interface {p1, p0, v1}, La/bld;->r(La/ugi0;I)J

    .line 52
    .line 53
    .line 54
    move-result-wide v8

    .line 55
    or-int/lit8 v5, v5, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    move v2, v1

    .line 59
    goto :goto_0

    .line 60
    :cond_4
    invoke-interface {p1, p0}, La/bld;->c(La/ugi0;)V

    .line 61
    .line 62
    .line 63
    new-instance v4, La/cti0;

    .line 64
    .line 65
    invoke-direct/range {v4 .. v9}, La/cti0;-><init>(IIIJ)V

    .line 66
    .line 67
    .line 68
    return-object v4
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/ati0;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, La/cti0;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/ati0;->descriptor:La/ugi0;

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
    iget-wide v1, p2, La/cti0;->a:J

    .line 14
    .line 15
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iget v1, p2, La/cti0;->b:I

    .line 20
    .line 21
    invoke-interface {p1, v0, v1, p0}, La/cld;->i(IILa/ugi0;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    iget p2, p2, La/cti0;->c:I

    .line 26
    .line 27
    invoke-interface {p1, v0, p2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
