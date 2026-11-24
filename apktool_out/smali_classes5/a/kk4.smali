.class public final synthetic La/kk4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qk4;


# direct methods
.method public synthetic constructor <init>(La/qk4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kk4;->a:B

    iput-object p1, p0, La/kk4;->b:La/qk4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/kk4;->a:B

    .line 2
    .line 3
    sget-object v1, La/xk4;->a:La/xk4;

    .line 4
    .line 5
    const-string v2, "popup_enter_anonim"

    .line 6
    .line 7
    const-string v3, "screen"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget-object p0, p0, La/kk4;->b:La/qk4;

    .line 11
    .line 12
    check-cast p1, Landroid/view/View;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v0, La/qk4;->i2:La/jdk0;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, La/qk4;->U0()La/il4;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget-object p1, p0, La/il4;->b:La/kt2;

    .line 27
    .line 28
    const-string v0, "login_page_call"

    .line 29
    .line 30
    invoke-static {v3, v2, p1, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, La/il4;->c:La/i1w0;

    .line 34
    .line 35
    invoke-static {p1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v2, La/c8d;

    .line 40
    .line 41
    sget-object v3, La/y7d;->a:La/v7d;

    .line 42
    .line 43
    sget-object v5, La/n0w0;->a:La/n0w0;

    .line 44
    .line 45
    invoke-direct {v2, v3, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v2}, La/rz4;->g(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;)La/y9v0;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    sget-object v3, La/wez;->b:La/wez;

    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-static {v3, v2, p1, v0, v5}, La/rz4;->p(La/wez;La/y9v0;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :goto_0
    move-object v2, v0

    .line 60
    check-cast v2, La/paw;

    .line 61
    .line 62
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_0

    .line 67
    .line 68
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, La/oe50;

    .line 73
    .line 74
    invoke-virtual {p1, v2}, La/i1w0;->a(La/oe50;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    iget-object p0, p0, La/il4;->h:La/p7m0;

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v4, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_0
    sget-object v0, La/qk4;->i2:La/jdk0;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, La/qk4;->U0()La/il4;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    iget-object p1, p0, La/il4;->b:La/kt2;

    .line 99
    .line 100
    const-string v0, "popup_enter_close_button"

    .line 101
    .line 102
    invoke-interface {p1, v0}, La/kt2;->c(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget-object p1, p0, La/il4;->f:La/ix0;

    .line 106
    .line 107
    iget-object p1, p1, La/ix0;->a:La/s1p;

    .line 108
    .line 109
    const-wide/16 v2, 0xc3e

    .line 110
    .line 111
    sget-object v0, La/xun;->a:La/xun;

    .line 112
    .line 113
    invoke-virtual {p1, v0, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 114
    .line 115
    .line 116
    iget-object p0, p0, La/il4;->h:La/p7m0;

    .line 117
    .line 118
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v4, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_1
    sget-object v0, La/qk4;->i2:La/jdk0;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, La/qk4;->U0()La/il4;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    iget-object p1, p0, La/il4;->b:La/kt2;

    .line 137
    .line 138
    new-instance v0, Lkotlin/Pair;

    .line 139
    .line 140
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v0}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const-string v1, "reg_page_call"

    .line 148
    .line 149
    invoke-interface {p1, v1, v0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 150
    .line 151
    .line 152
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    new-instance v6, La/b33;

    .line 157
    .line 158
    const/16 p1, 0x12

    .line 159
    .line 160
    invoke-direct {v6, p0, p1}, La/b33;-><init>(Ljava/lang/Object;B)V

    .line 161
    .line 162
    .line 163
    iget-object p1, p0, La/il4;->e:La/mne;

    .line 164
    .line 165
    iget-object v8, p1, La/mne;->c:La/vs10;

    .line 166
    .line 167
    new-instance v9, La/wa;

    .line 168
    .line 169
    const/16 p1, 0xd

    .line 170
    .line 171
    invoke-direct {v9, p0, v4, p1}, La/wa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 172
    .line 173
    .line 174
    const/16 v10, 0xa

    .line 175
    .line 176
    const/4 v7, 0x0

    .line 177
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 178
    .line 179
    .line 180
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    return-object p0

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
