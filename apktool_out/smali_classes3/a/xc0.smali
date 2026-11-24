.class public final synthetic La/xc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/xc0;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/xc0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/xc0;->a:La/xc0;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.aggregator.impl.category.data.models.AggregatorBrandsResponse"

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "brands"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "ErrorId"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "Message"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    sput-object v1, La/xc0;->descriptor:La/ugi0;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 3

    .line 1
    sget-object p0, La/zc0;->d:[La/a8z;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p0, p0, v0

    .line 5
    .line 6
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, La/jiy;

    .line 11
    .line 12
    invoke-static {p0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 17
    .line 18
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x3

    .line 23
    new-array v2, v2, [La/jiy;

    .line 24
    .line 25
    aput-object p0, v2, v0

    .line 26
    .line 27
    sget-object p0, La/okx;->a:La/okx;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    aput-object p0, v2, v0

    .line 31
    .line 32
    const/4 p0, 0x2

    .line 33
    aput-object v1, v2, p0

    .line 34
    .line 35
    return-object v2
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object p0, La/xc0;->descriptor:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p1, p0}, La/rkj;->a(La/ugi0;)La/bld;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, La/zc0;->d:[La/a8z;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v1

    .line 13
    move v5, v2

    .line 14
    move v7, v5

    .line 15
    move-object v6, v3

    .line 16
    move-object v8, v6

    .line 17
    :goto_0
    if-eqz v4, :cond_4

    .line 18
    .line 19
    invoke-interface {p1, p0}, La/bld;->f(La/ugi0;)I

    .line 20
    .line 21
    .line 22
    move-result v9

    .line 23
    const/4 v10, -0x1

    .line 24
    if-eq v9, v10, :cond_3

    .line 25
    .line 26
    if-eqz v9, :cond_2

    .line 27
    .line 28
    if-eq v9, v1, :cond_1

    .line 29
    .line 30
    const/4 v10, 0x2

    .line 31
    if-ne v9, v10, :cond_0

    .line 32
    .line 33
    sget-object v9, La/ysm0;->a:La/ysm0;

    .line 34
    .line 35
    invoke-interface {p1, p0, v10, v9, v8}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    check-cast v8, Ljava/lang/String;

    .line 40
    .line 41
    or-int/lit8 v5, v5, 0x4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {v9}, La/itt0;->c(I)V

    .line 45
    .line 46
    .line 47
    return-object v3

    .line 48
    :cond_1
    invoke-interface {p1, p0, v1}, La/bld;->j(La/ugi0;I)I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    or-int/lit8 v5, v5, 0x2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    aget-object v9, v0, v2

    .line 56
    .line 57
    invoke-interface {v9}, La/a8z;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    check-cast v9, La/jiy;

    .line 62
    .line 63
    invoke-interface {p1, p0, v2, v9, v6}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    check-cast v6, Ljava/util/List;

    .line 68
    .line 69
    or-int/lit8 v5, v5, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    move v4, v2

    .line 73
    goto :goto_0

    .line 74
    :cond_4
    invoke-interface {p1, p0}, La/bld;->c(La/ugi0;)V

    .line 75
    .line 76
    .line 77
    new-instance p0, La/zc0;

    .line 78
    .line 79
    invoke-direct {p0, v5, v7, v8, v6}, La/zc0;-><init>(IILjava/lang/String;Ljava/util/List;)V

    .line 80
    .line 81
    .line 82
    return-object p0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/xc0;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, La/zc0;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, La/zc0;->c:Ljava/lang/String;

    .line 7
    .line 8
    iget v0, p2, La/zc0;->b:I

    .line 9
    .line 10
    iget-object p2, p2, La/zc0;->a:Ljava/util/List;

    .line 11
    .line 12
    sget-object v1, La/xc0;->descriptor:La/ugi0;

    .line 13
    .line 14
    invoke-interface {p1, v1}, La/bwn;->a(La/ugi0;)La/cld;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v2, La/zc0;->d:[La/a8z;

    .line 19
    .line 20
    invoke-interface {p1, v1}, La/cld;->u(La/ugi0;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-eqz p2, :cond_1

    .line 28
    .line 29
    :goto_0
    const/4 v3, 0x0

    .line 30
    aget-object v2, v2, v3

    .line 31
    .line 32
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, La/jiy;

    .line 37
    .line 38
    invoke-interface {p1, v1, v3, v2, p2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-interface {p1, v1}, La/cld;->u(La/ugi0;)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    if-eqz v0, :cond_3

    .line 49
    .line 50
    :goto_1
    const/4 p2, 0x1

    .line 51
    invoke-interface {p1, p2, v0, v1}, La/cld;->i(IILa/ugi0;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    invoke-interface {p1, v1}, La/cld;->u(La/ugi0;)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-eqz p2, :cond_4

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    if-eqz p0, :cond_5

    .line 62
    .line 63
    :goto_2
    sget-object p2, La/ysm0;->a:La/ysm0;

    .line 64
    .line 65
    const/4 v0, 0x2

    .line 66
    invoke-interface {p1, v1, v0, p2, p0}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_5
    invoke-interface {p1, v1}, La/cld;->c(La/ugi0;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method
