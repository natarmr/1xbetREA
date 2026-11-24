.class public final synthetic La/vwq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroidx/fragment/app/Fragment;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/vwq;->a:B

    iput-object p1, p0, La/vwq;->b:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    const/16 p2, 0x10

    iput-byte p2, p0, La/vwq;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vwq;->b:Landroidx/fragment/app/Fragment;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-byte v0, p0, La/vwq;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/vwq;->b:Landroidx/fragment/app/Fragment;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->w1:La/n6r;

    .line 9
    .line 10
    sget-object v0, La/kkz;->ON_PAUSE:La/kkz;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, La/n6r;->a(La/kkz;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->w:La/jxq;

    .line 17
    .line 18
    iget-object v0, v0, La/jxq;->b:Landroid/content/Context;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->V(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->w1:La/n6r;

    .line 25
    .line 26
    sget-object v0, La/kkz;->ON_START:La/kkz;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, La/n6r;->a(La/kkz;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_2
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 33
    .line 34
    sget-object v0, La/kkz;->ON_START:La/kkz;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, La/glz;->d(La/kkz;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->g0()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->T()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h0()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_6
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->w1:La/n6r;

    .line 53
    .line 54
    sget-object v0, La/kkz;->ON_CREATE:La/kkz;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, La/n6r;->a(La/kkz;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_7
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->w1:La/n6r;

    .line 61
    .line 62
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->d:Landroid/os/Bundle;

    .line 63
    .line 64
    iget-object v0, v0, La/n6r;->g:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, La/nw20;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, La/nw20;->p(Landroid/os/Bundle;)V

    .line 69
    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    iput-object v0, p0, Landroidx/fragment/app/Fragment;->d:Landroid/os/Bundle;

    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_8
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 76
    .line 77
    sget-object v0, La/kkz;->ON_CREATE:La/kkz;

    .line 78
    .line 79
    invoke-virtual {p0, v0}, La/glz;->d(La/kkz;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Z()V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_a
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 88
    .line 89
    sget-object v0, La/kkz;->ON_STOP:La/kkz;

    .line 90
    .line 91
    invoke-virtual {p0, v0}, La/glz;->d(La/kkz;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_b
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->w1:La/n6r;

    .line 96
    .line 97
    sget-object v0, La/kkz;->ON_DESTROY:La/kkz;

    .line 98
    .line 99
    invoke-virtual {p0, v0}, La/n6r;->a(La/kkz;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :pswitch_c
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->w1:La/n6r;

    .line 104
    .line 105
    sget-object v0, La/kkz;->ON_RESUME:La/kkz;

    .line 106
    .line 107
    invoke-virtual {p0, v0}, La/n6r;->a(La/kkz;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_d
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 112
    .line 113
    sget-object v0, La/kkz;->ON_RESUME:La/kkz;

    .line 114
    .line 115
    invoke-virtual {p0, v0}, La/glz;->d(La/kkz;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :pswitch_e
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->e0()V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :pswitch_f
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->a0()V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Y()V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :pswitch_11
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 132
    .line 133
    sget-object v0, La/kkz;->ON_DESTROY:La/kkz;

    .line 134
    .line 135
    invoke-virtual {p0, v0}, La/glz;->d(La/kkz;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :pswitch_12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d0()V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :pswitch_13
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 144
    .line 145
    sget-object v0, La/kkz;->ON_PAUSE:La/kkz;

    .line 146
    .line 147
    invoke-virtual {p0, v0}, La/glz;->d(La/kkz;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :pswitch_14
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->w1:La/n6r;

    .line 152
    .line 153
    sget-object v0, La/kkz;->ON_STOP:La/kkz;

    .line 154
    .line 155
    invoke-virtual {p0, v0}, La/n6r;->a(La/kkz;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
