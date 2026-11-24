.class public final La/ujp0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/p7m0;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/mjp0;->a:La/mjp0;

    .line 8
    .line 9
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/ujp0;->b:La/p7m0;

    .line 14
    .line 15
    new-instance p0, La/ljp0;

    .line 16
    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    sget-object v4, La/bop0;->b:La/m6m0;

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v2}, La/m6m0;->j(I)La/bop0;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    const/4 v4, 0x1

    .line 59
    if-eq v2, v4, :cond_1

    .line 60
    .line 61
    const/4 v4, 0x2

    .line 62
    if-ne v2, v4, :cond_0

    .line 63
    .line 64
    sget-object v2, La/lif0;->a:La/lif0;

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 71
    .line 72
    .line 73
    throw v3

    .line 74
    :cond_1
    new-instance v2, La/xt;

    .line 75
    .line 76
    sget-object v3, La/bop0;->d:La/bop0;

    .line 77
    .line 78
    const v4, 0x7f130069

    .line 79
    .line 80
    .line 81
    const v5, 0x7f080bc7

    .line 82
    .line 83
    .line 84
    invoke-direct {v2, v3, v4, v5}, La/xt;-><init>(La/bop0;II)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    new-instance v2, La/xt;

    .line 92
    .line 93
    sget-object v3, La/bop0;->c:La/bop0;

    .line 94
    .line 95
    const v4, 0x7f130068

    .line 96
    .line 97
    .line 98
    const v5, 0x7f0807a3

    .line 99
    .line 100
    .line 101
    invoke-direct {v2, v3, v4, v5}, La/xt;-><init>(La/bop0;II)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_3
    invoke-direct {p0, v1}, La/ljp0;-><init>(Ljava/util/ArrayList;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v3, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    return-void
.end method
