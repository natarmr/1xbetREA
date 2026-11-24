.class public final synthetic La/tgg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vgg;


# direct methods
.method public synthetic constructor <init>(La/vgg;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tgg;->a:B

    iput-object p1, p0, La/tgg;->b:La/vgg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/tgg;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/tgg;->b:La/vgg;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/vgg;->Q1:La/qud;

    .line 9
    .line 10
    new-instance v0, La/q0h0;

    .line 11
    .line 12
    iget-object p0, p0, La/vgg;->N1:La/a8z;

    .line 13
    .line 14
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, La/iei;

    .line 19
    .line 20
    iget-object p0, p0, La/iei;->h:La/n5d0;

    .line 21
    .line 22
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, La/hei;

    .line 27
    .line 28
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_0
    sget-object v0, La/vgg;->Q1:La/qud;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    instance-of v1, v0, La/af3;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    check-cast v0, La/af3;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move-object v0, v2

    .line 54
    :goto_0
    const-class v1, La/rgg;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, La/o5d0;

    .line 67
    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, La/ze3;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    move-object v0, v2

    .line 78
    :goto_1
    instance-of v3, v0, La/rgg;

    .line 79
    .line 80
    if-nez v3, :cond_2

    .line 81
    .line 82
    move-object v0, v2

    .line 83
    :cond_2
    check-cast v0, La/rgg;

    .line 84
    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    iget-object v1, p0, La/vgg;->M1:La/khf0;

    .line 88
    .line 89
    sget-object v2, La/vgg;->R1:[La/iiy;

    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    aget-object v2, v2, v3

    .line 93
    .line 94
    invoke-virtual {v1, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    move-object v5, p0

    .line 99
    check-cast v5, Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 100
    .line 101
    iget-object v2, v0, La/rgg;->a:La/cad;

    .line 102
    .line 103
    iget-object v3, v0, La/rgg;->b:La/pyg;

    .line 104
    .line 105
    iget-object p0, v0, La/rgg;->c:La/iip;

    .line 106
    .line 107
    iget-object v1, v0, La/rgg;->d:La/m1e;

    .line 108
    .line 109
    iget-object v4, v0, La/rgg;->e:La/ctf0;

    .line 110
    .line 111
    iget-object v6, v0, La/rgg;->f:La/wdk0;

    .line 112
    .line 113
    iget-object v7, v0, La/rgg;->g:La/b3c0;

    .line 114
    .line 115
    iget-object v0, v0, La/rgg;->h:La/ib50;

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    new-instance v1, La/iei;

    .line 136
    .line 137
    move-object v6, v0

    .line 138
    invoke-direct/range {v1 .. v6}, La/iei;-><init>(La/cad;La/pyg;La/ctf0;Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;La/ib50;)V

    .line 139
    .line 140
    .line 141
    move-object v2, v1

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 144
    .line 145
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :goto_2
    return-object v2

    .line 153
    :pswitch_1
    sget-object v0, La/vgg;->Q1:La/qud;

    .line 154
    .line 155
    iget-object p0, p0, La/vgg;->O1:La/kiu0;

    .line 156
    .line 157
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    check-cast p0, La/aig;

    .line 162
    .line 163
    sget-object v0, La/ihg;->a:La/ihg;

    .line 164
    .line 165
    invoke-virtual {p0, v0}, La/aig;->M(La/shg;)V

    .line 166
    .line 167
    .line 168
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
