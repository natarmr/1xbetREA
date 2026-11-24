.class public final La/iak;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/i1w0;

.field public final c:La/sqt;

.field public final d:La/yfu;

.field public final e:La/nou;

.field public final f:La/m0u;

.field public final g:La/f5a;

.field public final h:La/ctf0;

.field public i:La/p7k;

.field public j:La/p7k;

.field public final k:Ljava/util/ArrayList;

.field public final l:La/ra10;

.field public final m:La/ra10;

.field public final n:La/p7m0;

.field public final o:La/p7m0;

.field public final p:La/ol60;


# direct methods
.method public constructor <init>(La/i1w0;La/sqt;La/yfu;La/nou;La/m0u;La/f5a;La/ctf0;La/sa10;)V
    .locals 10

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
    iput-object p1, p0, La/iak;->b:La/i1w0;

    .line 11
    .line 12
    iput-object p2, p0, La/iak;->c:La/sqt;

    .line 13
    .line 14
    iput-object p3, p0, La/iak;->d:La/yfu;

    .line 15
    .line 16
    iput-object p4, p0, La/iak;->e:La/nou;

    .line 17
    .line 18
    iput-object p5, p0, La/iak;->f:La/m0u;

    .line 19
    .line 20
    move-object/from16 v0, p6

    .line 21
    .line 22
    iput-object v0, p0, La/iak;->g:La/f5a;

    .line 23
    .line 24
    move-object/from16 v0, p7

    .line 25
    .line 26
    iput-object v0, p0, La/iak;->h:La/ctf0;

    .line 27
    .line 28
    sget-object v0, La/p7k;->h:La/p7k;

    .line 29
    .line 30
    iput-object v0, p0, La/iak;->i:La/p7k;

    .line 31
    .line 32
    iput-object v0, p0, La/iak;->j:La/p7k;

    .line 33
    .line 34
    new-instance v8, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v8, p0, La/iak;->k:Ljava/util/ArrayList;

    .line 40
    .line 41
    sget-object v9, La/pb10;->g:La/pb10;

    .line 42
    .line 43
    new-instance v0, La/wej;

    .line 44
    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v7, 0x4

    .line 47
    const/4 v1, 0x0

    .line 48
    const-class v3, La/iak;

    .line 49
    .line 50
    const-string v4, "initCurrentLimit"

    .line 51
    .line 52
    const-string v5, "initCurrentLimit()V"

    .line 53
    .line 54
    move-object v2, p0

    .line 55
    invoke-direct/range {v0 .. v7}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 56
    .line 57
    .line 58
    const/16 v1, 0x10

    .line 59
    .line 60
    const v4, 0x7f130674

    .line 61
    .line 62
    .line 63
    const v5, 0x7f131111

    .line 64
    .line 65
    .line 66
    move-object/from16 p1, p8

    .line 67
    .line 68
    move-object p5, v0

    .line 69
    move/from16 p6, v1

    .line 70
    .line 71
    move p3, v4

    .line 72
    move p4, v5

    .line 73
    move-object p2, v9

    .line 74
    invoke-static/range {p1 .. p6}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, p0, La/iak;->l:La/ra10;

    .line 79
    .line 80
    new-instance v0, La/wej;

    .line 81
    .line 82
    const/4 v7, 0x5

    .line 83
    const/4 v1, 0x0

    .line 84
    const-string v4, "initCurrentLimit"

    .line 85
    .line 86
    const-string v5, "initCurrentLimit()V"

    .line 87
    .line 88
    invoke-direct/range {v0 .. v7}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 89
    .line 90
    .line 91
    const/16 v1, 0x10

    .line 92
    .line 93
    const v3, 0x7f130677

    .line 94
    .line 95
    .line 96
    const v4, 0x7f131111

    .line 97
    .line 98
    .line 99
    move-object p5, v0

    .line 100
    move/from16 p6, v1

    .line 101
    .line 102
    move p3, v3

    .line 103
    move p4, v4

    .line 104
    invoke-static/range {p1 .. p6}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iput-object v0, p0, La/iak;->m:La/ra10;

    .line 109
    .line 110
    sget-object v0, La/gak;->a:La/gak;

    .line 111
    .line 112
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iput-object v0, p0, La/iak;->n:La/p7m0;

    .line 117
    .line 118
    new-instance v0, La/z9k;

    .line 119
    .line 120
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    const/4 v3, 0x0

    .line 125
    invoke-direct {v0, v1, v3}, La/z9k;-><init>(Ljava/util/List;Z)V

    .line 126
    .line 127
    .line 128
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iput-object v0, p0, La/iak;->o:La/p7m0;

    .line 133
    .line 134
    new-instance v0, La/ol60;

    .line 135
    .line 136
    const/4 v1, 0x1

    .line 137
    sget-object v3, La/i99;->b:La/i99;

    .line 138
    .line 139
    invoke-direct {v0, v1, v3}, La/ol60;-><init>(ILa/i99;)V

    .line 140
    .line 141
    .line 142
    iput-object v0, p0, La/iak;->p:La/ol60;

    .line 143
    .line 144
    invoke-virtual {p0}, La/iak;->w()V

    .line 145
    .line 146
    .line 147
    return-void
.end method


# virtual methods
.method public final w()V
    .locals 7

    .line 1
    :cond_0
    iget-object v0, p0, La/iak;->n:La/p7m0;

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
    check-cast v2, La/hak;

    .line 9
    .line 10
    sget-object v2, La/gak;->a:La/gak;

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
    new-instance v2, La/y9k;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {v2, p0, v0}, La/y9k;-><init>(La/iak;B)V

    .line 26
    .line 27
    .line 28
    new-instance v5, La/xsj;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    const/16 v3, 0x10

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

.method public final x(La/dak;)V
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
    const/16 v2, 0x1b

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
    const/16 v3, 0x17

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
