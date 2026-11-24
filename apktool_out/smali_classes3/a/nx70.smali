.class public final synthetic La/nx70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ox70;


# direct methods
.method public synthetic constructor <init>(La/ox70;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nx70;->a:B

    iput-object p1, p0, La/nx70;->b:La/ox70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/nx70;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/nx70;->b:La/ox70;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/ox70;->n2:La/mi70;

    .line 9
    .line 10
    invoke-virtual {p0}, La/ox70;->P0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, La/rx70;->a:La/rx70;

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
    sget-object v0, La/ox70;->n2:La/mi70;

    .line 23
    .line 24
    invoke-virtual {p0}, La/ox70;->P0()La/k3t0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    sget-object v0, La/sx70;->a:La/sx70;

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
    sget-object v0, La/ox70;->n2:La/mi70;

    .line 37
    .line 38
    new-instance v0, La/q0h0;

    .line 39
    .line 40
    iget-object p0, p0, La/ox70;->k2:La/a8z;

    .line 41
    .line 42
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, La/ymi;

    .line 47
    .line 48
    iget-object p0, p0, La/ymi;->c:La/n5d0;

    .line 49
    .line 50
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, La/xmi;

    .line 55
    .line 56
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :pswitch_2
    sget-object v0, La/ox70;->n2:La/mi70;

    .line 61
    .line 62
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    instance-of v1, v0, La/af3;

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    if-eqz v1, :cond_0

    .line 77
    .line 78
    check-cast v0, La/af3;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    move-object v0, v2

    .line 82
    :goto_0
    const-class v1, La/vx70;

    .line 83
    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, La/o5d0;

    .line 95
    .line 96
    if-eqz v0, :cond_1

    .line 97
    .line 98
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, La/ze3;

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_1
    move-object v0, v2

    .line 106
    :goto_1
    instance-of v3, v0, La/vx70;

    .line 107
    .line 108
    if-nez v3, :cond_2

    .line 109
    .line 110
    move-object v0, v2

    .line 111
    :cond_2
    check-cast v0, La/vx70;

    .line 112
    .line 113
    if-eqz v0, :cond_3

    .line 114
    .line 115
    iget-object v1, p0, La/ox70;->m2:La/yzn0;

    .line 116
    .line 117
    sget-object v2, La/ox70;->o2:[La/iiy;

    .line 118
    .line 119
    const/4 v3, 0x0

    .line 120
    aget-object v2, v2, v3

    .line 121
    .line 122
    invoke-virtual {v1, p0, v2}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    check-cast p0, La/jvp0;

    .line 127
    .line 128
    iget-object v0, v0, La/vx70;->a:La/xzp;

    .line 129
    .line 130
    new-instance v2, La/ymi;

    .line 131
    .line 132
    invoke-direct {v2, v0, p0}, La/ymi;-><init>(La/xzp;La/jvp0;)V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 137
    .line 138
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :goto_2
    return-object v2

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
