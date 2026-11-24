.class public final synthetic La/bfc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dfc;


# direct methods
.method public synthetic constructor <init>(La/dfc;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bfc;->a:B

    iput-object p1, p0, La/bfc;->b:La/dfc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/bfc;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/bfc;->b:La/dfc;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/dfc;->N1:La/gl5;

    .line 9
    .line 10
    iget-object p0, p0, La/dfc;->M1:La/a8z;

    .line 11
    .line 12
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/k3t0;

    .line 17
    .line 18
    sget-object v0, La/wec;->a:La/wec;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    sget-object v0, La/dfc;->N1:La/gl5;

    .line 27
    .line 28
    iget-object p0, p0, La/dfc;->M1:La/a8z;

    .line 29
    .line 30
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/k3t0;

    .line 35
    .line 36
    sget-object v0, La/vec;->a:La/vec;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_1
    new-instance v0, La/q0h0;

    .line 45
    .line 46
    iget-object p0, p0, La/dfc;->L1:La/a8z;

    .line 47
    .line 48
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, La/zwi;

    .line 53
    .line 54
    iget-object p0, p0, La/zwi;->g:La/n5d0;

    .line 55
    .line 56
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, La/ywi;

    .line 61
    .line 62
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_2
    sget-object v0, La/dfc;->N1:La/gl5;

    .line 67
    .line 68
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    instance-of v1, v0, La/af3;

    .line 80
    .line 81
    const/4 v2, 0x0

    .line 82
    if-eqz v1, :cond_0

    .line 83
    .line 84
    check-cast v0, La/af3;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    move-object v0, v2

    .line 88
    :goto_0
    const-class v1, La/f1q0;

    .line 89
    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, La/o5d0;

    .line 101
    .line 102
    if-eqz v0, :cond_1

    .line 103
    .line 104
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, La/ze3;

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_1
    move-object v0, v2

    .line 112
    :goto_1
    instance-of v3, v0, La/f1q0;

    .line 113
    .line 114
    if-nez v3, :cond_2

    .line 115
    .line 116
    move-object v0, v2

    .line 117
    :cond_2
    check-cast v0, La/f1q0;

    .line 118
    .line 119
    if-eqz v0, :cond_3

    .line 120
    .line 121
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object v5, v0, La/f1q0;->a:La/g1q0;

    .line 129
    .line 130
    iget-object v6, v0, La/f1q0;->b:La/ctf0;

    .line 131
    .line 132
    iget-object v7, v0, La/f1q0;->c:La/mne;

    .line 133
    .line 134
    iget-object v8, v0, La/f1q0;->d:La/iqt;

    .line 135
    .line 136
    iget-object v9, v0, La/f1q0;->e:La/pmi0;

    .line 137
    .line 138
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    new-instance v3, La/zwi;

    .line 145
    .line 146
    invoke-direct/range {v3 .. v9}, La/zwi;-><init>(La/i1w0;La/g1q0;La/ctf0;La/mne;La/iqt;La/pmi0;)V

    .line 147
    .line 148
    .line 149
    move-object v2, v3

    .line 150
    goto :goto_2

    .line 151
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 152
    .line 153
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :goto_2
    return-object v2

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
