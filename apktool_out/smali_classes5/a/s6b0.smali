.class public final La/s6b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/rg90;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qog0;

.field public final synthetic c:Z

.field public final synthetic d:La/yx5;


# direct methods
.method public synthetic constructor <init>(La/qog0;La/yx5;ZB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/s6b0;->a:B

    iput-object p1, p0, La/s6b0;->b:La/qog0;

    iput-object p2, p0, La/s6b0;->d:La/yx5;

    iput-boolean p3, p0, La/s6b0;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Ljava/util/ArrayList;)V
    .locals 14

    .line 1
    iget-byte v0, p0, La/s6b0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/s6b0;->b:La/qog0;

    .line 4
    .line 5
    iget-boolean v2, p0, La/s6b0;->c:Z

    .line 6
    .line 7
    iget-object v3, p0, La/s6b0;->d:La/yx5;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v3, La/ccb0;

    .line 13
    .line 14
    invoke-static {p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object p1, La/ccb0;->X1:La/mi70;

    .line 21
    .line 22
    invoke-virtual {v3}, La/ccb0;->I0()La/k3t0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget-object v0, La/aya0;->a:La/aya0;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {p1}, La/n7x;->r(Ljava/util/ArrayList;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    sget-object v4, La/zxa0;->a:La/zxa0;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    sget-object p1, La/ccb0;->X1:La/mi70;

    .line 41
    .line 42
    invoke-virtual {v3}, La/ccb0;->I0()La/k3t0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1, v4}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-static {p1}, La/n7x;->q(Ljava/util/ArrayList;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    sget-object p1, La/ccb0;->X1:La/mi70;

    .line 59
    .line 60
    invoke-virtual {v3}, La/ccb0;->I0()La/k3t0;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1, v4}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    :goto_0
    iget-object p1, v1, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 68
    .line 69
    invoke-interface {p1, p0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_0
    check-cast v3, La/u6b0;

    .line 74
    .line 75
    invoke-static {p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const-string v4, "action"

    .line 80
    .line 81
    const-string v5, "notification_permission_click"

    .line 82
    .line 83
    const-wide/16 v6, 0x3173

    .line 84
    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    sget-object p1, La/u6b0;->e2:La/xi70;

    .line 88
    .line 89
    invoke-virtual {v3}, La/u6b0;->J0()La/sbb0;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1}, La/sbb0;->I()V

    .line 94
    .line 95
    .line 96
    iget-object v0, p1, La/sbb0;->x:La/upt;

    .line 97
    .line 98
    const/4 v2, 0x1

    .line 99
    invoke-virtual {v0, v2}, La/upt;->a(Z)V

    .line 100
    .line 101
    .line 102
    invoke-static {p1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    iget-object v0, p1, La/sbb0;->q:La/mne;

    .line 107
    .line 108
    iget-object v11, v0, La/mne;->a:La/rwj;

    .line 109
    .line 110
    new-instance v12, La/mab0;

    .line 111
    .line 112
    const/4 v0, 0x0

    .line 113
    const/4 v2, 0x6

    .line 114
    invoke-direct {v12, p1, v0, v2}, La/mab0;-><init>(La/sbb0;La/yje;B)V

    .line 115
    .line 116
    .line 117
    const/16 v13, 0xb

    .line 118
    .line 119
    const/4 v9, 0x0

    .line 120
    const/4 v10, 0x0

    .line 121
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 122
    .line 123
    .line 124
    iget-object v0, p1, La/sbb0;->T:La/gg5;

    .line 125
    .line 126
    iget-object v0, v0, La/gg5;->a:La/s1p;

    .line 127
    .line 128
    const-string v2, "allow"

    .line 129
    .line 130
    invoke-static {v2, v0, v6, v7}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 131
    .line 132
    .line 133
    iget-object p1, p1, La/sbb0;->U:La/zg;

    .line 134
    .line 135
    iget-object p1, p1, La/zg;->a:La/kt2;

    .line 136
    .line 137
    invoke-static {v4, v2, p1, v5}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_3
    invoke-static {p1}, La/n7x;->r(Ljava/util/ArrayList;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    const-string v8, "deny"

    .line 146
    .line 147
    if-eqz v0, :cond_4

    .line 148
    .line 149
    sget-object p1, La/u6b0;->e2:La/xi70;

    .line 150
    .line 151
    invoke-virtual {v3}, La/u6b0;->J0()La/sbb0;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    iget-object v0, p1, La/sbb0;->T:La/gg5;

    .line 156
    .line 157
    iget-object v0, v0, La/gg5;->a:La/s1p;

    .line 158
    .line 159
    invoke-static {v8, v0, v6, v7}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p1, La/sbb0;->U:La/zg;

    .line 163
    .line 164
    iget-object p1, p1, La/zg;->a:La/kt2;

    .line 165
    .line 166
    :goto_1
    invoke-static {v4, v8, p1, v5}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_4
    invoke-static {p1}, La/n7x;->q(Ljava/util/ArrayList;)Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-eqz p1, :cond_5

    .line 175
    .line 176
    if-eqz v2, :cond_5

    .line 177
    .line 178
    sget-object p1, La/u6b0;->e2:La/xi70;

    .line 179
    .line 180
    invoke-virtual {v3}, La/u6b0;->J0()La/sbb0;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    iget-object v0, p1, La/sbb0;->T:La/gg5;

    .line 185
    .line 186
    iget-object v0, v0, La/gg5;->a:La/s1p;

    .line 187
    .line 188
    invoke-static {v8, v0, v6, v7}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 189
    .line 190
    .line 191
    iget-object p1, p1, La/sbb0;->U:La/zg;

    .line 192
    .line 193
    iget-object p1, p1, La/zg;->a:La/kt2;

    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_5
    :goto_2
    iget-object p1, v1, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 197
    .line 198
    invoke-interface {p1, p0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
