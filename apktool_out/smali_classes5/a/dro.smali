.class public final synthetic La/dro;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/dro;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/dro;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/dro;->a:La/dro;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.sportgame.core.data.models.ExpressHighlightRequest.GameRequest"

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "SI"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "MG"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "KN"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "SL"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "GTS"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    sput-object v1, La/dro;->descriptor:La/ugi0;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 6

    .line 1
    sget-object p0, La/fro;->f:[La/a8z;

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    aget-object v1, p0, v0

    .line 5
    .line 6
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, La/jiy;

    .line 11
    .line 12
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x4

    .line 17
    aget-object p0, p0, v2

    .line 18
    .line 19
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, La/jiy;

    .line 24
    .line 25
    invoke-static {p0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const/4 v3, 0x5

    .line 30
    new-array v3, v3, [La/jiy;

    .line 31
    .line 32
    sget-object v4, La/s710;->a:La/s710;

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    aput-object v4, v3, v5

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    aput-object v4, v3, v5

    .line 39
    .line 40
    sget-object v4, La/okx;->a:La/okx;

    .line 41
    .line 42
    const/4 v5, 0x2

    .line 43
    aput-object v4, v3, v5

    .line 44
    .line 45
    aput-object v1, v3, v0

    .line 46
    .line 47
    aput-object p0, v3, v2

    .line 48
    .line 49
    return-object v3
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 17

    .line 1
    sget-object v0, La/dro;->descriptor:La/ugi0;

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
    sget-object v2, La/fro;->f:[La/a8z;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const-wide/16 v5, 0x0

    .line 14
    .line 15
    move v9, v4

    .line 16
    move v14, v9

    .line 17
    move-wide v10, v5

    .line 18
    move-wide v12, v10

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v15, 0x0

    .line 21
    move v5, v3

    .line 22
    :goto_0
    if-eqz v5, :cond_6

    .line 23
    .line 24
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    const/16 p0, 0x0

    .line 29
    .line 30
    const/4 v7, -0x1

    .line 31
    if-eq v8, v7, :cond_5

    .line 32
    .line 33
    if-eqz v8, :cond_4

    .line 34
    .line 35
    if-eq v8, v3, :cond_3

    .line 36
    .line 37
    const/4 v7, 0x2

    .line 38
    if-eq v8, v7, :cond_2

    .line 39
    .line 40
    const/4 v7, 0x3

    .line 41
    if-eq v8, v7, :cond_1

    .line 42
    .line 43
    const/4 v7, 0x4

    .line 44
    if-ne v8, v7, :cond_0

    .line 45
    .line 46
    aget-object v8, v2, v7

    .line 47
    .line 48
    invoke-interface {v8}, La/a8z;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    check-cast v8, La/jiy;

    .line 53
    .line 54
    invoke-interface {v1, v0, v7, v8, v6}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    check-cast v6, Ljava/util/List;

    .line 59
    .line 60
    or-int/lit8 v9, v9, 0x10

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-static {v8}, La/itt0;->c(I)V

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_1
    aget-object v8, v2, v7

    .line 68
    .line 69
    invoke-interface {v8}, La/a8z;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    check-cast v8, La/jiy;

    .line 74
    .line 75
    invoke-interface {v1, v0, v7, v8, v15}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    move-object v15, v7

    .line 80
    check-cast v15, Ljava/util/List;

    .line 81
    .line 82
    or-int/lit8 v9, v9, 0x8

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    invoke-interface {v1, v0, v7}, La/bld;->j(La/ugi0;I)I

    .line 86
    .line 87
    .line 88
    move-result v14

    .line 89
    or-int/lit8 v9, v9, 0x4

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    invoke-interface {v1, v0, v3}, La/bld;->r(La/ugi0;I)J

    .line 93
    .line 94
    .line 95
    move-result-wide v12

    .line 96
    or-int/lit8 v9, v9, 0x2

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    invoke-interface {v1, v0, v4}, La/bld;->r(La/ugi0;I)J

    .line 100
    .line 101
    .line 102
    move-result-wide v10

    .line 103
    or-int/lit8 v9, v9, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_5
    move v5, v4

    .line 107
    goto :goto_0

    .line 108
    :cond_6
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 109
    .line 110
    .line 111
    new-instance v8, La/fro;

    .line 112
    .line 113
    move-object/from16 v16, v6

    .line 114
    .line 115
    invoke-direct/range {v8 .. v16}, La/fro;-><init>(IJJILjava/util/List;Ljava/util/List;)V

    .line 116
    .line 117
    .line 118
    return-object v8
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/dro;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, La/fro;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/dro;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, La/fro;->f:[La/a8z;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iget-wide v2, p2, La/fro;->a:J

    .line 16
    .line 17
    invoke-interface {p1, p0, v1, v2, v3}, La/cld;->n(La/ugi0;IJ)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iget-wide v2, p2, La/fro;->b:J

    .line 22
    .line 23
    invoke-interface {p1, p0, v1, v2, v3}, La/cld;->n(La/ugi0;IJ)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    iget v2, p2, La/fro;->c:I

    .line 28
    .line 29
    invoke-interface {p1, v1, v2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    aget-object v2, v0, v1

    .line 34
    .line 35
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, La/jiy;

    .line 40
    .line 41
    iget-object v3, p2, La/fro;->d:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {p1, p0, v1, v2, v3}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x4

    .line 47
    aget-object v0, v0, v1

    .line 48
    .line 49
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, La/jiy;

    .line 54
    .line 55
    iget-object p2, p2, La/fro;->e:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {p1, p0, v1, v0, p2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method
