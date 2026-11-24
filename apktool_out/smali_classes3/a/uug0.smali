.class public final synthetic La/uug0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zug0;


# direct methods
.method public synthetic constructor <init>(La/zug0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uug0;->a:B

    iput-object p1, p0, La/uug0;->b:La/zug0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/uug0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    iget-object p0, p0, La/uug0;->b:La/zug0;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    check-cast p2, Landroid/os/Bundle;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/zug0;->V1:La/gne0;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast p1, Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;

    .line 31
    .line 32
    invoke-virtual {p0}, La/zug0;->I0()La/cxg0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    iget-boolean p2, p0, La/cxg0;->m:Z

    .line 37
    .line 38
    iget-object v0, p0, La/cxg0;->e:La/b4j;

    .line 39
    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    sget-object v4, La/a1w;->p:La/a1w;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    sget-object v4, La/a1w;->o:La/a1w;

    .line 46
    .line 47
    :goto_0
    iget-object v5, v0, La/b4j;->a:La/kt2;

    .line 48
    .line 49
    iget-object v0, v0, La/b4j;->a:La/kt2;

    .line 50
    .line 51
    invoke-virtual {v4}, La/a1w;->a()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-interface {v5, v4}, La/kt2;->c(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    if-nez p2, :cond_2

    .line 59
    .line 60
    iget p2, p0, La/cxg0;->t:I

    .line 61
    .line 62
    if-lez p2, :cond_1

    .line 63
    .line 64
    sget-object p2, La/a1w;->q:La/a1w;

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    sget-object p2, La/a1w;->r:La/a1w;

    .line 68
    .line 69
    :goto_1
    invoke-virtual {p2}, La/a1w;->a()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-interface {v0, p2}, La/kt2;->c(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_2
    iget p2, p0, La/cxg0;->u:I

    .line 78
    .line 79
    if-lez p2, :cond_3

    .line 80
    .line 81
    sget-object p2, La/a1w;->s:La/a1w;

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    sget-object p2, La/a1w;->t:La/a1w;

    .line 85
    .line 86
    :goto_2
    invoke-virtual {p2}, La/a1w;->a()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-interface {v0, p2}, La/kt2;->c(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget p2, p0, La/cxg0;->s:I

    .line 94
    .line 95
    const/16 v4, 0x64

    .line 96
    .line 97
    if-ge p2, v4, :cond_4

    .line 98
    .line 99
    sget-object p2, La/a1w;->u:La/a1w;

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    sget-object p2, La/a1w;->v:La/a1w;

    .line 103
    .line 104
    :goto_3
    invoke-virtual {p2}, La/a1w;->a()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-interface {v0, p2}, La/kt2;->c(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :goto_4
    new-instance p2, La/uwg0;

    .line 112
    .line 113
    invoke-direct {p2, p0, v3}, La/uwg0;-><init>(La/cxg0;B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v3}, La/cxg0;->F(Z)V

    .line 117
    .line 118
    .line 119
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    iget-object v3, p0, La/cxg0;->g:La/mne;

    .line 124
    .line 125
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 126
    .line 127
    invoke-static {p2, v3}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    new-instance v3, La/zye0;

    .line 132
    .line 133
    const/16 v4, 0xf

    .line 134
    .line 135
    invoke-direct {v3, p0, p1, v2, v4}, La/zye0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 136
    .line 137
    .line 138
    invoke-static {v0, p2, v2, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 139
    .line 140
    .line 141
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0

    .line 144
    :pswitch_0
    sget-object v0, La/zug0;->V1:La/gne0;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    check-cast p1, La/n3w;

    .line 160
    .line 161
    invoke-virtual {p0}, La/zug0;->I0()La/cxg0;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    iget-object p1, p1, La/n3w;->a:Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iget-object p2, p0, La/cxg0;->k:La/nj7;

    .line 171
    .line 172
    iget-object v0, p2, La/nj7;->a:La/b4j;

    .line 173
    .line 174
    sget-object v4, La/a1w;->l:La/a1w;

    .line 175
    .line 176
    sget-object v5, La/r6w;->j:La/r6w;

    .line 177
    .line 178
    invoke-static {v0, v4, v5}, La/b4j;->h(La/b4j;La/a1w;La/r6w;)V

    .line 179
    .line 180
    .line 181
    iget-object p2, p2, La/nj7;->b:La/au0;

    .line 182
    .line 183
    invoke-virtual {v5}, La/r6w;->a()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {p2, v0}, La/au0;->j(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    new-instance p2, La/uwg0;

    .line 191
    .line 192
    const/4 v0, 0x0

    .line 193
    invoke-direct {p2, p0, v0}, La/uwg0;-><init>(La/cxg0;B)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v3}, La/cxg0;->F(Z)V

    .line 197
    .line 198
    .line 199
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iget-object v3, p0, La/cxg0;->g:La/mne;

    .line 204
    .line 205
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 206
    .line 207
    invoke-static {p2, v3}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    new-instance v3, La/zye0;

    .line 212
    .line 213
    const/16 v4, 0xe

    .line 214
    .line 215
    invoke-direct {v3, p0, p1, v2, v4}, La/zye0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 216
    .line 217
    .line 218
    invoke-static {v0, p2, v2, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 219
    .line 220
    .line 221
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    return-object p0

    .line 224
    nop

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
