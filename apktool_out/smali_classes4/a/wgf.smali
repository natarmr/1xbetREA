.class public final synthetic La/wgf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/wgf;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/wgf;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/wgf;->a:La/wgf;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.cyber.game.core.data.model.games.crystal.CrystalResponse"

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "Status"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "CurStep"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "Info"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "Matrix"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "Period"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    sput-object v1, La/wgf;->descriptor:La/ugi0;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 7

    .line 1
    sget-object p0, La/ahf;->f:[La/a8z;

    .line 2
    .line 3
    sget-object v0, La/okx;->a:La/okx;

    .line 4
    .line 5
    invoke-static {v0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v3, La/yff;->a:La/yff;

    .line 14
    .line 15
    invoke-static {v3}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/4 v4, 0x3

    .line 20
    aget-object p0, p0, v4

    .line 21
    .line 22
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, La/jiy;

    .line 27
    .line 28
    invoke-static {p0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {v0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v5, 0x5

    .line 37
    new-array v5, v5, [La/jiy;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    aput-object v1, v5, v6

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    aput-object v2, v5, v1

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    aput-object v3, v5, v1

    .line 47
    .line 48
    aput-object p0, v5, v4

    .line 49
    .line 50
    const/4 p0, 0x4

    .line 51
    aput-object v0, v5, p0

    .line 52
    .line 53
    return-object v5
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object p0, La/wgf;->descriptor:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p1, p0}, La/rkj;->a(La/ugi0;)La/bld;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, La/ahf;->f:[La/a8z;

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
    move v6, v2

    .line 14
    move-object v7, v3

    .line 15
    move-object v8, v7

    .line 16
    move-object v9, v8

    .line 17
    move-object v10, v9

    .line 18
    move-object v11, v10

    .line 19
    :goto_0
    if-eqz v4, :cond_6

    .line 20
    .line 21
    invoke-interface {p1, p0}, La/bld;->f(La/ugi0;)I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v12, -0x1

    .line 26
    if-eq v5, v12, :cond_5

    .line 27
    .line 28
    if-eqz v5, :cond_4

    .line 29
    .line 30
    if-eq v5, v1, :cond_3

    .line 31
    .line 32
    const/4 v12, 0x2

    .line 33
    if-eq v5, v12, :cond_2

    .line 34
    .line 35
    const/4 v12, 0x3

    .line 36
    if-eq v5, v12, :cond_1

    .line 37
    .line 38
    const/4 v12, 0x4

    .line 39
    if-ne v5, v12, :cond_0

    .line 40
    .line 41
    sget-object v5, La/okx;->a:La/okx;

    .line 42
    .line 43
    invoke-interface {p1, p0, v12, v5, v11}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    move-object v11, v5

    .line 48
    check-cast v11, Ljava/lang/Integer;

    .line 49
    .line 50
    or-int/lit8 v6, v6, 0x10

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-static {v5}, La/itt0;->c(I)V

    .line 54
    .line 55
    .line 56
    return-object v3

    .line 57
    :cond_1
    aget-object v5, v0, v12

    .line 58
    .line 59
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, La/jiy;

    .line 64
    .line 65
    invoke-interface {p1, p0, v12, v5, v10}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    move-object v10, v5

    .line 70
    check-cast v10, Ljava/util/List;

    .line 71
    .line 72
    or-int/lit8 v6, v6, 0x8

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    sget-object v5, La/yff;->a:La/yff;

    .line 76
    .line 77
    invoke-interface {p1, p0, v12, v5, v9}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    move-object v9, v5

    .line 82
    check-cast v9, La/agf;

    .line 83
    .line 84
    or-int/lit8 v6, v6, 0x4

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    sget-object v5, La/okx;->a:La/okx;

    .line 88
    .line 89
    invoke-interface {p1, p0, v1, v5, v8}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    move-object v8, v5

    .line 94
    check-cast v8, Ljava/lang/Integer;

    .line 95
    .line 96
    or-int/lit8 v6, v6, 0x2

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    sget-object v5, La/okx;->a:La/okx;

    .line 100
    .line 101
    invoke-interface {p1, p0, v2, v5, v7}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    move-object v7, v5

    .line 106
    check-cast v7, Ljava/lang/Integer;

    .line 107
    .line 108
    or-int/lit8 v6, v6, 0x1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_5
    move v4, v2

    .line 112
    goto :goto_0

    .line 113
    :cond_6
    invoke-interface {p1, p0}, La/bld;->c(La/ugi0;)V

    .line 114
    .line 115
    .line 116
    new-instance v5, La/ahf;

    .line 117
    .line 118
    invoke-direct/range {v5 .. v11}, La/ahf;-><init>(ILjava/lang/Integer;Ljava/lang/Integer;La/agf;Ljava/util/List;Ljava/lang/Integer;)V

    .line 119
    .line 120
    .line 121
    return-object v5
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/wgf;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p2, La/ahf;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, La/ahf;->e:Ljava/lang/Integer;

    .line 7
    .line 8
    iget-object v0, p2, La/ahf;->d:Ljava/util/List;

    .line 9
    .line 10
    iget-object v1, p2, La/ahf;->c:La/agf;

    .line 11
    .line 12
    iget-object v2, p2, La/ahf;->b:Ljava/lang/Integer;

    .line 13
    .line 14
    iget-object p2, p2, La/ahf;->a:Ljava/lang/Integer;

    .line 15
    .line 16
    sget-object v3, La/wgf;->descriptor:La/ugi0;

    .line 17
    .line 18
    invoke-interface {p1, v3}, La/bwn;->a(La/ugi0;)La/cld;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object v4, La/ahf;->f:[La/a8z;

    .line 23
    .line 24
    invoke-interface {p1, v3}, La/cld;->u(La/ugi0;)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    if-eqz p2, :cond_1

    .line 32
    .line 33
    :goto_0
    sget-object v5, La/okx;->a:La/okx;

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    invoke-interface {p1, v3, v6, v5, p2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-interface {p1, v3}, La/cld;->u(La/ugi0;)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    if-eqz v2, :cond_3

    .line 47
    .line 48
    :goto_1
    sget-object p2, La/okx;->a:La/okx;

    .line 49
    .line 50
    const/4 v5, 0x1

    .line 51
    invoke-interface {p1, v3, v5, p2, v2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    invoke-interface {p1, v3}, La/cld;->u(La/ugi0;)Z

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
    if-eqz v1, :cond_5

    .line 62
    .line 63
    :goto_2
    sget-object p2, La/yff;->a:La/yff;

    .line 64
    .line 65
    const/4 v2, 0x2

    .line 66
    invoke-interface {p1, v3, v2, p2, v1}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_5
    invoke-interface {p1, v3}, La/cld;->u(La/ugi0;)Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-eqz p2, :cond_6

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_6
    if-eqz v0, :cond_7

    .line 77
    .line 78
    :goto_3
    const/4 p2, 0x3

    .line 79
    aget-object v1, v4, p2

    .line 80
    .line 81
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, La/jiy;

    .line 86
    .line 87
    invoke-interface {p1, v3, p2, v1, v0}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_7
    invoke-interface {p1, v3}, La/cld;->u(La/ugi0;)Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-eqz p2, :cond_8

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_8
    if-eqz p0, :cond_9

    .line 98
    .line 99
    :goto_4
    sget-object p2, La/okx;->a:La/okx;

    .line 100
    .line 101
    const/4 v0, 0x4

    .line 102
    invoke-interface {p1, v3, v0, p2, p0}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_9
    invoke-interface {p1, v3}, La/cld;->c(La/ugi0;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method
