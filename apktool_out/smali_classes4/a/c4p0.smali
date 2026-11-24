.class public final synthetic La/c4p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/e4p0;


# direct methods
.method public synthetic constructor <init>(La/e4p0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/c4p0;->a:B

    iput-object p1, p0, La/c4p0;->b:La/e4p0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/c4p0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/c4p0;->b:La/e4p0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/e4p0;->O1:La/m6m0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/e4p0;->G0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, La/y3p0;->a:La/y3p0;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    sget-object v0, La/e4p0;->O1:La/m6m0;

    .line 23
    .line 24
    invoke-virtual {p0}, La/e4p0;->G0()La/k3t0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    sget-object v0, La/q3p0;->a:La/q3p0;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    sget-object v0, La/e4p0;->O1:La/m6m0;

    .line 37
    .line 38
    invoke-virtual {p0}, La/e4p0;->G0()La/k3t0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget-object v0, La/p3p0;->a:La/p3p0;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_2
    sget-object v0, La/e4p0;->O1:La/m6m0;

    .line 51
    .line 52
    new-instance v0, La/q0h0;

    .line 53
    .line 54
    iget-object p0, p0, La/e4p0;->M1:La/n0o0;

    .line 55
    .line 56
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, La/iwi;

    .line 61
    .line 62
    iget-object p0, p0, La/iwi;->d:La/n5d0;

    .line 63
    .line 64
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/hwi;

    .line 69
    .line 70
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_3
    sget-object v0, La/e4p0;->O1:La/m6m0;

    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    instance-of v1, v0, La/af3;

    .line 88
    .line 89
    const/4 v2, 0x0

    .line 90
    if-eqz v1, :cond_0

    .line 91
    .line 92
    check-cast v0, La/af3;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    move-object v0, v2

    .line 96
    :goto_0
    const-class v1, La/f4p0;

    .line 97
    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, La/o5d0;

    .line 109
    .line 110
    if-eqz v0, :cond_1

    .line 111
    .line 112
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, La/ze3;

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_1
    move-object v0, v2

    .line 120
    :goto_1
    instance-of v3, v0, La/f4p0;

    .line 121
    .line 122
    if-nez v3, :cond_2

    .line 123
    .line 124
    move-object v0, v2

    .line 125
    :cond_2
    check-cast v0, La/f4p0;

    .line 126
    .line 127
    if-eqz v0, :cond_3

    .line 128
    .line 129
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    iget-object v1, v0, La/f4p0;->a:La/daf;

    .line 137
    .line 138
    iget-object v0, v0, La/f4p0;->b:La/bwl;

    .line 139
    .line 140
    new-instance v2, La/iwi;

    .line 141
    .line 142
    invoke-direct {v2, v1, v0, p0}, La/iwi;-><init>(La/daf;La/bwl;La/i1w0;)V

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 147
    .line 148
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    :goto_2
    return-object v2

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
