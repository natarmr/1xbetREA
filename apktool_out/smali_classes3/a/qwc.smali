.class public final La/qwc;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/rwc;

.field public final synthetic k:La/mvc;

.field public final synthetic l:Z

.field public final synthetic m:I

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Z

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/rwc;La/mvc;ZILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/qwc;->j:La/rwc;

    .line 2
    .line 3
    iput-object p2, p0, La/qwc;->k:La/mvc;

    .line 4
    .line 5
    iput-boolean p3, p0, La/qwc;->l:Z

    .line 6
    .line 7
    iput p4, p0, La/qwc;->m:I

    .line 8
    .line 9
    iput-object p5, p0, La/qwc;->n:Ljava/lang/String;

    .line 10
    .line 11
    iput-boolean p6, p0, La/qwc;->o:Z

    .line 12
    .line 13
    iput-object p7, p0, La/qwc;->p:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p8, p0, La/qwc;->q:Ljava/lang/String;

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct {p0, p1, p9}, La/bnn0;-><init>(ILa/yje;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    new-instance v0, La/qwc;

    .line 2
    .line 3
    iget-object v7, p0, La/qwc;->p:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v8, p0, La/qwc;->q:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, La/qwc;->j:La/rwc;

    .line 8
    .line 9
    iget-object v2, p0, La/qwc;->k:La/mvc;

    .line 10
    .line 11
    iget-boolean v3, p0, La/qwc;->l:Z

    .line 12
    .line 13
    iget v4, p0, La/qwc;->m:I

    .line 14
    .line 15
    iget-object v5, p0, La/qwc;->n:Ljava/lang/String;

    .line 16
    .line 17
    iget-boolean v6, p0, La/qwc;->o:Z

    .line 18
    .line 19
    move-object v9, p2

    .line 20
    invoke-direct/range {v0 .. v9}, La/qwc;-><init>(La/rwc;La/mvc;ZILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;La/yje;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/qwc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/qwc;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/qwc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v13, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v0, p0, La/qwc;->i:Z

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    move-object v0, p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    return-object v0

    .line 22
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, La/qwc;->j:La/rwc;

    .line 26
    .line 27
    iget-object v2, v0, La/rwc;->f:La/us3;

    .line 28
    .line 29
    iget-object v3, v0, La/rwc;->e:La/knf0;

    .line 30
    .line 31
    invoke-virtual {v2}, La/us3;->c()La/go3;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object v0, v0, La/rwc;->b:La/do20;

    .line 36
    .line 37
    invoke-virtual {v3}, La/knf0;->c()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v5, p0, La/qwc;->k:La/mvc;

    .line 45
    .line 46
    iget-object v5, v5, La/mvc;->a:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, La/go3;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    iput-boolean v1, p0, La/qwc;->i:Z

    .line 56
    .line 57
    iget-object v0, v0, La/do20;->a:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, La/sza;

    .line 60
    .line 61
    invoke-virtual {v0}, La/sza;->invoke()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, La/et5;

    .line 66
    .line 67
    new-instance v11, La/fk9;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-direct {v11, v1}, La/fk9;-><init>(Z)V

    .line 71
    .line 72
    .line 73
    const-string v2, "application/vnd.xenvelop+json"

    .line 74
    .line 75
    iget-boolean v3, p0, La/qwc;->l:Z

    .line 76
    .line 77
    move-object v1, v4

    .line 78
    iget v4, p0, La/qwc;->m:I

    .line 79
    .line 80
    const/16 v6, 0x54d

    .line 81
    .line 82
    iget-object v7, p0, La/qwc;->n:Ljava/lang/String;

    .line 83
    .line 84
    const/16 v8, 0x16

    .line 85
    .line 86
    iget-boolean v9, p0, La/qwc;->o:Z

    .line 87
    .line 88
    move-object v12, p0

    .line 89
    invoke-interface/range {v0 .. v12}, La/et5;->g(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;ILjava/lang/String;IZLjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-ne v0, v13, :cond_2

    .line 94
    .line 95
    return-object v13

    .line 96
    :cond_2
    :goto_0
    check-cast v0, La/dx5;

    .line 97
    .line 98
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Ljava/lang/Iterable;

    .line 103
    .line 104
    new-instance v1, Ljava/util/ArrayList;

    .line 105
    .line 106
    const/16 v2, 0xa

    .line 107
    .line 108
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_3

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    check-cast v2, La/xvc;

    .line 130
    .line 131
    iget-object v3, p0, La/qwc;->p:Ljava/lang/String;

    .line 132
    .line 133
    iget-object v4, p0, La/qwc;->q:Ljava/lang/String;

    .line 134
    .line 135
    invoke-static {v2, v3, v4}, La/gkb;->a0(La/xvc;Ljava/lang/String;Ljava/lang/String;)La/uvc;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_3
    return-object v1
.end method
