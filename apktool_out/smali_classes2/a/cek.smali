.class public final La/cek;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:La/bek;

.field public static d:I = 0x1

.field public static final e:I

.field public static final f:I

.field public static final g:I

.field public static final h:I

.field public static final i:I

.field public static final j:I

.field public static final k:I

.field public static final l:I

.field public static final m:La/cek;

.field public static final n:La/cek;

.field public static final o:La/cek;

.field public static final p:La/cek;

.field public static final q:La/cek;

.field public static final r:La/n0o0;

.field public static final s:La/n0o0;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, La/bek;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/cek;->c:La/bek;

    .line 7
    .line 8
    invoke-static {}, La/bek;->q()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    sput v0, La/cek;->e:I

    .line 13
    .line 14
    invoke-static {}, La/bek;->q()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    sput v1, La/cek;->f:I

    .line 19
    .line 20
    invoke-static {}, La/bek;->q()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    sput v2, La/cek;->g:I

    .line 25
    .line 26
    invoke-static {}, La/bek;->q()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    sput v3, La/cek;->h:I

    .line 31
    .line 32
    invoke-static {}, La/bek;->q()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    sput v4, La/cek;->i:I

    .line 37
    .line 38
    invoke-static {}, La/bek;->q()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    sput v5, La/cek;->j:I

    .line 43
    .line 44
    invoke-static {}, La/bek;->q()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    add-int/lit8 v6, v6, -0x1

    .line 49
    .line 50
    sput v6, La/cek;->k:I

    .line 51
    .line 52
    or-int v7, v0, v1

    .line 53
    .line 54
    or-int/2addr v7, v2

    .line 55
    sput v7, La/cek;->l:I

    .line 56
    .line 57
    or-int v8, v1, v4

    .line 58
    .line 59
    or-int/2addr v8, v5

    .line 60
    or-int v9, v4, v5

    .line 61
    .line 62
    new-instance v10, La/cek;

    .line 63
    .line 64
    invoke-direct {v10, v6}, La/cek;-><init>(I)V

    .line 65
    .line 66
    .line 67
    sput-object v10, La/cek;->m:La/cek;

    .line 68
    .line 69
    new-instance v6, La/cek;

    .line 70
    .line 71
    invoke-direct {v6, v9}, La/cek;-><init>(I)V

    .line 72
    .line 73
    .line 74
    sput-object v6, La/cek;->n:La/cek;

    .line 75
    .line 76
    new-instance v6, La/cek;

    .line 77
    .line 78
    invoke-direct {v6, v0}, La/cek;-><init>(I)V

    .line 79
    .line 80
    .line 81
    new-instance v0, La/cek;

    .line 82
    .line 83
    invoke-direct {v0, v1}, La/cek;-><init>(I)V

    .line 84
    .line 85
    .line 86
    new-instance v0, La/cek;

    .line 87
    .line 88
    invoke-direct {v0, v2}, La/cek;-><init>(I)V

    .line 89
    .line 90
    .line 91
    new-instance v0, La/cek;

    .line 92
    .line 93
    invoke-direct {v0, v7}, La/cek;-><init>(I)V

    .line 94
    .line 95
    .line 96
    sput-object v0, La/cek;->o:La/cek;

    .line 97
    .line 98
    new-instance v0, La/cek;

    .line 99
    .line 100
    invoke-direct {v0, v3}, La/cek;-><init>(I)V

    .line 101
    .line 102
    .line 103
    new-instance v0, La/cek;

    .line 104
    .line 105
    invoke-direct {v0, v4}, La/cek;-><init>(I)V

    .line 106
    .line 107
    .line 108
    sput-object v0, La/cek;->p:La/cek;

    .line 109
    .line 110
    new-instance v0, La/cek;

    .line 111
    .line 112
    invoke-direct {v0, v5}, La/cek;-><init>(I)V

    .line 113
    .line 114
    .line 115
    sput-object v0, La/cek;->q:La/cek;

    .line 116
    .line 117
    new-instance v0, La/cek;

    .line 118
    .line 119
    invoke-direct {v0, v8}, La/cek;-><init>(I)V

    .line 120
    .line 121
    .line 122
    sget-object v0, La/t55;->g:La/t55;

    .line 123
    .line 124
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    sput-object v0, La/cek;->r:La/n0o0;

    .line 129
    .line 130
    sget-object v0, La/t55;->h:La/t55;

    .line 131
    .line 132
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    sput-object v0, La/cek;->s:La/n0o0;

    .line 137
    .line 138
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 35
    sget-object v0, La/iun;->a:La/iun;

    .line 36
    invoke-direct {p0, p1, v0}, La/cek;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/cek;->a:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, La/zdk;

    .line 24
    .line 25
    invoke-virtual {v0}, La/zdk;->a()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    not-int v0, v0

    .line 30
    and-int/2addr p1, v0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput p1, p0, La/cek;->b:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 0

    .line 1
    iget p0, p0, La/cek;->b:I

    .line 2
    .line 3
    and-int/2addr p0, p1

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v1, 0x0

    .line 13
    :goto_0
    const-class v2, La/cek;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    return v2

    .line 23
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast p1, La/cek;

    .line 27
    .line 28
    iget-object v1, p0, La/cek;->a:Ljava/util/List;

    .line 29
    .line 30
    iget-object v3, p1, La/cek;->a:Ljava/util/List;

    .line 31
    .line 32
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    return v2

    .line 39
    :cond_3
    iget p0, p0, La/cek;->b:I

    .line 40
    .line 41
    iget p1, p1, La/cek;->b:I

    .line 42
    .line 43
    if-eq p0, p1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, La/cek;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget p0, p0, La/cek;->b:I

    .line 10
    .line 11
    add-int/2addr v0, p0

    .line 12
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    sget-object v0, La/cek;->r:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    move-object v3, v1

    .line 25
    check-cast v3, La/aek;

    .line 26
    .line 27
    iget v3, v3, La/aek;->a:I

    .line 28
    .line 29
    iget v4, p0, La/cek;->b:I

    .line 30
    .line 31
    if-ne v3, v4, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v1, v2

    .line 35
    :goto_0
    check-cast v1, La/aek;

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    iget-object v0, v1, La/aek;->b:Ljava/lang/String;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move-object v0, v2

    .line 43
    :goto_1
    if-nez v0, :cond_6

    .line 44
    .line 45
    sget-object v0, La/cek;->s:La/n0o0;

    .line 46
    .line 47
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/util/List;

    .line 52
    .line 53
    new-instance v3, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_5

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, La/aek;

    .line 73
    .line 74
    iget v4, v1, La/aek;->a:I

    .line 75
    .line 76
    invoke-virtual {p0, v4}, La/cek;->a(I)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_4

    .line 81
    .line 82
    iget-object v1, v1, La/aek;->b:Ljava/lang/String;

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    move-object v1, v2

    .line 86
    :goto_3
    if-eqz v1, :cond_3

    .line 87
    .line 88
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    const/4 v7, 0x0

    .line 93
    const/16 v8, 0x3e

    .line 94
    .line 95
    const-string v4, " | "

    .line 96
    .line 97
    const/4 v5, 0x0

    .line 98
    const/4 v6, 0x0

    .line 99
    invoke-static/range {v3 .. v8}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :cond_6
    const-string v1, "DescriptorKindFilter("

    .line 104
    .line 105
    const-string v2, ", "

    .line 106
    .line 107
    invoke-static {v1, v0, v2}, La/kng0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object p0, p0, La/cek;->a:Ljava/util/List;

    .line 112
    .line 113
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const/16 p0, 0x29

    .line 117
    .line 118
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0
.end method
