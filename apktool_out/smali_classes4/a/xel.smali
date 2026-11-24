.class public final synthetic La/xel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/xel;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/xel;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/xel;->a:La/xel;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.dragons_gold.data.models.requests.DragonsGoldActionRequest"

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "UI"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "AN"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "CE"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "LG"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "VU"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    sput-object v1, La/xel;->descriptor:La/ugi0;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 3

    .line 1
    sget-object p0, La/zel;->f:[La/a8z;

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    new-array v0, v0, [La/jiy;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    sget-object v2, La/s710;->a:La/s710;

    .line 8
    .line 9
    aput-object v2, v0, v1

    .line 10
    .line 11
    sget-object v1, La/okx;->a:La/okx;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    aput-object v1, v0, v2

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    sget-object v2, La/ysm0;->a:La/ysm0;

    .line 21
    .line 22
    aput-object v2, v0, v1

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    aget-object p0, p0, v1

    .line 26
    .line 27
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    aput-object p0, v0, v1

    .line 32
    .line 33
    return-object v0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object p0, La/xel;->descriptor:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p1, p0}, La/rkj;->a(La/ugi0;)La/bld;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, La/zel;->f:[La/a8z;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    move v7, v2

    .line 15
    move v8, v7

    .line 16
    move v9, v8

    .line 17
    move-wide v10, v3

    .line 18
    move-object v12, v5

    .line 19
    move-object v13, v12

    .line 20
    move v3, v1

    .line 21
    :goto_0
    if-eqz v3, :cond_6

    .line 22
    .line 23
    invoke-interface {p1, p0}, La/bld;->f(La/ugi0;)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/4 v6, -0x1

    .line 28
    if-eq v4, v6, :cond_5

    .line 29
    .line 30
    if-eqz v4, :cond_4

    .line 31
    .line 32
    if-eq v4, v1, :cond_3

    .line 33
    .line 34
    const/4 v6, 0x2

    .line 35
    if-eq v4, v6, :cond_2

    .line 36
    .line 37
    const/4 v6, 0x3

    .line 38
    if-eq v4, v6, :cond_1

    .line 39
    .line 40
    const/4 v6, 0x4

    .line 41
    if-ne v4, v6, :cond_0

    .line 42
    .line 43
    aget-object v4, v0, v6

    .line 44
    .line 45
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, La/jiy;

    .line 50
    .line 51
    invoke-interface {p1, p0, v6, v4, v13}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    move-object v13, v4

    .line 56
    check-cast v13, Ljava/util/List;

    .line 57
    .line 58
    or-int/lit8 v7, v7, 0x10

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-static {v4}, La/itt0;->c(I)V

    .line 62
    .line 63
    .line 64
    return-object v5

    .line 65
    :cond_1
    invoke-interface {p1, p0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v12

    .line 69
    or-int/lit8 v7, v7, 0x8

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    invoke-interface {p1, p0, v6}, La/bld;->j(La/ugi0;I)I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    or-int/lit8 v7, v7, 0x4

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    invoke-interface {p1, p0, v1}, La/bld;->j(La/ugi0;I)I

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    or-int/lit8 v7, v7, 0x2

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    invoke-interface {p1, p0, v2}, La/bld;->r(La/ugi0;I)J

    .line 87
    .line 88
    .line 89
    move-result-wide v10

    .line 90
    or-int/lit8 v7, v7, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    move v3, v2

    .line 94
    goto :goto_0

    .line 95
    :cond_6
    invoke-interface {p1, p0}, La/bld;->c(La/ugi0;)V

    .line 96
    .line 97
    .line 98
    new-instance v6, La/zel;

    .line 99
    .line 100
    invoke-direct/range {v6 .. v13}, La/zel;-><init>(IIIJLjava/lang/String;Ljava/util/List;)V

    .line 101
    .line 102
    .line 103
    return-object v6
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/xel;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, La/zel;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/xel;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, La/zel;->f:[La/a8z;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iget-wide v2, p2, La/zel;->a:J

    .line 16
    .line 17
    invoke-interface {p1, p0, v1, v2, v3}, La/cld;->n(La/ugi0;IJ)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iget v2, p2, La/zel;->b:I

    .line 22
    .line 23
    invoke-interface {p1, v1, v2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    iget v2, p2, La/zel;->c:I

    .line 28
    .line 29
    invoke-interface {p1, v1, v2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    iget-object v2, p2, La/zel;->d:Ljava/lang/String;

    .line 34
    .line 35
    invoke-interface {p1, p0, v1, v2}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x4

    .line 39
    aget-object v0, v0, v1

    .line 40
    .line 41
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, La/jiy;

    .line 46
    .line 47
    iget-object p2, p2, La/zel;->e:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {p1, p0, v1, v0, p2}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method
