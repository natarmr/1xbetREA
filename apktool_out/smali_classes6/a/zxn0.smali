.class public final synthetic La/zxn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zyn0;


# direct methods
.method public synthetic constructor <init>(La/zyn0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zxn0;->a:B

    iput-object p1, p0, La/zxn0;->b:La/zyn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zxn0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/zxn0;->b:La/zyn0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Throwable;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, La/zyn0;->p0:La/bby;

    .line 18
    .line 19
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, La/zyn0;->r0:La/bby;

    .line 23
    .line 24
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, v0, La/zyn0;->q0:La/bby;

    .line 28
    .line 29
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, La/vxn0;

    .line 37
    .line 38
    iget-boolean v1, v1, La/vxn0;->h:Z

    .line 39
    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0}, La/zyn0;->T()V

    .line 43
    .line 44
    .line 45
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 46
    .line 47
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 48
    .line 49
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 57
    .line 58
    move-object v4, v2

    .line 59
    check-cast v4, La/vxn0;

    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    sget-object v6, La/lak0;->c:La/lak0;

    .line 65
    .line 66
    const/16 v21, 0x0

    .line 67
    .line 68
    const v22, 0x17f49

    .line 69
    .line 70
    .line 71
    const/4 v5, 0x0

    .line 72
    const/4 v7, 0x0

    .line 73
    const/4 v8, 0x0

    .line 74
    const/4 v9, 0x0

    .line 75
    const/4 v10, 0x0

    .line 76
    const/4 v11, 0x0

    .line 77
    const/4 v12, 0x1

    .line 78
    const/4 v13, 0x0

    .line 79
    const/4 v14, 0x0

    .line 80
    const/4 v15, 0x0

    .line 81
    const/16 v16, 0x0

    .line 82
    .line 83
    const/16 v17, 0x0

    .line 84
    .line 85
    const/16 v18, 0x0

    .line 86
    .line 87
    const/16 v19, 0x0

    .line 88
    .line 89
    const/16 v20, 0x1

    .line 90
    .line 91
    invoke-static/range {v4 .. v22}, La/vxn0;->a(La/vxn0;La/a4x;La/a4x;ZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/he;ZZZLa/bpn0;I)La/vxn0;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_0

    .line 100
    .line 101
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object v0

    .line 104
    :pswitch_0
    move-object/from16 v1, p1

    .line 105
    .line 106
    check-cast v1, Ljava/lang/Throwable;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 112
    .line 113
    .line 114
    const/4 v1, 0x1

    .line 115
    iput-boolean v1, v0, La/zyn0;->l0:Z

    .line 116
    .line 117
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    sget-object v3, La/eyn0;->a:La/eyn0;

    .line 122
    .line 123
    new-instance v6, La/byn0;

    .line 124
    .line 125
    const/4 v4, 0x0

    .line 126
    invoke-direct {v6, v0, v4, v1}, La/byn0;-><init>(La/zyn0;La/yje;B)V

    .line 127
    .line 128
    .line 129
    const/16 v7, 0xe

    .line 130
    .line 131
    const/4 v5, 0x0

    .line 132
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 133
    .line 134
    .line 135
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object v0

    .line 138
    :pswitch_1
    move-object/from16 v1, p1

    .line 139
    .line 140
    check-cast v1, La/k0w0;

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    iget-object v0, v0, La/zyn0;->v:La/m6m0;

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    sget-object v0, La/ypn0;->h2:La/s9m0;

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    sget-object v0, La/ypn0;->j2:Ljava/lang/String;

    .line 156
    .line 157
    new-instance v2, La/v4i0;

    .line 158
    .line 159
    const/16 v3, 0x9

    .line 160
    .line 161
    invoke-direct {v2, v3}, La/v4i0;-><init>(B)V

    .line 162
    .line 163
    .line 164
    new-instance v3, Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;

    .line 165
    .line 166
    invoke-direct {v3, v0, v2}, Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;-><init>(Ljava/lang/String;La/xbf;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v3}, La/k0w0;->l(Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;)V

    .line 170
    .line 171
    .line 172
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object v0

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
