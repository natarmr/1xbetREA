.class public final synthetic La/u4e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w4e0;


# direct methods
.method public synthetic constructor <init>(La/w4e0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/u4e0;->a:B

    iput-object p1, p0, La/u4e0;->b:La/w4e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/u4e0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/u4e0;->b:La/w4e0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/w4e0;->O1:La/rl70;

    .line 10
    .line 11
    iget-object p0, p0, La/w4e0;->M1:La/a8z;

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
    sget-object v0, La/a3e0;->a:La/a3e0;

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
    sget-object v0, La/w4e0;->O1:La/rl70;

    .line 28
    .line 29
    iget-object p0, p0, La/w4e0;->M1:La/a8z;

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
    sget-object v0, La/b3e0;->a:La/b3e0;

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
    sget-object v0, La/w4e0;->O1:La/rl70;

    .line 46
    .line 47
    iget-object p0, p0, La/w4e0;->K1:La/fiu0;

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
    sget-object v0, La/w4e0;->O1:La/rl70;

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
    const-class v2, La/x4e0;

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
    instance-of v3, v0, La/x4e0;

    .line 104
    .line 105
    if-nez v3, :cond_3

    .line 106
    .line 107
    move-object v0, v1

    .line 108
    :cond_3
    check-cast v0, La/x4e0;

    .line 109
    .line 110
    if-eqz v0, :cond_4

    .line 111
    .line 112
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object v4, v0, La/x4e0;->a:La/cad;

    .line 120
    .line 121
    iget-object v6, v0, La/x4e0;->b:La/gii0;

    .line 122
    .line 123
    iget-object v7, v0, La/x4e0;->c:La/g2v;

    .line 124
    .line 125
    iget-object v8, v0, La/x4e0;->d:La/m1e;

    .line 126
    .line 127
    iget-object v9, v0, La/x4e0;->e:La/ctf0;

    .line 128
    .line 129
    iget-object v10, v0, La/x4e0;->f:La/pru;

    .line 130
    .line 131
    iget-object v11, v0, La/x4e0;->g:La/uxs0;

    .line 132
    .line 133
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    new-instance v3, La/bri;

    .line 143
    .line 144
    invoke-direct/range {v3 .. v11}, La/bri;-><init>(La/cad;La/i1w0;La/gii0;La/g2v;La/m1e;La/ctf0;La/pru;La/uxs0;)V

    .line 145
    .line 146
    .line 147
    move-object v1, v3

    .line 148
    goto :goto_2

    .line 149
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 150
    .line 151
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :goto_2
    return-object v1

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
