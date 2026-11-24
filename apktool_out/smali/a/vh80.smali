.class public final La/vh80;
.super La/wh80;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/vh80;->a:Ljava/util/List;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(La/caw;La/yje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, La/th80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/th80;

    .line 7
    .line 8
    iget v1, v0, La/th80;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/th80;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/th80;

    .line 21
    .line 22
    check-cast p2, La/zje;

    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, La/th80;-><init>(La/vh80;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v0, La/th80;->m:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, v0, La/th80;->o:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, La/th80;->l:Ljava/lang/Object;

    .line 39
    .line 40
    iget-object p1, v0, La/th80;->k:Ljava/util/Iterator;

    .line 41
    .line 42
    iget-object v2, v0, La/th80;->j:Ljava/util/Collection;

    .line 43
    .line 44
    check-cast v2, Ljava/util/Collection;

    .line 45
    .line 46
    iget-object v4, v0, La/th80;->i:Lkotlin/jvm/functions/Function2;

    .line 47
    .line 48
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0

    .line 59
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance p2, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, La/vh80;->a:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    move-object v2, p1

    .line 74
    move-object p1, p0

    .line 75
    move-object p0, v2

    .line 76
    move-object v2, p2

    .line 77
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-eqz p2, :cond_5

    .line 82
    .line 83
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    iput-object p0, v0, La/th80;->i:Lkotlin/jvm/functions/Function2;

    .line 88
    .line 89
    move-object v4, v2

    .line 90
    check-cast v4, Ljava/util/Collection;

    .line 91
    .line 92
    iput-object v4, v0, La/th80;->j:Ljava/util/Collection;

    .line 93
    .line 94
    iput-object p1, v0, La/th80;->k:Ljava/util/Iterator;

    .line 95
    .line 96
    iput-object p2, v0, La/th80;->l:Ljava/lang/Object;

    .line 97
    .line 98
    iput v3, v0, La/th80;->o:I

    .line 99
    .line 100
    invoke-interface {p0, p2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    if-ne v4, v1, :cond_3

    .line 105
    .line 106
    return-object v1

    .line 107
    :cond_3
    move-object v5, v4

    .line 108
    move-object v4, p0

    .line 109
    move-object p0, p2

    .line 110
    move-object p2, v5

    .line 111
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    .line 112
    .line 113
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    if-eqz p2, :cond_4

    .line 118
    .line 119
    invoke-interface {v2, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    :cond_4
    move-object p0, v4

    .line 123
    goto :goto_1

    .line 124
    :cond_5
    check-cast v2, Ljava/util/List;

    .line 125
    .line 126
    new-instance p0, La/vh80;

    .line 127
    .line 128
    invoke-direct {p0, v2}, La/vh80;-><init>(Ljava/util/List;)V

    .line 129
    .line 130
    .line 131
    return-object p0
.end method

.method public final b(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/uh80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/uh80;

    .line 7
    .line 8
    iget v1, v0, La/uh80;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/uh80;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/uh80;

    .line 21
    .line 22
    check-cast p1, La/zje;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, La/uh80;-><init>(La/vh80;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v0, La/uh80;->m:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, v0, La/uh80;->o:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, La/uh80;->l:Ljava/util/Collection;

    .line 39
    .line 40
    check-cast p0, Ljava/util/Collection;

    .line 41
    .line 42
    iget-object p2, v0, La/uh80;->k:Ljava/util/Iterator;

    .line 43
    .line 44
    iget-object v2, v0, La/uh80;->j:Ljava/util/Collection;

    .line 45
    .line 46
    check-cast v2, Ljava/util/Collection;

    .line 47
    .line 48
    iget-object v4, v0, La/uh80;->i:Lkotlin/jvm/functions/Function2;

    .line 49
    .line 50
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0

    .line 61
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    new-instance p1, Ljava/util/ArrayList;

    .line 65
    .line 66
    const/16 v2, 0xa

    .line 67
    .line 68
    iget-object p0, p0, La/vh80;->a:Ljava/util/List;

    .line 69
    .line 70
    invoke-static {p0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    move-object v5, p2

    .line 82
    move-object p2, p0

    .line 83
    move-object p0, p1

    .line 84
    move-object p1, v5

    .line 85
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    iput-object p1, v0, La/uh80;->i:Lkotlin/jvm/functions/Function2;

    .line 96
    .line 97
    move-object v4, p0

    .line 98
    check-cast v4, Ljava/util/Collection;

    .line 99
    .line 100
    iput-object v4, v0, La/uh80;->j:Ljava/util/Collection;

    .line 101
    .line 102
    iput-object p2, v0, La/uh80;->k:Ljava/util/Iterator;

    .line 103
    .line 104
    iput-object v4, v0, La/uh80;->l:Ljava/util/Collection;

    .line 105
    .line 106
    iput v3, v0, La/uh80;->o:I

    .line 107
    .line 108
    invoke-interface {p1, v2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    if-ne v2, v1, :cond_3

    .line 113
    .line 114
    return-object v1

    .line 115
    :cond_3
    move-object v4, p1

    .line 116
    move-object p1, v2

    .line 117
    move-object v2, p0

    .line 118
    :goto_2
    invoke-interface {p0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-object p0, v2

    .line 122
    move-object p1, v4

    .line 123
    goto :goto_1

    .line 124
    :cond_4
    check-cast p0, Ljava/util/List;

    .line 125
    .line 126
    new-instance p1, La/vh80;

    .line 127
    .line 128
    invoke-direct {p1, p0}, La/vh80;-><init>(Ljava/util/List;)V

    .line 129
    .line 130
    .line 131
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/vh80;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/vh80;

    .line 11
    .line 12
    iget-object p0, p0, La/vh80;->a:Ljava/util/List;

    .line 13
    .line 14
    iget-object p1, p1, La/vh80;->a:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-nez p0, :cond_2

    .line 21
    .line 22
    :goto_0
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object p0, p0, La/vh80;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-int/lit16 p0, p0, 0x745f

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/16 v1, 0x1f

    .line 11
    .line 12
    invoke-static {v0, p0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/2addr v0, p0

    .line 21
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PageEvent.StaticList with "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/vh80;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, " items (\n                    |   first item: "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, "\n                    |   last item: "

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p0, "\n                    |   sourceLoadStates: null,\n                    |   placeholdersBefore: 0,\n                    |   placeholdersAfter: 0,\n                    "

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string v0, "|)"

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0}, La/ntm0;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method
