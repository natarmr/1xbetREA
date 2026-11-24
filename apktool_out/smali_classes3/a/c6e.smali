.class public final La/c6e;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/i1w0;

.field public final c:La/vqc;

.field public final d:La/kj5;

.field public final e:La/aqt;

.field public final f:La/pru;

.field public final g:La/is;

.field public final h:La/h03;

.field public final i:La/mne;

.field public final j:La/ol60;


# direct methods
.method public constructor <init>(La/i1w0;La/vqc;La/kj5;La/aqt;La/pru;La/is;La/h03;La/mne;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, La/w46;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/c6e;->b:La/i1w0;

    .line 11
    .line 12
    iput-object p2, p0, La/c6e;->c:La/vqc;

    .line 13
    .line 14
    iput-object p3, p0, La/c6e;->d:La/kj5;

    .line 15
    .line 16
    iput-object p4, p0, La/c6e;->e:La/aqt;

    .line 17
    .line 18
    iput-object p5, p0, La/c6e;->f:La/pru;

    .line 19
    .line 20
    iput-object p6, p0, La/c6e;->g:La/is;

    .line 21
    .line 22
    iput-object p7, p0, La/c6e;->h:La/h03;

    .line 23
    .line 24
    iput-object p8, p0, La/c6e;->i:La/mne;

    .line 25
    .line 26
    new-instance p1, La/ol60;

    .line 27
    .line 28
    const/4 p2, 0x3

    .line 29
    invoke-direct {p1, p2}, La/ol60;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, La/c6e;->j:La/ol60;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final w(La/zje;)Ljava/io/Serializable;
    .locals 10

    .line 1
    instance-of v0, p1, La/t5e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/t5e;

    .line 7
    .line 8
    iget v1, v0, La/t5e;->k:I

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
    iput v1, v0, La/t5e;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/t5e;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/t5e;-><init>(La/c6e;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/t5e;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/t5e;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0

    .line 48
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iput v4, v0, La/t5e;->k:I

    .line 52
    .line 53
    iget-object p0, p0, La/c6e;->g:La/is;

    .line 54
    .line 55
    invoke-virtual {p0, v3, v0}, La/is;->e(ZLa/zje;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v1, :cond_3

    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_3
    :goto_1
    check-cast p1, La/l14;

    .line 63
    .line 64
    if-eqz p1, :cond_5

    .line 65
    .line 66
    iget-object p0, p1, La/l14;->b:Ljava/util/ArrayList;

    .line 67
    .line 68
    new-instance p1, Ljava/util/ArrayList;

    .line 69
    .line 70
    const/16 v0, 0xa

    .line 71
    .line 72
    invoke-static {p0, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, La/a0g0;

    .line 94
    .line 95
    iget-object v0, v0, La/a0g0;->a:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    return-object p1

    .line 102
    :cond_5
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 103
    .line 104
    const/16 p1, 0x1a

    .line 105
    .line 106
    if-lt p0, p1, :cond_7

    .line 107
    .line 108
    sget-object p0, La/j85;->b:La/qek0;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-static {}, La/j85;->values()[La/j85;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    new-instance p1, Ljava/util/ArrayList;

    .line 121
    .line 122
    array-length v0, p0

    .line 123
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    .line 125
    .line 126
    array-length v0, p0

    .line 127
    :goto_3
    if-ge v3, v0, :cond_6

    .line 128
    .line 129
    aget-object v1, p0, v3

    .line 130
    .line 131
    iget-object v1, v1, La/j85;->a:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    add-int/lit8 v3, v3, 0x1

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_6
    return-object p1

    .line 140
    :cond_7
    sget-object p0, La/j85;->b:La/qek0;

    .line 141
    .line 142
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    sget-object v4, La/j85;->d:La/j85;

    .line 146
    .line 147
    sget-object v5, La/j85;->e:La/j85;

    .line 148
    .line 149
    sget-object v6, La/j85;->f:La/j85;

    .line 150
    .line 151
    sget-object v7, La/j85;->g:La/j85;

    .line 152
    .line 153
    sget-object v8, La/j85;->h:La/j85;

    .line 154
    .line 155
    sget-object v9, La/j85;->i:La/j85;

    .line 156
    .line 157
    filled-new-array/range {v4 .. v9}, [La/j85;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    new-instance p1, Ljava/util/ArrayList;

    .line 162
    .line 163
    const/4 v0, 0x6

    .line 164
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 165
    .line 166
    .line 167
    :goto_4
    if-ge v3, v0, :cond_8

    .line 168
    .line 169
    aget-object v1, p0, v3

    .line 170
    .line 171
    iget-object v1, v1, La/j85;->a:Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    add-int/lit8 v3, v3, 0x1

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_8
    return-object p1
.end method

.method public final x(Ljava/util/List;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, La/c6e;->i:La/mne;

    .line 9
    .line 10
    iget-object v3, v1, La/mne;->b:La/dvj;

    .line 11
    .line 12
    sget-object v1, La/w5e;->a:La/w5e;

    .line 13
    .line 14
    new-instance v4, La/x5e;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v4, p1, p0, v2}, La/x5e;-><init>(Ljava/util/List;La/c6e;La/yje;)V

    .line 18
    .line 19
    .line 20
    const/16 v5, 0xa

    .line 21
    .line 22
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final y(La/s5e;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/c6e;->j:La/ol60;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
