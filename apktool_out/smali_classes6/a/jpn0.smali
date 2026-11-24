.class public final synthetic La/jpn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/npn0;


# direct methods
.method public synthetic constructor <init>(La/npn0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jpn0;->a:B

    iput-object p1, p0, La/jpn0;->b:La/npn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte v0, p0, La/jpn0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/jpn0;->b:La/npn0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/q0h0;

    .line 9
    .line 10
    iget-object p0, p0, La/npn0;->f2:La/n0o0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/svi;

    .line 17
    .line 18
    iget-object p0, p0, La/svi;->l:La/n5d0;

    .line 19
    .line 20
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, La/pvi;

    .line 25
    .line 26
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    sget-object v0, La/npn0;->j2:La/g9m0;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    instance-of v1, v0, La/af3;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    check-cast v0, La/af3;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v0, v2

    .line 52
    :goto_0
    const-class v1, La/ppn0;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, La/o5d0;

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, La/ze3;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move-object v0, v2

    .line 76
    :goto_1
    instance-of v3, v0, La/ppn0;

    .line 77
    .line 78
    if-nez v3, :cond_2

    .line 79
    .line 80
    move-object v0, v2

    .line 81
    :cond_2
    check-cast v0, La/ppn0;

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object v5, v0, La/ppn0;->a:La/mne;

    .line 93
    .line 94
    iget-object v6, v0, La/ppn0;->b:La/wyu;

    .line 95
    .line 96
    iget-object v7, v0, La/ppn0;->c:La/zx10;

    .line 97
    .line 98
    iget-object v8, v0, La/ppn0;->d:La/knf0;

    .line 99
    .line 100
    iget-object v9, v0, La/ppn0;->e:La/yvn0;

    .line 101
    .line 102
    iget-object v10, v0, La/ppn0;->f:La/gii0;

    .line 103
    .line 104
    iget-object p0, v0, La/ppn0;->g:La/j1q0;

    .line 105
    .line 106
    iget-object v11, v0, La/ppn0;->h:La/s31;

    .line 107
    .line 108
    iget-object v12, v0, La/ppn0;->i:La/e41;

    .line 109
    .line 110
    iget-object v13, v0, La/ppn0;->j:La/wgu;

    .line 111
    .line 112
    iget-object v14, v0, La/ppn0;->k:La/ctf0;

    .line 113
    .line 114
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    new-instance v3, La/svi;

    .line 136
    .line 137
    invoke-direct/range {v3 .. v14}, La/svi;-><init>(La/i1w0;La/mne;La/wyu;La/zx10;La/knf0;La/yvn0;La/gii0;La/s31;La/e41;La/wgu;La/ctf0;)V

    .line 138
    .line 139
    .line 140
    move-object v2, v3

    .line 141
    goto :goto_2

    .line 142
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 143
    .line 144
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :goto_2
    return-object v2

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
