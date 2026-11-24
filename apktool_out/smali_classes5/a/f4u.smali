.class public final La/f4u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/edo;)V
    .locals 1

    const/4 v0, 0x5

    iput-byte v0, p0, La/f4u;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, La/f4u;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/fsd;)V
    .locals 1

    const/16 v0, 0x13

    iput-byte v0, p0, La/f4u;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, La/f4u;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/goo;)V
    .locals 1

    const/4 v0, 0x7

    iput-byte v0, p0, La/f4u;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, La/f4u;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/m6d0;)V
    .locals 1

    const/16 v0, 0x1b

    iput-byte v0, p0, La/f4u;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, La/f4u;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/pew;)V
    .locals 1

    const/16 v0, 0xc

    iput-byte v0, p0, La/f4u;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, La/f4u;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/qfb0;)V
    .locals 1

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    iput-byte v0, p0, La/f4u;->a:B

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, La/f4u;->b:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(La/ros;)V
    .locals 1

    const/16 v0, 0xa

    iput-byte v0, p0, La/f4u;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, La/f4u;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 14
    iput-byte p2, p0, La/f4u;->a:B

    iput-object p1, p0, La/f4u;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/n0w;)La/gmq;
    .locals 1

    .line 1
    iget-object p0, p0, La/f4u;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/b6t;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-ne p1, v0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, La/b6t;->c:La/t5t;

    .line 15
    .line 16
    iget-object p0, p0, La/t5t;->a:La/p7m0;

    .line 17
    .line 18
    new-instance p1, La/i89;

    .line 19
    .line 20
    const/16 v0, 0x16

    .line 21
    .line 22
    invoke-direct {p1, p0, v0}, La/i89;-><init>(La/gmq;B)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0

    .line 31
    :cond_1
    iget-object p0, p0, La/b6t;->b:La/v5t;

    .line 32
    .line 33
    iget-object p0, p0, La/v5t;->a:La/ouu;

    .line 34
    .line 35
    invoke-virtual {p0}, La/ouu;->z()La/xp90;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public b()La/xv10;
    .locals 0

    .line 1
    iget-object p0, p0, La/f4u;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/fsd;

    .line 4
    .line 5
    iget-object p0, p0, La/fsd;->a:La/bsd;

    .line 6
    .line 7
    iget-object p0, p0, La/bsd;->d:La/n0o0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, La/xv10;

    .line 14
    .line 15
    return-object p0
.end method

.method public c()La/j6d0;
    .locals 7

    .line 1
    iget-object p0, p0, La/f4u;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/m6d0;

    .line 4
    .line 5
    iget-object p0, p0, La/m6d0;->a:La/l6d0;

    .line 6
    .line 7
    iget-object p0, p0, La/l6d0;->a:La/euc;

    .line 8
    .line 9
    iget-object p0, p0, La/euc;->a:La/zn00;

    .line 10
    .line 11
    invoke-virtual {p0}, La/zn00;->H0()La/e6d0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v0, La/j6d0;

    .line 19
    .line 20
    iget-boolean v1, p0, La/e6d0;->a:Z

    .line 21
    .line 22
    iget-object v2, p0, La/e6d0;->b:La/t6d0;

    .line 23
    .line 24
    sget-object v3, La/t6d0;->c:La/t6d0;

    .line 25
    .line 26
    if-ne v2, v3, :cond_0

    .line 27
    .line 28
    sget-object v2, La/u6d0;->b:La/u6d0;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    sget-object v2, La/u6d0;->a:La/u6d0;

    .line 32
    .line 33
    :goto_0
    iget-object v3, p0, La/e6d0;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget v4, p0, La/e6d0;->d:I

    .line 36
    .line 37
    iget-object v5, p0, La/e6d0;->e:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v6, p0, La/e6d0;->f:Ljava/lang/String;

    .line 40
    .line 41
    invoke-direct/range {v0 .. v6}, La/j6d0;-><init>(ZLa/u6d0;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method

.method public d(La/zje;)Ljava/io/Serializable;
    .locals 5

    .line 1
    instance-of v0, p1, La/ugu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/ugu;

    .line 7
    .line 8
    iget v1, v0, La/ugu;->l:I

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
    iput v1, v0, La/ugu;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ugu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/ugu;-><init>(La/f4u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/ugu;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ugu;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, La/ugu;->i:Ljava/util/LinkedHashSet;

    .line 37
    .line 38
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 53
    .line 54
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, La/f4u;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, La/u8u;

    .line 60
    .line 61
    iput-object p1, v0, La/ugu;->i:Ljava/util/LinkedHashSet;

    .line 62
    .line 63
    iput v3, v0, La/ugu;->l:I

    .line 64
    .line 65
    invoke-virtual {p0, v0}, La/u8u;->v(La/zje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-ne p0, v1, :cond_3

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_3
    move-object v4, p1

    .line 73
    move-object p1, p0

    .line 74
    move-object p0, v4

    .line 75
    :goto_1
    check-cast p1, Ljava/lang/Iterable;

    .line 76
    .line 77
    new-instance v0, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_5

    .line 91
    .line 92
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    move-object v2, v1

    .line 97
    check-cast v2, La/muy;

    .line 98
    .line 99
    iget-object v3, v2, La/muy;->c:Ljava/lang/String;

    .line 100
    .line 101
    invoke-interface {p0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_4

    .line 106
    .line 107
    iget-object v2, v2, La/muy;->a:Ljava/util/List;

    .line 108
    .line 109
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-nez v2, :cond_4

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    return-object v0
.end method

.method public e(La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/ziu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/ziu;

    .line 7
    .line 8
    iget v1, v0, La/ziu;->k:I

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
    iput v1, v0, La/ziu;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ziu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/ziu;-><init>(La/f4u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/ziu;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ziu;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/f4u;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/ywu;

    .line 53
    .line 54
    iput v3, v0, La/ziu;->k:I

    .line 55
    .line 56
    invoke-virtual {p0, v0}, La/ywu;->q(La/zje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v1, :cond_3

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    :goto_1
    move-object v0, p1

    .line 64
    check-cast v0, Ljava/lang/Iterable;

    .line 65
    .line 66
    const/4 v4, 0x0

    .line 67
    const/16 v5, 0x3e

    .line 68
    .line 69
    const-string v1, " "

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    const/4 v3, 0x0

    .line 73
    invoke-static/range {v0 .. v5}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0
.end method

.method public f(JLa/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/f4u;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/f4u;->b:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/high16 v4, -0x80000000

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    instance-of v0, p3, La/xdu;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move-object v0, p3

    .line 19
    check-cast v0, La/xdu;

    .line 20
    .line 21
    iget v6, v0, La/xdu;->k:I

    .line 22
    .line 23
    and-int v7, v6, v4

    .line 24
    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    sub-int/2addr v6, v4

    .line 28
    iput v6, v0, La/xdu;->k:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, La/xdu;

    .line 32
    .line 33
    invoke-direct {v0, p0, p3}, La/xdu;-><init>(La/f4u;La/zje;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object p0, v0, La/xdu;->i:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object p3, La/wne;->a:La/wne;

    .line 39
    .line 40
    iget v4, v0, La/xdu;->k:I

    .line 41
    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    check-cast p0, La/j0g0;

    .line 50
    .line 51
    iget-object v2, p0, La/j0g0;->a:Ljava/lang/Object;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    check-cast v1, La/edu;

    .line 62
    .line 63
    iput v5, v0, La/xdu;->k:I

    .line 64
    .line 65
    invoke-virtual {v1, p1, p2, v0}, La/edu;->d(JLa/zje;)Ljava/io/Serializable;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-ne v2, p3, :cond_3

    .line 70
    .line 71
    move-object v2, p3

    .line 72
    :cond_3
    :goto_1
    return-object v2

    .line 73
    :pswitch_0
    instance-of v0, p3, La/t9u;

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    move-object v0, p3

    .line 78
    check-cast v0, La/t9u;

    .line 79
    .line 80
    iget v6, v0, La/t9u;->k:I

    .line 81
    .line 82
    and-int v7, v6, v4

    .line 83
    .line 84
    if-eqz v7, :cond_4

    .line 85
    .line 86
    sub-int/2addr v6, v4

    .line 87
    iput v6, v0, La/t9u;->k:I

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    new-instance v0, La/t9u;

    .line 91
    .line 92
    invoke-direct {v0, p0, p3}, La/t9u;-><init>(La/f4u;La/zje;)V

    .line 93
    .line 94
    .line 95
    :goto_2
    iget-object p0, v0, La/t9u;->i:Ljava/lang/Object;

    .line 96
    .line 97
    sget-object p3, La/wne;->a:La/wne;

    .line 98
    .line 99
    iget v4, v0, La/t9u;->k:I

    .line 100
    .line 101
    if-eqz v4, :cond_6

    .line 102
    .line 103
    if-ne v4, v5, :cond_5

    .line 104
    .line 105
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    check-cast p0, La/j0g0;

    .line 109
    .line 110
    iget-object v2, p0, La/j0g0;->a:Ljava/lang/Object;

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    check-cast v1, La/wti;

    .line 121
    .line 122
    iput v5, v0, La/t9u;->k:I

    .line 123
    .line 124
    invoke-virtual {v1, p1, p2, v0}, La/wti;->f(JLa/zje;)Ljava/io/Serializable;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    if-ne v2, p3, :cond_7

    .line 129
    .line 130
    move-object v2, p3

    .line 131
    :cond_7
    :goto_3
    return-object v2

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method
