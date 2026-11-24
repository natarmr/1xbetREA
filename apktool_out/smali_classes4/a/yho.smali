.class public final synthetic La/yho;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cio;


# direct methods
.method public synthetic constructor <init>(La/cio;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yho;->a:B

    iput-object p1, p0, La/yho;->b:La/cio;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/yho;->a:B

    .line 2
    .line 3
    sget-object v1, La/vf2;->a:La/vf2;

    .line 4
    .line 5
    iget-object p0, p0, La/yho;->b:La/cio;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/cio;->P1:La/ddk;

    .line 11
    .line 12
    invoke-virtual {p0}, La/cio;->H0()La/k3t0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v0, La/uf2;->a:La/uf2;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    sget-object v0, La/cio;->P1:La/ddk;

    .line 25
    .line 26
    invoke-virtual {p0}, La/cio;->H0()La/k3t0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    sget-object v0, La/cio;->P1:La/ddk;

    .line 37
    .line 38
    invoke-virtual {p0}, La/cio;->H0()La/k3t0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_2
    sget-object v0, La/cio;->P1:La/ddk;

    .line 49
    .line 50
    new-instance v0, La/q0h0;

    .line 51
    .line 52
    invoke-virtual {p0}, La/cio;->G0()La/mgi;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    iget-object p0, p0, La/mgi;->s:La/n5d0;

    .line 57
    .line 58
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, La/lgi;

    .line 63
    .line 64
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_3
    sget-object v0, La/cio;->P1:La/ddk;

    .line 69
    .line 70
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    instance-of v1, v0, La/af3;

    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    if-eqz v1, :cond_0

    .line 85
    .line 86
    check-cast v0, La/af3;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    move-object v0, v2

    .line 90
    :goto_0
    const-class v1, La/cep;

    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, La/o5d0;

    .line 103
    .line 104
    if-eqz v0, :cond_1

    .line 105
    .line 106
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, La/ze3;

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_1
    move-object v0, v2

    .line 114
    :goto_1
    instance-of v3, v0, La/cep;

    .line 115
    .line 116
    if-nez v3, :cond_2

    .line 117
    .line 118
    move-object v0, v2

    .line 119
    :cond_2
    check-cast v0, La/cep;

    .line 120
    .line 121
    if-eqz v0, :cond_3

    .line 122
    .line 123
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {v0, p0}, La/cep;->a(La/i1w0;)La/mgi;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    goto :goto_2

    .line 132
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 133
    .line 134
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    :goto_2
    return-object v2

    .line 142
    :pswitch_4
    sget-object v0, La/cio;->P1:La/ddk;

    .line 143
    .line 144
    invoke-virtual {p0}, La/cio;->H0()La/k3t0;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    sget-object v0, La/wf2;->a:La/wf2;

    .line 149
    .line 150
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
