.class public final synthetic La/xfb0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/xfb0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/xfb0;

    .line 2
    .line 3
    const-string v4, "toBannersUiModel(Lorg/xplatform/games_section/feature/popular/impl/presentation/mappers/models/PopularOneXGamesMapperBannersState;)Lorg/xplatform/games_section/feature/popular/impl/presentation/models/ui/PopularOneXGamesContentItemUiModel$BannerCollection;"

    .line 4
    .line 5
    const/4 v5, 0x1

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/ffb0;

    .line 8
    .line 9
    const-string v3, "toBannersUiModel"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/xfb0;->a:La/xfb0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, La/efb0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p1, La/efb0;->a:La/hfe;

    .line 7
    .line 8
    iget-object v0, p1, La/efb0;->b:La/lq5;

    .line 9
    .line 10
    instance-of v1, p0, La/vee;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    new-instance p0, La/heb0;

    .line 16
    .line 17
    sget-object p1, La/lak0;->c:La/lak0;

    .line 18
    .line 19
    invoke-direct {p0, v0, p1, v2}, La/heb0;-><init>(La/lq5;La/a4x;Z)V

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    instance-of v1, p0, La/bfe;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    if-eqz v1, :cond_c

    .line 27
    .line 28
    iget-boolean p1, p1, La/efb0;->c:Z

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    new-instance p0, La/heb0;

    .line 33
    .line 34
    sget-object p1, La/lak0;->c:La/lak0;

    .line 35
    .line 36
    invoke-direct {p0, v0, p1, v2}, La/heb0;-><init>(La/lq5;La/a4x;Z)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_1
    check-cast p0, La/bfe;

    .line 41
    .line 42
    iget-object p0, p0, La/bfe;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, La/deb0;

    .line 45
    .line 46
    iget-object p0, p0, La/deb0;->a:Ljava/util/ArrayList;

    .line 47
    .line 48
    new-instance p1, Ljava/util/ArrayList;

    .line 49
    .line 50
    const/16 v1, 0xa

    .line 51
    .line 52
    invoke-static {p0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_b

    .line 68
    .line 69
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, La/lr5;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    instance-of v2, v0, La/gq5;

    .line 79
    .line 80
    if-eqz v2, :cond_2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    instance-of v2, v0, La/fq5;

    .line 84
    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    :goto_1
    iget-object v2, v1, La/lr5;->c:Ljava/lang/String;

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_3
    instance-of v2, v0, La/hq5;

    .line 91
    .line 92
    if-eqz v2, :cond_4

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    instance-of v2, v0, La/iq5;

    .line 96
    .line 97
    if-eqz v2, :cond_5

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    instance-of v2, v0, La/kq5;

    .line 101
    .line 102
    if-eqz v2, :cond_6

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_6
    instance-of v2, v0, La/jq5;

    .line 106
    .line 107
    if-eqz v2, :cond_7

    .line 108
    .line 109
    :goto_2
    iget-object v2, v1, La/lr5;->b:Ljava/lang/String;

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_7
    instance-of v2, v0, La/dq5;

    .line 113
    .line 114
    if-eqz v2, :cond_8

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_8
    instance-of v2, v0, La/eq5;

    .line 118
    .line 119
    if-eqz v2, :cond_9

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_9
    instance-of v2, v0, La/cq5;

    .line 123
    .line 124
    if-eqz v2, :cond_a

    .line 125
    .line 126
    :goto_3
    iget-object v2, v1, La/lr5;->d:Ljava/lang/String;

    .line 127
    .line 128
    :goto_4
    new-instance v4, La/fr5;

    .line 129
    .line 130
    iget v5, v1, La/lr5;->a:I

    .line 131
    .line 132
    new-instance v6, La/n0x;

    .line 133
    .line 134
    invoke-direct {v6, v2}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    new-instance v7, La/n0x;

    .line 138
    .line 139
    invoke-static {v2}, La/azw;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-direct {v7, v2}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    iget-object v8, v1, La/lr5;->e:Ljava/lang/String;

    .line 147
    .line 148
    iget-object v9, v1, La/lr5;->f:Ljava/lang/String;

    .line 149
    .line 150
    const/4 v10, 0x0

    .line 151
    const/16 v11, 0x40

    .line 152
    .line 153
    invoke-direct/range {v4 .. v11}, La/fr5;-><init>(ILa/n0x;La/n0x;Ljava/lang/String;Ljava/lang/String;La/er5;I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 161
    .line 162
    .line 163
    return-object v3

    .line 164
    :cond_b
    invoke-static {p1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    new-instance p1, La/heb0;

    .line 169
    .line 170
    const/4 v1, 0x0

    .line 171
    invoke-direct {p1, v0, p0, v1}, La/heb0;-><init>(La/lq5;La/a4x;Z)V

    .line 172
    .line 173
    .line 174
    return-object p1

    .line 175
    :cond_c
    return-object v3
.end method
