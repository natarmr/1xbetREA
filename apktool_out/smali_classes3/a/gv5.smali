.class public final synthetic La/gv5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/gv5;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/gv5;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/gv5;->a:La/gv5;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.core.data.models.BaseActionRequest"

    .line 11
    .line 12
    const/4 v3, 0x6

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "VU"

    .line 17
    .line 18
    const/4 v2, 0x1

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
    const-string v0, "GI"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "LG"

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "WH"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    sput-object v1, La/gv5;->descriptor:La/ugi0;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 4

    .line 1
    sget-object p0, La/iv5;->g:[La/a8z;

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    new-array v0, v0, [La/jiy;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aget-object p0, p0, v1

    .line 8
    .line 9
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    aput-object p0, v0, v1

    .line 14
    .line 15
    sget-object p0, La/okx;->a:La/okx;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    aput-object p0, v0, v1

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    aput-object p0, v0, v1

    .line 22
    .line 23
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 24
    .line 25
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v3, 0x3

    .line 30
    aput-object v2, v0, v3

    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    aput-object v1, v0, v2

    .line 34
    .line 35
    const/4 v1, 0x5

    .line 36
    aput-object p0, v0, v1

    .line 37
    .line 38
    return-object v0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object p0, La/gv5;->descriptor:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p1, p0}, La/rkj;->a(La/ugi0;)La/bld;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, La/iv5;->g:[La/a8z;

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
    move v8, v6

    .line 15
    move v9, v8

    .line 16
    move v12, v9

    .line 17
    move-object v7, v3

    .line 18
    move-object v10, v7

    .line 19
    move-object v11, v10

    .line 20
    :goto_0
    if-eqz v4, :cond_0

    .line 21
    .line 22
    invoke-interface {p1, p0}, La/bld;->f(La/ugi0;)I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    packed-switch v5, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    invoke-static {v5}, La/itt0;->c(I)V

    .line 30
    .line 31
    .line 32
    return-object v3

    .line 33
    :pswitch_0
    const/4 v5, 0x5

    .line 34
    invoke-interface {p1, p0, v5}, La/bld;->j(La/ugi0;I)I

    .line 35
    .line 36
    .line 37
    move-result v12

    .line 38
    or-int/lit8 v6, v6, 0x20

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :pswitch_1
    const/4 v5, 0x4

    .line 42
    invoke-interface {p1, p0, v5}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v11

    .line 46
    or-int/lit8 v6, v6, 0x10

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :pswitch_2
    const/4 v5, 0x3

    .line 50
    sget-object v13, La/ysm0;->a:La/ysm0;

    .line 51
    .line 52
    invoke-interface {p1, p0, v5, v13, v10}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    move-object v10, v5

    .line 57
    check-cast v10, Ljava/lang/String;

    .line 58
    .line 59
    or-int/lit8 v6, v6, 0x8

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_3
    const/4 v5, 0x2

    .line 63
    invoke-interface {p1, p0, v5}, La/bld;->j(La/ugi0;I)I

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    or-int/lit8 v6, v6, 0x4

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :pswitch_4
    invoke-interface {p1, p0, v1}, La/bld;->j(La/ugi0;I)I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    or-int/lit8 v6, v6, 0x2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_5
    aget-object v5, v0, v2

    .line 78
    .line 79
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    check-cast v5, La/jiy;

    .line 84
    .line 85
    invoke-interface {p1, p0, v2, v5, v7}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    move-object v7, v5

    .line 90
    check-cast v7, Ljava/util/List;

    .line 91
    .line 92
    or-int/lit8 v6, v6, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_6
    move v4, v2

    .line 96
    goto :goto_0

    .line 97
    :cond_0
    invoke-interface {p1, p0}, La/bld;->c(La/ugi0;)V

    .line 98
    .line 99
    .line 100
    new-instance v5, La/iv5;

    .line 101
    .line 102
    invoke-direct/range {v5 .. v12}, La/iv5;-><init>(ILjava/util/List;IILjava/lang/String;Ljava/lang/String;I)V

    .line 103
    .line 104
    .line 105
    return-object v5

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/gv5;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p2, La/iv5;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, La/iv5;->d:Ljava/lang/String;

    .line 7
    .line 8
    iget v0, p2, La/iv5;->c:I

    .line 9
    .line 10
    iget v1, p2, La/iv5;->b:I

    .line 11
    .line 12
    iget-object v2, p2, La/iv5;->a:Ljava/util/List;

    .line 13
    .line 14
    sget-object v3, La/gv5;->descriptor:La/ugi0;

    .line 15
    .line 16
    invoke-interface {p1, v3}, La/bwn;->a(La/ugi0;)La/cld;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object v4, La/iv5;->g:[La/a8z;

    .line 21
    .line 22
    invoke-interface {p1, v3}, La/cld;->u(La/ugi0;)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    const/4 v6, 0x0

    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-static {v5}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-nez v5, :cond_1

    .line 43
    .line 44
    :goto_0
    aget-object v4, v4, v6

    .line 45
    .line 46
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, La/jiy;

    .line 51
    .line 52
    invoke-interface {p1, v3, v6, v4, v2}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-interface {p1, v3}, La/cld;->u(La/ugi0;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    if-eqz v1, :cond_3

    .line 63
    .line 64
    :goto_1
    const/4 v2, 0x1

    .line 65
    invoke-interface {p1, v2, v1, v3}, La/cld;->i(IILa/ugi0;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    invoke-interface {p1, v3}, La/cld;->u(La/ugi0;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    if-eqz v0, :cond_5

    .line 76
    .line 77
    :goto_2
    const/4 v1, 0x2

    .line 78
    invoke-interface {p1, v1, v0, v3}, La/cld;->i(IILa/ugi0;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    invoke-interface {p1, v3}, La/cld;->u(La/ugi0;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_6

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_6
    const-string v0, "0"

    .line 89
    .line 90
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_7

    .line 95
    .line 96
    :goto_3
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 97
    .line 98
    const/4 v1, 0x3

    .line 99
    invoke-interface {p1, v3, v1, v0, p0}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_7
    const/4 p0, 0x4

    .line 103
    iget-object v0, p2, La/iv5;->e:Ljava/lang/String;

    .line 104
    .line 105
    invoke-interface {p1, v3, p0, v0}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const/4 p0, 0x5

    .line 109
    iget p2, p2, La/iv5;->f:I

    .line 110
    .line 111
    invoke-interface {p1, p0, p2, v3}, La/cld;->i(IILa/ugi0;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p1, v3}, La/cld;->c(La/ugi0;)V

    .line 115
    .line 116
    .line 117
    return-void
.end method
