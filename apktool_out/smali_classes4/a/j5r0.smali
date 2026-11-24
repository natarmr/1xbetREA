.class public final La/j5r0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:La/v5l0;

.field public j:La/y78;

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public final synthetic o:La/m5r0;


# direct methods
.method public constructor <init>(La/m5r0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/j5r0;->o:La/m5r0;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance v0, La/j5r0;

    .line 2
    .line 3
    iget-object p0, p0, La/j5r0;->o:La/m5r0;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, La/j5r0;-><init>(La/m5r0;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/j5r0;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/j5r0;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/j5r0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v1, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v2, p0, La/j5r0;->n:Z

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    iget-object v5, p0, La/j5r0;->o:La/m5r0;

    .line 8
    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    if-ne v2, v4, :cond_0

    .line 12
    .line 13
    iget-boolean v1, p0, La/j5r0;->m:Z

    .line 14
    .line 15
    iget-boolean v2, p0, La/j5r0;->l:Z

    .line 16
    .line 17
    iget-boolean v4, p0, La/j5r0;->k:Z

    .line 18
    .line 19
    iget-object v6, p0, La/j5r0;->j:La/y78;

    .line 20
    .line 21
    iget-object v0, p0, La/j5r0;->i:La/v5l0;

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object v7, v0

    .line 27
    move v10, v1

    .line 28
    move v9, v2

    .line 29
    move v8, v4

    .line 30
    move-object v11, v6

    .line 31
    move-object v0, p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v3

    .line 39
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v2, v5, La/m5r0;->r:La/pru;

    .line 43
    .line 44
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iget-object v6, v2, La/sff0;->g:La/mum0;

    .line 49
    .line 50
    iget-object v6, v6, La/mum0;->y:La/v5l0;

    .line 51
    .line 52
    iget-boolean v2, v2, La/sff0;->J:Z

    .line 53
    .line 54
    iget-object v7, v5, La/m5r0;->s:La/lbu;

    .line 55
    .line 56
    invoke-virtual {v7}, La/lbu;->j()Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    iget-object v8, v5, La/m5r0;->t:La/r9u;

    .line 61
    .line 62
    sget-object v9, La/ygp;->t:La/ygp;

    .line 63
    .line 64
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v8, v8, La/r9u;->a:La/j1q0;

    .line 68
    .line 69
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v8, v8, La/j1q0;->a:La/m1q0;

    .line 73
    .line 74
    invoke-virtual {v8, v9}, La/m1q0;->d(La/ygp;)Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    iget-object v9, v5, La/m5r0;->w:La/y78;

    .line 79
    .line 80
    iget-object v10, v5, La/m5r0;->u:La/j3c;

    .line 81
    .line 82
    iput-object v6, p0, La/j5r0;->i:La/v5l0;

    .line 83
    .line 84
    iput-object v9, p0, La/j5r0;->j:La/y78;

    .line 85
    .line 86
    iput-boolean v2, p0, La/j5r0;->k:Z

    .line 87
    .line 88
    iput-boolean v7, p0, La/j5r0;->l:Z

    .line 89
    .line 90
    iput-boolean v8, p0, La/j5r0;->m:Z

    .line 91
    .line 92
    iput-boolean v4, p0, La/j5r0;->n:Z

    .line 93
    .line 94
    invoke-virtual {v10, p0}, La/j3c;->c(La/yje;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-ne v0, v1, :cond_2

    .line 99
    .line 100
    return-object v1

    .line 101
    :cond_2
    move v10, v8

    .line 102
    move-object v11, v9

    .line 103
    move v8, v2

    .line 104
    move v9, v7

    .line 105
    move-object v7, v6

    .line 106
    :goto_0
    move-object v12, v0

    .line 107
    check-cast v12, La/wcb;

    .line 108
    .line 109
    iget-object v0, v5, La/m5r0;->v:La/luu;

    .line 110
    .line 111
    iget-object v0, v0, La/luu;->a:La/nok0;

    .line 112
    .line 113
    invoke-virtual {v0}, La/nok0;->a()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v13

    .line 117
    new-instance v6, La/w4r0;

    .line 118
    .line 119
    invoke-direct/range {v6 .. v13}, La/w4r0;-><init>(La/v5l0;ZZZLa/y78;La/wcb;Ljava/util/List;)V

    .line 120
    .line 121
    .line 122
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 123
    .line 124
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 125
    .line 126
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-object v2, v1

    .line 134
    check-cast v2, La/h5r0;

    .line 135
    .line 136
    const/4 v4, 0x0

    .line 137
    const/16 v5, 0xe

    .line 138
    .line 139
    invoke-static {v2, v6, v3, v4, v5}, La/h5r0;->a(La/h5r0;La/w4r0;La/d0t;ZI)La/h5r0;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-eqz v1, :cond_3

    .line 148
    .line 149
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object v0
.end method
