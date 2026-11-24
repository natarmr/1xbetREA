.class public final synthetic La/plj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rlj0;


# direct methods
.method public synthetic constructor <init>(La/rlj0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/plj0;->a:B

    iput-object p1, p0, La/plj0;->b:La/rlj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/plj0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/plj0;->b:La/rlj0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/rlj0;->O1:La/eke0;

    .line 11
    .line 12
    new-instance v1, La/q0h0;

    .line 13
    .line 14
    iget-object v0, v0, La/rlj0;->M1:La/a8z;

    .line 15
    .line 16
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/yti;

    .line 21
    .line 22
    iget-object v0, v0, La/yti;->m:La/n5d0;

    .line 23
    .line 24
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/xti;

    .line 29
    .line 30
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    sget-object v1, La/rlj0;->O1:La/eke0;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    instance-of v2, v1, La/af3;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    check-cast v1, La/af3;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move-object v1, v3

    .line 56
    :goto_0
    const-class v2, La/cmj0;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, La/o5d0;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, La/ze3;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    move-object v1, v3

    .line 80
    :goto_1
    instance-of v4, v1, La/cmj0;

    .line 81
    .line 82
    if-nez v4, :cond_2

    .line 83
    .line 84
    move-object v1, v3

    .line 85
    :cond_2
    check-cast v1, La/cmj0;

    .line 86
    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 90
    .line 91
    .line 92
    move-result-object v16

    .line 93
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object v6, v1, La/cmj0;->a:La/dpi0;

    .line 97
    .line 98
    iget-object v7, v1, La/cmj0;->b:La/cad;

    .line 99
    .line 100
    iget-object v5, v1, La/cmj0;->c:La/iw20;

    .line 101
    .line 102
    iget-object v8, v1, La/cmj0;->d:La/kl5;

    .line 103
    .line 104
    iget-object v9, v1, La/cmj0;->e:La/peg0;

    .line 105
    .line 106
    iget-object v10, v1, La/cmj0;->f:La/qu;

    .line 107
    .line 108
    iget-object v11, v1, La/cmj0;->g:La/ocl;

    .line 109
    .line 110
    iget-object v12, v1, La/cmj0;->h:La/wyu;

    .line 111
    .line 112
    iget-object v13, v1, La/cmj0;->i:La/m1e;

    .line 113
    .line 114
    iget-object v14, v1, La/cmj0;->j:La/s64;

    .line 115
    .line 116
    iget-object v15, v1, La/cmj0;->k:La/ctf0;

    .line 117
    .line 118
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    new-instance v4, La/yti;

    .line 128
    .line 129
    invoke-direct/range {v4 .. v16}, La/yti;-><init>(La/iw20;La/dpi0;La/cad;La/kl5;La/peg0;La/qu;La/ocl;La/wyu;La/m1e;La/s64;La/ctf0;La/i1w0;)V

    .line 130
    .line 131
    .line 132
    move-object v3, v4

    .line 133
    goto :goto_2

    .line 134
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 135
    .line 136
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :goto_2
    return-object v3

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
