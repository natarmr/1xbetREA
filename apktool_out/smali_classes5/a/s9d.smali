.class public final La/s9d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/y78;

.field public final b:La/v9d;

.field public final c:La/iun;

.field public final d:Ljava/util/ArrayList;

.field public e:La/v9d;

.field public f:I

.field public final g:La/t43;

.field public h:La/mr20;

.field public final i:Ljava/util/List;


# direct methods
.method public constructor <init>(La/y78;La/v9d;)V
    .locals 13

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/s9d;->a:La/y78;

    .line 8
    .line 9
    iput-object p2, p0, La/s9d;->b:La/v9d;

    .line 10
    .line 11
    sget-object p1, La/iun;->a:La/iun;

    .line 12
    .line 13
    iput-object p1, p0, La/s9d;->c:La/iun;

    .line 14
    .line 15
    new-instance p1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/s9d;->d:Ljava/util/ArrayList;

    .line 21
    .line 22
    iput-object p2, p0, La/s9d;->e:La/v9d;

    .line 23
    .line 24
    const/4 v0, -0x1

    .line 25
    iput v0, p0, La/s9d;->f:I

    .line 26
    .line 27
    new-instance v0, La/t43;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-direct {v0, p0, v1}, La/t43;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, La/s9d;->g:La/t43;

    .line 34
    .line 35
    new-instance v0, La/mr20;

    .line 36
    .line 37
    invoke-direct {v0, p2, p2, p1}, La/mr20;-><init>(La/v9d;La/v9d;Ljava/util/List;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, La/s9d;->h:La/mr20;

    .line 41
    .line 42
    new-instance p1, La/l24;

    .line 43
    .line 44
    invoke-direct {p1, v1}, La/l24;-><init>(B)V

    .line 45
    .line 46
    .line 47
    new-instance p2, La/l24;

    .line 48
    .line 49
    const/4 v0, 0x2

    .line 50
    invoke-direct {p2, v0}, La/l24;-><init>(B)V

    .line 51
    .line 52
    .line 53
    new-instance v2, La/byc;

    .line 54
    .line 55
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    new-instance v3, La/xti0;

    .line 59
    .line 60
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    new-instance v4, La/h98;

    .line 64
    .line 65
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 66
    .line 67
    .line 68
    new-instance v5, La/l24;

    .line 69
    .line 70
    const/4 v6, 0x4

    .line 71
    invoke-direct {v5, v6}, La/l24;-><init>(B)V

    .line 72
    .line 73
    .line 74
    new-instance v7, La/l24;

    .line 75
    .line 76
    const/4 v8, 0x0

    .line 77
    invoke-direct {v7, v8}, La/l24;-><init>(B)V

    .line 78
    .line 79
    .line 80
    new-instance v9, La/gtw;

    .line 81
    .line 82
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    new-instance v10, La/l24;

    .line 86
    .line 87
    const/4 v11, 0x3

    .line 88
    invoke-direct {v10, v11}, La/l24;-><init>(B)V

    .line 89
    .line 90
    .line 91
    const/16 v12, 0x9

    .line 92
    .line 93
    new-array v12, v12, [La/jr20;

    .line 94
    .line 95
    aput-object p1, v12, v8

    .line 96
    .line 97
    aput-object p2, v12, v1

    .line 98
    .line 99
    aput-object v2, v12, v0

    .line 100
    .line 101
    aput-object v3, v12, v11

    .line 102
    .line 103
    aput-object v4, v12, v6

    .line 104
    .line 105
    const/4 p1, 0x5

    .line 106
    aput-object v5, v12, p1

    .line 107
    .line 108
    const/4 p1, 0x6

    .line 109
    aput-object v7, v12, p1

    .line 110
    .line 111
    const/4 p1, 0x7

    .line 112
    aput-object v9, v12, p1

    .line 113
    .line 114
    const/16 p1, 0x8

    .line 115
    .line 116
    aput-object v10, v12, p1

    .line 117
    .line 118
    invoke-static {v12}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iput-object p1, p0, La/s9d;->i:Ljava/util/List;

    .line 123
    .line 124
    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 7

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eq p2, v0, :cond_4

    .line 3
    .line 4
    iget-object v1, p0, La/s9d;->d:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/4 v3, 0x1

    .line 11
    sub-int/2addr v2, v3

    .line 12
    :goto_0
    if-le v2, p1, :cond_3

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, La/ir20;

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    if-eqz p2, :cond_2

    .line 24
    .line 25
    const/4 v5, 0x3

    .line 26
    if-ne p2, v5, :cond_0

    .line 27
    .line 28
    move v5, v3

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    move v5, p2

    .line 31
    :goto_1
    iget-object v6, v4, La/ir20;->b:La/y78;

    .line 32
    .line 33
    invoke-virtual {v4}, La/ir20;->d()La/ar20;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-static {v5, v6, v4}, La/w6x;->a(ILa/y78;La/ar20;)V

    .line 38
    .line 39
    .line 40
    if-eq v5, v0, :cond_1

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    add-int/lit8 v2, v2, -0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    new-instance p0, La/byw;

    .line 49
    .line 50
    const-string p1, "If closing action is not NOTHING, marker should be gone"

    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_2
    const/4 p0, 0x0

    .line 57
    throw p0

    .line 58
    :cond_3
    invoke-virtual {p0}, La/s9d;->b()V

    .line 59
    .line 60
    .line 61
    :cond_4
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, La/s9d;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, La/s9d;->b:La/v9d;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, La/ir20;

    .line 17
    .line 18
    iget-object v0, v0, La/ir20;->a:La/v9d;

    .line 19
    .line 20
    :goto_0
    iput-object v0, p0, La/s9d;->e:La/v9d;

    .line 21
    .line 22
    return-void
.end method
