.class public final synthetic La/tgr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/tgr;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/tgr;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/tgr;->a:La/tgr;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "GPWebAppSetFreezeAccount"

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "requestId"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "isFreeze"

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {v1, v0, v3}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "accountId"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "eventName"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    sput-object v1, La/tgr;->descriptor:La/ugi0;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 4

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
    sget-object v1, La/okx;->a:La/okx;

    .line 8
    .line 9
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x4

    .line 14
    new-array v2, v2, [La/jiy;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    aput-object v0, v2, v3

    .line 18
    .line 19
    sget-object v0, La/sm8;->a:La/sm8;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    aput-object v0, v2, v3

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    aput-object v1, v2, v0

    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    aput-object p0, v2, v0

    .line 29
    .line 30
    return-object v2
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object p0, La/tgr;->descriptor:La/ugi0;

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
    const/4 v2, 0x0

    .line 10
    move v3, v0

    .line 11
    move v5, v1

    .line 12
    move v9, v5

    .line 13
    move-object v6, v2

    .line 14
    move-object v7, v6

    .line 15
    move-object v8, v7

    .line 16
    :goto_0
    if-eqz v3, :cond_5

    .line 17
    .line 18
    invoke-interface {p1, p0}, La/bld;->f(La/ugi0;)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v10, -0x1

    .line 23
    if-eq v4, v10, :cond_4

    .line 24
    .line 25
    if-eqz v4, :cond_3

    .line 26
    .line 27
    if-eq v4, v0, :cond_2

    .line 28
    .line 29
    const/4 v10, 0x2

    .line 30
    if-eq v4, v10, :cond_1

    .line 31
    .line 32
    const/4 v8, 0x3

    .line 33
    if-ne v4, v8, :cond_0

    .line 34
    .line 35
    invoke-interface {p1, p0, v8}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    or-int/lit8 v5, v5, 0x8

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {v4}, La/itt0;->c(I)V

    .line 43
    .line 44
    .line 45
    return-object v2

    .line 46
    :cond_1
    sget-object v4, La/okx;->a:La/okx;

    .line 47
    .line 48
    invoke-interface {p1, p0, v10, v4, v6}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    move-object v6, v4

    .line 53
    check-cast v6, Ljava/lang/Integer;

    .line 54
    .line 55
    or-int/lit8 v5, v5, 0x4

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-interface {p1, p0, v0}, La/bld;->B(La/ugi0;I)Z

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    or-int/lit8 v5, v5, 0x2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    sget-object v4, La/ysm0;->a:La/ysm0;

    .line 66
    .line 67
    invoke-interface {p1, p0, v1, v4, v7}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    move-object v7, v4

    .line 72
    check-cast v7, Ljava/lang/String;

    .line 73
    .line 74
    or-int/lit8 v5, v5, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    move v3, v1

    .line 78
    goto :goto_0

    .line 79
    :cond_5
    invoke-interface {p1, p0}, La/bld;->c(La/ugi0;)V

    .line 80
    .line 81
    .line 82
    new-instance v4, La/vgr;

    .line 83
    .line 84
    invoke-direct/range {v4 .. v9}, La/vgr;-><init>(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 85
    .line 86
    .line 87
    return-object v4
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/tgr;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, La/vgr;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/tgr;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p2, p1, p0}, La/mir;->d(La/mir;La/cld;La/ugi0;)V

    .line 13
    .line 14
    .line 15
    iget-boolean v0, p2, La/vgr;->c:Z

    .line 16
    .line 17
    iget-object v1, p2, La/vgr;->e:Ljava/lang/String;

    .line 18
    .line 19
    iget-object p2, p2, La/vgr;->d:Ljava/lang/Integer;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-interface {p1, p0, v2, v0}, La/cld;->x(La/ugi0;IZ)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    if-eqz p2, :cond_1

    .line 33
    .line 34
    :goto_0
    sget-object v0, La/okx;->a:La/okx;

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    invoke-interface {p1, p0, v2, v0, p2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const-string p2, "GPWebAppSetFreezeAccount"

    .line 48
    .line 49
    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-nez p2, :cond_3

    .line 54
    .line 55
    :goto_1
    const/4 p2, 0x3

    .line 56
    invoke-interface {p1, p0, p2, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method
