.class public final La/d0x;
.super La/mb00;
.source "SourceFile"


# static fields
.field public static final e:Lkotlin/text/Regex;


# instance fields
.field public final c:La/xme0;

.field public final d:La/gdx;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/text/Regex;

    .line 2
    .line 3
    const-string v1, "[^a-zA-Z0-9 ]"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/d0x;->e:Lkotlin/text/Regex;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(La/pb00;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/xme0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p1, v1}, La/xme0;-><init>(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/d0x;->c:La/xme0;

    .line 11
    .line 12
    new-instance p1, La/gdx;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/d0x;->d:La/gdx;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final b(La/j;Ljava/lang/String;)La/lb00;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/wb;->D:La/ar20;

    .line 5
    .line 6
    invoke-static {p1, v0}, La/dwi0;->L(La/j;La/ar20;)La/j;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/d0x;->d:La/gdx;

    .line 13
    .line 14
    invoke-virtual {p0, v0, p2}, La/gdx;->b(La/j;Ljava/lang/String;)La/lb00;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    sget-object v0, La/wb;->E:La/ar20;

    .line 20
    .line 21
    invoke-static {p1, v0}, La/dwi0;->L(La/j;La/ar20;)La/j;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    sget-object v0, La/wb;->F:La/ar20;

    .line 28
    .line 29
    invoke-static {p1, v0}, La/dwi0;->L(La/j;La/ar20;)La/j;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_1
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object p0, p0, La/d0x;->c:La/xme0;

    .line 36
    .line 37
    invoke-virtual {p0, v0, p2}, La/xme0;->b(La/j;Ljava/lang/String;)La/lb00;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_2
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method

.method public final d(La/htw;Ljava/lang/String;La/j;La/lb00;)V
    .locals 4

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v1, "src=\""

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p4, La/lb00;->b:Ljava/lang/CharSequence;

    .line 12
    .line 13
    invoke-virtual {p0, v1}, La/mb00;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/16 v1, 0x22

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v3, "alt=\""

    .line 31
    .line 32
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v3, p4, La/lb00;->a:La/j;

    .line 36
    .line 37
    invoke-virtual {p0, v3, p2}, La/d0x;->e(La/j;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    iget-object p2, p4, La/lb00;->c:Ljava/lang/CharSequence;

    .line 52
    .line 53
    if-eqz p2, :cond_0

    .line 54
    .line 55
    new-instance p4, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v2, "title=\""

    .line 58
    .line 59
    invoke-direct {p4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    const/4 p2, 0x0

    .line 74
    :goto_0
    const/4 p4, 0x3

    .line 75
    new-array p4, p4, [Ljava/lang/CharSequence;

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    aput-object v0, p4, v1

    .line 79
    .line 80
    const/4 v0, 0x1

    .line 81
    aput-object p0, p4, v0

    .line 82
    .line 83
    const/4 p0, 0x2

    .line 84
    aput-object p2, p4, p0

    .line 85
    .line 86
    const-string p0, "img"

    .line 87
    .line 88
    invoke-virtual {p1, p3, p0, p4, v0}, La/htw;->h0(La/j;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Z)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final e(La/j;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p1, La/j;->a:La/ar20;

    .line 2
    .line 3
    sget-object v1, La/wb;->A:La/ar20;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-string v2, ""

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    sget-object p0, La/d0x;->e:Lkotlin/text/Regex;

    .line 14
    .line 15
    invoke-static {p1, p2}, La/dwi0;->N(La/j;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p1, v2}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    instance-of v1, p1, La/fiz;

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    if-eqz v1, :cond_4

    .line 28
    .line 29
    sget-object p0, La/cy2;->T:La/ar20;

    .line 30
    .line 31
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_3

    .line 36
    .line 37
    sget-object p0, La/cy2;->U:La/ar20;

    .line 38
    .line 39
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_3

    .line 44
    .line 45
    sget-object p0, La/cy2;->V:La/ar20;

    .line 46
    .line 47
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-nez p0, :cond_3

    .line 52
    .line 53
    sget-object p0, La/cy2;->K:La/ar20;

    .line 54
    .line 55
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_3

    .line 60
    .line 61
    sget-object p0, La/cy2;->F:La/ar20;

    .line 62
    .line 63
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-nez p0, :cond_3

    .line 68
    .line 69
    sget-object p0, La/cy2;->G:La/ar20;

    .line 70
    .line 71
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_3

    .line 76
    .line 77
    sget-object p0, La/cy2;->D:La/ar20;

    .line 78
    .line 79
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-nez p0, :cond_3

    .line 84
    .line 85
    sget-object p0, La/cy2;->E:La/ar20;

    .line 86
    .line 87
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-eqz p0, :cond_1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    sget-object p0, La/cy2;->z:La/ar20;

    .line 95
    .line 96
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-eqz p0, :cond_2

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    sget-object p0, La/tzn;->a:Ljava/util/Map;

    .line 104
    .line 105
    invoke-static {p1, p2}, La/dwi0;->N(La/j;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0, v3, v3}, La/tzn;->a(Ljava/lang/CharSequence;ZZ)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    :cond_3
    :goto_0
    return-object v2

    .line 115
    :cond_4
    invoke-virtual {p1}, La/j;->a()Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    new-instance v4, La/fne;

    .line 120
    .line 121
    invoke-direct {v4, p0, p2, v3}, La/fne;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 122
    .line 123
    .line 124
    const/16 v5, 0x1e

    .line 125
    .line 126
    const-string v1, ""

    .line 127
    .line 128
    const/4 v2, 0x0

    .line 129
    const/4 v3, 0x0

    .line 130
    invoke-static/range {v0 .. v5}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0
.end method
