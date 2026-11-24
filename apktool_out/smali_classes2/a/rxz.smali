.class public final synthetic La/rxz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/sxz;


# direct methods
.method public synthetic constructor <init>(La/sxz;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rxz;->a:B

    iput-object p1, p0, La/rxz;->b:La/sxz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/rxz;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/rxz;->b:La/sxz;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/sxz;->o2:La/xuz;

    .line 9
    .line 10
    iget-object p0, p0, La/sxz;->l2:La/a8z;

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
    sget-object v0, La/pxz;->a:La/pxz;

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
    sget-object v0, La/sxz;->o2:La/xuz;

    .line 27
    .line 28
    new-instance v0, La/q0h0;

    .line 29
    .line 30
    iget-object p0, p0, La/sxz;->k2:La/a8z;

    .line 31
    .line 32
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, La/rji;

    .line 37
    .line 38
    iget-object p0, p0, La/rji;->d:La/n5d0;

    .line 39
    .line 40
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, La/qji;

    .line 45
    .line 46
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_1
    sget-object v0, La/sxz;->o2:La/xuz;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    instance-of v1, v0, La/af3;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    check-cast v0, La/af3;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    move-object v0, v2

    .line 72
    :goto_0
    const-class v1, La/txz;

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, La/o5d0;

    .line 85
    .line 86
    if-eqz v0, :cond_1

    .line 87
    .line 88
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, La/ze3;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    move-object v0, v2

    .line 96
    :goto_1
    instance-of v3, v0, La/txz;

    .line 97
    .line 98
    if-nez v3, :cond_2

    .line 99
    .line 100
    move-object v0, v2

    .line 101
    :cond_2
    check-cast v0, La/txz;

    .line 102
    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    iget-object v1, p0, La/sxz;->m2:La/yzn0;

    .line 106
    .line 107
    sget-object v2, La/sxz;->p2:[La/iiy;

    .line 108
    .line 109
    const/4 v3, 0x0

    .line 110
    aget-object v2, v2, v3

    .line 111
    .line 112
    invoke-virtual {v1, p0, v2}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/uxz;

    .line 117
    .line 118
    iget-object v1, v0, La/txz;->a:La/wdk0;

    .line 119
    .line 120
    iget-object v2, v0, La/txz;->b:La/knf0;

    .line 121
    .line 122
    iget-object v3, v0, La/txz;->c:La/cad;

    .line 123
    .line 124
    iget-object v4, v0, La/txz;->d:La/gii0;

    .line 125
    .line 126
    iget-object v0, v0, La/txz;->e:La/ctf0;

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    new-instance v2, La/rji;

    .line 141
    .line 142
    invoke-direct {v2, v3, v0, p0}, La/rji;-><init>(La/cad;La/ctf0;La/uxz;)V

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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
