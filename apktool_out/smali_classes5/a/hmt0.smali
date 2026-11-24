.class public final La/hmt0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/kgr0;


# direct methods
.method public constructor <init>(La/kgr0;)V
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
    iput-object p1, p0, La/hmt0;->a:La/kgr0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(JJJD)V
    .locals 13

    .line 1
    iget-object p0, p0, La/hmt0;->a:La/kgr0;

    .line 2
    .line 3
    iget-object p0, p0, La/kgr0;->a:La/jgr0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/jgr0;->a(J)La/p7m0;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ljava/util/List;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    move-object v5, v4

    .line 33
    check-cast v5, La/lgr0;

    .line 34
    .line 35
    iget-wide v5, v5, La/lgr0;->a:J

    .line 36
    .line 37
    cmp-long v5, v5, p3

    .line 38
    .line 39
    if-nez v5, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object v4, v3

    .line 43
    :goto_0
    check-cast v4, La/lgr0;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-object v4, v3

    .line 47
    :goto_1
    invoke-virtual {p0, p1, p2}, La/jgr0;->a(J)La/p7m0;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :cond_3
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    move-object v1, v0

    .line 56
    check-cast v1, Ljava/util/List;

    .line 57
    .line 58
    new-instance v2, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    if-nez v4, :cond_5

    .line 64
    .line 65
    if-eqz v1, :cond_4

    .line 66
    .line 67
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 68
    .line 69
    .line 70
    :cond_4
    new-instance v5, La/lgr0;

    .line 71
    .line 72
    move-wide/from16 v8, p3

    .line 73
    .line 74
    move-wide/from16 v10, p5

    .line 75
    .line 76
    move-wide/from16 v6, p7

    .line 77
    .line 78
    invoke-direct/range {v5 .. v11}, La/lgr0;-><init>(DJJ)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_5
    if-eqz v1, :cond_7

    .line 86
    .line 87
    new-instance v5, Ljava/util/ArrayList;

    .line 88
    .line 89
    const/16 v6, 0xa

    .line 90
    .line 91
    invoke-static {v1, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-eqz v6, :cond_8

    .line 107
    .line 108
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    check-cast v6, La/lgr0;

    .line 113
    .line 114
    iget-wide v7, v6, La/lgr0;->a:J

    .line 115
    .line 116
    cmp-long v7, v7, p3

    .line 117
    .line 118
    if-nez v7, :cond_6

    .line 119
    .line 120
    new-instance v6, La/lgr0;

    .line 121
    .line 122
    move-wide/from16 v9, p3

    .line 123
    .line 124
    move-wide/from16 v11, p5

    .line 125
    .line 126
    move-wide/from16 v7, p7

    .line 127
    .line 128
    invoke-direct/range {v6 .. v12}, La/lgr0;-><init>(DJJ)V

    .line 129
    .line 130
    .line 131
    :cond_6
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_7
    move-object v5, v3

    .line 136
    :cond_8
    if-eqz v5, :cond_9

    .line 137
    .line 138
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 139
    .line 140
    .line 141
    :cond_9
    :goto_3
    invoke-virtual {p0, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_3

    .line 146
    .line 147
    return-void
.end method
