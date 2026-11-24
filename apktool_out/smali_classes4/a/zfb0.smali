.class public final synthetic La/zfb0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/zfb0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/zfb0;

    .line 2
    .line 3
    const-string v4, "toScreenUiModel(Lorg/xplatform/games_section/feature/popular/impl/presentation/mappers/models/PopularOneXGamesMapperContentState;)Lorg/xplatform/games_section/feature/popular/impl/presentation/models/ui/PopularOneXGamesUiModel;"

    .line 4
    .line 5
    const/4 v5, 0x1

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/ro4;

    .line 8
    .line 9
    const-string v3, "toScreenUiModel"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/zfb0;->a:La/zfb0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, La/ifb0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 7
    .line 8
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 13
    .line 14
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-object p0, p1, La/ifb0;->g:La/mdm;

    .line 19
    .line 20
    if-nez p0, :cond_9

    .line 21
    .line 22
    iget-object v2, p1, La/ifb0;->a:Ljava/util/List;

    .line 23
    .line 24
    new-instance v3, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_8

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, La/web0;

    .line 44
    .line 45
    instance-of v5, v4, La/teb0;

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    if-eqz v5, :cond_5

    .line 49
    .line 50
    check-cast v4, La/teb0;

    .line 51
    .line 52
    iget-object v4, v4, La/teb0;->a:La/y4t;

    .line 53
    .line 54
    sget-object v5, La/y4t;->d:La/y4t;

    .line 55
    .line 56
    if-ne v4, v5, :cond_1

    .line 57
    .line 58
    iget-object v4, p1, La/ifb0;->f:La/leb0;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    iget-object v5, p1, La/ifb0;->e:Ljava/util/List;

    .line 62
    .line 63
    if-eqz v5, :cond_4

    .line 64
    .line 65
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_3

    .line 74
    .line 75
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    move-object v8, v7

    .line 80
    check-cast v8, La/keb0;

    .line 81
    .line 82
    invoke-interface {v8}, La/keb0;->B()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    iget-object v9, v4, La/y4t;->a:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-eqz v8, :cond_2

    .line 93
    .line 94
    move-object v6, v7

    .line 95
    :cond_3
    check-cast v6, La/keb0;

    .line 96
    .line 97
    :cond_4
    move-object v4, v6

    .line 98
    goto :goto_1

    .line 99
    :cond_5
    sget-object v5, La/ueb0;->a:La/ueb0;

    .line 100
    .line 101
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-eqz v5, :cond_6

    .line 106
    .line 107
    iget-object v4, p1, La/ifb0;->d:La/neb0;

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_6
    sget-object v5, La/veb0;->a:La/veb0;

    .line 111
    .line 112
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_7

    .line 117
    .line 118
    iget-object v4, p1, La/ifb0;->c:La/neb0;

    .line 119
    .line 120
    :goto_1
    if-eqz v4, :cond_0

    .line 121
    .line 122
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 127
    .line 128
    .line 129
    return-object v6

    .line 130
    :cond_8
    new-instance v2, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 133
    .line 134
    .line 135
    iget-object p1, p1, La/ifb0;->b:La/heb0;

    .line 136
    .line 137
    if-eqz p1, :cond_a

    .line 138
    .line 139
    const/4 v3, 0x0

    .line 140
    invoke-virtual {v2, v3, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_9
    sget-object v2, La/iun;->a:La/iun;

    .line 145
    .line 146
    :cond_a
    :goto_2
    new-instance p1, La/vfb0;

    .line 147
    .line 148
    invoke-direct {p1, v0, v1, v2, p0}, La/vfb0;-><init>(JLjava/util/List;La/mdm;)V

    .line 149
    .line 150
    .line 151
    return-object p1
.end method
