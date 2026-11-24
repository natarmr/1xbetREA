.class public final synthetic La/qyv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/tyv0;


# direct methods
.method public synthetic constructor <init>(La/tyv0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qyv0;->a:B

    iput-object p1, p0, La/qyv0;->b:La/tyv0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qyv0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/qyv0;->b:La/tyv0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/tyv0;->O1:La/uxs0;

    .line 11
    .line 12
    new-instance v1, La/q0h0;

    .line 13
    .line 14
    iget-object v0, v0, La/tyv0;->K1:La/n0o0;

    .line 15
    .line 16
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/vzi;

    .line 21
    .line 22
    iget-object v0, v0, La/vzi;->n:La/n5d0;

    .line 23
    .line 24
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/uzi;

    .line 29
    .line 30
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    sget-object v1, La/tyv0;->O1:La/uxs0;

    .line 35
    .line 36
    sget-object v1, La/m8v;->a:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    iget-object v1, v0, La/tyv0;->N1:La/khf0;

    .line 39
    .line 40
    sget-object v2, La/tyv0;->P1:[La/iiy;

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    aget-object v4, v2, v3

    .line 44
    .line 45
    invoke-virtual {v1, v0, v4}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Lorg/xplatform/search/impl/presentation/xgames/models/XGamesSearchFragmentSettings;

    .line 50
    .line 51
    iget-object v4, v4, Lorg/xplatform/search/impl/presentation/xgames/models/XGamesSearchFragmentSettings;->a:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v4}, La/m8v;->a(Ljava/lang/String;)La/g2v;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v4}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    instance-of v5, v4, La/af3;

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    if-eqz v5, :cond_0

    .line 72
    .line 73
    check-cast v4, La/af3;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    move-object v4, v6

    .line 77
    :goto_0
    const-class v5, La/uyv0;

    .line 78
    .line 79
    if-eqz v4, :cond_3

    .line 80
    .line 81
    invoke-interface {v4}, La/af3;->d()La/wcf0;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v4, v5}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    check-cast v4, La/o5d0;

    .line 90
    .line 91
    if-eqz v4, :cond_1

    .line 92
    .line 93
    invoke-interface {v4}, La/o5d0;->get()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    check-cast v4, La/ze3;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    move-object v4, v6

    .line 101
    :goto_1
    instance-of v7, v4, La/uyv0;

    .line 102
    .line 103
    if-nez v7, :cond_2

    .line 104
    .line 105
    move-object v4, v6

    .line 106
    :cond_2
    check-cast v4, La/uyv0;

    .line 107
    .line 108
    if-eqz v4, :cond_3

    .line 109
    .line 110
    aget-object v2, v2, v3

    .line 111
    .line 112
    invoke-virtual {v1, v0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    move-object v9, v0

    .line 117
    check-cast v9, Lorg/xplatform/search/impl/presentation/xgames/models/XGamesSearchFragmentSettings;

    .line 118
    .line 119
    iget-object v6, v4, La/uyv0;->a:La/mne;

    .line 120
    .line 121
    iget-object v8, v4, La/uyv0;->b:La/bw60;

    .line 122
    .line 123
    iget-object v0, v4, La/uyv0;->c:La/d1p;

    .line 124
    .line 125
    iget-object v7, v4, La/uyv0;->d:La/iw20;

    .line 126
    .line 127
    iget-object v11, v4, La/uyv0;->e:La/lbu;

    .line 128
    .line 129
    iget-object v12, v4, La/uyv0;->f:La/ali;

    .line 130
    .line 131
    iget-object v13, v4, La/uyv0;->g:La/ctf0;

    .line 132
    .line 133
    iget-object v14, v4, La/uyv0;->h:La/iqt;

    .line 134
    .line 135
    iget-object v15, v4, La/uyv0;->i:La/m1e;

    .line 136
    .line 137
    iget-object v1, v4, La/uyv0;->j:La/bzt;

    .line 138
    .line 139
    iget-object v2, v4, La/uyv0;->k:La/o3c;

    .line 140
    .line 141
    iget-object v3, v4, La/uyv0;->l:La/yuu;

    .line 142
    .line 143
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    new-instance v5, La/vzi;

    .line 156
    .line 157
    move-object/from16 v16, v1

    .line 158
    .line 159
    move-object/from16 v17, v2

    .line 160
    .line 161
    move-object/from16 v18, v3

    .line 162
    .line 163
    invoke-direct/range {v5 .. v18}, La/vzi;-><init>(La/mne;La/iw20;La/bw60;Lorg/xplatform/search/impl/presentation/xgames/models/XGamesSearchFragmentSettings;La/g2v;La/lbu;La/ali;La/ctf0;La/iqt;La/m1e;La/bzt;La/o3c;La/yuu;)V

    .line 164
    .line 165
    .line 166
    move-object v6, v5

    .line 167
    goto :goto_2

    .line 168
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 169
    .line 170
    invoke-static {v5, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    :goto_2
    return-object v6

    .line 178
    nop

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
