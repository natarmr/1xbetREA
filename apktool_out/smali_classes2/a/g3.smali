.class public final La/g3;
.super La/u1;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/g3;->a:B

    iput-object p1, p0, La/g3;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    .line 1
    iget-byte v0, p0, La/g3;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/g3;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/uh90;

    .line 9
    .line 10
    iget-object p0, p0, La/uh90;->f:La/dh90;

    .line 11
    .line 12
    invoke-virtual {p0}, La/dh90;->c()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :pswitch_0
    check-cast p0, La/eh90;

    .line 18
    .line 19
    iget p0, p0, La/eh90;->e:I

    .line 20
    .line 21
    return p0

    .line 22
    :pswitch_1
    check-cast p0, La/dh90;

    .line 23
    .line 24
    iget p0, p0, La/dh90;->e:I

    .line 25
    .line 26
    return p0

    .line 27
    :pswitch_2
    check-cast p0, La/bh30;

    .line 28
    .line 29
    iget-object p0, p0, La/bh30;->a:Ljava/util/regex/Matcher;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->groupCount()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    add-int/lit8 p0, p0, 0x1

    .line 36
    .line 37
    return p0

    .line 38
    :pswitch_3
    check-cast p0, La/h3;

    .line 39
    .line 40
    invoke-virtual {p0}, La/h3;->c()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-byte v0, p0, La/g3;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/g3;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, La/uh90;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, La/h3;->containsValue(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    check-cast v1, La/eh90;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, La/h3;->containsValue(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :pswitch_1
    check-cast v1, La/dh90;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, La/h3;->containsValue(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :pswitch_2
    if-nez p1, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    instance-of v0, p1, Lkotlin/text/MatchGroup;

    .line 34
    .line 35
    :goto_0
    if-nez v0, :cond_1

    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    check-cast p1, Lkotlin/text/MatchGroup;

    .line 40
    .line 41
    invoke-super {p0, p1}, La/u1;->contains(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    :goto_1
    return p0

    .line 46
    :pswitch_3
    check-cast v1, La/h3;

    .line 47
    .line 48
    invoke-virtual {v1, p1}, La/h3;->containsValue(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e(I)Lkotlin/text/MatchGroup;
    .locals 2

    .line 1
    iget-object p0, p0, La/g3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/bh30;

    .line 4
    .line 5
    iget-object p0, p0, La/bh30;->a:Ljava/util/regex/Matcher;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->start(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->end(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v0, v1}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget v1, v0, Lkotlin/ranges/a;->a:I

    .line 20
    .line 21
    if-ltz v1, :cond_0

    .line 22
    .line 23
    new-instance v1, Lkotlin/text/MatchGroup;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, p0, v0}, Lkotlin/text/MatchGroup;-><init>(Ljava/lang/String;Lkotlin/ranges/IntRange;)V

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    return-object p0
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget-byte v0, p0, La/g3;->a:B

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, La/u1;->isEmpty()Z

    move-result p0

    return p0

    :pswitch_0
    const/4 p0, 0x0

    return p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 6

    .line 1
    iget-byte v0, p0, La/g3;->a:B

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x2

    .line 8
    iget-object v5, p0, La/g3;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance p0, La/zh90;

    .line 14
    .line 15
    check-cast v5, La/uh90;

    .line 16
    .line 17
    invoke-direct {p0, v5, v4}, La/zh90;-><init>(La/uh90;B)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    new-instance p0, La/rh90;

    .line 22
    .line 23
    check-cast v5, La/eh90;

    .line 24
    .line 25
    iget-object v0, v5, La/eh90;->d:La/oqs0;

    .line 26
    .line 27
    new-array v3, v1, [La/pqs0;

    .line 28
    .line 29
    :goto_0
    if-ge v2, v1, :cond_0

    .line 30
    .line 31
    new-instance v5, La/rqs0;

    .line 32
    .line 33
    invoke-direct {v5, v4}, La/rqs0;-><init>(B)V

    .line 34
    .line 35
    .line 36
    aput-object v5, v3, v2

    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-direct {p0, v0, v3}, La/fh90;-><init>(La/oqs0;[La/pqs0;)V

    .line 42
    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_1
    new-instance p0, La/qh90;

    .line 46
    .line 47
    check-cast v5, La/dh90;

    .line 48
    .line 49
    iget-object v0, v5, La/dh90;->d:La/nqs0;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    new-array v3, v1, [La/pqs0;

    .line 55
    .line 56
    :goto_1
    if-ge v2, v1, :cond_1

    .line 57
    .line 58
    new-instance v5, La/qqs0;

    .line 59
    .line 60
    invoke-direct {v5, v4}, La/qqs0;-><init>(B)V

    .line 61
    .line 62
    .line 63
    aput-object v5, v3, v2

    .line 64
    .line 65
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-direct {p0, v0, v3}, La/fh90;-><init>(La/nqs0;[La/pqs0;)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_2
    invoke-static {p0}, La/q3d;->h(Ljava/util/Collection;)Lkotlin/ranges/IntRange;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    new-instance v1, La/sx3;

    .line 77
    .line 78
    invoke-direct {v1, v0, v3}, La/sx3;-><init>(Ljava/lang/Object;B)V

    .line 79
    .line 80
    .line 81
    new-instance v0, La/b530;

    .line 82
    .line 83
    invoke-direct {v0, p0, v4}, La/b530;-><init>(Ljava/lang/Object;B)V

    .line 84
    .line 85
    .line 86
    invoke-static {v1, v0}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    new-instance v0, La/pls0;

    .line 91
    .line 92
    invoke-direct {v0, p0}, La/pls0;-><init>(La/qls0;)V

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_3
    check-cast v5, La/h3;

    .line 97
    .line 98
    invoke-virtual {v5}, La/h3;->a()Ljava/util/Set;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    new-instance v0, La/e3;

    .line 107
    .line 108
    invoke-direct {v0, p0, v3}, La/e3;-><init>(Ljava/util/Iterator;B)V

    .line 109
    .line 110
    .line 111
    return-object v0

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
