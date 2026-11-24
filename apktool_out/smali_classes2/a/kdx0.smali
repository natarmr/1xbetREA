.class public final La/kdx0;
.super La/icx0;
.source "SourceFile"


# static fields
.field public static final g:La/kdx0;


# instance fields
.field public final f:La/sdx0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/kdx0;

    .line 2
    .line 3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-static {v2}, La/icx0;->a(Ljava/util/UUID;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    sget-object v4, La/rdx0;->e:La/sdx0;

    .line 12
    .line 13
    invoke-static {}, La/wcx0;->c()La/bex0;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    const-string v1, "<skip trace>"

    .line 18
    .line 19
    invoke-direct/range {v0 .. v5}, La/kdx0;-><init>(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;La/sdx0;La/bex0;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, La/kdx0;->g:La/kdx0;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;La/sdx0;La/bex0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p5}, La/icx0;-><init>(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;La/bex0;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p4, La/sdx0;->c:Z

    .line 5
    .line 6
    invoke-static {p1}, La/x0x;->A(Z)V

    .line 7
    .line 8
    .line 9
    iput-object p4, p0, La/kdx0;->f:La/sdx0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final c()La/sdx0;
    .locals 8

    .line 1
    sget-object v0, La/rdx0;->e:La/sdx0;

    .line 2
    .line 3
    iget-object p0, p0, La/kdx0;->f:La/sdx0;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v1, La/rdx0;->e:La/sdx0;

    .line 9
    .line 10
    if-ne p0, v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_4

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    move-object v0, p0

    .line 20
    goto/16 :goto_4

    .line 21
    .line 22
    :cond_1
    const/4 v2, 0x2

    .line 23
    filled-new-array {p0, v0}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {v2, p0}, La/f4x;->l(I[Ljava/lang/Object;)La/f4x;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    move-object v0, v1

    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_2
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v1, 0x1

    .line 45
    if-ne v0, v1, :cond_3

    .line 46
    .line 47
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    move-object v0, p0

    .line 56
    check-cast v0, La/sdx0;

    .line 57
    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :cond_3
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const/4 v2, 0x0

    .line 65
    move v3, v2

    .line 66
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_5

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    check-cast v4, La/sdx0;

    .line 77
    .line 78
    :cond_4
    iget-object v5, v4, La/sdx0;->b:La/nuj0;

    .line 79
    .line 80
    iget v5, v5, La/nuj0;->c:I

    .line 81
    .line 82
    add-int/2addr v3, v5

    .line 83
    iget-object v4, v4, La/sdx0;->a:La/sdx0;

    .line 84
    .line 85
    if-nez v4, :cond_4

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_5
    if-nez v3, :cond_6

    .line 89
    .line 90
    sget-object v0, La/rdx0;->e:La/sdx0;

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_6
    new-instance v0, La/nuj0;

    .line 94
    .line 95
    invoke-direct {v0, v3}, La/nuj0;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_a

    .line 107
    .line 108
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, La/sdx0;

    .line 113
    .line 114
    :cond_7
    move v4, v2

    .line 115
    :goto_2
    iget-object v5, v3, La/sdx0;->b:La/nuj0;

    .line 116
    .line 117
    iget v6, v5, La/nuj0;->c:I

    .line 118
    .line 119
    if-ge v4, v6, :cond_9

    .line 120
    .line 121
    invoke-virtual {v5, v4}, La/nuj0;->f(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    check-cast v6, La/pdx0;

    .line 126
    .line 127
    invoke-virtual {v5, v4}, La/nuj0;->j(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-virtual {v0, v6, v7}, La/nuj0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    if-nez v6, :cond_8

    .line 136
    .line 137
    move v6, v1

    .line 138
    goto :goto_3

    .line 139
    :cond_8
    move v6, v2

    .line 140
    :goto_3
    invoke-virtual {v5, v4}, La/nuj0;->f(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    const-string v7, "Duplicate bindings: %s"

    .line 145
    .line 146
    invoke-static {v7, v5, v6}, La/x0x;->y(Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 147
    .line 148
    .line 149
    add-int/lit8 v4, v4, 0x1

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_9
    iget-object v3, v3, La/sdx0;->a:La/sdx0;

    .line 153
    .line 154
    if-nez v3, :cond_7

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_a
    new-instance p0, La/rdx0;

    .line 158
    .line 159
    const/4 v1, 0x0

    .line 160
    invoke-direct {p0, v1, v0}, La/sdx0;-><init>(La/sdx0;La/nuj0;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0}, La/sdx0;->a()La/sdx0;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    :goto_4
    return-object v0
.end method
