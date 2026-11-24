.class public final La/p9k;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/i1w0;

.field public final c:La/tqt;

.field public final d:La/yfu;

.field public final e:La/nou;

.field public final f:La/m0u;

.field public final g:La/f5a;

.field public final h:La/ctf0;

.field public final i:I

.field public j:La/n8k;

.field public k:La/n8k;

.field public final l:Ljava/util/ArrayList;

.field public final m:La/ra10;

.field public final n:La/ra10;

.field public final o:La/p7m0;

.field public final p:La/p7m0;

.field public final q:La/ol60;


# direct methods
.method public constructor <init>(La/i1w0;La/tqt;La/yfu;La/nou;La/m0u;La/f5a;La/ctf0;ILa/sa10;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, La/w46;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/p9k;->b:La/i1w0;

    .line 11
    .line 12
    iput-object p2, p0, La/p9k;->c:La/tqt;

    .line 13
    .line 14
    iput-object p3, p0, La/p9k;->d:La/yfu;

    .line 15
    .line 16
    iput-object p4, p0, La/p9k;->e:La/nou;

    .line 17
    .line 18
    iput-object p5, p0, La/p9k;->f:La/m0u;

    .line 19
    .line 20
    move-object v0, p6

    .line 21
    iput-object v0, p0, La/p9k;->g:La/f5a;

    .line 22
    .line 23
    move-object/from16 v0, p7

    .line 24
    .line 25
    iput-object v0, p0, La/p9k;->h:La/ctf0;

    .line 26
    .line 27
    move/from16 v0, p8

    .line 28
    .line 29
    iput v0, p0, La/p9k;->i:I

    .line 30
    .line 31
    sget-object v0, La/n8k;->l:La/n8k;

    .line 32
    .line 33
    iput-object v0, p0, La/p9k;->j:La/n8k;

    .line 34
    .line 35
    iput-object v0, p0, La/p9k;->k:La/n8k;

    .line 36
    .line 37
    new-instance v0, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, La/p9k;->l:Ljava/util/ArrayList;

    .line 43
    .line 44
    sget-object v1, La/pb10;->g:La/pb10;

    .line 45
    .line 46
    new-instance v2, La/wej;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    const/4 v4, 0x2

    .line 50
    const/4 v5, 0x0

    .line 51
    const-class v6, La/p9k;

    .line 52
    .line 53
    const-string v7, "initCurrentLimit"

    .line 54
    .line 55
    const-string v8, "initCurrentLimit()V"

    .line 56
    .line 57
    move-object p3, p0

    .line 58
    move-object p1, v2

    .line 59
    move/from16 p7, v3

    .line 60
    .line 61
    move/from16 p8, v4

    .line 62
    .line 63
    move p2, v5

    .line 64
    move-object p4, v6

    .line 65
    move-object p5, v7

    .line 66
    move-object p6, v8

    .line 67
    invoke-direct/range {p1 .. p8}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 68
    .line 69
    .line 70
    move-object v3, p4

    .line 71
    const/16 v4, 0x10

    .line 72
    .line 73
    const v5, 0x7f130674

    .line 74
    .line 75
    .line 76
    const v6, 0x7f131111

    .line 77
    .line 78
    .line 79
    move-object/from16 p1, p9

    .line 80
    .line 81
    move-object p2, v1

    .line 82
    move-object p5, v2

    .line 83
    move p6, v4

    .line 84
    move p3, v5

    .line 85
    move p4, v6

    .line 86
    invoke-static/range {p1 .. p6}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    move-object v2, p2

    .line 91
    iput-object v1, p0, La/p9k;->m:La/ra10;

    .line 92
    .line 93
    new-instance v1, La/wej;

    .line 94
    .line 95
    const/4 v4, 0x0

    .line 96
    const/4 v5, 0x3

    .line 97
    const/4 v6, 0x0

    .line 98
    const-string v7, "initCurrentLimit"

    .line 99
    .line 100
    const-string v8, "initCurrentLimit()V"

    .line 101
    .line 102
    move-object p3, p0

    .line 103
    move-object p1, v1

    .line 104
    move-object p4, v3

    .line 105
    move/from16 p7, v4

    .line 106
    .line 107
    move/from16 p8, v5

    .line 108
    .line 109
    move p2, v6

    .line 110
    move-object p5, v7

    .line 111
    move-object p6, v8

    .line 112
    invoke-direct/range {p1 .. p8}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 113
    .line 114
    .line 115
    const/16 v3, 0x10

    .line 116
    .line 117
    const v4, 0x7f130677

    .line 118
    .line 119
    .line 120
    const v5, 0x7f131111

    .line 121
    .line 122
    .line 123
    move-object/from16 p1, p9

    .line 124
    .line 125
    move-object p5, v1

    .line 126
    move-object p2, v2

    .line 127
    move p6, v3

    .line 128
    move p3, v4

    .line 129
    move p4, v5

    .line 130
    invoke-static/range {p1 .. p6}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    iput-object v1, p0, La/p9k;->n:La/ra10;

    .line 135
    .line 136
    sget-object v1, La/n9k;->a:La/n9k;

    .line 137
    .line 138
    invoke-static {v1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    iput-object v1, p0, La/p9k;->o:La/p7m0;

    .line 143
    .line 144
    new-instance v1, La/g9k;

    .line 145
    .line 146
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    const/4 v2, 0x0

    .line 151
    invoke-direct {v1, v0, v2}, La/g9k;-><init>(Ljava/util/List;Z)V

    .line 152
    .line 153
    .line 154
    invoke-static {v1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iput-object v0, p0, La/p9k;->p:La/p7m0;

    .line 159
    .line 160
    new-instance v0, La/ol60;

    .line 161
    .line 162
    const/4 v1, 0x1

    .line 163
    sget-object v2, La/i99;->b:La/i99;

    .line 164
    .line 165
    invoke-direct {v0, v1, v2}, La/ol60;-><init>(ILa/i99;)V

    .line 166
    .line 167
    .line 168
    iput-object v0, p0, La/p9k;->q:La/ol60;

    .line 169
    .line 170
    invoke-virtual {p0}, La/p9k;->w()V

    .line 171
    .line 172
    .line 173
    return-void
.end method


# virtual methods
.method public final w()V
    .locals 7

    .line 1
    :cond_0
    iget-object v0, p0, La/p9k;->o:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, La/o9k;

    .line 9
    .line 10
    sget-object v2, La/n9k;->a:La/n9k;

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, La/f9k;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {v2, p0, v0}, La/f9k;-><init>(La/p9k;B)V

    .line 26
    .line 27
    .line 28
    new-instance v5, La/xsj;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    const/16 v3, 0xc

    .line 32
    .line 33
    invoke-direct {v5, p0, v0, v3}, La/xsj;-><init>(La/w46;La/yje;B)V

    .line 34
    .line 35
    .line 36
    const/16 v6, 0xe

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final x()V
    .locals 4

    .line 1
    iget-object p0, p0, La/p9k;->b:La/i1w0;

    .line 2
    .line 3
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, La/c8d;

    .line 8
    .line 9
    sget-object v2, La/y7d;->a:La/v7d;

    .line 10
    .line 11
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 12
    .line 13
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    move-object v1, v0

    .line 22
    check-cast v1, La/paw;

    .line 23
    .line 24
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, La/oe50;

    .line 35
    .line 36
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
.end method

.method public final y(La/k9k;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/x2i;

    .line 6
    .line 7
    const/16 v2, 0x1a

    .line 8
    .line 9
    invoke-direct {v1, v2}, La/x2i;-><init>(B)V

    .line 10
    .line 11
    .line 12
    new-instance v4, La/e9g;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/16 v3, 0x16

    .line 16
    .line 17
    invoke-direct {v4, p0, p1, v2, v3}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 18
    .line 19
    .line 20
    const/16 v5, 0xe

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 24
    .line 25
    .line 26
    return-void
.end method
