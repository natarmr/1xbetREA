.class public final La/ier;
.super La/h1;
.source "SourceFile"


# static fields
.field public static final l:La/qlc;

.field public static final m:La/qlc;


# instance fields
.field public final e:La/eu00;

.field public final f:La/mg80;

.field public final g:La/wer;

.field public final h:I

.field public final i:La/her;

.field public final j:La/ker;

.field public final k:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/qlc;

    .line 2
    .line 3
    sget-object v1, La/j4m0;->l:La/swq;

    .line 4
    .line 5
    const-string v2, "Function"

    .line 6
    .line 7
    invoke-static {v2}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, v1, v2}, La/qlc;-><init>(La/swq;La/g950;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/ier;->l:La/qlc;

    .line 15
    .line 16
    new-instance v0, La/qlc;

    .line 17
    .line 18
    sget-object v1, La/j4m0;->i:La/swq;

    .line 19
    .line 20
    const-string v2, "KFunction"

    .line 21
    .line 22
    invoke-static {v2}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-direct {v0, v1, v2}, La/qlc;-><init>(La/swq;La/g950;)V

    .line 27
    .line 28
    .line 29
    sput-object v0, La/ier;->m:La/qlc;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(La/eu00;La/ed9;La/wer;I)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, p4}, La/wer;->a(I)La/g950;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-direct {p0, p1, v0}, La/h1;-><init>(La/eu00;La/g950;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, La/ier;->e:La/eu00;

    .line 12
    .line 13
    iput-object p2, p0, La/ier;->f:La/mg80;

    .line 14
    .line 15
    iput-object p3, p0, La/ier;->g:La/wer;

    .line 16
    .line 17
    iput p4, p0, La/ier;->h:I

    .line 18
    .line 19
    new-instance p2, La/her;

    .line 20
    .line 21
    invoke-direct {p2, p0}, La/her;-><init>(La/ier;)V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, La/ier;->i:La/her;

    .line 25
    .line 26
    new-instance p2, La/ker;

    .line 27
    .line 28
    const/4 p3, 0x0

    .line 29
    invoke-direct {p2, p1, p0, p3}, La/ker;-><init>(La/eu00;La/h1;B)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, La/ier;->j:La/ker;

    .line 33
    .line 34
    new-instance p1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance p2, Lkotlin/ranges/IntRange;

    .line 40
    .line 41
    const/4 p3, 0x1

    .line 42
    invoke-direct {p2, p3, p4, p3}, Lkotlin/ranges/a;-><init>(III)V

    .line 43
    .line 44
    .line 45
    new-instance p3, Ljava/util/ArrayList;

    .line 46
    .line 47
    const/16 p4, 0xa

    .line 48
    .line 49
    invoke-static {p2, p4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 50
    .line 51
    .line 52
    move-result p4

    .line 53
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    :goto_0
    move-object p4, p2

    .line 61
    check-cast p4, La/kkx;

    .line 62
    .line 63
    iget-boolean p4, p4, La/kkx;->c:Z

    .line 64
    .line 65
    if-eqz p4, :cond_0

    .line 66
    .line 67
    move-object p4, p2

    .line 68
    check-cast p4, La/bkx;

    .line 69
    .line 70
    invoke-virtual {p4}, La/bkx;->nextInt()I

    .line 71
    .line 72
    .line 73
    move-result p4

    .line 74
    sget-object v0, La/t3u0;->d:La/t3u0;

    .line 75
    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v2, "P"

    .line 79
    .line 80
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p4

    .line 90
    invoke-static {p4}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 91
    .line 92
    .line 93
    move-result-object p4

    .line 94
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    iget-object v2, p0, La/ier;->e:La/eu00;

    .line 99
    .line 100
    invoke-static {p0, v0, p4, v1, v2}, La/izs0;->s1(La/h1;La/t3u0;La/g950;ILa/eu00;)La/izs0;

    .line 101
    .line 102
    .line 103
    move-result-object p4

    .line 104
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    sget-object p4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_0
    sget-object p2, La/t3u0;->e:La/t3u0;

    .line 114
    .line 115
    const-string p3, "R"

    .line 116
    .line 117
    invoke-static {p3}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 122
    .line 123
    .line 124
    move-result p4

    .line 125
    iget-object v0, p0, La/ier;->e:La/eu00;

    .line 126
    .line 127
    invoke-static {p0, p2, p3, p4, v0}, La/izs0;->s1(La/h1;La/t3u0;La/g950;ILa/eu00;)La/izs0;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iput-object p1, p0, La/ier;->k:Ljava/util/List;

    .line 139
    .line 140
    sget-object p1, La/jer;->a:La/pek;

    .line 141
    .line 142
    iget-object p0, p0, La/ier;->g:La/wer;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    sget-object p1, La/ser;->d:La/ser;

    .line 151
    .line 152
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-eqz p1, :cond_1

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_1
    sget-object p1, La/ver;->d:La/ver;

    .line 160
    .line 161
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-eqz p1, :cond_2

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_2
    sget-object p1, La/ter;->d:La/ter;

    .line 169
    .line 170
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-eqz p1, :cond_3

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_3
    sget-object p1, La/uer;->d:La/uer;

    .line 178
    .line 179
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    :goto_1
    return-void
.end method


# virtual methods
.method public final L()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final M()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/ier;->k:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final Q()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final U()La/cr30;
    .locals 0

    .line 1
    sget-object p0, La/br30;->b:La/br30;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()La/gmk0;
    .locals 0

    .line 1
    sget-object p0, La/gmk0;->x0:La/gne0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()Ljava/util/Collection;
    .locals 0

    .line 1
    sget-object p0, La/iun;->a:La/iun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAnnotations()La/g93;
    .locals 0

    .line 1
    sget-object p0, La/ujn;->c:La/f93;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getVisibility()La/tek;
    .locals 0

    .line 1
    sget-object p0, La/uek;->e:La/tek;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final h()La/iys0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ier;->i:La/her;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final isExternal()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final isInline()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final j()La/vjj;
    .locals 0

    .line 1
    iget-object p0, p0, La/ier;->f:La/mg80;

    .line 2
    .line 3
    return-object p0
.end method

.method public final l0(La/cty;)La/cr30;
    .locals 0

    .line 1
    iget-object p0, p0, La/ier;->j:La/ker;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m()La/gm40;
    .locals 0

    .line 1
    sget-object p0, La/gm40;->e:La/gm40;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m0()La/flc;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final n0()La/k2u0;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final o0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final p0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final q0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final r()La/slc;
    .locals 0

    .line 1
    sget-object p0, La/slc;->b:La/slc;

    .line 2
    .line 3
    return-object p0
.end method

.method public final r0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/h1;->getName()La/g950;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/g950;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method
