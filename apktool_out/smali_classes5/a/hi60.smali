.class public final synthetic La/hi60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ki60;


# direct methods
.method public synthetic constructor <init>(La/ki60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hi60;->a:B

    iput-object p1, p0, La/hi60;->b:La/ki60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/hi60;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/hi60;->b:La/ki60;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/ki60;->q2:La/htz;

    .line 10
    .line 11
    invoke-virtual {p0}, La/ki60;->P0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v2, La/zh60;->a:La/zh60;

    .line 16
    .line 17
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, La/ki60;->p2:Lkotlin/jvm/functions/Function0;

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    new-instance v0, La/q0h0;

    .line 26
    .line 27
    iget-object p0, p0, La/ki60;->k2:La/a8z;

    .line 28
    .line 29
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, La/lxi;

    .line 34
    .line 35
    iget-object p0, p0, La/lxi;->u:La/n5d0;

    .line 36
    .line 37
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, La/kxi;

    .line 42
    .line 43
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_1
    sget-object v0, La/ki60;->q2:La/htz;

    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    instance-of v2, v0, La/af3;

    .line 61
    .line 62
    if-eqz v2, :cond_0

    .line 63
    .line 64
    check-cast v0, La/af3;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move-object v0, v1

    .line 68
    :goto_0
    const-class v2, La/qoq0;

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, La/o5d0;

    .line 81
    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, La/ze3;

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    move-object v0, v1

    .line 92
    :goto_1
    instance-of v3, v0, La/qoq0;

    .line 93
    .line 94
    if-nez v3, :cond_2

    .line 95
    .line 96
    move-object v0, v1

    .line 97
    :cond_2
    check-cast v0, La/qoq0;

    .line 98
    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    iget-object v1, p0, La/ki60;->m2:La/cgx0;

    .line 102
    .line 103
    sget-object v2, La/ki60;->r2:[La/iiy;

    .line 104
    .line 105
    const/4 v3, 0x0

    .line 106
    aget-object v3, v2, v3

    .line 107
    .line 108
    invoke-virtual {v1, p0, v3}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    iget-object v3, p0, La/ki60;->n2:La/zz2;

    .line 117
    .line 118
    const/4 v4, 0x1

    .line 119
    aget-object v2, v2, v4

    .line 120
    .line 121
    invoke-virtual {v3, p0, v2}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {v0, v2, p0, v1}, La/qoq0;->a(ILa/i1w0;Z)La/lxi;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    goto :goto_2

    .line 138
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 139
    .line 140
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :goto_2
    return-object v1

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
