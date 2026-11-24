.class public final Lorg/xplatform/feature/online_call/impl/service/OnlineCallService;
.super La/mlz;
.source "SourceFile"


# static fields
.field public static final d:Ljava/lang/String;


# instance fields
.field public b:La/fiu0;

.field public c:La/rt70;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lorg/xplatform/feature/online_call/impl/service/OnlineCallService;

    .line 2
    .line 3
    sget-object v1, La/sre0;->a:La/tre0;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, La/sgy;->v()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ".STOP_CALL"

    .line 14
    .line 15
    invoke-static {v0, v1}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lorg/xplatform/feature/online_call/impl/service/OnlineCallService;->d:Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, La/mlz;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onCreate()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    instance-of v1, v0, La/af3;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, La/af3;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v0, v2

    .line 17
    :goto_0
    const-class v1, La/et70;

    .line 18
    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, La/o5d0;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, La/ze3;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move-object v0, v2

    .line 41
    :goto_1
    instance-of v3, v0, La/et70;

    .line 42
    .line 43
    if-nez v3, :cond_2

    .line 44
    .line 45
    move-object v0, v2

    .line 46
    :cond_2
    check-cast v0, La/et70;

    .line 47
    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    sget-object v6, Lorg/xplatform/feature/online_call/impl/service/OnlineCallService;->d:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object v5, v0, La/et70;->d:La/cad;

    .line 56
    .line 57
    iget-object v4, v0, La/et70;->a:La/gr70;

    .line 58
    .line 59
    iget-object v8, v0, La/et70;->b:La/uq70;

    .line 60
    .line 61
    iget-object v7, v0, La/et70;->c:La/m1e;

    .line 62
    .line 63
    iget-object v9, v0, La/et70;->e:La/ol;

    .line 64
    .line 65
    iget-object v10, v0, La/et70;->f:La/js70;

    .line 66
    .line 67
    iget-object v11, v0, La/et70;->g:La/gii0;

    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v3, La/daf;

    .line 88
    .line 89
    invoke-direct/range {v3 .. v11}, La/daf;-><init>(La/gr70;La/cad;Ljava/lang/String;La/m1e;La/uq70;La/ol;La/js70;La/gii0;)V

    .line 90
    .line 91
    .line 92
    new-instance v0, La/fiu0;

    .line 93
    .line 94
    iget-object v1, v3, La/daf;->m:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, La/omi;

    .line 97
    .line 98
    const-class v3, La/rt70;

    .line 99
    .line 100
    invoke-static {v3, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 105
    .line 106
    .line 107
    iput-object v0, p0, Lorg/xplatform/feature/online_call/impl/service/OnlineCallService;->b:La/fiu0;

    .line 108
    .line 109
    invoke-interface {v4}, La/gr70;->y()La/wri0;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-super {p0}, La/mlz;->onCreate()V

    .line 117
    .line 118
    .line 119
    new-instance v0, La/zn00;

    .line 120
    .line 121
    iget-object v1, p0, Lorg/xplatform/feature/online_call/impl/service/OnlineCallService;->b:La/fiu0;

    .line 122
    .line 123
    if-eqz v1, :cond_3

    .line 124
    .line 125
    invoke-direct {v0, p0, v1}, La/zn00;-><init>(La/mlz;La/miu0;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v3}, La/zn00;->h0(Ljava/lang/Class;)La/diu0;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, La/rt70;

    .line 133
    .line 134
    iput-object v0, p0, Lorg/xplatform/feature/online_call/impl/service/OnlineCallService;->c:La/rt70;

    .line 135
    .line 136
    new-instance v5, La/cd60;

    .line 137
    .line 138
    const/16 v1, 0x15

    .line 139
    .line 140
    invoke-direct {v5, p0, v1}, La/cd60;-><init>(Ljava/lang/Object;B)V

    .line 141
    .line 142
    .line 143
    sget-object v1, La/lkz;->a:La/lkz;

    .line 144
    .line 145
    invoke-virtual {v0}, La/i3t0;->C()La/gmq;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    sget-object v1, La/lkz;->a:La/lkz;

    .line 150
    .line 151
    new-instance v3, La/gq50;

    .line 152
    .line 153
    const/4 v9, 0x0

    .line 154
    const/16 v10, 0x15

    .line 155
    .line 156
    const/4 v4, 0x2

    .line 157
    const-class v6, La/knx;

    .line 158
    .line 159
    const-string v7, "suspendConversion0"

    .line 160
    .line 161
    const-string v8, "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 162
    .line 163
    invoke-direct/range {v3 .. v10}, La/gq50;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 164
    .line 165
    .line 166
    iget-object v1, p0, La/mlz;->a:La/cyu;

    .line 167
    .line 168
    iget-object v1, v1, La/cyu;->a:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v1, La/glz;

    .line 171
    .line 172
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    new-instance v4, La/zm70;

    .line 177
    .line 178
    check-cast v0, La/i89;

    .line 179
    .line 180
    invoke-direct {v4, v0, p0, v3, v2}, La/zm70;-><init>(La/i89;Lorg/xplatform/feature/online_call/impl/service/OnlineCallService;La/gq50;La/yje;)V

    .line 181
    .line 182
    .line 183
    const/4 p0, 0x3

    .line 184
    invoke-static {v1, v2, v2, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_3
    const-string p0, "viewModelFactory"

    .line 189
    .line 190
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw v2

    .line 194
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 195
    .line 196
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    :goto_0
    sget-object v2, Lorg/xplatform/feature/online_call/impl/service/OnlineCallService;->d:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    iget-object v1, p0, Lorg/xplatform/feature/online_call/impl/service/OnlineCallService;->c:La/rt70;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    sget-object v0, La/bt70;->a:La/bt70;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, La/rt70;->M(La/dt70;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const-string p0, "viewModel"

    .line 29
    .line 30
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :cond_2
    :goto_1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0
.end method
