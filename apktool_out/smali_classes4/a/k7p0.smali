.class public final synthetic La/k7p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m7p0;


# direct methods
.method public synthetic constructor <init>(La/m7p0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/k7p0;->a:B

    iput-object p1, p0, La/k7p0;->b:La/m7p0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/k7p0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/k7p0;->b:La/m7p0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/m7p0;->P1:La/s9m0;

    .line 10
    .line 11
    iget-object p0, p0, La/m7p0;->M1:La/a8z;

    .line 12
    .line 13
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/k3t0;

    .line 18
    .line 19
    sget-object v0, La/a7p0;->a:La/a7p0;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    sget-object v0, La/m7p0;->P1:La/s9m0;

    .line 28
    .line 29
    iget-object p0, p0, La/m7p0;->M1:La/a8z;

    .line 30
    .line 31
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, La/k3t0;

    .line 36
    .line 37
    sget-object v0, La/b7p0;->a:La/b7p0;

    .line 38
    .line 39
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_1
    sget-object v0, La/m7p0;->P1:La/s9m0;

    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    instance-of v2, v0, La/af3;

    .line 59
    .line 60
    if-eqz v2, :cond_0

    .line 61
    .line 62
    check-cast v0, La/af3;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move-object v0, v1

    .line 66
    :goto_0
    const-class v2, La/n7p0;

    .line 67
    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, La/o5d0;

    .line 79
    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, La/ze3;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    move-object v0, v1

    .line 90
    :goto_1
    instance-of v3, v0, La/n7p0;

    .line 91
    .line 92
    if-nez v3, :cond_2

    .line 93
    .line 94
    move-object v0, v1

    .line 95
    :cond_2
    check-cast v0, La/n7p0;

    .line 96
    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    iget-object v1, p0, La/m7p0;->O1:La/khf0;

    .line 100
    .line 101
    sget-object v2, La/m7p0;->Q1:[La/iiy;

    .line 102
    .line 103
    const/4 v3, 0x0

    .line 104
    aget-object v2, v2, v3

    .line 105
    .line 106
    invoke-virtual {v1, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    move-object v4, p0

    .line 111
    check-cast v4, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsAchievementParams;

    .line 112
    .line 113
    iget-object v5, v0, La/n7p0;->a:La/ctf0;

    .line 114
    .line 115
    iget-object v6, v0, La/n7p0;->b:La/gii0;

    .line 116
    .line 117
    iget-object v2, v0, La/n7p0;->c:La/pyg;

    .line 118
    .line 119
    iget-object v3, v0, La/n7p0;->d:La/cad;

    .line 120
    .line 121
    iget-object v7, v0, La/n7p0;->e:La/m1e;

    .line 122
    .line 123
    iget-object v8, v0, La/n7p0;->f:La/g2v;

    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    new-instance v1, La/jwi;

    .line 138
    .line 139
    invoke-direct/range {v1 .. v8}, La/jwi;-><init>(La/pyg;La/cad;Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsAchievementParams;La/ctf0;La/gii0;La/m1e;La/g2v;)V

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 144
    .line 145
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

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
    return-object v1

    .line 153
    :pswitch_2
    sget-object v0, La/m7p0;->P1:La/s9m0;

    .line 154
    .line 155
    iget-object p0, p0, La/m7p0;->K1:La/fiu0;

    .line 156
    .line 157
    if-eqz p0, :cond_4

    .line 158
    .line 159
    return-object p0

    .line 160
    :cond_4
    const-string p0, "viewModelFactory"

    .line 161
    .line 162
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw v1

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
