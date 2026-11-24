.class public final La/o4u;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/nr;

.field public final synthetic l:Z

.field public final synthetic m:I

.field public final synthetic n:Z

.field public final synthetic o:Z


# direct methods
.method public constructor <init>(La/nr;ZIZZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/o4u;->k:La/nr;

    .line 2
    .line 3
    iput-boolean p2, p0, La/o4u;->l:Z

    .line 4
    .line 5
    iput p3, p0, La/o4u;->m:I

    .line 6
    .line 7
    iput-boolean p4, p0, La/o4u;->n:Z

    .line 8
    .line 9
    iput-boolean p5, p0, La/o4u;->o:Z

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/o4u;

    .line 2
    .line 3
    iget-boolean v4, p0, La/o4u;->n:Z

    .line 4
    .line 5
    iget-boolean v5, p0, La/o4u;->o:Z

    .line 6
    .line 7
    iget-object v1, p0, La/o4u;->k:La/nr;

    .line 8
    .line 9
    iget-boolean v2, p0, La/o4u;->l:Z

    .line 10
    .line 11
    iget v3, p0, La/o4u;->m:I

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/o4u;-><init>(La/nr;ZIZZLa/yje;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, La/o4u;->j:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/o4u;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/o4u;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/o4u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/o4u;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/kmq;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-boolean v3, v0, La/o4u;->i:Z

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    const/4 v5, 0x0

    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    if-ne v3, v4, :cond_0

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto/16 :goto_4

    .line 21
    .line 22
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v5

    .line 28
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v3, v0, La/o4u;->k:La/nr;

    .line 32
    .line 33
    iget-object v6, v3, La/nr;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v6, La/gst0;

    .line 36
    .line 37
    invoke-virtual {v6}, La/gst0;->a()Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-eqz v6, :cond_2

    .line 42
    .line 43
    iget-object v6, v3, La/nr;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v6, La/gst0;

    .line 46
    .line 47
    iget-object v6, v6, La/gst0;->a:La/rrt0;

    .line 48
    .line 49
    invoke-virtual {v6}, La/rrt0;->a()La/krt0;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    new-instance v7, La/krt0;

    .line 55
    .line 56
    const/4 v11, 0x0

    .line 57
    const-wide/16 v12, 0x0

    .line 58
    .line 59
    const-wide/16 v8, 0x0

    .line 60
    .line 61
    const/4 v10, 0x0

    .line 62
    invoke-direct/range {v7 .. v13}, La/krt0;-><init>(JZZD)V

    .line 63
    .line 64
    .line 65
    move-object v6, v7

    .line 66
    :goto_0
    iget-boolean v15, v0, La/o4u;->l:Z

    .line 67
    .line 68
    if-eqz v15, :cond_3

    .line 69
    .line 70
    iget-boolean v7, v6, La/krt0;->c:Z

    .line 71
    .line 72
    :goto_1
    move v12, v7

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    iget-boolean v7, v6, La/krt0;->b:Z

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :goto_2
    iget-wide v13, v6, La/krt0;->a:J

    .line 78
    .line 79
    iget-object v6, v3, La/nr;->b:Ljava/lang/Object;

    .line 80
    .line 81
    move-object v10, v6

    .line 82
    check-cast v10, La/uii;

    .line 83
    .line 84
    iget-object v3, v3, La/nr;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v3, La/j1q0;

    .line 87
    .line 88
    iget-object v3, v3, La/j1q0;->a:La/m1q0;

    .line 89
    .line 90
    invoke-virtual {v3}, La/m1q0;->j()Z

    .line 91
    .line 92
    .line 93
    move-result v16

    .line 94
    iget-object v3, v10, La/uii;->a:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v3, La/phj;

    .line 97
    .line 98
    if-eqz v15, :cond_4

    .line 99
    .line 100
    iget-object v3, v3, La/phj;->e:La/ir30;

    .line 101
    .line 102
    invoke-virtual {v3}, La/ir30;->c()La/p6d;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    goto :goto_3

    .line 107
    :cond_4
    iget-object v3, v3, La/phj;->f:La/ir30;

    .line 108
    .line 109
    invoke-virtual {v3}, La/ir30;->c()La/p6d;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    :goto_3
    new-instance v6, La/xhj;

    .line 114
    .line 115
    const/4 v7, 0x4

    .line 116
    invoke-direct {v6, v7, v5}, La/bnn0;-><init>(ILa/yje;)V

    .line 117
    .line 118
    .line 119
    new-instance v8, La/a1g;

    .line 120
    .line 121
    const/16 v7, 0x14

    .line 122
    .line 123
    invoke-direct {v8, v3, v6, v7}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 124
    .line 125
    .line 126
    new-instance v7, La/whj;

    .line 127
    .line 128
    const/4 v9, 0x0

    .line 129
    iget v11, v0, La/o4u;->m:I

    .line 130
    .line 131
    iget-boolean v3, v0, La/o4u;->n:Z

    .line 132
    .line 133
    iget-boolean v6, v0, La/o4u;->o:Z

    .line 134
    .line 135
    move/from16 v17, v3

    .line 136
    .line 137
    move/from16 v18, v6

    .line 138
    .line 139
    invoke-direct/range {v7 .. v18}, La/whj;-><init>(La/a1g;La/yje;La/uii;IZJZZZZ)V

    .line 140
    .line 141
    .line 142
    new-instance v3, La/vsg0;

    .line 143
    .line 144
    invoke-direct {v3, v7}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 145
    .line 146
    .line 147
    iput-object v5, v0, La/o4u;->j:Ljava/lang/Object;

    .line 148
    .line 149
    iput-boolean v4, v0, La/o4u;->i:Z

    .line 150
    .line 151
    invoke-static {v1, v3, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    if-ne v0, v2, :cond_5

    .line 156
    .line 157
    return-object v2

    .line 158
    :cond_5
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    return-object v0
.end method
