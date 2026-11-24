.class public final La/fua;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/util/List;

.field public static final f:Ljava/util/List;

.field public static final g:Ljava/util/List;

.field public static final h:Ljava/util/List;


# instance fields
.field public final a:La/mta;

.field public final b:La/zvf;

.field public final c:La/kta;

.field public final d:La/mne;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    sget-object v0, La/dja;->b:La/dja;

    .line 2
    .line 3
    sget-object v1, La/dja;->c:La/dja;

    .line 4
    .line 5
    sget-object v2, La/dja;->d:La/dja;

    .line 6
    .line 7
    sget-object v3, La/dja;->h:La/dja;

    .line 8
    .line 9
    sget-object v4, La/dja;->i:La/dja;

    .line 10
    .line 11
    sget-object v5, La/dja;->j:La/dja;

    .line 12
    .line 13
    sget-object v6, La/dja;->k:La/dja;

    .line 14
    .line 15
    sget-object v7, La/dja;->l:La/dja;

    .line 16
    .line 17
    sget-object v8, La/dja;->m:La/dja;

    .line 18
    .line 19
    sget-object v9, La/dja;->n:La/dja;

    .line 20
    .line 21
    filled-new-array/range {v0 .. v9}, [La/dja;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    sput-object v2, La/fua;->e:Ljava/util/List;

    .line 30
    .line 31
    sget-object v2, La/dja;->f:La/dja;

    .line 32
    .line 33
    move-object v10, v9

    .line 34
    move-object v9, v8

    .line 35
    move-object v8, v7

    .line 36
    move-object v7, v6

    .line 37
    move-object v6, v5

    .line 38
    move-object v5, v4

    .line 39
    move-object v4, v3

    .line 40
    sget-object v3, La/dja;->g:La/dja;

    .line 41
    .line 42
    filled-new-array/range {v0 .. v10}, [La/dja;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    move-object v3, v4

    .line 47
    move-object v4, v5

    .line 48
    move-object v5, v6

    .line 49
    move-object v6, v7

    .line 50
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, La/fua;->f:Ljava/util/List;

    .line 55
    .line 56
    sget-object v2, La/dja;->e:La/dja;

    .line 57
    .line 58
    sget-object v7, La/dja;->o:La/dja;

    .line 59
    .line 60
    filled-new-array/range {v1 .. v7}, [La/dja;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sput-object v0, La/fua;->g:Ljava/util/List;

    .line 69
    .line 70
    move-object v2, v3

    .line 71
    move-object v3, v4

    .line 72
    move-object v4, v5

    .line 73
    move-object v5, v6

    .line 74
    move-object v6, v7

    .line 75
    filled-new-array/range {v1 .. v6}, [La/dja;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sput-object v0, La/fua;->h:Ljava/util/List;

    .line 84
    .line 85
    return-void
.end method

.method public constructor <init>(La/mta;La/zvf;La/kta;La/mne;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/fua;->a:La/mta;

    .line 14
    .line 15
    iput-object p2, p0, La/fua;->b:La/zvf;

    .line 16
    .line 17
    iput-object p3, p0, La/fua;->c:La/kta;

    .line 18
    .line 19
    iput-object p4, p0, La/fua;->d:La/mne;

    .line 20
    .line 21
    return-void
.end method

.method public static b(La/udl0;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-ne p0, v0, :cond_0

    .line 15
    .line 16
    sget-object p0, La/fua;->h:Ljava/util/List;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :cond_1
    sget-object p0, La/fua;->g:Ljava/util/List;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    sget-object p0, La/fua;->f:Ljava/util/List;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_3
    sget-object p0, La/fua;->e:Ljava/util/List;

    .line 31
    .line 32
    return-object p0
.end method


# virtual methods
.method public final a(La/udl0;)Ljava/util/List;
    .locals 4

    .line 1
    iget-object p0, p0, La/fua;->a:La/mta;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/mta;->a:La/q7d0;

    .line 7
    .line 8
    const-string v0, "KEY_CARDS_INFO_SETTINGS_SPORT_GAME_TYPE"

    .line 9
    .line 10
    invoke-static {p0, v0}, La/q7d0;->c(La/q7d0;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v0, v2

    .line 27
    :goto_0
    if-eqz v0, :cond_5

    .line 28
    .line 29
    const-string v0, ""

    .line 30
    .line 31
    invoke-virtual {p0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v1, "KEY_CARDS_INFO_SETTINGS_ORDER"

    .line 36
    .line 37
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-eqz p0, :cond_5

    .line 42
    .line 43
    invoke-static {p0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move-object p0, v2

    .line 51
    :goto_1
    if-eqz p0, :cond_5

    .line 52
    .line 53
    const-string v0, ","

    .line 54
    .line 55
    filled-new-array {v0}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const/4 v1, 0x0

    .line 60
    const/4 v3, 0x6

    .line 61
    invoke-static {p0, v0, v1, v3}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-eqz p0, :cond_5

    .line 66
    .line 67
    new-instance v0, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    :cond_2
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_4

    .line 81
    .line 82
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Ljava/lang/String;

    .line 87
    .line 88
    :try_start_0
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 89
    .line 90
    invoke-static {v1}, La/dja;->valueOf(Ljava/lang/String;)La/dja;

    .line 91
    .line 92
    .line 93
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    goto :goto_3

    .line 95
    :catchall_0
    move-exception v1

    .line 96
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 97
    .line 98
    new-instance v3, La/g0g0;

    .line 99
    .line 100
    invoke-direct {v3, v1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    move-object v1, v3

    .line 104
    :goto_3
    nop

    .line 105
    instance-of v3, v1, La/g0g0;

    .line 106
    .line 107
    if-eqz v3, :cond_3

    .line 108
    .line 109
    move-object v1, v2

    .line 110
    :cond_3
    check-cast v1, La/dja;

    .line 111
    .line 112
    if-eqz v1, :cond_2

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    move-object v2, v0

    .line 119
    :cond_5
    if-nez v2, :cond_6

    .line 120
    .line 121
    invoke-static {p1}, La/fua;->b(La/udl0;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    :cond_6
    return-object v2
.end method
