.class public final synthetic La/hou0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jou0;


# direct methods
.method public synthetic constructor <init>(La/jou0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hou0;->a:B

    iput-object p1, p0, La/hou0;->b:La/jou0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/hou0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/hou0;->b:La/jou0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/jou0;->R1:La/sxs0;

    .line 10
    .line 11
    iget-object p0, p0, La/jou0;->O1:La/a8z;

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
    sget-object v0, La/wnu0;->a:La/wnu0;

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
    sget-object v0, La/jou0;->R1:La/sxs0;

    .line 28
    .line 29
    iget-object p0, p0, La/jou0;->K1:La/fiu0;

    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_0
    const-string p0, "viewModelFactory"

    .line 35
    .line 36
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v1

    .line 40
    :pswitch_1
    sget-object v0, La/jou0;->R1:La/sxs0;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    instance-of v2, v0, La/af3;

    .line 54
    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    check-cast v0, La/af3;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move-object v0, v1

    .line 61
    :goto_0
    const-class v2, La/knu0;

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, La/o5d0;

    .line 74
    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, La/ze3;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    move-object v0, v1

    .line 85
    :goto_1
    instance-of v3, v0, La/knu0;

    .line 86
    .line 87
    if-nez v3, :cond_3

    .line 88
    .line 89
    move-object v0, v1

    .line 90
    :cond_3
    check-cast v0, La/knu0;

    .line 91
    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    iget-object v1, p0, La/jou0;->M1:La/khf0;

    .line 95
    .line 96
    sget-object v2, La/jou0;->S1:[La/iiy;

    .line 97
    .line 98
    const/4 v3, 0x0

    .line 99
    aget-object v2, v2, v3

    .line 100
    .line 101
    invoke-virtual {v1, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    move-object v8, p0

    .line 106
    check-cast v8, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualCategoryDisciplinesParams;

    .line 107
    .line 108
    iget-object v4, v0, La/knu0;->a:La/duj;

    .line 109
    .line 110
    iget-object v5, v0, La/knu0;->b:La/g2v;

    .line 111
    .line 112
    iget-object v2, v0, La/knu0;->c:La/cad;

    .line 113
    .line 114
    iget-object p0, v0, La/knu0;->d:La/gii0;

    .line 115
    .line 116
    iget-object v1, v0, La/knu0;->e:La/oeg0;

    .line 117
    .line 118
    iget-object v3, v0, La/knu0;->f:La/pyg;

    .line 119
    .line 120
    iget-object v7, v0, La/knu0;->g:La/ctf0;

    .line 121
    .line 122
    iget-object v6, v0, La/knu0;->h:La/knf0;

    .line 123
    .line 124
    iget-object v9, v0, La/knu0;->j:La/iip;

    .line 125
    .line 126
    move-object v10, v9

    .line 127
    iget-object v9, v0, La/knu0;->k:La/sjl0;

    .line 128
    .line 129
    iget-object v0, v0, La/knu0;->i:La/m1e;

    .line 130
    .line 131
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    new-instance v1, La/czi;

    .line 156
    .line 157
    move-object v6, v0

    .line 158
    invoke-direct/range {v1 .. v9}, La/czi;-><init>(La/cad;La/pyg;La/duj;La/g2v;La/m1e;La/ctf0;Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualCategoryDisciplinesParams;La/sjl0;)V

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 163
    .line 164
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    :goto_2
    return-object v1

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
