.class public final La/cad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/qe60;
.implements La/giu0;
.implements La/hlc;
.implements La/zf60;
.implements La/uu9;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 1

    iput-byte p1, p0, La/cad;->a:B

    packed-switch p1, :pswitch_data_0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    new-instance p1, La/psc;

    const/16 v0, 0xd

    invoke-direct {p1, v0}, La/psc;-><init>(B)V

    .line 75
    iput-object p1, p0, La/cad;->b:Ljava/lang/Object;

    return-void

    .line 76
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {p1}, La/thb;->y(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, La/cad;->b:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La/bad;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/cad;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-object p1, p0, La/cad;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/fno;)V
    .locals 1

    const/16 v0, 0x1d

    iput-byte v0, p0, La/cad;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, La/cad;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/g6m0;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/cad;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, La/cad;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    iput-byte p2, p0, La/cad;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sparse-switch p2, :sswitch_data_0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    new-instance p2, La/wgn;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, La/wgn;-><init>(La/gii0;B)V

    iput-object p2, p0, La/cad;->b:Ljava/lang/Object;

    return-void

    .line 86
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    new-instance p2, La/wgn;

    const/16 v0, 0x14

    invoke-direct {p2, p1, v0}, La/wgn;-><init>(La/gii0;B)V

    iput-object p2, p0, La/cad;->b:Ljava/lang/Object;

    return-void

    .line 88
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    new-instance p2, La/wgn;

    const/4 v0, 0x3

    invoke-direct {p2, p1, v0}, La/wgn;-><init>(La/gii0;B)V

    iput-object p2, p0, La/cad;->b:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x12 -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 6

    .line 1
    const/16 v0, 0x13

    .line 2
    .line 3
    iput-byte v0, p0, La/cad;->a:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v0, La/fhj;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, La/fhj;->a:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v1, La/itn;

    .line 16
    .line 17
    invoke-direct {v1, p1}, La/itn;-><init>(Landroid/widget/EditText;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, v0, La/fhj;->b:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 23
    .line 24
    .line 25
    sget-object v1, La/vsn;->b:La/vsn;

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    sget-object v1, La/vsn;->a:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v1

    .line 32
    :try_start_0
    sget-object v2, La/vsn;->b:La/vsn;

    .line 33
    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    new-instance v2, La/vsn;

    .line 37
    .line 38
    invoke-direct {v2}, Landroid/text/Editable$Factory;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 39
    .line 40
    .line 41
    :try_start_1
    const-string v3, "android.text.DynamicLayout$ChangeWatcher"

    .line 42
    .line 43
    const-class v4, La/vsn;

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-static {v3, v5, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    sput-object v3, La/vsn;->c:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    :catchall_0
    :try_start_2
    sput-object v2, La/vsn;->b:La/vsn;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_1
    move-exception p0

    .line 60
    goto :goto_1

    .line 61
    :cond_0
    :goto_0
    monitor-exit v1

    .line 62
    goto :goto_2

    .line 63
    :goto_1
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 64
    throw p0

    .line 65
    :cond_1
    :goto_2
    sget-object v1, La/vsn;->b:La/vsn;

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEditableFactory(Landroid/text/Editable$Factory;)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, La/cad;->b:Ljava/lang/Object;

    .line 71
    .line 72
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 90
    iput-byte p2, p0, La/cad;->a:B

    iput-object p1, p0, La/cad;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;IZ)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
    .locals 22

    .line 1
    sget-object v20, La/k1g;->b:La/k1g;

    .line 2
    .line 3
    invoke-virtual/range {p11 .. p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p12 .. p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p13 .. p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-object/from16 v0, p0

    .line 13
    .line 14
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/qv2;

    .line 17
    .line 18
    sget-object v1, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 19
    .line 20
    sget-object v1, La/grs;->a:La/grs;

    .line 21
    .line 22
    sget-object v17, La/ors;->a:La/ors;

    .line 23
    .line 24
    move-object v1, v0

    .line 25
    new-instance v0, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 26
    .line 27
    const-wide/16 v3, 0x0

    .line 28
    .line 29
    const-string v15, "main_screen"

    .line 30
    .line 31
    move-wide/from16 v5, p3

    .line 32
    .line 33
    move-wide/from16 v7, p5

    .line 34
    .line 35
    move/from16 v9, p7

    .line 36
    .line 37
    move-wide/from16 v10, p8

    .line 38
    .line 39
    move/from16 v12, p10

    .line 40
    .line 41
    move-object/from16 v13, p11

    .line 42
    .line 43
    move-object/from16 v14, p12

    .line 44
    .line 45
    move-object/from16 v16, p13

    .line 46
    .line 47
    move/from16 v18, p14

    .line 48
    .line 49
    move/from16 v19, p15

    .line 50
    .line 51
    move-object/from16 v21, v1

    .line 52
    .line 53
    move-wide/from16 v1, p1

    .line 54
    .line 55
    invoke-direct/range {v0 .. v20}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 56
    .line 57
    .line 58
    move-object/from16 v1, v21

    .line 59
    .line 60
    invoke-virtual {v1, v0}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0
.end method

.method public b()La/e6m0;
    .locals 4

    .line 1
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/g6m0;

    .line 4
    .line 5
    iget-object p0, p0, La/g6m0;->a:La/f6m0;

    .line 6
    .line 7
    iget-object v0, p0, La/f6m0;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v2, -0x1

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, La/f6m0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    iget-object p0, p0, La/f6m0;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    sub-long/2addr v0, v2

    .line 41
    const-wide/32 v2, 0x493e0

    .line 42
    .line 43
    .line 44
    cmp-long p0, v0, v2

    .line 45
    .line 46
    if-lez p0, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    new-instance p0, La/c6m0;

    .line 50
    .line 51
    invoke-direct {p0, v0, v1}, La/c6m0;-><init>(J)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_2
    :goto_0
    sget-object p0, La/d6m0;->a:La/d6m0;

    .line 56
    .line 57
    return-object p0
.end method

.method public c(Ljava/lang/Object;)La/diu0;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cad;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    move-object/from16 v8, p1

    .line 11
    .line 12
    check-cast v8, La/i1w0;

    .line 13
    .line 14
    new-instance v2, La/gh70;

    .line 15
    .line 16
    check-cast v0, La/c7i;

    .line 17
    .line 18
    iget-object v0, v0, La/c7i;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, La/gxi;

    .line 21
    .line 22
    iget-object v1, v0, La/gxi;->G:La/n5d0;

    .line 23
    .line 24
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    move-object v7, v1

    .line 29
    check-cast v7, La/qa60;

    .line 30
    .line 31
    iget-object v1, v0, La/gxi;->V:La/n5d0;

    .line 32
    .line 33
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object v4, v1

    .line 38
    check-cast v4, La/xcc;

    .line 39
    .line 40
    iget-object v1, v0, La/gxi;->y:La/n5d0;

    .line 41
    .line 42
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    move-object v3, v1

    .line 47
    check-cast v3, La/fq;

    .line 48
    .line 49
    iget-object v1, v0, La/gxi;->a:La/g8i;

    .line 50
    .line 51
    invoke-virtual {v1}, La/g8i;->v1()La/mne;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    iget-object v0, v0, La/gxi;->g:La/n5d0;

    .line 56
    .line 57
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    move-object v6, v0

    .line 62
    check-cast v6, La/lzt;

    .line 63
    .line 64
    invoke-direct/range {v2 .. v8}, La/gh70;-><init>(La/fq;La/xcc;La/mne;La/lzt;La/qa60;La/i1w0;)V

    .line 65
    .line 66
    .line 67
    return-object v2

    .line 68
    :pswitch_1
    move-object/from16 v9, p1

    .line 69
    .line 70
    check-cast v9, La/i1w0;

    .line 71
    .line 72
    new-instance v3, La/gh70;

    .line 73
    .line 74
    check-cast v0, La/c7i;

    .line 75
    .line 76
    iget-object v0, v0, La/c7i;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, La/wri;

    .line 79
    .line 80
    iget-object v1, v0, La/wri;->F:La/n5d0;

    .line 81
    .line 82
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    move-object v8, v1

    .line 87
    check-cast v8, La/qa60;

    .line 88
    .line 89
    iget-object v1, v0, La/wri;->U:La/n5d0;

    .line 90
    .line 91
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    move-object v5, v1

    .line 96
    check-cast v5, La/xcc;

    .line 97
    .line 98
    iget-object v1, v0, La/wri;->x:La/n5d0;

    .line 99
    .line 100
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    move-object v4, v1

    .line 105
    check-cast v4, La/fq;

    .line 106
    .line 107
    iget-object v1, v0, La/wri;->a:La/g8i;

    .line 108
    .line 109
    invoke-virtual {v1}, La/g8i;->v1()La/mne;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    iget-object v0, v0, La/wri;->f:La/n5d0;

    .line 114
    .line 115
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    move-object v7, v0

    .line 120
    check-cast v7, La/lzt;

    .line 121
    .line 122
    invoke-direct/range {v3 .. v9}, La/gh70;-><init>(La/fq;La/xcc;La/mne;La/lzt;La/qa60;La/i1w0;)V

    .line 123
    .line 124
    .line 125
    return-object v3

    .line 126
    :pswitch_2
    move-object/from16 v5, p1

    .line 127
    .line 128
    check-cast v5, La/i1w0;

    .line 129
    .line 130
    new-instance v4, La/wm70;

    .line 131
    .line 132
    check-cast v0, La/c7i;

    .line 133
    .line 134
    iget-object v1, v0, La/c7i;->c:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v1, La/pki;

    .line 137
    .line 138
    iget-object v2, v1, La/pki;->a:La/g8i;

    .line 139
    .line 140
    invoke-virtual {v2}, La/g8i;->u0()La/v88;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    iget-object v2, v1, La/pki;->a:La/g8i;

    .line 145
    .line 146
    invoke-virtual {v2}, La/g8i;->f0()La/wsf0;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    iget-object v2, v1, La/pki;->a:La/g8i;

    .line 151
    .line 152
    invoke-virtual {v2}, La/g8i;->v1()La/mne;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    iget-object v2, v1, La/pki;->n:La/n5d0;

    .line 157
    .line 158
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    move-object v9, v2

    .line 163
    check-cast v9, La/fpi0;

    .line 164
    .line 165
    iget-object v2, v1, La/pki;->y:La/n5d0;

    .line 166
    .line 167
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    move-object v10, v2

    .line 172
    check-cast v10, La/fq;

    .line 173
    .line 174
    iget-object v0, v0, La/c7i;->d:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v0, La/mki;

    .line 177
    .line 178
    iget-object v2, v0, La/mki;->d:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v2, La/n5d0;

    .line 181
    .line 182
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    move-object v11, v2

    .line 187
    check-cast v11, La/dqx;

    .line 188
    .line 189
    iget-object v2, v1, La/pki;->v:La/n5d0;

    .line 190
    .line 191
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    move-object v12, v2

    .line 196
    check-cast v12, La/itt;

    .line 197
    .line 198
    iget-object v2, v0, La/mki;->i:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v2, La/n5d0;

    .line 201
    .line 202
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    move-object v13, v2

    .line 207
    check-cast v13, La/qni0;

    .line 208
    .line 209
    iget-object v2, v0, La/mki;->j:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v2, La/n5d0;

    .line 212
    .line 213
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    move-object v14, v2

    .line 218
    check-cast v14, La/l1u;

    .line 219
    .line 220
    iget-object v2, v0, La/mki;->k:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v2, La/n5d0;

    .line 223
    .line 224
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    move-object v15, v2

    .line 229
    check-cast v15, La/lg60;

    .line 230
    .line 231
    iget-object v2, v1, La/pki;->G:La/n5d0;

    .line 232
    .line 233
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    move-object/from16 v16, v2

    .line 238
    .line 239
    check-cast v16, La/qa60;

    .line 240
    .line 241
    iget-object v2, v0, La/mki;->l:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v2, La/n5d0;

    .line 244
    .line 245
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    move-object/from16 v17, v2

    .line 250
    .line 251
    check-cast v17, La/ppb;

    .line 252
    .line 253
    iget-object v0, v0, La/mki;->m:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v0, La/n5d0;

    .line 256
    .line 257
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    move-object/from16 v18, v0

    .line 262
    .line 263
    check-cast v18, La/i5m0;

    .line 264
    .line 265
    iget-object v0, v1, La/pki;->g:La/n5d0;

    .line 266
    .line 267
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    move-object/from16 v19, v0

    .line 272
    .line 273
    check-cast v19, La/lzt;

    .line 274
    .line 275
    iget-object v0, v1, La/pki;->V:La/n5d0;

    .line 276
    .line 277
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    move-object/from16 v20, v0

    .line 282
    .line 283
    check-cast v20, La/xcc;

    .line 284
    .line 285
    iget-object v0, v1, La/pki;->l:La/n5d0;

    .line 286
    .line 287
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    move-object/from16 v21, v0

    .line 292
    .line 293
    check-cast v21, La/ztt;

    .line 294
    .line 295
    iget-object v0, v1, La/pki;->f:La/n5d0;

    .line 296
    .line 297
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    move-object/from16 v22, v0

    .line 302
    .line 303
    check-cast v22, La/d3c;

    .line 304
    .line 305
    iget-object v0, v1, La/pki;->i:La/n5d0;

    .line 306
    .line 307
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    move-object/from16 v23, v0

    .line 312
    .line 313
    check-cast v23, La/xyb;

    .line 314
    .line 315
    iget-object v0, v1, La/pki;->q:La/n5d0;

    .line 316
    .line 317
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    move-object/from16 v24, v0

    .line 322
    .line 323
    check-cast v24, La/oqt;

    .line 324
    .line 325
    iget-object v0, v1, La/pki;->U:La/n5d0;

    .line 326
    .line 327
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    move-object/from16 v25, v0

    .line 332
    .line 333
    check-cast v25, La/y5s;

    .line 334
    .line 335
    iget-object v0, v1, La/pki;->Y:La/n5d0;

    .line 336
    .line 337
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    move-object/from16 v26, v0

    .line 342
    .line 343
    check-cast v26, La/t0u;

    .line 344
    .line 345
    invoke-direct/range {v4 .. v26}, La/wm70;-><init>(La/i1w0;La/v88;La/wsf0;La/mne;La/fpi0;La/fq;La/dqx;La/itt;La/qni0;La/l1u;La/lg60;La/qa60;La/ppb;La/i5m0;La/lzt;La/xcc;La/ztt;La/d3c;La/xyb;La/oqt;La/y5s;La/t0u;)V

    .line 346
    .line 347
    .line 348
    return-object v4

    .line 349
    :pswitch_3
    move-object/from16 v6, p1

    .line 350
    .line 351
    check-cast v6, La/i1w0;

    .line 352
    .line 353
    new-instance v5, La/wm70;

    .line 354
    .line 355
    check-cast v0, La/c7i;

    .line 356
    .line 357
    iget-object v1, v0, La/c7i;->c:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v1, La/ufi;

    .line 360
    .line 361
    iget-object v2, v1, La/ufi;->a:La/g8i;

    .line 362
    .line 363
    invoke-virtual {v2}, La/g8i;->u0()La/v88;

    .line 364
    .line 365
    .line 366
    move-result-object v7

    .line 367
    iget-object v2, v1, La/ufi;->a:La/g8i;

    .line 368
    .line 369
    invoke-virtual {v2}, La/g8i;->f0()La/wsf0;

    .line 370
    .line 371
    .line 372
    move-result-object v8

    .line 373
    iget-object v2, v1, La/ufi;->a:La/g8i;

    .line 374
    .line 375
    invoke-virtual {v2}, La/g8i;->v1()La/mne;

    .line 376
    .line 377
    .line 378
    move-result-object v9

    .line 379
    iget-object v2, v1, La/ufi;->m:La/n5d0;

    .line 380
    .line 381
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    move-object v10, v2

    .line 386
    check-cast v10, La/fpi0;

    .line 387
    .line 388
    iget-object v2, v1, La/ufi;->x:La/n5d0;

    .line 389
    .line 390
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    move-object v11, v2

    .line 395
    check-cast v11, La/fq;

    .line 396
    .line 397
    iget-object v0, v0, La/c7i;->d:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v0, La/r8i;

    .line 400
    .line 401
    iget-object v2, v0, La/r8i;->g:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v2, La/n5d0;

    .line 404
    .line 405
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    move-object v12, v2

    .line 410
    check-cast v12, La/dqx;

    .line 411
    .line 412
    iget-object v2, v1, La/ufi;->u:La/n5d0;

    .line 413
    .line 414
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    move-object v13, v2

    .line 419
    check-cast v13, La/itt;

    .line 420
    .line 421
    iget-object v2, v1, La/ufi;->d0:La/n5d0;

    .line 422
    .line 423
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    move-object v14, v2

    .line 428
    check-cast v14, La/qni0;

    .line 429
    .line 430
    iget-object v2, v0, La/r8i;->l:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v2, La/n5d0;

    .line 433
    .line 434
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    move-object v15, v2

    .line 439
    check-cast v15, La/l1u;

    .line 440
    .line 441
    iget-object v2, v1, La/ufi;->e0:La/n5d0;

    .line 442
    .line 443
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    move-object/from16 v16, v2

    .line 448
    .line 449
    check-cast v16, La/lg60;

    .line 450
    .line 451
    iget-object v2, v1, La/ufi;->F:La/n5d0;

    .line 452
    .line 453
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    move-object/from16 v17, v2

    .line 458
    .line 459
    check-cast v17, La/qa60;

    .line 460
    .line 461
    iget-object v0, v0, La/r8i;->m:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v0, La/n5d0;

    .line 464
    .line 465
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    move-object/from16 v18, v0

    .line 470
    .line 471
    check-cast v18, La/ppb;

    .line 472
    .line 473
    iget-object v0, v1, La/ufi;->f0:La/n5d0;

    .line 474
    .line 475
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    move-object/from16 v19, v0

    .line 480
    .line 481
    check-cast v19, La/i5m0;

    .line 482
    .line 483
    iget-object v0, v1, La/ufi;->f:La/n5d0;

    .line 484
    .line 485
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    move-object/from16 v20, v0

    .line 490
    .line 491
    check-cast v20, La/lzt;

    .line 492
    .line 493
    iget-object v0, v1, La/ufi;->U:La/n5d0;

    .line 494
    .line 495
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    move-object/from16 v21, v0

    .line 500
    .line 501
    check-cast v21, La/xcc;

    .line 502
    .line 503
    iget-object v0, v1, La/ufi;->k:La/n5d0;

    .line 504
    .line 505
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    move-object/from16 v22, v0

    .line 510
    .line 511
    check-cast v22, La/ztt;

    .line 512
    .line 513
    iget-object v0, v1, La/ufi;->e:La/n5d0;

    .line 514
    .line 515
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    move-object/from16 v23, v0

    .line 520
    .line 521
    check-cast v23, La/d3c;

    .line 522
    .line 523
    iget-object v0, v1, La/ufi;->h:La/n5d0;

    .line 524
    .line 525
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    move-object/from16 v24, v0

    .line 530
    .line 531
    check-cast v24, La/xyb;

    .line 532
    .line 533
    iget-object v0, v1, La/ufi;->p:La/n5d0;

    .line 534
    .line 535
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    move-object/from16 v25, v0

    .line 540
    .line 541
    check-cast v25, La/oqt;

    .line 542
    .line 543
    iget-object v0, v1, La/ufi;->T:La/n5d0;

    .line 544
    .line 545
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    move-object/from16 v26, v0

    .line 550
    .line 551
    check-cast v26, La/y5s;

    .line 552
    .line 553
    iget-object v0, v1, La/ufi;->X:La/n5d0;

    .line 554
    .line 555
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    move-object/from16 v27, v0

    .line 560
    .line 561
    check-cast v27, La/t0u;

    .line 562
    .line 563
    invoke-direct/range {v5 .. v27}, La/wm70;-><init>(La/i1w0;La/v88;La/wsf0;La/mne;La/fpi0;La/fq;La/dqx;La/itt;La/qni0;La/l1u;La/lg60;La/qa60;La/ppb;La/i5m0;La/lzt;La/xcc;La/ztt;La/d3c;La/xyb;La/oqt;La/y5s;La/t0u;)V

    .line 564
    .line 565
    .line 566
    return-object v5

    .line 567
    :pswitch_4
    move-object/from16 v12, p1

    .line 568
    .line 569
    check-cast v12, La/i1w0;

    .line 570
    .line 571
    new-instance v6, La/gh70;

    .line 572
    .line 573
    check-cast v0, La/c7i;

    .line 574
    .line 575
    iget-object v0, v0, La/c7i;->c:Ljava/lang/Object;

    .line 576
    .line 577
    check-cast v0, La/k6i;

    .line 578
    .line 579
    iget-object v1, v0, La/k6i;->F:La/n5d0;

    .line 580
    .line 581
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    move-object v11, v1

    .line 586
    check-cast v11, La/qa60;

    .line 587
    .line 588
    iget-object v1, v0, La/k6i;->U:La/n5d0;

    .line 589
    .line 590
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    move-object v8, v1

    .line 595
    check-cast v8, La/xcc;

    .line 596
    .line 597
    iget-object v1, v0, La/k6i;->x:La/n5d0;

    .line 598
    .line 599
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    move-object v7, v1

    .line 604
    check-cast v7, La/fq;

    .line 605
    .line 606
    iget-object v1, v0, La/k6i;->a:La/g8i;

    .line 607
    .line 608
    invoke-virtual {v1}, La/g8i;->v1()La/mne;

    .line 609
    .line 610
    .line 611
    move-result-object v9

    .line 612
    iget-object v0, v0, La/k6i;->f:La/n5d0;

    .line 613
    .line 614
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    move-object v10, v0

    .line 619
    check-cast v10, La/lzt;

    .line 620
    .line 621
    invoke-direct/range {v6 .. v12}, La/gh70;-><init>(La/fq;La/xcc;La/mne;La/lzt;La/qa60;La/i1w0;)V

    .line 622
    .line 623
    .line 624
    return-object v6

    .line 625
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public d(La/qlc;)La/glc;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/pg80;

    .line 7
    .line 8
    iget-object v0, p1, La/qlc;->a:La/swq;

    .line 9
    .line 10
    invoke-static {p0, v0}, La/x2x;->i0(La/pg80;La/swq;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/mg80;

    .line 29
    .line 30
    instance-of v1, v0, La/ed9;

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    check-cast v0, La/ed9;

    .line 35
    .line 36
    iget-object v0, v0, La/ed9;->j:La/n660;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, La/n660;->d(La/qlc;)La/glc;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_1
    const/4 p0, 0x0

    .line 46
    return-object p0
.end method

.method public e(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/svu;

    .line 4
    .line 5
    iget-object p0, p0, La/svu;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/jxy;

    .line 8
    .line 9
    iget-object p0, p0, La/jxy;->a:La/zdg0;

    .line 10
    .line 11
    new-instance v0, La/sax;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    const/4 v2, 0x6

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v0, v1, v3, v2}, La/sax;-><init>(ILa/yje;B)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-static {p1, p0, v0, v1, v2}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object p1, La/wne;->a:La/wne;

    .line 26
    .line 27
    if-ne p0, p1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    :goto_0
    if-ne p0, p1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    :goto_1
    if-ne p0, p1, :cond_2

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0
.end method

.method public f(La/tu9;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/dfr;

    .line 4
    .line 5
    iget-object v0, p0, La/dfr;->b:La/tu9;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    const-string v1, "The result can only set once!"

    .line 13
    .line 14
    invoke-static {v1, v0}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/dfr;->b:La/tu9;

    .line 18
    .line 19
    new-instance p1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v0, "FutureChain["

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, "]"

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public g(Ljava/lang/String;Ljava/io/File;JLa/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    iget-object v3, v0, La/cad;->b:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v5, v3

    .line 10
    check-cast v5, La/y3v;

    .line 11
    .line 12
    iget-object v3, v5, La/y3v;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, La/mne;

    .line 15
    .line 16
    instance-of v4, v2, La/scl;

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    move-object v4, v2

    .line 21
    check-cast v4, La/scl;

    .line 22
    .line 23
    iget v6, v4, La/scl;->m:I

    .line 24
    .line 25
    const/high16 v7, -0x80000000

    .line 26
    .line 27
    and-int v8, v6, v7

    .line 28
    .line 29
    if-eqz v8, :cond_0

    .line 30
    .line 31
    sub-int/2addr v6, v7

    .line 32
    iput v6, v4, La/scl;->m:I

    .line 33
    .line 34
    :goto_0
    move-object v0, v4

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    new-instance v4, La/scl;

    .line 37
    .line 38
    invoke-direct {v4, v0, v2}, La/scl;-><init>(La/cad;La/zje;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :goto_1
    iget-object v2, v0, La/scl;->k:Ljava/lang/Object;

    .line 43
    .line 44
    sget-object v11, La/wne;->a:La/wne;

    .line 45
    .line 46
    iget v4, v0, La/scl;->m:I

    .line 47
    .line 48
    const/4 v6, 0x1

    .line 49
    const/4 v12, 0x2

    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    if-eq v4, v6, :cond_2

    .line 53
    .line 54
    if-ne v4, v12, :cond_1

    .line 55
    .line 56
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_7

    .line 60
    .line 61
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    return-object v0

    .line 68
    :cond_2
    iget-wide v6, v0, La/scl;->j:J

    .line 69
    .line 70
    iget-object v1, v0, La/scl;->i:Ljava/io/File;

    .line 71
    .line 72
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    move-wide v13, v6

    .line 76
    goto/16 :goto_4

    .line 77
    .line 78
    :cond_3
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v2, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    sget-object v4, La/ujn;->h:Ljava/lang/String;

    .line 84
    .line 85
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    const/4 v7, 0x0

    .line 96
    if-nez v4, :cond_4

    .line 97
    .line 98
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    sget-object v4, La/ujn;->h:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v1, v4, v7}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-nez v4, :cond_7

    .line 109
    .line 110
    const-string v4, "https://"

    .line 111
    .line 112
    invoke-static {v1, v4, v7}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_5

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    const/16 v8, 0x2f

    .line 124
    .line 125
    if-lez v4, :cond_6

    .line 126
    .line 127
    const-string v4, "/"

    .line 128
    .line 129
    invoke-static {v2, v4}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-nez v4, :cond_6

    .line 134
    .line 135
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    :cond_6
    new-array v4, v6, [C

    .line 139
    .line 140
    aput-char v8, v4, v7

    .line 141
    .line 142
    invoke-static {v1, v4}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_7
    :goto_2
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    :goto_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-static/range {p2 .. p2}, La/aac;->V(Ljava/io/File;)J

    .line 161
    .line 162
    .line 163
    move-result-wide v7

    .line 164
    move-object/from16 v2, p2

    .line 165
    .line 166
    iput-object v2, v0, La/scl;->i:Ljava/io/File;

    .line 167
    .line 168
    move-wide/from16 v13, p3

    .line 169
    .line 170
    iput-wide v13, v0, La/scl;->j:J

    .line 171
    .line 172
    iput v6, v0, La/scl;->m:I

    .line 173
    .line 174
    iget-object v15, v3, La/mne;->b:La/dvj;

    .line 175
    .line 176
    new-instance v4, La/f6n0;

    .line 177
    .line 178
    const/4 v9, 0x0

    .line 179
    const/4 v10, 0x2

    .line 180
    move-object v6, v1

    .line 181
    invoke-direct/range {v4 .. v10}, La/f6n0;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V

    .line 182
    .line 183
    .line 184
    invoke-static {v15, v4, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    if-ne v1, v11, :cond_8

    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_8
    move-object/from16 v16, v2

    .line 192
    .line 193
    move-object v2, v1

    .line 194
    move-object/from16 v1, v16

    .line 195
    .line 196
    :goto_4
    check-cast v2, La/hc5;

    .line 197
    .line 198
    iget-wide v6, v2, La/hc5;->b:J

    .line 199
    .line 200
    cmp-long v4, v6, v13

    .line 201
    .line 202
    if-gtz v4, :cond_b

    .line 203
    .line 204
    const/4 v4, 0x0

    .line 205
    iput-object v4, v0, La/scl;->i:Ljava/io/File;

    .line 206
    .line 207
    iput-wide v13, v0, La/scl;->j:J

    .line 208
    .line 209
    iput v12, v0, La/scl;->m:I

    .line 210
    .line 211
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 212
    .line 213
    new-instance v6, La/otp0;

    .line 214
    .line 215
    const/16 v7, 0x8

    .line 216
    .line 217
    move-object/from16 p2, v1

    .line 218
    .line 219
    move-object/from16 p3, v2

    .line 220
    .line 221
    move-object/from16 p4, v4

    .line 222
    .line 223
    move-object/from16 p1, v5

    .line 224
    .line 225
    move-object/from16 p0, v6

    .line 226
    .line 227
    move/from16 p5, v7

    .line 228
    .line 229
    invoke-direct/range {p0 .. p5}, La/otp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 230
    .line 231
    .line 232
    move-object/from16 v1, p0

    .line 233
    .line 234
    invoke-static {v3, v1, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    if-ne v0, v11, :cond_9

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 242
    .line 243
    :goto_5
    if-ne v0, v11, :cond_a

    .line 244
    .line 245
    :goto_6
    return-object v11

    .line 246
    :cond_a
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object v0

    .line 249
    :cond_b
    new-instance v0, La/c44;

    .line 250
    .line 251
    const/16 v1, 0x8

    .line 252
    .line 253
    invoke-direct {v0, v1}, La/c44;-><init>(B)V

    .line 254
    .line 255
    .line 256
    throw v0
.end method

.method public h(JLa/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/omt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/omt;

    .line 7
    .line 8
    iget v1, v0, La/omt;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/omt;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/omt;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/omt;-><init>(La/cad;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/omt;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/omt;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    check-cast p3, La/j0g0;

    .line 40
    .line 41
    iget-object p0, p3, La/j0g0;->a:Ljava/lang/Object;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/c5k;

    .line 57
    .line 58
    iput v3, v0, La/omt;->k:I

    .line 59
    .line 60
    invoke-virtual {p0, p1, p2, v0}, La/c5k;->d(JLa/zje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-ne p0, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    return-object p0
.end method

.method public i()V
    .locals 0

    .line 1
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/jxq;

    .line 4
    .line 5
    iget-object p0, p0, La/jxq;->d:La/v1r;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/e;->c0()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 5

    .line 1
    iget-byte v0, p0, La/cad;->a:B

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const v2, 0x7f070074

    .line 5
    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p0, Lorg/xplatform/favorites/impl/presentation/category/e;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v0, p2, La/xiv0;->a:La/uiv0;

    .line 24
    .line 25
    invoke-virtual {v0, v4}, La/uiv0;->i(I)La/pfx;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    iget v4, v4, La/pfx;->b:I

    .line 30
    .line 31
    invoke-virtual {v0, v3}, La/uiv0;->i(I)La/pfx;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget v0, v0, La/pfx;->d:I

    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    add-int/2addr p0, v0

    .line 46
    invoke-static {v4, p0, v1, p1}, La/jmu0;->l(IIILandroid/view/View;)V

    .line 47
    .line 48
    .line 49
    return-object p2

    .line 50
    :pswitch_0
    check-cast p0, La/s5p;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object v0, p2, La/xiv0;->a:La/uiv0;

    .line 57
    .line 58
    invoke-virtual {v0, v4}, La/uiv0;->i(I)La/pfx;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    iget v4, v4, La/pfx;->b:I

    .line 63
    .line 64
    invoke-virtual {v0, v3}, La/uiv0;->i(I)La/pfx;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget v0, v0, La/pfx;->d:I

    .line 69
    .line 70
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    add-int/2addr p0, v0

    .line 79
    invoke-static {v4, p0, v1, p1}, La/jmu0;->l(IIILandroid/view/View;)V

    .line 80
    .line 81
    .line 82
    return-object p2

    .line 83
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
    .end packed-switch
.end method

.method public n(I)I
    .locals 1

    .line 1
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/j83;

    .line 4
    .line 5
    iget-object p0, p0, La/j83;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p1, v0, p0}, La/l1e0;->d(III)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public s(I)I
    .locals 1

    .line 1
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/j83;

    .line 4
    .line 5
    iget-object p0, p0, La/j83;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p1, v0, p0}, La/l1e0;->d(III)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method
