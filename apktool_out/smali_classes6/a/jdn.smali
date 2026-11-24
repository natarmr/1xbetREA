.class public final La/jdn;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/sdn;


# direct methods
.method public constructor <init>(La/sdn;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/jdn;->j:La/sdn;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance v0, La/jdn;

    .line 2
    .line 3
    iget-object p0, p0, La/jdn;->j:La/sdn;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, La/jdn;-><init>(La/sdn;La/yje;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, La/jdn;->i:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/Pair;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/jdn;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/jdn;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/jdn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    .line 1
    iget-object v0, p0, La/jdn;->j:La/sdn;

    .line 2
    .line 3
    iget-object v6, v0, La/i3t0;->i:La/ocj;

    .line 4
    .line 5
    iget-object p0, p0, La/jdn;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lkotlin/Pair;

    .line 8
    .line 9
    sget-object v1, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/util/List;

    .line 17
    .line 18
    iget-object p0, p0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ljava/util/List;

    .line 21
    .line 22
    new-instance v12, La/xfa0;

    .line 23
    .line 24
    invoke-direct {v12, v1, p0}, La/xfa0;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, La/cdn;

    .line 45
    .line 46
    iget-object p0, p0, La/cdn;->f:La/xfa0;

    .line 47
    .line 48
    invoke-virtual {v12, p0}, La/xfa0;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_2

    .line 53
    .line 54
    iget-object v1, v0, La/sdn;->s:La/o030;

    .line 55
    .line 56
    new-instance v2, La/v030;

    .line 57
    .line 58
    invoke-direct {v2, v12}, La/v030;-><init>(La/xfa0;)V

    .line 59
    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v5, 0x6

    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-static/range {v0 .. v5}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 65
    .line 66
    .line 67
    iget-object p0, v6, La/ocj;->a:La/p7m0;

    .line 68
    .line 69
    :cond_1
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-object v7, v1

    .line 77
    check-cast v7, La/cdn;

    .line 78
    .line 79
    sget-object v9, La/iun;->a:La/iun;

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const/16 v14, 0xcd

    .line 83
    .line 84
    const/4 v8, 0x0

    .line 85
    const/4 v10, 0x0

    .line 86
    const/4 v11, 0x1

    .line 87
    invoke-static/range {v7 .. v14}, La/cdn;->a(La/cdn;Ljava/util/List;Ljava/util/List;La/l9s;ZLa/xfa0;La/aw20;I)La/cdn;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {p0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_1

    .line 96
    .line 97
    const/4 p0, 0x0

    .line 98
    invoke-virtual {v0, p0}, La/sdn;->M(Z)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    check-cast p0, La/cdn;

    .line 107
    .line 108
    iget-object p0, p0, La/cdn;->f:La/xfa0;

    .line 109
    .line 110
    invoke-virtual {v12, p0}, La/xfa0;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-eqz p0, :cond_5

    .line 115
    .line 116
    const/4 p0, 0x1

    .line 117
    invoke-virtual {v0, p0}, La/sdn;->M(Z)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    :goto_0
    iget-object v1, v0, La/sdn;->s:La/o030;

    .line 122
    .line 123
    new-instance v2, La/v030;

    .line 124
    .line 125
    invoke-direct {v2, v12}, La/v030;-><init>(La/xfa0;)V

    .line 126
    .line 127
    .line 128
    const/4 v4, 0x0

    .line 129
    const/4 v5, 0x6

    .line 130
    const/4 v3, 0x0

    .line 131
    invoke-static/range {v0 .. v5}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 132
    .line 133
    .line 134
    iget-object p0, v0, La/sdn;->w:La/owp0;

    .line 135
    .line 136
    sget-object v0, La/idf0;->a:La/idf0;

    .line 137
    .line 138
    invoke-virtual {p0, v0}, La/owp0;->g(La/ldf0;)V

    .line 139
    .line 140
    .line 141
    iget-object p0, v6, La/ocj;->a:La/p7m0;

    .line 142
    .line 143
    :cond_4
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-object v1, v0

    .line 151
    check-cast v1, La/cdn;

    .line 152
    .line 153
    sget-object v3, La/iun;->a:La/iun;

    .line 154
    .line 155
    const/4 v7, 0x0

    .line 156
    const/16 v8, 0xed

    .line 157
    .line 158
    const/4 v2, 0x0

    .line 159
    const/4 v4, 0x0

    .line 160
    const/4 v5, 0x0

    .line 161
    const/4 v6, 0x0

    .line 162
    invoke-static/range {v1 .. v8}, La/cdn;->a(La/cdn;Ljava/util/List;Ljava/util/List;La/l9s;ZLa/xfa0;La/aw20;I)La/cdn;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {p0, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_4

    .line 171
    .line 172
    :cond_5
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object p0
.end method
