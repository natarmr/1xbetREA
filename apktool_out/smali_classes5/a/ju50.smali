.class public final synthetic La/ju50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/lu50;


# direct methods
.method public synthetic constructor <init>(La/lu50;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ju50;->a:B

    iput-object p1, p0, La/ju50;->b:La/lu50;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/ju50;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/ju50;->b:La/lu50;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/lu50;->V1:La/uuz;

    .line 10
    .line 11
    iget-object p0, p0, La/lu50;->U1:La/a8z;

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
    sget-object v0, La/fu50;->d:La/fu50;

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
    sget-object v0, La/lu50;->V1:La/uuz;

    .line 28
    .line 29
    iget-object p0, p0, La/lu50;->U1:La/a8z;

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
    sget-object v0, La/fu50;->e:La/fu50;

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
    sget-object v0, La/lu50;->V1:La/uuz;

    .line 46
    .line 47
    iget-object p0, p0, La/lu50;->L1:La/fiu0;

    .line 48
    .line 49
    if-eqz p0, :cond_0

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_0
    const-string p0, "viewModelFactory"

    .line 53
    .line 54
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    :pswitch_2
    sget-object v0, La/lu50;->V1:La/uuz;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    instance-of v2, v0, La/af3;

    .line 72
    .line 73
    if-eqz v2, :cond_1

    .line 74
    .line 75
    check-cast v0, La/af3;

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    move-object v0, v1

    .line 79
    :goto_0
    const-class v2, La/iu50;

    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, La/o5d0;

    .line 92
    .line 93
    if-eqz v0, :cond_2

    .line 94
    .line 95
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/ze3;

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    move-object v0, v1

    .line 103
    :goto_1
    instance-of v3, v0, La/iu50;

    .line 104
    .line 105
    if-nez v3, :cond_3

    .line 106
    .line 107
    move-object v0, v1

    .line 108
    :cond_3
    move-object v3, v0

    .line 109
    check-cast v3, La/iu50;

    .line 110
    .line 111
    if-eqz v3, :cond_4

    .line 112
    .line 113
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    iget-object v0, p0, La/lu50;->N1:La/zz2;

    .line 118
    .line 119
    sget-object v1, La/lu50;->W1:[La/iiy;

    .line 120
    .line 121
    const/4 v2, 0x1

    .line 122
    aget-object v2, v1, v2

    .line 123
    .line 124
    invoke-virtual {v0, p0, v2}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    iget-object v0, p0, La/lu50;->P1:La/zz2;

    .line 133
    .line 134
    const/4 v2, 0x3

    .line 135
    aget-object v2, v1, v2

    .line 136
    .line 137
    invoke-virtual {v0, p0, v2}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    iget-object v0, p0, La/lu50;->O1:La/zz2;

    .line 146
    .line 147
    const/4 v2, 0x2

    .line 148
    aget-object v2, v1, v2

    .line 149
    .line 150
    invoke-virtual {v0, p0, v2}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    iget-object v0, p0, La/lu50;->Q1:La/cgx0;

    .line 159
    .line 160
    const/4 v2, 0x4

    .line 161
    aget-object v1, v1, v2

    .line 162
    .line 163
    invoke-virtual {v0, p0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    const/4 v8, 0x0

    .line 172
    const/16 v10, 0x30

    .line 173
    .line 174
    invoke-static/range {v3 .. v10}, La/iu50;->a(La/iu50;La/i1w0;IIILa/mvc;ZI)La/yli;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    goto :goto_2

    .line 179
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 180
    .line 181
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    :goto_2
    return-object v1

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
