.class public final La/hsr;
.super La/zx5;
.source "SourceFile"


# static fields
.field public static final r:La/ek5;


# instance fields
.field public final o:Landroidx/fragment/app/e;

.field public final p:La/sek;

.field public final q:La/bek;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/ek5;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/ek5;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/hsr;->r:La/ek5;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/e;La/glz;La/sek;La/bek;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, La/hsr;->r:La/ek5;

    .line 11
    .line 12
    invoke-direct {p0, p1, p2, v0}, La/zx5;-><init>(Landroidx/fragment/app/e;La/glz;La/dtb;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/hsr;->o:Landroidx/fragment/app/e;

    .line 16
    .line 17
    iput-object p3, p0, La/hsr;->p:La/sek;

    .line 18
    .line 19
    iput-object p4, p0, La/hsr;->q:La/bek;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final A(J)Z
    .locals 4

    .line 1
    iget-object p0, p0, La/zx5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/yz3;

    .line 4
    .line 5
    iget-object p0, p0, La/yz3;->f:Ljava/util/List;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_4

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, La/y39;

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    instance-of v2, v0, La/w39;

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    check-cast v0, La/w39;

    .line 41
    .line 42
    iget-object v0, v0, La/w39;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 43
    .line 44
    iget-object v0, v0, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->f:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    int-to-long v2, v0

    .line 51
    cmp-long v0, v2, p1

    .line 52
    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    instance-of v2, v0, La/x39;

    .line 57
    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    check-cast v0, La/x39;

    .line 61
    .line 62
    iget-object v0, v0, La/x39;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 63
    .line 64
    iget v0, v0, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->e:I

    .line 65
    .line 66
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    int-to-long v2, v0

    .line 71
    cmp-long v0, v2, p1

    .line 72
    .line 73
    if-nez v0, :cond_1

    .line 74
    .line 75
    :goto_0
    const/4 p0, 0x1

    .line 76
    return p0

    .line 77
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 78
    .line 79
    .line 80
    :cond_4
    :goto_1
    return v1
.end method

.method public final B(I)Landroidx/fragment/app/Fragment;
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, La/zx5;->G(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, La/y39;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_7

    .line 9
    .line 10
    instance-of v1, p1, La/w39;

    .line 11
    .line 12
    iget-object v2, p0, La/hsr;->o:Landroidx/fragment/app/e;

    .line 13
    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    iget-object v1, v2, Landroidx/fragment/app/e;->c:La/pmi;

    .line 17
    .line 18
    invoke-virtual {v1}, La/pmi;->p()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    move-object v4, v3

    .line 40
    check-cast v4, Landroidx/fragment/app/Fragment;

    .line 41
    .line 42
    instance-of v4, v4, La/wws;

    .line 43
    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    move-object v0, v3

    .line 47
    :cond_1
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    new-instance v1, La/zb5;

    .line 52
    .line 53
    invoke-direct {v1, v2}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v0}, La/zb5;->n(Landroidx/fragment/app/Fragment;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, La/zb5;->i()V

    .line 60
    .line 61
    .line 62
    :cond_2
    check-cast p1, La/w39;

    .line 63
    .line 64
    iget-object v0, p1, La/w39;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 65
    .line 66
    iget-object p1, p1, La/w39;->b:Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;

    .line 67
    .line 68
    iget-object p0, p0, La/hsr;->p:La/sek;

    .line 69
    .line 70
    invoke-virtual {p0, v0, p1}, La/sek;->m(Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;)La/wws;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_3
    instance-of v1, p1, La/x39;

    .line 76
    .line 77
    if-eqz v1, :cond_7

    .line 78
    .line 79
    iget-object v1, v2, Landroidx/fragment/app/e;->c:La/pmi;

    .line 80
    .line 81
    invoke-virtual {v1}, La/pmi;->p()Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_5

    .line 97
    .line 98
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    move-object v4, v3

    .line 103
    check-cast v4, Landroidx/fragment/app/Fragment;

    .line 104
    .line 105
    instance-of v4, v4, La/p0t;

    .line 106
    .line 107
    if-eqz v4, :cond_4

    .line 108
    .line 109
    move-object v0, v3

    .line 110
    :cond_5
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 111
    .line 112
    if-eqz v0, :cond_6

    .line 113
    .line 114
    new-instance v1, La/zb5;

    .line 115
    .line 116
    invoke-direct {v1, v2}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v0}, La/zb5;->n(Landroidx/fragment/app/Fragment;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, La/zb5;->i()V

    .line 123
    .line 124
    .line 125
    :cond_6
    check-cast p1, La/x39;

    .line 126
    .line 127
    iget-object p1, p1, La/x39;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 128
    .line 129
    iget-object p0, p0, La/hsr;->q:La/bek;

    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    sget-object p0, La/p0t;->P1:La/ddk;

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    new-instance p0, La/p0t;

    .line 140
    .line 141
    invoke-direct {p0}, La/p0t;-><init>()V

    .line 142
    .line 143
    .line 144
    sget-object v0, La/p0t;->Q1:[La/iiy;

    .line 145
    .line 146
    const/4 v1, 0x1

    .line 147
    aget-object v0, v0, v1

    .line 148
    .line 149
    iget-object v1, p0, La/p0t;->O1:La/khf0;

    .line 150
    .line 151
    invoke-virtual {v1, p0, v0, p1}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 152
    .line 153
    .line 154
    return-object p0

    .line 155
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 156
    .line 157
    .line 158
    return-object v0
.end method

.method public final e(I)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/zx5;->G(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/y39;

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    instance-of p1, p0, La/w39;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    check-cast p0, La/w39;

    .line 14
    .line 15
    iget-object p0, p0, La/w39;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 16
    .line 17
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->f:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    int-to-long p0, p0

    .line 24
    return-wide p0

    .line 25
    :cond_0
    instance-of p1, p0, La/x39;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    check-cast p0, La/x39;

    .line 30
    .line 31
    iget-object p0, p0, La/x39;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 32
    .line 33
    iget p0, p0, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->e:I

    .line 34
    .line 35
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    int-to-long p0, p0

    .line 40
    return-wide p0

    .line 41
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 42
    .line 43
    .line 44
    const-wide/16 p0, 0x0

    .line 45
    .line 46
    return-wide p0
.end method
