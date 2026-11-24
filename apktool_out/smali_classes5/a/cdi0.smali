.class public final La/cdi0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/ldi0;


# direct methods
.method public constructor <init>(La/yje;La/ldi0;)V
    .locals 0

    .line 1
    iput-object p2, p0, La/cdi0;->j:La/ldi0;

    .line 2
    .line 3
    const/4 p2, 0x2

    .line 4
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 0

    .line 1
    new-instance p1, La/cdi0;

    .line 2
    .line 3
    iget-object p0, p0, La/cdi0;->j:La/ldi0;

    .line 4
    .line 5
    invoke-direct {p1, p2, p0}, La/cdi0;-><init>(La/yje;La/ldi0;)V

    .line 6
    .line 7
    .line 8
    return-object p1
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
    invoke-virtual {p0, p1, p2}, La/cdi0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/cdi0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/cdi0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, La/cdi0;->j:La/ldi0;

    .line 2
    .line 3
    iget-object v1, v0, La/ldi0;->w:La/zn00;

    .line 4
    .line 5
    iget-object v2, v0, La/ldi0;->l:La/nv20;

    .line 6
    .line 7
    iget-object v3, v0, La/ldi0;->c:La/dci0;

    .line 8
    .line 9
    sget-object v4, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-boolean v5, p0, La/cdi0;->i:Z

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    if-eqz v5, :cond_1

    .line 15
    .line 16
    if-ne v5, v6, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    instance-of p1, v3, La/aci0;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    move-object p1, v3

    .line 37
    check-cast p1, La/aci0;

    .line 38
    .line 39
    iget-boolean v5, p1, La/aci0;->h:Z

    .line 40
    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    iget-object p0, p1, La/aci0;->b:La/swp0;

    .line 44
    .line 45
    invoke-virtual {v2, p0}, La/nv20;->f(La/swp0;)V

    .line 46
    .line 47
    .line 48
    check-cast v3, La/aci0;

    .line 49
    .line 50
    iget-object v5, v3, La/aci0;->a:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v8, v3, La/aci0;->b:La/swp0;

    .line 53
    .line 54
    iget-object v9, v3, La/aci0;->c:Ljava/util/List;

    .line 55
    .line 56
    iget-object v10, v3, La/aci0;->d:Ljava/util/List;

    .line 57
    .line 58
    iget-object v11, v3, La/aci0;->i:La/we50;

    .line 59
    .line 60
    iget-object v6, v3, La/aci0;->f:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v7, v3, La/aci0;->g:Ljava/lang/String;

    .line 63
    .line 64
    new-instance v4, Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$Confirmation;

    .line 65
    .line 66
    invoke-direct/range {v4 .. v11}, Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$Confirmation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/swp0;Ljava/util/List;Ljava/util/List;La/we50;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v4}, La/zn00;->z0(Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    instance-of p1, v3, La/vbi0;

    .line 75
    .line 76
    if-eqz p1, :cond_3

    .line 77
    .line 78
    move-object p1, v3

    .line 79
    check-cast p1, La/vbi0;

    .line 80
    .line 81
    iget-boolean v5, p1, La/vbi0;->g:Z

    .line 82
    .line 83
    if-eqz v5, :cond_3

    .line 84
    .line 85
    iget-object p0, p1, La/vbi0;->b:La/swp0;

    .line 86
    .line 87
    invoke-virtual {v2, p0}, La/nv20;->f(La/swp0;)V

    .line 88
    .line 89
    .line 90
    iget-object p0, v0, La/ldi0;->k:La/qud;

    .line 91
    .line 92
    check-cast v3, La/vbi0;

    .line 93
    .line 94
    iget-object p1, v3, La/vbi0;->b:La/swp0;

    .line 95
    .line 96
    iget-object v6, p1, La/swp0;->b:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v7, p1, La/swp0;->a:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v8, v3, La/vbi0;->a:Ljava/lang/String;

    .line 101
    .line 102
    iget v4, v3, La/vbi0;->c:I

    .line 103
    .line 104
    iget-object v9, v3, La/vbi0;->h:Ljava/lang/String;

    .line 105
    .line 106
    iget-object v5, v3, La/vbi0;->i:La/we50;

    .line 107
    .line 108
    iget-object v10, v3, La/vbi0;->d:Ljava/util/List;

    .line 109
    .line 110
    iget-object v11, v3, La/vbi0;->e:Ljava/util/List;

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-static/range {v4 .. v11}, La/qud;->g(ILa/we50;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    goto :goto_1

    .line 120
    :cond_3
    iget-object p1, v0, La/ldi0;->g:La/c5k;

    .line 121
    .line 122
    iput-boolean v6, p0, La/cdi0;->i:Z

    .line 123
    .line 124
    invoke-virtual {p1, p0}, La/c5k;->o(La/zje;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    if-ne p0, v4, :cond_4

    .line 129
    .line 130
    return-object v4

    .line 131
    :cond_4
    :goto_0
    sget-object p0, Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$ConfirmByAuthenticator;->a:Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$ConfirmByAuthenticator;

    .line 132
    .line 133
    invoke-virtual {v1, p0}, La/zn00;->z0(Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    :goto_1
    iget-object p1, v0, La/ldi0;->b:La/i1w0;

    .line 138
    .line 139
    invoke-static {p1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    new-instance v1, La/d1w0;

    .line 144
    .line 145
    invoke-direct {v1, p0}, La/d1w0;-><init>(La/m7h0;)V

    .line 146
    .line 147
    .line 148
    new-instance p0, La/c8d;

    .line 149
    .line 150
    sget-object v2, La/y7d;->a:La/v7d;

    .line 151
    .line 152
    invoke-direct {p0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 153
    .line 154
    .line 155
    const/4 v1, 0x0

    .line 156
    invoke-static {v0, p0, p1, v0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    :goto_2
    move-object v0, p0

    .line 161
    check-cast v0, La/paw;

    .line 162
    .line 163
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_5

    .line 168
    .line 169
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, La/oe50;

    .line 174
    .line 175
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object p0
.end method
