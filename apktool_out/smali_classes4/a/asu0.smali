.class public final synthetic La/asu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/csu0;


# direct methods
.method public synthetic constructor <init>(La/csu0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/asu0;->a:B

    iput-object p1, p0, La/asu0;->b:La/csu0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/asu0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/asu0;->b:La/csu0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/csu0;->R1:La/bzs0;

    .line 10
    .line 11
    iget-object p0, p0, La/csu0;->L1:La/fiu0;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, "viewModelFactory"

    .line 17
    .line 18
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v1

    .line 22
    :pswitch_0
    sget-object v0, La/csu0;->R1:La/bzs0;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    instance-of v2, v0, La/af3;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    check-cast v0, La/af3;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object v0, v1

    .line 43
    :goto_0
    const-class v2, La/dsu0;

    .line 44
    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, La/o5d0;

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, La/ze3;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move-object v0, v1

    .line 67
    :goto_1
    instance-of v3, v0, La/dsu0;

    .line 68
    .line 69
    if-nez v3, :cond_3

    .line 70
    .line 71
    move-object v0, v1

    .line 72
    :cond_3
    check-cast v0, La/dsu0;

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    iget-object v1, p0, La/csu0;->P1:La/khf0;

    .line 77
    .line 78
    sget-object v2, La/csu0;->S1:[La/iiy;

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    aget-object v2, v2, v3

    .line 82
    .line 83
    invoke-virtual {v1, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    move-object v7, p0

    .line 88
    check-cast v7, Lorg/xplatform/cyber/section/api/virtualrecommended/VirtualRecommendedEventsParams;

    .line 89
    .line 90
    iget-object v5, v0, La/dsu0;->a:La/duj;

    .line 91
    .line 92
    iget-object v6, v0, La/dsu0;->b:La/g2v;

    .line 93
    .line 94
    iget-object v2, v0, La/dsu0;->c:La/cad;

    .line 95
    .line 96
    iget-object p0, v0, La/dsu0;->d:La/m1e;

    .line 97
    .line 98
    iget-object v1, v0, La/dsu0;->e:La/gii0;

    .line 99
    .line 100
    iget-object v3, v0, La/dsu0;->f:La/oeg0;

    .line 101
    .line 102
    move-object v4, v3

    .line 103
    iget-object v3, v0, La/dsu0;->g:La/pyg;

    .line 104
    .line 105
    iget-object v8, v0, La/dsu0;->h:La/ctf0;

    .line 106
    .line 107
    iget-object v9, v0, La/dsu0;->i:La/knf0;

    .line 108
    .line 109
    iget-object v10, v0, La/dsu0;->j:La/iip;

    .line 110
    .line 111
    move-object v11, v8

    .line 112
    iget-object v8, v0, La/dsu0;->l:La/sjl0;

    .line 113
    .line 114
    move-object v12, v4

    .line 115
    iget-object v4, v0, La/dsu0;->k:La/xri;

    .line 116
    .line 117
    move-object v13, v10

    .line 118
    iget-object v10, v0, La/dsu0;->n:La/zr1;

    .line 119
    .line 120
    iget-object v0, v0, La/dsu0;->m:La/ih5;

    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    new-instance v1, La/fzi;

    .line 150
    .line 151
    move-object v9, v0

    .line 152
    invoke-direct/range {v1 .. v10}, La/fzi;-><init>(La/cad;La/pyg;La/xri;La/duj;La/g2v;Lorg/xplatform/cyber/section/api/virtualrecommended/VirtualRecommendedEventsParams;La/sjl0;La/ih5;La/zr1;)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 157
    .line 158
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :goto_2
    return-object v1

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
