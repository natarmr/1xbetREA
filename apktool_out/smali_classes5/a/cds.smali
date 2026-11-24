.class public final synthetic La/cds;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/cds;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/cds;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/cds;->a:La/cds;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.onexuser.domain.entity.onexgame.GameImageInfo"

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "rect"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "square"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "circle"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "imageVariant"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    sput-object v1, La/cds;->descriptor:La/ugi0;

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
    sget-object v0, La/eds;->a:La/eds;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aput-object v0, p0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aput-object v0, p0, v1

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    aput-object v0, p0, v1

    .line 14
    .line 15
    sget-object v0, La/o2x;->a:La/o2x;

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
    .locals 12

    .line 1
    sget-object p0, La/cds;->descriptor:La/ugi0;

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
    move-object v6, v2

    .line 13
    move-object v7, v6

    .line 14
    move-object v8, v7

    .line 15
    move-object v9, v8

    .line 16
    :goto_0
    if-eqz v3, :cond_b

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
    if-eq v4, v10, :cond_a

    .line 24
    .line 25
    if-eqz v4, :cond_7

    .line 26
    .line 27
    if-eq v4, v0, :cond_4

    .line 28
    .line 29
    const/4 v10, 0x2

    .line 30
    if-eq v4, v10, :cond_1

    .line 31
    .line 32
    const/4 v10, 0x3

    .line 33
    if-ne v4, v10, :cond_0

    .line 34
    .line 35
    sget-object v4, La/o2x;->a:La/o2x;

    .line 36
    .line 37
    invoke-interface {p1, p0, v10, v4, v9}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    move-object v9, v4

    .line 42
    check-cast v9, La/lz60;

    .line 43
    .line 44
    or-int/lit8 v5, v5, 0x8

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {v4}, La/itt0;->c(I)V

    .line 48
    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_1
    sget-object v4, La/eds;->a:La/eds;

    .line 52
    .line 53
    if-eqz v8, :cond_2

    .line 54
    .line 55
    new-instance v11, La/gds;

    .line 56
    .line 57
    invoke-direct {v11, v8}, La/gds;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move-object v11, v2

    .line 62
    :goto_1
    invoke-interface {p1, p0, v10, v4, v11}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, La/gds;

    .line 67
    .line 68
    if-eqz v4, :cond_3

    .line 69
    .line 70
    iget-object v4, v4, La/gds;->a:Ljava/lang/String;

    .line 71
    .line 72
    move-object v8, v4

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move-object v8, v2

    .line 75
    :goto_2
    or-int/lit8 v5, v5, 0x4

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    sget-object v4, La/eds;->a:La/eds;

    .line 79
    .line 80
    if-eqz v7, :cond_5

    .line 81
    .line 82
    new-instance v10, La/gds;

    .line 83
    .line 84
    invoke-direct {v10, v7}, La/gds;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    move-object v10, v2

    .line 89
    :goto_3
    invoke-interface {p1, p0, v0, v4, v10}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, La/gds;

    .line 94
    .line 95
    if-eqz v4, :cond_6

    .line 96
    .line 97
    iget-object v4, v4, La/gds;->a:Ljava/lang/String;

    .line 98
    .line 99
    move-object v7, v4

    .line 100
    goto :goto_4

    .line 101
    :cond_6
    move-object v7, v2

    .line 102
    :goto_4
    or-int/lit8 v5, v5, 0x2

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_7
    sget-object v4, La/eds;->a:La/eds;

    .line 106
    .line 107
    if-eqz v6, :cond_8

    .line 108
    .line 109
    new-instance v10, La/gds;

    .line 110
    .line 111
    invoke-direct {v10, v6}, La/gds;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_8
    move-object v10, v2

    .line 116
    :goto_5
    invoke-interface {p1, p0, v1, v4, v10}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    check-cast v4, La/gds;

    .line 121
    .line 122
    if-eqz v4, :cond_9

    .line 123
    .line 124
    iget-object v4, v4, La/gds;->a:Ljava/lang/String;

    .line 125
    .line 126
    move-object v6, v4

    .line 127
    goto :goto_6

    .line 128
    :cond_9
    move-object v6, v2

    .line 129
    :goto_6
    or-int/lit8 v5, v5, 0x1

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_a
    move v3, v1

    .line 133
    goto :goto_0

    .line 134
    :cond_b
    invoke-interface {p1, p0}, La/bld;->c(La/ugi0;)V

    .line 135
    .line 136
    .line 137
    new-instance v4, La/hds;

    .line 138
    .line 139
    invoke-direct/range {v4 .. v9}, La/hds;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/lz60;)V

    .line 140
    .line 141
    .line 142
    return-object v4
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/cds;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, La/hds;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/cds;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, La/eds;->a:La/eds;

    .line 13
    .line 14
    iget-object v1, p2, La/hds;->a:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v2, La/gds;

    .line 17
    .line 18
    invoke-direct {v2, v1}, La/gds;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-interface {p1, p0, v1, v0, v2}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p2, La/hds;->b:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v2, La/gds;

    .line 28
    .line 29
    invoke-direct {v2, v1}, La/gds;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-interface {p1, p0, v1, v0, v2}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p2, La/hds;->c:Ljava/lang/String;

    .line 37
    .line 38
    new-instance v2, La/gds;

    .line 39
    .line 40
    invoke-direct {v2, v1}, La/gds;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x2

    .line 44
    invoke-interface {p1, p0, v1, v0, v2}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object v0, La/o2x;->a:La/o2x;

    .line 48
    .line 49
    iget-object p2, p2, La/hds;->d:La/lz60;

    .line 50
    .line 51
    const/4 v1, 0x3

    .line 52
    invoke-interface {p1, p0, v1, v0, p2}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method
